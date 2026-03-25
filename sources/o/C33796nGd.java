package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.okimcore.model.im.group.VipGroupDismissState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33796nGd extends AbstractC52780wYb {
    public boolean EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nGe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33796nGd.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nGf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C33796nGd.KWHzl(this.copydefault));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    /* JADX INFO: renamed from: o.nGd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C33796nGd newInstance$default(StateListAnimator stateListAnimator, VipGroupDismissState vipGroupDismissState, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return stateListAnimator.KWHzl(vipGroupDismissState, z);
        }

        public final C33796nGd KWHzl(@NotNull VipGroupDismissState vipGroupDismissState, boolean z) {
            Intrinsics.checkNotNullParameter(vipGroupDismissState, "");
            C33796nGd c33796nGd = new C33796nGd();
            c33796nGd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_EXPIRY_STATUS", vipGroupDismissState), C56390yDp.OLrzqt("ARG_SHOW_CHECK_BOX", java.lang.Boolean.valueOf(z))));
            return c33796nGd;
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        int i = C35399nuc.LoaderManager.ICustomTabsService;
        VipGroupDismissState vipGroupDismissStateEZpvd = EZpvd();
        return C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(vipGroupDismissStateEZpvd != null ? vipGroupDismissStateEZpvd.getExpiryDays() : null))));
    }

    public final VipGroupDismissState EZpvd() {
        return (VipGroupDismissState) this.copydefault.getValue();
    }

    public static final VipGroupDismissState copydefault(C33796nGd c33796nGd) {
        android.os.Bundle arguments = c33796nGd.getArguments();
        if (arguments != null) {
            return (VipGroupDismissState) arguments.getParcelable("ARG_EXPIRY_STATUS");
        }
        return null;
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean KWHzl(C33796nGd c33796nGd) {
        android.os.Bundle arguments = c33796nGd.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_SHOW_CHECK_BOX", true);
        }
        return true;
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.asInterface));
        c54953xam.KWHzl.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ICustomTabsCallbackStubProxy));
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(copydefault() ? 0 : 8);
        c54953xam.KWHzl.setOnCheckedChangeListener(new Activity());
        wYK wyk2 = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk2, "");
        ViewGroup.LayoutParams layoutParams = wyk2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt);
            wyk2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: renamed from: o.nGd$Activity */
    public static final class Activity implements CompoundButton.OnCheckedChangeListener {
        public Activity() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            C33796nGd.this.KWHzl(z);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.clearRegistrations));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gezFCt));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.nGd$Application */
    public static final class Application implements Function1<AbstractC43238rlX, Unit> {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            copydefault(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl() {
        VipGroupDismissState vipGroupDismissStateEZpvd;
        if (copydefault() && this.EZpvd && (vipGroupDismissStateEZpvd = EZpvd()) != null) {
            C37760ozs.EZpvd("SAVE_DO_NOT_SHOW_AGAIN_VIP_CHAT", vipGroupDismissStateEZpvd);
        }
    }

    /* JADX INFO: renamed from: o.nGd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C33796nGd OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C33796nGd c33796nGd) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c33796nGd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.KWHzl();
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.nGd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C33796nGd KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C33796nGd c33796nGd) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c33796nGd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl();
                android.content.Context context = this.KWHzl.getContext();
                if (context == null) {
                    pUU.copydefault("VipGroupFrozenNoticeBottomSheet", "Context is null, cannot process VIP status deeplink");
                    C55326xho.OLrzqt("Context unavailable, cannot navigate");
                } else {
                    oGV.processDeeplink$default(oGV.EZpvd, context, "okx://exchange/miniapp/auth?appid=growth&pageurl=%2Fwholesale%2Fvip&theme=dark&StatusBarStyle=1&pageanim=push&minversion=6.130.2", null, null, Application.AEQbTJ, 12, null);
                    this.KWHzl.dismissAllowingStateLoss();
                }
            }
        }
    }
}
