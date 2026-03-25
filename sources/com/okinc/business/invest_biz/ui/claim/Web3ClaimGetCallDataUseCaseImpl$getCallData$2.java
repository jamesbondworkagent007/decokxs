package com.okinc.business.invest_biz.ui.claim;

import com.okinc.business.invest_biz.data.bean.InvestCallData;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C23967iPz;
import o.C56391yDq;
import o.C56442yFn;
import o.iDH;

/* JADX INFO: loaded from: classes6.dex */
public final class Web3ClaimGetCallDataUseCaseImpl$getCallData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InvestCallDataResult>>, Object> {
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ InvestCallDataReq $req;
    int label;
    final /* synthetic */ C23967iPz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3ClaimGetCallDataUseCaseImpl$getCallData$2(C23967iPz c23967iPz, InvestCallDataReq investCallDataReq, InvestTxModel investTxModel, Continuation<? super Web3ClaimGetCallDataUseCaseImpl$getCallData$2> continuation) {
        super(2, continuation);
        this.this$0 = c23967iPz;
        this.$req = investCallDataReq;
        this.$model = investTxModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3ClaimGetCallDataUseCaseImpl$getCallData$2(this.this$0, this.$req, this.$model, continuation);
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
        return ((Web3ClaimGetCallDataUseCaseImpl$getCallData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDH idh = this.this$0.OLrzqt;
            InvestCallDataReq investCallDataReq = this.$req;
            this.label = 1;
            objKWHzl = idh.KWHzl(investCallDataReq, this);
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
        InvestTxModel investTxModel = this.$model;
        C23967iPz c23967iPz = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            Result.Application application = Result.Companion;
            JsonObject jsonObject = (JsonObject) objKWHzl;
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            Json json = c23967iPz.copydefault;
            json.getSerializersModule();
            String strEZpvd = investTradeManager.EZpvd(jsonObject, investTxModel, (InvestCallData) json.decodeFromJsonElement(InvestCallData.Companion.serializer(), jsonObject));
            if (strEZpvd.length() != 0) {
                objKWHzl = c23967iPz.KWHzl(strEZpvd, jsonObject, investTxModel);
            } else {
                throw new OKServerException(2, null, null, null, 14, null);
            }
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objKWHzl));
    }
}
