package o;

import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32116mQb implements InterfaceC32117mQc {
    public final C32165mRx EZpvd;

    public C32116mQb(@NotNull C32165mRx c32165mRx) {
        Intrinsics.checkNotNullParameter(c32165mRx, "");
        this.EZpvd = c32165mRx;
    }

    public static final LatestMarketInfoBean gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (LatestMarketInfoBean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean> */
    @Override // o.InterfaceC32117mQc
    public AbstractC58185ywX<LatestMarketInfoBean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> abstractC58185ywXCopydefault = this.EZpvd.copydefault(str, str2, str3, str4);
        final Function1 function1 = new Function1() { // from class: o.mQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32116mQb.valueOf((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32116mQb.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final SupportSwapData AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SupportSwapData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData> */
    @Override // o.InterfaceC32117mQc
    public AbstractC58185ywX<SupportSwapData> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<SupportSwapData>> abstractC58185ywXOLrzqt = this.EZpvd.OLrzqt(str, str2);
        final Function1 function1 = new Function1() { // from class: o.mQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32116mQb.djBIcL((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32116mQb.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean>> */
    @Override // o.InterfaceC32117mQc
    public AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> abstractC58185ywXCopydefault = this.EZpvd.copydefault(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.mQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32116mQb.gEmmrt((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32116mQb.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Type inference failed for r9v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint>> */
    @Override // o.InterfaceC32117mQc
    public AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> abstractC58185ywXEZpvd = this.EZpvd.EZpvd(str, str2, str3, str4, i, str5);
        final Function1 function1 = new Function1() { // from class: o.mQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32116mQb.AYXKKw((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32116mQb.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean>> */
    @Override // o.InterfaceC32117mQc
    public AbstractC58185ywX<java.util.List<CandlesticksBean>> KWHzl(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> abstractC58185ywXAEQbTJ = this.EZpvd.AEQbTJ(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.mQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32116mQb.AhwBna((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32116mQb.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final LatestMarketInfoBean valueOf(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (LatestMarketInfoBean) data;
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final SupportSwapData djBIcL(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (SupportSwapData) data;
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List gEmmrt(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            mTT mtt = mTT.EZpvd;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return mtt.OLrzqt((java.util.List<? extends java.util.List<java.lang.String>>) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List AYXKKw(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (java.util.List) responseData.getData();
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final java.util.List AhwBna(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            mTT mtt = mTT.EZpvd;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return mtt.OLrzqt((java.util.List<? extends java.util.List<java.lang.String>>) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
