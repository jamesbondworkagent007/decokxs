package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37107onb extends AbstractC52780wYb {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.omY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37107onb.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.onb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.onb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37107onb KWHzl(long j) {
            C37107onb c37107onb = new C37107onb();
            c37107onb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_EXPIRY_DATE", java.lang.Long.valueOf(j))));
            return c37107onb;
        }
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C35399nuc.LoaderManager.GFUIi);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.Long EZpvd() {
        return (java.lang.Long) this.OLrzqt.getValue();
    }

    public static final java.lang.Long copydefault(C37107onb c37107onb) {
        android.os.Bundle arguments = c37107onb.getArguments();
        if (arguments != null) {
            return java.lang.Long.valueOf(arguments.getLong("ARG_EXPIRY_DATE"));
        }
        return null;
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        int i = C35399nuc.LoaderManager.setPageName;
        java.lang.Long lEZpvd = EZpvd();
        appCompatTextView.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatStandardDate$default(new Date(lEZpvd != null ? lEZpvd.longValue() : 0L), null, 1, null)))));
        c54953xam.KWHzl.setText(getString(C35399nuc.LoaderManager.DuXjdv));
        c54953xam.KWHzl.setOnCheckedChangeListener(new Application());
    }

    /* JADX INFO: renamed from: o.onb$Application */
    public static final class Application implements CompoundButton.OnCheckedChangeListener {
        public Application() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            C37107onb.this.AEQbTJ(z);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.v));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(getString(C35399nuc.LoaderManager.clearRegistrations));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.onb$Activity */
    public static final class Activity implements Function1<AbstractC43238rlX, Unit> {
        public static final Activity KWHzl = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            KWHzl(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.onb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C37107onb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37107onb c37107onb) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c37107onb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.copydefault()) {
                    C37760ozs.EZpvd("SAVE_DO_NOT_SHOW_AGAIN_ORBITER" + this.copydefault.EZpvd(), java.lang.Boolean.TRUE);
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.onb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C37107onb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37107onb c37107onb) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c37107onb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.copydefault()) {
                    C37760ozs.EZpvd("SAVE_DO_NOT_SHOW_AGAIN_ORBITER" + this.copydefault.EZpvd(), java.lang.Boolean.TRUE);
                }
                android.content.Context context = this.copydefault.getContext();
                if (context == null) {
                    pUU.copydefault("OrbiterExpiryBottomSheet", "Context is null, cannot process VIP status deeplink");
                    C55326xho.OLrzqt("Context unavailable, cannot navigate");
                } else {
                    oGV.processDeeplink$default(oGV.EZpvd, context, "okx://exchange/miniapp/auth?appid=growth&pageurl=%2Fwholesale%2Fvip&theme=dark&StatusBarStyle=1&pageanim=push&minversion=6.130.2", null, null, Activity.KWHzl, 12, null);
                    this.copydefault.dismissAllowingStateLoss();
                }
            }
        }
    }
}
