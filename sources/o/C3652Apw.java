package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Apw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3652Apw {
    public static final int $stable = 8;
    public C3630Apa OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3652Apw copy$default(C3652Apw c3652Apw, C3630Apa c3630Apa, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3630Apa = c3652Apw.OLrzqt;
        }
        return c3652Apw.AEQbTJ(c3630Apa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3652Apw AEQbTJ(@NotNull C3630Apa c3630Apa) {
        Intrinsics.checkNotNullParameter(c3630Apa, "");
        return new C3652Apw(c3630Apa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3630Apa KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3652Apw) && Intrinsics.EZpvd(this.OLrzqt, ((C3652Apw) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BscQuickConvertState(content=" + this.OLrzqt + ")";
    }

    public C3652Apw(@NotNull C3630Apa c3630Apa) {
        Intrinsics.checkNotNullParameter(c3630Apa, "");
        this.OLrzqt = c3630Apa;
    }
}
