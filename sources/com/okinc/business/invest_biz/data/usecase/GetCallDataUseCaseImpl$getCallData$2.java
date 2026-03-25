package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.InvestCallData;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.iDH;
import o.iFG;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class GetCallDataUseCaseImpl$getCallData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InvestCallDataResult>>, Object> {
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ iDH $repository;
    final /* synthetic */ InvestCallDataReq $req;
    int label;
    final /* synthetic */ iFG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCallDataUseCaseImpl$getCallData$2(InvestTxModel investTxModel, InvestCallDataReq investCallDataReq, iDH idh, iFG ifg, Continuation<? super GetCallDataUseCaseImpl$getCallData$2> continuation) {
        super(2, continuation);
        this.$model = investTxModel;
        this.$req = investCallDataReq;
        this.$repository = idh;
        this.this$0 = ifg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCallDataUseCaseImpl$getCallData$2(this.$model, this.$req, this.$repository, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InvestCallDataResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InvestCallDataResult>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InvestCallDataResult>> continuation) {
        return ((GetCallDataUseCaseImpl$getCallData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$model.getOpenZap()) {
                InvestSimpleToken investSimpleToken = (InvestSimpleToken) CollectionsKt___CollectionsKt.firstOrNull(this.$req.getUserInputList());
                String coinAmount = investSimpleToken != null ? investSimpleToken.getCoinAmount() : null;
                if (coinAmount == null || coinAmount.length() == 0 || C33129mqd.OLrzqt(coinAmount, "0")) {
                    pUU.EZpvd("Univ3Zap", "getCallData orderType: " + this.$model.getOrderType());
                }
            }
            iDH idh = this.$repository;
            InvestCallDataReq investCallDataReq = this.$req;
            this.label = 1;
            objCopydefault = idh.copydefault(investCallDataReq, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        InvestTxModel investTxModel = this.$model;
        iFG ifg = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            Result.Application application = Result.Companion;
            JsonObject jsonObject = (JsonObject) objCopydefault;
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            Json json = ifg.copydefault;
            json.getSerializersModule();
            String strEZpvd = investTradeManager.EZpvd(jsonObject, investTxModel, (InvestCallData) json.decodeFromJsonElement(InvestCallData.Companion.serializer(), jsonObject));
            if (strEZpvd.length() != 0) {
                objCopydefault = ifg.copydefault(strEZpvd, jsonObject, investTxModel);
            } else {
                throw new OKServerException(2, "Data is Null", null, null, 12, null);
            }
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objCopydefault));
    }
}
