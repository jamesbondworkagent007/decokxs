package o;

import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34764nic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC34774nim extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public C34768nig AEQbTJ;

    /* JADX INFO: renamed from: o.nim$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nim.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startShakeIntro$default(Application application, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "okx_range_shake";
            }
            application.KWHzl(context, str);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            context.startActivity(AEQbTJ(context, "shake_intro", str));
        }

        public final android.content.Intent AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC34774nim.class);
            intent.putExtra(EopTrackEvent.KEY_PAGE_TYPE, str);
            intent.putExtra("feature_code", str2);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C34768nig c34768nigKWHzl = C34768nig.KWHzl(getLayoutInflater());
        this.AEQbTJ = c34768nigKWHzl;
        if (c34768nigKWHzl == null) {
            Intrinsics.gEmmrt("");
            c34768nigKWHzl = null;
        }
        setContentView(c34768nigKWHzl.getRoot());
        if (bundle == null) {
            copydefault();
        }
    }

    public final void copydefault() {
        java.lang.String stringExtra = getIntent().getStringExtra(EopTrackEvent.KEY_PAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = "shake_intro";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("feature_code");
        if (stringExtra2 == null) {
            stringExtra2 = "okx_range_shake";
        }
        androidx.fragment.app.Fragment fragmentEZpvd = EZpvd(stringExtra, stringExtra2);
        pUU.KWHzl(getTAG(), "Loading fragment for page type: " + stringExtra + ", feature code: " + stringExtra2);
        getSupportFragmentManager().beginTransaction().replace(C34764nic.Application.AhwBna, fragmentEZpvd).commit();
    }

    public final androidx.fragment.app.Fragment EZpvd(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "shake_intro")) {
            OLrzqt();
            return C34780nis.Companion.OLrzqt(str2);
        }
        pUU.valueOf(getTAG(), "Unknown page type: " + str + ", defaulting to shake intro");
        OLrzqt();
        return C34780nis.Companion.OLrzqt(str2);
    }

    public final void OLrzqt() {
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
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
