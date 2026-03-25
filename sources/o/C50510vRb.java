package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
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
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
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
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
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
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50510vRb extends AbstractC49945uyC<uMV, SpotGridPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ;
    public final Function2<C47988uAv, java.lang.String, Unit> AhwBna;
    public final java.util.ArrayList<vSX> AkhnZx;
    public ActivityResultLauncher<android.content.Intent> AuCTel;
    public final java.lang.Runnable DbNXlk;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fetchVPNInfo;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> gEmmrt;
    public InterfaceC53558wnk hDKMBd;
    public final java.lang.Runnable valueOf;
    public final InterfaceC56387yDm values;
    public final int isConnected = C48033uCm.Activity.OcIXYQ;
    public final boolean AYXKKw = true;

    /* JADX INFO: renamed from: o.vRb$AssistContent */
    public static final /* synthetic */ class AssistContent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AYXKKw;
    }

    public static final /* synthetic */ uMV fetchVPNInfo(C50510vRb c50510vRb) {
        return c50510vRb.values();
    }

    public C50510vRb() {
        final Function0 function0 = new Function0() { // from class: o.vRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.uzCIH(this.EZpvd);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$1
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$4
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
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.vRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.ejfBZ(this.OLrzqt);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.vRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.getFieldNames(this.OLrzqt);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$6
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridQuickOrderDialog$special$$inlined$viewModels$default$9
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.AuCTel(this.AEQbTJ);
            }
        });
        this.gEmmrt = new Function2() { // from class: o.vRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50510vRb.copydefault((C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.AhwBna = new Function2() { // from class: o.vRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50510vRb.EZpvd(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.AEQbTJ = new kotlin.Pair<>(bool, "");
        this.valueOf = new java.lang.Runnable() { // from class: o.vRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50510vRb.fJNWhG(this.AEQbTJ);
            }
        };
        this.fetchVPNInfo = new kotlin.Pair<>(bool, "");
        this.DbNXlk = new java.lang.Runnable() { // from class: o.vRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50510vRb.fIwbmz(this.AEQbTJ);
            }
        };
        this.hDKMBd = new PictureInPictureParams();
        this.AkhnZx = new java.util.ArrayList<>();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.isConnected();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vPY uzCIH() {
        return (vPY) this.fJNWhG.getValue();
    }

    public static final ViewModelStoreOwner uzCIH(C50510vRb c50510vRb) {
        androidx.fragment.app.Fragment parentFragment = c50510vRb.getParentFragment();
        return parentFragment != null ? parentFragment : c50510vRb;
    }

    public static final GridReq ejfBZ(C50510vRb c50510vRb) {
        android.os.Parcelable parcelableOLrzqt = BotRecommendPresenter.Companion.OLrzqt(c50510vRb.iwGUEr());
        Intrinsics.copydefault(parcelableOLrzqt, "");
        return (GridReq) parcelableOLrzqt;
    }

    private final GridReq getNewProxyInstance() {
        return (GridReq) this.values.getValue();
    }

    private final SmartRecommendResp iwGUEr() {
        return (SmartRecommendResp) this.fIwbmz.getValue();
    }

    public static final SmartRecommendResp getFieldNames(C50510vRb c50510vRb) {
        SmartRecommendResp smartRecommendResp;
        android.os.Bundle arguments = c50510vRb.getArguments();
        return (arguments == null || (smartRecommendResp = (SmartRecommendResp) arguments.getParcelable("data")) == null) ? new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null) : smartRecommendResp;
    }

    private final C55915xsu hDKMBd() {
        return (C55915xsu) this.copydefault.getValue();
    }

    public final C50551vSp fJNWhG() {
        return (C50551vSp) this.djBIcL.getValue();
    }

    public static final C50551vSp AuCTel(C50510vRb c50510vRb) {
        uMV umvValues = c50510vRb.values();
        androidx.fragment.app.FragmentManager childFragmentManager = c50510vRb.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new C50551vSp(umvValues, childFragmentManager);
    }

    private final ActivityResultLauncher<android.content.Intent> ejfBZ() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50510vRb.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(C50510vRb c50510vRb, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null || !extras.getBoolean("bot_kline")) {
            return;
        }
        java.lang.String maxPx = c50510vRb.OLrzqt().wlaJM().getMaxPx();
        java.lang.String minPx = c50510vRb.OLrzqt().wlaJM().getMinPx();
        java.lang.String gridNum = c50510vRb.OLrzqt().wlaJM().getGridNum();
        wPG wpg = wPG.KWHzl;
        GridReq gridReqWlaJM = c50510vRb.OLrzqt().wlaJM();
        c50510vRb.uzCIH().KWHzl().setValue(new BotGridOrderDialogData((java.lang.String) null, maxPx, minPx, gridNum, wpg.AEQbTJ(gridReqWlaJM.copy(((-1) & 1) != 0 ? gridReqWlaJM.maxPx : c50510vRb.OLrzqt().wlaJM().getMaxPx(), ((-1) & 2) != 0 ? gridReqWlaJM.minPx : c50510vRb.OLrzqt().wlaJM().getMinPx(), ((-1) & 4) != 0 ? gridReqWlaJM.gridNum : null, ((-1) & 8) != 0 ? gridReqWlaJM.runType : null, ((-1) & 16) != 0 ? gridReqWlaJM.quoteSz : null, ((-1) & 32) != 0 ? gridReqWlaJM.baseSz : null, ((-1) & 64) != 0 ? gridReqWlaJM.investType : null, ((-1) & 128) != 0 ? gridReqWlaJM.tpTriggerPx : null, ((-1) & 256) != 0 ? gridReqWlaJM.slTriggerPx : null, ((-1) & 512) != 0 ? gridReqWlaJM.tpslTriggerParamReq : null, ((-1) & 1024) != 0 ? gridReqWlaJM.tpOrdPx : null, ((-1) & 2048) != 0 ? gridReqWlaJM.slOrdPx : null, ((-1) & 4096) != 0 ? gridReqWlaJM.duration : null, ((-1) & 8192) != 0 ? gridReqWlaJM.signParams : null, ((-1) & 16384) != 0 ? gridReqWlaJM.reserveFunds : null, ((-1) & 32768) != 0 ? gridReqWlaJM.trailingUpConfig : null, ((-1) & 65536) != 0 ? gridReqWlaJM.trailingDownConfig : null, ((-1) & 131072) != 0 ? gridReqWlaJM.perGridProfitRatio : null, ((-1) & 262144) != 0 ? gridReqWlaJM.pxLimit : null, ((-1) & 524288) != 0 ? gridReqWlaJM.profitSharingRatio : null, ((-1) & 1048576) != 0 ? gridReqWlaJM.instId : null, ((-1) & 2097152) != 0 ? gridReqWlaJM.instType : null, ((-1) & 4194304) != 0 ? gridReqWlaJM.ordType : null, ((-1) & 8388608) != 0 ? gridReqWlaJM.annualizedRate : null, ((-1) & 16777216) != 0 ? gridReqWlaJM.sourceCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? gridReqWlaJM.sourceCcySz : null, ((-1) & 67108864) != 0 ? gridReqWlaJM.investSymbol : null, ((-1) & 134217728) != 0 ? gridReqWlaJM.autoTransfer : null, ((-1) & 268435456) != 0 ? gridReqWlaJM.marketPx : null, ((-1) & 536870912) != 0 ? gridReqWlaJM.systemSource : null, ((-1) & 1073741824) != 0 ? gridReqWlaJM.nmpUnderlyingId : null, ((-1) & Integer.MIN_VALUE) != 0 ? gridReqWlaJM.earnParam : null, (12 & 1) != 0 ? gridReqWlaJM.batchNo : null, (12 & 2) != 0 ? gridReqWlaJM.voucherId : null, (12 & 4) != 0 ? gridReqWlaJM.tradeQuoteCcy : null, (12 & 8) != 0 ? gridReqWlaJM.profitAutoReinvestParam : null)), false, c50510vRb.OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null));
    }

    public static final Unit copydefault(C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C50510vRb c50510vRb, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        uMV umvValues = c50510vRb.values();
        if (Intrinsics.EZpvd(c47988uAv, umvValues.AkhnZx)) {
            if (umvValues.AkhnZx.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(umvValues.AkhnZx, false, 1, null);
            }
            c50510vRb.OLrzqt().EZpvd(umvValues.AkhnZx.AkhnZx());
            c50510vRb.gHZMYf();
            c50510vRb.OLrzqt().UeEOUB();
        } else if (Intrinsics.EZpvd(c47988uAv, umvValues.KWHzl)) {
            if (umvValues.KWHzl.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(umvValues.KWHzl, false, 1, null);
            }
            c50510vRb.OLrzqt().wlaJM().setBaseSz(umvValues.KWHzl.AkhnZx());
            c50510vRb.AwvSrB();
            c50510vRb.OLrzqt().UeEOUB();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vRb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50510vRb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50510vRb c50510vRb) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c50510vRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.putRating);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getString(C55688xof.Application.MediaMetadataCompatBuilder));
                java.lang.String string = this.copydefault.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vRb$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50510vRb EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50510vRb c50510vRb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c50510vRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.setVolumeTo));
                java.lang.String string = this.EZpvd.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vRb$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C50510vRb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50510vRb c50510vRb) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c50510vRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, Fragment.OLrzqt, 1, (java.lang.Object) null);
                android.widget.TextView textView = C50510vRb.fetchVPNInfo(this.KWHzl).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() == 0) {
                    C56002xub.KWHzl.OLrzqt();
                    this.KWHzl.OcIXYQ();
                    return;
                }
                C47988uAv c47988uAv = C50510vRb.fetchVPNInfo(this.KWHzl).KWHzl;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                if (c47988uAv.getVisibility() == 0 && !C33129mqd.OLrzqt((java.lang.CharSequence) C50510vRb.fetchVPNInfo(this.KWHzl).KWHzl.AkhnZx())) {
                    C55326xho.toast$default(C33069mpW.copydefault(this.KWHzl, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    C50510vRb.fetchVPNInfo(this.KWHzl).KWHzl.zsXlph();
                    this.KWHzl.OcIXYQ();
                    return;
                }
                C47988uAv c47988uAv2 = C50510vRb.fetchVPNInfo(this.KWHzl).AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                if (c47988uAv2.getVisibility() != 0 || C33129mqd.OLrzqt((java.lang.CharSequence) C50510vRb.fetchVPNInfo(this.KWHzl).AkhnZx.AkhnZx())) {
                    if (!this.KWHzl.AwvSrB() || !this.KWHzl.gHZMYf()) {
                        this.KWHzl.OcIXYQ();
                        return;
                    } else {
                        C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new TaskStackBuilder(C54589xNz.EZpvd.EZpvd() ? "demo" : "live"), 1, (java.lang.Object) null);
                        this.KWHzl.fIwbmz();
                        return;
                    }
                }
                C55326xho.toast$default(C33069mpW.copydefault(this.KWHzl, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                C50510vRb.fetchVPNInfo(this.KWHzl).AkhnZx.zsXlph();
                this.KWHzl.OcIXYQ();
            }
        }
    }

    /* JADX INFO: renamed from: o.vRb$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50510vRb EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C50510vRb c50510vRb) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c50510vRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.fARcdN();
            }
        }
    }

    /* JADX INFO: renamed from: o.vRb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50510vRb KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50510vRb c50510vRb) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c50510vRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = null;
                C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, ActionBar.EZpvd, 1, (java.lang.Object) null);
                BotRecommendPresenter.Activity activity = BotRecommendPresenter.Companion;
                SmartRecommendResp value = this.KWHzl.uzCIH().copydefault().getValue();
                if (value == null) {
                    value = new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null);
                }
                android.os.Parcelable parcelableAEQbTJ = activity.AEQbTJ(value);
                Intrinsics.copydefault(parcelableAEQbTJ, "");
                AIData aIData = (AIData) parcelableAEQbTJ;
                aIData.setProfitSharingRatio(this.KWHzl.OLrzqt().wlaJM().getProfitSharingRatio());
                aIData.setBaseSz(this.KWHzl.OLrzqt().wlaJM().getBaseSz());
                aIData.setQuoteSz(this.KWHzl.OLrzqt().wlaJM().getQuoteSz());
                aIData.setInvestmentType(this.KWHzl.OLrzqt().zLjUOn());
                aIData.setToManual(true);
                C56058xve.Companion.copydefault().KWHzl("kline_grid_btn", (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
                BotTradeData botTradeData = new BotTradeData("grid", this.KWHzl.OLrzqt().wlaJM().getInstId(), this.KWHzl.OLrzqt().wlaJM().getInstType(), parcelableAEQbTJ, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 496, (DefaultConstructorMarker) null);
                android.content.Context context = this.KWHzl.getContext();
                if (context != null) {
                    ActivityResultLauncher activityResultLauncher2 = this.KWHzl.AuCTel;
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

    /* JADX INFO: renamed from: o.vRb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vRb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50510vRb KWHzl(@NotNull SmartRecommendResp smartRecommendResp) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            C50510vRb c50510vRb = new C50510vRb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", smartRecommendResp);
            c50510vRb.setArguments(bundle);
            return c50510vRb;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wlaJM();
        zuBGHE();
        sSMYrx();
        AuCTelauCTel();
        zsXlph();
        AxsJAY();
        AuCTel();
        AubY();
        zLjUOn();
        QbewEr();
        values().isConnected.setOnTouchListener(new View.OnTouchListener() { // from class: o.vRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C50510vRb.KWHzl(view2, motionEvent);
            }
        });
        values().isConnected.setNestedScrollingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KWHzl(android.view.View view, android.view.MotionEvent motionEvent) {
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
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ("grid");
        if (tacticsTypeAEQbTJ != null && (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) != null) {
            wxq.setTitle(strAYXKKw);
        }
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new PendingIntent(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        wyf.setOKDSSize(44);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OFhtUX));
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vRz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50510vRb.EZpvd(this.OLrzqt, view);
                }
            });
        }
        wyf.setOnClickListener(new FragmentManager(wyf, 1000L, this));
    }

    public static final void EZpvd(C50510vRb c50510vRb, android.view.View view) {
        C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_Click", (TrackChannel[]) null, new Function1() { // from class: o.vQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c50510vRb.uzCIH().djBIcL().setValue(vRY.Companion.KWHzl());
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", "back", false, 4, null);
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vRb$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment OLrzqt = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "create", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.vRb$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "grid", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, this.KWHzl, false, 4, null);
        }
    }

    public final void AuCTel() {
        this.AuCTel = ejfBZ();
    }

    private final void AubY() {
        android.widget.TextView textView = values().valueOf;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vRb$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "moresettings", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
            strategyBaseReq.setInstId(OLrzqt().fvQaOB().gEmmrt());
            strategyBaseReq.setTdMode("cash");
            strategyBaseReq.setOrdType("grid");
            StrategyConfigInfo value = OLrzqt().fetchVPNInfo().getValue();
            getNewProxyInstance().setTradeQuoteCcy(OLrzqt().fARcdN());
            AbstractC50583vTu abstractC50583vTuCopydefault = AbstractC50583vTu.Companion.copydefault(OLrzqt().fvQaOB().gEmmrt(), OLrzqt().fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, getNewProxyInstance(), (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(value), (DcaOrderReq) null, (AiOrderReq) null, 28662, (DefaultConstructorMarker) null), true);
            if (abstractC50583vTuCopydefault != null) {
                abstractC50583vTuCopydefault.show(getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
                return;
            }
            return;
        }
        pUU.KWHzl("BotOrder", "Secondary confirmation feature disabled SpotGridFragment Start Order");
        OLrzqt().RcXXUw();
    }

    public static final void fJNWhG(C50510vRb c50510vRb) {
        if (c50510vRb.AEQbTJ.getFirst().booleanValue()) {
            c50510vRb.values().KWHzl.copydefault();
        } else {
            c50510vRb.values().KWHzl.setInputErrorMsg(c50510vRb.AEQbTJ.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AwvSrB() {
        C47988uAv c47988uAv = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0) {
            return true;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairOLrzqt = OLrzqt().OLrzqt(values().KWHzl.AkhnZx(), values().KWHzl.fARcdN(), false);
        this.AEQbTJ = pairOLrzqt;
        boolean zBooleanValue = pairOLrzqt.getFirst().booleanValue();
        if (!this.AEQbTJ.getFirst().booleanValue()) {
            OcIXYQ();
        }
        C47988uAv c47988uAv2 = values().KWHzl;
        c47988uAv2.removeCallbacks(this.valueOf);
        c47988uAv2.postDelayed(this.valueOf, 500L);
        return zBooleanValue;
    }

    public static final void fIwbmz(C50510vRb c50510vRb) {
        if (c50510vRb.fetchVPNInfo.getFirst().booleanValue()) {
            c50510vRb.values().AkhnZx.copydefault();
        } else {
            c50510vRb.values().AkhnZx.setInputErrorMsg(c50510vRb.fetchVPNInfo.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean gHZMYf() {
        C47988uAv c47988uAv = values().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        boolean zBooleanValue = true;
        if (c47988uAv.getVisibility() == 0) {
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairOLrzqt = OLrzqt().OLrzqt(values().AkhnZx.AkhnZx(), values().AkhnZx.fARcdN(), true);
            this.fetchVPNInfo = pairOLrzqt;
            zBooleanValue = pairOLrzqt.getFirst().booleanValue();
            if (!this.fetchVPNInfo.getFirst().booleanValue()) {
                OcIXYQ();
            }
            C47988uAv c47988uAv2 = values().AkhnZx;
            c47988uAv2.removeCallbacks(this.DbNXlk);
            c47988uAv2.postDelayed(this.DbNXlk, 500L);
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OcIXYQ() {
        uMV umvValues = values();
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(umvValues.AkhnZx, umvValues.KWHzl);
        C49967uyY c49967uyY = C49967uyY.EZpvd;
        C47988uAv c47988uAv = umvValues.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, arrayListCopydefault);
    }

    private final void wlaJM() {
        getNewProxyInstance().setSignParams(OLrzqt().gEmmrt());
        OLrzqt().KWHzl(getNewProxyInstance());
        SpotGridPresenter spotGridPresenterOLrzqt = OLrzqt();
        java.lang.String instType = iwGUEr().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = iwGUEr().getInstId();
        spotGridPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        OLrzqt().wlaJM().setInstType(OLrzqt().fvQaOB().djBIcL());
        OLrzqt().wlaJM().setTradeQuoteCcy(OLrzqt().fvQaOB().AEQbTJ("grid"));
        OLrzqt().AxsJAY();
        SpotGridPresenter.getGridConfigInfo$default(OLrzqt(), null, 1, null);
        ORxRYg();
    }

    private final void zuBGHE() {
        C55258xgZ c55258xgZ = values().AhwBna;
        c55258xgZ.setOnClickListener(new Dialog(c55258xgZ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vRb$LoaderManager */
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

    private final void zsXlph() {
        fJNWhG().KWHzl(OLrzqt().fvQaOB().AhwBna());
        QKVWgx();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void QKVWgx() {
        java.lang.String baseDig;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        values().copydefault.setTransferCoin(OLrzqt().QbewEr());
        values().KWHzl.setInputUnit(OLrzqt().QbewEr());
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) == null) {
            baseDig = null;
        } else {
            java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(strValueOf);
            if (idxConfigAkhnZx != null) {
                baseDig = idxConfigAkhnZx.getBaseDig();
            }
        }
        values().KWHzl.setMaxDecimal((baseDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) baseDig)) ? 8 : C33129mqd.AhwBna(baseDig));
    }

    /* JADX INFO: renamed from: o.vRb$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC53558wnk {
        public PictureInPictureParams() {
        }

        @Override // o.InterfaceC53558wnk
        public void AEQbTJ(Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C50510vRb.fetchVPNInfo(C50510vRb.this).getFieldNames.setOnSelectedCallback(function1);
            C50510vRb.fetchVPNInfo(C50510vRb.this).getFieldNames.setFm(C50510vRb.this.getChildFragmentManager());
        }

        @Override // o.InterfaceC53558wnk
        public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, TradeType tradeType) {
            Intrinsics.checkNotNullParameter(tradeType, "");
            C50510vRb.fetchVPNInfo(C50510vRb.this).getFieldNames.copydefault(viewModelStoreOwner, bizInstrument, tradeType, false);
            uBL ubl = C50510vRb.fetchVPNInfo(C50510vRb.this).getFieldNames;
            Intrinsics.checkNotNullExpressionValue(ubl, "");
            ubl.setVisibility((bizInstrument == null || !bizInstrument.isDisplayTradeReceive()) ? 8 : 0);
            return AhwBna();
        }

        @Override // o.InterfaceC53558wnk
        public java.lang.String AhwBna() {
            return C50510vRb.fetchVPNInfo(C50510vRb.this).getFieldNames.OLrzqt();
        }
    }

    private final void sSMYrx() {
        InterfaceC53558wnk interfaceC53558wnk = this.hDKMBd;
        interfaceC53558wnk.AEQbTJ(new Function1() { // from class: o.vRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.valueOf(this.EZpvd, (java.lang.String) obj);
            }
        });
        OLrzqt().fvQaOB().gEmmrt(interfaceC53558wnk.EZpvd(getParentFragment(), OLrzqt().fvQaOB().AhwBna(), TradeType.BUY_OPEN));
    }

    public static final Unit valueOf(C50510vRb c50510vRb, java.lang.String str) {
        pUU.EZpvd("USDRename", "SpotGridFragment onTradeWith selected: " + str);
        c50510vRb.OLrzqt().fvQaOB().gEmmrt(str);
        C47988uAv.clearSeekBarData$default(c50510vRb.values().AkhnZx, false, 1, null);
        C47988uAv.clearSeekBarData$default(c50510vRb.values().KWHzl, false, 1, null);
        c50510vRb.QOLQEE();
        c50510vRb.ORxRYg();
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        final uMV umvValues = values();
        fJNWhG().AEQbTJ(new Function0() { // from class: o.vRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50510vRb.fARcdN(this.AEQbTJ);
            }
        });
        fJNWhG().AEQbTJ(new Function1() { // from class: o.vRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.OLrzqt(this.EZpvd, umvValues, (java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv = values().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        OLrzqt(this, c47988uAv, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.AhwBna(this.OLrzqt, (java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv2 = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        OLrzqt(this, c47988uAv2, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.AYXKKw(this.OLrzqt, (java.lang.String) obj);
            }
        });
        C55258xgZ c55258xgZ = values().getNewProxyInstance;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static final java.lang.String fARcdN(C50510vRb c50510vRb) {
        return c50510vRb.hDKMBd.AhwBna();
    }

    public static final Unit OLrzqt(C50510vRb c50510vRb, uMV umv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50510vRb.OLrzqt().AEQbTJ(str);
        c50510vRb.OLrzqt().djSkpj();
        C47988uAv.setInputContent$default(umv.AkhnZx, null, false, true, 2, null);
        C47988uAv.setInputContent$default(umv.KWHzl, null, false, true, 2, null);
        c50510vRb.QOLQEE();
        c50510vRb.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final C50510vRb c50510vRb, final C47988uAv c47988uAv, final Function1<? super java.lang.String, java.lang.String> function1) {
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.copydefault(c47988uAv, function1, c50510vRb, ((java.lang.Float) obj).floatValue());
            }
        });
        c47988uAv.setOnTextChangeCallback(c50510vRb.AhwBna);
        c47988uAv.setOnFocusChangeCallback(c50510vRb.gEmmrt);
    }

    public static final Unit copydefault(C47988uAv c47988uAv, Function1 function1, C50510vRb c50510vRb, float f) {
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, (java.lang.String) function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(c47988uAv.fJNWhG()))), false, false, 6, null);
            if (Intrinsics.EZpvd(c47988uAv, c50510vRb.values().KWHzl)) {
                c50510vRb.AwvSrB();
            } else {
                c50510vRb.gHZMYf();
            }
            c47988uAv.setOnTextChangeCallback(c50510vRb.AhwBna);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String AhwBna(C50510vRb c50510vRb, java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c50510vRb.OLrzqt().fvQaOB(), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(str, c50510vRb.hDKMBd().AhwBna().getValue(), null, null, null, 14, null))) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        c50510vRb.OLrzqt().EZpvd(str2);
        c50510vRb.OLrzqt().UeEOUB();
        return str2;
    }

    public static final java.lang.String AYXKKw(C50510vRb c50510vRb, java.lang.String str) {
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c50510vRb.OLrzqt().fvQaOB(), null, false, 3, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvert$default.djBIcL(C33129mqd.mulS$default(str, c50510vRb.hDKMBd().EZpvd().getValue(), null, null, null, 14, null))) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        c50510vRb.OLrzqt().wlaJM().setBaseSz(str2);
        c50510vRb.OLrzqt().UeEOUB();
        return str2;
    }

    /* JADX INFO: renamed from: o.vRb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    private final void QOLQEE() {
        values().values.setTransferCoin(OLrzqt().AuCTel());
        values().AkhnZx.setInputUnit(OLrzqt().AkhnZx());
        java.lang.String strORxRYg = OLrzqt().ORxRYg();
        values().AkhnZx.setMaxDecimal((strORxRYg == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strORxRYg)) ? 8 : C33129mqd.AhwBna(strORxRYg));
    }

    private final void ORxRYg() {
        hDKMBd().AYXKKw();
        C55915xsu c55915xsuHDKMBd = hDKMBd();
        BizInstrument bizInstrumentAhwBna = OLrzqt().AhwBna();
        if (bizInstrumentAhwBna == null) {
            bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        }
        c55915xsuHDKMBd.EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : bizInstrumentAhwBna, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? OLrzqt().fARcdN() : null);
    }

    private final C43316rmw getFieldNames() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    private final void AxsJAY() {
        vSX vsx;
        BotUserConfigInfo botUserConfigInfoCopydefault;
        this.AkhnZx.clear();
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(OLrzqt().OcIXYQ(), "grid")) {
            InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
            java.util.List<java.lang.String> profitSharingRange = (interfaceC55881xsMCopydefault2 == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault2.copydefault()) == null) ? null : botUserConfigInfoCopydefault.getProfitSharingRange();
            java.lang.String strEjfBZ = OLrzqt().ejfBZ();
            pUU.KWHzl("Profit", "defaultProfitSharingRatio = " + strEjfBZ);
            if (profitSharingRange != null) {
                int i = 0;
                for (java.lang.Object obj : profitSharingRange) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEjfBZ)) {
                        OLrzqt().wlaJM().setProfitSharingRatio(str);
                        vsx = new vSX(str, true, i);
                    } else {
                        vsx = new vSX(str, false, i);
                    }
                    this.AkhnZx.add(vsx);
                    i++;
                }
            }
            if (!this.AkhnZx.isEmpty()) {
                values().AhwBna.setVisibility(0);
                values().fetchVPNInfo.setVisibility(0);
                C43316rmw fieldNames = getFieldNames();
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                fieldNames.register(vSX.class, new vSU(fragmentActivityRequireActivity, new Function1() { // from class: o.vRc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C50510vRb.KWHzl(this.KWHzl, (vSX) obj2);
                    }
                }));
                RecyclerView recyclerView = values().fetchVPNInfo;
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.setLayoutManager(new GridLayoutManager(requireActivity(), this.AkhnZx.size()));
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.removeItemDecorationAt(0);
                }
                recyclerView.addItemDecoration(new C57584ylF(this.AkhnZx.size(), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
                recyclerView.setAdapter(getFieldNames());
                getFieldNames().setItems(this.AkhnZx);
                return;
            }
        }
        values().AhwBna.setVisibility(8);
        values().fetchVPNInfo.setVisibility(8);
    }

    public static final Unit KWHzl(C50510vRb c50510vRb, vSX vsx) {
        Intrinsics.checkNotNullParameter(vsx, "");
        for (vSX vsx2 : c50510vRb.AkhnZx) {
            c50510vRb.OLrzqt().wlaJM().setProfitSharingRatio(vsx.AEQbTJ());
            vsx2.AEQbTJ(vsx2.EZpvd() == vsx.EZpvd());
        }
        C33064mpR.OLrzqt(c50510vRb.getFieldNames(), (java.util.List<? extends java.lang.Object>) c50510vRb.AkhnZx);
        return Unit.INSTANCE;
    }

    private final void zLjUOn() {
        TradeLiveData<AdditionalInvest> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner, new AssistContent(new Function1() { // from class: o.vRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.EZpvd(this.copydefault, (AdditionalInvest) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner2, new AssistContent(new Function1() { // from class: o.vRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.OLrzqt(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        C56111xwe<MinInvestResp> c56111xweZuBGHE = OLrzqt().zuBGHE();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweZuBGHE.observe(viewLifecycleOwner3, new AssistContent(new Function1() { // from class: o.vRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.OLrzqt(this.KWHzl, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<StrategyResponse> tradeLiveDataGHZMYf = OLrzqt().gHZMYf();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner4, new AssistContent(new Function1() { // from class: o.vRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.AEQbTJ(this.copydefault, (StrategyResponse) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = hDKMBd().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweAhwBna.observe(viewLifecycleOwner5, new AssistContent(new Function1() { // from class: o.vRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweEZpvd = hDKMBd().EZpvd();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweEZpvd.observe(viewLifecycleOwner6, new AssistContent(new Function1() { // from class: o.vRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<TicketEligibility> tradeLiveDataFIwbmz = OLrzqt().fIwbmz();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataFIwbmz.observe(viewLifecycleOwner7, new AssistContent(new Function1() { // from class: o.vRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.OLrzqt(this.EZpvd, (TicketEligibility) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.vRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(C50510vRb c50510vRb, AdditionalInvest additionalInvest) {
        Intrinsics.checkNotNullParameter(additionalInvest, "");
        c50510vRb.QfsBiF();
        c50510vRb.DTwDnp();
        c50510vRb.KWHzl(additionalInvest);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50510vRb c50510vRb, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c50510vRb.OLrzqt().djSkpj();
        c50510vRb.QVAiDq();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50510vRb c50510vRb, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        C47988uAv c47988uAv = c50510vRb.values().AkhnZx;
        xMR xmr = xMR.copydefault;
        C47988uAv.setInputLabel$default(c47988uAv, "> " + xmr.copydefault(c50510vRb.OLrzqt().AEQbTJ(true)), null, 2, null);
        C47988uAv.setInputLabel$default(c50510vRb.values().KWHzl, "> " + xmr.copydefault(c50510vRb.OLrzqt().AEQbTJ(false)), null, 2, null);
        c50510vRb.AwvSrB();
        c50510vRb.gHZMYf();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C50510vRb c50510vRb, StrategyResponse strategyResponse) {
        boolean z;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strOLrzqt = c50510vRb.uzCIH().OLrzqt();
        java.lang.String strGEmmrt = c50510vRb.OLrzqt().fvQaOB().gEmmrt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.QbewEr()) {
            }
        }
        c55867xrz.KWHzl("bot_kline_quick_order", java.lang.String.valueOf(jCurrentTimeMillis), strOLrzqt, strGEmmrt, "success", new BotGrafanaInfo(null, null, null, z, 7, null));
        c50510vRb.fARcdN();
        FragmentActivity activity = c50510vRb.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "grid", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C50510vRb c50510vRb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50510vRb.QUSxYX();
        c50510vRb.QfsBiF();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C50510vRb c50510vRb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50510vRb.QUSxYX();
        c50510vRb.QfsBiF();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50510vRb c50510vRb, TicketEligibility ticketEligibility) {
        c50510vRb.values().AYXKKw.setData(new LossInsuranceDisplayData(ticketEligibility != null ? ticketEligibility.getEntityValue() : null, ticketEligibility != null ? ticketEligibility.getEntityStatus() : null, ticketEligibility != null ? java.lang.Boolean.valueOf(ticketEligibility.getEligible()) : null, "grid", yDY.copydefault(c50510vRb.OLrzqt().fvQaOB().gEmmrt()), false, null, null, null, null, null, false, null, 8160, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50510vRb c50510vRb, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c50510vRb.OLrzqt().sSMYrx().bB_())) {
            if (GridStartTriggerType.Companion.KWHzl(c50510vRb.getNewProxyInstance().getSignParams())) {
                vSO.Companion.copydefault(c50510vRb.OLrzqt().fvQaOB().djBIcL(), c50510vRb.OLrzqt().fvQaOB().gEmmrt()).show(c50510vRb.getChildFragmentManager(), "BotOrderFailedDialog");
            } else {
                C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            java.lang.String strOLrzqt = c50510vRb.uzCIH().OLrzqt();
            java.lang.String strGEmmrt = c50510vRb.OLrzqt().fvQaOB().gEmmrt();
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            java.lang.String str = message;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_kline_quick_order", strOLrzqt, "spot_grid_ai", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        }
        return Unit.INSTANCE;
    }

    private final void QVAiDq() {
        StrategyConfigInfo value = OLrzqt().fetchVPNInfo().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().uzCIH;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    private final void KWHzl(AdditionalInvest additionalInvest) {
        values().gEmmrt.setText(OLrzqt().KWHzl(additionalInvest));
    }

    private final void DTwDnp() {
        values().EZpvd.setText(OLrzqt().isConnected());
    }

    private final void QfsBiF() {
        SpotGridPresenter spotGridPresenterOLrzqt = OLrzqt();
        java.lang.String value = hDKMBd().AhwBna().getValue();
        if (value == null) {
            value = "0";
        }
        java.lang.String value2 = hDKMBd().EZpvd().getValue();
        java.lang.String strCopydefault = spotGridPresenterOLrzqt.copydefault(value, value2 != null ? value2 : "0");
        android.widget.TextView textView = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(strCopydefault.length() > 0 ? 0 : 8);
        values().OLrzqt.setText(strCopydefault);
    }

    private final void QUSxYX() {
        java.lang.String strKWHzl = hDKMBd().KWHzl(OLrzqt().fvQaOB().AhwBna());
        if (strKWHzl != null) {
            copydefault(strKWHzl);
        }
        java.lang.String strAEQbTJ = hDKMBd().AEQbTJ(OLrzqt().fvQaOB(), OLrzqt().zLjUOn());
        if (strAEQbTJ != null) {
            KWHzl(strAEQbTJ);
        }
    }

    private final void copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) fJNWhG().OLrzqt(), (java.lang.Object) TtmlNode.RUBY_BASE) || Intrinsics.EZpvd((java.lang.Object) fJNWhG().OLrzqt(), (java.lang.Object) "dual")) {
            C53605woe c53605woe = values().copydefault;
            Intrinsics.checkNotNullExpressionValue(c53605woe, "");
            if (c53605woe.getVisibility() != 0) {
                values().copydefault.setVisibility(0);
            }
        }
        values().copydefault.setFooterAvaValue(str);
    }

    private final void KWHzl(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) fJNWhG().OLrzqt(), (java.lang.Object) "quote") || Intrinsics.EZpvd((java.lang.Object) fJNWhG().OLrzqt(), (java.lang.Object) "dual") || Intrinsics.EZpvd((java.lang.Object) fJNWhG().OLrzqt(), (java.lang.Object) "default_usdt")) {
            C53605woe c53605woe = values().values;
            Intrinsics.checkNotNullExpressionValue(c53605woe, "");
            if (c53605woe.getVisibility() != 0) {
                values().values.setVisibility(0);
            }
        }
        values().values.setFooterAvaValue(str);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ORxRYg();
        C32866mlf.onEvent$default("KlineBotCreate_Kline_ConfirmChart_View", (TrackChannel[]) null, new Function1() { // from class: o.vRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void QbewEr() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50510vRb.KWHzl(this.KWHzl, str, bundle);
            }
        });
        C56111xwe<java.util.List<SmartRecommendResp>> c56111xweDbNXlk = OLrzqt().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweDbNXlk.observe(viewLifecycleOwner, new AssistContent(new Function1() { // from class: o.vRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50510vRb.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final void KWHzl(C50510vRb c50510vRb, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("Order", "BotGuideContractGridFragment Order");
        c50510vRb.OLrzqt().RcXXUw();
    }

    public static final Unit AEQbTJ(C50510vRb c50510vRb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c50510vRb.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        uzCIH().AEQbTJ().setValue(java.lang.Boolean.TRUE);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        hDKMBd().AYXKKw();
    }
}
