package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.dexkline.dexlogic.utils.amountformat.PrecisionTypes;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mYF extends android.widget.FrameLayout {
    public final java.util.List<java.lang.Integer> AhwBna;
    public final oNO EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.Boolean> OLrzqt;
    public java.util.Map<java.lang.String, java.util.List<C32349mYs>> copydefault;
    public final java.util.Map<java.lang.String, LineDataSet> djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mYF(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:37) call: o.mYF.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mYF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mYF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        oNO onoCopydefault = oNO.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(onoCopydefault, "");
        this.EZpvd = onoCopydefault;
        this.AhwBna = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.RlQdEF), java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr), java.lang.Integer.valueOf(C52761wXj.Activity.OqFWZa));
        this.KWHzl = yDY.gEmmrt("Top10", "Top50", "Top100");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.OLrzqt = C56424yEw.djBIcL(C56390yDp.OLrzqt("Top10", bool), C56390yDp.OLrzqt("Top50", bool), C56390yDp.OLrzqt("Top100", bool));
        this.djBIcL = new LinkedHashMap();
        this.copydefault = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        oNO ono = this.EZpvd;
        ono.values.setOnClickListener(new View.OnClickListener() { // from class: o.mYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.EZpvd("Top10");
            }
        });
        ono.fARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.mYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.KWHzl.EZpvd("Top50");
            }
        });
        ono.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: o.mYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.EZpvd("Top100");
            }
        });
    }

    public final void EZpvd(java.lang.String str) {
        java.lang.Boolean bool = this.OLrzqt.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.OLrzqt.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.djBIcL.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            OLrzqt(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.OLrzqt.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.EZpvd.OLrzqt.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.EZpvd.OLrzqt.setVisibility(8);
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -1784222564) {
                if (iHashCode != 80991764) {
                    if (iHashCode == 80991888 && str.equals("Top50")) {
                        Group group = this.EZpvd.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(z ? 0 : 8);
                    }
                } else if (str.equals("Top10")) {
                    Group group2 = this.EZpvd.valueOf;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(z ? 0 : 8);
                }
            } else if (str.equals("Top100")) {
                Group group3 = this.EZpvd.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(group3, "");
                group3.setVisibility(z ? 0 : 8);
            }
            this.EZpvd.DbNXlk.invalidate();
        }
    }

    public final void OLrzqt(java.lang.String str, boolean z) {
        int iEZpvd;
        int iEZpvd2;
        int iEZpvd3;
        int iCopydefault = mUM.copydefault(C52761wXj.Activity.UlJrfe);
        int iHashCode = str.hashCode();
        if (iHashCode == -1784222564) {
            if (str.equals("Top100")) {
                if (z) {
                    int iIntValue = this.AhwBna.get(2).intValue();
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iEZpvd = mUM.EZpvd(iIntValue, context);
                } else {
                    iEZpvd = iCopydefault;
                }
                this.EZpvd.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd));
                this.EZpvd.fJNWhG.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.QwvEab) : iCopydefault);
                this.EZpvd.AuCTelauCTel.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.fdOvFl) : iCopydefault);
                AppCompatTextView appCompatTextView = this.EZpvd.zLjUOn;
                if (z) {
                    iCopydefault = mUM.copydefault(C52761wXj.Activity.QwvEab);
                }
                appCompatTextView.setTextColor(iCopydefault);
                return;
            }
            return;
        }
        if (iHashCode == 80991764) {
            if (str.equals("Top10")) {
                if (z) {
                    int iIntValue2 = this.AhwBna.get(2).intValue();
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iEZpvd2 = mUM.EZpvd(iIntValue2, context2);
                } else {
                    iEZpvd2 = iCopydefault;
                }
                this.EZpvd.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd2));
                this.EZpvd.AuCTel.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.QwvEab) : iCopydefault);
                this.EZpvd.hDKMBd.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.fdOvFl) : iCopydefault);
                AppCompatTextView appCompatTextView2 = this.EZpvd.iwGUEr;
                if (z) {
                    iCopydefault = mUM.copydefault(C52761wXj.Activity.QwvEab);
                }
                appCompatTextView2.setTextColor(iCopydefault);
                return;
            }
            return;
        }
        if (iHashCode == 80991888 && str.equals("Top50")) {
            if (z) {
                int iIntValue3 = this.AhwBna.get(2).intValue();
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iEZpvd3 = mUM.EZpvd(iIntValue3, context3);
            } else {
                iEZpvd3 = iCopydefault;
            }
            this.EZpvd.KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iEZpvd3));
            this.EZpvd.uzCIH.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.QwvEab) : iCopydefault);
            this.EZpvd.AwvSrB.setTextColor(z ? mUM.copydefault(C52761wXj.Activity.fdOvFl) : iCopydefault);
            AppCompatTextView appCompatTextView3 = this.EZpvd.AxsJAY;
            if (z) {
                iCopydefault = mUM.copydefault(C52761wXj.Activity.QwvEab);
            }
            appCompatTextView3.setTextColor(iCopydefault);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.neG.formatPercentage$default(android.widget.TextView, java.lang.String, com.okinc.localization.util.format.DisplaySign, java.lang.Float, java.lang.Float, int, java.lang.Object):void */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2, @NotNull java.util.List<ChartDataUIItem> list3) {
        PrecisionTypes precisionTypes;
        LineData lineData;
        ?? r4;
        java.lang.String percentage;
        java.lang.String value;
        ?? r42;
        java.lang.String percentage2;
        java.lang.String value2;
        java.lang.String percentage3;
        java.lang.String value3;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        KWHzl();
        boolean z = list.isEmpty() && list2.isEmpty() && list3.isEmpty();
        C32238mUp c32238mUp = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c32238mUp, "");
        c32238mUp.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.EZpvd.AkhnZx.setVisibility(0);
        this.djBIcL.clear();
        this.copydefault.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData2 = new LineData();
        ConstraintLayout constraintLayout = this.EZpvd.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list.isEmpty()) {
            precisionTypes = null;
            lineData = lineData2;
            KWHzl(list, 0, linkedHashMap2, linkedHashMap, lineData2);
            AppCompatTextView appCompatTextView = this.EZpvd.hDKMBd;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            java.lang.String numberICUWithPrecision$default = (chartDataUIItem == null || (value3 = chartDataUIItem.getValue()) == null) ? null : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, value3, null, 1, null);
            if (numberICUWithPrecision$default == null || numberICUWithPrecision$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default)) {
                numberICUWithPrecision$default = "--";
            }
            appCompatTextView.setText(numberICUWithPrecision$default);
            AppCompatTextView appCompatTextView2 = this.EZpvd.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            ChartDataUIItem chartDataUIItem2 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            C34550neG.formatPercentage$default(appCompatTextView2, (chartDataUIItem2 == null || (percentage3 = chartDataUIItem2.getPercentage()) == null) ? null : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, percentage3, null, 1, null), null, null, null, 14, null);
            this.EZpvd.iwGUEr.setTextColor(mUM.copydefault(C52761wXj.Activity.QwvEab));
        } else {
            precisionTypes = null;
            lineData = lineData2;
        }
        ConstraintLayout constraintLayout2 = this.EZpvd.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group2 = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            KWHzl(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            ?? r0 = this.EZpvd.AwvSrB;
            ChartDataUIItem chartDataUIItem3 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
            ?? numberICUWithPrecision$default2 = (chartDataUIItem3 == null || (value2 = chartDataUIItem3.getValue()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, value2, precisionTypes, 1, precisionTypes);
            if (numberICUWithPrecision$default2 == 0 || numberICUWithPrecision$default2.length() == 0) {
                r42 = "--";
                r0.setText(r42);
                AppCompatTextView appCompatTextView3 = this.EZpvd.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                ChartDataUIItem chartDataUIItem4 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
                C34550neG.formatPercentage$default(appCompatTextView3, (chartDataUIItem4 != null || (percentage2 = chartDataUIItem4.getPercentage()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, percentage2, precisionTypes, 1, precisionTypes), null, null, null, 14, null);
                this.EZpvd.AxsJAY.setTextColor(mUM.copydefault(C52761wXj.Activity.QwvEab));
            } else {
                boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default2);
                r42 = numberICUWithPrecision$default2;
                if (zFARcdN) {
                }
                r0.setText(r42);
                AppCompatTextView appCompatTextView32 = this.EZpvd.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView32, "");
                ChartDataUIItem chartDataUIItem42 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
                if (chartDataUIItem42 != null) {
                    C34550neG.formatPercentage$default(appCompatTextView32, (chartDataUIItem42 != null || (percentage2 = chartDataUIItem42.getPercentage()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, percentage2, precisionTypes, 1, precisionTypes), null, null, null, 14, null);
                    this.EZpvd.AxsJAY.setTextColor(mUM.copydefault(C52761wXj.Activity.QwvEab));
                }
            }
        }
        ConstraintLayout constraintLayout3 = this.EZpvd.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group3 = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        group3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list3.isEmpty()) {
            KWHzl(list3, 2, linkedHashMap2, linkedHashMap, lineData);
            ?? r02 = this.EZpvd.AuCTelauCTel;
            ChartDataUIItem chartDataUIItem5 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
            ?? numberICUWithPrecision$default3 = (chartDataUIItem5 == null || (value = chartDataUIItem5.getValue()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, value, precisionTypes, 1, precisionTypes);
            if (numberICUWithPrecision$default3 == 0 || numberICUWithPrecision$default3.length() == 0) {
                r4 = "--";
                r02.setText(r4);
                AppCompatTextView appCompatTextView4 = this.EZpvd.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                ChartDataUIItem chartDataUIItem6 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
                C34550neG.formatPercentage$default(appCompatTextView4, (chartDataUIItem6 != null || (percentage = chartDataUIItem6.getPercentage()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, percentage, precisionTypes, 1, precisionTypes), null, null, null, 14, null);
                this.EZpvd.zLjUOn.setTextColor(mUM.copydefault(C52761wXj.Activity.QwvEab));
            } else {
                boolean zFARcdN2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default3);
                r4 = numberICUWithPrecision$default3;
                if (zFARcdN2) {
                }
                r02.setText(r4);
                AppCompatTextView appCompatTextView42 = this.EZpvd.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView42, "");
                ChartDataUIItem chartDataUIItem62 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
                if (chartDataUIItem62 != null) {
                    C34550neG.formatPercentage$default(appCompatTextView42, (chartDataUIItem62 != null || (percentage = chartDataUIItem62.getPercentage()) == null) ? precisionTypes : mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, percentage, precisionTypes, 1, precisionTypes), null, null, null, 14, null);
                    this.EZpvd.zLjUOn.setTextColor(mUM.copydefault(C52761wXj.Activity.QwvEab));
                }
            }
        }
        this.copydefault = linkedHashMap;
        this.EZpvd.DbNXlk.setData(lineData);
        OLrzqt(linkedHashMap2);
        copydefault();
        AEQbTJ(linkedHashMap);
    }

    public final void KWHzl(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C32349mYs>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C32349mYs> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            mUK muk = mUK.AEQbTJ;
            java.lang.String strKWHzl = muk.KWHzl(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i2;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strKWHzl);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C32349mYs(muk.copydefault(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i2++;
        }
        map2.put(this.KWHzl.get(i), arrayList2);
        LineDataSet lineDataSetAEQbTJ = AEQbTJ(arrayList, this.KWHzl.get(i), this.AhwBna.get(i).intValue());
        this.djBIcL.put(this.KWHzl.get(i), lineDataSetAEQbTJ);
        java.lang.Boolean bool = this.OLrzqt.get(this.KWHzl.get(i));
        lineDataSetAEQbTJ.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetAEQbTJ);
    }

    public final LineDataSet AEQbTJ(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(mUM.EZpvd(i, context));
        lineDataSet.setHighLightColor(0);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        return lineDataSet;
    }

    public final void OLrzqt(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.EZpvd.DbNXlk.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new ActionBar(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    public static final class ActionBar extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> OLrzqt;

        public ActionBar(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.OLrzqt = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.OLrzqt.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void copydefault() {
        YAxis axisRight = this.EZpvd.DbNXlk.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new mYQ());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(mUM.copydefault(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(mUM.copydefault(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.EZpvd.DbNXlk.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
            axisLeft.setDrawAxisLine(false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void AEQbTJ(java.util.Map<java.lang.String, java.util.List<C32349mYs>> map) {
        LineChart lineChart = this.EZpvd.DbNXlk;
        lineChart.setDragEnabled(true);
        lineChart.setScaleXEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setScaleEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.setTouchEnabled(true);
        lineChart.setHighlightPerTapEnabled(true);
        lineChart.setExtraBottomOffset(5.0f);
        Intrinsics.copydefault(lineChart);
        ConstraintLayout constraintLayout = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C32354mYx(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        mYL myl = new mYL(context);
        myl.setChartView(lineChart);
        lineChart.setMarker(myl);
        myl.setOnDrawMarker(new Function2() { // from class: o.mYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return mYF.AEQbTJ(this.AEQbTJ, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        });
        lineChart.invalidate();
        this.EZpvd.DbNXlk.requestLayout();
    }

    public static final Unit AEQbTJ(final mYF myf, final float f, float f2) {
        final int iDp2px$default = C55298xhM.dp2px$default(5.0f, null, 1, null);
        final ConstraintLayout constraintLayout = myf.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        float fContentLeft = myf.EZpvd.DbNXlk.getViewPortHandler().contentLeft();
        final float fContentRight = fContentLeft + ((myf.EZpvd.DbNXlk.getViewPortHandler().contentRight() - fContentLeft) / 2);
        final Function0 function0 = new Function0() { // from class: o.mYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mYF.AEQbTJ(constraintLayout, f, fContentRight, iDp2px$default, myf);
            }
        };
        if (constraintLayout.getWidth() > 0 && constraintLayout.getHeight() > 0) {
            function0.invoke();
        } else {
            constraintLayout.post(new java.lang.Runnable() { // from class: o.mYI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    mYF.KWHzl(function0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ConstraintLayout constraintLayout, float f, float f2, int i, mYF myf) {
        boolean z;
        float width = constraintLayout.getWidth();
        float height = constraintLayout.getHeight();
        float f3 = f < f2 ? f + i : (f - width) - i;
        float fContentTop = myf.EZpvd.DbNXlk.getViewPortHandler().contentTop();
        float f4 = 2;
        float fContentBottom = (myf.EZpvd.DbNXlk.getViewPortHandler().contentBottom() - fContentTop) / f4;
        float f5 = height / f4;
        float fDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
        constraintLayout.setX(f3);
        constraintLayout.setY(((fContentTop + fContentBottom) - f5) + fDp2px$default);
        java.util.Collection<java.lang.Boolean> collectionValues = myf.OLrzqt.values();
        if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((java.lang.Boolean) it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        constraintLayout.setVisibility(z ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function0 function0) {
        function0.invoke();
    }

    public final void KWHzl() {
        XAxis xAxis = this.EZpvd.DbNXlk.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.EZpvd.OLrzqt.setVisibility(8);
        this.EZpvd.DbNXlk.invalidate();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mYF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
