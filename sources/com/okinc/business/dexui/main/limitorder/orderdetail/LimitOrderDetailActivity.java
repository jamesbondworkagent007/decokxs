package com.okinc.business.dexui.main.limitorder.orderdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyMode;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderCancelStatus;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity;
import com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView;
import com.okinc.business.dexui.main.swap.history.detail.widget.appbar.data.AppBarState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC43238rlX;
import o.C21808hNb;
import o.C22313hcx;
import o.C22416heu;
import o.C22522hgu;
import o.C22822hmc;
import o.C23274hvD;
import o.C23313hvq;
import o.C23377hxA;
import o.C24257iaS;
import o.C25352ivB;
import o.C25353ivC;
import o.C25402ivz;
import o.C31200lpY;
import o.C32866mlf;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C52794wYp;
import o.C54819xWm;
import o.C55173xeu;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.C57600ylV;
import o.InterfaceC43294rma;
import o.InterfaceC54816xWj;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.ViewOnClickListenerC54939xaY;
import o.gKZ;
import o.gLW;
import o.gXU;
import o.hLV;
import o.hMR;
import o.hMT;
import o.hMU;
import o.hXK;
import o.yCM;
import o.yDY;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderDetailActivity extends hLV {
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public gLW signMessageUiService;
    public C23377hxA valueOf;
    public final InterfaceC56387yDm djBIcL = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (Object) null);
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hLY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderDetailActivity.values(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hLW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderDetailActivity.gEmmrt(this.OLrzqt);
        }
    });
    public ActionBar OLrzqt = new ActionBar();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxDirection.values().length];
            try {
                iArr[TxDirection.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TxDirection.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public LimitOrderDetailActivity() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(LimitOrderDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity$special$$inlined$viewModels$default$3
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

    public final LimitOrderDetailViewModel AhwBna() {
        return (LimitOrderDetailViewModel) this.gEmmrt.getValue();
    }

    private final String fARcdN() {
        return (String) this.djBIcL.getValue();
    }

    public final OrderStrategyType AYXKKw() {
        return (OrderStrategyType) this.AhwBna.getValue();
    }

    public static final OrderStrategyType values(LimitOrderDetailActivity limitOrderDetailActivity) {
        Intent intent = limitOrderDetailActivity.getIntent();
        if (intent != null) {
            OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(intent.getIntExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE, 0));
            if (orderStrategyTypeCopydefault != null) {
                return orderStrategyTypeCopydefault;
            }
        }
        return OrderStrategyType.Limit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AuCTel() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String gEmmrt(LimitOrderDetailActivity limitOrderDetailActivity) {
        Intent intent = limitOrderDetailActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(OtcExtraKeys.ORDER_ID) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            LimitOrderDetailActivity.this.copydefault(false);
        }
    }

    @Override // o.hLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23377hxA c23377hxAKWHzl = C23377hxA.KWHzl(getLayoutInflater());
        this.valueOf = c23377hxAKWHzl;
        setContentView(c23377hxAKWHzl != null ? c23377hxAKWHzl.getRoot() : null);
        DbNXlk();
        fetchVPNInfo();
        loadData$default(this, false, 1, null);
    }

    private final void DbNXlk() {
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c23377hxA.isConnected, 0L, new Function1() { // from class: o.hMa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderDetailActivity.EZpvd(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(c23377hxA.AYXKKw, 0L, new Function1() { // from class: o.hLZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderDetailActivity.copydefault(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
            C52794wYp c52794wYp = c23377hxA.fARcdN;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        }
    }

    public static final Unit EZpvd(LimitOrderDetailActivity limitOrderDetailActivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        limitOrderDetailActivity.EZpvd();
        limitOrderDetailActivity.valueOf(limitOrderDetailActivity.AhwBna().AYXKKw().getValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(LimitOrderDetailActivity limitOrderDetailActivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OrderDetailResult value = limitOrderDetailActivity.AhwBna().AYXKKw().getValue();
        if (value != null) {
            if (value.getStrategyMode() == OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()) {
                gXU.Companion.KWHzl(limitOrderDetailActivity, value.getStrategyId());
            } else {
                limitOrderDetailActivity.isConnected();
                limitOrderDetailActivity.KWHzl("do_another_trade", value);
                FromChildOrderDetailVO fromChildOrderDetailVO = value.getFromChildOrderDetailVO();
                if (fromChildOrderDetailVO != null) {
                    limitOrderDetailActivity.AhwBna().AEQbTJ(limitOrderDetailActivity.fARcdN(), fromChildOrderDetailVO.getFromChainId(), fromChildOrderDetailVO.getToChainId(), fromChildOrderDetailVO.getUserWalletAddress(), value.getSwapTradeType());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ LimitOrderDetailActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, LimitOrderDetailActivity limitOrderDetailActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = limitOrderDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LimitOrderDetailActivity limitOrderDetailActivity = this.copydefault;
                limitOrderDetailActivity.KWHzl("resume", limitOrderDetailActivity.AhwBna().AYXKKw().getValue());
                this.copydefault.djBIcL();
            }
        }
    }

    private final void fetchVPNInfo() {
        hXK hxk;
        C54819xWm.KWHzl().AEQbTJ(this.OLrzqt);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LimitOrderDetailActivity$addDataListener$1(this, null), 3, null);
        AhwBna().AYXKKw().observe(this, new Application(new Function1() { // from class: o.hLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.OLrzqt(this.AEQbTJ, (OrderDetailResult) obj);
            }
        }));
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null && (hxk = c23377hxA.copydefault) != null) {
            hxk.setCountDownListener(new Function2() { // from class: o.hLU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return LimitOrderDetailActivity.copydefault(this.KWHzl, ((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
                }
            });
        }
        AhwBna().gEmmrt().observe(this, new Application(new Function1() { // from class: o.hMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
        AhwBna().OLrzqt().observe(this, new Application(new Function1() { // from class: o.hMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.OLrzqt(this.KWHzl, (CheckContinueBean) obj);
            }
        }));
        AhwBna().KWHzl().observe(this, new Application(new Function1() { // from class: o.hMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LimitOrderDetailActivity$addDataListener$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LimitOrderDetailActivity$addDataListener$8(this, null), 3, null);
    }

    public static final Unit OLrzqt(LimitOrderDetailActivity limitOrderDetailActivity, OrderDetailResult orderDetailResult) {
        C23377hxA c23377hxA = limitOrderDetailActivity.valueOf;
        if (c23377hxA != null) {
            Intrinsics.copydefault(orderDetailResult);
            limitOrderDetailActivity.OLrzqt(orderDetailResult);
            if (C22822hmc.copydefault(true, orderDetailResult.getStatus())) {
                limitOrderDetailActivity.gEmmrt();
            }
            limitOrderDetailActivity.djBIcL(orderDetailResult);
            c23377hxA.copydefault.setOrderState(new AppBarState(true, orderDetailResult.getStatus(), false, 4, null));
            if (orderDetailResult.isOutTime() || orderDetailResult.isOutOfTimeBy5Minute()) {
                c23377hxA.AuCTel.setOrderMassage(limitOrderDetailActivity, orderDetailResult.getStatus(), true, OrderInstructionView.OrderInstructionType.TIME_OUT_TIMESTAMP, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, limitOrderDetailActivity.AuCTel(), orderDetailResult.getUserWalletAddress(), (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
            } else if (limitOrderDetailActivity.KWHzl(orderDetailResult)) {
                c23377hxA.copydefault.setCountDown(C33129mqd.valueOf(C23313hvq.divCheckS$default(orderDetailResult.getRemainTime(), 1000, null, null, null, 14, null)), orderDetailResult.getLeftTimeBy5Minute());
            }
            FrameLayout frameLayout = c23377hxA.KWHzl;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(orderDetailResult.walletSupportTrade(limitOrderDetailActivity.fARcdN()) ? 0 : 8);
            C52794wYp c52794wYp = c23377hxA.isConnected;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(orderDetailResult.getCanCancel() == LimitOrderCancelStatus.Cancellable.getValue() ? 0 : 8);
            if (limitOrderDetailActivity.AhwBna().AEQbTJ(orderDetailResult)) {
                C52794wYp c52794wYp2 = c23377hxA.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(0);
                c23377hxA.isConnected.setOKDSType(257);
            } else {
                C52794wYp c52794wYp3 = c23377hxA.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                c52794wYp3.setVisibility(8);
                c23377hxA.isConnected.setOKDSType(260);
            }
            c23377hxA.djBIcL.AEQbTJ(limitOrderDetailActivity.fARcdN(), orderDetailResult);
            OKAlertBanner oKAlertBanner = c23377hxA.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
            oKAlertBanner.setVisibility(C33129mqd.OLrzqt((CharSequence) orderDetailResult.getBannerMessage()) ? 0 : 8);
            c23377hxA.AkhnZx.setMessage(orderDetailResult.getBannerMessage());
            c23377hxA.AkhnZx.setFunctionIconVisibility(false);
            limitOrderDetailActivity.AhwBna(orderDetailResult);
            limitOrderDetailActivity.AYXKKw(orderDetailResult);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(LimitOrderDetailActivity limitOrderDetailActivity, long j, long j2) {
        C23377hxA c23377hxA;
        OrderInstructionView orderInstructionView;
        String userWalletAddress;
        String status;
        if (j2 == -1 && (c23377hxA = limitOrderDetailActivity.valueOf) != null && (orderInstructionView = c23377hxA.AuCTel) != null) {
            OrderDetailResult value = limitOrderDetailActivity.AhwBna().AYXKKw().getValue();
            String str = (value == null || (status = value.getStatus()) == null) ? "" : status;
            OrderInstructionView.OrderInstructionType orderInstructionType = OrderInstructionView.OrderInstructionType.TIME_OUT_TIMESTAMP;
            String strAuCTel = limitOrderDetailActivity.AuCTel();
            OrderDetailResult value2 = limitOrderDetailActivity.AhwBna().AYXKKw().getValue();
            orderInstructionView.setOrderMassage(limitOrderDetailActivity, str, true, orderInstructionType, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 16) != 0 ? "" : null, strAuCTel, (value2 == null || (userWalletAddress = value2.getUserWalletAddress()) == null) ? "" : userWalletAddress, (CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA & 128) != 0 ? "" : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [305=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit AEQbTJ(LimitOrderDetailActivity limitOrderDetailActivity, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 50:
                    if (str.equals("2")) {
                        limitOrderDetailActivity.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.dTTfOR));
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        limitOrderDetailActivity.values();
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        limitOrderDetailActivity.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.fObYrO));
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        limitOrderDetailActivity.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.iluEmO));
                    }
                    break;
                case 54:
                    if (str.equals(OrderDetailListItem.SLIP_OUT)) {
                        limitOrderDetailActivity.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.hErYDe));
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(LimitOrderDetailActivity limitOrderDetailActivity, CheckContinueBean checkContinueBean) {
        String fromChainName;
        String fromChainName2;
        String toChainName;
        OrderDetailResult value = limitOrderDetailActivity.AhwBna().AYXKKw().getValue();
        if (value != null) {
            String checkCode = checkContinueBean.getCheckCode();
            int iHashCode = checkCode.hashCode();
            if (iHashCode != 48) {
                String str = "";
                if (iHashCode != 1598) {
                    if (iHashCode == 1629 && checkCode.equals("30")) {
                        limitOrderDetailActivity.valueOf();
                        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                        int i = C23274hvD.Fragment.sFt;
                        Pair[] pairArr = new Pair[2];
                        FromChildOrderDetailVO fromChildOrderDetailVO = value.getFromChildOrderDetailVO();
                        if (fromChildOrderDetailVO == null || (fromChainName2 = fromChildOrderDetailVO.getFromChainName()) == null) {
                            fromChainName2 = "";
                        }
                        pairArr[0] = C56390yDp.OLrzqt("fromChain", fromChainName2);
                        FromChildOrderDetailVO fromChildOrderDetailVO2 = value.getFromChildOrderDetailVO();
                        if (fromChildOrderDetailVO2 != null && (toChainName = fromChildOrderDetailVO2.getToChainName()) != null) {
                            str = toChainName;
                        }
                        pairArr[1] = C56390yDp.OLrzqt("toChain", str);
                        C55326xho.toastWithFailedIcon$default(C33069mpW.KWHzl(applicationOLrzqt, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)), 0, 1, (Object) null);
                    }
                } else if (checkCode.equals("20")) {
                    limitOrderDetailActivity.valueOf();
                    android.app.Application applicationOLrzqt2 = C32979mnm.EZpvd.OLrzqt();
                    int i2 = C23274hvD.Fragment.QhsCdE;
                    FromChildOrderDetailVO fromChildOrderDetailVO3 = value.getFromChildOrderDetailVO();
                    if (fromChildOrderDetailVO3 != null && (fromChainName = fromChildOrderDetailVO3.getFromChainName()) != null) {
                        str = fromChainName;
                    }
                    C55326xho.toastWithFailedIcon$default(C33069mpW.KWHzl(applicationOLrzqt2, i2, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", str))), 0, 1, (Object) null);
                }
            } else if (checkCode.equals("0")) {
                if (!C22416heu.gEmmrt()) {
                    limitOrderDetailActivity.EZpvd(value);
                    return Unit.INSTANCE;
                }
                if (limitOrderDetailActivity.AYXKKw() == OrderStrategyType.Tp || limitOrderDetailActivity.AYXKKw() == OrderStrategyType.Sl || value.getStrategyMode() != OrderStrategyMode.TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER.getStrategyMode()) {
                    limitOrderDetailActivity.AEQbTJ(value);
                    return Unit.INSTANCE;
                }
                limitOrderDetailActivity.EZpvd(value);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderDetailActivity limitOrderDetailActivity, Boolean bool) {
        if (bool.booleanValue()) {
            limitOrderDetailActivity.valueOf();
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(OrderDetailResult orderDetailResult) {
        String fromChainId;
        String fromTokenContractAddress;
        String toChainId;
        String toTokenContractAddress;
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/limit-order");
        Pair[] pairArr = new Pair[4];
        FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
        String str = "";
        if (fromChildOrderDetailVO == null || (fromChainId = fromChildOrderDetailVO.getFromChainId()) == null) {
            fromChainId = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("fromChainId", fromChainId);
        FromChildOrderDetailVO fromChildOrderDetailVO2 = orderDetailResult.getFromChildOrderDetailVO();
        if (fromChildOrderDetailVO2 == null || (fromTokenContractAddress = fromChildOrderDetailVO2.getFromTokenContractAddress()) == null) {
            fromTokenContractAddress = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("fromTokenContractAddress", fromTokenContractAddress);
        FromChildOrderDetailVO fromChildOrderDetailVO3 = orderDetailResult.getFromChildOrderDetailVO();
        if (fromChildOrderDetailVO3 == null || (toChainId = fromChildOrderDetailVO3.getToChainId()) == null) {
            toChainId = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("toChainId", toChainId);
        FromChildOrderDetailVO fromChildOrderDetailVO4 = orderDetailResult.getFromChildOrderDetailVO();
        if (fromChildOrderDetailVO4 != null && (toTokenContractAddress = fromChildOrderDetailVO4.getToTokenContractAddress()) != null) {
            str = toTokenContractAddress;
        }
        pairArr[3] = C56390yDp.OLrzqt("toTokenContractAddress", str);
        interfaceC43294rma.KWHzl(this, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(OrderDetailResult orderDetailResult) {
        String str;
        AdvancedModeParams advancedModeParamsEZpvd = C22522hgu.EZpvd(orderDetailResult);
        int i = TaskDescription.OLrzqt[advancedModeParamsEZpvd.EZpvd().ordinal()];
        if (i == 1) {
            str = "dex/advanced/buy";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "dex/advanced/sell";
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        String strAEQbTJ = gKZ.EZpvd.AEQbTJ(str);
        Pair[] pairArr = new Pair[7];
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = advancedModeParamsEZpvd.AEQbTJ();
        String chainId = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("chainId", chainId);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = advancedModeParamsEZpvd.AhwBna();
        String tokenContractAddress = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("buyTokenContractAddress", tokenContractAddress);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = advancedModeParamsEZpvd.AEQbTJ();
        String tokenContractAddress2 = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getTokenContractAddress() : null;
        if (tokenContractAddress2 == null) {
            tokenContractAddress2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("payTokenContractAddress", tokenContractAddress2);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ3 = advancedModeParamsEZpvd.AEQbTJ();
        String tokenContractAddress3 = dexMultiTokenInfoBeanAEQbTJ3 != null ? dexMultiTokenInfoBeanAEQbTJ3.getTokenContractAddress() : null;
        if (tokenContractAddress3 == null) {
            tokenContractAddress3 = "";
        }
        pairArr[3] = C56390yDp.OLrzqt("sellTokenContractAddress", tokenContractAddress3);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2 = advancedModeParamsEZpvd.AhwBna();
        String tokenContractAddress4 = dexMultiTokenInfoBeanAhwBna2 != null ? dexMultiTokenInfoBeanAhwBna2.getTokenContractAddress() : null;
        pairArr[4] = C56390yDp.OLrzqt("forTokenContractAddress", tokenContractAddress4 != null ? tokenContractAddress4 : "");
        pairArr[5] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, advancedModeParamsEZpvd.OLrzqt());
        pairArr[6] = C56390yDp.OLrzqt("orderType", Integer.valueOf(advancedModeParamsEZpvd.AYXKKw().getValue()));
        interfaceC43294rma.KWHzl(this, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.EZpvd((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(C21808hNb c21808hNb, final OrderDetailListItem orderDetailListItem) {
        String failReason;
        if (orderDetailListItem == null || (failReason = orderDetailListItem.getFailReason()) == null || failReason.length() <= 0) {
            return;
        }
        if (Intrinsics.EZpvd((Object) orderDetailListItem.getFailReason(), (Object) "1")) {
            c21808hNb.setFailReasonMessage(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QUeTTI, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", orderDetailListItem.getTokenSymbol()))));
            c21808hNb.setFailViewVisible(0, true);
        } else {
            c21808hNb.setFailReasonMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.RXxsjQ));
            c21808hNb.setFailReasonClickMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.RxVVQC));
            c21808hNb.setFailViewVisible(0, false);
            c21808hNb.setFailReasonClick(new Function0() { // from class: o.hLT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderDetailActivity.copydefault(this.copydefault, orderDetailListItem);
                }
            });
        }
    }

    public static final Unit copydefault(LimitOrderDetailActivity limitOrderDetailActivity, OrderDetailListItem orderDetailListItem) {
        limitOrderDetailActivity.AhwBna().gEmmrt().setValue(orderDetailListItem.getFailReason());
        return Unit.INSTANCE;
    }

    public final void djBIcL(OrderDetailResult orderDetailResult) {
        hMU hmu;
        List<ExecutionHistory> executionHistoryList = orderDetailResult.getExecutionHistoryList();
        List<hMR> listCopydefault = null;
        if (executionHistoryList == null) {
            executionHistoryList = null;
        } else if (orderDetailResult.getExecutionHistoryShowMaxNum() != null) {
            executionHistoryList = CollectionsKt___CollectionsKt.AhwBna((Iterable) executionHistoryList, orderDetailResult.getExecutionHistoryShowMaxNum().intValue());
        }
        Integer executionHistoryShowMaxNum = orderDetailResult.getExecutionHistoryShowMaxNum();
        boolean zShowExecutionHistoryMaxNum = orderDetailResult.showExecutionHistoryMaxNum();
        if (C33129mqd.KWHzl((Collection) executionHistoryList)) {
            LimitOrderDetailViewModel limitOrderDetailViewModelAhwBna = AhwBna();
            Intrinsics.copydefault(executionHistoryList);
            listCopydefault = limitOrderDetailViewModelAhwBna.copydefault(executionHistoryList);
        }
        hMT hmt = new hMT(executionHistoryShowMaxNum, zShowExecutionHistoryMaxNum, listCopydefault);
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA == null || (hmu = c23377hxA.valueOf) == null) {
            return;
        }
        hmu.setData(hmt);
    }

    public final void AhwBna(OrderDetailResult orderDetailResult) {
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null) {
            boolean z = !StringsKt__StringsKt.fARcdN((CharSequence) orderDetailResult.getSurplus());
            AppCompatTextView appCompatTextView = c23377hxA.values;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(z ? 0 : 8);
            if (z) {
                AppCompatTextView appCompatTextView2 = c23377hxA.values;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                String surplus = orderDetailResult.getSurplus();
                String surplusUsdValue = orderDetailResult.getSurplusUsdValue();
                String tokenSymbol = orderDetailResult.getToToken().getTokenSymbol();
                List listGEmmrt = yDY.gEmmrt(orderDetailResult.getFromToken().getTokenLogoUrl(), orderDetailResult.getToToken().getTokenLogoUrl());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listGEmmrt) {
                    if (!StringsKt__StringsKt.fARcdN((CharSequence) obj)) {
                        arrayList.add(obj);
                    }
                }
                String tokenAmount = orderDetailResult.getToToken().getTokenAmount();
                String tokenAmount2 = orderDetailResult.getToToken().getTokenAmount();
                String tokenContractAddress = orderDetailResult.getToToken().getTokenContractAddress();
                String chainId = orderDetailResult.getToToken().getChainId();
                Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(orderDetailResult.getTransactionTime());
                C25402ivz c25402ivz = new C25402ivz(surplus, surplusUsdValue, tokenSymbol, arrayList, tokenAmount, tokenAmount2, tokenContractAddress, chainId, fieldNames != null ? fieldNames.longValue() : 0L);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C25353ivC.AEQbTJ(appCompatTextView2, c25402ivz, supportFragmentManager);
            }
        }
    }

    public static /* synthetic */ void loadData$default(LimitOrderDetailActivity limitOrderDetailActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        limitOrderDetailActivity.copydefault(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        AhwBna().KWHzl(AuCTel(), z);
    }

    public final void EZpvd(boolean z) {
        C55173xeu c55173xeu;
        NestedScrollView nestedScrollView;
        C22313hcx c22313hcx;
        NestedScrollView nestedScrollView2;
        C22313hcx c22313hcx2;
        C22313hcx c22313hcx3;
        C55173xeu c55173xeu2;
        if (z) {
            C23377hxA c23377hxA = this.valueOf;
            if (c23377hxA != null && (c55173xeu2 = c23377hxA.AEQbTJ) != null) {
                c55173xeu2.setVisibility(8);
            }
            C23377hxA c23377hxA2 = this.valueOf;
            if (c23377hxA2 != null && (c22313hcx3 = c23377hxA2.OLrzqt) != null) {
                c22313hcx3.setVisibility(0);
            }
            C23377hxA c23377hxA3 = this.valueOf;
            if (c23377hxA3 != null && (c22313hcx2 = c23377hxA3.OLrzqt) != null) {
                c22313hcx2.setOnSuccessListener(new Function0() { // from class: o.hMf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return LimitOrderDetailActivity.fetchVPNInfo(this.KWHzl);
                    }
                });
            }
            C23377hxA c23377hxA4 = this.valueOf;
            if (c23377hxA4 == null || (nestedScrollView2 = c23377hxA4.DbNXlk) == null) {
                return;
            }
            nestedScrollView2.setVisibility(8);
            return;
        }
        C23377hxA c23377hxA5 = this.valueOf;
        if (c23377hxA5 != null && (c22313hcx = c23377hxA5.OLrzqt) != null) {
            c22313hcx.setVisibility(8);
        }
        C23377hxA c23377hxA6 = this.valueOf;
        if (c23377hxA6 == null || (c55173xeu = c23377hxA6.AEQbTJ) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        String string = getString(C23274hvD.Fragment.ActivityResultKt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        String string2 = getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((CharSequence) string2);
        c55173xeu.setEmptyTypeImage(2);
        String string3 = getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                LimitOrderDetailActivity.gEmmrt(this.KWHzl, view);
            }
        });
        C23377hxA c23377hxA7 = this.valueOf;
        if (c23377hxA7 == null || (nestedScrollView = c23377hxA7.DbNXlk) == null) {
            return;
        }
        nestedScrollView.setVisibility(8);
    }

    public static final Unit fetchVPNInfo(LimitOrderDetailActivity limitOrderDetailActivity) {
        loadData$default(limitOrderDetailActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(LimitOrderDetailActivity limitOrderDetailActivity, View view) {
        loadData$default(limitOrderDetailActivity, false, 1, null);
    }

    public final void KWHzl(String str) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle("");
        viewOnClickListenerC54939xaY.EZpvd(str);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public final void values() {
        View viewInflate = LayoutInflater.from(this).inflate(C23274hvD.Activity.DzkRMH, (ViewGroup) null);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public final void EZpvd() {
        C52794wYp c52794wYp;
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null && (c52794wYp = c23377hxA.isConnected) != null) {
            C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        }
        AhwBna().AEQbTJ(AuCTel());
    }

    public final void AkhnZx() {
        FrameLayout frameLayout;
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA == null || (frameLayout = c23377hxA.gEmmrt) == null) {
            return;
        }
        C24257iaS.EZpvd(frameLayout);
    }

    public final void gEmmrt() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        FrameLayout frameLayout;
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null && (frameLayout = c23377hxA.gEmmrt) != null) {
            C57600ylV.AEQbTJ(frameLayout);
        }
        C23377hxA c23377hxA2 = this.valueOf;
        if (c23377hxA2 != null && (c52794wYp2 = c23377hxA2.isConnected) != null) {
            c52794wYp2.fIwbmz();
        }
        C23377hxA c23377hxA3 = this.valueOf;
        if (c23377hxA3 == null || (c52794wYp = c23377hxA3.fARcdN) == null) {
            return;
        }
        c52794wYp.fIwbmz();
    }

    public final boolean KWHzl(OrderDetailResult orderDetailResult) {
        return C23313hvq.AhwBna(Long.valueOf(orderDetailResult.getLeftTimeBy5Minute()), 0) && Intrinsics.EZpvd((Object) orderDetailResult.getStatus(), (Object) String.valueOf(OrderSubStatus.Pending.getStatus()));
    }

    public final void OLrzqt(OrderDetailResult orderDetailResult) {
        C52794wYp c52794wYp;
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA == null || (c52794wYp = c23377hxA.AYXKKw) == null) {
            return;
        }
        if (C22822hmc.copydefault(true, orderDetailResult.getStatus())) {
            if (orderDetailResult.getStrategyMode() != OrderStrategyMode.TEE_SA_USD_PEGGED_LIMIT_ORDER.getStrategyMode() && orderDetailResult.getStrategyMode() != OrderStrategyMode.TEE_SA_USD_PEGGED_MARKET_ORDER.getStrategyMode() && orderDetailResult.getStrategyMode() != OrderStrategyMode.TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER.getStrategyMode()) {
                if (!C22416heu.fetchVPNInfo() || orderDetailResult.getStrategyMode() != OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()) {
                    c52794wYp.setOKDSType(257);
                    return;
                } else {
                    c52794wYp.setVisibility(0);
                    c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.ExKek));
                    return;
                }
            }
            c52794wYp.setVisibility(0);
            c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.onMetadataUpdate));
            return;
        }
        c52794wYp.setVisibility(8);
    }

    public final void djBIcL() {
        C52794wYp c52794wYp;
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA != null && (c52794wYp = c23377hxA.fARcdN) != null) {
            C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        }
        AhwBna().KWHzl(AuCTel());
    }

    public final void isConnected() {
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA == null || c23377hxA.AYXKKw.fJNWhG()) {
            return;
        }
        C52794wYp.startLoading$default(c23377hxA.AYXKKw, 0L, 1, null);
    }

    public final void valueOf() {
        C23377hxA c23377hxA = this.valueOf;
        if (c23377hxA == null || !c23377hxA.AYXKKw.fJNWhG()) {
            return;
        }
        c23377hxA.AYXKKw.fIwbmz();
    }

    @Override // o.hLV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        valueOf();
        AhwBna().DbNXlk();
        C54819xWm.KWHzl().KWHzl(this.OLrzqt);
    }

    public final void valueOf(OrderDetailResult orderDetailResult) {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        KWHzl(DexTrackEventParameter.ButtonName.CANCEL.getValue(), orderDetailResult);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexHistoryDetailsFullPageClick.ButtonName.CANCEL_LIMIT_ORDER.getValue(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw(final OrderDetailResult orderDetailResult) {
        C32866mlf.onEvent$default("DEXTrade_Txhistorydetail_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.OLrzqt(this.OLrzqt, orderDetailResult, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit OLrzqt(LimitOrderDetailActivity limitOrderDetailActivity, OrderDetailResult orderDetailResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        limitOrderDetailActivity.copydefault(eventParamsList, orderDetailResult);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final String str, final OrderDetailResult orderDetailResult) {
        C32866mlf.onEvent$default("DEXTrade_Txhistorydetail_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailActivity.AEQbTJ(str, this, orderDetailResult, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit AEQbTJ(String str, LimitOrderDetailActivity limitOrderDetailActivity, OrderDetailResult orderDetailResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        limitOrderDetailActivity.copydefault(eventParamsList, orderDetailResult);
        return Unit.INSTANCE;
    }

    public final void copydefault(EventParamsList eventParamsList, OrderDetailResult orderDetailResult) {
        EventParamsList.put$default(eventParamsList, "is_tee", AhwBna().AhwBna() ? "yes" : "no", false, 4, null);
        if (orderDetailResult != null) {
            String strCopydefault = copydefault(orderDetailResult);
            if (strCopydefault != null) {
                EventParamsList.put$default(eventParamsList, "order_status", strCopydefault, false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, orderDetailResult.getOrderId(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "transaction_hash", orderDetailResult.getLatestTransactionHash(), false, 4, null);
        }
    }

    public final String copydefault(OrderDetailResult orderDetailResult) {
        String status = orderDetailResult.getStatus();
        if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Expired.getStatus()))) {
            return "expired";
        }
        if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Cancelling.getStatus()))) {
            return "canceling";
        }
        if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Cancelled.getStatus()))) {
            return "canceled";
        }
        if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Failed.getStatus()))) {
            return EopTrackEvent.KEY_RESULT_FAILED;
        }
        if (!Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Pending.getStatus()))) {
            if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Completed.getStatus()))) {
                return "completed";
            }
            if (!Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Creating.getStatus()))) {
                if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Open.getStatus()))) {
                    return "active";
                }
                if (Intrinsics.EZpvd((Object) status, (Object) String.valueOf(OrderSubStatus.Suspended.getStatus()))) {
                    return "suspended";
                }
                return null;
            }
        }
        return "processing";
    }

    @Override // o.hLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.hLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.hLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.hLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
