package com.okinc.okmarket.app;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C44586sZi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes24.dex */
public final class MarketHomePreNetAction$performAction$1$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RankListRequest $req;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomePreNetAction$performAction$1$1$3(CoroutineScope coroutineScope, RankListRequest rankListRequest, Continuation<? super MarketHomePreNetAction$performAction$1$1$3> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$req = rankListRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomePreNetAction$performAction$1$1$3(this.$scope, this.$req, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomePreNetAction$performAction$1$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RankListRequest rankListRequest = this.$req;
                Result.Application application = Result.Companion;
                AbstractC58185ywX newCoinRank$default = BizFindApiService.StateListAnimator.getNewCoinRank$default((BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class)), C44586sZi.EZpvd.copydefault(rankListRequest), null, 0, 6, null);
                this.label = 1;
                obj = AwaitKt.awaitFirst(newCoinRank$default, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl((ResponseData) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C44586sZi.EZpvd.EZpvd(null);
        CoroutineScopeKt.cancel$default(this.$scope, null, 1, null);
        return Unit.INSTANCE;
    }
}
