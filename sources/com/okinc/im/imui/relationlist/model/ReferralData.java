package com.okinc.im.imui.relationlist.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ReferralData implements Parcelable {
    public static final Parcelable.Creator<ReferralData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final RewardType copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ReferralData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReferralData(parcel.readString(), parcel.readString(), parcel.readString(), RewardType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralData[] newArray(int i) {
            return new ReferralData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReferralData copy$default(ReferralData referralData, String str, String str2, String str3, RewardType rewardType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = referralData.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = referralData.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = referralData.KWHzl;
        }
        if ((i & 8) != 0) {
            rewardType = referralData.copydefault;
        }
        return referralData.AEQbTJ(str, str2, str3, rewardType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralData AEQbTJ(String str, String str2, String str3, @NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        return new ReferralData(str, str2, str3, rewardType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardType KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof ReferralData)) {
            return false;
        }
        ReferralData referralData = (ReferralData) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) referralData.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) referralData.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) referralData.KWHzl) && this.copydefault == referralData.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralData(phonebookName=" + this.EZpvd + ", phoneNumber=" + this.AEQbTJ + ", rewardAmount=" + this.KWHzl + ", rewardType=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault.name());
    }

    public ReferralData(String str, String str2, String str3, @NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.copydefault = rewardType;
    }
}
