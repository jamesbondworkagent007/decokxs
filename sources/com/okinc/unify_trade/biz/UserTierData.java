package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class UserTierData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String alias;
    private final String ccy;
    private final String imr;
    private final String instFamily;
    private final String maxAmount;
    private final String maxLeverage;
    private final String minAmount;
    private final String mmr;
    private final String optionMarginFactor;
    private final String posSide;
    private final String preLiquidRatio;
    private final String quoteMaxBorrow;
    private final String tier;
    private final String uly;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserTierData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.preLiquidRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteMaxBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.optionMarginFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTierData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new UserTierData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTierData)) {
            return false;
        }
        UserTierData userTierData = (UserTierData) obj;
        return Intrinsics.EZpvd((Object) this.tier, (Object) userTierData.tier) && Intrinsics.EZpvd((Object) this.minAmount, (Object) userTierData.minAmount) && Intrinsics.EZpvd((Object) this.maxAmount, (Object) userTierData.maxAmount) && Intrinsics.EZpvd((Object) this.preLiquidRatio, (Object) userTierData.preLiquidRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) userTierData.mmr) && Intrinsics.EZpvd((Object) this.imr, (Object) userTierData.imr) && Intrinsics.EZpvd((Object) this.maxLeverage, (Object) userTierData.maxLeverage) && Intrinsics.EZpvd((Object) this.quoteMaxBorrow, (Object) userTierData.quoteMaxBorrow) && Intrinsics.EZpvd((Object) this.optionMarginFactor, (Object) userTierData.optionMarginFactor) && Intrinsics.EZpvd((Object) this.alias, (Object) userTierData.alias) && Intrinsics.EZpvd((Object) this.posSide, (Object) userTierData.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) userTierData.ccy) && Intrinsics.EZpvd((Object) this.uly, (Object) userTierData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) userTierData.instFamily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionMarginFactor() {
        return this.optionMarginFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreLiquidRatio() {
        return this.preLiquidRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteMaxBorrow() {
        return this.quoteMaxBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTier() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.tier.hashCode() * 31) + this.minAmount.hashCode()) * 31) + this.maxAmount.hashCode()) * 31) + this.preLiquidRatio.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.imr.hashCode()) * 31) + this.maxLeverage.hashCode()) * 31) + this.quoteMaxBorrow.hashCode()) * 31) + this.optionMarginFactor.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.uly.hashCode()) * 31) + this.instFamily.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserTierData(tier=" + this.tier + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", preLiquidRatio=" + this.preLiquidRatio + ", mmr=" + this.mmr + ", imr=" + this.imr + ", maxLeverage=" + this.maxLeverage + ", quoteMaxBorrow=" + this.quoteMaxBorrow + ", optionMarginFactor=" + this.optionMarginFactor + ", alias=" + this.alias + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserTierData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserTierData> serializer() {
            return UserTierData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserTierData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tier = "";
        } else {
            this.tier = str;
        }
        if ((i & 2) == 0) {
            this.minAmount = "";
        } else {
            this.minAmount = str2;
        }
        if ((i & 4) == 0) {
            this.maxAmount = "";
        } else {
            this.maxAmount = str3;
        }
        if ((i & 8) == 0) {
            this.preLiquidRatio = "";
        } else {
            this.preLiquidRatio = str4;
        }
        if ((i & 16) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str5;
        }
        if ((i & 32) == 0) {
            this.imr = "";
        } else {
            this.imr = str6;
        }
        if ((i & 64) == 0) {
            this.maxLeverage = "";
        } else {
            this.maxLeverage = str7;
        }
        if ((i & 128) == 0) {
            this.quoteMaxBorrow = "";
        } else {
            this.quoteMaxBorrow = str8;
        }
        if ((i & 256) == 0) {
            this.optionMarginFactor = "";
        } else {
            this.optionMarginFactor = str9;
        }
        if ((i & 512) == 0) {
            this.alias = "";
        } else {
            this.alias = str10;
        }
        if ((i & 1024) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str11;
        }
        if ((i & 2048) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str12;
        }
        if ((i & 4096) == 0) {
            this.uly = "";
        } else {
            this.uly = str13;
        }
        if ((i & 8192) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserTierData userTierData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userTierData.tier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userTierData.tier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userTierData.minAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userTierData.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userTierData.maxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userTierData.maxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userTierData.preLiquidRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, userTierData.preLiquidRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) userTierData.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, userTierData.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userTierData.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, userTierData.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userTierData.maxLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userTierData.maxLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) userTierData.quoteMaxBorrow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, userTierData.quoteMaxBorrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) userTierData.optionMarginFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, userTierData.optionMarginFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) userTierData.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, userTierData.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) userTierData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, userTierData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) userTierData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, userTierData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) userTierData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, userTierData.uly);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) userTierData.instFamily, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, userTierData.instFamily);
    }

    public UserTierData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.tier = str;
        this.minAmount = str2;
        this.maxAmount = str3;
        this.preLiquidRatio = str4;
        this.mmr = str5;
        this.imr = str6;
        this.maxLeverage = str7;
        this.quoteMaxBorrow = str8;
        this.optionMarginFactor = str9;
        this.alias = str10;
        this.posSide = str11;
        this.ccy = str12;
        this.uly = str13;
        this.instFamily = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.UserTierData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UserTierData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) == 0 ? str14 : "");
    }
}
