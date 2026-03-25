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
import com.okinc.business.dexlogic.utils.amountformat.PrecisionTypes;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
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

/* JADX INFO: renamed from: o.jRw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26098jRw extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C21468hAm AEQbTJ;
    public final java.util.Map<java.lang.String, LineDataSet> AhwBna;
    public java.util.Map<java.lang.String, java.util.List<C26093jRr>> EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.Boolean> copydefault;
    public final java.util.List<java.lang.Integer> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26098jRw(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:38) call: o.jRw.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C26098jRw(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26098jRw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21468hAm c21468hAmOLrzqt = C21468hAm.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21468hAmOLrzqt, "");
        this.AEQbTJ = c21468hAmOLrzqt;
        this.djBIcL = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.Activity.RlQdEF), java.lang.Integer.valueOf(C52761wXj.Activity.DQYQgr), java.lang.Integer.valueOf(C52761wXj.Activity.OqFWZa));
        this.KWHzl = yDY.gEmmrt("Top10", "Top50", "Top100");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.copydefault = C56424yEw.djBIcL(C56390yDp.OLrzqt("Top10", bool), C56390yDp.OLrzqt("Top50", bool), C56390yDp.OLrzqt("Top100", bool));
        this.AhwBna = new LinkedHashMap();
        this.EZpvd = new LinkedHashMap();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setupLegendClickListeners();
    }

    public final void setupLegendClickListeners() {
        C21468hAm c21468hAm = this.AEQbTJ;
        c21468hAm.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.jRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.AEQbTJ("Top10");
            }
        });
        c21468hAm.fARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.jRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.copydefault.AEQbTJ("Top50");
            }
        });
        c21468hAm.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: o.jRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.EZpvd.AEQbTJ("Top100");
            }
        });
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.Boolean bool = this.copydefault.get(str);
        boolean z = !(bool != null ? bool.booleanValue() : true);
        this.copydefault.put(str, java.lang.Boolean.valueOf(z));
        LineDataSet lineDataSet = this.AhwBna.get(str);
        if (lineDataSet != null) {
            lineDataSet.setVisible(z);
            KWHzl(str, z);
            java.util.Collection<java.lang.Boolean> collectionValues = this.copydefault.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                this.AEQbTJ.KWHzl.setVisibility(8);
            } else {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) it.next()).booleanValue()) {
                        break;
                    }
                }
                this.AEQbTJ.KWHzl.setVisibility(8);
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -1784222564) {
                if (iHashCode != 80991764) {
                    if (iHashCode == 80991888 && str.equals("Top50")) {
                        Group group = this.AEQbTJ.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(z ? 0 : 8);
                    }
                } else if (str.equals("Top10")) {
                    Group group2 = this.AEQbTJ.valueOf;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(z ? 0 : 8);
                }
            } else if (str.equals("Top100")) {
                Group group3 = this.AEQbTJ.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(group3, "");
                group3.setVisibility(z ? 0 : 8);
            }
            this.AEQbTJ.fetchVPNInfo.invalidate();
        }
    }

    public final void KWHzl(java.lang.String str, boolean z) {
        int iCopydefault;
        int iCopydefault2;
        int iCopydefault3;
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
        int iHashCode = str.hashCode();
        if (iHashCode == -1784222564) {
            if (str.equals("Top100")) {
                if (z) {
                    int iIntValue = this.djBIcL.get(2).intValue();
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iCopydefault = C25382ivf.copydefault(iIntValue, context);
                } else {
                    iCopydefault = iKWHzl;
                }
                this.AEQbTJ.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
                this.AEQbTJ.fIwbmz.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.QwvEab) : iKWHzl);
                this.AEQbTJ.wlaJM.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : iKWHzl);
                AppCompatTextView appCompatTextView = this.AEQbTJ.zLjUOn;
                if (z) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
                }
                appCompatTextView.setTextColor(iKWHzl);
                return;
            }
            return;
        }
        if (iHashCode == 80991764) {
            if (str.equals("Top10")) {
                if (z) {
                    int iIntValue2 = this.djBIcL.get(0).intValue();
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iCopydefault2 = C25382ivf.copydefault(iIntValue2, context2);
                } else {
                    iCopydefault2 = iKWHzl;
                }
                this.AEQbTJ.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
                this.AEQbTJ.fJNWhG.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.QwvEab) : iKWHzl);
                this.AEQbTJ.iwGUEr.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : iKWHzl);
                AppCompatTextView appCompatTextView2 = this.AEQbTJ.hDKMBd;
                if (z) {
                    iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
                }
                appCompatTextView2.setTextColor(iKWHzl);
                return;
            }
            return;
        }
        if (iHashCode == 80991888 && str.equals("Top50")) {
            if (z) {
                int iIntValue3 = this.djBIcL.get(1).intValue();
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iCopydefault3 = C25382ivf.copydefault(iIntValue3, context3);
            } else {
                iCopydefault3 = iKWHzl;
            }
            this.AEQbTJ.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault3));
            this.AEQbTJ.uzCIH.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.QwvEab) : iKWHzl);
            this.AEQbTJ.AwvSrB.setTextColor(z ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : iKWHzl);
            AppCompatTextView appCompatTextView3 = this.AEQbTJ.zuBGHE;
            if (z) {
                iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            }
            appCompatTextView3.setTextColor(iKWHzl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v5 */
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
    public final void AEQbTJ(@NotNull java.util.List<ChartDataUIItem> list, @NotNull java.util.List<ChartDataUIItem> list2, @NotNull java.util.List<ChartDataUIItem> list3) {
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
        OLrzqt();
        boolean z = list.isEmpty() && list2.isEmpty() && list3.isEmpty();
        C21970hTb c21970hTb = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c21970hTb, "");
        c21970hTb.setVisibility(z ^ true ? 0 : 8);
        C55173xeu c55173xeu = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            invalidate();
            return;
        }
        this.AEQbTJ.isConnected.setVisibility(0);
        this.AhwBna.clear();
        this.EZpvd.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LineData lineData2 = new LineData();
        ConstraintLayout constraintLayout = this.AEQbTJ.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list.isEmpty()) {
            precisionTypes = null;
            lineData = lineData2;
            KWHzl(list, 0, linkedHashMap2, linkedHashMap, lineData2);
            AppCompatTextView appCompatTextView = this.AEQbTJ.iwGUEr;
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            java.lang.String numberICUWithPrecision$default = (chartDataUIItem == null || (value3 = chartDataUIItem.getValue()) == null) ? null : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, value3, null, 1, null);
            if (numberICUWithPrecision$default == null || numberICUWithPrecision$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default)) {
                numberICUWithPrecision$default = "--";
            }
            appCompatTextView.setText(numberICUWithPrecision$default);
            AppCompatTextView appCompatTextView2 = this.AEQbTJ.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            ChartDataUIItem chartDataUIItem2 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list);
            kLY.formatPercentage$default(appCompatTextView2, (chartDataUIItem2 == null || (percentage3 = chartDataUIItem2.getPercentage()) == null) ? null : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, percentage3, null, 1, null), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
            this.AEQbTJ.hDKMBd.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        } else {
            precisionTypes = null;
            lineData = lineData2;
        }
        ConstraintLayout constraintLayout2 = this.AEQbTJ.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group2 = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list2.isEmpty()) {
            KWHzl(list2, 1, linkedHashMap2, linkedHashMap, lineData);
            ?? r0 = this.AEQbTJ.AwvSrB;
            ChartDataUIItem chartDataUIItem3 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
            ?? numberICUWithPrecision$default2 = (chartDataUIItem3 == null || (value2 = chartDataUIItem3.getValue()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, value2, precisionTypes, 1, precisionTypes);
            if (numberICUWithPrecision$default2 == 0 || numberICUWithPrecision$default2.length() == 0) {
                r42 = "--";
                r0.setText(r42);
                AppCompatTextView appCompatTextView3 = this.AEQbTJ.zuBGHE;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                ChartDataUIItem chartDataUIItem4 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
                kLY.formatPercentage$default(appCompatTextView3, (chartDataUIItem4 != null || (percentage2 = chartDataUIItem4.getPercentage()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, percentage2, precisionTypes, 1, precisionTypes), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
                this.AEQbTJ.zuBGHE.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            } else {
                boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default2);
                r42 = numberICUWithPrecision$default2;
                if (zFARcdN) {
                }
                r0.setText(r42);
                AppCompatTextView appCompatTextView32 = this.AEQbTJ.zuBGHE;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView32, "");
                ChartDataUIItem chartDataUIItem42 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list2);
                if (chartDataUIItem42 != null) {
                    kLY.formatPercentage$default(appCompatTextView32, (chartDataUIItem42 != null || (percentage2 = chartDataUIItem42.getPercentage()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, percentage2, precisionTypes, 1, precisionTypes), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
                    this.AEQbTJ.zuBGHE.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                }
            }
        }
        ConstraintLayout constraintLayout3 = this.AEQbTJ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        Group group3 = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        group3.setVisibility(list3.isEmpty() ^ true ? 0 : 8);
        if (!list3.isEmpty()) {
            KWHzl(list3, 2, linkedHashMap2, linkedHashMap, lineData);
            ?? r02 = this.AEQbTJ.wlaJM;
            ChartDataUIItem chartDataUIItem5 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
            ?? numberICUWithPrecision$default3 = (chartDataUIItem5 == null || (value = chartDataUIItem5.getValue()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, value, precisionTypes, 1, precisionTypes);
            if (numberICUWithPrecision$default3 == 0 || numberICUWithPrecision$default3.length() == 0) {
                r4 = "--";
                r02.setText(r4);
                AppCompatTextView appCompatTextView4 = this.AEQbTJ.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                ChartDataUIItem chartDataUIItem6 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
                kLY.formatPercentage$default(appCompatTextView4, (chartDataUIItem6 != null || (percentage = chartDataUIItem6.getPercentage()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, percentage, precisionTypes, 1, precisionTypes), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
                this.AEQbTJ.zLjUOn.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            } else {
                boolean zFARcdN2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) numberICUWithPrecision$default3);
                r4 = numberICUWithPrecision$default3;
                if (zFARcdN2) {
                }
                r02.setText(r4);
                AppCompatTextView appCompatTextView42 = this.AEQbTJ.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView42, "");
                ChartDataUIItem chartDataUIItem62 = (ChartDataUIItem) CollectionsKt___CollectionsKt.wlaJM(list3);
                if (chartDataUIItem62 != null) {
                    kLY.formatPercentage$default(appCompatTextView42, (chartDataUIItem62 != null || (percentage = chartDataUIItem62.getPercentage()) == null) ? precisionTypes : C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, percentage, precisionTypes, 1, precisionTypes), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
                    this.AEQbTJ.zLjUOn.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                }
            }
        }
        this.EZpvd = linkedHashMap;
        this.AEQbTJ.fetchVPNInfo.setData(lineData);
        AEQbTJ(linkedHashMap2);
        AEQbTJ();
        OLrzqt(linkedHashMap);
    }

    public final void KWHzl(java.util.List<ChartDataUIItem> list, int i, java.util.Map<java.lang.Float, java.lang.String> map, java.util.Map<java.lang.String, java.util.List<C26093jRr>> map2, LineData lineData) {
        java.util.ArrayList<Entry> arrayList = new java.util.ArrayList<>();
        java.util.List<C26093jRr> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ChartDataUIItem chartDataUIItem = (ChartDataUIItem) obj;
            C25322iuY c25322iuY = C25322iuY.OLrzqt;
            java.lang.String strOLrzqt = c25322iuY.OLrzqt(chartDataUIItem.getTimestamp());
            float fDjBIcL = C33129mqd.djBIcL(chartDataUIItem.getValue());
            java.lang.String percentage = chartDataUIItem.getPercentage();
            float f = i2;
            arrayList.add(new Entry(f, fDjBIcL));
            map.put(java.lang.Float.valueOf(f), strOLrzqt);
            arrayList3.add(java.lang.Boolean.valueOf(arrayList2.add(new C26093jRr(c25322iuY.gEmmrt(chartDataUIItem.getTimestamp()), chartDataUIItem.getValue(), percentage))));
            i2++;
        }
        map2.put(this.KWHzl.get(i), arrayList2);
        LineDataSet lineDataSetCopydefault = copydefault(arrayList, this.KWHzl.get(i), this.djBIcL.get(i).intValue());
        this.AhwBna.put(this.KWHzl.get(i), lineDataSetCopydefault);
        java.lang.Boolean bool = this.copydefault.get(this.KWHzl.get(i));
        lineDataSetCopydefault.setVisible(bool != null ? bool.booleanValue() : true);
        lineData.addDataSet(lineDataSetCopydefault);
    }

    public final LineDataSet copydefault(java.util.ArrayList<Entry> arrayList, java.lang.String str, int i) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lineDataSet.setColor(C25382ivf.copydefault(i, context));
        lineDataSet.setHighLightColor(0);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        return lineDataSet;
    }

    public final void AEQbTJ(java.util.Map<java.lang.Float, java.lang.String> map) {
        XAxis xAxis = this.AEQbTJ.fetchVPNInfo.getXAxis();
        if (xAxis != null) {
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setValueFormatter(new Application(map));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            xAxis.setTextSize(10.0f);
            xAxis.setXOffset(10.0f);
            xAxis.setYOffset(20.0f);
        }
    }

    /* JADX INFO: renamed from: o.jRw$Application */
    public static final class Application extends ValueFormatter {
        public final /* synthetic */ java.util.Map<java.lang.Float, java.lang.String> AEQbTJ;

        public Application(java.util.Map<java.lang.Float, java.lang.String> map) {
            this.AEQbTJ = map;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.String str = this.AEQbTJ.get(java.lang.Float.valueOf(f));
            return str == null ? "" : str;
        }
    }

    public final void AEQbTJ() {
        YAxis axisRight = this.AEQbTJ.fetchVPNInfo.getAxisRight();
        if (axisRight != null) {
            axisRight.setValueFormatter(new jRN());
            axisRight.setLabelCount(4, true);
            axisRight.setDrawAxisLine(false);
            axisRight.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
            axisRight.setTextSize(10.0f);
            axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisRight.setGridColor(C25382ivf.KWHzl(C52761wXj.Activity.zuBGHE));
            axisRight.setGridLineWidth(0.5f);
            axisRight.setXOffset(10.0f);
        }
        YAxis axisLeft = this.AEQbTJ.fetchVPNInfo.getAxisLeft();
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
    public final void OLrzqt(java.util.Map<java.lang.String, java.util.List<C26093jRr>> map) {
        LineChart lineChart = this.AEQbTJ.fetchVPNInfo;
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
        ConstraintLayout constraintLayout = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        lineChart.setOnChartValueSelectedListener(new C26094jRs(lineChart, map, constraintLayout));
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        jRG jrg = new jRG(context);
        jrg.setChartView(lineChart);
        lineChart.setMarker(jrg);
        jrg.setOnDrawMarker(new Function2() { // from class: o.jRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C26098jRw.AEQbTJ(this.OLrzqt, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        });
        lineChart.invalidate();
        this.AEQbTJ.fetchVPNInfo.requestLayout();
    }

    public static final Unit AEQbTJ(final C26098jRw c26098jRw, final float f, float f2) {
        final int iDp2px$default = C55298xhM.dp2px$default(5.0f, null, 1, null);
        final ConstraintLayout constraintLayout = c26098jRw.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        float fContentLeft = c26098jRw.AEQbTJ.fetchVPNInfo.getViewPortHandler().contentLeft();
        final float fContentRight = fContentLeft + ((c26098jRw.AEQbTJ.fetchVPNInfo.getViewPortHandler().contentRight() - fContentLeft) / 2);
        final Function0 function0 = new Function0() { // from class: o.jRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26098jRw.OLrzqt(constraintLayout, f, fContentRight, iDp2px$default, c26098jRw);
            }
        };
        if (constraintLayout.getWidth() > 0 && constraintLayout.getHeight() > 0) {
            function0.invoke();
        } else {
            constraintLayout.post(new java.lang.Runnable() { // from class: o.jRy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C26098jRw.AEQbTJ(function0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ConstraintLayout constraintLayout, float f, float f2, int i, C26098jRw c26098jRw) {
        boolean z;
        float width = constraintLayout.getWidth();
        float height = constraintLayout.getHeight();
        float f3 = f < f2 ? f + i : (f - width) - i;
        float fContentTop = c26098jRw.AEQbTJ.fetchVPNInfo.getViewPortHandler().contentTop();
        float f4 = 2;
        float fContentBottom = (c26098jRw.AEQbTJ.fetchVPNInfo.getViewPortHandler().contentBottom() - fContentTop) / f4;
        float f5 = height / f4;
        float fDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
        constraintLayout.setX(f3);
        constraintLayout.setY(((fContentTop + fContentBottom) - f5) + fDp2px$default);
        java.util.Collection<java.lang.Boolean> collectionValues = c26098jRw.copydefault.values();
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

    public static final void AEQbTJ(Function0 function0) {
        function0.invoke();
    }

    public final void OLrzqt() {
        XAxis xAxis = this.AEQbTJ.fetchVPNInfo.getXAxis();
        if (xAxis != null) {
            xAxis.removeAllLimitLines();
        }
        this.AEQbTJ.KWHzl.setVisibility(8);
        this.AEQbTJ.fetchVPNInfo.invalidate();
    }

    /* JADX INFO: renamed from: o.jRw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
