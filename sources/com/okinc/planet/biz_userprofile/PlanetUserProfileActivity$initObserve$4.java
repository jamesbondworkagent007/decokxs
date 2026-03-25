package com.okinc.planet.biz_userprofile;

import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tJI;
import o.tKX;
import o.tLX;
import o.tWN;
import o.tWO;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$initObserve$4 extends SuspendLambda implements Function2<tLX.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$initObserve$4(tJI tji, Continuation<? super PlanetUserProfileActivity$initObserve$4> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileActivity$initObserve$4 planetUserProfileActivity$initObserve$4 = new PlanetUserProfileActivity$initObserve$4(this.this$0, continuation);
        planetUserProfileActivity$initObserve$4.L$0 = obj;
        return planetUserProfileActivity$initObserve$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tLX.Application application, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$initObserve$4) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            tLX.Application application = (tLX.Application) this.L$0;
            if (application instanceof tLX.Application.StateListAnimator) {
                C55326xho.toastWithFailedIcon$default(((tLX.Application.StateListAnimator) application).EZpvd(), 0, 1, (Object) null);
            } else if (application instanceof tLX.Application.ActionBar) {
                C56443yFo.KWHzl(tWN.OLrzqt.EZpvd(new tWO(this.this$0.getFieldNames().AhwBna(), ((tLX.Application.ActionBar) application).EZpvd())));
            } else {
                if (!(application instanceof tLX.Application.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                tKX.openProfileEditPage$default(tKX.Companion.OLrzqt(), this.this$0, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, null, 8, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
