package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9694baS extends androidx.fragment.app.Fragment {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> KWHzl;
    public android.content.Intent copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment OLrzqt(@NotNull android.content.Intent intent, @NotNull Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = intent;
        this.KWHzl = function2;
        return this;
    }

    /* JADX INFO: renamed from: o.baS$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.baS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.content.Intent intent, @NotNull Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(function2, "");
            fragment.getChildFragmentManager().beginTransaction().add(new C9694baS().OLrzqt(intent, function2), (java.lang.String) null).commitAllowingStateLoss();
        }

        public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull android.content.Intent intent, @NotNull Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(function2, "");
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(new C9694baS().OLrzqt(intent, function2), (java.lang.String) null).commitAllowingStateLoss();
        }

        public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull android.content.Intent intent, @NotNull Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(function2, "");
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(new C9694baS().OLrzqt(intent, function2), (java.lang.String) null).commitAllowingStateLoss();
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Intent intent, @NotNull Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(function2, "");
            fragmentManager.beginTransaction().add(new C9694baS().OLrzqt(intent, function2), (java.lang.String) null).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            EZpvd();
            return;
        }
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.baX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C9694baS.copydefault(this.KWHzl, (ActivityResult) obj);
            }
        });
        android.content.Intent intent = this.copydefault;
        if (intent == null) {
            Intrinsics.gEmmrt("");
            intent = null;
        }
        activityResultLauncherRegisterForActivityResult.launch(intent);
    }

    public static final void copydefault(C9694baS c9694baS, ActivityResult activityResult) {
        Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2 = c9694baS.KWHzl;
        if (function2 == null) {
            Intrinsics.gEmmrt("");
            function2 = null;
        }
        function2.invoke(java.lang.Integer.valueOf(activityResult.getResultCode()), activityResult.getData());
        c9694baS.EZpvd();
    }

    private final void EZpvd() {
        getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
