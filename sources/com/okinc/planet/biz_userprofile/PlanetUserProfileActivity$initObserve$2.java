package com.okinc.planet.biz_userprofile;

import android.app.Activity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C46189tLc;
import o.C46471tVo;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tJI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$initObserve$2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends C46189tLc>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$initObserve$2(tJI tji, Continuation<? super PlanetUserProfileActivity$initObserve$2> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileActivity$initObserve$2 planetUserProfileActivity$initObserve$2 = new PlanetUserProfileActivity$initObserve$2(this.this$0, continuation);
        planetUserProfileActivity$initObserve$2.L$0 = obj;
        return planetUserProfileActivity$initObserve$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends C46189tLc> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<C46189tLc>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<C46189tLc> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$initObserve$2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            C46471tVo c46471tVo = this.this$0.gEmmrt().djBIcL;
            Intrinsics.checkNotNullExpressionValue(c46471tVo, "");
            boolean z = abstractC46197tLk instanceof AbstractC46197tLk.Activity;
            c46471tVo.setVisibility(z ? 0 : 8);
            CoordinatorLayout coordinatorLayout = this.this$0.gEmmrt().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "");
            coordinatorLayout.setVisibility(z ? 8 : 0);
            if (z) {
                this.this$0.gEmmrt().gHZMYf.copydefault();
                C46471tVo c46471tVo2 = this.this$0.gEmmrt().djBIcL;
                final tJI tji = this.this$0;
                C46471tVo.setNetworkError$default(c46471tVo2, 0, 0, 0, 0, new Function0() { // from class: o.tKp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PlanetUserProfileActivity$initObserve$2.invokeSuspend$lambda$0(tji);
                    }
                }, 15, null);
                if (!this.this$0.DbNXlk) {
                    this.this$0.DbNXlk = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                tJI tji2 = this.this$0;
                tji2.copydefault(tji2.gEmmrt(), (C46189tLc) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault());
                this.this$0.gEmmrt().gHZMYf.copydefault();
                if (!this.this$0.DbNXlk) {
                    this.this$0.DbNXlk = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(tJI tji) {
        tji.getFieldNames().fARcdN();
        return Unit.INSTANCE;
    }
}
