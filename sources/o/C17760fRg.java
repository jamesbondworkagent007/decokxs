package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.color.MaterialColors;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$observeChangeWalletState$1;
import com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$observeWalletSearchResultsState$1;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.ThemeType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17760fRg extends fRC {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C16685eob AEQbTJ;
    public TaskDescription AYXKKw;
    public final Function0<Unit> AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> EZpvd;
    public fRB KWHzl;
    public fDM OLrzqt;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fRs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17760fRg.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt;
    public RecyclerView.OnScrollListener valueOf;

    /* JADX INFO: renamed from: o.fRg$TaskDescription */
    public interface TaskDescription {
        void OLrzqt(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.ROgMPW;
    }

    public C17760fRg() {
        final Function0 function0 = new Function0() { // from class: o.fRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17760fRg.AuCTel(this.EZpvd);
            }
        };
        Function0 function02 = new Function0() { // from class: o.fRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17760fRg.fIwbmz(this.KWHzl);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$1
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C17781fSa.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$3
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
        Function0 function04 = new Function0() { // from class: o.fRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17760fRg.DbNXlk(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchWalletViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$special$$inlined$viewModels$default$8
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
        this.AhwBna = new Function0() { // from class: o.fRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17760fRg.fetchVPNInfo(this.AEQbTJ);
            }
        };
    }

    public final CurrentWalletSwitchConfig copydefault() {
        return (CurrentWalletSwitchConfig) this.djBIcL.getValue();
    }

    public static final CurrentWalletSwitchConfig AkhnZx(C17760fRg c17760fRg) {
        android.os.Parcelable parcelable;
        android.os.Bundle arguments = c17760fRg.getArguments();
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

    private final C17781fSa EZpvd() {
        return (C17781fSa) this.AkhnZx.getValue();
    }

    public static final ViewModelStoreOwner AuCTel(C17760fRg c17760fRg) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c17760fRg.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public static final C17781fSa KWHzl(C17760fRg c17760fRg, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C17781fSa(SavedStateHandleSupport.createSavedStateHandle(creationExtras), C17777fRx.Companion.KWHzl(), c17760fRg.EZpvd, null, null, 24, null);
    }

    /* JADX INFO: renamed from: o.fRg$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C17760fRg.this.AEQbTJ().EZpvd(editable != null ? editable.toString() : null);
        }
    }

    public final SearchWalletViewModel AEQbTJ() {
        return (SearchWalletViewModel) this.gEmmrt.getValue();
    }

    public static final SearchWalletViewModel AEQbTJ(C17760fRg c17760fRg, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
        CurrentWalletSwitchConfig currentWalletSwitchConfigCopydefault = c17760fRg.copydefault();
        savedStateHandleCreateSavedStateHandle.set("show_tee_wallet_status", java.lang.Boolean.valueOf((currentWalletSwitchConfigCopydefault != null ? currentWalletSwitchConfigCopydefault.KWHzl() : null) != null));
        return new SearchWalletViewModel(savedStateHandleCreateSavedStateHandle, new fRW(null, null, c17760fRg.EZpvd().copydefault().getValue(), c17760fRg.EZpvd().djBIcL().getValue(), c17760fRg.EZpvd, null, 35, null), new C17405fEc(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null)), Dispatchers.getDefault());
    }

    public static final Unit fetchVPNInfo(C17760fRg c17760fRg) {
        ActivityResultCaller parentFragment = c17760fRg.getParentFragment();
        InterfaceC17759fRf interfaceC17759fRf = parentFragment instanceof InterfaceC17759fRf ? (InterfaceC17759fRf) parentFragment : null;
        if (interfaceC17759fRf != null) {
            interfaceC17759fRf.AEQbTJ();
            interfaceC17759fRf.EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[PHI: r3
  0x002b: PHI (r3v3 o.fRg$TaskDescription) = (r3v2 o.fRg$TaskDescription), (r3v6 o.fRg$TaskDescription) binds: [B:6:0x0011, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.fRC, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        TaskDescription taskDescription = null;
        TaskDescription taskDescription2 = context instanceof TaskDescription ? (TaskDescription) context : null;
        if (taskDescription2 == null) {
            ActivityResultCaller parentFragment = getParentFragment();
            taskDescription2 = parentFragment instanceof TaskDescription ? (TaskDescription) parentFragment : null;
            if (taskDescription2 == null) {
                pUU.EZpvd(getTAG(), "WalletSwitchSearchFragment.OnWalletSelectedListener is null, did you implement in your activity or parentFragment?");
            } else {
                taskDescription = taskDescription2;
            }
        }
        this.AYXKKw = taskDescription;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.content.Context contextIsConnected = isConnected();
        if (contextIsConnected == null) {
            return null;
        }
        C16685eob c16685eobCopydefault = C16685eob.copydefault(layoutInflater.cloneInContext(contextIsConnected), viewGroup, false);
        this.AEQbTJ = c16685eobCopydefault;
        if (c16685eobCopydefault != null) {
            return c16685eobCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna();
    }

    private final void AhwBna() {
        android.content.Context contextIsConnected;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        final C55230xfy c55230xfy;
        final android.content.Context context = getContext();
        if (context == null || (contextIsConnected = isConnected()) == null) {
            return;
        }
        this.OLrzqt = new fDM();
        this.KWHzl = new fRB(new C17403fEa(C55366xib.KWHzl(C52761wXj.ActionBar.DCUTEI, context)));
        C16685eob c16685eob = this.AEQbTJ;
        if (c16685eob != null && (c55230xfy = c16685eob.KWHzl) != null) {
            c55230xfy.setShowCancelButton(true);
            c55230xfy.copydefault().setText(requireContext().getString(C13754dXa.FragmentManager.getSessionToken));
            c55230xfy.copydefault().setTextColor(MaterialColors.getColor(contextIsConnected, C13754dXa.Application.copydefault, context.getColor(C52761wXj.Activity.fdOvFl)));
            c55230xfy.setOnBackPressed(this.AhwBna);
            android.widget.TextView textViewCopydefault = c55230xfy.copydefault();
            textViewCopydefault.setOnClickListener(new StateListAnimator(textViewCopydefault, 1000L, this));
            c55230xfy.KWHzl().addTextChangedListener(new Application());
            c55230xfy.KWHzl().post(new java.lang.Runnable() { // from class: o.fRm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C17760fRg.EZpvd(context, c55230xfy);
                }
            });
        }
        C16685eob c16685eob2 = this.AEQbTJ;
        if (c16685eob2 != null && (recyclerView3 = c16685eob2.EZpvd) != null) {
            recyclerView3.setLayoutManager(new SafeLinearLayoutManager(context));
        }
        C16685eob c16685eob3 = this.AEQbTJ;
        if (c16685eob3 != null && (recyclerView2 = c16685eob3.EZpvd) != null) {
            recyclerView2.setAdapter(this.OLrzqt);
        }
        C16685eob c16685eob4 = this.AEQbTJ;
        if (c16685eob4 == null || (recyclerView = c16685eob4.EZpvd) == null) {
            return;
        }
        recyclerView.postDelayed(new java.lang.Runnable() { // from class: o.fRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17760fRg.values(this.EZpvd);
            }
        }, 500L);
    }

    public static final void EZpvd(android.content.Context context, C55230xfy c55230xfy) {
        C33570myu.AEQbTJ(context, (android.widget.EditText) c55230xfy.KWHzl());
    }

    /* JADX INFO: renamed from: o.fRg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C17760fRg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17760fRg c17760fRg) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c17760fRg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AhwBna.invoke();
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null) {
                    return;
                }
                C33570myu.copydefault((android.app.Activity) activity);
            }
        }
    }

    public static final void values(C17760fRg c17760fRg) {
        RecyclerView.OnScrollListener onScrollListenerOLrzqt;
        RecyclerView recyclerView;
        C16685eob c16685eob = c17760fRg.AEQbTJ;
        if (c16685eob == null || (recyclerView = c16685eob.EZpvd) == null) {
            onScrollListenerOLrzqt = null;
        } else {
            FragmentActivity activity = c17760fRg.getActivity();
            if (activity == null) {
                return;
            } else {
                onScrollListenerOLrzqt = C17779fRz.OLrzqt(recyclerView, activity);
            }
        }
        c17760fRg.valueOf = onScrollListenerOLrzqt;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        OLrzqt();
        KWHzl();
    }

    private final void AYXKKw() {
        fDM fdm = this.OLrzqt;
        if (fdm != null) {
            fdm.AEQbTJ(fEO.class, (fDP) new fRK());
        }
        fDM fdm2 = this.OLrzqt;
        if (fdm2 != null) {
            fdm2.AEQbTJ(C17420fEr.class, (fDP) new fRF(new Function1() { // from class: o.fRj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17760fRg.KWHzl(this.copydefault, (C17420fEr) obj);
                }
            }));
        }
        fDM fdm3 = this.OLrzqt;
        if (fdm3 != null) {
            fdm3.AEQbTJ(fEM.class, (fDP) new fEN());
        }
        fDM fdm4 = this.OLrzqt;
        if (fdm4 != null) {
            fdm4.AEQbTJ(fED.class, (fDP) new fRG());
        }
        fDM fdm5 = this.OLrzqt;
        if (fdm5 != null) {
            fdm5.AEQbTJ(C17742fQp.class, (fDP) new fRO());
        }
    }

    public static final Unit KWHzl(C17760fRg c17760fRg, C17420fEr c17420fEr) {
        Intrinsics.checkNotNullParameter(c17420fEr, "");
        c17760fRg.AEQbTJ().AEQbTJ(c17420fEr.EZpvd());
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSwitchSearchFragment$observeWalletSearchResultsState$1(this, null), 3, null);
    }

    public static final void copydefault(C17760fRg c17760fRg, boolean z) {
        C55113xdn c55113xdn;
        C16685eob c16685eob = c17760fRg.AEQbTJ;
        if (c16685eob == null || (c55113xdn = c16685eob.AEQbTJ) == null) {
            return;
        }
        c55113xdn.setVisibility(z ? 0 : 8);
    }

    public final void EZpvd(final boolean z) {
        C55113xdn c55113xdn;
        C16685eob c16685eob = this.AEQbTJ;
        if (c16685eob == null || (c55113xdn = c16685eob.AEQbTJ) == null) {
            return;
        }
        c55113xdn.post(new java.lang.Runnable() { // from class: o.fRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17760fRg.copydefault(this.AEQbTJ, z);
            }
        });
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSwitchSearchFragment$observeChangeWalletState$1(this, null), 3, null);
    }

    @Override // o.fRC
    public ThemeType valueOf() {
        ThemeType themeTypeValueOf;
        CurrentWalletSwitchConfig currentWalletSwitchConfigCopydefault = copydefault();
        return (currentWalletSwitchConfigCopydefault == null || (themeTypeValueOf = currentWalletSwitchConfigCopydefault.valueOf()) == null) ? ThemeType.DEFAULT : themeTypeValueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16685eob c16685eob;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.valueOf;
        if (onScrollListener != null && (c16685eob = this.AEQbTJ) != null && (recyclerView = c16685eob.EZpvd) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.KWHzl = null;
    }

    @Override // o.fRC, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.AYXKKw = null;
    }

    /* JADX INFO: renamed from: o.fRg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fRg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C17760fRg AEQbTJ(@NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2) {
            Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
            C17760fRg c17760fRg = new C17760fRg();
            c17760fRg.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("CURRENT_WALLET_SWITCH_CONFIG", currentWalletSwitchConfig)));
            c17760fRg.EZpvd = function2;
            return c17760fRg;
        }
    }

    public static final ViewModelProvider.Factory fIwbmz(final C17760fRg c17760fRg) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C17781fSa.class), new Function1() { // from class: o.fRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17760fRg.KWHzl(this.copydefault, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final ViewModelProvider.Factory DbNXlk(final C17760fRg c17760fRg) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(SearchWalletViewModel.class), new Function1() { // from class: o.fRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17760fRg.AEQbTJ(this.AEQbTJ, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
