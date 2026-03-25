package com.okinc.im.imui.messageV2.view;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C35285nsT;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ChatActivityViewModel$createPageConfigFlow$1<T> extends FunctionReferenceImpl implements Function2<C35285nsT, Continuation<? super T>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$createPageConfigFlow$1(Object obj) {
        super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion0", "createPageConfigFlow$suspendConversion0$11(Lkotlin/jvm/functions/Function1;Lcom/okinc/im/config/page/PageConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C35285nsT c35285nsT, Continuation<? super T> continuation) {
        return ChatActivityViewModel.copydefault((Function1) this.receiver, c35285nsT, continuation);
    }
}
