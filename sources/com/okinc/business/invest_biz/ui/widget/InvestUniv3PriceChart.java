package com.okinc.business.invest_biz.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3PriceChart;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27236jrQ;
import o.C27229jrJ;
import o.C27235jrP;
import o.C27315jsq;
import o.C27586jxw;
import o.C33129mqd;
import o.C55298xhM;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.iKQ;
import o.pTA;
import o.pTB;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestUniv3PriceChart extends ConstraintLayout {
    public iKQ AEQbTJ;
    public AbstractC27236jrQ AYXKKw;
    public BigDecimal AhwBna;
    public BigDecimal AkhnZx;
    public List<? extends Entry> DbNXlk;
    public boolean EZpvd;
    public ArrayList<InvestUniv3ChartData> KWHzl;
    public BigDecimal OLrzqt;
    public boolean copydefault;
    public BigDecimal djBIcL;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public boolean values;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class PriceEntry extends Entry {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC27236jrQ copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCallback(AbstractC27236jrQ abstractC27236jrQ) {
        this.AYXKKw = abstractC27236jrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteTokenPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.AkhnZx = bigDecimal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new ArrayList<>();
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = true;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.djBIcL = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.AkhnZx = bigDecimal;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3PriceChart.gEmmrt(this.KWHzl);
            }
        });
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceChart(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new ArrayList<>();
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = true;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.djBIcL = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.AkhnZx = bigDecimal;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3PriceChart.gEmmrt(this.KWHzl);
            }
        });
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceChart(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new ArrayList<>();
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = true;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.AhwBna = bigDecimal;
        this.djBIcL = bigDecimal;
        this.OLrzqt = bigDecimal;
        this.AkhnZx = bigDecimal;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3PriceChart.gEmmrt(this.KWHzl);
            }
        });
        EZpvd();
    }

    private final StateListAnimator AEQbTJ() {
        return (StateListAnimator) this.valueOf.getValue();
    }

    public static final StateListAnimator gEmmrt(InvestUniv3PriceChart investUniv3PriceChart) {
        iKQ ikq = investUniv3PriceChart.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        C27235jrP c27235jrP = ikq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c27235jrP, "");
        iKQ ikq3 = investUniv3PriceChart.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq3;
        }
        C27235jrP c27235jrP2 = ikq2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27235jrP2, "");
        return new StateListAnimator(investUniv3PriceChart, c27235jrP, c27235jrP2);
    }

    public final void EZpvd() {
        iKQ ikqEZpvd = iKQ.EZpvd(LayoutInflater.from(getContext()), this, true);
        this.AEQbTJ = ikqEZpvd;
        iKQ ikq = null;
        if (ikqEZpvd == null) {
            Intrinsics.gEmmrt("");
            ikqEZpvd = null;
        }
        ikqEZpvd.fJNWhG.setFlagDirection(0);
        iKQ ikq2 = this.AEQbTJ;
        if (ikq2 == null) {
            Intrinsics.gEmmrt("");
            ikq2 = null;
        }
        ikq2.AEQbTJ.setFlagDirection(0);
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
            ikq3 = null;
        }
        ikq3.fJNWhG.setTouchListener(AEQbTJ());
        iKQ ikq4 = this.AEQbTJ;
        if (ikq4 == null) {
            Intrinsics.gEmmrt("");
            ikq4 = null;
        }
        ikq4.AEQbTJ.setTouchListener(AEQbTJ());
        iKQ ikq5 = this.AEQbTJ;
        if (ikq5 == null) {
            Intrinsics.gEmmrt("");
            ikq5 = null;
        }
        ikq5.fJNWhG.setFlagTag("TAG_FLAG_TOP");
        iKQ ikq6 = this.AEQbTJ;
        if (ikq6 == null) {
            Intrinsics.gEmmrt("");
            ikq6 = null;
        }
        ikq6.AEQbTJ.setFlagTag("TAG_FLAG_BOTTOM");
        iKQ ikq7 = this.AEQbTJ;
        if (ikq7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq = ikq7;
        }
        ikq.isConnected.setSelectCallback(new C27229jrJ.ActionBar() { // from class: o.jrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27229jrJ.ActionBar
            public final void AEQbTJ(kotlin.Pair pair) {
                InvestUniv3PriceChart.copydefault(this.AEQbTJ, pair);
            }
        });
    }

    public static final void copydefault(InvestUniv3PriceChart investUniv3PriceChart, Pair pair) {
        iKQ ikq = investUniv3PriceChart.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        TextView textView = ikq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(pair == null ? 4 : 0);
        iKQ ikq3 = investUniv3PriceChart.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
            ikq3 = null;
        }
        TextView textView2 = ikq3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(pair != null ? 0 : 4);
        if (pair != null) {
            int iOLrzqt = (int) investUniv3PriceChart.OLrzqt(((Number) pair.getFirst()).floatValue());
            iKQ ikq4 = investUniv3PriceChart.AEQbTJ;
            if (ikq4 == null) {
                Intrinsics.gEmmrt("");
                ikq4 = null;
            }
            ikq4.EZpvd.setText(C33129mqd.EZpvd(pair.getSecond()).toPlainString());
            iKQ ikq5 = investUniv3PriceChart.AEQbTJ;
            if (ikq5 == null) {
                Intrinsics.gEmmrt("");
                ikq5 = null;
            }
            ikq5.KWHzl.setText(pTA.formatSimpleDateTime$default(new Date((long) ((Number) pair.getFirst()).floatValue()), null, 1, null));
            iKQ ikq6 = investUniv3PriceChart.AEQbTJ;
            if (ikq6 == null) {
                Intrinsics.gEmmrt("");
                ikq6 = null;
            }
            int width = ikq6.KWHzl.getWidth() / 2;
            iKQ ikq7 = investUniv3PriceChart.AEQbTJ;
            if (ikq7 == null) {
                Intrinsics.gEmmrt("");
                ikq7 = null;
            }
            int iMax = Math.max(iOLrzqt, Math.max(width, ikq7.EZpvd.getWidth() / 2));
            iKQ ikq8 = investUniv3PriceChart.AEQbTJ;
            if (ikq8 == null) {
                Intrinsics.gEmmrt("");
                ikq8 = null;
            }
            int width2 = ikq8.isConnected.getWidth();
            iKQ ikq9 = investUniv3PriceChart.AEQbTJ;
            if (ikq9 == null) {
                Intrinsics.gEmmrt("");
                ikq9 = null;
            }
            int width3 = ikq9.KWHzl.getWidth() / 2;
            iKQ ikq10 = investUniv3PriceChart.AEQbTJ;
            if (ikq10 == null) {
                Intrinsics.gEmmrt("");
                ikq10 = null;
            }
            int width4 = ikq10.isConnected.getWidth();
            iKQ ikq11 = investUniv3PriceChart.AEQbTJ;
            if (ikq11 == null) {
                Intrinsics.gEmmrt("");
                ikq11 = null;
            }
            int iMin = Math.min(iMax, Math.min(width2 - width3, width4 - (ikq11.EZpvd.getWidth() / 2)));
            iKQ ikq12 = investUniv3PriceChart.AEQbTJ;
            if (ikq12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikq2 = ikq12;
            }
            View view = ikq2.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(iMin);
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void setChartData(@NotNull List<InvestUniv3ChartData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        this.gEmmrt = z;
        ArrayList<InvestUniv3ChartData> arrayList = this.KWHzl;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InvestUniv3ChartData investUniv3ChartData : arrayList) {
            arrayList2.add(new Entry(investUniv3ChartData.getTimestamp(), C33129mqd.djBIcL(z ? investUniv3ChartData.getToken0Price() : investUniv3ChartData.getToken1Price())));
        }
        this.DbNXlk = arrayList2;
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ikq.isConnected.setChartData(this.DbNXlk);
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
            ikq3 = null;
        }
        ikq3.isConnected.invalidate();
        Iterator<T> it = this.DbNXlk.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float y = ((Entry) it.next()).getY();
        while (it.hasNext()) {
            y = Math.max(y, ((Entry) it.next()).getY());
        }
        Iterator<T> it2 = this.DbNXlk.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float y2 = ((Entry) it2.next()).getY();
        while (it2.hasNext()) {
            y2 = Math.min(y2, ((Entry) it2.next()).getY());
        }
        if (y == y2) {
            iKQ ikq4 = this.AEQbTJ;
            if (ikq4 == null) {
                Intrinsics.gEmmrt("");
                ikq4 = null;
            }
            ikq4.isConnected.getAxisLeft().setAxisMinimum(this.OLrzqt.floatValue() * 0.7f);
            iKQ ikq5 = this.AEQbTJ;
            if (ikq5 == null) {
                Intrinsics.gEmmrt("");
                ikq5 = null;
            }
            ikq5.isConnected.getAxisLeft().setAxisMaximum(this.OLrzqt.floatValue() * 1.3f);
            iKQ ikq6 = this.AEQbTJ;
            if (ikq6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikq2 = ikq6;
            }
            ikq2.isConnected.setVisibleYRange(this.OLrzqt.floatValue() * 0.6f, this.OLrzqt.floatValue() * 0.6f, YAxis.AxisDependency.LEFT);
        }
        OLrzqt();
        KWHzl();
    }

    public final void OLrzqt() {
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ikq.isConnected.post(new Runnable() { // from class: o.jrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                InvestUniv3PriceChart.AYXKKw(this.KWHzl);
            }
        });
    }

    public static final void AYXKKw(InvestUniv3PriceChart investUniv3PriceChart) {
        if (!investUniv3PriceChart.DbNXlk.isEmpty()) {
            Iterator<T> it = investUniv3PriceChart.DbNXlk.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            float y = ((Entry) it.next()).getY();
            while (it.hasNext()) {
                y = Math.max(y, ((Entry) it.next()).getY());
            }
            Iterator<T> it2 = investUniv3PriceChart.DbNXlk.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            float y2 = ((Entry) it2.next()).getY();
            while (it2.hasNext()) {
                y2 = Math.min(y2, ((Entry) it2.next()).getY());
            }
            if (y == y2) {
                iKQ ikq = investUniv3PriceChart.AEQbTJ;
                if (ikq == null) {
                    Intrinsics.gEmmrt("");
                    ikq = null;
                }
                ikq.isConnected.zoom(0.0f, 1.0f, 0.0f, investUniv3PriceChart.OLrzqt.floatValue(), YAxis.AxisDependency.LEFT);
            }
        }
        investUniv3PriceChart.AYXKKw();
        investUniv3PriceChart.valueOf();
        investUniv3PriceChart.gEmmrt();
    }

    public final float EZpvd(float f) {
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        return (float) ikq.isConnected.getValuesByTouchPoint(0.0f, f, YAxis.AxisDependency.LEFT).y;
    }

    public final float KWHzl(float f) {
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        return (float) ikq.isConnected.getPixelForValues(0.0f, f, YAxis.AxisDependency.LEFT).y;
    }

    private final float OLrzqt(float f) {
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        return (float) ikq.isConnected.getPixelForValues(f, 0.0f, YAxis.AxisDependency.LEFT).x;
    }

    private final void valueOf() {
        AEQbTJ(KWHzl(this.djBIcL.floatValue()));
        copydefault(KWHzl(this.AhwBna.floatValue()));
        BigDecimal bigDecimal = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        EZpvd(bigDecimal);
        BigDecimal bigDecimal2 = this.AhwBna;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        OLrzqt(bigDecimal2);
        djBIcL();
        KWHzl();
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ikq.fJNWhG.valueOf();
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq3;
        }
        ikq2.AEQbTJ.valueOf();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class StateListAnimator implements View.OnTouchListener {
        public float AEQbTJ;
        public final C27235jrP EZpvd;
        public final /* synthetic */ InvestUniv3PriceChart KWHzl;
        public final C27235jrP copydefault;

        public StateListAnimator(@NotNull InvestUniv3PriceChart investUniv3PriceChart, @NotNull C27235jrP c27235jrP, C27235jrP c27235jrP2) {
            Intrinsics.checkNotNullParameter(c27235jrP, "");
            Intrinsics.checkNotNullParameter(c27235jrP2, "");
            this.KWHzl = investUniv3PriceChart;
            this.EZpvd = c27235jrP;
            this.copydefault = c27235jrP2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.KWHzl.requestDisallowInterceptTouchEvent(motionEvent.getAction() != 1);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.AEQbTJ = motionEvent.getY();
                AbstractC27236jrQ abstractC27236jrQCopydefault = this.KWHzl.copydefault();
                if (abstractC27236jrQCopydefault != null) {
                    abstractC27236jrQCopydefault.OLrzqt();
                }
                AbstractC27236jrQ abstractC27236jrQCopydefault2 = this.KWHzl.copydefault();
                if (abstractC27236jrQCopydefault2 != null) {
                    abstractC27236jrQCopydefault2.EZpvd(true);
                }
            } else if (action == 1) {
                AbstractC27236jrQ abstractC27236jrQCopydefault3 = this.KWHzl.copydefault();
                if (abstractC27236jrQCopydefault3 != null) {
                    abstractC27236jrQCopydefault3.OLrzqt();
                }
                if (Intrinsics.EZpvd(view.getTag(), (Object) "TAG_FLAG_TOP")) {
                    this.EZpvd.valueOf();
                } else {
                    this.copydefault.valueOf();
                }
                this.KWHzl.KWHzl();
                AbstractC27236jrQ abstractC27236jrQCopydefault4 = this.KWHzl.copydefault();
                if (abstractC27236jrQCopydefault4 != null) {
                    abstractC27236jrQCopydefault4.EZpvd(false);
                }
            } else if (action == 2) {
                float y = motionEvent.getY() - this.AEQbTJ;
                iKQ ikq = null;
                if (Intrinsics.EZpvd(view.getTag(), (Object) "TAG_FLAG_TOP")) {
                    float fCopydefault = this.EZpvd.copydefault();
                    iKQ ikq2 = this.KWHzl.AEQbTJ;
                    if (ikq2 == null) {
                        Intrinsics.gEmmrt("");
                        ikq2 = null;
                    }
                    float fMax = Math.max(fCopydefault + y, ikq2.fJNWhG.KWHzl());
                    iKQ ikq3 = this.KWHzl.AEQbTJ;
                    if (ikq3 == null) {
                        Intrinsics.gEmmrt("");
                        ikq3 = null;
                    }
                    float height = ikq3.fARcdN.getHeight();
                    iKQ ikq4 = this.KWHzl.AEQbTJ;
                    if (ikq4 == null) {
                        Intrinsics.gEmmrt("");
                        ikq4 = null;
                    }
                    float fMin = Math.min(fMax, height - ikq4.fJNWhG.KWHzl());
                    iKQ ikq5 = this.KWHzl.AEQbTJ;
                    if (ikq5 == null) {
                        Intrinsics.gEmmrt("");
                        ikq5 = null;
                    }
                    C27235jrP c27235jrP = ikq5.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c27235jrP, "");
                    if (c27235jrP.getVisibility() == 0) {
                        iKQ ikq6 = this.KWHzl.AEQbTJ;
                        if (ikq6 == null) {
                            Intrinsics.gEmmrt("");
                            ikq6 = null;
                        }
                        float fCopydefault2 = ikq6.AEQbTJ.copydefault();
                        iKQ ikq7 = this.KWHzl.AEQbTJ;
                        if (ikq7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            ikq = ikq7;
                        }
                        fMin = Math.min(fMin, fCopydefault2 - (ikq.fJNWhG.KWHzl() * 2));
                    }
                    this.KWHzl.djBIcL = new BigDecimal(String.valueOf(this.KWHzl.EZpvd(fMin)));
                    this.KWHzl.AEQbTJ(fMin);
                    InvestUniv3PriceChart investUniv3PriceChart = this.KWHzl;
                    BigDecimal bigDecimal = investUniv3PriceChart.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                    investUniv3PriceChart.EZpvd(bigDecimal);
                    AbstractC27236jrQ abstractC27236jrQCopydefault5 = this.KWHzl.copydefault();
                    if (abstractC27236jrQCopydefault5 != null) {
                        InvestUniv3PriceChart investUniv3PriceChart2 = this.KWHzl;
                        BigDecimal bigDecimal2 = investUniv3PriceChart2.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
                        BigDecimal bigDecimal3 = investUniv3PriceChart2.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
                        abstractC27236jrQCopydefault5.EZpvd(new C27315jsq(bigDecimal2, abstractC27236jrQCopydefault5.AEQbTJ(bigDecimal3, y < 0.0f)));
                    }
                } else {
                    float fCopydefault3 = this.copydefault.copydefault();
                    iKQ ikq8 = this.KWHzl.AEQbTJ;
                    if (ikq8 == null) {
                        Intrinsics.gEmmrt("");
                        ikq8 = null;
                    }
                    float height2 = ikq8.fARcdN.getHeight();
                    iKQ ikq9 = this.KWHzl.AEQbTJ;
                    if (ikq9 == null) {
                        Intrinsics.gEmmrt("");
                        ikq9 = null;
                    }
                    float fMin2 = Math.min(fCopydefault3 + y, height2 - ikq9.AEQbTJ.KWHzl());
                    iKQ ikq10 = this.KWHzl.AEQbTJ;
                    if (ikq10 == null) {
                        Intrinsics.gEmmrt("");
                        ikq10 = null;
                    }
                    float fMax2 = Math.max(fMin2, ikq10.AEQbTJ.KWHzl());
                    iKQ ikq11 = this.KWHzl.AEQbTJ;
                    if (ikq11 == null) {
                        Intrinsics.gEmmrt("");
                        ikq11 = null;
                    }
                    C27235jrP c27235jrP2 = ikq11.fJNWhG;
                    Intrinsics.checkNotNullExpressionValue(c27235jrP2, "");
                    if (c27235jrP2.getVisibility() == 0) {
                        iKQ ikq12 = this.KWHzl.AEQbTJ;
                        if (ikq12 == null) {
                            Intrinsics.gEmmrt("");
                            ikq12 = null;
                        }
                        float fCopydefault4 = ikq12.fJNWhG.copydefault();
                        iKQ ikq13 = this.KWHzl.AEQbTJ;
                        if (ikq13 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            ikq = ikq13;
                        }
                        fMax2 = Math.max(fMax2, fCopydefault4 + (ikq.AEQbTJ.KWHzl() * 2));
                    }
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(Float.valueOf(this.KWHzl.EZpvd(fMax2)));
                    if (bigDecimalEZpvd.compareTo(BigDecimal.ZERO) <= 0) {
                        return true;
                    }
                    this.KWHzl.AhwBna = bigDecimalEZpvd;
                    this.KWHzl.copydefault(fMax2);
                    InvestUniv3PriceChart investUniv3PriceChart3 = this.KWHzl;
                    BigDecimal bigDecimal4 = investUniv3PriceChart3.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(bigDecimal4, "");
                    investUniv3PriceChart3.OLrzqt(bigDecimal4);
                    AbstractC27236jrQ abstractC27236jrQCopydefault6 = this.KWHzl.copydefault();
                    if (abstractC27236jrQCopydefault6 != null) {
                        InvestUniv3PriceChart investUniv3PriceChart4 = this.KWHzl;
                        BigDecimal bigDecimal5 = investUniv3PriceChart4.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(bigDecimal5, "");
                        BigDecimal bigDecimal6 = investUniv3PriceChart4.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(bigDecimal6, "");
                        abstractC27236jrQCopydefault6.copydefault(new C27315jsq(bigDecimal5, abstractC27236jrQCopydefault6.AEQbTJ(bigDecimal6, y < 0.0f)));
                    }
                }
            }
            return true;
        }
    }

    public void AEQbTJ(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.AhwBna = c27315jsq.EZpvd();
        valueOf();
    }

    public void KWHzl(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.djBIcL = c27315jsq.EZpvd();
        valueOf();
    }

    public void copydefault(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.OLrzqt = bigDecimal;
        AYXKKw();
        valueOf();
        gEmmrt();
    }

    private final void gEmmrt() {
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ImageView imageView = ikq.copydefault;
        float fKWHzl = KWHzl(this.OLrzqt.floatValue());
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq3;
        }
        imageView.setY(fKWHzl - (ikq2.copydefault.getHeight() / 2));
    }

    public final void AEQbTJ(float f) {
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        C27235jrP c27235jrP = ikq.fJNWhG;
        this.fetchVPNInfo = f < 0.0f;
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq3;
        }
        this.values = f > ((float) ikq2.fARcdN.getHeight());
        Intrinsics.copydefault(c27235jrP);
        c27235jrP.setVisibility((this.fetchVPNInfo || this.values) ? 8 : 0);
        c27235jrP.setY(f - c27235jrP.AEQbTJ());
        if (c27235jrP.OLrzqt() == 0 && c27235jrP.getY() < 0.0f) {
            c27235jrP.setFlagDirection(1);
            c27235jrP.setTranslationZ(99.0f);
        } else {
            if (c27235jrP.OLrzqt() != 1 || c27235jrP.getY() <= 0.0f) {
                return;
            }
            c27235jrP.setFlagDirection(0);
            c27235jrP.setTranslationZ(100.0f);
        }
    }

    public final void copydefault(float f) {
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        C27235jrP c27235jrP = ikq.AEQbTJ;
        this.copydefault = f < 0.0f;
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
            ikq3 = null;
        }
        this.EZpvd = f > ((float) ikq3.fARcdN.getHeight());
        Intrinsics.copydefault(c27235jrP);
        c27235jrP.setVisibility((this.copydefault || this.EZpvd) ? 8 : 0);
        c27235jrP.setY(f - c27235jrP.AEQbTJ());
        if (c27235jrP.OLrzqt() == 1) {
            float y = c27235jrP.getY();
            float height = c27235jrP.getHeight();
            iKQ ikq4 = this.AEQbTJ;
            if (ikq4 == null) {
                Intrinsics.gEmmrt("");
                ikq4 = null;
            }
            if (y + height > ikq4.fARcdN.getHeight()) {
                c27235jrP.setFlagDirection(0);
                c27235jrP.setTranslationZ(99.0f);
                return;
            }
        }
        if (c27235jrP.OLrzqt() == 0) {
            float y2 = c27235jrP.getY();
            float height2 = c27235jrP.getHeight();
            iKQ ikq5 = this.AEQbTJ;
            if (ikq5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikq2 = ikq5;
            }
            if (y2 + height2 < ikq2.fARcdN.getHeight()) {
                c27235jrP.setFlagDirection(1);
                c27235jrP.setTranslationZ(100.0f);
            }
        }
    }

    public final void EZpvd(BigDecimal bigDecimal) {
        if (Intrinsics.EZpvd(this.OLrzqt, BigDecimal.ZERO)) {
            return;
        }
        BigDecimal bigDecimal2 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        BigDecimal bigDecimal3 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        String percent$default = pTB.formatPercent$default(bigDecimalDivide, C33129mqd.AEQbTJ(bigDecimalDivide.abs(), Double.valueOf(0.1d)) ? 1 : 2, 0, RoundingMode.HALF_UP, null, 8, null);
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ikq.fJNWhG.setText(percent$default);
    }

    public final void OLrzqt(BigDecimal bigDecimal) {
        if (Intrinsics.EZpvd(this.OLrzqt, BigDecimal.ZERO)) {
            return;
        }
        BigDecimal bigDecimal2 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        BigDecimal bigDecimal3 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        String percent$default = pTB.formatPercent$default(bigDecimalDivide, C33129mqd.AEQbTJ(bigDecimalDivide.abs(), Double.valueOf(0.1d)) ? 1 : 2, 0, RoundingMode.HALF_UP, null, 8, null);
        iKQ ikq = this.AEQbTJ;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ikq.AEQbTJ.setText(percent$default);
    }

    private final void djBIcL() {
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        ImageView imageView = ikq.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility((this.fetchVPNInfo || this.copydefault) ? 0 : 8);
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq3;
        }
        ImageView imageView2 = ikq2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility((this.values || this.EZpvd) ? 0 : 8);
    }

    private final void AYXKKw() {
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        float axisMinimum = ikq.isConnected.getAxisLeft().getAxisMinimum();
        iKQ ikq3 = this.AEQbTJ;
        if (ikq3 == null) {
            Intrinsics.gEmmrt("");
            ikq3 = null;
        }
        float f = 3;
        float f2 = ikq3.isConnected.getAxisLeft().mAxisRange / f;
        float f3 = (f * f2) + axisMinimum;
        float f4 = (2 * f2) + axisMinimum;
        float f5 = (1 * f2) + axisMinimum;
        float f6 = (f2 * 0) + axisMinimum;
        iKQ ikq4 = this.AEQbTJ;
        if (ikq4 == null) {
            Intrinsics.gEmmrt("");
            ikq4 = null;
        }
        ikq4.valueOf.setText(KWHzl(C33129mqd.EZpvd(Float.valueOf(f3))));
        iKQ ikq5 = this.AEQbTJ;
        if (ikq5 == null) {
            Intrinsics.gEmmrt("");
            ikq5 = null;
        }
        ikq5.AYXKKw.setText(KWHzl(C33129mqd.EZpvd(Float.valueOf(f4))));
        iKQ ikq6 = this.AEQbTJ;
        if (ikq6 == null) {
            Intrinsics.gEmmrt("");
            ikq6 = null;
        }
        ikq6.gEmmrt.setText(KWHzl(C33129mqd.EZpvd(Float.valueOf(f5))));
        iKQ ikq7 = this.AEQbTJ;
        if (ikq7 == null) {
            Intrinsics.gEmmrt("");
            ikq7 = null;
        }
        ikq7.AhwBna.setText(KWHzl(C33129mqd.EZpvd(Float.valueOf(f6))));
        iKQ ikq8 = this.AEQbTJ;
        if (ikq8 == null) {
            Intrinsics.gEmmrt("");
            ikq8 = null;
        }
        TextView textView = ikq8.djBIcL;
        BigDecimal bigDecimalMultiply = C33129mqd.EZpvd(Float.valueOf(f3)).multiply(this.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        textView.setText(AEQbTJ(bigDecimalMultiply));
        iKQ ikq9 = this.AEQbTJ;
        if (ikq9 == null) {
            Intrinsics.gEmmrt("");
            ikq9 = null;
        }
        TextView textView2 = ikq9.fetchVPNInfo;
        BigDecimal bigDecimalMultiply2 = C33129mqd.EZpvd(Float.valueOf(f4)).multiply(this.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "");
        textView2.setText(AEQbTJ(bigDecimalMultiply2));
        iKQ ikq10 = this.AEQbTJ;
        if (ikq10 == null) {
            Intrinsics.gEmmrt("");
            ikq10 = null;
        }
        TextView textView3 = ikq10.AkhnZx;
        BigDecimal bigDecimalMultiply3 = C33129mqd.EZpvd(Float.valueOf(f5)).multiply(this.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "");
        textView3.setText(AEQbTJ(bigDecimalMultiply3));
        iKQ ikq11 = this.AEQbTJ;
        if (ikq11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq11;
        }
        TextView textView4 = ikq2.DbNXlk;
        BigDecimal bigDecimalMultiply4 = C33129mqd.EZpvd(Float.valueOf(f6)).multiply(this.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "");
        textView4.setText(AEQbTJ(bigDecimalMultiply4));
    }

    public final String KWHzl(BigDecimal bigDecimal) {
        return C27586jxw.localizeCryptoPrice$default(C27586jxw.OLrzqt, bigDecimal, false, null, null, 12, null);
    }

    public final String AEQbTJ(BigDecimal bigDecimal) {
        return C27586jxw.localizeCryptoPrice$default(C27586jxw.OLrzqt, bigDecimal, false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        boolean z;
        iKQ ikq = this.AEQbTJ;
        iKQ ikq2 = null;
        if (ikq == null) {
            Intrinsics.gEmmrt("");
            ikq = null;
        }
        C27235jrP c27235jrP = ikq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c27235jrP, "");
        if (c27235jrP.getVisibility() != 0) {
            z = false;
        } else {
            iKQ ikq3 = this.AEQbTJ;
            if (ikq3 == null) {
                Intrinsics.gEmmrt("");
                ikq3 = null;
            }
            C27235jrP c27235jrP2 = ikq3.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c27235jrP2, "");
            if (c27235jrP2.getVisibility() == 0) {
                iKQ ikq4 = this.AEQbTJ;
                if (ikq4 == null) {
                    Intrinsics.gEmmrt("");
                    ikq4 = null;
                }
                float fCopydefault = ikq4.AEQbTJ.copydefault();
                iKQ ikq5 = this.AEQbTJ;
                if (ikq5 == null) {
                    Intrinsics.gEmmrt("");
                    ikq5 = null;
                }
                float fCopydefault2 = ikq5.fJNWhG.copydefault();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (fCopydefault - fCopydefault2 <= C55298xhM.copydefault(24.0f, r4)) {
                    z = true;
                }
            }
        }
        iKQ ikq6 = this.AEQbTJ;
        if (ikq6 == null) {
            Intrinsics.gEmmrt("");
            ikq6 = null;
        }
        ikq6.fJNWhG.setHotArea(z);
        iKQ ikq7 = this.AEQbTJ;
        if (ikq7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikq2 = ikq7;
        }
        ikq2.AEQbTJ.setHotArea(z);
    }
}
