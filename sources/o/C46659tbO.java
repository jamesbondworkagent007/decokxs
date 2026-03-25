package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46659tbO extends MarkerView implements InterfaceC34851nkJ {
    public final android.graphics.Paint AEQbTJ;
    public Entry AYXKKw;
    public int AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public float KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.LinearLayout djBIcL;
    public java.lang.String fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final android.widget.TextView isConnected;
    public float valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34851nkJ
    public void setResId(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34851nkJ
    public void setType(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fIwbmz = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46659tbO(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.OuxcSI);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = -1.0f;
        this.valueOf = -1.0f;
        this.values = findViewById(qZH.StateListAnimator.QhsCdEQhsCdE);
        this.gEmmrt = findViewById(qZH.StateListAnimator.hrnhsO);
        this.copydefault = findViewById(qZH.StateListAnimator.ixgjPv);
        this.EZpvd = findViewById(qZH.StateListAnimator.zblBkD);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.OLrzqt = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.AEQbTJ = paint2;
        this.fJNWhG = (android.widget.TextView) findViewById(qZH.StateListAnimator.QTtQrx);
        this.DbNXlk = (android.widget.TextView) findViewById(qZH.StateListAnimator.SUwuXE);
        this.AkhnZx = (android.widget.TextView) findViewById(qZH.StateListAnimator.RjCdvp);
        this.isConnected = (android.widget.TextView) findViewById(qZH.StateListAnimator.onAvailable);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(qZH.StateListAnimator.hTAtCx);
        this.AhwBna = qZH.PendingIntent.ORxRYg;
        this.fIwbmz = "USD";
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.fTEjYi);
        this.djBIcL = linearLayout;
        paint.setColor(context.getResources().getColor(C52761wXj.Activity.DGgkXd));
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.QKudOq));
        if (C55296xhK.OLrzqt(context)) {
            linearLayout.setLayoutDirection(C55296xhK.AEQbTJ(context));
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        Entry entry2;
        Entry entry3;
        Entry entry4;
        Entry entry5;
        java.lang.String roundToFixed$default;
        java.lang.String roundToFixed$default2;
        Entry entry6;
        java.lang.String roundToFixed$default3;
        java.lang.String strDivS$default;
        java.lang.String str;
        try {
            IDataSet dataSetByIndex = getChartView().getData().getDataSetByIndex(0);
            Intrinsics.copydefault(dataSetByIndex, "");
            LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
            IDataSet dataSetByIndex2 = getChartView().getData().getDataSetByIndex(1);
            Intrinsics.copydefault(dataSetByIndex2, "");
            IDataSet dataSetByIndex3 = getChartView().getData().getDataSetByIndex(2);
            Intrinsics.copydefault(dataSetByIndex3, "");
            LineDataSet lineDataSet2 = (LineDataSet) dataSetByIndex3;
            java.util.List<T> values = ((LineDataSet) dataSetByIndex2).getValues();
            if (values != 0) {
                Intrinsics.copydefault(entry);
                entry2 = (Entry) values.get((int) entry.getX());
            } else {
                entry2 = null;
            }
            java.util.List<T> values2 = lineDataSet2.getValues();
            if (values2 != 0) {
                Intrinsics.copydefault(entry);
                entry3 = (Entry) values2.get((int) entry.getX());
            } else {
                entry3 = null;
            }
            java.util.List<T> values3 = lineDataSet.getValues();
            if (values3 != 0) {
                Intrinsics.copydefault(entry);
                entry4 = (Entry) values3.get((int) entry.getX());
            } else {
                entry4 = null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) "USD")) {
                if (entry3 != null) {
                    android.widget.TextView textView = this.DbNXlk;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    java.lang.String str2 = C46656tbL.EZpvd(context, qZH.PendingIntent.OcIXYQ) + ":";
                    BigDecimal bigDecimalOLrzqt = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry3.getY()));
                    entry5 = entry2;
                    java.lang.String roundToFixed$default4 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt, OLrzqt(bigDecimalOLrzqt.doubleValue()), null, 2, null);
                    arrayList.add(new Triple(textView, str2, ((java.lang.Object) roundToFixed$default4) + " " + ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX()));
                } else {
                    entry5 = entry2;
                }
                if (entry4 != null) {
                    android.widget.TextView textView2 = this.isConnected;
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    java.lang.String str3 = C46656tbL.EZpvd(context2, qZH.PendingIntent.QOLQEE) + ":";
                    BigDecimal bigDecimalOLrzqt2 = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry4.getY()));
                    str = " ";
                    java.lang.String roundToFixed$default5 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt2, OLrzqt(bigDecimalOLrzqt2.doubleValue()), null, 2, null);
                    arrayList.add(new Triple(textView2, str3, ((java.lang.Object) roundToFixed$default5) + str + ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX()));
                } else {
                    str = " ";
                }
                if (entry5 != null) {
                    android.widget.TextView textView3 = this.AkhnZx;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    java.lang.String str4 = C46656tbL.EZpvd(context3, this.AhwBna) + ":";
                    BigDecimal bigDecimalOLrzqt3 = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry5.getY()));
                    java.lang.String roundToFixed$default6 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt3, OLrzqt(bigDecimalOLrzqt3.doubleValue()), null, 2, null);
                    arrayList.add(new Triple(textView3, str4, ((java.lang.Object) roundToFixed$default6) + str + ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX()));
                }
                entry6 = entry3;
            } else {
                entry5 = entry2;
                if (entry3 == null) {
                    roundToFixed$default = "";
                } else {
                    BigDecimal bigDecimalOLrzqt4 = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry3.getY()));
                    roundToFixed$default = pTB.formatRoundToFixed$default(bigDecimalOLrzqt4, OLrzqt(bigDecimalOLrzqt4.doubleValue()), null, 2, null);
                }
                if (entry4 == null) {
                    roundToFixed$default2 = "";
                } else {
                    BigDecimal bigDecimalOLrzqt5 = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry4.getY()));
                    roundToFixed$default2 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt5, OLrzqt(bigDecimalOLrzqt5.doubleValue()), null, 2, null);
                }
                if (entry5 == null) {
                    entry6 = entry3;
                    roundToFixed$default3 = "";
                } else {
                    BigDecimal bigDecimalOLrzqt6 = xMR.copydefault.OLrzqt(java.lang.Float.valueOf(entry5.getY()));
                    entry6 = entry3;
                    roundToFixed$default3 = pTB.formatRoundToFixed$default(bigDecimalOLrzqt6, OLrzqt(bigDecimalOLrzqt6.doubleValue()), null, 2, null);
                }
                android.widget.TextView textView4 = this.DbNXlk;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                java.lang.String str5 = C46656tbL.EZpvd(context4, qZH.PendingIntent.OcIXYQ) + ":";
                java.lang.String str6 = this.fIwbmz;
                android.widget.TextView textView5 = this.isConnected;
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                java.lang.String str7 = C46656tbL.EZpvd(context5, qZH.PendingIntent.QOLQEE) + ":";
                java.lang.String str8 = this.fIwbmz;
                android.widget.TextView textView6 = this.AkhnZx;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                arrayList.addAll(yDY.gEmmrt(new Triple(textView4, str5, roundToFixed$default + " " + str6), new Triple(textView5, str7, roundToFixed$default2 + " " + str8), new Triple(textView6, C46656tbL.EZpvd(context6, this.AhwBna) + ":", roundToFixed$default3 + " " + this.fIwbmz)));
            }
            this.fJNWhG.setText(pTA.format$default(new Date(C33129mqd.valueOf(entry5 != null ? entry5.getData() : null)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
            if (highlight != null) {
                this.KWHzl = highlight.getDrawX();
                this.valueOf = highlight.getDrawY();
            }
            android.widget.TextView textView7 = this.fetchVPNInfo;
            java.lang.String str9 = C33070mpX.AYXKKw(qZH.PendingIntent.UCQKYV) + ":";
            xMR xmr = xMR.copydefault;
            if (entry4 != null) {
                strDivS$default = C33129mqd.divS$default(java.lang.Float.valueOf(entry4.getY()), entry6 != null ? java.lang.Float.valueOf(entry6.getY()) : "", null, null, null, 14, null);
            } else {
                strDivS$default = null;
            }
            arrayList.add(new Triple(textView7, str9, pTB.formatPercent$default(C33129mqd.EZpvd(xmr.OLrzqt((java.lang.Object) strDivS$default)), 3, null, 2, null)));
            C35145npm.EZpvd(arrayList);
            try {
                this.AYXKKw = entry;
                measure(0, 0);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                ViewGroup.LayoutParams layoutParams = this.copydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams3 = this.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                ViewGroup.LayoutParams layoutParams5 = this.values.getLayoutParams();
                Intrinsics.copydefault(layoutParams5, "");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                ViewGroup.LayoutParams layoutParams7 = this.gEmmrt.getLayoutParams();
                Intrinsics.copydefault(layoutParams7, "");
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                copydefault(layoutParams2);
                copydefault(layoutParams4);
                copydefault(layoutParams6);
                copydefault(layoutParams8);
                if (this.KWHzl + measuredWidth > getChartView().getWidth()) {
                    layoutParams2.leftMargin = (int) (this.KWHzl - ((getChartView().getWidth() - getMeasuredWidth()) + measuredWidth));
                    layoutParams4.leftMargin = (int) (this.KWHzl - ((getChartView().getWidth() - getMeasuredWidth()) + measuredWidth));
                    layoutParams6.leftMargin = (int) (this.KWHzl - ((getChartView().getWidth() - getMeasuredWidth()) + measuredWidth));
                    layoutParams8.leftMargin = (int) (this.KWHzl - ((getChartView().getWidth() - getMeasuredWidth()) + measuredWidth));
                }
                float f = this.KWHzl;
                if (f - measuredWidth < 0.0f) {
                    int i = (int) (measuredWidth - f);
                    layoutParams2.rightMargin = i;
                    layoutParams4.rightMargin = i;
                    layoutParams6.rightMargin = i;
                    layoutParams8.rightMargin = i;
                }
                this.copydefault.setLayoutParams(layoutParams2);
                this.EZpvd.setLayoutParams(layoutParams4);
                this.values.setLayoutParams(layoutParams6);
                this.gEmmrt.setLayoutParams(layoutParams8);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        float fAEQbTJ;
        float f = -(getWidth() / 2.0f);
        if ((getChartView().getHeight() - this.valueOf) - getHeight() < 0.0f) {
            this.copydefault.setVisibility(4);
            this.values.setVisibility(4);
            this.EZpvd.setVisibility(0);
            this.gEmmrt.setVisibility(0);
            float height = getHeight();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            fAEQbTJ = -(height - C33052mpF.AEQbTJ(6.0f, context));
        } else {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            fAEQbTJ = C33052mpF.AEQbTJ(-6.0f, context2);
            this.copydefault.setVisibility(0);
            this.values.setVisibility(0);
            this.EZpvd.setVisibility(4);
            this.gEmmrt.setVisibility(4);
        }
        return new MPPointF(f, fAEQbTJ);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Entry entry;
        try {
            if (this.AYXKKw != null) {
                IDataSet dataSetByIndex = getChartView().getData().getDataSetByIndex(2);
                Intrinsics.copydefault(dataSetByIndex, "");
                LineDataSet lineDataSet = (LineDataSet) dataSetByIndex;
                java.util.List<T> values = lineDataSet.getValues();
                if (values != 0) {
                    Entry entry2 = this.AYXKKw;
                    Intrinsics.copydefault(entry2);
                    entry = (Entry) values.get((int) entry2.getX());
                } else {
                    entry = null;
                }
                if (entry != null) {
                    Chart chartView = getChartView();
                    Intrinsics.copydefault(chartView, "");
                    MPPointD pixelForValues = ((LineChart) chartView).getTransformer(lineDataSet.getAxisDependency()).getPixelForValues(entry.getX(), entry.getY());
                    if (canvas != null) {
                        float f3 = (float) pixelForValues.x;
                        float f4 = (float) pixelForValues.y;
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        canvas.drawCircle(f3, f4, C33052mpF.AEQbTJ(6.0f, context), this.OLrzqt);
                    }
                    if (canvas != null) {
                        float f5 = (float) pixelForValues.x;
                        float f6 = (float) pixelForValues.y;
                        android.content.Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        canvas.drawCircle(f5, f6, C33052mpF.AEQbTJ(4.0f, context2), this.AEQbTJ);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        super.draw(canvas, f, f2);
    }

    public final void copydefault(LinearLayout.LayoutParams layoutParams) {
        layoutParams.gravity = 1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    public final int OLrzqt(double d) {
        return C54573xNj.copydefault.AEQbTJ(d);
    }
}
