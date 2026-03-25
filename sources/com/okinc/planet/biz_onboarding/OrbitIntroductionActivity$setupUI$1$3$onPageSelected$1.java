package com.okinc.planet.biz_onboarding;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.ActivityC45902tAm;
import o.C45914tAy;
import o.C46234tMu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $outgoingPage;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ ActivityC45902tAm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1(ActivityC45902tAm activityC45902tAm, int i, int i2, Continuation<? super OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC45902tAm;
        this.$position = i;
        this.$outgoingPage = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1(this.this$0, this.$position, this.$outgoingPage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == objCopydefault) {
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
        LinearLayout linearLayout = c46234tMuOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() != 0) {
            return Unit.INSTANCE;
        }
        if (c46234tMuOLrzqt.AYXKKw.getCurrentItem() != this.$position) {
            return Unit.INSTANCE;
        }
        C45914tAy c45914tAy = this.this$0.OLrzqt;
        if (c45914tAy == null) {
            Intrinsics.gEmmrt("");
            c45914tAy = null;
        }
        c45914tAy.OLrzqt(this.$outgoingPage);
        return Unit.INSTANCE;
    }
}
