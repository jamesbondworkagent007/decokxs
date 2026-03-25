package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31314lrg {
    public final long AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.lrg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31314lrg copy$default(C31314lrg c31314lrg, long j, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c31314lrg.AEQbTJ;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = c31314lrg.copydefault;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            list = c31314lrg.OLrzqt;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = c31314lrg.EZpvd;
        }
        return c31314lrg.AEQbTJ(j2, str2, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31314lrg AEQbTJ(long j, java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C31314lrg(j, str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31314lrg)) {
            return false;
        }
        C31314lrg c31314lrg = (C31314lrg) obj;
        return this.AEQbTJ == c31314lrg.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31314lrg.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c31314lrg.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c31314lrg.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.AEQbTJ);
        java.lang.String str = this.copydefault;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Web3PayContactsEntity(id=" + this.AEQbTJ + ", displayName=" + this.copydefault + ", phoneNumbers=" + this.OLrzqt + ", emails=" + this.EZpvd + ")";
    }

    public C31314lrg(long j, java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = j;
        this.copydefault = str;
        this.OLrzqt = list;
        this.EZpvd = list2;
    }
}
