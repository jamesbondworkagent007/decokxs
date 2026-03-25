package o;

import androidx.fragment.app.FragmentResultListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ovg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC37536ovg extends AbstractActivityC37468ouR {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @Override // o.AbstractActivityC37468ouR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35399nuc.Dialog.zsXlph);
        AhwBna();
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ovo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37536ovg.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(ActivityC37536ovg activityC37536ovg) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37536ovg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        androidx.fragment.app.Fragment fragmentKWHzl;
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("conversation") : null;
        if (stringExtra == null) {
            fragmentKWHzl = C37453ouC.Companion.EZpvd();
        } else {
            fragmentKWHzl = C37486ouj.Companion.KWHzl(stringExtra);
        }
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.fXYAwm, fragmentKWHzl).commit();
    }

    public final void EZpvd() {
        getSupportFragmentManager().setFragmentResultListener("finish", this, new FragmentResultListener() { // from class: o.ovi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC37536ovg.EZpvd(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void EZpvd(ActivityC37536ovg activityC37536ovg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC37536ovg.finish();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        AhwBna();
    }

    /* JADX INFO: renamed from: o.ovg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ovg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC37536ovg.class);
            intent.putExtra("conversation", str);
            return intent;
        }
    }

    @Override // o.AbstractActivityC37468ouR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37468ouR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37468ouR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37468ouR, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
