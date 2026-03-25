package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RateInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String disCcyEq;
    private final String discountRate;
    private final String liquidationRate;
    private final String maxAmount;
    private final String minAmount;
    private final String tier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RateInfo copy$default(RateInfo rateInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rateInfo.minAmount;
        }
        if ((i & 2) != 0) {
            str2 = rateInfo.maxAmount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = rateInfo.discountRate;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = rateInfo.liquidationRate;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = rateInfo.disCcyEq;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = rateInfo.tier;
        }
        return rateInfo.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.liquidationRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.disCcyEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RateInfo(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RateInfo)) {
            return false;
        }
        RateInfo rateInfo = (RateInfo) obj;
        return Intrinsics.EZpvd((Object) this.minAmount, (Object) rateInfo.minAmount) && Intrinsics.EZpvd((Object) this.maxAmount, (Object) rateInfo.maxAmount) && Intrinsics.EZpvd((Object) this.discountRate, (Object) rateInfo.discountRate) && Intrinsics.EZpvd((Object) this.liquidationRate, (Object) rateInfo.liquidationRate) && Intrinsics.EZpvd((Object) this.disCcyEq, (Object) rateInfo.disCcyEq) && Intrinsics.EZpvd((Object) this.tier, (Object) rateInfo.tier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisCcyEq() {
        return this.disCcyEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidationRate() {
        return this.liquidationRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTier() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.minAmount.hashCode();
        int iHashCode2 = this.maxAmount.hashCode();
        int iHashCode3 = this.discountRate.hashCode();
        String str = this.liquidationRate;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.disCcyEq;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tier;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RateInfo(minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", discountRate=" + this.discountRate + ", liquidationRate=" + this.liquidationRate + ", disCcyEq=" + this.disCcyEq + ", tier=" + this.tier + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RateInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RateInfo> serializer() {
            return RateInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RateInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.minAmount = str;
        this.maxAmount = str2;
        this.discountRate = str3;
        if ((i & 8) == 0) {
            this.liquidationRate = null;
        } else {
            this.liquidationRate = str4;
        }
        if ((i & 16) == 0) {
            this.disCcyEq = null;
        } else {
            this.disCcyEq = str5;
        }
        if ((i & 32) == 0) {
            this.tier = null;
        } else {
            this.tier = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RateInfo rateInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rateInfo.minAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rateInfo.maxAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rateInfo.discountRate);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rateInfo.liquidationRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rateInfo.liquidationRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rateInfo.disCcyEq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rateInfo.disCcyEq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && rateInfo.tier == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rateInfo.tier);
    }

    public RateInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.minAmount = str;
        this.maxAmount = str2;
        this.discountRate = str3;
        this.liquidationRate = str4;
        this.disCcyEq = str5;
        this.tier = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1327) call: com.okinc.unify_trade.biz.RateInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RateInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
