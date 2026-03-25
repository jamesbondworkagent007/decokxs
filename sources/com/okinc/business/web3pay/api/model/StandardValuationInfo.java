package com.okinc.business.web3pay.api.model;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class StandardValuationInfo implements Parcelable {
    public static final int $stable = 0;
    private final double currencyRate;
    private final String currencySymbol;
    private final String currencyUnit;
    private final boolean isFiat;
    private final String tokenPrice;
    private final String valuationSymbol;
    private final String valuationUnit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StandardValuationInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StandardValuationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandardValuationInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StandardValuationInfo(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StandardValuationInfo[] newArray(int i) {
            return new StandardValuationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component3() {
        return this.currencyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StandardValuationInfo copy(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new StandardValuationInfo(str, str2, d, str3, str4, str5, z);
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
        if (!(obj instanceof StandardValuationInfo)) {
            return false;
        }
        StandardValuationInfo standardValuationInfo = (StandardValuationInfo) obj;
        return Intrinsics.EZpvd((Object) this.currencyUnit, (Object) standardValuationInfo.currencyUnit) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) standardValuationInfo.currencySymbol) && Double.compare(this.currencyRate, standardValuationInfo.currencyRate) == 0 && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) standardValuationInfo.valuationUnit) && Intrinsics.EZpvd((Object) this.valuationSymbol, (Object) standardValuationInfo.valuationSymbol) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) standardValuationInfo.tokenPrice) && this.isFiat == standardValuationInfo.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getCurrencyRate() {
        return this.currencyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationSymbol() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.currencyUnit.hashCode();
        int iHashCode2 = this.currencySymbol.hashCode();
        int iHashCode3 = Double.hashCode(this.currencyRate);
        int iHashCode4 = this.valuationUnit.hashCode();
        int iHashCode5 = this.valuationSymbol.hashCode();
        String str = this.tokenPrice;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFiat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFiat() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StandardValuationInfo(currencyUnit=" + this.currencyUnit + ", currencySymbol=" + this.currencySymbol + ", currencyRate=" + this.currencyRate + ", valuationUnit=" + this.valuationUnit + ", valuationSymbol=" + this.valuationSymbol + ", tokenPrice=" + this.tokenPrice + ", isFiat=" + this.isFiat + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currencyUnit);
        parcel.writeString(this.currencySymbol);
        parcel.writeDouble(this.currencyRate);
        parcel.writeString(this.valuationUnit);
        parcel.writeString(this.valuationSymbol);
        parcel.writeString(this.tokenPrice);
        parcel.writeInt(this.isFiat ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.StandardValuationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StandardValuationInfo> serializer() {
            return StandardValuationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StandardValuationInfo(int i, String str, String str2, double d, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, StandardValuationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyUnit = str;
        this.currencySymbol = str2;
        this.currencyRate = d;
        this.valuationUnit = str3;
        this.valuationSymbol = str4;
        this.tokenPrice = str5;
        this.isFiat = z;
    }

    public static final /* synthetic */ void write$Self$OKPay_web3pay_api(StandardValuationInfo standardValuationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, standardValuationInfo.currencyUnit);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, standardValuationInfo.currencySymbol);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 2, standardValuationInfo.currencyRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, standardValuationInfo.valuationUnit);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, standardValuationInfo.valuationSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, standardValuationInfo.tokenPrice);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, standardValuationInfo.isFiat);
    }

    public StandardValuationInfo(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull String str4, String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.currencyUnit = str;
        this.currencySymbol = str2;
        this.currencyRate = d;
        this.valuationUnit = str3;
        this.valuationSymbol = str4;
        this.tokenPrice = str5;
        this.isFiat = z;
    }
}
