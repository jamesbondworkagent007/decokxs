package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$onCreate$1;
import com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$onCreate$2;
import com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$onCreate$3;
import com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$onCreate$4;
import com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6144aJm extends AbstractActivityC6137aJf {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> AhwBna;
    public java.lang.String gEmmrt = "PasskeyLinkScenarioActivity";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aJl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6144aJm.EZpvd(this.copydefault);
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

    public ActivityC6144aJm() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyLinkScenarioViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.link.PasskeyLinkScenarioActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6144aJm.copydefault(this.EZpvd, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aJm$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aJm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull PasskeyLinkScenarioRequest passkeyLinkScenarioRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyLinkScenarioRequest, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6144aJm.class).putExtra("KEY_REQUEST", passkeyLinkScenarioRequest);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    /* JADX DEBUG: Possible override for method o.aJf.EZpvd()V */
    public final PasskeyLinkScenarioRequest EZpvd() {
        return (PasskeyLinkScenarioRequest) this.djBIcL.getValue();
    }

    public static final PasskeyLinkScenarioRequest EZpvd(ActivityC6144aJm activityC6144aJm) {
        android.os.Bundle extras = activityC6144aJm.getIntent().getExtras();
        if (extras != null) {
            return (PasskeyLinkScenarioRequest) extras.getParcelable("KEY_REQUEST");
        }
        return null;
    }

    public final PasskeyLinkScenarioViewModel gEmmrt() {
        return (PasskeyLinkScenarioViewModel) this.AYXKKw.getValue();
    }

    public static final void copydefault(ActivityC6144aJm activityC6144aJm, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.KWHzl(activityC6144aJm.getTAG(), "startAuthenticate: " + passkeyAuthenticateState);
        PasskeyLinkScenarioViewModel passkeyLinkScenarioViewModelGEmmrt = activityC6144aJm.gEmmrt();
        Intrinsics.copydefault(passkeyAuthenticateState);
        passkeyLinkScenarioViewModelGEmmrt.copydefault(passkeyAuthenticateState);
    }

    @Override // o.AbstractActivityC6137aJf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        overridePendingTransition(0, 0);
        if (bundle == null) {
            pUU.KWHzl(getTAG(), "request: " + EZpvd());
            PasskeyLinkScenarioRequest passkeyLinkScenarioRequestEZpvd = EZpvd();
            if ((passkeyLinkScenarioRequestEZpvd != null ? passkeyLinkScenarioRequestEZpvd.getScenario() : null) instanceof PasskeyScenario.CedefiWallet) {
                gEmmrt().KWHzl();
            } else {
                OLrzqt(PasskeyLinkState.Cancel.OLrzqt);
            }
        }
        C6690aUB.AEQbTJ(gEmmrt().OLrzqt(), this, new PasskeyLinkScenarioActivity$onCreate$1(this, null));
        C6690aUB.AEQbTJ(gEmmrt().copydefault(), this, new PasskeyLinkScenarioActivity$onCreate$2(this, null));
        C6690aUB.AEQbTJ(gEmmrt().EZpvd(), this, new PasskeyLinkScenarioActivity$onCreate$3(this, null));
        C6690aUB.AEQbTJ(gEmmrt().AEQbTJ(), this, new PasskeyLinkScenarioActivity$onCreate$4(this, null));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6144aJm.OLrzqt(this.OLrzqt, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(ActivityC6144aJm activityC6144aJm, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        activityC6144aJm.OLrzqt(PasskeyLinkState.Cancel.OLrzqt);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull PasskeyLinkState passkeyLinkState) {
        Intrinsics.checkNotNullParameter(passkeyLinkState, "");
        pUU.KWHzl(getTAG(), "setStateAndFinish: " + passkeyLinkState);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESPONSE", passkeyLinkState));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6137aJf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6137aJf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6137aJf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6137aJf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
