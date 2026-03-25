package o;

import androidx.core.os.BundleKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;

/* JADX INFO: renamed from: o.niX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC34759niX extends AbstractActivityC34820njf {
    public C42638raG EZpvd;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.niY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34759niX.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.niW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34759niX.AEQbTJ(this.copydefault);
        }
    });

    private final java.lang.String valueOf() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String copydefault(ActivityC34759niX activityC34759niX) {
        java.lang.String stringExtra = activityC34759niX.getIntent().getStringExtra("data");
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AEQbTJ(ActivityC34759niX activityC34759niX) {
        java.lang.String stringExtra = activityC34759niX.getIntent().getStringExtra("title");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // o.AbstractActivityC34820njf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C42638raG c42638raGCopydefault = C42638raG.copydefault(getLayoutInflater());
        setContentView(c42638raGCopydefault.getRoot());
        this.EZpvd = c42638raGCopydefault;
        AEQbTJ();
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C34753niR.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C33062mpP.findOrAddFragment$default(interfaceC56551yJoAEQbTJ, supportFragmentManager, qZH.StateListAnimator.DQzvGN, BundleKt.bundleOf(C56390yDp.OLrzqt("data", valueOf())), null, null, 24, null);
    }

    public final void AEQbTJ() {
        android.widget.TextView textView;
        C42638raG c42638raG = this.EZpvd;
        setSupportActionBar(c42638raG != null ? c42638raG.KWHzl : null);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowTitleEnabled(false);
        }
        C42638raG c42638raG2 = this.EZpvd;
        if (c42638raG2 == null || (textView = c42638raG2.AEQbTJ) == null) {
            return;
        }
        textView.setText(AYXKKw());
    }

    @Override // o.AbstractActivityC34820njf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34820njf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34820njf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34820njf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
