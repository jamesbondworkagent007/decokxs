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

/* JADX INFO: renamed from: o.aHT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C6019aHT extends wXX {
    public Function0<Unit> KWHzl;
    public final ActivityResultLauncher<PasskeyManagementRequest> OLrzqt;
    public Function0<Unit> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final void OLrzqt(PasskeyManagementState passkeyManagementState) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    public C6019aHT() {
        ActivityResultLauncher<PasskeyManagementRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).valueOf(), new ActivityResultCallback() { // from class: o.aHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6019aHT.OLrzqt((PasskeyManagementState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aHT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C6019aHT newInstance$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return application.KWHzl(str, str2);
        }

        public final C6019aHT KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C6019aHT c6019aHT = new C6019aHT();
            c6019aHT.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_DESC", str), C56390yDp.OLrzqt("KEY_FROM_PAGE", str2)));
            return c6019aHT;
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
        C8286azq c8286azqAEQbTJ = C8286azq.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        LottieAnimationView lottieAnimationView = c8286azqAEQbTJ.EZpvd;
        lottieAnimationView.setAnimation(C52761wXj.PendingIntent.ejfBZ);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.playAnimation();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_FROM_PAGE") : null;
        final java.lang.String str = string != null ? string : "";
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("KEY_DESC") : null;
        android.widget.TextView textView = c8286azqAEQbTJ.AEQbTJ;
        if (string2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string2)) {
            string2 = C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAY);
        }
        textView.setText(string2);
        C52794wYp c52794wYp = c8286azqAEQbTJ.copydefault;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, str));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Passkey_Limit_Reach_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6019aHT.EZpvd(str, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.aHT$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", this.EZpvd, false, 4, null);
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
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
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.aHT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ C6019aHT KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6019aHT c6019aHT, java.lang.String str) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c6019aHT;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("Passkey_Limit_Reach_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new ActionBar(this.EZpvd));
                this.KWHzl.OLrzqt.launch(new PasskeyManagementRequest(false, false));
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
