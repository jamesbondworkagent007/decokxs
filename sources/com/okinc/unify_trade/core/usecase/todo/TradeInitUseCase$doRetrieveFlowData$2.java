package com.okinc.unify_trade.core.usecase.todo;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.core.usecase.todo.TradeInitUseCase$doRetrieveFlowData$2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C54315xDw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeInitUseCase$doRetrieveFlowData$2 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<Boolean>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54315xDw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeInitUseCase$doRetrieveFlowData$2(C54315xDw c54315xDw, Continuation<? super TradeInitUseCase$doRetrieveFlowData$2> continuation) {
        super(2, continuation);
        this.this$0 = c54315xDw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeInitUseCase$doRetrieveFlowData$2 tradeInitUseCase$doRetrieveFlowData$2 = new TradeInitUseCase$doRetrieveFlowData$2(this.this$0, continuation);
        tradeInitUseCase$doRetrieveFlowData$2.L$0 = obj;
        return tradeInitUseCase$doRetrieveFlowData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<Boolean>> producerScope, Continuation<? super Unit> continuation) {
        return ((TradeInitUseCase$doRetrieveFlowData$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            List list = this.this$0.KWHzl;
            List list2 = null;
            if (list == null) {
                Intrinsics.gEmmrt("");
                list = null;
            }
            if (!list.isEmpty()) {
                List list3 = this.this$0.KWHzl;
                if (list3 == null) {
                    Intrinsics.gEmmrt("");
                    list3 = null;
                }
                AtomicInteger atomicInteger = new AtomicInteger(list3.size());
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                List list4 = this.this$0.KWHzl;
                if (list4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    list2 = list4;
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new TradeInitUseCase$doRetrieveFlowData$2$1$1((String) it.next(), booleanRef, atomicInteger, producerScope, null), 3, null);
                }
            } else {
                pUU.EZpvd("TradeInitUseCase", "初始化列表为空，默认初始化成功！！！");
                ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(new ResponseData(0, null, null, null, C56443yFo.KWHzl(true), null, 46, null)));
            }
            final C54315xDw c54315xDw = this.this$0;
            Function0 function0 = new Function0() { // from class: o.xDv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TradeInitUseCase$doRetrieveFlowData$2.invokeSuspend$lambda$1(c54315xDw);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C54315xDw c54315xDw) {
        c54315xDw.AYXKKw();
        return Unit.INSTANCE;
    }
}
