package com.okinc.business.web3pay.lib.features.campaign.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CampaignGuide implements Parcelable {
    public static final Parcelable.Creator<CampaignGuide> CREATOR = new Creator();
    public final CampaignDesc AEQbTJ;
    public final Cta OLrzqt;

    public static final class Creator implements Parcelable.Creator<CampaignGuide> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignGuide createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CampaignGuide(parcel.readInt() == 0 ? null : CampaignDesc.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Cta.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignGuide[] newArray(int i) {
            return new CampaignGuide[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CampaignGuide copy$default(CampaignGuide campaignGuide, CampaignDesc campaignDesc, Cta cta, int i, Object obj) {
        if ((i & 1) != 0) {
            campaignDesc = campaignGuide.AEQbTJ;
        }
        if ((i & 2) != 0) {
            cta = campaignGuide.OLrzqt;
        }
        return campaignGuide.OLrzqt(campaignDesc, cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignGuide OLrzqt(CampaignDesc campaignDesc, Cta cta) {
        return new CampaignGuide(campaignDesc, cta);
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
        if (!(obj instanceof CampaignGuide)) {
            return false;
        }
        CampaignGuide campaignGuide = (CampaignGuide) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, campaignGuide.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, campaignGuide.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CampaignDesc campaignDesc = this.AEQbTJ;
        int iHashCode = campaignDesc == null ? 0 : campaignDesc.hashCode();
        Cta cta = this.OLrzqt;
        return (iHashCode * 31) + (cta != null ? cta.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CampaignGuide(campaignDesc=" + this.AEQbTJ + ", cta=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CampaignDesc campaignDesc = this.AEQbTJ;
        if (campaignDesc == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            campaignDesc.writeToParcel(parcel, i);
        }
        Cta cta = this.OLrzqt;
        if (cta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cta.writeToParcel(parcel, i);
        }
    }

    public CampaignGuide(CampaignDesc campaignDesc, Cta cta) {
        this.AEQbTJ = campaignDesc;
        this.OLrzqt = cta;
    }
}
