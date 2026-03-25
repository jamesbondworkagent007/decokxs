package o;

import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.claim.Web3ClaimGetCallDataUseCaseImpl$getCallData$1;
import com.okinc.business.invest_biz.ui.claim.Web3ClaimGetCallDataUseCaseImpl$getCallData$2;
import com.okinc.business.invest_biz.ui.claim.Web3ClaimGetCallDataUseCaseImpl$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23967iPz implements InterfaceC23966iPy {
    public final CoroutineDispatcher AEQbTJ;
    public final iDH OLrzqt;
    public final Json copydefault;

    @yCM
    public C23967iPz(@NotNull iDH idh, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = idh;
        this.copydefault = json;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23966iPy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<InvestCallDataResult>> continuation) {
        Web3ClaimGetCallDataUseCaseImpl$invoke$1 web3ClaimGetCallDataUseCaseImpl$invoke$1;
        if (continuation instanceof Web3ClaimGetCallDataUseCaseImpl$invoke$1) {
            web3ClaimGetCallDataUseCaseImpl$invoke$1 = (Web3ClaimGetCallDataUseCaseImpl$invoke$1) continuation;
            int i = web3ClaimGetCallDataUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3ClaimGetCallDataUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                web3ClaimGetCallDataUseCaseImpl$invoke$1 = new Web3ClaimGetCallDataUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = web3ClaimGetCallDataUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3ClaimGetCallDataUseCaseImpl$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        InvestCallDataReq investCallDataReqOLrzqt = InvestTradeManager.OLrzqt.OLrzqt(investTxModel);
        web3ClaimGetCallDataUseCaseImpl$invoke$1.label = 1;
        java.lang.Object objEZpvd = EZpvd(investTxModel, investCallDataReqOLrzqt, web3ClaimGetCallDataUseCaseImpl$invoke$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InvestTxModel investTxModel, InvestCallDataReq investCallDataReq, Continuation<? super Result<InvestCallDataResult>> continuation) throws java.lang.Throwable {
        Web3ClaimGetCallDataUseCaseImpl$getCallData$1 web3ClaimGetCallDataUseCaseImpl$getCallData$1;
        if (continuation instanceof Web3ClaimGetCallDataUseCaseImpl$getCallData$1) {
            web3ClaimGetCallDataUseCaseImpl$getCallData$1 = (Web3ClaimGetCallDataUseCaseImpl$getCallData$1) continuation;
            int i = web3ClaimGetCallDataUseCaseImpl$getCallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3ClaimGetCallDataUseCaseImpl$getCallData$1.label = i - Integer.MIN_VALUE;
            } else {
                web3ClaimGetCallDataUseCaseImpl$getCallData$1 = new Web3ClaimGetCallDataUseCaseImpl$getCallData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = web3ClaimGetCallDataUseCaseImpl$getCallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3ClaimGetCallDataUseCaseImpl$getCallData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            Web3ClaimGetCallDataUseCaseImpl$getCallData$2 web3ClaimGetCallDataUseCaseImpl$getCallData$2 = new Web3ClaimGetCallDataUseCaseImpl$getCallData$2(this, investCallDataReq, investTxModel, null);
            web3ClaimGetCallDataUseCaseImpl$getCallData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, web3ClaimGetCallDataUseCaseImpl$getCallData$2, web3ClaimGetCallDataUseCaseImpl$getCallData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final InvestCallDataResult KWHzl(java.lang.String str, JsonObject jsonObject, InvestTxModel investTxModel) {
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonElement jsonElement = (JsonElement) jsonObject.get("data");
        java.lang.String content = null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt((jsonElement == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive5.getContent());
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("from");
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt((jsonElement2 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive4.getContent());
        JsonElement jsonElement3 = (JsonElement) jsonObject.get("to");
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt((jsonElement3 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive3.getContent());
        JsonElement jsonElement4 = (JsonElement) jsonObject.get("checkSum");
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt((jsonElement4 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : jsonPrimitive2.getContent());
        JsonElement jsonElement5 = (JsonElement) jsonObject.get("orderId");
        if (jsonElement5 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement5)) != null) {
            content = jsonPrimitive.getContent();
        }
        return new InvestCallDataResult(strGEmmrt, str, (java.lang.String) null, strGEmmrt2, strGEmmrt3, strGEmmrt4, C33129mqd.gEmmrt(content), investTxModel.getSlipPoint(), investTxModel.getPubkey(), (java.lang.String) null, (java.lang.String) null, investTxModel.getPriorityFee(), 1540, (DefaultConstructorMarker) null);
    }
}
