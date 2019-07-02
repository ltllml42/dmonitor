(function(C,E){var D=ace.vars["safari"]&&navigator.userAgent.match(/version\/[1-5]/i);var A="getComputedStyle" in window?function(F,G){F.offsetHeight;return window.getComputedStyle(F).position==G}:function(F,G){F.offsetHeight;return C(F).css("position")==G};function B(L,Y){var e=this;var W=C(window);var R=C(L),K=R.find(".nav-list"),N=R.find(".sidebar-toggle").eq(0),a=R.find(".sidebar-shortcuts").eq(0),d=K.get(0);if(!d){return}var b=R.ace_sidebar("ref");R.attr("data-sidebar-scroll","true");var J=function(){return R.first("li.hover > .submenu").css("position")=="absolute"};var U=null,c=null,T=null,V=null,O=null;this.is_scrolling=false;var F=false;this.sidebar_fixed=A(L,"fixed");var S,P;var H=Y.scroll_to_active||ace.helper.boolAttr(L,"data-scroll-to-active")||false,M=Y.include_shortcuts||ace.helper.boolAttr(L,"data-scroll-include-shortcuts")||false,Q=Y.include_toggle||ace.helper.boolAttr(L,"data-scroll-include-toggle")||false,G=Y.scroll_style||R.attr("data-scroll-style")||"";this.only_if_fixed=(Y.only_if_fixed||ace.helper.boolAttr(L,"data-scroll-only-fixed"))&&true;var I=Y.mousewheel_lock||ace.helper.boolAttr(L,"data-mousewheel-lock")||false;var X=function(){var g=K.parent().offset();if(e.sidebar_fixed){g.top-=ace.helper.scrollTop()}return W.innerHeight()-g.top-(Q?0:N.outerHeight())};var f=function(){return d.scrollHeight};var Z=function(h){if(F){return}if((e.only_if_fixed&&!e.sidebar_fixed)||J()){return}K.wrap('<div class="nav-wrap-up" />');if(M&&a.length!=0){K.parent().prepend(a)}if(Q&&N.length!=0){K.parent().append(N)}U=K.parent().ace_scroll({size:X(),reset:true,mouseWheelLock:true,lockAnyway:I,styleClass:G,hoverReset:false}).closest(".ace-scroll").addClass("nav-scroll");O=U.data("ace_scroll");c=U.find(".scroll-content").eq(0);if(D&&!Q){var g=N.get(0);if(g){c.on("scroll.safari",function(){ace.helper.redraw(g)})}}F=true;if(h==true){e.reset();if(H){e.scroll_to_active()}H=false}};this.scroll_to_active=function(){if(!O||!O.is_active()){return}try{var j;var k=b["vars"]();var l=R.find(".nav-list");if(k["minimized"]&&!k["collapsible"]){j=l.find("> .active")}else{j=K.find("> .active.hover");if(j.length==0){j=K.find(".active:not(.open)")}}var i=j.outerHeight();l=l.get(0);var m=j.get(0);while(m!=l){i+=m.offsetTop;m=m.parentNode}var g=i-U.height();if(g>0){c.scrollTop(g)}}catch(h){}};this.reset=function(i){if(i===true){this.sidebar_fixed=A(L,"fixed")}if((this.only_if_fixed&&!this.sidebar_fixed)||J()){this.disable();return}if(!F){Z()}R.addClass("sidebar-scroll");var h=b["vars"]();var g=!h["minimized"]&&!h["collapsible"]&&!h["horizontal"]&&(S=X())<(P=d.parentNode.scrollHeight);this.is_scrolling=true;if(g&&O){O.update({size:S});O.enable();O.reset()}if(!g||!O.is_active()){if(this.is_scrolling){this.disable()}}};this.disable=function(){this.is_scrolling=false;if(O){O.disable()}R.removeClass("sidebar-scroll")};this.prehide=function(h){if(!this.is_scrolling||b.get("minimized")){return}if(f()+h<X()){this.disable()}else{if(h<0){var g=c.scrollTop()+h;if(g<0){return}c.scrollTop(g)}}};this._reset=function(g){if(g===true){this.sidebar_fixed=A(L,"fixed")}if(ace.vars["webkit"]){setTimeout(function(){e.reset()},0)}else{this.reset()}};this.get=function(g){if(this.hasOwnProperty(g)){return this[g]}};this.set=function(g,h){if(this.hasOwnProperty(g)){this[g]=h}};this.ref=function(){return this};this.updateStyle=function(g){if(O==null){return}O.update({styleClass:g})};R.on("hidden.ace.submenu.sidebar_scroll shown.ace.submenu.sidebar_scroll",".submenu",function(g){g.stopPropagation();if(!b.get("minimized")){e._reset()}});Z(true)}C(document).on("settings.ace.sidebar_scroll",function(F,H,G){C(".sidebar[data-sidebar-scroll=true]").each(function(){var K=C(this);var I=K.ace_sidebar_scroll("ref");if(H=="sidebar_collapsed"){if(K.attr("data-sidebar-hover")=="true"){K.ace_sidebar_hover("reset")}if(G==true){I.disable()}else{I.reset()}}else{if(H==="sidebar_fixed"||H==="navbar_fixed"){var L=I.get("is_scrolling");var J=A(this,"fixed");I.set("sidebar_fixed",J);if(J&&!L){I.reset()}else{if(!J&&I.get("only_if_fixed")){I.disable()}}}}})});C(window).on("resize.ace.sidebar_scroll",function(){C(".sidebar[data-sidebar-scroll=true]").each(function(){var F=C(this).ace_sidebar_scroll("ref");var G=A(this,"fixed");F.set("sidebar_fixed",G);F.reset()})});if(!C.fn.ace_sidebar_scroll){C.fn.ace_sidebar_scroll=function(H,F){var I;var G=this.each(function(){var K=C(this);var L=K.data("ace_sidebar_scroll");var J=typeof H==="object"&&H;if(!L){K.data("ace_sidebar_scroll",(L=new B(this,J)))}if(typeof H==="string"&&typeof L[H]==="function"){I=L[H](F)}});return(I===E)?G:I}}})(window.jQuery);