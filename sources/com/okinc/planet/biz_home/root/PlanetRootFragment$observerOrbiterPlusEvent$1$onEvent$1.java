package com.okinc.planet.biz_home.root;

import androidx.fragment.app.FragmentManager;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C46386tSk;
import o.C46388tSm;
import o.C47892tyg;
import o.C47893tyh;
import o.C47911tyz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47893tyh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1(C47893tyh c47893tyh, Continuation<? super PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c47893tyh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47911tyz c47911tyzKWHzl = this.this$0.KWHzl();
            this.label = 1;
            obj = c47911tyzKWHzl.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        OrbitBeanResp orbitBeanResp = (OrbitBeanResp) obj;
        if (orbitBeanResp != null) {
            C47893tyh c47893tyh = this.this$0;
            Integer orbiterPlusExpireStatus = orbitBeanResp.getOrbiterPlusExpireStatus();
            if (orbiterPlusExpireStatus != null && orbiterPlusExpireStatus.intValue() == 2) {
                C46386tSk c46386tSk = C46386tSk.copydefault;
                C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
                boolean zAhwBna = c46386tSk.AhwBna(taskDescription.KWHzl().copydefault());
                boolean zDjBIcL = c46386tSk.djBIcL(taskDescription.KWHzl().copydefault());
                Integer orbiterPlusDaysLeft = orbitBeanResp.getOrbiterPlusDaysLeft();
                int iIntValue = orbiterPlusDaysLeft != null ? orbiterPlusDaysLeft.intValue() : 0;
                if (iIntValue > 3 && !zAhwBna) {
                    C47892tyg c47892tygEZpvd = C47892tyg.Companion.EZpvd(2, iIntValue);
                    FragmentManager parentFragmentManager = c47893tyh.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    c47892tygEZpvd.show(parentFragmentManager);
                    c46386tSk.ejfBZ(taskDescription.KWHzl().copydefault());
                } else if (iIntValue <= 3 && !zDjBIcL) {
                    C47892tyg c47892tygEZpvd2 = C47892tyg.Companion.EZpvd(2, iIntValue);
                    FragmentManager parentFragmentManager2 = c47893tyh.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                    c47892tygEZpvd2.show(parentFragmentManager2);
                    c46386tSk.fARcdN(taskDescription.KWHzl().copydefault());
                }
            } else if (orbiterPlusExpireStatus != null && orbiterPlusExpireStatus.intValue() == 3) {
                C46386tSk c46386tSk2 = C46386tSk.copydefault;
                C46388tSm.TaskDescription taskDescription2 = C46388tSm.Companion;
                if (!c46386tSk2.gEmmrt(taskDescription2.KWHzl().copydefault())) {
                    C47892tyg c47892tygEZpvd3 = C47892tyg.Companion.EZpvd(3, 0);
                    FragmentManager parentFragmentManager3 = c47893tyh.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager3, "");
                    c47892tygEZpvd3.show(parentFragmentManager3);
                    c46386tSk2.fJNWhG(taskDescription2.KWHzl().copydefault());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
