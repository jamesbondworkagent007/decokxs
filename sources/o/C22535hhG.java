package o;

import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22535hhG extends C22384heO implements InterfaceC22533hhE {
    public final C23237huT DbNXlk;
    public final C23232huO fetchVPNInfo;
    public final C23230huM values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22535hhG(@NotNull C23237huT c23237huT, @NotNull C23230huM c23230huM, @NotNull C23232huO c23232huO) {
        super(c23237huT, c23230huM);
        Intrinsics.checkNotNullParameter(c23237huT, "");
        Intrinsics.checkNotNullParameter(c23230huM, "");
        Intrinsics.checkNotNullParameter(c23232huO, "");
        this.DbNXlk = c23237huT;
        this.values = c23230huM;
        this.fetchVPNInfo = c23232huO;
    }

    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> KWHzl(@NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO) {
        Intrinsics.checkNotNullParameter(dexMarketCheckCoinDetailVO, "");
        return this.fetchVPNInfo.EZpvd(dexMarketCheckCoinDetailVO);
    }

    public static final LatestMarketInfoBean QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LatestMarketInfoBean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<LatestMarketInfoBean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> abstractC58185ywXCopydefault = this.fetchVPNInfo.copydefault(str, str2, str3, str4);
        final Function1 function1 = new Function1() { // from class: o.hhC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.AkhnZx((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.QKVWgx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final SupportSwapData ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SupportSwapData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.main.market.bean.SupportSwapData> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<SupportSwapData> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<SupportSwapData>> abstractC58185ywXCopydefault = this.fetchVPNInfo.copydefault(str, str2);
        final Function1 function1 = new Function1() { // from class: o.hhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.fJNWhG((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.ORxRYg(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final CompositeInfoBean AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CompositeInfoBean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<CompositeInfoBean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<CompositeInfoBean>> abstractC58185ywXKWHzl = this.fetchVPNInfo.KWHzl(str, str2);
        final Function1 function1 = new Function1() { // from class: o.hhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.isConnected((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.AwvSrB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.dexlogic.main.market.bean.CandlesticksBean>> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> abstractC58185ywXAEQbTJ = this.fetchVPNInfo.AEQbTJ(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.hhO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.values((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.OcIXYQ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    /* JADX DEBUG: Type inference failed for r9v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.market.data.model.MarketBuySellKLinePoint>> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> abstractC58185ywXCopydefault = this.fetchVPNInfo.copydefault(str, str2, str3, str4, i, str5);
        final Function1 function1 = new Function1() { // from class: o.hhL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.DbNXlk((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.DTwDnp(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.dexlogic.main.market.bean.CandlesticksBean>> */
    @Override // o.InterfaceC22533hhE
    public AbstractC58185ywX<java.util.List<CandlesticksBean>> AEQbTJ(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> abstractC58185ywXOLrzqt = this.fetchVPNInfo.OLrzqt(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.hhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22535hhG.fetchVPNInfo((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22535hhG.QOLQEE(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final LatestMarketInfoBean AkhnZx(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (LatestMarketInfoBean) data;
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final SupportSwapData fJNWhG(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (SupportSwapData) data;
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final CompositeInfoBean isConnected(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (CompositeInfoBean) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List values(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C21950hSi c21950hSi = C21950hSi.OLrzqt;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return c21950hSi.KWHzl((java.util.List) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List DbNXlk(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (java.util.List) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List fetchVPNInfo(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C21950hSi c21950hSi = C21950hSi.OLrzqt;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return c21950hSi.KWHzl((java.util.List) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
