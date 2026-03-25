package com.okinc.planet.biz_notifications.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47925tzM;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ String $followStatusV2;
    final /* synthetic */ Boolean $isFollowing;
    int label;
    final /* synthetic */ C47925tzM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1(C47925tzM c47925tzM, String str, Boolean bool, String str2, Continuation<? super NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1> continuation) {
        super(2, continuation);
        this.this$0 = c47925tzM;
        this.$authorId = str;
        this.$isFollowing = bool;
        this.$followStatusV2 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1(this.this$0, this.$authorId, this.$isFollowing, this.$followStatusV2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            C47925tzM.StateListAnimator.C0971StateListAnimator c0971StateListAnimator = new C47925tzM.StateListAnimator.C0971StateListAnimator(this.$authorId, this.$isFollowing.booleanValue(), this.$followStatusV2);
            this.label = 1;
            if (mutableSharedFlow.emit(c0971StateListAnimator, this) == objCopydefault) {
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
