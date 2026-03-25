package o;

import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32762mjh {
    public final long AEQbTJ;
    public final java.util.List<EnsecureAppInfo> EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final DeviceScanner.ScannerStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32762mjh() {
        this(null, null, false, 0L, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.mjh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32762mjh copy$default(C32762mjh c32762mjh, DeviceScanner.ScannerStatus scannerStatus, java.util.List list, boolean z, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            scannerStatus = c32762mjh.copydefault;
        }
        if ((i & 2) != 0) {
            list = c32762mjh.EZpvd;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            z = c32762mjh.KWHzl;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = c32762mjh.AEQbTJ;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str = c32762mjh.OLrzqt;
        }
        return c32762mjh.OLrzqt(scannerStatus, list2, z2, j2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceScanner.ScannerStatus KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32762mjh OLrzqt(@NotNull DeviceScanner.ScannerStatus scannerStatus, @NotNull java.util.List<EnsecureAppInfo> list, boolean z, long j, java.lang.String str) {
        Intrinsics.checkNotNullParameter(scannerStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C32762mjh(scannerStatus, list, z, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<EnsecureAppInfo> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32762mjh)) {
            return false;
        }
        C32762mjh c32762mjh = (C32762mjh) obj;
        return this.copydefault == c32762mjh.copydefault && Intrinsics.EZpvd(this.EZpvd, c32762mjh.EZpvd) && this.KWHzl == c32762mjh.KWHzl && this.AEQbTJ == c32762mjh.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c32762mjh.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode4 = java.lang.Long.hashCode(this.AEQbTJ);
        java.lang.String str = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeviceScanState(status=" + this.copydefault + ", scanResults=" + this.EZpvd + ", isServiceRunning=" + this.KWHzl + ", lastScanTimestamp=" + this.AEQbTJ + ", errorMessage=" + this.OLrzqt + ")";
    }

    public C32762mjh(@NotNull DeviceScanner.ScannerStatus scannerStatus, @NotNull java.util.List<EnsecureAppInfo> list, boolean z, long j, java.lang.String str) {
        Intrinsics.checkNotNullParameter(scannerStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = scannerStatus;
        this.EZpvd = list;
        this.KWHzl = z;
        this.AEQbTJ = j;
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.components.security.scanner.DeviceScanner$ScannerStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.security.scanner.DeviceScanner$ScannerStatus:0x0004: SGET  A[WRAPPED] (LINE:83) com.okinc.components.security.scanner.DeviceScanner.ScannerStatus.IDLE com.okinc.components.security.scanner.DeviceScanner$ScannerStatus) : (r5v0 com.okinc.components.security.scanner.DeviceScanner$ScannerStatus))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:84)) : (r6v0 java.util.List))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:long:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
 A[MD:(com.okinc.components.security.scanner.DeviceScanner$ScannerStatus, java.util.List<com.okinc.components.security.scanner.EnsecureAppInfo>, boolean, long, java.lang.String):void (m)] (LINE:82) call: o.mjh.<init>(com.okinc.components.security.scanner.DeviceScanner$ScannerStatus, java.util.List, boolean, long, java.lang.String):void type: THIS */
    public /* synthetic */ C32762mjh(DeviceScanner.ScannerStatus scannerStatus, java.util.List list, boolean z, long j, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DeviceScanner.ScannerStatus.IDLE : scannerStatus, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : str);
    }
}
