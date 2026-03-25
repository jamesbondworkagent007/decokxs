package o;

import android.view.View;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.PriceV3UnClaimFeeItemBinder$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26727jhl extends AbstractC27119jpF<InterfaceC24178iXu.ComponentCallbacks2, C23908iNu> {
    public final Function1<InterfaceC24178iXu.ComponentCallbacks2, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26727jhl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.iXu$ComponentCallbacks2, kotlin.Unit>):void (m)] (LINE:14) call: o.jhl.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C26727jhl(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$ComponentCallbacks2, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26727jhl(Function1<? super InterfaceC24178iXu.ComponentCallbacks2, Unit> function1) {
        super(PriceV3UnClaimFeeItemBinder$1.INSTANCE);
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23908iNu c23908iNu, @NotNull InterfaceC24178iXu.ComponentCallbacks2 componentCallbacks2) {
        Intrinsics.checkNotNullParameter(c23908iNu, "");
        Intrinsics.checkNotNullParameter(componentCallbacks2, "");
        C55258xgZ c55258xgZ = c23908iNu.AhwBna;
        c55258xgZ.setTextValue(c55258xgZ.getContext().getString(C25493ixk.FragmentManager.OEgNct));
        c23908iNu.AhwBna.setHelperLabelType((componentCallbacks2.OLrzqt() == null || !C33129mqd.OLrzqt((java.lang.CharSequence) componentCallbacks2.OLrzqt().getTipContent())) ? 2 : 1);
        C55258xgZ c55258xgZ2 = c23908iNu.AhwBna;
        c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, this, componentCallbacks2));
        android.widget.LinearLayout linearLayout = c23908iNu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(componentCallbacks2.copydefault().isEmpty() ^ true ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = c23908iNu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(componentCallbacks2.copydefault().size() <= 1 ? 8 : 0);
        android.widget.LinearLayout linearLayout3 = c23908iNu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        if (linearLayout3.getVisibility() == 0) {
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AuCTelauCTel(componentCallbacks2.copydefault());
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.widget.ImageView imageView = c23908iNu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), 0, 0.0f, 24, null);
            c23908iNu.gEmmrt.setText(investTokenWithAmount.getCoinAmount() + " " + investTokenWithAmount.getTokenSymbol());
        }
        android.widget.LinearLayout linearLayout4 = c23908iNu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        if (linearLayout4.getVisibility() == 0) {
            InvestTokenWithAmount investTokenWithAmount2 = componentCallbacks2.copydefault().get(1);
            C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
            android.widget.ImageView imageView2 = c23908iNu.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C27569jxf.loadCircleWithBorder$default(c27569jxf2, imageView2, investTokenWithAmount2.getTokenLogo(), c27569jxf2.OLrzqt(), 0, 0.0f, 24, null);
            c23908iNu.valueOf.setText(investTokenWithAmount2.getCoinAmount() + " " + investTokenWithAmount2.getTokenSymbol());
        }
    }

    /* JADX INFO: renamed from: o.jhl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26727jhl EZpvd;
        public final /* synthetic */ InterfaceC24178iXu.ComponentCallbacks2 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26727jhl c26727jhl, InterfaceC24178iXu.ComponentCallbacks2 componentCallbacks2) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c26727jhl;
            this.KWHzl = componentCallbacks2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }
}
