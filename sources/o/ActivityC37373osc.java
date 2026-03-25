package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.osc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37373osc extends AbstractActivityC37371osa<nIO> {
    public static final Application Companion = new Application(null);
    public final int djBIcL = C35399nuc.Dialog.AxsJAY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.osc$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.osc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37373osc.class);
        }
    }

    @Override // o.AbstractActivityC37371osa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ose
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37373osc.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(ActivityC37373osc activityC37373osc) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37373osc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void valueOf() {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.fXYAwm, C37374osd.Companion.copydefault()).commit();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        valueOf();
    }

    @Override // o.AbstractActivityC37371osa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37371osa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37371osa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37371osa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
