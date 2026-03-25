package com.okinc.unify_trade.trade.source.task;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C43296rmc;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.xTG;

/* JADX INFO: loaded from: classes12.dex */
public final class WatchSourceTask$createCountDownListener$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Triple<Long, String, String> $it;
    int label;
    final /* synthetic */ xTG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchSourceTask$createCountDownListener$1$1$1(Triple<Long, String, String> triple, xTG xtg, Continuation<? super WatchSourceTask$createCountDownListener$1$1$1> continuation) {
        super(2, continuation);
        this.$it = triple;
        this.this$0 = xtg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchSourceTask$createCountDownListener$1$1$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchSourceTask$createCountDownListener$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jLongValue = this.$it.getFirst().longValue();
            this.label = 1;
            if (DelayKt.delay(jLongValue, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl((List<String>) C56402yEa.EZpvd(this.$it.getSecond()), (AtomicInteger) null);
                this.this$0.copydefault((List<String>) C56402yEa.EZpvd(this.$it.getThird()), (AtomicInteger) null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C43296rmc.EZpvd(this.this$0.KWHzl, "createCountDownListener:  触发 " + this.$it.getFirst());
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.KWHzl((List<String>) C56402yEa.EZpvd(this.$it.getSecond()), (AtomicInteger) null);
        this.this$0.copydefault((List<String>) C56402yEa.EZpvd(this.$it.getThird()), (AtomicInteger) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.trade.source.task.WatchSourceTask$createCountDownListener$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ xTG this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xTG xtg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = xtg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C43296rmc.EZpvd(this.this$0.KWHzl, "createCountDownListener:  更新");
                this.this$0.valueOf();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
