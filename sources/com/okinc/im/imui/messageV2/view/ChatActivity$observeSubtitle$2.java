package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC36573odX;
import o.C56391yDq;
import o.C56442yFn;
import o.oFS;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivity$observeSubtitle$2 extends SuspendLambda implements Function2<oFS, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC36573odX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivity$observeSubtitle$2(ActivityC36573odX activityC36573odX, Continuation<? super ChatActivity$observeSubtitle$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC36573odX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivity$observeSubtitle$2 chatActivity$observeSubtitle$2 = new ChatActivity$observeSubtitle$2(this.this$0, continuation);
        chatActivity$observeSubtitle$2.L$0 = obj;
        return chatActivity$observeSubtitle$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(oFS ofs, Continuation<? super Unit> continuation) {
        return ((ChatActivity$observeSubtitle$2) create(ofs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            oFS ofs = (oFS) this.L$0;
            pUU.KWHzl("ChatActivity", "officialTagUiInfo update: " + ofs);
            this.this$0.EZpvd(ofs);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
