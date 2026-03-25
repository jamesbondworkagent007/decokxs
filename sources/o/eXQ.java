package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$3;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$4;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$5;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$6;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$7;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$8;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileActivitiesViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eXQ extends eXI {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String ejfBZ;
    public RecyclerView.OnScrollListener fIwbmz;
    public C16644enn isConnected;
    public final InterfaceC56387yDm valueOf;
    public final int values = C13754dXa.TaskDescription.RgLUBD;
    public java.lang.String AYXKKw = "";
    public long djBIcL = Long.MIN_VALUE;
    public boolean fetchVPNInfo = true;
    public boolean AkhnZx = true;
    public final C59534zip DbNXlk = new C59534zip();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public eXQ() {
        final Function0 function0 = new Function0() { // from class: o.eXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eXQ.AYXKKw(this.copydefault);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileActivitiesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$4
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
        final Function0 function03 = new Function0() { // from class: o.eXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eXQ.valueOf(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$7
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$special$$inlined$viewModels$default$8
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

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eXQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final eXQ KWHzl(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            eXQ exq = new eXQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            bundle.putLong("chain_id", j);
            exq.setArguments(bundle);
            return exq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressProfileActivitiesViewModel EZpvd() {
        return (AddressProfileActivitiesViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner AYXKKw(eXQ exq) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = exq.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressProfileAssetViewModel AYXKKw() {
        return (AddressProfileAssetViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner valueOf(eXQ exq) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = exq.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null) {
            string = "";
        }
        this.AYXKKw = string;
        android.os.Bundle arguments2 = getArguments();
        this.djBIcL = arguments2 != null ? arguments2.getLong("chain_id", Long.MIN_VALUE) : Long.MIN_VALUE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16644enn c16644enn = this.isConnected;
        if (c16644enn == null) {
            Intrinsics.gEmmrt("");
            c16644enn = null;
        }
        RecyclerView recyclerView = c16644enn.AYXKKw;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.DbNXlk);
        recyclerView.setNestedScrollingEnabled(true);
        gEmmrt();
        C33546myW c33546myW = c16644enn.EZpvd;
        c33546myW.djBIcL(false);
        c33546myW.AhwBna(true);
        c33546myW.OLrzqt(true);
        c33546myW.gEmmrt(true);
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.eXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                eXQ.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.eXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                eXQ.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
        valueOf();
        AhwBna();
        loadData$default(this, false, false, 3, null);
    }

    public static final void AEQbTJ(eXQ exq, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        loadData$default(exq, false, false, 2, null);
    }

    public static final void KWHzl(eXQ exq, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        exq.djBIcL();
    }

    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            eXQ.this.OLrzqt(recyclerView);
        }
    }

    private final void gEmmrt() {
        Application application = new Application();
        this.fIwbmz = application;
        C16644enn c16644enn = this.isConnected;
        if (c16644enn == null) {
            Intrinsics.gEmmrt("");
            c16644enn = null;
        }
        c16644enn.AYXKKw.addOnScrollListener(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C16644enn c16644enn = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            C16644enn c16644enn2 = this.isConnected;
            if (c16644enn2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16644enn = c16644enn2;
            }
            c16644enn.AhwBna.setVisibility(8);
            return;
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        boolean z = iFindFirstVisibleItemPosition > 0 || (iFindFirstVisibleItemPosition == 0 && viewFindViewByPosition != null && viewFindViewByPosition.getTop() < 0);
        C16644enn c16644enn3 = this.isConnected;
        if (c16644enn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16644enn = c16644enn3;
        }
        c16644enn.AhwBna.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView.OnScrollListener onScrollListener = this.fIwbmz;
        if (onScrollListener != null) {
            C16644enn c16644enn = this.isConnected;
            if (c16644enn == null) {
                Intrinsics.gEmmrt("");
                c16644enn = null;
            }
            c16644enn.AYXKKw.removeOnScrollListener(onScrollListener);
        }
        this.fIwbmz = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16644enn c16644ennCopydefault = C16644enn.copydefault(getLayoutInflater(), viewGroup, false);
        this.isConnected = c16644ennCopydefault;
        if (c16644ennCopydefault == null) {
            Intrinsics.gEmmrt("");
            c16644ennCopydefault = null;
        }
        ConstraintLayout root = c16644ennCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final void valueOf() {
        C16644enn c16644enn = this.isConnected;
        if (c16644enn == null) {
            Intrinsics.gEmmrt("");
            c16644enn = null;
        }
        c16644enn.copydefault.setAnimation(C52761wXj.PendingIntent.hDKMBd);
        C16644enn c16644enn2 = this.isConnected;
        if (c16644enn2 == null) {
            Intrinsics.gEmmrt("");
            c16644enn2 = null;
        }
        c16644enn2.OLrzqt.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileAssetActivitiesFragment$initViewData$8(this, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(eXQ exq, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        exq.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                C16644enn c16644enn = this.isConnected;
                if (c16644enn == null) {
                    Intrinsics.gEmmrt("");
                    c16644enn = null;
                }
                C55113xdn c55113xdn = c16644enn.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                c16644enn.copydefault.KWHzl(0L);
            }
            this.ejfBZ = null;
        }
        EZpvd().KWHzl(this.AYXKKw, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.djBIcL)), (4 & 4) != 0 ? null : null, 20, this.ejfBZ, java.lang.Boolean.valueOf(this.fetchVPNInfo), (4 & 64) != 0 ? false : z2);
    }

    private final void djBIcL() {
        EZpvd(false, true);
    }

    private final void AhwBna() {
        this.DbNXlk.register(C15905eZq.class, new C15903eZo());
        this.DbNXlk.register(java.lang.String.class, new C18228feT());
        this.DbNXlk.register(eWM.class, new C15899eZk(new Function1() { // from class: o.eXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eXQ.EZpvd(this.AEQbTJ, (eWM) obj);
            }
        }, new Function2() { // from class: o.eXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eXQ.AEQbTJ(this.copydefault, (eWM) obj, (android.view.View) obj2);
            }
        }, this.AkhnZx));
    }

    public static final Unit EZpvd(eXQ exq, eWM ewm) {
        Intrinsics.checkNotNullParameter(ewm, "");
        exq.EZpvd(ewm.valueOf());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(eXQ exq, eWM ewm, android.view.View view) {
        Intrinsics.checkNotNullParameter(ewm, "");
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = exq.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        C52812wZg c52812wZg = new C52812wZg(activity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.OLrzqt(exq.getString(C13754dXa.FragmentManager.Size));
        c52812wZg.AEQbTJ(stateListAnimator);
        android.widget.TextView textViewValueOf = c52812wZg.valueOf();
        if (textViewValueOf != null) {
            ViewGroup.LayoutParams layoutParams = textViewValueOf.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            float f = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = textViewValueOf.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            float f2 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = textViewValueOf.getLayoutParams();
            C55296xhK.OLrzqt(textViewValueOf, java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf((layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null) != null ? r3.bottomMargin : 0));
        }
        c52812wZg.OLrzqt(0);
        c52812wZg.fARcdN();
        C32866mlf.onEvent$default("Web3PNLAnalysis_RecentPNL_RiskWarningIcon_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, bundleBundleOf, null, 4, null);
    }
}
