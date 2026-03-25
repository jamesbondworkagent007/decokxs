package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.nft.nftmarket.NFTApiService;
import com.okinc.nft.ui.kline.bean.CandlesticksBean;
import com.okinc.nft.ui.kline.bean.TokenCandleParam;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43606rsU {
    public static final C43606rsU EZpvd = new C43606rsU();

    private C43606rsU() {
    }

    public final AbstractC58185ywX<java.util.List<C35965oKg>> KWHzl(@NotNull TokenCandleParam tokenCandleParam, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(tokenCandleParam, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String strSubstring = tokenCandleParam.getBar().substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        tokenCandleParam.setBar(strSubstring);
        tokenCandleParam.setLimit("1440");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(OLrzqt(tokenCandleParam), lifecycleOwner, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.rsT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43606rsU.AEQbTJ((java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C35965oKg>> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43606rsU.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C43599rsN.copydefault.copydefault((java.util.List<CandlesticksBean>) list);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.nft.ui.kline.bean.CandlesticksBean>> */
    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(@NotNull TokenCandleParam tokenCandleParam) {
        Intrinsics.checkNotNullParameter(tokenCandleParam, "");
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> abstractC58185ywXEZpvd = EZpvd(tokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.rsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43606rsU.OLrzqt((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43606rsU.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> EZpvd(TokenCandleParam tokenCandleParam) {
        return NFTApiService.Companion.copydefault(C43526rqu.AEQbTJ).getHistoryTokenCandles(tokenCandleParam.getChainId(), tokenCandleParam.getAddress(), tokenCandleParam.getAfter(), tokenCandleParam.getBefore(), tokenCandleParam.getBar(), tokenCandleParam.getLimit());
    }

    public static final java.util.List OLrzqt(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C43599rsN c43599rsN = C43599rsN.copydefault;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return c43599rsN.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
