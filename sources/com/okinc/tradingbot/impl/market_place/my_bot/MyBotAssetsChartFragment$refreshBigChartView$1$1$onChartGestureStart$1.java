package com.okinc.tradingbot.impl.market_place.my_bot;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C48565uWc;
import o.C51685vrg;
import o.C56391yDq;
import o.C56405yEd;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C48565uWc $this_run;
    Object L$0;
    int label;
    final /* synthetic */ C51685vrg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1(C48565uWc c48565uWc, C51685vrg c51685vrg, Continuation<? super MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1> continuation) {
        super(2, continuation);
        this.$this_run = c48565uWc;
        this.this$0 = c51685vrg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1(this.$this_run, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.$this_run.djBIcL.copydefault((List<String>) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.market_place.my_bot.MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<String>> $timeList;
        int label;
        final /* synthetic */ C51685vrg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<String>> objectRef, C51685vrg c51685vrg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timeList = objectRef;
            this.this$0 = c51685vrg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$timeList, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$timeList.element = C51685vrg.KWHzl(this.this$0).AEQbTJ(C56405yEd.hDKMBd(C51685vrg.KWHzl(this.this$0).valueOf()), C51685vrg.KWHzl(this.this$0).OLrzqt());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
