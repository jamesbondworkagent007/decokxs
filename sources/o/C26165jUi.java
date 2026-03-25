package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26165jUi extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jUj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26165jUi.EZpvd(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.jUi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jUi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            ((C26165jUi) jSA.EZpvd(new C26165jUi(), C56390yDp.OLrzqt("groupId", str))).show(fragmentManager);
        }
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String EZpvd(C26165jUi c26165jUi) {
        android.os.Bundle arguments = c26165jUi.getArguments();
        if (arguments != null) {
            return arguments.getString("groupId");
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42648raQ c42648raQEZpvd = C42648raQ.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        AppCompatTextView appCompatTextView = c42648raQEZpvd.copydefault;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = c42648raQEZpvd.KWHzl;
        appCompatTextView2.setOnClickListener(new StateListAnimator(appCompatTextView2, 1000L, this));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.jUi$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", "edit", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.jUi$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", RequestParameters.SUBRESOURCE_DELETE, false, 4, null);
        }
    }

    public final void KWHzl() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ActivityC26135jTf activityC26135jTf = fragmentActivityRequireActivity instanceof ActivityC26135jTf ? (ActivityC26135jTf) fragmentActivityRequireActivity : null;
        if (activityC26135jTf != null) {
            activityC26135jTf.KWHzl(EZpvd());
        }
    }

    public final void OLrzqt() {
        java.lang.String strEZpvd;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ActivityC26135jTf activityC26135jTf = fragmentActivityRequireActivity instanceof ActivityC26135jTf ? (ActivityC26135jTf) fragmentActivityRequireActivity : null;
        if (activityC26135jTf == null || (strEZpvd = EZpvd()) == null) {
            return;
        }
        activityC26135jTf.EZpvd(strEZpvd);
    }

    /* JADX INFO: renamed from: o.jUi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C26165jUi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26165jUi c26165jUi) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c26165jUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorites_GroupManageBottomSheet_FullButton_Click", (TrackChannel[]) null, TaskDescription.KWHzl, 1, (java.lang.Object) null);
                this.AEQbTJ.dismiss();
                this.AEQbTJ.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.jUi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C26165jUi AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C26165jUi c26165jUi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c26165jUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorites_GroupManageBottomSheet_FullButton_Click", (TrackChannel[]) null, Application.OLrzqt, 1, (java.lang.Object) null);
                this.AEQbTJ.dismiss();
                this.AEQbTJ.OLrzqt();
            }
        }
    }
}
