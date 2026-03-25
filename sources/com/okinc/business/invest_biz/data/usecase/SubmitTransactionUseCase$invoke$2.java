package com.okinc.business.invest_biz.data.usecase;

import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.di.TransactionBiz;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C23724iGz;
import o.C56391yDq;
import o.C56442yFn;
import o.iDH;
import o.iGH;
import o.iNW;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
public final class SubmitTransactionUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super iGH>, Object> {
    final /* synthetic */ Map<String, String> $header;
    final /* synthetic */ JsonObject $jsonObject;
    final /* synthetic */ RequestBody $reqBody;
    final /* synthetic */ InvestTxModel $txModel;
    int label;
    final /* synthetic */ C23724iGz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTransactionUseCase$invoke$2(C23724iGz c23724iGz, InvestTxModel investTxModel, Map<String, String> map, RequestBody requestBody, JsonObject jsonObject, Continuation<? super SubmitTransactionUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c23724iGz;
        this.$txModel = investTxModel;
        this.$header = map;
        this.$reqBody = requestBody;
        this.$jsonObject = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SubmitTransactionUseCase$invoke$2(this.this$0, this.$txModel, this.$header, this.$reqBody, this.$jsonObject, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super iGH> continuation) {
        return ((SubmitTransactionUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionBiz transactionBiz;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iNW inw = this.this$0.KWHzl;
            if (this.$txModel.isBoostTrade()) {
                transactionBiz = TransactionBiz.BOOST;
            } else {
                transactionBiz = TransactionBiz.DEFI;
            }
            iDH idhAEQbTJ = inw.AEQbTJ(transactionBiz);
            Map<String, String> map = this.$header;
            RequestBody requestBody = this.$reqBody;
            this.label = 1;
            objAEQbTJ = idhAEQbTJ.AEQbTJ(map, requestBody, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        InvestTxData investTxData = (InvestTxData) objAEQbTJ;
        String txId = investTxData.getTxId();
        if (txId == null) {
            txId = "";
        }
        String orderId = investTxData.getOrderId();
        return new iGH(txId, orderId != null ? orderId : "", this.$jsonObject.get("orderType").getAsInt(), this.$jsonObject.get(WiseOpenHianalyticsData.UNION_COSTTIME).getAsInt());
    }
}
