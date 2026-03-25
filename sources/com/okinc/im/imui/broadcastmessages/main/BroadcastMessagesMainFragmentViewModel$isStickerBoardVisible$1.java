package com.okinc.im.imui.broadcastmessages.main;

import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.InputMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1 extends SuspendLambda implements yHO<InputMode, ObserveKeyboardInputStateUseCase.KeyboardInputState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1(Continuation<? super BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(InputMode inputMode, ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState, Continuation<? super Boolean> continuation) {
        BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1 broadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1 = new BroadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1(continuation);
        broadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1.L$0 = inputMode;
        broadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1.L$1 = keyboardInputState;
        return broadcastMessagesMainFragmentViewModel$isStickerBoardVisible$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(((ObserveKeyboardInputStateUseCase.KeyboardInputState) this.L$1) == ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput && ((InputMode) this.L$0) == InputMode.StickerMode);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
