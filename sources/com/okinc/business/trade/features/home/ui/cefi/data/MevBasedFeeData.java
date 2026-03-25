package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MevBasedFeeData implements Parcelable {
    public static final int $stable = 0;
    private final String baseFee;
    private final String baseFeeUsd;
    private final String decimals;
    private final String fastFee;
    private final String fastFeeUsd;
    private final String marketFee;
    private final String marketFeeUsd;
    private final String maxBaseFee;
    private final String maxFee;
    private final String minFee;
    private final String price;
    private final String tokenSymbol;
    private final String turboFee;
    private final String turboFeeUsd;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MevBasedFeeData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MevBasedFeeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevBasedFeeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MevBasedFeeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevBasedFeeData[] newArray(int i) {
            return new MevBasedFeeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MevBasedFeeData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.turboFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fastFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.marketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevBasedFeeData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new MevBasedFeeData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
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
        if (!(obj instanceof MevBasedFeeData)) {
            return false;
        }
        MevBasedFeeData mevBasedFeeData = (MevBasedFeeData) obj;
        return Intrinsics.EZpvd((Object) this.baseFee, (Object) mevBasedFeeData.baseFee) && Intrinsics.EZpvd((Object) this.baseFeeUsd, (Object) mevBasedFeeData.baseFeeUsd) && Intrinsics.EZpvd((Object) this.fastFee, (Object) mevBasedFeeData.fastFee) && Intrinsics.EZpvd((Object) this.fastFeeUsd, (Object) mevBasedFeeData.fastFeeUsd) && Intrinsics.EZpvd((Object) this.marketFee, (Object) mevBasedFeeData.marketFee) && Intrinsics.EZpvd((Object) this.marketFeeUsd, (Object) mevBasedFeeData.marketFeeUsd) && Intrinsics.EZpvd((Object) this.maxFee, (Object) mevBasedFeeData.maxFee) && Intrinsics.EZpvd((Object) this.maxBaseFee, (Object) mevBasedFeeData.maxBaseFee) && Intrinsics.EZpvd((Object) this.minFee, (Object) mevBasedFeeData.minFee) && Intrinsics.EZpvd((Object) this.turboFee, (Object) mevBasedFeeData.turboFee) && Intrinsics.EZpvd((Object) this.turboFeeUsd, (Object) mevBasedFeeData.turboFeeUsd) && Intrinsics.EZpvd((Object) this.decimals, (Object) mevBasedFeeData.decimals) && Intrinsics.EZpvd((Object) this.price, (Object) mevBasedFeeData.price) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) mevBasedFeeData.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFeeUsd() {
        return this.baseFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFee() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFeeUsd() {
        return this.fastFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketFee() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketFeeUsd() {
        return this.marketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBaseFee() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFee() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFee() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboFee() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboFeeUsd() {
        return this.turboFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.baseFeeUsd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fastFee;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fastFeeUsd;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.marketFee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.marketFeeUsd;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.maxFee;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxBaseFee;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.minFee;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.turboFee;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.turboFeeUsd;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.decimals;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.price;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tokenSymbol;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MevBasedFeeData(baseFee=" + this.baseFee + ", baseFeeUsd=" + this.baseFeeUsd + ", fastFee=" + this.fastFee + ", fastFeeUsd=" + this.fastFeeUsd + ", marketFee=" + this.marketFee + ", marketFeeUsd=" + this.marketFeeUsd + ", maxFee=" + this.maxFee + ", maxBaseFee=" + this.maxBaseFee + ", minFee=" + this.minFee + ", turboFee=" + this.turboFee + ", turboFeeUsd=" + this.turboFeeUsd + ", decimals=" + this.decimals + ", price=" + this.price + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseFee);
        parcel.writeString(this.baseFeeUsd);
        parcel.writeString(this.fastFee);
        parcel.writeString(this.fastFeeUsd);
        parcel.writeString(this.marketFee);
        parcel.writeString(this.marketFeeUsd);
        parcel.writeString(this.maxFee);
        parcel.writeString(this.maxBaseFee);
        parcel.writeString(this.minFee);
        parcel.writeString(this.turboFee);
        parcel.writeString(this.turboFeeUsd);
        parcel.writeString(this.decimals);
        parcel.writeString(this.price);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MevBasedFeeData> serializer() {
            return MevBasedFeeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MevBasedFeeData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str;
        }
        if ((i & 2) == 0) {
            this.baseFeeUsd = "";
        } else {
            this.baseFeeUsd = str2;
        }
        if ((i & 4) == 0) {
            this.fastFee = "";
        } else {
            this.fastFee = str3;
        }
        if ((i & 8) == 0) {
            this.fastFeeUsd = "";
        } else {
            this.fastFeeUsd = str4;
        }
        if ((i & 16) == 0) {
            this.marketFee = "";
        } else {
            this.marketFee = str5;
        }
        if ((i & 32) == 0) {
            this.marketFeeUsd = "";
        } else {
            this.marketFeeUsd = str6;
        }
        if ((i & 64) == 0) {
            this.maxFee = "";
        } else {
            this.maxFee = str7;
        }
        this.maxBaseFee = (i & 128) == 0 ? null : str8;
        if ((i & 256) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str9;
        }
        if ((i & 512) == 0) {
            this.turboFee = "";
        } else {
            this.turboFee = str10;
        }
        if ((i & 1024) == 0) {
            this.turboFeeUsd = "";
        } else {
            this.turboFeeUsd = str11;
        }
        if ((i & 2048) == 0) {
            this.decimals = "";
        } else {
            this.decimals = str12;
        }
        if ((i & 4096) == 0) {
            this.price = "";
        } else {
            this.price = str13;
        }
        if ((i & 8192) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MevBasedFeeData mevBasedFeeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mevBasedFeeData.baseFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mevBasedFeeData.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mevBasedFeeData.baseFeeUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mevBasedFeeData.baseFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) mevBasedFeeData.fastFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mevBasedFeeData.fastFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) mevBasedFeeData.fastFeeUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, mevBasedFeeData.fastFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) mevBasedFeeData.marketFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, mevBasedFeeData.marketFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) mevBasedFeeData.marketFeeUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, mevBasedFeeData.marketFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) mevBasedFeeData.maxFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mevBasedFeeData.maxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mevBasedFeeData.maxBaseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, mevBasedFeeData.maxBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) mevBasedFeeData.minFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, mevBasedFeeData.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) mevBasedFeeData.turboFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, mevBasedFeeData.turboFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) mevBasedFeeData.turboFeeUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, mevBasedFeeData.turboFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) mevBasedFeeData.decimals, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, mevBasedFeeData.decimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) mevBasedFeeData.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, mevBasedFeeData.price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) mevBasedFeeData.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, mevBasedFeeData.tokenSymbol);
    }

    public MevBasedFeeData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.baseFee = str;
        this.baseFeeUsd = str2;
        this.fastFee = str3;
        this.fastFeeUsd = str4;
        this.marketFee = str5;
        this.marketFeeUsd = str6;
        this.maxFee = str7;
        this.maxBaseFee = str8;
        this.minFee = str9;
        this.turboFee = str10;
        this.turboFeeUsd = str11;
        this.decimals = str12;
        this.price = str13;
        this.tokenSymbol = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:442) call: com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MevBasedFeeData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) == 0 ? str14 : "");
    }

    public final MevInfoBean toMevInfoBean() {
        String str = this.baseFee;
        String str2 = str == null ? "" : str;
        String str3 = this.maxBaseFee;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.baseFeeUsd;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.fastFee;
        String str8 = str7 == null ? "" : str7;
        String str9 = str7 == null ? "" : str7;
        String str10 = str7 == null ? "" : str7;
        String str11 = this.fastFeeUsd;
        String str12 = str11 == null ? "" : str11;
        String str13 = str11 == null ? "" : str11;
        String str14 = this.marketFee;
        String str15 = str14 == null ? "" : str14;
        String str16 = str14 == null ? "" : str14;
        String str17 = str14 == null ? "" : str14;
        String str18 = this.marketFeeUsd;
        String str19 = str18 == null ? "" : str18;
        String str20 = str18 == null ? "" : str18;
        String str21 = this.turboFee;
        String str22 = str21 == null ? "" : str21;
        String str23 = str21 == null ? "" : str21;
        String str24 = str21 == null ? "" : str21;
        String str25 = this.turboFeeUsd;
        return new MevInfoBean(str2, str6, str8, str12, str13, str9, true, str15, str19, str20, str16, (String) null, str22, str25 == null ? "" : str25, str25 == null ? "" : str25, str23, str17, str10, str24, str4, 2048, (DefaultConstructorMarker) null);
    }

    public final NonMevPriorityFeeInfo toNonMevInfoBean() {
        String str = this.baseFee;
        String str2 = str == null ? "" : str;
        String str3 = this.maxBaseFee;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.baseFeeUsd;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.fastFee;
        String str8 = str7 == null ? "" : str7;
        String str9 = str7 == null ? "" : str7;
        String str10 = str7 == null ? "" : str7;
        String str11 = this.fastFeeUsd;
        String str12 = str11 == null ? "" : str11;
        String str13 = str11 == null ? "" : str11;
        String str14 = this.marketFee;
        String str15 = str14 == null ? "" : str14;
        String str16 = str14 == null ? "" : str14;
        String str17 = str14 == null ? "" : str14;
        String str18 = this.marketFeeUsd;
        String str19 = str18 == null ? "" : str18;
        String str20 = str18 == null ? "" : str18;
        String str21 = this.turboFee;
        String str22 = str21 == null ? "" : str21;
        String str23 = str21 == null ? "" : str21;
        String str24 = str21 == null ? "" : str21;
        String str25 = this.turboFeeUsd;
        return new NonMevPriorityFeeInfo(str2, str6, str8, str12, str13, str9, str15, str19, str20, str16, str22, str25 == null ? "" : str25, str25 == null ? "" : str25, str23, str17, str10, str24, str4);
    }
}
