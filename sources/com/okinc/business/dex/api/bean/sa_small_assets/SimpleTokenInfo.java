package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SimpleTokenInfo {
    public static final int $stable = 0;
    private final int decimal;
    private final String tokenContractAddress;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleTokenInfo() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleTokenInfo copy$default(SimpleTokenInfo simpleTokenInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = simpleTokenInfo.tokenContractAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = simpleTokenInfo.tokenSymbol;
        }
        if ((i2 & 4) != 0) {
            i = simpleTokenInfo.decimal;
        }
        return simpleTokenInfo.copy(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTokenInfo copy(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SimpleTokenInfo(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleTokenInfo)) {
            return false;
        }
        SimpleTokenInfo simpleTokenInfo = (SimpleTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) simpleTokenInfo.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) simpleTokenInfo.tokenSymbol) && this.decimal == simpleTokenInfo.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tokenContractAddress.hashCode() * 31) + this.tokenSymbol.hashCode()) * 31) + Integer.hashCode(this.decimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleTokenInfo(tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", decimal=" + this.decimal + ")";
    }

    public SimpleTokenInfo(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenContractAddress = str;
        this.tokenSymbol = str2;
        this.decimal = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:76) call: com.okinc.business.dex.api.bean.sa_small_assets.SimpleTokenInfo.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ SimpleTokenInfo(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
