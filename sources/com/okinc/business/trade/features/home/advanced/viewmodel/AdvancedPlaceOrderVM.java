package com.okinc.business.trade.features.home.advanced.viewmodel;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import com.okinc.rxutils.RxBus;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.AbstractActivityC33041mov;
import o.AbstractC30503lcQ;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C19700gMb;
import o.C19756gOd;
import o.C22416heu;
import o.C25389ivm;
import o.C28137kQg;
import o.C28141kQk;
import o.C28163kRf;
import o.C28196kSl;
import o.C28222kTk;
import o.C28227kTp;
import o.C28229kTr;
import o.C28231kTt;
import o.C30457lbX;
import o.C30626leh;
import o.C30791lhn;
import o.C30798lhu;
import o.C30805liA;
import o.C30806liB;
import o.C30808liD;
import o.C31194lpS;
import o.C33129mqd;
import o.C55276xgr;
import o.C56391yDq;
import o.C56442yFn;
import o.C58216yxB;
import o.C6961aZJ;
import o.InterfaceC25414iwK;
import o.InterfaceC28133kQc;
import o.InterfaceC30595leC;
import o.InterfaceC30639leu;
import o.InterfaceC58229yxO;
import o.InterfaceC9738bbJ;
import o.dTH;
import o.kPX;
import o.kQF;
import o.kQQ;
import o.kQV;
import o.kRD;
import o.kTA;
import o.kTB;
import o.kTE;
import o.kTG;
import o.pUU;
import o.xXO;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM extends AbstractC33073mpa {
    public final MutableStateFlow<Boolean> AYXKKw;
    public final MutableStateFlow<String> AhwBna;
    public final MutableStateFlow<AdvancedOrderType> AkhnZx;
    public final MutableStateFlow<C30808liD> AuCTel;
    public final StateFlow<AbstractC30503lcQ> AuCTelauCTel;
    public final StateFlow<AdvancedApproveState> AubY;
    public final SharedFlow<Boolean> AwvSrB;
    public final StateFlow<String> AxsJAY;
    public final C28137kQg AxsJAYaxsJAY;
    public final FragmentManager AxsJAYsNCnLh;
    public final C19700gMb DAIeex;
    public final kTE DCJXGO;
    public final C28196kSl DCUTEI;
    public final C28229kTr DTwDnp;
    public final StateFlow<String> DXXBbs;
    public final StateFlow<DexMultiTokenInfoBean> DarRvM;
    public final MutableStateFlow<Boolean> DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableStateFlow<String> KWHzl;
    public final StateFlow<AdvancedTradeType> ODWQjV;
    public final MutableStateFlow<C28222kTk> OLrzqt;
    public final kQV ORxRYg;
    public final StateFlow<DexMultiTokenInfoBean> OcIXYQ;
    public C30626leh OqFWZa;
    public final SharedFlow<Unit> QKVWgx;
    public final StateFlow<String> QKudOq;
    public final InterfaceC25414iwK QOLQEE;
    public final StateFlow<Boolean> QUSxYX;
    public final StateFlow<String> QVAiDq;
    public final StateFlow<AdvancedLimitBy> QbewEr;
    public final boolean QfsBiF;
    public final StateFlow<Boolean> RJOkX;
    public final kPX RcXXUw;
    public final C30798lhu RlQdEF;
    public final StateFlow<List<C55276xgr>> UeEOUB;
    public final C28231kTt aKErDB;
    public String accept;
    public final C6961aZJ<InterfaceC30639leu> copydefault;
    public final C28163kRf dNCPSb;
    public final MutableStateFlow<Boolean> djBIcL;
    public final StateFlow<Boolean> djSkpj;
    public final StateFlow<PreCheckBean> dvKsVJ;
    public final StateFlow<List<C55276xgr>> dxcTrN;
    public final MutableStateFlow<String> ejfBZ;
    public final MutableStateFlow<AdvancedTradeType> fARcdN;
    public final StateFlow<AdvancedOrderType> fFgQHt;
    public final MutableStateFlow<InterfaceC30595leC> fIwbmz;
    public final MutableStateFlow<C30805liA> fJNWhG;
    public final MutableStateFlow<Integer> fZBcTu;
    public final MutableStateFlow<AdvancedLimitBy> fetchVPNInfo;
    public final StateFlow<String> ffGIBT;
    public final StateFlow<InterfaceC30595leC> finit;
    public final kRD flVtFt;
    public final C19756gOd fvQaOB;
    public final MutableStateFlow<Boolean> gEmmrt;
    public final kTB gGvvIC;
    public final C58216yxB gHZMYf;
    public final InterfaceC28133kQc gasjUx;
    public final StateFlow<String> getFieldNames;
    public final StateFlow<String> getNewProxyInstance;
    public final MutableLiveData<Boolean> getPostValueLengthLimit;
    public final StateFlow<List<UIPricingToken>> giSNqX;
    public final StateFlow<Boolean> gkJEwt;
    public final kQF hDKMBd;
    public final kTA hUfVAv;
    public final StateFlow<AdvancedQuoteUiData> iRxXKY;
    public final StateFlow<ReminderListConfig> iZzfmt;
    public final MutableStateFlow<List<C55276xgr>> isConnected;
    public final Flow<TradeState> iwGUEr;
    public final LiveData<InterfaceC30639leu> sSMYrx;
    public final MutableStateFlow<String> uzCIH;
    public final MutableSharedFlow<Unit> valueOf;
    public final MutableStateFlow<List<C55276xgr>> values;
    public final StateFlow<String> wlaJM;
    public final C28227kTp zLjUOn;
    public final kQQ zsXlph;
    public final StateFlow<C30457lbX> zuBGHE;
    public final StateFlow<String> zuWLRA;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AYXKKw() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedQuoteUiData> AuCTelauCTel() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> AwvSrB() {
        return this.DarRvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedTradeType> DTwDnp() {
        return this.ODWQjV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accept = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> ORxRYg() {
        return this.DXXBbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> QKVWgx() {
        return this.zuWLRA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> QOLQEE() {
        return this.getPostValueLengthLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> QVAiDq() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC30503lcQ> djBIcL() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> ejfBZ() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> fARcdN() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedLimitBy> fJNWhG() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InterfaceC30639leu> fetchVPNInfo() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> gEmmrt() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> gHZMYf() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedOrderType> getFieldNames() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C55276xgr>> getNewProxyInstance() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C55276xgr>> hDKMBd() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> isConnected() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ReminderListConfig> sSMYrx() {
        return this.iZzfmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> uzCIH() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<TradeState> valueOf() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC30595leC> wlaJM() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> zLjUOn() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<UIPricingToken>> zsXlph() {
        return this.giSNqX;
    }

    public static final class ActionBar implements Flow<String> {
        public final /* synthetic */ AdvancedPlaceOrderVM AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ AdvancedPlaceOrderVM EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
                this.KWHzl = flowCollector;
                this.EZpvd = advancedPlaceOrderVM;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedPlaceOrderVM$special$$inlined$map$1$2$1 advancedPlaceOrderVM$special$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof AdvancedPlaceOrderVM$special$$inlined$map$1$2$1) {
                    advancedPlaceOrderVM$special$$inlined$map$1$2$1 = (AdvancedPlaceOrderVM$special$$inlined$map$1$2$1) continuation;
                    int i = advancedPlaceOrderVM$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedPlaceOrderVM$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedPlaceOrderVM$special$$inlined$map$1$2$1 = new AdvancedPlaceOrderVM$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedPlaceOrderVM$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedPlaceOrderVM$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.KWHzl;
                    C28196kSl c28196kSl = this.EZpvd.DCUTEI;
                    advancedPlaceOrderVM$special$$inlined$map$1$2$1.L$0 = flowCollector2;
                    advancedPlaceOrderVM$special$$inlined$map$1$2$1.label = 1;
                    Object objOLrzqt = c28196kSl.OLrzqt(advancedPlaceOrderVM$special$$inlined$map$1$2$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objOLrzqt;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) advancedPlaceOrderVM$special$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                advancedPlaceOrderVM$special$$inlined$map$1$2$1.L$0 = null;
                advancedPlaceOrderVM$special$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, advancedPlaceOrderVM$special$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
            this.copydefault = flow;
            this.AEQbTJ = advancedPlaceOrderVM;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                AdvancedPlaceOrderVM$special$$inlined$map$2$2$1 advancedPlaceOrderVM$special$$inlined$map$2$2$1;
                if (continuation instanceof AdvancedPlaceOrderVM$special$$inlined$map$2$2$1) {
                    advancedPlaceOrderVM$special$$inlined$map$2$2$1 = (AdvancedPlaceOrderVM$special$$inlined$map$2$2$1) continuation;
                    int i = advancedPlaceOrderVM$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        advancedPlaceOrderVM$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        advancedPlaceOrderVM$special$$inlined$map$2$2$1 = new AdvancedPlaceOrderVM$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = advancedPlaceOrderVM$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = advancedPlaceOrderVM$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) obj;
                    String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
                    advancedPlaceOrderVM$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(chainId, advancedPlaceOrderVM$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<ReminderListConfig> {
        public final /* synthetic */ Flow[] EZpvd;
        public final /* synthetic */ AdvancedPlaceOrderVM copydefault;

        public StateListAnimator(Flow[] flowArr, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
            this.EZpvd = flowArr;
            this.copydefault = advancedPlaceOrderVM;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ReminderListConfig> flowCollector, Continuation continuation) {
            final Flow[] flowArr = this.EZpvd;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<Object[]>() { // from class: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM.StateListAnimator.3
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object[] invoke() {
                    return new Object[flowArr.length];
                }
            }, new AdvancedPlaceOrderVM$special$$inlined$combine$1$3(null, this.copydefault), continuation);
            return objCombineInternal == C56442yFn.copydefault() ? objCombineInternal : Unit.INSTANCE;
        }
    }

    @yCM
    public AdvancedPlaceOrderVM(@NotNull kRD krd, @NotNull kQQ kqq, @NotNull kQF kqf, @NotNull C28196kSl c28196kSl, @NotNull kQV kqv, @NotNull C28163kRf c28163kRf, @NotNull C30798lhu c30798lhu, @NotNull C19700gMb c19700gMb, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull C19756gOd c19756gOd, @NotNull C28137kQg c28137kQg, @NotNull kPX kpx, @NotNull InterfaceC28133kQc interfaceC28133kQc, @NotNull C28229kTr c28229kTr, @NotNull kTB ktb, @NotNull C28227kTp c28227kTp, @NotNull C28231kTt c28231kTt, @NotNull kTA kta, @NotNull kTE kte) {
        Intrinsics.checkNotNullParameter(krd, "");
        Intrinsics.checkNotNullParameter(kqq, "");
        Intrinsics.checkNotNullParameter(kqf, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(kqv, "");
        Intrinsics.checkNotNullParameter(c28163kRf, "");
        Intrinsics.checkNotNullParameter(c30798lhu, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(c19756gOd, "");
        Intrinsics.checkNotNullParameter(c28137kQg, "");
        Intrinsics.checkNotNullParameter(kpx, "");
        Intrinsics.checkNotNullParameter(interfaceC28133kQc, "");
        Intrinsics.checkNotNullParameter(c28229kTr, "");
        Intrinsics.checkNotNullParameter(ktb, "");
        Intrinsics.checkNotNullParameter(c28227kTp, "");
        Intrinsics.checkNotNullParameter(c28231kTt, "");
        Intrinsics.checkNotNullParameter(kta, "");
        Intrinsics.checkNotNullParameter(kte, "");
        this.flVtFt = krd;
        this.zsXlph = kqq;
        this.hDKMBd = kqf;
        this.DCUTEI = c28196kSl;
        this.ORxRYg = kqv;
        this.dNCPSb = c28163kRf;
        this.RlQdEF = c30798lhu;
        this.DAIeex = c19700gMb;
        this.QOLQEE = interfaceC25414iwK;
        this.fvQaOB = c19756gOd;
        this.AxsJAYaxsJAY = c28137kQg;
        this.RcXXUw = kpx;
        this.gasjUx = interfaceC28133kQc;
        this.DTwDnp = c28229kTr;
        this.gGvvIC = ktb;
        this.zLjUOn = c28227kTp;
        this.aKErDB = c28231kTt;
        this.hUfVAv = kta;
        this.DCJXGO = kte;
        this.gkJEwt = ktb.OLrzqt(ViewModelKt.getViewModelScope(this));
        this.iRxXKY = ktb.AEQbTJ();
        StateFlow<AbstractC30503lcQ> stateFlowEZpvd = c28227kTp.EZpvd();
        this.AuCTelauCTel = stateFlowEZpvd;
        this.zuBGHE = c28227kTp.copydefault();
        this.QKudOq = c28229kTr.AEQbTJ();
        StateFlow<DexMultiTokenInfoBean> stateFlowEZpvd2 = kte.EZpvd();
        this.OcIXYQ = stateFlowEZpvd2;
        StateFlow<DexMultiTokenInfoBean> stateFlowDjBIcL = kte.djBIcL();
        this.DarRvM = stateFlowDjBIcL;
        this.giSNqX = kte.copydefault();
        this.getPostValueLengthLimit = kte.valueOf();
        this.accept = "default_trade";
        MutableStateFlow<AdvancedTradeType> MutableStateFlow = StateFlowKt.MutableStateFlow(AdvancedTradeType.BUY);
        this.fARcdN = MutableStateFlow;
        StateFlow<AdvancedTradeType> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.ODWQjV = stateFlowAsStateFlow;
        StateFlow<String> stateFlowAsStateFlow2 = FlowKt.asStateFlow(kqq.KWHzl());
        this.wlaJM = stateFlowAsStateFlow2;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.ejfBZ = MutableStateFlow2;
        StateFlow<String> stateFlowAsStateFlow3 = FlowKt.asStateFlow(MutableStateFlow2);
        this.DXXBbs = stateFlowAsStateFlow3;
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.uzCIH = MutableStateFlow3;
        this.zuWLRA = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow4;
        this.QVAiDq = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow5;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<C55276xgr>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.isConnected = MutableStateFlow6;
        this.UeEOUB = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<AdvancedLimitBy> MutableStateFlow7 = StateFlowKt.MutableStateFlow(AdvancedLimitBy.Price);
        this.fetchVPNInfo = MutableStateFlow7;
        StateFlow<AdvancedLimitBy> stateFlowAsStateFlow4 = FlowKt.asStateFlow(MutableStateFlow7);
        this.QbewEr = stateFlowAsStateFlow4;
        MutableStateFlow<List<C55276xgr>> MutableStateFlow8 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.values = MutableStateFlow8;
        this.dxcTrN = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<AdvancedOrderType> MutableStateFlow9 = StateFlowKt.MutableStateFlow(AdvancedOrderType.MARKET);
        this.AkhnZx = MutableStateFlow9;
        StateFlow<AdvancedOrderType> stateFlowAsStateFlow5 = FlowKt.asStateFlow(MutableStateFlow9);
        this.fFgQHt = stateFlowAsStateFlow5;
        Boolean bool = Boolean.FALSE;
        this.djBIcL = StateFlowKt.MutableStateFlow(bool);
        this.gEmmrt = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(bool);
        this.AYXKKw = MutableStateFlow10;
        this.RJOkX = FlowKt.asStateFlow(MutableStateFlow10);
        this.fJNWhG = StateFlowKt.MutableStateFlow(new C30805liA(false, null, null, null, null, null, null, 127, null));
        MutableStateFlow<C30808liD> MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this.AuCTel = MutableStateFlow11;
        MutableStateFlow<InterfaceC30595leC> MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this.fIwbmz = MutableStateFlow12;
        this.finit = FlowKt.asStateFlow(MutableStateFlow12);
        StateFlow<AdvancedApproveState> stateFlowEZpvd3 = kqf.EZpvd();
        this.AubY = stateFlowEZpvd3;
        this.iwGUEr = kqf.OLrzqt();
        MutableStateFlow<Boolean> MutableStateFlow13 = StateFlowKt.MutableStateFlow(bool);
        this.DbNXlk = MutableStateFlow13;
        this.djSkpj = FlowKt.asStateFlow(MutableStateFlow13);
        C6961aZJ<InterfaceC30639leu> c6961aZJ = new C6961aZJ<>();
        this.copydefault = c6961aZJ;
        this.sSMYrx = c6961aZJ;
        MutableStateFlow<C28222kTk> MutableStateFlow14 = StateFlowKt.MutableStateFlow(new C28222kTk(null, null, null, null, null, null, 63, null));
        this.OLrzqt = MutableStateFlow14;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AwvSrB = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default2;
        this.QKVWgx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.QfsBiF = C22416heu.AhwBna();
        StateFlow<Boolean> stateFlowKWHzl = c28227kTp.KWHzl(ViewModelKt.getViewModelScope(this), MutableStateFlow9, MutableStateFlow, new Function0() { // from class: o.kSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.fvQaOB(this.AEQbTJ));
            }
        });
        this.QUSxYX = stateFlowKWHzl;
        this.OqFWZa = new C30626leh(null, null, null, null, null, null, false, null, null, null, 1023, null);
        this.gHZMYf = new C58216yxB();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        Flow flowOnStart = FlowKt.onStart(new ActionBar(ReactiveFlowKt.asFlow(abstractC58185ywXKWHzl), this), new AdvancedPlaceOrderVM$accountId$2(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<String> stateFlowStateIn = FlowKt.stateIn(flowOnStart, viewModelScope, companion.getLazily(), null);
        this.getNewProxyInstance = stateFlowStateIn;
        StateFlow<String> stateFlowStateIn2 = FlowKt.stateIn(new Application(FlowKt.transformLatest(stateFlowAsStateFlow, new AdvancedPlaceOrderVM$special$$inlined$flatMapLatest$1(null, this))), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.AxsJAY = stateFlowStateIn2;
        StateFlow<String> stateFlowStateIn3 = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, stateFlowStateIn2, new AdvancedPlaceOrderVM$userWalletAddress$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.ffGIBT = stateFlowStateIn3;
        MutableStateFlow<Integer> MutableStateFlow15 = StateFlowKt.MutableStateFlow(0);
        this.fZBcTu = MutableStateFlow15;
        StateFlow<PreCheckBean> stateFlowStateIn4 = FlowKt.stateIn(FlowKt.onEach(FlowKt.combine(stateFlowStateIn2, stateFlowStateIn3, MutableStateFlow15, new AdvancedPlaceOrderVM$preCheckResult$1(this, null)), new AdvancedPlaceOrderVM$preCheckResult$2(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.dvKsVJ = stateFlowStateIn4;
        this.iZzfmt = FlowKt.stateIn(new StateListAnimator(new Flow[]{stateFlowStateIn4, ktb.OLrzqt(), stateFlowEZpvd2, stateFlowDjBIcL, stateFlowAsStateFlow, stateFlowAsStateFlow5, stateFlowEZpvd, MutableStateFlow11, stateFlowEZpvd3, kqv.AEQbTJ(), stateFlowAsStateFlow4, MutableStateFlow14, FlowLiveDataConversions.asFlow(iwGUEr()), stateFlowAsStateFlow3, stateFlowStateIn, ktb.KWHzl(), ktb.EZpvd()}, this), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        KWHzl();
        kta.EZpvd(new Function0() { // from class: o.kTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.AuCTel(this.EZpvd);
            }
        }, new Function0() { // from class: o.kTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.AkhnZx(this.KWHzl);
            }
        }, new Function0() { // from class: o.kTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.fetchVPNInfo(this.KWHzl);
            }
        }, new Function0() { // from class: o.kTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.DbNXlk(this.EZpvd);
            }
        });
        c28227kTp.OLrzqt(ViewModelKt.getViewModelScope(this), new Function1() { // from class: o.kTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.OLrzqt(this.AEQbTJ, (InterfaceC30595leC) obj);
            }
        }, new Function1() { // from class: o.kTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.EZpvd(this.AEQbTJ, (AbstractC30503lcQ) obj);
            }
        }, new Function0() { // from class: o.kSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.ejfBZ(this.AEQbTJ);
            }
        });
        c28227kTp.OLrzqt(ViewModelKt.getViewModelScope(this), ktb.AEQbTJ(), MutableStateFlow11, MutableStateFlow, kte.KWHzl(), kte.AEQbTJ(), stateFlowAsStateFlow2, stateFlowKWHzl, MutableStateFlow7, MutableStateFlow14, new Function0() { // from class: o.kSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.fARcdN(this.copydefault);
            }
        }, new Function1() { // from class: o.kSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.EZpvd(this.KWHzl, (C30808liD) obj);
            }
        }, new Function0() { // from class: o.kSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.fJNWhG(this.copydefault));
            }
        }, new Function0() { // from class: o.kST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.fIwbmz(this.OLrzqt));
            }
        });
        c28227kTp.AEQbTJ(ViewModelKt.getViewModelScope(this), stateFlowKWHzl, new Function2() { // from class: o.kTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AdvancedPlaceOrderVM.copydefault(this.copydefault, (AbstractC30503lcQ) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass13(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass14(null), 3, null);
        this.AxsJAYsNCnLh = new FragmentManager();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final boolean fvQaOB(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.UeEOUB();
    }

    public static final String AuCTel(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.values();
    }

    public static final String AkhnZx(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        DexMultiTokenInfoBean value = advancedPlaceOrderVM.OcIXYQ.getValue();
        String tokenSymbol = value != null ? value.getTokenSymbol() : null;
        return tokenSymbol == null ? "" : tokenSymbol;
    }

    public static final String fetchVPNInfo(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        DexMultiTokenInfoBean value = advancedPlaceOrderVM.DarRvM.getValue();
        String tokenSymbol = value != null ? value.getTokenSymbol() : null;
        return tokenSymbol == null ? "" : tokenSymbol;
    }

    public static final ServiceFeeInfo DbNXlk(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.gasjUx();
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderVM advancedPlaceOrderVM, InterfaceC30595leC interfaceC30595leC) {
        advancedPlaceOrderVM.RlQdEF.copydefault(interfaceC30595leC);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AdvancedPlaceOrderVM advancedPlaceOrderVM, AbstractC30503lcQ abstractC30503lcQ) {
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        updateAutoSell$default(advancedPlaceOrderVM, abstractC30503lcQ, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final InterfaceC30595leC ejfBZ(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.fIwbmz.getValue();
    }

    public static final String fARcdN(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.fIwbmz();
    }

    public static final String EZpvd(AdvancedPlaceOrderVM advancedPlaceOrderVM, C30808liD c30808liD) {
        return advancedPlaceOrderVM.gGvvIC.OLrzqt(c30808liD);
    }

    public static final boolean fJNWhG(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.QbewEr();
    }

    public static final boolean fIwbmz(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.RJOkX();
    }

    public static final Unit copydefault(AdvancedPlaceOrderVM advancedPlaceOrderVM, AbstractC30503lcQ abstractC30503lcQ, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        advancedPlaceOrderVM.AEQbTJ(abstractC30503lcQ, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$13, reason: invalid class name */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass13(Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedPlaceOrderVM.this.new AnonymousClass13(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$13$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ReminderListConfig, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvancedPlaceOrderVM this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedPlaceOrderVM;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReminderListConfig reminderListConfig, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(reminderListConfig, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.ORxRYg.EZpvd((ReminderListConfig) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<ReminderListConfig> stateFlowSSMYrx = AdvancedPlaceOrderVM.this.sSMYrx();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedPlaceOrderVM.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowSSMYrx, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$14, reason: invalid class name */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass14(Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedPlaceOrderVM.this.new AnonymousClass14(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC30595leC> stateFlowWlaJM = AdvancedPlaceOrderVM.this.wlaJM();
                FlowCollector<? super InterfaceC30595leC> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM.14.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC30595leC interfaceC30595leC, Continuation<? super Unit> continuation) {
                        pUU.KWHzl("AdvancedPlaceOrderVM", "placeOrderError=" + interfaceC30595leC);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowWlaJM.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void KWHzl() {
        this.DTwDnp.KWHzl(new yHO() { // from class: o.kSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AdvancedPlaceOrderVM.EZpvd(this.copydefault, (java.lang.String) obj, (DexMultiTokenInfoBean) obj2, (java.lang.String) obj3);
            }
        });
        this.gGvvIC.EZpvd(new AdvancedPlaceOrderVM$bindDelegateCallbacks$2(this, null));
        this.zLjUOn.AEQbTJ((Function2<? super AbstractC30503lcQ, ? super Continuation<? super InterfaceC30595leC>, ? extends Object>) new AdvancedPlaceOrderVM$bindDelegateCallbacks$3(this, null));
        this.zLjUOn.copydefault(new Function1() { // from class: o.kSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.AEQbTJ(this.EZpvd, (java.lang.String) obj));
            }
        });
        this.zLjUOn.EZpvd(new AdvancedPlaceOrderVM$bindDelegateCallbacks$5(this, null));
    }

    public static final Unit EZpvd(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(advancedPlaceOrderVM), null, null, new AdvancedPlaceOrderVM$bindDelegateCallbacks$1$1(advancedPlaceOrderVM, str, dexMultiTokenInfoBean, str2, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str) {
        return advancedPlaceOrderVM.ORxRYg.copydefault(str);
    }

    public final void fvQaOB() {
        C28227kTp c28227kTp = this.zLjUOn;
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        DexMultiTokenInfoBean value = this.OcIXYQ.getValue();
        c28227kTp.copydefault(viewModelScope, value != null ? value.getChainId() : null, new Function1() { // from class: o.kSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.valueOf(this.KWHzl, (InterfaceC30595leC) obj);
            }
        });
    }

    public static final Unit valueOf(AdvancedPlaceOrderVM advancedPlaceOrderVM, InterfaceC30595leC interfaceC30595leC) {
        advancedPlaceOrderVM.EZpvd(interfaceC30595leC);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateAutoSell$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, AbstractC30503lcQ abstractC30503lcQ, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        advancedPlaceOrderVM.AEQbTJ(abstractC30503lcQ, z);
    }

    public final void AEQbTJ(@NotNull AbstractC30503lcQ abstractC30503lcQ, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        this.zLjUOn.AEQbTJ(ViewModelKt.getViewModelScope(this), abstractC30503lcQ, z);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateAutoSell$1(this, abstractC30503lcQ, null), 3, null);
    }

    public final Object KWHzl(@NotNull Continuation<? super List<? extends AdvancedAutoSellStrategy>> continuation) {
        return BuildersKt.withContext(ViewModelKt.getViewModelScope(this).getCoroutineContext(), new AdvancedPlaceOrderVM$getStrategies$2(this, null), continuation);
    }

    public final void EZpvd(boolean z) {
        this.zLjUOn.copydefault(ViewModelKt.getViewModelScope(this), z, new Function1() { // from class: o.kSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.AhwBna(this.OLrzqt, (InterfaceC30595leC) obj);
            }
        });
    }

    public static final Unit AhwBna(AdvancedPlaceOrderVM advancedPlaceOrderVM, InterfaceC30595leC interfaceC30595leC) {
        advancedPlaceOrderVM.EZpvd(interfaceC30595leC);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean shouldShowAutoSellEdit$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, InterfaceC30595leC interfaceC30595leC, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC30595leC = advancedPlaceOrderVM.finit.getValue();
        }
        return advancedPlaceOrderVM.KWHzl(interfaceC30595leC);
    }

    public final boolean KWHzl(InterfaceC30595leC interfaceC30595leC) {
        return this.zLjUOn.EZpvd(interfaceC30595leC, this.QUSxYX.getValue().booleanValue());
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C28229kTr c28229kTr = this.DTwDnp;
        String value = this.ejfBZ.getValue();
        c28229kTr.OLrzqt(str, str2, value != null ? value : "", this.OcIXYQ.getValue());
    }

    public final String AxsJAY() {
        return this.DTwDnp.EZpvd(this.iRxXKY.getValue());
    }

    public final String zuBGHE() {
        return this.DTwDnp.OLrzqt(this.iRxXKY.getValue());
    }

    public final void fZBcTu() {
        this.DTwDnp.KWHzl();
    }

    public final String AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        C28229kTr c28229kTr = this.DTwDnp;
        String value = this.ejfBZ.getValue();
        return c28229kTr.OLrzqt(v6BaseQuoteResponse, value != null ? value : "", this.OcIXYQ.getValue());
    }

    public static final boolean hUfVAv(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        ServiceFeeInfo serviceFeeInfoGasjUx = advancedPlaceOrderVM.gasjUx();
        if (serviceFeeInfoGasjUx != null) {
            return serviceFeeInfoGasjUx.isCharge();
        }
        return true;
    }

    public final boolean QfsBiF() {
        return this.hUfVAv.copydefault(new Function0() { // from class: o.kSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.hUfVAv(this.OLrzqt));
            }
        });
    }

    public final Map<String, String> AubY() {
        return this.hUfVAv.KWHzl();
    }

    public final void KWHzl(@NotNull Function2<? super Boolean, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.hUfVAv.OLrzqt(function2);
    }

    private final ServiceFeeInfo gasjUx() {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteUiData value = this.iRxXKY.getValue();
        if (value == null || (advancedQuoteAndCallDataKWHzl = value.KWHzl()) == null) {
            return null;
        }
        return advancedQuoteAndCallDataKWHzl.wlaJM();
    }

    public final void dvKsVJ() {
        this.gGvvIC.AhwBna();
    }

    public final void KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        this.gGvvIC.copydefault(v6BaseQuoteResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super V6QuoteAndCalldataRequest> continuation) {
        boolean z;
        kTB ktb = this.gGvvIC;
        AdvancedTradeType value = this.ODWQjV.getValue();
        String strAxsJAY = AxsJAY();
        if (UeEOUB()) {
            z = kQV.canUseSmartAccount$default(this.ORxRYg, null, 1, null);
        }
        return ktb.EZpvd(value, strAxsJAY, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super V6QuoteRequest> continuation) {
        boolean z;
        kTB ktb = this.gGvvIC;
        String strAxsJAY = AxsJAY();
        if (UeEOUB()) {
            z = kQV.canUseSmartAccount$default(this.ORxRYg, null, 1, null);
        }
        return ktb.copydefault(strAxsJAY, z, continuation);
    }

    public final void djBIcL(boolean z) {
        if (this.RlQdEF.EZpvd(this.OqFWZa)) {
            PreCheckBean value = this.dvKsVJ.getValue();
            if (value == null || value.isSupportQuote()) {
                KWHzl(this.OqFWZa, z);
            }
        }
    }

    public static /* synthetic */ void updateQuote$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, C30626leh c30626leh, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        advancedPlaceOrderVM.KWHzl(c30626leh, z);
    }

    public final void KWHzl(@NotNull C30626leh c30626leh, boolean z) {
        Intrinsics.checkNotNullParameter(c30626leh, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateQuote$1(this, c30626leh, z, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        kTB ktb = this.gGvvIC;
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        boolean zRJOkX = RJOkX();
        C28141kQk c28141kQk = new C28141kQk(this.ODWQjV.getValue(), new Function0() { // from class: o.kSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.gkJEwt(this.EZpvd);
            }
        }, new Function0() { // from class: o.kSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AdvancedPlaceOrderVM.iZzfmt(this.EZpvd));
            }
        }, this.AYXKKw.getValue().booleanValue());
        DexMultiTokenInfoBean value = this.OcIXYQ.getValue();
        DexMultiTokenInfoBean value2 = this.DarRvM.getValue();
        String value3 = this.DXXBbs.getValue();
        List<String> value4 = iwGUEr().getValue();
        AdvancedLimitBy value5 = this.fetchVPNInfo.getValue();
        C28222kTk value6 = this.OLrzqt.getValue();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAkhnZx = AkhnZx();
        String tokenSymbol = dexMultiTokenInfoBeanAkhnZx != null ? dexMultiTokenInfoBeanAkhnZx.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        ktb.copydefault(viewModelScope, zRJOkX, z, c28141kQk, new kTG(value, value2, value3, value4, value5, value6, tokenSymbol, fIwbmz(), this.fARcdN.getValue()), new Function1() { // from class: o.kSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.OLrzqt(this.OLrzqt, (V6BaseQuoteResponse) obj);
            }
        }, new Function1() { // from class: o.kSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.AYXKKw(this.KWHzl, (InterfaceC30595leC) obj);
            }
        }, new Function1() { // from class: o.kSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.kSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.gEmmrt(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final String gkJEwt(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        String strEZpvd = advancedPlaceOrderVM.DTwDnp.EZpvd();
        return strEZpvd.length() == 0 ? "11" : strEZpvd;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kQV.canUseSmartAccount$default(o.kQV, java.lang.String, int, java.lang.Object):boolean */
    public static final boolean iZzfmt(AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        return advancedPlaceOrderVM.UeEOUB() && kQV.canUseSmartAccount$default(advancedPlaceOrderVM.ORxRYg, null, 1, null);
    }

    public static final String OLrzqt(AdvancedPlaceOrderVM advancedPlaceOrderVM, V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        return advancedPlaceOrderVM.AEQbTJ(v6BaseQuoteResponse);
    }

    public static final Unit AYXKKw(AdvancedPlaceOrderVM advancedPlaceOrderVM, InterfaceC30595leC interfaceC30595leC) {
        advancedPlaceOrderVM.EZpvd(interfaceC30595leC);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderVM advancedPlaceOrderVM, boolean z) {
        advancedPlaceOrderVM.gEmmrt.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        advancedPlaceOrderVM.DTwDnp.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void stopCheckingQuote$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = z;
        }
        advancedPlaceOrderVM.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        this.gGvvIC.EZpvd(z, z2);
        if (z) {
            this.DTwDnp.OLrzqt();
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$stopCheckingQuote$1(this, null), 3, null);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class FragmentManager implements C28231kTt.ActionBar {
        public FragmentManager() {
        }

        @Override // o.C28231kTt.ActionBar
        public void EZpvd(boolean z) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(AdvancedPlaceOrderVM.this), null, null, new AdvancedPlaceOrderVM$submissionCallback$1$onLoadingChanged$1(AdvancedPlaceOrderVM.this, z, null), 3, null);
        }

        @Override // o.C28231kTt.ActionBar
        public void OLrzqt() {
            AdvancedPlaceOrderVM.this.AEQbTJ("");
            AdvancedPlaceOrderVM.this.EZpvd("");
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(AdvancedPlaceOrderVM.this), null, null, new AdvancedPlaceOrderVM$submissionCallback$1$onOrderSuccess$1(AdvancedPlaceOrderVM.this, null), 3, null);
        }

        @Override // o.C28231kTt.ActionBar
        public void copydefault(InterfaceC30595leC interfaceC30595leC) {
            AdvancedPlaceOrderVM.this.EZpvd(interfaceC30595leC);
        }

        @Override // o.C28231kTt.ActionBar
        public void copydefault() {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(AdvancedPlaceOrderVM.this), null, null, new AdvancedPlaceOrderVM$submissionCallback$1$onBatchTransactionReminder$1(AdvancedPlaceOrderVM.this, null), 3, null);
        }

        @Override // o.C28231kTt.ActionBar
        public void KWHzl() {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(AdvancedPlaceOrderVM.this), null, null, new AdvancedPlaceOrderVM$submissionCallback$1$onEoaOrderBroadcastSuccess$1(AdvancedPlaceOrderVM.this, null), 3, null);
        }

        @Override // o.C28231kTt.ActionBar
        public void EZpvd() {
            AdvancedPlaceOrderVM.this.DTwDnp.copydefault();
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.kTB.stopChecking$default(o.kTB, boolean, boolean, int, java.lang.Object):void */
        @Override // o.C28231kTt.ActionBar
        public void AEQbTJ() {
            kTB.stopChecking$default(AdvancedPlaceOrderVM.this.gGvvIC, false, false, 2, null);
        }

        @Override // o.C28231kTt.ActionBar
        public void copydefault(boolean z) {
            AdvancedPlaceOrderVM.this.OLrzqt(z);
        }
    }

    public final void AEQbTJ(@NotNull final FragmentActivity fragmentActivity) {
        AdvancedQuoteUiData value;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (copydefault(fragmentActivity) || (value = this.iRxXKY.getValue()) == null || value.KWHzl() == null) {
            return;
        }
        final C28231kTt.Activity activityEZpvd = EZpvd();
        this.copydefault.setValue(new InterfaceC30639leu.StateListAnimator(this.zuBGHE, this.RJOkX.getValue().booleanValue() ? new Function1() { // from class: o.kSM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.djBIcL(this.copydefault, (java.lang.String) obj);
            }
        } : null, new Function0() { // from class: o.kSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM.copydefault(this.copydefault, activityEZpvd, fragmentActivity);
            }
        }));
    }

    public static final Unit djBIcL(AdvancedPlaceOrderVM advancedPlaceOrderVM, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        advancedPlaceOrderVM.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final AdvancedPlaceOrderVM advancedPlaceOrderVM, final C28231kTt.Activity activity, final FragmentActivity fragmentActivity) {
        advancedPlaceOrderVM.aKErDB.OLrzqt(activity);
        if (advancedPlaceOrderVM.ORxRYg.copydefault()) {
            AdvancedQuoteUiData value = advancedPlaceOrderVM.iRxXKY.getValue();
            if (!((value != null ? value.KWHzl() : null) instanceof AdvancedQuoteAndCallData.V6)) {
                advancedPlaceOrderVM.copydefault.setValue(new InterfaceC30639leu.BroadcastReceiver(advancedPlaceOrderVM.ORxRYg.OLrzqt(), new Function0() { // from class: o.kSY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AdvancedPlaceOrderVM.OLrzqt(this.OLrzqt, fragmentActivity, activity);
                    }
                }));
                return Unit.INSTANCE;
            }
        }
        advancedPlaceOrderVM.aKErDB.copydefault(fragmentActivity, activity, advancedPlaceOrderVM.AxsJAYsNCnLh);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderVM advancedPlaceOrderVM, FragmentActivity fragmentActivity, C28231kTt.Activity activity) {
        advancedPlaceOrderVM.aKErDB.copydefault(fragmentActivity, activity, advancedPlaceOrderVM.AxsJAYsNCnLh);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(FragmentActivity fragmentActivity) {
        InterfaceC30595leC value = this.fIwbmz.getValue();
        if (value == null) {
            return false;
        }
        if (value instanceof InterfaceC30595leC.Application) {
            this.copydefault.setValue(new InterfaceC30639leu.ActionBar(((InterfaceC30595leC.Application) value).OLrzqt()));
            return true;
        }
        if (value instanceof InterfaceC30595leC.ActionBar) {
            this.copydefault.setValue(new InterfaceC30639leu.Activity(this.OcIXYQ.getValue(), this.DarRvM.getValue()));
            return true;
        }
        if (value instanceof InterfaceC30595leC.Activity) {
            OLrzqt(fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null, this.AubY.getValue());
            return true;
        }
        if (value instanceof InterfaceC30595leC.ContextWrapper) {
            Function2<Context, CoroutineScope, Unit> function2EZpvd = ((InterfaceC30595leC.ContextWrapper) value).OLrzqt().EZpvd();
            if (function2EZpvd == null) {
                return false;
            }
            function2EZpvd.invoke(fragmentActivity, ViewModelKt.getViewModelScope(this));
            return true;
        }
        if (!(value instanceof InterfaceC30595leC.Dialog)) {
            return (value instanceof InterfaceC30595leC.PictureInPictureParams) && AEQbTJ(fragmentActivity, ((InterfaceC30595leC.PictureInPictureParams) value).AEQbTJ());
        }
        copydefault(fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null, false);
        return true;
    }

    public final boolean AEQbTJ(FragmentActivity fragmentActivity, InterfaceC30595leC interfaceC30595leC) {
        Function2<Context, CoroutineScope, Unit> function2EZpvd;
        if (interfaceC30595leC == null) {
            return false;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Dialog) {
            copydefault(fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null, false);
            return true;
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Activity) {
            OLrzqt(fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null, this.AubY.getValue());
            return true;
        }
        if (!(interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper) || (function2EZpvd = ((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt().EZpvd()) == null) {
            return false;
        }
        function2EZpvd.invoke(fragmentActivity, ViewModelKt.getViewModelScope(this));
        return true;
    }

    public final C28231kTt.Activity EZpvd() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        AdvancedTradeType value = this.fARcdN.getValue();
        AdvancedOrderType value2 = this.AkhnZx.getValue();
        DexMultiTokenInfoBean value3 = this.OcIXYQ.getValue();
        C30808liD value4 = this.AuCTel.getValue();
        AdvancedQuoteUiData value5 = this.iRxXKY.getValue();
        List<AdvancedAutoSellStrategy> listKWHzl = this.zLjUOn.KWHzl(this.QUSxYX.getValue().booleanValue());
        List<String> value6 = iwGUEr().getValue();
        AdvancedLimitBy value7 = this.fetchVPNInfo.getValue();
        C28222kTk value8 = this.OLrzqt.getValue();
        String strEZpvd = this.DTwDnp.EZpvd();
        String strFIwbmz = fIwbmz();
        boolean zQbewEr = QbewEr();
        boolean zUeEOUB = UeEOUB();
        boolean zCanUseSmartAccount$default = kQV.canUseSmartAccount$default(this.ORxRYg, null, 1, null);
        boolean zAuCTel = C22416heu.AuCTel();
        boolean zRcXXUw = RcXXUw();
        String value9 = this.ffGIBT.getValue();
        if (value9 == null) {
            value9 = "";
        }
        return new C28231kTt.Activity(viewModelScope, value, value2, value3, value4, value5, listKWHzl, value6, value7, value8, strEZpvd, strFIwbmz, zQbewEr, zUeEOUB, zCanUseSmartAccount$default, zAuCTel, zRcXXUw, value9, this.DCUTEI.copydefault());
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, AdvancedApproveState advancedApproveState) {
        if (abstractActivityC33041mov == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$handleSubmitApproval$1(this, abstractActivityC33041mov, advancedApproveState, null), 3, null);
    }

    public final MutableLiveData<List<String>> iwGUEr() {
        return this.dNCPSb.copydefault(this.accept);
    }

    public final void OcIXYQ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$initApproveState$1(this, null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$initApproveState$2(this, null), 3, null);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    public final AbstractC58185ywX<Unit> flVtFt() {
        AbstractC58185ywX<List<UIPricingToken>> abstractC58185ywXAEQbTJ = this.zsXlph.AEQbTJ(this.accept);
        final Function1 function1 = new Function1() { // from class: o.kSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.copydefault(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AdvancedPlaceOrderVM.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final Unit copydefault(AdvancedPlaceOrderVM advancedPlaceOrderVM, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        advancedPlaceOrderVM.DCJXGO.OLrzqt().setValue(list);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public final void EZpvd(InterfaceC30595leC interfaceC30595leC) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateOrderError$1(this, interfaceC30595leC, null), 3, null);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$fetchApprovalState$1(this, null), 3, null);
    }

    public final Flow<C30626leh> fFgQHt() {
        return FlowKt.transformLatest(this.RlQdEF.KWHzl(), new AdvancedPlaceOrderVM$observeTradeChanges$$inlined$flatMapLatest$1(null, this));
    }

    public final void AEQbTJ(@NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        if (this.fARcdN.getValue() == advancedTradeType) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateTradeType$1(this, advancedTradeType, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || C31194lpS.copydefault(str)) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateTradeAmount$1(this, str, null), 3, null);
        }
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateTradeUSValue$1(this, str, null), 3, null);
    }

    public final void copydefault(@NotNull C28222kTk c28222kTk) {
        Intrinsics.checkNotNullParameter(c28222kTk, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateBaseMarketInfo$1(this, c28222kTk, null), 3, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateLimitByValue$1(this, str, null), 3, null);
    }

    public final void copydefault(String str) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateApproveValue$1(this, str, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateValuePercent$1(this, defiChainInfo, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull C30806liB c30806liB) {
        Intrinsics.checkNotNullParameter(c30806liB, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateSettingModel$1(this, c30806liB, null), 3, null);
    }

    public final void AuCTel() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$getLimitOrderBy$1(this, null), 3, null);
    }

    public final void KWHzl(Boolean bool) {
        if (bool == null || this.isConnected.getValue().isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateLimitOrderByList$1(this, bool, null), 3, null);
    }

    public final boolean QbewEr() {
        Object next;
        Iterator<T> it = this.isConnected.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C55276xgr) next).OLrzqt() == AdvancedLimitBy.MCap) {
                break;
            }
        }
        C55276xgr c55276xgr = (C55276xgr) next;
        return c55276xgr != null && c55276xgr.AYXKKw();
    }

    public final void OLrzqt(@NotNull AdvancedLimitBy advancedLimitBy) {
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateLimitOrderBy$1(this, advancedLimitBy, null), 3, null);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$getAdvancedOrderTypes$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull AdvancedOrderType advancedOrderType) {
        Object next;
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Iterator<T> it = this.values.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C55276xgr) next).AEQbTJ()) {
                    break;
                }
            }
        }
        C55276xgr c55276xgr = (C55276xgr) next;
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if ((objOLrzqt instanceof AdvancedOrderType ? (AdvancedOrderType) objOLrzqt : null) == advancedOrderType) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateOrderType$1(this, advancedOrderType, null), 3, null);
    }

    public final void AEQbTJ(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateLimitOrderStatus$1(this, z, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$updateBatchBroadcastSupported$1(this, z, null), 3, null);
    }

    public final void copydefault(boolean z) {
        this.ORxRYg.AEQbTJ(z);
    }

    public final boolean RJOkX() {
        return this.RlQdEF.KWHzl().getValue() instanceof C30791lhn;
    }

    public final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
        if (this.DCJXGO.EZpvd(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, this.fARcdN.getValue(), z)) {
            if (!z) {
                AEQbTJ("");
                stopCheckingQuote$default(this, false, false, 3, null);
            }
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$checkCurrentPairs$1(this, null), 3, null);
            performTokenValidation$default(this, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, false, 4, null);
        }
    }

    public final DexMultiTokenInfoBean AkhnZx() {
        if (this.fARcdN.getValue() == AdvancedTradeType.BUY) {
            return this.DarRvM.getValue();
        }
        return this.OcIXYQ.getValue();
    }

    public final DexMultiTokenInfoBean DbNXlk() {
        if (this.fARcdN.getValue() == AdvancedTradeType.BUY) {
            return this.OcIXYQ.getValue();
        }
        return this.DarRvM.getValue();
    }

    public static /* synthetic */ void onQuoteTokenChange$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, UIPricingToken uIPricingToken, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        advancedPlaceOrderVM.KWHzl(uIPricingToken, z);
    }

    public final void KWHzl(@NotNull UIPricingToken uIPricingToken, boolean z) {
        Intrinsics.checkNotNullParameter(uIPricingToken, "");
        this.DCJXGO.EZpvd(uIPricingToken.EZpvd());
        this.zsXlph.EZpvd(this.DCJXGO.copydefault().getValue());
        AEQbTJ("");
        KWHzl(uIPricingToken.EZpvd(), AkhnZx(), z);
    }

    public static /* synthetic */ void performTokenValidation$default(AdvancedPlaceOrderVM advancedPlaceOrderVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        advancedPlaceOrderVM.KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z);
    }

    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$performTokenValidation$1(this, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z, null), 3, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dNCPSb.copydefault(str).setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dNCPSb() {
        String originContractAddress;
        C28196kSl c28196kSl = this.DCUTEI;
        DexMultiTokenInfoBean value = this.OcIXYQ.getValue();
        if (value == null || !value.isMainChainCoin()) {
            DexMultiTokenInfoBean value2 = this.OcIXYQ.getValue();
            originContractAddress = value2 != null ? value2.getOriginContractAddress() : null;
            if (originContractAddress == null) {
                originContractAddress = "";
            }
        }
        DexMultiTokenInfoBean value3 = this.OcIXYQ.getValue();
        return c28196kSl.AEQbTJ(originContractAddress, C33129mqd.valueOf(value3 != null ? value3.getChainId() : null));
    }

    public final Object EZpvd(@NotNull Continuation<? super String> continuation) {
        C28196kSl c28196kSl = this.DCUTEI;
        DexMultiTokenInfoBean value = this.OcIXYQ.getValue();
        return c28196kSl.OLrzqt(C33129mqd.valueOf(value != null ? value.getChainId() : null), continuation);
    }

    public final String copydefault() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.DAIeex.KWHzl();
        if (interfaceC9738bbJKWHzl != null) {
            return interfaceC9738bbJKWHzl.DbNXlk();
        }
        return null;
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
        if (abstractActivityC33041mov == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AdvancedPlaceOrderVM$handleAddBalance$1(this, abstractActivityC33041mov, z, null), 3, null);
    }

    public final boolean OLrzqt() {
        return UeEOUB() && this.DAIeex.AYXKKw() && !this.gasjUx.AEQbTJ();
    }

    public final boolean UeEOUB() {
        return this.QOLQEE.valueOf();
    }

    public final boolean aKErDB() {
        return this.DAIeex.djBIcL() && kQV.canUseSmartAccount$default(this.ORxRYg, null, 1, null);
    }

    public final StateFlow<dTH> dxcTrN() {
        return this.DAIeex.AEQbTJ();
    }

    public final boolean RcXXUw() {
        return this.DAIeex.AYXKKw();
    }

    public final boolean djSkpj() {
        return this.DAIeex.djBIcL();
    }

    public final boolean QUSxYX() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.DAIeex.KWHzl();
        return interfaceC9738bbJKWHzl != null && interfaceC9738bbJKWHzl.gHZMYf();
    }

    public final String values() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAkhnZx = AkhnZx();
        String chainId = dexMultiTokenInfoBeanAkhnZx != null ? dexMultiTokenInfoBeanAkhnZx.getChainId() : null;
        return chainId == null ? "" : chainId;
    }

    public final String fIwbmz() {
        return this.gGvvIC.KWHzl(this.AhwBna.getValue());
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        stopCheckingQuote$default(this, false, false, 3, null);
        this.gHZMYf.dispose();
    }

    public final void EZpvd(@NotNull C30808liD c30808liD) {
        C30805liA value;
        Intrinsics.checkNotNullParameter(c30808liD, "");
        MutableStateFlow<C30805liA> mutableStateFlow = this.fJNWhG;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.EZpvd(c30808liD)));
    }

    public final void finit() {
        Integer value;
        MutableStateFlow<Integer> mutableStateFlow = this.fZBcTu;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(value.intValue() + 1)));
    }
}
