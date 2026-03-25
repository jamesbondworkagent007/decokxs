package o;

import com.okinc.lifecycle.api.business.clipboard.ClipBoardContentType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pKB {
    public final java.lang.String AEQbTJ;
    public final ClipBoardContentType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pKB copy$default(pKB pkb, ClipBoardContentType clipBoardContentType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            clipBoardContentType = pkb.KWHzl;
        }
        if ((i & 2) != 0) {
            str = pkb.AEQbTJ;
        }
        return pkb.copydefault(clipBoardContentType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClipBoardContentType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pKB copydefault(@NotNull ClipBoardContentType clipBoardContentType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(clipBoardContentType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new pKB(clipBoardContentType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pKB)) {
            return false;
        }
        pKB pkb = (pKB) obj;
        return this.KWHzl == pkb.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pkb.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClipBoardContentEvent(type=" + this.KWHzl + ", content=" + this.AEQbTJ + ")";
    }

    public pKB(@NotNull ClipBoardContentType clipBoardContentType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(clipBoardContentType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = clipBoardContentType;
        this.AEQbTJ = str;
    }
}
