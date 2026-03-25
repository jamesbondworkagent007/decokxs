package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.os.BundleKt;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aLm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6250aLm extends AbstractActivityC6245aLh {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aLl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6250aLm.valueOf(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aLn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6250aLm.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aLo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6250aLm.KWHzl(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.aLm$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aLm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyScenario passkeyScenario) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
            Intrinsics.checkNotNullParameter(passkeyScenario, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6250aLm.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_WORKFLOW_TOKEN", str), C56390yDp.OLrzqt("KEY_PROMOTION_AUTHENTICATOR", passkeyPromotionAuthenticator), C56390yDp.OLrzqt("KEY_PASSKEY_SCENARIO", passkeyScenario)));
            return intent;
        }
    }

    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String valueOf(ActivityC6250aLm activityC6250aLm) {
        android.os.Bundle extras;
        android.content.Intent intent = activityC6250aLm.getIntent();
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("KEY_WORKFLOW_TOKEN");
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.aLh.valueOf()V */
    public final PasskeyPromotionAuthenticator valueOf() {
        return (PasskeyPromotionAuthenticator) this.valueOf.getValue();
    }

    public static final PasskeyPromotionAuthenticator EZpvd(ActivityC6250aLm activityC6250aLm) {
        android.os.Bundle extras;
        android.content.Intent intent = activityC6250aLm.getIntent();
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator = (intent == null || (extras = intent.getExtras()) == null) ? null : (PasskeyPromotionAuthenticator) extras.getParcelable("KEY_PROMOTION_AUTHENTICATOR");
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator2 = passkeyPromotionAuthenticator instanceof PasskeyPromotionAuthenticator ? passkeyPromotionAuthenticator : null;
        return passkeyPromotionAuthenticator2 == null ? PasskeyPromotionAuthenticator.All.KWHzl : passkeyPromotionAuthenticator2;
    }

    /* JADX DEBUG: Possible override for method o.aLh.OLrzqt()V */
    public final PasskeyScenario OLrzqt() {
        return (PasskeyScenario) this.djBIcL.getValue();
    }

    public static final PasskeyScenario KWHzl(ActivityC6250aLm activityC6250aLm) {
        android.os.Bundle extras;
        PasskeyScenario passkeyScenario;
        android.content.Intent intent = activityC6250aLm.getIntent();
        return (intent == null || (extras = intent.getExtras()) == null || (passkeyScenario = (PasskeyScenario) extras.getParcelable("KEY_PASSKEY_SCENARIO")) == null) ? PasskeyScenario.Account.AEQbTJ : passkeyScenario;
    }

    @Override // o.AbstractActivityC6245aLh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        setContentView(C8206ayP.Application.OLrzqt);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, C6254aLq.Companion.OLrzqt(AYXKKw(), valueOf(), OLrzqt()), C6254aLq.class.getName()).commitAllowingStateLoss();
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new Function1() { // from class: o.aLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6250aLm.AEQbTJ((OnBackPressedCallback) obj);
            }
        }, 3, null);
    }

    public static final Unit AEQbTJ(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull PasskeyRebindState passkeyRebindState) {
        Intrinsics.checkNotNullParameter(passkeyRebindState, "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_RESPONSE", passkeyRebindState);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    @Override // o.AbstractActivityC6245aLh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6245aLh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6245aLh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6245aLh, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
