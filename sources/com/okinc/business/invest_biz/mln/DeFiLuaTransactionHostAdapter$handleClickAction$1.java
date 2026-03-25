package com.okinc.business.invest_biz.mln;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26566jej;
import o.C56391yDq;
import o.C56442yFn;
import o.iNZ;

/* JADX INFO: loaded from: classes15.dex */
public final class DeFiLuaTransactionHostAdapter$handleClickAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductDetailsClickAction $action;
    int label;
    final /* synthetic */ iNZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaTransactionHostAdapter$handleClickAction$1(iNZ inz, ProductDetailsClickAction productDetailsClickAction, Continuation<? super DeFiLuaTransactionHostAdapter$handleClickAction$1> continuation) {
        super(2, continuation);
        this.this$0 = inz;
        this.$action = productDetailsClickAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaTransactionHostAdapter$handleClickAction$1(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaTransactionHostAdapter$handleClickAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26566jej c26566jej = this.this$0.EZpvd;
            if (c26566jej != null) {
                InvestAction investActionCopydefault = ((ProductDetailsClickAction.Activity) this.$action).copydefault();
                InvestUserRewardsAction investUserRewardsActionEZpvd = ((ProductDetailsClickAction.Activity) this.$action).EZpvd();
                RewardType rewardType = ((ProductDetailsClickAction.Activity) this.$action).OLrzqt().getRewardType();
                String callDataExtJson = ((ProductDetailsClickAction.Activity) this.$action).OLrzqt().getCallDataExtJson();
                List<InvestUserRewardElementInfo> listKWHzl = ((ProductDetailsClickAction.Activity) this.$action).KWHzl();
                boolean zAEQbTJ = ((ProductDetailsClickAction.Activity) this.$action).AEQbTJ();
                Long chainId = ((ProductDetailsClickAction.Activity) this.$action).OLrzqt().getChainId();
                this.label = 1;
                if (c26566jej.EZpvd(investActionCopydefault, investUserRewardsActionEZpvd, callDataExtJson, listKWHzl, rewardType, (3520 & 32) != 0 ? null : chainId, (3520 & 64) != 0 ? null : null, (3520 & 128) != 0 ? null : null, (3520 & 256) != 0 ? null : null, (3520 & 512) != 0 ? false : zAEQbTJ, (3520 & 1024) != 0 ? null : null, (3520 & 2048) != 0 ? null : null, this) == objCopydefault) {
                    return objCopydefault;
                }
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
