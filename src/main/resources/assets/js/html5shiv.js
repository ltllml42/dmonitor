(function(L,C){var O="3.7.2";var F=L.html5||{};var K=/^<|^(?:button|map|select|textarea|object|iframe|option|optgroup)$/i;var E=/^(?:a|b|code|div|fieldset|h1|h2|h3|h4|h5|h6|i|label|li|ol|p|q|span|strong|style|table|tbody|td|th|tr|ul)$/i;var N;var Q="_html5shiv";var B=0;var P={};var A;(function(){try{var U=C.createElement("a");U.innerHTML="<xyz></xyz>";N=("hidden" in U);A=U.childNodes.length==1||(function(){(C.createElement)("a");var W=C.createDocumentFragment();return(typeof W.cloneNode=="undefined"||typeof W.createDocumentFragment=="undefined"||typeof W.createElement=="undefined")}())}catch(V){N=true;A=true}}());function G(U,W){var X=U.createElement("p"),V=U.getElementsByTagName("head")[0]||U.documentElement;X.innerHTML="x<style>"+W+"</style>";return V.insertBefore(X.lastChild,V.firstChild)}function D(){var U=T.elements;return typeof U=="string"?U.split(" "):U}function M(W,U){var V=T.elements;if(typeof V!="string"){V=V.join(" ")}if(typeof W!="string"){W=W.join(" ")}T.elements=V+" "+W;R(U)}function J(U){var V=P[U[Q]];if(!V){V={};B++;U[Q]=B;P[B]=V}return V}function S(V,U,X){if(!U){U=C}if(A){return U.createElement(V)}if(!X){X=J(U)}var W;if(X.cache[V]){W=X.cache[V].cloneNode()}else{if(E.test(V)){W=(X.cache[V]=X.createElem(V)).cloneNode()}else{W=X.createElem(V)}}return W.canHaveChildren&&!K.test(V)&&!W.tagUrn?X.frag.appendChild(W):W}function H(U,Z){if(!U){U=C}if(A){return U.createDocumentFragment()}Z=Z||J(U);var Y=Z.frag.cloneNode(),X=0,V=D(),W=V.length;for(;X<W;X++){Y.createElement(V[X])}return Y}function I(U,V){if(!V.cache){V.cache={};V.createElem=U.createElement;V.createFrag=U.createDocumentFragment;V.frag=V.createFrag()}U.createElement=function(W){if(!T.shivMethods){return V.createElem(W)}return S(W,U,V)};U.createDocumentFragment=Function("h,f","return function(){var n=f.cloneNode(),c=n.createElement;h.shivMethods&&("+D().join().replace(/[\w\-:]+/g,function(W){V.createElem(W);V.frag.createElement(W);return'c("'+W+'")'})+");return n}")(T,V.frag)}function R(U){if(!U){U=C}var V=J(U);if(T.shivCSS&&!N&&!V.hasCSS){V.hasCSS=!!G(U,"article,aside,dialog,figcaption,figure,footer,header,hgroup,main,nav,section{display:block}mark{background:#FF0;color:#000}template{display:none}")}if(!A){I(U,V)}return U}var T={"elements":F.elements||"abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template time video","version":O,"shivCSS":(F.shivCSS!==false),"supportsUnknownElements":A,"shivMethods":(F.shivMethods!==false),"type":"default","shivDocument":R,createElement:S,createDocumentFragment:H,addElements:M};L.html5=T;R(C)}(this,document));if(!Function.prototype.bind){Function.prototype.bind=function(B){if(typeof this!=="function"){throw new TypeError("Function.prototype.bind - what is trying to be bound is not callable")}var E=Array.prototype.slice.call(arguments,1),D=this,C=function(){},A=function(){return D.apply(this instanceof C&&B?this:B,E.concat(Array.prototype.slice.call(arguments)))};C.prototype=this.prototype;A.prototype=new C();return A}};