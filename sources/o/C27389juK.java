package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsChartType;
import java.util.Date;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C27413jui;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.juK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27389juK extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final C27398juT copydefault = new C27398juT(ChartInterval.Week, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, true, false, null, 7164, null);
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public ProductDetailsChartType KWHzl;
    public final java.util.Map<ChartInterval, java.lang.Integer> OLrzqt;
    public C27398juT djBIcL;
    public InterfaceC27387juI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27389juK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27389juK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC27387juI interfaceC27387juI, @NotNull ProductDetailsChartType productDetailsChartType) {
        Intrinsics.checkNotNullParameter(interfaceC27387juI, "");
        Intrinsics.checkNotNullParameter(productDetailsChartType, "");
        this.valueOf = interfaceC27387juI;
        this.KWHzl = productDetailsChartType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:77) call: o.juK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27389juK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27389juK(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.juM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27389juK.KWHzl(context, this);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.juP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27389juK.copydefault();
            }
        });
        java.util.Map<ChartInterval, java.lang.Integer> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(ChartInterval.Week, java.lang.Integer.valueOf(C25493ixk.ActionBar.igXuih)), C56390yDp.OLrzqt(ChartInterval.Month, java.lang.Integer.valueOf(C25493ixk.ActionBar.USBtdM)), C56390yDp.OLrzqt(ChartInterval.Quarter, java.lang.Integer.valueOf(C25493ixk.ActionBar.UlJrfe)), C56390yDp.OLrzqt(ChartInterval.Year, java.lang.Integer.valueOf(C25493ixk.ActionBar.htlTjW)));
        this.OLrzqt = mapDjBIcL;
        this.KWHzl = ProductDetailsChartType.Rate;
        this.djBIcL = copydefault;
        C27416jul c27416jul = EZpvd().AkhnZx;
        java.lang.String string = context.getString(C25493ixk.FragmentManager.deregisterUser);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27416jul.setTitle(string);
        java.lang.String string2 = context.getString(C25493ixk.FragmentManager.getUserContextRegisteredStatus);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c27416jul.setButtonText(string2);
        c27416jul.setRetryClick(new Function0() { // from class: o.juR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27389juK.OLrzqt(this.EZpvd);
            }
        });
        C27420jup c27420jup = EZpvd().djBIcL;
        java.lang.String string3 = context.getString(C25493ixk.FragmentManager.dzkkkq);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c27420jup.setTitle(string3);
        LinearLayoutCompat linearLayoutCompat = EZpvd().AEQbTJ;
        java.util.Iterator<T> it = mapDjBIcL.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ChartInterval chartInterval = (ChartInterval) entry.getKey();
            android.view.View viewFindViewById = linearLayoutCompat.findViewById(((java.lang.Number) entry.getValue()).intValue());
            viewFindViewById.setOnClickListener(new Application(viewFindViewById, 1000L, this, chartInterval));
        }
        EZpvd().copydefault.setSelectCallback(new AnonymousClass4());
        setData(copydefault);
    }

    private final C23894iNg EZpvd() {
        return (C23894iNg) this.AEQbTJ.getValue();
    }

    public static final C23894iNg KWHzl(android.content.Context context, C27389juK c27389juK) {
        return C23894iNg.OLrzqt(android.view.LayoutInflater.from(context), c27389juK, true);
    }

    private final android.graphics.Paint KWHzl() {
        return (android.graphics.Paint) this.AhwBna.getValue();
    }

    public static final android.graphics.Paint copydefault() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null));
        return paint;
    }

    public static final Unit OLrzqt(C27389juK c27389juK) {
        InterfaceC27387juI interfaceC27387juI = c27389juK.valueOf;
        if (interfaceC27387juI != null) {
            interfaceC27387juI.copydefault(c27389juK.djBIcL.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.juK$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 implements C27413jui.StateListAnimator, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof C27413jui.StateListAnimator) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C27389juK.this, C27389juK.class, "handleChartGesture", "handleChartGesture(Lcom/okinc/business/invest_biz/ui/bean/InvestKLineDataPoint;Lcom/github/mikephil/charting/highlight/Highlight;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.C27413jui.StateListAnimator
        public final void AEQbTJ(InvestKLineDataPoint investKLineDataPoint, Highlight highlight) {
            C27389juK.this.OLrzqt(investKLineDataPoint, highlight);
        }
    }

    public static /* synthetic */ void bindTo$default(C27389juK c27389juK, InterfaceC27387juI interfaceC27387juI, ProductDetailsChartType productDetailsChartType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            productDetailsChartType = ProductDetailsChartType.Rate;
        }
        c27389juK.EZpvd(interfaceC27387juI, productDetailsChartType);
    }

    public final void setData(@NotNull C27398juT c27398juT) {
        Intrinsics.checkNotNullParameter(c27398juT, "");
        this.djBIcL = c27398juT;
        C23894iNg c23894iNgEZpvd = EZpvd();
        android.widget.FrameLayout frameLayout = c23894iNgEZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(C27392juN.KWHzl(this.djBIcL) ? 0 : 8);
        KWHzl(this.djBIcL);
        C27420jup c27420jup = c23894iNgEZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c27420jup, "");
        c27420jup.setVisibility(C27392juN.OLrzqt(this.djBIcL) ? 0 : 8);
        C55113xdn c55113xdn = c23894iNgEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility((!this.djBIcL.AkhnZx() || this.djBIcL.KWHzl()) ? 8 : 0);
        if (this.djBIcL.AkhnZx() && !this.djBIcL.KWHzl()) {
            c23894iNgEZpvd.KWHzl.KWHzl(0L);
        } else {
            c23894iNgEZpvd.KWHzl.copydefault();
        }
        C27416jul c27416jul = c23894iNgEZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c27416jul, "");
        c27416jul.setVisibility((!this.djBIcL.KWHzl() || C27392juN.KWHzl(this.djBIcL)) ? 8 : 0);
        if (C27392juN.KWHzl(this.djBIcL)) {
            EZpvd(this.djBIcL);
        }
        invalidate();
        requestLayout();
    }

    public final void OLrzqt(InvestKLineDataPoint investKLineDataPoint, Highlight highlight) {
        java.lang.String strAEQbTJ;
        java.lang.String ratePercent$default;
        InvestKLineCandleInfo investKLineCandleInfoCopydefault;
        InvestKLineCandleInfo investKLineCandleInfoCopydefault2;
        boolean z = investKLineDataPoint == null && highlight == null;
        java.lang.String strAEQbTJ2 = null;
        boolean z2 = (investKLineDataPoint != null ? investKLineDataPoint.valueOf() : null) == InvestKLineDataPoint.Type.BONUS;
        boolean z3 = z || !z2;
        LinearLayoutCompat linearLayoutCompat = EZpvd().isConnected;
        strAEQbTJ = "";
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z3 ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = EZpvd().values;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(z3 ? 0 : 8);
        EZpvd().OLrzqt.setClipBounds(OLrzqt(z, highlight));
        if (investKLineDataPoint == null || (investKLineCandleInfoCopydefault2 = investKLineDataPoint.copydefault()) == null) {
            ratePercent$default = null;
        } else {
            ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, C33129mqd.subS$default(investKLineCandleInfoCopydefault2.KWHzl(), investKLineCandleInfoCopydefault2.AEQbTJ(), null, null, null, 14, null), false, 2, null);
            if (C33129mqd.copydefault(investKLineCandleInfoCopydefault2.KWHzl(), "0")) {
                ratePercent$default = Marker.ANY_NON_NULL_MARKER + ratePercent$default;
            }
        }
        if (ratePercent$default == null) {
            ratePercent$default = "";
        }
        boolean z4 = !z && z2 && ratePercent$default.length() > 0;
        LinearLayoutCompat linearLayoutCompat3 = EZpvd().fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        linearLayoutCompat3.setVisibility(z4 ? 0 : 8);
        if (z4) {
            Intrinsics.copydefault(investKLineDataPoint);
            int iEZpvd = investKLineDataPoint.EZpvd();
            int iIsConnected = this.djBIcL.isConnected();
            LinearLayoutCompat linearLayoutCompat4 = EZpvd().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            android.widget.TextView textView = EZpvd().fIwbmz;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            AEQbTJ(ratePercent$default, iEZpvd, iIsConnected, linearLayoutCompat4, textView, 4.0f);
        }
        if (z) {
            if (this.KWHzl == ProductDetailsChartType.Rate) {
                InterfaceC27387juI interfaceC27387juI = this.valueOf;
                if (interfaceC27387juI != null) {
                    interfaceC27387juI.AEQbTJ("", "", false, true);
                    return;
                }
                return;
            }
            InterfaceC27387juI interfaceC27387juI2 = this.valueOf;
            if (interfaceC27387juI2 != null) {
                interfaceC27387juI2.KWHzl("", "", true);
                return;
            }
            return;
        }
        java.lang.String strCopydefault = copydefault(investKLineDataPoint);
        if (this.KWHzl != ProductDetailsChartType.Rate) {
            InterfaceC27387juI interfaceC27387juI3 = this.valueOf;
            if (interfaceC27387juI3 != null) {
                if (investKLineDataPoint != null && (investKLineCandleInfoCopydefault = investKLineDataPoint.copydefault()) != null) {
                    strAEQbTJ2 = investKLineCandleInfoCopydefault.AEQbTJ();
                }
                interfaceC27387juI3.KWHzl(strAEQbTJ2 != null ? strAEQbTJ2 : "", strCopydefault, false);
                return;
            }
            return;
        }
        if (investKLineDataPoint != null) {
            if (z2) {
                strAEQbTJ = investKLineDataPoint.copydefault().KWHzl();
            } else {
                strAEQbTJ = investKLineDataPoint.copydefault().AEQbTJ();
            }
        }
        java.lang.String strAEQbTJ3 = C27492jwH.OLrzqt.AEQbTJ(strAEQbTJ, false);
        InterfaceC27387juI interfaceC27387juI4 = this.valueOf;
        if (interfaceC27387juI4 != null) {
            interfaceC27387juI4.AEQbTJ(strAEQbTJ3, strCopydefault, z2, false);
        }
    }

    /* JADX INFO: renamed from: o.juK$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C27389juK EZpvd;
        public final /* synthetic */ ChartInterval KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C27389juK c27389juK, ChartInterval chartInterval) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c27389juK;
            this.KWHzl = chartInterval;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC27387juI interfaceC27387juI = this.EZpvd.valueOf;
                if (interfaceC27387juI != null) {
                    interfaceC27387juI.copydefault(this.KWHzl);
                }
            }
        }
    }

    public final android.graphics.Rect OLrzqt(boolean z, Highlight highlight) {
        C27413jui c27413jui = EZpvd().OLrzqt;
        if (z) {
            return new android.graphics.Rect((int) c27413jui.getX(), 0, ((int) c27413jui.getX()) + c27413jui.getWidth(), c27413jui.getHeight());
        }
        int x = (int) c27413jui.getX();
        int x2 = (int) c27413jui.getX();
        Intrinsics.copydefault(highlight);
        return new android.graphics.Rect(x, 0, x2 + C33129mqd.AhwBna(java.lang.Double.valueOf(c27413jui.getPixelForValues(highlight.getX(), highlight.getY(), YAxis.AxisDependency.LEFT).x)), c27413jui.getHeight());
    }

    public final java.lang.String copydefault(InvestKLineDataPoint investKLineDataPoint) {
        if (investKLineDataPoint == null) {
            return "";
        }
        if (this.djBIcL.AEQbTJ() == ChartInterval.Quarter || this.djBIcL.AEQbTJ() == ChartInterval.Year) {
            return pTA.formatSimpleDate$default(new Date(investKLineDataPoint.OLrzqt()), null, 1, null);
        }
        return pTA.formatSimpleDateTime$default(new Date(investKLineDataPoint.OLrzqt()), null, 1, null);
    }

    public final void KWHzl(C27398juT c27398juT) {
        LinearLayoutCompat linearLayoutCompat = EZpvd().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(c27398juT.KWHzl() ^ true ? 0 : 8);
        java.util.Iterator<T> it = this.OLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ChartInterval chartInterval = (ChartInterval) entry.getKey();
            C54989xbV c54989xbV = (C54989xbV) findViewById(((java.lang.Number) entry.getValue()).intValue());
            c54989xbV.setSelected(c27398juT.AEQbTJ() == chartInterval);
            c54989xbV.setClickable(!c27398juT.AkhnZx());
        }
    }

    public final void EZpvd(C27398juT c27398juT) {
        EZpvd().copydefault.setChartData(c27398juT.EZpvd(), 0.120000005f);
        EZpvd().OLrzqt.setChartData(c27398juT.EZpvd(), 0.120000005f);
        java.lang.String strAhwBna = c27398juT.AhwBna();
        int iDjBIcL = c27398juT.djBIcL();
        int iIsConnected = c27398juT.isConnected();
        LinearLayoutCompat linearLayoutCompat = EZpvd().isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        android.widget.TextView textView = EZpvd().fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        updateLabel$default(this, strAhwBna, iDjBIcL, iIsConnected, linearLayoutCompat, textView, 0.0f, 32, null);
        java.lang.String strValueOf = c27398juT.valueOf();
        int iGEmmrt = c27398juT.gEmmrt();
        int iIsConnected2 = c27398juT.isConnected();
        LinearLayoutCompat linearLayoutCompat2 = EZpvd().values;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        android.widget.TextView textView2 = EZpvd().ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        updateLabel$default(this, strValueOf, iGEmmrt, iIsConnected2, linearLayoutCompat2, textView2, 0.0f, 32, null);
    }

    public static /* synthetic */ void updateLabel$default(C27389juK c27389juK, java.lang.String str, int i, int i2, android.view.View view, android.widget.TextView textView, float f, int i3, java.lang.Object obj) {
        if ((i3 & 32) != 0) {
            f = 8.0f;
        }
        c27389juK.AEQbTJ(str, i, i2, view, textView, f);
    }

    public final void AEQbTJ(java.lang.String str, int i, int i2, android.view.View view, android.widget.TextView textView, float f) {
        boolean z = str.length() > 0 && i != -1;
        view.setVisibility(z ? 0 : 8);
        if (z) {
            textView.setText(str);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                layoutParams2.setMarginStart((int) copydefault(str, i, i2, C55298xhM.copydefault(f, r0)));
                textView.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        }
    }

    public final float copydefault(java.lang.String str, int i, int i2, float f) {
        boolean zAEQbTJ = C55296xhK.AEQbTJ(this);
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fEZpvd = c33566myq.EZpvd(context);
        float f2 = fEZpvd - f;
        float fOLrzqt = OLrzqt(str);
        float f3 = ((i * 1.0f) / (i2 - 1)) * fEZpvd;
        if (zAEQbTJ) {
            f3 = fEZpvd - f3;
        }
        float f4 = fOLrzqt / 2;
        return java.lang.Math.max(f3 + f4 > f2 ? f2 - fOLrzqt : f3 - f4, f);
    }

    public final float OLrzqt(java.lang.String str) {
        KWHzl().getTextBounds(str, 0, str.length(), new android.graphics.Rect());
        return r0.width();
    }

    /* JADX INFO: renamed from: o.juK$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
