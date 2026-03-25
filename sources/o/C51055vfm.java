package o;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.social_trade_api.data.MarketplaceBannerType;
import com.okinc.social_trade_api.data.NmpBannerDto;
import com.okinc.social_trade_api.data.NmpBannerUserVoucherDto;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.utils.E2EUtils;
import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$addHeaderInfoObserver$1;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$handleSignalCloneFlow$1;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$initAppBarLayout$4;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$initListener$2$1;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$subscribeOnUIChange$6;
import com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$subscribeOnUIChange$7;
import com.okinc.tradingbot.impl.market_place.BotMarketPlacePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.BotMarketPlaceType;
import com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotRouteData;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C51404vmQ;
import o.C51967vwx;
import o.C52812wZg;
import o.C53734wrA;
import o.C55688xof;
import o.C56058xve;
import o.InterfaceC43294rma;
import o.InterfaceC49320umN;
import o.InterfaceC49436uoX;
import o.InterfaceC49496upe;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51055vfm extends AbstractC54505xKx<AbstractC48380uPi, BotMarketPlacePresenter> implements InterfaceC49436uoX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public InterfaceC49321umO AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C52812wZg OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public C47976uAj<C51530vok> fJNWhG;
    public final InterfaceC56387yDm gEmmrt;
    public android.view.View valueOf;
    public TabLayoutMediator values;
    public final int KWHzl = C48033uCm.Activity.run;
    public final C51967vwx djBIcL = new C51967vwx();
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.vfL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51055vfm.AhwBna();
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.vfM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51055vfm.AuCTelauCTel(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.vfI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51055vfm.wlaJM(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.vfN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51055vfm.AubY(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.vfm$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.vfm$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketplaceBannerType.values().length];
            try {
                iArr[MarketplaceBannerType.Voucher.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[BotMarketPlaceType.values().length];
            try {
                iArr2[BotMarketPlaceType.OnGoing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[BotMarketPlaceType.CROnGoing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[BotMarketPlaceType.SignalsTab.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.vfm$TaskDescription */
    public static final class TaskDescription extends AppBarLayout.Behavior.DragCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public static final /* synthetic */ AbstractC48380uPi fARcdN(C51055vfm c51055vfm) {
        return c51055vfm.gGvvIC();
    }

    public static final /* synthetic */ BotMarketPlacePresenter fJNWhG(C51055vfm c51055vfm) {
        return c51055vfm.dxcTrN();
    }

    @Override // o.InterfaceC49436uoX
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2) {
        InterfaceC49436uoX.TaskDescription.AEQbTJ(this, str, str2, str3, str4, z, z2);
    }

    @Override // o.InterfaceC49436uoX
    public androidx.fragment.app.FragmentManager copydefault() {
        return InterfaceC49436uoX.TaskDescription.KWHzl(this);
    }

    public C51055vfm() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketPlaceHomeHeaderPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotOrderListPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$6
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C52004vxh.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$special$$inlined$activityViewModels$default$9
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
    }

    public final MarketPlaceHomeHeaderPresenter AkhnZx() {
        return (MarketPlaceHomeHeaderPresenter) this.copydefault.getValue();
    }

    @Override // o.AbstractC54505xKx
    public java.util.List<AbsPresenter> bu_() {
        return yDY.gEmmrt(AkhnZx(), isConnected());
    }

    public final BotOrderListPresenter isConnected() {
        return (BotOrderListPresenter) this.gEmmrt.getValue();
    }

    public final C52004vxh fetchVPNInfo() {
        return (C52004vxh) this.AhwBna.getValue();
    }

    public final C53734wrA fIwbmz() {
        return (C53734wrA) this.fetchVPNInfo.getValue();
    }

    public static final C53734wrA AhwBna() {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).hlXVux();
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean AuCTelauCTel(C51055vfm c51055vfm) {
        android.os.Bundle arguments = c51055vfm.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IsOnshoreToolbar");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<C51530vok> zsXlph() {
        return (java.util.List) this.isConnected.getValue();
    }

    public static final java.util.List wlaJM(C51055vfm c51055vfm) {
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c51055vfm.dxcTrN().values());
    }

    public final boolean fARcdN() {
        return ((java.lang.Boolean) this.AkhnZx.getValue()).booleanValue();
    }

    public static final boolean AubY(C51055vfm c51055vfm) {
        android.os.Bundle arguments = c51055vfm.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("HideTopBar");
        }
        return false;
    }

    /* JADX INFO: renamed from: o.vfm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vfm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C51055vfm newInstance$default(Application application, boolean z, boolean z2, android.os.Bundle bundle, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return application.KWHzl(z, z2, bundle, z3);
        }

        public final C51055vfm KWHzl(boolean z, boolean z2, android.os.Bundle bundle, boolean z3) {
            C51055vfm c51055vfm = new C51055vfm();
            c51055vfm.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_is_mp_show_title", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("IsOnshoreToolbar", java.lang.Boolean.valueOf(z2)), C56390yDp.OLrzqt(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, bundle), C56390yDp.OLrzqt("HideTopBar", java.lang.Boolean.valueOf(z3))));
            return c51055vfm;
        }
    }

    /* JADX INFO: renamed from: o.vfm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C51055vfm OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51055vfm c51055vfm) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c51055vfm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52689wUs.KWHzl.EZpvd(this.OLrzqt.getActivity());
            }
        }
    }

    /* JADX INFO: renamed from: o.vfm$Fragment */
    public static final class Fragment extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ C51055vfm EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        public Fragment(android.view.View view, C51055vfm c51055vfm) {
            this.OLrzqt = view;
            this.EZpvd = c51055vfm;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            C51055vfm.fARcdN(this.EZpvd).KWHzl.setExpanded(true);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.OLrzqt.performClick();
            return true;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        dxcTrN().OLrzqt(this);
        dxcTrN().AEQbTJ(getOkQPL());
        BotMarketPlacePresenter botMarketPlacePresenterDxcTrN = dxcTrN();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        botMarketPlacePresenterDxcTrN.KWHzl(contextRequireContext);
        dxcTrN().OLrzqt(view);
        wlaJM();
        gGvvIC().AkhnZx.AhwBna(false);
        getNewProxyInstance();
        AuCTel();
        AubY();
        zuBGHE();
        getFieldNames();
        djBIcL();
        C55867xrz.KWHzl.KWHzl();
        AYXKKw();
        if (fARcdN()) {
            gGvvIC().fetchVPNInfo.KWHzl();
        } else {
            C52688wUr.copydefault.KWHzl(view);
        }
    }

    /* JADX INFO: renamed from: o.vfm$Dialog */
    public static final class Dialog implements View.OnTouchListener {
        public final /* synthetic */ GestureDetectorCompat AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(GestureDetectorCompat gestureDetectorCompat) {
            this.AEQbTJ = gestureDetectorCompat;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            this.AEQbTJ.onTouchEvent(motionEvent);
            return true;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uLS.AEQbTJ.copydefault(this);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().KWHzl();
        if (this.AEQbTJ == null) {
            C56058xve.Activity activityEZpvd = C56058xve.Companion.copydefault().EZpvd();
            this.AEQbTJ = activityEZpvd != null ? activityEZpvd.copydefault() : null;
        }
        isConnected().EZpvd();
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        C32866mlf.onEvent$default("TradingBot_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        dxcTrN().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
        dxcTrN().OLrzqt();
    }

    @Override // o.InterfaceC49436uoX
    public android.view.View AEQbTJ() {
        return fZBcTu();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AuCTel() {
        boolean z;
        android.os.Bundle arguments;
        gGvvIC().KWHzl.post(new java.lang.Runnable() { // from class: o.vfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51055vfm.uzCIH(this.copydefault);
            }
        });
        if (fJNWhG() || (arguments = getArguments()) == null) {
            z = false;
        } else {
            z = true;
            if (!arguments.getBoolean("bot_is_mp_show_title")) {
            }
        }
        C51623vqX c51623vqX = gGvvIC().fetchVPNInfo;
        Intrinsics.copydefault(c51623vqX);
        c51623vqX.setVisibility((!z || (C51404vmQ.Companion.EZpvd() && fARcdN())) ? 8 : 0);
        c51623vqX.setTitle(C33070mpX.AYXKKw(C55688xof.Application.NavigationRes));
        c51623vqX.OLrzqt(false);
        c51623vqX.OLrzqt();
        android.widget.FrameLayout frameLayout = gGvvIC().isConnected;
        Intrinsics.copydefault(frameLayout);
        frameLayout.setVisibility(fJNWhG() ? 0 : 8);
        gGvvIC().DbNXlk.setTitle(C33070mpX.AYXKKw(C55688xof.Application.NavigationRes));
        AppCompatImageView appCompatImageView = gGvvIC().AhwBna;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BotMarketPlaceFragment$initAppBarLayout$4(this, z, null), 3, null);
    }

    public static final void uzCIH(C51055vfm c51055vfm) {
        ViewGroup.LayoutParams layoutParams = c51055vfm.gGvvIC().KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        Intrinsics.copydefault(behavior, "");
        ((AppBarLayout.Behavior) behavior).setDragCallback(new TaskDescription());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: o.umO */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wlaJM() {
        if (C48291uMa.Companion.AEQbTJ().AEQbTJ()) {
            return;
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC49321umO interfaceC49321umOAEQbTJ = interfaceC49317umK.AEQbTJ(contextRequireContext, new Function2() { // from class: o.vfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51055vfm.copydefault((InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51055vfm.OLrzqt(this.EZpvd, (InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51055vfm.KWHzl(this.KWHzl, (InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 20.0f, 16.0f, true);
        if (interfaceC49321umOAEQbTJ != 0) {
            android.view.View view = interfaceC49321umOAEQbTJ instanceof android.view.View ? (android.view.View) interfaceC49321umOAEQbTJ : null;
            if (view == null) {
                return;
            }
            this.AYXKKw = interfaceC49321umOAEQbTJ;
            gGvvIC().valueOf.addView(view);
        }
    }

    public static final Unit copydefault(InterfaceC49320umN interfaceC49320umN, int i) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(i));
        java.lang.String strEZpvd = interfaceC49320umN != null ? interfaceC49320umN.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        c55867xrz.AYXKKw(strGEmmrt, strEZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51055vfm c51055vfm, InterfaceC49320umN interfaceC49320umN, int i) {
        Intrinsics.checkNotNullParameter(interfaceC49320umN, "");
        c51055vfm.KWHzl(interfaceC49320umN);
        C55867xrz.KWHzl.OLrzqt(i, interfaceC49320umN.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51055vfm c51055vfm, InterfaceC49320umN interfaceC49320umN, int i) {
        Intrinsics.checkNotNullParameter(interfaceC49320umN, "");
        c51055vfm.AEQbTJ(interfaceC49320umN);
        C55867xrz.KWHzl.OLrzqt(i, interfaceC49320umN.EZpvd());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InterfaceC49320umN interfaceC49320umN) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, interfaceC49320umN.KWHzl(), null, new Function1() { // from class: o.vfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC49320umN interfaceC49320umN) {
        if (StateListAnimator.KWHzl[interfaceC49320umN.AEQbTJ().ordinal()] == 1) {
            final InterfaceC49320umN.StateListAnimator stateListAnimator = interfaceC49320umN instanceof InterfaceC49320umN.StateListAnimator ? (InterfaceC49320umN.StateListAnimator) interfaceC49320umN : null;
            if (stateListAnimator == null) {
                return;
            }
            if (stateListAnimator.AYXKKw()) {
                C52659wTp.copydefault.EZpvd(getContext());
                return;
            }
            if (stateListAnimator.copydefault()) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, stateListAnimator.KWHzl(), null, new Function1() { // from class: o.vfx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C51055vfm.copydefault((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                    return;
                }
                return;
            }
            final FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C51010veu.OLrzqt.OLrzqt(activity2, new Function0() { // from class: o.vfv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C51055vfm.KWHzl(this.EZpvd, stateListAnimator, activity2);
                    }
                });
            }
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51055vfm c51055vfm, final InterfaceC49320umN.StateListAnimator stateListAnimator, final FragmentActivity fragmentActivity) {
        c51055vfm.AkhnZx().OLrzqt(stateListAnimator.OLrzqt(), new Function1() { // from class: o.vfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.EZpvd(fragmentActivity, stateListAnimator, (ResponseData) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, InterfaceC49320umN.StateListAnimator stateListAnimator, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.VisibleForTestingCompanion), 0, 1, (java.lang.Object) null);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), fragmentActivity, stateListAnimator.KWHzl(), null, new Function1() { // from class: o.vfA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51055vfm.gEmmrt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            C55326xho.copydefault(responseData.getMsg(), 1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        android.os.Bundle bundle;
        C55254xgV c55254xgV = gGvvIC().values;
        c55254xgV.setStyle(5);
        c55254xgV.OLrzqt(gEmmrt());
        gGvvIC().values.AEQbTJ(new LoaderManager());
        AuCTelauCTel();
        android.os.Bundle arguments = getArguments();
        if (Intrinsics.EZpvd((java.lang.Object) ((arguments == null || (bundle = arguments.getBundle(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR)) == null) ? null : bundle.getString("tab")), (java.lang.Object) "ongoing")) {
            gGvvIC().AuCTel.post(new java.lang.Runnable() { // from class: o.vfo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51055vfm.iwGUEr(this.EZpvd);
                }
            });
            return;
        }
        android.view.View childAt = gGvvIC().AuCTel.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: o.vfm$LoaderManager */
    public static final class LoaderManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if ((tab != null ? tab.getTag() : null) == BotMarketPlaceType.OnGoing) {
                C55867xrz.KWHzl.OLrzqt("ongoing");
            }
        }
    }

    public static final void iwGUEr(C51055vfm c51055vfm) {
        if (c51055vfm.zsXlph().size() > 1) {
            c51055vfm.gGvvIC().AuCTel.setCurrentItem(1, true);
        }
        android.view.View childAt = c51055vfm.gGvvIC().AuCTel.getChildAt(1);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    private final void AubY() {
        C51623vqX c51623vqX = gGvvIC().fetchVPNInfo;
        c51623vqX.setOnTouchListener(new Dialog(new GestureDetectorCompat(c51623vqX.getContext(), new Fragment(c51623vqX, this))));
        gGvvIC().AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.vfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51055vfm.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C51055vfm c51055vfm, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c51055vfm), null, null, new BotMarketPlaceFragment$initListener$2$1(c51055vfm, null), 3, null);
    }

    private final void zuBGHE() {
        C56111xwe<android.os.Bundle> c56111xweValueOf = finit().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweValueOf.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.copydefault(this.AEQbTJ, (android.os.Bundle) obj);
            }
        }));
        C56111xwe<BotRouteData> c56111xweDbNXlk = dxcTrN().DbNXlk();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweDbNXlk.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.KWHzl(this.EZpvd, (BotRouteData) obj);
            }
        }));
        C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> c56126xwtIsConnected = dxcTrN().AkhnZx().isConnected();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56126xwtIsConnected.AEQbTJ(viewLifecycleOwner3, new Function1() { // from class: o.vfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        });
        C56111xwe<java.lang.String> c56111xweValues = dxcTrN().AkhnZx().values();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweValues.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.vfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = isConnected().copydefault();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.vfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51055vfm.KWHzl(this.KWHzl, (OrderPositionData) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), null, null, new BotMarketPlaceFragment$subscribeOnUIChange$6(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner7), null, null, new BotMarketPlaceFragment$subscribeOnUIChange$7(this, null), 3, null);
    }

    public static final Unit copydefault(final C51055vfm c51055vfm, android.os.Bundle bundle) {
        if (Intrinsics.EZpvd((java.lang.Object) (bundle != null ? bundle.getString("tab") : null), (java.lang.Object) "ongoing")) {
            C47976uAj<C51530vok> c47976uAj = c51055vfm.fJNWhG;
            if (c47976uAj != null) {
                c47976uAj.OLrzqt(bundle);
            }
            c51055vfm.gGvvIC().AuCTel.post(new java.lang.Runnable() { // from class: o.vfK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51055vfm.zsXlph(this.AEQbTJ);
                }
            });
        }
        c51055vfm.EZpvd(bundle);
        return Unit.INSTANCE;
    }

    public static final void zsXlph(C51055vfm c51055vfm) {
        if (c51055vfm.zsXlph().size() > 1) {
            c51055vfm.gGvvIC().AuCTel.setCurrentItem(1, true);
        }
        android.view.View childAt = c51055vfm.gGvvIC().AuCTel.getChildAt(1);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    public static final Unit KWHzl(C51055vfm c51055vfm, BotRouteData botRouteData) {
        if (botRouteData == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) botRouteData.getPath(), (java.lang.Object) "trade_bot/order/page") && botRouteData.getBundle().getLong("algoId") != 0) {
            return Unit.INSTANCE;
        }
        android.content.Context context = c51055vfm.getContext();
        if (context != null) {
            C51001vel.copydefault.copydefault(context, botRouteData.getPath(), botRouteData.getBundle());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter.fetchHeaderInfo$default(com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter, boolean, boolean, int, java.lang.Object):void */
    public static final Unit OLrzqt(C51055vfm c51055vfm, kotlin.Pair pair) {
        java.lang.String strAYXKKw;
        android.os.Bundle bundle;
        Intrinsics.checkNotNullParameter(pair, "");
        c51055vfm.dxcTrN().AYXKKw();
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        java.util.List<MpCategory> listAEQbTJ = interfaceC55881xsMCopydefault != null ? interfaceC55881xsMCopydefault.AEQbTJ() : null;
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && C33129mqd.KWHzl((java.util.Collection) listAEQbTJ)) {
            android.widget.LinearLayout linearLayout = c51055vfm.gGvvIC().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            MarketPlaceHomeHeaderPresenter.fetchHeaderInfo$default(c51055vfm.AkhnZx(), true, false, 2, null);
            c51055vfm.AkhnZx().OLrzqt().setValue(listAEQbTJ);
            c51055vfm.isConnected().AkhnZx();
            c51055vfm.dxcTrN().AEQbTJ();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51055vfm, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            android.widget.LinearLayout linearLayout2 = c51055vfm.gGvvIC().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            BotMarketPlacePresenter botMarketPlacePresenterDxcTrN = c51055vfm.dxcTrN();
            ParamBuilder paramBuilder = (ParamBuilder) pair.getSecond();
            if (paramBuilder == null || (bundle = paramBuilder.getBundle()) == null || (strAYXKKw = bundle.getString("errorMgs")) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            botMarketPlacePresenterDxcTrN.OLrzqt(strAYXKKw);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51055vfm, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [484=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit copydefault(C51055vfm c51055vfm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd(c51055vfm.getTAG(), "initLoadingType change to " + str);
        switch (str.hashCode()) {
            case -1931790399:
                if (str.equals("PULL_END")) {
                    c51055vfm.finit().DbNXlk().KWHzl("PULL_END");
                    c51055vfm.gGvvIC().AkhnZx.AEQbTJ();
                }
                break;
            case -1515828795:
                if (str.equals("DISMISS_INIT")) {
                    c51055vfm.dxcTrN().valueOf();
                    android.os.Bundle value = c51055vfm.finit().valueOf().getValue();
                    if (value == null) {
                        android.os.Bundle arguments = c51055vfm.getArguments();
                        value = arguments != null ? arguments.getBundle(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR) : null;
                    }
                    if (!c51055vfm.EZpvd(value)) {
                        c51055vfm.djBIcL.EZpvd("NewUserGuide");
                    } else {
                        c51055vfm.finit().valueOf().setValue(null);
                        android.os.Bundle arguments2 = c51055vfm.getArguments();
                        if (arguments2 != null) {
                            arguments2.remove(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                        }
                    }
                }
                break;
            case -1011593784:
                if (str.equals("PULL_START")) {
                    c51055vfm.finit().DbNXlk().KWHzl("PULL_START");
                }
                break;
            case 912496914:
                if (str.equals("SHOW_INIT")) {
                    c51055vfm.dxcTrN().fIwbmz();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51055vfm c51055vfm, OrderPositionData orderPositionData) {
        java.lang.CharSequence text;
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        int totalAmt = orderPositionData.getBotAmtData().getTotalAmt();
        c51055vfm.finit().getFieldNames().postValue(java.lang.Integer.valueOf(totalAmt));
        c51055vfm.isConnected().OLrzqt(orderPositionData);
        TabLayout tabLayoutCopydefault = c51055vfm.gGvvIC().values.copydefault();
        for (int tabCount = tabLayoutCopydefault.getTabCount(); -1 < tabCount; tabCount--) {
            TabLayout.Tab tabAt = tabLayoutCopydefault.getTabAt(tabCount);
            if (tabAt != null) {
                java.lang.Object tag = tabAt.getTag();
                BotMarketPlaceType botMarketPlaceType = BotMarketPlaceType.OnGoing;
                if (tag == botMarketPlaceType) {
                    text = C33069mpW.copydefault(botMarketPlaceType.getTitle(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(totalAmt)))));
                } else {
                    BotMarketPlaceType botMarketPlaceType2 = BotMarketPlaceType.CROnGoing;
                    if (tag == botMarketPlaceType2) {
                        text = C33069mpW.copydefault(botMarketPlaceType2.getTitle(), C56423yEv.EZpvd(C56390yDp.OLrzqt("ongoingBots", C33129mqd.gEmmrt(java.lang.Integer.valueOf(totalAmt)))));
                    } else {
                        text = tabAt.getText();
                    }
                }
                tabAt.setText(text);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AuCTelauCTel() {
        TabLayoutMediator tabLayoutMediator = this.values;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        java.util.List<C51530vok> listZsXlph = zsXlph();
        android.os.Bundle arguments = getArguments();
        this.fJNWhG = new C47976uAj<>(this, listZsXlph, arguments != null ? arguments.getBundle(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR) : null);
        gGvvIC().AuCTel.setAdapter(this.fJNWhG);
        TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(gGvvIC().values.copydefault(), gGvvIC().AuCTel, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51055vfm.EZpvd(this.EZpvd, tab, i);
            }
        });
        tabLayoutMediator2.attach();
        this.values = tabLayoutMediator2;
    }

    public static final void EZpvd(C51055vfm c51055vfm, TabLayout.Tab tab, int i) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setTag(c51055vfm.zsXlph().get(i).copydefault());
        int i2 = StateListAnimator.OLrzqt[c51055vfm.zsXlph().get(i).copydefault().ordinal()];
        if (i2 == 1) {
            strCopydefault = C33069mpW.copydefault(BotMarketPlaceType.OnGoing.getTitle(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "0")));
        } else if (i2 == 2) {
            strCopydefault = C33069mpW.copydefault(BotMarketPlaceType.CROnGoing.getTitle(), C56423yEv.EZpvd(C56390yDp.OLrzqt("ongoingBots", "0")));
        } else if (i2 == 3) {
            BacktestListPreviewDto value = c51055vfm.isConnected().OLrzqt().getValue();
            strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.ODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Integer.valueOf(value != null ? value.AEQbTJ() : 0), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null))));
        } else {
            strCopydefault = C33070mpX.AYXKKw(c51055vfm.zsXlph().get(i).copydefault().getTitle());
        }
        tab.setText(strCopydefault);
    }

    public final void copydefault(BacktestListPreviewDto backtestListPreviewDto) {
        java.lang.Object next;
        boolean z = true;
        boolean z2 = backtestListPreviewDto != null && backtestListPreviewDto.AEQbTJ() > 0;
        java.util.List<C51530vok> listZsXlph = zsXlph();
        if ((listZsXlph instanceof java.util.Collection) && listZsXlph.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listZsXlph.iterator();
            while (it.hasNext()) {
                if (((C51530vok) it.next()).copydefault() == BotMarketPlaceType.SignalsTab) {
                    break;
                }
            }
            z = false;
        }
        if (z2 && !z) {
            zsXlph().add(new C51530vok(BotMarketPlaceType.SignalsTab));
            AuCTelauCTel();
            return;
        }
        if (!z2 && z) {
            C56406yEe.AEQbTJ(zsXlph(), new Function1() { // from class: o.vfw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C51055vfm.KWHzl((C51530vok) obj));
                }
            });
            AuCTelauCTel();
            return;
        }
        if (z2 && z) {
            TabLayout tabLayoutCopydefault = gGvvIC().values.copydefault();
            kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, tabLayoutCopydefault.getTabCount());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.Integer> it2 = intRangeAhwBna.iterator();
            while (it2.hasNext()) {
                TabLayout.Tab tabAt = tabLayoutCopydefault.getTabAt(((AbstractC56415yEn) it2).nextInt());
                if (tabAt != null) {
                    arrayList.add(tabAt);
                }
            }
            java.util.Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (((TabLayout.Tab) next).getTag() == BotMarketPlaceType.SignalsTab) {
                        break;
                    }
                }
            }
            TabLayout.Tab tab = (TabLayout.Tab) next;
            if (tab != null) {
                tab.setText(C33069mpW.copydefault(C48033uCm.Fragment.ODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Integer.valueOf(backtestListPreviewDto.AEQbTJ()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)))));
            }
        }
    }

    public static final boolean KWHzl(C51530vok c51530vok) {
        Intrinsics.checkNotNullParameter(c51530vok, "");
        return c51530vok.copydefault() == BotMarketPlaceType.SignalsTab;
    }

    public final void djBIcL() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BotMarketPlaceFragment$addHeaderInfoObserver$1(this, null), 3, null);
    }

    public final boolean EZpvd(android.os.Bundle bundle) {
        C53734wrA.Application applicationKWHzl = fIwbmz().KWHzl(bundle);
        if (applicationKWHzl instanceof C53734wrA.Application.C0989Application) {
            return false;
        }
        if (applicationKWHzl instanceof C53734wrA.Application.Activity) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("DISMISS_INIT", "PULL_END")), dxcTrN().AkhnZx().values().getValue())) {
                OLrzqt(applicationKWHzl, this);
            } else {
                ActionBar actionBar = new ActionBar(applicationKWHzl);
                C56111xwe<java.lang.String> c56111xweValues = dxcTrN().AkhnZx().values();
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                c56111xweValues.observe(viewLifecycleOwner, actionBar);
            }
            return true;
        }
        if (applicationKWHzl instanceof C53734wrA.Application.ActionBar) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new BotMarketPlaceFragment$handleSignalCloneFlow$1(this, applicationKWHzl, null), 3, null);
            return true;
        }
        if (applicationKWHzl instanceof C53734wrA.Application.StateListAnimator) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void OLrzqt(C53734wrA.Application application, C51055vfm c51055vfm) {
        C53734wrA.Application.Activity activity = (C53734wrA.Application.Activity) application;
        SignalCloneBottomSheet signalCloneBottomSheetCopydefault = SignalCloneBottomSheet.Companion.copydefault(activity.copydefault(), activity.OLrzqt());
        androidx.fragment.app.FragmentManager childFragmentManager = c51055vfm.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C49662usl.EZpvd(signalCloneBottomSheetCopydefault, childFragmentManager, "SignalCloneBottomSheet");
    }

    /* JADX INFO: renamed from: o.vfm$ActionBar */
    public static final class ActionBar implements Observer<java.lang.String> {
        public final /* synthetic */ C53734wrA.Application copydefault;

        public ActionBar(C53734wrA.Application application) {
            this.copydefault = application;
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (yDY.gEmmrt("DISMISS_INIT", "PULL_END").contains(str)) {
                C51055vfm.OLrzqt(this.copydefault, C51055vfm.this);
                C51055vfm.fJNWhG(C51055vfm.this).AkhnZx().values().removeObserver(this);
            }
        }
    }

    public final void getFieldNames() {
        if (C48291uMa.Companion.AEQbTJ().copydefault()) {
            this.djBIcL.copydefault(new C51967vwx.StateListAnimator("NewUserGuide", new java.lang.Runnable() { // from class: o.vfs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51055vfm.getNewProxyInstance(this.OLrzqt);
                }
            }, new Function0() { // from class: o.vfr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C51055vfm.OLrzqt());
                }
            }));
        }
    }

    public static final void getNewProxyInstance(C51055vfm c51055vfm) {
        c51055vfm.zLjUOn();
    }

    public static final boolean OLrzqt() {
        return !SPUtils.getBoolean("sp_bot_mp_coach_mark_show", false);
    }

    public static final void sSMYrx(C51055vfm c51055vfm) {
        android.view.View viewFindViewWithTag = c51055vfm.gGvvIC().values.findViewWithTag("tabs_dots_icon");
        if (viewFindViewWithTag != null) {
            C52659wTp c52659wTp = C52659wTp.copydefault;
            FragmentActivity fragmentActivityRequireActivity = c51055vfm.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c52659wTp.OLrzqt(fragmentActivityRequireActivity, viewFindViewWithTag, 1);
        }
        SPUtils.put("sp_bot_mp_claimed_vouchers_tooltip_show", java.lang.Boolean.TRUE);
    }

    public static final boolean KWHzl(boolean z) {
        return !SPUtils.getBoolean("sp_bot_mp_claimed_vouchers_tooltip_show", false) && z;
    }

    public final void iwGUEr() {
        pUU.EZpvd("BotMarketPlacePopup", "onShowNewUserCoachMarkCompleted");
        this.djBIcL.copydefault();
    }

    private final void zLjUOn() {
        android.view.View viewEjfBZ;
        C52812wZg.StateListAnimator stateListAnimator;
        if (this.OLrzqt == null && (viewEjfBZ = ejfBZ()) != null) {
            final C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(viewEjfBZ);
            stateListAnimator2.EZpvd(1);
            stateListAnimator2.copydefault(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
            stateListAnimator2.AEQbTJ(20.0f);
            stateListAnimator2.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OtRJxF));
            stateListAnimator2.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.OqhRBMiKdSzF));
            android.view.View viewFindViewWithTag = gGvvIC().values.findViewWithTag("history_icon");
            if (viewFindViewWithTag != null) {
                stateListAnimator = new C52812wZg.StateListAnimator(viewFindViewWithTag);
                stateListAnimator.EZpvd(1);
                stateListAnimator.KWHzl(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.AEQbTJ(20.0f);
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DDjgSw));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.isInitInProgress));
            } else {
                stateListAnimator = null;
            }
            android.view.View viewValueOf = valueOf();
            if (viewValueOf == null) {
                return;
            }
            final C52812wZg.StateListAnimator stateListAnimator3 = new C52812wZg.StateListAnimator(viewValueOf);
            stateListAnimator3.EZpvd(3);
            stateListAnimator3.AEQbTJ(20.0f);
            stateListAnimator3.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.vqBjd));
            stateListAnimator3.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.zHQtTQ));
            android.view.View viewValues = values();
            if (viewValues == null) {
                return;
            }
            final C52812wZg.StateListAnimator stateListAnimator4 = new C52812wZg.StateListAnimator(viewValues);
            stateListAnimator4.EZpvd(1);
            stateListAnimator4.AEQbTJ(20.0f);
            stateListAnimator4.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OqhRBM));
            stateListAnimator4.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.isScanInProgress));
            final C52812wZg.StateListAnimator stateListAnimator5 = stateListAnimator;
            gGvvIC().getRoot().post(new java.lang.Runnable() { // from class: o.vfu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51055vfm.KWHzl(this.OLrzqt, stateListAnimator2, stateListAnimator5, stateListAnimator3, stateListAnimator4);
                }
            });
        }
    }

    public static final void KWHzl(final C51055vfm c51055vfm, C52812wZg.StateListAnimator stateListAnimator, C52812wZg.StateListAnimator stateListAnimator2, C52812wZg.StateListAnimator stateListAnimator3, C52812wZg.StateListAnimator stateListAnimator4) {
        FragmentActivity activity = c51055vfm.getActivity();
        if (activity != null) {
            C52812wZg c52812wZg = new C52812wZg(activity);
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(stateListAnimator);
            if (stateListAnimator2 != null) {
                listOLrzqt.add(stateListAnimator2);
            }
            listOLrzqt.add(stateListAnimator3);
            listOLrzqt.add(stateListAnimator4);
            c52812wZg.EZpvd(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) C56402yEa.fARcdN(listOLrzqt)));
            c52812wZg.OLrzqt(3);
            c52812wZg.KWHzl(new Function0() { // from class: o.vfG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C51055vfm.zLjUOn(this.OLrzqt);
                }
            });
            if (c51055vfm.isResumed()) {
                E2EUtils.OLrzqt.AEQbTJ(c52812wZg, E2EUtils.FeatureFlag.BotCommon);
            }
            c51055vfm.OLrzqt = c52812wZg;
        }
    }

    public static final Unit zLjUOn(C51055vfm c51055vfm) {
        c51055vfm.hDKMBd();
        SPUtils.put("sp_bot_mp_coach_mark_show", java.lang.Boolean.TRUE);
        c51055vfm.iwGUEr();
        return Unit.INSTANCE;
    }

    public final android.view.View ejfBZ() {
        TabLayout.TabView tabView;
        TabLayout.TabView tabView2;
        TabLayout tabLayoutCopydefault = gGvvIC().values.copydefault();
        int tabCount = tabLayoutCopydefault.getTabCount();
        if (tabCount == 0) {
            return null;
        }
        TabLayout.Tab tabAt = tabLayoutCopydefault.getTabAt(0);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (tabAt != null && (tabView2 = tabAt.view) != null) {
            tabView2.getGlobalVisibleRect(rect);
        }
        float f = rect.left;
        TabLayout.Tab tabAt2 = tabLayoutCopydefault.getTabAt(tabCount - 1);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        if (tabAt2 != null && (tabView = tabAt2.view) != null) {
            tabView.getGlobalVisibleRect(rect2);
        }
        float f2 = rect2.right;
        android.view.View view = gGvvIC().OLrzqt;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (f2 - f);
        layoutParams.height = tabLayoutCopydefault.getMeasuredHeight();
        view.setLayoutParams(layoutParams);
        return view;
    }

    public final android.view.View valueOf() {
        hDKMBd();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        android.view.View view = new android.view.View(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C55298xhM.dpInt$default(80, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(80, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams.gravity = 81;
        view.setLayoutParams(layoutParams);
        view.setTag("anchor_tag_bottom_tab");
        ((android.view.ViewGroup) activity.findViewById(android.R.id.content)).addView(view);
        return view;
    }

    public final void hDKMBd() {
        android.view.ViewGroup viewGroup;
        android.view.View viewFindViewWithTag;
        FragmentActivity activity = getActivity();
        if (activity == null || (viewFindViewWithTag = (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)).findViewWithTag("anchor_tag_bottom_tab")) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }

    public final android.view.View values() {
        if (gGvvIC().AuCTel.getCurrentItem() != 0) {
            return null;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        C47976uAj<C51530vok> c47976uAj = this.fJNWhG;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("f" + (c47976uAj != null ? java.lang.Long.valueOf(c47976uAj.getItemId(0)) : null));
        if (fragmentFindFragmentByTag instanceof C51579vpg) {
            return ((C51579vpg) fragmentFindFragmentByTag).djBIcL();
        }
        return null;
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C52812wZg c52812wZg = this.OLrzqt;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
        getParentFragmentManager().clearFragmentResultListener("SWITCH_TRADE_REFRESH");
        this.valueOf = null;
    }

    public final void AYXKKw() {
        FragmentActivity activity;
        java.lang.Object objM7377constructorimpl;
        android.view.View view;
        if (isAdded() && this.valueOf == null && (activity = getActivity()) != null) {
            android.view.View viewCopydefault = ((InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class)).copydefault(activity);
            viewCopydefault.setTag("onshore_disclaimer_tag");
            this.valueOf = viewCopydefault;
            try {
                Result.Application application = Result.Companion;
                android.widget.LinearLayout linearLayout = gGvvIC().gEmmrt;
                if (fJNWhG()) {
                    view = gGvvIC().isConnected;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                } else {
                    view = gGvvIC().fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                }
                int iIndexOfChild = linearLayout.indexOfChild(view);
                android.view.View viewFindViewWithTag = linearLayout.findViewWithTag("onshore_disclaimer_tag");
                if (viewFindViewWithTag != null) {
                    linearLayout.removeView(viewFindViewWithTag);
                }
                linearLayout.addView(viewCopydefault, iIndexOfChild + 1);
                objM7377constructorimpl = Result.m7377constructorimpl(linearLayout);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(getTAG(), "Failed to add onshore disclaimer view: " + thM7380exceptionOrNullimpl.getMessage());
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    public final android.widget.LinearLayout gEmmrt() {
        android.os.Bundle arguments;
        return new C51404vmQ(this, new C51404vmQ.Application(true, (fJNWhG() || (arguments = getArguments()) == null || !arguments.getBoolean("bot_is_mp_show_title")) ? false : true, new Function0() { // from class: o.vfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51055vfm.hDKMBd(this.OLrzqt);
            }
        }, new Function0() { // from class: o.vfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51055vfm.getFieldNames(this.OLrzqt);
            }
        })).KWHzl();
    }

    public static final Unit hDKMBd(C51055vfm c51055vfm) {
        if (!C55697xoo.OLrzqt.isConnected()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                android.content.Context contextRequireContext = c51055vfm.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
            }
        } else {
            c51055vfm.gGvvIC().fIwbmz.copydefault(true);
        }
        C55867xrz.KWHzl.OLrzqt("my_bot");
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(C51055vfm c51055vfm) {
        InterfaceC49496upe.Application.provideMoreToolsBottomFragment$default(C53685wqE.copydefault.copydefault(), null, "botHome", 1, null).show(c51055vfm.getChildFragmentManager(), "MoreToolsBottomFragment");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<NmpBannerDto> list) {
        final boolean z;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (NmpBannerDto nmpBannerDto : list) {
                if (nmpBannerDto.getBannerType() == MarketplaceBannerType.Voucher) {
                    NmpBannerUserVoucherDto userVoucher = nmpBannerDto.getUserVoucher();
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (userVoucher != null ? userVoucher.getExpireTime() : null))) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        this.djBIcL.copydefault(new C51967vwx.StateListAnimator("VoucherTips", new java.lang.Runnable() { // from class: o.vfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51055vfm.sSMYrx(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.vfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C51055vfm.KWHzl(z));
            }
        }));
    }
}
