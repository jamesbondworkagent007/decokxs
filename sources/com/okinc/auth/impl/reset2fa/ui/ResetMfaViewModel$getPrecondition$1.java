package com.okinc.auth.impl.reset2fa.ui;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6623aSo;

/* JADX INFO: loaded from: classes23.dex */
public final class ResetMfaViewModel$getPrecondition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ResetMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaViewModel$getPrecondition$1(ResetMfaViewModel resetMfaViewModel, Continuation<? super ResetMfaViewModel$getPrecondition$1> continuation) {
        super(2, continuation);
        this.this$0 = resetMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetMfaViewModel$getPrecondition$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaViewModel$getPrecondition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(true)));
            RebindMfaEntryPoint rebindMfaEntryPoint = this.this$0.isConnected;
            if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.ForgetPassword) {
                FlowKt.launchIn(FlowKt.onEach(this.this$0.zLjUOn.AEQbTJ(String.valueOf(((RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPoint).getToken()), this.this$0.isConnected()), new AnonymousClass1(this.this$0, null)), ViewModelKt.getViewModelScope(this.this$0));
            } else {
                FlowKt.launchIn(FlowKt.onEach(this.this$0.zLjUOn.copydefault(this.this$0.isConnected()), new AnonymousClass2(this.this$0, null)), ViewModelKt.getViewModelScope(this.this$0));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel$getPrecondition$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6623aSo.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ResetMfaViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ResetMfaViewModel resetMfaViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = resetMfaViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6623aSo.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault((C6623aSo.StateListAnimator) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel$getPrecondition$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<C6623aSo.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ResetMfaViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ResetMfaViewModel resetMfaViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = resetMfaViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6623aSo.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault((C6623aSo.StateListAnimator) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
