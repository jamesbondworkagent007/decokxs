package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C6046aHu;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6039aHn extends AbstractActivityC6041aHp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String gEmmrt = "SecurityAuthenticateOkxPayPasskeyServiceActivity";
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aHw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6039aHn.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX INFO: renamed from: o.aHn$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aHn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6039aHn.class);
            intent.putExtra("KEY_AUTHENTICATE_REQUEST", passkeyAuthenticateRequest);
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.aHp.OLrzqt()V */
    public final PasskeyAuthenticateRequest OLrzqt() {
        return (PasskeyAuthenticateRequest) this.valueOf.getValue();
    }

    public static final PasskeyAuthenticateRequest AEQbTJ(ActivityC6039aHn activityC6039aHn) {
        android.os.Bundle extras = activityC6039aHn.getIntent().getExtras();
        if (extras != null) {
            return (PasskeyAuthenticateRequest) extras.getParcelable("KEY_AUTHENTICATE_REQUEST");
        }
        return null;
    }

    @Override // o.AbstractActivityC6041aHp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = C52761wXj.Application.fetchVPNInfo;
        overridePendingTransition(i, i);
        setContentView(C8206ayP.Application.KWHzl);
        PasskeyAuthenticateRequest passkeyAuthenticateRequestOLrzqt = OLrzqt();
        if (passkeyAuthenticateRequestOLrzqt != null) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i2 = C8206ayP.StateListAnimator.hBpjJd;
            C6046aHu.StateListAnimator stateListAnimator = C6046aHu.Companion;
            fragmentTransactionBeginTransaction.replace(i2, stateListAnimator.KWHzl(passkeyAuthenticateRequestOLrzqt), C6046aHu.class.getName()).commitAllowingStateLoss();
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            stateListAnimator.EZpvd(supportFragmentManager, this, new Function1() { // from class: o.aHo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC6039aHn.AEQbTJ(this.AEQbTJ, (PasskeyState) obj);
                }
            });
        } else {
            OLrzqt(new PasskeyState.AuthenticateError("Request is null"));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aHv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC6039aHn.EZpvd((OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
    }

    public static final Unit AEQbTJ(ActivityC6039aHn activityC6039aHn, PasskeyState passkeyState) {
        Intrinsics.checkNotNullParameter(passkeyState, "");
        activityC6039aHn.OLrzqt(passkeyState);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    private final void OLrzqt(PasskeyState passkeyState) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", getTAG() + " finish with: " + passkeyState.log());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_AUTHENTICATE_RESPONSE", passkeyState);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC6041aHp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6041aHp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6041aHp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6041aHp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
