package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.oCN;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$observeDraftMessageModel$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivityViewModel$observeDraftMessageModel$2(ChatActivityViewModel chatActivityViewModel, Continuation<? super ChatActivityViewModel$observeDraftMessageModel$2> continuation) {
        super(2, continuation);
        this.this$0 = chatActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivityViewModel$observeDraftMessageModel$2 chatActivityViewModel$observeDraftMessageModel$2 = new ChatActivityViewModel$observeDraftMessageModel$2(this.this$0, continuation);
        chatActivityViewModel$observeDraftMessageModel$2.L$0 = obj;
        return chatActivityViewModel$observeDraftMessageModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ChatActivityViewModel$observeDraftMessageModel$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChatActivityViewModel chatActivityViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            pUU.KWHzl("ChatActivityViewModel", "observeDraftMessageModel - channelId changed: " + str);
            chatActivityViewModel = this.this$0;
            oCN ocn = chatActivityViewModel.DbNXlk;
            this.L$0 = chatActivityViewModel;
            this.label = 1;
            obj = ocn.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            chatActivityViewModel = (ChatActivityViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        chatActivityViewModel.AkhnZx = (DraftMessageModel) obj;
        MutableSharedFlow<Unit> mutableSharedFlowAhwBna = this.this$0.AhwBna();
        Unit unit = Unit.INSTANCE;
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlowAhwBna.emit(unit, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
