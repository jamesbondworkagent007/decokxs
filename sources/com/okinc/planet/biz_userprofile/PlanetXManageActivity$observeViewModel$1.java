package com.okinc.planet.biz_userprofile;

import android.app.Activity;
import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.ActivityC46184tKy;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetXManageActivity$observeViewModel$1 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends PlanetTwitterBindingInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46184tKy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageActivity$observeViewModel$1(ActivityC46184tKy activityC46184tKy, Continuation<? super PlanetXManageActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC46184tKy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetXManageActivity$observeViewModel$1 planetXManageActivity$observeViewModel$1 = new PlanetXManageActivity$observeViewModel$1(this.this$0, continuation);
        planetXManageActivity$observeViewModel$1.L$0 = obj;
        return planetXManageActivity$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends PlanetTwitterBindingInfo> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<PlanetTwitterBindingInfo>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<PlanetTwitterBindingInfo> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((PlanetXManageActivity$observeViewModel$1) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                if (((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).KWHzl()) {
                    this.this$0.showLoadingWithLogo();
                }
                this.this$0.KWHzl(false, false);
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                this.this$0.dismissLoadingWithLogo();
                this.this$0.KWHzl(true, false);
                this.this$0.EZpvd((PlanetTwitterBindingInfo) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault());
                if (!this.this$0.OLrzqt) {
                    this.this$0.OLrzqt = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else {
                if (!(abstractC46197tLk instanceof AbstractC46197tLk.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.dismissLoadingWithLogo();
                this.this$0.KWHzl(false, true);
                this.this$0.KWHzl(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                if (!this.this$0.OLrzqt) {
                    this.this$0.OLrzqt = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
