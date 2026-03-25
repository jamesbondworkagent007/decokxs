package com.okinc.business.invest_biz.app.serviceimpl;

import android.content.Context;
import com.okinc.business.invest_api.bean.Web3CampaignBean;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25483ixa;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$claimRewardByToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC25483ixa $claimCallback;
    final /* synthetic */ Web3RewardsClaimManager $claimManager;
    final /* synthetic */ Web3CampaignBean $claimRewardBean;
    final /* synthetic */ Context $host;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiImpl$claimRewardByToken$1(Web3RewardsClaimManager web3RewardsClaimManager, Context context, Web3CampaignBean web3CampaignBean, InterfaceC25483ixa interfaceC25483ixa, Continuation<? super InvestServiceApiImpl$claimRewardByToken$1> continuation) {
        super(2, continuation);
        this.$claimManager = web3RewardsClaimManager;
        this.$host = context;
        this.$claimRewardBean = web3CampaignBean;
        this.$claimCallback = interfaceC25483ixa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestServiceApiImpl$claimRewardByToken$1(this.$claimManager, this.$host, this.$claimRewardBean, this.$claimCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestServiceApiImpl$claimRewardByToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Web3RewardsClaimManager web3RewardsClaimManager = this.$claimManager;
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) this.$host;
            Web3CampaignBean web3CampaignBean = this.$claimRewardBean;
            InterfaceC25483ixa interfaceC25483ixa = this.$claimCallback;
            this.label = 1;
            if (web3RewardsClaimManager.AEQbTJ(abstractActivityC33041mov, web3CampaignBean, interfaceC25483ixa, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
