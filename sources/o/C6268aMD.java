package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBinding;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivityViewModel;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$1;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$10;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$11;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$12;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$13;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$14;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$2;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$3;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$4;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$5;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$6;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$7;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$8;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$9;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import o.InterfaceC8197ayG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aMD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C6268aMD extends AbstractC6314aMx {
    public ActivityResultLauncher<Unit> AYXKKw;
    public ActivityResultLauncher<java.lang.String> DbNXlk;
    public ViewBinding djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public java.lang.String valueOf = "PasskeyPromotionServiceBaseFragment";
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ViewBinding viewBinding) {
        this.djBIcL = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
    }

    public void djBIcL() {
    }

    public void fetchVPNInfo() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewBinding valueOf() {
        return this.djBIcL;
    }

    public C6268aMD() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyPromotionServiceActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyPromotionServiceBaseViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.aMD$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aMD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final PasskeyPromotionServiceActivityViewModel gEmmrt() {
        return (PasskeyPromotionServiceActivityViewModel) this.gEmmrt.getValue();
    }

    public final PasskeyPromotionServiceBaseViewModel AhwBna() {
        return (PasskeyPromotionServiceBaseViewModel) this.isConnected.getValue();
    }

    @Override // o.AbstractC6314aMx, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.DbNXlk = registerForActivityResult(InterfaceC8197ayG.Application.startMfaForResult$default((InterfaceC8197ayG) C43251rlk.copydefault(InterfaceC8197ayG.class), null, 1, null), new ActivityResultCallback() { // from class: o.aME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6268aMD.copydefault(this.copydefault, (MfaServiceResult) obj);
            }
        });
        this.AYXKKw = registerForActivityResult(((InterfaceC5697aBP) C43251rlk.copydefault(InterfaceC5697aBP.class)).copydefault(), new ActivityResultCallback() { // from class: o.aMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6268aMD.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        });
    }

    public static final void copydefault(C6268aMD c6268aMD, MfaServiceResult mfaServiceResult) {
        MfaState mfaStateComponent1 = mfaServiceResult.component1();
        java.lang.String strComponent2 = mfaServiceResult.component2();
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, c6268aMD.getTAG() + " mfa state: " + mfaStateComponent1 + " sessionId: " + strComponent2, 2, null);
        java.lang.String tag = c6268aMD.getTAG();
        MfaState.Success success = MfaState.Success.AEQbTJ;
        C5922aFc.log$default(c5922aFc, "[REGISTER]", null, tag + " mfa success: " + Intrinsics.EZpvd(mfaStateComponent1, success), 2, null);
        if (Intrinsics.EZpvd(mfaStateComponent1, success)) {
            c6268aMD.AhwBna().copydefault(strComponent2, c6268aMD);
        }
    }

    public static final void KWHzl(C6268aMD c6268aMD, java.lang.Boolean bool) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, c6268aMD.getTAG() + " biometric enabled: " + bool, 2, null);
        if (bool.booleanValue()) {
            c6268aMD.djBIcL();
        }
    }

    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        fetchVPNInfo();
        OLrzqt(view);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aMK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6268aMD.EZpvd(this.copydefault, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        AhwBna().copydefault(new PasskeyPromotionServiceBaseViewModel.Request(gEmmrt().AYXKKw(), gEmmrt().DbNXlk()), gEmmrt().EZpvd(), gEmmrt().gEmmrt(), gEmmrt().ejfBZ(), gEmmrt().AuCTel());
        AhwBna().ejfBZ();
    }

    public static final Unit EZpvd(C6268aMD c6268aMD, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        c6268aMD.isConnected();
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C6690aUB.KWHzl(AhwBna().AYXKKw(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$1(this, null));
        C6690aUB.KWHzl(AhwBna().fIwbmz(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$2(view, null));
        C6690aUB.KWHzl(AhwBna().fARcdN(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$3(this, null));
        C6690aUB.KWHzl(AhwBna().values(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$4(this, null));
        C6690aUB.KWHzl(AhwBna().isConnected(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$5(null));
        C6690aUB.KWHzl(AhwBna().AkhnZx(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$6(null));
        C6690aUB.KWHzl(AhwBna().fetchVPNInfo(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$7(this, null));
        C6690aUB.KWHzl(AhwBna().AuCTel(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$8(this, null));
        C6690aUB.KWHzl(AhwBna().DbNXlk(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$9(this, null));
        C6690aUB.KWHzl(AhwBna().AEQbTJ(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$10(this, null));
        C6690aUB.KWHzl(AhwBna().copydefault(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$11(this, null));
        C6690aUB.KWHzl(AhwBna().OLrzqt(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$12(this, null));
        C6690aUB.KWHzl(AhwBna().AhwBna(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$13(this, null));
        C6690aUB.KWHzl(AhwBna().gEmmrt(), this, new PasskeyPromotionServiceBaseFragment$initObserveEvent$14(this, null));
    }

    public final void KWHzl(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.iKEqwx));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.zzQwtT));
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C8206ayP.Dialog.hrjNmC), new View.OnClickListener() { // from class: o.aMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6268aMD.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.dzCpvv), new View.OnClickListener() { // from class: o.aMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6268aMD.AEQbTJ(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(C6268aMD c6268aMD, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (c6268aMD.isAdded()) {
            C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, c6268aMD.getTAG() + " start enable biometric launcher", 2, null);
            ActivityResultLauncher<Unit> activityResultLauncher = c6268aMD.AYXKKw;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(Unit.INSTANCE);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        gEmmrt().copydefault();
    }

    public final void isConnected() {
        C6290aMZ c6290aMZKWHzl = C6290aMZ.Companion.KWHzl(gEmmrt().ejfBZ());
        c6290aMZKWHzl.AEQbTJ(new Function0() { // from class: o.aML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6268aMD.AYXKKw();
            }
        });
        c6290aMZKWHzl.EZpvd(new Function0() { // from class: o.aMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6268aMD.KWHzl(this.KWHzl);
            }
        });
        c6290aMZKWHzl.show(getParentFragmentManager(), "PasskeyQuitBottomSheet");
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C6268aMD c6268aMD) {
        c6268aMD.AhwBna().KWHzl();
        c6268aMD.gEmmrt().AEQbTJ();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        AhwBna().copydefault(passkeySdkResult);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }
}
