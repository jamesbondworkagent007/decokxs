package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeBotSquarePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyListPresenter;
import com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$onVisible$1;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC51791vtg;
import o.C48033uCm;
import o.C51519voZ;
import o.C51632vqg;
import o.C52755wXd;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51632vqg extends AbstractC54505xKx<uPR, HomeStrategyListPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ = C48033uCm.Activity.OTwTPd;
    public java.lang.String AYXKKw;
    public C43316rmw KWHzl;
    public java.lang.String OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.vqg$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ HomeStrategyListPresenter AhwBna(C51632vqg c51632vqg) {
        return c51632vqg.dxcTrN();
    }

    public static final /* synthetic */ uPR djBIcL(C51632vqg c51632vqg) {
        return c51632vqg.gGvvIC();
    }

    public C51632vqg() {
        final Function0 function0 = new Function0() { // from class: o.vqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51632vqg.AkhnZx(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$special$$inlined$viewModels$default$1
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeBotSquarePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$special$$inlined$viewModels$default$4
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

    public static final ViewModelStoreOwner AkhnZx(C51632vqg c51632vqg) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c51632vqg.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final HomeBotSquarePresenter AEQbTJ() {
        return (HomeBotSquarePresenter) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.vqg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vqg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C51632vqg newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return activity.copydefault(str, str2);
        }

        public final C51632vqg copydefault(java.lang.String str, java.lang.String str2) {
            C51632vqg c51632vqg = new C51632vqg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KEY_TACTICS_TYPE", str);
            bundle.putString("tab_name", str2);
            c51632vqg.setArguments(bundle);
            return c51632vqg;
        }
    }

    public final boolean copydefault() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? arguments.getString("tab_name") : null;
        android.os.Bundle arguments2 = getArguments();
        this.OLrzqt = arguments2 != null ? arguments2.getString("KEY_TACTICS_TYPE") : null;
        Group group = gGvvIC().KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "FAVORITE") ^ true ? 0 : 8);
        if (copydefault()) {
            gGvvIC().KWHzl.removeView(gGvvIC().djBIcL);
            android.widget.ImageView imageView = gGvvIC().djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(copydefault() ? 8 : 0);
        }
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.OLrzqt(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        c43316rmw.register(HomeStrategyCardInfo.class, new C51512voS(true, new Function2() { // from class: o.vqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51632vqg.AEQbTJ(this.copydefault, (HomeStrategyCardInfo) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, new Function2() { // from class: o.vqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51632vqg.KWHzl(this.OLrzqt, (HomeStrategyCardInfo) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, true, null, 36, null));
        c43316rmw.register(C51505voL.class, new C51508voO(new Function0() { // from class: o.vqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51632vqg.DbNXlk(this.OLrzqt);
            }
        }));
        this.KWHzl = c43316rmw;
        gGvvIC().EZpvd.setAdapter(this.KWHzl);
        gGvvIC().EZpvd.setItemViewCacheSize(10);
        RecyclerView recyclerView = gGvvIC().EZpvd;
        int color = ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        recyclerView.addItemDecoration(new C31703mAu(color, C55298xhM.copydefault(0.5f, contextRequireContext), ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE), 0));
        C33546myW c33546myW = gGvvIC().AhwBna;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.vqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51632vqg.OLrzqt(this.KWHzl, interfaceC57934yrl);
            }
        });
        gGvvIC().AEQbTJ.AEQbTJ().setTxtNoMore("");
        KWHzl();
        valueOf();
        AYXKKw();
    }

    public static final Unit OLrzqt(C51632vqg c51632vqg, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData.getEmptyType() == 8) {
            HomeStrategyListPresenter.fetchBotList$default(c51632vqg.dxcTrN(), c51632vqg.AEQbTJ().copydefault().getValue(), c51632vqg.OLrzqt, c51632vqg.AYXKKw, true, null, 16, null);
        } else {
            androidx.fragment.app.Fragment parentFragment = c51632vqg.getParentFragment();
            C51554vpH c51554vpH = parentFragment instanceof C51554vpH ? (C51554vpH) parentFragment : null;
            if (c51554vpH != null) {
                c51554vpH.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C51632vqg c51632vqg, final HomeStrategyCardInfo homeStrategyCardInfo, final int i) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        if (homeStrategyCardInfo.isEnable()) {
            return Unit.INSTANCE;
        }
        FragmentActivity fragmentActivityRequireActivity = c51632vqg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OKvQBs));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.OHsvZP), new View.OnClickListener() { // from class: o.vqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51632vqg.OLrzqt(this.KWHzl, homeStrategyCardInfo, i, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getConnectivityMgr), new View.OnClickListener() { // from class: o.vqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51632vqg.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C51632vqg c51632vqg, HomeStrategyCardInfo homeStrategyCardInfo, int i, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        HomeStrategyListPresenter homeStrategyListPresenterDxcTrN = c51632vqg.dxcTrN();
        java.lang.String algoId = homeStrategyCardInfo.getAlgoId();
        if (algoId == null) {
            algoId = "";
        }
        homeStrategyListPresenterDxcTrN.OLrzqt(algoId, i);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(C51632vqg c51632vqg, HomeStrategyCardInfo homeStrategyCardInfo, int i) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        android.content.Context context = c51632vqg.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.AEQbTJ));
            java.lang.String string = c51632vqg.getString(C55688xof.Application.onCreate);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vqt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51632vqg.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit DbNXlk(C51632vqg c51632vqg) {
        c51632vqg.dxcTrN().AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vqg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C51632vqg EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51632vqg c51632vqg) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c51632vqg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C51519voZ.TaskDescription taskDescription = C51519voZ.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                taskDescription.OLrzqt(childFragmentManager, this.EZpvd.OLrzqt, this.EZpvd.AYXKKw);
                C32866mlf.onEvent$default("TradingBot_BotMarketplace_Button_Click", (TrackChannel[]) null, ActionBar.KWHzl, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vqg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51632vqg EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51632vqg c51632vqg) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c51632vqg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C51632vqg.djBIcL(this.EZpvd).gEmmrt.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listGEmmrt = C51632vqg.AhwBna(this.EZpvd).gEmmrt();
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listGEmmrt, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.EZpvd.new PendingIntent(), this.EZpvd.new LoaderManager(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, Fragment.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vqg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51632vqg AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51632vqg c51632vqg) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c51632vqg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt();
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity != null) {
                    ActivityC51791vtg.StateListAnimator stateListAnimator = ActivityC51791vtg.Companion;
                    HomeStrategySortConfig value = this.AEQbTJ.AEQbTJ().copydefault().getValue();
                    java.lang.String mode = value != null ? value.getMode() : null;
                    HomeStrategySortConfig value2 = this.AEQbTJ.AEQbTJ().copydefault().getValue();
                    stateListAnimator.copydefault(activity, mode, value2 != null ? value2.getDirection() : null);
                }
            }
        }
    }

    public static final void OLrzqt(C51632vqg c51632vqg, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        HomeStrategyListPresenter.loadMoreBotList$default(c51632vqg.dxcTrN(), null, 1, null);
    }

    public final void KWHzl() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("refresh_fav_bot");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, viewLifecycleOwner);
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeStrategyListFragment$initRxBusListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw, (Object) "FAVORITE")) {
                    HomeStrategyListPresenter.fetchBotList$default(C51632vqg.AhwBna(this.this$0), this.this$0.AEQbTJ().copydefault().getValue(), this.this$0.OLrzqt, this.this$0.AYXKKw, true, null, 16, null);
                }
            }
        });
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeStrategyListFragment$onVisible$1(this, null), 3, null);
    }

    private final void AYXKKw() {
        android.widget.ImageView imageView = gGvvIC().copydefault;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        AppCompatTextView appCompatTextView = gGvvIC().gEmmrt;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, this));
        android.widget.ImageView imageView2 = gGvvIC().djBIcL;
        imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, this));
        getChildFragmentManager().setFragmentResultListener("botFilterInfo", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51632vqg.OLrzqt(this.copydefault, str, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: o.vqg$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar KWHzl = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "filters", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.vqg$LoaderManager */
    public static final class LoaderManager implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            OLrzqt(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            HomeStrategySortConfig homeStrategySortConfig = objOLrzqt instanceof HomeStrategySortConfig ? (HomeStrategySortConfig) objOLrzqt : null;
            if (homeStrategySortConfig != null) {
                C51632vqg.this.AEQbTJ().copydefault(homeStrategySortConfig);
                C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectRanking_Click", (TrackChannel[]) null, new Application(homeStrategySortConfig), 1, (java.lang.Object) null);
            }
        }

        /* JADX INFO: renamed from: o.vqg$LoaderManager$Application */
        public static final class Application implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ HomeStrategySortConfig copydefault;

            /* JADX INFO: renamed from: o.vqg$LoaderManager$Application$Activity */
            public final /* synthetic */ class Activity {
                public static final /* synthetic */ int[] copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[HomeStrategySortConfig.values().length];
                    try {
                        iArr[HomeStrategySortConfig.SMART_SORTING.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.PNL_RATIO.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.MAX_DRAW_DOWN.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.NUM_OF_COPIES.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.Highest_PnL.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    copydefault = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(HomeStrategySortConfig homeStrategySortConfig) {
                this.copydefault = homeStrategySortConfig;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                KWHzl(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void KWHzl(EventParamsList eventParamsList) {
                java.lang.String str;
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                int i = Activity.copydefault[this.copydefault.ordinal()];
                if (i == 1) {
                    str = "overview";
                } else if (i == 2) {
                    str = "pnl";
                } else if (i == 3) {
                    str = "max_drawdown";
                } else if (i == 4) {
                    str = "used_times";
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "pnl_amount";
                }
                EventParamsList.put$default(eventParamsList, "menu_name", str, false, 4, null);
                EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vqg$PendingIntent */
    public static final class PendingIntent implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C51632vqg.djBIcL(C51632vqg.this).gEmmrt.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vqg$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment EZpvd = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "dropdown", false, 4, null);
            EventParamsList.put$default(eventParamsList, "type", "bot_marketplace", false, 4, null);
        }
    }

    public static final void OLrzqt(C51632vqg c51632vqg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("botFilterInfo");
        c51632vqg.dxcTrN().OLrzqt(parcelable instanceof HomeStrategyDropDownInfo ? (HomeStrategyDropDownInfo) parcelable : null);
    }

    private final void valueOf() {
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        });
        TradeLiveData<HomeStrategySortConfig> tradeLiveDataCopydefault = AEQbTJ().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.vql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.copydefault(this.copydefault, (HomeStrategySortConfig) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataFetchVPNInfo = dxcTrN().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner3, new Dialog(new Function1() { // from class: o.vqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<HomeStrategyCardResult> tradeLiveDataDjBIcL = dxcTrN().djBIcL();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner4, new Dialog(new Function1() { // from class: o.vqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.KWHzl(this.copydefault, (HomeStrategyCardResult) obj);
            }
        }));
        TradeLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> tradeLiveDataAkhnZx = dxcTrN().AkhnZx();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner5, new Dialog(new Function1() { // from class: o.vqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataValues = dxcTrN().values();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataValues.observe(viewLifecycleOwner6, new Dialog(new Function1() { // from class: o.vqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.vqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.copydefault(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.vqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51632vqg c51632vqg, java.lang.String str) {
        if (c51632vqg.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            HomeStrategyListPresenter.fetchBotList$default(c51632vqg.dxcTrN(), c51632vqg.AEQbTJ().copydefault().getValue(), c51632vqg.OLrzqt, c51632vqg.AYXKKw, true, null, 16, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51632vqg c51632vqg, HomeStrategySortConfig homeStrategySortConfig) {
        Intrinsics.checkNotNullParameter(homeStrategySortConfig, "");
        c51632vqg.gGvvIC().gEmmrt.setText(C33070mpX.AYXKKw(homeStrategySortConfig.getTitle()));
        c51632vqg.gGvvIC().gEmmrt.setSelected(false);
        if (c51632vqg.isResumed()) {
            HomeStrategyListPresenter.fetchBotList$default(c51632vqg.dxcTrN(), homeStrategySortConfig, c51632vqg.OLrzqt, c51632vqg.AYXKKw, false, null, 24, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51632vqg c51632vqg, boolean z) {
        android.widget.ImageView imageView = c51632vqg.gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51632vqg c51632vqg, HomeStrategyCardResult homeStrategyCardResult) {
        Intrinsics.checkNotNullParameter(homeStrategyCardResult, "");
        C33546myW c33546myW = c51632vqg.gGvvIC().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        java.util.List<HomeStrategyCardInfo> strategies = homeStrategyCardResult.getStrategies();
        C57589ylK.KWHzl(c33546myW, strategies == null || strategies.isEmpty());
        c51632vqg.EZpvd((java.util.List<? extends java.lang.Object>) c51632vqg.dxcTrN().EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51632vqg c51632vqg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        int iIntValue = ((java.lang.Number) pair.component2()).intValue();
        if (zBooleanValue) {
            c51632vqg.EZpvd((java.util.List<? extends java.lang.Object>) c51632vqg.dxcTrN().OLrzqt(iIntValue));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51632vqg c51632vqg, boolean z) {
        if (z) {
            c51632vqg.EZpvd((java.util.List<? extends java.lang.Object>) c51632vqg.dxcTrN().valueOf());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C51632vqg c51632vqg, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c51632vqg.dxcTrN().isConnected().bB_())) {
            c51632vqg.EZpvd();
        } else {
            java.lang.Exception exc = (java.lang.Exception) pair.second;
            if (exc != null && (message = exc.getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C51632vqg c51632vqg, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c51632vqg.dxcTrN().isConnected().bB_())) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE) && !c51632vqg.dxcTrN().fARcdN()) {
                C55113xdn.showLoading$default(c51632vqg.gGvvIC().valueOf, 0L, 1, null);
            } else {
                c51632vqg.gGvvIC().valueOf.copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.util.List<? extends java.lang.Object> list) {
        java.lang.String strAYXKKw;
        if (Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "FAVORITE")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RcLksq);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String strAYXKKw2 = Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "FAVORITE") ? C33070mpX.AYXKKw(C55688xof.Application.UJpkuA) : "";
        C43316rmw c43316rmw = this.KWHzl;
        if (c43316rmw != null) {
            C49952uyJ.updateDataOrEmpty$default(c43316rmw, list, str, 60, strAYXKKw2, null, false, 48, null);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd() {
        C43316rmw c43316rmw = this.KWHzl;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.putInt), 60, false, null, null, false, 60, null));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void gEmmrt() {
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.vqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51632vqg.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "search", false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", "", false, 4, null);
        return Unit.INSTANCE;
    }
}
