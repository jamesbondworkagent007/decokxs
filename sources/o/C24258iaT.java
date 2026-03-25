package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dexlogic.bean.CloseAccountBean;
import com.okinc.business.dexlogic.bean.CloseInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ExtendOrderBroadcast;
import com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24258iaT {
    public static /* synthetic */ AbstractC58185ywX getCloseAccountQuery$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return EZpvd(str, str2, str3, z);
    }

    public static final AbstractC58185ywX<ResponseData<C24256iaR>> EZpvd(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<CloseAccountBean>> abstractC58185ywXAEQbTJ = C22380heK.OLrzqt.copydefault(str).DbNXlk().AEQbTJ(str2, str3);
        final Function1 function1 = new Function1() { // from class: o.iaW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24258iaT.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.iba
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C24258iaT.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.iaX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24258iaT.OLrzqt(str, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.iaY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C24258iaT.AhwBna(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.iaZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24258iaT.KWHzl((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<ResponseData<C24256iaR>> abstractC58185ywXAEQbTJ3 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ibe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C24258iaT.valueOf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        return abstractC58185ywXAEQbTJ3;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 8005) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, responseData);
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final java.lang.String str, final boolean z, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(str).fARcdN().OLrzqt().EZpvd();
            final Function1 function1 = new Function1() { // from class: o.ibb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24258iaT.copydefault(pair, str, z, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ibf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C24258iaT.djBIcL(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(pair.getSecond(), null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair, java.lang.String str, boolean z, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        java.lang.String tokenSymbol3;
        java.lang.String tokenSymbol4;
        kotlin.Pair pairOLrzqt;
        java.lang.String tokenSymbol5;
        java.lang.String tokenSymbol6;
        java.lang.String currencyAmount;
        java.lang.String amount;
        java.lang.String chainName;
        java.lang.String tokenLogoUrl;
        java.lang.String chainLogoUrl;
        java.lang.String tokenSymbol7;
        java.lang.String currencyAmount2;
        java.lang.String amount2;
        java.lang.String chainName2;
        java.lang.String tokenLogoUrl2;
        java.lang.String chainLogoUrl2;
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        CloseAccountBean closeAccountBean = (CloseAccountBean) ((ResponseData) pair.getSecond()).getData();
        if (closeAccountBean == null) {
            return null;
        }
        java.lang.String orderId = closeAccountBean.getOrderId();
        java.lang.String chainId = closeAccountBean.getChainId();
        CloseInfo closeInfo = closeAccountBean.getCloseInfo();
        java.lang.String unsignedTx = closeAccountBean.getCloseCallData().getUnsignedTx();
        DexMultiTokenInfoBean fromToken = closeInfo.getFromToken();
        DexMultiTokenInfoBean toToken = closeInfo.getToToken();
        if (fromToken == null || (tokenSymbol = fromToken.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, closeInfo.getPrice(), false, null, false, false, 30, null);
        if (toToken == null || (tokenSymbol2 = toToken.getTokenSymbol()) == null) {
            tokenSymbol2 = "";
        }
        C54845xXl c54845xXl = new C54845xXl("1", tokenSymbol, showData$default, tokenSymbol2);
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(str).fARcdN().KWHzl(false, c54845xXl);
        InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str).fARcdN();
        if (toToken == null || (tokenSymbol3 = toToken.getTokenSymbol()) == null) {
            tokenSymbol3 = "";
        }
        java.lang.String showData$default2 = C23271hvA.getShowData$default(c23271hvA, C23313hvq.divCheckS$default(1, closeInfo.getPrice(), null, null, null, 14, null), false, null, false, false, 30, null);
        if (fromToken == null || (tokenSymbol4 = fromToken.getTokenSymbol()) == null) {
            tokenSymbol4 = "";
        }
        interfaceC23194htdFARcdN.KWHzl(true, new C54845xXl("1", tokenSymbol3, showData$default2, tokenSymbol4));
        c22380heK.copydefault(str).fARcdN().copydefault(new C54848xXo(new C54849xXp((fromToken == null || (chainLogoUrl2 = fromToken.getChainLogoUrl()) == null) ? "" : chainLogoUrl2, (fromToken == null || (tokenLogoUrl2 = fromToken.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl2, (fromToken == null || (chainName2 = fromToken.getChainName()) == null) ? "" : chainName2, (fromToken == null || (tokenSymbol7 = fromToken.getTokenSymbol()) == null) ? "" : tokenSymbol7, (fromToken == null || (amount2 = fromToken.getAmount()) == null) ? "" : amount2, (fromToken == null || (currencyAmount2 = fromToken.getCurrencyAmount()) == null) ? "" : currencyAmount2, "", ""), new C54849xXp((toToken == null || (chainLogoUrl = toToken.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (toToken == null || (tokenLogoUrl = toToken.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (toToken == null || (chainName = toToken.getChainName()) == null) ? "" : chainName, (toToken == null || (tokenSymbol6 = toToken.getTokenSymbol()) == null) ? "" : tokenSymbol6, (toToken == null || (amount = toToken.getAmount()) == null) ? "" : amount, (toToken == null || (currencyAmount = toToken.getCurrencyAmount()) == null) ? "" : currencyAmount, "", ""), c54845xXl, false, closeAccountBean.getCloseInfo().getMinimumReceived(), (toToken == null || (tokenSymbol5 = toToken.getTokenSymbol()) == null) ? "" : tokenSymbol5, "", false, 3, false, unsignedTx, "", str, null, null, "", 24576, null));
        if (z) {
            pairOLrzqt = C56390yDp.OLrzqt(pair.getSecond(), null);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(pair.getSecond(), new C24259iaU(interfaceC9738bbJ.DbNXlk(), new PlatformItem(C33129mqd.valueOf(closeInfo.getDefiPlatformInfo().getId()), closeInfo.getDefiPlatformInfo().getDefiPlatformName(), closeInfo.getDefiPlatformInfo().getLogoUrl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16376, (DefaultConstructorMarker) null), unsignedTx, orderId, chainId));
        }
        return pairOLrzqt;
    }

    public static final ResponseData valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ResponseData responseData = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = ((ResponseData) pair.getFirst()).getCode();
        C24256iaR c24256iaR = new C24256iaR(java.lang.String.valueOf(((ResponseData) pair.getFirst()).getData()), (C24259iaU) pair.getSecond());
        return ResponseData.copy$default(responseData, code, ((ResponseData) pair.getFirst()).getMsg(), null, ((ResponseData) pair.getFirst()).getErrorMsg(), c24256iaR, null, 36, null);
    }

    /* JADX DEBUG: Type inference failed for r11v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public static final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull JsonObject jsonObject, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(map, "");
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = EZpvd(jsonObject);
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault(str).DbNXlk().OLrzqt(map, new ExtendOrderBroadcast(str3, new UpdateMultiOrderInfo(str3, pairEZpvd.getSecond(), pairEZpvd.getFirst(), null, null, 24, null), null, 4, null));
        final Function1 function1 = new Function1() { // from class: o.ibd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24258iaT.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ibc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C24258iaT.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ResponseData copydefault(ResponseData responseData) {
        java.lang.String str;
        java.util.Map map;
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(responseData, "");
        try {
            java.lang.Object data = responseData.getData();
            java.util.Map map2 = data instanceof java.util.Map ? (java.util.Map) data : null;
            java.lang.Object obj2 = map2 != null ? map2.get("broadcastResult") : null;
            java.util.Map map3 = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
            java.lang.Object obj3 = map3 != null ? map3.get("data") : null;
            map = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
        } catch (java.lang.Exception unused) {
        }
        if (map == null || (obj = map.get("txId")) == null) {
            str = "";
        } else {
            java.lang.String string = obj.toString();
            if (string != null) {
                str = string;
            }
        }
        return ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), responseData.getCode(), responseData.getMsg(), null, null, str, null, 44, null);
    }

    public static final kotlin.Pair<JsonObject, java.lang.String> EZpvd(@NotNull JsonObject jsonObject) {
        java.lang.String asString = "";
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
        } catch (java.lang.Exception e) {
            C23310hvn.e$default(C23310hvn.copydefault, "closeMultiOrder", C43296rmc.copydefault(e), null, 4, null);
        }
        return C56390yDp.OLrzqt(asJsonObject, asString);
    }

    public static final C24260iaV copydefault(@NotNull JsonObject jsonObject) {
        java.lang.String asString;
        java.lang.String asString2 = "";
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonObject asJsonObject = null;
        try {
            asJsonObject = jsonObject.getAsJsonObject("walletTxData");
            asString = jsonObject.get("transactionHash").getAsString();
            try {
                asString2 = jsonObject.get("nonce").getAsString();
            } catch (java.lang.Exception e) {
                e = e;
                C23310hvn.e$default(C23310hvn.copydefault, "closeMultiOrder", C43296rmc.copydefault(e), null, 4, null);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            asString = "";
        }
        return new C24260iaV(asJsonObject, asString, asString2);
    }
}
