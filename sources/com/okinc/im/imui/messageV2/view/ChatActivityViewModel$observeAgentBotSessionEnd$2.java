package com.okinc.im.imui.messageV2.view;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$observeAgentBotSessionEnd$2 extends SuspendLambda implements yHO<String, Boolean, Continuation<? super Pair<? extends String, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$observeAgentBotSessionEnd$2(Continuation<? super ChatActivityViewModel$observeAgentBotSessionEnd$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super Pair<? extends String, ? extends Boolean>> continuation) {
        return invoke(str, bool.booleanValue(), (Continuation<? super Pair<String, Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(String str, boolean z, Continuation<? super Pair<String, Boolean>> continuation) {
        ChatActivityViewModel$observeAgentBotSessionEnd$2 chatActivityViewModel$observeAgentBotSessionEnd$2 = new ChatActivityViewModel$observeAgentBotSessionEnd$2(continuation);
        chatActivityViewModel$observeAgentBotSessionEnd$2.L$0 = str;
        chatActivityViewModel$observeAgentBotSessionEnd$2.Z$0 = z;
        return chatActivityViewModel$observeAgentBotSessionEnd$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((String) this.L$0, C56443yFo.KWHzl(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
