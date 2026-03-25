package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOI {
    public static final C56935yXu AEQbTJ;
    public static final C56935yXu EZpvd;
    public static final C56935yXu KWHzl;
    public static final C56935yXu OLrzqt;
    public static final C56935yXu copydefault;

    public static /* synthetic */ yOJ createDeprecatedAnnotation$default(AbstractC56640yMw abstractC56640yMw, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return AEQbTJ(abstractC56640yMw, str, str2, str3, z);
    }

    public static final yOJ AEQbTJ(@NotNull AbstractC56640yMw abstractC56640yMw, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        yOM yom = new yOM(abstractC56640yMw, yMB.Application.DXXBbs, C56424yEw.gEmmrt(C56390yDp.OLrzqt(KWHzl, new C56993yZy(str2)), C56390yDp.OLrzqt(OLrzqt, new C56971yZc(yDY.AhwBna(), new yOK(abstractC56640yMw)))), false, 8, null);
        C56933yXs c56933yXs = yMB.Application.uzCIH;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(copydefault, new C56993yZy(str));
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(EZpvd, new C56970yZb(yom));
        C56935yXu c56935yXu = AEQbTJ;
        C56929yXo c56929yXoKWHzl = C56929yXo.AEQbTJ.KWHzl(yMB.Application.getNewProxyInstance);
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str3);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new yOM(abstractC56640yMw, c56933yXs, C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt(c56935yXu, new C56981yZm(c56929yXoKWHzl, c56935yXuAEQbTJ))), z);
    }

    public static final AbstractC59233zdF KWHzl(AbstractC56640yMw abstractC56640yMw, yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOAEQbTJ = ynp.AEQbTJ().AEQbTJ(Variance.INVARIANT, abstractC56640yMw.AxsJAY());
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAEQbTJ, "");
        return abstractC59242zdOAEQbTJ;
    }

    static {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ("message");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        copydefault = c56935yXuAEQbTJ;
        C56935yXu c56935yXuAEQbTJ2 = C56935yXu.AEQbTJ("replaceWith");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ2, "");
        EZpvd = c56935yXuAEQbTJ2;
        C56935yXu c56935yXuAEQbTJ3 = C56935yXu.AEQbTJ(FirebaseAnalytics.Param.LEVEL);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ3, "");
        AEQbTJ = c56935yXuAEQbTJ3;
        C56935yXu c56935yXuAEQbTJ4 = C56935yXu.AEQbTJ("expression");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ4, "");
        KWHzl = c56935yXuAEQbTJ4;
        C56935yXu c56935yXuAEQbTJ5 = C56935yXu.AEQbTJ("imports");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ5, "");
        OLrzqt = c56935yXuAEQbTJ5;
    }
}
