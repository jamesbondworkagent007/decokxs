package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeUiModel implements Parcelable {
    public static final Parcelable.Creator<MemeUiModel> CREATOR = new Creator();
    public final MemeCarSharingData AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String AuCTelauCTel;
    public final String AubY;
    public final String AwvSrB;
    public final String AxsJAY;
    public final String DTwDnp;
    public final String DbNXlk;
    public final AiSheetExtras EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String OcIXYQ;
    public final String QOLQEE;
    public final String copydefault;
    public final List<CompactTagData> djBIcL;
    public final Media ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public final String gHZMYf;
    public final MemeTagsData getFieldNames;
    public final String getNewProxyInstance;
    public final String hDKMBd;
    public final String isConnected;
    public final String iwGUEr;
    public final List<MemeSocialMediaData> sSMYrx;
    public final MemeProtocolUiData uzCIH;
    public final List<TagWrapper> valueOf;
    public final boolean values;
    public final String wlaJM;
    public final String zLjUOn;
    public final String zsXlph;
    public final String zuBGHE;

    public static final class Creator implements Parcelable.Creator<MemeUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            MemeTagsData memeTagsDataCreateFromParcel = MemeTagsData.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            MemeProtocolUiData memeProtocolUiDataCreateFromParcel = MemeProtocolUiData.CREATOR.createFromParcel(parcel);
            String string25 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(MemeSocialMediaData.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            Media mediaCreateFromParcel = Media.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(CompactTagData.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            return new MemeUiModel(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, memeTagsDataCreateFromParcel, arrayList, string23, string24, memeProtocolUiDataCreateFromParcel, string25, arrayList2, mediaCreateFromParcel, arrayList3, parcel.readInt() == 0 ? null : MemeCarSharingData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, AiSheetExtras.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeUiModel[] newArray(int i) {
            return new MemeUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeUiModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, -1, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeCarSharingData AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolUiData DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeUiModel EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull MemeTagsData memeTagsData, @NotNull List<TagWrapper> list, @NotNull String str23, @NotNull String str24, @NotNull MemeProtocolUiData memeProtocolUiData, @NotNull String str25, @NotNull List<MemeSocialMediaData> list2, @NotNull Media media, @NotNull List<CompactTagData> list3, MemeCarSharingData memeCarSharingData, @NotNull String str26, @NotNull String str27, @NotNull String str28, boolean z, boolean z2, @NotNull AiSheetExtras aiSheetExtras) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(memeTagsData, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(memeProtocolUiData, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(media, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(aiSheetExtras, "");
        return new MemeUiModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, memeTagsData, list, str23, str24, memeProtocolUiData, str25, list2, media, list3, memeCarSharingData, str26, str27, str28, z, z2, aiSheetExtras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> copydefault() {
        return this.djBIcL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeUiModel)) {
            return false;
        }
        MemeUiModel memeUiModel = (MemeUiModel) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) memeUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) memeUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) memeUiModel.hDKMBd) && Intrinsics.EZpvd((Object) this.gHZMYf, (Object) memeUiModel.gHZMYf) && Intrinsics.EZpvd((Object) this.AuCTelauCTel, (Object) memeUiModel.AuCTelauCTel) && Intrinsics.EZpvd((Object) this.AubY, (Object) memeUiModel.AubY) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) memeUiModel.wlaJM) && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) memeUiModel.zLjUOn) && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) memeUiModel.iwGUEr) && Intrinsics.EZpvd((Object) this.zsXlph, (Object) memeUiModel.zsXlph) && Intrinsics.EZpvd((Object) this.copydefault, (Object) memeUiModel.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) memeUiModel.AhwBna) && Intrinsics.EZpvd((Object) this.zuBGHE, (Object) memeUiModel.zuBGHE) && Intrinsics.EZpvd((Object) this.AwvSrB, (Object) memeUiModel.AwvSrB) && Intrinsics.EZpvd((Object) this.AxsJAY, (Object) memeUiModel.AxsJAY) && Intrinsics.EZpvd((Object) this.OcIXYQ, (Object) memeUiModel.OcIXYQ) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) memeUiModel.AkhnZx) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) memeUiModel.DbNXlk) && Intrinsics.EZpvd((Object) this.QOLQEE, (Object) memeUiModel.QOLQEE) && Intrinsics.EZpvd((Object) this.DTwDnp, (Object) memeUiModel.DTwDnp) && Intrinsics.EZpvd((Object) this.isConnected, (Object) memeUiModel.isConnected) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) memeUiModel.gEmmrt) && Intrinsics.EZpvd(this.getFieldNames, memeUiModel.getFieldNames) && Intrinsics.EZpvd(this.valueOf, memeUiModel.valueOf) && Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) memeUiModel.getNewProxyInstance) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) memeUiModel.AYXKKw) && Intrinsics.EZpvd(this.uzCIH, memeUiModel.uzCIH) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) memeUiModel.fJNWhG) && Intrinsics.EZpvd(this.sSMYrx, memeUiModel.sSMYrx) && Intrinsics.EZpvd(this.ejfBZ, memeUiModel.ejfBZ) && Intrinsics.EZpvd(this.djBIcL, memeUiModel.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, memeUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) memeUiModel.fIwbmz) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) memeUiModel.AuCTel) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) memeUiModel.fARcdN) && this.fetchVPNInfo == memeUiModel.fetchVPNInfo && this.values == memeUiModel.values && Intrinsics.EZpvd(this.EZpvd, memeUiModel.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTagsData fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.hDKMBd.hashCode();
        int iHashCode4 = this.gHZMYf.hashCode();
        int iHashCode5 = this.AuCTelauCTel.hashCode();
        int iHashCode6 = this.AubY.hashCode();
        int iHashCode7 = this.wlaJM.hashCode();
        int iHashCode8 = this.zLjUOn.hashCode();
        int iHashCode9 = this.iwGUEr.hashCode();
        int iHashCode10 = this.zsXlph.hashCode();
        int iHashCode11 = this.copydefault.hashCode();
        int iHashCode12 = this.AhwBna.hashCode();
        int iHashCode13 = this.zuBGHE.hashCode();
        int iHashCode14 = this.AwvSrB.hashCode();
        int iHashCode15 = this.AxsJAY.hashCode();
        int iHashCode16 = this.OcIXYQ.hashCode();
        int iHashCode17 = this.AkhnZx.hashCode();
        int iHashCode18 = this.DbNXlk.hashCode();
        int iHashCode19 = this.QOLQEE.hashCode();
        int iHashCode20 = this.DTwDnp.hashCode();
        int iHashCode21 = this.isConnected.hashCode();
        int iHashCode22 = this.gEmmrt.hashCode();
        int iHashCode23 = this.getFieldNames.hashCode();
        int iHashCode24 = this.valueOf.hashCode();
        int iHashCode25 = this.getNewProxyInstance.hashCode();
        int iHashCode26 = this.AYXKKw.hashCode();
        int iHashCode27 = this.uzCIH.hashCode();
        int iHashCode28 = this.fJNWhG.hashCode();
        int iHashCode29 = this.sSMYrx.hashCode();
        int iHashCode30 = this.ejfBZ.hashCode();
        int iHashCode31 = this.djBIcL.hashCode();
        MemeCarSharingData memeCarSharingData = this.AEQbTJ;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (memeCarSharingData == null ? 0 : memeCarSharingData.hashCode())) * 31) + this.fIwbmz.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + Boolean.hashCode(this.fetchVPNInfo)) * 31) + Boolean.hashCode(this.values)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Media isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeUiModel(chainId=" + this.OLrzqt + ", chainLogo=" + this.KWHzl + ", tokenContractAddress=" + this.hDKMBd + ", tokenSymbol=" + this.gHZMYf + ", tokenName=" + this.AuCTelauCTel + ", tokenLogoUrl=" + this.AubY + ", tokenLogoBase64=" + this.wlaJM + ", tokenLogoLarge=" + this.zLjUOn + ", tokenCreateTime=" + this.iwGUEr + ", tokenCreatorAddress=" + this.zsXlph + ", communityCount=" + this.copydefault + ", communityCountFormatted=" + this.AhwBna + ", txs1H=" + this.zuBGHE + ", txs1HFormatted=" + this.AwvSrB + ", txsBuy1H=" + this.AxsJAY + ", txsSell1H=" + this.OcIXYQ + ", marketCap=" + this.AkhnZx + ", marketCapFormatted=" + this.DbNXlk + ", volume1H=" + this.QOLQEE + ", volume1HFormatted=" + this.DTwDnp + ", holders=" + this.isConnected + ", creatorMigrCnt=" + this.gEmmrt + ", tagsData=" + this.getFieldNames + ", dynamicTagsData=" + this.valueOf + ", protocolId=" + this.getNewProxyInstance + ", externalProtocolId=" + this.AYXKKw + ", protocolUiData=" + this.uzCIH + ", projectLink=" + this.fJNWhG + ", tokenSocialsList=" + this.sSMYrx + ", media=" + this.ejfBZ + ", compactTagData=" + this.djBIcL + ", carSharingData=" + this.AEQbTJ + ", progress=" + this.fIwbmz + ", migrateBeginTime=" + this.AuCTel + ", migrateEndTime=" + this.fARcdN + ", isMigrating=" + this.fetchVPNInfo + ", isCollected=" + this.values + ", aiSocials=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSocialMediaData> uzCIH() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.gHZMYf);
        parcel.writeString(this.AuCTelauCTel);
        parcel.writeString(this.AubY);
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.zsXlph);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.zuBGHE);
        parcel.writeString(this.AwvSrB);
        parcel.writeString(this.AxsJAY);
        parcel.writeString(this.OcIXYQ);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.QOLQEE);
        parcel.writeString(this.DTwDnp);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.gEmmrt);
        this.getFieldNames.writeToParcel(parcel, i);
        List<TagWrapper> list = this.valueOf;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.getNewProxyInstance);
        parcel.writeString(this.AYXKKw);
        this.uzCIH.writeToParcel(parcel, i);
        parcel.writeString(this.fJNWhG);
        List<MemeSocialMediaData> list2 = this.sSMYrx;
        parcel.writeInt(list2.size());
        Iterator<MemeSocialMediaData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.ejfBZ.writeToParcel(parcel, i);
        List<CompactTagData> list3 = this.djBIcL;
        parcel.writeInt(list3.size());
        Iterator<CompactTagData> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        MemeCarSharingData memeCarSharingData = this.AEQbTJ;
        if (memeCarSharingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memeCarSharingData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.fARcdN);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeInt(this.values ? 1 : 0);
        this.EZpvd.writeToParcel(parcel, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.zuBGHE;
    }

    public MemeUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull MemeTagsData memeTagsData, @NotNull List<TagWrapper> list, @NotNull String str23, @NotNull String str24, @NotNull MemeProtocolUiData memeProtocolUiData, @NotNull String str25, @NotNull List<MemeSocialMediaData> list2, @NotNull Media media, @NotNull List<CompactTagData> list3, MemeCarSharingData memeCarSharingData, @NotNull String str26, @NotNull String str27, @NotNull String str28, boolean z, boolean z2, @NotNull AiSheetExtras aiSheetExtras) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(memeTagsData, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(memeProtocolUiData, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(media, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(aiSheetExtras, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.hDKMBd = str3;
        this.gHZMYf = str4;
        this.AuCTelauCTel = str5;
        this.AubY = str6;
        this.wlaJM = str7;
        this.zLjUOn = str8;
        this.iwGUEr = str9;
        this.zsXlph = str10;
        this.copydefault = str11;
        this.AhwBna = str12;
        this.zuBGHE = str13;
        this.AwvSrB = str14;
        this.AxsJAY = str15;
        this.OcIXYQ = str16;
        this.AkhnZx = str17;
        this.DbNXlk = str18;
        this.QOLQEE = str19;
        this.DTwDnp = str20;
        this.isConnected = str21;
        this.gEmmrt = str22;
        this.getFieldNames = memeTagsData;
        this.valueOf = list;
        this.getNewProxyInstance = str23;
        this.AYXKKw = str24;
        this.uzCIH = memeProtocolUiData;
        this.fJNWhG = str25;
        this.sSMYrx = list2;
        this.ejfBZ = media;
        this.djBIcL = list3;
        this.AEQbTJ = memeCarSharingData;
        this.fIwbmz = str26;
        this.AuCTel = str27;
        this.fARcdN = str28;
        this.fetchVPNInfo = z;
        this.values = z2;
        this.EZpvd = aiSheetExtras;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x026c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r82v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r82v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r82v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r82v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r82v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r82v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r82v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r82v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r82v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r82v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r82v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r82v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r82v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r82v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r82v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r82v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r82v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r82v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r82v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r82v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r82v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r82v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeTagsData:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r82v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010b: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  false
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (2047 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:128) call: com.okinc.business.market.features.meme.domain.model.MemeTagsData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r66v0 com.okinc.business.market.features.meme.domain.model.MemeTagsData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0113: ARITH (r82v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0117: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:129)) : (r67v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r82v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012b: ARITH (r82v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData:?: TERNARY null = ((wrap:int:0x0136: ARITH (r82v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015e: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.String)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:134) call: com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r70v0 com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0166: ARITH (r82v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0171: ARITH (r82v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0175: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:138)) : (r72v0 java.util.List))
  (wrap:com.okinc.business.market.features.meme.domain.model.Media:?: TERNARY null = ((wrap:int:0x017e: ARITH (r82v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01b2: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.meme.domain.model.XMedia)
  (null com.okinc.business.market.features.meme.domain.model.YoutubeMedia)
  (null com.okinc.business.market.features.meme.domain.model.FacebookMedia)
  (null com.okinc.business.market.features.meme.domain.model.TwitchMedia)
  (null com.okinc.business.market.features.meme.domain.model.InstagramMedia)
  (null com.okinc.business.market.features.meme.domain.model.TikTokMedia)
  (null com.okinc.business.market.features.meme.domain.model.DiscordMedia)
  (wrap:int:0x0196: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.XMedia, com.okinc.business.market.features.meme.domain.model.YoutubeMedia, com.okinc.business.market.features.meme.domain.model.FacebookMedia, com.okinc.business.market.features.meme.domain.model.TwitchMedia, com.okinc.business.market.features.meme.domain.model.InstagramMedia, com.okinc.business.market.features.meme.domain.model.TikTokMedia, com.okinc.business.market.features.meme.domain.model.DiscordMedia, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:140) call: com.okinc.business.market.features.meme.domain.model.Media.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.XMedia, com.okinc.business.market.features.meme.domain.model.YoutubeMedia, com.okinc.business.market.features.meme.domain.model.FacebookMedia, com.okinc.business.market.features.meme.domain.model.TwitchMedia, com.okinc.business.market.features.meme.domain.model.InstagramMedia, com.okinc.business.market.features.meme.domain.model.TikTokMedia, com.okinc.business.market.features.meme.domain.model.DiscordMedia, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r73v0 com.okinc.business.market.features.meme.domain.model.Media))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01ba: ARITH (r82v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01be: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:141)) : (r74v0 java.util.List))
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeCarSharingData:?: TERNARY null = ((wrap:int:0x01c7: ARITH (r82v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.domain.model.MemeCarSharingData) : (r75v0 com.okinc.business.market.features.meme.domain.model.MemeCarSharingData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01cf: ARITH (r83v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d8: ARITH (r83v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e1: ARITH (r83v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01ea: ARITH (r83v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r79v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01f5: ARITH (r83v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r80v0 boolean) : false)
  (wrap:com.okinc.business.market.features.meme.domain.model.AiSheetExtras:?: TERNARY null = ((wrap:int:0x01fc: ARITH (r83v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0218: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:154) call: com.okinc.business.market.features.meme.domain.model.AiSheetExtras.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r81v0 com.okinc.business.market.features.meme.domain.model.AiSheetExtras))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeTagsData, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData, java.lang.String, java.util.List<com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData>, com.okinc.business.market.features.meme.domain.model.Media, java.util.List<com.okinc.business.market.data.model.CompactTagData>, com.okinc.business.market.features.meme.domain.model.MemeCarSharingData, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.business.market.features.meme.domain.model.AiSheetExtras):void (m)] (LINE:100) call: com.okinc.business.market.features.meme.domain.model.MemeUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeTagsData, java.util.List, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData, java.lang.String, java.util.List, com.okinc.business.market.features.meme.domain.model.Media, java.util.List, com.okinc.business.market.features.meme.domain.model.MemeCarSharingData, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.okinc.business.market.features.meme.domain.model.AiSheetExtras):void type: THIS */
    public /* synthetic */ MemeUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, MemeTagsData memeTagsData, List list, String str23, String str24, MemeProtocolUiData memeProtocolUiData, String str25, List list2, Media media, List list3, MemeCarSharingData memeCarSharingData, String str26, String str27, String str28, boolean z, boolean z2, AiSheetExtras aiSheetExtras, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? new MemeTagsData(null, null, false, null, null, null, null, null, null, null, null, 2047, null) : memeTagsData, (i & 8388608) != 0 ? yDY.AhwBna() : list, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? new MemeProtocolUiData(null, null, null, null, null, null, 63, null) : memeProtocolUiData, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? yDY.AhwBna() : list2, (i & 536870912) != 0 ? new Media(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : media, (i & 1073741824) != 0 ? yDY.AhwBna() : list3, (i & Integer.MIN_VALUE) != 0 ? null : memeCarSharingData, (i2 & 1) != 0 ? "" : str26, (i2 & 2) != 0 ? "" : str27, (i2 & 4) != 0 ? "" : str28, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? new AiSheetExtras(null, null, null, 7, null) : aiSheetExtras);
    }
}
