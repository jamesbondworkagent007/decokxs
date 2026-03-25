package com.okinc.business.invest_biz.ui.claim;

import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.iDH;
import o.iGH;
import o.iPA;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
public final class Web3ClaimSubmitTransactionUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super iGH>, Object> {
    final /* synthetic */ Map<String, String> $header;
    final /* synthetic */ JsonObject $jsonObject;
    final /* synthetic */ RequestBody $reqBody;
    int label;
    final /* synthetic */ iPA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3ClaimSubmitTransactionUseCase$invoke$2(iPA ipa, Map<String, String> map, RequestBody requestBody, JsonObject jsonObject, Continuation<? super Web3ClaimSubmitTransactionUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = ipa;
        this.$header = map;
        this.$reqBody = requestBody;
        this.$jsonObject = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Web3ClaimSubmitTransactionUseCase$invoke$2(this.this$0, this.$header, this.$reqBody, this.$jsonObject, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super iGH> continuation) {
        return ((Web3ClaimSubmitTransactionUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDH idh = this.this$0.AEQbTJ;
            Map<String, String> map = this.$header;
            RequestBody requestBody = this.$reqBody;
            this.label = 1;
            objKWHzl = idh.KWHzl(map, requestBody, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objKWHzl);
        InvestTxData investTxData = (InvestTxData) objKWHzl;
        String txId = investTxData.getTxId();
        if (txId == null) {
            txId = "";
        }
        String orderId = investTxData.getOrderId();
        return new iGH(txId, orderId != null ? orderId : "", this.$jsonObject.get("orderType").getAsInt(), this.$jsonObject.get(WiseOpenHianalyticsData.UNION_COSTTIME).getAsInt());
    }
}
