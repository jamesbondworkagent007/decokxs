package com.okinc.planet.biz_notifications.ui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC47868tyI;
import o.C47925tzM;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class BaseNotificationFragment$initView$2 extends SuspendLambda implements Function2<C47925tzM.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC47868tyI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNotificationFragment$initView$2(AbstractC47868tyI abstractC47868tyI, Continuation<? super BaseNotificationFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractC47868tyI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseNotificationFragment$initView$2 baseNotificationFragment$initView$2 = new BaseNotificationFragment$initView$2(this.this$0, continuation);
        baseNotificationFragment$initView$2.L$0 = obj;
        return baseNotificationFragment$initView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C47925tzM.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((BaseNotificationFragment$initView$2) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C47925tzM.StateListAnimator stateListAnimator = (C47925tzM.StateListAnimator) this.L$0;
            pUU.KWHzl("PlanetNotification", this.this$0.AEQbTJ() + " received uiEvent: " + stateListAnimator + ", hasFollowItem=" + this.this$0.OLrzqt() + ", isConsumeCallback=" + this.this$0.KWHzl);
            if (!(stateListAnimator instanceof C47925tzM.StateListAnimator.C0971StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.this$0.OLrzqt() && !this.this$0.KWHzl) {
                C47925tzM.StateListAnimator.C0971StateListAnimator c0971StateListAnimator = (C47925tzM.StateListAnimator.C0971StateListAnimator) stateListAnimator;
                this.this$0.AEQbTJ(c0971StateListAnimator.copydefault(), c0971StateListAnimator.KWHzl(), c0971StateListAnimator.OLrzqt());
            }
            this.this$0.KWHzl = false;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
