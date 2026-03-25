package o;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$initObserver$1;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$onViewCreated$1;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.ThemeType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C17760fRg;
import o.C17781fSa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fQD extends wXX implements InterfaceC17759fRf, C17760fRg.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public android.content.Context AhwBna;
    public C16690eog EZpvd;
    public C17760fRg KWHzl;
    public Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> copydefault;
    public InterfaceC54855xXv djBIcL;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fQB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fQD.AYXKKw(this.OLrzqt);
        }
    });
    public final InterfaceC17773fRt gEmmrt = C17777fRx.Companion.KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(interfaceC54855xXv, "");
        this.djBIcL = interfaceC54855xXv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.96f;
    }

    public fQD() {
        Function0 function0 = new Function0() { // from class: o.fQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQD.valueOf(this.OLrzqt);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C17781fSa.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchContainerFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQD.djBIcL(this.EZpvd);
            }
        });
    }

    private final CurrentWalletSwitchConfig AhwBna() {
        return (CurrentWalletSwitchConfig) this.AYXKKw.getValue();
    }

    public static final CurrentWalletSwitchConfig AYXKKw(fQD fqd) {
        android.os.Parcelable parcelable;
        android.os.Bundle arguments = fqd.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) arguments.getParcelable("CURRENT_WALLET_SWITCH_CONFIG", CurrentWalletSwitchConfig.class);
        } else {
            parcelable = arguments.getParcelable("CURRENT_WALLET_SWITCH_CONFIG");
        }
        return (CurrentWalletSwitchConfig) parcelable;
    }

    private final java.util.List<UnsupportedWalletType> AYXKKw() {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            parcelableArrayList = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES", UnsupportedWalletType.class);
        } else {
            parcelableArrayList = arguments.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES");
        }
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17781fSa djBIcL() {
        return (C17781fSa) this.valueOf.getValue();
    }

    public static final C17781fSa KWHzl(fQD fqd, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C17781fSa(SavedStateHandleSupport.createSavedStateHandle(creationExtras), fqd.gEmmrt, fqd.copydefault, null, null, 24, null);
    }

    public final fQI KWHzl() {
        return (fQI) this.AEQbTJ.getValue();
    }

    public static final fQI djBIcL(fQD fqd) {
        return fQI.Companion.AEQbTJ(fqd.AYXKKw(), fqd.copydefault);
    }

    @Override // o.wXX
    public android.view.LayoutInflater getCustomLayoutInflater() {
        android.view.LayoutInflater layoutInflaterCloneInContext = super.getCustomLayoutInflater().cloneInContext(this.AhwBna);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterCloneInContext, "");
        return layoutInflaterCloneInContext;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.AhwBna = copydefault(context);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        android.content.Context context;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        android.content.Context context2 = getContext();
        if (context2 == null || (context = this.AhwBna) == null) {
            return;
        }
        c52781wYc.setType(9);
        int iOLrzqt = C55298xhM.OLrzqt(24, context2) - yII.EZpvd(C55366xib.AEQbTJ(C52761wXj.ActionBar.DLWbHP, context2));
        c52781wYc.setPaddingRelative(iOLrzqt, c52781wYc.getPaddingTop(), iOLrzqt, c52781wYc.getPaddingBottom());
        c52781wYc.setDividerVisibility(true);
        CurrentWalletSwitchConfig currentWalletSwitchConfigAhwBna = AhwBna();
        java.lang.String strAhwBna = currentWalletSwitchConfigAhwBna != null ? currentWalletSwitchConfigAhwBna.AhwBna() : null;
        java.lang.String string = context2.getString(C13754dXa.FragmentManager.setupTitle);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (strAhwBna == null || strAhwBna.length() == 0) {
            strAhwBna = string;
        }
        c52781wYc.setTitle(strAhwBna);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(MaterialColors.getColor(context, C13754dXa.Application.AEQbTJ, context2.getColor(C52761wXj.Activity.QwvEab))));
        }
        android.widget.TextView textViewAEQbTJ = c52781wYc.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setTextColor(MaterialColors.getColor(context, C13754dXa.Application.copydefault, context2.getColor(C52761wXj.Activity.fdOvFl)));
        }
        c52781wYc.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.copydefault));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.EZpvd = C16690eog.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        valueOf();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        CurrentWalletSwitchConfig currentWalletSwitchConfigAhwBna = AhwBna();
        if ((currentWalletSwitchConfigAhwBna != null ? currentWalletSwitchConfigAhwBna.valueOf() : null) == ThemeType.NIGHT) {
            view.setBackgroundTintList(android.content.res.ColorStateList.valueOf(context.getColor(C52761wXj.Activity.profile)));
            android.app.Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setNavigationBarColor(context.getColor(C52761wXj.Activity.profile));
            }
        }
        if (bundle == null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CurrentWalletSwitchContainerFragment$onViewCreated$1(this, null), 3, null);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.add(C13754dXa.ActionBar.binderDied, KWHzl());
            fragmentTransactionBeginTransaction.commit();
        }
        view.post(new java.lang.Runnable() { // from class: o.fQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fQD.gEmmrt(this.EZpvd);
            }
        });
    }

    public static final void gEmmrt(fQD fqd) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fqd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC17759fRf
    public void OLrzqt() {
        C17760fRg c17760fRg = this.KWHzl;
        if (c17760fRg != null && c17760fRg.isAdded()) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            C17760fRg c17760fRg2 = this.KWHzl;
            if (c17760fRg2 == null) {
                return;
            }
            fragmentTransactionBeginTransaction.show(c17760fRg2);
            fragmentTransactionBeginTransaction.hide(KWHzl());
            fragmentTransactionBeginTransaction.commit();
            return;
        }
        CurrentWalletSwitchConfig currentWalletSwitchConfigAhwBna = AhwBna();
        if (currentWalletSwitchConfigAhwBna == null) {
            return;
        }
        C17760fRg c17760fRgAEQbTJ = C17760fRg.Companion.AEQbTJ(currentWalletSwitchConfigAhwBna, this.copydefault);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
        fragmentTransactionBeginTransaction2.add(C13754dXa.ActionBar.binderDied, c17760fRgAEQbTJ);
        fragmentTransactionBeginTransaction2.show(c17760fRgAEQbTJ);
        fragmentTransactionBeginTransaction2.hide(KWHzl());
        fragmentTransactionBeginTransaction2.commit();
        this.KWHzl = c17760fRgAEQbTJ;
    }

    @Override // o.InterfaceC17759fRf
    public void EZpvd() {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        C17760fRg c17760fRg = this.KWHzl;
        if (c17760fRg != null) {
            fragmentTransactionBeginTransaction.remove(c17760fRg);
            this.KWHzl = null;
        }
        fragmentTransactionBeginTransaction.show(KWHzl());
        fragmentTransactionBeginTransaction.commit();
    }

    public final void copydefault() {
        C17781fSa.StateListAnimator stateListAnimatorFIwbmz = djBIcL().fIwbmz();
        if (stateListAnimatorFIwbmz instanceof C17781fSa.StateListAnimator.Application) {
            InterfaceC54855xXv interfaceC54855xXv = this.djBIcL;
            if (interfaceC54855xXv != null) {
                interfaceC54855xXv.OLrzqt(((C17781fSa.StateListAnimator.Application) stateListAnimatorFIwbmz).KWHzl());
                return;
            }
            return;
        }
        if (stateListAnimatorFIwbmz instanceof C17781fSa.StateListAnimator.TaskDescription) {
            InterfaceC54855xXv interfaceC54855xXv2 = this.djBIcL;
            if (interfaceC54855xXv2 != null) {
                C17781fSa.StateListAnimator.TaskDescription taskDescription = (C17781fSa.StateListAnimator.TaskDescription) stateListAnimatorFIwbmz;
                interfaceC54855xXv2.KWHzl(taskDescription.KWHzl(), taskDescription.copydefault());
                return;
            }
            return;
        }
        if (stateListAnimatorFIwbmz instanceof C17781fSa.StateListAnimator.Activity) {
            InterfaceC54855xXv interfaceC54855xXv3 = this.djBIcL;
            if (interfaceC54855xXv3 != null) {
                interfaceC54855xXv3.copydefault(((C17781fSa.StateListAnimator.Activity) stateListAnimatorFIwbmz).KWHzl());
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(stateListAnimatorFIwbmz, C17781fSa.StateListAnimator.C0845StateListAnimator.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC54855xXv interfaceC54855xXv4 = this.djBIcL;
        if (interfaceC54855xXv4 != null) {
            interfaceC54855xXv4.copydefault();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        InterfaceC54855xXv interfaceC54855xXv = this.djBIcL;
        if (interfaceC54855xXv != null) {
            interfaceC54855xXv.copydefault();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        copydefault();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.copydefault = null;
        this.djBIcL = null;
        this.AhwBna = null;
    }

    private final void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CurrentWalletSwitchContainerFragment$initObserver$1(this, null), 3, null);
    }

    @Override // o.InterfaceC17759fRf
    public void AEQbTJ() {
        KWHzl().AhwBna();
    }

    private final android.content.Context copydefault(android.content.Context context) {
        ThemeType themeTypeValueOf;
        CurrentWalletSwitchConfig currentWalletSwitchConfigAhwBna = AhwBna();
        if (currentWalletSwitchConfigAhwBna == null || (themeTypeValueOf = currentWalletSwitchConfigAhwBna.valueOf()) == null) {
            themeTypeValueOf = ThemeType.DEFAULT;
        }
        return C17779fRz.OLrzqt(context, themeTypeValueOf);
    }

    @Override // o.C17760fRg.TaskDescription
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().EZpvd(str);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
            return;
        }
        super.show(fragmentManager, str);
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setSkipCollapsed(true);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fQD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final fQD AEQbTJ(@NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, @NotNull java.util.List<? extends UnsupportedWalletType> list) {
            Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
            Intrinsics.checkNotNullParameter(list, "");
            fQD fqd = new fQD();
            fqd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("CURRENT_WALLET_SWITCH_CONFIG", currentWalletSwitchConfig), C56390yDp.OLrzqt("UNSUPPORTED_WALLET_TYPES", new java.util.ArrayList(list))));
            return fqd;
        }
    }

    public static final ViewModelProvider.Factory valueOf(final fQD fqd) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C17781fSa.class), new Function1() { // from class: o.fQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQD.KWHzl(this.EZpvd, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
