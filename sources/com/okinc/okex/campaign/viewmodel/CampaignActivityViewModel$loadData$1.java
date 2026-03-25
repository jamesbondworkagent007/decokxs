package com.okinc.okex.campaign.viewmodel;

import com.okinc.okex.campaign.viewmodel.CampaignActivityViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44848sef;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class CampaignActivityViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CampaignActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignActivityViewModel$loadData$1(CampaignActivityViewModel campaignActivityViewModel, Continuation<? super CampaignActivityViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = campaignActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CampaignActivityViewModel$loadData$1 campaignActivityViewModel$loadData$1 = new CampaignActivityViewModel$loadData$1(this.this$0, continuation);
        campaignActivityViewModel$loadData$1.L$0 = obj;
        return campaignActivityViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CampaignActivityViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CampaignActivityViewModel campaignActivityViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C44848sef c44848sef = campaignActivityViewModel.copydefault;
                this.label = 1;
                objAEQbTJ = c44848sef.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl((C44848sef.StateListAnimator) objAEQbTJ);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        CampaignActivityViewModel campaignActivityViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C44848sef.StateListAnimator stateListAnimator = (C44848sef.StateListAnimator) objM7377constructorimpl;
            campaignActivityViewModel2.KWHzl.tryEmit(new CampaignActivityViewModel.ActionBar.Application(stateListAnimator.EZpvd(), stateListAnimator.AEQbTJ(), stateListAnimator.OLrzqt()));
        }
        CampaignActivityViewModel campaignActivityViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            campaignActivityViewModel3.KWHzl.tryEmit(CampaignActivityViewModel.ActionBar.Activity.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
