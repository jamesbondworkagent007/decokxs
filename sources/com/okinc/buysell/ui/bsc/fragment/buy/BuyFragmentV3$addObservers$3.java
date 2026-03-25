package com.okinc.buysell.ui.bsc.fragment.buy;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lEN;
import o.yHT;

/* JADX INFO: loaded from: classes18.dex */
public final class BuyFragmentV3$addObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lEN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFragmentV3$addObservers$3(lEN len, Continuation<? super BuyFragmentV3$addObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = len;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyFragmentV3$addObservers$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyFragmentV3$addObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$addObservers$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lEN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lEN len, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = len;
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
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(this.this$0.sSMYrx().hDKMBd(), this.this$0.sSMYrx().AxsJAYaxsJAY(), this.this$0.sSMYrx().gGvvIC(), new C03841(this.this$0, null));
                final lEN len = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3.addObservers.3.1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return KWHzl(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
                        if (len.isConnected().fJNWhG() != VerificationStatus.PRE_LOGIN) {
                            lEN.EZpvd(len).iwGUEr.setEnabled(z);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$addObservers$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03841 extends SuspendLambda implements yHT<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            /* synthetic */ boolean Z$2;
            int label;
            final /* synthetic */ lEN this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03841(lEN len, Continuation<? super C03841> continuation) {
                super(4, continuation);
                this.this$0 = len;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHT
            public /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Boolean> continuation) {
                C03841 c03841 = new C03841(this.this$0, continuation);
                c03841.Z$0 = z;
                c03841.Z$1 = z2;
                c03841.Z$2 = z3;
                return c03841.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(this.this$0.sSMYrx().RlQdEF() || (this.Z$0 && this.Z$1 && !this.Z$2));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lEN len = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(len, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(len, state, anonymousClass1, this) == objCopydefault) {
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
}
