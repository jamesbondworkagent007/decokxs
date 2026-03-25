package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oGL;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$preloadUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$preloadUserInfo$1(MessageListMainViewModel messageListMainViewModel, Continuation<? super MessageListMainViewModel$preloadUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListMainViewModel$preloadUserInfo$1 messageListMainViewModel$preloadUserInfo$1 = new MessageListMainViewModel$preloadUserInfo$1(this.this$0, continuation);
        messageListMainViewModel$preloadUserInfo$1.L$0 = obj;
        return messageListMainViewModel$preloadUserInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$preloadUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MessageListMainViewModel messageListMainViewModel = this.this$0;
                Result.Application application = Result.Companion;
                oGL ogl = messageListMainViewModel.QOLQEE;
                this.label = 1;
                obj = oGL.execute$default(ogl, false, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((UserInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("MessageListMainViewModel", "[preloadUserInfo] failed: " + thM7380exceptionOrNullimpl.getMessage());
            objM7377constructorimpl = null;
        }
        UserInfo userInfo = (UserInfo) objM7377constructorimpl;
        pUU.KWHzl("MessageListMainViewModel", "[preloadUserInfo] userId:" + (userInfo != null ? userInfo.getIdentifyId() : null));
        if (userInfo != null) {
            this.this$0.fZBcTu = true;
            this.this$0.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}
