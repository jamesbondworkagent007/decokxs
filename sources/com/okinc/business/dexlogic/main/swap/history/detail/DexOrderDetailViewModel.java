package com.okinc.business.dexlogic.main.swap.history.detail;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderType;
import com.okinc.business.dexlogic.bean.CheckContinueBean;
import com.okinc.business.dexlogic.bean.DexGasStationActivity;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.business.dexlogic.main.swap.history.detail.data.OrderCountDownData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C19700gMb;
import o.C19702gMd;
import o.C22332hdP;
import o.C22374heE;
import o.C22380heK;
import o.C22416heu;
import o.C22420hey;
import o.C22737hkx;
import o.C22822hmc;
import o.C23220huC;
import o.C33129mqd;
import o.C56390yDp;
import o.C58266yxz;
import o.InterfaceC19701gMc;
import o.InterfaceC25414iwK;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC9738bbJ;
import o.yBK;
import o.yBP;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public final class DexOrderDetailViewModel extends AbstractC33073mpa {
    public boolean AYXKKw;
    public final C22737hkx AhwBna;
    public MutableLiveData<ArrayList<DexMultiChildOrderInfoVo>> AkhnZx;
    public final Observer<TradeState> AuCTel;
    public ArrayList<DexMultiChildOrderInfoVo> DbNXlk;
    public MutableLiveData<Boolean> EZpvd;
    public MutableLiveData<CheckContinueBean> KWHzl;
    public final ArrayList<DexMultiChildOrderInfoVo> OLrzqt;
    public InterfaceC9738bbJ copydefault;
    public MutableLiveData<OrderDetailBean> djBIcL;
    public InterfaceC19701gMc ejfBZ;
    public MutableLiveData<Boolean> fARcdN;
    public final C19700gMb fIwbmz;
    public MutableLiveData<String> fJNWhG;
    public final ArrayList<DexMultiChildOrderInfoVo> fetchVPNInfo;
    public MutableLiveData<OrderCountDownData> gEmmrt;
    public MutableLiveData<Pair<Boolean, Boolean>> isConnected;
    public final C19702gMd uzCIH;
    public final InterfaceC25414iwK valueOf;
    public MutableLiveData<TradeState> values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TradeState> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexMultiChildOrderInfoVo> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl(boolean z) {
        return z && this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DexMultiChildOrderInfoVo> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CheckContinueBean> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<OrderDetailBean> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<DexMultiChildOrderInfoVo>> valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, Boolean>> values() {
        return this.isConnected;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public DexOrderDetailViewModel(@NotNull C19702gMd c19702gMd, @NotNull C19700gMb c19700gMb, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.uzCIH = c19702gMd;
        this.fIwbmz = c19700gMb;
        this.valueOf = interfaceC25414iwK;
        this.AkhnZx = new MutableLiveData<>();
        this.fetchVPNInfo = new ArrayList<>();
        this.OLrzqt = new ArrayList<>();
        this.DbNXlk = new ArrayList<>();
        this.djBIcL = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AhwBna = new C22737hkx();
        this.fARcdN = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        Observer<TradeState> observer = new Observer() { // from class: o.hkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                DexOrderDetailViewModel.copydefault(this.EZpvd, (TradeState) obj);
            }
        };
        this.AuCTel = observer;
        this.values.observeForever(observer);
    }

    public static final void copydefault(final DexOrderDetailViewModel dexOrderDetailViewModel, final TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        if (dexOrderDetailViewModel.AkhnZx.getValue() != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C23220huC.EZpvd(new InterfaceC58187ywZ() { // from class: o.hkz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    DexOrderDetailViewModel.OLrzqt(this.AEQbTJ, tradeState, interfaceC58184ywW);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.hjZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexOrderDetailViewModel.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hkb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DexOrderDetailViewModel.hDKMBd(function1, obj);
                }
            }).KWHzl(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.hka
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexOrderDetailViewModel.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hjX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DexOrderDetailViewModel.uzCIH(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.hjY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexOrderDetailViewModel.OLrzqt((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DexOrderDetailViewModel.getNewProxyInstance(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            yBK.EZpvd(interfaceC58217yxCAEQbTJ, dexOrderDetailViewModel.call());
        }
    }

    public static final void OLrzqt(DexOrderDetailViewModel dexOrderDetailViewModel, TradeState tradeState, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(dexOrderDetailViewModel.DbNXlk, tradeState));
    }

    public static final List hDKMBd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List OLrzqt(DexOrderDetailViewModel dexOrderDetailViewModel, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) pair.getFirst());
        return dexOrderDetailViewModel.AhwBna.AEQbTJ(arrayList, (TradeState) pair.getSecond(), dexOrderDetailViewModel.djBIcL);
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, List list) {
        MutableLiveData<ArrayList<DexMultiChildOrderInfoVo>> mutableLiveData = dexOrderDetailViewModel.AkhnZx;
        Intrinsics.copydefault(list, "");
        mutableLiveData.setValue((ArrayList) list);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull String str, boolean z, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = (C22822hmc.EZpvd(str) || Intrinsics.EZpvd((Object) str, (Object) "100") || (!z && !z2 && str2.length() <= 0)) ? false : true;
    }

    public static /* synthetic */ void getOrderDetail$default(DexOrderDetailViewModel dexOrderDetailViewModel, String str, HistoryOrderType historyOrderType, String str2, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            historyOrderType = HistoryOrderType.Swap;
        }
        dexOrderDetailViewModel.OLrzqt(str, historyOrderType, str2, function2);
    }

    public final void OLrzqt(@NotNull final String str, @NotNull final HistoryOrderType historyOrderType, @NotNull final String str2, @NotNull final Function2<? super Boolean, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(historyOrderType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        EZpvd(str, new Function1() { // from class: o.hke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.AEQbTJ(this.AEQbTJ, str, str2, historyOrderType, function2, (InterfaceC9738bbJ) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final DexOrderDetailViewModel dexOrderDetailViewModel, String str, String str2, HistoryOrderType historyOrderType, final Function2 function2, InterfaceC9738bbJ interfaceC9738bbJ) {
        dexOrderDetailViewModel.copydefault = interfaceC9738bbJ;
        AbstractC58185ywX<ResponseData<OrderDetailBean>> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(str).copydefault().OLrzqt(str2, historyOrderType).KWHzl(yBP.EZpvd());
        final Function1 function1 = new Function1() { // from class: o.hkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return DexOrderDetailViewModel.ejfBZ(function1, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.hkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.EZpvd(this.copydefault, function2, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.fJNWhG(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.copydefault(function2, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.AuCTel(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, dexOrderDetailViewModel.call());
        return Unit.INSTANCE;
    }

    public static final ArrayList ejfBZ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList KWHzl(DexOrderDetailViewModel dexOrderDetailViewModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        dexOrderDetailViewModel.DbNXlk.clear();
        OrderDetailBean orderDetailBean = (OrderDetailBean) responseData.getData();
        if (orderDetailBean != null) {
            if (orderDetailBean.isOutTime()) {
                dexOrderDetailViewModel.OLrzqt(false, true);
            }
            dexOrderDetailViewModel.OLrzqt(orderDetailBean);
            dexOrderDetailViewModel.gEmmrt.postValue(new OrderCountDownData(C22332hdP.EZpvd(orderDetailBean.getStatus()), C22332hdP.EZpvd(Long.valueOf(C33129mqd.valueOf(orderDetailBean.getEstimatedTime()))), orderDetailBean.getAbnormalStatus(), null, 8, null));
            if (C22420hey.KWHzl(orderDetailBean.getSwapTradeType())) {
                dexOrderDetailViewModel.DbNXlk.add(orderDetailBean.getPayChildOrder());
                dexOrderDetailViewModel.DbNXlk.add(orderDetailBean.getToMainOrder());
            } else {
                if (!Intrinsics.EZpvd((Object) orderDetailBean.getSwapTradeType(), (Object) "2") && Intrinsics.EZpvd((Object) orderDetailBean.getHiddenFromOrder(), (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                    dexOrderDetailViewModel.DbNXlk.add(orderDetailBean.getPayChildOrder());
                }
                DexMultiChildOrderInfoVo fromChildOrderDetailVo = orderDetailBean.getFromChildOrderDetailVo();
                if (fromChildOrderDetailVo != null) {
                    if (!Intrinsics.EZpvd((Object) fromChildOrderDetailVo.getSwapTradeType(), (Object) "1")) {
                        fromChildOrderDetailVo.setDataType("0");
                        if (Intrinsics.EZpvd((Object) fromChildOrderDetailVo.getSwapTradeType(), (Object) "2")) {
                            fromChildOrderDetailVo.setMark("-");
                        }
                    }
                    dexOrderDetailViewModel.DbNXlk.add(fromChildOrderDetailVo);
                }
                DexMultiChildOrderInfoVo bridgeChildOrderDetailVo = orderDetailBean.getBridgeChildOrderDetailVo();
                if (bridgeChildOrderDetailVo != null) {
                    bridgeChildOrderDetailVo.setDataType("1");
                    dexOrderDetailViewModel.DbNXlk.add(bridgeChildOrderDetailVo);
                }
                DexMultiChildOrderInfoVo toChildOrderDetailVo = orderDetailBean.getToChildOrderDetailVo();
                if (toChildOrderDetailVo != null) {
                    toChildOrderDetailVo.setDataType("2");
                    dexOrderDetailViewModel.DbNXlk.add(toChildOrderDetailVo);
                }
            }
            int size = dexOrderDetailViewModel.DbNXlk.size();
            if (!dexOrderDetailViewModel.DbNXlk.isEmpty()) {
                ((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AuCTelauCTel(dexOrderDetailViewModel.DbNXlk)).setFirstOrder(true);
                ((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk)).setShowArrow(false);
                ((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk)).setFinalOrder(true);
                ((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk)).setMark(Marker.ANY_NON_NULL_MARKER);
                ((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk)).setDiscountGasStation(orderDetailBean.isDiscountGasStation());
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk);
                DexGasStationActivity gasStationActivityReward = orderDetailBean.getGasStationActivityReward();
                if (gasStationActivityReward == null) {
                    gasStationActivityReward = new DexGasStationActivity(0, "");
                }
                dexMultiChildOrderInfoVo.setGasStationActivityReward(gasStationActivityReward);
            }
            if (size == 2) {
                Iterator<T> it = dexOrderDetailViewModel.DbNXlk.iterator();
                while (it.hasNext()) {
                    ((DexMultiChildOrderInfoVo) it.next()).setShowArrow(false);
                }
                orderDetailBean.setFinalExploreUrl(((DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.DbNXlk)).getExploreUrl());
            }
            if (C33129mqd.copydefault((Object) Integer.valueOf(size), (Object) 3)) {
                dexOrderDetailViewModel.DbNXlk.get(size - 2).setShowArrow(false);
            }
            dexOrderDetailViewModel.djBIcL.postValue(orderDetailBean);
        }
        return dexOrderDetailViewModel.DbNXlk;
    }

    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(DexOrderDetailViewModel dexOrderDetailViewModel, Function2 function2, ArrayList arrayList) {
        dexOrderDetailViewModel.AkhnZx.setValue(arrayList);
        function2.invoke(Boolean.TRUE, Boolean.valueOf(arrayList.isEmpty()));
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function2 function2, Throwable th) {
        Boolean bool = Boolean.FALSE;
        function2.invoke(bool, bool);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(OrderDetailBean orderDetailBean) {
        this.fetchVPNInfo.clear();
        this.OLrzqt.clear();
        if (orderDetailBean.isCrossChainSwap()) {
            if (orderDetailBean.isBridgeToType()) {
                DexMultiChildOrderInfoVo fromChildOrderDetailVo = orderDetailBean.getFromChildOrderDetailVo();
                if (fromChildOrderDetailVo != null) {
                    fromChildOrderDetailVo.setToAmountOut(orderDetailBean.getFromAmount());
                    fromChildOrderDetailVo.setFirstOrder(true);
                    fromChildOrderDetailVo.setDataType("0");
                    this.fetchVPNInfo.add(fromChildOrderDetailVo);
                }
                DexMultiChildOrderInfoVo bridgeChildOrderDetailVo = orderDetailBean.getBridgeChildOrderDetailVo();
                if (bridgeChildOrderDetailVo != null) {
                    bridgeChildOrderDetailVo.setLocalBridgeToTag(true);
                    bridgeChildOrderDetailVo.setDataType("1");
                    this.OLrzqt.add(bridgeChildOrderDetailVo);
                }
                DexMultiChildOrderInfoVo toChildOrderDetailVo = orderDetailBean.getToChildOrderDetailVo();
                if (toChildOrderDetailVo != null) {
                    toChildOrderDetailVo.setFinalOrder(true);
                    toChildOrderDetailVo.setDataType("2");
                    this.fetchVPNInfo.add(toChildOrderDetailVo);
                    return;
                }
                return;
            }
            if (orderDetailBean.isFromBridgeType()) {
                DexMultiChildOrderInfoVo payChildOrder = orderDetailBean.getPayChildOrder();
                payChildOrder.setFirstOrder(true);
                this.fetchVPNInfo.add(payChildOrder);
                DexMultiChildOrderInfoVo fromChildOrderDetailVo2 = orderDetailBean.getFromChildOrderDetailVo();
                if (fromChildOrderDetailVo2 != null) {
                    fromChildOrderDetailVo2.setLocalFromChildTag(true);
                    fromChildOrderDetailVo2.setDataType("0");
                    this.OLrzqt.add(fromChildOrderDetailVo2);
                }
                DexMultiChildOrderInfoVo bridgeChildOrderDetailVo2 = orderDetailBean.getBridgeChildOrderDetailVo();
                if (bridgeChildOrderDetailVo2 != null) {
                    bridgeChildOrderDetailVo2.setFinalOrder(true);
                    bridgeChildOrderDetailVo2.setDataType("1");
                    this.fetchVPNInfo.add(bridgeChildOrderDetailVo2);
                    return;
                }
                return;
            }
            if (orderDetailBean.isFromBridgeToType()) {
                DexMultiChildOrderInfoVo payChildOrder2 = orderDetailBean.getPayChildOrder();
                payChildOrder2.setFirstOrder(true);
                this.fetchVPNInfo.add(payChildOrder2);
                DexMultiChildOrderInfoVo fromChildOrderDetailVo3 = orderDetailBean.getFromChildOrderDetailVo();
                if (fromChildOrderDetailVo3 != null) {
                    fromChildOrderDetailVo3.setLocalFromChildTag(true);
                    fromChildOrderDetailVo3.setDataType("0");
                    this.OLrzqt.add(fromChildOrderDetailVo3);
                }
                DexMultiChildOrderInfoVo bridgeChildOrderDetailVo3 = orderDetailBean.getBridgeChildOrderDetailVo();
                if (bridgeChildOrderDetailVo3 != null) {
                    bridgeChildOrderDetailVo3.setLocalBridgeTag(true);
                    bridgeChildOrderDetailVo3.setDataType("1");
                    this.OLrzqt.add(bridgeChildOrderDetailVo3);
                }
                DexMultiChildOrderInfoVo toChildOrderDetailVo2 = orderDetailBean.getToChildOrderDetailVo();
                if (toChildOrderDetailVo2 != null) {
                    toChildOrderDetailVo2.setFinalOrder(true);
                    toChildOrderDetailVo2.setDataType("2");
                    this.fetchVPNInfo.add(toChildOrderDetailVo2);
                }
            }
        }
    }

    public final boolean EZpvd() {
        return this.fetchVPNInfo.size() == 2;
    }

    public final void EZpvd(String str, final Function1<? super InterfaceC9738bbJ, Unit> function1) {
        InterfaceC9738bbJ interfaceC9738bbJ = this.copydefault;
        if (interfaceC9738bbJ != null) {
            function1.invoke(interfaceC9738bbJ);
            return;
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(str).fARcdN().OLrzqt();
        final Function1 function12 = new Function1() { // from class: o.hjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.copydefault(this.EZpvd, function1, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.fARcdN(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.copydefault(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.getFieldNames(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void fARcdN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(DexOrderDetailViewModel dexOrderDetailViewModel, Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ) {
        dexOrderDetailViewModel.copydefault = interfaceC9738bbJ;
        function1.invoke(interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final boolean fJNWhG() {
        InterfaceC9738bbJ interfaceC9738bbJ;
        InterfaceC9738bbJ interfaceC9738bbJ2 = this.copydefault;
        return (interfaceC9738bbJ2 == null || interfaceC9738bbJ2.QfsBiF() || (interfaceC9738bbJ = this.copydefault) == null || !(interfaceC9738bbJ.zsXlph() ^ true)) ? false : true;
    }

    public final boolean OLrzqt(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        return fJNWhG() && (dexMultiChildOrderInfoVo.isShowSpeedUp() || dexMultiChildOrderInfoVo.isShowCancel() || dexMultiChildOrderInfoVo.isShowSpeedUpCancel());
    }

    public final void OLrzqt(boolean z, boolean z2) {
        OrderDetailBean value = this.djBIcL.getValue();
        if (value != null) {
            value.setFromEstimatedTime("0");
            value.setBridgeEstimatedTime("0");
        }
        this.isConnected.postValue(C56390yDp.OLrzqt(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public final boolean fetchVPNInfo() {
        Pair<Boolean, Boolean> value = this.isConnected.getValue();
        if (value != null) {
            return value.getSecond().booleanValue();
        }
        return false;
    }

    public final AbstractC58185ywX<Boolean> EZpvd(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                DexOrderDetailViewModel.OLrzqt(str, str2, str3, str4, str5, this, interfaceC58184ywW);
            }
        });
    }

    public static final void OLrzqt(String str, String str2, String str3, String str4, String str5, DexOrderDetailViewModel dexOrderDetailViewModel, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(str);
        AbstractC58185ywX<List<DexMultiTokenInfoBean>> abstractC58185ywXEZpvd = c22374heECopydefault.copydefault().EZpvd(new DexMultiTokenDetailReq(c22374heECopydefault.fARcdN().AhwBna(), yDY.copydefault(new DexMultiTokenDetailParam(str2, str3, str4, str5))));
        final Function1 function1 = new Function1() { // from class: o.hko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.EZpvd(interfaceC58184ywW, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super List<DexMultiTokenInfoBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.AEQbTJ(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, dexOrderDetailViewModel.call());
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, List list) {
        interfaceC58184ywW.onNext(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, Throwable th) {
        interfaceC58184ywW.onNext(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<CheckContinueBean> abstractC58185ywXCopydefault = C22380heK.OLrzqt.copydefault(str).AkhnZx().copydefault(str2, str3, str4, str5);
        final Function1 function1 = new Function1() { // from class: o.hku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.AEQbTJ(this.KWHzl, (CheckContinueBean) obj);
            }
        };
        InterfaceC58227yxM<? super CheckContinueBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                DexOrderDetailViewModel.fIwbmz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, CheckContinueBean checkContinueBean) {
        dexOrderDetailViewModel.KWHzl.setValue(checkContinueBean);
        dexOrderDetailViewModel.EZpvd.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(DexOrderDetailViewModel dexOrderDetailViewModel, Throwable th) {
        dexOrderDetailViewModel.EZpvd.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        this.values.removeObserver(this.AuCTel);
    }

    public final boolean ejfBZ() {
        OrderDetailBean value = this.djBIcL.getValue();
        return Intrinsics.EZpvd((Object) (value != null ? value.getSwapTradeType() : null), (Object) "7");
    }

    public final boolean isConnected() {
        OrderDetailBean value;
        return C22416heu.gEmmrt() && (value = this.djBIcL.getValue()) != null && value.getTradeMode() == TradeMode.AdvancedMode.getType();
    }

    public final void KWHzl(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC19701gMc interfaceC19701gMc = this.ejfBZ;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.ejfBZ = this.uzCIH.copydefault(new Function1() { // from class: o.hkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexOrderDetailViewModel.EZpvd(str, this, (WsMarketOrderInfo) obj);
            }
        });
    }

    public static final Unit EZpvd(String str, DexOrderDetailViewModel dexOrderDetailViewModel, WsMarketOrderInfo wsMarketOrderInfo) {
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        if (Intrinsics.EZpvd((Object) wsMarketOrderInfo.getType(), (Object) "1") && wsMarketOrderInfo.getTradeState() != null) {
            TradeState tradeState = wsMarketOrderInfo.getTradeState();
            if (Intrinsics.EZpvd((Object) (tradeState != null ? tradeState.getOrderId() : null), (Object) str)) {
                dexOrderDetailViewModel.values.setValue(wsMarketOrderInfo.getTradeState());
            }
        }
        return Unit.INSTANCE;
    }

    public final void hDKMBd() {
        InterfaceC19701gMc interfaceC19701gMc = this.ejfBZ;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
    }

    public final boolean fARcdN() {
        return this.fIwbmz.AYXKKw();
    }

    public final boolean fIwbmz() {
        return this.valueOf.valueOf();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AuCTel();
    }
}
