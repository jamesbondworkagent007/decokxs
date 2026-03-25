package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$refreshRelationInfo$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RelationInfo $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$refreshRelationInfo$4$1(MessageListMainViewModel messageListMainViewModel, RelationInfo relationInfo, Continuation<? super MessageListMainViewModel$refreshRelationInfo$4$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
        this.$result = relationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListMainViewModel$refreshRelationInfo$4$1 messageListMainViewModel$refreshRelationInfo$4$1 = new MessageListMainViewModel$refreshRelationInfo$4$1(this.this$0, this.$result, continuation);
        messageListMainViewModel$refreshRelationInfo$4$1.L$0 = obj;
        return messageListMainViewModel$refreshRelationInfo$4$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$refreshRelationInfo$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MessageListMainViewModel messageListMainViewModel = this.this$0;
                RelationInfo relationInfo = this.$result;
                Result.Application application = Result.Companion;
                MutableStateFlow mutableStateFlow = messageListMainViewModel.fIwbmz;
                Boolean allowVoice = relationInfo.getAllowVoice();
                Boolean boolKWHzl = C56443yFo.KWHzl(allowVoice != null ? allowVoice.booleanValue() : true);
                this.label = 1;
                if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
