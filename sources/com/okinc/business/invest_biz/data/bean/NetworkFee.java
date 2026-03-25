package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NetworkFee implements Parcelable {
    public static final int $stable = 0;
    private final NetworkGear averageGear;
    private final String baseFee;
    private final String coinPrice;
    private final String coinUnit;
    private final NetworkGear fastGear;
    private final String gasPriceUnit;
    private final String maxGasPrice;
    private final String minGasPrice;
    private final NetworkGear slowGear;
    private final String suggestBaseFee;
    private final boolean supportEip1559;
    private final boolean supportSwitchGear;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NetworkFee> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NetworkFee> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<NetworkGear> creator = NetworkGear.CREATOR;
            return new NetworkFee(creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), creator.createFromParcel(parcel), parcel.readString(), creator.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFee[] newArray(int i) {
            return new NetworkFee[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkFee() {
        this((NetworkGear) null, (String) null, (String) null, (String) null, (NetworkGear) null, (String) null, (NetworkGear) null, (String) null, false, false, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear component1() {
        return this.averageGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.supportSwitchGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear component5() {
        return this.fastGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear component7() {
        return this.slowGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee copy(@NotNull NetworkGear networkGear, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull NetworkGear networkGear2, @NotNull String str4, @NotNull NetworkGear networkGear3, @NotNull String str5, boolean z, boolean z2, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(networkGear, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(networkGear2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(networkGear3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new NetworkFee(networkGear, str, str2, str3, networkGear2, str4, networkGear3, str5, z, z2, str6, str7);
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
        if (!(obj instanceof NetworkFee)) {
            return false;
        }
        NetworkFee networkFee = (NetworkFee) obj;
        return Intrinsics.EZpvd(this.averageGear, networkFee.averageGear) && Intrinsics.EZpvd((Object) this.baseFee, (Object) networkFee.baseFee) && Intrinsics.EZpvd((Object) this.coinPrice, (Object) networkFee.coinPrice) && Intrinsics.EZpvd((Object) this.coinUnit, (Object) networkFee.coinUnit) && Intrinsics.EZpvd(this.fastGear, networkFee.fastGear) && Intrinsics.EZpvd((Object) this.gasPriceUnit, (Object) networkFee.gasPriceUnit) && Intrinsics.EZpvd(this.slowGear, networkFee.slowGear) && Intrinsics.EZpvd((Object) this.suggestBaseFee, (Object) networkFee.suggestBaseFee) && this.supportEip1559 == networkFee.supportEip1559 && this.supportSwitchGear == networkFee.supportSwitchGear && Intrinsics.EZpvd((Object) this.minGasPrice, (Object) networkFee.minGasPrice) && Intrinsics.EZpvd((Object) this.maxGasPrice, (Object) networkFee.maxGasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear getAverageGear() {
        return this.averageGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPrice() {
        return this.coinPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUnit() {
        return this.coinUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear getFastGear() {
        return this.fastGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnit() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasPrice() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear getSlowGear() {
        return this.slowGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportSwitchGear() {
        return this.supportSwitchGear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.averageGear.hashCode() * 31) + this.baseFee.hashCode()) * 31) + this.coinPrice.hashCode()) * 31) + this.coinUnit.hashCode()) * 31) + this.fastGear.hashCode()) * 31) + this.gasPriceUnit.hashCode()) * 31) + this.slowGear.hashCode()) * 31) + this.suggestBaseFee.hashCode()) * 31) + Boolean.hashCode(this.supportEip1559)) * 31) + Boolean.hashCode(this.supportSwitchGear)) * 31) + this.minGasPrice.hashCode()) * 31) + this.maxGasPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkFee(averageGear=" + this.averageGear + ", baseFee=" + this.baseFee + ", coinPrice=" + this.coinPrice + ", coinUnit=" + this.coinUnit + ", fastGear=" + this.fastGear + ", gasPriceUnit=" + this.gasPriceUnit + ", slowGear=" + this.slowGear + ", suggestBaseFee=" + this.suggestBaseFee + ", supportEip1559=" + this.supportEip1559 + ", supportSwitchGear=" + this.supportSwitchGear + ", minGasPrice=" + this.minGasPrice + ", maxGasPrice=" + this.maxGasPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.averageGear.writeToParcel(parcel, i);
        parcel.writeString(this.baseFee);
        parcel.writeString(this.coinPrice);
        parcel.writeString(this.coinUnit);
        this.fastGear.writeToParcel(parcel, i);
        parcel.writeString(this.gasPriceUnit);
        this.slowGear.writeToParcel(parcel, i);
        parcel.writeString(this.suggestBaseFee);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeInt(this.supportSwitchGear ? 1 : 0);
        parcel.writeString(this.minGasPrice);
        parcel.writeString(this.maxGasPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.NetworkFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkFee> serializer() {
            return NetworkFee$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkFee(int i, NetworkGear networkGear, String str, String str2, String str3, NetworkGear networkGear2, String str4, NetworkGear networkGear3, String str5, boolean z, boolean z2, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        this.averageGear = (i & 1) == 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear;
        if ((i & 2) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str;
        }
        if ((i & 4) == 0) {
            this.coinPrice = "";
        } else {
            this.coinPrice = str2;
        }
        if ((i & 8) == 0) {
            this.coinUnit = "";
        } else {
            this.coinUnit = str3;
        }
        this.fastGear = (i & 16) == 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear2;
        if ((i & 32) == 0) {
            this.gasPriceUnit = "";
        } else {
            this.gasPriceUnit = str4;
        }
        this.slowGear = (i & 64) == 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear3;
        if ((i & 128) == 0) {
            this.suggestBaseFee = "";
        } else {
            this.suggestBaseFee = str5;
        }
        this.supportEip1559 = (i & 256) == 0 ? false : z;
        this.supportSwitchGear = (i & 512) == 0 ? true : z2;
        if ((i & 1024) == 0) {
            this.minGasPrice = "";
        } else {
            this.minGasPrice = str6;
        }
        if ((i & 2048) == 0) {
            this.maxGasPrice = "";
        } else {
            this.maxGasPrice = str7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [426=4] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(NetworkFee networkFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(networkFee.averageGear, new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, NetworkGear$$serializer.INSTANCE, networkFee.averageGear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) networkFee.baseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, networkFee.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) networkFee.coinPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, networkFee.coinPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) networkFee.coinUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, networkFee.coinUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(networkFee.fastGear, new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, NetworkGear$$serializer.INSTANCE, networkFee.fastGear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) networkFee.gasPriceUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, networkFee.gasPriceUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(networkFee.slowGear, new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, NetworkGear$$serializer.INSTANCE, networkFee.slowGear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) networkFee.suggestBaseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, networkFee.suggestBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || networkFee.supportEip1559) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, networkFee.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !networkFee.supportSwitchGear) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, networkFee.supportSwitchGear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) networkFee.minGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, networkFee.minGasPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) networkFee.maxGasPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, networkFee.maxGasPrice);
    }

    public NetworkFee(@NotNull NetworkGear networkGear, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull NetworkGear networkGear2, @NotNull String str4, @NotNull NetworkGear networkGear3, @NotNull String str5, boolean z, boolean z2, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(networkGear, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(networkGear2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(networkGear3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.averageGear = networkGear;
        this.baseFee = str;
        this.coinPrice = str2;
        this.coinUnit = str3;
        this.fastGear = networkGear2;
        this.gasPriceUnit = str4;
        this.slowGear = networkGear3;
        this.suggestBaseFee = str5;
        this.supportEip1559 = z;
        this.supportSwitchGear = z2;
        this.minGasPrice = str6;
        this.maxGasPrice = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ae: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkGear:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:430) call: com.okinc.business.invest_biz.data.bean.NetworkGear.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.invest_biz.data.bean.NetworkGear))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkGear:?: TERNARY null = ((wrap:int:0x0030: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:434) call: com.okinc.business.invest_biz.data.bean.NetworkGear.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.invest_biz.data.bean.NetworkGear))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkGear:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:436) call: com.okinc.business.invest_biz.data.bean.NetworkGear.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.invest_biz.data.bean.NetworkGear))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0075: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:429) call: com.okinc.business.invest_biz.data.bean.NetworkFee.<init>(com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, com.okinc.business.invest_biz.data.bean.NetworkGear, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkFee(NetworkGear networkGear, String str, String str2, String str3, NetworkGear networkGear2, String str4, NetworkGear networkGear3, String str5, boolean z, boolean z2, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? new NetworkGear((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : networkGear3, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? "" : str6, (i & 2048) == 0 ? str7 : "");
    }
}
