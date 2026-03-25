package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PayTransactionUidRecipient extends PayTransactionRecipient {
    public static final Parcelable.Creator<PayTransactionUidRecipient> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<PayTransactionUidRecipient> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTransactionUidRecipient createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PayTransactionUidRecipient(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTransactionUidRecipient[] newArray(int i) {
            return new PayTransactionUidRecipient[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayTransactionUidRecipient copy$default(PayTransactionUidRecipient payTransactionUidRecipient, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payTransactionUidRecipient.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = payTransactionUidRecipient.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = payTransactionUidRecipient.EZpvd;
        }
        return payTransactionUidRecipient.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayTransactionUidRecipient KWHzl(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PayTransactionUidRecipient(str, str2, str3);
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
        if (!(obj instanceof PayTransactionUidRecipient)) {
            return false;
        }
        PayTransactionUidRecipient payTransactionUidRecipient = (PayTransactionUidRecipient) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) payTransactionUidRecipient.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) payTransactionUidRecipient.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) payTransactionUidRecipient.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        String str = this.AEQbTJ;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayTransactionUidRecipient(name=" + this.OLrzqt + ", avatarUrl=" + this.AEQbTJ + ", uid=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTransactionUidRecipient(@NotNull String str, String str2, @NotNull String str3) {
        super(str, str2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
    }
}
