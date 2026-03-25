package com.okinc.business.defi.wallet.tee.status;

import androidx.compose.material3.TooltipKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC14702dqT;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SASwitchTipSheet$onDismiss$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC14702dqT $this_apply;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SASwitchTipSheet$onDismiss$2$1(AbstractC14702dqT abstractC14702dqT, Continuation<? super SASwitchTipSheet$onDismiss$2$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC14702dqT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SASwitchTipSheet$onDismiss$2$1 sASwitchTipSheet$onDismiss$2$1 = new SASwitchTipSheet$onDismiss$2$1(this.$this_apply, continuation);
        sASwitchTipSheet$onDismiss$2$1.L$0 = obj;
        return sASwitchTipSheet$onDismiss$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SASwitchTipSheet$onDismiss$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC14702dqT abstractC14702dqT;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC14702dqT abstractC14702dqT2 = this.$this_apply;
                Result.Application application = Result.Companion;
                this.L$0 = abstractC14702dqT2;
                this.label = 1;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC14702dqT = abstractC14702dqT2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC14702dqT = (AbstractC14702dqT) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            abstractC14702dqT.dismissAllowingStateLoss();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.OLrzqt("SASwitchTipSheet fail " + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
