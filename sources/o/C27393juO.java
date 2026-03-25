package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsChartType;
import java.util.Date;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27393juO extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final C27398juT OLrzqt = new C27398juT(ChartInterval.Week, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, yDY.AhwBna(), null, null, 0, null, 0, 0, true, false, null, 7152, null);
    public final InterfaceC56387yDm AEQbTJ;
    public InterfaceC27387juI AhwBna;
    public C27398juT KWHzl;
    public ProductDetailsChartType copydefault;
    public final java.util.Map<ChartInterval, java.lang.Integer> djBIcL;
    public final java.util.Map<ChartInterval, java.lang.Integer> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27393juO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27393juO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC27387juI interfaceC27387juI, @NotNull ProductDetailsChartType productDetailsChartType) {
        Intrinsics.checkNotNullParameter(interfaceC27387juI, "");
        Intrinsics.checkNotNullParameter(productDetailsChartType, "");
        this.AhwBna = interfaceC27387juI;
        this.copydefault = productDetailsChartType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.juO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27393juO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27393juO(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.juV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27393juO.copydefault(context, this);
            }
        });
        ChartInterval chartInterval = ChartInterval.Week;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(chartInterval, java.lang.Integer.valueOf(C25493ixk.ActionBar.igXuih));
        ChartInterval chartInterval2 = ChartInterval.Month;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(chartInterval2, java.lang.Integer.valueOf(C25493ixk.ActionBar.USBtdM));
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(ChartInterval.Quarter, java.lang.Integer.valueOf(C25493ixk.ActionBar.UlJrfe));
        ChartInterval chartInterval3 = ChartInterval.Year;
        this.djBIcL = C56424yEw.djBIcL(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(chartInterval3, java.lang.Integer.valueOf(C25493ixk.ActionBar.htlTjW)));
        this.gEmmrt = C56424yEw.djBIcL(C56390yDp.OLrzqt(ChartInterval.Day, java.lang.Integer.valueOf(C25493ixk.ActionBar.aUsmxb)), C56390yDp.OLrzqt(chartInterval, java.lang.Integer.valueOf(C25493ixk.ActionBar.fdOvFl)), C56390yDp.OLrzqt(chartInterval2, java.lang.Integer.valueOf(C25493ixk.ActionBar.dUDNAs)), C56390yDp.OLrzqt(chartInterval3, java.lang.Integer.valueOf(C25493ixk.ActionBar.fjfviF)));
        this.copydefault = ProductDetailsChartType.Rate;
        C27398juT c27398juT = OLrzqt;
        this.KWHzl = c27398juT;
        C27416jul c27416jul = OLrzqt().AkhnZx;
        java.lang.String string = context.getString(C25493ixk.FragmentManager.deregisterUser);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27416jul.setTitle(string);
        java.lang.String string2 = context.getString(C25493ixk.FragmentManager.getUserContextRegisteredStatus);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c27416jul.setButtonText(string2);
        c27416jul.setRetryClick(new Function0() { // from class: o.juW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27393juO.AEQbTJ(this.OLrzqt);
            }
        });
        C27420jup c27420jup = OLrzqt().DbNXlk;
        java.lang.String string3 = context.getString(C25493ixk.FragmentManager.dzkkkq);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c27420jup.setTitle(string3);
        OLrzqt().fetchVPNInfo.setChartSelectedCallback(new Application());
        setData(c27398juT);
    }

    private final C23893iNf OLrzqt() {
        return (C23893iNf) this.AEQbTJ.getValue();
    }

    public static final C23893iNf copydefault(android.content.Context context, C27393juO c27393juO) {
        return C23893iNf.copydefault(android.view.LayoutInflater.from(context), c27393juO, true);
    }

    public static final Unit AEQbTJ(C27393juO c27393juO) {
        InterfaceC27387juI interfaceC27387juI = c27393juO.AhwBna;
        if (interfaceC27387juI != null) {
            interfaceC27387juI.copydefault(c27393juO.KWHzl.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.juO$Application */
    public static final class Application implements InterfaceC27428jux {
        public Application() {
        }

        @Override // o.InterfaceC27428jux
        public void OLrzqt(Entry entry, Entry entry2, int i, boolean z) {
            C27393juO.this.KWHzl(entry, z);
        }
    }

    public static /* synthetic */ void bindTo$default(C27393juO c27393juO, InterfaceC27387juI interfaceC27387juI, ProductDetailsChartType productDetailsChartType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            productDetailsChartType = ProductDetailsChartType.Rate;
        }
        c27393juO.copydefault(interfaceC27387juI, productDetailsChartType);
    }

    public final void setData(@NotNull C27398juT c27398juT) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(c27398juT, "");
        this.KWHzl = c27398juT;
        C23893iNf c23893iNfOLrzqt = OLrzqt();
        android.widget.FrameLayout frameLayout = c23893iNfOLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
            if (this.KWHzl.DbNXlk()) {
                iDp2px$default = C55298xhM.dp2px$default(346.0f, null, 1, null);
            } else {
                iDp2px$default = C55298xhM.dp2px$default(288.0f, null, 1, null);
            }
            ((LinearLayout.LayoutParams) layoutParams2).height = iDp2px$default;
            frameLayout.setLayoutParams(layoutParams2);
            C27425juu c27425juu = c23893iNfOLrzqt.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c27425juu, "");
            c27425juu.setVisibility(C27399juU.EZpvd(this.KWHzl) ? 0 : 8);
            OLrzqt(this.KWHzl);
            C27420jup c27420jup = c23893iNfOLrzqt.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c27420jup, "");
            c27420jup.setVisibility(C27399juU.AEQbTJ(this.KWHzl) ? 0 : 8);
            C55113xdn c55113xdn = c23893iNfOLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility((!this.KWHzl.AkhnZx() || this.KWHzl.KWHzl()) ? 8 : 0);
            if (this.KWHzl.AkhnZx() && !this.KWHzl.KWHzl()) {
                c23893iNfOLrzqt.OLrzqt.KWHzl(0L);
            } else {
                c23893iNfOLrzqt.OLrzqt.copydefault();
            }
            C27416jul c27416jul = c23893iNfOLrzqt.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c27416jul, "");
            c27416jul.setVisibility((!this.KWHzl.KWHzl() || C27399juU.EZpvd(this.KWHzl)) ? 8 : 0);
            if (C27399juU.EZpvd(this.KWHzl)) {
                AEQbTJ(this.KWHzl);
            }
            invalidate();
            requestLayout();
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
    }

    public final void KWHzl(Entry entry, boolean z) {
        java.lang.String strAEQbTJ = "";
        if (z) {
            InterfaceC27387juI interfaceC27387juI = this.AhwBna;
            if (interfaceC27387juI != null) {
                interfaceC27387juI.AEQbTJ("", "", false, true);
                return;
            }
            return;
        }
        java.lang.Object data = entry != null ? entry.getData() : null;
        InvestKLineDataPoint investKLineDataPoint = data instanceof InvestKLineDataPoint ? (InvestKLineDataPoint) data : null;
        boolean z2 = (investKLineDataPoint != null ? investKLineDataPoint.valueOf() : null) == InvestKLineDataPoint.Type.BONUS;
        java.lang.String strCopydefault = copydefault(investKLineDataPoint);
        if (investKLineDataPoint != null) {
            if (z2) {
                strAEQbTJ = investKLineDataPoint.copydefault().KWHzl();
            } else {
                strAEQbTJ = investKLineDataPoint.copydefault().AEQbTJ();
            }
        }
        java.lang.String strAEQbTJ2 = C27492jwH.OLrzqt.AEQbTJ(strAEQbTJ, false);
        InterfaceC27387juI interfaceC27387juI2 = this.AhwBna;
        if (interfaceC27387juI2 != null) {
            interfaceC27387juI2.AEQbTJ(strAEQbTJ2, strCopydefault, z2, false);
        }
    }

    public final java.lang.String copydefault(InvestKLineDataPoint investKLineDataPoint) {
        if (investKLineDataPoint == null) {
            return "";
        }
        if (this.KWHzl.AEQbTJ() == ChartInterval.Quarter || this.KWHzl.AEQbTJ() == ChartInterval.Year) {
            return pTA.formatSimpleDate$default(new Date(investKLineDataPoint.OLrzqt()), null, 1, null);
        }
        return pTA.formatSimpleDateTime$default(new Date(investKLineDataPoint.OLrzqt()), null, 1, null);
    }

    public final void OLrzqt(C27398juT c27398juT) {
        if (c27398juT.DbNXlk()) {
            LinearLayoutCompat linearLayoutCompat = OLrzqt().EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(c27398juT.KWHzl() ^ true ? 0 : 8);
            LinearLayoutCompat linearLayoutCompat2 = OLrzqt().KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(8);
            int i = 0;
            for (java.lang.Object obj : this.gEmmrt.entrySet()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                Map.Entry entry = (Map.Entry) obj;
                ChartInterval chartInterval = (ChartInterval) entry.getKey();
                C54989xbV c54989xbV = (C54989xbV) findViewById(((java.lang.Number) entry.getValue()).intValue());
                c54989xbV.setOnClickListener(new StateListAnimator(c54989xbV, 1000L, this, chartInterval));
                c54989xbV.setSelected(c27398juT.AEQbTJ() == chartInterval);
                c54989xbV.setClickable(!c27398juT.AkhnZx());
                i++;
            }
            return;
        }
        LinearLayoutCompat linearLayoutCompat3 = OLrzqt().KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        linearLayoutCompat3.setVisibility(c27398juT.KWHzl() ^ true ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat4 = OLrzqt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
        linearLayoutCompat4.setVisibility(8);
        int i2 = 0;
        for (java.lang.Object obj2 : this.djBIcL.entrySet()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            ChartInterval chartInterval2 = (ChartInterval) entry2.getKey();
            C54989xbV c54989xbV2 = (C54989xbV) findViewById(((java.lang.Number) entry2.getValue()).intValue());
            c54989xbV2.setOnClickListener(new ActionBar(c54989xbV2, 1000L, this, chartInterval2));
            c54989xbV2.setSelected(c27398juT.AEQbTJ() == chartInterval2);
            c54989xbV2.setClickable(!c27398juT.AkhnZx());
            i2++;
        }
    }

    /* JADX INFO: renamed from: o.juO$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ChartInterval EZpvd;
        public final /* synthetic */ C27393juO KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27393juO c27393juO, ChartInterval chartInterval) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c27393juO;
            this.EZpvd = chartInterval;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC27387juI interfaceC27387juI = this.KWHzl.AhwBna;
                if (interfaceC27387juI != null) {
                    interfaceC27387juI.copydefault(this.EZpvd);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.juO$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ChartInterval AEQbTJ;
        public final /* synthetic */ C27393juO EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27393juO c27393juO, ChartInterval chartInterval) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c27393juO;
            this.AEQbTJ = chartInterval;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC27387juI interfaceC27387juI = this.EZpvd.AhwBna;
                if (interfaceC27387juI != null) {
                    interfaceC27387juI.copydefault(this.AEQbTJ);
                }
            }
        }
    }

    public final void AEQbTJ(C27398juT c27398juT) {
        OLrzqt().fetchVPNInfo.setData(c27398juT);
    }

    /* JADX INFO: renamed from: o.juO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
