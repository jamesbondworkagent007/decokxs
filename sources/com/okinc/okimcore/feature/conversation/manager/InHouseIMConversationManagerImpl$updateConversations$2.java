package com.okinc.okimcore.feature.conversation.manager;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sGK;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$updateConversations$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdateConversationReq $req;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sGK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$updateConversations$2(sGK sgk, UpdateConversationReq updateConversationReq, Continuation<? super InHouseIMConversationManagerImpl$updateConversations$2> continuation) {
        super(2, continuation);
        this.this$0 = sgk;
        this.$req = updateConversationReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMConversationManagerImpl$updateConversations$2 inHouseIMConversationManagerImpl$updateConversations$2 = new InHouseIMConversationManagerImpl$updateConversations$2(this.this$0, this.$req, continuation);
        inHouseIMConversationManagerImpl$updateConversations$2.L$0 = obj;
        return inHouseIMConversationManagerImpl$updateConversations$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMConversationManagerImpl$updateConversations$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                sGK sgk = this.this$0;
                UpdateConversationReq updateConversationReq = this.$req;
                Result.Application application = Result.Companion;
                InHouseIMConversationService inHouseIMConversationService = sgk.EZpvd;
                this.label = 1;
                obj = inHouseIMConversationService.updateConversation(updateConversationReq, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl((ResponseData) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
