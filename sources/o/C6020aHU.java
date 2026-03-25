package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aHU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C6020aHU extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> KWHzl;
    public final ActivityResultLauncher<PasskeyManagementRequest> copydefault;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(PasskeyManagementState passkeyManagementState) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    public C6020aHU() {
        ActivityResultLauncher<PasskeyManagementRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).valueOf(), new ActivityResultCallback() { // from class: o.aHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6020aHU.EZpvd((PasskeyManagementState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aHU$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C6020aHU newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return activity.OLrzqt(str, str2);
        }

        public final C6020aHU OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C6020aHU c6020aHU = new C6020aHU();
            c6020aHU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_DESC", str), C56390yDp.OLrzqt("KEY_FROM_PAGE", str2)));
            return c6020aHU;
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
        C8287azr c8287azrOLrzqt = C8287azr.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        LottieAnimationView lottieAnimationView = c8287azrOLrzqt.OLrzqt;
        lottieAnimationView.setAnimation(C52761wXj.PendingIntent.ejfBZ);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.playAnimation();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_FROM_PAGE") : null;
        final java.lang.String str = string != null ? string : "";
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("KEY_DESC") : null;
        android.widget.TextView textView = c8287azrOLrzqt.EZpvd;
        if (string2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string2)) {
            string2 = C33070mpX.AYXKKw(C8206ayP.Dialog.RzdrRQ);
        }
        textView.setText(string2);
        C52794wYp c52794wYp = c8287azrOLrzqt.copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, str));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Passkey_Limit_Reach_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6020aHU.KWHzl(str, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.aHU$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str) {
            this.AEQbTJ = str;
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
            EventParamsList.put$default(eventParamsList, "from_page", this.AEQbTJ, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.aHU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C6020aHU AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6020aHU c6020aHU, java.lang.String str) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c6020aHU;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Passkey_Limit_Reach_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new TaskDescription(this.EZpvd));
                this.AEQbTJ.copydefault.launch(new PasskeyManagementRequest(false, false));
                Function0<Unit> function0EZpvd = this.AEQbTJ.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
