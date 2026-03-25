package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ServiceFeeInfo {
    public static final int $stable = 0;
    private final String feeRate;
    private final String feeUsd;
    private final boolean needCalcServiceFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ServiceFeeInfo() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ServiceFeeInfo copy$default(ServiceFeeInfo serviceFeeInfo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceFeeInfo.feeRate;
        }
        if ((i & 2) != 0) {
            str2 = serviceFeeInfo.feeUsd;
        }
        if ((i & 4) != 0) {
            z = serviceFeeInfo.needCalcServiceFee;
        }
        return serviceFeeInfo.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.needCalcServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ServiceFeeInfo(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceFeeInfo)) {
            return false;
        }
        ServiceFeeInfo serviceFeeInfo = (ServiceFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.feeRate, (Object) serviceFeeInfo.feeRate) && Intrinsics.EZpvd((Object) this.feeUsd, (Object) serviceFeeInfo.feeUsd) && this.needCalcServiceFee == serviceFeeInfo.needCalcServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeUsd() {
        return this.feeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedCalcServiceFee() {
        return this.needCalcServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.feeRate.hashCode() * 31) + this.feeUsd.hashCode()) * 31) + Boolean.hashCode(this.needCalcServiceFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ServiceFeeInfo(feeRate=" + this.feeRate + ", feeUsd=" + this.feeUsd + ", needCalcServiceFee=" + this.needCalcServiceFee + ")";
    }

    public ServiceFeeInfo(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.feeRate = str;
        this.feeUsd = str2;
        this.needCalcServiceFee = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:98) call: com.okinc.business.dex.api.bean.sa_small_assets.ServiceFeeInfo.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ServiceFeeInfo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
