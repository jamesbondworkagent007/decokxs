package com.okinc.business.market.features.address_tracker_sa.domain;

import com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import o.C25667jBx;
import o.C56391yDq;
import o.C56442yFn;
import o.jBB;
import o.jBD;
import o.jBH;
import o.jBZ;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardUseCase$subscribeLeaderBoardCards$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends jBB>>, Object> {
    final /* synthetic */ jBH $groupFilter;
    final /* synthetic */ String $userWalletAddress;
    int label;
    final /* synthetic */ jBD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardUseCase$subscribeLeaderBoardCards$2(jBD jbd, jBH jbh, String str, Continuation<? super LeaderBoardUseCase$subscribeLeaderBoardCards$2> continuation) {
        super(2, continuation);
        this.this$0 = jbd;
        this.$groupFilter = jbh;
        this.$userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardUseCase$subscribeLeaderBoardCards$2(this.this$0, this.$groupFilter, this.$userWalletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends jBB>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<jBB>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<jBB>> continuation) {
        return ((LeaderBoardUseCase$subscribeLeaderBoardCards$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jBZ jbz = this.this$0.KWHzl;
            RankingWsExtraParams rankingWsExtraParamsKWHzl = C25667jBx.KWHzl(this.$groupFilter, this.$userWalletAddress);
            this.label = 1;
            obj = jbz.copydefault(rankingWsExtraParamsKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
