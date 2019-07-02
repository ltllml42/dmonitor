!function(C){if(typeof ko!=="undefined"&&ko.bindingHandlers&&!ko.bindingHandlers.multiselect){ko.bindingHandlers.multiselect={init:function(I,J,E,F,K){var G=E().selectedOptions;var H=ko.utils.unwrapObservable(J());C(I).multiselect(H);if(B(G)){C(I).multiselect("select",ko.utils.unwrapObservable(G));G.subscribe(function(L){var M=[],N=[];A(L,function(O){switch(O.status){case"added":M.push(O.value);break;case"deleted":N.push(O.value);break}});if(M.length>0){C(I).multiselect("select",M)}if(N.length>0){C(I).multiselect("deselect",N)}},null,"arrayChange")}},update:function(F,J,H,I,E){var K=H().options,G=C(F).data("multiselect"),L=ko.utils.unwrapObservable(J());if(B(K)){K.subscribe(function(M){C(F).multiselect("rebuild")})}if(!G){C(F).multiselect(L)}else{G.updateOriginalOptions()}}}}function B(E){return ko.isObservable(E)&&!(E.destroyAll===undefined)}function A(F,G){for(var E=0;E<F.length;++E){G(F[E])}}function D(E,F){this.$select=C(E);this.options=this.mergeOptions(C.extend({},F,this.$select.data()));this.originalOptions=this.$select.clone()[0].options;this.query="";this.searchTimeout=null;this.options.multiple=this.$select.attr("multiple")==="multiple";this.options.onChange=C.proxy(this.options.onChange,this);this.options.onDropdownShow=C.proxy(this.options.onDropdownShow,this);this.options.onDropdownHide=C.proxy(this.options.onDropdownHide,this);this.options.onDropdownShown=C.proxy(this.options.onDropdownShown,this);this.options.onDropdownHidden=C.proxy(this.options.onDropdownHidden,this);this.buildContainer();this.buildButton();this.buildDropdown();this.buildSelectAll();this.buildDropdownOptions();this.buildFilter();this.updateButtonText();this.updateSelectAll();if(this.options.disableIfEmpty&&C("option",this.$select).length<=0){this.disable()}this.$select.hide().after(this.$container)}D.prototype={defaults:{buttonText:function(F,E){if(F.length===0){return this.nonSelectedText+' <b class="fa fa-caret-down"></b>'}else{if(F.length==C("option",C(E)).length){return this.allSelectedText+' <b class="fa fa-caret-down"></b>'}else{if(F.length>this.numberDisplayed){return F.length+" "+this.nSelectedText+' <b class="fa fa-caret-down"></b>'}else{var G="";F.each(function(){var H=(C(this).attr("label")!==undefined)?C(this).attr("label"):C(this).html();G+=H+", "});return G.substr(0,G.length-2)+' <b class="fa fa-caret-down"></b>'}}}},buttonTitle:function(F,E){if(F.length===0){return this.nonSelectedText}else{var G="";F.each(function(){G+=C(this).text()+", "});return G.substr(0,G.length-2)}},label:function(E){return C(E).attr("label")||C(E).html()},onChange:function(F,E){},onDropdownShow:function(E){},onDropdownHide:function(E){},onDropdownShown:function(E){},onDropdownHidden:function(E){},buttonClass:"btn btn-default",buttonWidth:"auto",buttonContainer:'<div class="btn-group" />',dropRight:false,selectedClass:"active",maxHeight:false,checkboxName:false,includeSelectAllOption:false,includeSelectAllIfMoreThan:0,selectAllText:" Select all",selectAllValue:"multiselect-all",selectAllName:false,enableFiltering:false,enableCaseInsensitiveFiltering:false,enableClickableOptGroups:false,filterPlaceholder:"Search",filterBehavior:"text",includeFilterClearBtn:true,preventInputChangeEvent:false,nonSelectedText:"None selected",nSelectedText:"selected",allSelectedText:"All selected",numberDisplayed:3,disableIfEmpty:false,templates:{button:'<button type="button" class="multiselect dropdown-toggle" data-toggle="dropdown"></button>',ul:'<ul class="multiselect-container dropdown-menu"></ul>',filter:'<li class="multiselect-item filter"><div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span><input class="form-control multiselect-search" type="text"></div></li>',filterClearBtn:'<span class="input-group-btn"><button class="btn btn-default multiselect-clear-filter" type="button"><i class="glyphicon glyphicon-remove-circle"></i></button></span>',li:'<li><a href="javascript:void(0);"><label></label></a></li>',divider:'<li class="multiselect-item divider"></li>',liGroup:'<li class="multiselect-item multiselect-group"><label></label></li>'}},constructor:D,buildContainer:function(){this.$container=C(this.options.buttonContainer);this.$container.on("show.bs.dropdown",this.options.onDropdownShow);this.$container.on("hide.bs.dropdown",this.options.onDropdownHide);this.$container.on("shown.bs.dropdown",this.options.onDropdownShown);this.$container.on("hidden.bs.dropdown",this.options.onDropdownHidden)},buildButton:function(){this.$button=C(this.options.templates.button).addClass(this.options.buttonClass);if(this.$select.prop("disabled")){this.disable()}else{this.enable()}if(this.options.buttonWidth&&this.options.buttonWidth!=="auto"){this.$button.css({"width":this.options.buttonWidth});this.$container.css({"width":this.options.buttonWidth})}var E=this.$select.attr("tabindex");if(E){this.$button.attr("tabindex",E)}this.$container.prepend(this.$button)},buildDropdown:function(){this.$ul=C(this.options.templates.ul);if(this.options.dropRight){this.$ul.addClass("pull-right")}if(this.options.maxHeight){this.$ul.css({"max-height":this.options.maxHeight+"px","overflow-y":"auto","overflow-x":"hidden"})}this.$container.append(this.$ul)},buildDropdownOptions:function(){this.$select.children().each(C.proxy(function(H,G){var F=C(G);var E=F.prop("tagName").toLowerCase();if(F.prop("value")===this.options.selectAllValue){return}if(E==="optgroup"){this.createOptgroup(G)}else{if(E==="option"){if(F.data("role")==="divider"){this.createDivider()}else{this.createOptionValue(G)}}}},this));C("li input",this.$ul).on("change",C.proxy(function(H){var K=C(H.target);var F=K.prop("checked")||false;var L=K.val()===this.options.selectAllValue;if(this.options.selectedClass){if(F){K.closest("li").addClass(this.options.selectedClass)}else{K.closest("li").removeClass(this.options.selectedClass)}}var G=K.val();var E=this.getOptionByValue(G);var I=C("option",this.$select).not(E);var J=C("input",this.$container).not(K);if(L){if(F){this.selectAll()}else{this.deselectAll()}}if(!L){if(F){E.prop("selected",true);if(this.options.multiple){E.prop("selected",true)}else{if(this.options.selectedClass){C(J).closest("li").removeClass(this.options.selectedClass)}C(J).prop("checked",false);I.prop("selected",false);this.$button.click()}if(this.options.selectedClass==="active"){I.closest("a").css("outline","")}}else{E.prop("selected",false)}}this.$select.change();this.updateButtonText();this.updateSelectAll();this.options.onChange(E,F);if(this.options.preventInputChangeEvent){return false}},this));C("li a",this.$ul).on("touchstart click",function(H){H.stopPropagation();var K=C(H.target);try{if(document.getSelection().type==="Range"){var E=C(this).find("input:first");E.prop("checked",!E.prop("checked")).trigger("change")}}catch(J){}if(H.shiftKey){var I=K.prop("checked")||false;if(I){var G=K.closest("li").siblings('li[class="active"]:first');var L=K.closest("li").index();var F=G.index();if(L>F){K.closest("li").prevUntil(G).each(function(){C(this).find("input:first").prop("checked",true).trigger("change")})}else{K.closest("li").nextUntil(G).each(function(){C(this).find("input:first").prop("checked",true).trigger("change")})}}}K.blur()});this.$container.off("keydown.multiselect").on("keydown.multiselect",C.proxy(function(G){if(C('input[type="text"]',this.$container).is(":focus")){return}if(G.keyCode===9&&this.$container.hasClass("open")){this.$button.click()}else{var F=C(this.$container).find("li:not(.divider):not(.disabled) a").filter(":visible");if(!F.length){return}var I=F.index(F.filter(":focus"));if(G.keyCode===38&&I>0){I--}else{if(G.keyCode===40&&I<F.length-1){I++}else{if(!~I){I=0}}}var H=F.eq(I);H.focus();if(G.keyCode===32||G.keyCode===13){var E=H.find("input");E.prop("checked",!E.prop("checked"));E.change()}G.stopPropagation();G.preventDefault()}},this));if(this.options.enableClickableOptGroups&&this.options.multiple){C("li.multiselect-group",this.$ul).on("click",C.proxy(function(F){F.stopPropagation();var E=C(F.target).parent();var H=E.nextUntil("li.multiselect-group");var G=true;var I=H.find("input");I.each(function(){G=G&&C(this).prop("checked")});I.prop("checked",!G).trigger("change")},this))}},createOptionValue:function(F){var J=C(F);if(J.is(":selected")){J.prop("selected",true)}var K=this.options.label(F);var H=J.val();var E=this.options.multiple?"checkbox":"radio";var L=C(this.options.templates.li);var I=C("label",L);I.addClass(E);var G=C("<input/>").attr("type",E).addClass("ace");if(this.options.checkboxName){G.attr("name",this.options.checkboxName)}I.append(G);G.after('<span class="lbl" />');var M=J.prop("selected")||false;G.val(H);if(H===this.options.selectAllValue){L.addClass("multiselect-item multiselect-all");G.parent().parent().addClass("multiselect-all")}I.append(" "+K);I.attr("title",J.attr("title"));this.$ul.append(L);if(J.is(":disabled")){G.attr("disabled","disabled").prop("disabled",true).closest("a").attr("tabindex","-1").closest("li").addClass("disabled")}G.prop("checked",M);if(M&&this.options.selectedClass){G.closest("li").addClass(this.options.selectedClass)}},createDivider:function(E){var F=C(this.options.templates.divider);this.$ul.append(F)},createOptgroup:function(F){var G=C(F).prop("label");var E=C(this.options.templates.liGroup);C("label",E).text(G);if(this.options.enableClickableOptGroups){E.addClass("multiselect-group-clickable")}this.$ul.append(E);if(C(F).is(":disabled")){E.addClass("disabled")}C("option",F).each(C.proxy(function(I,H){this.createOptionValue(H)},this))},buildSelectAll:function(){if(typeof this.options.selectAllValue==="number"){this.options.selectAllValue=this.options.selectAllValue.toString()}var G=this.hasSelectAll();if(!G&&this.options.includeSelectAllOption&&this.options.multiple&&C("option",this.$select).length>this.options.includeSelectAllIfMoreThan){if(this.options.includeSelectAllDivider){this.$ul.prepend(C(this.options.templates.divider))}var E=C(this.options.templates.li);C("label",E).addClass("checkbox");if(this.options.selectAllName){C("label",E).append('<input type="checkbox" name="'+this.options.selectAllName+'" />')}else{C("label",E).append('<input type="checkbox" />')}var F=C("input",E);F.val(this.options.selectAllValue);E.addClass("multiselect-item multiselect-all");F.parent().parent().addClass("multiselect-all");C("label",E).append(" "+this.options.selectAllText);this.$ul.prepend(E);F.prop("checked",false)}},buildFilter:function(){if(this.options.enableFiltering||this.options.enableCaseInsensitiveFiltering){var F=Math.max(this.options.enableFiltering,this.options.enableCaseInsensitiveFiltering);if(this.$select.find("option").length>=F){this.$filter=C(this.options.templates.filter);C("input",this.$filter).attr("placeholder",this.options.filterPlaceholder);if(this.options.includeFilterClearBtn){var E=C(this.options.templates.filterClearBtn);E.on("click",C.proxy(function(G){clearTimeout(this.searchTimeout);this.$filter.find(".multiselect-search").val("");C("li",this.$ul).show().removeClass("filter-hidden");this.updateSelectAll()},this));this.$filter.find(".input-group").append(E)}this.$ul.prepend(this.$filter);this.$filter.val(this.query).on("click",function(G){G.stopPropagation()}).on("input keydown",C.proxy(function(G){if(G.which===13){G.preventDefault()}clearTimeout(this.searchTimeout);this.searchTimeout=this.asyncFunction(C.proxy(function(){if(this.query!==G.target.value){this.query=G.target.value;var H,I;C.each(C("li",this.$ul),C.proxy(function(N,M){var K=C("input",M).val();var O=C("label",M).text();var J="";if((this.options.filterBehavior==="text")){J=O}else{if((this.options.filterBehavior==="value")){J=K}else{if(this.options.filterBehavior==="both"){J=O+"\n"+K}}}if(K!==this.options.selectAllValue&&O){var L=false;if(this.options.enableCaseInsensitiveFiltering&&J.toLowerCase().indexOf(this.query.toLowerCase())>-1){L=true}else{if(J.indexOf(this.query)>-1){L=true}}C(M).toggle(L).toggleClass("filter-hidden",!L);if(C(M).hasClass("multiselect-group")){H=M;I=L}else{if(L){C(H).show().removeClass("filter-hidden")}if(!L&&I){C(M).show().removeClass("filter-hidden")}}}},this))}this.updateSelectAll()},this),300,this)},this))}}},destroy:function(){this.$container.remove();this.$select.show();this.$select.data("multiselect",null)},refresh:function(){C("option",this.$select).each(C.proxy(function(G,F){var E=C("li input",this.$ul).filter(function(){return C(this).val()===C(F).val()});if(C(F).is(":selected")){E.prop("checked",true);if(this.options.selectedClass){E.closest("li").addClass(this.options.selectedClass)}}else{E.prop("checked",false);if(this.options.selectedClass){E.closest("li").removeClass(this.options.selectedClass)}}if(C(F).is(":disabled")){E.attr("disabled","disabled").prop("disabled",true).closest("li").addClass("disabled")}else{E.prop("disabled",false).closest("li").removeClass("disabled")}},this));this.updateButtonText();this.updateSelectAll()},select:function(J,H){if(!C.isArray(J)){J=[J]}for(var I=0;I<J.length;I++){var E=J[I];if(E===null||E===undefined){continue}var G=this.getOptionByValue(E);var F=this.getInputByValue(E);if(G===undefined||F===undefined){continue}if(!this.options.multiple){this.deselectAll(false)}if(this.options.selectedClass){F.closest("li").addClass(this.options.selectedClass)}F.prop("checked",true);G.prop("selected",true)}this.updateButtonText();this.updateSelectAll();if(H&&J.length===1){this.options.onChange(G,true)}},clearSelection:function(){this.deselectAll(false);this.updateButtonText();this.updateSelectAll()},deselect:function(J,H){if(!C.isArray(J)){J=[J]}for(var I=0;I<J.length;I++){var E=J[I];if(E===null||E===undefined){continue}var G=this.getOptionByValue(E);var F=this.getInputByValue(E);if(G===undefined||F===undefined){continue}if(this.options.selectedClass){F.closest("li").removeClass(this.options.selectedClass)}F.prop("checked",false);G.prop("selected",false)}this.updateButtonText();this.updateSelectAll();if(H&&J.length===1){this.options.onChange(G,false)}},selectAll:function(F){var F=typeof F==="undefined"?true:F;var E=C("li input[type='checkbox']:enabled",this.$ul);var H=E.filter(":visible");var G=E.length;var I=H.length;if(F){H.prop("checked",true);C("li:not(.divider):not(.disabled)",this.$ul).filter(":visible").addClass(this.options.selectedClass)}else{E.prop("checked",true);C("li:not(.divider):not(.disabled)",this.$ul).addClass(this.options.selectedClass)}if(G===I||F===false){C("option:enabled",this.$select).prop("selected",true)}else{var J=H.map(function(){return C(this).val()}).get();C("option:enabled",this.$select).filter(function(K){return C.inArray(C(this).val(),J)!==-1}).prop("selected",true)}},deselectAll:function(E){var E=typeof E==="undefined"?true:E;if(E){var F=C("li input[type='checkbox']:enabled",this.$ul).filter(":visible");F.prop("checked",false);var G=F.map(function(){return C(this).val()}).get();C("option:enabled",this.$select).filter(function(H){return C.inArray(C(this).val(),G)!==-1}).prop("selected",false);if(this.options.selectedClass){C("li:not(.divider):not(.disabled)",this.$ul).filter(":visible").removeClass(this.options.selectedClass)}}else{C("li input[type='checkbox']:enabled",this.$ul).prop("checked",false);C("option:enabled",this.$select).prop("selected",false);if(this.options.selectedClass){C("li:not(.divider):not(.disabled)",this.$ul).removeClass(this.options.selectedClass)}}},rebuild:function(){this.$ul.html("");this.options.multiple=this.$select.attr("multiple")==="multiple";this.buildSelectAll();this.buildDropdownOptions();this.buildFilter();this.updateButtonText();this.updateSelectAll();if(this.options.disableIfEmpty&&C("option",this.$select).length<=0){this.disable()}if(this.options.dropRight){this.$ul.addClass("pull-right")}},dataprovider:function(H){var E="";var G=0;var F=C("");C.each(H,function(K,J){var I;if(C.isArray(J.children)){G++;I=C("<optgroup/>").attr({label:J.label||"Group "+G});A(J.children,function(L){I.append(C("<option/>").attr({value:L.value,label:L.label||L.value,title:L.title,selected:!!L.selected}))});E+="</optgroup>"}else{I=C("<option/>").attr({value:J.value,label:J.label||J.value,title:J.title,selected:!!J.selected})}F=F.add(I)});this.$select.empty().append(F);this.rebuild()},enable:function(){this.$select.prop("disabled",false);this.$button.prop("disabled",false).removeClass("disabled")},disable:function(){this.$select.prop("disabled",true);this.$button.prop("disabled",true).addClass("disabled")},setOptions:function(E){this.options=this.mergeOptions(E)},mergeOptions:function(E){return C.extend(true,{},this.defaults,E)},hasSelectAll:function(){return C("li."+this.options.selectAllValue,this.$ul).length>0},updateSelectAll:function(){if(this.hasSelectAll()){var I=C("li:not(.multiselect-item):not(.filter-hidden) input:enabled",this.$ul);var E=I.length;var G=I.filter(":checked").length;var H=C("li."+this.options.selectAllValue,this.$ul);var F=H.find("input");if(G>0&&G===E){F.prop("checked",true);H.addClass(this.options.selectedClass)}else{F.prop("checked",false);H.removeClass(this.options.selectedClass)}}},updateButtonText:function(){var E=this.getSelected();C(".multiselect",this.$container).html(this.options.buttonText(E,this.$select));C(".multiselect",this.$container).attr("title",this.options.buttonTitle(E,this.$select))},getSelected:function(){return C("option",this.$select).filter(":selected")},getOptionByValue:function(E){var I=C("option",this.$select);var H=E.toString();for(var G=0;G<I.length;G=G+1){var F=I[G];if(F.value===H){return C(F)}}},getInputByValue:function(E){var I=C("li input",this.$ul);var G=E.toString();for(var H=0;H<I.length;H=H+1){var F=I[H];if(F.value===G){return C(F)}}},updateOriginalOptions:function(){this.originalOptions=this.$select.clone()[0].options},asyncFunction:function(H,G,F){var E=Array.prototype.slice.call(arguments,3);return setTimeout(function(){H.apply(F||window,E)},G)}};C.fn.multiselect=function(F,E,G){return this.each(function(){var I=C(this).data("multiselect");var H=typeof F==="object"&&F;if(!I){I=new D(this,H);C(this).data("multiselect",I)}if(typeof F==="string"){I[F](E,G);if(F==="destroy"){C(this).data("multiselect",false)}}})};C.fn.multiselect.Constructor=D;C(function(){C("select[data-role=multiselect]").multiselect()})}(window.jQuery);