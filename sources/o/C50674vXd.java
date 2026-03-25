package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$registerEvent$1;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.ArbitrageCostVo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.MultiMinAmountItem;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderPresenter;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC50583vTu;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C52812wZg;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.vYW;
import o.vZA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50674vXd extends AbstractC48165uHj<AbstractC48428uRa, SignalBotOrderPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final int AEQbTJ = C48033uCm.Activity.tIwhY;
    public final ActivityResultLauncher<android.content.Intent> AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault;
    public C52812wZg djBIcL;
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;
    public final C43316rmw valueOf;
    public C50016uzU values;

    /* JADX INFO: renamed from: o.vXd$PendingIntent */
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

    public static final void EZpvd(android.view.View view, int i, int i2, int i3, int i4) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SignalBotOrderPresenter AYXKKw(C50674vXd c50674vXd) {
        return (SignalBotOrderPresenter) c50674vXd.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48428uRa djBIcL(C50674vXd c50674vXd) {
        return (AbstractC48428uRa) c50674vXd.gGvvIC();
    }

    /* JADX INFO: renamed from: o.vXd$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vXd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C50674vXd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignalBotCreateFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = new C43316rmw();
        this.copydefault = new Function2() { // from class: o.vXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50674vXd.EZpvd(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50674vXd.AYXKKw(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50674vXd.KWHzl(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vXn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50674vXd.copydefault(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult3;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vXl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.values(this.KWHzl);
            }
        });
    }

    public final C55915xsu valueOf() {
        return (C55915xsu) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50674vXd c50674vXd, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, ((AbstractC48428uRa) c50674vXd.gGvvIC()).valueOf)) {
            c50674vXd.zLjUOn();
            c50674vXd.OcIXYQ();
            c50674vXd.DTwDnp();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AYXKKw(C50674vXd c50674vXd, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            Intrinsics.copydefault(activityResult);
            SignalBotReq signalBotReqCopydefault = c50674vXd.copydefault(activityResult);
            if (signalBotReqCopydefault != null) {
                ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).KWHzl(signalBotReqCopydefault);
            }
            c50674vXd.getFieldNames();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C50674vXd c50674vXd, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            Intrinsics.copydefault(activityResult);
            SignalBotReq signalBotReqCopydefault = c50674vXd.copydefault(activityResult);
            if (signalBotReqCopydefault != null) {
                ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).OLrzqt(signalBotReqCopydefault);
            }
            c50674vXd.getFieldNames();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C50674vXd c50674vXd, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            Intrinsics.copydefault(activityResult);
            SignalBotReq signalBotReqCopydefault = c50674vXd.copydefault(activityResult);
            if (signalBotReqCopydefault != null) {
                ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).copydefault(signalBotReqCopydefault);
            }
            c50674vXd.getFieldNames();
        }
    }

    private final C53518wmx AubY() {
        return (C53518wmx) this.KWHzl.getValue();
    }

    public static final C53518wmx values(C50674vXd c50674vXd) {
        android.content.Context contextRequireContext = c50674vXd.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return AubY();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SignalBotCreateFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.copydefault(view);
        isConnected();
        fIwbmz();
        AEQbTJ();
        QUSxYX();
        RJOkX();
        iwGUEr();
        C55867xrz.KWHzl.OLrzqt("signal_bot", ((SignalBotOrderPresenter) dxcTrN()).fvQaOB().gEmmrt());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getSignalChanId())) {
            ((SignalBotOrderPresenter) dxcTrN()).ORxRYg();
        }
        AubY().OLrzqt();
        QVAiDq();
    }

    /* JADX INFO: renamed from: o.vXd$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50674vXd AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50674vXd c50674vXd) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c50674vXd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                vYW.ActionBar actionBar = vYW.Companion;
                java.lang.String lever = C50674vXd.AYXKKw(this.AEQbTJ).fJNWhG().getLever();
                StrategyConfigInfo value = C50674vXd.AYXKKw(this.AEQbTJ).OLrzqt().getValue();
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = C50674vXd.AYXKKw(this.AEQbTJ).OLrzqt().getValue();
                java.lang.String minLever = value2 != null ? value2.getMinLever() : null;
                StrategyConfigInfo value3 = C50674vXd.AYXKKw(this.AEQbTJ).OLrzqt().getValue();
                actionBar.EZpvd(lever, leveragePercents, minLever, value3 != null ? value3.getMaxLever() : null, this.AEQbTJ.getChildFragmentManager(), C50674vXd.AYXKKw(this.AEQbTJ).iwGUEr(), C50674vXd.AYXKKw(this.AEQbTJ).fIwbmz(), this.AEQbTJ.new StateListAnimator());
                C56028xvA.botClickTrack$default("leverSelectView", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vXd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50674vXd EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50674vXd c50674vXd) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c50674vXd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!this.EZpvd.ORxRYg()) {
                    C49967uyY c49967uyY = C49967uyY.EZpvd;
                    C47988uAv c47988uAv = C50674vXd.djBIcL(this.EZpvd).valueOf;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, C56402yEa.EZpvd(C50674vXd.djBIcL(this.EZpvd).valueOf));
                    return;
                }
                android.widget.TextView textView = C50674vXd.djBIcL(this.EZpvd).AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() != 0) {
                    this.EZpvd.QOLQEE();
                } else {
                    C56002xub.KWHzl.OLrzqt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vXd$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C50674vXd EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50674vXd c50674vXd) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c50674vXd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.hDKMBd();
                C56028xvA.botClickTrack$default("tvAddCoin", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vXd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50674vXd AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50674vXd c50674vXd) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c50674vXd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd();
            }
        }
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        AuCTelauCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QVAiDq() {
        ((AbstractC48428uRa) gGvvIC()).valueOf.copydefault(new Fragment());
    }

    /* JADX INFO: renamed from: o.vXd$Fragment */
    public static final class Fragment extends uBF {
        @Override // o.uBH, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C56028xvA.OLrzqt("marginAmt", C56423yEv.EZpvd(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, java.lang.String.valueOf(charSequence))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTelauCTel() {
        ((AbstractC48428uRa) gGvvIC()).valueOf.EZpvd();
    }

    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        valueOf().AYXKKw();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        valueOf().EZpvd("signal_bot", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", "BTC-USDT-SWAP", null, null, 12, null) : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KWHzl();
        ((AbstractC48428uRa) gGvvIC()).valueOf.setOnTextChangeCallback(null);
        valueOf().AYXKKw();
        ((AbstractC48428uRa) gGvvIC()).EZpvd.setOnLeverChangeCallback(null);
        C50016uzU c50016uzU = this.values;
        if (c50016uzU != null) {
            c50016uzU.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.vXD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    C50674vXd.EZpvd(view, i, i2, i3, i4);
                }
            });
        }
        C52812wZg c52812wZg = this.djBIcL;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
    }

    public final void fIwbmz() {
        AYXKKw();
        sSMYrx();
        AwvSrB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        values();
        ((SignalBotOrderPresenter) dxcTrN()).AxsJAY();
        AEQbTJ(false);
    }

    public final void AYXKKw() {
        AxsJAY();
        ejfBZ();
        fetchVPNInfo();
        gHZMYf();
        QKVWgx();
        zuBGHE();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        AbstractC48428uRa abstractC48428uRa = (AbstractC48428uRa) gGvvIC();
        abstractC48428uRa.OLrzqt.setText(C33070mpX.AYXKKw(C55688xof.Application.toLegacyStreamType));
        C55312xha c55312xhaValueOf = abstractC48428uRa.gEmmrt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi24));
        }
        C55312xha c55312xhaValueOf2 = abstractC48428uRa.isConnected.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi23));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        C53526wnE c53526wnE = ((AbstractC48428uRa) gGvvIC()).AYXKKw;
        c53526wnE.setTitleText("");
        c53526wnE.setDrawableEnd(C33070mpX.KWHzl(C49511upt.TaskDescription.AhwBna));
        c53526wnE.KWHzl(new Function1() { // from class: o.vXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.copydefault(this.OLrzqt, (C53526wnE) obj);
            }
        });
        android.os.Bundle arguments = getArguments();
        SignalListItem signalListItem = arguments != null ? (SignalListItem) arguments.getParcelable("bot_copy_req") : null;
        SignalListItem signalListItem2 = signalListItem instanceof SignalListItem ? signalListItem : null;
        if (signalListItem2 != null) {
            OLrzqt(signalListItem2);
        }
        djBIcL();
    }

    public static final Unit copydefault(C50674vXd c50674vXd, final C53526wnE c53526wnE) {
        Intrinsics.checkNotNullParameter(c53526wnE, "");
        C50725vZa c50725vZa = new C50725vZa();
        c50725vZa.OLrzqt(new Function0() { // from class: o.vXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.AEQbTJ(c53526wnE);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c50674vXd.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c50725vZa.show(childFragmentManager);
        c53526wnE.setArrowDirection(1);
        C56028xvA.botClickTrack$default("signalSelectView", null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53526wnE c53526wnE) {
        c53526wnE.setArrowDirection(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        android.view.View viewFindViewById = requireActivity().getWindow().getDecorView().findViewById(C48033uCm.Application.fvQaOB);
        C50016uzU c50016uzU = viewFindViewById instanceof C50016uzU ? (C50016uzU) viewFindViewById : null;
        this.values = c50016uzU;
        if (c50016uzU != null) {
            c50016uzU.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.vXz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    C50674vXd.KWHzl(this.OLrzqt, view, i, i2, i3, i4);
                }
            });
        }
        C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.vXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50674vXd.AuCTel(this.KWHzl);
            }
        }, 500L);
        android.view.View view = ((AbstractC48428uRa) gGvvIC()).DbNXlk;
        view.setOnClickListener(new TaskDescription(view, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C50674vXd c50674vXd, android.view.View view, int i, int i2, int i3, int i4) {
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i2), (java.lang.Object) 0)) {
            ((AbstractC48428uRa) c50674vXd.gGvvIC()).DbNXlk.performClick();
            return;
        }
        C52812wZg c52812wZg = c50674vXd.djBIcL;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AuCTel(C50674vXd c50674vXd) {
        if (C49967uyY.EZpvd.EZpvd(((AbstractC48428uRa) c50674vXd.gGvvIC()).DbNXlk) == 0) {
            ((AbstractC48428uRa) c50674vXd.gGvvIC()).DbNXlk.performClick();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        RecyclerView recyclerView = ((AbstractC48428uRa) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        C52883way c52883way = ((AbstractC48428uRa) gGvvIC()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52883way, "");
        c52883way.setVisibility(0);
        ((AbstractC48428uRa) gGvvIC()).AhwBna.setRightIconClick(new Function0() { // from class: o.vXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.ejfBZ(this.AEQbTJ);
            }
        });
        getNewProxyInstance();
        this.valueOf.register(SignalCoinPairItemData.class, new vZR(new Function1() { // from class: o.vXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.KWHzl(this.AEQbTJ, (SignalCoinPairItemData) obj);
            }
        }, new Function0() { // from class: o.vXB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.hDKMBd(this.EZpvd);
            }
        }));
        RecyclerView recyclerView2 = ((AbstractC48428uRa) gGvvIC()).djBIcL;
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutManager(new GridLayoutManager(requireContext(), 2, 1, false));
        recyclerView2.addItemDecoration(new C57584ylF(2, C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null)));
        ((AbstractC48428uRa) gGvvIC()).djBIcL.setAdapter(this.valueOf);
        android.widget.TextView textView = ((AbstractC48428uRa) gGvvIC()).fetchVPNInfo;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fzHEvu);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
        textView.setOnClickListener(new Dialog(textView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit ejfBZ(C50674vXd c50674vXd) {
        C56406yEe.uzCIH(((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fIwbmz());
        c50674vXd.getNewProxyInstance();
        C52883way c52883way = ((AbstractC48428uRa) c50674vXd.gGvvIC()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52883way, "");
        c52883way.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50674vXd c50674vXd, SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fIwbmz().remove(signalCoinPairItemData);
        c50674vXd.getNewProxyInstance();
        ((AbstractC48428uRa) c50674vXd.gGvvIC()).djBIcL.requestLayout();
        C56028xvA.OLrzqt("rcvCoinPair-close", C56423yEv.EZpvd(C56390yDp.OLrzqt("item", signalCoinPairItemData.getTitle())));
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(C50674vXd c50674vXd) {
        c50674vXd.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        getFieldNames();
        C52877was c52877was = ((AbstractC48428uRa) gGvvIC()).copydefault;
        c52877was.AEQbTJ(new Function0() { // from class: o.vXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.fARcdN(this.KWHzl);
            }
        });
        c52877was.KWHzl(new Function0() { // from class: o.vXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.fIwbmz(this.AEQbTJ);
            }
        });
        c52877was.EZpvd(new Function0() { // from class: o.vXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50674vXd.fJNWhG(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fARcdN(C50674vXd c50674vXd) {
        android.content.Intent intent = new android.content.Intent(c50674vXd.requireContext(), (java.lang.Class<?>) vWW.class);
        intent.putExtra("request", ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fJNWhG());
        StrategyConfigInfo value = ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).OLrzqt().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        intent.putExtra("config", value);
        c50674vXd.gEmmrt.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fIwbmz(C50674vXd c50674vXd) {
        android.content.Intent intent = new android.content.Intent(c50674vXd.requireContext(), (java.lang.Class<?>) ActivityC50669vWz.class);
        intent.putExtra("request", ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fJNWhG());
        intent.putExtra("coin", ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).djBIcL());
        StrategyConfigInfo value = ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).OLrzqt().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        intent.putExtra("config", value);
        c50674vXd.AYXKKw.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fJNWhG(C50674vXd c50674vXd) {
        android.content.Intent intent = new android.content.Intent(c50674vXd.requireContext(), (java.lang.Class<?>) vWP.class);
        intent.putExtra("request", ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fJNWhG());
        StrategyConfigInfo value = ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).OLrzqt().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        intent.putExtra("config", value);
        c50674vXd.AhwBna.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(((SignalBotOrderPresenter) dxcTrN()).djBIcL())) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        ((SignalBotOrderPresenter) dxcTrN()).AEQbTJ(sizeDig != null ? C33129mqd.AhwBna(sizeDig) : 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        java.lang.String str = C55697xoo.OLrzqt.gEmmrt() + "signal_create_tip";
        if (SPUtils.getBoolean(str, false) || getContext() == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C52812wZg c52812wZg = new C52812wZg(contextRequireContext);
        android.view.View view = ((AbstractC48428uRa) gGvvIC()).DbNXlk;
        Intrinsics.checkNotNullExpressionValue(view, "");
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.zqaRxl));
        stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fqaWRL));
        Unit unit = Unit.INSTANCE;
        C52812wZg c52812wZgOLrzqt = c52812wZg.AEQbTJ(stateListAnimator).OLrzqt(0);
        this.djBIcL = c52812wZgOLrzqt;
        if (c52812wZgOLrzqt != null) {
            c52812wZgOLrzqt.fARcdN();
        }
        SPUtils.put(str, java.lang.Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o.vXd$StateListAnimator */
    public static final class StateListAnimator implements Function2<java.lang.String, java.util.ArrayList<SignalCoinPairItemData>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            EZpvd(str, arrayList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            C50674vXd.djBIcL(C50674vXd.this).EZpvd.EZpvd(str);
            C50674vXd.AYXKKw(C50674vXd.this).OLrzqt(arrayList);
            C50674vXd.this.getNewProxyInstance();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        C50189vFe c50189vFe = ((AbstractC48428uRa) gGvvIC()).EZpvd;
        c50189vFe.setOnClickListener(new Activity(c50189vFe, 1000L, this));
        C53518wmx c53518wmxAubY = AubY();
        c53518wmxAubY.setOnClickListener(new Application(c53518wmxAubY, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        AbstractC48428uRa abstractC48428uRa = (AbstractC48428uRa) gGvvIC();
        C49960uyR.setWindowSoftInput$default(this, abstractC48428uRa.KWHzl, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), abstractC48428uRa.valueOf, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        final C47988uAv c47988uAv = ((AbstractC48428uRa) gGvvIC()).valueOf;
        c47988uAv.setOnTextChangeCallback(this.copydefault);
        C47988uAv.setInputLabel$default(c47988uAv, "> " + xMR.copydefault.copydefault("0"), null, 2, null);
        c47988uAv.setInputUnit(((SignalBotOrderPresenter) dxcTrN()).djBIcL());
        c47988uAv.setMaxDecimal(((SignalBotOrderPresenter) dxcTrN()).values());
        c47988uAv.copydefault(new Function1() { // from class: o.vXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.OLrzqt(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C47988uAv c47988uAv, C50674vXd c50674vXd, float f) {
        C32866mlf.onEvent$default("BotPlaceOrder_Btm_InvestmentAmount_Drag", (TrackChannel[]) null, new Function1() { // from class: o.vXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (c47988uAv.zLjUOn()) {
            c47988uAv.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, C33129mqd.mulS$default(java.lang.Float.valueOf(f), c50674vXd.valueOf().AhwBna().getValue(), java.lang.Integer.valueOf(((SignalBotOrderPresenter) c50674vXd.dxcTrN()).values()), null, null, 12, null), false, false, 6, null);
            c50674vXd.OcIXYQ();
            c47988uAv.setOnTextChangeCallback(c50674vXd.copydefault);
        } else {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        }
        c50674vXd.DTwDnp();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "signal_bot", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gHZMYf() {
        ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().setLever("5");
        C50189vFe c50189vFe = ((AbstractC48428uRa) gGvvIC()).EZpvd;
        c50189vFe.EZpvd(((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getLever());
        c50189vFe.setOnLeverChangeCallback(new Function1() { // from class: o.vXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50674vXd c50674vXd, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fJNWhG().setLever(str);
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).OcIXYQ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zuBGHE() {
        ((AbstractC48428uRa) gGvvIC()).KWHzl.setTransferCoin(((SignalBotOrderPresenter) dxcTrN()).djBIcL());
        ((AbstractC48428uRa) gGvvIC()).KWHzl.setFooterAvaValue("--");
    }

    public static /* synthetic */ void refreshSignal$default(C50674vXd c50674vXd, SignalListItem signalListItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            signalListItem = null;
        }
        c50674vXd.OLrzqt(signalListItem);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(SignalListItem signalListItem) {
        java.lang.String signalChanId;
        java.lang.String signalChanName;
        java.lang.String signalChanId2;
        SignalBotOrderPresenter signalBotOrderPresenter = (SignalBotOrderPresenter) dxcTrN();
        if (signalListItem == null || (signalChanId = signalListItem.getSignalChanId()) == null) {
            signalChanId = "";
        }
        signalBotOrderPresenter.AEQbTJ(signalChanId);
        SignalBotOrderPresenter.refreshBaseData$default((SignalBotOrderPresenter) dxcTrN(), (signalListItem == null || (signalChanId2 = signalListItem.getSignalChanId()) == null) ? "" : signalChanId2, (signalListItem == null || (signalChanName = signalListItem.getSignalChanName()) == null) ? "" : signalChanName, null, 4, null);
        fJNWhG();
        ((SignalBotOrderPresenter) dxcTrN()).QfsBiF();
        ((SignalBotOrderPresenter) dxcTrN()).RJOkX();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        java.lang.String signalChanName = ((SignalBotOrderPresenter) dxcTrN()).AhwBna().getSignalChanName();
        int i = (signalChanName == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalChanName)) ? C52761wXj.Activity.Dff : C52761wXj.Activity.DeEinT;
        if (signalChanName == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalChanName)) {
            signalChanName = C33070mpX.AYXKKw(C55688xof.Application.ddauOi);
        }
        C53526wnE c53526wnE = ((AbstractC48428uRa) gGvvIC()).AYXKKw;
        c53526wnE.setTitleColor(i);
        c53526wnE.setTitleText(signalChanName);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        java.lang.String value = valueOf().AhwBna().getValue();
        android.widget.TextView textView = ((AbstractC48428uRa) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((value == null || !C33129mqd.AEQbTJ(((AbstractC48428uRa) gGvvIC()).valueOf.AkhnZx(), C33129mqd.formatS$default(value, java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).values()), null, null, 6, null))) ? 8 : 0);
    }

    private final void RJOkX() {
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vXm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50674vXd.OLrzqt(this.EZpvd, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("updated_signal", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50674vXd.AhwBna(this.EZpvd, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("selected_signal", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50674vXd.valueOf(this.OLrzqt, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("created_signal", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50674vXd.djBIcL(this.EZpvd, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(C50674vXd c50674vXd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AhwBna(C50674vXd c50674vXd, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String signalChanName;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("data");
        SignalListItem signalListItem = parcelable instanceof SignalListItem ? (SignalListItem) parcelable : null;
        if (Intrinsics.EZpvd((java.lang.Object) (signalListItem != null ? signalListItem.getSignalChanId() : null), (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).AhwBna().getSignalChanId())) {
            SignalBotOrderPresenter signalBotOrderPresenter = (SignalBotOrderPresenter) c50674vXd.dxcTrN();
            if (signalListItem != null && (signalChanName = signalListItem.getSignalChanName()) != null) {
                str2 = signalChanName;
            }
            signalBotOrderPresenter.copydefault(str2);
            c50674vXd.fJNWhG();
        }
    }

    public static final void valueOf(C50674vXd c50674vXd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("data");
        c50674vXd.OLrzqt(parcelable instanceof SignalListItem ? (SignalListItem) parcelable : null);
    }

    public static final void djBIcL(final C50674vXd c50674vXd, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String signalChanName;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("data");
        final SignalListItem signalListItem = parcelable instanceof SignalListItem ? (SignalListItem) parcelable : null;
        android.content.Context contextRequireContext = c50674vXd.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DbvGUJ));
        int i = C55688xof.Application.ZxnNGp;
        if (signalListItem == null || (signalChanName = signalListItem.getSignalChanName()) == null) {
            signalChanName = "";
        }
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("signalName", signalChanName))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ijmTNW), new View.OnClickListener() { // from class: o.vXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50674vXd.EZpvd(this.KWHzl, signalListItem, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage);
        Intrinsics.copydefault(strAYXKKw, "");
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw, new View.OnClickListener() { // from class: o.vXy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50674vXd.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(C50674vXd c50674vXd, SignalListItem signalListItem, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c50674vXd.OLrzqt(signalListItem);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QUSxYX() {
        C56111xwe<StrategyResponse> c56111xweEjfBZ = ((SignalBotOrderPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweEjfBZ.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vXb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.EZpvd(this.AEQbTJ, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SignalBotOrderPresenter) dxcTrN()).fARcdN().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.EZpvd((java.lang.Exception) obj);
            }
        }));
        C56111xwe<java.util.List<SignalListItem>> c56111xweHDKMBd = ((SignalBotOrderPresenter) dxcTrN()).hDKMBd();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweHDKMBd.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.vXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        TradeLiveData<ThirdSignalDetail> tradeLiveDataUzCIH = ((SignalBotOrderPresenter) dxcTrN()).uzCIH();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataUzCIH.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.vXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.AEQbTJ(this.KWHzl, (ThirdSignalDetail) obj);
            }
        }));
        TradeLiveData<SignalDetails> tradeLiveDataDbNXlk = ((SignalBotOrderPresenter) dxcTrN()).DbNXlk();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataDbNXlk.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.vXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.AEQbTJ(this.OLrzqt, (SignalDetails) obj);
            }
        }));
        C56111xwe<java.util.ArrayList<SignalCoinPairItemData>> c56111xweAYXKKw = ((SignalBotOrderPresenter) dxcTrN()).AYXKKw();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweAYXKKw.observe(viewLifecycleOwner6, new PendingIntent(new Function1() { // from class: o.vXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.KWHzl(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<StrategyConfigInfo> c56111xweOLrzqt = ((SignalBotOrderPresenter) dxcTrN()).OLrzqt();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner7, new PendingIntent(new Function1() { // from class: o.vXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.EZpvd(this.EZpvd, (StrategyConfigInfo) obj);
            }
        }));
        C56111xwe<MultiMinAmountItem> c56111xweIsConnected = ((SignalBotOrderPresenter) dxcTrN()).isConnected();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweIsConnected.observe(viewLifecycleOwner8, new PendingIntent(new Function1() { // from class: o.vXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.OLrzqt(this.AEQbTJ, (MultiMinAmountItem) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = valueOf().AhwBna();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweAhwBna.observe(viewLifecycleOwner9, new PendingIntent(new Function1() { // from class: o.vXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }));
        ((SignalBotOrderPresenter) dxcTrN()).getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vXh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        ((SignalBotOrderPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50674vXd.copydefault(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(C50674vXd c50674vXd, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        c50674vXd.KWHzl();
        c50674vXd.zsXlph();
        c50674vXd.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("signal_bot", strategyResponse.getAlgoId()));
        xDM xdmCopydefault = c50674vXd.valueOf().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50674vXd c50674vXd, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fJNWhG().getSignalChanId())) {
            c50674vXd.OLrzqt(C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(list.size()), (java.lang.Object) 1) ? (SignalListItem) list.get(0) : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50674vXd c50674vXd, ThirdSignalDetail thirdSignalDetail) {
        Intrinsics.checkNotNullParameter(thirdSignalDetail, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).gHZMYf();
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).QKVWgx();
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).QOLQEE();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50674vXd c50674vXd, SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).zuBGHE();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50674vXd c50674vXd, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).AwvSrB();
        c50674vXd.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50674vXd c50674vXd, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        ((AbstractC48428uRa) c50674vXd.gGvvIC()).EZpvd.AEQbTJ(strategyConfigInfo.getMaxLever());
        c50674vXd.fARcdN();
        c50674vXd.QbewEr();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50674vXd c50674vXd, MultiMinAmountItem multiMinAmountItem) {
        Intrinsics.checkNotNullParameter(multiMinAmountItem, "");
        c50674vXd.AuCTel();
        c50674vXd.wlaJM();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50674vXd c50674vXd, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC48428uRa) c50674vXd.gGvvIC()).KWHzl.setFooterAvaValue(C56033xvF.fmtBotValueBySymbol$default(((SignalBotOrderPresenter) c50674vXd.dxcTrN()).djBIcL(), str, RoundingMode.DOWN, true, null, false, null, null, null, null, null, 2032, null));
        c50674vXd.wlaJM();
        c50674vXd.DTwDnp();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50674vXd c50674vXd, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).AEQbTJ().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                c50674vXd.showLoading();
            } else {
                c50674vXd.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50674vXd c50674vXd, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fARcdN().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fvQaOB().gEmmrt();
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 == null) {
                message2 = "";
            }
            java.lang.String str2 = message2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "signal_bot", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str2, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).AkhnZx().bB_())) {
            ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).isConnected().postValue(new MultiMinAmountItem("", (java.lang.String) null, (java.lang.String) null, (ArbitrageCostVo) null, (java.util.List) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).getNewProxyInstance().bB_())) {
            c50674vXd.OLrzqt((SignalListItem) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).AEQbTJ().bB_())) {
            ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).QOLQEE();
            ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).QKVWgx();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fetchVPNInfo().bB_())) {
            java.lang.String message3 = ((java.lang.Exception) pair.second).getMessage();
            if (message3 != null) {
                C55326xho.toastWithFailedIcon$default(message3, 0, 1, (java.lang.Object) null);
            }
            ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fIwbmz().clear();
            c50674vXd.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        java.lang.String strCopydefault;
        java.lang.String minAmount;
        java.lang.String tipMinInvest = ((SignalBotOrderPresenter) dxcTrN()).AhwBna().getTipMinInvest();
        MultiMinAmountItem value = ((SignalBotOrderPresenter) dxcTrN()).isConnected().getValue();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(tipMinInvest, value != null ? value.getMinAmount() : null);
        strCopydefault = "";
        if (zAEQbTJ) {
            ((AbstractC48428uRa) gGvvIC()).valueOf.setInputUnit("");
            xMR xmr = xMR.copydefault;
            java.lang.String tipMinInvest2 = ((SignalBotOrderPresenter) dxcTrN()).AhwBna().getTipMinInvest();
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.OmPrLP, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.AhwBna(tipMinInvest2 != null ? tipMinInvest2 : "", ((SignalBotOrderPresenter) dxcTrN()).values())), C56390yDp.OLrzqt("ccy", ((SignalBotOrderPresenter) dxcTrN()).djBIcL())));
        } else {
            ((AbstractC48428uRa) gGvvIC()).valueOf.setInputUnit(((SignalBotOrderPresenter) dxcTrN()).djBIcL());
            MultiMinAmountItem value2 = ((SignalBotOrderPresenter) dxcTrN()).isConnected().getValue();
            java.lang.String minAmount2 = value2 != null ? value2.getMinAmount() : null;
            if (minAmount2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minAmount2)) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
                java.lang.String strDjBIcL = ((SignalBotOrderPresenter) dxcTrN()).djBIcL();
                MultiMinAmountItem value3 = ((SignalBotOrderPresenter) dxcTrN()).isConnected().getValue();
                strCopydefault = strAYXKKw + " " + C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, (value3 == null || (minAmount = value3.getMinAmount()) == null) ? "" : minAmount, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
            }
        }
        C47988uAv.setInputLabel$default(((AbstractC48428uRa) gGvvIC()).valueOf, strCopydefault, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fARcdN() {
        java.lang.String tipLever = ((SignalBotOrderPresenter) dxcTrN()).AhwBna().getTipLever();
        if (C33129mqd.OLrzqt((java.lang.Object) tipLever, (java.lang.Object) 0)) {
            StrategyConfigInfo value = ((SignalBotOrderPresenter) dxcTrN()).OLrzqt().getValue();
            if (value == null || (tipLever = value.getDefaultLeverage()) == null) {
                tipLever = "5";
            }
        } else {
            StrategyConfigInfo value2 = ((SignalBotOrderPresenter) dxcTrN()).OLrzqt().getValue();
            if (!C33129mqd.AEQbTJ(tipLever, value2 != null ? value2.getMaxLever() : null)) {
                if (tipLever == null) {
                }
            }
        }
        ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().setLever(tipLever);
        ((AbstractC48428uRa) gGvvIC()).EZpvd.EZpvd(((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getLever());
        getFieldNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        ((SignalBotOrderPresenter) dxcTrN()).zLjUOn();
        vZA vzaNewInstance$default = vZA.Activity.newInstance$default(vZA.Companion, ((SignalBotOrderPresenter) dxcTrN()).gEmmrt(), ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getLever(), null, new Function2() { // from class: o.vXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50674vXd.OLrzqt(this.KWHzl, (java.util.List) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        vzaNewInstance$default.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50674vXd c50674vXd, java.util.List list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fIwbmz().clear();
        ((SignalBotOrderPresenter) c50674vXd.dxcTrN()).fIwbmz().addAll(list);
        c50674vXd.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        ((SignalBotOrderPresenter) dxcTrN()).zsXlph();
        RecyclerView recyclerView = ((AbstractC48428uRa) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).fIwbmz().size()), 1) ? 0 : 8);
        C52883way c52883way = ((AbstractC48428uRa) gGvvIC()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52883way, "");
        c52883way.setVisibility(C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).fIwbmz().size()), (java.lang.Object) 1) ? 0 : 8);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).AuCTel().size()), 1)) {
            C33064mpR.OLrzqt(this.valueOf, (java.util.List<? extends java.lang.Object>) ((SignalBotOrderPresenter) dxcTrN()).AuCTel());
        }
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).AuCTel().size()), (java.lang.Object) 1)) {
            ((AbstractC48428uRa) gGvvIC()).AhwBna.setTitle(((SignalBotOrderPresenter) dxcTrN()).AuCTel().get(0).getTitle());
            ((AbstractC48428uRa) gGvvIC()).AhwBna.setTitleIcon(((SignalBotOrderPresenter) dxcTrN()).AuCTel().get(0).getTitleUrl());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ORxRYg() {
        if (!((AbstractC48428uRa) gGvvIC()).valueOf.KWHzl()) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)))), 0, 1, (java.lang.Object) null);
            ((AbstractC48428uRa) gGvvIC()).valueOf.zsXlph();
            return false;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((AbstractC48428uRa) gGvvIC()).valueOf.fetchVPNInfo())) {
            ((AbstractC48428uRa) gGvvIC()).valueOf.zsXlph();
            return false;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getSignalChanId())) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.IPostMessageService), 0, 1, (java.lang.Object) null);
            return false;
        }
        if (!C33129mqd.gEmmrt(java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getInstIds().size()), 1)) {
            return true;
        }
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.validateRelationship), 0, 1, (java.lang.Object) null);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean wlaJM() {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((AbstractC48428uRa) gGvvIC()).valueOf.AkhnZx())) {
            ((AbstractC48428uRa) gGvvIC()).valueOf.copydefault();
            return true;
        }
        MultiMinAmountItem value = ((SignalBotOrderPresenter) dxcTrN()).isConnected().getValue();
        java.lang.String s$default = C33129mqd.formatS$default(value != null ? value.getMinAmount() : null, java.lang.Integer.valueOf(((SignalBotOrderPresenter) dxcTrN()).values()), null, null, 6, null);
        if (C33129mqd.gEmmrt(((SignalBotOrderPresenter) dxcTrN()).fJNWhG().getTotalAmt(), s$default)) {
            ((AbstractC48428uRa) gGvvIC()).valueOf.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(s$default)), C56390yDp.OLrzqt("unit", ((SignalBotOrderPresenter) dxcTrN()).djBIcL()))));
            return false;
        }
        ((AbstractC48428uRa) gGvvIC()).valueOf.copydefault();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        if (((AbstractC48428uRa) gGvvIC()).valueOf.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(((AbstractC48428uRa) gGvvIC()).valueOf, false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        ((SignalBotOrderPresenter) dxcTrN()).fJNWhG().setTotalAmt(((AbstractC48428uRa) gGvvIC()).valueOf.AkhnZx());
        wlaJM();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QOLQEE() {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C56028xvA.OLrzqt("make_order", C56423yEv.EZpvd(C56390yDp.OLrzqt("isConfirmOpen", C33129mqd.gEmmrt(java.lang.Boolean.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance2.QbewEr()) ? false : true)))));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            ((SignalBotOrderPresenter) dxcTrN()).KWHzl();
            AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, ((SignalBotOrderPresenter) dxcTrN()).fvQaOB().gEmmrt(), ((SignalBotOrderPresenter) dxcTrN()).fvQaOB().djBIcL(), new StrategyReqGroup(((SignalBotOrderPresenter) dxcTrN()).sSMYrx(), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, ((SignalBotOrderPresenter) dxcTrN()).fJNWhG(), (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(((SignalBotOrderPresenter) dxcTrN()).OLrzqt().getValue()), (DcaOrderReq) null, (AiOrderReq) null, 28606, (DefaultConstructorMarker) null), false, 8, null);
            if (abstractC50583vTuNewInstance$default != null) {
                abstractC50583vTuNewInstance$default.show(getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
                return;
            }
            return;
        }
        showLoading();
        ((SignalBotOrderPresenter) dxcTrN()).EZpvd();
    }

    public final SignalBotReq copydefault(ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        SignalBotReq signalBotReq = data != null ? (SignalBotReq) data.getParcelableExtra("data") : null;
        if (signalBotReq instanceof SignalBotReq) {
            return signalBotReq;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        ((AbstractC48428uRa) gGvvIC()).copydefault.OLrzqt(((SignalBotOrderPresenter) dxcTrN()).fJNWhG());
    }

    public final void iwGUEr() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("signal_publish_success");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, viewLifecycleOwner).subscribe(new SignalBotCreateFragment$registerEvent$1(this, new java.lang.Object()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QbewEr() {
        StrategyConfigInfo value = ((SignalBotOrderPresenter) dxcTrN()).OLrzqt().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((AbstractC48428uRa) gGvvIC()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, value, (30 & 2) != 0 ? false : false, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        ((SignalBotOrderPresenter) dxcTrN()).DTwDnp();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        C47988uAv.setInputContent$default(((AbstractC48428uRa) gGvvIC()).valueOf, "", false, false, 6, null);
        getNewProxyInstance();
        getFieldNames();
    }
}
