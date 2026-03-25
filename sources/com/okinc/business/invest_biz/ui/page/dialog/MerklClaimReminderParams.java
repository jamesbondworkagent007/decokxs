package com.okinc.business.invest_biz.ui.page.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MerklClaimReminderParams implements Parcelable {
    public static final Parcelable.Creator<MerklClaimReminderParams> CREATOR = new Creator();
    public final List<String> EZpvd;
    public final long OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<MerklClaimReminderParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerklClaimReminderParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MerklClaimReminderParams(parcel.readString(), parcel.readLong(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerklClaimReminderParams[] newArray(int i) {
            return new MerklClaimReminderParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerklClaimReminderParams copy$default(MerklClaimReminderParams merklClaimReminderParams, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merklClaimReminderParams.copydefault;
        }
        if ((i & 2) != 0) {
            j = merklClaimReminderParams.OLrzqt;
        }
        if ((i & 4) != 0) {
            list = merklClaimReminderParams.EZpvd;
        }
        return merklClaimReminderParams.AEQbTJ(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MerklClaimReminderParams AEQbTJ(@NotNull String str, long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MerklClaimReminderParams(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
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
        if (!(obj instanceof MerklClaimReminderParams)) {
            return false;
        }
        MerklClaimReminderParams merklClaimReminderParams = (MerklClaimReminderParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) merklClaimReminderParams.copydefault) && this.OLrzqt == merklClaimReminderParams.OLrzqt && Intrinsics.EZpvd(this.EZpvd, merklClaimReminderParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + Long.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MerklClaimReminderParams(investmentId=" + this.copydefault + ", chainId=" + this.OLrzqt + ", unclaimedTokenAddress=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.OLrzqt);
        parcel.writeStringList(this.EZpvd);
    }

    public MerklClaimReminderParams(@NotNull String str, long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.OLrzqt = j;
        this.EZpvd = list;
    }
}
