package com.okinc.business.dex.trade.core.domain.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
public final class TradeStrategyHandlerKt$pollInternal$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ long $intervalMs;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeStrategyHandlerKt$pollInternal$1(Function1<? super Continuation<? super T>, ? extends Object> function1, long j, Continuation<? super TradeStrategyHandlerKt$pollInternal$1> continuation) {
        super(2, continuation);
        this.$block = function1;
        this.$intervalMs = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeStrategyHandlerKt$pollInternal$1 tradeStrategyHandlerKt$pollInternal$1 = new TradeStrategyHandlerKt$pollInternal$1(this.$block, this.$intervalMs, continuation);
        tradeStrategyHandlerKt$pollInternal$1.L$0 = obj;
        return tradeStrategyHandlerKt$pollInternal$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((TradeStrategyHandlerKt$pollInternal$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:13:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        long j;
        FlowCollector flowCollector2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
        } else if (i == 1) {
            FlowCollector flowCollector3 = (FlowCollector) this.L$1;
            FlowCollector flowCollector4 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            flowCollector2 = flowCollector3;
            flowCollector = flowCollector4;
            this.L$0 = flowCollector;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector2.emit(obj, this) == objCopydefault) {
                return objCopydefault;
            }
            j = this.$intervalMs;
            this.L$0 = flowCollector;
            this.label = 3;
            if (DelayKt.delay(j, this) == objCopydefault) {
            }
        } else if (i == 2) {
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            j = this.$intervalMs;
            this.L$0 = flowCollector;
            this.label = 3;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function1<Continuation<? super T>, Object> function1 = this.$block;
        this.L$0 = flowCollector;
        this.L$1 = flowCollector;
        this.label = 1;
        obj = function1.invoke(this);
        if (obj != objCopydefault) {
            return objCopydefault;
        }
        flowCollector2 = flowCollector;
        this.L$0 = flowCollector;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector2.emit(obj, this) == objCopydefault) {
        }
        j = this.$intervalMs;
        this.L$0 = flowCollector;
        this.label = 3;
        if (DelayKt.delay(j, this) == objCopydefault) {
        }
        Function1<Continuation<? super T>, Object> function12 = this.$block;
        this.L$0 = flowCollector;
        this.L$1 = flowCollector;
        this.label = 1;
        obj = function12.invoke(this);
        if (obj != objCopydefault) {
        }
    }
}
