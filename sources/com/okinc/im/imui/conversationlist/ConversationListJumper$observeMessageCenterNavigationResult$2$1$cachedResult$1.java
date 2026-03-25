package com.okinc.im.imui.conversationlist;

import com.okinc.core.util.SPUtils;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33791nFz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MessageCenterNavigation>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1(Continuation<? super ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1 conversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1 = new ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1(continuation);
        conversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1.L$0 = obj;
        return conversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MessageCenterNavigation> continuation) {
        return ((ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = SPUtils.getString(C33791nFz.KWHzl.copydefault(), "");
            try {
                Result.Application application = Result.Companion;
                Intrinsics.copydefault((Object) string);
                objM7377constructorimpl = Result.m7377constructorimpl(string.length() > 0 ? MessageCenterNavigation.valueOf(string) : null);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
