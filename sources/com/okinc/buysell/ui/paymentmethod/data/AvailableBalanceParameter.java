package com.okinc.buysell.ui.paymentmethod.data;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AvailableBalanceParameter implements Parcelable {
    public static final int $stable = 0;
    public final String availableBalance;
    public final String currency;
    public final int currencyScale;
    public final boolean shouldShowFiatSymbol;
    public final String totalBalance;
    public final String unavailableBalance;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AvailableBalanceParameter> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AvailableBalanceParameter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableBalanceParameter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvailableBalanceParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableBalanceParameter[] newArray(int i) {
            return new AvailableBalanceParameter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AvailableBalanceParameter copy$default(AvailableBalanceParameter availableBalanceParameter, String str, String str2, String str3, String str4, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = availableBalanceParameter.availableBalance;
        }
        if ((i2 & 2) != 0) {
            str2 = availableBalanceParameter.unavailableBalance;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = availableBalanceParameter.totalBalance;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = availableBalanceParameter.currency;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = availableBalanceParameter.currencyScale;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = availableBalanceParameter.shouldShowFiatSymbol;
        }
        return availableBalanceParameter.KWHzl(str, str5, str6, str7, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvailableBalanceParameter KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AvailableBalanceParameter(str, str2, str3, str4, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.shouldShowFiatSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.currencyScale;
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
        if (!(obj instanceof AvailableBalanceParameter)) {
            return false;
        }
        AvailableBalanceParameter availableBalanceParameter = (AvailableBalanceParameter) obj;
        return Intrinsics.EZpvd((Object) this.availableBalance, (Object) availableBalanceParameter.availableBalance) && Intrinsics.EZpvd((Object) this.unavailableBalance, (Object) availableBalanceParameter.unavailableBalance) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) availableBalanceParameter.totalBalance) && Intrinsics.EZpvd((Object) this.currency, (Object) availableBalanceParameter.currency) && this.currencyScale == availableBalanceParameter.currencyScale && this.shouldShowFiatSymbol == availableBalanceParameter.shouldShowFiatSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.availableBalance.hashCode() * 31) + this.unavailableBalance.hashCode()) * 31) + this.totalBalance.hashCode()) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.currencyScale)) * 31) + Boolean.hashCode(this.shouldShowFiatSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvailableBalanceParameter(availableBalance=" + this.availableBalance + ", unavailableBalance=" + this.unavailableBalance + ", totalBalance=" + this.totalBalance + ", currency=" + this.currency + ", currencyScale=" + this.currencyScale + ", shouldShowFiatSymbol=" + this.shouldShowFiatSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.availableBalance);
        parcel.writeString(this.unavailableBalance);
        parcel.writeString(this.totalBalance);
        parcel.writeString(this.currency);
        parcel.writeInt(this.currencyScale);
        parcel.writeInt(this.shouldShowFiatSymbol ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.paymentmethod.data.AvailableBalanceParameter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AvailableBalanceParameter> serializer() {
            return AvailableBalanceParameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvailableBalanceParameter(int i, String str, String str2, String str3, String str4, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, AvailableBalanceParameter$$serializer.INSTANCE.getDescriptor());
        }
        this.availableBalance = str;
        this.unavailableBalance = str2;
        this.totalBalance = str3;
        this.currency = str4;
        this.currencyScale = i2;
        this.shouldShowFiatSymbol = z;
    }

    public static final /* synthetic */ void AEQbTJ(AvailableBalanceParameter availableBalanceParameter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, availableBalanceParameter.availableBalance);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, availableBalanceParameter.unavailableBalance);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, availableBalanceParameter.totalBalance);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, availableBalanceParameter.currency);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, availableBalanceParameter.currencyScale);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, availableBalanceParameter.shouldShowFiatSymbol);
    }

    public AvailableBalanceParameter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.availableBalance = str;
        this.unavailableBalance = str2;
        this.totalBalance = str3;
        this.currency = str4;
        this.currencyScale = i;
        this.shouldShowFiatSymbol = z;
    }
}
