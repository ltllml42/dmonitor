(function(C,D){var A={};function B(I,L){var F=C(I);var T=this;var K=L.content_url||false;var V=L.default_url||false;var U=L.loading_icon||"fa-spinner fa-2x orange";var O=L.loading_text||"";var H=L.update_breadcrumbs||L.update_breadcrumbs===D;var M=L.update_title||L.update_breadcrumbs===D;var R=L.update_active||L.update_breadcrumbs===D;var E=L.close_active||false;var P=L.max_load_wait||false;var J=false;this.loadUrl=function(W){var X=false;W=W.replace(/^(\#\!)?\#/,"");if(typeof K==="function"){X=K(W)}if(typeof X==="string"){this.getUrl(X,W,false)}};this.getUrl=function(Y,X,W){if(J){return}var Z;F.trigger(Z=C.Event("ajaxloadstart"),{url:Y,hash:X});if(Z.isDefaultPrevented()){return}T.startLoading();C.ajax({"url":Y}).error(function(){F.trigger("ajaxloaderror",{url:Y,hash:X});T.stopLoading(true)}).done(function(b){F.trigger("ajaxloaddone",{url:Y,hash:X});var a=null,e="";if(typeof R==="function"){a=R.call(null,X,Y)}else{if(R===true){a=C('a[data-url="'+X+'"]');if(a.length>0){var c=a.closest(".nav");if(c.length>0){c.find(".active").each(function(){var f="active";if(C(this).hasClass("hover")||E){f+=" open"}C(this).removeClass(f);if(E){C(this).find(" > .submenu").css("display","")}});var d=a.closest("li").addClass("active").parents(".nav li").addClass("active open");c.closest(".sidebar[data-sidebar-scroll=true]").each(function(){var f=C(this);f.ace_sidebar_scroll("reset");if(W){f.ace_sidebar_scroll("scroll_to_active")}})}}}}if(typeof H==="function"){e=H.call(null,X,Y,a)}else{if(H===true&&a!=null&&a.length>0){e=G(a)}}b=String(b).replace(/<(title|link)([\s\>])/gi,'<div class="hidden ajax-append-$1"$2').replace(/<\/(title|link)\>/gi,"</div>");F.empty().html(b);F.css("opacity",0.6);setTimeout(function(){C("head").find("link.ace-ajax-stylesheet").remove();var h=["link.ace-main-stylesheet","link#main-ace-style",'link[href*="/ace.min.css"]','link[href*="/ace.css"]'];var g=[];for(var f=0;f<h.length;f++){g=C("head").find(h[f]).first();if(g.length>0){break}}F.find(".ajax-append-link").each(function(k){var j=C(this);if(j.attr("href")){var i=jQuery("<link />",{type:"text/css",rel:"stylesheet","class":"ace-ajax-stylesheet"});if(g.length>0){i.insertBefore(g)}else{i.appendTo("head")}i.attr("href",j.attr("href"))}j.remove()})},10);if(typeof M==="function"){M.call(null,X,Y,e)}else{if(M===true){N(e)}}if(!W){C("html,body").animate({scrollTop:0},250)}F.trigger("ajaxloadcomplete",{url:Y,hash:X});T.stopLoading()})};var S=null;this.startLoading=function(){if(J){return}J=true;F.css("opacity",0.25).prevAll(".ajax-loading-overlay").remove();C('<div class="ajax-loading-overlay"><i class="ajax-loading-icon fa fa-spin '+U+'"></i> '+O+"</div>").insertBefore(I);if(P!==false){S=setTimeout(function(){S=null;if(!J){return}var W;F.trigger(W=C.Event("ajaxloadlong"));if(W.isDefaultPrevented()){return}T.stopLoading(true)},P*1000)}};this.stopLoading=function(W){if(W===true){J=false;F.css("opacity",1).prevAll(".ajax-loading-overlay").remove();if(S!=null){clearTimeout(S);S=null}}else{F.css("opacity",0.75);F.one("ajaxscriptsloaded",function(){T.stopLoading(true)})}};function G(W){var Z="";var X=C(".breadcrumb");if(X.length>0&&X.is(":visible")){X.find("> li:not(:first-child)").remove();var Y=0;W.parents(".nav li").each(function(){var b=C(this).find("> a");var a=b.clone();a.find("i,.fa,.glyphicon,.ace-icon,.menu-icon,.badge,.label").remove();var e=a.text();a.remove();var d=b.attr("href");if(Y==0){var c=C('<li class="active"></li>').appendTo(X);c.text(e);Z=e}else{var c=C("<li><a /></li>").insertAfter(X.find("> li:first-child"));c.find("a").attr("href",d).text(e)}Y++})}return Z}function N(W){var Y=F.find(".ajax-append-title");if(Y.length>0){document.title=Y.text();Y.remove()}else{if(W.length>0){var X=C.trim(String(document.title).replace(/^(.*)[\-]/,""));if(X){X=" - "+X}W=C.trim(W)+X}}}this.loadScripts=function(W,X){C.ajaxPrefilter("script",function(Y){Y.cache=true});setTimeout(function(){function Z(){if(typeof X==="function"){X()}C('.btn-group[data-toggle="buttons"] > .btn').button();F.trigger("ajaxscriptsloaded")}var d=0;var b=0;for(var c=0;c<W.length;c++){if(W[c]){(function(){var e="js-"+W[c].replace(/[^\w\d\-]/g,"-").replace(/\-\-/g,"-");if(A[e]!==true){d++}})()}}function a(e){e+=1;if(e<W.length){Y(e)}else{Z()}}function Y(f){f=f||0;if(!W[f]){return a(f)}var e="js-"+W[f].replace(/[^\w\d\-]/g,"-").replace(/\-\-/g,"-");if(A[e]!==true){C.getScript(W[f]).done(function(){A[e]=true}).complete(function(){b++;if(b>=d&&J){Z()}else{a(f)}})}else{a(f)}}if(d>0){Y()}else{Z()}},10)};C(window).off("hashchange.ace_ajax").on("hashchange.ace_ajax",function(Y,W){var X=C.trim(window.location.hash);if(!X||X.length==0){return}T.loadUrl(X)}).trigger("hashchange.ace_ajax",[true]);var Q=C.trim(window.location.hash);if(!Q&&V){window.location.hash=V}}C.fn.aceAjax=C.fn.ace_ajax=function(H,E,G){var I;var F=this.each(function(){var K=C(this);var L=K.data("ace_ajax");var J=typeof H==="object"&&H;if(!L){K.data("ace_ajax",(L=new B(this,J)))}if(typeof H==="string"&&typeof L[H]==="function"){if(G!=D){I=L[H](E,G)}else{I=L[H](E)}}});return(I===D)?F:I}})(window.jQuery);