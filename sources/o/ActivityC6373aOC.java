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
import com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoRequest;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoResponse;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource;
import com.okinc.auth.api.passkey.PasskeyRebindRequest;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$onCreate$1;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$onCreate$2;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$onCreate$3;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C6452aPc;
import o.C8206ayP;
import o.InterfaceC8197ayG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aOC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6373aOC extends AbstractActivityC6417aOu {
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final ActivityResultLauncher<UploadPersonalInfoRequest> AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final ActivityResultLauncher<java.lang.String> djBIcL;
    public final ActivityResultLauncher<android.content.Intent> fetchVPNInfo;
    public final ActivityResultLauncher<PasskeyRebindRequest> isConnected;
    public final ActivityResultLauncher<java.lang.String> valueOf;
    public final ActivityResultLauncher<android.content.Intent> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AYXKKw = "ResetRemovePasskeyMfaActivity";
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aOU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC6373aOC.AYXKKw(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.aOC$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

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

    public ActivityC6373aOC() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(ResetRemovePasskeyMfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(InterfaceC8197ayG.Application.startMfaForResult$default((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class), null, 1, null), new ActivityResultCallback() { // from class: o.aOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.OLrzqt(this.EZpvd, (MfaServiceResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class)).copydefault(new Function0() { // from class: o.aOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC6373aOC.AhwBna(this.copydefault);
            }
        }), new ActivityResultCallback() { // from class: o.aOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.EZpvd(this.KWHzl, (MfaServiceResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<PasskeyRebindRequest> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AYXKKw(), new ActivityResultCallback() { // from class: o.aOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.KWHzl(this.OLrzqt, (PasskeyRebindState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.isConnected = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "");
        this.values = activityResultLauncherRegisterForActivityResult4;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.gEmmrt(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult5, "");
        this.fetchVPNInfo = activityResultLauncherRegisterForActivityResult5;
        ActivityResultLauncher<UploadPersonalInfoRequest> activityResultLauncherRegisterForActivityResult6 = registerForActivityResult(((InterfaceC8168axe) C43251rlk.copydefault(InterfaceC8168axe.class)).AEQbTJ(), new ActivityResultCallback() { // from class: o.aOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.AEQbTJ(this.AEQbTJ, (UploadPersonalInfoResponse) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult6, "");
        this.AkhnZx = activityResultLauncherRegisterForActivityResult6;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult7 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6373aOC.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult7, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult7;
    }

    /* JADX INFO: renamed from: o.aOC$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aOC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponse, @NotNull PasskeyScenario passkeyScenario, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(resetRemoveResponse, "");
            Intrinsics.checkNotNullParameter(passkeyScenario, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6373aOC.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESET_REMOVE_RESPONSE", resetRemoveResponse), C56390yDp.OLrzqt("ARG_PASSKEY_SCENARIO", passkeyScenario), C56390yDp.OLrzqt("ARG_IS_FORCE_INCOMPATIBLE_FOR_PASSKEY_ERROR", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.aOu.KWHzl()V */
    public final ResetRemovePasskeySelectionActivity.ResetRemoveResponse KWHzl() {
        return (ResetRemovePasskeySelectionActivity.ResetRemoveResponse) this.gEmmrt.getValue();
    }

    public static final ResetRemovePasskeySelectionActivity.ResetRemoveResponse AYXKKw(ActivityC6373aOC activityC6373aOC) {
        android.os.Bundle extras;
        android.content.Intent intent = activityC6373aOC.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (ResetRemovePasskeySelectionActivity.ResetRemoveResponse) extras.getParcelable("KEY_RESET_REMOVE_RESPONSE");
    }

    public final ResetRemovePasskeyMfaViewModel djBIcL() {
        return (ResetRemovePasskeyMfaViewModel) this.DbNXlk.getValue();
    }

    public static final void OLrzqt(ActivityC6373aOC activityC6373aOC, MfaServiceResult mfaServiceResult) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " mfa success: " + (mfaServiceResult.getMfaState() instanceof MfaState.Success), 2, null);
        MfaState mfaState = mfaServiceResult.getMfaState();
        if (Intrinsics.EZpvd(mfaState, MfaState.Success.AEQbTJ)) {
            activityC6373aOC.djBIcL().EZpvd(mfaServiceResult.getMfaSessionId());
        } else if (Intrinsics.EZpvd(mfaState, MfaState.TicketCreated.AEQbTJ)) {
            activityC6373aOC.OLrzqt(PasskeyResetRemoveState.TicketSubmitted.AEQbTJ);
        } else {
            activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
        }
    }

    public static final Unit AhwBna(ActivityC6373aOC activityC6373aOC) {
        activityC6373aOC.djBIcL().fJNWhG();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final ActivityC6373aOC activityC6373aOC, MfaServiceResult mfaServiceResult) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " mfa (single remove) success: " + (mfaServiceResult.getMfaState() instanceof MfaState.Success), 2, null);
        MfaState mfaState = mfaServiceResult.getMfaState();
        if (Intrinsics.EZpvd(mfaState, MfaState.Success.AEQbTJ)) {
            activityC6373aOC.djBIcL().EZpvd(mfaServiceResult.getMfaSessionId());
            return;
        }
        if (Intrinsics.EZpvd(mfaState, MfaState.TicketCreated.AEQbTJ)) {
            activityC6373aOC.OLrzqt(PasskeyResetRemoveState.TicketSubmitted.AEQbTJ);
            return;
        }
        if (Intrinsics.EZpvd(activityC6373aOC.djBIcL().DbNXlk().getValue(), java.lang.Boolean.TRUE)) {
            try {
                C6452aPc.Activity activity = C6452aPc.Companion;
                java.lang.String string = activityC6373aOC.getString(C8206ayP.Dialog.gwTjWJ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = activityC6373aOC.getString(C8206ayP.Dialog.QSBOWP);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                final C6452aPc c6452aPcCopydefault = activity.copydefault(string, string2);
                c6452aPcCopydefault.EZpvd(new Function0() { // from class: o.aOI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC6373aOC.EZpvd(c6452aPcCopydefault, activityC6373aOC);
                    }
                });
                c6452aPcCopydefault.AEQbTJ(new Function0() { // from class: o.aOL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC6373aOC.AEQbTJ(c6452aPcCopydefault, activityC6373aOC);
                    }
                });
                c6452aPcCopydefault.KWHzl(new Function0() { // from class: o.aOR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC6373aOC.valueOf(this.OLrzqt);
                    }
                });
                c6452aPcCopydefault.show(activityC6373aOC.getSupportFragmentManager(), "");
                return;
            } catch (java.lang.Exception e) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " failed to show bottom sheet: " + e.getMessage(), 2, null);
                activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
    }

    public static final Unit EZpvd(C6452aPc c6452aPc, ActivityC6373aOC activityC6373aOC) {
        c6452aPc.dismiss();
        activityC6373aOC.djBIcL().fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6452aPc c6452aPc, ActivityC6373aOC activityC6373aOC) {
        c6452aPc.dismiss();
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC6373aOC activityC6373aOC) {
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC6373aOC activityC6373aOC, PasskeyRebindState passkeyRebindState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " rebind success: " + (passkeyRebindState instanceof PasskeyRebindState.Success), 2, null);
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModelDjBIcL = activityC6373aOC.djBIcL();
        Intrinsics.copydefault(passkeyRebindState);
        resetRemovePasskeyMfaViewModelDjBIcL.copydefault(passkeyRebindState);
    }

    public static final void copydefault(ActivityC6373aOC activityC6373aOC, ActivityResult activityResult) {
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
    }

    public static final void gEmmrt(ActivityC6373aOC activityC6373aOC, ActivityResult activityResult) {
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.RebindSuccess.AEQbTJ);
    }

    public static final void AEQbTJ(ActivityC6373aOC activityC6373aOC, UploadPersonalInfoResponse uploadPersonalInfoResponse) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " upload personal info success: " + uploadPersonalInfoResponse.isSuccessUpload(), 2, null);
        if (uploadPersonalInfoResponse.isSuccessUpload()) {
            activityC6373aOC.AhwBna.launch(new android.content.Intent(activityC6373aOC, (java.lang.Class<?>) ActivityC6427aPD.class));
        } else {
            activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
        }
    }

    public static final void EZpvd(ActivityC6373aOC activityC6373aOC, ActivityResult activityResult) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, activityC6373aOC.getTAG() + " has review request launcher: " + activityResult, 2, null);
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.PendingReview.copydefault);
    }

    @Override // o.AbstractActivityC6417aOu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(C8206ayP.Application.OLrzqt);
        SharedFlow<java.lang.Boolean> sharedFlowIsConnected = djBIcL().isConnected();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowIsConnected, lifecycle, null, 2, null), new ResetRemovePasskeyMfaActivity$onCreate$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowValueOf = djBIcL().valueOf();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowValueOf, lifecycle2, null, 2, null), new ResetRemovePasskeyMfaActivity$onCreate$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowAYXKKw = djBIcL().AYXKKw();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowAYXKKw, lifecycle3, null, 2, null), new ResetRemovePasskeyMfaActivity$onCreate$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        djBIcL().djBIcL().observe(this, new C32991mny(new Function1() { // from class: o.aOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.OLrzqt(this.OLrzqt, (PasskeyRebindRequest) obj);
            }
        }));
        djBIcL().EZpvd().observe(this, new C32991mny(new Function1() { // from class: o.aOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.AEQbTJ(this.KWHzl, (Unit) obj);
            }
        }));
        djBIcL().values().observe(this, new C32991mny(new Function1() { // from class: o.aOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        djBIcL().AhwBna().observe(this, new C32991mny(new Function1() { // from class: o.aOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
        djBIcL().copydefault().observe(this, new Activity(new Function1() { // from class: o.aON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        djBIcL().AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.aOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        }));
        djBIcL().gEmmrt().observe(this, new C32991mny(new Function1() { // from class: o.aOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.AYXKKw(this.copydefault, (Unit) obj);
            }
        }));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6373aOC.OLrzqt((OnBackPressedCallback) obj);
            }
        }, 2, null);
        if (bundle == null) {
            C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " argResetRemoveResponse: " + KWHzl(), 2, null);
            ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponseKWHzl = KWHzl();
            if (resetRemoveResponseKWHzl == null || djBIcL().copydefault(resetRemoveResponseKWHzl) == null) {
                OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final Unit OLrzqt(ActivityC6373aOC activityC6373aOC, PasskeyRebindRequest passkeyRebindRequest) {
        Intrinsics.checkNotNullParameter(passkeyRebindRequest, "");
        activityC6373aOC.isConnected.launch(passkeyRebindRequest);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC6373aOC activityC6373aOC, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        activityC6373aOC.values.launch(new android.content.Intent(activityC6373aOC, (java.lang.Class<?>) ActivityC6315aMy.class));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC6373aOC activityC6373aOC, kotlin.Pair pair) {
        UploadPersonalInfoSource uploadPersonalInfoSource;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        ActivityResultLauncher<UploadPersonalInfoRequest> activityResultLauncher = activityC6373aOC.AkhnZx;
        ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponseKWHzl = activityC6373aOC.KWHzl();
        if ((resetRemoveResponseKWHzl instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleRemove) || (resetRemoveResponseKWHzl instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchRemove)) {
            uploadPersonalInfoSource = UploadPersonalInfoSource.REMOVE;
        } else if ((resetRemoveResponseKWHzl instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchReset) || (resetRemoveResponseKWHzl instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleReset)) {
            uploadPersonalInfoSource = UploadPersonalInfoSource.RESET;
        } else {
            uploadPersonalInfoSource = UploadPersonalInfoSource.RESET;
        }
        activityResultLauncher.launch(new UploadPersonalInfoRequest(null, null, null, "", str2, uploadPersonalInfoSource, AccountMfaScenario.IsPostLogin, str));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC6373aOC activityC6373aOC, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        activityC6373aOC.AhwBna.launch(new android.content.Intent(activityC6373aOC, (java.lang.Class<?>) ActivityC6427aPD.class));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC6373aOC activityC6373aOC, java.lang.String str) {
        if (str != null) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.Cancel.copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC6373aOC activityC6373aOC, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
        activityC6373aOC.OLrzqt(PasskeyResetRemoveState.RemoveSuccess.AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC6373aOC activityC6373aOC, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        activityC6373aOC.fetchVPNInfo.launch(new android.content.Intent(activityC6373aOC, (java.lang.Class<?>) ActivityC6371aOA.class));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(PasskeyResetRemoveState passkeyResetRemoveState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, getTAG() + " finish with: " + passkeyResetRemoveState, 2, null);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESET_REMOVE_MFA_RESPONSE", passkeyResetRemoveState));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6417aOu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6417aOu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6417aOu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6417aOu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
