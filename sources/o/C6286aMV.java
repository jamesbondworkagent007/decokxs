package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aMV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6286aMV extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static Function0<Unit> copydefault;

    /* JADX INFO: renamed from: o.aMV$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aMV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(Function0<Unit> function0) {
            C6286aMV.copydefault = function0;
        }

        public static /* synthetic */ C6286aMV newInstance$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return taskDescription.AEQbTJ(str);
        }

        public final C6286aMV AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C6286aMV c6286aMV = new C6286aMV();
            c6286aMV.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FROM_PAGE", str)));
            return c6286aMV;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8288azs c8288azsAEQbTJ = C8288azs.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        LottieAnimationView lottieAnimationView = c8288azsAEQbTJ.EZpvd;
        lottieAnimationView.setAnimation(C52761wXj.PendingIntent.ejfBZ);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.playAnimation();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_FROM_PAGE") : null;
        final java.lang.String str = string != null ? string : "";
        C52794wYp c52794wYp = c8288azsAEQbTJ.OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, str));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Wallet_Passkey_Exist_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aMU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6286aMV.copydefault(str, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.aMV$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", this.OLrzqt, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        copydefault = null;
    }

    /* JADX INFO: renamed from: o.aMV$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C6286aMV AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6286aMV c6286aMV, java.lang.String str) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c6286aMV;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Wallet_Passkey_Exist_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Application(this.OLrzqt));
                this.AEQbTJ.dismissAllowingStateLoss();
                Function0 function0 = C6286aMV.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
