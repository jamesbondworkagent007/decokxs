package o;

import com.okinc.planet.domain.usecase.PlanetPublisherAgreeTncUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46355tRg implements tQT {
    public final tQV AEQbTJ;

    public C46355tRg(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.AEQbTJ = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.tQT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        PlanetPublisherAgreeTncUseCase$invoke$1 planetPublisherAgreeTncUseCase$invoke$1;
        if (continuation instanceof PlanetPublisherAgreeTncUseCase$invoke$1) {
            planetPublisherAgreeTncUseCase$invoke$1 = (PlanetPublisherAgreeTncUseCase$invoke$1) continuation;
            int i = planetPublisherAgreeTncUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherAgreeTncUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherAgreeTncUseCase$invoke$1 = new PlanetPublisherAgreeTncUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetPublisherAgreeTncUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherAgreeTncUseCase$invoke$1.label;
        boolean z2 = true;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                tQV tqv = this.AEQbTJ;
                planetPublisherAgreeTncUseCase$invoke$1.label = 1;
                objKWHzl = tqv.KWHzl(z, planetPublisherAgreeTncUseCase$invoke$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ((AbstractC43419rot) objKWHzl).AEQbTJ();
        } catch (java.lang.Exception unused) {
            z2 = false;
        }
        return C56443yFo.KWHzl(z2);
    }
}
