package com.okinc.tradingbot.impl.botDetail.ui.llmSignal;

import com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto;
import com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C48174uHs;
import o.C53673wpt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.uCH;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class LLMSignalDetailsViewModel$fetchAiDetail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LLMSignalDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLMSignalDetailsViewModel$fetchAiDetail$2(LLMSignalDetailsViewModel lLMSignalDetailsViewModel, Continuation<? super LLMSignalDetailsViewModel$fetchAiDetail$2> continuation) {
        super(2, continuation);
        this.this$0 = lLMSignalDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LLMSignalDetailsViewModel$fetchAiDetail$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LLMSignalDetailsViewModel$fetchAiDetail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AiDetailResponseDto aiDetailResponseDto;
        MutableStateFlow mutableStateFlow;
        uLU uluAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uCH uch = this.this$0.EZpvd;
            uCH.TaskDescription taskDescription = new uCH.TaskDescription(this.this$0.EZpvd(), this.this$0.copydefault());
            this.label = 1;
            obj = uch.KWHzl(taskDescription, this);
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
                    this.this$0.EZpvd(LLMSignalDetailsViewModel.ActionBar.Activity.KWHzl);
                    return Unit.INSTANCE;
                }
                aiDetailResponseDto = (AiDetailResponseDto) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.valueOf = true;
                C48174uHs c48174uHsEZpvd = C48174uHs.Companion.EZpvd(aiDetailResponseDto);
                mutableStateFlow = this.this$0.copydefault;
                uluAEQbTJ = uLU.Companion.AEQbTJ(c48174uHsEZpvd);
                this.L$0 = null;
                this.label = 3;
                if (mutableStateFlow.emit(uluAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.EZpvd(LLMSignalDetailsViewModel.ActionBar.Activity.KWHzl);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        aiDetailResponseDto = (AiDetailResponseDto) obj;
        if (!this.this$0.valueOf && aiDetailResponseDto.EZpvd().length() > 0) {
            C53673wpt c53673wpt = this.this$0.AEQbTJ;
            List listEZpvd = C56402yEa.EZpvd(aiDetailResponseDto.EZpvd());
            this.L$0 = aiDetailResponseDto;
            this.label = 2;
            if (c53673wpt.KWHzl(listEZpvd, (Continuation) this) == objCopydefault) {
                return objCopydefault;
            }
            this.this$0.valueOf = true;
        }
        C48174uHs c48174uHsEZpvd2 = C48174uHs.Companion.EZpvd(aiDetailResponseDto);
        mutableStateFlow = this.this$0.copydefault;
        uluAEQbTJ = uLU.Companion.AEQbTJ(c48174uHsEZpvd2);
        this.L$0 = null;
        this.label = 3;
        if (mutableStateFlow.emit(uluAEQbTJ, this) == objCopydefault) {
        }
        this.this$0.EZpvd(LLMSignalDetailsViewModel.ActionBar.Activity.KWHzl);
        return Unit.INSTANCE;
    }
}
