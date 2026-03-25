package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYQ {
    public static final yNN<yYP> copydefault = new yNN<>("ResolutionAnchorProvider");

    public static final yNP EZpvd(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        yYP yyp = (yYP) ynp.OLrzqt(copydefault);
        if (yyp != null) {
            return yyp.KWHzl(ynp);
        }
        return null;
    }
}
