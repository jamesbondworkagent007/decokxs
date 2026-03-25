package com.okinc.auth.impl.passkey.ui.sync.stepper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity;
import com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC6498aQV;
import o.C43251rlk;
import o.C56390yDp;
import o.C56524yIo;
import o.C6569aRn;
import o.C6690aUB;
import o.C8206ayP;
import o.InterfaceC56387yDm;
import o.InterfaceC58830zQy;
import o.InterfaceC8196ayF;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.yCM;
import o.zQJ;
import o.zQK;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SyncViolatedPrecondition;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeySyncStepperActivity extends AbstractActivityC6498aQV {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final ActionBar AhwBna;
    public String djBIcL = "PasskeySyncStepperActivity";
    public final ActivityResultLauncher<Intent> gEmmrt;

    @yCM
    public InterfaceC58830zQy journey;
    public final ActivityResultLauncher<PasskeyResetRemoveRequest> valueOf;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SyncViolatedPrecondition.values().length];
            try {
                iArr[SyncViolatedPrecondition.RESET_PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncViolatedPrecondition.WALLET_RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncViolatedPrecondition.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    public PasskeySyncStepperActivity() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeySyncStepperViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                PasskeySyncStepperActivity.KWHzl(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyResetRemoveRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(this), new ActivityResultCallback() { // from class: o.aRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                PasskeySyncStepperActivity.copydefault(this.EZpvd, (PasskeyResetRemoveState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult2;
        this.AhwBna = new ActionBar();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Intent AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context.getApplicationContext(), (Class<?>) PasskeySyncStepperActivity.class);
        }
    }

    private final PasskeySyncStepperViewModel djBIcL() {
        return (PasskeySyncStepperViewModel) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Possible override for method o.aQV.OLrzqt()V */
    public final InterfaceC58830zQy OLrzqt() {
        InterfaceC58830zQy interfaceC58830zQy = this.journey;
        if (interfaceC58830zQy != null) {
            return interfaceC58830zQy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void KWHzl(PasskeySyncStepperActivity passkeySyncStepperActivity, ActivityResult activityResult) {
        Intent data = activityResult.getData();
        MfaServiceResult mfaServiceResult = data != null ? (MfaServiceResult) data.getParcelableExtra("KEY_RESPONSE") : null;
        pUU.KWHzl(passkeySyncStepperActivity.getTAG(), "MFA result: " + (mfaServiceResult != null ? mfaServiceResult.getMfaState() : null));
        MfaState mfaState = mfaServiceResult != null ? mfaServiceResult.getMfaState() : null;
        if (Intrinsics.EZpvd(mfaState, MfaState.Success.AEQbTJ)) {
            passkeySyncStepperActivity.djBIcL().fetchVPNInfo();
            return;
        }
        if (Intrinsics.EZpvd(mfaState, MfaState.Failure.OLrzqt) || mfaState == null) {
            passkeySyncStepperActivity.djBIcL().AYXKKw();
        } else {
            if (!Intrinsics.EZpvd(mfaState, MfaState.Close.KWHzl) && !Intrinsics.EZpvd(mfaState, MfaState.TicketCreated.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            passkeySyncStepperActivity.finish();
        }
    }

    public static final void copydefault(PasskeySyncStepperActivity passkeySyncStepperActivity, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(passkeySyncStepperActivity.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.Cancel.copydefault)) {
            return;
        }
        if (!Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.PendingReview.copydefault) && !Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RebindSuccess.AEQbTJ) && !Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RemoveSuccess.AEQbTJ) && !Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.TicketSubmitted.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
        passkeySyncStepperActivity.finish();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements zQJ {
        public ActionBar() {
        }

        @Override // o.zQJ
        public void copydefault(zQK zqk) {
            Intrinsics.checkNotNullParameter(zqk, "");
            pUU.KWHzl(PasskeySyncStepperActivity.this.getTAG(), "journey onStepChanged: " + zqk);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(PasskeySyncStepperActivity.this), null, null, new PasskeySyncStepperActivity$stepCallback$1$onStepChanged$1(zqk, PasskeySyncStepperActivity.this, null), 3, null);
        }
    }

    @Override // o.AbstractActivityC6498aQV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        overridePendingTransition(0, 0);
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, PasskeySyncStepperFragment.Companion.copydefault(), PasskeySyncStepperFragment.class.getName()).commitAllowingStateLoss();
        OLrzqt().AEQbTJ(this.AhwBna);
        djBIcL().AkhnZx();
        AYXKKw();
        djBIcL().AhwBna();
    }

    private final void AYXKKw() {
        C6690aUB.AEQbTJ(djBIcL().copydefault(), this, new PasskeySyncStepperActivity$observeEvents$1(null));
        C6690aUB.AEQbTJ(djBIcL().gEmmrt(), this, new PasskeySyncStepperActivity$observeEvents$2(this, null));
        C6690aUB.AEQbTJ(djBIcL().OLrzqt(), this, new PasskeySyncStepperActivity$observeEvents$3(this, null));
        C6690aUB.AEQbTJ(djBIcL().EZpvd(), this, new PasskeySyncStepperActivity$observeEvents$4(this, null));
        C6690aUB.AEQbTJ(djBIcL().AEQbTJ(), this, new PasskeySyncStepperActivity$observeEvents$5(this, null));
    }

    public final void AhwBna() {
        pUU.KWHzl(getTAG(), "showSuccessFragment");
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, C6569aRn.Companion.KWHzl(), C6569aRn.class.getName()).commitAllowingStateLoss();
    }

    public final void KWHzl(SyncViolatedPrecondition syncViolatedPrecondition) {
        Pair pairOLrzqt;
        int i = Application.AEQbTJ[syncViolatedPrecondition.ordinal()];
        if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt("Reset Passkey in Progress", "You have an ongoing passkey reset request. Please complete or cancel it before syncing.");
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            pairOLrzqt = C56390yDp.OLrzqt("Wallet Recovery in Progress", "You have an ongoing wallet recovery request. Please complete it before syncing.");
        }
        String str = (String) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", new View.OnClickListener() { // from class: o.aQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                PasskeySyncStepperActivity.AEQbTJ(this.copydefault, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(PasskeySyncStepperActivity passkeySyncStepperActivity, View view) {
        passkeySyncStepperActivity.finish();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity.TaskDescription.intentOf$default(com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$TaskDescription, android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, com.okinc.network.okg.cor.SubdomainStrategy, kotlin.jvm.functions.Function0, com.okinc.auth.impl.mfa.model.MfaScenario, int, java.lang.Object):android.content.Intent */
    public final void EZpvd(String str) {
        pUU.KWHzl(getTAG(), "launchMfa: sessionId=" + str);
        OLrzqt().AEQbTJ(zQK.Application.INSTANCE);
        this.gEmmrt.launch(MfaForResultActivity.TaskDescription.intentOf$default(MfaForResultActivity.Companion, this, str, null, null, new Function0() { // from class: o.aRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeySyncStepperActivity.EZpvd(this.EZpvd);
            }
        }, null, 32, null));
    }

    public static final Unit EZpvd(PasskeySyncStepperActivity passkeySyncStepperActivity) {
        passkeySyncStepperActivity.valueOf.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchReset.EZpvd, false, null, false, false, 30, null));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pUU.KWHzl(getTAG(), "onBackPressed");
        OLrzqt().AEQbTJ();
        super.onBackPressed();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6498aQV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6498aQV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6498aQV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6498aQV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
