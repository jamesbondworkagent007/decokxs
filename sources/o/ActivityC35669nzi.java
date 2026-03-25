package o;

import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C35547nxS;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC35669nzi extends AbstractActivityC33007moN {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.nzi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35669nzi.class);
        }
    }

    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        java.lang.String string = getString(C35399nuc.LoaderManager.gdLjtZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() {
        return C35547nxS.StateListAnimator.newInstance$default(C35547nxS.Companion, null, false, 3, null);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C52761wXj.Activity.EZpvd)));
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35669nzi.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(ActivityC35669nzi activityC35669nzi) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35669nzi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().djBIcL.setText(str);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
