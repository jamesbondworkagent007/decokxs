package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ModuleBoostTokenData {
    public static final int $stable = 0;
    private final Integer chainId;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleBoostTokenData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ModuleBoostTokenData copy$default(ModuleBoostTokenData moduleBoostTokenData, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = moduleBoostTokenData.chainId;
        }
        if ((i & 2) != 0) {
            str = moduleBoostTokenData.tokenAddress;
        }
        if ((i & 4) != 0) {
            str2 = moduleBoostTokenData.tokenName;
        }
        if ((i & 8) != 0) {
            str3 = moduleBoostTokenData.tokenLogo;
        }
        return moduleBoostTokenData.copy(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleBoostTokenData copy(Integer num, String str, String str2, String str3) {
        return new ModuleBoostTokenData(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleBoostTokenData)) {
            return false;
        }
        ModuleBoostTokenData moduleBoostTokenData = (ModuleBoostTokenData) obj;
        return Intrinsics.EZpvd(this.chainId, moduleBoostTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) moduleBoostTokenData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenName, (Object) moduleBoostTokenData.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) moduleBoostTokenData.tokenLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.chainId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.tokenAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleBoostTokenData(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ")";
    }

    public ModuleBoostTokenData(Integer num, String str, String str2, String str3) {
        this.chainId = num;
        this.tokenAddress = str;
        this.tokenName = str2;
        this.tokenLogo = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.market.data.model.ModuleBoostTokenData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ModuleBoostTokenData(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
