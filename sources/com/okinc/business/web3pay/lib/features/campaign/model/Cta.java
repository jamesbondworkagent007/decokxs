package com.okinc.business.web3pay.lib.features.campaign.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Cta implements Parcelable {
    public static final Parcelable.Creator<Cta> CREATOR = new Creator();
    public final CampaignGuideCtaType KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<Cta> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Cta(parcel.readString(), parcel.readString(), CampaignGuideCtaType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta[] newArray(int i) {
            return new Cta[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, CampaignGuideCtaType campaignGuideCtaType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cta.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = cta.OLrzqt;
        }
        if ((i & 4) != 0) {
            campaignGuideCtaType = cta.KWHzl;
        }
        return cta.OLrzqt(str, str2, campaignGuideCtaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta OLrzqt(@NotNull String str, @NotNull String str2, @NotNull CampaignGuideCtaType campaignGuideCtaType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(campaignGuideCtaType, "");
        return new Cta(str, str2, campaignGuideCtaType);
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
        if (!(obj instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) cta.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) cta.OLrzqt) && this.KWHzl == cta.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Cta(text=" + this.copydefault + ", deepLink=" + this.OLrzqt + ", type=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl.name());
    }

    public Cta(@NotNull String str, @NotNull String str2, @NotNull CampaignGuideCtaType campaignGuideCtaType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(campaignGuideCtaType, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.KWHzl = campaignGuideCtaType;
    }
}
