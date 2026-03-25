package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.invest_biz.data.bean.InvestAACallData;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.C33489mxS;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.iDH;
import o.iFG;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class GetCallDataUseCaseImpl$getAACallData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InvestCallDataResult>>, Object> {
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ iDH $repository;
    final /* synthetic */ InvestCallDataReq $req;
    int label;
    final /* synthetic */ iFG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCallDataUseCaseImpl$getAACallData$2(iDH idh, InvestCallDataReq investCallDataReq, InvestTxModel investTxModel, iFG ifg, Continuation<? super GetCallDataUseCaseImpl$getAACallData$2> continuation) {
        super(2, continuation);
        this.$repository = idh;
        this.$req = investCallDataReq;
        this.$model = investTxModel;
        this.this$0 = ifg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCallDataUseCaseImpl$getAACallData$2(this.$repository, this.$req, this.$model, this.this$0, continuation);
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
        return ((GetCallDataUseCaseImpl$getAACallData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        } else {
            C56391yDq.AEQbTJ(obj);
            iDH idh = this.$repository;
            InvestCallDataReq investCallDataReq = this.$req;
            this.label = 1;
            objOLrzqt = idh.OLrzqt(investCallDataReq, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        }
        InvestTxModel investTxModel = this.$model;
        iFG ifg = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application = Result.Companion;
            JsonObject jsonObject = (JsonObject) objOLrzqt;
            List<FromToken> fromToken = investTxModel.getFromToken();
            if (fromToken != null) {
                JsonArray jsonArray = JsonElementKt.getJsonArray(jsonObject.getOrDefault("dataList", new JsonArray(yDY.AhwBna())));
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
                for (JsonElement jsonElement : jsonArray) {
                    Json json = ifg.copydefault;
                    json.getSerializersModule();
                    arrayList.add((InvestAACallData) json.decodeFromJsonElement(InvestAACallData.Companion.serializer(), jsonElement));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (Intrinsics.EZpvd((Object) "SUBSCRIBE", (Object) ((InvestAACallData) obj2).getType())) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((InvestAACallData) it.next()).setFromToken(fromToken);
                }
                investTxModel.setFromToken(null);
            }
            String strKWHzl = C33489mxS.KWHzl.KWHzl(JsonObject.Companion.serializer(), jsonObject);
            if (strKWHzl.length() != 0) {
                objOLrzqt = ifg.copydefault(strKWHzl, jsonObject, investTxModel);
            } else {
                throw new OKServerException(2, "Data is Null", null, null, 12, null);
            }
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objOLrzqt));
    }
}
