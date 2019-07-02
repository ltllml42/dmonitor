/*
 * jQuery UI Touch Punch 0.2.3
 *
 * Copyright 2011–2014, Dave Furfero
 * Dual licensed under the MIT or GPL Version 2 licenses.
 *
 * Depends:
 *  jquery.ui.widget.js
 *  jquery.ui.mouse.js
 */
(function(C){C.support.touch="ontouchend" in document;if(!C.support.touch){return}var E=C.ui.mouse.prototype,B=E._mouseInit,F=E._mouseDestroy,A;function D(J,K,I){if(J.originalEvent.touches.length>1){return}if(I!==false){J.preventDefault()}var H=J.originalEvent.changedTouches[0],G=document.createEvent("MouseEvents");G.initMouseEvent(K,true,true,window,1,H.screenX,H.screenY,H.clientX,H.clientY,false,false,false,false,0,null);J.target.dispatchEvent(G)}E._touchStart=function(G){var H=this;if(A||!H._mouseCapture(G.originalEvent.changedTouches[0])){return}A=true;H._touchMoved=false;D(G,"mouseover",false);D(G,"mousemove",false);D(G,"mousedown",false)};E._touchMove=function(G){if(!A){return}this._touchMoved=true;D(G,"mousemove")};E._touchEnd=function(G){if(!A){return}D(G,"mouseup");D(G,"mouseout");if(!this._touchMoved){D(G,"click")}A=false};E._mouseInit=function(){var G=this;G.element.bind({touchstart:C.proxy(G,"_touchStart"),touchmove:C.proxy(G,"_touchMove"),touchend:C.proxy(G,"_touchEnd")});B.call(G)};E._mouseDestroy=function(){var G=this;G.element.unbind({touchstart:C.proxy(G,"_touchStart"),touchmove:C.proxy(G,"_touchMove"),touchend:C.proxy(G,"_touchEnd")});F.call(G)}})(jQuery);