package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bQW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9168bQW {
    public final java.util.List<C9170bQY> AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final C10854bwM OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C9170bQY> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C9168bQW(@NotNull C10854bwM c10854bwM, @NotNull java.util.List<C9170bQY> list, boolean z, boolean z2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = c10854bwM;
        this.AEQbTJ = list;
        this.copydefault = z;
        this.KWHzl = z2;
        this.EZpvd = str;
    }
}
