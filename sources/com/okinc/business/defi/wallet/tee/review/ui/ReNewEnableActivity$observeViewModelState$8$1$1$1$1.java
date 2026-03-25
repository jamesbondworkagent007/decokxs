package com.okinc.business.defi.wallet.tee.review.ui;

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
import o.C56391yDq;
import o.C56442yFn;
import o.fVE;
import o.fVU;
import o.fWX;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$8$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ fWX $notification;
    final /* synthetic */ AbstractC14702dqT $this_apply;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$8$1$1$1$1(AbstractC14702dqT abstractC14702dqT, fWX fwx, fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$8$1$1$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC14702dqT;
        this.$notification = fwx;
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$8$1$1$1$1(this.$this_apply, this.$notification, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$8$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        fWX fwx;
        AbstractC14702dqT abstractC14702dqT;
        fVU fvu;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC14702dqT abstractC14702dqT2 = this.$this_apply;
                fwx = this.$notification;
                fVU fvu2 = this.this$0;
                Result.Application application = Result.Companion;
                this.L$0 = abstractC14702dqT2;
                this.L$1 = fwx;
                this.L$2 = fvu2;
                this.label = 1;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC14702dqT = abstractC14702dqT2;
                fvu = fvu2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fvu = (fVU) this.L$2;
                fwx = (fWX) this.L$1;
                abstractC14702dqT = (AbstractC14702dqT) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            abstractC14702dqT.dismissAllowingStateLoss();
            fVE.Companion.EZpvd().EZpvd(fwx);
            fvu.setResult(-1);
            fvu.finish();
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
