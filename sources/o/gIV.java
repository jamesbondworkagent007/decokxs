package o;

import androidx.lifecycle.MutableLiveData;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurvePrice;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.wallet.ui.kline.viewmodel.InitError;
import com.okinc.business.defi.wallet.ui.kline.viewmodel.NoDataError;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gIV extends AbstractC33073mpa {
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.gIR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gIV.OLrzqt();
        }
    });
    public MutableLiveData<NewCurvePrice> copydefault = new MutableLiveData<>();
    public java.lang.Object KWHzl = new java.lang.Object();
    public final java.lang.String AEQbTJ = C33070mpX.AYXKKw(C13754dXa.FragmentManager.reportFullyDrawn);
    public java.lang.String OLrzqt = "1";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gIU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gIV.KWHzl();
        }
    });
    public boolean AYXKKw = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<NewCurvePrice> AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public final C13934dbu djBIcL() {
        return (C13934dbu) this.valueOf.getValue();
    }

    public static final C13934dbu OLrzqt() {
        return new C13934dbu();
    }

    public final android.graphics.Paint AhwBna() {
        return (android.graphics.Paint) this.EZpvd.getValue();
    }

    public static final android.graphics.Paint KWHzl() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(C33052mpF.sp2pxFloat$default(12.0f, null, 1, null));
        return paint;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<NewCurvePrice>> abstractC58185ywXAEQbTJ = djBIcL().AEQbTJ(j, str);
        final Function1 function1 = new Function1() { // from class: o.gIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gIV.KWHzl(this.copydefault, (ResponseData) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gIV.KWHzl(function1, obj);
            }
        });
    }

    public static final Unit KWHzl(gIV giv, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableLiveData<NewCurvePrice> mutableLiveData = giv.copydefault;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            mutableLiveData.postValue((NewCurvePrice) data);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.AEQbTJ;
        if (str.length() == 0) {
            return str2;
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        return C54872xYl.formatCoinPrice$default(bigDecimalEZpvd, null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, AEQbTJ(), CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 17, null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUPercent$default(C33129mqd.copydefault(str), RoundingMode.DOWN, null, DisplaySign.EXCEPT_ZERO, null, null, 26, null);
    }

    public final WalletCurrencyBean AEQbTJ() {
        C54864xYd c54864xYd = C54864xYd.AEQbTJ;
        return new WalletCurrencyBean(c54864xYd.gEmmrt(), c54864xYd.AhwBna(), c54864xYd.OLrzqt(), 2, 18);
    }

    public final void AkhnZx() {
        C33050mpD.OLrzqt(this.KWHzl);
    }

    public final AbstractC58185ywX<Triple<java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>> EZpvd(final boolean z, final long j) {
        final NewCurvePrice value = this.copydefault.getValue();
        return gIZ.EZpvd(new InterfaceC58187ywZ() { // from class: o.gIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                gIV.EZpvd(value, j, this, z, interfaceC58184ywW);
            }
        });
    }

    public static final void EZpvd(NewCurvePrice newCurvePrice, long j, gIV giv, boolean z, InterfaceC58184ywW interfaceC58184ywW) {
        java.lang.Object price;
        java.lang.Object price2;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (newCurvePrice == null) {
            interfaceC58184ywW.onError(new InitError());
            return;
        }
        java.util.List<CurvePrice> chartPoints = newCurvePrice.getChartPoints();
        if (chartPoints == null || chartPoints.isEmpty()) {
            if (newCurvePrice.getChartPoints().isEmpty()) {
                interfaceC58184ywW.onError(new NoDataError());
                return;
            } else {
                interfaceC58184ywW.onError(new java.lang.Exception());
                return;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iEZpvd = C33566myq.EZpvd.EZpvd(C43246rlf.OLrzqt.valueOf());
        CurvePrice curvePrice = (CurvePrice) CollectionsKt___CollectionsKt.firstOrNull(newCurvePrice.getChartPoints());
        if (curvePrice == null || (price = curvePrice.getPrice()) == null) {
            price = 0;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(price);
        CurvePrice curvePrice2 = (CurvePrice) CollectionsKt___CollectionsKt.firstOrNull(newCurvePrice.getChartPoints());
        if (curvePrice2 == null || (price2 = curvePrice2.getPrice()) == null) {
            price2 = Integer.MAX_VALUE;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(price2);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        int i = 0;
        float fMin = 0.0f;
        float fMin2 = 0.0f;
        for (java.lang.Object obj : newCurvePrice.getChartPoints()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CurvePrice curvePrice3 = (CurvePrice) obj;
            if (C33129mqd.AEQbTJ(curvePrice3.getPrice(), strValueOf)) {
                strValueOf = curvePrice3.getPrice();
                float fKWHzl = giv.KWHzl(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(strValueOf), null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, giv.AEQbTJ(), CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 17, null), iEZpvd);
                float size = (i * 100.0f) / newCurvePrice.getChartPoints().size();
                if (size < fKWHzl) {
                    fMin = z ? 100.0f : 0.0f;
                } else {
                    fMin = java.lang.Math.min(z ? 100 - C56548yJl.copydefault(size - fKWHzl, 0.0f) : size + fKWHzl, 100.0f);
                }
            }
            if (C33129mqd.gEmmrt(curvePrice3.getPrice(), strValueOf2)) {
                strValueOf2 = curvePrice3.getPrice();
                float fKWHzl2 = giv.KWHzl(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(strValueOf), null, c10854bwMKWHzl != null ? c10854bwMKWHzl.getNewProxyInstance() : false, giv.AEQbTJ(), CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 17, null), iEZpvd);
                float size2 = (i * 100.0f) / newCurvePrice.getChartPoints().size();
                if (size2 < fKWHzl2) {
                    fMin2 = z ? 100.0f : 0.0f;
                } else {
                    fMin2 = java.lang.Math.min(z ? 100 - C56548yJl.copydefault(size2 - fKWHzl2, 0.0f) : size2 + fKWHzl2, 100.0f);
                }
            }
            arrayList.add(new Entry(i * 1.0f, C33129mqd.djBIcL(curvePrice3.getPrice()), curvePrice3));
            i++;
        }
        interfaceC58184ywW.onNext(new Triple(arrayList, C56390yDp.OLrzqt(java.lang.Float.valueOf(fMin), java.lang.Float.valueOf(fMin2)), C56390yDp.OLrzqt(strValueOf, strValueOf2)));
    }

    public final float KWHzl(java.lang.String str, int i) {
        return ((OLrzqt(str) / 2.0f) / i) * 100;
    }

    public final int OLrzqt(java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        AhwBna().getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }
}
