package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ynw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57733ynw {
    public final android.content.pm.PackageInfo EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57733ynw copy$default(C57733ynw c57733ynw, boolean z, android.content.pm.PackageInfo packageInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c57733ynw.OLrzqt;
        }
        if ((i & 2) != 0) {
            packageInfo = c57733ynw.EZpvd;
        }
        return c57733ynw.EZpvd(z, packageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57733ynw EZpvd(boolean z, android.content.pm.PackageInfo packageInfo) {
        return new C57733ynw(z, packageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.pm.PackageInfo OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57733ynw)) {
            return false;
        }
        C57733ynw c57733ynw = (C57733ynw) obj;
        return this.OLrzqt == c57733ynw.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c57733ynw.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.OLrzqt;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        android.content.pm.PackageInfo packageInfo = this.EZpvd;
        return (r0 * 31) + (packageInfo == null ? 0 : packageInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetPackageInfoResult(successful=" + this.OLrzqt + ", packageInfo=" + this.EZpvd + ')';
    }

    public C57733ynw(boolean z, android.content.pm.PackageInfo packageInfo) {
        this.OLrzqt = z;
        this.EZpvd = packageInfo;
    }
}
