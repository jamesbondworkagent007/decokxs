package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C53739wrF;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.uLU;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$refreshInputSettings$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.Application $action;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$refreshInputSettings$2(C53826wsn c53826wsn, C53826wsn.StateListAnimator.Application application, Continuation<? super SignalCloneViewModel$refreshInputSettings$2> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneViewModel$refreshInputSettings$2(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneViewModel$refreshInputSettings$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                C53739wrF c53739wrF = (C53739wrF) ((uLU) this.this$0.EZpvd.getValue()).KWHzl();
                if (c53739wrF == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(C53739wrF.copy$default(c53739wrF, null, this.this$0.copydefault(this.$action.OLrzqt(), this.$action.KWHzl()), 1, null)));
                return Unit.INSTANCE;
            } catch (Exception e) {
                pUU.AEQbTJ("SignalCloneViewModel", "Failed to refresh input settings", e);
                throw e;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
