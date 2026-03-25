package com.okinc.unify_trade.core.usecase.todo;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.core.usecase.todo.BotAmtTaskUseCase$doRetrieveFlowData$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC55661xoE;
import o.AbstractC55706xox;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xCJ;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class BotAmtTaskUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<OrderPositionData>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xCJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAmtTaskUseCase$doRetrieveFlowData$2(xCJ xcj, Continuation<? super BotAmtTaskUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = xcj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotAmtTaskUseCase$doRetrieveFlowData$2 botAmtTaskUseCase$doRetrieveFlowData$2 = new BotAmtTaskUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        botAmtTaskUseCase$doRetrieveFlowData$2.L$0 = obj;
        return botAmtTaskUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<OrderPositionData>> producerScope, Continuation<? super Unit> continuation) {
        return ((BotAmtTaskUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            xCJ xcj = this.this$0;
            Object[] objArr = new Object[1];
            if (xcj.copydefault) {
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(System.currentTimeMillis()));
                final xCJ xcj2 = this.this$0;
                obj2 = new AbstractC55706xox(strGEmmrt) { // from class: com.okinc.unify_trade.core.usecase.todo.BotAmtTaskUseCase$doRetrieveFlowData$2.2
                    @Override // o.AbstractC55662xoF
                    public void KWHzl(OrderPositionData orderPositionData) {
                        Intrinsics.checkNotNullParameter(orderPositionData, "");
                        producerScope.mo5769trySendJP2dKIU(new ResponseData<>(0, null, null, null, orderPositionData, null, 46, null));
                    }
                };
            } else {
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.KWHzl(System.currentTimeMillis()));
                final xCJ xcj3 = this.this$0;
                obj2 = new AbstractC55661xoE(strGEmmrt2) { // from class: com.okinc.unify_trade.core.usecase.todo.BotAmtTaskUseCase$doRetrieveFlowData$2.1
                    @Override // o.AbstractC55662xoF
                    public void KWHzl(OrderPositionData orderPositionData) {
                        Intrinsics.checkNotNullParameter(orderPositionData, "");
                        producerScope.mo5769trySendJP2dKIU(new ResponseData<>(0, null, null, null, orderPositionData, null, 46, null));
                    }
                };
            }
            objArr[0] = obj2;
            xcj.OLrzqt(yDY.copydefault(objArr));
            xCJ xcj4 = this.this$0;
            this.L$0 = producerScope;
            this.label = 1;
            if (xcj4.copydefault(this) == objCopydefault) {
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
        final xCJ xcj5 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.xCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotAmtTaskUseCase$doRetrieveFlowData$2.invokeSuspend$lambda$0(xcj5);
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
    public static final Unit invokeSuspend$lambda$0(xCJ xcj) {
        xcj.AYXKKw();
        return Unit.INSTANCE;
    }
}
