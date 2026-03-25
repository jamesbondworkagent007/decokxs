package com.okinc.tradingbot.impl.minimumInvest.domain;

import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C52020vxx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C52020vxx.ActionBar>, Object> {
    final /* synthetic */ C52020vxx.Activity.C0987Activity $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52020vxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2(C52020vxx c52020vxx, C52020vxx.Activity.C0987Activity c0987Activity, Continuation<? super FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2> continuation) {
        super(2, continuation);
        this.this$0 = c52020vxx;
        this.$input = c0987Activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2 fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2 = new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2(this.this$0, this.$input, continuation);
        fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2.L$0 = obj;
        return fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C52020vxx.ActionBar> continuation) {
        return ((FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        ArbitrageInfoResponse arbitrageInfoResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$arbitrageInfoDeferred$1(this.this$0, this.$input, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1(this.this$0, this.$input, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arbitrageInfoResponse = (ArbitrageInfoResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                String minAmt = arbitrageInfoResponse.getMinAmt();
                StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
                return new C52020vxx.ActionBar(minAmt, null, null, null, strategyConfigInfo != null ? strategyConfigInfo.getMaxAmt() : null, 14, null);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ArbitrageInfoResponse arbitrageInfoResponse2 = (ArbitrageInfoResponse) obj;
        this.L$0 = arbitrageInfoResponse2;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        arbitrageInfoResponse = arbitrageInfoResponse2;
        obj = objAwait2;
        String minAmt2 = arbitrageInfoResponse.getMinAmt();
        StrategyConfigInfo strategyConfigInfo2 = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
        return new C52020vxx.ActionBar(minAmt2, null, null, null, strategyConfigInfo2 != null ? strategyConfigInfo2.getMaxAmt() : null, 14, null);
    }
}
