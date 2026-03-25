package com.okinc.im.imui.messageV2.view;

import com.okinc.im.config.page.IMPageType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildPageToolbarTitleFlow$1 extends SuspendLambda implements yHO<String, IMPageType, Continuation<? super Pair<? extends String, ? extends IMPageType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$buildPageToolbarTitleFlow$1(Continuation<? super ChatActivityViewModel$buildPageToolbarTitleFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(String str, IMPageType iMPageType, Continuation<? super Pair<? extends String, ? extends IMPageType>> continuation) {
        return invoke2(str, iMPageType, (Continuation<? super Pair<String, ? extends IMPageType>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, IMPageType iMPageType, Continuation<? super Pair<String, ? extends IMPageType>> continuation) {
        ChatActivityViewModel$buildPageToolbarTitleFlow$1 chatActivityViewModel$buildPageToolbarTitleFlow$1 = new ChatActivityViewModel$buildPageToolbarTitleFlow$1(continuation);
        chatActivityViewModel$buildPageToolbarTitleFlow$1.L$0 = str;
        chatActivityViewModel$buildPageToolbarTitleFlow$1.L$1 = iMPageType;
        return chatActivityViewModel$buildPageToolbarTitleFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((String) this.L$0, (IMPageType) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
