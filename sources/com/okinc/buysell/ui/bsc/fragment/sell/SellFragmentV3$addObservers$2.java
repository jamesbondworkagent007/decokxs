package com.okinc.buysell.ui.bsc.fragment.sell;

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
import o.lGL;
import o.yHT;

/* JADX INFO: loaded from: classes18.dex */
public final class SellFragmentV3$addObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellFragmentV3$addObservers$2(lGL lgl, Continuation<? super SellFragmentV3$addObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = lgl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellFragmentV3$addObservers$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SellFragmentV3$addObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$addObservers$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lGL this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lGL lgl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lgl;
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
                Flow flowCombine = FlowKt.combine(this.this$0.AwvSrB().hDKMBd(), this.this$0.AwvSrB().AxsJAYaxsJAY(), this.this$0.AwvSrB().gGvvIC(), new C03851(null));
                final lGL lgl = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3.addObservers.2.1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return KWHzl(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
                        if (lgl.isConnected().fJNWhG() != VerificationStatus.PRE_LOGIN) {
                            lGL.AEQbTJ(lgl).values.setEnabled(z);
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

        /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$addObservers$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03851 extends SuspendLambda implements yHT<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            /* synthetic */ boolean Z$2;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03851(Continuation<? super C03851> continuation) {
                super(4, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHT
            public /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Boolean> continuation) {
                C03851 c03851 = new C03851(continuation);
                c03851.Z$0 = z;
                c03851.Z$1 = z2;
                c03851.Z$2 = z3;
                return c03851.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(this.Z$0 && this.Z$1 && !this.Z$2);
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
            lGL lgl = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lgl, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lgl, state, anonymousClass1, this) == objCopydefault) {
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
