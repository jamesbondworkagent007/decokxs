package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo;
import com.okinc.planet.biz_create_centre.domain.PlanetGetKeyMetricsUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47779twZ {
    public final tQV EZpvd;

    public C47779twZ(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.EZpvd = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super kotlin.Pair<OrbitCreateCentreInfo, java.lang.Integer>> continuation) throws java.lang.Throwable {
        PlanetGetKeyMetricsUseCase$invoke$1 planetGetKeyMetricsUseCase$invoke$1;
        if (continuation instanceof PlanetGetKeyMetricsUseCase$invoke$1) {
            planetGetKeyMetricsUseCase$invoke$1 = (PlanetGetKeyMetricsUseCase$invoke$1) continuation;
            int i = planetGetKeyMetricsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetKeyMetricsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetKeyMetricsUseCase$invoke$1 = new PlanetGetKeyMetricsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = planetGetKeyMetricsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetKeyMetricsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                tQV tqv = this.EZpvd;
                planetGetKeyMetricsUseCase$invoke$1.label = 1;
                objAEQbTJ = tqv.AEQbTJ(planetGetKeyMetricsUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return C56390yDp.OLrzqt(((AbstractC43419rot) objAEQbTJ).AEQbTJ(), C56443yFo.AEQbTJ(0));
        } catch (java.lang.Exception e) {
            return C56390yDp.OLrzqt(null, C56443yFo.AEQbTJ(e instanceof OKServerException ? ((OKServerException) e).getCode() : -1));
        }
    }
}
