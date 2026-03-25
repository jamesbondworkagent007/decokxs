package com.okinc.business.dex.trade.component.orderandposition.position.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class ThrottleLatestKt$throttleLatest$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<T> $$this$channelFlow;
    final /* synthetic */ Ref.ObjectRef<Job> $emitJob;
    final /* synthetic */ Ref.LongRef $lastEmitTime;
    final /* synthetic */ Ref.ObjectRef<T> $pendingValue;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeSinceLastEmit;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super T> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThrottleLatestKt$throttleLatest$1$1$1(long j, long j2, Ref.ObjectRef<T> objectRef, Ref.ObjectRef<Job> objectRef2, ProducerScope<? super T> producerScope, Ref.LongRef longRef, Continuation<? super ThrottleLatestKt$throttleLatest$1$1$1> continuation) {
        super(2, continuation);
        this.$periodMillis = j;
        this.$timeSinceLastEmit = j2;
        this.$pendingValue = objectRef;
        this.$emitJob = objectRef2;
        this.$$this$channelFlow = producerScope;
        this.$lastEmitTime = longRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThrottleLatestKt$throttleLatest$1$1$1(this.$periodMillis, this.$timeSinceLastEmit, this.$pendingValue, this.$emitJob, this.$$this$channelFlow, this.$lastEmitTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ThrottleLatestKt$throttleLatest$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.LongRef longRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$periodMillis;
            long j2 = this.$timeSinceLastEmit;
            this.label = 1;
            if (DelayKt.delay(j - j2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                longRef.element = System.currentTimeMillis();
                this.$pendingValue.element = null;
                this.$emitJob.element = null;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        T t = this.$pendingValue.element;
        if (t != 0) {
            SendChannel sendChannel = this.$$this$channelFlow;
            Ref.LongRef longRef2 = this.$lastEmitTime;
            this.L$0 = longRef2;
            this.label = 2;
            if (sendChannel.send(t, this) == objCopydefault) {
                return objCopydefault;
            }
            longRef = longRef2;
            longRef.element = System.currentTimeMillis();
        }
        this.$pendingValue.element = null;
        this.$emitJob.element = null;
        return Unit.INSTANCE;
    }
}
