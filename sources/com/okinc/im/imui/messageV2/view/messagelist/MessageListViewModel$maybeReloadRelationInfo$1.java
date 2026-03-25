package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35858oGh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$maybeReloadRelationInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $latestMessage;
    final /* synthetic */ String $relationId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$maybeReloadRelationInfo$1(MessageListViewModel messageListViewModel, String str, OKMessage oKMessage, Continuation<? super MessageListViewModel$maybeReloadRelationInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListViewModel;
        this.$relationId = str;
        this.$latestMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListViewModel$maybeReloadRelationInfo$1 messageListViewModel$maybeReloadRelationInfo$1 = new MessageListViewModel$maybeReloadRelationInfo$1(this.this$0, this.$relationId, this.$latestMessage, continuation);
        messageListViewModel$maybeReloadRelationInfo$1.L$0 = obj;
        return messageListViewModel$maybeReloadRelationInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$maybeReloadRelationInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MessageListViewModel messageListViewModel = this.this$0;
                String str = this.$relationId;
                OKMessage oKMessage = this.$latestMessage;
                Result.Application application = Result.Companion;
                C35858oGh c35858oGh = messageListViewModel.getNewProxyInstance;
                this.label = 1;
                obj = c35858oGh.OLrzqt(str, oKMessage, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl((RelationInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
