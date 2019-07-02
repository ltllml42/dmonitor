/*
 * jQuery Validation Plugin v1.13.1
 *
 * http://jqueryvalidation.org/
 *
 * Copyright (c) 2014 Jörn Zaefferer
 * Released under the MIT license
 */
(function(A){if(typeof define==="function"&&define.amd){define(["jquery","./jquery.validate"],A)}else{A(jQuery)}}(function(A){(function(){function B(C){return C.replace(/<.[^<>]*?>/g," ").replace(/&nbsp;|&#160;/gi," ").replace(/[.(),;:!?%#$'\"_+=\/\-“”’]*/g,"")}A.validator.addMethod("maxWords",function(D,E,C){return this.optional(E)||B(D).match(/\b\w+\b/g).length<=C},A.validator.format("Please enter {0} words or less."));A.validator.addMethod("minWords",function(D,E,C){return this.optional(E)||B(D).match(/\b\w+\b/g).length>=C},A.validator.format("Please enter at least {0} words."));A.validator.addMethod("rangeWords",function(D,F,C){var G=B(D),E=/\b\w+\b/g;return this.optional(F)||G.match(E).length>=C[0]&&G.match(E).length<=C[1]},A.validator.format("Please enter between {0} and {1} words."))}());A.validator.addMethod("accept",function(C,F,E){var B=typeof E==="string"?E.replace(/\s/g,"").replace(/,/g,"|"):"image/*",D=this.optional(F),H,G;if(D){return D}if(A(F).attr("type")==="file"){B=B.replace(/\*/g,".*");if(F.files&&F.files.length){for(H=0;H<F.files.length;H++){G=F.files[H];if(!G.type.match(new RegExp(".?("+B+")$","i"))){return false}}}}return true},A.validator.format("Please enter a value with a valid mimetype."));A.validator.addMethod("alphanumeric",function(B,C){return this.optional(C)||/^\w+$/i.test(B)},"Letters, numbers, and underscores only please");A.validator.addMethod("bankaccountNL",function(G,D){if(this.optional(D)){return true}if(!(/^[0-9]{9}|([0-9]{2} ){3}[0-9]{3}$/.test(G))){return false}var B=G.replace(/ /g,""),E=0,I=B.length,H,F,C;for(H=0;H<I;H++){F=I-H;C=B.substring(H,H+1);E=E+F*C}return E%11===0},"Please specify a valid bank account number");A.validator.addMethod("bankorgiroaccountNL",function(B,C){return this.optional(C)||(A.validator.methods.bankaccountNL.call(this,B,C))||(A.validator.methods.giroaccountNL.call(this,B,C))},"Please specify a valid bank or giro account number");A.validator.addMethod("bic",function(B,C){return this.optional(C)||/^([A-Z]{6}[A-Z2-9][A-NP-Z1-2])(X{3}|[A-WY-Z0-9][A-Z0-9]{2})?$/.test(B)},"Please specify a valid BIC code");A.validator.addMethod("cifES",function(F){var G=[],D,C,B,I,E,H;F=F.toUpperCase();if(!F.match("((^[A-Z]{1}[0-9]{7}[A-Z0-9]{1}$|^[T]{1}[A-Z0-9]{8}$)|^[0-9]{8}[A-Z]{1}$)")){return false}for(B=0;B<9;B++){G[B]=parseInt(F.charAt(B),10)}C=G[2]+G[4]+G[6];for(I=1;I<8;I+=2){E=(2*G[I]).toString();H=E.charAt(1);C+=parseInt(E.charAt(0),10)+(H===""?0:parseInt(H,10))}if(/^[ABCDEFGHJNPQRSUVW]{1}/.test(F)){C+="";D=10-parseInt(C.charAt(C.length-1),10);F+=D;return(G[8].toString()===String.fromCharCode(64+D)||G[8].toString()===F.charAt(F.length-1))}return false},"Please specify a valid CIF number.");A.validator.addMethod("creditcardtypes",function(B,E,C){if(/[^0-9\-]+/.test(B)){return false}B=B.replace(/\D/g,"");var D=0;if(C.mastercard){D|=1}if(C.visa){D|=2}if(C.amex){D|=4}if(C.dinersclub){D|=8}if(C.enroute){D|=16}if(C.discover){D|=32}if(C.jcb){D|=64}if(C.unknown){D|=128}if(C.all){D=1|2|4|8|16|32|64|128}if(D&1&&/^(5[12345])/.test(B)){return B.length===16}if(D&2&&/^(4)/.test(B)){return B.length===16}if(D&4&&/^(3[47])/.test(B)){return B.length===15}if(D&8&&/^(3(0[012345]|[68]))/.test(B)){return B.length===14}if(D&16&&/^(2(014|149))/.test(B)){return B.length===15}if(D&32&&/^(6011)/.test(B)){return B.length===16}if(D&64&&/^(3)/.test(B)){return B.length===16}if(D&64&&/^(2131|1800)/.test(B)){return B.length===15}if(D&128){return true}return false},"Please enter a valid credit card number.");A.validator.addMethod("currency",function(B,G,D){var C=typeof D==="string",E=C?D:D[0],H=C?true:D[1],F;E=E.replace(/,/g,"");E=H?E+"]":E+"]?";F="^["+E+"([1-9]{1}[0-9]{0,2}(\\,[0-9]{3})*(\\.[0-9]{0,2})?|[1-9]{1}[0-9]{0,}(\\.[0-9]{0,2})?|0(\\.[0-9]{0,2})?|(\\.[0-9]{1,2})?)$";F=new RegExp(F);return this.optional(G)||F.test(B)},"Please specify a valid currency");A.validator.addMethod("dateFA",function(B,C){return this.optional(C)||/^[1-4]\d{3}\/((0?[1-6]\/((3[0-1])|([1-2][0-9])|(0?[1-9])))|((1[0-2]|(0?[7-9]))\/(30|([1-2][0-9])|(0?[1-9]))))$/.test(B)},"Please enter a correct date");A.validator.addMethod("dateITA",function(E,D){var G=false,C=/^\d{1,2}\/\d{1,2}\/\d{4}$/,J,I,B,H,F;if(C.test(E)){J=E.split("/");I=parseInt(J[0],10);B=parseInt(J[1],10);H=parseInt(J[2],10);F=new Date(H,B-1,I,12,0,0,0);if((F.getUTCFullYear()===H)&&(F.getUTCMonth()===B-1)&&(F.getUTCDate()===I)){G=true}else{G=false}}else{G=false}return this.optional(D)||G},"Please enter a correct date");A.validator.addMethod("dateNL",function(B,C){return this.optional(C)||/^(0?[1-9]|[12]\d|3[01])[\.\/\-](0?[1-9]|1[012])[\.\/\-]([12]\d)?(\d\d)$/.test(B)},"Please enter a correct date");A.validator.addMethod("extension",function(B,D,C){C=typeof C==="string"?C.replace(/,/g,"|"):"png|jpe?g|gif";return this.optional(D)||B.match(new RegExp(".("+C+")$","i"))},A.validator.format("Please enter a value with a valid extension."));A.validator.addMethod("giroaccountNL",function(B,C){return this.optional(C)||/^[0-9]{1,7}$/.test(B)},"Please specify a valid giro account number");A.validator.addMethod("iban",function(F,D){if(this.optional(D)){return true}var G=F.replace(/ /g,"").toUpperCase(),I="",P=true,M="",H="",K,Q,O,L,J,C,E,B,N;if(!(/^([a-zA-Z0-9]{4} ){2,8}[a-zA-Z0-9]{1,4}|[a-zA-Z0-9]{12,34}$/.test(G))){return false}K=G.substring(0,2);C={"AL":"\\d{8}[\\dA-Z]{16}","AD":"\\d{8}[\\dA-Z]{12}","AT":"\\d{16}","AZ":"[\\dA-Z]{4}\\d{20}","BE":"\\d{12}","BH":"[A-Z]{4}[\\dA-Z]{14}","BA":"\\d{16}","BR":"\\d{23}[A-Z][\\dA-Z]","BG":"[A-Z]{4}\\d{6}[\\dA-Z]{8}","CR":"\\d{17}","HR":"\\d{17}","CY":"\\d{8}[\\dA-Z]{16}","CZ":"\\d{20}","DK":"\\d{14}","DO":"[A-Z]{4}\\d{20}","EE":"\\d{16}","FO":"\\d{14}","FI":"\\d{14}","FR":"\\d{10}[\\dA-Z]{11}\\d{2}","GE":"[\\dA-Z]{2}\\d{16}","DE":"\\d{18}","GI":"[A-Z]{4}[\\dA-Z]{15}","GR":"\\d{7}[\\dA-Z]{16}","GL":"\\d{14}","GT":"[\\dA-Z]{4}[\\dA-Z]{20}","HU":"\\d{24}","IS":"\\d{22}","IE":"[\\dA-Z]{4}\\d{14}","IL":"\\d{19}","IT":"[A-Z]\\d{10}[\\dA-Z]{12}","KZ":"\\d{3}[\\dA-Z]{13}","KW":"[A-Z]{4}[\\dA-Z]{22}","LV":"[A-Z]{4}[\\dA-Z]{13}","LB":"\\d{4}[\\dA-Z]{20}","LI":"\\d{5}[\\dA-Z]{12}","LT":"\\d{16}","LU":"\\d{3}[\\dA-Z]{13}","MK":"\\d{3}[\\dA-Z]{10}\\d{2}","MT":"[A-Z]{4}\\d{5}[\\dA-Z]{18}","MR":"\\d{23}","MU":"[A-Z]{4}\\d{19}[A-Z]{3}","MC":"\\d{10}[\\dA-Z]{11}\\d{2}","MD":"[\\dA-Z]{2}\\d{18}","ME":"\\d{18}","NL":"[A-Z]{4}\\d{10}","NO":"\\d{11}","PK":"[\\dA-Z]{4}\\d{16}","PS":"[\\dA-Z]{4}\\d{21}","PL":"\\d{24}","PT":"\\d{21}","RO":"[A-Z]{4}[\\dA-Z]{16}","SM":"[A-Z]\\d{10}[\\dA-Z]{12}","SA":"\\d{2}[\\dA-Z]{18}","RS":"\\d{18}","SK":"\\d{20}","SI":"\\d{15}","ES":"\\d{20}","SE":"\\d{20}","CH":"\\d{5}[\\dA-Z]{12}","TN":"\\d{20}","TR":"\\d{5}[\\dA-Z]{17}","AE":"\\d{3}\\d{16}","GB":"[A-Z]{4}\\d{14}","VG":"[\\dA-Z]{4}\\d{16}"};J=C[K];if(typeof J!=="undefined"){E=new RegExp("^[A-Z]{2}\\d{2}"+J+"$","");if(!(E.test(G))){return false}}Q=G.substring(4,G.length)+G.substring(0,4);for(B=0;B<Q.length;B++){O=Q.charAt(B);if(O!=="0"){P=false}if(!P){I+="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(O)}}for(N=0;N<I.length;N++){L=I.charAt(N);H=""+M+""+L;M=H%97}return M===1},"Please specify a valid IBAN");A.validator.addMethod("integer",function(B,C){return this.optional(C)||/^-?\d+$/.test(B)},"A positive or negative non-decimal number please");A.validator.addMethod("ipv4",function(B,C){return this.optional(C)||/^(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)\.(25[0-5]|2[0-4]\d|[01]?\d\d?)$/i.test(B)},"Please enter a valid IP v4 address.");A.validator.addMethod("ipv6",function(B,C){return this.optional(C)||/^((([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){6}:[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){5}:([0-9A-Fa-f]{1,4}:)?[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){4}:([0-9A-Fa-f]{1,4}:){0,2}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){3}:([0-9A-Fa-f]{1,4}:){0,3}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){2}:([0-9A-Fa-f]{1,4}:){0,4}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){6}((\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b)\.){3}(\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b))|(([0-9A-Fa-f]{1,4}:){0,5}:((\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b)\.){3}(\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b))|(::([0-9A-Fa-f]{1,4}:){0,5}((\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b)\.){3}(\b((25[0-5])|(1\d{2})|(2[0-4]\d)|(\d{1,2}))\b))|([0-9A-Fa-f]{1,4}::([0-9A-Fa-f]{1,4}:){0,5}[0-9A-Fa-f]{1,4})|(::([0-9A-Fa-f]{1,4}:){0,6}[0-9A-Fa-f]{1,4})|(([0-9A-Fa-f]{1,4}:){1,7}:))$/i.test(B)},"Please enter a valid IP v6 address.");A.validator.addMethod("lettersonly",function(B,C){return this.optional(C)||/^[a-z]+$/i.test(B)},"Letters only please");A.validator.addMethod("letterswithbasicpunc",function(B,C){return this.optional(C)||/^[a-z\-.,()'"\s]+$/i.test(B)},"Letters or punctuation only please");A.validator.addMethod("mobileNL",function(B,C){return this.optional(C)||/^((\+|00(\s|\s?\-\s?)?)31(\s|\s?\-\s?)?(\(0\)[\-\s]?)?|0)6((\s|\s?\-\s?)?[0-9]){8}$/.test(B)},"Please specify a valid mobile number");A.validator.addMethod("mobileUK",function(B,C){B=B.replace(/\(|\)|\s+|-/g,"");return this.optional(C)||B.length>9&&B.match(/^(?:(?:(?:00\s?|\+)44\s?|0)7(?:[1345789]\d{2}|624)\s?\d{3}\s?\d{3})$/)},"Please specify a valid mobile number");A.validator.addMethod("nieES",function(B){B=B.toUpperCase();if(!B.match("((^[A-Z]{1}[0-9]{7}[A-Z0-9]{1}$|^[T]{1}[A-Z0-9]{8}$)|^[0-9]{8}[A-Z]{1}$)")){return false}if(/^[T]{1}/.test(B)){return(B[8]===/^[T]{1}[A-Z0-9]{8}$/.test(B))}if(/^[XYZ]{1}/.test(B)){return(B[8]==="TRWAGMYFPDXBNJZSQVHLCKE".charAt(B.replace("X","0").replace("Y","1").replace("Z","2").substring(0,8)%23))}return false},"Please specify a valid NIE number.");A.validator.addMethod("nifES",function(B){B=B.toUpperCase();if(!B.match("((^[A-Z]{1}[0-9]{7}[A-Z0-9]{1}$|^[T]{1}[A-Z0-9]{8}$)|^[0-9]{8}[A-Z]{1}$)")){return false}if(/^[0-9]{8}[A-Z]{1}$/.test(B)){return("TRWAGMYFPDXBNJZSQVHLCKE".charAt(B.substring(8,0)%23)===B.charAt(8))}if(/^[KLM]{1}/.test(B)){return(B[8]===String.fromCharCode(64))}return false},"Please specify a valid NIF number.");A.validator.addMethod("nowhitespace",function(B,C){return this.optional(C)||/^\S+$/i.test(B)},"No white space please");A.validator.addMethod("pattern",function(B,D,C){if(this.optional(D)){return true}if(typeof C==="string"){C=new RegExp("^(?:"+C+")$")}return C.test(B)},"Invalid format.");A.validator.addMethod("phoneNL",function(B,C){return this.optional(C)||/^((\+|00(\s|\s?\-\s?)?)31(\s|\s?\-\s?)?(\(0\)[\-\s]?)?|0)[1-9]((\s|\s?\-\s?)?[0-9]){8}$/.test(B)},"Please specify a valid phone number.");A.validator.addMethod("phoneUK",function(B,C){B=B.replace(/\(|\)|\s+|-/g,"");return this.optional(C)||B.length>9&&B.match(/^(?:(?:(?:00\s?|\+)44\s?)|(?:\(?0))(?:\d{2}\)?\s?\d{4}\s?\d{4}|\d{3}\)?\s?\d{3}\s?\d{3,4}|\d{4}\)?\s?(?:\d{5}|\d{3}\s?\d{3})|\d{5}\)?\s?\d{4,5})$/)},"Please specify a valid phone number");A.validator.addMethod("phoneUS",function(B,C){B=B.replace(/\s+/g,"");return this.optional(C)||B.length>9&&B.match(/^(\+?1-?)?(\([2-9]([02-9]\d|1[02-9])\)|[2-9]([02-9]\d|1[02-9]))-?[2-9]([02-9]\d|1[02-9])-?\d{4}$/)},"Please specify a valid phone number");A.validator.addMethod("phonesUK",function(B,C){B=B.replace(/\(|\)|\s+|-/g,"");return this.optional(C)||B.length>9&&B.match(/^(?:(?:(?:00\s?|\+)44\s?|0)(?:1\d{8,9}|[23]\d{9}|7(?:[1345789]\d{8}|624\d{6})))$/)},"Please specify a valid uk phone number");A.validator.addMethod("postalCodeCA",function(B,C){return this.optional(C)||/^[ABCEGHJKLMNPRSTVXY]\d[A-Z] \d[A-Z]\d$/.test(B)},"Please specify a valid postal code");A.validator.addMethod("postalcodeBR",function(B,C){return this.optional(C)||/^\d{2}.\d{3}-\d{3}?$|^\d{5}-?\d{3}?$/.test(B)},"Informe um CEP válido.");A.validator.addMethod("postalcodeIT",function(B,C){return this.optional(C)||/^\d{5}$/.test(B)},"Please specify a valid postal code");A.validator.addMethod("postalcodeNL",function(B,C){return this.optional(C)||/^[1-9][0-9]{3}\s?[a-zA-Z]{2}$/.test(B)},"Please specify a valid postal code");A.validator.addMethod("postcodeUK",function(B,C){return this.optional(C)||/^((([A-PR-UWYZ][0-9])|([A-PR-UWYZ][0-9][0-9])|([A-PR-UWYZ][A-HK-Y][0-9])|([A-PR-UWYZ][A-HK-Y][0-9][0-9])|([A-PR-UWYZ][0-9][A-HJKSTUW])|([A-PR-UWYZ][A-HK-Y][0-9][ABEHMNPRVWXY]))\s?([0-9][ABD-HJLNP-UW-Z]{2})|(GIR)\s?(0AA))$/i.test(B)},"Please specify a valid UK postcode");A.validator.addMethod("require_from_group",function(C,G,H){var D=A(H[1],G.form),B=D.eq(0),F=B.data("valid_req_grp")?B.data("valid_req_grp"):A.extend({},this),E=D.filter(function(){return F.elementValue(this)}).length>=H[0];B.data("valid_req_grp",F);if(!A(G).data("being_validated")){D.data("being_validated",true);D.each(function(){F.element(this)});D.data("being_validated",false)}return E},A.validator.format("Please fill at least {0} of these fields."));A.validator.addMethod("skip_or_fill_minimum",function(E,D,B){var F=A(B[1],D.form),G=F.eq(0),I=G.data("valid_skip")?G.data("valid_skip"):A.extend({},this),C=F.filter(function(){return I.elementValue(this)}).length,H=C===0||C>=B[0];G.data("valid_skip",I);if(!A(D).data("being_validated")){F.data("being_validated",true);F.each(function(){I.element(this)});F.data("being_validated",false)}return H},A.validator.format("Please either skip these fields or fill at least {0} of them."));jQuery.validator.addMethod("stateUS",function(G,E,B){var F=typeof B==="undefined",H=(F||typeof B.caseSensitive==="undefined")?false:B.caseSensitive,C=(F||typeof B.includeTerritories==="undefined")?false:B.includeTerritories,D=(F||typeof B.includeMilitary==="undefined")?false:B.includeMilitary,I;if(!C&&!D){I="^(A[KLRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|PA|RI|S[CD]|T[NX]|UT|V[AT]|W[AIVY])$"}else{if(C&&D){I="^(A[AEKLPRSZ]|C[AOT]|D[CE]|FL|G[AU]|HI|I[ADLN]|K[SY]|LA|M[ADEINOPST]|N[CDEHJMVY]|O[HKR]|P[AR]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY])$"}else{if(C){I="^(A[KLRSZ]|C[AOT]|D[CE]|FL|G[AU]|HI|I[ADLN]|K[SY]|LA|M[ADEINOPST]|N[CDEHJMVY]|O[HKR]|P[AR]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY])$"}else{I="^(A[AEKLPRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|PA|RI|S[CD]|T[NX]|UT|V[AT]|W[AIVY])$"}}}I=H?new RegExp(I):new RegExp(I,"i");return this.optional(E)||I.test(G)},"Please specify a valid state");A.validator.addMethod("strippedminlength",function(B,D,C){return A(B).text().length>=C},A.validator.format("Please enter at least {0} characters"));A.validator.addMethod("time",function(B,C){return this.optional(C)||/^([01]\d|2[0-3])(:[0-5]\d){1,2}$/.test(B)},"Please enter a valid time, between 00:00 and 23:59");A.validator.addMethod("time12h",function(B,C){return this.optional(C)||/^((0?[1-9]|1[012])(:[0-5]\d){1,2}(\ ?[AP]M))$/i.test(B)},"Please enter a valid time in 12-hour am/pm format");A.validator.addMethod("url2",function(B,C){return this.optional(C)||/^(https?|ftp):\/\/(((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:)*@)?(((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5]))|((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)*(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?)(:\d*)?)(\/((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)+(\/(([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)*)*)?)?(\?((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|[\uE000-\uF8FF]|\/|\?)*)?(#((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|\/|\?)*)?$/i.test(B)},A.validator.messages.url);A.validator.addMethod("vinUS",function(J){if(J.length!==17){return false}var D=["A","B","C","D","E","F","G","H","J","K","L","M","N","P","R","S","T","U","V","W","X","Y","Z"],L=[1,2,3,4,5,6,7,8,1,2,3,4,5,7,9,2,3,4,5,6,7,8,9],I=[8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2],C=0,B,E,H,G,K,F;for(B=0;B<17;B++){G=I[B];H=J.slice(B,B+1);if(B===8){F=H}if(!isNaN(H)){H*=G}else{for(E=0;E<D.length;E++){if(H.toUpperCase()===D[E]){H=L[E];H*=G;if(isNaN(F)&&E===8){F=D[E]}break}}}C+=H}K=C%11;if(K===10){K="X"}if(K===F){return true}return false},"The specified vehicle identification number (VIN) is invalid.");A.validator.addMethod("zipcodeUS",function(B,C){return this.optional(C)||/^\d{5}(-\d{4})?$/.test(B)},"The specified US ZIP Code is invalid");A.validator.addMethod("ziprange",function(B,C){return this.optional(C)||/^90[2-5]\d\{2\}-\d{4}$/.test(B)},"Your ZIP-code must be in the range 902xx-xxxx to 905xx-xxxx")}));