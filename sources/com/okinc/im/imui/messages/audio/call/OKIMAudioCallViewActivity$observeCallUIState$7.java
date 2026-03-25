package com.okinc.im.imui.messages.audio.call;

import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C44124sEe;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMAudioCallViewActivity$observeCallUIState$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OKIMAudioCallViewActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallViewActivity$observeCallUIState$7(OKIMAudioCallViewActivity oKIMAudioCallViewActivity, Continuation<? super OKIMAudioCallViewActivity$observeCallUIState$7> continuation) {
        super(2, continuation);
        this.this$0 = oKIMAudioCallViewActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMAudioCallViewActivity$observeCallUIState$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallViewActivity$observeCallUIState$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity$observeCallUIState$7$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OKIMAudioCallViewModel.Application, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OKIMAudioCallViewModel.Application application, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                OKIMAudioCallViewModel.Application application = (OKIMAudioCallViewModel.Application) this.L$0;
                if (application instanceof OKIMAudioCallViewModel.Application.C0465Application) {
                    C44124sEe.imLogVoiceCall$default("service_activity: ring members success", null, 2, null);
                } else {
                    if (!(application instanceof OKIMAudioCallViewModel.Application.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OKIMAudioCallViewModel.Application.TaskDescription taskDescription = (OKIMAudioCallViewModel.Application.TaskDescription) application;
                    C55326xho.OLrzqt("Failed to ring members: " + taskDescription.OLrzqt().getMessage());
                    C44124sEe.imLogVoiceCall$default("service_activity: ring members failed - " + taskDescription.OLrzqt().getMessage(), null, 2, null);
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
            SharedFlow<OKIMAudioCallViewModel.Application> sharedFlowFARcdN = this.this$0.gEmmrt().fARcdN();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowFARcdN, anonymousClass1, this) == objCopydefault) {
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
