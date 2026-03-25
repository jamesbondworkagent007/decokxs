package com.okinc.im.imui.conversationlist.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33842nHw;
import o.C35837oFn;
import o.C56391yDq;
import o.C56442yFn;
import o.rXL;

/* JADX INFO: loaded from: classes18.dex */
public final class MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ rXL $it;
    int label;
    final /* synthetic */ C33842nHw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1(C33842nHw c33842nHw, rXL rxl, Continuation<? super MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c33842nHw;
        this.$it = rxl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35837oFn c35837oFn = this.this$0.AEQbTJ;
            rXL rxl = this.$it;
            this.label = 1;
            obj = C35837oFn.execute$default(c35837oFn, rxl, false, this, 2, null);
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
