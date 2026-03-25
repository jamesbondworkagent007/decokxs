package com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26356jal;
import o.C26566jej;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiUnifiedRewardsBottomSheet$onClaimToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C26356jal $section;
    final /* synthetic */ InvestUserRewardElementInfo $token;
    int label;
    final /* synthetic */ DeFiUnifiedRewardsBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiUnifiedRewardsBottomSheet$onClaimToken$1(DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheet, C26356jal c26356jal, InvestUserRewardElementInfo investUserRewardElementInfo, Continuation<? super DeFiUnifiedRewardsBottomSheet$onClaimToken$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiUnifiedRewardsBottomSheet;
        this.$section = c26356jal;
        this.$token = investUserRewardElementInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiUnifiedRewardsBottomSheet$onClaimToken$1(this.this$0, this.$section, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiUnifiedRewardsBottomSheet$onClaimToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26566jej c26566jej = this.this$0.KWHzl;
            if (c26566jej != null) {
                InvestAction investActionOLrzqt = this.$section.OLrzqt();
                InvestUserRewardsAction investUserRewardsActionCopydefault = this.$section.copydefault();
                RewardType rewardTypeAhwBna = this.$section.AhwBna();
                String strEZpvd = this.$section.EZpvd();
                List listEZpvd = C56402yEa.EZpvd(this.$token);
                long jKWHzl = this.$section.KWHzl();
                long jValueOf = this.$section.valueOf();
                String strDjBIcL = this.$section.djBIcL();
                InvestmentKind investmentKindAYXKKw = this.$section.AYXKKw();
                Long lKWHzl = C56443yFo.KWHzl(jKWHzl);
                Long lKWHzl2 = C56443yFo.KWHzl(jValueOf);
                Function0 function0 = new Function0() { // from class: o.jah
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c26566jej.EZpvd(investActionOLrzqt, investUserRewardsActionCopydefault, strEZpvd, listEZpvd, rewardTypeAhwBna, (3520 & 32) != 0 ? null : lKWHzl, (3520 & 64) != 0 ? null : lKWHzl2, (3520 & 128) != 0 ? null : strDjBIcL, (3520 & 256) != 0 ? null : investmentKindAYXKKw, (3520 & 512) != 0 ? false : false, (3520 & 1024) != 0 ? null : null, (3520 & 2048) != 0 ? null : function0, this) == objCopydefault) {
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
