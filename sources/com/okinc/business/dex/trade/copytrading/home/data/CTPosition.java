package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String balanceAmount;
    private final String balanceUsdValue;
    private final String buyTokenAmount;
    private final String buyUsdValue;
    private final String lastActive;
    private final String positionId;
    private final String sellTokenAmount;
    private final String sellUsdValue;
    private final TokenInfo tokenInfo;
    private final String totalPnl;
    private final String totalPnlRate;
    private final String unrealizedPnl;
    private final String unrealizedPnlRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTPosition() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenInfo) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    @SerialName("balanceAmount")
    public static /* synthetic */ void getBalanceAmount$annotations() {
    }

    @SerialName("balanceUsdValue")
    public static /* synthetic */ void getBalanceUsdValue$annotations() {
    }

    @SerialName("buyTokenAmount")
    public static /* synthetic */ void getBuyTokenAmount$annotations() {
    }

    @SerialName("buyUsdValue")
    public static /* synthetic */ void getBuyUsdValue$annotations() {
    }

    @SerialName("lastActive")
    public static /* synthetic */ void getLastActive$annotations() {
    }

    @SerialName("positionId")
    public static /* synthetic */ void getPositionId$annotations() {
    }

    @SerialName("sellTokenAmount")
    public static /* synthetic */ void getSellTokenAmount$annotations() {
    }

    @SerialName("sellUsdValue")
    public static /* synthetic */ void getSellUsdValue$annotations() {
    }

    @SerialName("tokenInfo")
    public static /* synthetic */ void getTokenInfo$annotations() {
    }

    @SerialName("totalPnl")
    public static /* synthetic */ void getTotalPnl$annotations() {
    }

    @SerialName("totalPnlRate")
    public static /* synthetic */ void getTotalPnlRate$annotations() {
    }

    @SerialName("unrealizedPnl")
    public static /* synthetic */ void getUnrealizedPnl$annotations() {
    }

    @SerialName("unrealizedPnlRate")
    public static /* synthetic */ void getUnrealizedPnlRate$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.unrealizedPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.balanceUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.positionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sellTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component9() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTPosition copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull TokenInfo tokenInfo, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new CTPosition(str, str2, str3, str4, str5, str6, str7, str8, tokenInfo, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTPosition)) {
            return false;
        }
        CTPosition cTPosition = (CTPosition) obj;
        return Intrinsics.EZpvd((Object) this.balanceAmount, (Object) cTPosition.balanceAmount) && Intrinsics.EZpvd((Object) this.balanceUsdValue, (Object) cTPosition.balanceUsdValue) && Intrinsics.EZpvd((Object) this.buyTokenAmount, (Object) cTPosition.buyTokenAmount) && Intrinsics.EZpvd((Object) this.buyUsdValue, (Object) cTPosition.buyUsdValue) && Intrinsics.EZpvd((Object) this.lastActive, (Object) cTPosition.lastActive) && Intrinsics.EZpvd((Object) this.positionId, (Object) cTPosition.positionId) && Intrinsics.EZpvd((Object) this.sellTokenAmount, (Object) cTPosition.sellTokenAmount) && Intrinsics.EZpvd((Object) this.sellUsdValue, (Object) cTPosition.sellUsdValue) && Intrinsics.EZpvd(this.tokenInfo, cTPosition.tokenInfo) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) cTPosition.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRate, (Object) cTPosition.totalPnlRate) && Intrinsics.EZpvd((Object) this.unrealizedPnl, (Object) cTPosition.unrealizedPnl) && Intrinsics.EZpvd((Object) this.unrealizedPnlRate, (Object) cTPosition.unrealizedPnlRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAmount() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceUsdValue() {
        return this.balanceUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTokenAmount() {
        return this.buyTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyUsdValue() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastActive() {
        return this.lastActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionId() {
        return this.positionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTokenAmount() {
        return this.sellTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellUsdValue() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRate() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedPnlRate() {
        return this.unrealizedPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.balanceAmount.hashCode() * 31) + this.balanceUsdValue.hashCode()) * 31) + this.buyTokenAmount.hashCode()) * 31) + this.buyUsdValue.hashCode()) * 31) + this.lastActive.hashCode()) * 31) + this.positionId.hashCode()) * 31) + this.sellTokenAmount.hashCode()) * 31) + this.sellUsdValue.hashCode()) * 31) + this.tokenInfo.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.totalPnlRate.hashCode()) * 31) + this.unrealizedPnl.hashCode()) * 31) + this.unrealizedPnlRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTPosition(balanceAmount=" + this.balanceAmount + ", balanceUsdValue=" + this.balanceUsdValue + ", buyTokenAmount=" + this.buyTokenAmount + ", buyUsdValue=" + this.buyUsdValue + ", lastActive=" + this.lastActive + ", positionId=" + this.positionId + ", sellTokenAmount=" + this.sellTokenAmount + ", sellUsdValue=" + this.sellUsdValue + ", tokenInfo=" + this.tokenInfo + ", totalPnl=" + this.totalPnl + ", totalPnlRate=" + this.totalPnlRate + ", unrealizedPnl=" + this.unrealizedPnl + ", unrealizedPnlRate=" + this.unrealizedPnlRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTPosition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTPosition> serializer() {
            return CTPosition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTPosition(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TokenInfo tokenInfo, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.balanceAmount = "";
        } else {
            this.balanceAmount = str;
        }
        if ((i & 2) == 0) {
            this.balanceUsdValue = "";
        } else {
            this.balanceUsdValue = str2;
        }
        if ((i & 4) == 0) {
            this.buyTokenAmount = "";
        } else {
            this.buyTokenAmount = str3;
        }
        if ((i & 8) == 0) {
            this.buyUsdValue = "";
        } else {
            this.buyUsdValue = str4;
        }
        if ((i & 16) == 0) {
            this.lastActive = "";
        } else {
            this.lastActive = str5;
        }
        if ((i & 32) == 0) {
            this.positionId = "";
        } else {
            this.positionId = str6;
        }
        if ((i & 64) == 0) {
            this.sellTokenAmount = "";
        } else {
            this.sellTokenAmount = str7;
        }
        if ((i & 128) == 0) {
            this.sellUsdValue = "";
        } else {
            this.sellUsdValue = str8;
        }
        this.tokenInfo = (i & 256) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        if ((i & 512) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str9;
        }
        if ((i & 1024) == 0) {
            this.totalPnlRate = "";
        } else {
            this.totalPnlRate = str10;
        }
        if ((i & 2048) == 0) {
            this.unrealizedPnl = "";
        } else {
            this.unrealizedPnl = str11;
        }
        if ((i & 4096) == 0) {
            this.unrealizedPnlRate = "";
        } else {
            this.unrealizedPnlRate = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTPosition cTPosition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cTPosition.balanceAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cTPosition.balanceAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTPosition.balanceUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTPosition.balanceUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cTPosition.buyTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cTPosition.buyTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) cTPosition.buyUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, cTPosition.buyUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cTPosition.lastActive, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, cTPosition.lastActive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cTPosition.positionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, cTPosition.positionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) cTPosition.sellTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, cTPosition.sellTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) cTPosition.sellUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, cTPosition.sellUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(cTPosition.tokenInfo, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, cTPosition.tokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) cTPosition.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, cTPosition.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) cTPosition.totalPnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, cTPosition.totalPnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) cTPosition.unrealizedPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, cTPosition.unrealizedPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) cTPosition.unrealizedPnlRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, cTPosition.unrealizedPnlRate);
    }

    public CTPosition(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull TokenInfo tokenInfo, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.balanceAmount = str;
        this.balanceUsdValue = str2;
        this.buyTokenAmount = str3;
        this.buyUsdValue = str4;
        this.lastActive = str5;
        this.positionId = str6;
        this.sellTokenAmount = str7;
        this.sellUsdValue = str8;
        this.tokenInfo = tokenInfo;
        this.totalPnl = str9;
        this.totalPnlRate = str10;
        this.unrealizedPnl = str11;
        this.unrealizedPnlRate = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x0044: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (2047 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:332) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r38v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:314) call: com.okinc.business.dex.trade.copytrading.home.data.CTPosition.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CTPosition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TokenInfo tokenInfo, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "");
    }
}
