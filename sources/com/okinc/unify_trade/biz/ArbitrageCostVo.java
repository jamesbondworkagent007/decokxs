package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageCostVo implements Parcelable {
    public static final int $stable = 0;
    private final String closeSpreadRatio;
    private final String fundUtilizationRatio;
    private final String openSpreadRatio;
    private final String spotFeeRatio;
    private final String swapFeeRatio;
    private final String totalCostQuoteAmount;
    private final String totalCostRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ArbitrageCostVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageCostVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageCostVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ArbitrageCostVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageCostVo[] newArray(int i) {
            return new ArbitrageCostVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageCostVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArbitrageCostVo copy$default(ArbitrageCostVo arbitrageCostVo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arbitrageCostVo.openSpreadRatio;
        }
        if ((i & 2) != 0) {
            str2 = arbitrageCostVo.closeSpreadRatio;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = arbitrageCostVo.spotFeeRatio;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = arbitrageCostVo.swapFeeRatio;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = arbitrageCostVo.fundUtilizationRatio;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = arbitrageCostVo.totalCostRatio;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = arbitrageCostVo.totalCostQuoteAmount;
        }
        return arbitrageCostVo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.openSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.closeSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.spotFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.swapFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fundUtilizationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalCostRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalCostQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageCostVo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new ArbitrageCostVo(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof ArbitrageCostVo)) {
            return false;
        }
        ArbitrageCostVo arbitrageCostVo = (ArbitrageCostVo) obj;
        return Intrinsics.EZpvd((Object) this.openSpreadRatio, (Object) arbitrageCostVo.openSpreadRatio) && Intrinsics.EZpvd((Object) this.closeSpreadRatio, (Object) arbitrageCostVo.closeSpreadRatio) && Intrinsics.EZpvd((Object) this.spotFeeRatio, (Object) arbitrageCostVo.spotFeeRatio) && Intrinsics.EZpvd((Object) this.swapFeeRatio, (Object) arbitrageCostVo.swapFeeRatio) && Intrinsics.EZpvd((Object) this.fundUtilizationRatio, (Object) arbitrageCostVo.fundUtilizationRatio) && Intrinsics.EZpvd((Object) this.totalCostRatio, (Object) arbitrageCostVo.totalCostRatio) && Intrinsics.EZpvd((Object) this.totalCostQuoteAmount, (Object) arbitrageCostVo.totalCostQuoteAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseSpreadRatio() {
        return this.closeSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundUtilizationRatio() {
        return this.fundUtilizationRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenSpreadRatio() {
        return this.openSpreadRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotFeeRatio() {
        return this.spotFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapFeeRatio() {
        return this.swapFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCostQuoteAmount() {
        return this.totalCostQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCostRatio() {
        return this.totalCostRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.openSpreadRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.closeSpreadRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.spotFeeRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.swapFeeRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fundUtilizationRatio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalCostRatio;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.totalCostQuoteAmount;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageCostVo(openSpreadRatio=" + this.openSpreadRatio + ", closeSpreadRatio=" + this.closeSpreadRatio + ", spotFeeRatio=" + this.spotFeeRatio + ", swapFeeRatio=" + this.swapFeeRatio + ", fundUtilizationRatio=" + this.fundUtilizationRatio + ", totalCostRatio=" + this.totalCostRatio + ", totalCostQuoteAmount=" + this.totalCostQuoteAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.openSpreadRatio);
        parcel.writeString(this.closeSpreadRatio);
        parcel.writeString(this.spotFeeRatio);
        parcel.writeString(this.swapFeeRatio);
        parcel.writeString(this.fundUtilizationRatio);
        parcel.writeString(this.totalCostRatio);
        parcel.writeString(this.totalCostQuoteAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageCostVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageCostVo> serializer() {
            return ArbitrageCostVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageCostVo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.openSpreadRatio = null;
        } else {
            this.openSpreadRatio = str;
        }
        if ((i & 2) == 0) {
            this.closeSpreadRatio = null;
        } else {
            this.closeSpreadRatio = str2;
        }
        if ((i & 4) == 0) {
            this.spotFeeRatio = null;
        } else {
            this.spotFeeRatio = str3;
        }
        if ((i & 8) == 0) {
            this.swapFeeRatio = null;
        } else {
            this.swapFeeRatio = str4;
        }
        if ((i & 16) == 0) {
            this.fundUtilizationRatio = null;
        } else {
            this.fundUtilizationRatio = str5;
        }
        if ((i & 32) == 0) {
            this.totalCostRatio = null;
        } else {
            this.totalCostRatio = str6;
        }
        if ((i & 64) == 0) {
            this.totalCostQuoteAmount = null;
        } else {
            this.totalCostQuoteAmount = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageCostVo arbitrageCostVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageCostVo.openSpreadRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbitrageCostVo.openSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageCostVo.closeSpreadRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitrageCostVo.closeSpreadRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageCostVo.spotFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, arbitrageCostVo.spotFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageCostVo.swapFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, arbitrageCostVo.swapFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageCostVo.fundUtilizationRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbitrageCostVo.fundUtilizationRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || arbitrageCostVo.totalCostRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbitrageCostVo.totalCostRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && arbitrageCostVo.totalCostQuoteAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, arbitrageCostVo.totalCostQuoteAmount);
    }

    public ArbitrageCostVo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.openSpreadRatio = str;
        this.closeSpreadRatio = str2;
        this.spotFeeRatio = str3;
        this.swapFeeRatio = str4;
        this.fundUtilizationRatio = str5;
        this.totalCostRatio = str6;
        this.totalCostQuoteAmount = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4547) call: com.okinc.unify_trade.biz.ArbitrageCostVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ArbitrageCostVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
