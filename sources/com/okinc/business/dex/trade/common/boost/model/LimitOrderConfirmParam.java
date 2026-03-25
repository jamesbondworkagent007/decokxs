package com.okinc.business.dex.trade.common.boost.model;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class LimitOrderConfirmParam {
    public static final int $stable = 0;
    private final int chainId;
    private final String fromTokenAddress;
    private final String fromTokenAmount;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String toTokenAddress;
    private final String toTokenAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderConfirmParam() {
        this(0, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderConfirmParam copy$default(LimitOrderConfirmParam limitOrderConfirmParam, int i, String str, String str2, String str3, String str4, ServiceFeeInfo serviceFeeInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = limitOrderConfirmParam.chainId;
        }
        if ((i2 & 2) != 0) {
            str = limitOrderConfirmParam.fromTokenAddress;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = limitOrderConfirmParam.toTokenAddress;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = limitOrderConfirmParam.fromTokenAmount;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = limitOrderConfirmParam.toTokenAmount;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            serviceFeeInfo = limitOrderConfirmParam.serviceFeeInfo;
        }
        return limitOrderConfirmParam.copy(i, str5, str6, str7, str8, serviceFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component6() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderConfirmParam copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LimitOrderConfirmParam(i, str, str2, str3, str4, serviceFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderConfirmParam)) {
            return false;
        }
        LimitOrderConfirmParam limitOrderConfirmParam = (LimitOrderConfirmParam) obj;
        return this.chainId == limitOrderConfirmParam.chainId && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) limitOrderConfirmParam.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) limitOrderConfirmParam.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) limitOrderConfirmParam.fromTokenAmount) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) limitOrderConfirmParam.toTokenAmount) && Intrinsics.EZpvd(this.serviceFeeInfo, limitOrderConfirmParam.serviceFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.chainId);
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.toTokenAddress.hashCode();
        int iHashCode4 = this.fromTokenAmount.hashCode();
        int iHashCode5 = this.toTokenAmount.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderConfirmParam(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", fromTokenAmount=" + this.fromTokenAmount + ", toTokenAmount=" + this.toTokenAmount + ", serviceFeeInfo=" + this.serviceFeeInfo + ")";
    }

    public LimitOrderConfirmParam(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = i;
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        this.fromTokenAmount = str3;
        this.toTokenAmount = str4;
        this.serviceFeeInfo = serviceFeeInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r10v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo):void (m)] (LINE:18) call: com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmParam.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo):void type: THIS */
    public /* synthetic */ LimitOrderConfirmParam(int i, String str, String str2, String str3, String str4, ServiceFeeInfo serviceFeeInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "", (i2 & 32) != 0 ? null : serviceFeeInfo);
    }
}
