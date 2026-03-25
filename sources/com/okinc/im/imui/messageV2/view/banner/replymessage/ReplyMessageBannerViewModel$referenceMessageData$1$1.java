package com.okinc.im.imui.messageV2.view.banner.replymessage;

import androidx.lifecycle.LiveDataScope;
import com.okinc.im.imui.messageV2.view.banner.replymessage.ReplyMessageBannerViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ReplyMessageBannerViewModel$referenceMessageData$1$1 extends SuspendLambda implements Function2<LiveDataScope<ReplyMessageBannerViewModel.ActionBar>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReplyMessageBannerViewModel$referenceMessageData$1$1(Continuation<? super ReplyMessageBannerViewModel$referenceMessageData$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReplyMessageBannerViewModel$referenceMessageData$1$1 replyMessageBannerViewModel$referenceMessageData$1$1 = new ReplyMessageBannerViewModel$referenceMessageData$1$1(continuation);
        replyMessageBannerViewModel$referenceMessageData$1$1.L$0 = obj;
        return replyMessageBannerViewModel$referenceMessageData$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ReplyMessageBannerViewModel.ActionBar> liveDataScope, Continuation<? super Unit> continuation) {
        return ((ReplyMessageBannerViewModel$referenceMessageData$1$1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            this.label = 1;
            if (liveDataScope.emit(null, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
