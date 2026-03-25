package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dex.tee.domain.model.NumLimitData;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC30503lcQ;
import o.C23313hvq;
import o.C28137kQg;
import o.C28139kQi;
import o.C28222kTk;
import o.C30808liD;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$special$$inlined$combine$1$3 extends SuspendLambda implements yHO<FlowCollector<? super ReminderListConfig>, Object[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$special$$inlined$combine$1$3(Continuation continuation, AdvancedPlaceOrderVM advancedPlaceOrderVM) {
        super(3, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ReminderListConfig> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        AdvancedPlaceOrderVM$special$$inlined$combine$1$3 advancedPlaceOrderVM$special$$inlined$combine$1$3 = new AdvancedPlaceOrderVM$special$$inlined$combine$1$3(continuation, this.this$0);
        advancedPlaceOrderVM$special$$inlined$combine$1$3.L$0 = flowCollector;
        advancedPlaceOrderVM$special$$inlined$combine$1$3.L$1 = objArr;
        return advancedPlaceOrderVM$special$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Throwable th;
        List<String> listKWHzl;
        V6BaseQuoteResponse v6BaseQuoteResponse;
        Throwable thM7380exceptionOrNullimpl;
        Throwable origin;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj3 = objArr[0];
            PreCheckBean preCheckBean = obj3 instanceof PreCheckBean ? (PreCheckBean) obj3 : null;
            Object obj4 = objArr[1];
            Result result = obj4 instanceof Result ? (Result) obj4 : null;
            Object obj5 = objArr[2];
            DexMultiTokenInfoBean dexMultiTokenInfoBean = obj5 instanceof DexMultiTokenInfoBean ? (DexMultiTokenInfoBean) obj5 : null;
            Object obj6 = objArr[3];
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = obj6 instanceof DexMultiTokenInfoBean ? (DexMultiTokenInfoBean) obj6 : null;
            Object obj7 = objArr[4];
            AdvancedTradeType value = obj7 instanceof AdvancedTradeType ? (AdvancedTradeType) obj7 : null;
            Object obj8 = objArr[5];
            AdvancedOrderType value2 = obj8 instanceof AdvancedOrderType ? (AdvancedOrderType) obj8 : null;
            Object obj9 = objArr[6];
            AbstractC30503lcQ abstractC30503lcQ = obj9 instanceof AbstractC30503lcQ ? (AbstractC30503lcQ) obj9 : null;
            Object obj10 = objArr[7];
            C30808liD c30808liD = obj10 instanceof C30808liD ? (C30808liD) obj10 : null;
            Object obj11 = objArr[8];
            AdvancedApproveState advancedApproveState = obj11 instanceof AdvancedApproveState ? (AdvancedApproveState) obj11 : null;
            Object obj12 = objArr[9];
            NumLimitData numLimitData = obj12 instanceof NumLimitData ? (NumLimitData) obj12 : null;
            Object obj13 = objArr[10];
            AdvancedLimitBy advancedLimitBy = obj13 instanceof AdvancedLimitBy ? (AdvancedLimitBy) obj13 : null;
            Object obj14 = objArr[11];
            C28222kTk c28222kTk = obj14 instanceof C28222kTk ? (C28222kTk) obj14 : null;
            Object obj15 = objArr[12];
            List<String> list = obj15 instanceof List ? (List) obj15 : null;
            Object obj16 = objArr[13];
            String str = obj16 instanceof String ? (String) obj16 : null;
            TokenPairRateQuote value3 = C23313hvq.OLrzqt(str, C56443yFo.AEQbTJ(0)) ? this.this$0.gGvvIC.KWHzl().getValue() : null;
            Throwable value4 = C23313hvq.OLrzqt(str, C56443yFo.AEQbTJ(0)) ? this.this$0.gGvvIC.EZpvd().getValue() : null;
            String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            if (chainId != null) {
                th = value4;
                obj2 = objCopydefault;
                listKWHzl = this.this$0.dNCPSb.KWHzl(this.this$0.accept, chainId);
            } else {
                obj2 = objCopydefault;
                th = value4;
                listKWHzl = null;
            }
            C28137kQg c28137kQg = this.this$0.AxsJAYaxsJAY;
            if (value == null) {
                value = this.this$0.DTwDnp().getValue();
            }
            if (value2 == null) {
                value2 = this.this$0.getFieldNames().getValue();
            }
            AdvancedOrderType advancedOrderType = value2;
            AbstractC30503lcQ value5 = abstractC30503lcQ == null ? this.this$0.djBIcL().getValue() : abstractC30503lcQ;
            AdvancedApproveState advancedApproveState2 = advancedApproveState == null ? (AdvancedApproveState) this.this$0.AubY.getValue() : advancedApproveState;
            if (result != null) {
                Object objM7386unboximpl = result.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                v6BaseQuoteResponse = (V6BaseQuoteResponse) objM7386unboximpl;
            } else {
                v6BaseQuoteResponse = null;
            }
            if (result == null || (thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(result.m7386unboximpl())) == null) {
                thM7380exceptionOrNullimpl = th;
            } else {
                OKServerException oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
                if (oKServerException != null && (origin = oKServerException.getOrigin()) != null) {
                    thM7380exceptionOrNullimpl = origin;
                }
            }
            AdvancedLimitBy value6 = advancedLimitBy == null ? this.this$0.fJNWhG().getValue() : advancedLimitBy;
            String strOLrzqt = c28222kTk != null ? c28222kTk.OLrzqt() : null;
            int size = listKWHzl != null ? listKWHzl.size() : 0;
            if (list == null) {
                list = listKWHzl;
            }
            ReminderListConfig reminderListConfigAEQbTJ = c28137kQg.AEQbTJ(new C28139kQi(value, advancedOrderType, chainId, value5, numLimitData, advancedApproveState2, c30808liD, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, preCheckBean, v6BaseQuoteResponse, value3, thM7380exceptionOrNullimpl, value6, strOLrzqt, size, list != null ? list.size() : 0, str, 0L, 262144, null));
            int length = objArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                pUU.KWHzl("AdvancedPlaceOrderVM", "reminder: params[" + i3 + "]=" + objArr[i2]);
                i2++;
                i3++;
            }
            pUU.KWHzl("AdvancedPlaceOrderVM", "reminder: listConfig=" + reminderListConfigAEQbTJ);
            this.label = 1;
            Object objEmit = flowCollector.emit(reminderListConfigAEQbTJ, this);
            Object obj17 = obj2;
            if (objEmit == obj17) {
                return obj17;
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
