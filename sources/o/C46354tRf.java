package o;

import com.okinc.planet.domain.data.OrbitSimpleInfo;
import com.okinc.planet.domain.usecase.PlanetGetOrbitSimpleInfoUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46354tRf implements tQU {
    public final tQV KWHzl;

    public C46354tRf(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.KWHzl = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.tQU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super OrbitSimpleInfo> continuation) throws java.lang.Throwable {
        PlanetGetOrbitSimpleInfoUseCase$invoke$1 planetGetOrbitSimpleInfoUseCase$invoke$1;
        if (continuation instanceof PlanetGetOrbitSimpleInfoUseCase$invoke$1) {
            planetGetOrbitSimpleInfoUseCase$invoke$1 = (PlanetGetOrbitSimpleInfoUseCase$invoke$1) continuation;
            int i = planetGetOrbitSimpleInfoUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetOrbitSimpleInfoUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetOrbitSimpleInfoUseCase$invoke$1 = new PlanetGetOrbitSimpleInfoUseCase$invoke$1(this, continuation);
            }
        }
        PlanetGetOrbitSimpleInfoUseCase$invoke$1 planetGetOrbitSimpleInfoUseCase$invoke$12 = planetGetOrbitSimpleInfoUseCase$invoke$1;
        java.lang.Object objAEQbTJ = planetGetOrbitSimpleInfoUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetOrbitSimpleInfoUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                tQV tqv = this.KWHzl;
                planetGetOrbitSimpleInfoUseCase$invoke$12.label = 1;
                objAEQbTJ = tqv.AEQbTJ(str, str2, str3, str4, planetGetOrbitSimpleInfoUseCase$invoke$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return (OrbitSimpleInfo) ((AbstractC43419rot) objAEQbTJ).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
