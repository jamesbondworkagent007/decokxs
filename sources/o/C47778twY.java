package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo;
import com.okinc.planet.biz_create_centre.domain.PlanetGetEarningHistoryUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47778twY {
    public final tQV EZpvd;

    public C47778twY(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.EZpvd = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, long j2, @NotNull Continuation<? super kotlin.Pair<EarningsHistoryInfo, java.lang.Integer>> continuation) throws java.lang.Throwable {
        PlanetGetEarningHistoryUseCase$invoke$1 planetGetEarningHistoryUseCase$invoke$1;
        if (continuation instanceof PlanetGetEarningHistoryUseCase$invoke$1) {
            planetGetEarningHistoryUseCase$invoke$1 = (PlanetGetEarningHistoryUseCase$invoke$1) continuation;
            int i = planetGetEarningHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetEarningHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetEarningHistoryUseCase$invoke$1 = new PlanetGetEarningHistoryUseCase$invoke$1(this, continuation);
            }
        }
        PlanetGetEarningHistoryUseCase$invoke$1 planetGetEarningHistoryUseCase$invoke$12 = planetGetEarningHistoryUseCase$invoke$1;
        java.lang.Object objEZpvd = planetGetEarningHistoryUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetEarningHistoryUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                tQV tqv = this.EZpvd;
                planetGetEarningHistoryUseCase$invoke$12.label = 1;
                objEZpvd = tqv.EZpvd(j, j2, planetGetEarningHistoryUseCase$invoke$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return C56390yDp.OLrzqt(((AbstractC43419rot) objEZpvd).AEQbTJ(), C56443yFo.AEQbTJ(0));
        } catch (java.lang.Exception e) {
            return C56390yDp.OLrzqt(null, C56443yFo.AEQbTJ(e instanceof OKServerException ? ((OKServerException) e).getCode() : -1));
        }
    }
}
