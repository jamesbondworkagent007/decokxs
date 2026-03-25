package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26094jRs implements OnChartValueSelectedListener {
    public final java.util.Map<java.lang.String, java.util.List<C26093jRr>> AEQbTJ;
    public final LineChart EZpvd;
    public final android.view.ViewGroup copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<o.jRr>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26094jRs(@NotNull LineChart lineChart, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<C26093jRr>> map, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.EZpvd = lineChart;
        this.AEQbTJ = map;
        this.copydefault = viewGroup;
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onValueSelected(Entry entry, Highlight highlight) {
        Map.Entry entry2;
        java.util.List list;
        if (entry == null || highlight == null || (entry2 = (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(this.AEQbTJ.entrySet())) == null || (list = (java.util.List) entry2.getValue()) == null || ((int) entry.getX()) >= list.size()) {
            return;
        }
        AEQbTJ(entry.getX());
        copydefault(EZpvd((int) entry.getX()));
        this.copydefault.setVisibility(0);
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onNothingSelected() {
        copydefault();
        this.copydefault.setVisibility(8);
    }

    public final java.util.Map<java.lang.String, C26093jRr> EZpvd(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C26093jRr>> entry : this.AEQbTJ.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<C26093jRr> value = entry.getValue();
            if (i < value.size()) {
                linkedHashMap.put(key, value.get(i));
            }
        }
        return linkedHashMap;
    }

    public final void AEQbTJ(float f) {
        XAxis xAxis = this.EZpvd.getXAxis();
        xAxis.removeAllLimitLines();
        LimitLine limitLine = new LimitLine(f);
        limitLine.setLineColor(C25382ivf.KWHzl(C52761wXj.Activity.ORxRYg));
        limitLine.setLineWidth(0.5f);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        xAxis.addLimitLine(limitLine);
        this.EZpvd.invalidate();
    }

    private final void copydefault() {
        this.EZpvd.getXAxis().removeAllLimitLines();
        this.EZpvd.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [92=9] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(java.util.Map<java.lang.String, C26093jRr> map) {
        java.lang.String strOLrzqt;
        C26093jRr c26093jRr = (C26093jRr) CollectionsKt___CollectionsKt.RcXXUw(map.values());
        if (c26093jRr == null || (strOLrzqt = c26093jRr.OLrzqt()) == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.createFromXmlInner);
        if (textView != null) {
            textView.setText(strOLrzqt);
        }
        for (Map.Entry<java.lang.String, C26093jRr> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            C26093jRr value = entry.getValue();
            java.lang.String str = "--";
            switch (key.hashCode()) {
                case -1784222564:
                    if (key.equals("Top100")) {
                        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.KWHzl())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default = C23311hvo.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView2 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.newDrawable);
                        if (textView2 != null) {
                            textView2.setText(iCUCompact$default + " (" + percent$default + ")");
                        }
                    }
                    break;
                case -1109742445:
                    if (key.equals("holding10u")) {
                        java.lang.String iCUCompact$default2 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.KWHzl())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        if (iCUCompact$default2 != null && iCUCompact$default2.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default2)) {
                            str = iCUCompact$default2;
                        }
                        ((android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.bindView)).setText(str);
                    }
                    break;
                case 99349:
                    if (key.equals("dev")) {
                        java.lang.String percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(value.KWHzl(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView3 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.onTabUnselected);
                        if (textView3 != null) {
                            textView3.setText(percentWithoutSymbol$default);
                        }
                    }
                    break;
                case 80991764:
                    if (key.equals("Top10")) {
                        java.lang.String iCUCompact$default3 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.KWHzl())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default2 = C23311hvo.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView4 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.getInterpolation);
                        if (textView4 != null) {
                            textView4.setText(iCUCompact$default3 + " (" + percent$default2 + ")");
                        }
                    }
                    break;
                case 80991888:
                    if (key.equals("Top50")) {
                        java.lang.String iCUCompact$default4 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.KWHzl())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default3 = C23311hvo.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView5 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.DrawableContainer);
                        if (textView5 != null) {
                            textView5.setText(iCUCompact$default4 + " (" + percent$default3 + ")");
                        }
                    }
                    break;
                case 133626717:
                    if (key.equals("suspicious")) {
                        java.lang.String percentWithoutSymbol$default2 = C23311hvo.formatPercentWithoutSymbol$default(value.KWHzl(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView6 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.hideForSystem);
                        if (textView6 != null) {
                            textView6.setText(percentWithoutSymbol$default2);
                        }
                    }
                    break;
                case 1091758151:
                    if (key.equals("holders")) {
                        java.lang.Float fFIwbmz = C59443zhD.fIwbmz(value.KWHzl());
                        java.lang.String iCUCompact$default5 = fFIwbmz != null ? pTB.formatICUCompact$default(fFIwbmz, null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null) : null;
                        if (iCUCompact$default5 != null && iCUCompact$default5.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default5)) {
                            str = iCUCompact$default5;
                        }
                        ((android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.NonNull)).setText(str);
                    }
                    break;
                case 1926314391:
                    if (key.equals("avgPrice")) {
                        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, value.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
                        if (scientificCurrency$default != null && scientificCurrency$default.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) scientificCurrency$default)) {
                            str = scientificCurrency$default;
                        }
                        android.widget.TextView textView7 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.RequiresPermissionRead);
                        if (textView7 != null) {
                            textView7.setText(str);
                        }
                    }
                    break;
                case 1957244918:
                    if (key.equals("insider")) {
                        java.lang.String percentWithoutSymbol$default3 = C23311hvo.formatPercentWithoutSymbol$default(value.KWHzl(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView8 = (android.widget.TextView) this.copydefault.findViewById(C23274hvD.Application.getContext);
                        if (textView8 != null) {
                            textView8.setText(percentWithoutSymbol$default3);
                        }
                    }
                    break;
            }
        }
    }
}
