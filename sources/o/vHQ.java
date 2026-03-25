package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.video.AudioStats;
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
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.biz.TacticsType;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.GridReq;
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
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.xMJ;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public final class vHQ extends AbstractC49945uyC<uMR, ContractManuallyPresenter> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final java.lang.Runnable AYXKKw;
    public final Function2<C47988uAv, java.lang.String, Unit> AhwBna;
    public final uBH AkhnZx;
    public ActivityResultLauncher<android.content.Intent> AuCTel;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> DbNXlk;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> KWHzl;
    public java.lang.String OLrzqt;
    public final int djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public final java.util.ArrayList<vSX> fJNWhG;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fetchVPNInfo;
    public final boolean gEmmrt;
    public final java.lang.Runnable isConnected;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> valueOf;
    public final uBH values;

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.gEmmrt;
    }

    public static final /* synthetic */ uMR AYXKKw(vHQ vhq) {
        return vhq.values();
    }

    public vHQ() {
        final Function0 function0 = new Function0() { // from class: o.vHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vHQ.isConnected(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridQuickOrderDialog$special$$inlined$viewModels$default$1
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridQuickOrderDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridQuickOrderDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridQuickOrderDialog$special$$inlined$viewModels$default$4
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
        this.gEmmrt = true;
        this.djBIcL = C48033uCm.Activity.gHZMYf;
        this.OLrzqt = "";
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.DbNXlk = new kotlin.Pair<>(bool, "");
        this.isConnected = new java.lang.Runnable() { // from class: o.vHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vHQ.fetchVPNInfo(this.OLrzqt);
            }
        };
        this.KWHzl = new kotlin.Pair<>(bool, "");
        this.AYXKKw = new java.lang.Runnable() { // from class: o.vHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vHQ.values(this.KWHzl);
            }
        };
        this.fetchVPNInfo = new kotlin.Pair<>(java.lang.Boolean.FALSE, "");
        this.valueOf = new Function2() { // from class: o.vHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vHQ.copydefault(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.AhwBna = new Function2() { // from class: o.vHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vHQ.copydefault(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.values = new uBH(new Function0() { // from class: o.vHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vHQ.DbNXlk(this.copydefault);
            }
        });
        this.AkhnZx = new uBH(new Function0() { // from class: o.vIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vHQ.AkhnZx(this.KWHzl);
            }
        });
        this.fJNWhG = new java.util.ArrayList<>();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vHQ.isConnected();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vPY zLjUOn() {
        return (vPY) this.fIwbmz.getValue();
    }

    public static final ViewModelStoreOwner isConnected(vHQ vhq) {
        androidx.fragment.app.Fragment parentFragment = vhq.getParentFragment();
        return parentFragment != null ? parentFragment : vhq;
    }

    public static final void fetchVPNInfo(vHQ vhq) {
        if (vhq.DbNXlk.getFirst().booleanValue()) {
            vhq.values().fARcdN.copydefault();
        } else {
            vhq.values().fARcdN.setInputErrorMsg(vhq.DbNXlk.getSecond());
        }
    }

    public static final void values(vHQ vhq) {
        if (vhq.KWHzl.getFirst().booleanValue()) {
            vhq.values().djBIcL.copydefault();
        } else {
            vhq.values().djBIcL.setInputErrorMsg(vhq.KWHzl.getSecond());
        }
    }

    public final ActivityResultLauncher<android.content.Intent> fJNWhG() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                vHQ.AEQbTJ(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void AEQbTJ(vHQ vhq, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null || !extras.getBoolean("bot_kline")) {
            return;
        }
        vhq.zLjUOn().KWHzl().setValue(new BotGridOrderDialogData((java.lang.String) null, vhq.OLrzqt().uzCIH().getMaxPx(), vhq.OLrzqt().uzCIH().getMinPx(), vhq.OLrzqt().uzCIH().getGridNum(), wPG.KWHzl.OLrzqt(vhq.OLrzqt().uzCIH()), false, vhq.OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null));
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vHQ EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, vHQ vhq) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = vhq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, LoaderManager.KWHzl, 1, (java.lang.Object) null);
                android.widget.TextView textView = vHQ.AYXKKw(this.EZpvd).AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() != 0) {
                    if (!this.EZpvd.ORxRYg()) {
                        uMR umrAYXKKw = vHQ.AYXKKw(this.EZpvd);
                        C49967uyY c49967uyY = C49967uyY.EZpvd;
                        C47988uAv c47988uAv = umrAYXKKw.fARcdN;
                        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, yDY.gEmmrt(umrAYXKKw.fARcdN, umrAYXKKw.djBIcL));
                        return;
                    }
                    C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new PendingIntent(C54589xNz.EZpvd.EZpvd() ? "demo" : "live"), 1, (java.lang.Object) null);
                    this.EZpvd.getNewProxyInstance();
                    return;
                }
                C56002xub.KWHzl.OLrzqt();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vHQ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vHQ vhq) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = vhq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = null;
                C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, ActionBar.AEQbTJ, 1, (java.lang.Object) null);
                BotRecommendPresenter.Activity activity = BotRecommendPresenter.Companion;
                SmartRecommendResp value = this.AEQbTJ.zLjUOn().copydefault().getValue();
                if (value == null) {
                    value = new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null);
                }
                android.os.Parcelable parcelableAEQbTJ = activity.AEQbTJ(value);
                Intrinsics.copydefault(parcelableAEQbTJ, "");
                AIData aIData = (AIData) parcelableAEQbTJ;
                aIData.setProfitSharingRatio(this.AEQbTJ.OLrzqt().uzCIH().getProfitSharingRatio());
                aIData.setQuoteSz(vHQ.AYXKKw(this.AEQbTJ).fARcdN.AkhnZx());
                aIData.setLever(this.AEQbTJ.OLrzqt().uzCIH().getLever());
                aIData.setCbAutoReserve(java.lang.Boolean.valueOf(vHQ.AYXKKw(this.AEQbTJ).copydefault.isChecked()));
                aIData.setExtraMarginSz(this.AEQbTJ.OLrzqt().uzCIH().getExtraMarginSz());
                aIData.setToManual(true);
                C56058xve.Companion.copydefault().KWHzl("kline_grid_btn", (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
                BotTradeData botTradeData = new BotTradeData("contract_grid", this.AEQbTJ.OLrzqt().fvQaOB().gEmmrt(), this.AEQbTJ.OLrzqt().fvQaOB().djBIcL(), parcelableAEQbTJ, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 496, (DefaultConstructorMarker) null);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ActivityResultLauncher activityResultLauncher2 = this.AEQbTJ.AuCTel;
                    if (activityResultLauncher2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        activityResultLauncher = activityResultLauncher2;
                    }
                    activityResultLauncher.launch(ActivityC52122vzt.Companion.AEQbTJ(context, botTradeData, (AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID & 4) != 0 ? null : null, (AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID & 8) != 0 ? null : "bot_quick_order_dialog", (AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID & 16) != 0 ? null : null, (AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID & 32) != 0 ? null : null, (AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID & 64) != 0 ? null : null));
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vHQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vHQ vhq) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = vhq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.setVolumeTo));
                java.lang.String string = this.OLrzqt.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final Unit copydefault(vHQ vhq, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.EZpvd(c47988uAv, vhq.values().fARcdN);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vHQ vhq, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, vhq.values().fARcdN)) {
            vhq.getFieldNames();
            vhq.QbewEr();
        } else if (Intrinsics.EZpvd(c47988uAv, vhq.values().djBIcL)) {
            vhq.QfsBiF();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(vHQ vhq) {
        vhq.QOLQEE();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(vHQ vhq) {
        vhq.uzCIH();
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        if (values().fARcdN.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(values().fARcdN, false, 1, null);
        }
    }

    private final void KWHzl(boolean z, boolean z2) {
        vKO vko = values().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(vko, "");
        vko.setVisibility(z ? 0 : 8);
        vKO vko2 = values().iwGUEr;
        Intrinsics.checkNotNullExpressionValue(vko2, "");
        vko2.setVisibility(z2 ? 0 : 8);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vHQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final vHQ copydefault(@NotNull SmartRecommendResp smartRecommendResp) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            vHQ vhq = new vHQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_copy_req", smartRecommendResp);
            vhq.setArguments(bundle);
            return vhq;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault(getArguments());
        OcIXYQ();
        RJOkX();
        sSMYrx();
        zuBGHE();
        AxsJAY();
        AuCTelauCTel();
        gHZMYf();
        AwvSrB();
        zuBGHE();
        QUSxYX();
        ejfBZ();
        fIwbmz();
        djSkpj();
        RcXXUw();
        values().ejfBZ.setOnTouchListener(new View.OnTouchListener() { // from class: o.vIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return vHQ.EZpvd(view2, motionEvent);
            }
        });
        values().ejfBZ.setNestedScrollingEnabled(true);
    }

    public static final boolean EZpvd(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ("contract_grid");
        if (tacticsTypeAEQbTJ != null && (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) != null) {
            wxq.setTitle(strAYXKKw);
        }
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new Dialog(wyf, 1000L, this));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OFhtUX));
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vIC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vHQ.KWHzl(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager KWHzl = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "create", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        }
    }

    public static final class PendingIntent implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, this.KWHzl, false, 4, null);
        }
    }

    public static final void KWHzl(vHQ vhq, android.view.View view) {
        C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, new Function1() { // from class: o.vIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        vhq.zLjUOn().djBIcL().setValue(C50297vJe.Companion.OLrzqt());
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", "back", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        this.AuCTel = fJNWhG();
    }

    private final void OcIXYQ() {
        OLrzqt().uzCIH().setSignParams(OLrzqt().KWHzl());
        ContractManuallyPresenter contractManuallyPresenterOLrzqt = OLrzqt();
        java.lang.String instType = OLrzqt().uzCIH().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = OLrzqt().uzCIH().getInstId();
        contractManuallyPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        OLrzqt().fIwbmz();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().QKVWgx();
        C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_View", (TrackChannel[]) null, new Function1() { // from class: o.vIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void QOLQEE() {
        if (values().copydefault.isChecked()) {
            OLrzqt().uzCIH().setSz(values().fARcdN.AkhnZx());
        } else {
            OLrzqt().uzCIH().setActualMarginSz(values().fARcdN.AkhnZx());
            dNCPSb();
        }
        values().getNewProxyInstance.setValue(OLrzqt().AEQbTJ(OLrzqt().uzCIH().getActualMarginSz(), OLrzqt().uzCIH().getLever()));
        values().fARcdN.removeCallbacks(this.isConnected);
        QVAiDq();
        ContractManuallyPresenter.loadMinInvest$default(OLrzqt(), false, 1, null);
        if (values().copydefault.isChecked()) {
            ContractManuallyPresenter.getActualExtraMargin$default(OLrzqt(), false, 1, null);
        }
    }

    private final void uzCIH() {
        OLrzqt().uzCIH().setExtraMarginSz(values().djBIcL.AkhnZx());
        dNCPSb();
        values().getNewProxyInstance.setValue(OLrzqt().AEQbTJ(OLrzqt().uzCIH().getActualMarginSz(), OLrzqt().uzCIH().getLever()));
        values().djBIcL.removeCallbacks(this.AYXKKw);
        QVAiDq();
    }

    public static final void EZpvd(final vHQ vhq, final C47988uAv c47988uAv, final Function1<? super java.lang.String, java.lang.String> function1) {
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.KWHzl(c47988uAv, vhq, function1, ((java.lang.Float) obj).floatValue());
            }
        });
        c47988uAv.setOnTextChangeCallback(vhq.AhwBna);
        c47988uAv.setOnFocusChangeCallback(vhq.valueOf);
    }

    public static final Unit KWHzl(final C47988uAv c47988uAv, vHQ vhq, Function1 function1, float f) {
        if (!c47988uAv.zLjUOn()) {
            C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.vIe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    vHQ.copydefault(c47988uAv);
                }
            }, 200L);
        } else {
            vhq.values().fARcdN.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, (java.lang.String) function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(c47988uAv.fJNWhG()))), false, false, 6, null);
            vhq.values().fARcdN.setOnTextChangeCallback(vhq.AhwBna);
            vhq.QbewEr();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C47988uAv c47988uAv) {
        C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
    }

    private final void RJOkX() {
        C47988uAv c47988uAv = values().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        EZpvd(this, c47988uAv, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        if (bizInstrumentAhwBna != null) {
            values().valueOf.setTransferCoin(bizInstrumentAhwBna.getMarginSymbol());
            values().fARcdN.setInputUnit(bizInstrumentAhwBna.getMarginSymbol());
            values().fARcdN.setMaxDecimal(OLrzqt().AuCTelauCTel());
            values().djBIcL.setInputUnit(bizInstrumentAhwBna.getMarginSymbol());
            values().djBIcL.setMaxDecimal(OLrzqt().AuCTelauCTel());
            values().AYXKKw.setTransferCoin(bizInstrumentAhwBna.getMarginSymbol());
        }
        values().djBIcL.setOnTextChangeCallback(this.AhwBna);
        values().djBIcL.setOnFocusChangeCallback(this.valueOf);
    }

    public static final java.lang.String copydefault(vHQ vhq, java.lang.String str) {
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC54531xLw abstractC54531xLwAEQbTJ = vhq.OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            return "";
        }
        java.lang.String strValueOf = vhq.OLrzqt().fvQaOB().valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(str, vhq.OLrzqt().zLjUOn().getValue(), null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    private final C43316rmw zsXlph() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    private final void gHZMYf() {
        vSX vsx;
        BotUserConfigInfo botUserConfigInfoCopydefault;
        this.fJNWhG.clear();
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(OLrzqt().zuBGHE(), "contract_grid")) {
            InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
            java.util.List<java.lang.String> profitSharingRange = (interfaceC55881xsMCopydefault2 == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault2.copydefault()) == null) ? null : botUserConfigInfoCopydefault.getProfitSharingRange();
            java.lang.String strAYXKKw = OLrzqt().AYXKKw();
            pUU.KWHzl("Profit", "defaultProfitSharingRatio = " + strAYXKKw);
            if (profitSharingRange != null) {
                int i = 0;
                for (java.lang.Object obj : profitSharingRange) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strAYXKKw)) {
                        OLrzqt().uzCIH().setProfitSharingRatio(str);
                        vsx = new vSX(str, true, i);
                    } else {
                        vsx = new vSX(str, false, i);
                    }
                    this.fJNWhG.add(vsx);
                    i++;
                }
            }
            if (!this.fJNWhG.isEmpty()) {
                values().EZpvd.setVisibility(0);
                values().fJNWhG.setVisibility(0);
                C43316rmw c43316rmwZsXlph = zsXlph();
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c43316rmwZsXlph.register(vSX.class, new vSU(fragmentActivityRequireActivity, new Function1() { // from class: o.vIA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return vHQ.copydefault(this.OLrzqt, (vSX) obj2);
                    }
                }));
                RecyclerView recyclerView = values().fJNWhG;
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setLayoutManager(new GridLayoutManager(requireActivity(), this.fJNWhG.size()));
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.removeItemDecorationAt(0);
                }
                recyclerView.addItemDecoration(new C57584ylF(this.fJNWhG.size(), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null)));
                recyclerView.setAdapter(zsXlph());
                zsXlph().setItems(this.fJNWhG);
                return;
            }
        }
        values().EZpvd.setVisibility(8);
        values().fJNWhG.setVisibility(8);
    }

    public static final Unit copydefault(vHQ vhq, vSX vsx) {
        Intrinsics.checkNotNullParameter(vsx, "");
        for (vSX vsx2 : vhq.fJNWhG) {
            vhq.OLrzqt().uzCIH().setProfitSharingRatio(vsx.AEQbTJ());
            vsx2.AEQbTJ(vsx2.EZpvd() == vsx.EZpvd());
        }
        C33064mpR.OLrzqt(vhq.zsXlph(), (java.util.List<? extends java.lang.Object>) vhq.fJNWhG);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        android.widget.TextView textView = values().AuCTel;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar AEQbTJ = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "moresettings", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        }
    }

    private final void copydefault(android.os.Bundle bundle) {
        SmartRecommendResp smartRecommendResp = bundle != null ? (SmartRecommendResp) bundle.getParcelable("bot_copy_req") : null;
        if (!(smartRecommendResp instanceof SmartRecommendResp)) {
            smartRecommendResp = null;
        }
        if (smartRecommendResp == null) {
            return;
        }
        bundle.remove("bot_copy_req");
        android.os.Parcelable parcelableAEQbTJ = BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp);
        if (parcelableAEQbTJ != null) {
            ContractManuallyPresenter contractManuallyPresenterOLrzqt = OLrzqt();
            java.lang.String instType = smartRecommendResp.getInstType();
            if (instType == null) {
                instType = "";
            }
            java.lang.String instId = smartRecommendResp.getInstId();
            if (instId == null) {
                instId = "";
            }
            contractManuallyPresenterOLrzqt.OLrzqt(instType, instId);
            ContractGridReq contractGridReqUzCIH = OLrzqt().uzCIH();
            java.lang.String instId2 = smartRecommendResp.getInstId();
            if (instId2 == null) {
                instId2 = "";
            }
            contractGridReqUzCIH.setInstId(instId2);
            ContractGridReq contractGridReqUzCIH2 = OLrzqt().uzCIH();
            java.lang.String instType2 = smartRecommendResp.getInstType();
            contractGridReqUzCIH2.setInstType(instType2 != null ? instType2 : "");
            AIData aIData = (AIData) parcelableAEQbTJ;
            aIData.setSignParams(OLrzqt().uzCIH().getSignParams());
            aIData.setTpPx(OLrzqt().uzCIH().getTpTriggerPx());
            aIData.setSlPx(OLrzqt().uzCIH().getSlTriggerPx());
            aIData.setTpRatio(OLrzqt().uzCIH().getTpRatio());
            aIData.setSlRatio(OLrzqt().uzCIH().getSlRatio());
            java.lang.Boolean basePos = OLrzqt().uzCIH().getBasePos();
            aIData.setBasePos(basePos != null ? basePos.booleanValue() : true);
            copydefault(aIData);
            OLrzqt().uzCIH().setDirection(aIData.getDirection());
            ContractManuallyPresenter.loadMinInvest$default(OLrzqt(), false, 1, null);
            java.lang.String direction = aIData.getDirection();
            int iHashCode = direction.hashCode();
            if (iHashCode == 3327612) {
                if (direction.equals("long")) {
                    KWHzl(true, false);
                }
            } else if (iHashCode == 109413500) {
                if (direction.equals("short")) {
                    KWHzl(false, true);
                }
            } else if (iHashCode == 1844321735 && direction.equals("neutral")) {
                KWHzl(true, true);
            }
        }
    }

    private final void copydefault(AIData aIData) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAYXKKw2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ != null) {
            java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf);
            if (xmsGEmmrt != null && (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(aIData.getMinPx())) != null) {
                C54536xML.toSafeString$default(c54536xMLAYXKKw2, false, 1, null);
            }
        }
        if (abstractC54531xLwAEQbTJ != null) {
            java.lang.String strValueOf2 = OLrzqt().fvQaOB().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf2 != null ? strValueOf2 : "");
            if (xmsGEmmrt2 != null && (c54536xMLAYXKKw = xmsGEmmrt2.AYXKKw(aIData.getMaxPx())) != null) {
                C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
            }
        }
        OLrzqt().uzCIH().setLever(C33129mqd.formatS$default(aIData.getLever(), 2, java.lang.Boolean.FALSE, null, 4, null));
        OLrzqt().uzCIH().setGridNum(C33129mqd.formatS$default(aIData.getGridNum(), 0, null, null, 6, null));
        OLrzqt().uzCIH().setMinPx(aIData.getMinPx());
        OLrzqt().uzCIH().setMaxPx(aIData.getMaxPx());
        values().fetchVPNInfo.KWHzl(OLrzqt().uzCIH().getLever());
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) aIData.getProfitSharingRatio())) {
            OLrzqt().uzCIH().setProfitSharingRatio(aIData.getProfitSharingRatio());
        }
        OLrzqt().uzCIH().setBasePos(Intrinsics.EZpvd((java.lang.Object) OLrzqt().uzCIH().getDirection(), (java.lang.Object) "neutral") ? null : java.lang.Boolean.valueOf(aIData.getBasePos()));
    }

    private final void zuBGHE() {
        uMR umrValues = values();
        C49960uyR.setWindowSoftInput$default(this, umrValues.valueOf, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), umrValues.fARcdN, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, umrValues.djBIcL, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), umrValues.djBIcL, 0, 8, (java.lang.Object) null);
    }

    private final void sSMYrx() {
        C55258xgZ c55258xgZ = values().EZpvd;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    private final void AxsJAY() {
        values().fetchVPNInfo.KWHzl(OLrzqt().uzCIH().getLever());
    }

    private final void AuCTelauCTel() {
        values().copydefault.setChecked(true);
        C53539wnR c53539wnR = values().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
        c53539wnR.setVisibility(0);
        values().AYXKKw.setFooterAvaValueGravity(8388613);
        values().AYXKKw.setFooterAvaValue("--");
        android.widget.TextView textView = values().getFieldNames;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = values().uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        android.widget.LinearLayout linearLayout = values().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C47988uAv c47988uAv = values().djBIcL;
        BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        c47988uAv.setInputUnit(bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null);
        C47988uAv.setInputLabel$default(values().djBIcL, ">= " + xMR.copydefault.copydefault("0"), null, 2, null);
        C55320xhi c55320xhi = values().AhwBna;
        c55320xhi.gEmmrt();
        C8003auW.copydefault(c55320xhi).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.vId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                vHQ.AEQbTJ(this.copydefault, obj);
            }
        });
        values().copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vHQ.AEQbTJ(this.copydefault, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(vHQ vhq, java.lang.Object obj) {
        android.content.Context contextRequireContext = vhq.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.reset);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DQzvGNdrmXxudrmXxu));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.vIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vHQ.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(vHQ vhq, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            C53539wnR c53539wnR = vhq.values().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
            c53539wnR.setVisibility(0);
            android.widget.LinearLayout linearLayout = vhq.values().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.TextView textView = vhq.values().getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            vhq.OLrzqt().OLrzqt(true);
            vhq.OLrzqt().uzCIH().setSz(vhq.values().fARcdN.AkhnZx());
            ContractManuallyPresenter.getActualExtraMargin$default(vhq.OLrzqt(), false, 1, null);
        } else {
            C53539wnR c53539wnR2 = vhq.values().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c53539wnR2, "");
            c53539wnR2.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = vhq.values().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            android.widget.TextView textView2 = vhq.values().getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            vhq.OLrzqt().OLrzqt(false);
            vhq.dNCPSb();
            vhq.OLrzqt().uzCIH().setActualMarginSz(vhq.values().fARcdN.AkhnZx());
        }
        ContractManuallyPresenter.loadMinInvest$default(vhq.OLrzqt(), false, 1, null);
        vhq.values().getNewProxyInstance.setValue(vhq.OLrzqt().AEQbTJ(vhq.OLrzqt().uzCIH().getActualMarginSz(), vhq.OLrzqt().uzCIH().getLever()));
    }

    private final void AwvSrB() {
        final uMR umrValues = values();
        umrValues.getNewProxyInstance.setTextTvGravity(8388613);
        umrValues.getNewProxyInstance.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        umrValues.getNewProxyInstance.setValue("--");
        umrValues.AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
        umrValues.AkhnZx.setValue("--");
        umrValues.iwGUEr.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
        umrValues.iwGUEr.setValue("--");
        umrValues.AkhnZx.EZpvd(true, new View.OnClickListener() { // from class: o.vHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vHQ.EZpvd(this.KWHzl, umrValues, view);
            }
        });
        umrValues.iwGUEr.EZpvd(true, new View.OnClickListener() { // from class: o.vHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vHQ.AEQbTJ(this.OLrzqt, umrValues, view);
            }
        });
    }

    public static final void EZpvd(vHQ vhq, uMR umr, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.removeAllTabs);
        android.content.Context contextRequireContext = vhq.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(umr.AkhnZx.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vHQ.gEmmrt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(vHQ vhq, uMR umr, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setCaptioningEnabled);
        android.content.Context contextRequireContext = vhq.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(umr.iwGUEr.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vHQ.AhwBna(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void QUSxYX() {
        values().fARcdN.KWHzl(this.values);
        values().djBIcL.KWHzl(this.AkhnZx);
        values().fetchVPNInfo.setCallback(new Function1() { // from class: o.vID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(vHQ vhq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vhq.OLrzqt().uzCIH().setLever(str);
        vhq.values().getNewProxyInstance.setValue(vhq.OLrzqt().AEQbTJ(vhq.OLrzqt().uzCIH().getActualMarginSz(), vhq.OLrzqt().uzCIH().getLever()));
        vhq.QVAiDq();
        ContractManuallyPresenter.loadMinInvest$default(vhq.OLrzqt(), false, 1, null);
        vhq.OLrzqt().ejfBZ();
        return Unit.INSTANCE;
    }

    private final void QVAiDq() {
        java.lang.String direction = OLrzqt().uzCIH().getDirection();
        if (direction != null) {
            int iHashCode = direction.hashCode();
            if (iHashCode != 3327612) {
                if (iHashCode != 109413500) {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        values().AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0));
                        values().iwGUEr.setTitle(C33070mpX.AYXKKw(C55688xof.Application.removeReporter));
                    }
                } else if (direction.equals("short")) {
                    values().iwGUEr.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                }
            } else if (direction.equals("long")) {
                values().AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
            }
        }
        ContractManuallyPresenter.requestLiqPrice$default(OLrzqt(), values().copydefault.isChecked(), false, false, false, 14, null);
    }

    private final void djSkpj() {
        TradeLiveData<StrategyResponse> tradeLiveDataWlaJM = OLrzqt().wlaJM();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataWlaJM.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.vIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.OLrzqt(this.KWHzl, (StrategyResponse) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataZsXlph = OLrzqt().zsXlph();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner2, new Fragment(new Function1() { // from class: o.vIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.EZpvd(this.OLrzqt, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataGEmmrt = OLrzqt().gEmmrt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.vIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.AEQbTJ(this.EZpvd, (MinInvestResp) obj);
            }
        }));
        C56111xwe<LiquidatePriceResponse> fieldNames = OLrzqt().getFieldNames();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        fieldNames.observe(viewLifecycleOwner4, new Fragment(new Function1() { // from class: o.vIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.KWHzl(this.AEQbTJ, (LiquidatePriceResponse) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner5, new Fragment(new Function1() { // from class: o.vIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.EZpvd(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataZLjUOn = OLrzqt().zLjUOn();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataZLjUOn.observe(viewLifecycleOwner6, new Fragment(new Function1() { // from class: o.vIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<ExtraActualMarginResp> tradeLiveDataIsConnected = OLrzqt().isConnected();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataIsConnected.observe(viewLifecycleOwner7, new Fragment(new Function1() { // from class: o.vIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.AEQbTJ(this.AEQbTJ, (ExtraActualMarginResp) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.vIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.EZpvd(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        OLrzqt().AubY().AkhnZx().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.vIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner8, new Fragment(new Function1() { // from class: o.vIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vHQ.OLrzqt(this.copydefault, (xMJ.Application) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vHQ vhq, StrategyResponse strategyResponse) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        xDM xdmEZpvd = vhq.OLrzqt().EZpvd();
        if (xdmEZpvd != null) {
            xdmEZpvd.KWHzl();
        }
        if (GridStartTriggerType.Companion.KWHzl(vhq.OLrzqt().uzCIH().getSignParams())) {
            RxBus.KWHzl(new vSS());
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strOLrzqt = vhq.zLjUOn().OLrzqt();
        java.lang.String strGEmmrt = vhq.OLrzqt().fvQaOB().gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_kline_quick_order", strOLrzqt, "contract_grid", strGEmmrt, "success", new BotGrafanaInfo(null, null, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 7, null));
        clearContent$default(vhq, false, 1, null);
        vhq.iwGUEr();
        FragmentActivity activity = vhq.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "grid", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vHQ vhq, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        java.lang.String strAEQbTJ = C56068xvo.copydefault.AEQbTJ(minInvestResp.getMinInvestment());
        C47988uAv.setInputLabel$default(vhq.values().fARcdN, "> " + strAEQbTJ, null, 2, null);
        vhq.hDKMBd();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vHQ vhq, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        vhq.fetchVPNInfo = new kotlin.Pair<>(java.lang.Boolean.FALSE, "");
        vhq.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vHQ vhq, LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        LiquidatePriceResponse liquidatePriceResponseEZpvd = vhq.OLrzqt().EZpvd(liquidatePriceResponse);
        vKO vko = vhq.values().AkhnZx;
        java.lang.String longLiqPx = liquidatePriceResponseEZpvd.getLongLiqPx();
        if (longLiqPx == null) {
            longLiqPx = "--";
        }
        vko.setValue(longLiqPx);
        vKO vko2 = vhq.values().iwGUEr;
        java.lang.String shortLiqPx = liquidatePriceResponseEZpvd.getShortLiqPx();
        vko2.setValue(shortLiqPx != null ? shortLiqPx : "--");
        android.widget.TextView textView = vhq.values().wlaJM;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(vhq.DTwDnp() ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vHQ vhq, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        ContractManuallyPresenter.loadMinInvest$default(vhq.OLrzqt(), false, 1, null);
        vhq.gHZMYf();
        vhq.UeEOUB();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(vHQ vhq, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = vhq.OLrzqt().fvQaOB().AEQbTJ();
        java.lang.String safeString$default = null;
        if (abstractC54531xLwAEQbTJ != null) {
            java.lang.String strValueOf = vhq.OLrzqt().fvQaOB().valueOf();
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
        vhq.values().valueOf.setFooterAvaValue(safeString$default);
        vhq.QbewEr();
        vhq.QfsBiF();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(vHQ vhq, ExtraActualMarginResp extraActualMarginResp) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel2;
        C54536xML c54536xMLDjBIcL2;
        Intrinsics.checkNotNullParameter(extraActualMarginResp, "");
        vhq.OLrzqt().uzCIH().setActualMarginSz(extraActualMarginResp.getActualMarginSz());
        vhq.OLrzqt().uzCIH().setExtraMarginSz(extraActualMarginResp.getExtraMarginSz());
        AbstractC54531xLw abstractC54531xLwAEQbTJ = vhq.OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = null;
        } else {
            java.lang.String strValueOf = vhq.OLrzqt().fvQaOB().valueOf();
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
        AbstractC54531xLw abstractC54531xLwAEQbTJ2 = vhq.OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ2 == null) {
            safeString$default2 = null;
        } else {
            java.lang.String strValueOf2 = vhq.OLrzqt().fvQaOB().valueOf();
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
            vhq.values().AYXKKw.setFooterAvaValue("--");
        } else {
            C53539wnR c53539wnR = vhq.values().AYXKKw;
            BizInstrument bizInstrumentAhwBna = vhq.OLrzqt().fvQaOB().AhwBna();
            c53539wnR.setFooterAvaValue(safeString$default + Marker.ANY_NON_NULL_MARKER + safeString$default2 + " " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null));
        }
        vhq.values().getNewProxyInstance.setValue(vhq.OLrzqt().AEQbTJ(vhq.OLrzqt().uzCIH().getActualMarginSz(), vhq.OLrzqt().uzCIH().getLever()));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vHQ vhq, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String msg;
        java.lang.String str = (java.lang.String) pair.first;
        java.lang.String str2 = "";
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vhq.OLrzqt().AhwBna().bB_())) {
            S s = pair.second;
            BizApiException bizApiException = s instanceof BizApiException ? (BizApiException) s : null;
            if (Intrinsics.EZpvd((java.lang.Object) (bizApiException != null ? bizApiException.getCode() : null), (java.lang.Object) "51399")) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                S s2 = pair.second;
                BizApiException bizApiException2 = s2 instanceof BizApiException ? (BizApiException) s2 : null;
                if (bizApiException2 != null && (msg = bizApiException2.getMsg()) != null) {
                    str2 = msg;
                }
                vhq.fetchVPNInfo = new kotlin.Pair<>(bool, str2);
                vhq.AuCTel();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vhq.OLrzqt().values().bB_())) {
            vhq.OLrzqt().getFieldNames().postValue(new LiquidatePriceResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vhq.OLrzqt().AubY().bB_())) {
            if (GridStartTriggerType.Companion.KWHzl(vhq.OLrzqt().uzCIH().getSignParams())) {
                vSO.Companion.copydefault(vhq.OLrzqt().fvQaOB().djBIcL(), vhq.OLrzqt().fvQaOB().gEmmrt()).show(vhq.getChildFragmentManager(), "BotOrderFailedDialog");
            } else {
                C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            java.lang.String strOLrzqt = vhq.zLjUOn().OLrzqt();
            java.lang.String strGEmmrt = vhq.OLrzqt().fvQaOB().gEmmrt();
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            java.lang.String str3 = message == null ? "" : message;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_kline_quick_order", strOLrzqt, "contract_grid", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str3, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vhq.OLrzqt().AuCTel().bB_())) {
            vhq.OLrzqt().fARcdN().setValue(null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vhq.OLrzqt().fetchVPNInfo().bB_())) {
            vhq.OLrzqt().isConnected().postValue(new ExtraActualMarginResp("", ""));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vHQ vhq, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            AbstractC49945uyC.showLoading$default(vhq, 0L, 1, null);
        } else {
            vhq.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vHQ vhq, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        vhq.OLrzqt = application.AYXKKw();
        return Unit.INSTANCE;
    }

    private final void RcXXUw() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vHQ.KWHzl(this.copydefault, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vHQ.EZpvd(this.OLrzqt, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vHQ.gEmmrt(this.copydefault, str, bundle);
            }
        });
    }

    public static final void KWHzl(vHQ vhq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = vhq.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
        vhq.OLrzqt().QVAiDq();
    }

    public static final void EZpvd(vHQ vhq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vhq.copydefault(bundle);
        vhq.OLrzqt().QfsBiF();
    }

    public static final void gEmmrt(vHQ vhq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContractManuallyPresenter.order$default(vhq.OLrzqt(), vhq.values().copydefault.isChecked(), false, 2, null);
    }

    private final void iwGUEr() {
        zLjUOn().AEQbTJ().setValue(java.lang.Boolean.TRUE);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ORxRYg() {
        if (!values().fARcdN.KWHzl()) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)))), 0, 1, (java.lang.Object) null);
            values().fARcdN.zsXlph();
            return false;
        }
        if (!AuCTel()) {
            values().fARcdN.zsXlph();
            return false;
        }
        if (fARcdN()) {
            return OLrzqt().zLjUOn().getValue() == null || !C33129mqd.AEQbTJ(OLrzqt().uzCIH().getSz(), OLrzqt().zLjUOn().getValue());
        }
        values().djBIcL.zsXlph();
        return false;
    }

    public static /* synthetic */ void clearContent$default(vHQ vhq, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        vhq.EZpvd(z);
    }

    private final void EZpvd(boolean z) {
        C47988uAv.setInputContent$default(values().fARcdN, "", false, false, 6, null);
        C47988uAv.setInputContent$default(values().djBIcL, "", false, false, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void hDKMBd() {
        java.lang.String str;
        java.lang.String strAkhnZx = values().fARcdN.AkhnZx();
        if (C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
            str = null;
        } else {
            MinInvestResp value = OLrzqt().zsXlph().getValue();
            if (!C33129mqd.valueOf(strAkhnZx, value != null ? value.getMinInvestment() : null)) {
                str = values().fARcdN.fARcdN() + ":" + strAkhnZx;
            }
        }
        ContractManuallyPresenter.checkMaxInvestWithMargin$default(OLrzqt(), str, false, 2, null);
    }

    private final boolean AuCTel() {
        this.DbNXlk = AubY();
        C47988uAv c47988uAv = values().fARcdN;
        c47988uAv.removeCallbacks(this.isConnected);
        c47988uAv.postDelayed(this.isConnected, 500L);
        return this.DbNXlk.getFirst().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlin.Pair<java.lang.Boolean, java.lang.String> AubY() {
        java.lang.String safeString$default;
        java.lang.String strCopydefault;
        java.lang.String minInvestment;
        C54536xML c54536xMLAuCTel;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = "";
        } else {
            java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                MinInvestResp value = OLrzqt().zsXlph().getValue();
                if (value == null || (minInvestment = value.getMinInvestment()) == null) {
                    minInvestment = "";
                }
                C54536xML c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(minInvestment);
                if (c54536xMLOLrzqt == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
                }
            }
        }
        if (this.fetchVPNInfo.getFirst().booleanValue() || (C33129mqd.OLrzqt((java.lang.CharSequence) values().fARcdN.AkhnZx()) && C33129mqd.valueOf(values().fARcdN.AkhnZx(), safeString$default))) {
            if (this.fetchVPNInfo.getFirst().booleanValue()) {
                strCopydefault = this.fetchVPNInfo.getSecond();
            } else {
                int i = C55688xof.Application.ActivityResultContractsPickVisualMedia;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default));
                pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(safeString$default));
                BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
                java.lang.String marginSymbol = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null;
                pairArr[2] = C56390yDp.OLrzqt("unit", marginSymbol != null ? marginSymbol : "");
                strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strCopydefault);
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean DTwDnp() {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        int iHashCode;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf = null;
        } else {
            java.lang.String strValueOf3 = OLrzqt().fvQaOB().valueOf();
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf3);
            if (xmsGEmmrt != null) {
                strValueOf = xmsGEmmrt.valueOf(OLrzqt().uzCIH().getMaxPx());
            }
        }
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf2 = null;
        } else {
            java.lang.String strValueOf4 = OLrzqt().fvQaOB().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf4 != null ? strValueOf4 : "");
            if (xmsGEmmrt2 != null) {
                strValueOf2 = xmsGEmmrt2.valueOf(OLrzqt().uzCIH().getMinPx());
            }
        }
        LiquidatePriceResponse value = OLrzqt().getFieldNames().getValue();
        java.lang.String longLiqPx = value != null ? value.getLongLiqPx() : null;
        LiquidatePriceResponse value2 = OLrzqt().getFieldNames().getValue();
        java.lang.String shortLiqPx = value2 != null ? value2.getShortLiqPx() : null;
        java.lang.String direction = OLrzqt().uzCIH().getDirection();
        return direction != null && ((iHashCode = direction.hashCode()) == 3327612 ? direction.equals("long") && (longLiqPx == null || longLiqPx.length() == 0 || OLrzqt().uzCIH().getMaxPx().length() == 0 || OLrzqt().uzCIH().getMinPx().length() == 0 || C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, strValueOf2)) : !(iHashCode == 109413500 ? !(direction.equals("short") && (longLiqPx == null || longLiqPx.length() == 0 || OLrzqt().uzCIH().getMaxPx().length() == 0 || OLrzqt().uzCIH().getMinPx().length() == 0 || C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, strValueOf2))) : !(iHashCode == 1844321735 && direction.equals("neutral") && (((longLiqPx == null || longLiqPx.length() == 0) && (shortLiqPx == null || shortLiqPx.length() == 0)) || OLrzqt().uzCIH().getMaxPx().length() == 0 || OLrzqt().uzCIH().getMinPx().length() == 0 || ((C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, strValueOf2)) && (C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, strValueOf2)))))));
    }

    private final void QbewEr() {
        if (values().copydefault.isChecked()) {
            android.widget.TextView textView = values().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((OLrzqt().zLjUOn().getValue() == null || !C33129mqd.AEQbTJ(values().fARcdN.AkhnZx(), OLrzqt().zLjUOn().getValue())) ? 8 : 0);
        } else {
            double dAEQbTJ = C33129mqd.AEQbTJ(values().fARcdN.AkhnZx());
            double dAEQbTJ2 = C33129mqd.AEQbTJ(values().djBIcL.AkhnZx());
            double dAEQbTJ3 = OLrzqt().zLjUOn().getValue() != null ? C33129mqd.AEQbTJ(OLrzqt().zLjUOn().getValue()) : AudioStats.AUDIO_AMPLITUDE_NONE;
            android.widget.TextView textView2 = values().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3 ? 8 : 0);
        }
    }

    private final void QfsBiF() {
        if (values().copydefault.isChecked()) {
            return;
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(values().fARcdN.AkhnZx());
        double dAEQbTJ2 = C33129mqd.AEQbTJ(values().djBIcL.AkhnZx());
        double dAEQbTJ3 = OLrzqt().zLjUOn().getValue() != null ? C33129mqd.AEQbTJ(OLrzqt().zLjUOn().getValue()) : AudioStats.AUDIO_AMPLITUDE_NONE;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) values().djBIcL.AkhnZx());
        android.widget.TextView textView = values().getFieldNames;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(((zOLrzqt ^ true) || dAEQbTJ2 < 0.3d * dAEQbTJ) ? 0 : 8);
        android.widget.TextView textView2 = values().uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(dAEQbTJ2 + dAEQbTJ > dAEQbTJ3 ? 0 : 8);
    }

    private final boolean fARcdN() {
        if (values().copydefault.isChecked()) {
            return true;
        }
        this.KWHzl = wlaJM();
        C47988uAv c47988uAv = values().djBIcL;
        c47988uAv.removeCallbacks(this.AYXKKw);
        c47988uAv.postDelayed(this.AYXKKw, 500L);
        return this.KWHzl.getFirst().booleanValue();
    }

    private final kotlin.Pair<java.lang.Boolean, java.lang.String> wlaJM() {
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getNewProxyInstance() {
        if (!DTwDnp()) {
            aKErDB();
        } else {
            QKVWgx();
        }
    }

    private final void aKErDB() {
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
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vHQ.copydefault(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = getString(C55688xof.Application.processStrongAuthMessage);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.vIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vHQ.AYXKKw(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(vHQ vhq, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        vhq.QKVWgx();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void QKVWgx() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
            strategyBaseReq.setInstId(OLrzqt().fvQaOB().gEmmrt());
            strategyBaseReq.setOrdType("contract_grid");
            AbstractC50583vTu abstractC50583vTuCopydefault = AbstractC50583vTu.Companion.copydefault(OLrzqt().fvQaOB().gEmmrt(), OLrzqt().fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, OLrzqt().uzCIH(), (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(OLrzqt().copydefault().getValue()), (DcaOrderReq) null, (AiOrderReq) null, 28654, (DefaultConstructorMarker) null), true);
            if (abstractC50583vTuCopydefault != null) {
                abstractC50583vTuCopydefault.show(getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
                return;
            }
            return;
        }
        pUU.KWHzl("BotOrder", "二次确认功能关闭 ContractManuallyGridFragment Start Order");
        ContractManuallyPresenter.order$default(OLrzqt(), values().copydefault.isChecked(), false, 2, null);
    }

    private final void dNCPSb() {
        OLrzqt().uzCIH().setSz(java.lang.String.valueOf(C33129mqd.AEQbTJ(OLrzqt().uzCIH().getExtraMarginSz()) + C33129mqd.AEQbTJ(OLrzqt().uzCIH().getActualMarginSz())));
    }

    private final void UeEOUB() {
        StrategyConfigInfo value = OLrzqt().copydefault().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }
}
