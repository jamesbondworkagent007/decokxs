package o;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mYx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32354mYx implements OnChartValueSelectedListener {
    public final android.view.ViewGroup EZpvd;
    public final LineChart KWHzl;
    public final java.util.Map<java.lang.String, java.util.List<C32349mYs>> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<o.mYs>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32354mYx(@NotNull LineChart lineChart, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<C32349mYs>> map, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.KWHzl = lineChart;
        this.copydefault = map;
        this.EZpvd = viewGroup;
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onValueSelected(Entry entry, Highlight highlight) {
        Map.Entry entry2;
        java.util.List list;
        if (entry == null || highlight == null || (entry2 = (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(this.copydefault.entrySet())) == null || (list = (java.util.List) entry2.getValue()) == null || ((int) entry.getX()) >= list.size()) {
            return;
        }
        copydefault(entry.getX());
        copydefault(KWHzl((int) entry.getX()));
        this.EZpvd.setVisibility(0);
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onNothingSelected() {
        AEQbTJ();
        this.EZpvd.setVisibility(8);
    }

    private final java.util.Map<java.lang.String, C32349mYs> KWHzl(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C32349mYs>> entry : this.copydefault.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<C32349mYs> value = entry.getValue();
            if (i < value.size()) {
                linkedHashMap.put(key, value.get(i));
            }
        }
        return linkedHashMap;
    }

    private final void copydefault(float f) {
        XAxis xAxis = this.KWHzl.getXAxis();
        xAxis.removeAllLimitLines();
        LimitLine limitLine = new LimitLine(f);
        limitLine.setLineColor(mUM.copydefault(C52761wXj.Activity.ORxRYg));
        limitLine.setLineWidth(0.5f);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        xAxis.addLimitLine(limitLine);
        this.KWHzl.invalidate();
    }

    private final void AEQbTJ() {
        this.KWHzl.getXAxis().removeAllLimitLines();
        this.KWHzl.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [92=9] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void copydefault(java.util.Map<java.lang.String, C32349mYs> map) {
        java.lang.String strKWHzl;
        C32349mYs c32349mYs = (C32349mYs) CollectionsKt___CollectionsKt.RcXXUw(map.values());
        if (c32349mYs == null || (strKWHzl = c32349mYs.KWHzl()) == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.getMaxVolume);
        if (textView != null) {
            textView.setText(strKWHzl);
        }
        for (Map.Entry<java.lang.String, C32349mYs> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            C32349mYs value = entry.getValue();
            java.lang.String str = "--";
            switch (key.hashCode()) {
                case -1784222564:
                    if (key.equals("Top100")) {
                        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.AEQbTJ())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default = C32163mRv.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView2 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.createCallback);
                        if (textView2 != null) {
                            textView2.setText(iCUCompact$default + " (" + percent$default + ")");
                        }
                    }
                    break;
                case -1109742445:
                    if (key.equals("holding10u")) {
                        java.lang.String iCUCompact$default2 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.AEQbTJ())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        if (iCUCompact$default2 != null && iCUCompact$default2.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default2)) {
                            str = iCUCompact$default2;
                        }
                        ((android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.getStarRating)).setText(str);
                    }
                    break;
                case 99349:
                    if (key.equals("dev")) {
                        java.lang.String percentWithoutSymbol$default = C32163mRv.formatPercentWithoutSymbol$default(value.AEQbTJ(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView3 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.MediaMetadataCompatLongKey);
                        if (textView3 != null) {
                            textView3.setText(percentWithoutSymbol$default);
                        }
                    }
                    break;
                case 80991764:
                    if (key.equals("Top10")) {
                        java.lang.String iCUCompact$default3 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.AEQbTJ())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default2 = C32163mRv.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView4 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.getAudioAttributes);
                        if (textView4 != null) {
                            textView4.setText(iCUCompact$default3 + " (" + percent$default2 + ")");
                        }
                    }
                    break;
                case 80991888:
                    if (key.equals("Top50")) {
                        java.lang.String iCUCompact$default4 = pTB.formatICUCompact$default(java.lang.Float.valueOf(C33129mqd.djBIcL(value.AEQbTJ())), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
                        java.lang.String percent$default3 = C32163mRv.formatPercent$default(value.EZpvd(), false, 0, 0, null, null, 30, null);
                        android.widget.TextView textView5 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.toLegacyStreamType);
                        if (textView5 != null) {
                            textView5.setText(iCUCompact$default4 + " (" + percent$default3 + ")");
                        }
                    }
                    break;
                case 133626717:
                    if (key.equals("suspicious")) {
                        java.lang.String percentWithoutSymbol$default2 = C32163mRv.formatPercentWithoutSymbol$default(value.AEQbTJ(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView6 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatCallbackStubApi21);
                        if (textView6 != null) {
                            textView6.setText(percentWithoutSymbol$default2);
                        }
                    }
                    break;
                case 1091758151:
                    if (key.equals("holders")) {
                        java.lang.Float fFIwbmz = C59443zhD.fIwbmz(value.AEQbTJ());
                        java.lang.String iCUCompact$default5 = fFIwbmz != null ? pTB.formatICUCompact$default(fFIwbmz, null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null) : null;
                        if (iCUCompact$default5 != null && iCUCompact$default5.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iCUCompact$default5)) {
                            str = iCUCompact$default5;
                        }
                        ((android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.fromMediaDescription)).setText(str);
                    }
                    break;
                case 1926314391:
                    if (key.equals("avgPrice")) {
                        java.lang.String strOLrzqt = mRJ.AEQbTJ.OLrzqt(value.AEQbTJ(), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
                        if (strOLrzqt != null && strOLrzqt.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                            str = strOLrzqt;
                        }
                        android.widget.TextView textView7 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.setDescription);
                        if (textView7 != null) {
                            textView7.setText(str);
                        }
                    }
                    break;
                case 1957244918:
                    if (key.equals("insider")) {
                        java.lang.String percentWithoutSymbol$default3 = C32163mRv.formatPercentWithoutSymbol$default(value.AEQbTJ(), false, 0, new BigDecimal(0.01d), false, null, 27, null);
                        android.widget.TextView textView8 = (android.widget.TextView) this.EZpvd.findViewById(C35964oKf.StateListAnimator.isRated);
                        if (textView8 != null) {
                            textView8.setText(percentWithoutSymbol$default3);
                        }
                    }
                    break;
            }
        }
    }
}
