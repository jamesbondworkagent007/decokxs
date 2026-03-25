package com.okinc.assets.backend.api.model.satoshitest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class GetSatoshiTestDepositDetailResp {
    public static final int $stable = 0;
    private final String additionalIdentifier;
    private final String additionalIdentifierType;
    private final String amount;
    private final String depositAddress;
    private final int id;
    private final String network;
    private final String symbol;
    private final String verifyingAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetSatoshiTestDepositDetailResp() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.verifyingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.additionalIdentifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.additionalIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSatoshiTestDepositDetailResp copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new GetSatoshiTestDepositDetailResp(i, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSatoshiTestDepositDetailResp)) {
            return false;
        }
        GetSatoshiTestDepositDetailResp getSatoshiTestDepositDetailResp = (GetSatoshiTestDepositDetailResp) obj;
        return this.id == getSatoshiTestDepositDetailResp.id && Intrinsics.EZpvd((Object) this.depositAddress, (Object) getSatoshiTestDepositDetailResp.depositAddress) && Intrinsics.EZpvd((Object) this.verifyingAddress, (Object) getSatoshiTestDepositDetailResp.verifyingAddress) && Intrinsics.EZpvd((Object) this.additionalIdentifierType, (Object) getSatoshiTestDepositDetailResp.additionalIdentifierType) && Intrinsics.EZpvd((Object) this.additionalIdentifier, (Object) getSatoshiTestDepositDetailResp.additionalIdentifier) && Intrinsics.EZpvd((Object) this.amount, (Object) getSatoshiTestDepositDetailResp.amount) && Intrinsics.EZpvd((Object) this.symbol, (Object) getSatoshiTestDepositDetailResp.symbol) && Intrinsics.EZpvd((Object) this.network, (Object) getSatoshiTestDepositDetailResp.network);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalIdentifier() {
        return this.additionalIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalIdentifierType() {
        return this.additionalIdentifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositAddress() {
        return this.depositAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerifyingAddress() {
        return this.verifyingAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        String str = this.depositAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.verifyingAddress;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.additionalIdentifierType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.additionalIdentifier;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.amount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.symbol;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.network;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetSatoshiTestDepositDetailResp(id=" + this.id + ", depositAddress=" + this.depositAddress + ", verifyingAddress=" + this.verifyingAddress + ", additionalIdentifierType=" + this.additionalIdentifierType + ", additionalIdentifier=" + this.additionalIdentifier + ", amount=" + this.amount + ", symbol=" + this.symbol + ", network=" + this.network + ")";
    }

    public GetSatoshiTestDepositDetailResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.id = i;
        this.depositAddress = str;
        this.verifyingAddress = str2;
        this.additionalIdentifierType = str3;
        this.additionalIdentifier = str4;
        this.amount = str5;
        this.symbol = str6;
        this.network = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.satoshitest.GetSatoshiTestDepositDetailResp.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GetSatoshiTestDepositDetailResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) == 0 ? str7 : null);
    }
}
