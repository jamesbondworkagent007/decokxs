package com.okinc.coroutine;

import com.okinc.coroutine.SingleCustomShareFlow$collectData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.mAX;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
public final class SingleCustomShareFlow$collectData$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mAX<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCustomShareFlow$collectData$1(mAX<T> max, Continuation<? super SingleCustomShareFlow$collectData$1> continuation) {
        super(2, continuation);
        this.this$0 = max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SingleCustomShareFlow$collectData$1 singleCustomShareFlow$collectData$1 = new SingleCustomShareFlow$collectData$1(this.this$0, continuation);
        singleCustomShareFlow$collectData$1.L$0 = obj;
        return singleCustomShareFlow$collectData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((SingleCustomShareFlow$collectData$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            if (!this.this$0.OLrzqt.get()) {
                ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(this.this$0.AEQbTJ));
            } else {
                SharedFlow sharedFlow = this.this$0.EZpvd;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, producerScope, null);
                Intrinsics.copydefault(sharedFlow, "");
                Flow flowM7441catch = FlowKt.m7441catch(sharedFlow, anonymousClass1);
                final mAX<T> max = this.this$0;
                FlowCollector<? super T> flowCollector = new FlowCollector() { // from class: com.okinc.coroutine.SingleCustomShareFlow$collectData$1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        max.copydefault.resetReplayCache();
                        producerScope.mo5769trySendJP2dKIU(t);
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = producerScope;
                this.label = 1;
                if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
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
        final mAX<T> max2 = this.this$0;
        Function0 function0 = new Function0() { // from class: o.mAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SingleCustomShareFlow$collectData$1.invokeSuspend$lambda$0(max2);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.coroutine.SingleCustomShareFlow$collectData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<T> $$this$callbackFlow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ mAX<T> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(mAX<T> max, ProducerScope<? super T> producerScope, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = max;
            this.$$this$callbackFlow = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$callbackFlow, continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Throwable th = (Throwable) this.L$0;
                this.this$0.copydefault.resetReplayCache();
                this.$$this$callbackFlow.close(th);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(mAX max) {
        max.OLrzqt.set(false);
        return Unit.INSTANCE;
    }
}
