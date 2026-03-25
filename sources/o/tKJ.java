package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tKJ extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public tNE AEQbTJ;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final tKJ OLrzqt(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, java.lang.String str2) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("arg_is_show_share", z);
            bundle.putBoolean("arg_is_self", z2);
            bundle.putString("arg_relation_id", str);
            bundle.putBoolean("arg_is_x_only", z3);
            bundle.putBoolean("arg_is_news_user", z4);
            bundle.putString("arg_alias", str2);
            tKJ tkj = new tKJ();
            tkj.setArguments(bundle);
            return tkj;
        }
    }

    public final boolean KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("arg_is_self", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AYXKKw() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("arg_relation_id");
        }
        return null;
    }

    public final boolean EZpvd() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("arg_is_x_only", false);
        }
        return false;
    }

    public final boolean AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("arg_is_news_user", false);
        }
        return false;
    }

    public final java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("arg_alias");
        }
        return null;
    }

    public final boolean OLrzqt() {
        android.os.Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("arg_is_show_share", false);
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
        this.AEQbTJ = tNE.EZpvd(getLayoutInflater(), constraintLayout, true);
        gEmmrt();
    }

    private final void gEmmrt() {
        tNE tne = this.AEQbTJ;
        if (tne == null) {
            return;
        }
        android.widget.TextView textView = tne.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(KWHzl() ? 0 : 8);
        android.widget.TextView textView2 = tne.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(KWHzl() ? 0 : 8);
        android.widget.TextView textView3 = tne.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(OLrzqt() ? 0 : 8);
        java.lang.String strCopydefault = copydefault();
        boolean z = !(strCopydefault == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault));
        android.widget.RelativeLayout relativeLayout = tne.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        relativeLayout.setVisibility((KWHzl() || EZpvd() || AEQbTJ()) ? 8 : 0);
        android.widget.TextView textView4 = tne.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(z ? 0 : 8);
        if (z) {
            tne.OLrzqt.setText(copydefault());
        }
        android.widget.TextView textView5 = tne.AhwBna;
        textView5.setOnClickListener(new ActionBar(textView5, 1000L, this));
        android.widget.RelativeLayout relativeLayout2 = tne.AEQbTJ;
        relativeLayout2.setOnClickListener(new StateListAnimator(relativeLayout2, 1000L, this));
        android.widget.TextView textView6 = tne.copydefault;
        textView6.setOnClickListener(new Application(textView6, 1000L, this));
        android.widget.TextView textView7 = tne.djBIcL;
        textView7.setOnClickListener(new Fragment(textView7, 1000L, this));
    }

    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ tKJ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, tKJ tkj) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = tkj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
                tJI tji = fragmentActivityRequireActivity instanceof tJI ? (tJI) fragmentActivityRequireActivity : null;
                if (tji != null) {
                    tji.copydefault();
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ tKJ KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tKJ tkj) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = tkj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_PersonalProfile_MyActivities_Click", (TrackChannel[]) null, Activity.EZpvd, 1, (java.lang.Object) null);
                this.KWHzl.dismissAllowingStateLoss();
                tWL twl = (tWL) C43251rlk.copydefault(tWL.class);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                twl.AEQbTJ(contextRequireContext);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tKJ EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, tKJ tkj) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = tkj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                tJI tji = fragmentActivityRequireActivity instanceof tJI ? (tJI) fragmentActivityRequireActivity : null;
                if (tji != null) {
                    tji.values();
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ tKJ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, tKJ tkj) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = tkj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC35177nqR interfaceC35177nqR;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
                java.lang.String strAYXKKw = this.AEQbTJ.AYXKKw();
                if (strAYXKKw == null || (interfaceC35177nqR = (InterfaceC35177nqR) C43251rlk.OLrzqt(InterfaceC35177nqR.class)) == null) {
                    return;
                }
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC35177nqR.OLrzqt(contextRequireContext, strAYXKKw, null);
            }
        }
    }
}
