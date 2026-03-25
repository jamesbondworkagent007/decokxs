package com.okinc.im.imui.messageV2.view;

import androidx.core.view.MenuProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$buildMenuProviderFlow$1 extends SuspendLambda implements yHO<MenuProvider, Boolean, Continuation<? super MenuProvider>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$buildMenuProviderFlow$1(Continuation<? super ChatActivityViewModel$buildMenuProviderFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(MenuProvider menuProvider, boolean z, Continuation<? super MenuProvider> continuation) {
        ChatActivityViewModel$buildMenuProviderFlow$1 chatActivityViewModel$buildMenuProviderFlow$1 = new ChatActivityViewModel$buildMenuProviderFlow$1(continuation);
        chatActivityViewModel$buildMenuProviderFlow$1.L$0 = menuProvider;
        chatActivityViewModel$buildMenuProviderFlow$1.Z$0 = z;
        return chatActivityViewModel$buildMenuProviderFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(MenuProvider menuProvider, Boolean bool, Continuation<? super MenuProvider> continuation) {
        return invoke(menuProvider, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        MenuProvider menuProvider = (MenuProvider) this.L$0;
        if (this.Z$0) {
            return null;
        }
        return menuProvider;
    }
}
