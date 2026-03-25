package o;

import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.biz_content.leaderboard.usecase.PlanetGetRecommendOrbitersUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47660tuM {
    public final tQV KWHzl;

    public C47660tuM(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.KWHzl = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super java.util.List<TopOrbiter>> continuation) throws java.lang.Throwable {
        PlanetGetRecommendOrbitersUseCase$invoke$1 planetGetRecommendOrbitersUseCase$invoke$1;
        if (continuation instanceof PlanetGetRecommendOrbitersUseCase$invoke$1) {
            planetGetRecommendOrbitersUseCase$invoke$1 = (PlanetGetRecommendOrbitersUseCase$invoke$1) continuation;
            int i = planetGetRecommendOrbitersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetRecommendOrbitersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetRecommendOrbitersUseCase$invoke$1 = new PlanetGetRecommendOrbitersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = planetGetRecommendOrbitersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetRecommendOrbitersUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objValueOf);
                tQV tqv = this.KWHzl;
                planetGetRecommendOrbitersUseCase$invoke$1.label = 1;
                objValueOf = tqv.valueOf(str, planetGetRecommendOrbitersUseCase$invoke$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objValueOf);
            }
            return (java.util.List) ((AbstractC43419rot) objValueOf).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
