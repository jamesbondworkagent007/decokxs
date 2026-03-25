package o;

import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_onboarding.domain.PlanetGetOrbitDataUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tAC {
    public final tQV OLrzqt;

    public tAC(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.OLrzqt = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super OrbitBeanResp> continuation) throws java.lang.Throwable {
        PlanetGetOrbitDataUseCase$invoke$1 planetGetOrbitDataUseCase$invoke$1;
        if (continuation instanceof PlanetGetOrbitDataUseCase$invoke$1) {
            planetGetOrbitDataUseCase$invoke$1 = (PlanetGetOrbitDataUseCase$invoke$1) continuation;
            int i = planetGetOrbitDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetOrbitDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetOrbitDataUseCase$invoke$1 = new PlanetGetOrbitDataUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = planetGetOrbitDataUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetOrbitDataUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                tQV tqv = this.OLrzqt;
                planetGetOrbitDataUseCase$invoke$1.label = 1;
                objEZpvd = tqv.EZpvd(planetGetOrbitDataUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return (OrbitBeanResp) ((AbstractC43419rot) objEZpvd).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
