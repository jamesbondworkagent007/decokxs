package com.okinc.business.market.features.holders.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailModel implements Parcelable {
    public static final Parcelable.Creator<HolderDetailModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final boolean AuCTel;
    public final String AubY;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final boolean ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final boolean fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final List<TagWrapper> getFieldNames;
    public final String getNewProxyInstance;
    public final String hDKMBd;
    public final String isConnected;
    public final String iwGUEr;
    public final int uzCIH;
    public final String valueOf;
    public final String values;
    public final String wlaJM;
    public final String zLjUOn;

    public static final class Creator implements Parcelable.Creator<HolderDetailModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
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
            int i2 = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            int i3 = parcel.readInt();
            boolean z4 = z2;
            ArrayList arrayList = new ArrayList(i3);
            while (i2 != i3) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
                i2++;
                i3 = i3;
            }
            return new HolderDetailModel(i, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, z, z4, string11, string12, z3, string13, string14, string15, string16, string17, string18, string19, string20, string21, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailModel[] newArray(int i) {
            return new HolderDetailModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderDetailModel() {
        this(0, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailModel EZpvd(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, boolean z2, @NotNull String str11, @NotNull String str12, boolean z3, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull List<TagWrapper> list, @NotNull String str22, String str23) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new HolderDetailModel(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, str11, str12, z3, str13, str14, str15, str16, str17, str18, str19, str20, str21, list, str22, str23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AYXKKw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> ejfBZ() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderDetailModel)) {
            return false;
        }
        HolderDetailModel holderDetailModel = (HolderDetailModel) obj;
        return this.uzCIH == holderDetailModel.uzCIH && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) holderDetailModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) holderDetailModel.wlaJM) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) holderDetailModel.DbNXlk) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) holderDetailModel.AYXKKw) && Intrinsics.EZpvd((Object) this.isConnected, (Object) holderDetailModel.isConnected) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) holderDetailModel.AkhnZx) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) holderDetailModel.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) holderDetailModel.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) holderDetailModel.djBIcL) && Intrinsics.EZpvd((Object) this.valueOf, (Object) holderDetailModel.valueOf) && this.fJNWhG == holderDetailModel.fJNWhG && this.ejfBZ == holderDetailModel.ejfBZ && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) holderDetailModel.iwGUEr) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) holderDetailModel.OLrzqt) && this.AuCTel == holderDetailModel.AuCTel && Intrinsics.EZpvd((Object) this.KWHzl, (Object) holderDetailModel.KWHzl) && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) holderDetailModel.hDKMBd) && Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) holderDetailModel.getNewProxyInstance) && Intrinsics.EZpvd((Object) this.AubY, (Object) holderDetailModel.AubY) && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) holderDetailModel.zLjUOn) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) holderDetailModel.fIwbmz) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) holderDetailModel.fARcdN) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) holderDetailModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) holderDetailModel.values) && Intrinsics.EZpvd(this.getFieldNames, holderDetailModel.getFieldNames) && Intrinsics.EZpvd((Object) this.copydefault, (Object) holderDetailModel.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) holderDetailModel.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.uzCIH);
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.wlaJM.hashCode();
        int iHashCode4 = this.DbNXlk.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = this.isConnected.hashCode();
        int iHashCode7 = this.AkhnZx.hashCode();
        int iHashCode8 = this.AhwBna.hashCode();
        int iHashCode9 = this.gEmmrt.hashCode();
        int iHashCode10 = this.djBIcL.hashCode();
        int iHashCode11 = this.valueOf.hashCode();
        int iHashCode12 = Boolean.hashCode(this.fJNWhG);
        int iHashCode13 = Boolean.hashCode(this.ejfBZ);
        int iHashCode14 = this.iwGUEr.hashCode();
        int iHashCode15 = this.OLrzqt.hashCode();
        int iHashCode16 = Boolean.hashCode(this.AuCTel);
        int iHashCode17 = this.KWHzl.hashCode();
        int iHashCode18 = this.hDKMBd.hashCode();
        int iHashCode19 = this.getNewProxyInstance.hashCode();
        int iHashCode20 = this.AubY.hashCode();
        int iHashCode21 = this.zLjUOn.hashCode();
        int iHashCode22 = this.fIwbmz.hashCode();
        int iHashCode23 = this.fARcdN.hashCode();
        int iHashCode24 = this.fetchVPNInfo.hashCode();
        int iHashCode25 = this.values.hashCode();
        int iHashCode26 = this.getFieldNames.hashCode();
        int iHashCode27 = this.copydefault.hashCode();
        String str = this.EZpvd;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderDetailModel(ranking=" + this.uzCIH + ", chainId=" + this.AEQbTJ + ", tokenContractAddress=" + this.wlaJM + ", holderWalletAddress=" + this.DbNXlk + ", holdAmount=" + this.AYXKKw + ", holdAmountPercentage=" + this.isConnected + ", holdValueUsd=" + this.AkhnZx + ", hold24Changed=" + this.AhwBna + ", fundingSourceAddress=" + this.gEmmrt + ", fundingSourceTime=" + this.djBIcL + ", fundingSourceAddressShowName=" + this.valueOf + ", isSolanaChain=" + this.fJNWhG + ", isOtherHolders=" + this.ejfBZ + ", lastTradeTime=" + this.iwGUEr + ", explorerUrl=" + this.OLrzqt + ", isFollowing=" + this.AuCTel + ", addressAlias=" + this.KWHzl + ", nativeTokenPrice=" + this.hDKMBd + ", nativeTokenBalance=" + this.getNewProxyInstance + ", totalProfit=" + this.AubY + ", totalProfitPercentage=" + this.zLjUOn + ", inFlowAmount=" + this.fIwbmz + ", inFlowValue=" + this.fARcdN + ", holdCreateTime=" + this.fetchVPNInfo + ", holdingTime=" + this.values + ", newTagList=" + this.getFieldNames + ", emoji=" + this.copydefault + ", addressDisplayColorHex=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.uzCIH);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        parcel.writeInt(this.ejfBZ ? 1 : 0);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AuCTel ? 1 : 0);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.getNewProxyInstance);
        parcel.writeString(this.AubY);
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.values);
        List<TagWrapper> list = this.getFieldNames;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
    }

    public HolderDetailModel(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, boolean z2, @NotNull String str11, @NotNull String str12, boolean z3, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull List<TagWrapper> list, @NotNull String str22, String str23) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.uzCIH = i;
        this.AEQbTJ = str;
        this.wlaJM = str2;
        this.DbNXlk = str3;
        this.AYXKKw = str4;
        this.isConnected = str5;
        this.AkhnZx = str6;
        this.AhwBna = str7;
        this.gEmmrt = str8;
        this.djBIcL = str9;
        this.valueOf = str10;
        this.fJNWhG = z;
        this.ejfBZ = z2;
        this.iwGUEr = str11;
        this.OLrzqt = str12;
        this.AuCTel = z3;
        this.KWHzl = str13;
        this.hDKMBd = str14;
        this.getNewProxyInstance = str15;
        this.AubY = str16;
        this.zLjUOn = str17;
        this.fIwbmz = str18;
        this.fARcdN = str19;
        this.fetchVPNInfo = str20;
        this.values = str21;
        this.getFieldNames = list;
        this.copydefault = str22;
        this.EZpvd = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x014a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r58v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r58v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r58v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r58v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r58v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r58v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r58v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r58v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r58v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r58v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r58v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r58v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r58v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r58v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r58v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r58v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r58v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r58v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r58v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r58v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r58v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r58v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r58v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r58v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f4: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:54)) : (r55v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r58v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r58v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.okinc.business.market.features.holders.domain.model.HolderDetailModel.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderDetailModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, boolean z3, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list, String str22, String str23, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (i2 & 32768) != 0 ? false : z3, (i2 & 65536) != 0 ? "" : str13, (i2 & 131072) != 0 ? "" : str14, (i2 & 262144) != 0 ? "" : str15, (i2 & 524288) != 0 ? "" : str16, (i2 & 1048576) != 0 ? "" : str17, (i2 & 2097152) != 0 ? "" : str18, (i2 & 4194304) != 0 ? "" : str19, (i2 & 8388608) != 0 ? "" : str20, (i2 & 16777216) != 0 ? "" : str21, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? yDY.AhwBna() : list, (i2 & 67108864) != 0 ? "" : str22, (i2 & 134217728) != 0 ? null : str23);
    }
}
