package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeMultipleTpPriceData implements Parcelable {
    private String amount;
    private String amountApi;
    private Integer color;
    private String failCode;
    private String failReason;
    private boolean isAmountValid;
    private boolean isPriceValid;
    private boolean isTpLimit;
    private float percent;
    private final String price;
    private String profit;
    private String triggerPriceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeMultipleTpPriceData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeMultipleTpPriceData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipleTpPriceData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeMultipleTpPriceData(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeMultipleTpPriceData[] newArray(int i) {
            return new TradeMultipleTpPriceData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amountApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.triggerPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isPriceValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isAmountValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMultipleTpPriceData copy(@NotNull String str, @NotNull String str2, float f, Integer num, @NotNull String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TradeMultipleTpPriceData(str, str2, f, num, str3, str4, str5, z, z2, z3, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeMultipleTpPriceData)) {
            return false;
        }
        TradeMultipleTpPriceData tradeMultipleTpPriceData = (TradeMultipleTpPriceData) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) tradeMultipleTpPriceData.price) && Intrinsics.EZpvd((Object) this.amount, (Object) tradeMultipleTpPriceData.amount) && Float.compare(this.percent, tradeMultipleTpPriceData.percent) == 0 && Intrinsics.EZpvd(this.color, tradeMultipleTpPriceData.color) && Intrinsics.EZpvd((Object) this.amountApi, (Object) tradeMultipleTpPriceData.amountApi) && Intrinsics.EZpvd((Object) this.triggerPriceType, (Object) tradeMultipleTpPriceData.triggerPriceType) && Intrinsics.EZpvd((Object) this.profit, (Object) tradeMultipleTpPriceData.profit) && this.isPriceValid == tradeMultipleTpPriceData.isPriceValid && this.isAmountValid == tradeMultipleTpPriceData.isAmountValid && this.isTpLimit == tradeMultipleTpPriceData.isTpLimit && Intrinsics.EZpvd((Object) this.failCode, (Object) tradeMultipleTpPriceData.failCode) && Intrinsics.EZpvd((Object) this.failReason, (Object) tradeMultipleTpPriceData.failReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountApi() {
        return this.amountApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCode() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.price.hashCode();
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = Float.hashCode(this.percent);
        Integer num = this.color;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.amountApi.hashCode();
        String str = this.triggerPriceType;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.profit;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isPriceValid);
        int iHashCode9 = Boolean.hashCode(this.isAmountValid);
        int iHashCode10 = Boolean.hashCode(this.isTpLimit);
        String str3 = this.failCode;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.failReason;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAmountValid() {
        return this.isAmountValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPriceValid() {
        return this.isPriceValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTpLimit() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountApi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountApi = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountValid(boolean z) {
        this.isAmountValid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColor(Integer num) {
        this.color = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCode(String str) {
        this.failCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(String str) {
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercent(float f) {
        this.percent = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceValid(boolean z) {
        this.isPriceValid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(String str) {
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpLimit(boolean z) {
        this.isTpLimit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPriceType(String str) {
        this.triggerPriceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.price);
        parcel.writeString(this.amount);
        parcel.writeFloat(this.percent);
        Integer num = this.color;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.amountApi);
        parcel.writeString(this.triggerPriceType);
        parcel.writeString(this.profit);
        parcel.writeInt(this.isPriceValid ? 1 : 0);
        parcel.writeInt(this.isAmountValid ? 1 : 0);
        parcel.writeInt(this.isTpLimit ? 1 : 0);
        parcel.writeString(this.failCode);
        parcel.writeString(this.failReason);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeMultipleTpPriceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeMultipleTpPriceData> serializer() {
            return TradeMultipleTpPriceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeMultipleTpPriceData(int i, String str, String str2, float f, Integer num, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TradeMultipleTpPriceData$$serializer.INSTANCE.getDescriptor());
        }
        this.price = str;
        this.amount = str2;
        if ((i & 4) == 0) {
            this.percent = 0.0f;
        } else {
            this.percent = f;
        }
        if ((i & 8) == 0) {
            this.color = null;
        } else {
            this.color = num;
        }
        if ((i & 16) == 0) {
            this.amountApi = "";
        } else {
            this.amountApi = str3;
        }
        if ((i & 32) == 0) {
            this.triggerPriceType = null;
        } else {
            this.triggerPriceType = str4;
        }
        if ((i & 64) == 0) {
            this.profit = null;
        } else {
            this.profit = str5;
        }
        if ((i & 128) == 0) {
            this.isPriceValid = true;
        } else {
            this.isPriceValid = z;
        }
        if ((i & 256) == 0) {
            this.isAmountValid = true;
        } else {
            this.isAmountValid = z2;
        }
        if ((i & 512) == 0) {
            this.isTpLimit = false;
        } else {
            this.isTpLimit = z3;
        }
        if ((i & 1024) == 0) {
            this.failCode = null;
        } else {
            this.failCode = str6;
        }
        if ((i & 2048) == 0) {
            this.failReason = null;
        } else {
            this.failReason = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeMultipleTpPriceData tradeMultipleTpPriceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeMultipleTpPriceData.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeMultipleTpPriceData.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Float.compare(tradeMultipleTpPriceData.percent, 0.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 2, tradeMultipleTpPriceData.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeMultipleTpPriceData.color != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, tradeMultipleTpPriceData.color);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeMultipleTpPriceData.amountApi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeMultipleTpPriceData.amountApi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeMultipleTpPriceData.triggerPriceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeMultipleTpPriceData.triggerPriceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeMultipleTpPriceData.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeMultipleTpPriceData.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !tradeMultipleTpPriceData.isPriceValid) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, tradeMultipleTpPriceData.isPriceValid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !tradeMultipleTpPriceData.isAmountValid) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, tradeMultipleTpPriceData.isAmountValid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeMultipleTpPriceData.isTpLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, tradeMultipleTpPriceData.isTpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tradeMultipleTpPriceData.failCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tradeMultipleTpPriceData.failCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && tradeMultipleTpPriceData.failReason == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradeMultipleTpPriceData.failReason);
    }

    public TradeMultipleTpPriceData(@NotNull String str, @NotNull String str2, float f, Integer num, @NotNull String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.price = str;
        this.amount = str2;
        this.percent = f;
        this.color = num;
        this.amountApi = str3;
        this.triggerPriceType = str4;
        this.profit = str5;
        this.isPriceValid = z;
        this.isAmountValid = z2;
        this.isTpLimit = z3;
        this.failCode = str6;
        this.failReason = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005d: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r18v0 float))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, float, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.TradeMultipleTpPriceData.<init>(java.lang.String, java.lang.String, float, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeMultipleTpPriceData(String str, String str2, float f, Integer num, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? true : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7);
    }

    public String toString() {
        return "price:" + this.price + " amount:" + this.amount + " percent:" + this.percent + " amountApi:" + this.amountApi + " triggerPriceType:" + this.triggerPriceType + " profit:" + this.profit;
    }
}
