package com.okinc.tradingbot.impl.strategy.view;

import com.okinc.tradingbot.impl.dto.ReduceResultVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48033uCm;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.wQD;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbReducePosBottomSheet$onCreateContent$2 extends SuspendLambda implements Function2<vNB<? extends ReduceResultVo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wQD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbReducePosBottomSheet$onCreateContent$2(wQD wqd, Continuation<? super SmartArbReducePosBottomSheet$onCreateContent$2> continuation) {
        super(2, continuation);
        this.this$0 = wqd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbReducePosBottomSheet$onCreateContent$2 smartArbReducePosBottomSheet$onCreateContent$2 = new SmartArbReducePosBottomSheet$onCreateContent$2(this.this$0, continuation);
        smartArbReducePosBottomSheet$onCreateContent$2.L$0 = obj;
        return smartArbReducePosBottomSheet$onCreateContent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends ReduceResultVo> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<ReduceResultVo>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<ReduceResultVo> vnb, Continuation<? super Unit> continuation) {
        return ((SmartArbReducePosBottomSheet$onCreateContent$2) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String message;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.TaskDescription) {
                C55326xho.toastWithSuccessfulIcon$default(C48033uCm.Fragment.resume, 0, 1, (Object) null);
                this.this$0.dismiss();
            } else if ((vnb instanceof vNB.StateListAnimator) && (message = ((vNB.StateListAnimator) vnb).AEQbTJ().getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
