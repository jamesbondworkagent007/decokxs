package com.okinc.buysell.ui.bsc.fragment.buy;

import com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.lyN;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyViewModel$fetchCampaignInfoIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyViewModel$fetchCampaignInfoIfNeeded$1(BuyViewModel buyViewModel, Continuation<? super BuyViewModel$fetchCampaignInfoIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = buyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyViewModel$fetchCampaignInfoIfNeeded$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyViewModel$fetchCampaignInfoIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyN lyn = this.this$0.QkdxfA;
            this.label = 1;
            obj = lyn.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BuyViewModel buyViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            mHA.OLrzqt.OLrzqt(buyViewModel.AxsJAYsNCnLh, (CampaignBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C33129mqd.gEmmrt(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
        }
        return Unit.INSTANCE;
    }
}
