package com.okinc.business.market.features.analysis.futures.sub.overview.data.repo;

import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jKJ;
import o.jKO;
import o.jKP;

/* JADX INFO: loaded from: classes6.dex */
public final class OverviewRepository$getRankingListData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super jKO>, Object> {
    final /* synthetic */ PayloadPeriod $period;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ jKP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewRepository$getRankingListData$2(jKP jkp, PayloadPeriod payloadPeriod, String str, String str2, Continuation<? super OverviewRepository$getRankingListData$2> continuation) {
        super(2, continuation);
        this.this$0 = jkp;
        this.$period = payloadPeriod;
        this.$valuationUnit = str;
        this.$uid = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewRepository$getRankingListData$2(this.this$0, this.$period, this.$valuationUnit, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jKO> continuation) {
        return ((OverviewRepository$getRankingListData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jKJ jkj = this.this$0.OLrzqt;
            PayloadPeriod payloadPeriod = this.$period;
            String str = this.$valuationUnit;
            String str2 = this.$uid;
            this.label = 1;
            obj = jkj.KWHzl(payloadPeriod, str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((ResponseData) obj).getData();
        if (list != null) {
            return (jKO) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
