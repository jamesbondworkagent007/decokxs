package com.okinc.planet.biz_notifications.viewmodel;

import com.okinc.planet.domain.remote.dto.UnreadMsgListResp;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C46351tRc;
import o.C47931tzS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class NotificationsViewModel$getUnreadMsgList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cursor;
    final /* synthetic */ Function1<Exception, Unit> $error;
    final /* synthetic */ Function1<UnreadMsgListResp, Unit> $success;
    int label;
    final /* synthetic */ C47931tzS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.domain.remote.dto.UnreadMsgListResp, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsViewModel$getUnreadMsgList$1(C47931tzS c47931tzS, String str, Function1<? super UnreadMsgListResp, Unit> function1, Function1<? super Exception, Unit> function12, Continuation<? super NotificationsViewModel$getUnreadMsgList$1> continuation) {
        super(2, continuation);
        this.this$0 = c47931tzS;
        this.$cursor = str;
        this.$success = function1;
        this.$error = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationsViewModel$getUnreadMsgList$1(this.this$0, this.$cursor, this.$success, this.$error, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationsViewModel$getUnreadMsgList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46351tRc c46351tRc = this.this$0.djBIcL;
            PlanetNotificationCategory planetNotificationCategoryCopydefault = this.this$0.copydefault();
            String str = this.$cursor;
            this.label = 1;
            obj = c46351tRc.KWHzl(planetNotificationCategoryCopydefault, 20, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            this.$success.invoke((UnreadMsgListResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            this.$error.invoke((Exception) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        return Unit.INSTANCE;
    }
}
