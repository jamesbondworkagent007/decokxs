package com.okinc.okimcore.model.remote;

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
public final class SupportedCurrencies implements Parcelable {
    public static final int $stable = 0;
    private final String currencyCode;
    private final int currencyId;
    private final int decimalPoint;
    private final String maxAmount;
    private final String minAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportedCurrencies> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SupportedCurrencies> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedCurrencies createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportedCurrencies(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedCurrencies[] newArray(int i) {
            return new SupportedCurrencies[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportedCurrencies copy$default(SupportedCurrencies supportedCurrencies, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = supportedCurrencies.currencyId;
        }
        if ((i3 & 2) != 0) {
            str = supportedCurrencies.currencyCode;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = supportedCurrencies.minAmount;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = supportedCurrencies.maxAmount;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = supportedCurrencies.decimalPoint;
        }
        return supportedCurrencies.copy(i, str4, str5, str6, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportedCurrencies copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportedCurrencies(i, str, str2, str3, i2);
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
        if (!(obj instanceof SupportedCurrencies)) {
            return false;
        }
        SupportedCurrencies supportedCurrencies = (SupportedCurrencies) obj;
        return this.currencyId == supportedCurrencies.currencyId && Intrinsics.EZpvd((Object) this.currencyCode, (Object) supportedCurrencies.currencyCode) && Intrinsics.EZpvd((Object) this.minAmount, (Object) supportedCurrencies.minAmount) && Intrinsics.EZpvd((Object) this.maxAmount, (Object) supportedCurrencies.maxAmount) && this.decimalPoint == supportedCurrencies.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalPoint() {
        return this.decimalPoint;
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
    public int hashCode() {
        return (((((((Integer.hashCode(this.currencyId) * 31) + this.currencyCode.hashCode()) * 31) + this.minAmount.hashCode()) * 31) + this.maxAmount.hashCode()) * 31) + Integer.hashCode(this.decimalPoint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportedCurrencies(currencyId=" + this.currencyId + ", currencyCode=" + this.currencyCode + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", decimalPoint=" + this.decimalPoint + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.minAmount);
        parcel.writeString(this.maxAmount);
        parcel.writeInt(this.decimalPoint);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SupportedCurrencies.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportedCurrencies> serializer() {
            return SupportedCurrencies$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportedCurrencies(int i, int i2, String str, String str2, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SupportedCurrencies$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = i2;
        this.currencyCode = str;
        this.minAmount = str2;
        this.maxAmount = str3;
        this.decimalPoint = i3;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SupportedCurrencies supportedCurrencies, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, supportedCurrencies.currencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, supportedCurrencies.currencyCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, supportedCurrencies.minAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, supportedCurrencies.maxAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, supportedCurrencies.decimalPoint);
    }

    public SupportedCurrencies(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.currencyId = i;
        this.currencyCode = str;
        this.minAmount = str2;
        this.maxAmount = str3;
        this.decimalPoint = i2;
    }
}
