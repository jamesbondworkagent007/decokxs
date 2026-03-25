package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57852yqI {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final boolean OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final long djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57852yqI KWHzl(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.util.List<java.lang.String> list, java.lang.Long l, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C57852yqI(str, z, str2, str3, list, l, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57852yqI)) {
            return false;
        }
        C57852yqI c57852yqI = (C57852yqI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c57852yqI.AEQbTJ) && this.OLrzqt == c57852yqI.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c57852yqI.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c57852yqI.EZpvd) && Intrinsics.EZpvd(this.copydefault, c57852yqI.copydefault) && Intrinsics.EZpvd(this.KWHzl, c57852yqI.KWHzl) && this.djBIcL == c57852yqI.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        boolean z = this.OLrzqt;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = this.valueOf.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        java.lang.Long l = this.KWHzl;
        return (((((((((((iHashCode * 31) + r1) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l != null ? l.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NetworkLogEntry(id=" + this.AEQbTJ + ", isOutgoing=" + this.OLrzqt + ", url=" + this.valueOf + ", payload=" + this.EZpvd + ", headers=" + this.copydefault + ", duration=" + this.KWHzl + ", timestamp=" + this.djBIcL + ')';
    }

    public C57852yqI(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.util.List<java.lang.String> list, java.lang.Long l, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.OLrzqt = z;
        this.valueOf = str2;
        this.EZpvd = str3;
        this.copydefault = list;
        this.KWHzl = l;
        this.djBIcL = j;
    }
}
