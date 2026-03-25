package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SaveIntentBridgeOrderData {
    public static final int $stable = 0;
    private final String bridgeId;
    private final String defiPlatformId;
    private final String fromAmount;
    private final String fromChainId;
    private final String fromTokenAddress;
    private final String minimumReceived;
    private final String quote;
    private final String receiveWalletAddress;
    private final String signature;
    private final String slippage;
    private final String toAmount;
    private final String toChainId;
    private final String toTokenAddress;
    private final String userVersion;
    private final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SaveIntentBridgeOrderData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.userVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaveIntentBridgeOrderData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        return new SaveIntentBridgeOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveIntentBridgeOrderData)) {
            return false;
        }
        SaveIntentBridgeOrderData saveIntentBridgeOrderData = (SaveIntentBridgeOrderData) obj;
        return Intrinsics.EZpvd((Object) this.fromChainId, (Object) saveIntentBridgeOrderData.fromChainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) saveIntentBridgeOrderData.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) saveIntentBridgeOrderData.fromAmount) && Intrinsics.EZpvd((Object) this.toChainId, (Object) saveIntentBridgeOrderData.toChainId) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) saveIntentBridgeOrderData.toTokenAddress) && Intrinsics.EZpvd((Object) this.toAmount, (Object) saveIntentBridgeOrderData.toAmount) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) saveIntentBridgeOrderData.walletAddress) && Intrinsics.EZpvd((Object) this.signature, (Object) saveIntentBridgeOrderData.signature) && Intrinsics.EZpvd((Object) this.quote, (Object) saveIntentBridgeOrderData.quote) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) saveIntentBridgeOrderData.bridgeId) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) saveIntentBridgeOrderData.defiPlatformId) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) saveIntentBridgeOrderData.minimumReceived) && Intrinsics.EZpvd((Object) this.slippage, (Object) saveIntentBridgeOrderData.slippage) && Intrinsics.EZpvd((Object) this.userVersion, (Object) saveIntentBridgeOrderData.userVersion) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) saveIntentBridgeOrderData.receiveWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserVersion() {
        return this.userVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fromChainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fromTokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fromAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toChainId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.toTokenAddress;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.toAmount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.walletAddress;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.signature;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.quote;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.bridgeId;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.defiPlatformId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.minimumReceived;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.slippage;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.userVersion;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.receiveWalletAddress;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaveIntentBridgeOrderData(fromChainId=" + this.fromChainId + ", fromTokenAddress=" + this.fromTokenAddress + ", fromAmount=" + this.fromAmount + ", toChainId=" + this.toChainId + ", toTokenAddress=" + this.toTokenAddress + ", toAmount=" + this.toAmount + ", walletAddress=" + this.walletAddress + ", signature=" + this.signature + ", quote=" + this.quote + ", bridgeId=" + this.bridgeId + ", defiPlatformId=" + this.defiPlatformId + ", minimumReceived=" + this.minimumReceived + ", slippage=" + this.slippage + ", userVersion=" + this.userVersion + ", receiveWalletAddress=" + this.receiveWalletAddress + ")";
    }

    public SaveIntentBridgeOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.fromChainId = str;
        this.fromTokenAddress = str2;
        this.fromAmount = str3;
        this.toChainId = str4;
        this.toTokenAddress = str5;
        this.toAmount = str6;
        this.walletAddress = str7;
        this.signature = str8;
        this.quote = str9;
        this.bridgeId = str10;
        this.defiPlatformId = str11;
        this.minimumReceived = str12;
        this.slippage = str13;
        this.userVersion = str14;
        this.receiveWalletAddress = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2331) call: com.okinc.business.dexlogic.bean.SaveIntentBridgeOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SaveIntentBridgeOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) == 0 ? str15 : null);
    }
}
