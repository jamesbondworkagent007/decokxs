package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GooglePayProperties implements Parcelable {
    public static final Parcelable.Creator<GooglePayProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<GooglePayProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GooglePayProperties(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayProperties[] newArray(int i) {
            return new GooglePayProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GooglePayProperties copy$default(GooglePayProperties googlePayProperties, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayProperties.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = googlePayProperties.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = googlePayProperties.KWHzl;
        }
        return googlePayProperties.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GooglePayProperties AEQbTJ(String str, String str2, String str3) {
        return new GooglePayProperties(str, str2, str3);
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
        if (!(obj instanceof GooglePayProperties)) {
            return false;
        }
        GooglePayProperties googlePayProperties = (GooglePayProperties) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) googlePayProperties.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) googlePayProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) googlePayProperties.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GooglePayProperties(billingAddress=" + this.copydefault + ", paymentTransientData=" + this.AEQbTJ + ", assuranceDetails=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
    }

    public GooglePayProperties(String str, String str2, String str3) {
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
    }
}
