package com.okinc.business.defi.wallet.custom;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C13924dbk;
import o.C16204efX;
import o.C16263egd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenViewModel$initTrigger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16204efX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenViewModel$initTrigger$1(C16204efX c16204efX, Continuation<? super CustomTokenViewModel$initTrigger$1> continuation) {
        super(2, continuation);
        this.this$0 = c16204efX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomTokenViewModel$initTrigger$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomTokenViewModel$initTrigger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowM7441catch = FlowKt.m7441catch(this.this$0.copydefault.OLrzqt(), new AnonymousClass1(this.this$0, null));
            final C16204efX c16204efX = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenViewModel$initTrigger$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<C13924dbk> list, Continuation<? super Unit> continuation) {
                    T next;
                    C13924dbk c13924dbk;
                    Object objEmit;
                    if (c16204efX.EZpvd == Long.MIN_VALUE) {
                        c13924dbk = (C13924dbk) CollectionsKt___CollectionsKt.firstOrNull(list);
                    } else {
                        C16204efX c16204efX2 = c16204efX;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((C13924dbk) next).OLrzqt().AEQbTJ() == c16204efX2.EZpvd) {
                                break;
                            }
                        }
                        c13924dbk = next;
                    }
                    return (c13924dbk == null || (objEmit = c16204efX.copydefault().emit(c13924dbk, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objEmit;
                }
            };
            this.label = 1;
            if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.CustomTokenViewModel$initTrigger$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends C13924dbk>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C16204efX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C16204efX c16204efX, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = c16204efX;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends C13924dbk>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<C13924dbk>>) flowCollector, th, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<C13924dbk>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = flowCollector;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C16263egd value;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                pUU.copydefault(">>>chain initTrigger error chainId:" + this.this$0.EZpvd + " - err:" + flowCollector);
                MutableStateFlow<C16263egd> mutableStateFlowEZpvd = this.this$0.EZpvd();
                do {
                    value = mutableStateFlowEZpvd.getValue();
                } while (!mutableStateFlowEZpvd.compareAndSet(value, C16263egd.copy$default(value, null, false, false, null, null, true, 31, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
