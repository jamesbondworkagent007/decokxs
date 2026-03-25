package com.okinc.business.dex.tee.swap.limit.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.CreateOrderReq;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C19745gNt;
import o.C19757gOe;
import o.C22303hcn;
import o.C30457lbX;
import o.C30516lcd;
import o.C56390yDp;
import o.InterfaceC9740bbL;
import o.gLJ;
import o.gND;
import o.kTW;
import o.kUH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSwapLimitPlaceOrderViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<String> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public final kTW AhwBna;
    public final OrderRetryHelper AkhnZx;
    public final SharedFlow<LimitOrderDetailBean> DbNXlk;
    public final MutableStateFlow<C30457lbX> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableSharedFlow<LimitOrderDetailBean> OLrzqt;
    public final kUH djBIcL;
    public final C19745gNt fARcdN;
    public final C19700gMb fIwbmz;
    public final gLJ fJNWhG;
    public final gND fetchVPNInfo;
    public final StateFlow<C30457lbX> gEmmrt;
    public final C22303hcn isConnected;
    public final C19757gOe valueOf;
    public final SharedFlow<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<LimitOrderDetailBean> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30457lbX> OLrzqt() {
        return this.gEmmrt;
    }

    @yCM
    public SingleSwapLimitPlaceOrderViewModel(@NotNull C19745gNt c19745gNt, @NotNull C19700gMb c19700gMb, @NotNull gND gnd, @NotNull gLJ glj, @NotNull kUH kuh, @NotNull C22303hcn c22303hcn, @NotNull C19757gOe c19757gOe, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(c19745gNt, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(gnd, "");
        Intrinsics.checkNotNullParameter(glj, "");
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(c22303hcn, "");
        Intrinsics.checkNotNullParameter(c19757gOe, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.fARcdN = c19745gNt;
        this.fIwbmz = c19700gMb;
        this.fetchVPNInfo = gnd;
        this.fJNWhG = glj;
        this.djBIcL = kuh;
        this.isConnected = c22303hcn;
        this.valueOf = c19757gOe;
        this.AhwBna = ktw;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C30457lbX> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        this.EZpvd = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<LimitOrderDetailBean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.AkhnZx = new OrderRetryHelper("SingleSwapLimitPlaceOrderViewModel");
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SingleSwapLimitPlaceOrderViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void EZpvd(boolean z) {
        this.KWHzl.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        List<C30516lcd> listEZpvd = this.EZpvd.getValue().EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (((C30516lcd) obj).OLrzqt() == ConfirmOrderTag.BOOST) {
                arrayList.add(obj);
            }
        }
        C30457lbX c30457lbXEZpvd = this.fetchVPNInfo.EZpvd(limitPairRateResponse, limitCalResult, str, str2, str3, str4, str5);
        this.EZpvd.setValue(c30457lbXEZpvd.copydefault((8159 & 1) != 0 ? c30457lbXEZpvd.EZpvd : null, (8159 & 2) != 0 ? c30457lbXEZpvd.OLrzqt : null, (8159 & 4) != 0 ? c30457lbXEZpvd.AYXKKw : null, (8159 & 8) != 0 ? c30457lbXEZpvd.DbNXlk : null, (8159 & 16) != 0 ? c30457lbXEZpvd.djBIcL : null, (8159 & 32) != 0 ? c30457lbXEZpvd.AEQbTJ : CollectionsKt___CollectionsKt.djBIcL((Collection) c30457lbXEZpvd.EZpvd(), (Iterable) arrayList), (8159 & 64) != 0 ? c30457lbXEZpvd.fetchVPNInfo : null, (8159 & 128) != 0 ? c30457lbXEZpvd.KWHzl : null, (8159 & 256) != 0 ? c30457lbXEZpvd.gEmmrt : null, (8159 & 512) != 0 ? c30457lbXEZpvd.AhwBna : null, (8159 & 1024) != 0 ? c30457lbXEZpvd.copydefault : null, (8159 & 2048) != 0 ? c30457lbXEZpvd.values : null, (8159 & 4096) != 0 ? c30457lbXEZpvd.valueOf : null));
        KWHzl(limitPairRateResponse, limitCalResult);
    }

    public final void KWHzl(LimitPairRateResponse limitPairRateResponse, LimitCalResult limitCalResult) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SingleSwapLimitPlaceOrderViewModel$fetchAndAddBoostData$1(limitPairRateResponse, limitCalResult, this, null), 3, null);
    }

    public final boolean AYXKKw() {
        return this.fIwbmz.djBIcL();
    }

    public static /* synthetic */ void createOrder$default(SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModel, LimitCalResult limitCalResult, CreateOrderReq createOrderReq, LimitPairRateResponse limitPairRateResponse, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        singleSwapLimitPlaceOrderViewModel.EZpvd(limitCalResult, createOrderReq, limitPairRateResponse, fragmentActivity, taskDescription, z);
    }

    public final void EZpvd(@NotNull LimitCalResult limitCalResult, @NotNull CreateOrderReq createOrderReq, @NotNull LimitPairRateResponse limitPairRateResponse, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        Intrinsics.checkNotNullParameter(createOrderReq, "");
        Intrinsics.checkNotNullParameter(limitPairRateResponse, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl.setValue(Boolean.TRUE);
        LimitOrderInfo limitOrderInfo = limitPairRateResponse.getLimitOrderInfo();
        DexMultiTokenInfoBean fromToken = limitOrderInfo != null ? limitOrderInfo.getFromToken() : null;
        LimitOrderInfo limitOrderInfo2 = limitPairRateResponse.getLimitOrderInfo();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SingleSwapLimitPlaceOrderViewModel$createOrder$1(this, fromToken, limitOrderInfo2 != null ? limitOrderInfo2.getToToken() : null, limitCalResult, createOrderReq, limitPairRateResponse, z, fragmentActivity, taskDescription, null), 3, null);
    }

    public final String OLrzqt(@NotNull String str, int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.fJNWhG.copydefault(str, i, z, limitFeeData, str2);
    }

    public final String AEQbTJ(@NotNull String str, int i, boolean z, @NotNull LimitFeeData limitFeeData, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return this.fJNWhG.OLrzqt(str, i, z, limitFeeData, str2, str3, str5);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull PriorityFeeType priorityFeeType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fJNWhG.EZpvd(str, C56390yDp.OLrzqt(priorityFeeType, str2));
    }

    public final DefiChainInfo copydefault(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.djBIcL.AEQbTJ(ChainBizType.Limit).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }

    public final Pair<PriorityFeeType, String> copydefault(@NotNull String str, boolean z, @NotNull LimitFeeData limitFeeData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        Pair<PriorityFeeType, String> pairEZpvd = this.fJNWhG.EZpvd(str);
        return pairEZpvd == null ? C56390yDp.OLrzqt(PriorityFeeType.PriorityMarket, this.fJNWhG.OLrzqt(str, z, limitFeeData)) : pairEZpvd;
    }

    public final void AhwBna() {
        this.fJNWhG.OLrzqt();
    }

    public final boolean copydefault(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.isConnected.copydefault(str, str2, z, str3);
    }

    public final void copydefault() {
        this.isConnected.KWHzl();
    }

    public final PresetRouteType OLrzqt(@NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.isConnected.OLrzqt(str, z, str2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.isConnected.OLrzqt(str, presetRouteType);
    }
}
