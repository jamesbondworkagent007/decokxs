package o;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52588wQz extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public int AEQbTJ;
    public java.util.List<StrategyProfitResponse> AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final AbstractC50936vdZ OLrzqt;
    public java.lang.String djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52588wQz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52588wQz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AhwBna = str3;
        this.djBIcL = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirst(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRespList(@NotNull java.util.List<StrategyProfitResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:67) call: o.wQz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52588wQz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
    public C52588wQz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.zHQtTQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50936vdZ abstractC50936vdZ = (AbstractC50936vdZ) viewDataBindingInflate;
        this.OLrzqt = abstractC50936vdZ;
        MarkerView actionBar = new ActionBar(this, context);
        if (C55296xhK.OLrzqt(context)) {
            actionBar.setLayoutDirection(1);
        } else {
            actionBar.setLayoutDirection(0);
        }
        wPT wpt = abstractC50936vdZ.OLrzqt;
        actionBar.setChartView(wpt);
        wpt.setMarker(actionBar);
        wpt.getLegend().setEnabled(false);
        wpt.setScaleEnabled(false);
        wpt.getDescription().setEnabled(false);
        wpt.setTouchEnabled(true);
        wpt.setDragEnabled(true);
        setNestedScrollingEnabled(false);
        wpt.setHighlightPerDragEnabled(false);
        wpt.getAxisRight().setEnabled(false);
        C54800xVu c54800xVu = C54800xVu.copydefault;
        Intrinsics.copydefault(wpt);
        c54800xVu.copydefault(context, (BarLineChartBase) wpt, actionBar, false);
        wpt.setNoDataText("");
        wpt.setMinOffset(0.0f);
        wpt.setViewPortOffsets(10.0f, 20.0f, 12.0f, 50.0f);
        wpt.setExtraTopOffset(5.0f);
        this.AYXKKw = new java.util.ArrayList();
        this.valueOf = true;
        this.AEQbTJ = C48033uCm.ActionBar.AuCTelauCTel;
    }

    /* JADX INFO: renamed from: o.wQz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void setData$default(C52588wQz c52588wQz, java.util.List list, StrategyProfitResponse strategyProfitResponse, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            strategyProfitResponse = null;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        c52588wQz.setData(list, strategyProfitResponse, str, str2);
    }

    public final void setData(java.util.List<StrategyProfitResponse> list, StrategyProfitResponse strategyProfitResponse, java.lang.String str, java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        java.util.List<StrategyProfitResponse> arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) list) && !Intrinsics.EZpvd(list, this.AYXKKw)) {
            if (list == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
                arrayList = new java.util.ArrayList<>();
            }
            this.AYXKKw = arrayList;
        }
        if ((!this.AYXKKw.isEmpty()) && strategyProfitResponse != null && ((C33129mqd.OLrzqt((java.lang.CharSequence) strategyProfitResponse.getTotalPnl()) && C33129mqd.OLrzqt((java.lang.CharSequence) strategyProfitResponse.getPnlRatio())) || (C33129mqd.OLrzqt((java.lang.CharSequence) strategyProfitResponse.getTotalPnlInSourceCcy()) && C33129mqd.OLrzqt((java.lang.CharSequence) strategyProfitResponse.getPnlRatioInSourceCcy())))) {
            int iAuCTel = yDY.AuCTel(this.AYXKKw);
            StrategyProfitResponse strategyProfitResponse2 = this.AYXKKw.get(iAuCTel);
            StrategyProfitResponse strategyProfitResponseCopy = strategyProfitResponse2.copy((512 & 1) != 0 ? strategyProfitResponse2.cycleId : strategyProfitResponse.getCycleId(), (512 & 2) != 0 ? strategyProfitResponse2.profitNum : strategyProfitResponse.getProfitNum(), (512 & 4) != 0 ? strategyProfitResponse2.cTime : strategyProfitResponse.getCTime(), (512 & 8) != 0 ? strategyProfitResponse2.totalPnl : strategyProfitResponse.getTotalPnl(), (512 & 16) != 0 ? strategyProfitResponse2.pnlRatio : strategyProfitResponse.getPnlRatio(), (512 & 32) != 0 ? strategyProfitResponse2.timeUnit : strategyProfitResponse.getTimeUnit(), (512 & 64) != 0 ? strategyProfitResponse2.sourceCcy : strategyProfitResponse.getSourceCcy(), (512 & 128) != 0 ? strategyProfitResponse2.pnlRatioInSourceCcy : strategyProfitResponse.getPnlRatioInSourceCcy(), (512 & 256) != 0 ? strategyProfitResponse2.totalPnlInSourceCcy : strategyProfitResponse.getTotalPnlInSourceCcy(), (512 & 512) != 0 ? strategyProfitResponse2.marginPerCcy : null);
            java.util.List<StrategyProfitResponse> list2 = this.AYXKKw;
            Intrinsics.copydefault(list2, "");
            C56532yIw.OLrzqt(list2).set(iAuCTel, strategyProfitResponseCopy);
        }
        java.util.List<StrategyProfitResponse> list3 = this.AYXKKw;
        if (C33129mqd.valueOf(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null, 0)) {
            return;
        }
        EZpvd(AEQbTJ(this.AYXKKw, str2 == null ? "" : str2));
        wPT wpt = this.OLrzqt.OLrzqt;
        if (this.valueOf) {
            wpt.highlightValue(wpt.getHighlightByTouchPoint(wpt.getContentRect().right, 0.0f));
            this.valueOf = false;
            return;
        }
        if (wpt.getHighlighted() != null) {
            Highlight[] highlighted = wpt.getHighlighted();
            Intrinsics.checkNotNullExpressionValue(highlighted, "");
            if (true ^ (highlighted.length == 0)) {
                try {
                    Result.Application application = Result.Companion;
                    wpt.highlightValue(wpt.getHighlighted()[0]);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    pUU.copydefault("ProfitChartView", "marker refresh error");
                }
            }
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null)) {
            return "";
        }
        try {
            return StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(1) + "/";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private final void EZpvd(java.util.List<StrategyProfitResponse> list) {
        XAxis xAxis = this.OLrzqt.OLrzqt.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setLabelCount(5, true);
        xAxis.setValueFormatter(new Activity(list, this));
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setDrawAxisLine(false);
    }

    /* JADX INFO: renamed from: o.wQz$Activity */
    public static final class Activity extends ValueFormatter {
        public final /* synthetic */ C52588wQz AEQbTJ;
        public final /* synthetic */ java.util.List<StrategyProfitResponse> EZpvd;

        public Activity(java.util.List<StrategyProfitResponse> list, C52588wQz c52588wQz) {
            this.EZpvd = list;
            this.AEQbTJ = c52588wQz;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            if (i <= 0 || i >= this.EZpvd.size()) {
                return "";
            }
            StrategyProfitResponse strategyProfitResponse = this.EZpvd.get(i);
            if (Intrinsics.EZpvd((java.lang.Object) strategyProfitResponse.getTimeUnit(), (java.lang.Object) "hour")) {
                return this.AEQbTJ.AEQbTJ(pTA.formatDate$default(new Date(java.lang.Long.parseLong(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null)) + pTA.formatTime$default(new Date(java.lang.Long.parseLong(strategyProfitResponse.getCTime())), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
            }
            return pTA.formatDate$default(new Date(java.lang.Long.parseLong(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public static /* synthetic */ java.util.List setYDatas$default(C52588wQz c52588wQz, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c52588wQz.AEQbTJ(list, str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVu.createLineDataSet$default(o.xVu, android.content.Context, java.util.List, java.util.ArrayList, int, com.github.mikephil.charting.components.YAxis$AxisDependency, boolean, boolean, boolean, java.lang.Integer, android.graphics.drawable.Drawable, int, int, java.lang.Object):java.util.List */
    public final java.util.List<StrategyProfitResponse> AEQbTJ(java.util.List<StrategyProfitResponse> list, java.lang.String str) {
        java.lang.String pnlRatioInSourceCcy;
        java.lang.String pnlRatioInSourceCcy2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) next;
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy())) {
                    pnlRatioInSourceCcy = strategyProfitResponse.getPnlRatio();
                } else {
                    pnlRatioInSourceCcy = strategyProfitResponse.getPnlRatioInSourceCcy();
                }
                StrategyProfitResponse strategyProfitResponse2 = (StrategyProfitResponse) objAuCTelauCTel;
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse2.getSourceCcy())) {
                    pnlRatioInSourceCcy2 = strategyProfitResponse2.getPnlRatio();
                } else {
                    pnlRatioInSourceCcy2 = strategyProfitResponse2.getPnlRatioInSourceCcy();
                }
                boolean zEZpvd = Intrinsics.EZpvd(objAuCTelauCTel, strategyProfitResponse);
                boolean z2 = C33129mqd.AEQbTJ(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(pnlRatioInSourceCcy)), 0) && C33129mqd.AEQbTJ(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(pnlRatioInSourceCcy2)), 0);
                boolean z3 = C33129mqd.gEmmrt(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(pnlRatioInSourceCcy)), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf((float) C33129mqd.AEQbTJ(pnlRatioInSourceCcy2)), 0);
                if (!z2 && !z3) {
                    z = false;
                }
                float f = 0.0f;
                if (!zEZpvd && !z) {
                    arrayList2.add(new Entry(i2, 0.0f));
                    arrayList.add(new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, strategyProfitResponse.getCTime(), (java.lang.String) null, (java.lang.String) null, strategyProfitResponse.getTimeUnit(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 987, (DefaultConstructorMarker) null));
                    i2++;
                }
                arrayList.add(strategyProfitResponse);
                float f2 = i2;
                try {
                    f = java.lang.Float.parseFloat(pnlRatioInSourceCcy);
                } catch (java.lang.Exception unused) {
                }
                arrayList2.add(new Entry(f2, f, strategyProfitResponse));
                i2++;
                i++;
                objAuCTelauCTel = strategyProfitResponse;
            } else {
                C54800xVu c54800xVu = C54800xVu.copydefault;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LineData lineData = new LineData((java.util.List<ILineDataSet>) c54800xVu.OLrzqt(context, list, arrayList2, 0, (1664 & 16) != 0 ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.LEFT, (1664 & 32) != 0 ? false : true, (1664 & 64) != 0 ? false : true, (1664 & 128) != 0 ? false : false, (1664 & 256) != 0 ? null : java.lang.Integer.valueOf(C48033uCm.ActionBar.AuCTelauCTel), (1664 & 512) != 0 ? null : null, (1664 & 1024) != 0 ? 6 : 0));
                lineData.setDrawValues(false);
                YAxis axisLeft = this.OLrzqt.OLrzqt.getAxisLeft();
                axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
                axisLeft.setDrawZeroLine(true);
                axisLeft.setZeroLineWidth(0.5f);
                axisLeft.setGridColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.fZc));
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                axisLeft.setZeroLineColor(getThemeColor$default(this, context2, C33129mqd.copydefault(str, "0"), 0.0f, 4, null));
                axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
                axisLeft.setValueFormatter(new TaskDescription());
                this.OLrzqt.OLrzqt.setData(lineData);
                return arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: o.wQz$TaskDescription */
    public static final class TaskDescription extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTB.formatPercent$default(xMR.copydefault.OLrzqt((java.lang.Object) java.lang.String.valueOf(f)), 2, 2, RoundingMode.DOWN, null, 8, null);
        }
    }

    public static /* synthetic */ int getThemeColor$default(C52588wQz c52588wQz, android.content.Context context, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return c52588wQz.AEQbTJ(context, z, f);
    }

    public final int AEQbTJ(@NotNull android.content.Context context, boolean z, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            return C33512mxp.AEQbTJ.zLjUOn(context, f);
        }
        return C33512mxp.AEQbTJ.isConnected(context, f);
    }

    public final void copydefault(boolean z) {
        C55173xeu c55173xeu = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(z ? 0 : 8);
        wPT wpt = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wpt, "");
        wpt.setVisibility(z ^ true ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.wQz$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public final class ActionBar extends AbstractC52586wQx {
        public RectF DbNXlk;
        public final java.util.ArrayList<java.lang.Integer> ejfBZ;
        public final /* synthetic */ C52588wQz fIwbmz;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC52583wQu
        public java.util.ArrayList<java.lang.Integer> copydefault() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View
        public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C52588wQz c52588wQz, android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.fIwbmz = c52588wQz;
            this.ejfBZ = yDY.copydefault(java.lang.Integer.valueOf(AbstractC52583wQu.getThemeColor$default(this, context, true, 0.0f, 4, null)));
            this.DbNXlk = new RectF();
        }

        public final boolean KWHzl(float f, float f2) {
            this.DbNXlk.set(KWHzl().x - (getWidth() / 2.0f), KWHzl().y, KWHzl().x + (getWidth() / 2.0f), KWHzl().y + getHeight());
            return this.DbNXlk.contains(f, f2);
        }

        public final void AEQbTJ() {
            KWHzl().x = 0.0f;
            KWHzl().y = 0.0f;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0287  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
        @Override // o.AbstractC52583wQu, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void refreshContent(Entry entry, Highlight highlight) {
            java.lang.String strAYXKKw;
            java.lang.String str;
            java.lang.String str2;
            java.lang.String botPnl$default;
            java.lang.String str3;
            java.lang.String totalPnl;
            java.lang.String str4;
            java.util.List listSplit$default;
            java.lang.String strCopydefault;
            if (entry != null && entry.getData() != null) {
                ChartData data = getChartView().getData();
                Intrinsics.copydefault(data, "");
                C52588wQz c52588wQz = this.fIwbmz;
                java.lang.String str5 = c52588wQz.djBIcL;
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1831183611:
                            strAYXKKw = !str5.equals("spot_dca") ? C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnCompositionobserveReporter1) : "";
                            break;
                        case -1402017003:
                            if (!str5.equals("contract_dca")) {
                            }
                            break;
                        case -1216369070:
                            if (str5.equals("smart_portfolio")) {
                                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.f1070api);
                                break;
                            }
                            break;
                        case -1086683216:
                            if (!str5.equals("signal_bot")) {
                            }
                            break;
                        case -557961837:
                            if (!str5.equals("smart_arbitrage")) {
                            }
                            break;
                        case 1165749981:
                            if (str5.equals("recurring")) {
                                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.fromCustomAction);
                                break;
                            }
                            break;
                        case 1485620813:
                            if (!str5.equals("dcd_bot")) {
                            }
                            break;
                    }
                    java.util.List<java.lang.String> listAhwBna = yDY.AhwBna(C33070mpX.AYXKKw(C48033uCm.Fragment.sZqaRl), C33070mpX.AYXKKw(C55688xof.Application.setErrorMessage), C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes));
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw)) {
                        listAhwBna.add(strAYXKKw);
                    }
                    setLeftTitleText(listAhwBna);
                    java.lang.Object data2 = entry.getData();
                    StrategyProfitResponse strategyProfitResponse = data2 instanceof StrategyProfitResponse ? (StrategyProfitResponse) data2 : null;
                    if (strategyProfitResponse != null) {
                        java.lang.String cTime = strategyProfitResponse.getCTime();
                        if (cTime == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) cTime)) {
                            str = "--";
                            str2 = str;
                        } else {
                            str = "--";
                            str2 = pTA.format$default(new Date(java.lang.Long.parseLong(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                        }
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getTotalPnl())) {
                            botPnl$default = str;
                        } else if (Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "recurring") || Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "smart_portfolio")) {
                            java.lang.String str6 = c52588wQz.KWHzl;
                            java.lang.String str7 = str6 == null ? "" : str6;
                            java.lang.String str8 = c52588wQz.EZpvd;
                            java.lang.String str9 = str8 == null ? "" : str8;
                            java.lang.String totalPnl2 = strategyProfitResponse.getTotalPnl();
                            java.lang.String str10 = c52588wQz.AhwBna;
                            botPnl$default = C56033xvF.getBotPnl$default(str7, str9, totalPnl2, str10 == null ? "" : str10, false, false, null, false, null, null, null, 2016, null);
                        } else if (c52588wQz.KWHzl == null || c52588wQz.EZpvd == null) {
                            botPnl$default = strategyProfitResponse.getTotalPnl();
                        } else {
                            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy())) {
                                java.lang.String str11 = c52588wQz.KWHzl;
                                if (str11 == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) == null || (str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1)) == null) {
                                    str4 = "BTC";
                                }
                                str3 = str4 + "-" + strategyProfitResponse.getSourceCcy();
                                totalPnl = strategyProfitResponse.getTotalPnlInSourceCcy();
                            } else {
                                str3 = c52588wQz.KWHzl;
                                totalPnl = strategyProfitResponse.getTotalPnl();
                            }
                            java.lang.String str12 = totalPnl;
                            if (Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "spot_dca") || Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "twap") || Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) c52588wQz.djBIcL, (java.lang.Object) "smart_iceberg")) {
                                java.lang.String str13 = str3 == null ? "" : str3;
                                java.lang.String str14 = c52588wQz.EZpvd;
                                botPnl$default = C56033xvF.getBotPnl$default(str13, str14 == null ? "" : str14, str12, null, false, false, null, false, null, null, null, 2024, null);
                            } else {
                                java.lang.String str15 = str3 == null ? "" : str3;
                                java.lang.String str16 = c52588wQz.EZpvd;
                                botPnl$default = C56033xvF.getBotPnl$default(str15, str16 == null ? "" : str16, str12, null, false, false, null, false, null, null, null, 2024, null);
                            }
                        }
                        java.lang.String pnlRatio = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy()) ? strategyProfitResponse.getPnlRatio() : strategyProfitResponse.getPnlRatioInSourceCcy();
                        java.lang.String strFmtBotPnlPercent$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pnlRatio) ? str : C56033xvF.fmtBotPnlPercent$default(pnlRatio, false, 0, 6, null);
                        java.lang.String str17 = c52588wQz.djBIcL;
                        if (str17 != null) {
                            switch (str17.hashCode()) {
                                case -1831183611:
                                    strCopydefault = !str17.equals("spot_dca") ? xMR.copydefault.copydefault(strategyProfitResponse.getProfitNum()) : "";
                                    break;
                                case -1402017003:
                                    if (!str17.equals("contract_dca")) {
                                    }
                                    break;
                                case -1086683216:
                                    if (!str17.equals("signal_bot")) {
                                    }
                                    break;
                                case -557961837:
                                    if (!str17.equals("smart_arbitrage")) {
                                    }
                                    break;
                                case 1485620813:
                                    if (!str17.equals("dcd_bot")) {
                                    }
                                    break;
                            }
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                                setContents(C52581wQs.EZpvd("", str2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", botPnl$default, EZpvd(botPnl$default)), C52581wQs.EZpvd("", strFmtBotPnlPercent$default, EZpvd(pnlRatio)), C52581wQs.EZpvd("", strCopydefault, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                            } else {
                                setContents(C52581wQs.EZpvd("", str2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", botPnl$default, EZpvd(botPnl$default)), C52581wQs.EZpvd("", strFmtBotPnlPercent$default, EZpvd(pnlRatio)));
                            }
                        }
                    } else {
                        setLeftTitleText(listAhwBna);
                        setContents(C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), C52581wQs.EZpvd("", "--", C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                    }
                }
            }
            super.refreshContent(entry, highlight);
        }

        private final int EZpvd(java.lang.String str) {
            BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
            if (C33129mqd.OLrzqt(bigDecimalOLrzqt, "0")) {
                return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            }
            if (C33129mqd.copydefault((java.lang.Object) bigDecimalOLrzqt, (java.lang.Object) 0)) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
            }
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        }
    }
}
