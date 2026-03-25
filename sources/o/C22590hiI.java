package o;

import com.github.mikephil.charting.data.Entry;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.CandleResultInfo;
import com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22590hiI extends AbstractC33073mpa {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hiJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C22590hiI.copydefault();
        }
    });
    public java.lang.String OLrzqt = "";

    private final android.graphics.Paint KWHzl() {
        return (android.graphics.Paint) this.AEQbTJ.getValue();
    }

    public static final android.graphics.Paint copydefault() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(12.0f);
        return paint;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Triple<com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView$KlineState, com.okinc.business.dexlogic.bean.CandleResultBean, kotlin.Triple<java.util.ArrayList<com.github.mikephil.charting.data.Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> */
    public final AbstractC58185ywX<Triple<KLineSimpleView.KlineState, CandleResultBean, Triple<java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58185ywX<CandleResultBean> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(str).isConnected().EZpvd(str2, str3, str4);
        final Function1 function1 = new Function1() { // from class: o.hiM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22590hiI.OLrzqt(this.EZpvd, (CandleResultBean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.hiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22590hiI.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C22590hiI c22590hiI, CandleResultBean candleResultBean) {
        Intrinsics.checkNotNullParameter(candleResultBean, "");
        return c22590hiI.copydefault(candleResultBean);
    }

    /* JADX DEBUG: Type inference failed for r8v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Triple<com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView$KlineState, com.okinc.business.dexlogic.bean.CandleResultBean, kotlin.Triple<java.util.ArrayList<com.github.mikephil.charting.data.Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> */
    public final AbstractC58185ywX<Triple<KLineSimpleView.KlineState, CandleResultBean, Triple<java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        AbstractC58185ywX<CandleResultBean> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault(str).isConnected().OLrzqt(str2, str3, str4, str5, str6);
        final Function1 function1 = new Function1() { // from class: o.hiF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22590hiI.EZpvd(this.KWHzl, (CandleResultBean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.hiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22590hiI.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C22590hiI c22590hiI, CandleResultBean candleResultBean) {
        Intrinsics.checkNotNullParameter(candleResultBean, "");
        return c22590hiI.copydefault(candleResultBean);
    }

    public final AbstractC58185ywX<Triple<KLineSimpleView.KlineState, CandleResultBean, Triple<java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> copydefault(final CandleResultBean candleResultBean) {
        return C23220huC.OLrzqt(new InterfaceC58187ywZ() { // from class: o.hiH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22590hiI.copydefault(candleResultBean, this, interfaceC58184ywW);
            }
        });
    }

    public static final void copydefault(CandleResultBean candleResultBean, C22590hiI c22590hiI, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (candleResultBean.getResults().isEmpty()) {
            if (candleResultBean.getSuccess()) {
                interfaceC58184ywW.onNext(new Triple(KLineSimpleView.KlineState.EMPTY, candleResultBean, null));
                return;
            } else {
                interfaceC58184ywW.onNext(new Triple(KLineSimpleView.KlineState.FAIL, candleResultBean, null));
                return;
            }
        }
        c22590hiI.OLrzqt = candleResultBean.getLatestPrice();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iDjBIcL = C33570myu.djBIcL(C32979mnm.EZpvd.OLrzqt());
        java.lang.String maxPrice = candleResultBean.getMaxPrice();
        if (maxPrice.length() == 0) {
            maxPrice = "";
        }
        java.lang.String minPrice = candleResultBean.getMinPrice();
        java.lang.String str = minPrice.length() != 0 ? minPrice : "";
        float fAEQbTJ = C23313hvq.AEQbTJ(C23313hvq.divCheckS$default(C23313hvq.divCheckS$default(java.lang.Integer.valueOf(c22590hiI.AEQbTJ(maxPrice)), 2, null, null, null, 14, null), C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(iDjBIcL), 100, null, null, null, 14, null), null, null, null, 14, null));
        float fAEQbTJ2 = C23313hvq.AEQbTJ(C23313hvq.divCheckS$default(C23313hvq.divCheckS$default(java.lang.Integer.valueOf(c22590hiI.AEQbTJ(str)), 2, null, null, null, 14, null), C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(iDjBIcL), 100, null, null, null, 14, null), null, null, null, 14, null));
        int i = 0;
        float fMin = 0.0f;
        float fMin2 = 0.0f;
        for (java.lang.Object obj : candleResultBean.getResults()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CandleResultInfo candleResultInfo = (CandleResultInfo) obj;
            if (Intrinsics.EZpvd((java.lang.Object) candleResultInfo.getPrice(), (java.lang.Object) candleResultBean.getMaxPrice())) {
                float fAEQbTJ3 = C23313hvq.AEQbTJ(C23313hvq.divCheckS$default(C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(i), 100, null, null, null, 14, null), java.lang.Integer.valueOf(candleResultBean.getResults().size()), null, null, null, 14, null));
                fMin = fAEQbTJ3 < fAEQbTJ ? 0.0f : java.lang.Math.min(C23313hvq.AEQbTJ(C23313hvq.addCheckS$default(java.lang.Float.valueOf(fAEQbTJ3), java.lang.Float.valueOf(fAEQbTJ), null, null, null, 14, null)), 100.0f);
            }
            if (Intrinsics.EZpvd((java.lang.Object) candleResultInfo.getPrice(), (java.lang.Object) candleResultBean.getMinPrice())) {
                float fAEQbTJ4 = C23313hvq.AEQbTJ(C23313hvq.divCheckS$default(C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(i), 100, null, null, null, 14, null), java.lang.Integer.valueOf(candleResultBean.getResults().size()), null, null, null, 14, null));
                fMin2 = fAEQbTJ4 < fAEQbTJ2 ? 0.0f : java.lang.Math.min(C23313hvq.AEQbTJ(C23313hvq.addCheckS$default(java.lang.Float.valueOf(fAEQbTJ4), java.lang.Float.valueOf(fAEQbTJ2), null, null, null, 14, null)), 100.0f);
            }
            arrayList.add(new Entry(C33129mqd.djBIcL(C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(i), 1, null, null, null, 14, null)), C33129mqd.djBIcL(candleResultInfo.getPrice()), candleResultInfo));
            i++;
        }
        interfaceC58184ywW.onNext(new Triple(KLineSimpleView.KlineState.SUCCESS, candleResultBean, new Triple(arrayList, C56390yDp.OLrzqt(java.lang.Float.valueOf(fMin), java.lang.Float.valueOf(fMin2)), C56390yDp.OLrzqt(maxPrice, str))));
    }

    private final int AEQbTJ(java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        KWHzl().getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }
}
