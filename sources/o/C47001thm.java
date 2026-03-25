package o;

import com.okinc.okrisk.SessionStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47001thm {
    public long AEQbTJ;
    public java.lang.String OLrzqt;
    public SessionStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47001thm() {
        this(null, null, 0L, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.OLrzqt = "";
        this.AEQbTJ = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionStatus copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public C47001thm(@NotNull java.lang.String str, @NotNull SessionStatus sessionStatus, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sessionStatus, "");
        this.OLrzqt = str;
        this.copydefault = sessionStatus;
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.okrisk.SessionStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okrisk.SessionStatus:0x000a: SGET  A[WRAPPED] (LINE:719) com.okinc.okrisk.SessionStatus.UNKNOWN com.okinc.okrisk.SessionStatus) : (r2v0 com.okinc.okrisk.SessionStatus))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r3v0 long))
 A[MD:(java.lang.String, com.okinc.okrisk.SessionStatus, long):void (m)] (LINE:717) call: o.thm.<init>(java.lang.String, com.okinc.okrisk.SessionStatus, long):void type: THIS */
    public /* synthetic */ C47001thm(java.lang.String str, SessionStatus sessionStatus, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SessionStatus.UNKNOWN : sessionStatus, (i & 4) != 0 ? -1L : j);
    }

    public final boolean KWHzl() {
        return this.OLrzqt.length() > 0 && this.AEQbTJ != -1;
    }
}
