package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.ZapSwapSlippageBinder$1;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26697jhH extends AbstractC27119jpF<InterfaceC24178iXu.SharedElementCallback, C23792iJm> {
    public final Function1<InterfaceC24178iXu.SharedElementCallback, Unit> KWHzl;

    /* JADX INFO: renamed from: o.jhH$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapSlippageActivity.SlippageMode.values().length];
            try {
                iArr[SwapSlippageActivity.SlippageMode.DYNAMIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapSlippageActivity.SlippageMode.FIXED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26697jhH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.iXu$SharedElementCallback, kotlin.Unit>):void (m)] (LINE:16) call: o.jhH.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C26697jhH(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$SharedElementCallback, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26697jhH(Function1<? super InterfaceC24178iXu.SharedElementCallback, Unit> function1) {
        super(ZapSwapSlippageBinder$1.INSTANCE);
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23792iJm c23792iJm, @NotNull InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
        java.lang.String strAEQbTJ;
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c23792iJm, "");
        Intrinsics.checkNotNullParameter(sharedElementCallback, "");
        c23792iJm.getRoot().setPadding(c23792iJm.getRoot().getPaddingLeft(), 0, c23792iJm.getRoot().getPaddingRight(), C55298xhM.dp2px$default(20.0f, null, 1, null));
        C55258xgZ c55258xgZ = c23792iJm.EZpvd;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, c23792iJm));
        C55258xgZ c55258xgZ2 = c23792iJm.EZpvd;
        c55258xgZ2.setTextValue(c55258xgZ2.getContext().getString(C25493ixk.FragmentManager.fjfviF));
        android.widget.TextView textView = c23792iJm.AEQbTJ;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this, sharedElementCallback));
        android.widget.ImageView imageView = c23792iJm.OLrzqt;
        imageView.setOnClickListener(new Application(imageView, 1000L, this, sharedElementCallback));
        android.widget.TextView textView2 = c23792iJm.AEQbTJ;
        if (!sharedElementCallback.AhwBna() && !sharedElementCallback.gEmmrt()) {
            java.lang.String ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, sharedElementCallback.AEQbTJ(), false, 2, null);
            android.content.Context context = c23792iJm.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            strKWHzl = C33069mpW.KWHzl(context, C25493ixk.FragmentManager.zblBkD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ratePercent$default)));
        } else {
            if (sharedElementCallback.AhwBna()) {
                java.lang.String strKWHzl2 = sharedElementCallback.KWHzl();
                strAEQbTJ = C33129mqd.KWHzl(C33129mqd.divS$default(strKWHzl2 == null ? "" : strKWHzl2, "100", null, null, null, 14, null), sharedElementCallback.AEQbTJ());
            } else if (sharedElementCallback.gEmmrt()) {
                strAEQbTJ = C33129mqd.divS$default(sharedElementCallback.copydefault(), "100", null, null, null, 14, null);
            } else {
                strAEQbTJ = sharedElementCallback.AEQbTJ();
            }
            java.lang.String ratePercent$default2 = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, strAEQbTJ, false, 2, null);
            int i = TaskDescription.copydefault[sharedElementCallback.valueOf().ordinal()];
            if (i == 1) {
                android.content.Context context2 = c23792iJm.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                strKWHzl = C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.zblBkD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ratePercent$default2)));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strKWHzl = ratePercent$default2;
            }
        }
        textView2.setText(strKWHzl);
    }

    /* JADX INFO: renamed from: o.jhH$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C23792iJm AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C23792iJm c23792iJm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c23792iJm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.KWHzl(C25493ixk.Activity.fFgQHt);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.DcMfJKOmnske, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jhH$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ InterfaceC24178iXu.SharedElementCallback AEQbTJ;
        public final /* synthetic */ C26697jhH EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26697jhH c26697jhH, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c26697jhH;
            this.AEQbTJ = sharedElementCallback;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jhH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ InterfaceC24178iXu.SharedElementCallback AEQbTJ;
        public final /* synthetic */ C26697jhH EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C26697jhH c26697jhH, InterfaceC24178iXu.SharedElementCallback sharedElementCallback) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c26697jhH;
            this.AEQbTJ = sharedElementCallback;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }
}
