package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.baQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C9692baQ extends androidx.fragment.app.Fragment {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public android.content.Intent KWHzl;
    public Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> copydefault;

    /* JADX INFO: renamed from: o.baQ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.baQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            OLrzqt();
            return;
        }
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.baT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C9692baQ.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
        android.content.Intent intent = this.KWHzl;
        if (intent == null) {
            Intrinsics.gEmmrt("");
            intent = null;
        }
        activityResultLauncherRegisterForActivityResult.launch(intent);
    }

    public static final void copydefault(C9692baQ c9692baQ, ActivityResult activityResult) {
        Function2<? super java.lang.Integer, ? super android.content.Intent, Unit> function2 = c9692baQ.copydefault;
        if (function2 == null) {
            Intrinsics.gEmmrt("");
            function2 = null;
        }
        function2.invoke(java.lang.Integer.valueOf(activityResult.getResultCode()), activityResult.getData());
        c9692baQ.OLrzqt();
    }

    private final void OLrzqt() {
        getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
