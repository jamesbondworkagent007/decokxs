package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeuilib.positions.history_positions.utils.LinearLayoutManagerWrapper;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeSignalListPresenter;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeSignalSquarePresenter;
import com.okinc.unify_trade.biz.HomeSignalItemInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51215vin;
import o.C32113mPz;
import o.C43316rmw;
import o.C48033uCm;
import o.C51564vpR;
import o.C52755wXd;
import o.C55688xof;
import o.C55943xtV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51564vpR extends AbstractC54505xKx<uPK, HomeSignalListPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public C43316rmw OLrzqt;

    /* JADX INFO: renamed from: o.vpR$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
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
        return C48033uCm.Activity.DaRZkR;
    }

    public static final /* synthetic */ uPK AEQbTJ(C51564vpR c51564vpR) {
        return c51564vpR.gGvvIC();
    }

    public static final /* synthetic */ HomeSignalListPresenter OLrzqt(C51564vpR c51564vpR) {
        return c51564vpR.dxcTrN();
    }

    public C51564vpR() {
        final Function0 function0 = new Function0() { // from class: o.vpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51564vpR.gEmmrt(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeSignalListFragment$special$$inlined$viewModels$default$1
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeSignalSquarePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeSignalListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeSignalListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeSignalListFragment$special$$inlined$viewModels$default$4
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

    public static final ViewModelStoreOwner gEmmrt(C51564vpR c51564vpR) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c51564vpR.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final HomeSignalSquarePresenter copydefault() {
        return (HomeSignalSquarePresenter) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.vpR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vpR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C51564vpR AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C51564vpR c51564vpR = new C51564vpR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", str);
            c51564vpR.setArguments(bundle);
            return c51564vpR;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wPQ.OLrzqt(view);
        AYXKKw();
        KWHzl();
        AEQbTJ();
        djBIcL();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        HomeSignalListPresenter homeSignalListPresenterDxcTrN = dxcTrN();
        HomeSignalSortConfig value = copydefault().AEQbTJ().getValue();
        android.os.Bundle arguments = getArguments();
        HomeSignalListPresenter.fetchSignalList$default(homeSignalListPresenterDxcTrN, value, arguments != null ? arguments.getString("type") : null, false, 4, null);
    }

    private final void AYXKKw() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.copydefault(this.copydefault, (EmptyData) obj);
            }
        }));
        c43316rmw.register(HomeSignalItemInfo.class, new C51499voF(new Function1() { // from class: o.vpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.AEQbTJ(this.KWHzl, (HomeSignalItemInfo) obj);
            }
        }));
        this.OLrzqt = c43316rmw;
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManagerWrapper(requireContext()));
        gGvvIC().copydefault.setAdapter(this.OLrzqt);
        gGvvIC().copydefault.setItemViewCacheSize(10);
        gGvvIC().copydefault.addItemDecoration(new C31703mAu(ContextCompat.getColor(requireContext(), C32113mPz.ActionBar.getNewProxyInstance), C55298xhM.dp2px$default(8.0f, null, 1, null), ContextCompat.getColor(requireContext(), C32113mPz.ActionBar.getNewProxyInstance), 0));
        C33546myW c33546myW = gGvvIC().EZpvd;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.vpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51564vpR.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final Unit copydefault(C51564vpR c51564vpR, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData.getEmptyType() == 8) {
            HomeSignalListPresenter.fetchSignalList$default(c51564vpR.dxcTrN(), c51564vpR.copydefault().AEQbTJ().getValue(), null, true, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51564vpR c51564vpR, HomeSignalItemInfo homeSignalItemInfo) {
        Intrinsics.checkNotNullParameter(homeSignalItemInfo, "");
        android.content.Context context = c51564vpR.getContext();
        if (context != null) {
            ActivityC51215vin.TaskDescription taskDescription = ActivityC51215vin.Companion;
            java.lang.String signalChanId = homeSignalItemInfo.getSignalChanId();
            if (signalChanId == null) {
                signalChanId = "";
            }
            ActivityC51215vin.TaskDescription.startActivity$default(taskDescription, context, signalChanId, "1", null, 8, null);
        }
        C55867xrz.signalMarketPlaceClickEvent$default(C55867xrz.KWHzl, homeSignalItemInfo.isSubscribed() ? "use" : "subscrib", c51564vpR.copydefault().AEQbTJ().getValue(), null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C51564vpR c51564vpR, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51564vpR.dxcTrN().AYXKKw();
    }

    private final void KWHzl() {
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        });
        TradeLiveData<HomeSignalSortConfig> tradeLiveDataAEQbTJ = copydefault().AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.vpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.EZpvd(this.KWHzl, (HomeSignalSortConfig) obj);
            }
        }));
        TradeLiveData<java.util.List<HomeSignalItemInfo>> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner3, new Dialog(new Function1() { // from class: o.vpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        dxcTrN().OLrzqt().AkhnZx().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.vpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner4, new Dialog(new Function1() { // from class: o.vpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51564vpR.copydefault(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C51564vpR c51564vpR, java.lang.String str) {
        if (c51564vpR.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            HomeSignalListPresenter.fetchSignalList$default(c51564vpR.dxcTrN(), c51564vpR.copydefault().AEQbTJ().getValue(), null, true, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51564vpR c51564vpR, HomeSignalSortConfig homeSignalSortConfig) {
        Intrinsics.checkNotNullParameter(homeSignalSortConfig, "");
        c51564vpR.gGvvIC().AEQbTJ.setText(C33070mpX.AYXKKw(homeSignalSortConfig.getTitle()));
        if (c51564vpR.isResumed()) {
            HomeSignalListPresenter.fetchSignalList$default(c51564vpR.dxcTrN(), homeSignalSortConfig, null, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51564vpR c51564vpR, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C43316rmw c43316rmw = c51564vpR.OLrzqt;
        if (c43316rmw != null) {
            C49952uyJ.updateDataOrEmpty$default(c43316rmw, c51564vpR.dxcTrN().EZpvd(), C33070mpX.AYXKKw(C55688xof.Application.SaJVGb), 60, null, null, false, 56, null);
        }
        C33546myW c33546myW = c51564vpR.gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, list.isEmpty());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51564vpR, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51564vpR c51564vpR, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && !c51564vpR.dxcTrN().AEQbTJ()) {
            C55113xdn.showLoading$default(c51564vpR.gGvvIC().OLrzqt, 0L, 1, null);
        } else {
            c51564vpR.gGvvIC().OLrzqt.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51564vpR c51564vpR, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C43316rmw c43316rmw = c51564vpR.OLrzqt;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, null, 60, false, null, null, false, 61, null));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51564vpR, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C55943xtV.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<C55943xtV>(obj) { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeSignalListFragment$initListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C55943xtV c55943xtV) {
                Intrinsics.checkNotNullParameter(c55943xtV, "");
                C43316rmw c43316rmw = this.this$0.OLrzqt;
                if (c43316rmw != null) {
                    c43316rmw.notifyItemChanged(C51564vpR.OLrzqt(this.this$0).AEQbTJ(c55943xtV.EZpvd()));
                }
            }
        });
        android.widget.TextView textView = gGvvIC().AEQbTJ;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vpR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51564vpR EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51564vpR c51564vpR) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c51564vpR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C51564vpR.AEQbTJ(this.EZpvd).AEQbTJ.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                HomeSignalListPresenter homeSignalListPresenterOLrzqt = C51564vpR.OLrzqt(this.EZpvd);
                HomeSignalSortConfig value = this.EZpvd.copydefault().AEQbTJ().getValue();
                java.util.List<C55276xgr> listKWHzl = homeSignalListPresenterOLrzqt.KWHzl(value != null ? value.getMode() : null);
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listKWHzl, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.EZpvd.new TaskDescription(), this.EZpvd.new Application(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, Activity.AEQbTJ, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vpR$Application */
    public static final class Application implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            HomeSignalSortConfig homeSignalSortConfig = objOLrzqt instanceof HomeSignalSortConfig ? (HomeSignalSortConfig) objOLrzqt : null;
            if (homeSignalSortConfig != null) {
                C51564vpR.this.copydefault().EZpvd(homeSignalSortConfig);
            }
        }
    }

    /* JADX INFO: renamed from: o.vpR$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C51564vpR.AEQbTJ(C51564vpR.this).AEQbTJ.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vpR$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "dropdown", false, 4, null);
            EventParamsList.put$default(eventParamsList, "type", "signal_marketplace", false, 4, null);
        }
    }

    private final void djBIcL() {
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51564vpR.AEQbTJ(this.copydefault, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51564vpR c51564vpR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (c51564vpR.isResumed()) {
            HomeSignalListPresenter.fetchSignalList$default(c51564vpR.dxcTrN(), c51564vpR.copydefault().AEQbTJ().getValue(), null, false, 6, null);
        }
    }
}
