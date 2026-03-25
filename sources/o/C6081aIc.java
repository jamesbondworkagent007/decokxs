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

/* JADX INFO: renamed from: o.aIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6081aIc extends wXX {
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.aIc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aIc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C6081aIc newInstance$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return taskDescription.AEQbTJ(str);
        }

        public final C6081aIc AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C6081aIc c6081aIc = new C6081aIc();
            c6081aIc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_FROM_PAGE", str)));
            return c6081aIc;
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
        C5638aAJ c5638aAJEZpvd = C5638aAJ.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        LottieAnimationView lottieAnimationView = c5638aAJEZpvd.KWHzl;
        lottieAnimationView.setAnimation(C52761wXj.PendingIntent.ejfBZ);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.playAnimation();
        C52794wYp c52794wYp = c5638aAJEZpvd.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_FROM_PAGE") : null;
        final java.lang.String str = string != null ? string : "";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Wallet_Passkey_Unavaliable_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6081aIc.OLrzqt(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        Function0<Unit> function0 = this.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    /* JADX INFO: renamed from: o.aIc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6081aIc KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6081aIc c6081aIc) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c6081aIc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> function0Copydefault = this.KWHzl.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
