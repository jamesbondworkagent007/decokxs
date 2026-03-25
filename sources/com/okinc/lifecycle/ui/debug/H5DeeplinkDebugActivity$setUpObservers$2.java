package com.okinc.lifecycle.ui.debug;

import android.view.View;
import com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$setUpObservers$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC38177pPb;
import o.ActivityC38178pPc;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes19.dex */
public final class H5DeeplinkDebugActivity$setUpObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC38178pPc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5DeeplinkDebugActivity$setUpObservers$2(ActivityC38178pPc activityC38178pPc, Continuation<? super H5DeeplinkDebugActivity$setUpObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC38178pPc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new H5DeeplinkDebugActivity$setUpObservers$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((H5DeeplinkDebugActivity$setUpObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.lifecycle.ui.debug.H5DeeplinkDebugActivity$setUpObservers$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC38177pPb, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC38178pPc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC38178pPc activityC38178pPc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC38178pPc;
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
        public final Object invoke(AbstractC38177pPb abstractC38177pPb, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC38177pPb, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final AbstractC38177pPb abstractC38177pPb = (AbstractC38177pPb) this.L$0;
                if (abstractC38177pPb instanceof AbstractC38177pPb.ActionBar) {
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
                    final ActivityC38178pPc activityC38178pPc = this.this$0;
                    viewOnClickListenerC54939xaY.EZpvd("Deeplink extracted successfully! Deeplink: " + ((AbstractC38177pPb.ActionBar) abstractC38177pPb).EZpvd());
                    viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "Proceed", new View.OnClickListener() { // from class: o.pPn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            H5DeeplinkDebugActivity$setUpObservers$2.AnonymousClass1.invokeSuspend$lambda$2$lambda$0(activityC38178pPc, abstractC38177pPb, viewOnClickListenerC54939xaY, view);
                        }
                    });
                    viewOnClickListenerC54939xaY.AEQbTJ("Cancel", new View.OnClickListener() { // from class: o.pPj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            viewOnClickListenerC54939xaY.dismiss();
                        }
                    });
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                } else if (abstractC38177pPb instanceof AbstractC38177pPb.Application) {
                    this.this$0.EZpvd().KWHzl(this.this$0, ((AbstractC38177pPb.Application) abstractC38177pPb).OLrzqt());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$0(ActivityC38178pPc activityC38178pPc, AbstractC38177pPb abstractC38177pPb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
            activityC38178pPc.EZpvd().KWHzl(activityC38178pPc, (AbstractC38177pPb.ActionBar) abstractC38177pPb);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC38177pPb> stateFlowAEQbTJ = this.this$0.EZpvd().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
