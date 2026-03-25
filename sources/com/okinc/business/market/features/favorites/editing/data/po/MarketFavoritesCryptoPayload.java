package com.okinc.business.market.features.favorites.editing.data.po;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesCryptoPayload {
    public static final int $stable = 0;
    public static final int ADD_FAVOURITE = 0;
    public static final int CANCEL_FAVOURITE = 1;
    public static final Activity Companion = new Activity(null);
    public static final int TOP_FAVOURITE = 2;

    @SerializedName(MTPushConstants.Operation.KEY_ALIAS)
    private final String alias;

    @SerializedName("chainId")
    private final String chainId;

    @SerializedName("expTime")
    private final String expTime;

    @SerializedName("instId")
    private final String instId;

    @SerializedName("instType")
    private final String instType;

    @SerializedName("operator")
    private final int operator;

    @SerializedName("tokenContractAddress")
    private final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final int component1() {
        return this.operator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component4() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component5() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketFavoritesCryptoPayload copy$default(MarketFavoritesCryptoPayload marketFavoritesCryptoPayload, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = marketFavoritesCryptoPayload.operator;
        }
        if ((i2 & 2) != 0) {
            str = marketFavoritesCryptoPayload.instId;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = marketFavoritesCryptoPayload.instType;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = marketFavoritesCryptoPayload.alias;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = marketFavoritesCryptoPayload.expTime;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = marketFavoritesCryptoPayload.chainId;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = marketFavoritesCryptoPayload.tokenContractAddress;
        }
        return marketFavoritesCryptoPayload.copy(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesCryptoPayload copy(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MarketFavoritesCryptoPayload(i, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFavoritesCryptoPayload)) {
            return false;
        }
        MarketFavoritesCryptoPayload marketFavoritesCryptoPayload = (MarketFavoritesCryptoPayload) obj;
        return this.operator == marketFavoritesCryptoPayload.operator && Intrinsics.EZpvd((Object) this.instId, (Object) marketFavoritesCryptoPayload.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) marketFavoritesCryptoPayload.instType) && Intrinsics.EZpvd((Object) this.alias, (Object) marketFavoritesCryptoPayload.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) marketFavoritesCryptoPayload.expTime) && Intrinsics.EZpvd((Object) this.chainId, (Object) marketFavoritesCryptoPayload.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) marketFavoritesCryptoPayload.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.operator);
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.instType.hashCode();
        String str = this.alias;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.expTime;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenContractAddress;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketFavoritesCryptoPayload(operator=" + this.operator + ", instId=" + this.instId + ", instType=" + this.instType + ", alias=" + this.alias + ", expTime=" + this.expTime + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public MarketFavoritesCryptoPayload(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.operator = i;
        this.instId = str;
        this.instType = str2;
        this.alias = str3;
        this.expTime = str4;
        this.chainId = str5;
        this.tokenContractAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptoPayload.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketFavoritesCryptoPayload(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesCryptoPayload.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
