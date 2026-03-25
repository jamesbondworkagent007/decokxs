package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.im.usecase.message.SendStopAgentBotMessageUseCase;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$stopAgentBotMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$stopAgentBotMessage$1(KeyboardViewModel keyboardViewModel, Continuation<? super KeyboardViewModel$stopAgentBotMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = keyboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KeyboardViewModel$stopAgentBotMessage$1 keyboardViewModel$stopAgentBotMessage$1 = new KeyboardViewModel$stopAgentBotMessage$1(this.this$0, continuation);
        keyboardViewModel$stopAgentBotMessage$1.L$0 = obj;
        return keyboardViewModel$stopAgentBotMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$stopAgentBotMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                KeyboardViewModel keyboardViewModel = this.this$0;
                Result.Application application = Result.Companion;
                SendStopAgentBotMessageUseCase sendStopAgentBotMessageUseCase = keyboardViewModel.QVAiDq;
                String str = (String) keyboardViewModel.values.getValue();
                if (str == null) {
                    str = "";
                }
                this.label = 1;
                obj = sendStopAgentBotMessageUseCase.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("KeyboardViewModel", "stopAgentBotMessage error", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
