package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PaymentMethodProperties implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodProperties> CREATOR = new Creator();
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<PaymentMethodProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaymentMethodProperties(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodProperties[] newArray(int i) {
            return new PaymentMethodProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaymentMethodProperties copy$default(PaymentMethodProperties paymentMethodProperties, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodProperties.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodProperties.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = paymentMethodProperties.KWHzl;
        }
        return paymentMethodProperties.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethodProperties AEQbTJ(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PaymentMethodProperties(str, str2, str3);
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
        if (!(obj instanceof PaymentMethodProperties)) {
            return false;
        }
        PaymentMethodProperties paymentMethodProperties = (PaymentMethodProperties) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentMethodProperties.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) paymentMethodProperties.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) paymentMethodProperties.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentMethodProperties(paymentMethod=" + this.copydefault + ", paymentAccountId=" + this.OLrzqt + ", paymentMethodType=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
    }

    public PaymentMethodProperties(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
    }
}
