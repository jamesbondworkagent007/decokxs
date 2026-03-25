package o;

import android.os.Build;
import android.view.WindowManager;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ActivityC35526nwy extends AbstractActivityC33041mov {
    public nOX AYXKKw;
    public final ActivityResultLauncher<java.lang.String[]> DbNXlk;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nwA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC35526nwy.AEQbTJ(this.OLrzqt);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    public ActivityC35526nwy() {
        ActivityResultLauncher<java.lang.String[]> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.nwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC35526nwy.copydefault(this.OLrzqt, (java.util.Map) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
    }

    public final OKIMCaptureMode isConnected() {
        return (OKIMCaptureMode) this.valueOf.getValue();
    }

    public static final OKIMCaptureMode AEQbTJ(ActivityC35526nwy activityC35526nwy) {
        android.os.Bundle extras;
        java.lang.String string;
        java.lang.Object objM7377constructorimpl;
        android.content.Intent intent = activityC35526nwy.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("KEY_CAPTURE_MODE")) != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(OKIMCaptureMode.valueOf(string));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            OKIMCaptureMode oKIMCaptureMode = (OKIMCaptureMode) objM7377constructorimpl;
            if (oKIMCaptureMode != null) {
                return oKIMCaptureMode;
            }
        }
        return OKIMCaptureMode.BOTH;
    }

    public static final void copydefault(ActivityC35526nwy activityC35526nwy, java.util.Map map) {
        java.util.Collection collectionValues = map.values();
        if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
            java.util.Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((java.lang.Boolean) it.next()).booleanValue()) {
                    pUU.valueOf(activityC35526nwy.getTAG(), "Camera permissions denied: " + map);
                    activityC35526nwy.setResult(0);
                    activityC35526nwy.finish();
                    return;
                }
            }
        }
        pUU.KWHzl(activityC35526nwy.getTAG(), "Camera permissions granted");
        activityC35526nwy.values();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw();
        AhwBna();
        nOX noxKWHzl = nOX.KWHzl(getLayoutInflater());
        this.AYXKKw = noxKWHzl;
        if (noxKWHzl == null) {
            Intrinsics.gEmmrt("");
            noxKWHzl = null;
        }
        setContentView(noxKWHzl.getRoot());
        AkhnZx();
    }

    public final void AkhnZx() {
        java.lang.String[] strArrAEQbTJ = C37724ozI.EZpvd.AEQbTJ();
        if (KWHzl(strArrAEQbTJ)) {
            pUU.KWHzl(getTAG(), "All camera permissions already granted");
            values();
        } else {
            pUU.KWHzl(getTAG(), "Requesting camera permissions");
            this.DbNXlk.launch(strArrAEQbTJ);
        }
    }

    public final void values() {
        nOX nox = this.AYXKKw;
        if (nox == null) {
            Intrinsics.gEmmrt("");
            nox = null;
        }
        final C35298nsg c35298nsg = nox.OLrzqt;
        c35298nsg.setBindToLifecycle(this);
        c35298nsg.setCaptureMode(isConnected());
        c35298nsg.setRecordVideoMaxTime(10);
        c35298nsg.setCameraListener(djBIcL());
        c35298nsg.setLeftClickListener(new Function0() { // from class: o.nwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC35526nwy.KWHzl(this.KWHzl);
            }
        });
        c35298nsg.setRightClickListener(new Function0() { // from class: o.nwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC35526nwy.EZpvd(c35298nsg);
            }
        });
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35526nwy.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final Unit KWHzl(ActivityC35526nwy activityC35526nwy) {
        activityC35526nwy.finish();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35298nsg c35298nsg) {
        c35298nsg.values();
        return Unit.INSTANCE;
    }

    public static final void AhwBna(ActivityC35526nwy activityC35526nwy) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35526nwy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nwy$Activity */
    public static final class Activity implements InterfaceC35237nrY {
        public Activity() {
        }

        @Override // o.InterfaceC35237nrY
        public void OLrzqt(Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            ActivityC35526nwy.this.AEQbTJ(function0, function02);
        }

        @Override // o.InterfaceC35237nrY
        public void copydefault(int i, java.lang.String str, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.AEQbTJ(ActivityC35526nwy.this.getTAG(), "Camera error [" + i + "]: " + str, th);
        }

        @Override // o.InterfaceC35237nrY
        public void OLrzqt(java.io.File file) {
            Intrinsics.checkNotNullParameter(file, "");
            ActivityC35526nwy activityC35526nwy = ActivityC35526nwy.this;
            if (!file.exists()) {
                activityC35526nwy.setResult(0);
                activityC35526nwy.finish();
                return;
            }
            java.lang.String string = C44164sFr.OLrzqt(file, activityC35526nwy).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("capture_picture_uri", string);
            activityC35526nwy.setResult(-1, intent);
            activityC35526nwy.finish();
        }

        @Override // o.InterfaceC35237nrY
        public void EZpvd(java.io.File file, long j) {
            Intrinsics.checkNotNullParameter(file, "");
            ActivityC35526nwy activityC35526nwy = ActivityC35526nwy.this;
            if (!file.exists()) {
                activityC35526nwy.setResult(0);
                activityC35526nwy.finish();
                return;
            }
            java.lang.String string = C44164sFr.OLrzqt(file, activityC35526nwy).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("capture_video_src", string);
            intent.putExtra("capture_video_time", j);
            activityC35526nwy.setResult(-1, intent);
            activityC35526nwy.finish();
        }
    }

    public final Activity djBIcL() {
        return new Activity();
    }

    public final void AhwBna() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.statusBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        if (Build.VERSION.SDK_INT >= 28) {
            android.view.Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    public final void AYXKKw() {
        AEQbTJ(true, C32113mPz.Activity.KWHzl, C52761wXj.Application.fetchVPNInfo);
    }

    public final void valueOf() {
        AEQbTJ(false, C52761wXj.Application.fetchVPNInfo, C32113mPz.Activity.AEQbTJ);
    }

    public final void AEQbTJ(boolean z, @androidx.annotation.AnimRes int i, @androidx.annotation.AnimRes int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(!z ? 1 : 0, i, i2);
        } else {
            overridePendingTransition(i, i2);
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        valueOf();
    }

    public void AEQbTJ(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        function0.invoke();
    }

    /* JADX INFO: renamed from: o.nwy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(StateListAnimator stateListAnimator, android.content.Context context, OKIMCaptureMode oKIMCaptureMode, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                oKIMCaptureMode = OKIMCaptureMode.BOTH;
            }
            return stateListAnimator.KWHzl(context, oKIMCaptureMode);
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull OKIMCaptureMode oKIMCaptureMode) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35526nwy.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_CAPTURE_MODE", oKIMCaptureMode.name())));
            return intent;
        }
    }

    public final boolean KWHzl(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
