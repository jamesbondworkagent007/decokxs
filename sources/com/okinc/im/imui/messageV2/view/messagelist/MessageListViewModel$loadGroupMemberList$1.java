package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.oCE;
import o.oDO;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$loadGroupMemberList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$loadGroupMemberList$1(MessageListViewModel messageListViewModel, String str, Continuation<? super MessageListViewModel$loadGroupMemberList$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListViewModel;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListViewModel$loadGroupMemberList$1 messageListViewModel$loadGroupMemberList$1 = new MessageListViewModel$loadGroupMemberList$1(this.this$0, this.$channelId, continuation);
        messageListViewModel$loadGroupMemberList$1.L$0 = obj;
        return messageListViewModel$loadGroupMemberList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$loadGroupMemberList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MessageListViewModel messageListViewModel = this.this$0;
            String str = this.$channelId;
            Result.Application application3 = Result.Companion;
            oCE oce = messageListViewModel.iwGUEr;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = oce.OLrzqt(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl2 = Result.m7377constructorimpl((List) obj);
                String str2 = this.$channelId;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    pUU.KWHzl("MessageListViewModel", "channel[" + str2 + "] => succeeded to load all member list, size=" + ((List) objM7377constructorimpl2).size());
                }
                String str3 = this.$channelId;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl("MessageListViewModel", "channel[" + str3 + "] => failed to load all member list, error: " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                }
                Result.m7376boximpl(objM7377constructorimpl2);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) obj);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        OKConversation oKConversation = (OKConversation) objM7377constructorimpl;
        boolean z = (oKConversation != null ? oKConversation.getConversationType() : null) == OKConversationType.GROUP;
        if (oKConversation != null && z) {
            MessageListViewModel messageListViewModel2 = this.this$0;
            String str4 = this.$channelId;
            Result.Application application4 = Result.Companion;
            oDO odo = messageListViewModel2.uzCIH;
            this.L$0 = null;
            this.label = 2;
            obj = odo.EZpvd(str4, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl((List) obj);
            String str22 = this.$channelId;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
            }
            String str32 = this.$channelId;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl != null) {
            }
            Result.m7376boximpl(objM7377constructorimpl2);
        }
        return Unit.INSTANCE;
    }
}
