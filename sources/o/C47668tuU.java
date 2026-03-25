package o;

import com.okinc.planet.biz_content.leaderboard.bean.TopTrader;
import com.okinc.planet.biz_content.leaderboard.usecase.PlanetGetTopTradersUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47668tuU implements InterfaceC47663tuP {
    public final tQV KWHzl;

    public C47668tuU(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.KWHzl = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC47663tuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super TopTrader> continuation) throws java.lang.Throwable {
        PlanetGetTopTradersUseCase$invoke$1 planetGetTopTradersUseCase$invoke$1;
        if (continuation instanceof PlanetGetTopTradersUseCase$invoke$1) {
            planetGetTopTradersUseCase$invoke$1 = (PlanetGetTopTradersUseCase$invoke$1) continuation;
            int i = planetGetTopTradersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetTopTradersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetTopTradersUseCase$invoke$1 = new PlanetGetTopTradersUseCase$invoke$1(this, continuation);
            }
        }
        PlanetGetTopTradersUseCase$invoke$1 planetGetTopTradersUseCase$invoke$12 = planetGetTopTradersUseCase$invoke$1;
        java.lang.Object objKWHzl = planetGetTopTradersUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetTopTradersUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                tQV tqv = this.KWHzl;
                planetGetTopTradersUseCase$invoke$12.label = 1;
                objKWHzl = tqv.KWHzl(str, str2, str3, str4, str5, planetGetTopTradersUseCase$invoke$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (TopTrader) ((AbstractC43419rot) objKWHzl).AEQbTJ();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
