package com.okinc.im.imui.impl;

import android.content.Context;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C33764nEz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sDN;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMServiceImpl$startIMChatPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ OKConversationType $conversationType;
    final /* synthetic */ String $source;
    final /* synthetic */ String $targetId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMServiceImpl$startIMChatPage$1(String str, OKConversationType oKConversationType, String str2, Context context, Continuation<? super OKIMServiceImpl$startIMChatPage$1> continuation) {
        super(2, continuation);
        this.$targetId = str;
        this.$conversationType = oKConversationType;
        this.$source = str2;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMServiceImpl$startIMChatPage$1 oKIMServiceImpl$startIMChatPage$1 = new OKIMServiceImpl$startIMChatPage$1(this.$targetId, this.$conversationType, this.$source, this.$context, continuation);
        oKIMServiceImpl$startIMChatPage$1.L$0 = obj;
        return oKIMServiceImpl$startIMChatPage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMServiceImpl$startIMChatPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objWithContext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("OKIMServiceImpl", "startIMChatPage and try get conversation before jump: targetId:" + this.$targetId + ", conversationType:" + this.$conversationType + ", source:" + this.$source);
                OKConversationType oKConversationType = this.$conversationType;
                String str = this.$targetId;
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                OKIMServiceImpl$startIMChatPage$1$1$1 oKIMServiceImpl$startIMChatPage$1$1$1 = new OKIMServiceImpl$startIMChatPage$1$1$1(oKConversationType, str, null);
                this.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, oKIMServiceImpl$startIMChatPage$1$1$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) objWithContext);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Context context = this.$context;
        String str2 = this.$source;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            OKConversation oKConversation = (OKConversation) objM7377constructorimpl;
            pUU.KWHzl("OKIMServiceImpl", "getConversationSuccess, targetId=" + oKConversation.getTargetId() + ", groupType =" + oKConversation.getGroupType());
            C33764nEz.OLrzqt.copydefault(oKConversation, context, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : str2, (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("OKIMServiceImpl", "getConversationFailed: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
