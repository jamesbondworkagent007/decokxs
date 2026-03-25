package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$onCreate$2;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$onCreate$3;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$onCreate$4;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$onCreate$5;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6460aPk extends AbstractActivityC6461aPl {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> values;
    public java.lang.String AhwBna = "SecurityResetRemovePasskeyServiceActivity";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aPs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6460aPk.values(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aPr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6460aPk.DbNXlk(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.aPt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC6460aPk.AuCTel(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aPu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC6460aPk.fIwbmz(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aPv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC6460aPk.AkhnZx(this.AEQbTJ));
        }
    });

    /* JADX INFO: renamed from: o.aPk$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    public ActivityC6460aPk() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(SecurityResetRemovePasskeyServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6460aPk.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6460aPk.KWHzl(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.values = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.aPk$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aPk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull PasskeyResetRemoveRequest passkeyResetRemoveRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(passkeyResetRemoveRequest, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6460aPk.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST", passkeyResetRemoveRequest)));
            return intent;
        }
    }

    public final PasskeyResetRemoveRequest djBIcL() {
        return (PasskeyResetRemoveRequest) this.AYXKKw.getValue();
    }

    public static final PasskeyResetRemoveRequest values(ActivityC6460aPk activityC6460aPk) {
        android.os.Bundle extras;
        android.content.Intent intent = activityC6460aPk.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (PasskeyResetRemoveRequest) extras.getParcelable("KEY_REQUEST");
    }

    public final PasskeyResetRemoveType AhwBna() {
        return (PasskeyResetRemoveType) this.gEmmrt.getValue();
    }

    public static final PasskeyResetRemoveType DbNXlk(ActivityC6460aPk activityC6460aPk) {
        PasskeyResetRemoveType passkeyResetRemoveTypeCopydefault;
        PasskeyResetRemoveRequest passkeyResetRemoveRequestDjBIcL = activityC6460aPk.djBIcL();
        return (passkeyResetRemoveRequestDjBIcL == null || (passkeyResetRemoveTypeCopydefault = passkeyResetRemoveRequestDjBIcL.copydefault()) == null) ? PasskeyResetRemoveType.BatchReset.EZpvd : passkeyResetRemoveTypeCopydefault;
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public static final boolean AuCTel(ActivityC6460aPk activityC6460aPk) {
        PasskeyResetRemoveRequest passkeyResetRemoveRequestDjBIcL = activityC6460aPk.djBIcL();
        if (passkeyResetRemoveRequestDjBIcL != null) {
            return passkeyResetRemoveRequestDjBIcL.EZpvd();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean valueOf() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean fIwbmz(ActivityC6460aPk activityC6460aPk) {
        PasskeyResetRemoveRequest passkeyResetRemoveRequestDjBIcL = activityC6460aPk.djBIcL();
        if (passkeyResetRemoveRequestDjBIcL != null) {
            return passkeyResetRemoveRequestDjBIcL.AEQbTJ();
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.aPl.KWHzl()V */
    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean AkhnZx(ActivityC6460aPk activityC6460aPk) {
        PasskeyResetRemoveRequest passkeyResetRemoveRequestDjBIcL = activityC6460aPk.djBIcL();
        if (passkeyResetRemoveRequestDjBIcL != null) {
            return passkeyResetRemoveRequestDjBIcL.OLrzqt();
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.aPl.AYXKKw()V */
    public final SecurityResetRemovePasskeyServiceViewModel AYXKKw() {
        return (SecurityResetRemovePasskeyServiceViewModel) this.AkhnZx.getValue();
    }

    public static final void OLrzqt(ActivityC6460aPk activityC6460aPk, ActivityResult activityResult) {
        PasskeyResetRemoveState passkeyResetRemoveState;
        android.os.Bundle extras;
        android.content.Intent data = activityResult.getData();
        if (data == null || (extras = data.getExtras()) == null || (passkeyResetRemoveState = (PasskeyResetRemoveState) extras.getParcelable("KEY_RESET_REMOVE_RESPONSE")) == null) {
            passkeyResetRemoveState = PasskeyResetRemoveState.Cancel.copydefault;
        }
        activityC6460aPk.AEQbTJ(passkeyResetRemoveState);
    }

    public static final void KWHzl(ActivityC6460aPk activityC6460aPk, ActivityResult activityResult) {
        activityC6460aPk.AEQbTJ(PasskeyResetRemoveState.PendingReview.copydefault);
    }

    @Override // o.AbstractActivityC6461aPl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(C8206ayP.Application.OLrzqt);
        AYXKKw().AhwBna().observe(this, new StateListAnimator(new Function1() { // from class: o.aPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6460aPk.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        SharedFlow<PasskeyResetRemoveType> sharedFlowAEQbTJ = AYXKKw().AEQbTJ();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowAEQbTJ, lifecycle, null, 2, null), new SecurityResetRemovePasskeyServiceActivity$onCreate$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<Unit> sharedFlowEZpvd = AYXKKw().EZpvd();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowEZpvd, lifecycle2, null, 2, null), new SecurityResetRemovePasskeyServiceActivity$onCreate$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowKWHzl = AYXKKw().KWHzl();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowKWHzl, lifecycle3, null, 2, null), new SecurityResetRemovePasskeyServiceActivity$onCreate$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<Unit> sharedFlowCopydefault = AYXKKw().copydefault();
        Lifecycle lifecycle4 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle4, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowCopydefault, lifecycle4, null, 2, null), new SecurityResetRemovePasskeyServiceActivity$onCreate$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6460aPk.copydefault((OnBackPressedCallback) obj);
            }
        }, 2, null);
        if (bundle == null) {
            if (gEmmrt()) {
                C6458aPi.Companion.KWHzl(new Function0() { // from class: o.aPm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC6460aPk.ejfBZ(this.AEQbTJ);
                    }
                }, new Function0() { // from class: o.aPq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC6460aPk.fJNWhG(this.KWHzl);
                    }
                }).show(getSupportFragmentManager(), "PasskeyNotCompatibleBottomFragment");
            } else {
                AYXKKw().KWHzl(AhwBna());
            }
        }
    }

    public static final Unit OLrzqt(ActivityC6460aPk activityC6460aPk, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC6460aPk.showLoadingAtOnce();
        } else {
            activityC6460aPk.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ActivityC6460aPk activityC6460aPk) {
        finishWithFailureMessage$default(activityC6460aPk, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(ActivityC6460aPk activityC6460aPk) {
        activityC6460aPk.AYXKKw().KWHzl(activityC6460aPk.AhwBna());
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(PasskeyResetRemoveState passkeyResetRemoveState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finish with: " + passkeyResetRemoveState.EZpvd(), 2, null);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESET_REMOVE_RESPONSE", passkeyResetRemoveState));
        finish();
    }

    public static /* synthetic */ void finishWithFailureMessage$default(ActivityC6460aPk activityC6460aPk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        activityC6460aPk.EZpvd(str);
    }

    public final void EZpvd(java.lang.String str) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finish with: " + str, 2, null);
        if (str != null) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        setResult(-1, new android.content.Intent().putExtra("KEY_RESET_REMOVE_RESPONSE", PasskeyResetRemoveState.Cancel.copydefault));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6461aPl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6461aPl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6461aPl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6461aPl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
