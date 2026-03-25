package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$initView$2;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$initView$3;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayViewModel;
import com.okinc.uilab.reminder.OKReminder;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6340aNW;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aKR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6176aKR extends AbstractC6171aKM {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public AbstractC5676aAv AYXKKw;
    public final int AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;

    /* JADX INFO: renamed from: o.aKR$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6176aKR() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.RlQdEF int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:34) call: o.aKR.<init>(int):void type: THIS */
    public /* synthetic */ C6176aKR(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.RlQdEF : i);
    }

    public C6176aKR(int i) {
        this.AhwBna = i;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityPasskeyOkxPayViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayFragment$special$$inlined$viewModels$default$5
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6176aKR.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aKR$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aKR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C6176aKR AEQbTJ() {
            return new C6176aKR(0, 1, null);
        }
    }

    /* JADX DEBUG: Possible override for method o.aKM.KWHzl()V */
    public final SecurityPasskeyOkxPayViewModel KWHzl() {
        return (SecurityPasskeyOkxPayViewModel) this.djBIcL.getValue();
    }

    public static final void OLrzqt(C6176aKR c6176aKR, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            c6176aKR.KWHzl().EZpvd(data != null ? (UnlockTokenResponse) data.getParcelableExtra("KEY_UNLOCK_TOKEN_RESPONSE") : null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC5676aAv abstractC5676aAvEZpvd = AbstractC5676aAv.EZpvd(layoutInflater, viewGroup, false);
        this.AYXKKw = abstractC5676aAvEZpvd;
        if (abstractC5676aAvEZpvd != null) {
            return abstractC5676aAvEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC5676aAv abstractC5676aAv = this.AYXKKw;
        if (abstractC5676aAv != null) {
            RecyclerView recyclerView = abstractC5676aAv.EZpvd;
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C57593ylO(C55298xhM.dp2px$default(16.0f, null, 1, null), false, false));
            recyclerView.setAdapter(new C6119aJN(new Function1() { // from class: o.aKW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6176aKR.OLrzqt(this.KWHzl, (AuthenticatorDisplayModel) obj);
                }
            }));
            OKReminder oKReminder = abstractC5676aAv.AEQbTJ;
            oKReminder.setMessage(getString(C8206ayP.Dialog.RIuxYh));
            oKReminder.setStyle(0);
            oKReminder.setCloseIconVisibility(false);
        }
        C6690aUB.KWHzl(KWHzl().copydefault(), this, new SecurityPasskeyOkxPayFragment$initView$2(this, null));
        C6690aUB.KWHzl(KWHzl().AhwBna(), this, new SecurityPasskeyOkxPayFragment$initView$3(null));
        C6690aUB.KWHzl(KWHzl().djBIcL(), this, new SecurityPasskeyOkxPayFragment$initView$4(null));
        C6690aUB.KWHzl(KWHzl().gEmmrt(), this, new SecurityPasskeyOkxPayFragment$initView$5(this, null));
        KWHzl().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.aLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6176aKR.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        KWHzl().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.aLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6176aKR.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().EZpvd().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.aKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6176aKR.KWHzl(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AhwBna();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet.Application.newInstance$default(com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet$Application, com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, com.okinc.auth.impl.passkey.model.ButtonType, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet */
    public static final Unit OLrzqt(final C6176aKR c6176aKR, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        PasskeyDetailBottomSheet passkeyDetailBottomSheetNewInstance$default = PasskeyDetailBottomSheet.Application.newInstance$default(PasskeyDetailBottomSheet.Companion, authenticatorDisplayModel, c6176aKR.KWHzl().KWHzl(), new Function1() { // from class: o.aKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6176aKR.AEQbTJ(this.EZpvd, (AuthenticatorDisplayModel) obj);
            }
        }, new Function1() { // from class: o.aKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6176aKR.valueOf(this.EZpvd, (AuthenticatorDisplayModel) obj);
            }
        }, null, 16, null);
        androidx.fragment.app.FragmentManager parentFragmentManager = c6176aKR.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        passkeyDetailBottomSheetNewInstance$default.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6176aKR c6176aKR, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        c6176aKR.OLrzqt(authenticatorDisplayModel);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C6176aKR c6176aKR, AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        c6176aKR.KWHzl(authenticatorDisplayModel);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6176aKR c6176aKR, java.util.List list) {
        RecyclerView recyclerView;
        AbstractC5676aAv abstractC5676aAv = c6176aKR.AYXKKw;
        RecyclerView.Adapter adapter = (abstractC5676aAv == null || (recyclerView = abstractC5676aAv.EZpvd) == null) ? null : recyclerView.getAdapter();
        C6119aJN c6119aJN = adapter instanceof C6119aJN ? (C6119aJN) adapter : null;
        if (c6119aJN != null) {
            c6119aJN.submitList(list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C6176aKR c6176aKR, java.lang.Boolean bool) {
        OKReminder oKReminder;
        AbstractC5676aAv abstractC5676aAv = c6176aKR.AYXKKw;
        if (abstractC5676aAv != null && (oKReminder = abstractC5676aAv.AEQbTJ) != null) {
            oKReminder.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C6176aKR c6176aKR, java.lang.Boolean bool) {
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        AbstractC5676aAv abstractC5676aAv = c6176aKR.AYXKKw;
        if (abstractC5676aAv != null && (c55173xeu = abstractC5676aAv.KWHzl) != null) {
            c55173xeu.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        AbstractC5676aAv abstractC5676aAv2 = c6176aKR.AYXKKw;
        if (abstractC5676aAv2 != null && (recyclerView = abstractC5676aAv2.EZpvd) != null) {
            recyclerView.setVisibility(bool.booleanValue() ^ true ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl().valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    private final void AhwBna() {
        getParentFragmentManager().setFragmentResultListener("REQUEST_RENAME_PAY", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C6176aKR.KWHzl(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void KWHzl(C6176aKR c6176aKR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c6176aKR.KWHzl().valueOf();
    }

    public final void OLrzqt(AuthenticatorDisplayModel authenticatorDisplayModel) {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C6403aOg.Companion.KWHzl(string, authenticatorDisplayModel, true).show(getParentFragmentManager(), "");
        getParentFragmentManager().setFragmentResultListener(string, getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aKU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C6176aKR.AEQbTJ(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C6176aKR c6176aKR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c6176aKR.KWHzl().valueOf();
    }

    public final void KWHzl(final AuthenticatorDisplayModel authenticatorDisplayModel) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String str = C33069mpW.copydefault(this, C8206ayP.Dialog.DQzvGNdrmXxu, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("passkeyName", authenticatorDisplayModel.AhwBna()))) + "\n\n" + getString(C8206ayP.Dialog.Th);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        C6340aNW.Activity activity2 = C6340aNW.Companion;
        java.lang.String string = getString(C8206ayP.Dialog.DcMfJK);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C8206ayP.Dialog.gdmIOq);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = getString(C8206ayP.Dialog.isReflectionWorking);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        final C6340aNW c6340aNWEZpvd = activity2.EZpvd(string, str, string2, string3, true, authenticatorDisplayModel.AhwBna());
        c6340aNWEZpvd.EZpvd(new Function0() { // from class: o.aKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6176aKR.copydefault(c6340aNWEZpvd, this, authenticatorDisplayModel);
            }
        });
        c6340aNWEZpvd.OLrzqt(new Function0() { // from class: o.aKZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6176aKR.AEQbTJ(c6340aNWEZpvd);
            }
        });
        c6340aNWEZpvd.show(supportFragmentManager, "");
    }

    public static final Unit copydefault(C6340aNW c6340aNW, C6176aKR c6176aKR, AuthenticatorDisplayModel authenticatorDisplayModel) {
        c6340aNW.dismiss();
        c6176aKR.KWHzl().AEQbTJ(authenticatorDisplayModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C6340aNW c6340aNW) {
        c6340aNW.dismiss();
        return Unit.INSTANCE;
    }
}
