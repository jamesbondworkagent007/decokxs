package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMP {
    public static final yMP copydefault = new yMP();

    private yMP() {
    }

    public final java.util.Collection<InterfaceC56658yNn> copydefault(@NotNull C56933yXs c56933yXs, @NotNull AbstractC56640yMw abstractC56640yMw) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        InterfaceC56658yNn interfaceC56658yNnMapJavaToKotlin$default = mapJavaToKotlin$default(this, c56933yXs, abstractC56640yMw, null, 4, null);
        if (interfaceC56658yNnMapJavaToKotlin$default == null) {
            return yEE.copydefault();
        }
        C56933yXs c56933yXsEZpvd = yML.OLrzqt.EZpvd(yZE.valueOf(interfaceC56658yNnMapJavaToKotlin$default));
        return c56933yXsEZpvd == null ? yED.AEQbTJ(interfaceC56658yNnMapJavaToKotlin$default) : yDY.gEmmrt(interfaceC56658yNnMapJavaToKotlin$default, abstractC56640yMw.OLrzqt(c56933yXsEZpvd));
    }

    public static /* synthetic */ InterfaceC56658yNn mapJavaToKotlin$default(yMP ymp, C56933yXs c56933yXs, AbstractC56640yMw abstractC56640yMw, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return ymp.EZpvd(c56933yXs, abstractC56640yMw, num);
    }

    public final InterfaceC56658yNn EZpvd(@NotNull C56933yXs c56933yXs, @NotNull AbstractC56640yMw abstractC56640yMw, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        C56929yXo c56929yXoKWHzl = (num == null || !Intrinsics.EZpvd(c56933yXs, yML.OLrzqt.copydefault())) ? yML.OLrzqt.KWHzl(c56933yXs) : yMB.OLrzqt(num.intValue());
        if (c56929yXoKWHzl != null) {
            return abstractC56640yMw.OLrzqt(c56929yXoKWHzl.AEQbTJ());
        }
        return null;
    }

    public final boolean AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        return yML.OLrzqt.copydefault(yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn));
    }

    public final boolean copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        return yML.OLrzqt.OLrzqt(yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn));
    }

    public final InterfaceC56658yNn EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        C56933yXs c56933yXsKWHzl = yML.OLrzqt.KWHzl(yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn));
        if (c56933yXsKWHzl == null) {
            throw new java.lang.IllegalArgumentException("Given class " + interfaceC56658yNn + " is not a mutable collection");
        }
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.AEQbTJ(interfaceC56658yNn).OLrzqt(c56933yXsKWHzl);
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnOLrzqt, "");
        return interfaceC56658yNnOLrzqt;
    }

    public final InterfaceC56658yNn OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        C56933yXs c56933yXsEZpvd = yML.OLrzqt.EZpvd(yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn));
        if (c56933yXsEZpvd == null) {
            throw new java.lang.IllegalArgumentException("Given class " + interfaceC56658yNn + " is not a read-only collection");
        }
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.AEQbTJ(interfaceC56658yNn).OLrzqt(c56933yXsEZpvd);
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnOLrzqt, "");
        return interfaceC56658yNnOLrzqt;
    }
}
