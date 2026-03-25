package com.okinc.im.imui.messageV2.view;

import com.okinc.im.config.page.IMPageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35285nsT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$_pageConfig$1 extends SuspendLambda implements Function2<IMPageType, Continuation<? super C35285nsT>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivityViewModel$_pageConfig$1(ChatActivityViewModel chatActivityViewModel, Continuation<? super ChatActivityViewModel$_pageConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = chatActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivityViewModel$_pageConfig$1 chatActivityViewModel$_pageConfig$1 = new ChatActivityViewModel$_pageConfig$1(this.this$0, continuation);
        chatActivityViewModel$_pageConfig$1.L$0 = obj;
        return chatActivityViewModel$_pageConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IMPageType iMPageType, Continuation<? super C35285nsT> continuation) {
        return ((ChatActivityViewModel$_pageConfig$1) create(iMPageType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.fetchVPNInfo.KWHzl((IMPageType) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
