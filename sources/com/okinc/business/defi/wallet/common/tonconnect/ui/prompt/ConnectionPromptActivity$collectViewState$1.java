package com.okinc.business.defi.wallet.common.tonconnect.ui.prompt;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.ActivityC16023ecB;
import o.C16026ecE;
import o.C33134mqi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ConnectionPromptActivity$collectViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC16023ecB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPromptActivity$collectViewState$1(ActivityC16023ecB activityC16023ecB, Continuation<? super ConnectionPromptActivity$collectViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC16023ecB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionPromptActivity$collectViewState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectionPromptActivity$collectViewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.tonconnect.ui.prompt.ConnectionPromptActivity$collectViewState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC16023ecB this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC16023ecB activityC16023ecB, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC16023ecB;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.tonconnect.ui.prompt.ConnectionPromptActivity$collectViewState$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02541 extends SuspendLambda implements Function2<C16026ecE, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC16023ecB this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02541(ActivityC16023ecB activityC16023ecB, Continuation<? super C02541> continuation) {
                super(2, continuation);
                this.this$0 = activityC16023ecB;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02541 c02541 = new C02541(this.this$0, continuation);
                c02541.L$0 = obj;
                return c02541;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C16026ecE c16026ecE, Continuation<? super Unit> continuation) {
                return ((C02541) create(c16026ecE, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C16026ecE c16026ecE = (C16026ecE) this.L$0;
                    if (c16026ecE.EZpvd()) {
                        this.this$0.OLrzqt();
                        return Unit.INSTANCE;
                    }
                    Integer numOLrzqt = c16026ecE.OLrzqt();
                    if (numOLrzqt != null && numOLrzqt.intValue() == 0) {
                        ActivityC16023ecB activityC16023ecB = this.this$0;
                        String strValueOf = c16026ecE.valueOf();
                        CharSequence charSequenceValues = c16026ecE.values();
                        AbstractC12782ctV abstractC12782ctVIsConnected = c16026ecE.isConnected();
                        activityC16023ecB.EZpvd(strValueOf, charSequenceValues, abstractC12782ctVIsConnected != null ? abstractC12782ctVIsConnected.AEQbTJ() : null, c16026ecE.copydefault(), c16026ecE.AhwBna(), c16026ecE.gEmmrt(), c16026ecE.fetchVPNInfo(), c16026ecE.KWHzl());
                    } else if (numOLrzqt != null && numOLrzqt.intValue() == 1) {
                        this.this$0.EZpvd(c16026ecE.AhwBna());
                    } else if ((numOLrzqt != null && numOLrzqt.intValue() == 2) || ((numOLrzqt != null && numOLrzqt.intValue() == 6) || (numOLrzqt != null && numOLrzqt.intValue() == 5))) {
                        String strDjBIcL = c16026ecE.djBIcL();
                        if (strDjBIcL != null) {
                            C33134mqi.AEQbTJ(strDjBIcL);
                        }
                        this.this$0.finish();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C16026ecE> stateFlowKWHzl = this.this$0.copydefault().KWHzl();
                C02541 c02541 = new C02541(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowKWHzl, c02541, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC16023ecB activityC16023ecB = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC16023ecB, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC16023ecB, state, anonymousClass1, this) == objCopydefault) {
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
