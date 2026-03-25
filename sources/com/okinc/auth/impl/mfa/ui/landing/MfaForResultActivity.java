package com.okinc.auth.impl.mfa.ui.landing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.navigation.fragment.NavHostFragment;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoRequest;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoResponse;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaNextStep;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest;
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC5822aDi;
import o.ActivityC6629aSu;
import o.C33070mpX;
import o.C43251rlk;
import o.C52761wXj;
import o.C55172xet;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C5857aEQ;
import o.C58893zTh;
import o.C6071aIS;
import o.C6690aUB;
import o.C7343ahz;
import o.C8206ayP;
import o.C8272azc;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8168axe;
import o.InterfaceC8196ayF;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.account.UpgradeDevice;

/* JADX INFO: loaded from: classes14.dex */
public final class MfaForResultActivity extends AbstractActivityC5822aDi {
    public static Function0<Unit> gEmmrt;
    public static Function0<Unit> valueOf;
    public C8272azc AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aDo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MfaForResultActivity.copydefault(this.KWHzl);
        }
    });
    public final ActivityResultLauncher<UploadPersonalInfoRequest> AkhnZx;
    public ActivityResultLauncher<PasskeyResetRemoveRequest> djBIcL;

    @yCM
    public C58893zTh passkeyTracker;
    public final InterfaceC56387yDm values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MfaNextStep.values().length];
            try {
                iArr[MfaNextStep.MFA_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MfaNextStep.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MfaNextStep.PASSKEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MfaNextStep.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MfaNextStep.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MfaNextStep.AUTHENTICATOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MfaNextStep.FACE_VERIFY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MfaNextStep.SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MfaNextStep.CREATE_TICKET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MfaNextStep.TICKET_CREATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            OLrzqt = iArr;
        }
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public MfaForResultActivity() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(MfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<UploadPersonalInfoRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8168axe) C43251rlk.copydefault(InterfaceC8168axe.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                MfaForResultActivity.OLrzqt(this.OLrzqt, (UploadPersonalInfoResponse) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AkhnZx = activityResultLauncherRegisterForActivityResult;
    }

    public final C58893zTh gEmmrt() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ Intent intentOf$default(TaskDescription taskDescription, Context context, String str, Function0 function0, SubdomainStrategy subdomainStrategy, Function0 function02, MfaScenario mfaScenario, int i, Object obj) {
            if ((i & 32) != 0) {
                mfaScenario = MfaScenario.IsPostLogin;
            }
            return taskDescription.AEQbTJ(context, str, function0, subdomainStrategy, function02, mfaScenario);
        }

        public final Intent AEQbTJ(@NotNull Context context, @NotNull String str, Function0<Unit> function0, SubdomainStrategy subdomainStrategy, Function0<Unit> function02, MfaScenario mfaScenario) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtras = new Intent(context.getApplicationContext(), (Class<?>) MfaForResultActivity.class).putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SESSION_ID", str), C56390yDp.OLrzqt("KEY_SUBDOMAIN_STRATEGY", subdomainStrategy), C56390yDp.OLrzqt("KEY_MFA_SCENARIO", mfaScenario)));
            TaskDescription taskDescription = MfaForResultActivity.Companion;
            MfaForResultActivity.valueOf = function0;
            MfaForResultActivity.gEmmrt = function02;
            Intrinsics.checkNotNullExpressionValue(intentPutExtras, "");
            return intentPutExtras;
        }
    }

    public final MfaViewModel djBIcL() {
        return (MfaViewModel) this.values.getValue();
    }

    public final String AhwBna() {
        return (String) this.AhwBna.getValue();
    }

    public static final String copydefault(MfaForResultActivity mfaForResultActivity) {
        String stringExtra = mfaForResultActivity.getIntent().getStringExtra("KEY_SESSION_ID");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final void OLrzqt(MfaForResultActivity mfaForResultActivity, UploadPersonalInfoResponse uploadPersonalInfoResponse) {
        pUU.EZpvd(mfaForResultActivity.getTAG(), "upload personal info: " + uploadPersonalInfoResponse.isSuccessUpload());
        if (uploadPersonalInfoResponse.isSuccessUpload()) {
            String str = null;
            mfaForResultActivity.djBIcL().copydefault(new MfaResponse(uploadPersonalInfoResponse.getNextStep(), uploadPersonalInfoResponse.getAlternativeNextSteps(), uploadPersonalInfoResponse.getAllowResetMfa(), uploadPersonalInfoResponse.getAllowResetPasskey(), uploadPersonalInfoResponse.getCurrentStepper(), uploadPersonalInfoResponse.getTotalStep(), uploadPersonalInfoResponse.getMaskedEmail(), uploadPersonalInfoResponse.getMaskedPhone(), uploadPersonalInfoResponse.getBusiness(), uploadPersonalInfoResponse.getScenario(), uploadPersonalInfoResponse.getReminderContent(), (Boolean) null, (RegistrationStartResponse) null, str, str, 30720, (DefaultConstructorMarker) null));
        }
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SimpleToolBar simpleToolBar;
        super.onCreate(bundle);
        overridePendingTransition(C7343ahz.ActionBar.AEQbTJ, 0);
        C8272azc c8272azcKWHzl = C8272azc.KWHzl(getLayoutInflater());
        this.AYXKKw = c8272azcKWHzl;
        setContentView(c8272azcKWHzl != null ? c8272azcKWHzl.getRoot() : null);
        this.djBIcL = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(this), new ActivityResultCallback() { // from class: o.aDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                MfaForResultActivity.OLrzqt(this.OLrzqt, (PasskeyResetRemoveState) obj);
            }
        });
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C8206ayP.StateListAnimator.DGOPHZDGOPHZ);
        Intrinsics.copydefault(fragmentFindFragmentById, "");
        ((NavHostFragment) fragmentFindFragmentById).getNavController().setGraph(C8206ayP.TaskDescription.AEQbTJ, getIntent().getExtras());
        C8272azc c8272azc = this.AYXKKw;
        if (c8272azc != null && (simpleToolBar = c8272azc.copydefault) != null) {
            simpleToolBar.setNavigationIconVisible(false);
            simpleToolBar.setRightIcon(C52761wXj.TaskDescription.alsFma);
            simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aDl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MfaForResultActivity.AYXKKw(this.EZpvd);
                }
            });
        }
        C6690aUB.AEQbTJ(djBIcL().djBIcL(), this, new AnonymousClass4(null));
        C6690aUB.AEQbTJ(djBIcL().AhwBna(), this, new AnonymousClass5(null));
        C6690aUB.AEQbTJ(djBIcL().AkhnZx(), this, new AnonymousClass6(null));
        C6690aUB.AEQbTJ(djBIcL().ejfBZ(), this, new AnonymousClass7(null));
        Fragment fragmentFindFragmentById2 = getSupportFragmentManager().findFragmentById(C8206ayP.StateListAnimator.DGOPHZDGOPHZ);
        final NavController navControllerFindNavController = fragmentFindFragmentById2 != null ? FragmentKt.findNavController(fragmentFindFragmentById2) : null;
        djBIcL().valueOf().observe(this, new StateListAnimator(new Function1() { // from class: o.aDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaForResultActivity.AEQbTJ(navControllerFindNavController, this, (MfaResponse) obj);
            }
        }));
        djBIcL().fARcdN().observe(this, new StateListAnimator(new Function1() { // from class: o.aDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaForResultActivity.KWHzl(this.EZpvd, (Triple) obj);
            }
        }));
        C6690aUB.AEQbTJ(djBIcL().gEmmrt(), this, new AnonymousClass10(navControllerFindNavController, null));
        C6690aUB.AEQbTJ(djBIcL().isConnected(), this, new AnonymousClass11(null));
        C6690aUB.AEQbTJ(djBIcL().AEQbTJ(), this, new AnonymousClass12(null));
        C6690aUB.AEQbTJ(djBIcL().EZpvd(), this, new AnonymousClass13(null));
        getSupportFragmentManager().setFragmentResultListener("REQUEST_SWITCH_VERIFICATION_METHOD", this, new FragmentResultListener() { // from class: o.aDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                MfaForResultActivity.AEQbTJ(this.copydefault, str, bundle2);
            }
        });
        if (AhwBna().length() == 0) {
            pUU.EZpvd(getTAG(), "argSessionId is empty");
            KWHzl(MfaState.Close.KWHzl);
        } else {
            pUU.EZpvd(getTAG(), "start mfa");
            djBIcL().EZpvd(AhwBna());
        }
    }

    public static final void OLrzqt(MfaForResultActivity mfaForResultActivity, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(mfaForResultActivity.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
    }

    public static final Unit AYXKKw(MfaForResultActivity mfaForResultActivity) {
        mfaForResultActivity.djBIcL().AuCTelauCTel();
        mfaForResultActivity.KWHzl(MfaState.Close.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = MfaForResultActivity.this.new AnonymousClass4(continuation);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.Z$0) {
                    MfaForResultActivity.this.showLoadingAtOnce();
                } else {
                    MfaForResultActivity.this.releaseLoading();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<MfaState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = MfaForResultActivity.this.new AnonymousClass5(continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaState mfaState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(mfaState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MfaForResultActivity.this.KWHzl((MfaState) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaForResultActivity.this.new AnonymousClass6(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MfaForResultActivity.this.gEmmrt().copydefault(UpgradeDevice.ON_DEVICE);
                C6071aIS.ActionBar actionBar = C6071aIS.Companion;
                final MfaForResultActivity mfaForResultActivity = MfaForResultActivity.this;
                C6071aIS c6071aISCopydefault = actionBar.copydefault(new Function0() { // from class: o.aDz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MfaForResultActivity.AnonymousClass6.invokeSuspend$lambda$0(mfaForResultActivity);
                    }
                });
                final MfaForResultActivity mfaForResultActivity2 = MfaForResultActivity.this;
                c6071aISCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aDv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        MfaForResultActivity.AnonymousClass6.invokeSuspend$lambda$2$lambda$1(mfaForResultActivity2, dialogInterface);
                    }
                });
                FragmentManager supportFragmentManager = mfaForResultActivity2.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c6071aISCopydefault.show(supportFragmentManager);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MfaForResultActivity mfaForResultActivity) {
            mfaForResultActivity.KWHzl(MfaState.Success.AEQbTJ);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1(MfaForResultActivity mfaForResultActivity, DialogInterface dialogInterface) {
            mfaForResultActivity.KWHzl(MfaState.Success.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaForResultActivity.this.new AnonymousClass7(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.aSu.TaskDescription.intentOf$default(o.aSu$TaskDescription, android.content.Context, com.okinc.auth.api.reset2fa.RebindMfaEntryPoint, java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy, int, java.lang.Object):android.content.Intent */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd(MfaForResultActivity.this.getTAG(), "start reset mfa by default? " + (MfaForResultActivity.gEmmrt == null));
                Function0 function0 = MfaForResultActivity.gEmmrt;
                if (function0 != null) {
                    MfaForResultActivity mfaForResultActivity = MfaForResultActivity.this;
                    function0.invoke();
                    mfaForResultActivity.KWHzl(MfaState.Close.KWHzl);
                } else {
                    MfaForResultActivity mfaForResultActivity2 = MfaForResultActivity.this;
                    mfaForResultActivity2.startActivityForResult(ActivityC6629aSu.TaskDescription.intentOf$default(ActivityC6629aSu.Companion, mfaForResultActivity2, RebindMfaEntryPoint.PostLogin.INSTANCE, null, null, 4, null), 1003);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit AEQbTJ(NavController navController, MfaForResultActivity mfaForResultActivity, MfaResponse mfaResponse) {
        RegistrationStartResponse registrationStartResponseAkhnZx;
        MfaNextStep.ActionBar actionBar = MfaNextStep.Companion;
        String strDjBIcL = mfaResponse != null ? mfaResponse.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        switch (Application.OLrzqt[actionBar.KWHzl(strDjBIcL).ordinal()]) {
            case 1:
                Unit unit = Unit.INSTANCE;
                break;
            case 2:
                if (navController != null) {
                    navController.navigate(C8206ayP.StateListAnimator.RbVjfb);
                    Unit unit2 = Unit.INSTANCE;
                }
                break;
            case 3:
                if (navController != null) {
                    navController.navigate(C8206ayP.StateListAnimator.RTWSvT);
                    Unit unit3 = Unit.INSTANCE;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (navController != null) {
                    navController.navigate(C8206ayP.StateListAnimator.RgLUBD);
                    Unit unit4 = Unit.INSTANCE;
                }
                break;
            case 7:
                if (navController != null) {
                    navController.navigate(C8206ayP.StateListAnimator.RkASWs);
                    Unit unit5 = Unit.INSTANCE;
                }
                break;
            case 8:
                if (mfaResponse == null || (registrationStartResponseAkhnZx = mfaResponse.AkhnZx()) == null || mfaForResultActivity.djBIcL().AEQbTJ(mfaForResultActivity, registrationStartResponseAkhnZx, mfaForResultActivity.djBIcL().AYXKKw()) == null) {
                    mfaForResultActivity.KWHzl(MfaState.Success.AEQbTJ);
                    Unit unit6 = Unit.INSTANCE;
                }
                break;
            case 9:
                ActivityResultLauncher<UploadPersonalInfoRequest> activityResultLauncher = mfaForResultActivity.AkhnZx;
                String value = mfaForResultActivity.djBIcL().values().getValue();
                String str = value == null ? "" : value;
                String strDbNXlk = mfaResponse != null ? mfaResponse.DbNXlk() : null;
                activityResultLauncher.launch(new UploadPersonalInfoRequest(null, null, null, str, strDbNXlk == null ? "" : strDbNXlk, UploadPersonalInfoSource.FACE_MAX_OUT, mfaForResultActivity.djBIcL().DbNXlk().toAccountMfaScenario(), null, 135, null));
                Unit unit7 = Unit.INSTANCE;
                break;
            case 10:
                mfaForResultActivity.KWHzl(MfaState.TicketCreated.AEQbTJ);
                Unit unit8 = Unit.INSTANCE;
                break;
            default:
                mfaForResultActivity.KWHzl(MfaState.Close.KWHzl);
                Unit unit9 = Unit.INSTANCE;
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MfaForResultActivity mfaForResultActivity, Triple triple) {
        C55172xet c55172xet;
        C55172xet c55172xet2;
        C55172xet c55172xet3;
        int iIntValue = ((Number) triple.component1()).intValue();
        int iIntValue2 = ((Number) triple.component2()).intValue();
        boolean zBooleanValue = ((Boolean) triple.component3()).booleanValue();
        C8272azc c8272azc = mfaForResultActivity.AYXKKw;
        if (c8272azc != null && (c55172xet3 = c8272azc.EZpvd) != null) {
            c55172xet3.setCount(iIntValue);
        }
        C8272azc c8272azc2 = mfaForResultActivity.AYXKKw;
        if (c8272azc2 != null && (c55172xet2 = c8272azc2.EZpvd) != null) {
            c55172xet2.setCurrentIndex(iIntValue2);
        }
        C8272azc c8272azc3 = mfaForResultActivity.AYXKKw;
        if (c8272azc3 != null && (c55172xet = c8272azc3.EZpvd) != null) {
            c55172xet.setVisibility(zBooleanValue ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$10, reason: invalid class name */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<MfaFailure, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavController $navController;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(NavController navController, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.$navController = navController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass10 anonymousClass10 = MfaForResultActivity.this.new AnonymousClass10(this.$navController, continuation);
            anonymousClass10.L$0 = obj;
            return anonymousClass10;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaFailure mfaFailure, Continuation<? super Unit> continuation) {
            return ((AnonymousClass10) create(mfaFailure, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MfaFailure mfaFailure = (MfaFailure) this.L$0;
                pUU.EZpvd(MfaForResultActivity.this.getTAG(), "mfaFailure: " + mfaFailure);
                if (mfaFailure instanceof MfaFailure.GenericFailure) {
                    MfaForResultActivity.this.EZpvd(((MfaFailure.GenericFailure) mfaFailure).EZpvd());
                } else if (mfaFailure instanceof MfaFailure.VerificationFailure) {
                    C55326xho.toastWithFailedIcon$default(((MfaFailure.VerificationFailure) mfaFailure).copydefault(), 0, 1, (Object) null);
                } else if (mfaFailure instanceof MfaFailure.OtherException) {
                    MfaForResultActivity mfaForResultActivity = MfaForResultActivity.this;
                    String message = ((MfaFailure.OtherException) mfaFailure).copydefault().getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mfaForResultActivity.EZpvd(message);
                } else if (mfaFailure instanceof MfaFailure.BusinessNotSupport) {
                    MfaForResultActivity.this.EZpvd(((MfaFailure.BusinessNotSupport) mfaFailure).KWHzl());
                } else if (mfaFailure instanceof MfaFailure.FailedToCreateSession) {
                    MfaForResultActivity.this.EZpvd(((MfaFailure.FailedToCreateSession) mfaFailure).EZpvd());
                } else if (mfaFailure instanceof MfaFailure.MaximumRetry) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(MfaForResultActivity.this);
                    final MfaForResultActivity mfaForResultActivity2 = MfaForResultActivity.this;
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.RlQdEF));
                    String strAEQbTJ = ((MfaFailure.MaximumRetry) mfaFailure).AEQbTJ();
                    if (strAEQbTJ.length() == 0) {
                        strAEQbTJ = C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAYsNCnLh);
                    }
                    viewOnClickListenerC54939xaY.EZpvd(strAEQbTJ);
                    viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), new View.OnClickListener() { // from class: o.aDr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            MfaForResultActivity.AnonymousClass10.invokeSuspend$lambda$2$lambda$1(mfaForResultActivity2, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                    MfaForResultActivity.this.djBIcL().QOLQEE();
                } else if ((mfaFailure instanceof MfaFailure.SessionExpired) || (mfaFailure instanceof MfaFailure.SessionInvalid)) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(MfaForResultActivity.this);
                    final MfaForResultActivity mfaForResultActivity3 = MfaForResultActivity.this;
                    viewOnClickListenerC54939xaY2.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.QKudOq));
                    viewOnClickListenerC54939xaY2.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.DAIeex));
                    viewOnClickListenerC54939xaY2.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), new View.OnClickListener() { // from class: o.aDs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            MfaForResultActivity.AnonymousClass10.invokeSuspend$lambda$4$lambda$3(mfaForResultActivity3, view);
                        }
                    });
                    viewOnClickListenerC54939xaY2.show();
                    MfaForResultActivity.this.djBIcL().ORxRYg();
                } else if (mfaFailure instanceof MfaFailure.FacialCanRetry) {
                    NavController navController = this.$navController;
                    if (navController != null) {
                        navController.navigate(C8206ayP.StateListAnimator.RSDDiY);
                    }
                } else if (mfaFailure instanceof MfaFailure.FacialMaximumRetry) {
                    NavController navController2 = this.$navController;
                    if (navController2 != null) {
                        navController2.navigate(C8206ayP.StateListAnimator.DQzvGNdrmXxudrmXxu);
                    }
                } else if (!(mfaFailure instanceof MfaFailure.TooManyOtpRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1(MfaForResultActivity mfaForResultActivity, View view) {
            mfaForResultActivity.KWHzl(MfaState.Failure.OLrzqt);
            mfaForResultActivity.djBIcL().zLjUOn();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$4$lambda$3(MfaForResultActivity mfaForResultActivity, View view) {
            mfaForResultActivity.KWHzl(MfaState.Failure.OLrzqt);
            mfaForResultActivity.djBIcL().AubY();
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$11, reason: invalid class name */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<SwitchVerificationMethodRequest, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass11(Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass11 anonymousClass11 = MfaForResultActivity.this.new AnonymousClass11(continuation);
            anonymousClass11.L$0 = obj;
            return anonymousClass11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SwitchVerificationMethodRequest switchVerificationMethodRequest, Continuation<? super Unit> continuation) {
            return ((AnonymousClass11) create(switchVerificationMethodRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C5857aEQ.Companion.copydefault((SwitchVerificationMethodRequest) this.L$0).show(MfaForResultActivity.this.getSupportFragmentManager(), C5857aEQ.class.getSimpleName());
                MfaForResultActivity.this.djBIcL().RJOkX();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$12, reason: invalid class name */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass12(Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaForResultActivity.this.new AnonymousClass12(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass12) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd(MfaForResultActivity.this.getTAG(), "finish with reset passkey: unableToVerifyListener: " + (MfaForResultActivity.valueOf == null));
                Function0 function0 = MfaForResultActivity.valueOf;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    ActivityResultLauncher activityResultLauncher = MfaForResultActivity.this.djBIcL;
                    if (activityResultLauncher == null) {
                        Intrinsics.gEmmrt("");
                        activityResultLauncher = null;
                    }
                    activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchReset.EZpvd, false, null, false, false, 30, null));
                }
                MfaForResultActivity.this.KWHzl(MfaState.Close.KWHzl);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity$onCreate$13, reason: invalid class name */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass13(Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaForResultActivity.this.new AnonymousClass13(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass13) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd(MfaForResultActivity.this.getTAG(), "finish with remove passkey");
                ActivityResultLauncher activityResultLauncher = MfaForResultActivity.this.djBIcL;
                if (activityResultLauncher == null) {
                    Intrinsics.gEmmrt("");
                    activityResultLauncher = null;
                }
                activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, false, true, 14, null));
                MfaForResultActivity.this.KWHzl(MfaState.Close.KWHzl);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void AEQbTJ(MfaForResultActivity mfaForResultActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        String string = bundle.getString("RESULT_SWITCH_VERIFICATION_METHOD");
        String str2 = string != null ? string : "";
        pUU.EZpvd(mfaForResultActivity.getTAG(), "switch verification: " + str2);
        mfaForResultActivity.djBIcL().AEQbTJ(str2);
    }

    public static /* synthetic */ void showMfaFailureDialog$default(MfaForResultActivity mfaForResultActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        mfaForResultActivity.EZpvd(str);
    }

    public final void EZpvd(String str) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.ODWQjV));
        if (str.length() == 0) {
            str = C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAYsNCnLh);
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), new View.OnClickListener() { // from class: o.aDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MfaForResultActivity.OLrzqt(this.KWHzl, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        djBIcL().OcIXYQ();
    }

    public static final void OLrzqt(MfaForResultActivity mfaForResultActivity, View view) {
        mfaForResultActivity.KWHzl(MfaState.Failure.OLrzqt);
        mfaForResultActivity.djBIcL().zsXlph();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pUU.EZpvd(getTAG(), "onBackPressed");
        KWHzl(MfaState.Close.KWHzl);
    }

    public final void KWHzl(MfaState mfaState) {
        pUU.EZpvd(getTAG(), "finish with: " + mfaState);
        setResult(-1, new Intent().putExtra("KEY_RESPONSE", new MfaServiceResult(mfaState, AhwBna())));
        finish();
        overridePendingTransition(0, C7343ahz.ActionBar.valueOf);
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AYXKKw = null;
        valueOf = null;
        gEmmrt = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1003) {
            pUU.EZpvd(getTAG(), "onActivityResult reset mfa");
            KWHzl(MfaState.Close.KWHzl);
        }
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC5822aDi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
