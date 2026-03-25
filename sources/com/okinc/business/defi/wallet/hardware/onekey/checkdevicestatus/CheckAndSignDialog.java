package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import android.content.Context;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C58114yvF;
import o.InterfaceC56387yDm;
import o.eHH;
import o.eHM;
import o.eHN;
import o.eHO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckAndSignDialog extends eHM {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public StateListAnimator KWHzl;

    @yCM
    public eHN.Activity checkAndSignViewModelFactory;

    public interface StateListAnimator {
        void EZpvd(@NotNull eHO eho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final CheckAndSignDialog EZpvd(@NotNull String str, @NotNull OneKeySignHelper.OneKeySignData oneKeySignData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oneKeySignData, "");
            CheckAndSignDialog checkAndSignDialog = new CheckAndSignDialog();
            checkAndSignDialog.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("rootWalletId", str), C56390yDp.OLrzqt("signData", oneKeySignData)));
            return checkAndSignDialog;
        }
    }

    public CheckAndSignDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(eHN.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog$special$$inlined$viewModels$default$5
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

    public final eHN.Activity KWHzl() {
        eHN.Activity activity = this.checkAndSignViewModelFactory;
        if (activity != null) {
            return activity;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/eIa; */
    @Override // o.eHM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public eHN OLrzqt() {
        return (eHN) this.AEQbTJ.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        ((eHH) C58114yvF.OLrzqt(context, eHH.class)).OLrzqt(this);
    }

    public static final eHN copydefault(CheckAndSignDialog checkAndSignDialog, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return checkAndSignDialog.KWHzl().AEQbTJ(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.lifecycle.FlowExtKt.flowWithLifecycle$default(kotlinx.coroutines.flow.Flow, androidx.lifecycle.Lifecycle, androidx.lifecycle.Lifecycle$State, int, java.lang.Object):kotlinx.coroutines.flow.Flow */
    @Override // o.eHM
    public void copydefault() {
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(OLrzqt().OLrzqt(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new CheckAndSignDialog$observeResult$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.KWHzl = null;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(eHN.class), new Function1() { // from class: o.eHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CheckAndSignDialog.copydefault(this.OLrzqt, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
