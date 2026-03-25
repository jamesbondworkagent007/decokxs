package com.okinc.im.imui.conversationlist;

import com.okinc.core.util.SPUtils;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C33791nFz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sDZ;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListJumper$checkMessageCenterNavigationResultAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MessageCenterNavigation>, Object> {
    final /* synthetic */ boolean $allowRedirectToNotificationCenter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListJumper$checkMessageCenterNavigationResultAsync$2(boolean z, Continuation<? super ConversationListJumper$checkMessageCenterNavigationResultAsync$2> continuation) {
        super(2, continuation);
        this.$allowRedirectToNotificationCenter = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$checkMessageCenterNavigationResultAsync$2 conversationListJumper$checkMessageCenterNavigationResultAsync$2 = new ConversationListJumper$checkMessageCenterNavigationResultAsync$2(this.$allowRedirectToNotificationCenter, continuation);
        conversationListJumper$checkMessageCenterNavigationResultAsync$2.L$0 = obj;
        return conversationListJumper$checkMessageCenterNavigationResultAsync$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MessageCenterNavigation> continuation) {
        return ((ConversationListJumper$checkMessageCenterNavigationResultAsync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                pUU.EZpvd("ConversationListJumper", "checkMessageCenterNavigationResultAsync: fetching fresh conversation count");
                Flow<Integer> flowAEQbTJ = sDZ.AEQbTJ.AYXKKw().AEQbTJ();
                this.label = 1;
                obj = FlowKt.first(flowAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (((Number) obj).intValue() <= 0) {
                z = false;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ConversationListJumper", "checkMessageCenterNavigationResultAsync: failed to get conversation count", thM7380exceptionOrNullimpl);
            Boolean bool = (Boolean) C33791nFz.AEQbTJ.get();
            objM7377constructorimpl = C56443yFo.KWHzl(bool != null ? bool.booleanValue() : false);
        }
        boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
        C33791nFz.AEQbTJ.set(C56443yFo.KWHzl(zBooleanValue));
        C33791nFz c33791nFz = C33791nFz.KWHzl;
        MessageCenterNavigation messageCenterNavigationKWHzl = c33791nFz.KWHzl(this.$allowRedirectToNotificationCenter, C56443yFo.KWHzl(zBooleanValue));
        SPUtils.put(c33791nFz.copydefault(), messageCenterNavigationKWHzl.name());
        return messageCenterNavigationKWHzl;
    }
}
