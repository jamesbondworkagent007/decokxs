package o;

import com.okinc.planet.biz_search.model.OrbitKolSearchResult;
import com.okinc.planet.biz_search.usecase.PlanetGetSearchKolListUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46093tHo implements InterfaceC46090tHl {
    public final tQV OLrzqt;

    public C46093tHo(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.OLrzqt = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC46090tHl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super OrbitKolSearchResult> continuation) throws java.lang.Throwable {
        PlanetGetSearchKolListUseCase$invoke$1 planetGetSearchKolListUseCase$invoke$1;
        if (continuation instanceof PlanetGetSearchKolListUseCase$invoke$1) {
            planetGetSearchKolListUseCase$invoke$1 = (PlanetGetSearchKolListUseCase$invoke$1) continuation;
            int i = planetGetSearchKolListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetSearchKolListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetSearchKolListUseCase$invoke$1 = new PlanetGetSearchKolListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = planetGetSearchKolListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetSearchKolListUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                tQV tqv = this.OLrzqt;
                planetGetSearchKolListUseCase$invoke$1.label = 1;
                objEZpvd = tqv.EZpvd(str, str2, num, planetGetSearchKolListUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return (OrbitKolSearchResult) ((AbstractC43419rot) objEZpvd).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
