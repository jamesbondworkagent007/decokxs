package o;

import com.okinc.business.defi.biz.core.customchain.rpc.CustomChainTransactionReceipt;
import com.okinc.business.defi.biz.rpc.RpcException;
import com.okinc.business.defi.biz.rpc.RpcRequestBody;
import com.okinc.business.defi.biz.rpc.RpcRequestResponse;
import com.okinc.wallet.core.other.CallDataParams;
import com.okinc.wallet.core.other.TokenContractFunctionType;
import com.okinc.wallet.core.other.TokenType;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.btz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10734btz {
    public static final C10734btz KWHzl = new C10734btz();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.btJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10734btz.OLrzqt();
        }
    });
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String iwGUEr(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    private C10734btz() {
    }

    public static final InterfaceC13906dbS OLrzqt() {
        return InterfaceC13906dbS.Companion.EZpvd();
    }

    public final InterfaceC13906dbS KWHzl() {
        return (InterfaceC13906dbS) OLrzqt.getValue();
    }

    public static final long values(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(C33491mxU.OLrzqt(str));
        if (fieldNames != null) {
            return fieldNames.longValue();
        }
        return 0L;
    }

    public static final java.lang.String fJNWhG(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public static final java.lang.String AuCTel(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public static /* synthetic */ AbstractC58260yxt getGasLimit$default(C10734btz c10734btz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return c10734btz.copydefault(str, str2, str3, str4, str5);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "from", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "to", str2);
        JsonElementBuildersKt.put(jsonObjectBuilder, "data", str3);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "value", str4);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String fIwbmz(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public static final CustomChainTransactionReceipt AEQbTJ(CustomChainTransactionReceipt customChainTransactionReceipt) {
        Intrinsics.checkNotNullParameter(customChainTransactionReceipt, "");
        java.lang.String blockHash = customChainTransactionReceipt.getBlockHash();
        java.lang.String status = customChainTransactionReceipt.getStatus();
        java.lang.String strOLrzqt = status != null ? C33491mxU.OLrzqt(status) : null;
        java.lang.String gasUsed = customChainTransactionReceipt.getGasUsed();
        return new CustomChainTransactionReceipt(blockHash, strOLrzqt, gasUsed != null ? C33491mxU.OLrzqt(gasUsed) : null);
    }

    public static final java.lang.String OLrzqt(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = (JsonElement) jsonObject.get("timestamp");
        java.lang.String strOLrzqt = C33491mxU.OLrzqt(java.lang.String.valueOf((jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive)));
        return (strOLrzqt == null || strOLrzqt.length() == 0) ? "0" : strOLrzqt;
    }

    public static final java.lang.String AkhnZx(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public static final boolean isConnected(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !C59449zhJ.gEmmrt(str, EIP1271Verifier.hexPrefix, true);
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TokenContractFunctionType tokenContractFunctionType = TokenContractFunctionType.TypeBalanceOf;
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        Unit unit = Unit.INSTANCE;
        return AEQbTJ(str, str3, xYW.AEQbTJ.KWHzl(KWHzl(tokenContractFunctionType, jsonArrayBuilder.build().toString())), new Function1() { // from class: o.btI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.ejfBZ((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String ejfBZ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public final AbstractC58260yxt<java.lang.String> gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return AEQbTJ(str, str2, xYW.AEQbTJ.KWHzl(createERC20CallDataParams$default(this, TokenContractFunctionType.TypeSymbol, null, 2, null)), new Function1() { // from class: o.btS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.hDKMBd((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String hDKMBd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.copydefault(KWHzl.KWHzl(TokenContractFunctionType.TypeSymbol, str));
    }

    public final AbstractC58260yxt<java.lang.String> AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return AEQbTJ(str, str2, xYW.AEQbTJ.KWHzl(createERC20CallDataParams$default(this, TokenContractFunctionType.TypeName, null, 2, null)), new Function1() { // from class: o.btD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.getFieldNames((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String getFieldNames(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.copydefault(KWHzl.KWHzl(TokenContractFunctionType.TypeName, str));
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return AEQbTJ(str, str2, xYW.AEQbTJ.KWHzl(createERC20CallDataParams$default(this, TokenContractFunctionType.TypeDecimals, null, 2, null)), new Function1() { // from class: o.btU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.fARcdN((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String fARcdN(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public final AbstractC58260yxt<java.lang.String> valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return AEQbTJ(str, str2, xYW.AEQbTJ.KWHzl(createERC20CallDataParams$default(this, TokenContractFunctionType.TypeTotalSupply, null, 2, null)), new Function1() { // from class: o.btF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.getNewProxyInstance((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String getNewProxyInstance(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33491mxU.OLrzqt(str);
    }

    public static /* synthetic */ CallDataParams createERC20CallDataParams$default(C10734btz c10734btz, TokenContractFunctionType tokenContractFunctionType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c10734btz.KWHzl(tokenContractFunctionType, str);
    }

    public final CallDataParams KWHzl(TokenContractFunctionType tokenContractFunctionType, java.lang.String str) {
        return new CallDataParams(-2000L, TokenType.TypeERC20.ordinal(), tokenContractFunctionType.ordinal(), str);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, JsonObjectBuilder jsonObjectBuilder) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, "to", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "data", str2);
        return Unit.INSTANCE;
    }

    public static final java.lang.String KWHzl(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.String) function1.invoke(str);
    }

    public static final java.lang.Object AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public final <T, R> AbstractC58260yxt<R> AEQbTJ(final java.lang.String str, final RpcRequestBody rpcRequestBody, final DeserializationStrategy<? extends T> deserializationStrategy, final Function1<? super T, ? extends R> function1) {
        AbstractC58260yxt<RpcRequestResponse> abstractC58260yxtOLrzqt = KWHzl().OLrzqt(str, rpcRequestBody);
        final Function1 function12 = new Function1() { // from class: o.bty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.EZpvd(str, rpcRequestBody, deserializationStrategy, function1, (RpcRequestResponse) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.btB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10734btz.AEQbTJ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.btP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.AEQbTJ(str, rpcRequestBody, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58227yxM() { // from class: o.btR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10734btz.EZpvd(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.lang.Object EZpvd(java.lang.String str, RpcRequestBody rpcRequestBody, DeserializationStrategy deserializationStrategy, Function1 function1, RpcRequestResponse rpcRequestResponse) throws RpcException {
        Intrinsics.checkNotNullParameter(rpcRequestResponse, "");
        pUU.KWHzl("CustomChainRpcManager", "request success, rpcUrl: " + str + ", requestBody: " + rpcRequestBody + ", response: " + rpcRequestResponse);
        if (rpcRequestResponse.getError() == null) {
            return function1.invoke(C33489mxS.KWHzl.AEQbTJ().decodeFromString(deserializationStrategy, java.lang.String.valueOf(rpcRequestResponse.getResult())));
        }
        throw new RpcException(rpcRequestResponse.getError().getMessage());
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, RpcRequestBody rpcRequestBody, java.lang.Throwable th) {
        if (!(th instanceof RpcException)) {
            pUU.copydefault("CustomChainRpcManager", "request failed, rpcUrl: " + str + ", requestBody: " + rpcRequestBody + ", errorMsg: " + th.getLocalizedMessage());
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.lang.Long> uzCIH(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_chainId", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C10734btz.values((java.lang.String) obj));
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        JsonElementBuildersKt.add(jsonArrayBuilder, "latest");
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_getTransactionCount", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.fJNWhG((java.lang.String) obj);
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.String> AuCTelauCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_gasPrice", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.AuCTel((java.lang.String) obj);
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.addJsonObject(jsonArrayBuilder, new Function1() { // from class: o.btL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.EZpvd(str2, str3, str4, str5, (JsonObjectBuilder) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_estimateGas", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.fIwbmz((java.lang.String) obj);
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.String> djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_sendRawTransaction", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.iwGUEr((java.lang.String) obj);
            }
        }));
    }

    public final AbstractC58260yxt<CustomChainTransactionReceipt> AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        Unit unit = Unit.INSTANCE;
        java.lang.String str3 = null;
        AbstractC58260yxt abstractC58260yxtEZpvd = AEQbTJ(str, new RpcRequestBody(str3, "eth_getTransactionReceipt", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), CustomChainTransactionReceipt.Companion.serializer(), new Function1() { // from class: o.btQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.AEQbTJ((CustomChainTransactionReceipt) obj);
            }
        }).EZpvd(new CustomChainTransactionReceipt((java.lang.String) null, str3, (java.lang.String) null, 7, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtEZpvd, "");
        return C11607cUn.valueOf(abstractC58260yxtEZpvd);
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        JsonElementBuildersKt.add(jsonArrayBuilder, java.lang.Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        AbstractC58260yxt abstractC58260yxtEZpvd = AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_getBlockByHash", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), JsonObject.Companion.serializer(), new Function1() { // from class: o.btW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.OLrzqt((JsonObject) obj);
            }
        }).EZpvd("0");
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtEZpvd, "");
        return C11607cUn.valueOf(abstractC58260yxtEZpvd);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        JsonElementBuildersKt.add(jsonArrayBuilder, "latest");
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_getBalance", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.AkhnZx((java.lang.String) obj);
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, str2);
        JsonElementBuildersKt.add(jsonArrayBuilder, "latest");
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, "eth_getCode", jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10734btz.isConnected((java.lang.String) obj));
            }
        }));
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(java.lang.String str, final java.lang.String str2, final java.lang.String str3, final Function1<? super java.lang.String, java.lang.String> function1) {
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.addJsonObject(jsonArrayBuilder, new Function1() { // from class: o.btH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.EZpvd(str2, str3, (JsonObjectBuilder) obj);
            }
        });
        JsonElementBuildersKt.add(jsonArrayBuilder, "latest");
        Unit unit = Unit.INSTANCE;
        return C11607cUn.valueOf(AEQbTJ(str, new RpcRequestBody((java.lang.String) null, EIP1271Verifier.method, jsonArrayBuilder.build(), 0, 9, (DefaultConstructorMarker) null), BuiltinSerializersKt.serializer(C56529yIt.KWHzl), new Function1() { // from class: o.btG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10734btz.KWHzl(function1, (java.lang.String) obj);
            }
        }));
    }
}
