package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C30325lUe {
    @yCM
    public C30325lUe() {
    }

    public final java.lang.String EZpvd(@androidx.annotation.StringRes int i) {
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lUe */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String getFormattedString$default(C30325lUe c30325lUe, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return c30325lUe.EZpvd(i, map);
    }

    public final java.lang.String EZpvd(@androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return C33069mpW.OLrzqt(EZpvd(i), map);
    }
}
