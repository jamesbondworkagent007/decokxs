package o;

import com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse;
import com.okinc.planet.biz_content.leaderboard.usecase.PlanetGetSpotlightUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47661tuN implements InterfaceC47658tuK {
    public final tQV EZpvd;

    public C47661tuN(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.EZpvd = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC47658tuK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(int i, java.lang.Integer num, java.lang.String str, @NotNull Continuation<? super SpotlightListResponse> continuation) throws java.lang.Throwable {
        PlanetGetSpotlightUseCase$invoke$1 planetGetSpotlightUseCase$invoke$1;
        if (continuation instanceof PlanetGetSpotlightUseCase$invoke$1) {
            planetGetSpotlightUseCase$invoke$1 = (PlanetGetSpotlightUseCase$invoke$1) continuation;
            int i2 = planetGetSpotlightUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                planetGetSpotlightUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                planetGetSpotlightUseCase$invoke$1 = new PlanetGetSpotlightUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = planetGetSpotlightUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = planetGetSpotlightUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                tQV tqv = this.EZpvd;
                planetGetSpotlightUseCase$invoke$1.label = 1;
                objAEQbTJ = tqv.AEQbTJ(i, num, str, planetGetSpotlightUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return (SpotlightListResponse) ((AbstractC43419rot) objAEQbTJ).AEQbTJ();
        } catch (java.lang.Exception e) {
            pUU.copydefault("qjf", "PlanetGetSpotlightUseCase invoke exception = " + tRK.AEQbTJ(e));
            return null;
        }
    }
}
