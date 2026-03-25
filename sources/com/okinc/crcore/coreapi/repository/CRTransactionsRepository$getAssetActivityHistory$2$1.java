package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.requestbean.transactions.trades.ActivityCurrency;
import com.okinc.crcore.coreapi.net.requestbean.transactions.trades.AssetActivityHistoryRequest;
import com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31773mDj;
import o.mCU;

/* JADX INFO: loaded from: classes23.dex */
public final class CRTransactionsRepository$getAssetActivityHistory$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TransactionActivityList>>, Object> {
    final /* synthetic */ ActivityCurrency $activityCurrency;
    final /* synthetic */ Integer $activityType;
    final /* synthetic */ Long $fromTime;
    final /* synthetic */ Long $offsetEventTime;
    final /* synthetic */ Long $offsetId;
    final /* synthetic */ int $queryType;
    final /* synthetic */ mCU $this_runOrErrorResponse;
    final /* synthetic */ Long $toTime;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRTransactionsRepository$getAssetActivityHistory$2$1(Integer num, ActivityCurrency activityCurrency, Long l, Long l2, int i, Long l3, Long l4, mCU mcu, Continuation<? super CRTransactionsRepository$getAssetActivityHistory$2$1> continuation) {
        super(2, continuation);
        this.$activityType = num;
        this.$activityCurrency = activityCurrency;
        this.$offsetId = l;
        this.$offsetEventTime = l2;
        this.$queryType = i;
        this.$fromTime = l3;
        this.$toTime = l4;
        this.$this_runOrErrorResponse = mcu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CRTransactionsRepository$getAssetActivityHistory$2$1(this.$activityType, this.$activityCurrency, this.$offsetId, this.$offsetEventTime, this.$queryType, this.$fromTime, this.$toTime, this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TransactionActivityList>> continuation) {
        return ((CRTransactionsRepository$getAssetActivityHistory$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = this.$activityType;
            List listEZpvd = num != null ? C56402yEa.EZpvd(C56443yFo.AEQbTJ(num.intValue())) : null;
            ActivityCurrency activityCurrency = this.$activityCurrency;
            AssetActivityHistoryRequest assetActivityHistoryRequest = new AssetActivityHistoryRequest(this.$offsetId, this.$offsetEventTime, listEZpvd, activityCurrency != null ? C56402yEa.EZpvd(activityCurrency) : null, this.$queryType, 1, this.$fromTime, this.$toTime, 50);
            InterfaceC31773mDj interfaceC31773mDj = this.$this_runOrErrorResponse.copydefault;
            this.label = 1;
            obj = interfaceC31773mDj.copydefault(assetActivityHistoryRequest, this);
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
