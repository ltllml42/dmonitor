(function(){function A(B){var C=A.modules[B];if(!C){throw new Error('failed to require "'+B+'"')}if(!("exports" in C)&&typeof C.definition==="function"){C.client=C.component=true;C.definition.call(this,C.exports={},C);delete C.definition}return C.exports}A.modules={};A.register=function(B,C){A.modules[B]={definition:C}};A.define=function(B,C){A.modules[B]={exports:C}};A.register("component~emitter@1.1.2",function(D,B){B.exports=C;function C(F){if(F){return E(F)}}function E(G){for(var F in C.prototype){G[F]=C.prototype[F]}return G}C.prototype.on=C.prototype.addEventListener=function(G,F){this._callbacks=this._callbacks||{};(this._callbacks[G]=this._callbacks[G]||[]).push(F);return this};C.prototype.once=function(H,F){var I=this;this._callbacks=this._callbacks||{};function G(){I.off(H,G);F.apply(this,arguments)}G.fn=F;this.on(H,G);return this};C.prototype.off=C.prototype.removeListener=C.prototype.removeAllListeners=C.prototype.removeEventListener=function(H,F){this._callbacks=this._callbacks||{};if(0==arguments.length){this._callbacks={};return this}var G=this._callbacks[H];if(!G){return this}if(1==arguments.length){delete this._callbacks[H];return this}var J;for(var I=0;I<G.length;I++){J=G[I];if(J===F||J.fn===F){G.splice(I,1);break}}return this};C.prototype.emit=function(I){this._callbacks=this._callbacks||{};var G=[].slice.call(arguments,1),F=this._callbacks[I];if(F){F=F.slice(0);for(var J=0,H=F.length;J<H;++J){F[J].apply(this,G)}}return this};C.prototype.listeners=function(F){this._callbacks=this._callbacks||{};return this._callbacks[F]||[]};C.prototype.hasListeners=function(F){return !!this.listeners(F).length}});A.register("dropzone",function(C,B){B.exports=A("dropzone/lib/dropzone.js")});A.register("dropzone/lib/dropzone.js",function(C,B){(function(){var D,I,K,M,F,L,N,J,H={}.hasOwnProperty,G=function(P,O){for(var Q in O){if(H.call(O,Q)){P[Q]=O[Q]}}function R(){this.constructor=P}R.prototype=O.prototype;P.prototype=new R();P.__super__=O.prototype;return P},E=[].slice;I=typeof Emitter!=="undefined"&&Emitter!==null?Emitter:A("component~emitter@1.1.2");N=function(){};D=(function(P){var Q;G(O,P);O.prototype.events=["drop","dragstart","dragend","dragenter","dragover","dragleave","addedfile","removedfile","thumbnail","error","errormultiple","processing","processingmultiple","uploadprogress","totaluploadprogress","sending","sendingmultiple","success","successmultiple","canceled","canceledmultiple","complete","completemultiple","reset","maxfilesexceeded","maxfilesreached"];O.prototype.defaultOptions={url:null,method:"post",withCredentials:false,parallelUploads:2,uploadMultiple:false,maxFilesize:256,paramName:"file",createImageThumbnails:true,maxThumbnailFilesize:10,thumbnailWidth:100,thumbnailHeight:100,maxFiles:null,params:{},clickable:true,ignoreHiddenFiles:true,acceptedFiles:null,acceptedMimeTypes:null,autoProcessQueue:true,autoQueue:true,addRemoveLinks:false,previewsContainer:null,dictDefaultMessage:"Drop files here to upload",dictFallbackMessage:"Your browser does not support drag'n'drop file uploads.",dictFallbackText:"Please use the fallback form below to upload your files like in the olden days.",dictFileTooBig:"File is too big ({{filesize}}MiB). Max filesize: {{maxFilesize}}MiB.",dictInvalidFileType:"You can't upload files of this type.",dictResponseError:"Server responded with {{statusCode}} code.",dictCancelUpload:"Cancel upload",dictCancelUploadConfirmation:"Are you sure you want to cancel this upload?",dictRemoveFile:"Remove file",dictRemoveFileConfirmation:null,dictMaxFilesExceeded:"You can not upload any more files.",accept:function(S,R){return R()},init:function(){return N},forceFallback:false,fallback:function(){var U,T,V,W,S,R;this.element.className=""+this.element.className+" dz-browser-not-supported";R=this.element.getElementsByTagName("div");for(W=0,S=R.length;W<S;W++){U=R[W];if(/(^| )dz-message($| )/.test(U.className)){T=U;U.className="dz-message";continue}}if(!T){T=O.createElement('<div class="dz-message"><span></span></div>');this.element.appendChild(T)}V=T.getElementsByTagName("span")[0];if(V){V.textContent=this.options.dictFallbackMessage}return this.element.appendChild(this.getFallbackForm())},resize:function(U){var R,S,T;R={srcX:0,srcY:0,srcWidth:U.width,srcHeight:U.height};S=U.width/U.height;R.optWidth=this.options.thumbnailWidth;R.optHeight=this.options.thumbnailHeight;if((R.optWidth==null)&&(R.optHeight==null)){R.optWidth=R.srcWidth;R.optHeight=R.srcHeight}else{if(R.optWidth==null){R.optWidth=S*R.optHeight}else{if(R.optHeight==null){R.optHeight=(1/S)*R.optWidth}}}T=R.optWidth/R.optHeight;if(U.height<R.optHeight||U.width<R.optWidth){R.trgHeight=R.srcHeight;R.trgWidth=R.srcWidth}else{if(S>T){R.srcHeight=U.height;R.srcWidth=R.srcHeight*T}else{R.srcWidth=U.width;R.srcHeight=R.srcWidth/T}}R.srcX=(U.width-R.srcWidth)/2;R.srcY=(U.height-R.srcHeight)/2;return R},drop:function(R){return this.element.classList.remove("dz-drag-hover")},dragstart:N,dragend:function(R){return this.element.classList.remove("dz-drag-hover")},dragenter:function(R){return this.element.classList.add("dz-drag-hover")},dragover:function(R){return this.element.classList.add("dz-drag-hover")},dragleave:function(R){return this.element.classList.remove("dz-drag-hover")},paste:N,reset:function(){return this.element.classList.remove("dz-started")},addedfile:function(Z){var S,c,a,e,V,b,X,U,W,Y,d,R,T;if(this.element===this.previewsContainer){this.element.classList.add("dz-started")}if(this.previewsContainer){Z.previewElement=O.createElement(this.options.previewTemplate.trim());Z.previewTemplate=Z.previewElement;this.previewsContainer.appendChild(Z.previewElement);Y=Z.previewElement.querySelectorAll("[data-dz-name]");for(e=0,X=Y.length;e<X;e++){S=Y[e];S.textContent=Z.name}d=Z.previewElement.querySelectorAll("[data-dz-size]");for(V=0,U=d.length;V<U;V++){S=d[V];S.innerHTML=this.filesize(Z.size)}if(this.options.addRemoveLinks){Z._removeLink=O.createElement('<a class="dz-remove" href="javascript:undefined;" data-dz-remove>'+this.options.dictRemoveFile+"</a>");Z.previewElement.appendChild(Z._removeLink)}c=(function(f){return function(g){g.preventDefault();g.stopPropagation();if(Z.status===O.UPLOADING){return O.confirm(f.options.dictCancelUploadConfirmation,function(){return f.removeFile(Z)})}else{if(f.options.dictRemoveFileConfirmation){return O.confirm(f.options.dictRemoveFileConfirmation,function(){return f.removeFile(Z)})}else{return f.removeFile(Z)}}}})(this);R=Z.previewElement.querySelectorAll("[data-dz-remove]");T=[];for(b=0,W=R.length;b<W;b++){a=R[b];T.push(a.addEventListener("click",c))}return T}},removedfile:function(S){var R;if(S.previewElement){if((R=S.previewElement)!=null){R.parentNode.removeChild(S.previewElement)}}return this._updateMaxFilesReachedClass()},thumbnail:function(X,V){var T,U,S,R,W;if(X.previewElement){X.previewElement.classList.remove("dz-file-preview");X.previewElement.classList.add("dz-image-preview");R=X.previewElement.querySelectorAll("[data-dz-thumbnail]");W=[];for(U=0,S=R.length;U<S;U++){T=R[U];T.alt=X.name;W.push(T.src=V)}return W}},error:function(X,U){var W,T,S,R,V;if(X.previewElement){X.previewElement.classList.add("dz-error");if(typeof U!=="String"&&U.error){U=U.error}R=X.previewElement.querySelectorAll("[data-dz-errormessage]");V=[];for(T=0,S=R.length;T<S;T++){W=R[T];V.push(W.textContent=U)}return V}},errormultiple:N,processing:function(R){if(R.previewElement){R.previewElement.classList.add("dz-processing");if(R._removeLink){return R._removeLink.textContent=this.options.dictCancelUpload}}},processingmultiple:N,uploadprogress:function(V,R,X){var S,Y,W,U,T;if(V.previewElement){U=V.previewElement.querySelectorAll("[data-dz-uploadprogress]");T=[];for(Y=0,W=U.length;Y<W;Y++){S=U[Y];T.push(S.style.width=""+R+"%")}return T}},totaluploadprogress:N,sending:N,sendingmultiple:N,success:function(R){if(R.previewElement){return R.previewElement.classList.add("dz-success")}},successmultiple:N,canceled:function(R){return this.emit("error",R,"Upload canceled.")},canceledmultiple:N,complete:function(R){if(R._removeLink){return R._removeLink.textContent=this.options.dictRemoveFile}},completemultiple:N,maxfilesexceeded:N,maxfilesreached:N,previewTemplate:'<div class="dz-preview dz-file-preview">\n  <div class="dz-details">\n    <div class="dz-filename"><span data-dz-name></span></div>\n    <div class="dz-size" data-dz-size></div>\n    <img data-dz-thumbnail />\n  </div>\n  <div class="dz-progress"><span class="dz-upload" data-dz-uploadprogress></span></div>\n  <div class="dz-success-mark"><span>✔</span></div>\n  <div class="dz-error-mark"><span>✘</span></div>\n  <div class="dz-error-message"><span data-dz-errormessage></span></div>\n</div>'};Q=function(){var S,U,V,X,W,T,R;X=arguments[0],V=2<=arguments.length?E.call(arguments,1):[];for(T=0,R=V.length;T<R;T++){U=V[T];for(S in U){W=U[S];X[S]=W}}return X};function O(T,U){var V,S,R;this.element=T;this.version=O.version;this.defaultOptions.previewTemplate=this.defaultOptions.previewTemplate.replace(/\n*/g,"");this.clickableElements=[];this.listeners=[];this.files=[];if(typeof this.element==="string"){this.element=document.querySelector(this.element)}if(!(this.element&&(this.element.nodeType!=null))){throw new Error("Invalid dropzone element.")}if(this.element.dropzone){throw new Error("Dropzone already attached.")}O.instances.push(this);this.element.dropzone=this;V=(R=O.optionsForElement(this.element))!=null?R:{};this.options=Q({},this.defaultOptions,V,U!=null?U:{});if(this.options.forceFallback||!O.isBrowserSupported()){return this.options.fallback.call(this)}if(this.options.url==null){this.options.url=this.element.getAttribute("action")}if(!this.options.url){throw new Error("No URL provided.")}if(this.options.acceptedFiles&&this.options.acceptedMimeTypes){throw new Error("You can't provide both 'acceptedFiles' and 'acceptedMimeTypes'. 'acceptedMimeTypes' is deprecated.")}if(this.options.acceptedMimeTypes){this.options.acceptedFiles=this.options.acceptedMimeTypes;delete this.options.acceptedMimeTypes}this.options.method=this.options.method.toUpperCase();if((S=this.getExistingFallback())&&S.parentNode){S.parentNode.removeChild(S)}if(this.options.previewsContainer!==false){if(this.options.previewsContainer){this.previewsContainer=O.getElement(this.options.previewsContainer,"previewsContainer")}else{this.previewsContainer=this.element}}if(this.options.clickable){if(this.options.clickable===true){this.clickableElements=[this.element]}else{this.clickableElements=O.getElements(this.options.clickable,"clickable")}}this.init()}O.prototype.getAcceptedFiles=function(){var V,T,S,R,U;R=this.files;U=[];for(T=0,S=R.length;T<S;T++){V=R[T];if(V.accepted){U.push(V)}}return U};O.prototype.getRejectedFiles=function(){var V,T,S,R,U;R=this.files;U=[];for(T=0,S=R.length;T<S;T++){V=R[T];if(!V.accepted){U.push(V)}}return U};O.prototype.getFilesWithStatus=function(U){var W,T,S,R,V;R=this.files;V=[];for(T=0,S=R.length;T<S;T++){W=R[T];if(W.status===U){V.push(W)}}return V};O.prototype.getQueuedFiles=function(){return this.getFilesWithStatus(O.QUEUED)};O.prototype.getUploadingFiles=function(){return this.getFilesWithStatus(O.UPLOADING)};O.prototype.getActiveFiles=function(){var V,T,S,R,U;R=this.files;U=[];for(T=0,S=R.length;T<S;T++){V=R[T];if(V.status===O.UPLOADING||V.status===O.QUEUED){U.push(V)}}return U};O.prototype.init=function(){var W,T,V,X,S,R,U;if(this.element.tagName==="form"){this.element.setAttribute("enctype","multipart/form-data")}if(this.element.classList.contains("dropzone")&&!this.element.querySelector(".dz-message")){this.element.appendChild(O.createElement('<div class="dz-default dz-message"><span>'+this.options.dictDefaultMessage+"</span></div>"))}if(this.clickableElements.length){V=(function(Y){return function(){if(Y.hiddenFileInput){document.body.removeChild(Y.hiddenFileInput)}Y.hiddenFileInput=document.createElement("input");Y.hiddenFileInput.setAttribute("type","file");if((Y.options.maxFiles==null)||Y.options.maxFiles>1){Y.hiddenFileInput.setAttribute("multiple","multiple")}Y.hiddenFileInput.className="dz-hidden-input";if(Y.options.acceptedFiles!=null){Y.hiddenFileInput.setAttribute("accept",Y.options.acceptedFiles)}Y.hiddenFileInput.style.visibility="hidden";Y.hiddenFileInput.style.position="absolute";Y.hiddenFileInput.style.top="0";Y.hiddenFileInput.style.left="0";Y.hiddenFileInput.style.height="0";Y.hiddenFileInput.style.width="0";document.body.appendChild(Y.hiddenFileInput);return Y.hiddenFileInput.addEventListener("change",function(){var c,b,a,Z;b=Y.hiddenFileInput.files;if(b.length){for(a=0,Z=b.length;a<Z;a++){c=b[a];Y.addFile(c)}}return V()})}})(this);V()}this.URL=(R=window.URL)!=null?R:window.webkitURL;U=this.events;for(X=0,S=U.length;X<S;X++){W=U[X];this.on(W,this.options[W])}this.on("uploadprogress",(function(Y){return function(){return Y.updateTotalUploadProgress()}})(this));this.on("removedfile",(function(Y){return function(){return Y.updateTotalUploadProgress()}})(this));this.on("canceled",(function(Y){return function(Z){return Y.emit("complete",Z)}})(this));this.on("complete",(function(Y){return function(Z){if(Y.getUploadingFiles().length===0&&Y.getQueuedFiles().length===0){return setTimeout((function(){return Y.emit("queuecomplete")}),0)}}})(this));T=function(Y){Y.stopPropagation();if(Y.preventDefault){return Y.preventDefault()}else{return Y.returnValue=false}};this.listeners=[{element:this.element,events:{"dragstart":(function(Y){return function(Z){return Y.emit("dragstart",Z)}})(this),"dragenter":(function(Y){return function(Z){T(Z);return Y.emit("dragenter",Z)}})(this),"dragover":(function(Y){return function(a){var Z;try{Z=a.dataTransfer.effectAllowed}catch(b){}a.dataTransfer.dropEffect="move"===Z||"linkMove"===Z?"move":"copy";T(a);return Y.emit("dragover",a)}})(this),"dragleave":(function(Y){return function(Z){return Y.emit("dragleave",Z)}})(this),"drop":(function(Y){return function(Z){T(Z);return Y.drop(Z)}})(this),"dragend":(function(Y){return function(Z){return Y.emit("dragend",Z)}})(this)}}];this.clickableElements.forEach((function(Y){return function(Z){return Y.listeners.push({element:Z,events:{"click":function(a){if((Z!==Y.element)||(a.target===Y.element||O.elementInside(a.target,Y.element.querySelector(".dz-message")))){return Y.hiddenFileInput.click()}}}})}})(this));this.enable();return this.options.init.call(this)};O.prototype.destroy=function(){var R;this.disable();this.removeAllFiles(true);if((R=this.hiddenFileInput)!=null?R.parentNode:void 0){this.hiddenFileInput.parentNode.removeChild(this.hiddenFileInput);this.hiddenFileInput=null}delete this.element.dropzone;return O.instances.splice(O.instances.indexOf(this),1)};O.prototype.updateTotalUploadProgress=function(){var Y,V,T,R,U,S,W,X;R=0;T=0;Y=this.getActiveFiles();if(Y.length){X=this.getActiveFiles();for(S=0,W=X.length;S<W;S++){V=X[S];R+=V.upload.bytesSent;T+=V.upload.total}U=100*R/T}else{U=100}return this.emit("totaluploadprogress",U,T,R)};O.prototype._getParamName=function(R){if(typeof this.options.paramName==="function"){return this.options.paramName(R)}else{return""+this.options.paramName+(this.options.uploadMultiple?"["+R+"]":"")}};O.prototype.getFallbackForm=function(){var T,U,R,S;if(T=this.getExistingFallback()){return T}R='<div class="dz-fallback">';if(this.options.dictFallbackText){R+="<p>"+this.options.dictFallbackText+"</p>"}R+='<input type="file" name="'+(this._getParamName(0))+'" '+(this.options.uploadMultiple?'multiple="multiple"':void 0)+' /><input type="submit" value="Upload!"></div>';U=O.createElement(R);if(this.element.tagName!=="FORM"){S=O.createElement('<form action="'+this.options.url+'" enctype="multipart/form-data" method="'+this.options.method+'"></form>');S.appendChild(U)}else{this.element.setAttribute("enctype","multipart/form-data");this.element.setAttribute("method",this.options.method)}return S!=null?S:U};O.prototype.getExistingFallback=function(){var U,T,V,W,S,R;T=function(Z){var Y,a,X;for(a=0,X=Z.length;a<X;a++){Y=Z[a];if(/(^| )fallback($| )/.test(Y.className)){return Y}}};R=["div","form"];for(W=0,S=R.length;W<S;W++){V=R[W];if(U=T(this.element.getElementsByTagName(V))){return U}}};O.prototype.setupEventListeners=function(){var X,V,S,T,U,R,W;R=this.listeners;W=[];for(T=0,U=R.length;T<U;T++){X=R[T];W.push((function(){var Z,Y;Z=X.events;Y=[];for(V in Z){S=Z[V];Y.push(X.element.addEventListener(V,S,false))}return Y})())}return W};O.prototype.removeEventListeners=function(){var X,V,S,T,U,R,W;R=this.listeners;W=[];for(T=0,U=R.length;T<U;T++){X=R[T];W.push((function(){var Z,Y;Z=X.events;Y=[];for(V in Z){S=Z[V];Y.push(X.element.removeEventListener(V,S,false))}return Y})())}return W};O.prototype.disable=function(){var V,T,S,R,U;this.clickableElements.forEach(function(W){return W.classList.remove("dz-clickable")});this.removeEventListeners();R=this.files;U=[];for(T=0,S=R.length;T<S;T++){V=R[T];U.push(this.cancelUpload(V))}return U};O.prototype.enable=function(){this.clickableElements.forEach(function(R){return R.classList.add("dz-clickable")});return this.setupEventListeners()};O.prototype.filesize=function(R){var S;if(R>=1024*1024*1024*1024/10){R=R/(1024*1024*1024*1024/10);S="TiB"}else{if(R>=1024*1024*1024/10){R=R/(1024*1024*1024/10);S="GiB"}else{if(R>=1024*1024/10){R=R/(1024*1024/10);S="MiB"}else{if(R>=1024/10){R=R/(1024/10);S="KiB"}else{R=R*10;S="b"}}}}return"<strong>"+(Math.round(R)/10)+"</strong> "+S};O.prototype._updateMaxFilesReachedClass=function(){if((this.options.maxFiles!=null)&&this.getAcceptedFiles().length>=this.options.maxFiles){if(this.getAcceptedFiles().length===this.options.maxFiles){this.emit("maxfilesreached",this.files)}return this.element.classList.add("dz-max-files-reached")}else{return this.element.classList.remove("dz-max-files-reached")}};O.prototype.drop=function(T){var R,S;if(!T.dataTransfer){return}this.emit("drop",T);R=T.dataTransfer.files;if(R.length){S=T.dataTransfer.items;if(S&&S.length&&(S[0].webkitGetAsEntry!=null)){this._addFilesFromItems(S)}else{this.handleFiles(R)}}};O.prototype.paste=function(T){var S,R;if((T!=null?(R=T.clipboardData)!=null?R.items:void 0:void 0)==null){return}this.emit("paste",T);S=T.clipboardData.items;if(S.length){return this._addFilesFromItems(S)}};O.prototype.handleFiles=function(U){var V,T,S,R;R=[];for(T=0,S=U.length;T<S;T++){V=U[T];R.push(this.addFile(V))}return R};O.prototype._addFilesFromItems=function(U){var R,V,W,S,T;T=[];for(W=0,S=U.length;W<S;W++){V=U[W];if((V.webkitGetAsEntry!=null)&&(R=V.webkitGetAsEntry())){if(R.isFile){T.push(this.addFile(V.getAsFile()))}else{if(R.isDirectory){T.push(this._addFilesFromDirectory(R,R.name))}else{T.push(void 0)}}}else{if(V.getAsFile!=null){if((V.kind==null)||V.kind==="file"){T.push(this.addFile(V.getAsFile()))}else{T.push(void 0)}}else{T.push(void 0)}}}return T};O.prototype._addFilesFromDirectory=function(T,S){var R,U;R=T.createReader();U=(function(V){return function(X){var W,Z,Y;for(Z=0,Y=X.length;Z<Y;Z++){W=X[Z];if(W.isFile){W.file(function(a){if(V.options.ignoreHiddenFiles&&a.name.substring(0,1)==="."){return}a.fullPath=""+S+"/"+a.name;return V.addFile(a)})}else{if(W.isDirectory){V._addFilesFromDirectory(W,""+S+"/"+W.name)}}}}})(this);return R.readEntries(U,function(V){return typeof console!=="undefined"&&console!==null?typeof console.log==="function"?console.log(V):void 0:void 0})};O.prototype.accept=function(S,R){if(S.size>this.options.maxFilesize*1024*1024){return R(this.options.dictFileTooBig.replace("{{filesize}}",Math.round(S.size/1024/10.24)/100).replace("{{maxFilesize}}",this.options.maxFilesize))}else{if(!O.isValidFile(S,this.options.acceptedFiles)){return R(this.options.dictInvalidFileType)}else{if((this.options.maxFiles!=null)&&this.getAcceptedFiles().length>=this.options.maxFiles){R(this.options.dictMaxFilesExceeded.replace("{{maxFiles}}",this.options.maxFiles));return this.emit("maxfilesexceeded",S)}else{return this.options.accept.call(this,S,R)}}}};O.prototype.addFile=function(R){R.upload={progress:0,total:R.size,bytesSent:0};this.files.push(R);R.status=O.ADDED;this.emit("addedfile",R);this._enqueueThumbnail(R);return this.accept(R,(function(S){return function(T){if(T){R.accepted=false;S._errorProcessing([R],T)}else{R.accepted=true;if(S.options.autoQueue){S.enqueueFile(R)}}return S._updateMaxFilesReachedClass()}})(this))};O.prototype.enqueueFiles=function(T){var U,S,R;for(S=0,R=T.length;S<R;S++){U=T[S];this.enqueueFile(U)}return null};O.prototype.enqueueFile=function(R){if(R.status===O.ADDED&&R.accepted===true){R.status=O.QUEUED;if(this.options.autoProcessQueue){return setTimeout(((function(S){return function(){return S.processQueue()}})(this)),0)}}else{throw new Error("This file can't be queued because it has already been processed or was rejected.")}};O.prototype._thumbnailQueue=[];O.prototype._processingThumbnail=false;O.prototype._enqueueThumbnail=function(R){if(this.options.createImageThumbnails&&R.type.match(/image.*/)&&R.size<=this.options.maxThumbnailFilesize*1024*1024){this._thumbnailQueue.push(R);return setTimeout(((function(S){return function(){return S._processThumbnailQueue()}})(this)),0)}};O.prototype._processThumbnailQueue=function(){if(this._processingThumbnail||this._thumbnailQueue.length===0){return}this._processingThumbnail=true;return this.createThumbnail(this._thumbnailQueue.shift(),(function(R){return function(){R._processingThumbnail=false;return R._processThumbnailQueue()}})(this))};O.prototype.removeFile=function(R){if(R.status===O.UPLOADING){this.cancelUpload(R)}this.files=J(this.files,R);this.emit("removedfile",R);if(this.files.length===0){return this.emit("reset")}};O.prototype.removeAllFiles=function(U){var V,T,S,R;if(U==null){U=false}R=this.files.slice();for(T=0,S=R.length;T<S;T++){V=R[T];if(V.status!==O.UPLOADING||U){this.removeFile(V)}}return null};O.prototype.createThumbnail=function(T,R){var S;S=new FileReader;S.onload=(function(U){return function(){var V;V=document.createElement("img");V.onload=function(){var b,Z,X,c,a,W,Y,d;T.width=V.width;T.height=V.height;X=U.options.resize.call(U,T);if(X.trgWidth==null){X.trgWidth=X.optWidth}if(X.trgHeight==null){X.trgHeight=X.optHeight}b=document.createElement("canvas");Z=b.getContext("2d");b.width=X.trgWidth;b.height=X.trgHeight;L(Z,V,(a=X.srcX)!=null?a:0,(W=X.srcY)!=null?W:0,X.srcWidth,X.srcHeight,(Y=X.trgX)!=null?Y:0,(d=X.trgY)!=null?d:0,X.trgWidth,X.trgHeight);c=b.toDataURL("image/png");U.emit("thumbnail",T,c);if(R!=null){return R()}};return V.src=S.result}})(this);return S.readAsDataURL(T)};O.prototype.processQueue=function(){var U,R,S,T;R=this.options.parallelUploads;S=this.getUploadingFiles().length;U=S;if(S>=R){return}T=this.getQueuedFiles();if(!(T.length>0)){return}if(this.options.uploadMultiple){return this.processFiles(T.slice(0,R-S))}else{while(U<R){if(!T.length){return}this.processFile(T.shift());U++}}};O.prototype.processFile=function(R){return this.processFiles([R])};O.prototype.processFiles=function(T){var U,S,R;for(S=0,R=T.length;S<R;S++){U=T[S];U.processing=true;U.status=O.UPLOADING;this.emit("processing",U)}if(this.options.uploadMultiple){this.emit("processingmultiple",T)}return this.uploadFiles(T)};O.prototype._getFilesWithXhr=function(S){var T,R;return R=(function(){var X,V,U,W;U=this.files;W=[];for(X=0,V=U.length;X<V;X++){T=U[X];if(T.xhr===S){W.push(T)}}return W}).call(this)};O.prototype.cancelUpload=function(V){var U,W,R,T,Y,S,X;if(V.status===O.UPLOADING){W=this._getFilesWithXhr(V.xhr);for(R=0,Y=W.length;R<Y;R++){U=W[R];U.status=O.CANCELED}V.xhr.abort();for(T=0,S=W.length;T<S;T++){U=W[T];this.emit("canceled",U)}if(this.options.uploadMultiple){this.emit("canceledmultiple",W)}}else{if((X=V.status)===O.ADDED||X===O.QUEUED){V.status=O.CANCELED;this.emit("canceled",V);if(this.options.uploadMultiple){this.emit("canceledmultiple",[V])}}}if(this.options.autoProcessQueue){return this.processQueue()}};O.prototype.uploadFile=function(R){return this.uploadFiles([R])};O.prototype.uploadFiles=function(R){var k,j,Y,q,w,r,l,S,v,Z,u,h,f,c,b,y,n,a,X,T,o,d,W,s,V,t,p,e,g,x,U,m;n=new XMLHttpRequest();for(a=0,d=R.length;a<d;a++){k=R[a];k.xhr=n}n.open(this.options.method,this.options.url,true);n.withCredentials=!!this.options.withCredentials;c=null;Y=(function(i){return function(){var Ab,z,Aa;Aa=[];for(Ab=0,z=R.length;Ab<z;Ab++){k=R[Ab];Aa.push(i._errorProcessing(R,c||i.options.dictResponseError.replace("{{statusCode}}",n.status),n))}return Aa}})(this);b=(function(i){return function(Ag){var Aa,z,Ad,Ah,Ab,Ac,Af,Ae,Ai;if(Ag!=null){z=100*Ag.loaded/Ag.total;for(Ad=0,Ac=R.length;Ad<Ac;Ad++){k=R[Ad];k.upload={progress:z,total:Ag.total,bytesSent:Ag.loaded}}}else{Aa=true;z=100;for(Ah=0,Af=R.length;Ah<Af;Ah++){k=R[Ah];if(!(k.upload.progress===100&&k.upload.bytesSent===k.upload.total)){Aa=false}k.upload.progress=z;k.upload.bytesSent=k.upload.total}if(Aa){return}}Ai=[];for(Ab=0,Ae=R.length;Ab<Ae;Ab++){k=R[Ab];Ai.push(i.emit("uploadprogress",k,z,k.upload.bytesSent))}return Ai}})(this);n.onload=(function(i){return function(Ab){var z;if(R[0].status===O.CANCELED){return}if(n.readyState!==4){return}c=n.responseText;if(n.getResponseHeader("content-type")&&~n.getResponseHeader("content-type").indexOf("application/json")){try{c=JSON.parse(c)}catch(Aa){Ab=Aa;c="Invalid JSON response from server."}}b();if(!((200<=(z=n.status)&&z<300))){return Y()}else{return i._finished(R,c,Ab)}}})(this);n.onerror=(function(i){return function(){if(R[0].status===O.CANCELED){return}return Y()}})(this);f=(p=n.upload)!=null?p:n;f.onprogress=b;r={"Accept":"application/json","Cache-Control":"no-cache","X-Requested-With":"XMLHttpRequest"};if(this.options.headers){Q(r,this.options.headers)}for(q in r){w=r[q];n.setRequestHeader(q,w)}j=new FormData();if(this.options.params){e=this.options.params;for(u in e){y=e[u];j.append(u,y)}}for(X=0,W=R.length;X<W;X++){k=R[X];this.emit("sending",k,n,j)}if(this.options.uploadMultiple){this.emit("sendingmultiple",R,n,j)}if(this.element.tagName==="FORM"){g=this.element.querySelectorAll("input, textarea, select, button");for(T=0,s=g.length;T<s;T++){S=g[T];v=S.getAttribute("name");Z=S.getAttribute("type");if(S.tagName==="SELECT"&&S.hasAttribute("multiple")){x=S.options;for(o=0,V=x.length;o<V;o++){h=x[o];if(h.selected){j.append(v,h.value)}}}else{if(!Z||((U=Z.toLowerCase())!=="checkbox"&&U!=="radio")||S.checked){j.append(v,S.value)}}}}for(l=t=0,m=R.length-1;0<=m?t<=m:t>=m;l=0<=m?++t:--t){j.append(this._getParamName(l),R[l],R[l].name)}return n.send(j)};O.prototype._finished=function(T,V,U){var W,S,R;for(S=0,R=T.length;S<R;S++){W=T[S];W.status=O.SUCCESS;this.emit("success",W,V,U);this.emit("complete",W)}if(this.options.uploadMultiple){this.emit("successmultiple",T,V,U);this.emit("completemultiple",T)}if(this.options.autoProcessQueue){return this.processQueue()}};O.prototype._errorProcessing=function(U,T,V){var W,S,R;for(S=0,R=U.length;S<R;S++){W=U[S];W.status=O.ERROR;this.emit("error",W,T,V);this.emit("complete",W)}if(this.options.uploadMultiple){this.emit("errormultiple",U,T,V);this.emit("completemultiple",U)}if(this.options.autoProcessQueue){return this.processQueue()}};return O})(I);D.version="3.10.2";D.options={};D.optionsForElement=function(O){if(O.getAttribute("id")){return D.options[K(O.getAttribute("id"))]}else{return void 0}};D.instances=[];D.forElement=function(O){if(typeof O==="string"){O=document.querySelector(O)}if((O!=null?O.dropzone:void 0)==null){throw new Error("No Dropzone found for given element. This is probably because you're trying to access it before Dropzone had the time to initialize. Use the `init` option to setup any additional observers on your Dropzone.")}return O.dropzone};D.autoDiscover=true;D.discover=function(){var S,Q,P,T,R,O;if(document.querySelectorAll){P=document.querySelectorAll(".dropzone")}else{P=[];S=function(X){var W,Y,V,U;U=[];for(Y=0,V=X.length;Y<V;Y++){W=X[Y];if(/(^| )dropzone($| )/.test(W.className)){U.push(P.push(W))}else{U.push(void 0)}}return U};S(document.getElementsByTagName("div"));S(document.getElementsByTagName("form"))}O=[];for(T=0,R=P.length;T<R;T++){Q=P[T];if(D.optionsForElement(Q)!==false){O.push(new D(Q))}else{O.push(void 0)}}return O};D.blacklistedBrowsers=[/opera.*Macintosh.*version\/12/i];D.isBrowserSupported=function(){var R,Q,S,P,O;R=true;if(window.File&&window.FileReader&&window.FileList&&window.Blob&&window.FormData&&document.querySelector){if(!("classList" in document.createElement("a"))){R=false}else{O=D.blacklistedBrowsers;for(S=0,P=O.length;S<P;S++){Q=O[S];if(Q.test(navigator.userAgent)){R=false;continue}}}}else{R=false}return R};J=function(R,Q){var S,T,P,O;O=[];for(T=0,P=R.length;T<P;T++){S=R[T];if(S!==Q){O.push(S)}}return O};K=function(O){return O.replace(/[\-_](\w)/g,function(P){return P.charAt(1).toUpperCase()})};D.createElement=function(P){var O;O=document.createElement("div");O.innerHTML=P;return O.childNodes[0]};D.elementInside=function(P,O){if(P===O){return true}while(P=P.parentNode){if(P===O){return true}}return false};D.getElement=function(P,O){var Q;if(typeof P==="string"){Q=document.querySelector(P)}else{if(P.nodeType!=null){Q=P}}if(Q==null){throw new Error("Invalid `"+O+"` option provided. Please provide a CSS selector or a plain HTML element.")}return Q};D.getElements=function(Q,S){var T,R,O,Y,U,V,P,X;if(Q instanceof Array){O=[];try{for(Y=0,V=Q.length;Y<V;Y++){R=Q[Y];O.push(this.getElement(R,S))}}catch(W){T=W;O=null}}else{if(typeof Q==="string"){O=[];X=document.querySelectorAll(Q);for(U=0,P=X.length;U<P;U++){R=X[U];O.push(R)}}else{if(Q.nodeType!=null){O=[Q]}}}if(!((O!=null)&&O.length)){throw new Error("Invalid `"+S+"` option provided. Please provide a CSS selector, a plain HTML element or a list of those.")}return O};D.confirm=function(Q,P,O){if(window.confirm(Q)){return P()}else{if(O!=null){return O()}}};D.isValidFile=function(U,P){var R,Q,T,S,O;if(!P){return true}P=P.split(",");Q=U.type;R=Q.replace(/\/.*$/,"");for(S=0,O=P.length;S<O;S++){T=P[S];T=T.trim();if(T.charAt(0)==="."){if(U.name.toLowerCase().indexOf(T.toLowerCase(),U.name.length-T.length)!==-1){return true}}else{if(/\/\*$/.test(T)){if(R===T.replace(/\/.*$/,"")){return true}}else{if(Q===T){return true}}}}return false};if(typeof jQuery!=="undefined"&&jQuery!==null){jQuery.fn.dropzone=function(O){return this.each(function(){return new D(this,O)})}}if(typeof B!=="undefined"&&B!==null){B.exports=D}else{window.Dropzone=D}D.ADDED="added";D.QUEUED="queued";D.ACCEPTED=D.QUEUED;D.UPLOADING="uploading";D.PROCESSING=D.UPLOADING;D.CANCELED="canceled";D.ERROR="error";D.SUCCESS="success";F=function(Q){var S,W,V,U,O,T,Y,P,X,R;Y=Q.naturalWidth;T=Q.naturalHeight;W=document.createElement("canvas");W.width=1;W.height=T;V=W.getContext("2d");V.drawImage(Q,0,0);U=V.getImageData(0,0,1,T).data;R=0;O=T;P=T;while(P>R){S=U[(P-1)*4+3];if(S===0){O=P}else{R=P}P=(O+R)>>1}X=P/T;if(X===0){return 1}else{return X}};L=function(W,Q,X,R,V,P,U,Y,S,O){var T;T=F(Q);return W.drawImage(Q,X,R,V,P,U,Y,S,O/T)};M=function(Z,R){var T,W,Y,Q,S,U,V,O,P;Y=false;P=true;W=Z.document;O=W.documentElement;T=(W.addEventListener?"addEventListener":"attachEvent");V=(W.addEventListener?"removeEventListener":"detachEvent");U=(W.addEventListener?"":"on");Q=function(a){if(a.type==="readystatechange"&&W.readyState!=="complete"){return}(a.type==="load"?Z:W)[V](U+a.type,Q,false);if(!Y&&(Y=true)){return R.call(Z,a.type||a)}};S=function(){var b;try{O.doScroll("left")}catch(a){b=a;setTimeout(S,50);return}return Q("poll")};if(W.readyState!=="complete"){if(W.createEventObject&&O.doScroll){try{P=!Z.frameElement}catch(X){}if(P){S()}}W[T](U+"DOMContentLoaded",Q,false);W[T](U+"readystatechange",Q,false);return Z[T](U+"load",Q,false)}};D._autoDiscoverFunction=function(){if(D.autoDiscover){return D.discover()}};M(window,D._autoDiscoverFunction)}).call(this)});if(typeof exports=="object"){module.exports=A("dropzone")}else{if(typeof define=="function"&&define.amd){define([],function(){return A("dropzone")})}else{this["Dropzone"]=A("dropzone")}}})();