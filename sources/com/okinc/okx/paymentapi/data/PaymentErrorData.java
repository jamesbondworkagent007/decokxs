package com.okinc.okx.paymentapi.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PaymentErrorData implements Parcelable {
    public static final Parcelable.Creator<PaymentErrorData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PaymentErrorData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentErrorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaymentErrorData(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentErrorData[] newArray(int i) {
            return new PaymentErrorData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaymentErrorData copy$default(PaymentErrorData paymentErrorData, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentErrorData.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = paymentErrorData.KWHzl;
        }
        if ((i2 & 4) != 0) {
            str2 = paymentErrorData.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            str3 = paymentErrorData.copydefault;
        }
        return paymentErrorData.OLrzqt(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentErrorData OLrzqt(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PaymentErrorData(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
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
        if (!(obj instanceof PaymentErrorData)) {
            return false;
        }
        PaymentErrorData paymentErrorData = (PaymentErrorData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) paymentErrorData.AEQbTJ) && this.KWHzl == paymentErrorData.KWHzl && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) paymentErrorData.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentErrorData.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentErrorData(errorMessage=" + this.AEQbTJ + ", errorType=" + this.KWHzl + ", errorTitle=" + this.OLrzqt + ", sourceErrorCode=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
    }

    public PaymentErrorData(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.KWHzl = i;
        this.OLrzqt = str2;
        this.copydefault = str3;
    }
}
