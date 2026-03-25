package o;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC29699kya extends AbstractActivityC29639kxT {
    @Override // o.AbstractActivityC29639kxT, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int iGenerateViewId = android.view.View.generateViewId();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setId(iGenerateViewId);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.kxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC29699kya.OLrzqt(this.KWHzl);
            }
        });
        if (bundle == null) {
            final java.lang.String stringExtra = getIntent().getStringExtra("module_name_english");
            if (stringExtra == null) {
                stringExtra = "--";
            }
            final java.lang.String stringExtra2 = getIntent().getStringExtra("signalTab");
            final boolean booleanExtra = getIntent().getBooleanExtra("isSmartAccount", false);
            C31197lpV c31197lpV = C31197lpV.EZpvd;
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c31197lpV.EZpvd(supportFragmentManager, iGenerateViewId, "SmartMoneyActivityFragment", new Function0() { // from class: o.kyb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC29699kya.EZpvd(stringExtra, stringExtra2, booleanExtra);
                }
            });
        }
    }

    public static final void OLrzqt(ActivityC29699kya activityC29699kya) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC29699kya, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final androidx.fragment.app.Fragment EZpvd(java.lang.String str, java.lang.String str2, boolean z) {
        return C21841hOh.Companion.OLrzqt(str, str2, z);
    }

    @Override // o.AbstractActivityC29639kxT, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC29639kxT, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC29639kxT, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC29639kxT, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
