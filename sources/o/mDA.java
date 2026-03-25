package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mDA {
    public static final mDA EZpvd = new mDA();

    private mDA() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str) && !C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return "";
        }
        return str.hashCode() + "_" + str2.hashCode();
    }
}
