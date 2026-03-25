package com.okinc.network.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class ConnectTestResult {
    public static final int $stable = 0;
    private final long connectionCostMs;
    private final String ip;
    private final String testDomain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConnectTestResult copy$default(ConnectTestResult connectTestResult, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectTestResult.testDomain;
        }
        if ((i & 2) != 0) {
            str2 = connectTestResult.ip;
        }
        if ((i & 4) != 0) {
            j = connectTestResult.connectionCostMs;
        }
        return connectTestResult.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.testDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.connectionCostMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConnectTestResult copy(@NotNull String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ConnectTestResult(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectTestResult)) {
            return false;
        }
        ConnectTestResult connectTestResult = (ConnectTestResult) obj;
        return Intrinsics.EZpvd((Object) this.testDomain, (Object) connectTestResult.testDomain) && Intrinsics.EZpvd((Object) this.ip, (Object) connectTestResult.ip) && this.connectionCostMs == connectTestResult.connectionCostMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getConnectionCostMs() {
        return this.connectionCostMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIp() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTestDomain() {
        return this.testDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.testDomain.hashCode();
        String str = this.ip;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.connectionCostMs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConnectTestResult(testDomain=" + this.testDomain + ", ip=" + this.ip + ", connectionCostMs=" + this.connectionCostMs + ")";
    }

    public ConnectTestResult(@NotNull String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.testDomain = str;
        this.ip = str2;
        this.connectionCostMs = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 long))
 A[MD:(java.lang.String, java.lang.String, long):void (m)] (LINE:11) call: com.okinc.network.model.ConnectTestResult.<init>(java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ ConnectTestResult(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j);
    }
}
