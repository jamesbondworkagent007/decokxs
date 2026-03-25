package com.okinc.okimcore.channel.inhouse.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44499sSb;
import o.C56391yDq;
import o.C56442yFn;
import o.sEA;
import o.sGC;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMUtilityImpl$leaveLiveStream$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sGC $callback;
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ sEA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMUtilityImpl$leaveLiveStream$1(sEA sea, String str, sGC sgc, Continuation<? super InHouseIMUtilityImpl$leaveLiveStream$1> continuation) {
        super(2, continuation);
        this.this$0 = sea;
        this.$channelId = str;
        this.$callback = sgc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMUtilityImpl$leaveLiveStream$1(this.this$0, this.$channelId, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMUtilityImpl$leaveLiveStream$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowOnEach = FlowKt.onEach(this.this$0.copydefault.OLrzqt().EZpvd(this.$channelId), new AnonymousClass1(this.$callback, null));
            this.label = 1;
            if (FlowKt.collect(flowOnEach, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMUtilityImpl$leaveLiveStream$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C44499sSb.TaskDescription, Continuation<? super Unit>, Object> {
        final /* synthetic */ sGC $callback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sGC sgc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = sgc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C44499sSb.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C44499sSb.TaskDescription taskDescription = (C44499sSb.TaskDescription) this.L$0;
                if (taskDescription instanceof C44499sSb.TaskDescription.Application) {
                    sGC sgc = this.$callback;
                    if (sgc != null) {
                        sgc.copydefault();
                    }
                } else {
                    if (!(taskDescription instanceof C44499sSb.TaskDescription.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sGC sgc2 = this.$callback;
                    if (sgc2 != null) {
                        sgc2.AEQbTJ();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
