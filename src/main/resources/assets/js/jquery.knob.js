/*jQuery Knob*/
(function(A){if(typeof define==="function"&&define.amd){define(["jquery"],A)}else{A(jQuery)}}(function(B){var D={},C=Math.max,A=Math.min;D.c={};D.c.d=B(document);D.c.t=function(E){return E.originalEvent.touches.length-1};D.o=function(){var E=this;this.o=null;this.$=null;this.i=null;this.g=null;this.v=null;this.cv=null;this.x=0;this.y=0;this.w=0;this.h=0;this.$c=null;this.c=null;this.t=0;this.isInit=false;this.fgColor=null;this.pColor=null;this.dH=null;this.cH=null;this.eH=null;this.rH=null;this.scale=1;this.relative=false;this.relativeWidth=false;this.relativeHeight=false;this.$div=null;this.run=function(){var F=function(H,G){var I;for(I in G){E.o[I]=G[I]}E._carve().init();E._configure()._draw()};if(this.$.data("kontroled")){return}this.$.data("kontroled",true);this.extend();this.o=B.extend({min:this.$.data("min")!==undefined?this.$.data("min"):0,max:this.$.data("max")!==undefined?this.$.data("max"):100,stopper:true,readOnly:this.$.data("readonly")||(this.$.attr("readonly")==="readonly"),cursor:this.$.data("cursor")===true&&30||this.$.data("cursor")||0,thickness:this.$.data("thickness")&&Math.max(Math.min(this.$.data("thickness"),1),0.01)||0.35,lineCap:this.$.data("linecap")||"butt",width:this.$.data("width")||200,height:this.$.data("height")||200,displayInput:this.$.data("displayinput")==null||this.$.data("displayinput"),displayPrevious:this.$.data("displayprevious"),fgColor:this.$.data("fgcolor")||"#87CEEB",inputColor:this.$.data("inputcolor"),font:this.$.data("font")||"Arial",fontWeight:this.$.data("font-weight")||"bold",inline:false,step:this.$.data("step")||1,rotation:this.$.data("rotation"),draw:null,change:null,cancel:null,release:null,format:function(G){return G},parse:function(G){return parseFloat(G)}},this.o);this.o.flip=this.o.rotation==="anticlockwise"||this.o.rotation==="acw";if(!this.o.inputColor){this.o.inputColor=this.o.fgColor}if(this.$.is("fieldset")){this.v={};this.i=this.$.find("input");this.i.each(function(H){var G=B(this);E.i[H]=G;E.v[H]=E.o.parse(G.val());G.bind("change blur",function(){var I={};I[H]=G.val();E.val(E._validate(I))})});this.$.find("legend").remove()}else{this.i=this.$;this.v=this.o.parse(this.$.val());this.v===""&&(this.v=this.o.min);this.$.bind("change blur",function(){E.val(E._validate(E.o.parse(E.$.val())))})}!this.o.displayInput&&this.$.hide();this.$c=B(document.createElement("canvas")).attr({width:this.o.width,height:this.o.height});this.$div=B('<div style="'+(this.o.inline?"display:inline;":"")+"width:"+this.o.width+"px;height:"+this.o.height+'px;"></div>');this.$.wrap(this.$div).before(this.$c);this.$div=this.$.parent();if(typeof G_vmlCanvasManager!=="undefined"){G_vmlCanvasManager.initElement(this.$c[0])}this.c=this.$c[0].getContext?this.$c[0].getContext("2d"):null;if(!this.c){throw {name:"CanvasNotSupportedException",message:"Canvas not supported. Please use excanvas on IE8.0.",toString:function(){return this.name+": "+this.message}}}this.scale=(window.devicePixelRatio||1)/(this.c.webkitBackingStorePixelRatio||this.c.mozBackingStorePixelRatio||this.c.msBackingStorePixelRatio||this.c.oBackingStorePixelRatio||this.c.backingStorePixelRatio||1);this.relativeWidth=this.o.width%1!==0&&this.o.width.indexOf("%");this.relativeHeight=this.o.height%1!==0&&this.o.height.indexOf("%");this.relative=this.relativeWidth||this.relativeHeight;this._carve();if(this.v instanceof Object){this.cv={};this.copy(this.v,this.cv)}else{this.cv=this.v}this.$.bind("configure",F).parent().bind("configure",F);this._listen()._configure()._xy().init();this.isInit=true;this.$.val(this.o.format(this.v));this._draw();return this};this._carve=function(){if(this.relative){var F=this.relativeWidth?this.$div.parent().width()*parseInt(this.o.width)/100:this.$div.parent().width(),G=this.relativeHeight?this.$div.parent().height()*parseInt(this.o.height)/100:this.$div.parent().height();this.w=this.h=Math.min(F,G)}else{this.w=this.o.width;this.h=this.o.height}this.$div.css({"width":this.w+"px","height":this.h+"px"});this.$c.attr({width:this.w,height:this.h});if(this.scale!==1){this.$c[0].width=this.$c[0].width*this.scale;this.$c[0].height=this.$c[0].height*this.scale;this.$c.width(this.w);this.$c.height(this.h)}return this};this._draw=function(){var F=true;E.g=E.c;E.clear();E.dH&&(F=E.dH());F!==false&&E.draw()};this._touch=function(G){var F=function(I){var H=E.xy2val(I.originalEvent.touches[E.t].pageX,I.originalEvent.touches[E.t].pageY);if(H==E.cv){return}if(E.cH&&E.cH(H)===false){return}E.change(E._validate(H));E._draw()};this.t=D.c.t(G);F(G);D.c.d.bind("touchmove.k",F).bind("touchend.k",function(){D.c.d.unbind("touchmove.k touchend.k");E.val(E.cv)});return this};this._mouse=function(G){var F=function(I){var H=E.xy2val(I.pageX,I.pageY);if(H==E.cv){return}if(E.cH&&(E.cH(H)===false)){return}E.change(E._validate(H));E._draw()};F(G);D.c.d.bind("mousemove.k",F).bind("keyup.k",function(H){if(H.keyCode===27){D.c.d.unbind("mouseup.k mousemove.k keyup.k");if(E.eH&&E.eH()===false){return}E.cancel()}}).bind("mouseup.k",function(H){D.c.d.unbind("mousemove.k mouseup.k keyup.k");E.val(E.cv)});return this};this._xy=function(){var F=this.$c.offset();this.x=F.left;this.y=F.top;return this};this._listen=function(){if(!this.o.readOnly){this.$c.bind("mousedown",function(F){F.preventDefault();E._xy()._mouse(F)}).bind("touchstart",function(F){F.preventDefault();E._xy()._touch(F)});this.listen()}else{this.$.attr("readonly","readonly")}if(this.relative){B(window).resize(function(){E._carve().init();E._draw()})}return this};this._configure=function(){if(this.o.draw){this.dH=this.o.draw}if(this.o.change){this.cH=this.o.change}if(this.o.cancel){this.eH=this.o.cancel}if(this.o.release){this.rH=this.o.release}if(this.o.displayPrevious){this.pColor=this.h2rgba(this.o.fgColor,"0.4");this.fgColor=this.h2rgba(this.o.fgColor,"0.6")}else{this.fgColor=this.o.fgColor}return this};this._clear=function(){this.$c[0].width=this.$c[0].width};this._validate=function(F){var G=(~~(((F<0)?-0.5:0.5)+(F/this.o.step)))*this.o.step;return Math.round(G*100)/100};this.listen=function(){};this.extend=function(){};this.init=function(){};this.change=function(F){};this.val=function(F){};this.xy2val=function(F,G){};this.draw=function(){};this.clear=function(){this._clear()};this.h2rgba=function(G,F){var H;G=G.substring(1,7);H=[parseInt(G.substring(0,2),16),parseInt(G.substring(2,4),16),parseInt(G.substring(4,6),16)];return"rgba("+H[0]+","+H[1]+","+H[2]+","+F+")"};this.copy=function(H,F){for(var G in H){F[G]=H[G]}}};D.Dial=function(){D.o.call(this);this.startAngle=null;this.xy=null;this.radius=null;this.lineWidth=null;this.cursorExt=null;this.w2=null;this.PI2=2*Math.PI;this.extend=function(){this.o=B.extend({bgColor:this.$.data("bgcolor")||"#EEEEEE",angleOffset:this.$.data("angleoffset")||0,angleArc:this.$.data("anglearc")||360,inline:true},this.o)};this.val=function(E,F){if(null!=E){E=this.o.parse(E);if(F!==false&&E!=this.v&&this.rH&&this.rH(E)===false){return}this.cv=this.o.stopper?C(A(E,this.o.max),this.o.min):E;this.v=this.cv;this.$.val(this.o.format(this.v));this._draw()}else{return this.v}};this.xy2val=function(E,F){var G,H;G=Math.atan2(E-(this.x+this.w2),-(F-this.y-this.w2))-this.angleOffset;if(this.o.flip){G=this.angleArc-G-this.PI2}if(this.angleArc!=this.PI2&&(G<0)&&(G>-0.5)){G=0}else{if(G<0){G+=this.PI2}}H=(G*(this.o.max-this.o.min)/this.angleArc)+this.o.min;this.o.stopper&&(H=C(A(H,this.o.max),this.o.min));return H};this.listen=function(){var J=this,I,L,E=function(P){P.preventDefault();var O=P.originalEvent,Q=O.detail||O.wheelDeltaX,M=O.detail||O.wheelDeltaY,N=J._validate(J.o.parse(J.$.val()))+(Q>0||M>0?J.o.step:Q<0||M<0?-J.o.step:0);N=C(A(N,J.o.max),J.o.min);J.val(N,false);if(J.rH){clearTimeout(I);I=setTimeout(function(){J.rH(N);I=null},100);if(!L){L=setTimeout(function(){if(I){J.rH(N)}L=null},200)}}},G,K,F=1,H={37:-J.o.step,38:J.o.step,39:J.o.step,40:-J.o.step};this.$.bind("keydown",function(O){var M=O.keyCode;if(M>=96&&M<=105){M=O.keyCode=M-48}G=parseInt(String.fromCharCode(M));if(isNaN(G)){(M!==13)&&M!==8&&M!==9&&M!==189&&(M!==190||J.$.val().match(/\./))&&O.preventDefault();if(B.inArray(M,[37,38,39,40])>-1){O.preventDefault();var N=J.o.parse(J.$.val())+H[M]*F;J.o.stopper&&(N=C(A(N,J.o.max),J.o.min));J.change(J._validate(N));J._draw();K=window.setTimeout(function(){F*=2},30)}}}).bind("keyup",function(M){if(isNaN(G)){if(K){window.clearTimeout(K);K=null;F=1;J.val(J.$.val())}}else{(J.$.val()>J.o.max&&J.$.val(J.o.max))||(J.$.val()<J.o.min&&J.$.val(J.o.min))}});this.$c.bind("mousewheel DOMMouseScroll",E);this.$.bind("mousewheel DOMMouseScroll",E)};this.init=function(){if(this.v<this.o.min||this.v>this.o.max){this.v=this.o.min}this.$.val(this.v);this.w2=this.w/2;this.cursorExt=this.o.cursor/100;this.xy=this.w2*this.scale;this.lineWidth=this.xy*this.o.thickness;this.lineCap=this.o.lineCap;this.radius=this.xy-this.lineWidth/2;this.o.angleOffset&&(this.o.angleOffset=isNaN(this.o.angleOffset)?0:this.o.angleOffset);this.o.angleArc&&(this.o.angleArc=isNaN(this.o.angleArc)?this.PI2:this.o.angleArc);this.angleOffset=this.o.angleOffset*Math.PI/180;this.angleArc=this.o.angleArc*Math.PI/180;this.startAngle=1.5*Math.PI+this.angleOffset;this.endAngle=1.5*Math.PI+this.angleOffset+this.angleArc;var E=C(String(Math.abs(this.o.max)).length,String(Math.abs(this.o.min)).length,2)+2;this.o.displayInput&&this.i.css({"width":((this.w/2+4)>>0)+"px","height":((this.w/3)>>0)+"px","position":"absolute","vertical-align":"middle","margin-top":((this.w/3)>>0)+"px","margin-left":"-"+((this.w*3/4+2)>>0)+"px","border":0,"background":"none","font":this.o.fontWeight+" "+((this.w/E)>>0)+"px "+this.o.font,"text-align":"center","color":this.o.inputColor||this.o.fgColor,"padding":"0px","-webkit-appearance":"none"})||this.i.css({"width":"0px","visibility":"hidden"})};this.change=function(E){this.cv=E;this.$.val(this.o.format(E))};this.angle=function(E){return(E-this.o.min)*this.angleArc/(this.o.max-this.o.min)};this.arc=function(F){var G,E;F=this.angle(F);if(this.o.flip){G=this.endAngle+1e-05;E=G-F-1e-05}else{G=this.startAngle-1e-05;E=G+F+1e-05}this.o.cursor&&(G=E-this.cursorExt)&&(E=E+this.cursorExt);return{s:G,e:E,d:this.o.flip&&!this.o.cursor}};this.draw=function(){var H=this.g,F=this.arc(this.cv),G,E=1;H.lineWidth=this.lineWidth;H.lineCap=this.lineCap;if(this.o.bgColor!=="none"){H.beginPath();H.strokeStyle=this.o.bgColor;H.arc(this.xy,this.xy,this.radius,this.endAngle-1e-05,this.startAngle+1e-05,true);H.stroke()}if(this.o.displayPrevious){G=this.arc(this.v);H.beginPath();H.strokeStyle=this.pColor;H.arc(this.xy,this.xy,this.radius,G.s,G.e,G.d);H.stroke();E=this.cv==this.v}H.beginPath();H.strokeStyle=E?this.o.fgColor:this.fgColor;H.arc(this.xy,this.xy,this.radius,F.s,F.e,F.d);H.stroke()};this.cancel=function(){this.val(this.v)}};B.fn.dial=B.fn.knob=function(E){return this.each(function(){var F=new D.Dial();F.o=E;F.$=B(this);F.run()}).parent()}}));