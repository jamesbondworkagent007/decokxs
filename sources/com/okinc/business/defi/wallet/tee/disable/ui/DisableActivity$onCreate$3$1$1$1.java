package com.okinc.business.defi.wallet.tee.disable.ui;

import androidx.compose.material3.TooltipKt;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC14702dqT;
import o.ActivityC17866fVe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DisableActivity$onCreate$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC14702dqT $this_apply;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ActivityC17866fVe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableActivity$onCreate$3$1$1$1(AbstractC14702dqT abstractC14702dqT, ActivityC17866fVe activityC17866fVe, Continuation<? super DisableActivity$onCreate$3$1$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC14702dqT;
        this.this$0 = activityC17866fVe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisableActivity$onCreate$3$1$1$1(this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisableActivity$onCreate$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC14702dqT abstractC14702dqT;
        ActivityC17866fVe activityC17866fVe;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                abstractC14702dqT = this.$this_apply;
                ActivityC17866fVe activityC17866fVe2 = this.this$0;
                Result.Application application = Result.Companion;
                this.L$0 = abstractC14702dqT;
                this.L$1 = activityC17866fVe2;
                this.label = 1;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == objCopydefault) {
                    return objCopydefault;
                }
                activityC17866fVe = activityC17866fVe2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activityC17866fVe = (ActivityC17866fVe) this.L$1;
                abstractC14702dqT = (AbstractC14702dqT) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            abstractC14702dqT.dismissAllowingStateLoss();
            activityC17866fVe.setResult(-1);
            activityC17866fVe.finish();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("error " + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
