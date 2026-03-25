package o;

import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44454sQk {
    public final java.lang.String EZpvd;
    public final OKConversationType KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.sQk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C44454sQk copy$default(C44454sQk c44454sQk, java.lang.String str, java.util.List list, OKConversationType oKConversationType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44454sQk.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c44454sQk.OLrzqt;
        }
        if ((i & 4) != 0) {
            oKConversationType = c44454sQk.KWHzl;
        }
        return c44454sQk.copydefault(str, list, oKConversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44454sQk copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        return new C44454sQk(str, list, oKConversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeleteEvent(targetId=" + this.EZpvd + ", clientMessageIds=" + this.OLrzqt + ", conversationType=" + this.KWHzl + ")";
    }

    public C44454sQk(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        this.EZpvd = str;
        this.OLrzqt = list;
        this.KWHzl = oKConversationType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C44454sQk.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C44454sQk c44454sQk = (C44454sQk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44454sQk.EZpvd) && this.OLrzqt.containsAll(c44454sQk.OLrzqt) && this.KWHzl == c44454sQk.KWHzl;
    }

    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        return (((iHashCode * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }
}
