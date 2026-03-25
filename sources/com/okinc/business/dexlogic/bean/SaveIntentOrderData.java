package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SaveIntentOrderData {
    public static final int $stable = 8;
    private String defiPlatformId;
    private final Integer direction;
    private final String quote;
    private final String signature;
    private final int tradeMode;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SaveIntentOrderData copy$default(SaveIntentOrderData saveIntentOrderData, String str, String str2, String str3, String str4, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = saveIntentOrderData.quote;
        }
        if ((i2 & 2) != 0) {
            str2 = saveIntentOrderData.signature;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = saveIntentOrderData.userWalletAddress;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = saveIntentOrderData.defiPlatformId;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = saveIntentOrderData.tradeMode;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            num = saveIntentOrderData.direction;
        }
        return saveIntentOrderData.copy(str, str5, str6, str7, i3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaveIntentOrderData copy(String str, @NotNull String str2, @NotNull String str3, String str4, int i, Integer num) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SaveIntentOrderData(str, str2, str3, str4, i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveIntentOrderData)) {
            return false;
        }
        SaveIntentOrderData saveIntentOrderData = (SaveIntentOrderData) obj;
        return Intrinsics.EZpvd((Object) this.quote, (Object) saveIntentOrderData.quote) && Intrinsics.EZpvd((Object) this.signature, (Object) saveIntentOrderData.signature) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) saveIntentOrderData.userWalletAddress) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) saveIntentOrderData.defiPlatformId) && this.tradeMode == saveIntentOrderData.tradeMode && Intrinsics.EZpvd(this.direction, saveIntentOrderData.direction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.quote;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.signature.hashCode();
        int iHashCode3 = this.userWalletAddress.hashCode();
        String str2 = this.defiPlatformId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = Integer.hashCode(this.tradeMode);
        Integer num = this.direction;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiPlatformId(String str) {
        this.defiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaveIntentOrderData(quote=" + this.quote + ", signature=" + this.signature + ", userWalletAddress=" + this.userWalletAddress + ", defiPlatformId=" + this.defiPlatformId + ", tradeMode=" + this.tradeMode + ", direction=" + this.direction + ")";
    }

    public SaveIntentOrderData(String str, @NotNull String str2, @NotNull String str3, String str4, int i, Integer num) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.quote = str;
        this.signature = str2;
        this.userWalletAddress = str3;
        this.defiPlatformId = str4;
        this.tradeMode = i;
        this.direction = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (r14v0 int)
  (r15v0 java.lang.Integer)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer):void (m)] (LINE:2321) call: com.okinc.business.dexlogic.bean.SaveIntentOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ SaveIntentOrderData(String str, String str2, String str3, String str4, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, str3, (i2 & 8) != 0 ? null : str4, i, num);
    }
}
