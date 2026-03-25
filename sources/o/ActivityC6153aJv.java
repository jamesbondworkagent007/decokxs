package o;

import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC6153aJv extends AbstractActivityC6148aJq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aJw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6153aJv.KWHzl(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.aJv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aJv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull PasskeyManagementRequest passkeyManagementRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyManagementRequest, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6153aJv.class);
            intent.putExtra("KEY_REQUEST", passkeyManagementRequest);
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.aJq.KWHzl()V */
    public final PasskeyManagementRequest KWHzl() {
        return (PasskeyManagementRequest) this.AhwBna.getValue();
    }

    public static final PasskeyManagementRequest KWHzl(ActivityC6153aJv activityC6153aJv) {
        android.content.Intent intent = activityC6153aJv.getIntent();
        if (intent != null) {
            return (PasskeyManagementRequest) intent.getParcelableExtra("KEY_REQUEST");
        }
        return null;
    }

    @Override // o.AbstractActivityC6148aJq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, SecurityPasskeyManagementFragment.Companion.copydefault(KWHzl()), SecurityPasskeyManagementFragment.class.getName()).commitAllowingStateLoss();
        }
    }

    public final void KWHzl(@NotNull PasskeyManagementState passkeyManagementState) {
        Intrinsics.checkNotNullParameter(passkeyManagementState, "");
        setResult(-1, new android.content.Intent().putExtra("KEY_RESPONSE_STATE", passkeyManagementState));
        finish();
    }

    @Override // o.AbstractActivityC6148aJq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6148aJq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6148aJq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6148aJq, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
