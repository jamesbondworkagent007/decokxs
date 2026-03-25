package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40398qUj {
    public final long AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40398qUj copy$default(C40398qUj c40398qUj, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c40398qUj.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c40398qUj.KWHzl;
        }
        if ((i & 4) != 0) {
            j = c40398qUj.AEQbTJ;
        }
        return c40398qUj.AEQbTJ(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40398qUj AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C40398qUj(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40398qUj)) {
            return false;
        }
        C40398qUj c40398qUj = (C40398qUj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c40398qUj.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40398qUj.KWHzl) && this.AEQbTJ == c40398qUj.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WatchListEvent(eventType=" + this.copydefault + ", eventMessage=" + this.KWHzl + ", longTime=" + this.AEQbTJ + ")";
    }

    public C40398qUj(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.AEQbTJ = j;
    }
}
