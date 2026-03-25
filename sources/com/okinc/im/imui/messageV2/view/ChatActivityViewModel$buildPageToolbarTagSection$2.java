package com.okinc.im.imui.messageV2.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC35351ntg;
import o.AbstractC35352nth;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildPageToolbarTagSection$2 extends SuspendLambda implements yHO<AbstractC35351ntg, AbstractC35352nth<?>, Continuation<? super AbstractC35351ntg>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$buildPageToolbarTagSection$2(Continuation<? super ChatActivityViewModel$buildPageToolbarTagSection$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(AbstractC35351ntg abstractC35351ntg, AbstractC35352nth<?> abstractC35352nth, Continuation<? super AbstractC35351ntg> continuation) {
        ChatActivityViewModel$buildPageToolbarTagSection$2 chatActivityViewModel$buildPageToolbarTagSection$2 = new ChatActivityViewModel$buildPageToolbarTagSection$2(continuation);
        chatActivityViewModel$buildPageToolbarTagSection$2.L$0 = abstractC35351ntg;
        chatActivityViewModel$buildPageToolbarTagSection$2.L$1 = abstractC35352nth;
        return chatActivityViewModel$buildPageToolbarTagSection$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC35351ntg abstractC35351ntg = (AbstractC35351ntg) this.L$0;
            AbstractC35352nth abstractC35352nth = (AbstractC35352nth) this.L$1;
            pUU.KWHzl("ChatActivityViewModel", "buildPageToolbarTagSection changed: " + abstractC35352nth);
            AbstractC35351ntg abstractC35351ntg2 = (AbstractC35351ntg) abstractC35352nth.EZpvd(abstractC35351ntg);
            abstractC35352nth.copydefault(abstractC35351ntg2);
            return abstractC35351ntg2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
