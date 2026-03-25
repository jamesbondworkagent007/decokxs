package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderType;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView;
import com.okinc.business.dexui.main.swap.history.detail.widget.appbar.data.AppBarState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.hUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC22009hUn extends hUV {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("200", "202");
    public final InterfaceC56387yDm AhwBna;
    public AbstractC22038hVp OLrzqt;
    public final InterfaceC56387yDm AkhnZx = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hUO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22009hUn.gEmmrt(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hUP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22009hUn.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hUW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22009hUn.valueOf(this.AEQbTJ);
        }
    });
    public java.lang.String isConnected = "";
    public java.lang.Object djBIcL = new java.lang.Object();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hUl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22009hUn.AYXKKw(this.OLrzqt);
        }
    });
    public Application AEQbTJ = new Application();
    public final Observer<TradeState> fetchVPNInfo = new Observer() { // from class: o.hUt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            ActivityC22009hUn.EZpvd(this.AEQbTJ, (TradeState) obj);
        }
    };

    /* JADX INFO: renamed from: o.hUn$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BridgeRedeemStatus.values().length];
            try {
                iArr[BridgeRedeemStatus.BroadcastFailed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BridgeRedeemStatus.RedeemCallDataFailed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.hUn$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    /* JADX INFO: renamed from: o.hUn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hUn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public ActivityC22009hUn() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(DexOrderDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.history.detail.DexOrderNewDetailActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.history.detail.DexOrderNewDetailActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.history.detail.DexOrderNewDetailActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final java.lang.String values() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String isConnected() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String gEmmrt(ActivityC22009hUn activityC22009hUn) {
        android.content.Intent intent = activityC22009hUn.getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(OtcExtraKeys.ORDER_ID) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String djBIcL(ActivityC22009hUn activityC22009hUn) {
        android.content.Intent intent = activityC22009hUn.getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("source") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public final HistoryOrderType AEQbTJ() {
        return (HistoryOrderType) this.AYXKKw.getValue();
    }

    public static final HistoryOrderType valueOf(ActivityC22009hUn activityC22009hUn) {
        android.content.Intent intent = activityC22009hUn.getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE) : null;
        HistoryOrderType historyOrderType = serializableExtra instanceof HistoryOrderType ? (HistoryOrderType) serializableExtra : null;
        return historyOrderType == null ? HistoryOrderType.Swap : historyOrderType;
    }

    public final DexOrderDetailViewModel KWHzl() {
        return (DexOrderDetailViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: renamed from: o.hUn$Application */
    public static final class Application implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public Application() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            ActivityC22009hUn activityC22009hUn = ActivityC22009hUn.this;
            activityC22009hUn.OLrzqt(activityC22009hUn.isConnected(), true);
        }
    }

    public static final C23381hxE AYXKKw(ActivityC22009hUn activityC22009hUn) {
        C23381hxE c23381hxEOLrzqt = C23381hxE.OLrzqt(activityC22009hUn.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c23381hxEOLrzqt, "");
        return c23381hxEOLrzqt;
    }

    /* JADX DEBUG: Possible override for method o.hUV.EZpvd()V */
    public final C23381hxE EZpvd() {
        return (C23381hxE) this.copydefault.getValue();
    }

    public static final void EZpvd(ActivityC22009hUn activityC22009hUn, TradeState tradeState) {
        if (tradeState == null || Intrinsics.EZpvd((java.lang.Object) tradeState.getType(), (java.lang.Object) "Unwrap")) {
            return;
        }
        if (tradeState.isFromBitCoinChain()) {
            showFromChainIsBtcCoinTips$default(activityC22009hUn, null, tradeState, 1, null);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) tradeState.getStatus(), (java.lang.Object) "0")) {
                return;
            }
            activityC22009hUn.EZpvd().gEmmrt.setVisibility(8);
        }
    }

    @Override // o.hUV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(EZpvd().getRoot());
        fIwbmz();
        ejfBZ();
    }

    private final void ejfBZ() {
        C54819xWm.KWHzl().AEQbTJ(this.AEQbTJ);
        KWHzl().djBIcL().observe(this, new TaskDescription(new Function1() { // from class: o.hUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.AEQbTJ(this.EZpvd, (OrderDetailBean) obj);
            }
        }));
        KWHzl().DbNXlk().observe(this, new TaskDescription(new Function1() { // from class: o.hUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        EZpvd().EZpvd.setCountDownListener(new Function2() { // from class: o.hUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC22009hUn.copydefault(this.copydefault, ((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
            }
        });
        EZpvd().EZpvd.setCountDownListener(new Function1() { // from class: o.hUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        });
        C25352ivB.setOnDoubleCheckClickListener$default(EZpvd().AYXKKw, 0L, new Function1() { // from class: o.hUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.KWHzl(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        KWHzl().gEmmrt().observe(this, new TaskDescription(new Function1() { // from class: o.hUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.hUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.EZpvd(this.KWHzl, (CheckContinueBean) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final ActivityC22009hUn activityC22009hUn, final OrderDetailBean orderDetailBean) {
        Intrinsics.copydefault(orderDetailBean);
        activityC22009hUn.EZpvd(orderDetailBean);
        activityC22009hUn.isConnected = orderDetailBean.getFrom();
        C23381hxE c23381hxEEZpvd = activityC22009hUn.EZpvd();
        activityC22009hUn.EZpvd(orderDetailBean.getStatus(), orderDetailBean.getSwapTradeType());
        activityC22009hUn.copydefault(orderDetailBean.getStatus(), orderDetailBean.getToTokenSymbol());
        c23381hxEEZpvd.EZpvd.setOrderState(new AppBarState(false, orderDetailBean.getStatus(), false));
        if (KWHzl.contains(orderDetailBean.getStatus())) {
            C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hUN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.AEQbTJ(this.AEQbTJ, orderDetailBean, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        if (C22822hmc.copydefault(false, orderDetailBean.getStatus()) || yDY.gEmmrt("200", "201", "202").contains(orderDetailBean.getStatus())) {
            c23381hxEEZpvd.gEmmrt.setVisibility(8);
            c23381hxEEZpvd.EZpvd.OLrzqt();
        } else {
            if (orderDetailBean.isShowCountDownView()) {
                c23381hxEEZpvd.EZpvd.setCountDown(C33129mqd.valueOf(orderDetailBean.getEstimatedTime()), orderDetailBean.getLeftTimeBy5Minute());
            } else {
                c23381hxEEZpvd.EZpvd.OLrzqt();
            }
            if (!activityC22009hUn.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getWillNeedManualClaim(), (java.lang.Object) "1") && !yDY.gEmmrt("200", "201", "202").contains(orderDetailBean.getStatus())) {
                c23381hxEEZpvd.gEmmrt.setOrderMassage(activityC22009hUn, orderDetailBean.getStatus(), false, OrderInstructionView.OrderInstructionType.ORDER_TYPE_BRIDGE_REDEEM, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, activityC22009hUn.isConnected(), activityC22009hUn.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : orderDetailBean.getToTokenSymbol());
            } else if (orderDetailBean.isOutOfTimeBy5Minute()) {
                c23381hxEEZpvd.EZpvd.OLrzqt();
                c23381hxEEZpvd.gEmmrt.setOrderMassage(activityC22009hUn, orderDetailBean.getStatus(), false, OrderInstructionView.OrderInstructionType.TIME_OUT_TIMESTAMP, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, activityC22009hUn.isConnected(), activityC22009hUn.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
            } else if (orderDetailBean.isFromBitCoinChain()) {
                showFromChainIsBtcCoinTips$default(activityC22009hUn, orderDetailBean, null, 2, null);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getAbnormalStatus(), (java.lang.Object) "2")) {
                c23381hxEEZpvd.gEmmrt.setOrderMassage(activityC22009hUn, orderDetailBean.getStatus(), false, OrderInstructionView.OrderInstructionType.ASSETS_LARGE, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : "", activityC22009hUn.isConnected(), activityC22009hUn.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
            } else {
                DexMultiChildOrderInfoVo bridgeChildOrderDetailVo = orderDetailBean.getBridgeChildOrderDetailVo();
                if (bridgeChildOrderDetailVo != null && bridgeChildOrderDetailVo.isShowMultiPendingLastView() && orderDetailBean.getBridgeChildOrderDetailVo().getFinalOrder()) {
                    activityC22009hUn.EZpvd().gEmmrt.setOrderMassage(activityC22009hUn, orderDetailBean.getBridgeChildOrderDetailVo().getStatus(), false, OrderInstructionView.OrderInstructionType.MULTI_PENDING_LAST, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, activityC22009hUn.isConnected(), activityC22009hUn.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
                } else {
                    c23381hxEEZpvd.gEmmrt.setVisibility(8);
                }
            }
        }
        activityC22009hUn.AEQbTJ(orderDetailBean);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC22009hUn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC22009hUn activityC22009hUn, OrderDetailBean orderDetailBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_claim", false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", activityC22009hUn.values(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", C22380heK.OLrzqt.copydefault(activityC22009hUn.values()).fARcdN().KWHzl(orderDetailBean.getToChainId()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final ActivityC22009hUn activityC22009hUn, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            AbstractC58185ywX<ResponseData<C24256iaR>> abstractC58185ywXEZpvd = C24258iaT.EZpvd(activityC22009hUn.values(), activityC22009hUn.isConnected(), activityC22009hUn.isConnected, false);
            final Function1 function1 = new Function1() { // from class: o.hUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.OLrzqt(this.copydefault, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<C24256iaR>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hUv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC22009hUn.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.copydefault((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hUS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC22009hUn.KWHzl(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, activityC22009hUn.djBIcL);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final ActivityC22009hUn activityC22009hUn, ResponseData responseData) {
        C24256iaR c24256iaR = (C24256iaR) responseData.getData();
        if (c24256iaR != null && c24256iaR.EZpvd() != null) {
            java.lang.String strValues = activityC22009hUn.values();
            java.lang.String str = activityC22009hUn.isConnected;
            C24259iaU c24259iaUEZpvd = c24256iaR.EZpvd();
            Intrinsics.copydefault(c24259iaUEZpvd);
            activityC22009hUn.KWHzl(strValues, str, c24259iaUEZpvd);
        }
        if (responseData.getCode() == 8005) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC22009hUn);
            viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.UhxbNG);
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.QDqgQU, new View.OnClickListener() { // from class: o.hUy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC22009hUn.copydefault(this.copydefault, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC22009hUn activityC22009hUn, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC22009hUn.OLrzqt(activityC22009hUn.isConnected(), true);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC22009hUn activityC22009hUn, long j, long j2) {
        OrderDetailBean value;
        OrderDetailBean value2 = activityC22009hUn.KWHzl().djBIcL().getValue();
        if (value2 != null && C22822hmc.copydefault(false, value2.getStatus())) {
            activityC22009hUn.EZpvd().gEmmrt.setVisibility(8);
        }
        if (j == -1 && j2 != -1) {
            activityC22009hUn.KWHzl().OLrzqt(true, true);
        } else if (j2 == -1 && (value = activityC22009hUn.KWHzl().djBIcL().getValue()) != null) {
            activityC22009hUn.EZpvd().gEmmrt.setOrderMassage(activityC22009hUn, value.getStatus(), false, OrderInstructionView.OrderInstructionType.TIME_OUT_TIMESTAMP, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, value.getOrderId(), activityC22009hUn.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC22009hUn activityC22009hUn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC22009hUn.KWHzl().AkhnZx().setValue(str);
        activityC22009hUn.EZpvd().EZpvd.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final ActivityC22009hUn activityC22009hUn, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        final OrderDetailBean value = activityC22009hUn.KWHzl().djBIcL().getValue();
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) KWHzl), value != null ? value.getStatus() : null)) {
            C32866mlf.onEvent$default("DEXTrade_Txhistorydetail_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.KWHzl(this.copydefault, value, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            activityC22009hUn.EZpvd().AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.gHZMYf));
            activityC22009hUn.EZpvd().AYXKKw.OLrzqt(100L);
            activityC22009hUn.EZpvd().AYXKKw.setLoading(true);
            activityC22009hUn.EZpvd().AYXKKw.setEnabled(false);
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            OrderDetailBean value2 = activityC22009hUn.KWHzl().djBIcL().getValue();
            java.lang.String orderId = value2 != null ? value2.getOrderId() : null;
            java.lang.String str = orderId == null ? "" : orderId;
            OrderDetailBean value3 = activityC22009hUn.KWHzl().djBIcL().getValue();
            java.lang.String toChainId = value3 != null ? value3.getToChainId() : null;
            gko.copydefault(activityC22009hUn, activityC22009hUn, str, toChainId == null ? "" : toChainId, false, new Function1() { // from class: o.hUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.KWHzl(this.OLrzqt, (BridgeRedeemStatus) obj);
                }
            });
            return Unit.INSTANCE;
        }
        activityC22009hUn.OLrzqt(value);
        OrderDetailBean value4 = activityC22009hUn.KWHzl().djBIcL().getValue();
        if (value4 != null) {
            activityC22009hUn.fARcdN();
            activityC22009hUn.KWHzl().copydefault(activityC22009hUn.values(), value4.getFromChainId(), value4.getToChainId(), activityC22009hUn.isConnected, value4.getSwapTradeType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC22009hUn activityC22009hUn, OrderDetailBean orderDetailBean, EventParamsList eventParamsList) {
        DexMultiChildOrderInfoVo bridgeChildOrderDetailVo;
        DexBridgeOrderInfoVo bridgeOrderInfoVo;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_claim", false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", activityC22009hUn.values(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.BRIDGE_CLAIM_CLICK.getValue(), false, 4, null);
        java.lang.String fromChainId = orderDetailBean != null ? orderDetailBean.getFromChainId() : null;
        EventParamsList.put$default(eventParamsList, "from_chain_id", fromChainId == null ? "" : fromChainId, false, 4, null);
        java.lang.String toChainId = orderDetailBean != null ? orderDetailBean.getToChainId() : null;
        EventParamsList.put$default(eventParamsList, "to_chain_id", toChainId == null ? "" : toChainId, false, 4, null);
        java.lang.String bridgeName = (orderDetailBean == null || (bridgeChildOrderDetailVo = orderDetailBean.getBridgeChildOrderDetailVo()) == null || (bridgeOrderInfoVo = bridgeChildOrderDetailVo.getBridgeOrderInfoVo()) == null) ? null : bridgeOrderInfoVo.getBridgeName();
        EventParamsList.put$default(eventParamsList, "bridge_route", bridgeName == null ? "" : bridgeName, false, 4, null);
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(activityC22009hUn.values()).fARcdN();
        java.lang.String toChainId2 = orderDetailBean != null ? orderDetailBean.getToChainId() : null;
        EventParamsList.put$default(eventParamsList, "wallet_address", interfaceC23194htdFARcdN.KWHzl(toChainId2 != null ? toChainId2 : ""), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC22009hUn activityC22009hUn, BridgeRedeemStatus bridgeRedeemStatus) {
        Intrinsics.checkNotNullParameter(bridgeRedeemStatus, "");
        int i = ActionBar.EZpvd[bridgeRedeemStatus.ordinal()];
        if (i == 1 || i == 2) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.invokespecialaGOrKO, 0, 1, (java.lang.Object) null);
        }
        OrderDetailBean value = activityC22009hUn.KWHzl().djBIcL().getValue();
        java.lang.String toTokenSymbol = value != null ? value.getToTokenSymbol() : null;
        activityC22009hUn.AEQbTJ(toTokenSymbol != null ? toTokenSymbol : "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC22009hUn activityC22009hUn, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (java.lang.Object) null);
            activityC22009hUn.fJNWhG();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC22009hUn activityC22009hUn, CheckContinueBean checkContinueBean) {
        OrderDetailBean value = activityC22009hUn.KWHzl().djBIcL().getValue();
        if (value != null) {
            java.lang.String checkCode = checkContinueBean.getCheckCode();
            int iHashCode = checkCode.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 1567 && checkCode.equals("10")) {
                        activityC22009hUn.fJNWhG();
                        C55326xho.toastWithFailedIcon$default(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.sFt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromChain", value.getFromChainName()), C56390yDp.OLrzqt("toChain", value.getToChainName()))), 0, 1, (java.lang.Object) null);
                    }
                } else if (checkCode.equals("1")) {
                    activityC22009hUn.fJNWhG();
                    C55326xho.toastWithFailedIcon$default(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QhsCdE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", value.getFromChainName()))), 0, 1, (java.lang.Object) null);
                }
            } else if (checkCode.equals("0")) {
                if (activityC22009hUn.KWHzl().fARcdN() && activityC22009hUn.KWHzl().fIwbmz()) {
                    if (activityC22009hUn.KWHzl().ejfBZ() || activityC22009hUn.KWHzl().isConnected()) {
                        activityC22009hUn.AYXKKw();
                    } else {
                        activityC22009hUn.KWHzl(value);
                    }
                } else if (activityC22009hUn.KWHzl().ejfBZ() && C22416heu.uzCIH()) {
                    activityC22009hUn.djBIcL();
                } else if (activityC22009hUn.KWHzl().isConnected()) {
                    activityC22009hUn.AYXKKw();
                } else {
                    activityC22009hUn.KWHzl(value);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(OrderDetailBean orderDetailBean) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/swap");
        kotlin.Pair[] pairArr = new kotlin.Pair[8];
        pairArr[0] = C56390yDp.OLrzqt("fromChainId", orderDetailBean.getFromChainId());
        pairArr[1] = C56390yDp.OLrzqt("fromTokenContractAddress", orderDetailBean.getFromTokenAddress());
        pairArr[2] = C56390yDp.OLrzqt("toChainId", orderDetailBean.getToChainId());
        pairArr[3] = C56390yDp.OLrzqt("toTokenContractAddress", orderDetailBean.getToTokenAddress());
        pairArr[4] = C56390yDp.OLrzqt("isFromNative", orderDetailBean.isNativeToken4FromToken());
        pairArr[5] = C56390yDp.OLrzqt("isToNative", orderDetailBean.isNativeToken());
        pairArr[6] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getStatus(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? orderDetailBean.getFromAmount() : "0");
        pairArr[7] = C56390yDp.OLrzqt("tradeMode", Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getFromChainId(), (java.lang.Object) orderDetailBean.getToChainId()) ? java.lang.Integer.valueOf(orderDetailBean.getTradeMode()) : "");
        interfaceC43294rma.KWHzl(this, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.valueOf((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit valueOf(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        OrderDetailBean value = KWHzl().djBIcL().getValue();
        if (value != null) {
            AdvancedModeParams advancedModeParams = value.getAdvancedModeParams();
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            android.content.Context context = EZpvd().AYXKKw.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ(advancedModeParams.EZpvd() == TxDirection.BUY ? "dex/advanced/buy" : "dex/advanced/sell");
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = advancedModeParams.AEQbTJ();
            java.lang.String chainId = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("chainId", chainId);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = advancedModeParams.AhwBna();
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("buyTokenContractAddress", tokenContractAddress);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = advancedModeParams.AEQbTJ();
            java.lang.String tokenContractAddress2 = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getTokenContractAddress() : null;
            if (tokenContractAddress2 == null) {
                tokenContractAddress2 = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("payTokenContractAddress", tokenContractAddress2);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ3 = advancedModeParams.AEQbTJ();
            java.lang.String tokenContractAddress3 = dexMultiTokenInfoBeanAEQbTJ3 != null ? dexMultiTokenInfoBeanAEQbTJ3.getTokenContractAddress() : null;
            if (tokenContractAddress3 == null) {
                tokenContractAddress3 = "";
            }
            pairArr[3] = C56390yDp.OLrzqt("sellTokenContractAddress", tokenContractAddress3);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2 = advancedModeParams.AhwBna();
            java.lang.String tokenContractAddress4 = dexMultiTokenInfoBeanAhwBna2 != null ? dexMultiTokenInfoBeanAhwBna2.getTokenContractAddress() : null;
            pairArr[4] = C56390yDp.OLrzqt("forTokenContractAddress", tokenContractAddress4 != null ? tokenContractAddress4 : "");
            pairArr[5] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, advancedModeParams.OLrzqt());
            interfaceC43294rma.KWHzl(context, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hUJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.OLrzqt((AbstractC43238rlX) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        OrderDetailBean value = KWHzl().djBIcL().getValue();
        if (value != null) {
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            android.content.Context context = EZpvd().AYXKKw.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/meme/swap");
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            pairArr[0] = C56390yDp.OLrzqt("chainId", value.getMemeModeTokenBase().getChainId());
            pairArr[1] = C56390yDp.OLrzqt("tokenContractAddress", value.getMemeModeTokenBase().getTokenContractAddress());
            pairArr[2] = C56390yDp.OLrzqt("transaction_direction", java.lang.Integer.valueOf(value.getDirection()));
            pairArr[3] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, Intrinsics.EZpvd((java.lang.Object) value.getStatus(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? value.getFromAmount() : "");
            pairArr[4] = C56390yDp.OLrzqt("payTokenContractAddress", value.getFromTokenAddress());
            pairArr[5] = C56390yDp.OLrzqt("forTokenContractAddress", value.getToTokenAddress());
            interfaceC43294rma.KWHzl(context, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hUo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.copydefault((AbstractC43238rlX) obj);
                }
            });
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        EZpvd().AYXKKw.setOKDSType(257);
        EZpvd().AYXKKw.setText(C33069mpW.copydefault(C23274hvD.Fragment.DQzvGNdrmXxudrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str))));
        EZpvd().AYXKKw.fIwbmz();
        EZpvd().AYXKKw.setLoading(false);
        EZpvd().AYXKKw.setEnabled(true);
    }

    public final void EZpvd(OrderDetailBean orderDetailBean) {
        if (this.OLrzqt == null) {
            this.OLrzqt = hVP.copydefault(orderDetailBean.getSwapTradeType(), values());
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int id = EZpvd().OLrzqt.getId();
            AbstractC22038hVp abstractC22038hVp = this.OLrzqt;
            Intrinsics.copydefault(abstractC22038hVp);
            fragmentTransactionBeginTransaction.replace(id, abstractC22038hVp).commit();
        }
    }

    private final void fIwbmz() {
        getOrderData$default(this, isConnected(), false, 2, null);
    }

    public static /* synthetic */ void getOrderData$default(ActivityC22009hUn activityC22009hUn, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        activityC22009hUn.OLrzqt(str, z);
    }

    public final void OLrzqt(final java.lang.String str, final boolean z) {
        if (!z) {
            AuCTel();
        }
        KWHzl().OLrzqt(values(), AEQbTJ(), str, new Function2() { // from class: o.hUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC22009hUn.AEQbTJ(z, this, str, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(boolean z, ActivityC22009hUn activityC22009hUn, java.lang.String str, boolean z2, boolean z3) {
        if (z) {
            return Unit.INSTANCE;
        }
        activityC22009hUn.DbNXlk();
        if (z2) {
            activityC22009hUn.EZpvd(z3);
            activityC22009hUn.KWHzl().AYXKKw().observe(activityC22009hUn, activityC22009hUn.fetchVPNInfo);
            activityC22009hUn.KWHzl().KWHzl(str);
        } else {
            activityC22009hUn.KWHzl().AYXKKw().removeObserver(activityC22009hUn.fetchVPNInfo);
            activityC22009hUn.KWHzl().hDKMBd();
            showErrorState$default(activityC22009hUn, true, null, 2, null);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC22009hUn, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2, final C24259iaU c24259iaU) {
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.KWHzl(this, new DappInteractionArgs(c24259iaU.AEQbTJ(), null, c24259iaU.KWHzl(), c24259iaU.copydefault(), c24259iaU.EZpvd(), null, "dex", 3, null, null, null, null, false, false, c24259iaU.OLrzqt(), true, null, null, null, null, null, null, null, null, null, null, 1, "", null, null, null, null, -201375998, null), new Function1() { // from class: o.hUs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.KWHzl((android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.hUr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.EZpvd(str, c24259iaU, (NewCallbackBean) obj);
                }
            }, new Function1() { // from class: o.hUp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC22009hUn.copydefault(str, c24259iaU, str2, (NewCallbackBean) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(android.os.Bundle bundle) {
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX EZpvd(java.lang.String str, C24259iaU c24259iaU, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return C24258iaT.AEQbTJ(str, c24259iaU.KWHzl(), c24259iaU.OLrzqt(), newCallbackBean.getBody(), newCallbackBean.getHeaderMap());
    }

    public static final AbstractC58185ywX copydefault(java.lang.String str, C24259iaU c24259iaU, java.lang.String str2, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX<ResponseData<C24256iaR>> abstractC58185ywXEZpvd = C24258iaT.EZpvd(str, c24259iaU.OLrzqt(), str2, true);
        final Function1 function1 = new Function1() { // from class: o.hUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC22009hUn.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        C24256iaR c24256iaR = (C24256iaR) responseData.getData();
        java.lang.String strKWHzl = c24256iaR != null ? c24256iaR.KWHzl() : null;
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, responseData.getErrorMsg(), strKWHzl, null, 36, null);
    }

    public static /* synthetic */ void showErrorState$default(ActivityC22009hUn activityC22009hUn, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        activityC22009hUn.EZpvd(z, str);
    }

    public final void EZpvd(boolean z, java.lang.String str) {
        EZpvd().OLrzqt.setVisibility(z ? 8 : 0);
        C55173xeu c55173xeu = EZpvd().AEQbTJ;
        if (z) {
            c55173xeu.setVisibility(0);
            java.lang.String string = getString(C23274hvD.Fragment.ActivityResultKt);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            java.lang.String string2 = getString(C23274hvD.Fragment.UscePu);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            java.lang.String string3 = getString(C23274hvD.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hUq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC22009hUn.EZpvd(this.AEQbTJ, view);
                }
            });
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static final void EZpvd(ActivityC22009hUn activityC22009hUn, android.view.View view) {
        getOrderData$default(activityC22009hUn, activityC22009hUn.isConnected(), false, 2, null);
    }

    public final void EZpvd(boolean z) {
        EZpvd().OLrzqt.setVisibility(z ? 8 : 0);
        C55173xeu c55173xeu = EZpvd().AEQbTJ;
        if (z) {
            c55173xeu.setVisibility(0);
            c55173xeu.setTitle("");
            c55173xeu.setImage(C52761wXj.TaskDescription.gCNefq);
            java.lang.String string = getString(C23274hvD.Fragment.aPFruk);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static /* synthetic */ void showFromChainIsBtcCoinTips$default(ActivityC22009hUn activityC22009hUn, OrderDetailBean orderDetailBean, TradeState tradeState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            orderDetailBean = null;
        }
        if ((i & 2) != 0) {
            tradeState = null;
        }
        activityC22009hUn.copydefault(orderDetailBean, tradeState);
    }

    public final void copydefault(OrderDetailBean orderDetailBean, TradeState tradeState) {
        java.lang.String str;
        java.lang.String status;
        java.lang.String status2;
        if (orderDetailBean != null && (chainName = orderDetailBean.getFromChainName()) != null) {
            str = chainName;
        } else if (tradeState != null) {
            java.lang.String chainName = tradeState.getChainName();
            str = chainName;
        } else {
            str = "";
        }
        if (orderDetailBean == null || (status2 = orderDetailBean.getStatus()) == null) {
            status = tradeState != null ? tradeState.getStatus() : "";
        } else {
            status = status2;
        }
        EZpvd().gEmmrt.setOrderMassage(this, status, false, OrderInstructionView.OrderInstructionType.BTC_FROM_WARN, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : str, isConnected(), this.isConnected, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C52794wYp c52794wYp = EZpvd().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        int i = 0;
        if (!EZpvd(str) && (!C22822hmc.copydefault(false, str) || !C22372heC.AEQbTJ(values()) || C22822hmc.copydefault(str2))) {
            i = 8;
        }
        c52794wYp.setVisibility(i);
    }

    public final boolean EZpvd(java.lang.String str) {
        return KWHzl.contains(str) && !OLrzqt();
    }

    /* JADX DEBUG: Possible override for method o.hUV.OLrzqt()V */
    public final boolean OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJAkhnZx = AkhnZx();
        return interfaceC9738bbJAkhnZx != null && interfaceC9738bbJAkhnZx.QfsBiF();
    }

    private final InterfaceC9738bbJ AkhnZx() {
        return C22380heK.OLrzqt.copydefault(values()).fARcdN().AEQbTJ();
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        if (C22822hmc.copydefault(false, str) || EZpvd(str)) {
            C52794wYp c52794wYp = EZpvd().AYXKKw;
            int iHashCode = str.hashCode();
            if (iHashCode != 49) {
                if (iHashCode != 49586) {
                    EZpvd().AYXKKw.setOKDSType(257);
                    string = C33069mpW.copydefault(C23274hvD.Fragment.DQzvGNdrmXxudrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str2)));
                } else {
                    EZpvd().AYXKKw.setOKDSType(257);
                    string = C33069mpW.copydefault(C23274hvD.Fragment.DQzvGNdrmXxudrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str2)));
                }
            } else if (str.equals("1")) {
                EZpvd().AYXKKw.setOKDSType(260);
                string = getString(C23274hvD.Fragment.onMetadataUpdate);
            } else {
                string = getString(C23274hvD.Fragment.OeawrH);
            }
            c52794wYp.setText(string);
        }
    }

    private final void AuCTel() {
        android.widget.FrameLayout frameLayout = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C24257iaS.EZpvd(frameLayout);
    }

    private final void DbNXlk() {
        android.widget.FrameLayout frameLayout = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C57600ylV.AEQbTJ(frameLayout);
    }

    private final void fARcdN() {
        if (EZpvd().AYXKKw.fJNWhG()) {
            return;
        }
        C52794wYp.startLoading$default(EZpvd().AYXKKw, 0L, 1, null);
    }

    private final void fJNWhG() {
        C23381hxE c23381hxEEZpvd = EZpvd();
        if (c23381hxEEZpvd.AYXKKw.fJNWhG()) {
            c23381hxEEZpvd.AYXKKw.fIwbmz();
        }
    }

    @Override // o.hUV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.djBIcL);
        KWHzl().AYXKKw().removeObserver(this.fetchVPNInfo);
        KWHzl().hDKMBd();
        EZpvd().EZpvd.AEQbTJ();
        fJNWhG();
        C22370heA.KWHzl().clear();
        C54819xWm.KWHzl().KWHzl(this.AEQbTJ);
    }

    public final void AEQbTJ(final OrderDetailBean orderDetailBean) {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.KWHzl(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("DEXTrade_Txhistorydetail_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.gEmmrt(this.copydefault, orderDetailBean, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(ActivityC22009hUn activityC22009hUn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_address", activityC22009hUn.isConnected, false, 4, null);
        EventParamsList.put$default(eventParamsList, "orderId", activityC22009hUn.isConnected(), false, 4, null);
        eventParamsList.put("source", activityC22009hUn.fetchVPNInfo(), true);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC22009hUn activityC22009hUn, OrderDetailBean orderDetailBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        activityC22009hUn.KWHzl(eventParamsList, orderDetailBean);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final OrderDetailBean orderDetailBean) {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("DEXTrade_Txhistorydetail_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22009hUn.OLrzqt(orderDetailBean, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(ActivityC22009hUn activityC22009hUn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_address", activityC22009hUn.isConnected, false);
        eventParamsList.put("orderId", activityC22009hUn.isConnected(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, DexHistoryDetailsFullPageClick.ButtonName.TRADE_AGAIN.getValue(), true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OrderDetailBean orderDetailBean, ActivityC22009hUn activityC22009hUn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) KWHzl), orderDetailBean != null ? orderDetailBean.getStatus() : null) ? "claim" : "do_another_trade", false, 4, null);
        activityC22009hUn.KWHzl(eventParamsList, orderDetailBean);
        return Unit.INSTANCE;
    }

    public final void KWHzl(EventParamsList eventParamsList, OrderDetailBean orderDetailBean) {
        EventParamsList.put$default(eventParamsList, "is_tee", KWHzl().fARcdN() ? "yes" : "no", false, 4, null);
        if (orderDetailBean != null) {
            java.lang.String strCopydefault = copydefault(orderDetailBean);
            if (strCopydefault != null) {
                EventParamsList.put$default(eventParamsList, "order_status", strCopydefault, false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, orderDetailBean.getOrderId(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "transaction_hash", orderDetailBean.getTransactionHash(), false, 4, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(OrderDetailBean orderDetailBean) {
        java.lang.String status = orderDetailBean.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode != 48) {
            if (iHashCode == 49) {
                if (status.equals("1")) {
                    return "completed";
                }
                return null;
            }
            if (iHashCode != 48625) {
                switch (iHashCode) {
                    case 1444:
                        if (!status.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                        }
                        break;
                    case 1445:
                        if (!status.equals("-2")) {
                        }
                        break;
                    case 1446:
                        if (!status.equals("-3")) {
                        }
                        break;
                    case 1447:
                        if (!status.equals("-4")) {
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case 1567:
                                if (!status.equals("10")) {
                                }
                                break;
                            case 1568:
                                if (!status.equals("11")) {
                                }
                                break;
                            case 1569:
                                if (!status.equals("12")) {
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 49586:
                                        if (!status.equals("200")) {
                                        }
                                        break;
                                    case 49587:
                                        if (!status.equals("201")) {
                                        }
                                        break;
                                    case 49588:
                                        if (!status.equals("202")) {
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return null;
            }
            if (!status.equals("100")) {
                return null;
            }
        } else if (!status.equals("0")) {
            return null;
        }
        return "processing";
    }

    @Override // o.hUV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.hUV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.hUV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.hUV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
