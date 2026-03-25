package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class BillingAddress implements Parcelable {
    private String city;
    private String country;
    private String line1;
    private String line2;
    private String postalCode;
    private String state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BillingAddress> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BillingAddress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BillingAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingAddress[] newArray(int i) {
            return new BillingAddress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingAddress.city;
        }
        if ((i & 2) != 0) {
            str2 = billingAddress.country;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = billingAddress.line1;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = billingAddress.line2;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = billingAddress.postalCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = billingAddress.state;
        }
        return billingAddress.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.line1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.line2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.postalCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingAddress copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BillingAddress(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        return Intrinsics.EZpvd((Object) this.city, (Object) billingAddress.city) && Intrinsics.EZpvd((Object) this.country, (Object) billingAddress.country) && Intrinsics.EZpvd((Object) this.line1, (Object) billingAddress.line1) && Intrinsics.EZpvd((Object) this.line2, (Object) billingAddress.line2) && Intrinsics.EZpvd((Object) this.postalCode, (Object) billingAddress.postalCode) && Intrinsics.EZpvd((Object) this.state, (Object) billingAddress.state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCity() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLine1() {
        return this.line1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLine2() {
        return this.line2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.city.hashCode() * 31) + this.country.hashCode()) * 31) + this.line1.hashCode()) * 31) + this.line2.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.state.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.city = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.country = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLine1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.line1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLine2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.line2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPostalCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.postalCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BillingAddress(city=" + this.city + ", country=" + this.country + ", line1=" + this.line1 + ", line2=" + this.line2 + ", postalCode=" + this.postalCode + ", state=" + this.state + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.state);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.BillingAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BillingAddress> serializer() {
            return BillingAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BillingAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, BillingAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(BillingAddress billingAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, billingAddress.city);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, billingAddress.country);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, billingAddress.line1);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, billingAddress.line2);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, billingAddress.postalCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, billingAddress.state);
    }

    public BillingAddress(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }
}
