package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yNA extends yNC {
    public final yOD AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNC
    public yOD copydefault() {
        return this.AEQbTJ;
    }

    public yNA(@NotNull yOD yod) {
        Intrinsics.checkNotNullParameter(yod, "");
        this.AEQbTJ = yod;
    }

    @Override // o.yNC
    public java.lang.String EZpvd() {
        return copydefault().copydefault();
    }

    @Override // o.yNC
    public yNC KWHzl() {
        yNC yncEZpvd = C56669yNy.EZpvd(copydefault().KWHzl());
        Intrinsics.checkNotNullExpressionValue(yncEZpvd, "");
        return yncEZpvd;
    }
}
