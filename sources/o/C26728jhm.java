package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.Maturity;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26728jhm extends AbstractC27115jpB<InterfaceC24178iXu.TaskDescription, InterfaceC26732jhq> {
    public final Function1<InterfaceC24178iXu.TaskDescription, Unit> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26728jhm() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(kotlin.jvm.functions.Function1<? super o.iXu$TaskDescription, kotlin.Unit>, boolean):void (m)] (LINE:32) call: o.jhm.<init>(kotlin.jvm.functions.Function1, boolean):void type: THIS */
    public /* synthetic */ C26728jhm(Function1 function1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? false : z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$TaskDescription, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26728jhm(Function1<? super InterfaceC24178iXu.TaskDescription, Unit> function1, final boolean z) {
        super(new yHO() { // from class: o.jhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C26728jhm.AEQbTJ(z, (android.view.LayoutInflater) obj, (android.view.ViewGroup) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        this.EZpvd = function1;
        this.OLrzqt = z;
    }

    public static final InterfaceC26732jhq AEQbTJ(boolean z, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        if (z) {
            C23795iJp c23795iJpAEQbTJ = C23795iJp.AEQbTJ(layoutInflater, viewGroup, z2);
            Intrinsics.checkNotNullExpressionValue(c23795iJpAEQbTJ, "");
            return new C26692jhC(c23795iJpAEQbTJ);
        }
        C23788iJi c23788iJiEZpvd = C23788iJi.EZpvd(layoutInflater, viewGroup, z2);
        Intrinsics.checkNotNullExpressionValue(c23788iJiEZpvd, "");
        return new C26690jhA(c23788iJiEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull InterfaceC26732jhq interfaceC26732jhq, @NotNull InterfaceC24178iXu.TaskDescription taskDescription) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(interfaceC26732jhq, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        android.content.Context context = interfaceC26732jhq.getRoot().getContext();
        if (taskDescription.OLrzqt() != null) {
            string = context.getString(taskDescription.OLrzqt().intValue());
        } else {
            java.lang.String strDjBIcL = taskDescription.djBIcL();
            if (strDjBIcL != null) {
                string = strDjBIcL;
            }
        }
        Intrinsics.copydefault((java.lang.Object) string);
        interfaceC26732jhq.OLrzqt().setTextValue(string);
        if (taskDescription.copydefault() != null || taskDescription.AEQbTJ() != null) {
            interfaceC26732jhq.OLrzqt().setHelperLabelType(this.OLrzqt ? 1 : 0);
            interfaceC26732jhq.OLrzqt().setUnderlineStyle(0);
            if (taskDescription.AEQbTJ() != null) {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                Intrinsics.copydefault(context);
                c27569jxf.AEQbTJ(context, null, interfaceC26732jhq.OLrzqt(), taskDescription.AEQbTJ(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            }
            if (taskDescription.copydefault() != null) {
                C55258xgZ c55258xgZOLrzqt = interfaceC26732jhq.OLrzqt();
                c55258xgZOLrzqt.setOnClickListener(new Application(c55258xgZOLrzqt, 1000L, this, context, string, taskDescription));
            }
        } else {
            interfaceC26732jhq.OLrzqt().setHelperLabelType(2);
        }
        android.widget.TextView textViewEZpvd = interfaceC26732jhq.EZpvd();
        Intrinsics.copydefault(context);
        java.lang.String strOLrzqt = OLrzqt(context, taskDescription.KWHzl());
        java.lang.String strValueOf = taskDescription.valueOf();
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            strOLrzqt = strValueOf;
        }
        textViewEZpvd.setText(strOLrzqt);
        if (taskDescription.gEmmrt() != null) {
            C27569jxf.OLrzqt.KWHzl(interfaceC26732jhq.EZpvd(), taskDescription.AhwBna());
        }
        android.widget.TextView textViewEZpvd2 = interfaceC26732jhq.EZpvd();
        textViewEZpvd2.setOnClickListener(new StateListAnimator(textViewEZpvd2, 1000L, taskDescription, this, context));
        if (this.EZpvd != null) {
            EZpvd(interfaceC26732jhq.EZpvd(), yDY.gEmmrt(DetailItemType.NETWORK_FEE, DetailItemType.FINALITY_PROVIDER).contains(taskDescription.EZpvd()));
        }
    }

    public final java.lang.String OLrzqt(android.content.Context context, iXF<?> ixf) {
        java.lang.Object objAEQbTJ = ixf != null ? ixf.AEQbTJ() : null;
        if (objAEQbTJ == null) {
            return null;
        }
        if (objAEQbTJ instanceof java.lang.String) {
            return (java.lang.String) ixf.AEQbTJ();
        }
        if (objAEQbTJ instanceof Maturity) {
            return C33069mpW.KWHzl(context, C25493ixk.FragmentManager.QKDJJA, C27492jwH.OLrzqt.EZpvd(C33129mqd.valueOf(((Maturity) ixf.AEQbTJ()).KWHzl())));
        }
        if (!(objAEQbTJ instanceof InvestExchangeRateBean)) {
            return "";
        }
        return pTB.formatLocalized$default("1", null, 1, null) + " " + ((InvestExchangeRateBean) ixf.AEQbTJ()).getFromTokenSymbol() + " " + C33070mpX.AYXKKw(C25493ixk.FragmentManager.QVsKAR) + " " + C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, ((InvestExchangeRateBean) ixf.AEQbTJ()).getExchangeRate(), 6, 2, false, false, 24, null) + " " + ((InvestExchangeRateBean) ixf.AEQbTJ()).getToTokenSymbol();
    }

    public final void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (str.length() > 0) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        viewOnClickListenerC54939xaY.EZpvd(str2);
        java.lang.String string = context.getString(C25493ixk.FragmentManager.OHqIaq);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.jht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26728jhm.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(android.widget.TextView textView, boolean z) {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        int i = C52761wXj.TaskDescription.QFTsTN;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(12.0f, context);
        int currentTextColor = textView.getCurrentTextColor();
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c27569jxf.copydefault(textView, i, iCopydefault, z, java.lang.Integer.valueOf(currentTextColor), C55298xhM.copydefault(4.0f, context2));
    }

    /* JADX INFO: renamed from: o.jhm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ C26728jhm AhwBna;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ InterfaceC24178iXu.TaskDescription copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26728jhm c26728jhm, android.content.Context context, java.lang.String str, InterfaceC24178iXu.TaskDescription taskDescription) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AhwBna = c26728jhm;
            this.AEQbTJ = context;
            this.EZpvd = str;
            this.copydefault = taskDescription;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C26728jhm c26728jhm = this.AhwBna;
                Intrinsics.copydefault(this.AEQbTJ);
                android.content.Context context = this.AEQbTJ;
                java.lang.String str = this.EZpvd;
                java.lang.String string = context.getString(this.copydefault.copydefault().intValue());
                Intrinsics.checkNotNullExpressionValue(string, "");
                c26728jhm.KWHzl(context, str, string);
            }
        }
    }

    /* JADX INFO: renamed from: o.jhm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26728jhm EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ InterfaceC24178iXu.TaskDescription copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, InterfaceC24178iXu.TaskDescription taskDescription, C26728jhm c26728jhm, android.content.Context context) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = taskDescription;
            this.EZpvd = c26728jhm;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.gEmmrt() == null) {
                    Function1 function1 = this.EZpvd.EZpvd;
                    if (function1 != null) {
                        function1.invoke(this.copydefault);
                        return;
                    }
                    return;
                }
                C26728jhm c26728jhm = this.EZpvd;
                Intrinsics.copydefault(this.OLrzqt);
                android.content.Context context = this.OLrzqt;
                java.lang.String string = context.getString(this.copydefault.gEmmrt().intValue());
                Intrinsics.checkNotNullExpressionValue(string, "");
                c26728jhm.KWHzl(context, "", string);
            }
        }
    }
}
