package com.okinc.trade.manager.common.position;

import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58184ywW;

/* JADX INFO: loaded from: classes11.dex */
public final class TradePositionManager$checkInfoInstrument$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<OpenInterestData> $emit;
    final /* synthetic */ String $needsBizType;
    final /* synthetic */ AtomicInteger $reference;
    final /* synthetic */ OpenInterestData $resp;
    int label;
    final /* synthetic */ TradePositionManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePositionManager$checkInfoInstrument$1$1(TradePositionManager tradePositionManager, String str, AtomicInteger atomicInteger, InterfaceC58184ywW<OpenInterestData> interfaceC58184ywW, OpenInterestData openInterestData, Continuation<? super TradePositionManager$checkInfoInstrument$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tradePositionManager;
        this.$needsBizType = str;
        this.$reference = atomicInteger;
        this.$emit = interfaceC58184ywW;
        this.$resp = openInterestData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradePositionManager$checkInfoInstrument$1$1(this.this$0, this.$needsBizType, this.$reference, this.$emit, this.$resp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradePositionManager$checkInfoInstrument$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54582xNs c54582xNsAEQbTJ = this.this$0.AEQbTJ();
            String str = this.$needsBizType;
            this.label = 1;
            if (c54582xNsAEQbTJ.EZpvd(str, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$reference.decrementAndGet() == 0) {
            this.$emit.onNext(this.$resp);
        }
        return Unit.INSTANCE;
    }
}
