package com.okinc.assets.backend.api.model.tax.receivedasset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CostBasisDetailWithRequiredFields implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostBasisDetailWithRequiredFields> CREATOR = new Creator();
    private final String amount;
    private final String amountPaid;
    private final String dateAcquired;

    public static final class Creator implements Parcelable.Creator<CostBasisDetailWithRequiredFields> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisDetailWithRequiredFields createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CostBasisDetailWithRequiredFields(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisDetailWithRequiredFields[] newArray(int i) {
            return new CostBasisDetailWithRequiredFields[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CostBasisDetailWithRequiredFields copy$default(CostBasisDetailWithRequiredFields costBasisDetailWithRequiredFields, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisDetailWithRequiredFields.dateAcquired;
        }
        if ((i & 2) != 0) {
            str2 = costBasisDetailWithRequiredFields.amount;
        }
        if ((i & 4) != 0) {
            str3 = costBasisDetailWithRequiredFields.amountPaid;
        }
        return costBasisDetailWithRequiredFields.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dateAcquired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostBasisDetailWithRequiredFields copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CostBasisDetailWithRequiredFields(str, str2, str3);
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
        if (!(obj instanceof CostBasisDetailWithRequiredFields)) {
            return false;
        }
        CostBasisDetailWithRequiredFields costBasisDetailWithRequiredFields = (CostBasisDetailWithRequiredFields) obj;
        return Intrinsics.EZpvd((Object) this.dateAcquired, (Object) costBasisDetailWithRequiredFields.dateAcquired) && Intrinsics.EZpvd((Object) this.amount, (Object) costBasisDetailWithRequiredFields.amount) && Intrinsics.EZpvd((Object) this.amountPaid, (Object) costBasisDetailWithRequiredFields.amountPaid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountPaid() {
        return this.amountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateAcquired() {
        return this.dateAcquired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.dateAcquired.hashCode() * 31) + this.amount.hashCode()) * 31) + this.amountPaid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CostBasisDetailWithRequiredFields(dateAcquired=" + this.dateAcquired + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dateAcquired);
        parcel.writeString(this.amount);
        parcel.writeString(this.amountPaid);
    }

    public CostBasisDetailWithRequiredFields(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.dateAcquired = str;
        this.amount = str2;
        this.amountPaid = str3;
    }
}
