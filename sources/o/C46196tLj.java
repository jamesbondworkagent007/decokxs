package o;

import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46196tLj {
    public static final C46196tLj EZpvd = new C46196tLj();

    private C46196tLj() {
    }

    public final java.lang.String copydefault(@NotNull C46189tLc c46189tLc) {
        Intrinsics.checkNotNullParameter(c46189tLc, "");
        java.lang.String strDbNXlk = c46189tLc.DbNXlk();
        if (strDbNXlk.length() != 0) {
            return strDbNXlk;
        }
        java.lang.String strAhwBna = c46189tLc.AhwBna();
        if (strAhwBna.length() == 0) {
            strAhwBna = C33070mpX.AYXKKw(C47501trL.Fragment.wlaJM);
        }
        return strAhwBna;
    }

    public final java.lang.String KWHzl(@NotNull PlanetProfileShareBean planetProfileShareBean) {
        Intrinsics.checkNotNullParameter(planetProfileShareBean, "");
        java.lang.String strValueOf = planetProfileShareBean.valueOf();
        if (strValueOf.length() != 0) {
            return strValueOf;
        }
        java.lang.String strEZpvd = planetProfileShareBean.EZpvd();
        if (strEZpvd.length() == 0) {
            strEZpvd = C33070mpX.AYXKKw(C47501trL.Fragment.wlaJM);
        }
        return strEZpvd;
    }
}
