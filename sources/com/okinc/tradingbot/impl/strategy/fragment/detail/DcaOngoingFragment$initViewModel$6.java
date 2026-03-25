package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C43422row;
import o.C52179wBv;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes17.dex */
public final class DcaOngoingFragment$initViewModel$6 extends SuspendLambda implements Function2<DcaOngoingViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52179wBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaOngoingFragment$initViewModel$6(C52179wBv c52179wBv, Continuation<? super DcaOngoingFragment$initViewModel$6> continuation) {
        super(2, continuation);
        this.this$0 = c52179wBv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DcaOngoingFragment$initViewModel$6 dcaOngoingFragment$initViewModel$6 = new DcaOngoingFragment$initViewModel$6(this.this$0, continuation);
        dcaOngoingFragment$initViewModel$6.L$0 = obj;
        return dcaOngoingFragment$initViewModel$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DcaOngoingViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((DcaOngoingFragment$initViewModel$6) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            DcaOngoingViewModel.ActionBar actionBar = (DcaOngoingViewModel.ActionBar) this.L$0;
            if (actionBar instanceof DcaOngoingViewModel.ActionBar.Activity) {
                this.this$0.copydefault(((DcaOngoingViewModel.ActionBar.Activity) actionBar).OLrzqt());
            } else {
                if (!(actionBar instanceof DcaOngoingViewModel.ActionBar.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strCopydefault = ((DcaOngoingViewModel.ActionBar.StateListAnimator) actionBar).copydefault();
                if (strCopydefault == null) {
                    strCopydefault = C43422row.OLrzqt();
                }
                C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
