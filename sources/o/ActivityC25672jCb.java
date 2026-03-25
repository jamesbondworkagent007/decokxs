package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC25672jCb extends AbstractActivityC25683jCm {
    public C23413hxk OLrzqt;

    @Override // o.AbstractActivityC25683jCm, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23413hxk c23413hxkAEQbTJ = C23413hxk.AEQbTJ(getLayoutInflater());
        this.OLrzqt = c23413hxkAEQbTJ;
        if (c23413hxkAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c23413hxkAEQbTJ = null;
        }
        setContentView(c23413hxkAEQbTJ.getRoot());
        valueOf();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.jBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC25672jCb.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(ActivityC25672jCb activityC25672jCb) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC25672jCb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void valueOf() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C23413hxk c23413hxk = this.OLrzqt;
        if (c23413hxk == null) {
            Intrinsics.gEmmrt("");
            c23413hxk = null;
        }
        c31197lpV.EZpvd(supportFragmentManager, c23413hxk.copydefault.getId(), "AddressTrackerFragment", new Function0() { // from class: o.jCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC25672jCb.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(ActivityC25672jCb activityC25672jCb) {
        return C25677jCg.Companion.copydefault(activityC25672jCb.AEQbTJ(), true);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String stringExtra;
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("key.page_from")) == null) {
            stringExtra = "unknown";
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("key.page_from", "");
        }
        return stringExtra;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        int intExtra;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        if (intent.getExtras() == null || (intExtra = intent.getIntExtra("param_tracker_tab_position", -1)) < 0 || intExtra >= 2) {
            return;
        }
        C23413hxk c23413hxk = this.OLrzqt;
        if (c23413hxk == null) {
            Intrinsics.gEmmrt("");
            c23413hxk = null;
        }
        C25677jCg c25677jCg = (C25677jCg) c23413hxk.copydefault.getFragment();
        if (c25677jCg != null) {
            c25677jCg.EZpvd(intExtra);
        }
    }

    public final void EZpvd() {
        C23413hxk c23413hxk = this.OLrzqt;
        if (c23413hxk == null) {
            Intrinsics.gEmmrt("");
            c23413hxk = null;
        }
        C25677jCg c25677jCg = (C25677jCg) c23413hxk.copydefault.getFragment();
        if (c25677jCg == null || c25677jCg.gEmmrt()) {
            return;
        }
        c25677jCg.fetchVPNInfo();
    }

    public final void KWHzl() {
        C23413hxk c23413hxk = this.OLrzqt;
        if (c23413hxk == null) {
            Intrinsics.gEmmrt("");
            c23413hxk = null;
        }
        C25677jCg c25677jCg = (C25677jCg) c23413hxk.copydefault.getFragment();
        if (c25677jCg != null) {
            c25677jCg.djBIcL();
        }
    }

    @Override // o.AbstractActivityC25683jCm, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC25683jCm, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC25683jCm, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC25683jCm, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
