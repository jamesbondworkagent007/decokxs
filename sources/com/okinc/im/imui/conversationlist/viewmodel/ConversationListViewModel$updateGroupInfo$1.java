package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$updateGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$updateGroupInfo$1(ConversationListViewModel conversationListViewModel, String str, Continuation<? super ConversationListViewModel$updateGroupInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$updateGroupInfo$1 conversationListViewModel$updateGroupInfo$1 = new ConversationListViewModel$updateGroupInfo$1(this.this$0, this.$channelId, continuation);
        conversationListViewModel$updateGroupInfo$1.L$0 = obj;
        return conversationListViewModel$updateGroupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$updateGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ConversationListViewModel conversationListViewModel = this.this$0;
                String str = this.$channelId;
                Result.Application application = Result.Companion;
                oDA oda = conversationListViewModel.fZBcTu;
                this.label = 1;
                obj = oda.copydefault(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl((GroupInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
