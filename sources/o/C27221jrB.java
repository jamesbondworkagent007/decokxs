package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27221jrB extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public BigDecimal AhwBna;
    public boolean DbNXlk;
    public iKF EZpvd;
    public BigDecimal KWHzl;
    public BigDecimal OLrzqt;
    public int copydefault;
    public boolean djBIcL;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public AbstractC27236jrQ isConnected;
    public boolean valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC27236jrQ EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPrice(BigDecimal bigDecimal) {
        this.KWHzl = bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentTick(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHighPrice(BigDecimal bigDecimal) {
        this.OLrzqt = bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInit(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLowPrice(BigDecimal bigDecimal) {
        this.AhwBna = bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCallback(AbstractC27236jrQ abstractC27236jrQ) {
        this.isConnected = abstractC27236jrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceRatio(float f) {
        this.values = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27221jrB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.KWHzl = bigDecimal;
        this.AYXKKw = true;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27221jrB.EZpvd(this.AEQbTJ);
            }
        });
        this.values = 1.0E-4f;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27221jrB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.KWHzl = bigDecimal;
        this.AYXKKw = true;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27221jrB.EZpvd(this.AEQbTJ);
            }
        });
        this.values = 1.0E-4f;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27221jrB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.KWHzl = bigDecimal;
        this.AYXKKw = true;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27221jrB.EZpvd(this.AEQbTJ);
            }
        });
        this.values = 1.0E-4f;
        AEQbTJ();
    }

    private final ActionBar DbNXlk() {
        return (ActionBar) this.AEQbTJ.getValue();
    }

    public static final ActionBar EZpvd(C27221jrB c27221jrB) {
        iKF ikf = c27221jrB.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27226jrG c27226jrG = ikf.values;
        Intrinsics.checkNotNullExpressionValue(c27226jrG, "");
        iKF ikf3 = c27221jrB.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        C27226jrG c27226jrG2 = ikf2.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c27226jrG2, "");
        return new ActionBar(c27221jrB, c27226jrG, c27226jrG2);
    }

    public final void AEQbTJ() {
        iKF ikfAEQbTJ = iKF.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        this.EZpvd = ikfAEQbTJ;
        iKF ikf = null;
        if (ikfAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            ikfAEQbTJ = null;
        }
        ikfAEQbTJ.getRoot().setLayoutDirection(0);
        iKF ikf2 = this.EZpvd;
        if (ikf2 == null) {
            Intrinsics.gEmmrt("");
            ikf2 = null;
        }
        ikf2.values.setFlagDirection(0);
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
            ikf3 = null;
        }
        ikf3.fIwbmz.setFlagDirection(1);
        iKF ikf4 = this.EZpvd;
        if (ikf4 == null) {
            Intrinsics.gEmmrt("");
            ikf4 = null;
        }
        ikf4.values.setTouchListener(DbNXlk());
        iKF ikf5 = this.EZpvd;
        if (ikf5 == null) {
            Intrinsics.gEmmrt("");
            ikf5 = null;
        }
        ikf5.fIwbmz.setTouchListener(DbNXlk());
        iKF ikf6 = this.EZpvd;
        if (ikf6 == null) {
            Intrinsics.gEmmrt("");
            ikf6 = null;
        }
        ikf6.values.setFlagTag("TAG_FLAG_LEFT");
        iKF ikf7 = this.EZpvd;
        if (ikf7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf = ikf7;
        }
        ikf.fIwbmz.setFlagTag("TAG_FLAG_RIGHT");
    }

    public final void setChartData(@NotNull java.util.List<InvestUniv3ChartData> list, boolean z) {
        java.lang.String token1Price;
        C27315jsq c27315jsqAEQbTJ;
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final float fFloatValue = 1.0f;
        this.values = 1.0f;
        float fFloatValue2 = this.KWHzl.floatValue();
        while (C33129mqd.AEQbTJ(java.lang.Float.valueOf(fFloatValue2), "0.001")) {
            this.values *= 0.1f;
            fFloatValue2 /= 10;
        }
        while (C33129mqd.gEmmrt(java.lang.Float.valueOf(fFloatValue2), "0.001")) {
            this.values *= 10.0f;
            fFloatValue2 *= 10;
        }
        BigDecimal bigDecimal = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(5));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        for (InvestUniv3ChartData investUniv3ChartData : list) {
            if (z) {
                token1Price = investUniv3ChartData.getToken0Price();
            } else {
                AbstractC27236jrQ abstractC27236jrQ = this.isConnected;
                if (abstractC27236jrQ == null || (c27315jsqAEQbTJ = abstractC27236jrQ.AEQbTJ(investUniv3ChartData.getTick(), false)) == null || (bigDecimalEZpvd = c27315jsqAEQbTJ.EZpvd()) == null || (token1Price = bigDecimalEZpvd.toPlainString()) == null) {
                    token1Price = investUniv3ChartData.getToken1Price();
                }
            }
            if (C33129mqd.valueOf(C33129mqd.EZpvd(token1Price), bigDecimalMultiply)) {
                arrayList.add(new BarEntry(C33129mqd.djBIcL(token1Price) * this.values, C33129mqd.djBIcL(investUniv3ChartData.getLiquidity())));
            }
        }
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27267jrv c27267jrv = ikf.EZpvd;
        java.util.List<? extends BarEntry> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity());
        int i = C52761wXj.ActionBar.ULRxlR;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27267jrv.setChartData(listEZpvd, C55366xib.KWHzl(i, context));
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
            ikf3 = null;
        }
        ikf3.EZpvd.resetZoom();
        iKF ikf4 = this.EZpvd;
        if (ikf4 == null) {
            Intrinsics.gEmmrt("");
            ikf4 = null;
        }
        ikf4.EZpvd.fitScreen();
        iKF ikf5 = this.EZpvd;
        if (ikf5 == null) {
            Intrinsics.gEmmrt("");
            ikf5 = null;
        }
        ikf5.EZpvd.invalidate();
        iKF ikf6 = this.EZpvd;
        if (ikf6 == null) {
            Intrinsics.gEmmrt("");
            ikf6 = null;
        }
        C27267jrv c27267jrv2 = ikf6.ejfBZ;
        java.util.List<? extends BarEntry> listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription());
        int i2 = C52761wXj.ActionBar.DNMMPQ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c27267jrv2.setChartData(listEZpvd2, C55366xib.KWHzl(i2, context2));
        iKF ikf7 = this.EZpvd;
        if (ikf7 == null) {
            Intrinsics.gEmmrt("");
            ikf7 = null;
        }
        ikf7.ejfBZ.resetZoom();
        iKF ikf8 = this.EZpvd;
        if (ikf8 == null) {
            Intrinsics.gEmmrt("");
            ikf8 = null;
        }
        ikf8.ejfBZ.fitScreen();
        iKF ikf9 = this.EZpvd;
        if (ikf9 == null) {
            Intrinsics.gEmmrt("");
            ikf9 = null;
        }
        ikf9.ejfBZ.invalidate();
        if (!this.djBIcL) {
            float f = 2;
            fFloatValue = (3 * this.KWHzl.floatValue()) / ((this.OLrzqt.floatValue() * f) - (f * this.KWHzl.floatValue()));
        }
        if (this.KWHzl.compareTo(BigDecimal.ZERO) > 0) {
            iKF ikf10 = this.EZpvd;
            if (ikf10 == null) {
                Intrinsics.gEmmrt("");
                ikf10 = null;
            }
            float f2 = 6;
            ikf10.EZpvd.setVisibleXRangeMaximum(this.KWHzl.floatValue() * this.values * f2);
            iKF ikf11 = this.EZpvd;
            if (ikf11 == null) {
                Intrinsics.gEmmrt("");
                ikf11 = null;
            }
            ikf11.ejfBZ.setVisibleXRangeMaximum(this.KWHzl.floatValue() * this.values * f2);
        }
        iKF ikf12 = this.EZpvd;
        if (ikf12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf12;
        }
        ikf2.EZpvd.post(new java.lang.Runnable() { // from class: o.jrC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27221jrB.setChartData$lambda$3(this.OLrzqt, fFloatValue);
            }
        });
        gEmmrt();
        AhwBna(this.KWHzl.floatValue() * this.values * 0.01f);
    }

    /* JADX INFO: renamed from: o.jrB$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Float.valueOf(((BarEntry) t).getX()), java.lang.Float.valueOf(((BarEntry) t2).getX()));
        }
    }

    /* JADX INFO: renamed from: o.jrB$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Float.valueOf(((BarEntry) t).getX()), java.lang.Float.valueOf(((BarEntry) t2).getX()));
        }
    }

    public static final void setChartData$lambda$3(C27221jrB c27221jrB, float f) {
        c27221jrB.AYXKKw();
        c27221jrB.copydefault(f);
        c27221jrB.valueOf();
    }

    public final void AYXKKw() {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.EZpvd.resetZoom();
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        ikf2.ejfBZ.resetZoom();
    }

    public final float EZpvd(float f) {
        iKF ikf = this.EZpvd;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        return ((float) ikf.EZpvd.getValuesByTouchPoint(f, 0.0f, YAxis.AxisDependency.LEFT).x) / this.values;
    }

    public final float AEQbTJ(float f) {
        iKF ikf = this.EZpvd;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        return (float) ikf.EZpvd.getPixelForValues(f * this.values, 0.0f, YAxis.AxisDependency.LEFT).x;
    }

    public final void isConnected() {
        BigDecimal bigDecimal = this.AhwBna;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        copydefault(bigDecimal);
        BigDecimal bigDecimal2 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        KWHzl(bigDecimal2);
        KWHzl(AEQbTJ(C33129mqd.djBIcL(this.AhwBna)));
        gEmmrt(AEQbTJ(C33129mqd.djBIcL(this.OLrzqt)));
        AkhnZx();
        AhwBna();
        gEmmrt();
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.values.AYXKKw();
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        ikf2.fIwbmz.AYXKKw();
    }

    /* JADX INFO: renamed from: o.jrB$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public final class ActionBar implements View.OnTouchListener {
        public final /* synthetic */ C27221jrB AEQbTJ;
        public float KWHzl;
        public final C27226jrG OLrzqt;
        public final C27226jrG copydefault;

        public ActionBar(@NotNull C27221jrB c27221jrB, @NotNull C27226jrG c27226jrG, C27226jrG c27226jrG2) {
            Intrinsics.checkNotNullParameter(c27226jrG, "");
            Intrinsics.checkNotNullParameter(c27226jrG2, "");
            this.AEQbTJ = c27221jrB;
            this.copydefault = c27226jrG;
            this.OLrzqt = c27226jrG2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull android.view.View view, @NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.AEQbTJ.requestDisallowInterceptTouchEvent(motionEvent.getAction() != 1);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.KWHzl = motionEvent.getX();
                AbstractC27236jrQ abstractC27236jrQEZpvd = this.AEQbTJ.EZpvd();
                if (abstractC27236jrQEZpvd != null) {
                    abstractC27236jrQEZpvd.OLrzqt();
                }
                AbstractC27236jrQ abstractC27236jrQEZpvd2 = this.AEQbTJ.EZpvd();
                if (abstractC27236jrQEZpvd2 != null) {
                    abstractC27236jrQEZpvd2.EZpvd(true);
                }
            } else if (action == 1) {
                AbstractC27236jrQ abstractC27236jrQEZpvd3 = this.AEQbTJ.EZpvd();
                if (abstractC27236jrQEZpvd3 != null) {
                    abstractC27236jrQEZpvd3.OLrzqt();
                }
                if (Intrinsics.EZpvd(view.getTag(), (java.lang.Object) "TAG_FLAG_LEFT")) {
                    this.copydefault.AYXKKw();
                } else {
                    this.OLrzqt.AYXKKw();
                }
                this.AEQbTJ.gEmmrt();
                AbstractC27236jrQ abstractC27236jrQEZpvd4 = this.AEQbTJ.EZpvd();
                if (abstractC27236jrQEZpvd4 != null) {
                    abstractC27236jrQEZpvd4.EZpvd(false);
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - this.KWHzl;
                iKF ikf = null;
                if (Intrinsics.EZpvd(view.getTag(), (java.lang.Object) "TAG_FLAG_LEFT")) {
                    float fCopydefault = this.copydefault.copydefault();
                    iKF ikf2 = this.AEQbTJ.EZpvd;
                    if (ikf2 == null) {
                        Intrinsics.gEmmrt("");
                        ikf2 = null;
                    }
                    float fMax = java.lang.Math.max(fCopydefault + x, ikf2.values.KWHzl());
                    iKF ikf3 = this.AEQbTJ.EZpvd;
                    if (ikf3 == null) {
                        Intrinsics.gEmmrt("");
                        ikf3 = null;
                    }
                    float width = ikf3.DbNXlk.getWidth();
                    iKF ikf4 = this.AEQbTJ.EZpvd;
                    if (ikf4 == null) {
                        Intrinsics.gEmmrt("");
                        ikf4 = null;
                    }
                    float fMin = java.lang.Math.min(fMax, width - ikf4.values.KWHzl());
                    iKF ikf5 = this.AEQbTJ.EZpvd;
                    if (ikf5 == null) {
                        Intrinsics.gEmmrt("");
                        ikf5 = null;
                    }
                    C27226jrG c27226jrG = ikf5.fIwbmz;
                    Intrinsics.checkNotNullExpressionValue(c27226jrG, "");
                    if (c27226jrG.getVisibility() == 0) {
                        iKF ikf6 = this.AEQbTJ.EZpvd;
                        if (ikf6 == null) {
                            Intrinsics.gEmmrt("");
                            ikf6 = null;
                        }
                        float fCopydefault2 = ikf6.fIwbmz.copydefault();
                        iKF ikf7 = this.AEQbTJ.EZpvd;
                        if (ikf7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            ikf = ikf7;
                        }
                        fMin = java.lang.Math.min(fMin, fCopydefault2 - (ikf.values.KWHzl() * 2));
                    }
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Float.valueOf(this.AEQbTJ.EZpvd(fMin)));
                    if (bigDecimalEZpvd.compareTo(BigDecimal.ZERO) <= 0) {
                        return true;
                    }
                    this.AEQbTJ.setLowPrice(bigDecimalEZpvd);
                    this.AEQbTJ.KWHzl(fMin);
                    C27221jrB c27221jrB = this.AEQbTJ;
                    BigDecimal bigDecimalOLrzqt = c27221jrB.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalOLrzqt, "");
                    c27221jrB.copydefault(bigDecimalOLrzqt);
                    AbstractC27236jrQ abstractC27236jrQEZpvd5 = this.AEQbTJ.EZpvd();
                    if (abstractC27236jrQEZpvd5 != null) {
                        C27221jrB c27221jrB2 = this.AEQbTJ;
                        BigDecimal bigDecimalOLrzqt2 = c27221jrB2.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalOLrzqt2, "");
                        BigDecimal bigDecimalOLrzqt3 = c27221jrB2.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalOLrzqt3, "");
                        abstractC27236jrQEZpvd5.copydefault(new C27315jsq(bigDecimalOLrzqt2, abstractC27236jrQEZpvd5.AEQbTJ(bigDecimalOLrzqt3, x > 0.0f)));
                    }
                } else {
                    float fCopydefault3 = this.OLrzqt.copydefault();
                    iKF ikf8 = this.AEQbTJ.EZpvd;
                    if (ikf8 == null) {
                        Intrinsics.gEmmrt("");
                        ikf8 = null;
                    }
                    float width2 = ikf8.DbNXlk.getWidth();
                    iKF ikf9 = this.AEQbTJ.EZpvd;
                    if (ikf9 == null) {
                        Intrinsics.gEmmrt("");
                        ikf9 = null;
                    }
                    float fMin2 = java.lang.Math.min(fCopydefault3 + x, width2 - ikf9.fIwbmz.KWHzl());
                    iKF ikf10 = this.AEQbTJ.EZpvd;
                    if (ikf10 == null) {
                        Intrinsics.gEmmrt("");
                        ikf10 = null;
                    }
                    float fMax2 = java.lang.Math.max(fMin2, ikf10.fIwbmz.KWHzl());
                    iKF ikf11 = this.AEQbTJ.EZpvd;
                    if (ikf11 == null) {
                        Intrinsics.gEmmrt("");
                        ikf11 = null;
                    }
                    C27226jrG c27226jrG2 = ikf11.fIwbmz;
                    Intrinsics.checkNotNullExpressionValue(c27226jrG2, "");
                    if (c27226jrG2.getVisibility() == 0) {
                        iKF ikf12 = this.AEQbTJ.EZpvd;
                        if (ikf12 == null) {
                            Intrinsics.gEmmrt("");
                            ikf12 = null;
                        }
                        float fCopydefault4 = ikf12.values.copydefault();
                        iKF ikf13 = this.AEQbTJ.EZpvd;
                        if (ikf13 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            ikf = ikf13;
                        }
                        fMax2 = java.lang.Math.max(fMax2, fCopydefault4 + (ikf.fIwbmz.KWHzl() * 2));
                    }
                    C27221jrB c27221jrB3 = this.AEQbTJ;
                    c27221jrB3.setHighPrice(C33129mqd.EZpvd(java.lang.Float.valueOf(c27221jrB3.EZpvd(fMax2))));
                    this.AEQbTJ.gEmmrt(fMax2);
                    C27221jrB c27221jrB4 = this.AEQbTJ;
                    BigDecimal bigDecimalCopydefault = c27221jrB4.copydefault();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalCopydefault, "");
                    c27221jrB4.KWHzl(bigDecimalCopydefault);
                    AbstractC27236jrQ abstractC27236jrQEZpvd6 = this.AEQbTJ.EZpvd();
                    if (abstractC27236jrQEZpvd6 != null) {
                        C27221jrB c27221jrB5 = this.AEQbTJ;
                        BigDecimal bigDecimalCopydefault2 = c27221jrB5.copydefault();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalCopydefault2, "");
                        BigDecimal bigDecimalCopydefault3 = c27221jrB5.copydefault();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalCopydefault3, "");
                        abstractC27236jrQEZpvd6.EZpvd(new C27315jsq(bigDecimalCopydefault2, abstractC27236jrQEZpvd6.AEQbTJ(bigDecimalCopydefault3, x > 0.0f)));
                    }
                }
            }
            return true;
        }
    }

    public void EZpvd(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.AhwBna = c27315jsq.EZpvd();
        isConnected();
    }

    public void AEQbTJ(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.OLrzqt = c27315jsq.EZpvd();
        isConnected();
    }

    public void KWHzl(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.KWHzl = bigDecimal;
        this.copydefault = i;
        isConnected();
        djBIcL();
        valueOf();
    }

    public final void copydefault(float f) {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27267jrv c27267jrv = ikf.EZpvd;
        float fFloatValue = this.KWHzl.floatValue();
        float f2 = this.values;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        c27267jrv.zoom(f, 0.0f, fFloatValue * f2, 0.0f, axisDependency);
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        ikf2.ejfBZ.zoom(f, 0.0f, this.KWHzl.floatValue() * this.values, 0.0f, axisDependency);
        post(new java.lang.Runnable() { // from class: o.jrH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27221jrB.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C27221jrB c27221jrB) {
        c27221jrB.isConnected();
        c27221jrB.djBIcL();
        c27221jrB.valueOf();
    }

    public final void values() {
        copydefault(0.5f);
    }

    public final void fetchVPNInfo() {
        copydefault(2.0f);
    }

    public final void valueOf() {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        android.widget.ImageView imageView = ikf.copydefault;
        float fAEQbTJ = AEQbTJ(this.KWHzl.floatValue());
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        imageView.setX(fAEQbTJ - (ikf2.copydefault.getWidth() / 2));
    }

    public final void KWHzl(float f) {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27226jrG c27226jrG = ikf.values;
        this.valueOf = f < 0.0f;
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        this.gEmmrt = f > ((float) ikf2.DbNXlk.getWidth());
        Intrinsics.copydefault(c27226jrG);
        c27226jrG.setVisibility((this.valueOf || this.gEmmrt) ? 8 : 0);
        c27226jrG.setX(f - c27226jrG.AEQbTJ());
        if (c27226jrG.OLrzqt() == 0 && c27226jrG.getX() < 0.0f) {
            c27226jrG.setFlagDirection(1);
            c27226jrG.setTranslationZ(99.0f);
        } else if (c27226jrG.OLrzqt() == 1 && c27226jrG.getX() > 0.0f) {
            c27226jrG.setFlagDirection(0);
            c27226jrG.setTranslationZ(100.0f);
        }
        AkhnZx();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt(float f) {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27226jrG c27226jrG = ikf.fIwbmz;
        this.fetchVPNInfo = f < 0.0f;
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
            ikf3 = null;
        }
        this.DbNXlk = f > ((float) ikf3.DbNXlk.getWidth());
        Intrinsics.copydefault(c27226jrG);
        c27226jrG.setVisibility((this.fetchVPNInfo || this.DbNXlk) ? 8 : 0);
        c27226jrG.setX(f - c27226jrG.AEQbTJ());
        if (c27226jrG.OLrzqt() == 1) {
            float x = c27226jrG.getX();
            float width = c27226jrG.getWidth();
            iKF ikf4 = this.EZpvd;
            if (ikf4 == null) {
                Intrinsics.gEmmrt("");
                ikf4 = null;
            }
            if (x + width > ikf4.DbNXlk.getWidth()) {
                c27226jrG.setFlagDirection(0);
                c27226jrG.setTranslationZ(99.0f);
            } else if (c27226jrG.OLrzqt() == 0) {
                float x2 = c27226jrG.getX();
                float width2 = c27226jrG.getWidth();
                iKF ikf5 = this.EZpvd;
                if (ikf5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    ikf2 = ikf5;
                }
                if (x2 + width2 < ikf2.DbNXlk.getWidth()) {
                    c27226jrG.setFlagDirection(1);
                    c27226jrG.setTranslationZ(100.0f);
                }
            }
        }
        AkhnZx();
    }

    public final void AkhnZx() {
        float fCopydefault;
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        android.widget.ImageView imageView = ikf.AuCTel;
        float fCopydefault2 = 0.0f;
        if (this.valueOf) {
            fCopydefault = 0.0f;
        } else if (this.gEmmrt) {
            iKF ikf3 = this.EZpvd;
            if (ikf3 == null) {
                Intrinsics.gEmmrt("");
                ikf3 = null;
            }
            fCopydefault = ikf3.DbNXlk.getWidth();
        } else {
            iKF ikf4 = this.EZpvd;
            if (ikf4 == null) {
                Intrinsics.gEmmrt("");
                ikf4 = null;
            }
            fCopydefault = ikf4.values.copydefault();
        }
        imageView.setX(fCopydefault);
        if (!this.fetchVPNInfo) {
            if (this.DbNXlk) {
                iKF ikf5 = this.EZpvd;
                if (ikf5 == null) {
                    Intrinsics.gEmmrt("");
                    ikf5 = null;
                }
                fCopydefault2 = ikf5.DbNXlk.getWidth();
            } else {
                iKF ikf6 = this.EZpvd;
                if (ikf6 == null) {
                    Intrinsics.gEmmrt("");
                    ikf6 = null;
                }
                fCopydefault2 = ikf6.fIwbmz.copydefault();
            }
        }
        iKF ikf7 = this.EZpvd;
        if (ikf7 == null) {
            Intrinsics.gEmmrt("");
            ikf7 = null;
        }
        android.widget.ImageView imageView2 = ikf7.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        iKF ikf8 = this.EZpvd;
        if (ikf8 == null) {
            Intrinsics.gEmmrt("");
            ikf8 = null;
        }
        layoutParams.width = (int) (fCopydefault2 - ikf8.AuCTel.getX());
        imageView2.setLayoutParams(layoutParams);
        iKF ikf9 = this.EZpvd;
        if (ikf9 == null) {
            Intrinsics.gEmmrt("");
            ikf9 = null;
        }
        C27267jrv c27267jrv = ikf9.ejfBZ;
        iKF ikf10 = this.EZpvd;
        if (ikf10 == null) {
            Intrinsics.gEmmrt("");
            ikf10 = null;
        }
        int x = (int) ikf10.AuCTel.getX();
        int i = (int) fCopydefault2;
        iKF ikf11 = this.EZpvd;
        if (ikf11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf11;
        }
        c27267jrv.setClipBounds(new android.graphics.Rect(x, 0, i, ikf2.ejfBZ.getHeight()));
    }

    public final void copydefault(BigDecimal bigDecimal) {
        if (Intrinsics.EZpvd(this.KWHzl, BigDecimal.ZERO)) {
            return;
        }
        BigDecimal bigDecimal2 = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        BigDecimal bigDecimal3 = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        java.lang.String percent$default = pTB.formatPercent$default(bigDecimalDivide, C33129mqd.AEQbTJ(bigDecimalDivide.abs(), java.lang.Double.valueOf(0.1d)) ? 1 : 2, 0, RoundingMode.HALF_UP, null, 8, null);
        iKF ikf = this.EZpvd;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.values.setText(percent$default);
    }

    public final void KWHzl(BigDecimal bigDecimal) {
        if (Intrinsics.EZpvd(this.KWHzl, BigDecimal.ZERO)) {
            return;
        }
        BigDecimal bigDecimal2 = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        BigDecimal bigDecimal3 = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        java.lang.String percent$default = pTB.formatPercent$default(bigDecimalDivide, C33129mqd.AEQbTJ(bigDecimalDivide.abs(), java.lang.Double.valueOf(0.1d)) ? 1 : 2, 0, RoundingMode.HALF_UP, null, 8, null);
        iKF ikf = this.EZpvd;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.fIwbmz.setText(percent$default);
    }

    public final void AhwBna() {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        android.widget.ImageView imageView = ikf.isConnected;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility((this.valueOf || this.fetchVPNInfo) ? 0 : 8);
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        android.widget.ImageView imageView2 = ikf2.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility((this.gEmmrt || this.DbNXlk) ? 0 : 8);
    }

    public final void djBIcL() {
        boolean z;
        float fEZpvd = EZpvd(20.0f);
        float fFloatValue = (this.KWHzl.floatValue() - fEZpvd) / 2;
        android.widget.TextView[] textViewArr = new android.widget.TextView[5];
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        textViewArr[0] = ikf.AEQbTJ;
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
            ikf3 = null;
        }
        textViewArr[1] = ikf3.OLrzqt;
        iKF ikf4 = this.EZpvd;
        if (ikf4 == null) {
            Intrinsics.gEmmrt("");
            ikf4 = null;
        }
        textViewArr[2] = ikf4.gEmmrt;
        iKF ikf5 = this.EZpvd;
        if (ikf5 == null) {
            Intrinsics.gEmmrt("");
            ikf5 = null;
        }
        textViewArr[3] = ikf5.AhwBna;
        iKF ikf6 = this.EZpvd;
        if (ikf6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf6;
        }
        textViewArr[4] = ikf2.AYXKKw;
        java.util.List listGEmmrt = yDY.gEmmrt(textViewArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        int i = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(OLrzqt((i * fFloatValue) + fEZpvd));
            i++;
        }
        if (arrayList.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).length() <= 7) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        int i2 = 0;
        for (java.lang.Object obj2 : listGEmmrt) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = (android.widget.TextView) obj2;
            boolean z2 = !z || (1 <= i2 && i2 < 4);
            Intrinsics.copydefault(textView);
            textView.setVisibility(z2 ? 0 : 8);
            textView.setText((java.lang.CharSequence) arrayList.get(i2));
            i2++;
        }
    }

    public final java.lang.String OLrzqt(float f) {
        return C27586jxw.localizeCryptoPrice$default(C27586jxw.OLrzqt, C33129mqd.EZpvd(java.lang.Float.valueOf(f)), false, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt() {
        boolean z;
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        C27226jrG c27226jrG = ikf.values;
        Intrinsics.checkNotNullExpressionValue(c27226jrG, "");
        if (c27226jrG.getVisibility() != 0) {
            z = false;
        } else {
            iKF ikf3 = this.EZpvd;
            if (ikf3 == null) {
                Intrinsics.gEmmrt("");
                ikf3 = null;
            }
            C27226jrG c27226jrG2 = ikf3.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c27226jrG2, "");
            if (c27226jrG2.getVisibility() == 0) {
                iKF ikf4 = this.EZpvd;
                if (ikf4 == null) {
                    Intrinsics.gEmmrt("");
                    ikf4 = null;
                }
                float fCopydefault = ikf4.fIwbmz.copydefault();
                iKF ikf5 = this.EZpvd;
                if (ikf5 == null) {
                    Intrinsics.gEmmrt("");
                    ikf5 = null;
                }
                float fCopydefault2 = ikf5.values.copydefault();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (fCopydefault - fCopydefault2 <= C55298xhM.copydefault(24.0f, r4)) {
                    z = true;
                }
            }
        }
        iKF ikf6 = this.EZpvd;
        if (ikf6 == null) {
            Intrinsics.gEmmrt("");
            ikf6 = null;
        }
        ikf6.values.setHotArea(z);
        iKF ikf7 = this.EZpvd;
        if (ikf7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf7;
        }
        ikf2.fIwbmz.setHotArea(z);
    }

    private final void AhwBna(float f) {
        iKF ikf = this.EZpvd;
        iKF ikf2 = null;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.EZpvd.setVisibleXRangeMinimum(f);
        iKF ikf3 = this.EZpvd;
        if (ikf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikf2 = ikf3;
        }
        ikf2.ejfBZ.setVisibleXRangeMinimum(f);
    }

    public final void KWHzl() {
        iKF ikf = this.EZpvd;
        if (ikf == null) {
            Intrinsics.gEmmrt("");
            ikf = null;
        }
        ikf.EZpvd.KWHzl();
    }
}
