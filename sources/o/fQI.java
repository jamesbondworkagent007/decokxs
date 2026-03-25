package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$1;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$2;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$3;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$4;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$5;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$6;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$restoreMpcWallet$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.ThemeType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18501fjb;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C12827cuN;
import o.C13754dXa;
import o.C17424fEv;
import o.C17748fQv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fQI extends fRC implements C17748fQv.Application {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C16694eok KWHzl;
    public ActivityResultLauncher<android.content.Intent> OLrzqt;
    public Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> djBIcL;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fQP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fQI.KWHzl();
        }
    });
    public final InterfaceC17773fRt valueOf = C17777fRx.Companion.KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.aKhcqp;
    }

    public fQI() {
        final Function0 function0 = new Function0() { // from class: o.fQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQI.gEmmrt(this.KWHzl);
            }
        };
        Function0 function02 = new Function0() { // from class: o.fQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQI.values(this.AEQbTJ);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$1
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
        final Function0 function03 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C17781fSa.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$3
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
        }, function02);
        Function0 function04 = new Function0() { // from class: o.fQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQI.AEQbTJ();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19434gCf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$special$$inlined$viewModels$default$8
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
                Function0 function06 = function03;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function04);
        this.AYXKKw = true;
    }

    public static final C17735fQi KWHzl() {
        return new C17735fQi();
    }

    public final C17735fQi copydefault() {
        return (C17735fQi) this.copydefault.getValue();
    }

    public final C17781fSa djBIcL() {
        return (C17781fSa) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(fQI fqi) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = fqi.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public static final C17781fSa OLrzqt(fQI fqi, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C17781fSa(SavedStateHandleSupport.createSavedStateHandle(creationExtras), fqi.valueOf, fqi.djBIcL, null, null, 24, null);
    }

    public final C19434gCf AYXKKw() {
        return (C19434gCf) this.AEQbTJ.getValue();
    }

    public static final C19434gCf EZpvd(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C19434gCf(new C8301bAD(), C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), C10954byG.EZpvd.valueOf(), C11205cFp.EZpvd);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.content.Context contextIsConnected = isConnected();
        if (contextIsConnected == null) {
            return null;
        }
        this.KWHzl = C16694eok.KWHzl(layoutInflater.cloneInContext(contextIsConnected), viewGroup, false);
        this.OLrzqt = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.fQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fQI.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        C16694eok c16694eok = this.KWHzl;
        if (c16694eok != null) {
            return c16694eok.getRoot();
        }
        return null;
    }

    public static final void AEQbTJ(fQI fqi, ActivityResult activityResult) {
        android.content.Context context;
        java.lang.String string;
        if (activityResult.getResultCode() == -1) {
            fqi.AhwBna();
            android.content.Intent data = activityResult.getData();
            if (data == null || data.getIntExtra("walletResultType", -1) != 1 || (context = fqi.getContext()) == null || (string = context.getString(C13754dXa.FragmentManager.setupContent)) == null) {
                return;
            }
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AkhnZx();
        gEmmrt();
        fetchVPNInfo();
        DbNXlk();
    }

    private final void DbNXlk() {
        C55230xfy c55230xfy;
        C16694eok c16694eok = this.KWHzl;
        if (c16694eok == null || (c55230xfy = c16694eok.AYXKKw) == null) {
            return;
        }
        c55230xfy.setOnSearchBarClick(new Function0() { // from class: o.fQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQI.valueOf(this.AEQbTJ);
            }
        });
    }

    public static final Unit valueOf(fQI fqi) {
        ActivityResultCaller parentFragment = fqi.getParentFragment();
        InterfaceC17759fRf interfaceC17759fRf = parentFragment instanceof InterfaceC17759fRf ? (InterfaceC17759fRf) parentFragment : null;
        if (interfaceC17759fRf != null) {
            interfaceC17759fRf.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CurrentWalletSwitchFragment$initObserver$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new CurrentWalletSwitchFragment$initObserver$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new CurrentWalletSwitchFragment$initObserver$3(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new CurrentWalletSwitchFragment$initObserver$4(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new CurrentWalletSwitchFragment$initObserver$5(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), null, null, new CurrentWalletSwitchFragment$initObserver$6(this, null), 3, null);
    }

    public final void gEmmrt() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C16694eok c16694eok = this.KWHzl;
        if (c16694eok != null && (recyclerView2 = c16694eok.gEmmrt) != null) {
            recyclerView2.setAdapter(copydefault());
        }
        C16694eok c16694eok2 = this.KWHzl;
        if (c16694eok2 == null || (recyclerView = c16694eok2.gEmmrt) == null) {
            return;
        }
        recyclerView.setLayoutManager(new SafeLinearLayoutManager(getContext()));
    }

    private final void AkhnZx() {
        C17735fQi c17735fQiCopydefault = copydefault();
        c17735fQiCopydefault.AEQbTJ(fED.class, (fDP) new fRG());
        CurrentWalletSwitchConfig currentWalletSwitchConfigKWHzl = djBIcL().KWHzl();
        c17735fQiCopydefault.AEQbTJ(C17736fQj.class, (fDP) new fRI((currentWalletSwitchConfigKWHzl != null ? currentWalletSwitchConfigKWHzl.KWHzl() : null) == null ? new Function1() { // from class: o.fRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd(this.copydefault, (android.view.View) obj);
            }
        } : null));
        c17735fQiCopydefault.AEQbTJ(C17737fQk.class, (fDP) new fRJ(new Function1() { // from class: o.fRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd(this.OLrzqt, (AbstractC12784ctX) obj);
            }
        }));
        c17735fQiCopydefault.AEQbTJ(C17734fQh.class, (fDP) new fRP(new Function1() { // from class: o.fRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.KWHzl(this.EZpvd, (C17734fQh) obj);
            }
        }));
        c17735fQiCopydefault.AEQbTJ(C17738fQl.class, (fDP) new fRP(new Function1() { // from class: o.fQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd(this.EZpvd, (C17738fQl) obj);
            }
        }));
        c17735fQiCopydefault.AEQbTJ(C17740fQn.class, (fDP) new fRL(new Function1() { // from class: o.fRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd(this.copydefault, (C17740fQn) obj);
            }
        }));
        c17735fQiCopydefault.AEQbTJ(C17739fQm.class, (fDP) new fRR());
        c17735fQiCopydefault.AEQbTJ(C17741fQo.class, (fDP) new fRQ());
        c17735fQiCopydefault.AEQbTJ(C17745fQs.class, (fDP) new fRE(new Function1() { // from class: o.fRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.copydefault(this.KWHzl, (C17745fQs) obj);
            }
        }, new Function1() { // from class: o.fRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.AEQbTJ(this.OLrzqt, (C17745fQs) obj);
            }
        }, new Function1() { // from class: o.fQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.AYXKKw(this.copydefault, (C17745fQs) obj);
            }
        }));
        c17735fQiCopydefault.AEQbTJ(C17424fEv.Activity.class, (fDP) new C17424fEv(new Function1() { // from class: o.fQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.AEQbTJ(this.EZpvd, (C17424fEv.Activity) obj);
            }
        }));
    }

    public static final Unit EZpvd(fQI fqi, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC9731bbC value = fqi.djBIcL().EZpvd().getValue();
        SupportedNetworkType supportedNetworkTypeEZpvd = value != null ? fqi.EZpvd(value) : null;
        java.util.List<SupportedNetworkType> listEZpvd = supportedNetworkTypeEZpvd != null ? C56402yEa.EZpvd(supportedNetworkTypeEZpvd) : null;
        java.util.List<UnsupportedWalletType> listIsConnected = fqi.djBIcL().isConnected();
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = fqi.OLrzqt;
        if (activityResultLauncher != null) {
            ActivityC18501fjb.ActionBar actionBar = ActivityC18501fjb.Companion;
            FragmentActivity activity = fqi.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            android.content.Context context = fqi.getContext();
            if (context != null) {
                int i = C13754dXa.FragmentManager.setupView;
                CurrentWalletSwitchConfig currentWalletSwitchConfigKWHzl = fqi.djBIcL().KWHzl();
                strOLrzqt = currentWalletSwitchConfigKWHzl != null ? currentWalletSwitchConfigKWHzl.OLrzqt() : null;
                strOLrzqt = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("BusinessName", strOLrzqt != null ? strOLrzqt : "")));
            }
            activityResultLauncher.launch(actionBar.OLrzqt(activity, strOLrzqt, listEZpvd, listIsConnected, false, 2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fQI fqi, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        fqi.OLrzqt(abstractC12784ctX);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(fQI fqi, C17734fQh c17734fQh) {
        Intrinsics.checkNotNullParameter(c17734fQh, "");
        AbstractC12782ctV abstractC12782ctVOLrzqt = c17734fQh.OLrzqt();
        if (!abstractC12782ctVOLrzqt.zLjUOn()) {
            fqi.EZpvd((InterfaceC9738bbJ) abstractC12782ctVOLrzqt);
            return Unit.INSTANCE;
        }
        if (c17734fQh.EZpvd() == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed) {
            fqi.EZpvd(abstractC12782ctVOLrzqt);
            return Unit.INSTANCE;
        }
        fqi.AEQbTJ(c17734fQh);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fQI fqi, C17738fQl c17738fQl) {
        Intrinsics.checkNotNullParameter(c17738fQl, "");
        fqi.copydefault(c17738fQl);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fQI fqi, C17740fQn c17740fQn) {
        Intrinsics.checkNotNullParameter(c17740fQn, "");
        boolean zOLrzqt = fqi.copydefault().OLrzqt(c17740fQn);
        boolean z = !zOLrzqt;
        c17740fQn.OLrzqt(z);
        if (zOLrzqt) {
            fqi.copydefault().AEQbTJ(c17740fQn);
        } else {
            fqi.copydefault().KWHzl(c17740fQn);
        }
        fqi.djBIcL().EZpvd(c17740fQn.KWHzl().EZpvd(), z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(fQI fqi, C17745fQs c17745fQs) {
        Intrinsics.checkNotNullParameter(c17745fQs, "");
        fqi.OLrzqt(c17745fQs);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final fQI fqi, final C17745fQs c17745fQs) {
        Intrinsics.checkNotNullParameter(c17745fQs, "");
        C32866mlf.onEvent$default("Web3ChangeWallet_WalletSelection_Switch_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C19429gCa c19429gCaOLrzqt = C19429gCa.Companion.OLrzqt(c17745fQs.AEQbTJ(), c17745fQs.copydefault(), c17745fQs.DbNXlk().DbNXlk(), c17745fQs.KWHzl(), (16 & 16) != 0 ? false : false);
        androidx.fragment.app.FragmentManager childFragmentManager = fqi.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C19429gCa.show$default(c19429gCaOLrzqt, childFragmentManager, "CurrentWalletSwitchFragment", new yHO() { // from class: o.fQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fQI.copydefault(this.copydefault, c17745fQs, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(fQI fqi, C17745fQs c17745fQs, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        fqi.AYXKKw().copydefault(c17745fQs.copydefault(), str, i, c17745fQs.DbNXlk());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(fQI fqi, C17745fQs c17745fQs) {
        Intrinsics.checkNotNullParameter(c17745fQs, "");
        android.content.Context context = fqi.getContext();
        if (context != null) {
            fqi.copydefault(context, c17745fQs);
            fqi.EZpvd(context, c17745fQs);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final fQI fqi, C17424fEv.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        fNC fnc = fNC.OLrzqt;
        AbstractC12784ctX abstractC12784ctXEZpvd = activity.EZpvd();
        FragmentActivity activity2 = fqi.getActivity();
        if (activity2 == null) {
            return Unit.INSTANCE;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fqi.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        fnc.AEQbTJ(abstractC12784ctXEZpvd, activity2, childFragmentManager, new Function1() { // from class: o.fQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.KWHzl(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(fQI fqi, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            fNC.OLrzqt.EZpvd(C13788dYh.copydefault(abstractC12782ctV), java.lang.Integer.valueOf(abstractC12782ctV.getNewProxyInstance()));
            fqi.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.content.Context context, C17745fQs c17745fQs) {
        java.lang.String strCopydefault;
        InterfaceC9731bbC value = djBIcL().EZpvd().getValue();
        java.lang.String strDjBIcL = value != null ? value.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        if (strDjBIcL.length() == 0) {
            strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
        } else if (c17745fQs.values()) {
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(c17745fQs.DbNXlk(), c17745fQs.KWHzl(), null, 2, null);
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.getCallbacks, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainName", strDjBIcL), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C8322bAY.getAddressFormat$default(C8322bAY.KWHzl, chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getAddressType() : AddressType.Legacy.getValue(), false, 2, null))));
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.getView, C56424yEw.AYXKKw(C56390yDp.OLrzqt("network", strDjBIcL)));
        }
        C19595gIe.Companion.AEQbTJ(strCopydefault, c17745fQs.KWHzl()).KWHzl(context);
    }

    public final void copydefault(android.content.Context context, C17745fQs c17745fQs) {
        try {
            java.lang.Object systemService = context.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, c17745fQs.KWHzl()));
        } catch (java.lang.Exception e) {
            pUU.copydefault("copyAddress :" + e.getMessage());
        }
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CurrentWalletSwitchFragment$restoreMpcWallet$1(abstractC12782ctV, activity, null), 3, null);
    }

    public final SupportedNetworkType EZpvd(InterfaceC9731bbC interfaceC9731bbC) {
        return new SupportedNetworkType(interfaceC9731bbC.djBIcL(), interfaceC9731bbC.fetchVPNInfo());
    }

    public final void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).OLrzqt(interfaceC9738bbJ, activity, false, new Function1() { // from class: o.fQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(fQI fqi, boolean z) {
        if (z) {
            fqi.djBIcL().fJNWhG();
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        djBIcL().iwGUEr();
    }

    public final void copydefault(C17738fQl c17738fQl) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        long jCopydefault = c17738fQl.copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC54829xWw.copydefault(jCopydefault, childFragmentManager, new Function1() { // from class: o.fQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.gEmmrt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit gEmmrt(fQI fqi, boolean z) {
        if (z) {
            fqi.djBIcL().iwGUEr();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C17745fQs c17745fQs) {
        if (c17745fQs.isConnected()) {
            djBIcL().KWHzl(c17745fQs.DbNXlk());
        }
    }

    public final void AEQbTJ(C17734fQh c17734fQh) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1(this, c17734fQh, null), 3, null);
    }

    public final void OLrzqt(final AbstractC12784ctX abstractC12784ctX) {
        AbstractC12782ctV abstractC12782ctV;
        final android.content.Context context = getContext();
        if (context == null || (abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(abstractC12784ctX.KWHzl())) == null) {
            return;
        }
        djBIcL().OLrzqt(abstractC12782ctV);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C18836fpt.showBackupDialogWithManualCallback$default(context, childFragmentManager, abstractC12782ctV, null, new Function0() { // from class: o.fQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fQI.copydefault(context, abstractC12784ctX);
            }
        }, 8, null);
    }

    public static final Unit copydefault(android.content.Context context, AbstractC12784ctX abstractC12784ctX) {
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, context, abstractC12784ctX.EZpvd(), "route_finish_activity", 0, 8, null);
        } else {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, context, abstractC12784ctX.EZpvd(), "route_finish_activity", 0, 8, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<? extends fDL<? extends java.lang.Object>> list) {
        RecyclerView recyclerView;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fDL<? extends java.lang.Object> fdl = list.get(i);
            if (fdl instanceof C17740fQn) {
                C17740fQn c17740fQn = (C17740fQn) fdl;
                int iOLrzqt = c17740fQn.OLrzqt();
                int i2 = 0;
                while (true) {
                    if (i2 >= iOLrzqt) {
                        break;
                    }
                    java.lang.Object objCopydefault = c17740fQn.copydefault(i2);
                    if ((objCopydefault instanceof C17745fQs) && ((C17745fQs) objCopydefault).valueOf()) {
                        intRef.element = copydefault().EZpvd(i) + i2 + 1;
                        break;
                    }
                    i2++;
                }
                if (intRef.element >= 0) {
                    break;
                }
            }
        }
        if (intRef.element < 0) {
            pUU.copydefault("WalletSwitchScroll", "scrollToMainWallet: no WalletBean with selectedVisible=true");
            return;
        }
        C16694eok c16694eok = this.KWHzl;
        if (c16694eok == null || (recyclerView = c16694eok.gEmmrt) == null) {
            return;
        }
        recyclerView.post(new java.lang.Runnable() { // from class: o.fQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fQI.AEQbTJ(this.EZpvd, intRef);
            }
        });
    }

    public static final void AEQbTJ(fQI fqi, Ref.IntRef intRef) {
        C16694eok c16694eok;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C16694eok c16694eok2 = fqi.KWHzl;
        RecyclerView.LayoutManager layoutManager = (c16694eok2 == null || (recyclerView2 = c16694eok2.gEmmrt) == null) ? null : recyclerView2.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            pUU.copydefault("WalletSwitchScroll", "scrollToMainWallet: layoutManager is null");
            return;
        }
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if ((iFindLastCompletelyVisibleItemPosition != -1 && intRef.element <= iFindLastCompletelyVisibleItemPosition) || (c16694eok = fqi.KWHzl) == null || (recyclerView = c16694eok.gEmmrt) == null) {
            return;
        }
        recyclerView.scrollToPosition(intRef.element);
    }

    public final void AEQbTJ(boolean z) {
        ConstraintLayout constraintLayout;
        C16694eok c16694eok = this.KWHzl;
        if (c16694eok == null || (constraintLayout = c16694eok.djBIcL) == null) {
            return;
        }
        constraintLayout.setVisibility(z ? 0 : 8);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AYXKKw) {
            this.AYXKKw = false;
            djBIcL().getNewProxyInstance();
        } else {
            eSA esa = new eSA();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            esa.KWHzl(viewLifecycleOwner, new Function1() { // from class: o.fQQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fQI.AYXKKw(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AYXKKw(fQI fqi, boolean z) {
        fqi.djBIcL().fJNWhG();
        return Unit.INSTANCE;
    }

    @Override // o.fRC
    public ThemeType valueOf() {
        ThemeType themeTypeValueOf;
        CurrentWalletSwitchConfig currentWalletSwitchConfigKWHzl = djBIcL().KWHzl();
        return (currentWalletSwitchConfigKWHzl == null || (themeTypeValueOf = currentWalletSwitchConfigKWHzl.valueOf()) == null) ? ThemeType.DEFAULT : themeTypeValueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    @Override // o.C17748fQv.Application
    public void AEQbTJ(long j) {
        djBIcL().AEQbTJ(j);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fQI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final fQI AEQbTJ(@NotNull java.util.List<? extends UnsupportedWalletType> list, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2) {
            Intrinsics.checkNotNullParameter(list, "");
            fQI fqi = new fQI();
            fqi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("UNSUPPORTED_WALLET_TYPES", new java.util.ArrayList(list))));
            fqi.djBIcL = function2;
            return fqi;
        }
    }

    public static final ViewModelProvider.Factory values(final fQI fqi) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C17781fSa.class), new Function1() { // from class: o.fQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.OLrzqt(this.OLrzqt, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final ViewModelProvider.Factory AEQbTJ() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C19434gCf.class), new Function1() { // from class: o.fQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fQI.EZpvd((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
