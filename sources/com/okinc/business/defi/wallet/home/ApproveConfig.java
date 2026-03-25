package com.okinc.business.defi.wallet.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ApproveConfig {
    private final String supportMinAppVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApproveConfig copy$default(ApproveConfig approveConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approveConfig.supportMinAppVersion;
        }
        return approveConfig.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.supportMinAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveConfig copy(String str) {
        return new ApproveConfig(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApproveConfig) && Intrinsics.EZpvd((Object) this.supportMinAppVersion, (Object) ((ApproveConfig) obj).supportMinAppVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportMinAppVersion() {
        return this.supportMinAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.supportMinAppVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveConfig(supportMinAppVersion=" + this.supportMinAppVersion + ")";
    }

    public ApproveConfig(String str) {
        this.supportMinAppVersion = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:68) call: com.okinc.business.defi.wallet.home.ApproveConfig.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ApproveConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
