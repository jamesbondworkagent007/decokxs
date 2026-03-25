package com.okinc.business.defi.wallet.home.onboarding.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C18141fcm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18118fcP;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiOnboardingFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18141fcm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiOnboardingFragment$initView$1(C18141fcm c18141fcm, Continuation<? super DefiOnboardingFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c18141fcm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiOnboardingFragment$initView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiOnboardingFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$initView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C18141fcm this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18141fcm c18141fcm, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18141fcm;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$initView$1$1$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 implements FlowCollector, InterfaceC56514yIe {
            public final /* synthetic */ C18141fcm KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(C18141fcm c18141fcm) {
                this.KWHzl = c18141fcm;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof InterfaceC56514yIe)) {
                    return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
                }
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56514yIe
            public final InterfaceC56388yDn<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.KWHzl, C18141fcm.class, "handleUiState", "handleUiState(Lcom/okinc/business/defi/wallet/home/onboarding/ui/DefiOnboardingUiState;)V", 4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC18118fcP interfaceC18118fcP, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleUiState = AnonymousClass1.invokeSuspend$handleUiState(this.KWHzl, interfaceC18118fcP, continuation);
                return objInvokeSuspend$handleUiState == C56442yFn.copydefault() ? objInvokeSuspend$handleUiState : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC18118fcP> stateFlowOLrzqt = this.this$0.DbNXlk().OLrzqt();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (stateFlowOLrzqt.collect(anonymousClass2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleUiState(C18141fcm c18141fcm, InterfaceC18118fcP interfaceC18118fcP, Continuation continuation) {
            c18141fcm.AEQbTJ(interfaceC18118fcP);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18141fcm c18141fcm = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c18141fcm, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c18141fcm, state, anonymousClass1, this) == objCopydefault) {
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
