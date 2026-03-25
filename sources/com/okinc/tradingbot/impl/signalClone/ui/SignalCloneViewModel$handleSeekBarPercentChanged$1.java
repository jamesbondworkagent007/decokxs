package com.okinc.tradingbot.impl.signalClone.ui;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C53739wrF;
import o.C53740wrG;
import o.C53743wrJ;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.uLU;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$handleSeekBarPercentChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.PendingIntent $action;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$handleSeekBarPercentChanged$1(C53826wsn c53826wsn, C53826wsn.StateListAnimator.PendingIntent pendingIntent, Continuation<? super SignalCloneViewModel$handleSeekBarPercentChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = pendingIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneViewModel$handleSeekBarPercentChanged$1(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneViewModel$handleSeekBarPercentChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        BigDecimal bigDecimalEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C53739wrF c53739wrF = (C53739wrF) ((uLU) this.this$0.EZpvd.getValue()).KWHzl();
            if (c53739wrF == null) {
                return Unit.INSTANCE;
            }
            C53740wrG c53740wrG = (C53740wrG) ((uLU) this.this$0.OLrzqt.getValue()).KWHzl();
            if (c53740wrG == null || (strCopydefault = c53740wrG.copydefault()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strCopydefault)) == null) {
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd.setValue(uLU.Companion.AEQbTJ(C53739wrF.copy$default(c53739wrF, null, C53743wrJ.copy$default(c53739wrF.KWHzl(), null, 0, C33129mqd.mulS$default(bigDecimalEZpvd, C56443yFo.OLrzqt(this.$action.KWHzl()), null, null, null, 14, null), null, null, this.$action.KWHzl(), 27, null), 1, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
