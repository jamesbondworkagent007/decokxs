package com.okinc.planet.biz_onboarding;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.ActivityC45902tAm;
import o.C46234tMu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitIntroductionActivity$handleStepAnimationEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ ActivityC45902tAm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitIntroductionActivity$handleStepAnimationEnd$1(ActivityC45902tAm activityC45902tAm, int i, Continuation<? super OrbitIntroductionActivity$handleStepAnimationEnd$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC45902tAm;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitIntroductionActivity$handleStepAnimationEnd$1(this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitIntroductionActivity$handleStepAnimationEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C46234tMu c46234tMuOLrzqt = this.this$0.OLrzqt();
        if (c46234tMuOLrzqt == null) {
            return Unit.INSTANCE;
        }
        if (!this.this$0.AYXKKw && !this.this$0.fetchVPNInfo) {
            int currentItem = c46234tMuOLrzqt.AYXKKw.getCurrentItem();
            int i2 = this.$position;
            if (currentItem == i2) {
                c46234tMuOLrzqt.AYXKKw.setCurrentItem(i2 + 1, true);
            }
        }
        return Unit.INSTANCE;
    }
}
