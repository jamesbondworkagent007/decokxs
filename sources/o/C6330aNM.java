package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivityViewModel;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$2;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$3;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$8;
import com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import o.InterfaceC8197ayG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6330aNM extends AbstractC6325aNH {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final int AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public java.lang.String djBIcL;
    public ActivityResultLauncher<java.lang.String> isConnected;
    public AbstractC5660aAf valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6330aNM() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.fvQaOB int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:32) call: o.aNM.<init>(int):void type: THIS */
    public /* synthetic */ C6330aNM(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.fvQaOB : i);
    }

    public C6330aNM(int i) {
        this.AYXKKw = i;
        this.djBIcL = "PasskeyPromotionServiceWIthPasskeyStepperFragment";
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyPromotionServiceActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyPromotionServiceWIthPasskeyStepperViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.aNM$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C6330aNM OLrzqt() {
            return new C6330aNM(0, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PasskeyPromotionServiceActivityViewModel AYXKKw() {
        return (PasskeyPromotionServiceActivityViewModel) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Possible override for method o.aNH.EZpvd()V */
    public final PasskeyPromotionServiceWIthPasskeyStepperViewModel EZpvd() {
        return (PasskeyPromotionServiceWIthPasskeyStepperViewModel) this.AkhnZx.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC5660aAf abstractC5660aAfCopydefault = AbstractC5660aAf.copydefault(layoutInflater, viewGroup, false);
        this.valueOf = abstractC5660aAfCopydefault;
        if (abstractC5660aAfCopydefault != null) {
            return abstractC5660aAfCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC6325aNH, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.isConnected = registerForActivityResult(InterfaceC8197ayG.Application.startMfaForResult$default((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class), null, 1, null), new ActivityResultCallback() { // from class: o.aNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6330aNM.OLrzqt(this.OLrzqt, (MfaServiceResult) obj);
            }
        });
    }

    public static final void OLrzqt(C6330aNM c6330aNM, MfaServiceResult mfaServiceResult) {
        MfaState mfaStateComponent1 = mfaServiceResult.component1();
        java.lang.String strComponent2 = mfaServiceResult.component2();
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, c6330aNM.getTAG() + " mfa state: " + mfaStateComponent1 + " sessionId: " + strComponent2, 2, null);
        java.lang.String tag = c6330aNM.getTAG();
        MfaState.Success success = MfaState.Success.AEQbTJ;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, tag + " mfa is success: " + Intrinsics.EZpvd(mfaStateComponent1, success), 2, null);
        if (Intrinsics.EZpvd(mfaStateComponent1, success)) {
            c6330aNM.EZpvd().AEQbTJ(strComponent2);
        } else {
            c6330aNM.AYXKKw().AEQbTJ();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC5660aAf abstractC5660aAf = this.valueOf;
        if (abstractC5660aAf != null) {
            abstractC5660aAf.copydefault.setNavigationIconVisible(false);
            wYC wycAEQbTJ = abstractC5660aAf.copydefault.AEQbTJ();
            wycAEQbTJ.setOnClickListener(new Activity(wycAEQbTJ, 1000L, this));
            C52794wYp c52794wYp = abstractC5660aAf.AEQbTJ;
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
            if (AYXKKw().ejfBZ() == PasskeyPromotionSource.LOGIN || AYXKKw().ejfBZ() == PasskeyPromotionSource.SIGNUP) {
                abstractC5660aAf.AEQbTJ.setOKDSType(80);
            } else {
                abstractC5660aAf.AEQbTJ.setOKDSType(257);
            }
        }
        C6690aUB.KWHzl(EZpvd().EZpvd(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$2(this, null));
        C6690aUB.KWHzl(EZpvd().AYXKKw(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$3(view, null));
        C6690aUB.KWHzl(EZpvd().KWHzl(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$4(this, null));
        C6690aUB.KWHzl(EZpvd().OLrzqt(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$5(this, null));
        C6690aUB.KWHzl(EZpvd().AhwBna(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$6(this, null));
        C6690aUB.KWHzl(EZpvd().AEQbTJ(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$7(this, null));
        C6690aUB.KWHzl(EZpvd().valueOf(), this, new PasskeyPromotionServiceWIthPasskeyStepperFragment$initView$8(this, null));
        final PasskeyScenario passkeyScenarioAuCTel = AYXKKw().AuCTel();
        if (passkeyScenarioAuCTel instanceof PasskeyScenario.CedefiWallet) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("Passkey_Set_Start_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6330aNM.AEQbTJ(passkeyScenarioAuCTel, (EventParamsList) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.aNM$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ PasskeyScenario EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(PasskeyScenario passkeyScenario) {
            this.EZpvd = passkeyScenario;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", ((PasskeyScenario.CedefiWallet) this.EZpvd).EZpvd(), false, 4, null);
        }
    }

    public static final Unit AEQbTJ(PasskeyScenario passkeyScenario, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", ((PasskeyScenario.CedefiWallet) passkeyScenario).EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    /* JADX INFO: renamed from: o.aNM$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6330aNM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6330aNM c6330aNM) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c6330aNM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.EZpvd().copydefault();
            }
        }
    }

    /* JADX INFO: renamed from: o.aNM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C6330aNM AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6330aNM c6330aNM) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c6330aNM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                PasskeyScenario passkeyScenarioAuCTel = this.AEQbTJ.AYXKKw().AuCTel();
                if (passkeyScenarioAuCTel instanceof PasskeyScenario.CedefiWallet) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("Passkey_Set_Start_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new TaskDescription(passkeyScenarioAuCTel));
                }
                this.AEQbTJ.EZpvd().AEQbTJ(this.AEQbTJ.AYXKKw().AuCTel());
            }
        }
    }
}
