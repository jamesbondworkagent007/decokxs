package com.okinc.business.dexlogic.main.limmitorder.orderdetail;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C19700gMb;
import o.C19702gMd;
import o.C19743gNr;
import o.C22380heK;
import o.C22485hgJ;
import o.C31200lpY;
import o.InterfaceC19701gMc;
import o.InterfaceC22524hgw;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.gZA;
import o.gZH;
import o.hMR;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderDetailViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final gZA AEQbTJ;
    public final C22485hgJ AYXKKw;
    public MutableLiveData<Boolean> AhwBna;
    public final gZH AkhnZx;
    public final C19743gNr AuCTel;
    public final OrderStrategyType DbNXlk;
    public final MutableStateFlow<InterfaceC22524hgw> KWHzl;
    public final MutableStateFlow<Result<Integer>> OLrzqt;
    public final MutableStateFlow<Result<Integer>> copydefault;
    public final ArrayList<OrderDetailListItem> djBIcL;
    public final MutableLiveData<String> ejfBZ;
    public final String fARcdN;
    public final Integer fIwbmz;
    public final StateFlow<Result<Integer>> fJNWhG;
    public final String fetchVPNInfo;
    public MutableLiveData<CheckContinueBean> gEmmrt;
    public final C19700gMb hDKMBd;
    public final StateFlow<InterfaceC22524hgw> isConnected;
    public final C19702gMd iwGUEr;
    public InterfaceC19701gMc uzCIH;
    public final StateFlow<Result<Integer>> valueOf;
    public final MutableLiveData<OrderDetailResult> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<Integer>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<OrderDetailResult> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CheckContinueBean> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<Integer>> djBIcL() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> gEmmrt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC22524hgw> valueOf() {
        return this.isConnected;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    @yCM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LimitOrderDetailViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C19743gNr c19743gNr, @NotNull C19700gMb c19700gMb, @NotNull gZA gza, @NotNull gZH gzh, @NotNull C19702gMd c19702gMd) {
        OrderStrategyType orderStrategyTypeCopydefault;
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c19743gNr, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gza, "");
        Intrinsics.checkNotNullParameter(gzh, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        this.AuCTel = c19743gNr;
        this.hDKMBd = c19700gMb;
        this.AEQbTJ = gza;
        this.AkhnZx = gzh;
        this.iwGUEr = c19702gMd;
        this.fARcdN = C31200lpY.getSourceType$default(savedStateHandle, (String) null, 1, (Object) null);
        Integer num = (Integer) savedStateHandle.get(OtcExtraKeys.CRYPTO_ORDER_TYPE);
        if (num != null) {
            orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(num.intValue());
            orderStrategyTypeCopydefault = orderStrategyTypeCopydefault == null ? OrderStrategyType.Limit : orderStrategyTypeCopydefault;
        }
        this.DbNXlk = orderStrategyTypeCopydefault;
        this.fIwbmz = (Integer) savedStateHandle.get("limit_strategy_type");
        String str = (String) savedStateHandle.get(OtcExtraKeys.ORDER_ID);
        this.fetchVPNInfo = str != null ? str : "";
        MutableStateFlow<InterfaceC22524hgw> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC22524hgw.TaskDescription.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        this.djBIcL = new ArrayList<>();
        this.ejfBZ = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AYXKKw = new C22485hgJ();
        MutableStateFlow<Result<Integer>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Result<Integer>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final void isConnected() {
        InterfaceC19701gMc interfaceC19701gMc = this.uzCIH;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.uzCIH = this.iwGUEr.EZpvd(new Function1() { // from class: o.hgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailViewModel.EZpvd(this.KWHzl, (TeeWsOriginData) obj);
            }
        });
    }

    public static final Unit EZpvd(LimitOrderDetailViewModel limitOrderDetailViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
        if (Intrinsics.EZpvd((Object) (teeWsData != null ? teeWsData.getOrderId() : null), (Object) limitOrderDetailViewModel.fetchVPNInfo)) {
            limitOrderDetailViewModel.KWHzl(limitOrderDetailViewModel.fetchVPNInfo, false);
        }
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        InterfaceC19701gMc interfaceC19701gMc = this.uzCIH;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
    }

    public final void KWHzl(@NotNull String str, boolean z) {
        InterfaceC22524hgw interfaceC22524hgw;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<InterfaceC22524hgw> mutableStateFlow = this.KWHzl;
        if (z) {
            interfaceC22524hgw = InterfaceC22524hgw.ActionBar.AEQbTJ;
        } else {
            interfaceC22524hgw = InterfaceC22524hgw.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC22524hgw);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderDetailViewModel$getOrderDetailInfo$1(this, str, null), 3, null);
    }

    public final void EZpvd(OrderDetailResult orderDetailResult) {
        this.djBIcL.clear();
        FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
        if (fromChildOrderDetailVO != null) {
            OrderDetailListItem orderDetailListItem = new OrderDetailListItem(true, fromChildOrderDetailVO.getFromTokenIcon(), fromChildOrderDetailVO.getFromAmount(), fromChildOrderDetailVO.getStatus(), fromChildOrderDetailVO.getFromTokenSymbol(), fromChildOrderDetailVO.getChildOrderId(), orderDetailResult.getFailureReason(), orderDetailResult.getFromToken().getDecimals());
            OrderDetailListItem orderDetailListItem2 = new OrderDetailListItem(false, fromChildOrderDetailVO.getToTokenIcon(), fromChildOrderDetailVO.getToAmount(), fromChildOrderDetailVO.getStatus(), fromChildOrderDetailVO.getToTokenSymbol(), fromChildOrderDetailVO.getChildOrderId(), fromChildOrderDetailVO.getFailureReason(), orderDetailResult.getToToken().getDecimals());
            this.djBIcL.add(orderDetailListItem);
            this.djBIcL.add(orderDetailListItem2);
            this.KWHzl.setValue(new InterfaceC22524hgw.Application(this.djBIcL));
            this.values.setValue(orderDetailResult);
        }
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<CheckContinueBean> abstractC58185ywXCopydefault = C22380heK.OLrzqt.copydefault(str).AkhnZx().copydefault(str2, str3, str4, str5);
        final Function1 function1 = new Function1() { // from class: o.hgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailViewModel.KWHzl(this.EZpvd, (CheckContinueBean) obj);
            }
        };
        InterfaceC58227yxM<? super CheckContinueBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                LimitOrderDetailViewModel.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderDetailViewModel.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hgL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                LimitOrderDetailViewModel.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(LimitOrderDetailViewModel limitOrderDetailViewModel, CheckContinueBean checkContinueBean) {
        limitOrderDetailViewModel.gEmmrt.setValue(checkContinueBean);
        limitOrderDetailViewModel.AhwBna.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(LimitOrderDetailViewModel limitOrderDetailViewModel, Throwable th) {
        limitOrderDetailViewModel.AhwBna.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final List<hMR> copydefault(@NotNull List<ExecutionHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.AYXKKw.AEQbTJ(list);
    }

    public final boolean AEQbTJ(@NotNull OrderDetailResult orderDetailResult) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        return Intrinsics.EZpvd((Object) orderDetailResult.getStatus(), (Object) String.valueOf(OrderSubStatus.Suspended.getStatus())) && orderDetailResult.getCanResume() && this.hDKMBd.valueOf();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderDetailViewModel$resumeOrder$1(this, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderDetailViewModel$cancelOrder$1(this, str, null), 3, null);
    }

    public final boolean AhwBna() {
        return this.hDKMBd.AYXKKw();
    }

    public final void EZpvd() {
        MutableStateFlow<Result<Integer>> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }

    public final void copydefault() {
        MutableStateFlow<Result<Integer>> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }
}
