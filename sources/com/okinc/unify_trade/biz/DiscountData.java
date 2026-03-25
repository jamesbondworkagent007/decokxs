package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DiscountData {
    private final Boolean amountLimit;
    private final String ccy;
    private final String coins;
    private final String collateralRestrict;
    private final String discountClass;
    private final Boolean fixedDiscount;
    private final Boolean greyFlag;
    private final ArrayList<RateInfo> rateInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RateInfo$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.discountClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RateInfo> component3() {
        return this.rateInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.fixedDiscount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.amountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.greyFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.collateralRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscountData copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<RateInfo> arrayList, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new DiscountData(str, str2, arrayList, str3, bool, bool2, bool3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountData)) {
            return false;
        }
        DiscountData discountData = (DiscountData) obj;
        return Intrinsics.EZpvd((Object) this.coins, (Object) discountData.coins) && Intrinsics.EZpvd((Object) this.discountClass, (Object) discountData.discountClass) && Intrinsics.EZpvd(this.rateInfos, discountData.rateInfos) && Intrinsics.EZpvd((Object) this.ccy, (Object) discountData.ccy) && Intrinsics.EZpvd(this.fixedDiscount, discountData.fixedDiscount) && Intrinsics.EZpvd(this.amountLimit, discountData.amountLimit) && Intrinsics.EZpvd(this.greyFlag, discountData.greyFlag) && Intrinsics.EZpvd((Object) this.collateralRestrict, (Object) discountData.collateralRestrict);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAmountLimit() {
        return this.amountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoins() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralRestrict() {
        return this.collateralRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountClass() {
        return this.discountClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFixedDiscount() {
        return this.fixedDiscount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGreyFlag() {
        return this.greyFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RateInfo> getRateInfos() {
        return this.rateInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coins.hashCode();
        int iHashCode2 = this.discountClass.hashCode();
        int iHashCode3 = this.rateInfos.hashCode();
        String str = this.ccy;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool = this.fixedDiscount;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.amountLimit;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.greyFlag;
        int iHashCode7 = bool3 == null ? 0 : bool3.hashCode();
        String str2 = this.collateralRestrict;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DiscountData(coins=" + this.coins + ", discountClass=" + this.discountClass + ", rateInfos=" + this.rateInfos + ", ccy=" + this.ccy + ", fixedDiscount=" + this.fixedDiscount + ", amountLimit=" + this.amountLimit + ", greyFlag=" + this.greyFlag + ", collateralRestrict=" + this.collateralRestrict + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DiscountData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DiscountData> serializer() {
            return DiscountData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DiscountData(int i, String str, String str2, ArrayList arrayList, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DiscountData$$serializer.INSTANCE.getDescriptor());
        }
        this.coins = str;
        this.discountClass = str2;
        this.rateInfos = arrayList;
        if ((i & 8) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str3;
        }
        if ((i & 16) == 0) {
            this.fixedDiscount = null;
        } else {
            this.fixedDiscount = bool;
        }
        if ((i & 32) == 0) {
            this.amountLimit = null;
        } else {
            this.amountLimit = bool2;
        }
        if ((i & 64) == 0) {
            this.greyFlag = null;
        } else {
            this.greyFlag = bool3;
        }
        if ((i & 128) == 0) {
            this.collateralRestrict = "";
        } else {
            this.collateralRestrict = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DiscountData discountData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, discountData.coins);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, discountData.discountClass);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], discountData.rateInfos);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || discountData.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, discountData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || discountData.fixedDiscount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, discountData.fixedDiscount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || discountData.amountLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, discountData.amountLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || discountData.greyFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, discountData.greyFlag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) discountData.collateralRestrict, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, discountData.collateralRestrict);
    }

    public DiscountData(@NotNull String str, @NotNull String str2, @NotNull ArrayList<RateInfo> arrayList, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.coins = str;
        this.discountClass = str2;
        this.rateInfos = arrayList;
        this.ccy = str3;
        this.fixedDiscount = bool;
        this.amountLimit = bool2;
        this.greyFlag = bool3;
        this.collateralRestrict = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.RateInfo>, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:1338) call: com.okinc.unify_trade.biz.DiscountData.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DiscountData(String str, String str2, ArrayList arrayList, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, arrayList, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? "" : str4);
    }
}
