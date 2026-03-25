package o;

import kotlin.jvm.internal.Intrinsics;
import o.C56929yXo;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRM {
    public static final C56935yXu AEQbTJ;
    public static final java.util.Map<C56933yXs, C56933yXs> EZpvd;
    public static final yRM KWHzl = new yRM();
    public static final C56935yXu OLrzqt;
    public static final C56935yXu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56935yXu KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56935yXu OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56935yXu copydefault() {
        return AEQbTJ;
    }

    private yRM() {
    }

    static {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ("message");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        AEQbTJ = c56935yXuAEQbTJ;
        C56935yXu c56935yXuAEQbTJ2 = C56935yXu.AEQbTJ("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ2, "");
        OLrzqt = c56935yXuAEQbTJ2;
        C56935yXu c56935yXuAEQbTJ3 = C56935yXu.AEQbTJ("value");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ3, "");
        copydefault = c56935yXuAEQbTJ3;
        EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt(yMB.Application.zuWLRA, yRE.iwGUEr), C56390yDp.OLrzqt(yMB.Application.ODWQjV, yRE.AuCTel), C56390yDp.OLrzqt(yMB.Application.dvKsVJ, yRE.AEQbTJ));
    }

    public static /* synthetic */ yOJ mapOrResolveJavaAnnotation$default(yRM yrm, yTO yto, C56794ySo c56794ySo, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return yrm.copydefault(yto, c56794ySo, z);
    }

    public final yOJ copydefault(@NotNull yTO yto, @NotNull C56794ySo c56794ySo, boolean z) {
        Intrinsics.checkNotNullParameter(yto, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        C56929yXo c56929yXoAEQbTJ = yto.AEQbTJ();
        C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
        C56933yXs c56933yXs = yRE.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c56933yXs, "");
        if (Intrinsics.EZpvd(c56929yXoAEQbTJ, actionBar.KWHzl(c56933yXs))) {
            return new yRW(yto, c56794ySo);
        }
        C56933yXs c56933yXs2 = yRE.AuCTel;
        Intrinsics.checkNotNullExpressionValue(c56933yXs2, "");
        if (Intrinsics.EZpvd(c56929yXoAEQbTJ, actionBar.KWHzl(c56933yXs2))) {
            return new yRY(yto, c56794ySo);
        }
        C56933yXs c56933yXs3 = yRE.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c56933yXs3, "");
        if (Intrinsics.EZpvd(c56929yXoAEQbTJ, actionBar.KWHzl(c56933yXs3))) {
            return new yRL(c56794ySo, yto, yMB.Application.dvKsVJ);
        }
        C56933yXs c56933yXs4 = yRE.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c56933yXs4, "");
        if (Intrinsics.EZpvd(c56929yXoAEQbTJ, actionBar.KWHzl(c56933yXs4))) {
            return null;
        }
        return new ySD(c56794ySo, yto, z);
    }

    public final yOJ EZpvd(@NotNull C56933yXs c56933yXs, @NotNull yTM ytm, @NotNull C56794ySo c56794ySo) {
        yTO ytoCopydefault;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(ytm, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        if (Intrinsics.EZpvd(c56933yXs, yMB.Application.uzCIH)) {
            C56933yXs c56933yXs2 = yRE.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c56933yXs2, "");
            yTO ytoCopydefault2 = ytm.copydefault(c56933yXs2);
            if (ytoCopydefault2 != null || ytm.EZpvd()) {
                return new yRT(ytoCopydefault2, c56794ySo);
            }
        }
        C56933yXs c56933yXs3 = EZpvd.get(c56933yXs);
        if (c56933yXs3 == null || (ytoCopydefault = ytm.copydefault(c56933yXs3)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(KWHzl, ytoCopydefault, c56794ySo, false, 4, null);
    }
}
