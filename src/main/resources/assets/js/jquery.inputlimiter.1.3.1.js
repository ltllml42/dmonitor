(function(A){A.fn.inputlimiter=function(B){var I=A.extend({},A.fn.inputlimiter.defaults,B),G=A(this);if(I.boxAttach&&!A("#"+I.boxId).length){A("<div/>").appendTo("body").attr({id:I.boxId,"class":I.boxClass}).css({"position":"absolute"}).hide();if(A.fn.bgiframe){A("#"+I.boxId).bgiframe()}}var C=function(N){var O=A(this),J=E(O.val());if(!I.allowExceed&&J>I.limit){O.val(F(O.val()))}if(I.boxAttach){A("#"+I.boxId).css({"width":O.outerWidth()-(A("#"+I.boxId).outerWidth()-A("#"+I.boxId).width())+"px","left":O.offset().left+"px","top":(O.offset().top+O.outerHeight())-1+"px","z-index":2000})}var K=(I.limit-J>0?I.limit-J:0),M=I.remTextFilter(I,K),P=I.limitTextFilter(I);if(I.limitTextShow){A("#"+I.boxId).html(M+" "+P);var L=A("<span/>").appendTo("body").attr({id:"19cc9195583bfae1fad88e19d443be7a","class":I.boxClass}).html(M+" "+P).innerWidth();A("#19cc9195583bfae1fad88e19d443be7a").remove();if(L>A("#"+I.boxId).innerWidth()){A("#"+I.boxId).html(M+"<br />"+P)}A("#"+I.boxId).show()}else{A("#"+I.boxId).html(M).show()}},D=function(L){var J=E(A(this).val());if(!I.allowExceed&&J>I.limit){var K=L.ctrlKey||L.altKey||L.metaKey;if(!K&&(L.which>=32&&L.which<=122)&&this.selectionStart===this.selectionEnd){return false}}},H=function(){var K=A(this);count=E(K.val());if(!I.allowExceed&&count>I.limit){K.val(F(K.val()))}if(I.boxAttach){A("#"+I.boxId).fadeOut("fast")}else{if(I.remTextHideOnBlur){var J=I.limitText;J=J.replace(/\%n/g,I.limit);J=J.replace(/\%s/g,(I.limit===1?"":"s"));A("#"+I.boxId).html(J)}}},E=function(K){if(I.limitBy.toLowerCase()==="words"){return(K.length>0?A.trim(K).replace(/\ +(?= )/g,"").split(" ").length:0)}var J=K.length,L=K.match(/\n/g);if(L&&I.lineReturnCount>1){J+=L.length*(I.lineReturnCount-1)}return J},F=function(J){if(I.limitBy.toLowerCase()==="words"){return A.trim(J).replace(/\ +(?= )/g,"").split(" ").splice(0,I.limit).join(" ")+" "}return J.substring(0,I.limit)};A(this).each(function(J){var K=A(this);if((!B||!B.limit)&&I.useMaxlength&&parseInt(K.attr("maxlength"))>0&&parseInt(K.attr("maxlength"))!=I.limit){K.inputlimiter(A.extend({},I,{limit:parseInt(K.attr("maxlength"))}))}else{if(!I.allowExceed&&I.useMaxlength&&I.limitBy.toLowerCase()==="characters"){K.attr("maxlength",I.limit)}K.unbind(".inputlimiter");K.bind("keyup.inputlimiter",C);K.bind("keypress.inputlimiter",D);K.bind("blur.inputlimiter",H)}})};A.fn.inputlimiter.remtextfilter=function(B,C){var D=B.remText;if(C===0&&B.remFullText!==null){D=B.remFullText}D=D.replace(/\%n/g,C);D=D.replace(/\%s/g,(B.zeroPlural?(C===1?"":"s"):(C<=1?"":"s")));return D};A.fn.inputlimiter.limittextfilter=function(B){var C=B.limitText;C=C.replace(/\%n/g,B.limit);C=C.replace(/\%s/g,(B.limit<=1?"":"s"));return C};A.fn.inputlimiter.defaults={limit:255,boxAttach:true,boxId:"limiterBox",boxClass:"limiterBox",remText:"%n character%s remaining.",remTextFilter:A.fn.inputlimiter.remtextfilter,remTextHideOnBlur:true,remFullText:null,limitTextShow:true,limitText:"Field limited to %n character%s.",limitTextFilter:A.fn.inputlimiter.limittextfilter,zeroPlural:true,allowExceed:false,useMaxlength:true,limitBy:"characters",lineReturnCount:1}})(jQuery);