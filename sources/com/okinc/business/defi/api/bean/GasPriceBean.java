package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class GasPriceBean implements Parcelable {
    private String average;
    private String averageCost;
    private String fast;
    private String fastCost;
    private Integer gweiPrecision;
    private String slow;
    private String slowCost;
    private String usdAverage;
    private String usdFast;
    private String usdLow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GasPriceBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<GasPriceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPriceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GasPriceBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPriceBean[] newArray(int i) {
            return new GasPriceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GasPriceBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPriceBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        return new GasPriceBean(str, str2, str3, str4, str5, str6, str7, str8, str9, num);
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
        if (!(obj instanceof GasPriceBean)) {
            return false;
        }
        GasPriceBean gasPriceBean = (GasPriceBean) obj;
        return Intrinsics.EZpvd((Object) this.slow, (Object) gasPriceBean.slow) && Intrinsics.EZpvd((Object) this.average, (Object) gasPriceBean.average) && Intrinsics.EZpvd((Object) this.fast, (Object) gasPriceBean.fast) && Intrinsics.EZpvd((Object) this.slowCost, (Object) gasPriceBean.slowCost) && Intrinsics.EZpvd((Object) this.averageCost, (Object) gasPriceBean.averageCost) && Intrinsics.EZpvd((Object) this.fastCost, (Object) gasPriceBean.fastCost) && Intrinsics.EZpvd((Object) this.usdLow, (Object) gasPriceBean.usdLow) && Intrinsics.EZpvd((Object) this.usdAverage, (Object) gasPriceBean.usdAverage) && Intrinsics.EZpvd((Object) this.usdFast, (Object) gasPriceBean.usdFast) && Intrinsics.EZpvd(this.gweiPrecision, gasPriceBean.gweiPrecision);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverage() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFast() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastCost() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGweiPrecision() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlow() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlowCost() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAverage() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdFast() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdLow() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.slow;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.average;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fast;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slowCost;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.averageCost;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.fastCost;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.usdLow;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.usdAverage;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.usdFast;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        Integer num = this.gweiPrecision;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverage(String str) {
        this.average = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverageCost(String str) {
        this.averageCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFast(String str) {
        this.fast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastCost(String str) {
        this.fastCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGweiPrecision(Integer num) {
        this.gweiPrecision = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlow(String str) {
        this.slow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowCost(String str) {
        this.slowCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAverage(String str) {
        this.usdAverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdFast(String str) {
        this.usdFast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLow(String str) {
        this.usdLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasPriceBean(slow=" + this.slow + ", average=" + this.average + ", fast=" + this.fast + ", slowCost=" + this.slowCost + ", averageCost=" + this.averageCost + ", fastCost=" + this.fastCost + ", usdLow=" + this.usdLow + ", usdAverage=" + this.usdAverage + ", usdFast=" + this.usdFast + ", gweiPrecision=" + this.gweiPrecision + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slow);
        parcel.writeString(this.average);
        parcel.writeString(this.fast);
        parcel.writeString(this.slowCost);
        parcel.writeString(this.averageCost);
        parcel.writeString(this.fastCost);
        parcel.writeString(this.usdLow);
        parcel.writeString(this.usdAverage);
        parcel.writeString(this.usdFast);
        Integer num = this.gweiPrecision;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.GasPriceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasPriceBean> serializer() {
            return GasPriceBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasPriceBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slow = null;
        } else {
            this.slow = str;
        }
        if ((i & 2) == 0) {
            this.average = null;
        } else {
            this.average = str2;
        }
        if ((i & 4) == 0) {
            this.fast = null;
        } else {
            this.fast = str3;
        }
        if ((i & 8) == 0) {
            this.slowCost = null;
        } else {
            this.slowCost = str4;
        }
        if ((i & 16) == 0) {
            this.averageCost = null;
        } else {
            this.averageCost = str5;
        }
        if ((i & 32) == 0) {
            this.fastCost = null;
        } else {
            this.fastCost = str6;
        }
        if ((i & 64) == 0) {
            this.usdLow = null;
        } else {
            this.usdLow = str7;
        }
        if ((i & 128) == 0) {
            this.usdAverage = null;
        } else {
            this.usdAverage = str8;
        }
        if ((i & 256) == 0) {
            this.usdFast = null;
        } else {
            this.usdFast = str9;
        }
        if ((i & 512) == 0) {
            this.gweiPrecision = null;
        } else {
            this.gweiPrecision = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(GasPriceBean gasPriceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gasPriceBean.slow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, gasPriceBean.slow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gasPriceBean.average != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gasPriceBean.average);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gasPriceBean.fast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, gasPriceBean.fast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gasPriceBean.slowCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gasPriceBean.slowCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gasPriceBean.averageCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gasPriceBean.averageCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gasPriceBean.fastCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gasPriceBean.fastCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || gasPriceBean.usdLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, gasPriceBean.usdLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || gasPriceBean.usdAverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, gasPriceBean.usdAverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || gasPriceBean.usdFast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, gasPriceBean.usdFast);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && gasPriceBean.gweiPrecision == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, gasPriceBean.gweiPrecision);
    }

    public GasPriceBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        this.slow = str;
        this.average = str2;
        this.fast = str3;
        this.slowCost = str4;
        this.averageCost = str5;
        this.fastCost = str6;
        this.usdLow = str7;
        this.usdAverage = str8;
        this.usdFast = str9;
        this.gweiPrecision = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:49) call: com.okinc.business.defi.api.bean.GasPriceBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ GasPriceBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? num : null);
    }
}
