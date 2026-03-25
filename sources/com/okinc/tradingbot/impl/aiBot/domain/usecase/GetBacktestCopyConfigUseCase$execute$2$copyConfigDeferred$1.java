package com.okinc.tradingbot.impl.aiBot.domain.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.dto.AiCopyConfigResponseDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC50055vAf;
import o.pUU;
import o.uCG;

/* JADX INFO: loaded from: classes11.dex */
public final class GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AiOrderReq>, Object> {
    final /* synthetic */ uCG.StateListAnimator $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uCG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1(uCG ucg, uCG.StateListAnimator stateListAnimator, Continuation<? super GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = ucg;
        this.$input = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1 getBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1 = new GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1(this.this$0, this.$input, continuation);
        getBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1.L$0 = obj;
        return getBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AiOrderReq> continuation) {
        return ((GetBacktestCopyConfigUseCase$execute$2$copyConfigDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object objAkhnZx;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                uCG ucg = this.this$0;
                uCG.StateListAnimator stateListAnimator2 = this.$input;
                InterfaceC50055vAf interfaceC50055vAf = ucg.AEQbTJ;
                String strEZpvd = stateListAnimator2.EZpvd();
                this.label = 1;
                objAkhnZx = interfaceC50055vAf.AkhnZx(strEZpvd, this);
                if (objAkhnZx == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAkhnZx = obj;
            }
            responseData = (ResponseData) objAkhnZx;
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            AiOrderReq aiOrderReqAEQbTJ = ((AiCopyConfigResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((List) stateListAnimator.AEQbTJ())).AEQbTJ();
            String slRatio = aiOrderReqAEQbTJ.getSlRatio();
            if (slRatio == null) {
            }
            String tpRatio = aiOrderReqAEQbTJ.getTpRatio();
            return aiOrderReqAEQbTJ.copy((4351 & 1) != 0 ? aiOrderReqAEQbTJ.aiModel : null, (4351 & 2) != 0 ? aiOrderReqAEQbTJ.instIds : null, (4351 & 4) != 0 ? aiOrderReqAEQbTJ.instType : null, (4351 & 8) != 0 ? aiOrderReqAEQbTJ.ordType : null, (4351 & 16) != 0 ? aiOrderReqAEQbTJ.tdMode : null, (4351 & 32) != 0 ? aiOrderReqAEQbTJ.dataSetting : null, (4351 & 64) != 0 ? aiOrderReqAEQbTJ.userPrompt : null, (4351 & 128) != 0 ? aiOrderReqAEQbTJ.userPromptEn : null, (4351 & 256) != 0 ? aiOrderReqAEQbTJ.totalAmt : null, (4351 & 512) != 0 ? aiOrderReqAEQbTJ.quoteCcy : null, (4351 & 1024) != 0 ? aiOrderReqAEQbTJ.tpRatio : (tpRatio == null && C33129mqd.AhwBna(tpRatio, C56443yFo.AEQbTJ(0))) ? tpRatio : null, (4351 & 2048) != 0 ? aiOrderReqAEQbTJ.slRatio : str, (4351 & 4096) != 0 ? aiOrderReqAEQbTJ.systemPromptVersion : null);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        AiOrderReq aiOrderReqAEQbTJ2 = ((AiCopyConfigResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((List) stateListAnimator.AEQbTJ())).AEQbTJ();
        String slRatio2 = aiOrderReqAEQbTJ2.getSlRatio();
        String str = (slRatio2 == null && C33129mqd.AhwBna(slRatio2, C56443yFo.AEQbTJ(0))) ? slRatio2 : null;
        String tpRatio2 = aiOrderReqAEQbTJ2.getTpRatio();
        return aiOrderReqAEQbTJ2.copy((4351 & 1) != 0 ? aiOrderReqAEQbTJ2.aiModel : null, (4351 & 2) != 0 ? aiOrderReqAEQbTJ2.instIds : null, (4351 & 4) != 0 ? aiOrderReqAEQbTJ2.instType : null, (4351 & 8) != 0 ? aiOrderReqAEQbTJ2.ordType : null, (4351 & 16) != 0 ? aiOrderReqAEQbTJ2.tdMode : null, (4351 & 32) != 0 ? aiOrderReqAEQbTJ2.dataSetting : null, (4351 & 64) != 0 ? aiOrderReqAEQbTJ2.userPrompt : null, (4351 & 128) != 0 ? aiOrderReqAEQbTJ2.userPromptEn : null, (4351 & 256) != 0 ? aiOrderReqAEQbTJ2.totalAmt : null, (4351 & 512) != 0 ? aiOrderReqAEQbTJ2.quoteCcy : null, (4351 & 1024) != 0 ? aiOrderReqAEQbTJ2.tpRatio : (tpRatio2 == null && C33129mqd.AhwBna(tpRatio2, C56443yFo.AEQbTJ(0))) ? tpRatio2 : null, (4351 & 2048) != 0 ? aiOrderReqAEQbTJ2.slRatio : str, (4351 & 4096) != 0 ? aiOrderReqAEQbTJ2.systemPromptVersion : null);
    }
}
