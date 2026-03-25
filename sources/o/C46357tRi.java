package o;

import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.domain.usecase.PlanetPublisherPermissionUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46357tRi implements tQR {
    public final tQV AEQbTJ;

    public C46357tRi(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.AEQbTJ = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.tQR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super kotlin.Pair<PublishPermissionResp, java.lang.String>> continuation) throws java.lang.Throwable {
        PlanetPublisherPermissionUseCase$invoke$1 planetPublisherPermissionUseCase$invoke$1;
        if (continuation instanceof PlanetPublisherPermissionUseCase$invoke$1) {
            planetPublisherPermissionUseCase$invoke$1 = (PlanetPublisherPermissionUseCase$invoke$1) continuation;
            int i = planetPublisherPermissionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherPermissionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherPermissionUseCase$invoke$1 = new PlanetPublisherPermissionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetPublisherPermissionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherPermissionUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                tQV tqv = this.AEQbTJ;
                planetPublisherPermissionUseCase$invoke$1.label = 1;
                objKWHzl = tqv.KWHzl(str, planetPublisherPermissionUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return C56390yDp.OLrzqt((PublishPermissionResp) ((AbstractC43419rot) objKWHzl).AEQbTJ(), null);
        } catch (java.lang.Exception e) {
            return C56390yDp.OLrzqt(null, e.getMessage());
        }
    }
}
