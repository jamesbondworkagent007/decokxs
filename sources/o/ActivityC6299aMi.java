package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$1;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$10;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$2;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$3;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$4;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$5;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$6;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$7;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$8;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$9;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6299aMi extends AbstractActivityC6296aMf {
    public static Function0<Unit> AhwBna;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static Function1<? super android.app.Activity, Unit> valueOf;
    public java.lang.String AYXKKw = "PasskeyPromotionServiceActivity";
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public ActivityC6299aMi() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyPromotionServiceActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: renamed from: o.aMi$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aMi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Function0<Unit> AEQbTJ() {
            return ActivityC6299aMi.AhwBna;
        }

        public final void copydefault(Function0<Unit> function0) {
            ActivityC6299aMi.AhwBna = function0;
        }

        public final void copydefault(Function1<? super android.app.Activity, Unit> function1) {
            ActivityC6299aMi.valueOf = function1;
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull PasskeyScenario passkeyScenario, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyPromotionSource passkeyPromotionSource, Function0<Unit> function0, boolean z2, boolean z3, Function1<? super android.app.Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyScenario, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
            Intrinsics.checkNotNullParameter(passkeyPromotionSource, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6299aMi.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SCENARIO", passkeyScenario), C56390yDp.OLrzqt("KEY_SKIP_CHECK_PASSKEY", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_EASY_REG_TOKEN", str2), C56390yDp.OLrzqt("KEY_MFA_SESSION_ID", str), C56390yDp.OLrzqt("KEY_PROMOTION_AUTHENTICATOR", passkeyPromotionAuthenticator), C56390yDp.OLrzqt("KEY_SOURCE", passkeyPromotionSource), C56390yDp.OLrzqt("KEY_ENABLE_EXIT_BOTTOM_SHEET", java.lang.Boolean.valueOf(z2)), C56390yDp.OLrzqt("KEY_ALLOW_FIDO1", java.lang.Boolean.valueOf(z3))));
            Application application = ActivityC6299aMi.Companion;
            application.copydefault(function0);
            application.copydefault(function1);
            return intent;
        }
    }

    public final PasskeyPromotionServiceActivityViewModel valueOf() {
        return (PasskeyPromotionServiceActivityViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC6296aMf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        setContentView(C8206ayP.Application.OLrzqt);
        C6690aUB.AEQbTJ(valueOf().fetchVPNInfo(), this, new PasskeyPromotionServiceActivity$onCreate$1(this, null));
        C6690aUB.AEQbTJ(valueOf().getNewProxyInstance(), this, new PasskeyPromotionServiceActivity$onCreate$2(this, null));
        C6690aUB.AEQbTJ(valueOf().fJNWhG(), this, new PasskeyPromotionServiceActivity$onCreate$3(this, null));
        C6690aUB.AEQbTJ(valueOf().values(), this, new PasskeyPromotionServiceActivity$onCreate$4(this, null));
        C6690aUB.AEQbTJ(valueOf().fARcdN(), this, new PasskeyPromotionServiceActivity$onCreate$5(this, null));
        C6690aUB.AEQbTJ(valueOf().djBIcL(), this, new PasskeyPromotionServiceActivity$onCreate$6(this, null));
        C6690aUB.AEQbTJ(valueOf().AkhnZx(), this, new PasskeyPromotionServiceActivity$onCreate$7(this, null));
        C6690aUB.AEQbTJ(valueOf().AhwBna(), this, new PasskeyPromotionServiceActivity$onCreate$8(this, null));
        C6690aUB.AEQbTJ(valueOf().KWHzl(), this, new PasskeyPromotionServiceActivity$onCreate$9(this, null));
        C6690aUB.AEQbTJ(valueOf().isConnected(), this, new PasskeyPromotionServiceActivity$onCreate$10(null));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aMj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC6299aMi.EZpvd((OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        if (bundle == null) {
            valueOf().OLrzqt();
        }
    }

    public static final Unit EZpvd(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull PasskeyRegisterState passkeyRegisterState) {
        Intrinsics.checkNotNullParameter(passkeyRegisterState, "");
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, "setStateAndFinish: " + passkeyRegisterState, 2, null);
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, "success: " + (passkeyRegisterState instanceof PasskeyRegisterState.Success), 2, null);
        setResult(-1, new android.content.Intent().putExtra("KEY_CONTRACT_RESPONSE", passkeyRegisterState));
        finish();
        Function1<? super android.app.Activity, Unit> function1 = valueOf;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    @Override // o.AbstractActivityC6296aMf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6296aMf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6296aMf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6296aMf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
