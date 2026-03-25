package com.okinc.planet.biz_orbit_upgrade;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeBottomSheet$Companion$show$1;
import com.okinc.planet.manager.OrbitStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C33070mpX;
import o.C46388tSm;
import o.C47501trL;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.tAB;
import o.tAI;
import o.tTY;
import o.tUB;

/* JADX INFO: loaded from: classes16.dex */
public final class OrbitVipUpgradeBottomSheet$Companion$show$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<Boolean, Unit> $upgradeCallback;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrbitVipUpgradeBottomSheet$Companion$show$1(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1, Continuation<? super OrbitVipUpgradeBottomSheet$Companion$show$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$upgradeCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrbitVipUpgradeBottomSheet$Companion$show$1 orbitVipUpgradeBottomSheet$Companion$show$1 = new OrbitVipUpgradeBottomSheet$Companion$show$1(this.$activity, this.$upgradeCallback, continuation);
        orbitVipUpgradeBottomSheet$Companion$show$1.L$0 = obj;
        return orbitVipUpgradeBottomSheet$Companion$show$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitVipUpgradeBottomSheet$Companion$show$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FragmentActivity fragmentActivity = this.$activity;
            if (fragmentActivity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) fragmentActivity).showLoading();
            }
            C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = c46388tSmKWHzl.EZpvd(this);
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
        pUU.EZpvd("zhoulijuan", String.valueOf(orbitBeanResp));
        FragmentActivity fragmentActivity2 = this.$activity;
        if (fragmentActivity2 instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) fragmentActivity2).dismissLoading();
        }
        if (orbitBeanResp != null) {
            final Function1<Boolean, Unit> function1 = this.$upgradeCallback;
            FragmentActivity fragmentActivity3 = this.$activity;
            OrbitStatus orbitStatusAEQbTJ = OrbitStatus.Companion.AEQbTJ(orbitBeanResp.getOrbitLevel());
            if (!orbitStatusAEQbTJ.isOrbitPlus()) {
                if (orbitStatusAEQbTJ.isOrbiter()) {
                    tAI tai = new tAI();
                    FragmentManager supportFragmentManager = fragmentActivity3.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    tai.show(supportFragmentManager);
                    tai.EZpvd(new Function1() { // from class: o.tAG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OrbitVipUpgradeBottomSheet$Companion$show$1.invokeSuspend$lambda$1$lambda$0(function1, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    tAB tab = new tAB();
                    FragmentManager supportFragmentManager2 = fragmentActivity3.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    tab.show(supportFragmentManager2);
                }
                unit = Unit.INSTANCE;
            } else if (function1 != null) {
                function1.invoke(C56443yFo.KWHzl(true));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                Function1<Boolean, Unit> function12 = this.$upgradeCallback;
                if (function12 != null) {
                    function12.invoke(C56443yFo.KWHzl(false));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(Function1 function1, boolean z) {
        tTY.EZpvd.AEQbTJ(tUB.copydefault.EZpvd(), C33070mpX.AYXKKw(C47501trL.Fragment.DPHNDa));
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
