package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47892tyg extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public tOB KWHzl;

    /* JADX INFO: renamed from: o.tyg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C47892tyg newInstance$default(TaskDescription taskDescription, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return taskDescription.EZpvd(i, i2);
        }

        public final C47892tyg EZpvd(int i, int i2) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("orbiterPlusExpireStatus", i);
            bundle.putInt("orbiterPlusDaysLeft", i2);
            C47892tyg c47892tyg = new C47892tyg();
            c47892tyg.setArguments(bundle);
            return c47892tyg;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = tOB.KWHzl(getLayoutInflater(), constraintLayout, true);
        OLrzqt();
    }

    private final void OLrzqt() {
        android.os.Bundle arguments = getArguments();
        tOB tob = null;
        java.lang.Integer numValueOf = arguments != null ? java.lang.Integer.valueOf(arguments.getInt("orbiterPlusExpireStatus")) : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.Integer numValueOf2 = arguments2 != null ? java.lang.Integer.valueOf(arguments2.getInt("orbiterPlusDaysLeft", 0)) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_Confirm_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            java.lang.String strCopydefault = C33069mpW.copydefault(this, C47501trL.Fragment.Ufzxmz, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : 0))));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.ULRxlR);
            tOB tob2 = this.KWHzl;
            if (tob2 == null) {
                Intrinsics.gEmmrt("");
                tob2 = null;
            }
            tob2.KWHzl.setText(strCopydefault);
            tOB tob3 = this.KWHzl;
            if (tob3 == null) {
                Intrinsics.gEmmrt("");
                tob3 = null;
            }
            tob3.OLrzqt.setText(strAYXKKw);
            tOB tob4 = this.KWHzl;
            if (tob4 == null) {
                Intrinsics.gEmmrt("");
                tob4 = null;
            }
            tob4.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.QDqgQU));
            tOB tob5 = this.KWHzl;
            if (tob5 == null) {
                Intrinsics.gEmmrt("");
                tob5 = null;
            }
            tob5.EZpvd.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DNMMPQ));
            tOB tob6 = this.KWHzl;
            if (tob6 == null) {
                Intrinsics.gEmmrt("");
                tob6 = null;
            }
            C52794wYp c52794wYp = tob6.AEQbTJ;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
            tOB tob7 = this.KWHzl;
            if (tob7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tob = tob7;
            }
            C52794wYp c52794wYp2 = tob.EZpvd;
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            C32866mlf.onEvent$default("Orbit_ExpiredOrbiterPlus_Confirm_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C47501trL.Fragment.RXzakW);
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C47501trL.Fragment.QXDzTk);
            tOB tob8 = this.KWHzl;
            if (tob8 == null) {
                Intrinsics.gEmmrt("");
                tob8 = null;
            }
            tob8.KWHzl.setText(strAYXKKw2);
            tOB tob9 = this.KWHzl;
            if (tob9 == null) {
                Intrinsics.gEmmrt("");
                tob9 = null;
            }
            tob9.OLrzqt.setText(strAYXKKw3);
            tOB tob10 = this.KWHzl;
            if (tob10 == null) {
                Intrinsics.gEmmrt("");
                tob10 = null;
            }
            tob10.AEQbTJ.setText(C33070mpX.AYXKKw(C47501trL.Fragment.QIZEnU));
            tOB tob11 = this.KWHzl;
            if (tob11 == null) {
                Intrinsics.gEmmrt("");
                tob11 = null;
            }
            tob11.EZpvd.setText(C33070mpX.AYXKKw(C47501trL.Fragment.RVsVBY));
            tOB tob12 = this.KWHzl;
            if (tob12 == null) {
                Intrinsics.gEmmrt("");
                tob12 = null;
            }
            C52794wYp c52794wYp3 = tob12.AEQbTJ;
            c52794wYp3.setOnClickListener(new StateListAnimator(c52794wYp3, 1000L, this));
            tOB tob13 = this.KWHzl;
            if (tob13 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tob = tob13;
            }
            C52794wYp c52794wYp4 = tob.EZpvd;
            c52794wYp4.setOnClickListener(new Application(c52794wYp4, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.tyg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C47892tyg AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C47892tyg c47892tyg) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c47892tyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_Confirm_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.AEQbTJ.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.tyg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C47892tyg KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C47892tyg c47892tyg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c47892tyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_CheckStatus_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                kOH koh = (kOH) C43248rlh.KWHzl.AEQbTJ(kOH.class);
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                koh.KWHzl(fragmentActivityRequireActivity);
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.tyg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C47892tyg OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C47892tyg c47892tyg) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c47892tyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_ExpiredOrbiterPlus_Dismiss_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.tyg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C47892tyg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C47892tyg c47892tyg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c47892tyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_ExpiredOrbiterPlus_Confirm_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                tWL twl = (tWL) C43248rlh.KWHzl.AEQbTJ(tWL.class);
                FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                twl.KWHzl(fragmentActivityRequireActivity, (Function1<? super java.lang.Boolean, Unit>) null);
                this.copydefault.dismiss();
            }
        }
    }
}
