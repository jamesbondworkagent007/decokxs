package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gZH;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyOpenOrderViewModel$reactivateOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $orderIdList;
    Object L$0;
    int label;
    final /* synthetic */ StrategyOpenOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyOpenOrderViewModel$reactivateOrders$1(StrategyOpenOrderViewModel strategyOpenOrderViewModel, List<String> list, Continuation<? super StrategyOpenOrderViewModel$reactivateOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyOpenOrderViewModel;
        this.$orderIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyOpenOrderViewModel$reactivateOrders$1(this.this$0, this.$orderIdList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyOpenOrderViewModel$reactivateOrders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gZH gzh = this.this$0.values;
            List<String> list = this.$orderIdList;
            this.label = 1;
            objOLrzqt = gzh.OLrzqt(list, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        List<String> list2 = this.$orderIdList;
        StrategyOpenOrderViewModel strategyOpenOrderViewModel = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("StrategyOpenOrderViewModel", "cancelOrders failed " + CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null), thM7380exceptionOrNullimpl);
            MutableSharedFlow mutableSharedFlow = strategyOpenOrderViewModel.EZpvd;
            if (thM7380exceptionOrNullimpl instanceof WalletJwtException) {
                z = true;
            } else {
                z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(z), list2);
            this.L$0 = objOLrzqt;
            this.label = 2;
            if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
