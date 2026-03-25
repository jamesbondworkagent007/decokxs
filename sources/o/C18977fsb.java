package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18977fsb {
    public final C18984fsi KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18977fsb copy$default(C18977fsb c18977fsb, C18984fsi c18984fsi, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c18984fsi = c18977fsb.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c18977fsb.OLrzqt;
        }
        return c18977fsb.OLrzqt(c18984fsi, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18984fsi KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18977fsb OLrzqt(@NotNull C18984fsi c18984fsi, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c18984fsi, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C18977fsb(c18984fsi, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18977fsb)) {
            return false;
        }
        C18977fsb c18977fsb = (C18977fsb) obj;
        return Intrinsics.EZpvd(this.KWHzl, c18977fsb.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18977fsb.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DAppSearchResultUiModel(data=" + this.KWHzl + ", keyword=" + this.OLrzqt + ")";
    }

    public C18977fsb(@NotNull C18984fsi c18984fsi, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c18984fsi, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = c18984fsi;
        this.OLrzqt = str;
    }
}
