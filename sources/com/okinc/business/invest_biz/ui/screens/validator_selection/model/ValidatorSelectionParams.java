package com.okinc.business.invest_biz.ui.screens.validator_selection.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ValidatorSelectionParams implements Parcelable {
    public static final Parcelable.Creator<ValidatorSelectionParams> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String EZpvd;
    public final ValidatorTrxType KWHzl;
    public final long OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<ValidatorSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidatorSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ValidatorSelectionParams(parcel.readLong(), parcel.readString(), parcel.readLong(), ValidatorTrxType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidatorSelectionParams[] newArray(int i) {
            return new ValidatorSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidatorSelectionParams EZpvd(long j, @NotNull String str, long j2, @NotNull ValidatorTrxType validatorTrxType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validatorTrxType, "");
        return new ValidatorSelectionParams(j, str, j2, validatorTrxType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidatorTrxType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof ValidatorSelectionParams)) {
            return false;
        }
        ValidatorSelectionParams validatorSelectionParams = (ValidatorSelectionParams) obj;
        return this.AEQbTJ == validatorSelectionParams.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) validatorSelectionParams.EZpvd) && this.OLrzqt == validatorSelectionParams.OLrzqt && this.KWHzl == validatorSelectionParams.KWHzl && this.copydefault == validatorSelectionParams.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + Long.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidatorSelectionParams(investmentId=" + this.AEQbTJ + ", validatorName=" + this.EZpvd + ", chainId=" + this.OLrzqt + ", transactionType=" + this.KWHzl + ", isSingleValidator=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeLong(this.OLrzqt);
        parcel.writeString(this.KWHzl.name());
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public ValidatorSelectionParams(long j, @NotNull String str, long j2, @NotNull ValidatorTrxType validatorTrxType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(validatorTrxType, "");
        this.AEQbTJ = j;
        this.EZpvd = str;
        this.OLrzqt = j2;
        this.KWHzl = validatorTrxType;
        this.copydefault = z;
    }
}
