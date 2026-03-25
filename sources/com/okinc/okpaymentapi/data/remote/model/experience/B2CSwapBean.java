package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class B2CSwapBean implements Parcelable {
    private String convertBaseAmount;
    private String convertBaseCurrency;
    private String convertPrice;
    private String premiumRangeMax;
    private String premiumRangeMin;
    private ArrayList<String> premiumTolerance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<B2CSwapBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<B2CSwapBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CSwapBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new B2CSwapBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CSwapBean[] newArray(int i) {
            return new B2CSwapBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CSwapBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B2CSwapBean copy$default(B2CSwapBean b2CSwapBean, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b2CSwapBean.convertBaseAmount;
        }
        if ((i & 2) != 0) {
            str2 = b2CSwapBean.convertBaseCurrency;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = b2CSwapBean.convertPrice;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = b2CSwapBean.premiumRangeMax;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = b2CSwapBean.premiumRangeMin;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            arrayList = b2CSwapBean.premiumTolerance;
        }
        return b2CSwapBean.copy(str, str6, str7, str8, str9, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.convertPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.premiumRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.premiumRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component6() {
        return this.premiumTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CSwapBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new B2CSwapBean(str, str2, str3, str4, str5, arrayList);
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
        if (!(obj instanceof B2CSwapBean)) {
            return false;
        }
        B2CSwapBean b2CSwapBean = (B2CSwapBean) obj;
        return Intrinsics.EZpvd((Object) this.convertBaseAmount, (Object) b2CSwapBean.convertBaseAmount) && Intrinsics.EZpvd((Object) this.convertBaseCurrency, (Object) b2CSwapBean.convertBaseCurrency) && Intrinsics.EZpvd((Object) this.convertPrice, (Object) b2CSwapBean.convertPrice) && Intrinsics.EZpvd((Object) this.premiumRangeMax, (Object) b2CSwapBean.premiumRangeMax) && Intrinsics.EZpvd((Object) this.premiumRangeMin, (Object) b2CSwapBean.premiumRangeMin) && Intrinsics.EZpvd(this.premiumTolerance, b2CSwapBean.premiumTolerance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseAmount() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseCurrency() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertPrice() {
        return this.convertPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPremiumRangeMax() {
        return this.premiumRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPremiumRangeMin() {
        return this.premiumRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getPremiumTolerance() {
        return this.premiumTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.convertBaseAmount.hashCode();
        int iHashCode2 = this.convertBaseCurrency.hashCode();
        int iHashCode3 = this.convertPrice.hashCode();
        int iHashCode4 = this.premiumRangeMax.hashCode();
        int iHashCode5 = this.premiumRangeMin.hashCode();
        ArrayList<String> arrayList = this.premiumTolerance;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPremiumRangeMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.premiumRangeMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPremiumRangeMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.premiumRangeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPremiumTolerance(ArrayList<String> arrayList) {
        this.premiumTolerance = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CSwapBean(convertBaseAmount=" + this.convertBaseAmount + ", convertBaseCurrency=" + this.convertBaseCurrency + ", convertPrice=" + this.convertPrice + ", premiumRangeMax=" + this.premiumRangeMax + ", premiumRangeMin=" + this.premiumRangeMin + ", premiumTolerance=" + this.premiumTolerance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.convertBaseAmount);
        parcel.writeString(this.convertBaseCurrency);
        parcel.writeString(this.convertPrice);
        parcel.writeString(this.premiumRangeMax);
        parcel.writeString(this.premiumRangeMin);
        parcel.writeStringList(this.premiumTolerance);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CSwapBean> serializer() {
            return B2CSwapBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ B2CSwapBean(int i, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.convertBaseAmount = "";
        } else {
            this.convertBaseAmount = str;
        }
        if ((i & 2) == 0) {
            this.convertBaseCurrency = "";
        } else {
            this.convertBaseCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.convertPrice = "";
        } else {
            this.convertPrice = str3;
        }
        if ((i & 8) == 0) {
            this.premiumRangeMax = "";
        } else {
            this.premiumRangeMax = str4;
        }
        if ((i & 16) == 0) {
            this.premiumRangeMin = "";
        } else {
            this.premiumRangeMin = str5;
        }
        if ((i & 32) == 0) {
            this.premiumTolerance = null;
        } else {
            this.premiumTolerance = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(B2CSwapBean b2CSwapBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) b2CSwapBean.convertBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, b2CSwapBean.convertBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CSwapBean.convertBaseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CSwapBean.convertBaseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CSwapBean.convertPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CSwapBean.convertPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) b2CSwapBean.premiumRangeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CSwapBean.premiumRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) b2CSwapBean.premiumRangeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, b2CSwapBean.premiumRangeMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && b2CSwapBean.premiumTolerance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], b2CSwapBean.premiumTolerance);
    }

    public B2CSwapBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.convertBaseAmount = str;
        this.convertBaseCurrency = str2;
        this.convertPrice = str3;
        this.premiumRangeMax = str4;
        this.premiumRangeMin = str5;
        this.premiumTolerance = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r10v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>):void (m)] (LINE:128) call: com.okinc.okpaymentapi.data.remote.model.experience.B2CSwapBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ B2CSwapBean(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : arrayList);
    }
}
