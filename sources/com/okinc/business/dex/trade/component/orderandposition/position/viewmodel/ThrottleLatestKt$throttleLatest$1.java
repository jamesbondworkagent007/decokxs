package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
public final class ThrottleLatestKt$throttleLatest$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ Flow<T> $this_throttleLatest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThrottleLatestKt$throttleLatest$1(Flow<? extends T> flow, long j, Continuation<? super ThrottleLatestKt$throttleLatest$1> continuation) {
        super(2, continuation);
        this.$this_throttleLatest = flow;
        this.$periodMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThrottleLatestKt$throttleLatest$1 throttleLatestKt$throttleLatest$1 = new ThrottleLatestKt$throttleLatest$1(this.$this_throttleLatest, this.$periodMillis, continuation);
        throttleLatestKt$throttleLatest$1.L$0 = obj;
        return throttleLatestKt$throttleLatest$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((ThrottleLatestKt$throttleLatest$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Flow<T> flow = this.$this_throttleLatest;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(longRef, this.$periodMillis, producerScope, objectRef, objectRef2);
            this.label = 1;
            if (flow.collect(anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.ThrottleLatestKt$throttleLatest$1$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector {
        public final /* synthetic */ ProducerScope<T> AEQbTJ;
        public final /* synthetic */ Ref.LongRef EZpvd;
        public final /* synthetic */ Ref.ObjectRef<Job> KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Ref.ObjectRef<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Ref.LongRef longRef, long j, ProducerScope<? super T> producerScope, Ref.ObjectRef<T> objectRef, Ref.ObjectRef<Job> objectRef2) {
            this.EZpvd = longRef;
            this.OLrzqt = j;
            this.AEQbTJ = producerScope;
            this.copydefault = objectRef;
            this.KWHzl = objectRef2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
            ThrottleLatestKt$throttleLatest$1$1$emit$1 throttleLatestKt$throttleLatest$1$1$emit$1;
            AnonymousClass3<T> anonymousClass3;
            long j;
            if (continuation instanceof ThrottleLatestKt$throttleLatest$1$1$emit$1) {
                throttleLatestKt$throttleLatest$1$1$emit$1 = (ThrottleLatestKt$throttleLatest$1$1$emit$1) continuation;
                int i = throttleLatestKt$throttleLatest$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    throttleLatestKt$throttleLatest$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    throttleLatestKt$throttleLatest$1$1$emit$1 = new ThrottleLatestKt$throttleLatest$1$1$emit$1(this, continuation);
                }
            }
            Object obj = throttleLatestKt$throttleLatest$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = throttleLatestKt$throttleLatest$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ref.LongRef longRef = this.EZpvd;
                long j2 = jCurrentTimeMillis - longRef.element;
                long j3 = this.OLrzqt;
                if (j2 >= j3) {
                    ProducerScope<T> producerScope = this.AEQbTJ;
                    throttleLatestKt$throttleLatest$1$1$emit$1.L$0 = this;
                    throttleLatestKt$throttleLatest$1$1$emit$1.J$0 = jCurrentTimeMillis;
                    throttleLatestKt$throttleLatest$1$1$emit$1.label = 1;
                    if (producerScope.send(t, throttleLatestKt$throttleLatest$1$1$emit$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass3 = this;
                    j = jCurrentTimeMillis;
                } else {
                    Ref.ObjectRef<T> objectRef = this.copydefault;
                    objectRef.element = t;
                    Ref.ObjectRef<Job> objectRef2 = this.KWHzl;
                    if (objectRef2.element == null) {
                        ProducerScope<T> producerScope2 = this.AEQbTJ;
                        objectRef2.element = (T) BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new ThrottleLatestKt$throttleLatest$1$1$1(j3, j2, objectRef, objectRef2, producerScope2, longRef, null), 3, null);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = throttleLatestKt$throttleLatest$1$1$emit$1.J$0;
                anonymousClass3 = (AnonymousClass3) throttleLatestKt$throttleLatest$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            anonymousClass3.EZpvd.element = j;
            anonymousClass3.copydefault.element = null;
            Job job = anonymousClass3.KWHzl.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            anonymousClass3.KWHzl.element = null;
            return Unit.INSTANCE;
        }
    }
}
