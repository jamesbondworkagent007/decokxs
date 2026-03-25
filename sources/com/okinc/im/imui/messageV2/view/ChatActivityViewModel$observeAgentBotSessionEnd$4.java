package com.okinc.im.imui.messageV2.view;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$observeAgentBotSessionEnd$4 extends SuspendLambda implements Function2<Pair<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivityViewModel$observeAgentBotSessionEnd$4(ChatActivityViewModel chatActivityViewModel, Continuation<? super ChatActivityViewModel$observeAgentBotSessionEnd$4> continuation) {
        super(2, continuation);
        this.this$0 = chatActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivityViewModel$observeAgentBotSessionEnd$4 chatActivityViewModel$observeAgentBotSessionEnd$4 = new ChatActivityViewModel$observeAgentBotSessionEnd$4(this.this$0, continuation);
        chatActivityViewModel$observeAgentBotSessionEnd$4.L$0 = obj;
        return chatActivityViewModel$observeAgentBotSessionEnd$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<String, Boolean>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<String, Boolean> pair, Continuation<? super Unit> continuation) {
        return ((ChatActivityViewModel$observeAgentBotSessionEnd$4) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) ((Pair) this.L$0).component1();
            ChatActivityViewModel chatActivityViewModel = this.this$0;
            this.label = 1;
            if (chatActivityViewModel.EZpvd(str, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
