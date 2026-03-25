package com.okinc.business.dexlogic.main.limmitorder.orderdetail;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C19743gNr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22524hgw;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderDetailViewModel$getOrderDetailInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ LimitOrderDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetailViewModel$getOrderDetailInfo$1(LimitOrderDetailViewModel limitOrderDetailViewModel, String str, Continuation<? super LimitOrderDetailViewModel$getOrderDetailInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderDetailViewModel;
        this.$orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderDetailViewModel$getOrderDetailInfo$1(this.this$0, this.$orderId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderDetailViewModel$getOrderDetailInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19743gNr c19743gNr = this.this$0.AuCTel;
            Integer num = this.this$0.fIwbmz;
            OrderStrategyType orderStrategyType = this.this$0.DbNXlk;
            String str = this.$orderId;
            this.label = 1;
            objCopydefault = c19743gNr.copydefault(num, orderStrategyType, str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        LimitOrderDetailViewModel limitOrderDetailViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            limitOrderDetailViewModel.EZpvd((OrderDetailResult) objCopydefault);
        }
        LimitOrderDetailViewModel limitOrderDetailViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = limitOrderDetailViewModel2.KWHzl;
            if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                z = thM7380exceptionOrNullimpl instanceof OKServerException ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
            }
            mutableStateFlow.setValue(new InterfaceC22524hgw.Activity(z));
        }
        return Unit.INSTANCE;
    }
}
