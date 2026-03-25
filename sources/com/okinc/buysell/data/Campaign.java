package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Campaign implements Parcelable {
    public static final Parcelable.Creator<Campaign> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<Campaign> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Campaign createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Campaign(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Campaign[] newArray(int i) {
            return new Campaign[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaign.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = campaign.copydefault;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = campaign.AEQbTJ;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = campaign.KWHzl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = campaign.OLrzqt;
        }
        return campaign.EZpvd(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Campaign EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new Campaign(str, str2, str3, str4, str5);
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
        if (!(obj instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) campaign.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) campaign.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) campaign.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) campaign.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) campaign.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Campaign(imageUrl=" + this.EZpvd + ", title=" + this.copydefault + ", ctaLabel=" + this.AEQbTJ + ", ctaActionUrl=" + this.KWHzl + ", ctaTrackingKey=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
    }

    public Campaign(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
        this.OLrzqt = str5;
    }
}
