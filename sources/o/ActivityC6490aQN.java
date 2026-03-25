package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawActivity$onCreate$1;
import com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.C8206ayP;
import o.InterfaceC8196ayF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aQN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6490aQN extends AbstractActivityC6488aQL {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public java.lang.String AYXKKw = "PasskeyStartServiceActivity";
    public final InterfaceC56387yDm AhwBna;
    public final ActivityResultLauncher<PasskeyRegisterScenarioRequest> gEmmrt;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> valueOf;

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

    public ActivityC6490aQN() {
        final Function0 function0 = null;
        ActivityResultLauncher<PasskeyRegisterScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(InterfaceC8196ayF.Activity.registerPasskey$default((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class), null, null, 3, null), new ActivityResultCallback() { // from class: o.aQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6490aQN.EZpvd(this.OLrzqt, (PasskeyRegisterState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6490aQN.copydefault(this.OLrzqt, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult2;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyStartForAssetWithdrawViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.aQN$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aQN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6490aQN.class);
        }
    }

    public static final void EZpvd(ActivityC6490aQN activityC6490aQN, PasskeyRegisterState passkeyRegisterState) {
        PasskeyStartForAssetWithdrawViewModel passkeyStartForAssetWithdrawViewModelEZpvd = activityC6490aQN.EZpvd();
        Intrinsics.copydefault(passkeyRegisterState);
        passkeyStartForAssetWithdrawViewModelEZpvd.AEQbTJ(passkeyRegisterState);
    }

    public static final void copydefault(ActivityC6490aQN activityC6490aQN, PasskeyAuthenticateState passkeyAuthenticateState) {
        PasskeyStartForAssetWithdrawViewModel passkeyStartForAssetWithdrawViewModelEZpvd = activityC6490aQN.EZpvd();
        Intrinsics.copydefault(passkeyAuthenticateState);
        passkeyStartForAssetWithdrawViewModelEZpvd.KWHzl(passkeyAuthenticateState);
    }

    /* JADX DEBUG: Possible override for method o.aQL.EZpvd()V */
    public final PasskeyStartForAssetWithdrawViewModel EZpvd() {
        return (PasskeyStartForAssetWithdrawViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractActivityC6488aQL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        if (bundle == null) {
            EZpvd().AEQbTJ();
            FlowKt.launchIn(FlowKt.onEach(EZpvd().OLrzqt(), new PasskeyStartForAssetWithdrawActivity$onCreate$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aQS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC6490aQN.EZpvd((OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(PasskeyRegisterState passkeyRegisterState) {
        android.os.Parcelable parcelable;
        pUU.KWHzl(getTAG(), "setPasskeyStateAndFinish: PasskeyRegisterState: " + passkeyRegisterState);
        if (Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.Cancel.KWHzl)) {
            parcelable = PasskeyAuthenticateState.Cancel.copydefault;
        } else {
            parcelable = Intrinsics.EZpvd(passkeyRegisterState, PasskeyRegisterState.DeviceNotCompatible.KWHzl) ? PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt : PasskeyAuthenticateState.Failure.OLrzqt;
        }
        setResult(-1, new android.content.Intent().putExtra("KEY_START_PASSKEY_RESPONSE", parcelable));
        finish();
    }

    public final void copydefault(PasskeyAuthenticateState passkeyAuthenticateState) {
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            pUU.KWHzl(getTAG(), "setPasskeyStateAndFinish: PasskeyAuthenticateState with data:" + (((PasskeyAuthenticateState.Success) passkeyAuthenticateState).OLrzqt() != null));
        } else {
            pUU.KWHzl(getTAG(), "setPasskeyStateAndFinish: PasskeyAuthenticateState: " + passkeyAuthenticateState);
        }
        setResult(-1, new android.content.Intent().putExtra("KEY_START_PASSKEY_RESPONSE", passkeyAuthenticateState));
        finish();
    }

    @Override // o.AbstractActivityC6488aQL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6488aQL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6488aQL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6488aQL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
