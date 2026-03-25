package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PasskeyVerifyReq {
    public static final int $stable = 0;
    private final String address;
    private final String amount;
    private final String challenge;
    private final int currencyId;
    private final String faceVerifiedSessionId;
    private final String invoice;
    private final int subCurrencyId;
    private final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.faceVerifiedSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyVerifyReq copy(@NotNull String str, String str2, String str3, int i, String str4, String str5, int i2, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyVerifyReq(str, str2, str3, i, str4, str5, i2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyVerifyReq)) {
            return false;
        }
        PasskeyVerifyReq passkeyVerifyReq = (PasskeyVerifyReq) obj;
        return Intrinsics.EZpvd((Object) this.challenge, (Object) passkeyVerifyReq.challenge) && Intrinsics.EZpvd((Object) this.amount, (Object) passkeyVerifyReq.amount) && Intrinsics.EZpvd((Object) this.address, (Object) passkeyVerifyReq.address) && this.currencyId == passkeyVerifyReq.currencyId && Intrinsics.EZpvd((Object) this.tag, (Object) passkeyVerifyReq.tag) && Intrinsics.EZpvd((Object) this.invoice, (Object) passkeyVerifyReq.invoice) && this.subCurrencyId == passkeyVerifyReq.subCurrencyId && Intrinsics.EZpvd((Object) this.faceVerifiedSessionId, (Object) passkeyVerifyReq.faceVerifiedSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceVerifiedSessionId() {
        return this.faceVerifiedSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoice() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.challenge.hashCode();
        String str = this.amount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Integer.hashCode(this.currencyId);
        String str3 = this.tag;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.invoice;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = Integer.hashCode(this.subCurrencyId);
        String str5 = this.faceVerifiedSessionId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyVerifyReq(challenge=" + this.challenge + ", amount=" + this.amount + ", address=" + this.address + ", currencyId=" + this.currencyId + ", tag=" + this.tag + ", invoice=" + this.invoice + ", subCurrencyId=" + this.subCurrencyId + ", faceVerifiedSessionId=" + this.faceVerifiedSessionId + ")";
    }

    public PasskeyVerifyReq(@NotNull String str, String str2, String str3, int i, String str4, String str5, int i2, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.challenge = str;
        this.amount = str2;
        this.address = str3;
        this.currencyId = i;
        this.tag = str4;
        this.invoice = str5;
        this.subCurrencyId = i2;
        this.faceVerifiedSessionId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (r16v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:28) call: com.okinc.assets.backend.api.model.PasskeyVerifyReq.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyVerifyReq(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, i, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, i2, (i3 & 128) != 0 ? null : str6);
    }
}
