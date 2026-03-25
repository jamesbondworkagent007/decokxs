package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44460sQq {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44460sQq copy$default(C44460sQq c44460sQq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44460sQq.KWHzl;
        }
        return c44460sQq.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44460sQq copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C44460sQq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44460sQq) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((C44460sQq) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupDeleteEvent(groupId=" + this.KWHzl + ")";
    }

    public C44460sQq(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }
}
