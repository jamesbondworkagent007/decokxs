package com.okinc.okimcore.feature.conversation.refresh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.sDZ;
import o.sGH;
import o.sGP;

/* JADX INFO: loaded from: classes10.dex */
public final class ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ String $senderId;
    int label;
    final /* synthetic */ sGP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1(String str, String str2, sGP sgp, Continuation<? super ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1> continuation) {
        super(2, continuation);
        this.$senderId = str;
        this.$memberOfGroup = str2;
        this.this$0 = sgp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1(this.$senderId, this.$memberOfGroup, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationRefreshUseCaseImpl$handleRefreshWhenNewMsg$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = sDZ.AEQbTJ.AhwBna().AEQbTJ();
                String str = this.$senderId;
                String str2 = this.$memberOfGroup;
                this.label = 1;
                if (interfaceC44177sGdAEQbTJ.EZpvd(str, str2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            sGH.Application.refreshConversationList$default(this.this$0, false, 1, null);
        } catch (Exception e) {
            C43296rmc.copydefault("ConversationRefreshUseCaseImpl", "Failed to fetch relation info for senderId: " + this.$senderId, e);
        }
        return Unit.INSTANCE;
    }
}
