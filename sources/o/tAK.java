package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.domain.OrbitUpgradeRequst;
import com.okinc.planet.biz_orbit_upgrade.domain.PlanetUpgradeOrbitUseCase$invoke$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tAK {
    public final tQV copydefault;

    public tAK(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.copydefault = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(int i, @NotNull Continuation<? super kotlin.Pair<OrbitBeanResp, OKServerException>> continuation) throws java.lang.Throwable {
        PlanetUpgradeOrbitUseCase$invoke$1 planetUpgradeOrbitUseCase$invoke$1;
        if (continuation instanceof PlanetUpgradeOrbitUseCase$invoke$1) {
            planetUpgradeOrbitUseCase$invoke$1 = (PlanetUpgradeOrbitUseCase$invoke$1) continuation;
            int i2 = planetUpgradeOrbitUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                planetUpgradeOrbitUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                planetUpgradeOrbitUseCase$invoke$1 = new PlanetUpgradeOrbitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetUpgradeOrbitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = planetUpgradeOrbitUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                tQV tqv = this.copydefault;
                OrbitUpgradeRequst orbitUpgradeRequst = new OrbitUpgradeRequst(i);
                planetUpgradeOrbitUseCase$invoke$1.label = 1;
                objKWHzl = tqv.KWHzl(orbitUpgradeRequst, planetUpgradeOrbitUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                return C56390yDp.OLrzqt(((AbstractC43419rot.StateListAnimator) abstractC43419rot).AEQbTJ(), null);
            }
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                return C56390yDp.OLrzqt(null, ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
            }
            throw new NoWhenBranchMatchedException();
        } catch (java.lang.Exception unused) {
            return C56390yDp.OLrzqt(null, null);
        }
    }
}
