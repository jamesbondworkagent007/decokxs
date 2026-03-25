package com.okinc.im.imui.impl;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sDZ;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMServiceImpl$startIMChatPage$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKConversation>, Object> {
    final /* synthetic */ OKConversationType $conversationType;
    final /* synthetic */ String $targetId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMServiceImpl$startIMChatPage$1$1$1(OKConversationType oKConversationType, String str, Continuation<? super OKIMServiceImpl$startIMChatPage$1$1$1> continuation) {
        super(2, continuation);
        this.$conversationType = oKConversationType;
        this.$targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMServiceImpl$startIMChatPage$1$1$1(this.$conversationType, this.$targetId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKConversation> continuation) {
        return ((OKIMServiceImpl$startIMChatPage$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
            OKConversationType oKConversationType = this.$conversationType;
            String str = this.$targetId;
            this.label = 1;
            obj = sGF.Activity.getConversation$default(sgfAYXKKw, oKConversationType, str, true, false, null, this, 24, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
