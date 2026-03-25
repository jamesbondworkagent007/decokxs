package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
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
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeContainerPresenter;
import com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.HedgingEstimatesResp;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52812wZg;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.vJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50312vJt extends AbstractC48165uHj<uQO, ContractManuallyPresenter> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> AYXKKw;
    public final java.lang.Runnable AhwBna;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AkhnZx;
    public final uBH DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public java.lang.String OLrzqt;
    public vSY djBIcL;
    public final java.util.ArrayList<vSX> ejfBZ;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fARcdN;
    public final InterfaceC56387yDm fJNWhG;
    public final java.lang.Runnable fetchVPNInfo;
    public final Function2<C47988uAv, java.lang.String, Unit> gEmmrt;
    public final uBH isConnected;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> valueOf;
    public final int values = C48033uCm.Activity.iPSTqm;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vKu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50312vJt.fARcdN(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.vJt$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriceRangeUtil.ValidatedPriceRange.values().length];
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeLowerOutOfRange.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.LowerOutOfRange.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeUpperOutOfRange.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.UpperOutOfRange.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.vJt$VoiceInteractor */
    public static final /* synthetic */ class VoiceInteractor implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(Function1 function1) {
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
        return this.values;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uQO AkhnZx(C50312vJt c50312vJt) {
        return (uQO) c50312vJt.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractManuallyPresenter isConnected(C50312vJt c50312vJt) {
        return (ContractManuallyPresenter) c50312vJt.dxcTrN();
    }

    public C50312vJt() {
        final Function0 function0 = new Function0() { // from class: o.vKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.AuCTelauCTel(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.fragment.ContractManuallyGridFragment$special$$inlined$viewModels$default$1
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradeContainerPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.fragment.ContractManuallyGridFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.fragment.ContractManuallyGridFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.fragment.ContractManuallyGridFragment$special$$inlined$viewModels$default$4
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
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.AkhnZx = new kotlin.Pair<>(bool, "");
        this.fetchVPNInfo = new java.lang.Runnable() { // from class: o.vKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50312vJt.getFieldNames(this.EZpvd);
            }
        };
        this.valueOf = new kotlin.Pair<>(bool, "");
        this.AhwBna = new java.lang.Runnable() { // from class: o.vKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50312vJt.hDKMBd(this.KWHzl);
            }
        };
        this.fARcdN = new kotlin.Pair<>(java.lang.Boolean.FALSE, "");
        this.OLrzqt = "";
        this.AYXKKw = new Function2() { // from class: o.vKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50312vJt.EZpvd(this.EZpvd, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.gEmmrt = new Function2() { // from class: o.vKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50312vJt.EZpvd(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.isConnected = new uBH(new Function0() { // from class: o.vKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.iwGUEr(this.OLrzqt);
            }
        });
        this.DbNXlk = new uBH(new Function0() { // from class: o.vKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.uzCIH(this.EZpvd);
            }
        });
        this.ejfBZ = new java.util.ArrayList<>();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.copydefault();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.ejfBZ(this.copydefault);
            }
        });
    }

    public static final C53518wmx fARcdN(C50312vJt c50312vJt) {
        android.content.Context contextRequireContext = c50312vJt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx hUfVAv() {
        return (C53518wmx) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: fJNWhG, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return hUfVAv();
    }

    /* JADX INFO: renamed from: o.vJt$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vJt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final BotTradeContainerPresenter ejfBZ() {
        return (BotTradeContainerPresenter) this.fJNWhG.getValue();
    }

    public static final ViewModelStoreOwner AuCTelauCTel(C50312vJt c50312vJt) {
        androidx.fragment.app.Fragment parentFragment = c50312vJt.getParentFragment();
        return parentFragment != null ? parentFragment : c50312vJt;
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "ContractManuallyGridFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getFieldNames(C50312vJt c50312vJt) {
        if (c50312vJt.AkhnZx.getFirst().booleanValue()) {
            ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.copydefault();
        } else {
            ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.setInputErrorMsg(c50312vJt.AkhnZx.getSecond());
        }
    }

    /* JADX INFO: renamed from: o.vJt$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50312vJt OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50312vJt c50312vJt) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C50312vJt.AkhnZx(this.OLrzqt).zLjUOn.AuCTelauCTel();
                C50312vJt.AkhnZx(this.OLrzqt).AubY.AuCTelauCTel();
                android.widget.TextView textView = C50312vJt.AkhnZx(this.OLrzqt).DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() != 0) {
                    if (!this.OLrzqt.accept()) {
                        uQO uqoAkhnZx = C50312vJt.AkhnZx(this.OLrzqt);
                        C49967uyY c49967uyY = C49967uyY.EZpvd;
                        C47988uAv c47988uAv = uqoAkhnZx.zLjUOn;
                        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, yDY.gEmmrt(uqoAkhnZx.zLjUOn, uqoAkhnZx.AubY, uqoAkhnZx.fIwbmz, uqoAkhnZx.AuCTelauCTel, uqoAkhnZx.AuCTel));
                        return;
                    }
                    C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new TaskDescription(C54589xNz.EZpvd.EZpvd() ? "demo" : "live"), 1, (java.lang.Object) null);
                    this.OLrzqt.AYXKKw();
                    return;
                }
                C56002xub.KWHzl.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50312vJt KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50312vJt c50312vJt) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.setVolumeTo));
                java.lang.String string = this.KWHzl.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C50312vJt AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50312vJt c50312vJt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.setQueueTitle);
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Fragment(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C50312vJt EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C50312vJt c50312vJt) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.createCallback);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.RihMUf);
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ C50312vJt AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C50312vJt c50312vJt) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C50312vJt c50312vJt = this.AEQbTJ;
                c50312vJt.KWHzl(C48033uCm.Fragment.isReflectionWorking, C33069mpW.copydefault(c50312vJt, C48033uCm.Fragment.DQzvGNdrmXxu, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C50312vJt.isConnected(c50312vJt).valueOf()))));
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50312vJt KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C50312vJt c50312vJt) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl(C48033uCm.Fragment.fXYAwm, C33070mpX.AYXKKw(C48033uCm.Fragment.gdmIOq));
            }
        }
    }

    /* JADX INFO: renamed from: o.vJt$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50312vJt KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C50312vJt c50312vJt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c50312vJt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C50312vJt c50312vJt = this.KWHzl;
                c50312vJt.KWHzl(C48033uCm.Fragment.RIuxYh, C33069mpW.copydefault(c50312vJt, C48033uCm.Fragment.RSDDiY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C50312vJt.isConnected(c50312vJt).valueOf()))));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hDKMBd(C50312vJt c50312vJt) {
        if (c50312vJt.valueOf.getFirst().booleanValue()) {
            ((uQO) c50312vJt.gGvvIC()).AuCTel.copydefault();
        } else {
            ((uQO) c50312vJt.gGvvIC()).AuCTel.setInputErrorMsg(c50312vJt.valueOf.getSecond());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50312vJt c50312vJt, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).fIwbmz)) {
            c50312vJt.OLrzqt(z);
            c50312vJt.OLrzqt(z, c47988uAv);
        } else if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).zLjUOn) || Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).AubY)) {
            c50312vJt.KWHzl(z, c47988uAv);
            if (!z) {
                c50312vJt.isConnected();
            }
        } else if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel)) {
            c50312vJt.EZpvd(z, c47988uAv);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50312vJt c50312vJt, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).zLjUOn) || Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).AubY)) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QVAiDq();
        } else if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel)) {
            c50312vJt.djBIcL();
            c50312vJt.QVAiDq();
            c50312vJt.UeEOUB();
        } else if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).AuCTel)) {
            c50312vJt.UeEOUB();
            c50312vJt.QVAiDq();
        } else if (Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).fIwbmz)) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setGridNum(((uQO) c50312vJt.gGvvIC()).fIwbmz.AkhnZx());
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QUSxYX();
            c50312vJt.ORxRYg();
            c50312vJt.getNewProxyInstance();
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QVAiDq();
            c50312vJt.fvQaOB();
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(C50312vJt c50312vJt) {
        c50312vJt.QOLQEE();
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(C50312vJt c50312vJt) {
        c50312vJt.fARcdN();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ((ContractManuallyPresenter) dxcTrN()).EZpvd(getArguments());
        zLjUOn();
        iwGUEr();
        AubY();
        AwvSrB();
        wlaJM();
        getFieldNames();
        zsXlph();
        gkJEwt();
        iRxXKY();
        AuCTelauCTel();
        hDKMBd();
        QKVWgx();
        DAIeex();
        RlQdEF();
        RJOkX();
        fvQaOB();
        C55867xrz.KWHzl.OLrzqt("contract_grid", ((ContractManuallyPresenter) dxcTrN()).fvQaOB().gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fvQaOB() {
        C53513wms c53513wms = ((uQO) gGvvIC()).KWHzl;
        boolean z = true;
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.zLjUOn.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.AubY.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.fIwbmz.AkhnZx()))) {
            z = false;
        }
        c53513wms.setClear(z);
    }

    public static /* synthetic */ void freshAiOperatorHedging$default(C50312vJt c50312vJt, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c50312vJt.KWHzl(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        ((uQO) gGvvIC()).KWHzl.setHedging(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        ((uQO) gGvvIC()).KWHzl.setCallBack("contract_grid", new Function1() { // from class: o.vKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }, new Function0() { // from class: o.vKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.AubY(this.EZpvd);
            }
        });
    }

    public static final Unit AubY(C50312vJt c50312vJt) {
        c50312vJt.EZpvd(true);
        return Unit.INSTANCE;
    }

    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    private final C43316rmw flVtFt() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zuBGHE() {
        vSX vsx;
        BotUserConfigInfo botUserConfigInfoCopydefault;
        this.ejfBZ.clear();
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(((ContractManuallyPresenter) dxcTrN()).zuBGHE(), "contract_grid")) {
            InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
            java.util.List<java.lang.String> profitSharingRange = (interfaceC55881xsMCopydefault2 == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault2.copydefault()) == null) ? null : botUserConfigInfoCopydefault.getProfitSharingRange();
            java.lang.String strAYXKKw = ((ContractManuallyPresenter) dxcTrN()).AYXKKw();
            pUU.KWHzl("Profit", "defaultProfitSharingRatio = " + strAYXKKw);
            if (profitSharingRange != null) {
                int i = 0;
                for (java.lang.Object obj : profitSharingRange) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strAYXKKw)) {
                        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setProfitSharingRatio(str);
                        vsx = new vSX(str, true, i);
                    } else {
                        vsx = new vSX(str, false, i);
                    }
                    this.ejfBZ.add(vsx);
                    i++;
                }
            }
            if (!this.ejfBZ.isEmpty()) {
                ((uQO) gGvvIC()).fetchVPNInfo.setVisibility(0);
                ((uQO) gGvvIC()).sSMYrx.setVisibility(0);
                C43316rmw c43316rmwFlVtFt = flVtFt();
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c43316rmwFlVtFt.register(vSX.class, new vSU(fragmentActivityRequireActivity, new Function1() { // from class: o.vKK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C50312vJt.EZpvd(this.KWHzl, (vSX) obj2);
                    }
                }));
                RecyclerView recyclerView = ((uQO) gGvvIC()).sSMYrx;
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setLayoutManager(new GridLayoutManager(requireActivity(), this.ejfBZ.size()));
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.removeItemDecorationAt(0);
                }
                recyclerView.addItemDecoration(new C57584ylF(this.ejfBZ.size(), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null)));
                recyclerView.setAdapter(flVtFt());
                flVtFt().setItems(this.ejfBZ);
                return;
            }
        }
        ((uQO) gGvvIC()).fetchVPNInfo.setVisibility(8);
        ((uQO) gGvvIC()).sSMYrx.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50312vJt c50312vJt, vSX vsx) {
        Intrinsics.checkNotNullParameter(vsx, "");
        for (vSX vsx2 : c50312vJt.ejfBZ) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setProfitSharingRatio(vsx.AEQbTJ());
            vsx2.AEQbTJ(vsx2.EZpvd() == vsx.EZpvd());
        }
        C33064mpR.OLrzqt(c50312vJt.flVtFt(), (java.util.List<? extends java.lang.Object>) c50312vJt.ejfBZ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void RJOkX() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        if (C55697xoo.OLrzqt.isConnected()) {
            vSY vsy = this.djBIcL;
            if ((vsy != null && vsy.isAdded()) || SPUtils.getBoolean(vSY.Companion.AEQbTJ(), false) || (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) == null || !interfaceC55881xsMCopydefault.OLrzqt(((ContractManuallyPresenter) dxcTrN()).zuBGHE(), "contract_grid") || this.ejfBZ.isEmpty()) {
                return;
            }
            C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.vKf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50312vJt.wlaJM(this.KWHzl);
                }
            }, 0L);
        }
    }

    public static final void wlaJM(final C50312vJt c50312vJt) {
        if (c50312vJt.djBIcL == null) {
            c50312vJt.djBIcL = vSY.Companion.copydefault(c50312vJt.ejfBZ, new Function1() { // from class: o.vJH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50312vJt.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        try {
            vSY vsy = c50312vJt.djBIcL;
            if (vsy != null) {
                vsy.show(c50312vJt.getChildFragmentManager(), C50312vJt.class.getSimpleName());
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl(c50312vJt.getTAG(), "Failed to show KolLeadingSettingFragment: " + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, int i) {
        for (vSX vsx : c50312vJt.ejfBZ) {
            vsx.AEQbTJ(vsx.EZpvd() == i);
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setProfitSharingRatio(c50312vJt.ejfBZ.get(i).AEQbTJ());
        C33064mpR.OLrzqt(c50312vJt.flVtFt(), (java.util.List<? extends java.lang.Object>) c50312vJt.ejfBZ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        ((uQO) gGvvIC()).EZpvd.EZpvd(((ContractManuallyPresenter) dxcTrN()).uzCIH());
        ((uQO) gGvvIC()).EZpvd.isConnected();
        ((uQO) gGvvIC()).EZpvd.setTriggerStrategyPostCheck(new Function0() { // from class: o.vJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.getNewProxyInstance(this.EZpvd);
            }
        });
    }

    public static final Unit getNewProxyInstance(C50312vJt c50312vJt) {
        c50312vJt.QfsBiF();
        c50312vJt.DTwDnp();
        c50312vJt.ORxRYg();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iRxXKY() {
        uQO uqo = (uQO) gGvvIC();
        C49960uyR.setWindowSoftInput$default(this, uqo.zLjUOn, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uqo.zLjUOn, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, uqo.AubY, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uqo.AubY, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, uqo.fIwbmz, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uqo.fIwbmz, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, uqo.fJNWhG, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uqo.AuCTelauCTel, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, uqo.AuCTel, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uqo.AuCTel, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAYsNCnLh() {
        ((ContractManuallyPresenter) dxcTrN()).fIwbmz();
        ((ContractManuallyPresenter) dxcTrN()).QKVWgx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z, boolean z2) {
        vKO vko = ((uQO) gGvvIC()).zsXlph;
        Intrinsics.checkNotNullExpressionValue(vko, "");
        vko.setVisibility(z ? 0 : 8);
        vKO vko2 = ((uQO) gGvvIC()).AwvSrB;
        Intrinsics.checkNotNullExpressionValue(vko2, "");
        vko2.setVisibility(z2 ? 0 : 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [435=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QfsBiF() {
        java.lang.String direction = ((ContractManuallyPresenter) dxcTrN()).uzCIH().getDirection();
        if (direction != null) {
            switch (direction.hashCode()) {
                case 3327612:
                    if (direction.equals("long")) {
                        ((uQO) gGvvIC()).zsXlph.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                    }
                    break;
                case 109413500:
                    if (direction.equals("short")) {
                        ((uQO) gGvvIC()).AwvSrB.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                    }
                    break;
                case 798171554:
                    if (direction.equals("hedging")) {
                        ((uQO) gGvvIC()).AwvSrB.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                    }
                    break;
                case 1844321735:
                    if (direction.equals("neutral")) {
                        ((uQO) gGvvIC()).zsXlph.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0));
                        ((uQO) gGvvIC()).AwvSrB.setTitle(C33070mpX.AYXKKw(C55688xof.Application.removeReporter));
                    }
                    break;
            }
        }
        ((ContractManuallyPresenter) dxcTrN()).OLrzqt(((uQO) gGvvIC()).OLrzqt.isChecked(), true, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ORxRYg() {
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractManuallyPresenter) dxcTrN()).uzCIH().getOrdVariant(), (java.lang.Object) "segmented_hedging") || Intrinsics.EZpvd((java.lang.Object) ((uQO) gGvvIC()).djBIcL.copydefault(), (java.lang.Object) "hedging")) {
            ((ContractManuallyPresenter) dxcTrN()).iwGUEr();
        }
    }

    public static final void AEQbTJ(final C50312vJt c50312vJt, final C47988uAv c47988uAv, final Function1<? super java.lang.String, java.lang.String> function1) {
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.EZpvd(this.AEQbTJ, c47988uAv, function1, ((java.lang.Float) obj).floatValue());
            }
        });
        c47988uAv.setOnTextChangeCallback(c50312vJt.gEmmrt);
        c47988uAv.setOnFocusChangeCallback(c50312vJt.AYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50312vJt c50312vJt, final C47988uAv c47988uAv, Function1 function1, float f) {
        c50312vJt.KWHzl("BotPlaceOrder_Btm_InvestmentAmount_Drag", "bot_type", "contract_grid");
        if (!c47988uAv.zLjUOn()) {
            C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.vKH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50312vJt.KWHzl(c47988uAv);
                }
            }, 200L);
        } else {
            ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, (java.lang.String) function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(c47988uAv.fJNWhG()))), false, false, 6, null);
            ((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.setOnTextChangeCallback(c50312vJt.gEmmrt);
            c50312vJt.QVAiDq();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C47988uAv c47988uAv) {
        C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKudOq() {
        C47988uAv c47988uAv = ((uQO) gGvvIC()).AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        AEQbTJ(this, c47988uAv, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.gEmmrt(this.copydefault, (java.lang.String) obj);
            }
        });
        BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
        if (bizInstrumentAhwBna != null) {
            ((uQO) gGvvIC()).fJNWhG.setTransferCoin(bizInstrumentAhwBna.getMarginSymbol());
            ((uQO) gGvvIC()).AuCTelauCTel.setInputUnit(bizInstrumentAhwBna.getMarginSymbol());
            ((uQO) gGvvIC()).AuCTelauCTel.setMaxDecimal(((ContractManuallyPresenter) dxcTrN()).AuCTelauCTel());
            ((uQO) gGvvIC()).AuCTel.setInputUnit(bizInstrumentAhwBna.getMarginSymbol());
            ((uQO) gGvvIC()).AuCTel.setMaxDecimal(((ContractManuallyPresenter) dxcTrN()).AuCTelauCTel());
            ((uQO) gGvvIC()).ejfBZ.setTransferCoin(bizInstrumentAhwBna.getMarginSymbol());
        }
        ((uQO) gGvvIC()).AuCTel.setOnTextChangeCallback(this.gEmmrt);
        ((uQO) gGvvIC()).AuCTel.setOnFocusChangeCallback(this.AYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String gEmmrt(C50312vJt c50312vJt, java.lang.String str) {
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            return "";
        }
        java.lang.String strValueOf = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(str, ((ContractManuallyPresenter) c50312vJt.dxcTrN()).zLjUOn().getValue(), null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QUSxYX() {
        DigitInfoBean digitInfoBeanIsConnected = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().isConnected();
        ((uQO) gGvvIC()).AkhnZx.setText(C33069mpW.copydefault(this, C55688xof.Application.getStateWithUpdatedPosition, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", digitInfoBeanIsConnected.getSymbol()))));
        ((uQO) gGvvIC()).zLjUOn.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        ((uQO) gGvvIC()).AubY.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        ((uQO) gGvvIC()).zLjUOn.setOnFocusChangeCallback(this.AYXKKw);
        ((uQO) gGvvIC()).AubY.setOnFocusChangeCallback(this.AYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTelauCTel() {
        ((uQO) gGvvIC()).fIwbmz.setMaxDecimal(0);
        ((uQO) gGvvIC()).fIwbmz.setOnFocusChangeCallback(this.AYXKKw);
        ((uQO) gGvvIC()).fIwbmz.setOnTextChangeCallback(this.gEmmrt);
        ((uQO) gGvvIC()).EZpvd.setControlSelectedListener(new Function1() { // from class: o.vJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AhwBna(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        ((uQO) gGvvIC()).EZpvd.setControlSelected("1");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C50312vJt c50312vJt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setRunType(str);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).ejfBZ();
        c50312vJt.QfsBiF();
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QVAiDq();
        c50312vJt.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wlaJM() {
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setLever("5");
        ((uQO) gGvvIC()).hDKMBd.KWHzl(((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        ((uQO) gGvvIC()).OLrzqt.setChecked(true);
        C53539wnR c53539wnR = ((uQO) gGvvIC()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
        c53539wnR.setVisibility(0);
        ((uQO) gGvvIC()).ejfBZ.setFooterAvaValueGravity(8388613);
        ((uQO) gGvvIC()).ejfBZ.setFooterAvaValue("--");
        android.widget.TextView textView = ((uQO) gGvvIC()).ORxRYg;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = ((uQO) gGvvIC()).DTwDnp;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        android.widget.LinearLayout linearLayout = ((uQO) gGvvIC()).getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C47988uAv c47988uAv = ((uQO) gGvvIC()).AuCTel;
        BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
        c47988uAv.setInputUnit(bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null);
        C47988uAv.setInputLabel$default(((uQO) gGvvIC()).AuCTel, "≥ " + xMR.copydefault.copydefault("0"), null, 2, null);
        C55320xhi c55320xhi = ((uQO) gGvvIC()).getFieldNames;
        c55320xhi.gEmmrt();
        C8003auW.copydefault(c55320xhi).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.vJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C50312vJt.AEQbTJ(this.copydefault, obj);
            }
        });
        ((uQO) gGvvIC()).OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C50312vJt.copydefault(this.AEQbTJ, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(C50312vJt c50312vJt, java.lang.Object obj) {
        android.content.Context contextRequireContext = c50312vJt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.reset);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DQzvGNdrmXxudrmXxu));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.vKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.gEmmrt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter.requestLiqPrice$default(com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter, boolean, boolean, boolean, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C50312vJt c50312vJt, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            C53539wnR c53539wnR = ((uQO) c50312vJt.gGvvIC()).ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
            c53539wnR.setVisibility(0);
            android.widget.LinearLayout linearLayout = ((uQO) c50312vJt.gGvvIC()).getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.TextView textView = ((uQO) c50312vJt.gGvvIC()).ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).OLrzqt(true);
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setSz(((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.AkhnZx());
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault(true);
        } else {
            C53539wnR c53539wnR2 = ((uQO) c50312vJt.gGvvIC()).ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c53539wnR2, "");
            c53539wnR2.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = ((uQO) c50312vJt.gGvvIC()).getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            android.widget.TextView textView2 = ((uQO) c50312vJt.gGvvIC()).ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(((ContractManuallyPresenter) c50312vJt.dxcTrN()).AwvSrB() ^ true ? 0 : 8);
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).OLrzqt(false);
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setActualMarginSz(((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.AkhnZx());
            ContractGridReq contractGridReqUzCIH = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH();
            java.lang.String strAkhnZx = ((uQO) c50312vJt.gGvvIC()).AuCTel.AkhnZx();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx)) {
                strAkhnZx = null;
            }
            if (strAkhnZx == null) {
                strAkhnZx = "0";
            }
            contractGridReqUzCIH.setExtraMarginSz(strAkhnZx);
            c50312vJt.dNCPSb();
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        ContractManuallyPresenter.requestLiqPrice$default((ContractManuallyPresenter) c50312vJt.dxcTrN(), z, false, false, true, 6, null);
        ((uQO) c50312vJt.gGvvIC()).OcIXYQ.setValue(((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getActualMarginSz(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getLever()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QKVWgx() {
        ((uQO) gGvvIC()).hDKMBd.setCallback(new Function1() { // from class: o.vJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(C50312vJt c50312vJt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setLever(str);
        ((uQO) c50312vJt.gGvvIC()).OcIXYQ.setValue(((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getActualMarginSz(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getLever()));
        c50312vJt.QfsBiF();
        c50312vJt.DTwDnp();
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).ejfBZ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zsXlph() {
        final uQO uqo = (uQO) gGvvIC();
        uqo.OcIXYQ.setTextTvGravity(8388613);
        uqo.OcIXYQ.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        uqo.OcIXYQ.setValue("--");
        uqo.zsXlph.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
        uqo.zsXlph.setValue("--");
        uqo.AwvSrB.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
        uqo.AwvSrB.setValue("--");
        uqo.zsXlph.EZpvd(true, new View.OnClickListener() { // from class: o.vJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.OLrzqt(this.copydefault, uqo, view);
            }
        });
        uqo.AwvSrB.EZpvd(true, new View.OnClickListener() { // from class: o.vKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.EZpvd(this.EZpvd, uqo, view);
            }
        });
    }

    public static final void OLrzqt(C50312vJt c50312vJt, uQO uqo, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.removeAllTabs);
        android.content.Context contextRequireContext = c50312vJt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(uqo.zsXlph.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C50312vJt.AYXKKw(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(C50312vJt c50312vJt, uQO uqo, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setCaptioningEnabled);
        android.content.Context contextRequireContext = c50312vJt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(uqo.AwvSrB.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C50312vJt.djBIcL(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zLjUOn() {
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setBasePos(Intrinsics.EZpvd((java.lang.Object) ((uQO) gGvvIC()).djBIcL.copydefault(), (java.lang.Object) "neutral") ? null : java.lang.Boolean.TRUE);
        ((uQO) gGvvIC()).EZpvd.setOpenPositionPostCheck(new Function1() { // from class: o.vJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AYXKKw(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        ((uQO) gGvvIC()).EZpvd.setSlippageControlSettings(new Function2() { // from class: o.vJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50312vJt.KWHzl(this.KWHzl, (java.lang.String) obj, (java.lang.Boolean) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(C50312vJt c50312vJt, boolean z) {
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        c50312vJt.QfsBiF();
        c50312vJt.DTwDnp();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50312vJt c50312vJt, java.lang.String str, java.lang.Boolean bool) {
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOpenPosSlippage(str);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOpenPosSlippageDefault(bool);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        android.widget.ImageView imageViewEZpvd;
        android.widget.ImageView imageViewEZpvd2;
        uQO uqo = (uQO) gGvvIC();
        if (Intrinsics.EZpvd((java.lang.Object) "hedging", (java.lang.Object) str)) {
            LinearLayoutCompat linearLayoutCompat = uqo.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            ConstraintLayout constraintLayout = uqo.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            android.widget.FrameLayout frameLayout = uqo.values;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            KWHzl(true);
            uqo.hDKMBd.KWHzl("1");
            C55052xcf c55052xcfCopydefault = uqo.hDKMBd.copydefault();
            if (c55052xcfCopydefault != null && (imageViewEZpvd2 = c55052xcfCopydefault.EZpvd()) != null) {
                imageViewEZpvd2.setVisibility(8);
            }
            C55052xcf c55052xcfCopydefault2 = uqo.hDKMBd.copydefault();
            if (c55052xcfCopydefault2 != null) {
                c55052xcfCopydefault2.setClickable(false);
            }
            C55258xgZ c55258xgZ = (C55258xgZ) uqo.AhwBna.findViewById(C48033uCm.Application.accept);
            if (c55258xgZ != null) {
                c55258xgZ.setOnClickListener(new PictureInPictureParams(c55258xgZ, 1000L, this));
            }
            C55258xgZ c55258xgZ2 = (C55258xgZ) uqo.AhwBna.findViewById(C48033uCm.Application.AxsJAYsNCnLh);
            if (c55258xgZ2 != null) {
                c55258xgZ2.setOnClickListener(new TaskStackBuilder(c55258xgZ2, 1000L, this));
            }
            C55258xgZ c55258xgZ3 = (C55258xgZ) uqo.AhwBna.findViewById(C48033uCm.Application.ODWQjV);
            if (c55258xgZ3 != null) {
                c55258xgZ3.setOnClickListener(new SharedElementCallback(c55258xgZ3, 1000L, this));
            }
            uqo.EZpvd.OLrzqt(false);
            android.widget.TextView textView = uqo.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = uqo.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(8);
        ConstraintLayout constraintLayout2 = uqo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = uqo.values;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(0);
        KWHzl(false);
        uqo.hDKMBd.KWHzl(((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever());
        C55052xcf c55052xcfCopydefault3 = uqo.hDKMBd.copydefault();
        if (c55052xcfCopydefault3 != null && (imageViewEZpvd = c55052xcfCopydefault3.EZpvd()) != null) {
            imageViewEZpvd.setVisibility(0);
        }
        C55052xcf c55052xcfCopydefault4 = uqo.hDKMBd.copydefault();
        if (c55052xcfCopydefault4 != null) {
            c55052xcfCopydefault4.setClickable(true);
        }
        uqo.EZpvd.OLrzqt(true);
    }

    public final void KWHzl(@androidx.annotation.StringRes int i, java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(i);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vKE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void clearContent$default(C50312vJt c50312vJt, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c50312vJt.EZpvd(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).zLjUOn, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AubY, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).fIwbmz, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTelauCTel, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTel, "", false, false, 6, null);
        ((uQO) gGvvIC()).zLjUOn.copydefault();
        ((uQO) gGvvIC()).AubY.copydefault();
        if (!z) {
            ((uQO) gGvvIC()).EZpvd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH());
        }
        OLrzqt("");
        isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v47, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v49, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(AIData aIData) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAYXKKw2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = null;
        } else {
            java.lang.String strValueOf = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf);
            if (xmsGEmmrt != null && (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(aIData.getMinPx())) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw2, false, 1, null);
            }
        }
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default2 = null;
        } else {
            java.lang.String strValueOf2 = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf2 != null ? strValueOf2 : "");
            if (xmsGEmmrt2 != null && (c54536xMLAYXKKw = xmsGEmmrt2.AYXKKw(aIData.getMaxPx())) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
            }
        }
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).zLjUOn, safeString$default, false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AubY, safeString$default2, false, false, 6, null);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).fIwbmz, C33129mqd.formatS$default(aIData.getGridNum(), 0, null, null, 6, null), false, false, 6, null);
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setLever(C33129mqd.formatS$default(aIData.getLever(), 2, java.lang.Boolean.FALSE, null, 4, null));
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setGridNum(C33129mqd.formatS$default(aIData.getGridNum(), 0, null, null, 6, null));
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setMinPx(aIData.getMinPx());
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setMaxPx(aIData.getMaxPx());
        ((uQO) gGvvIC()).hDKMBd.KWHzl(((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever());
        ((uQO) gGvvIC()).EZpvd.setControlSelected(aIData.getRunType());
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) aIData.getProfitSharingRatio())) {
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setProfitSharingRatio(aIData.getProfitSharingRatio());
        }
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTelauCTel, aIData.getQuoteSz(), false, false, 6, null);
        java.lang.Boolean cbAutoReserve = aIData.getCbAutoReserve();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!Intrinsics.EZpvd(cbAutoReserve, bool)) {
            C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTel, aIData.getExtraMarginSz(), false, false, 6, null);
        }
        ((uQO) gGvvIC()).OLrzqt.setChecked(Intrinsics.EZpvd(aIData.getCbAutoReserve(), bool));
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setBasePos(Intrinsics.EZpvd((java.lang.Object) ((ContractManuallyPresenter) dxcTrN()).uzCIH().getDirection(), (java.lang.Object) "neutral") ? null : java.lang.Boolean.valueOf(aIData.getBasePos()));
        ((uQO) gGvvIC()).EZpvd.EZpvd(((ContractManuallyPresenter) dxcTrN()).uzCIH());
        ((uQO) gGvvIC()).EZpvd.copydefault(aIData);
        isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        uQO uqo = (uQO) gGvvIC();
        uqo.djBIcL.setTabSelectedCallBack(new Function1() { // from class: o.vJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        });
        C53549wnb c53549wnb = uqo.djBIcL;
        BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
        c53549wnb.copydefault(bizInstrumentAhwBna != null ? Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), java.lang.Boolean.TRUE) : false);
        C55258xgZ c55258xgZ = uqo.gHZMYf;
        c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = uqo.fetchVPNInfo;
        c55258xgZ2.setOnClickListener(new Dialog(c55258xgZ2, 1000L, this));
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "direction_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C50312vJt c50312vJt, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("FuturesBotPlaceOrder_Direction_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c50312vJt.EZpvd(str);
        c50312vJt.isConnected();
        C56028xvA.OLrzqt("FuturesBotPlaceOrder_Direction_Button_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt("direction_type", str)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vJt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vJt$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        clearContent$default(this, false, 1, null);
        AEQbTJ(str);
        ((ContractManuallyPresenter) dxcTrN()).gHZMYf().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "long", (java.lang.Object) str)));
        ((ContractManuallyPresenter) dxcTrN()).ORxRYg().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "short", (java.lang.Object) str)));
        ((ContractManuallyPresenter) dxcTrN()).OcIXYQ().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "neutral", (java.lang.Object) str)));
        ((ContractManuallyPresenter) dxcTrN()).AxsJAY().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "hedging", (java.lang.Object) str)));
        ejfBZ().AEQbTJ().setValue(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(android.os.Bundle bundle) {
        AIData aIData = bundle != null ? (AIData) bundle.getParcelable("bot_copy_req") : null;
        AIData aIData2 = aIData instanceof AIData ? aIData : null;
        if (aIData2 == null) {
            return;
        }
        bundle.remove("bot_copy_req");
        ((uQO) gGvvIC()).djBIcL.setDirectionType(Intrinsics.EZpvd((java.lang.Object) aIData2.getDisplayName(), (java.lang.Object) "segmented_hedging") ? "hedging" : aIData2.getDirection());
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setSystemSource(aIData2.getSystemSource());
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setNmpUnderlyingId(aIData2.getNmpUnderlyingId());
        AEQbTJ(aIData2);
        C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTelauCTel, aIData2.getQuoteSz(), false, false, 6, null);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) aIData2.getProfitSharingRatio())) {
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setProfitSharingRatio(aIData2.getProfitSharingRatio());
        }
        java.lang.Boolean cbAutoReserve = aIData2.getCbAutoReserve();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!Intrinsics.EZpvd(cbAutoReserve, bool)) {
            C47988uAv.setInputContent$default(((uQO) gGvvIC()).AuCTel, aIData2.getExtraMarginSz(), false, false, 6, null);
        }
        ((uQO) gGvvIC()).OLrzqt.setChecked(Intrinsics.EZpvd(aIData2.getCbAutoReserve(), bool));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AwvSrB() {
        C55258xgZ c55258xgZ = ((uQO) gGvvIC()).AYXKKw;
        c55258xgZ.setOnClickListener(new FragmentManager(c55258xgZ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vJt$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    private final void gkJEwt() {
        C53518wmx c53518wmxHUfVAv = hUfVAv();
        c53518wmxHUfVAv.setOnClickListener(new ActionBar(c53518wmxHUfVAv, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vJt$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, this.copydefault, false, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        C53513wms c53513wms = ((uQO) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c53513wms, "");
        c53513wms.setVisibility(C48291uMa.Companion.AEQbTJ().KWHzl() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        PriceOutOfRangeBottomSheet.Application application = PriceOutOfRangeBottomSheet.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.EZpvd(childFragmentManager, new PriceOutOfRangeBottomSheet.PriceOutOfRangeBottomSheetInput(this.OLrzqt, ((uQO) gGvvIC()).zLjUOn.AkhnZx(), ((uQO) gGvvIC()).AubY.AkhnZx(), ((ContractManuallyPresenter) dxcTrN()).fvQaOB().isConnected().getSymbol()), new Function1() { // from class: o.vKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.AEQbTJ, (PriceRangeUtil.ValidatedPriceRange) obj);
            }
        }, new Function0() { // from class: o.vKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.fJNWhG(this.OLrzqt);
            }
        }, new Function0() { // from class: o.vKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.AuCTel(this.copydefault);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, PriceRangeUtil.ValidatedPriceRange validatedPriceRange) {
        Intrinsics.checkNotNullParameter(validatedPriceRange, "");
        int i = StateListAnimator.OLrzqt[validatedPriceRange.ordinal()];
        if (i == 1 || i == 2) {
            ((uQO) c50312vJt.gGvvIC()).zLjUOn.zsXlph();
        } else if (i == 3 || i == 4) {
            ((uQO) c50312vJt.gGvvIC()).AubY.zsXlph();
        } else {
            ((uQO) c50312vJt.gGvvIC()).zLjUOn.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C50312vJt c50312vJt) {
        c50312vJt.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C50312vJt c50312vJt) {
        c50312vJt.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        if (!sSMYrx()) {
            aKErDB();
        } else {
            AxsJAY();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String gHZMYf() {
        java.lang.String maxGridNum;
        java.lang.String strAkhnZx = ((uQO) gGvvIC()).fIwbmz.AkhnZx();
        StrategyConfigInfo value = ((ContractManuallyPresenter) dxcTrN()).copydefault().getValue();
        java.lang.String maxGridNum2 = null;
        java.lang.String minGridNum = value != null ? value.getMinGridNum() : null;
        GridNumRangeBean value2 = ((ContractManuallyPresenter) dxcTrN()).fARcdN().getValue();
        if (value2 == null || (maxGridNum = value2.getMaxGridNum()) == null) {
            StrategyConfigInfo value3 = ((ContractManuallyPresenter) dxcTrN()).copydefault().getValue();
            if (value3 != null) {
                maxGridNum2 = value3.getMaxGridNum();
            }
        } else {
            maxGridNum2 = maxGridNum;
        }
        if (minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum2) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return "";
        }
        return C33129mqd.gEmmrt(strAkhnZx, minGridNum) ? C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(minGridNum)))) : C33129mqd.AEQbTJ(strAkhnZx, maxGridNum2) ? C33069mpW.copydefault(this, C55688xof.Application.ActionBarLayoutParams, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(maxGridNum2)))) : "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v53, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v56, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v61, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v65, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v68, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v72, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v76, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v80, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v84, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean accept() {
        if (((uQO) gGvvIC()).zLjUOn.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", ((uQO) gGvvIC()).zLjUOn.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).zLjUOn.zsXlph();
            return false;
        }
        if (((uQO) gGvvIC()).AubY.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", ((uQO) gGvvIC()).AubY.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).AubY.zsXlph();
            return false;
        }
        if (!Intrinsics.EZpvd(((ContractManuallyPresenter) dxcTrN()).sSMYrx(), java.lang.Boolean.TRUE)) {
            C55326xho.toast$default(getString(C55688xof.Application.setLogo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).AubY.zsXlph();
            return false;
        }
        if (((uQO) gGvvIC()).fIwbmz.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", ((uQO) gGvvIC()).fIwbmz.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).fIwbmz.zsXlph();
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) gHZMYf())) {
            C55326xho.toast$default(gHZMYf(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).zLjUOn.zsXlph();
            return false;
        }
        if (((uQO) gGvvIC()).valueOf.getVisibility() == 0 && C33129mqd.OLrzqt(((uQO) gGvvIC()).valueOf.getText())) {
            C55326xho.toast$default(((uQO) gGvvIC()).valueOf.getText().toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uQO) gGvvIC()).fIwbmz.zsXlph();
            return false;
        }
        if (!((uQO) gGvvIC()).AuCTelauCTel.KWHzl()) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)))), 0, 1, (java.lang.Object) null);
            ((uQO) gGvvIC()).AuCTelauCTel.zsXlph();
            return false;
        }
        if (!EZpvd()) {
            ((uQO) gGvvIC()).AuCTelauCTel.zsXlph();
            return false;
        }
        if (!AEQbTJ()) {
            ((uQO) gGvvIC()).AuCTel.zsXlph();
            return false;
        }
        if (((uQO) gGvvIC()).EZpvd.AhwBna()) {
            return false;
        }
        return ((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue() == null || !C33129mqd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH().getSz(), ((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean EZpvd() {
        this.AkhnZx = fIwbmz();
        C47988uAv c47988uAv = ((uQO) gGvvIC()).AuCTelauCTel;
        c47988uAv.removeCallbacks(this.fetchVPNInfo);
        c47988uAv.postDelayed(this.fetchVPNInfo, 500L);
        return this.AkhnZx.getFirst().booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AEQbTJ() {
        if (((uQO) gGvvIC()).OLrzqt.isChecked()) {
            return true;
        }
        this.valueOf = AuCTel();
        C47988uAv c47988uAv = ((uQO) gGvvIC()).AuCTel;
        c47988uAv.removeCallbacks(this.AhwBna);
        c47988uAv.postDelayed(this.AhwBna, 500L);
        return this.valueOf.getFirst().booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> fIwbmz() {
        java.lang.String safeString$default;
        java.lang.String strCopydefault;
        java.lang.String minInvestment;
        C54536xML c54536xMLAuCTel;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = "";
        } else {
            java.lang.String strValueOf = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                MinInvestResp value = ((ContractManuallyPresenter) dxcTrN()).zsXlph().getValue();
                if (value == null || (minInvestment = value.getMinInvestment()) == null) {
                    minInvestment = "";
                }
                C54536xML c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(minInvestment);
                if (c54536xMLOLrzqt == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
                }
            }
        }
        if (this.fARcdN.getFirst().booleanValue() || (C33129mqd.OLrzqt((java.lang.CharSequence) ((uQO) gGvvIC()).AuCTelauCTel.AkhnZx()) && C33129mqd.valueOf(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx(), safeString$default))) {
            if (this.fARcdN.getFirst().booleanValue()) {
                strCopydefault = this.fARcdN.getSecond();
            } else {
                int i = C55688xof.Application.ActivityResultContractsPickVisualMedia;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default));
                pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(safeString$default));
                BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
                java.lang.String marginSymbol = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null;
                pairArr[2] = C56390yDp.OLrzqt("unit", marginSymbol != null ? marginSymbol : "");
                strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strCopydefault);
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> AuCTel() {
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QVAiDq() {
        if (((uQO) gGvvIC()).OLrzqt.isChecked()) {
            android.widget.TextView textView = ((uQO) gGvvIC()).DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue() == null || !C33129mqd.AEQbTJ(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx(), ((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue())) ? 8 : 0);
        } else {
            double dAEQbTJ = C33129mqd.AEQbTJ(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx());
            double dAEQbTJ2 = C33129mqd.AEQbTJ(((uQO) gGvvIC()).AuCTel.AkhnZx());
            double dAEQbTJ3 = ((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue() != null ? C33129mqd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue()) : AudioStats.AUDIO_AMPLITUDE_NONE;
            android.widget.TextView textView2 = ((uQO) gGvvIC()).DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3 ? 8 : 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void UeEOUB() {
        if (((uQO) gGvvIC()).OLrzqt.isChecked() || ((ContractManuallyPresenter) dxcTrN()).AwvSrB()) {
            return;
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx());
        double dAEQbTJ2 = C33129mqd.AEQbTJ(((uQO) gGvvIC()).AuCTel.AkhnZx());
        double dAEQbTJ3 = ((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue() != null ? C33129mqd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).zLjUOn().getValue()) : AudioStats.AUDIO_AMPLITUDE_NONE;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) ((uQO) gGvvIC()).AuCTel.AkhnZx());
        android.widget.TextView textView = ((uQO) gGvvIC()).ORxRYg;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(((zOLrzqt ^ true) || dAEQbTJ2 < 0.3d * dAEQbTJ) ? 0 : 8);
        android.widget.TextView textView2 = ((uQO) gGvvIC()).DTwDnp;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(dAEQbTJ2 + dAEQbTJ > dAEQbTJ3 ? 0 : 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1132=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v36, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sSMYrx() {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf = null;
        } else {
            java.lang.String strValueOf3 = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().valueOf();
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf3);
            if (xmsGEmmrt != null) {
                strValueOf = xmsGEmmrt.valueOf(((uQO) gGvvIC()).AubY.AkhnZx());
            }
        }
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf2 = null;
        } else {
            java.lang.String strValueOf4 = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf4 != null ? strValueOf4 : "");
            if (xmsGEmmrt2 != null) {
                strValueOf2 = xmsGEmmrt2.valueOf(((uQO) gGvvIC()).zLjUOn.AkhnZx());
            }
        }
        LiquidatePriceResponse value = ((ContractManuallyPresenter) dxcTrN()).getFieldNames().getValue();
        java.lang.String longLiqPx = value != null ? value.getLongLiqPx() : null;
        LiquidatePriceResponse value2 = ((ContractManuallyPresenter) dxcTrN()).getFieldNames().getValue();
        java.lang.String shortLiqPx = value2 != null ? value2.getShortLiqPx() : null;
        java.lang.String direction = ((ContractManuallyPresenter) dxcTrN()).uzCIH().getDirection();
        if (direction != null) {
            switch (direction.hashCode()) {
                case 3327612:
                    if (direction.equals("long") && (longLiqPx == null || longLiqPx.length() == 0 || ((uQO) gGvvIC()).AubY.AkhnZx().length() == 0 || ((uQO) gGvvIC()).zLjUOn.AkhnZx().length() == 0 || C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, strValueOf2))) {
                        return true;
                    }
                    break;
                case 109413500:
                    if (direction.equals("short") && (longLiqPx == null || longLiqPx.length() == 0 || ((uQO) gGvvIC()).AubY.AkhnZx().length() == 0 || ((uQO) gGvvIC()).zLjUOn.AkhnZx().length() == 0 || C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, strValueOf2))) {
                    }
                    break;
                case 798171554:
                    if (direction.equals("hedging") && (longLiqPx == null || longLiqPx.length() == 0 || ((uQO) gGvvIC()).AubY.AkhnZx().length() == 0 || ((uQO) gGvvIC()).zLjUOn.AkhnZx().length() == 0 || C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, strValueOf2))) {
                    }
                    break;
                case 1844321735:
                    if (direction.equals("neutral") && (((longLiqPx == null || longLiqPx.length() == 0) && (shortLiqPx == null || shortLiqPx.length() == 0)) || ((uQO) gGvvIC()).AubY.AkhnZx().length() == 0 || ((uQO) gGvvIC()).zLjUOn.AkhnZx().length() == 0 || ((C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, strValueOf2)) && (C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, strValueOf2))))) {
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v47, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DAIeex() {
        TradeLiveData<java.lang.String> tradeLiveDataAEQbTJ = ejfBZ().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new VoiceInteractor(new Function1() { // from class: o.vJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.isConnected(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<StrategyResponse> tradeLiveDataWlaJM = ((ContractManuallyPresenter) dxcTrN()).wlaJM();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataWlaJM.observe(viewLifecycleOwner2, new VoiceInteractor(new Function1() { // from class: o.vJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.KWHzl(this.copydefault, (StrategyResponse) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataZsXlph = ((ContractManuallyPresenter) dxcTrN()).zsXlph();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner3, new VoiceInteractor(new Function1() { // from class: o.vJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.copydefault, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataGEmmrt = ((ContractManuallyPresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner4, new VoiceInteractor(new Function1() { // from class: o.vJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.copydefault(this.AEQbTJ, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataGHZMYf = ((ContractManuallyPresenter) dxcTrN()).gHZMYf();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner5, new VoiceInteractor(new Function1() { // from class: o.vJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AhwBna(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataORxRYg = ((ContractManuallyPresenter) dxcTrN()).ORxRYg();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataORxRYg.observe(viewLifecycleOwner6, new VoiceInteractor(new Function1() { // from class: o.vJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.gEmmrt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataOcIXYQ = ((ContractManuallyPresenter) dxcTrN()).OcIXYQ();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataOcIXYQ.observe(viewLifecycleOwner7, new VoiceInteractor(new Function1() { // from class: o.vKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.djBIcL(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataAxsJAY = ((ContractManuallyPresenter) dxcTrN()).AxsJAY();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataAxsJAY.observe(viewLifecycleOwner8, new VoiceInteractor(new Function1() { // from class: o.vJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.valueOf(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<LiquidatePriceResponse> fieldNames = ((ContractManuallyPresenter) dxcTrN()).getFieldNames();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        fieldNames.observe(viewLifecycleOwner9, new VoiceInteractor(new Function1() { // from class: o.vKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.OLrzqt, (LiquidatePriceResponse) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataCopydefault = ((ContractManuallyPresenter) dxcTrN()).copydefault();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner10, new VoiceInteractor(new Function1() { // from class: o.vJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<GridNumRangeBean> tradeLiveDataFARcdN = ((ContractManuallyPresenter) dxcTrN()).fARcdN();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        tradeLiveDataFARcdN.observe(viewLifecycleOwner11, new VoiceInteractor(new Function1() { // from class: o.vJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.KWHzl(this.AEQbTJ, (GridNumRangeBean) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataZLjUOn = ((ContractManuallyPresenter) dxcTrN()).zLjUOn();
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        tradeLiveDataZLjUOn.observe(viewLifecycleOwner12, new VoiceInteractor(new Function1() { // from class: o.vJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AkhnZx(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<HedgingEstimatesResp> tradeLiveDataHDKMBd = ((ContractManuallyPresenter) dxcTrN()).hDKMBd();
        LifecycleOwner viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner13, new VoiceInteractor(new Function1() { // from class: o.vJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.OLrzqt, (HedgingEstimatesResp) obj);
            }
        }));
        TradeLiveData<ExtraActualMarginResp> tradeLiveDataIsConnected = ((ContractManuallyPresenter) dxcTrN()).isConnected();
        LifecycleOwner viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "");
        tradeLiveDataIsConnected.observe(viewLifecycleOwner14, new VoiceInteractor(new Function1() { // from class: o.vJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.copydefault(this.EZpvd, (ExtraActualMarginResp) obj);
            }
        }));
        C56111xwe<GridProfitRateResp> c56111xweFJNWhG = ((ContractManuallyPresenter) dxcTrN()).fJNWhG();
        LifecycleOwner viewLifecycleOwner15 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner15, "");
        c56111xweFJNWhG.observe(viewLifecycleOwner15, new VoiceInteractor(new Function1() { // from class: o.vJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.EZpvd, (GridProfitRateResp) obj);
            }
        }));
        ((ContractManuallyPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new VoiceInteractor(new Function1() { // from class: o.vJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        ((ContractManuallyPresenter) dxcTrN()).AubY().AkhnZx().observe(getViewLifecycleOwner(), new VoiceInteractor(new Function1() { // from class: o.vJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner16 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner16, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner16, new VoiceInteractor(new Function1() { // from class: o.vJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.EZpvd(this.OLrzqt, (xMJ.Application) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isConnected(C50312vJt c50312vJt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((uQO) c50312vJt.gGvvIC()).djBIcL.setDirectionType(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50312vJt c50312vJt, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        c50312vJt.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("contract_grid", strategyResponse.getAlgoId()));
        xDM xdmEZpvd = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).EZpvd();
        if (xdmEZpvd != null) {
            xdmEZpvd.KWHzl();
        }
        if (GridStartTriggerType.Companion.KWHzl(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getSignParams())) {
            RxBus.KWHzl(new vSS());
        }
        clearContent$default(c50312vJt, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        java.lang.String strAEQbTJ = C56068xvo.copydefault.AEQbTJ(minInvestResp.getMinInvestment());
        C47988uAv.setInputLabel$default(((uQO) c50312vJt.gGvvIC()).AuCTelauCTel, "> " + strAEQbTJ, null, 2, null);
        c50312vJt.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50312vJt c50312vJt, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        c50312vJt.fARcdN = new kotlin.Pair<>(java.lang.Boolean.FALSE, "");
        c50312vJt.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C50312vJt c50312vJt, boolean z) {
        if (c50312vJt.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setBasePos(java.lang.Boolean.TRUE);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOrdVariant(null);
        ((uQO) c50312vJt.gGvvIC()).EZpvd.gEmmrt();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue(), "long");
        if (!Intrinsics.EZpvd((java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection(), (java.lang.Object) "long")) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setDirection("long");
            c50312vJt.copydefault(true, false);
            c50312vJt.QfsBiF();
            c50312vJt.DTwDnp();
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
            c50312vJt.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C50312vJt c50312vJt, boolean z) {
        if (c50312vJt.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setBasePos(java.lang.Boolean.TRUE);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOrdVariant(null);
        ((uQO) c50312vJt.gGvvIC()).EZpvd.gEmmrt();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue(), "short");
        if (!Intrinsics.EZpvd((java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection(), (java.lang.Object) "short")) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setDirection("short");
            c50312vJt.copydefault(false, true);
            c50312vJt.QfsBiF();
            c50312vJt.DTwDnp();
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
            c50312vJt.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C50312vJt c50312vJt, boolean z) {
        if (c50312vJt.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setBasePos(null);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOrdVariant(null);
        ((uQO) c50312vJt.gGvvIC()).EZpvd.gEmmrt();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue(), "neutral");
        if (!Intrinsics.EZpvd((java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection(), (java.lang.Object) "neutral")) {
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setDirection("neutral");
            c50312vJt.copydefault(true, true);
            c50312vJt.QfsBiF();
            c50312vJt.DTwDnp();
            ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
            c50312vJt.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C50312vJt c50312vJt, boolean z) {
        if (c50312vJt.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setBasePos(java.lang.Boolean.TRUE);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setOrdVariant("segmented_hedging");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setLever("1");
        ((uQO) c50312vJt.gGvvIC()).OLrzqt.setChecked(false);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setActualMarginSz(((uQO) c50312vJt.gGvvIC()).AuCTelauCTel.AkhnZx());
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setExtraMarginSz("0");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).OLrzqt(false);
        c50312vJt.QbewEr();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.gEmmrt();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue(), "hedging");
        c50312vJt.ORxRYg();
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setDirection("short");
        c50312vJt.copydefault(false, true);
        c50312vJt.QfsBiF();
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        c50312vJt.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        LiquidatePriceResponse liquidatePriceResponseEZpvd = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).EZpvd(liquidatePriceResponse);
        vKO vko = ((uQO) c50312vJt.gGvvIC()).zsXlph;
        java.lang.String longLiqPx = liquidatePriceResponseEZpvd.getLongLiqPx();
        if (longLiqPx == null) {
            longLiqPx = "--";
        }
        vko.setValue(longLiqPx);
        vKO vko2 = ((uQO) c50312vJt.gGvvIC()).AwvSrB;
        java.lang.String shortLiqPx = liquidatePriceResponseEZpvd.getShortLiqPx();
        vko2.setValue(shortLiqPx != null ? shortLiqPx : "--");
        android.widget.TextView textView = ((uQO) c50312vJt.gGvvIC()).QOLQEE;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c50312vJt.sSMYrx() ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxGridNum;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        GridNumRangeBean value = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fARcdN().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            maxGridNum = strategyConfigInfo.getMaxGridNum();
        }
        c50312vJt.KWHzl(strategyConfigInfo.getMinGridNum(), maxGridNum);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(true);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).ejfBZ();
        c50312vJt.QfsBiF();
        c50312vJt.DTwDnp();
        ((uQO) c50312vJt.gGvvIC()).EZpvd.KWHzl(strategyConfigInfo, ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getDirection(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getOpenPosSlippageDefault());
        c50312vJt.DarRvM();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50312vJt, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50312vJt c50312vJt, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo value = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue();
            maxGridNum = value != null ? value.getMaxGridNum() : "0";
        }
        StrategyConfigInfo value2 = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue();
        if (value2 != null && (minGridNum = value2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        c50312vJt.KWHzl(str, maxGridNum);
        java.lang.String strGHZMYf = c50312vJt.gHZMYf();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGHZMYf)) {
            ((uQO) c50312vJt.gGvvIC()).fIwbmz.setInputErrorMsg(strGHZMYf);
        } else {
            ((uQO) c50312vJt.gGvvIC()).fIwbmz.copydefault();
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QUSxYX();
        c50312vJt.ORxRYg();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AkhnZx(C50312vJt c50312vJt, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().AEQbTJ();
        java.lang.String safeString$default = null;
        if (abstractC54531xLwAEQbTJ != null) {
            java.lang.String strValueOf = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                if (str == null) {
                    str = "";
                }
                C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default.copydefault(str);
                if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        ((uQO) c50312vJt.gGvvIC()).fJNWhG.setFooterAvaValue(safeString$default);
        c50312vJt.QVAiDq();
        c50312vJt.UeEOUB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C50312vJt c50312vJt, HedgingEstimatesResp hedgingEstimatesResp) {
        java.lang.String str;
        java.lang.String str2;
        uQO uqo = (uQO) c50312vJt.gGvvIC();
        java.lang.String estAvgSellPrice = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstAvgSellPrice() : null;
        java.lang.String estAvgBuyPrice = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstAvgBuyPrice() : null;
        android.widget.TextView textView = (android.widget.TextView) uqo.AhwBna.findViewById(C48033uCm.Application.OqFWZa);
        if (textView != null) {
            java.lang.String botPrice$default = C56033xvF.getBotPrice$default(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt(), estAvgSellPrice == null ? "" : estAvgSellPrice, false, false, RoundingMode.UP, null, 88, null);
            if (estAvgSellPrice != null) {
                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) estAvgSellPrice))) {
                    estAvgSellPrice = null;
                }
                if (estAvgSellPrice != null) {
                    str2 = " " + C56033xvF.AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt());
                }
                if (str2 == null) {
                }
                textView.setText(botPrice$default + str2);
            } else {
                str2 = null;
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(botPrice$default + str2);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) uqo.AhwBna.findViewById(C48033uCm.Application.getPostValueLengthLimit);
        if (textView2 != null) {
            java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt(), estAvgBuyPrice == null ? "" : estAvgBuyPrice, false, false, RoundingMode.DOWN, null, 88, null);
            if (estAvgBuyPrice != null) {
                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) estAvgBuyPrice))) {
                    estAvgBuyPrice = null;
                }
                if (estAvgBuyPrice != null) {
                    str = " " + C56033xvF.AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt());
                }
                if (str == null) {
                }
                textView2.setText(botPrice$default2 + str);
            } else {
                str = null;
                if (str == null) {
                    str = "";
                }
                textView2.setText(botPrice$default2 + str);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) uqo.AhwBna.findViewById(C48033uCm.Application.ffGIBT);
        if (textView3 != null) {
            java.lang.String estFundingRateAPR = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstFundingRateAPR() : null;
            textView3.setText(getFormatedRatio$default(c50312vJt, estFundingRateAPR == null ? "" : estFundingRateAPR, null, false, 6, null));
            java.lang.String estFundingRateAPR2 = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstFundingRateAPR() : null;
            textView3.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (estFundingRateAPR2 != null ? estFundingRateAPR2 : "")));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C50312vJt c50312vJt, ExtraActualMarginResp extraActualMarginResp) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel2;
        C54536xML c54536xMLDjBIcL2;
        Intrinsics.checkNotNullParameter(extraActualMarginResp, "");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setActualMarginSz(extraActualMarginResp.getActualMarginSz());
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().setExtraMarginSz(extraActualMarginResp.getExtraMarginSz());
        if (((uQO) c50312vJt.gGvvIC()).OLrzqt.isChecked()) {
            c50312vJt.QfsBiF();
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = null;
        } else {
            java.lang.String strValueOf = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                java.lang.String actualMarginSz = extraActualMarginResp.getActualMarginSz();
                if (actualMarginSz == null) {
                    actualMarginSz = "";
                }
                C54536xML c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(actualMarginSz);
                if (c54536xMLCopydefault != null && (c54536xMLAuCTel2 = c54536xMLCopydefault.AuCTel()) != null && (c54536xMLDjBIcL2 = c54536xMLAuCTel2.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
                }
            }
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ2 = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ2 == null) {
            safeString$default2 = null;
        } else {
            java.lang.String strValueOf2 = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().valueOf();
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ2, strValueOf2, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default2 != null) {
                java.lang.String extraMarginSz = extraActualMarginResp.getExtraMarginSz();
                C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default2.copydefault(extraMarginSz != null ? extraMarginSz : "");
                if (c54536xMLCopydefault2 != null && (c54536xMLAuCTel = c54536xMLCopydefault2.AuCTel()) != null && (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) != null) {
                    safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getExtraMarginSz()) && !C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getActualMarginSz())) {
            ((uQO) c50312vJt.gGvvIC()).ejfBZ.setFooterAvaValue("--");
        } else {
            C53539wnR c53539wnR = ((uQO) c50312vJt.gGvvIC()).ejfBZ;
            BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().AhwBna();
            c53539wnR.setFooterAvaValue(safeString$default + Marker.ANY_NON_NULL_MARKER + safeString$default2 + " " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null));
        }
        ((uQO) c50312vJt.gGvvIC()).OcIXYQ.setValue(((ContractManuallyPresenter) c50312vJt.dxcTrN()).AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getActualMarginSz(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getLever()));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, GridProfitRateResp gridProfitRateResp) {
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        java.lang.String str = "--";
        if (gridProfitRateResp == null) {
            ((uQO) c50312vJt.gGvvIC()).isConnected.setText("--");
            ((uQO) c50312vJt.gGvvIC()).valueOf.setVisibility(8);
            return Unit.INSTANCE;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridProfitRateResp.getPerMinProfitRate()) && C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            ((uQO) c50312vJt.gGvvIC()).valueOf.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(((uQO) c50312vJt.gGvvIC()).fIwbmz, null, 1, null);
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                ((uQO) c50312vJt.gGvvIC()).valueOf.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo value = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).copydefault().getValue();
                if (Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xMR.copydefault.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    xMR xmr = xMR.copydefault;
                    if (value == null || (minGridNum = value.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                ((uQO) c50312vJt.gGvvIC()).valueOf.setText(C33069mpW.copydefault(c50312vJt, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
        } else {
            ((uQO) c50312vJt.gGvvIC()).valueOf.setVisibility(8);
        }
        xMR xmr2 = xMR.copydefault;
        java.lang.String perMinProfitRate = gridProfitRateResp.getPerMinProfitRate();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr2, perMinProfitRate, 0, roundingMode, 2, null);
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr2, gridProfitRateResp.getPerMaxProfitRate(), 0, roundingMode, 2, null);
        if (Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            android.widget.TextView textView = ((uQO) c50312vJt.gGvvIC()).isConnected;
            if (percent$default != null && percent$default.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent$default)) {
                str = percent$default;
            }
            textView.setText(str);
        } else {
            ((uQO) c50312vJt.gGvvIC()).isConnected.setText(percent$default + " - " + percent$default2);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v26, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v26, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50312vJt c50312vJt, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String msg;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AkhnZx().bB_())) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50312vJt, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).DbNXlk().bB_())) {
            ((uQO) c50312vJt.gGvvIC()).valueOf.setVisibility(8);
            ((uQO) c50312vJt.gGvvIC()).isConnected.setText("--");
        } else {
            java.lang.String str2 = "";
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AhwBna().bB_())) {
                S s = pair.second;
                BizApiException bizApiException = s instanceof BizApiException ? (BizApiException) s : null;
                if (Intrinsics.EZpvd((java.lang.Object) (bizApiException != null ? bizApiException.getCode() : null), (java.lang.Object) "51399")) {
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    S s2 = pair.second;
                    BizApiException bizApiException2 = s2 instanceof BizApiException ? (BizApiException) s2 : null;
                    if (bizApiException2 != null && (msg = bizApiException2.getMsg()) != null) {
                        str2 = msg;
                    }
                    c50312vJt.fARcdN = new kotlin.Pair<>(bool, str2);
                    c50312vJt.EZpvd();
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).values().bB_())) {
                ((ContractManuallyPresenter) c50312vJt.dxcTrN()).getFieldNames().postValue(new LiquidatePriceResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null));
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AubY().bB_())) {
                if (GridStartTriggerType.Companion.KWHzl(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getSignParams())) {
                    vSO.Companion.copydefault(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt()).show(c50312vJt.getChildFragmentManager(), "BotOrderFailedDialog");
                } else {
                    C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String strGEmmrt = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt();
                java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                java.lang.String str3 = message == null ? "" : message;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "contract_grid", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str3, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).AuCTel().bB_())) {
                ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fARcdN().setValue(null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).getNewProxyInstance().bB_())) {
                ((ContractManuallyPresenter) c50312vJt.dxcTrN()).hDKMBd().setValue(null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fetchVPNInfo().bB_())) {
                ((ContractManuallyPresenter) c50312vJt.dxcTrN()).isConnected().postValue(new ExtraActualMarginResp("", ""));
                if (((uQO) c50312vJt.gGvvIC()).OLrzqt.isChecked()) {
                    ((ContractManuallyPresenter) c50312vJt.dxcTrN()).getFieldNames().postValue(new LiquidatePriceResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null));
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C50312vJt c50312vJt, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c50312vJt.showLoading();
        } else {
            c50312vJt.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50312vJt c50312vJt, xMJ.Application application) {
        C54536xML c54536xMLAYXKKw;
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL());
        java.lang.String safeString$default = null;
        if (xmsAEQbTJ != null && (c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(application.AYXKKw())) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
        }
        c50312vJt.OLrzqt = safeString$default != null ? safeString$default : "";
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(java.lang.String str) {
        int i;
        java.lang.String strAYXKKw;
        if (str == null) {
            i = 259;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 3327612) {
                i = iHashCode != 109413500 ? 262 : 262;
            } else if (str.equals("long")) {
                i = 261;
            }
        }
        hUfVAv().setButtonType(i);
        C53518wmx c53518wmxHUfVAv = hUfVAv();
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
        } else {
            strAYXKKw = C33069mpW.copydefault(C55688xof.Application.glVQsU, C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, C56033xvF.AhwBna(str))));
        }
        c53518wmxHUfVAv.setText(strAYXKKw);
    }

    private final void RlQdEF() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50312vJt.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50312vJt.KWHzl(this.AEQbTJ, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50312vJt.valueOf(this.copydefault, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C50312vJt c50312vJt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = c50312vJt.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QVAiDq();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C50312vJt c50312vJt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c50312vJt.KWHzl(bundle);
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).QfsBiF();
        c50312vJt.isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void valueOf(C50312vJt c50312vJt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((ContractManuallyPresenter) c50312vJt.dxcTrN()).OLrzqt(((uQO) c50312vJt.gGvvIC()).OLrzqt.isChecked(), true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        java.lang.String strAkhnZx = ((uQO) gGvvIC()).AuCTelauCTel.AkhnZx();
        java.lang.String str = null;
        if (!C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
            MinInvestResp value = ((ContractManuallyPresenter) dxcTrN()).zsXlph().getValue();
            if (!C33129mqd.valueOf(strAkhnZx, value != null ? value.getMinInvestment() : null)) {
                str = ((uQO) gGvvIC()).AuCTelauCTel.fARcdN() + ":" + strAkhnZx;
            }
        }
        ((ContractManuallyPresenter) dxcTrN()).EZpvd(str, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        ((uQO) gGvvIC()).fIwbmz.copydefault();
        if (!((uQO) gGvvIC()).OLrzqt.isChecked()) {
            QfsBiF();
        }
        DTwDnp();
        ((ContractManuallyPresenter) dxcTrN()).AEQbTJ(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        if (((uQO) gGvvIC()).AuCTelauCTel.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(((uQO) gGvvIC()).AuCTelauCTel, false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QOLQEE() {
        if (((uQO) gGvvIC()).OLrzqt.isChecked()) {
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setSz(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx());
        } else {
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setActualMarginSz(((uQO) gGvvIC()).AuCTelauCTel.AkhnZx());
            dNCPSb();
        }
        ((uQO) gGvvIC()).OcIXYQ.setValue(((ContractManuallyPresenter) dxcTrN()).AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH().getActualMarginSz(), ((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever()));
        ((uQO) gGvvIC()).AuCTelauCTel.removeCallbacks(this.fetchVPNInfo);
        if (!((uQO) gGvvIC()).OLrzqt.isChecked()) {
            QfsBiF();
        }
        ((ContractManuallyPresenter) dxcTrN()).AEQbTJ(true);
        DTwDnp();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DTwDnp() {
        if (((uQO) gGvvIC()).OLrzqt.isChecked()) {
            ((ContractManuallyPresenter) dxcTrN()).copydefault(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setExtraMarginSz(((uQO) gGvvIC()).AuCTel.AkhnZx());
        dNCPSb();
        ((uQO) gGvvIC()).OcIXYQ.setValue(((ContractManuallyPresenter) dxcTrN()).AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH().getActualMarginSz(), ((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever()));
        ((uQO) gGvvIC()).AuCTel.removeCallbacks(this.AhwBna);
        QfsBiF();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dNCPSb() {
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setSz(java.lang.String.valueOf(C33129mqd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH().getExtraMarginSz()) + C33129mqd.AEQbTJ(((ContractManuallyPresenter) dxcTrN()).uzCIH().getActualMarginSz())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        android.widget.TextView textView = ((uQO) gGvvIC()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        ((uQO) gGvvIC()).gEmmrt.setText(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        if (z) {
            return;
        }
        java.lang.String strGHZMYf = gHZMYf();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGHZMYf)) {
            ((uQO) gGvvIC()).fIwbmz.setInputErrorMsg(strGHZMYf);
            wPG.KWHzl.KWHzl();
        } else {
            isConnected();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AxsJAY() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
            strategyBaseReq.setInstId(((ContractManuallyPresenter) dxcTrN()).fvQaOB().gEmmrt());
            strategyBaseReq.setOrdType("contract_grid");
            BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = BotOrderConfirmFragment.Companion.copydefault(((ContractManuallyPresenter) dxcTrN()).fvQaOB().gEmmrt(), ((ContractManuallyPresenter) dxcTrN()).fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, ((ContractManuallyPresenter) dxcTrN()).uzCIH(), (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(((ContractManuallyPresenter) dxcTrN()).copydefault().getValue()), (DcaOrderReq) null, (AiOrderReq) null, 28654, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            java.lang.String simpleName = BotOrderConfirmFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            C49662usl.EZpvd(botOrderConfirmFragmentCopydefault, childFragmentManager, simpleName);
            return;
        }
        pUU.KWHzl("BotOrder", "二次确认功能关闭 ContractManuallyGridFragment Start Order");
        ((ContractManuallyPresenter) dxcTrN()).OLrzqt(((uQO) gGvvIC()).OLrzqt.isChecked(), true);
    }

    public final void aKErDB() {
        if (getContext() == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(getString(C55688xof.Application.onRetainNonConfigurationInstance));
        viewOnClickListenerC54939xaY.EZpvd(getString(C55688xof.Application.onRetainCustomNonConfigurationInstance));
        java.lang.String string = getString(C55688xof.Application.itxZVF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.copydefault(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = getString(C55688xof.Application.processStrongAuthMessage);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.vJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50312vJt.AhwBna(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C50312vJt c50312vJt, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c50312vJt.AxsJAY();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        final C47988uAv c47988uAv = ((uQO) gGvvIC()).zLjUOn;
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.vKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.OLrzqt(c47988uAv, this);
            }
        }));
        final C47988uAv c47988uAv2 = ((uQO) gGvvIC()).AubY;
        c47988uAv2.KWHzl(new uBH(new Function0() { // from class: o.vKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50312vJt.KWHzl(c47988uAv2, this);
            }
        }));
        ((uQO) gGvvIC()).AuCTelauCTel.KWHzl(this.isConnected);
        ((uQO) gGvvIC()).AuCTel.KWHzl(this.DbNXlk);
        hUfVAv().OLrzqt();
        isConnected();
        AxsJAYaxsJAY().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C47988uAv c47988uAv, C50312vJt c50312vJt) {
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            c50312vJt.OcIXYQ();
        }
        c50312vJt.fvQaOB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C47988uAv c47988uAv, C50312vJt c50312vJt) {
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().gEmmrt(), ((ContractManuallyPresenter) c50312vJt.dxcTrN()).fvQaOB().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            c50312vJt.OcIXYQ();
        }
        c50312vJt.fvQaOB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.Map<C47988uAv, java.lang.String> iZzfmt() {
        if (giSNqX()) {
            return C56424yEw.gEmmrt(C56390yDp.OLrzqt(((uQO) gGvvIC()).zLjUOn, "minPrice"), C56390yDp.OLrzqt(((uQO) gGvvIC()).AubY, "maxPrice"), C56390yDp.OLrzqt(((uQO) gGvvIC()).fIwbmz, "gridNum"), C56390yDp.OLrzqt(((uQO) gGvvIC()).AuCTelauCTel, "marginAmt"), C56390yDp.OLrzqt(((uQO) gGvvIC()).AuCTel, "ilAutoReserveInput"));
        }
        return C56424yEw.KWHzl();
    }

    private final C53519wmy AxsJAYaxsJAY() {
        return (C53519wmy) this.KWHzl.getValue();
    }

    public static final C53519wmy ejfBZ(C50312vJt c50312vJt) {
        return new C53519wmy(c50312vJt.iZzfmt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OcIXYQ() {
        BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setMinPx(C56033xvF.KWHzl(((uQO) gGvvIC()).zLjUOn.AkhnZx(), bizInstrumentAhwBna));
        ((ContractManuallyPresenter) dxcTrN()).uzCIH().setMaxPx(C56033xvF.KWHzl(((uQO) gGvvIC()).AubY.AkhnZx(), bizInstrumentAhwBna));
        ((uQO) gGvvIC()).EZpvd.OLrzqt();
        ((ContractManuallyPresenter) dxcTrN()).ejfBZ();
        java.lang.Boolean boolSSMYrx = ((ContractManuallyPresenter) dxcTrN()).sSMYrx();
        if (Intrinsics.EZpvd(boolSSMYrx, java.lang.Boolean.TRUE)) {
            values();
            if (!((uQO) gGvvIC()).OLrzqt.isChecked()) {
                QfsBiF();
            }
            DTwDnp();
            android.widget.TextView textView = ((uQO) gGvvIC()).QOLQEE;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(sSMYrx() ^ true ? 0 : 8);
            ((ContractManuallyPresenter) dxcTrN()).AEQbTJ(true);
            return;
        }
        if (!Intrinsics.EZpvd(boolSSMYrx, java.lang.Boolean.FALSE)) {
            if (boolSSMYrx != null) {
                throw new NoWhenBranchMatchedException();
            }
            values();
        } else {
            C47988uAv.setInputErrorMsg$default(((uQO) gGvvIC()).zLjUOn, null, 1, null);
            C47988uAv.setInputErrorMsg$default(((uQO) gGvvIC()).AubY, null, 1, null);
            java.lang.String string = getString(C55688xof.Application.setLogo);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(string);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        ((uQO) gGvvIC()).zLjUOn.copydefault();
        ((uQO) gGvvIC()).AubY.copydefault();
        OLrzqt("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        ((ContractManuallyPresenter) dxcTrN()).AEQbTJ();
        ((uQO) gGvvIC()).hDKMBd.KWHzl(((ContractManuallyPresenter) dxcTrN()).fvQaOB().gEmmrt(), ((ContractManuallyPresenter) dxcTrN()).fvQaOB().djBIcL());
        QUSxYX();
        QKudOq();
        AxsJAYsNCnLh();
        if (z) {
            if (((ContractManuallyPresenter) dxcTrN()).fARcdN().getValue() != null) {
                ((ContractManuallyPresenter) dxcTrN()).fARcdN().setValue(null);
            }
            clearContent$default(this, false, 1, null);
            ContractGridReq contractGridReqUzCIH = ((ContractManuallyPresenter) dxcTrN()).uzCIH();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            contractGridReqUzCIH.setOpenPosSlippageDefault(bool);
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setProfitSharingRatio("");
            ((ContractManuallyPresenter) dxcTrN()).uzCIH().setLever("5");
            ((uQO) gGvvIC()).hDKMBd.KWHzl(((ContractManuallyPresenter) dxcTrN()).uzCIH().getLever());
            C53549wnb c53549wnb = ((uQO) gGvvIC()).djBIcL;
            BizInstrument bizInstrumentAhwBna = ((ContractManuallyPresenter) dxcTrN()).fvQaOB().AhwBna();
            c53549wnb.copydefault(bizInstrumentAhwBna != null ? Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), bool) : false);
        }
        KWHzl(getArguments());
        if (z) {
            zuBGHE();
        }
        isConnected();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        AxsJAYaxsJAY().copydefault();
        wPG.KWHzl.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((uQO) gGvvIC()).EZpvd.setOpenPositionPostCheck(null);
        ((uQO) gGvvIC()).EZpvd.setSlippageControlSettings(null);
    }

    public final void OLrzqt(boolean z, C47988uAv c47988uAv) {
        if (z || !C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_GridQuantity_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z, final C47988uAv c47988uAv) {
        if (z || !C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_PriceRange_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.AEQbTJ(c47988uAv, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C47988uAv c47988uAv, C50312vJt c50312vJt, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "range_type", Intrinsics.EZpvd(c47988uAv, ((uQO) c50312vJt.gGvvIC()).zLjUOn) ? "lower" : "upper", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z, C47988uAv c47988uAv) {
        if (z || !C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return;
        }
        C32866mlf.onEvent$default("FuturesBotPlaceOrder_MarginLeverage_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.vKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50312vJt.copydefault(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        wPG wpg = wPG.KWHzl;
        ContractGridReq contractGridReqUzCIH = ((ContractManuallyPresenter) dxcTrN()).uzCIH();
        wpg.EZpvd(contractGridReqUzCIH.copy(((-97) & 1) != 0 ? contractGridReqUzCIH.instId : null, ((-97) & 2) != 0 ? contractGridReqUzCIH.instType : null, ((-97) & 4) != 0 ? contractGridReqUzCIH.basePos : null, ((-97) & 8) != 0 ? contractGridReqUzCIH.gridNum : null, ((-97) & 16) != 0 ? contractGridReqUzCIH.investType : null, ((-97) & 32) != 0 ? contractGridReqUzCIH.maxPx : ((uQO) gGvvIC()).AubY.AkhnZx(), ((-97) & 64) != 0 ? contractGridReqUzCIH.minPx : ((uQO) gGvvIC()).zLjUOn.AkhnZx(), ((-97) & 128) != 0 ? contractGridReqUzCIH.sz : null, ((-97) & 256) != 0 ? contractGridReqUzCIH.runType : null, ((-97) & 512) != 0 ? contractGridReqUzCIH.slTriggerPx : null, ((-97) & 1024) != 0 ? contractGridReqUzCIH.tpTriggerPx : null, ((-97) & 2048) != 0 ? contractGridReqUzCIH.tpRatio : null, ((-97) & 4096) != 0 ? contractGridReqUzCIH.slRatio : null, ((-97) & 8192) != 0 ? contractGridReqUzCIH.tpOrdPx : null, ((-97) & 16384) != 0 ? contractGridReqUzCIH.slOrdPx : null, ((-97) & 32768) != 0 ? contractGridReqUzCIH.direction : null, ((-97) & 65536) != 0 ? contractGridReqUzCIH.displayName : null, ((-97) & 131072) != 0 ? contractGridReqUzCIH.lever : null, ((-97) & 262144) != 0 ? contractGridReqUzCIH.signParams : null, ((-97) & 524288) != 0 ? contractGridReqUzCIH.profitSharingRatio : null, ((-97) & 1048576) != 0 ? contractGridReqUzCIH.ordType : null, ((-97) & 2097152) != 0 ? contractGridReqUzCIH.annualizedRate : null, ((-97) & 4194304) != 0 ? contractGridReqUzCIH.autoTransfer : null, ((-97) & 8388608) != 0 ? contractGridReqUzCIH.systemSource : null, ((-97) & 16777216) != 0 ? contractGridReqUzCIH.nmpUnderlyingId : null, ((-97) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? contractGridReqUzCIH.batchNo : null, ((-97) & 67108864) != 0 ? contractGridReqUzCIH.voucherId : null, ((-97) & 134217728) != 0 ? contractGridReqUzCIH.autoReserve : null, ((-97) & 268435456) != 0 ? contractGridReqUzCIH.actualMarginSz : null, ((-97) & 536870912) != 0 ? contractGridReqUzCIH.extraMarginSz : null, ((-97) & 1073741824) != 0 ? contractGridReqUzCIH.contractGridVersion : null, ((-97) & Integer.MIN_VALUE) != 0 ? contractGridReqUzCIH.openPosSlippage : null, (15 & 1) != 0 ? contractGridReqUzCIH.openPosSlippageDefault : null, (15 & 2) != 0 ? contractGridReqUzCIH.ordVariant : null, (15 & 4) != 0 ? contractGridReqUzCIH.algoId : null, (15 & 8) != 0 ? contractGridReqUzCIH.topupActualMarginSz : null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = ((uQO) gGvvIC()).gHZMYf.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncher) + " (" + str3 + ")");
            }
            C47988uAv.setInputLabel$default(((uQO) gGvvIC()).fIwbmz, str3, null, 2, null);
            return;
        }
        C55312xha c55312xhaValueOf2 = ((uQO) gGvvIC()).gHZMYf.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncher));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DarRvM() {
        StrategyConfigInfo value = ((ContractManuallyPresenter) dxcTrN()).copydefault().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uQO) gGvvIC()).RJOkX;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, value, (30 & 2) != 0 ? false : false, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QbewEr() {
        if (SPUtils.getBoolean("hedging_tab_tip", true)) {
            SPUtils.put("hedging_tab_tip", java.lang.Boolean.FALSE);
            android.content.Context context = getContext();
            if (context != null) {
                C52812wZg c52812wZg = new C52812wZg(context);
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(((uQO) gGvvIC()).djBIcL.OLrzqt());
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fkESqH));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.Swccd));
                c52812wZg.AEQbTJ(stateListAnimator);
                C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setVisibility(8);
                }
                c52812wZg.OLrzqt(1);
                c52812wZg.fARcdN();
                C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OEsIKP));
                }
            }
        }
    }

    public static /* synthetic */ java.lang.String getFormatedRatio$default(C50312vJt c50312vJt, java.lang.String str, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.FLOOR;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return c50312vJt.OLrzqt(str, roundingMode, z);
    }

    private final java.lang.String OLrzqt(java.lang.String str, RoundingMode roundingMode, boolean z) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        if (z) {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return xmr.copydefault(str, 2, 0, roundingMode);
        }
        xMR xmr2 = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr2.EZpvd(str, 2, 0, roundingMode);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50312vJt c50312vJt, java.util.List list) {
        java.lang.Object obj;
        android.os.Parcelable parcelableAEQbTJ;
        boolean zEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            SmartRecommendResp smartRecommendResp = (SmartRecommendResp) next;
            java.lang.Boolean value = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).OcIXYQ().getValue();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(value, bool)) {
                StgyParam stgyParam = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam != null ? stgyParam.getDirection() : null, (java.lang.Object) "neutral");
            } else if (Intrinsics.EZpvd(((ContractManuallyPresenter) c50312vJt.dxcTrN()).ORxRYg().getValue(), bool) || Intrinsics.EZpvd(((ContractManuallyPresenter) c50312vJt.dxcTrN()).AxsJAY().getValue(), bool)) {
                StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam2 != null ? stgyParam2.getDirection() : null, (java.lang.Object) "short");
            } else {
                StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam3 != null ? stgyParam3.getDirection() : null, (java.lang.Object) "long");
            }
            if (zEZpvd) {
                obj = next;
                break;
            }
        }
        SmartRecommendResp smartRecommendResp2 = (SmartRecommendResp) obj;
        if (smartRecommendResp2 != null && (parcelableAEQbTJ = BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp2)) != null) {
            Intrinsics.copydefault(parcelableAEQbTJ, "");
            AIData aIData = (AIData) parcelableAEQbTJ;
            aIData.setSignParams(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getSignParams());
            aIData.setTpPx(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getTpTriggerPx());
            aIData.setSlPx(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getSlTriggerPx());
            aIData.setTpRatio(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getTpRatio());
            aIData.setSlRatio(((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getSlRatio());
            java.lang.Boolean basePos = ((ContractManuallyPresenter) c50312vJt.dxcTrN()).uzCIH().getBasePos();
            aIData.setBasePos(basePos != null ? basePos.booleanValue() : true);
            c50312vJt.AEQbTJ(aIData);
        }
        return Unit.INSTANCE;
    }
}
