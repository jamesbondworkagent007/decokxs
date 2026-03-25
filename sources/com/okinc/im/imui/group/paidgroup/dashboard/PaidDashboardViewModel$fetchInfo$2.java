package com.okinc.im.imui.group.paidgroup.dashboard;

import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardViewModel;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C44268sJn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidDashboardViewModel$fetchInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaidDashboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidDashboardViewModel$fetchInfo$2(PaidDashboardViewModel paidDashboardViewModel, Continuation<? super PaidDashboardViewModel$fetchInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = paidDashboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaidDashboardViewModel$fetchInfo$2 paidDashboardViewModel$fetchInfo$2 = new PaidDashboardViewModel$fetchInfo$2(this.this$0, continuation);
        paidDashboardViewModel$fetchInfo$2.L$0 = obj;
        return paidDashboardViewModel$fetchInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaidDashboardViewModel$fetchInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        PaidDashboardViewModel paidDashboardViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            paidDashboardViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            C44268sJn c44268sJn = paidDashboardViewModel.AEQbTJ;
            long jValueOf = C33129mqd.valueOf(C56443yFo.KWHzl(paidDashboardViewModel.EZpvd()));
            this.L$0 = paidDashboardViewModel;
            this.label = 1;
            obj = c44268sJn.copydefault(jValueOf, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                PaidDashboardViewModel paidDashboardViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("PaidDashboardViewModel", "Unexpected error during fetch", thM7380exceptionOrNullimpl);
                    PaidDashboardViewModel.Activity.StateListAnimator stateListAnimator = PaidDashboardViewModel.Activity.StateListAnimator.EZpvd;
                    this.L$0 = objM7377constructorimpl;
                    this.label = 4;
                    if (paidDashboardViewModel2.AEQbTJ(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            paidDashboardViewModel = (PaidDashboardViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            pUU.copydefault("PaidDashboardViewModel", "API Error: " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
            PaidDashboardViewModel.Activity.StateListAnimator stateListAnimator2 = PaidDashboardViewModel.Activity.StateListAnimator.EZpvd;
            this.L$0 = null;
            this.label = 2;
            if (paidDashboardViewModel.AEQbTJ(stateListAnimator2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse = (PaidGroupTransactionsSummaryResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            pUU.EZpvd("PaidDashboardViewModel", "Transactions summary fetched successfully");
            PaidDashboardViewModel.Activity.TaskDescription taskDescription = new PaidDashboardViewModel.Activity.TaskDescription(paidGroupTransactionsSummaryResponse);
            this.L$0 = null;
            this.label = 3;
            if (paidDashboardViewModel.AEQbTJ(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        PaidDashboardViewModel paidDashboardViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
