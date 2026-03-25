package com.okinc.unify_trade.trade.source.task;

import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.xTG;

/* JADX INFO: loaded from: classes12.dex */
public final class WatchSourceTask$createCountDownListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Triple<Long, String, String>> $countDownInfoList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xTG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchSourceTask$createCountDownListener$1(List<Triple<Long, String, String>> list, xTG xtg, Continuation<? super WatchSourceTask$createCountDownListener$1> continuation) {
        super(2, continuation);
        this.$countDownInfoList = list;
        this.this$0 = xtg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WatchSourceTask$createCountDownListener$1 watchSourceTask$createCountDownListener$1 = new WatchSourceTask$createCountDownListener$1(this.$countDownInfoList, this.this$0, continuation);
        watchSourceTask$createCountDownListener$1.L$0 = obj;
        return watchSourceTask$createCountDownListener$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchSourceTask$createCountDownListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                List<Triple<Long, String, String>> list = this.$countDownInfoList;
                xTG xtg = this.this$0;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WatchSourceTask$createCountDownListener$1$1$1((Triple) it.next(), xtg, null), 3, null);
                }
            } catch (Throwable th) {
                pUU.AEQbTJ("WatchSourceTask", "start count down job failed", th);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
