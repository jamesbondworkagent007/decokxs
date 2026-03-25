package o;

import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_onboarding.data.OrbitOnboardingRequst;
import com.okinc.planet.biz_onboarding.domain.PlanetSetOrbitDataUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tAD {
    public final tQV EZpvd;

    public tAD(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.EZpvd = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super OrbitBeanResp> continuation) throws java.lang.Throwable {
        PlanetSetOrbitDataUseCase$invoke$1 planetSetOrbitDataUseCase$invoke$1;
        if (continuation instanceof PlanetSetOrbitDataUseCase$invoke$1) {
            planetSetOrbitDataUseCase$invoke$1 = (PlanetSetOrbitDataUseCase$invoke$1) continuation;
            int i = planetSetOrbitDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetSetOrbitDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetSetOrbitDataUseCase$invoke$1 = new PlanetSetOrbitDataUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetSetOrbitDataUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetSetOrbitDataUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                tQV tqv = this.EZpvd;
                OrbitOnboardingRequst orbitOnboardingRequst = new OrbitOnboardingRequst(num, num2);
                planetSetOrbitDataUseCase$invoke$1.label = 1;
                objKWHzl = tqv.KWHzl(orbitOnboardingRequst, planetSetOrbitDataUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (OrbitBeanResp) ((AbstractC43419rot) objKWHzl).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
