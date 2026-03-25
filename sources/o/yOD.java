package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yOD {
    public final boolean AhwBna;
    public final java.lang.String gEmmrt;

    public yOD KWHzl() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.gEmmrt;
    }

    public yOD(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.AhwBna = z;
    }

    public java.lang.Integer OLrzqt(@NotNull yOD yod) {
        Intrinsics.checkNotNullParameter(yod, "");
        return yOE.OLrzqt.KWHzl(this, yod);
    }

    public final java.lang.String toString() {
        return copydefault();
    }
}
