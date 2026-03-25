package com.okinc.unify_trade.core.usecase.todo;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.core.usecase.todo.AvailBalanceUseCase$doRetrieveFlowData$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC55740xpe;
import o.C56391yDq;
import o.C56442yFn;
import o.xCG;
import o.xDM;
import o.yDY;

/* JADX INFO: loaded from: classes24.dex */
public final class AvailBalanceUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<MaxAvailableResp>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xCG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailBalanceUseCase$doRetrieveFlowData$2(xCG xcg, Continuation<? super AvailBalanceUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = xcg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AvailBalanceUseCase$doRetrieveFlowData$2 availBalanceUseCase$doRetrieveFlowData$2 = new AvailBalanceUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        availBalanceUseCase$doRetrieveFlowData$2.L$0 = obj;
        return availBalanceUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<MaxAvailableResp>> producerScope, Continuation<? super Unit> continuation) {
        return ((AvailBalanceUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            xCG xcg = this.this$0;
            xcg.OLrzqt(yDY.copydefault(new AbstractC55740xpe(xcg.OLrzqt, this.this$0.AEQbTJ, "cash") { // from class: com.okinc.unify_trade.core.usecase.todo.AvailBalanceUseCase$doRetrieveFlowData$2.2
                /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.network.okg.response.ResponseData<com.okinc.unify_trade.biz.MaxAvailableResp>> */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    Boolean bool = Boolean.TRUE;
                }

                @Override // o.AbstractC55740xpe
                public void AEQbTJ(MaxAvailableResp maxAvailableResp, String str, xDM xdm) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(xdm, "");
                    producerScope.mo5769trySendJP2dKIU(new ResponseData<>(maxAvailableResp != null ? 0 : -1, null, null, null, maxAvailableResp, null, 46, null));
                }
            }));
            xCG xcg2 = this.this$0;
            this.L$0 = producerScope;
            this.label = 1;
            if (xcg2.copydefault(this) == objCopydefault) {
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
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final xCG xcg3 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.xCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AvailBalanceUseCase$doRetrieveFlowData$2.invokeSuspend$lambda$0(xcg3);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(xCG xcg) {
        xcg.AYXKKw();
        return Unit.INSTANCE;
    }
}
