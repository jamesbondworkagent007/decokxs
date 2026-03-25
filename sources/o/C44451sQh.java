package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44451sQh {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44451sQh copy$default(C44451sQh c44451sQh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44451sQh.KWHzl;
        }
        return c44451sQh.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44451sQh AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C44451sQh(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44451sQh) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((C44451sQh) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupCreateEvent(groupId=" + this.KWHzl + ")";
    }

    public C44451sQh(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }
}
