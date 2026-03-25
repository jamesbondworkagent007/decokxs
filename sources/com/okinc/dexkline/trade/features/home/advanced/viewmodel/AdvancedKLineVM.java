package com.okinc.dexkline.trade.features.home.advanced.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import com.okinc.dexkline.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import com.okinc.kline.data.HistoryOrderData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import o.AbstractC33073mpa;
import o.AbstractC34688ngn;
import o.AbstractC58185ywX;
import o.C32144mRc;
import o.C32267mVr;
import o.C32272mVw;
import o.C34651ngC;
import o.C34677ngc;
import o.C34679nge;
import o.C34680ngf;
import o.C34689ngo;
import o.C36246oUr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC32154mRm;
import o.InterfaceC32157mRp;
import o.InterfaceC58227yxM;
import o.mPY;
import o.mQW;
import o.mTT;
import o.mUR;
import o.oUO;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedKLineVM extends AbstractC33073mpa implements InterfaceC32157mRp, InterfaceC32154mRm {
    public final MutableStateFlow<List<oUO>> AEQbTJ;
    public final StateFlow<List<HistoryOrderData>> AYXKKw;
    public final StateFlow<DexMultiTokenInfoBean> AhwBna;
    public final StateFlow<List<oUO>> AkhnZx;
    public final C34680ngf AuCTel;
    public C32144mRc DbNXlk;
    public final MutableStateFlow<DexMultiTokenInfoBean> EZpvd;
    public final MutableStateFlow<HashMap<String, HistoryOrderData>> KWHzl;
    public final MutableStateFlow<List<HistoryOrderData>> OLrzqt;
    public final MutableStateFlow<AbstractC34688ngn> copydefault;
    public mQW djBIcL;
    public final C34651ngC ejfBZ;
    public final C34677ngc fJNWhG;
    public final StateFlow<AbstractC34688ngn> fetchVPNInfo;
    public ChartType gEmmrt;
    public final C32272mVw isConnected;
    public final StateFlow<HashMap<String, HistoryOrderData>> valueOf;
    public C34679nge values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC34688ngn> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<HistoryOrderData>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<oUO>> OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<HashMap<String, HistoryOrderData>> copydefault() {
        return this.valueOf;
    }

    @yCM
    public AdvancedKLineVM(@NotNull C34680ngf c34680ngf, @NotNull C34677ngc c34677ngc, @NotNull C34651ngC c34651ngC, @NotNull C32272mVw c32272mVw) {
        Intrinsics.checkNotNullParameter(c34680ngf, "");
        Intrinsics.checkNotNullParameter(c34677ngc, "");
        Intrinsics.checkNotNullParameter(c34651ngC, "");
        Intrinsics.checkNotNullParameter(c32272mVw, "");
        this.AuCTel = c34680ngf;
        this.fJNWhG = c34677ngc;
        this.ejfBZ = c34651ngC;
        this.isConnected = c32272mVw;
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC34688ngn> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC34688ngn.TaskDescription.copydefault);
        this.copydefault = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<oUO>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<HistoryOrderData>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow4;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<HashMap<String, HistoryOrderData>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new HashMap());
        this.KWHzl = MutableStateFlow5;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow5);
        this.gEmmrt = ChartType.PRICE;
    }

    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) {
        return this.fJNWhG.copydefault(continuation);
    }

    public final void copydefault(@NotNull ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "");
        this.gEmmrt = chartType;
        valueOf();
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$onChartTypeChanged$1(this, chartType, null), 3, null);
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null || C34689ngo.AEQbTJ(dexMultiTokenInfoBean, this.EZpvd.getValue())) {
            return;
        }
        this.EZpvd.setValue(dexMultiTokenInfoBean);
        this.values = null;
        valueOf();
        djBIcL();
    }

    public final void copydefault(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(AbstractC34688ngn.TaskDescription.copydefault);
        C32144mRc c32144mRc = this.DbNXlk;
        if (c32144mRc != null) {
            c32144mRc.copydefault(str, str2);
        }
    }

    public final void KWHzl(@NotNull String str, String str2) {
        String tokenContractAddress;
        String str3;
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                str3 = "";
            }
            String chainId = value.getChainId();
            String strSubstring = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            AbstractC58185ywX<List<CandlesticksBean>> abstractC58185ywXKWHzl = mPY.OLrzqt.copydefault("default_trade").KWHzl().KWHzl(new DexTokenCandleParam(chainId, str3, str2, null, strSubstring, "300", null, 72, null));
            final Function1 function1 = new Function1() { // from class: o.ngh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedKLineVM.copydefault(this.EZpvd, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super List<CandlesticksBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ngi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AdvancedKLineVM.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ngj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedKLineVM.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ngk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AdvancedKLineVM.OLrzqt(function12, obj);
                }
            });
        }
        tokenContractAddress = value.getTokenContractAddress();
        str3 = tokenContractAddress;
        String chainId2 = value.getChainId();
        String strSubstring2 = str.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        AbstractC58185ywX<List<CandlesticksBean>> abstractC58185ywXKWHzl2 = mPY.OLrzqt.copydefault("default_trade").KWHzl().KWHzl(new DexTokenCandleParam(chainId2, str3, str2, null, strSubstring2, "300", null, 72, null));
        final Function1 function13 = new Function1() { // from class: o.ngh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedKLineVM.copydefault(this.EZpvd, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super List<CandlesticksBean>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ngi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedKLineVM.AEQbTJ(function13, obj);
            }
        };
        final Function1 function122 = new Function1() { // from class: o.ngj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedKLineVM.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ngk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedKLineVM.OLrzqt(function122, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AdvancedKLineVM advancedKLineVM, List list) {
        MutableStateFlow<List<oUO>> mutableStateFlow = advancedKLineVM.AEQbTJ;
        mTT mtt = mTT.EZpvd;
        Intrinsics.copydefault(list);
        mutableStateFlow.setValue(advancedKLineVM.EZpvd(mtt.EZpvd((List<CandlesticksBean>) list)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void valueOf() {
        C32144mRc c32144mRc = this.DbNXlk;
        if (c32144mRc != null) {
            c32144mRc.OLrzqt();
        }
        mQW mqw = this.djBIcL;
        if (mqw != null) {
            mqw.AEQbTJ();
        }
    }

    @Override // o.InterfaceC32157mRp
    public void OLrzqt(@NotNull List<? extends oUO> list, @NotNull String str) {
        oUO ouo;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        List<oUO> listEZpvd = EZpvd(list);
        if (Intrinsics.EZpvd((Object) str, (Object) "http") && (ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(listEZpvd)) != null) {
            C36246oUr.copydefault().iwGUEr().AEQbTJ(ouo.KWHzl);
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$onResult$2(this, listEZpvd, str, null), 3, null);
    }

    @Override // o.InterfaceC32157mRp
    public void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.copydefault("Dex Advanced KLine: " + str);
    }

    @Override // o.InterfaceC32157mRp
    public void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("Dex Advanced KLine: " + str);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$onError$1(this, str, null), 3, null);
    }

    @Override // o.InterfaceC32154mRm
    public void AEQbTJ(@NotNull List<MarketBuySellKLinePoint> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.setValue(C32267mVr.EZpvd(list));
    }

    @Override // o.InterfaceC32154mRm
    public void KWHzl(@NotNull MarketBuySellKLinePoint marketBuySellKLinePoint) {
        Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
        this.KWHzl.getValue().put(marketBuySellKLinePoint.djBIcL(), C32267mVr.copydefault(marketBuySellKLinePoint));
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        C32144mRc c32144mRc = this.DbNXlk;
        if (c32144mRc != null) {
            c32144mRc.OLrzqt();
        }
        this.DbNXlk = null;
        mQW mqw = this.djBIcL;
        if (mqw != null) {
            mqw.AEQbTJ();
        }
        this.djBIcL = null;
        this.values = null;
        super.onCleared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        String tokenContractAddress;
        DexMultiTokenInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
        } else {
            tokenContractAddress = value.getTokenContractAddress();
        }
        this.DbNXlk = new C32144mRc(value.getChainId(), tokenContractAddress, new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        String tokenContractAddress;
        DexMultiTokenInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        if (value.isMainChainCoin()) {
            tokenContractAddress = value.getWTokenAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
        } else {
            tokenContractAddress = value.getTokenContractAddress();
        }
        this.djBIcL = new mQW(value.getChainId(), tokenContractAddress, new WeakReference(this));
    }

    private final void djBIcL() {
        DexMultiTokenInfoBean value = this.EZpvd.getValue();
        if (value == null) {
            return;
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedKLineVM$getTokenMarketInfo$1(this, value, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.oUO> */
    /* JADX WARN: Multi-variable type inference failed */
    private final List<oUO> EZpvd(List<? extends oUO> list) {
        C34679nge c34679nge = this.values;
        String strEZpvd = c34679nge != null ? c34679nge.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        if (this.gEmmrt == ChartType.PRICE || strEZpvd.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.ejfBZ.EZpvd((oUO) it.next(), strEZpvd));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        AdvancedKLineVM$checkChartType$1 advancedKLineVM$checkChartType$1;
        Object objCopydefault;
        AdvancedKLineVM advancedKLineVM;
        if (continuation instanceof AdvancedKLineVM$checkChartType$1) {
            advancedKLineVM$checkChartType$1 = (AdvancedKLineVM$checkChartType$1) continuation;
            int i = advancedKLineVM$checkChartType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedKLineVM$checkChartType$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedKLineVM$checkChartType$1 = new AdvancedKLineVM$checkChartType$1(this, continuation);
            }
        }
        Object obj = advancedKLineVM$checkChartType$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = advancedKLineVM$checkChartType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32272mVw c32272mVw = this.isConnected;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            advancedKLineVM$checkChartType$1.L$0 = this;
            advancedKLineVM$checkChartType$1.label = 1;
            objCopydefault = c32272mVw.copydefault("key_kline_market_chart_type", kSerializerSerializer, advancedKLineVM$checkChartType$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            advancedKLineVM = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            advancedKLineVM = (AdvancedKLineVM) advancedKLineVM$checkChartType$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        ChartType chartType = ChartType.PRICE;
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = chartType;
        }
        advancedKLineVM.gEmmrt = (ChartType) objCopydefault;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull ChartType chartType, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AdvancedKLineVM$saveChartType$1 advancedKLineVM$saveChartType$1;
        if (continuation instanceof AdvancedKLineVM$saveChartType$1) {
            advancedKLineVM$saveChartType$1 = (AdvancedKLineVM$saveChartType$1) continuation;
            int i = advancedKLineVM$saveChartType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedKLineVM$saveChartType$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedKLineVM$saveChartType$1 = new AdvancedKLineVM$saveChartType$1(this, continuation);
            }
        }
        Object obj = advancedKLineVM$saveChartType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedKLineVM$saveChartType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C32272mVw c32272mVw = this.isConnected;
            KSerializer<ChartType> kSerializerSerializer = ChartType.Companion.serializer();
            advancedKLineVM$saveChartType$1.label = 1;
            if (c32272mVw.EZpvd("key_kline_market_chart_type", kSerializerSerializer, chartType, advancedKLineVM$saveChartType$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }
}
