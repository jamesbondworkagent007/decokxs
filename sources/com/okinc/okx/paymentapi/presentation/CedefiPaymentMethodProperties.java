package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class CedefiPaymentMethodProperties implements Parcelable {
    public static final Parcelable.Creator<CedefiPaymentMethodProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<CedefiPaymentMethodProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiPaymentMethodProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CedefiPaymentMethodProperties(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CedefiPaymentMethodProperties[] newArray(int i) {
            return new CedefiPaymentMethodProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiPaymentMethodProperties copy$default(CedefiPaymentMethodProperties cedefiPaymentMethodProperties, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cedefiPaymentMethodProperties.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = cedefiPaymentMethodProperties.AEQbTJ;
        }
        return cedefiPaymentMethodProperties.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiPaymentMethodProperties EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CedefiPaymentMethodProperties(str, str2);
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
        if (!(obj instanceof CedefiPaymentMethodProperties)) {
            return false;
        }
        CedefiPaymentMethodProperties cedefiPaymentMethodProperties = (CedefiPaymentMethodProperties) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) cedefiPaymentMethodProperties.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) cedefiPaymentMethodProperties.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiPaymentMethodProperties(paymentMethod=" + this.KWHzl + ", paymentAccountId=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
    }

    public CedefiPaymentMethodProperties(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
