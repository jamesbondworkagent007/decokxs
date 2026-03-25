package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.tradingbot.impl.aiBot.dto.ModelInfoDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.DataSetting;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.uCK;
import o.vNB;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmOrderViewModel$fetchAiHome$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LlmOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderViewModel$fetchAiHome$1(LlmOrderViewModel llmOrderViewModel, Continuation<? super LlmOrderViewModel$fetchAiHome$1> continuation) {
        super(2, continuation);
        this.this$0 = llmOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderViewModel$fetchAiHome$1 llmOrderViewModel$fetchAiHome$1 = new LlmOrderViewModel$fetchAiHome$1(this.this$0, continuation);
        llmOrderViewModel$fetchAiHome$1.L$0 = obj;
        return llmOrderViewModel$fetchAiHome$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmOrderViewModel$fetchAiHome$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        LlmOrderViewModel llmOrderViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            llmOrderViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            uCK uck = llmOrderViewModel.DbNXlk;
            Unit unit = Unit.INSTANCE;
            this.L$0 = llmOrderViewModel;
            this.label = 1;
            obj = uck.KWHzl(unit, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                LlmOrderViewModel llmOrderViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = llmOrderViewModel2.EZpvd;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            llmOrderViewModel = (LlmOrderViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AiHomeDto aiHomeDto = (AiHomeDto) obj;
        llmOrderViewModel.EZpvd(llmOrderViewModel.KWHzl((List<ModelInfoDto>) aiHomeDto.AEQbTJ()));
        llmOrderViewModel.copydefault(llmOrderViewModel.copydefault((Set<String>) aiHomeDto.gEmmrt().keySet()), true);
        DataSetting.Companion companion = DataSetting.Companion;
        AiOrderReq aiOrderReqGEmmrt = llmOrderViewModel.gEmmrt();
        llmOrderViewModel.EZpvd(companion.AEQbTJ(aiOrderReqGEmmrt != null ? aiOrderReqGEmmrt.getDataSetting() : null, aiHomeDto.OLrzqt(), aiHomeDto.djBIcL(), aiHomeDto.valueOf()));
        AiOrderReq aiOrderReqGEmmrt2 = llmOrderViewModel.gEmmrt();
        String userPrompt = aiOrderReqGEmmrt2 != null ? aiOrderReqGEmmrt2.getUserPrompt() : null;
        String str = "";
        if (userPrompt == null) {
            userPrompt = "";
        }
        AiOrderReq aiOrderReqGEmmrt3 = llmOrderViewModel.gEmmrt();
        String userPromptEn = aiOrderReqGEmmrt3 != null ? aiOrderReqGEmmrt3.getUserPromptEn() : null;
        if (userPromptEn != null) {
            str = userPromptEn;
        }
        llmOrderViewModel.KWHzl(userPrompt, str);
        MutableStateFlow mutableStateFlow2 = llmOrderViewModel.EZpvd;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription(aiHomeDto);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        LlmOrderViewModel llmOrderViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
