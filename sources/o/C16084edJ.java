package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.FirebaseError;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.bean.SelectedNetworkData;
import com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$initView$3$1$1;
import com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$observeLiveData$1;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C18082fbg;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16084edJ extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final java.util.List<CustomChainMeta> AEQbTJ = new java.util.ArrayList();
    public int AYXKKw;
    public boolean AhwBna;
    public C16083edI EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C16518elT copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.edJ$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public interface ActionBar {
        void OLrzqt(CustomChainMeta customChainMeta);
    }

    /* JADX INFO: renamed from: o.edJ$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.gtCCJH;
    }

    public C16084edJ() {
        Function0 function0 = new Function0() { // from class: o.edP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16084edJ.copydefault();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C16162eei.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$4
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
        final Function0 function04 = new Function0() { // from class: o.edQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16084edJ.valueOf(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18013faQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$8
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
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final C16162eei AEQbTJ() {
        return (C16162eei) this.KWHzl.getValue();
    }

    public static final C16162eei AEQbTJ(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C16162eei(C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).DTwDnp(), null, 2, null);
    }

    public final C18013faQ KWHzl() {
        return (C18013faQ) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C16084edJ c16084edJ) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c16084edJ.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final ActionBar OLrzqt() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof ActionBar) {
            return (ActionBar) parentFragment;
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        this.copydefault = C16518elT.copydefault(view);
        android.os.Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("DataType") : 0;
        this.AYXKKw = i;
        if (i == 1) {
            C16518elT c16518elT = this.copydefault;
            if (c16518elT != null && (c52794wYp2 = c16518elT.copydefault) != null) {
                c52794wYp2.setVisibility(8);
            }
        } else {
            C16518elT c16518elT2 = this.copydefault;
            if (c16518elT2 != null && (c52794wYp = c16518elT2.copydefault) != null) {
                c52794wYp.setVisibility(0);
            }
        }
        this.EZpvd = new C16083edI(this.AEQbTJ, new C17403fEa(ContextCompat.getColor(context, C52761wXj.Activity.fkESqH)), this.AYXKKw, null, null, null, new Function1() { // from class: o.edT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.copydefault(this.KWHzl, (CustomChainMeta) obj);
            }
        }, new Function1() { // from class: o.edR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.OLrzqt(this.copydefault, (CustomChainMeta) obj);
            }
        }, 56, null);
        C16518elT c16518elT3 = this.copydefault;
        if (c16518elT3 != null) {
            c16518elT3.OLrzqt.KWHzl().addTextChangedListener(new Activity(c16518elT3));
            c16518elT3.KWHzl.setLayoutManager(new SafeLinearLayoutManager(c16518elT3.KWHzl.getContext()));
            c16518elT3.KWHzl.setAdapter(this.EZpvd);
            c16518elT3.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.edU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C16084edJ.copydefault(this.AEQbTJ, view2);
                }
            });
        }
        AhwBna();
    }

    /* JADX INFO: renamed from: o.edJ$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ C16518elT EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(C16518elT c16518elT) {
            this.EZpvd = c16518elT;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C16084edJ.this), null, null, new ChooseCustomNetworkFragment$initView$3$1$1(C16084edJ.this, this.EZpvd, null), 3, null);
        }
    }

    public static final Unit copydefault(C16084edJ c16084edJ, CustomChainMeta customChainMeta) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        ActionBar actionBarOLrzqt = c16084edJ.OLrzqt();
        if (actionBarOLrzqt != null) {
            actionBarOLrzqt.OLrzqt(customChainMeta);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C16084edJ c16084edJ, CustomChainMeta customChainMeta) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        if (c16084edJ.AYXKKw == 0) {
            ActionBar actionBarOLrzqt = c16084edJ.OLrzqt();
            if (actionBarOLrzqt != null) {
                actionBarOLrzqt.OLrzqt(customChainMeta);
            }
        } else {
            KeyEventDispatcher.Component activity = c16084edJ.getActivity();
            C18082fbg.Activity activity2 = activity instanceof C18082fbg.Activity ? (C18082fbg.Activity) activity : null;
            if (activity2 != null) {
                activity2.copydefault(c16084edJ.copydefault(customChainMeta));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C16084edJ c16084edJ, android.view.View view) {
        ActionBar actionBarOLrzqt = c16084edJ.OLrzqt();
        if (actionBarOLrzqt != null) {
            actionBarOLrzqt.OLrzqt(null);
        }
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ChooseCustomNetworkFragment$observeLiveData$1(this, null), 3, null);
        AEQbTJ().OLrzqt().observe(this, new Application(new Function1() { // from class: o.edM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        AEQbTJ().EZpvd().observe(this, new Application(new Function1() { // from class: o.edO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        AEQbTJ().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.edS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        showLoading();
    }

    public static final Unit AEQbTJ(C16084edJ c16084edJ, java.util.List list) {
        c16084edJ.dismissLoading();
        c16084edJ.AEQbTJ.clear();
        C16083edI c16083edI = c16084edJ.EZpvd;
        if (c16083edI != null) {
            java.lang.String strCopydefault = c16084edJ.AEQbTJ().copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            c16083edI.OLrzqt(strCopydefault);
        }
        java.util.List<CustomChainMeta> list2 = c16084edJ.AEQbTJ;
        Intrinsics.copydefault(list);
        list2.addAll(list);
        C16083edI c16083edI2 = c16084edJ.EZpvd;
        if (c16083edI2 != null) {
            c16083edI2.notifyDataSetChanged();
        }
        c16084edJ.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c16084edJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C16084edJ c16084edJ, java.lang.Boolean bool) {
        C55230xfy c55230xfy;
        C16518elT c16518elT = c16084edJ.copydefault;
        if (c16518elT != null && (c55230xfy = c16518elT.OLrzqt) != null) {
            c55230xfy.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C16084edJ c16084edJ, java.lang.Boolean bool) {
        C16518elT c16518elT = c16084edJ.copydefault;
        if (c16518elT != null) {
            C55173xeu c55173xeu = c16518elT.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(bool.booleanValue() ? 0 : 8);
            RecyclerView recyclerView = c16518elT.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(bool.booleanValue() ? 8 : 0);
            if (c16084edJ.AYXKKw == 2) {
                c16518elT.EZpvd.setEmptyTypeImage(6);
                c16518elT.EZpvd.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.setShuffleModeEnabledRemoved));
            }
        }
        return Unit.INSTANCE;
    }

    public final SelectedNetworkData copydefault(CustomChainMeta customChainMeta) {
        java.lang.String strEjfBZ;
        java.lang.String strValueOf = customChainMeta.valueOf();
        java.lang.String strOLrzqt = customChainMeta.OLrzqt();
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        if (customChainCoinMetaDjBIcL == null || (strEjfBZ = customChainCoinMetaDjBIcL.ejfBZ()) == null) {
            strEjfBZ = "";
        }
        return new SelectedNetworkData(strValueOf, strOLrzqt, strEjfBZ, "0", customChainMeta.EZpvd(), customChainMeta.fetchVPNInfo(), true, false, true, 0, false, 0, true, customChainMeta.AhwBna(), null, customChainMeta.isConnected(), FirebaseError.ERROR_USER_MISMATCH, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ().copydefault(this.AYXKKw);
    }

    public final void valueOf() {
        C16518elT c16518elT;
        RecyclerView recyclerView;
        if (this.AhwBna || this.EZpvd == null || AEQbTJ().OLrzqt().getValue() == null) {
            return;
        }
        this.AhwBna = true;
        java.util.List<CustomChainMeta> value = AEQbTJ().OLrzqt().getValue();
        int i = 0;
        if (value != null) {
            int i2 = 0;
            for (java.lang.Object obj : value) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                CustomChainMeta customChainMeta = (CustomChainMeta) obj;
                long jEZpvd = customChainMeta.EZpvd();
                C16083edI c16083edI = this.EZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(jEZpvd), (java.lang.Object) (c16083edI != null ? c16083edI.OLrzqt() : null))) {
                    java.lang.String strIsConnected = customChainMeta.isConnected();
                    C16083edI c16083edI2 = this.EZpvd;
                    if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) (c16083edI2 != null ? c16083edI2.KWHzl() : null))) {
                        i = i2;
                    }
                }
                i2++;
            }
        }
        if (i <= 4 || (c16518elT = this.copydefault) == null || (recyclerView = c16518elT.KWHzl) == null) {
            return;
        }
        recyclerView.scrollToPosition(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.edJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C16084edJ newInstance$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return stateListAnimator.EZpvd(i);
        }

        public final C16084edJ EZpvd(int i) {
            C16084edJ c16084edJ = new C16084edJ();
            c16084edJ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DataType", java.lang.Integer.valueOf(i))));
            return c16084edJ;
        }
    }

    public static final ViewModelProvider.Factory copydefault() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16162eei.class), new Function1() { // from class: o.edN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16084edJ.AEQbTJ((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
