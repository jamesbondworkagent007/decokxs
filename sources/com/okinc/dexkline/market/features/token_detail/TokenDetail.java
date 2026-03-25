package com.okinc.dexkline.market.features.token_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenDetail implements Parcelable {
    public static final Parcelable.Creator<TokenDetail> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String AuCTelauCTel;
    public final String AubY;
    public final String AwvSrB;
    public final String AxsJAY;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String QKVWgx;
    public final String copydefault;
    public final String djBIcL;
    public final String ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String gHZMYf;
    public final String getFieldNames;
    public final String getNewProxyInstance;
    public final String hDKMBd;
    public final String isConnected;
    public final List<TagWrapper> iwGUEr;
    public final String sSMYrx;
    public final String uzCIH;
    public final String valueOf;
    public final String values;
    public final String wlaJM;
    public final String zLjUOn;
    public final String zsXlph;
    public final String zuBGHE;

    public static final class Creator implements Parcelable.Creator<TokenDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail createFromParcel(Parcel parcel) {
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
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new TokenDetail(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail[] newArray(int i) {
            return new TokenDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetail OLrzqt(String str, String str2, String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, @NotNull List<TagWrapper> list, @NotNull String str34, @NotNull String str35) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        return new TokenDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, list, str34, str35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
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
    public final String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenDetail)) {
            return false;
        }
        TokenDetail tokenDetail = (TokenDetail) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenDetail.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenDetail.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenDetail.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenDetail.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenDetail.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) tokenDetail.AYXKKw) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) tokenDetail.fJNWhG) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) tokenDetail.AuCTel) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) tokenDetail.fIwbmz) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) tokenDetail.fARcdN) && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) tokenDetail.zLjUOn) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) tokenDetail.wlaJM) && Intrinsics.EZpvd((Object) this.AuCTelauCTel, (Object) tokenDetail.AuCTelauCTel) && Intrinsics.EZpvd((Object) this.zsXlph, (Object) tokenDetail.zsXlph) && Intrinsics.EZpvd((Object) this.AubY, (Object) tokenDetail.AubY) && Intrinsics.EZpvd((Object) this.zuBGHE, (Object) tokenDetail.zuBGHE) && Intrinsics.EZpvd((Object) this.sSMYrx, (Object) tokenDetail.sSMYrx) && Intrinsics.EZpvd((Object) this.AwvSrB, (Object) tokenDetail.AwvSrB) && Intrinsics.EZpvd((Object) this.AxsJAY, (Object) tokenDetail.AxsJAY) && Intrinsics.EZpvd((Object) this.QKVWgx, (Object) tokenDetail.QKVWgx) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) tokenDetail.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) tokenDetail.AkhnZx) && Intrinsics.EZpvd((Object) this.values, (Object) tokenDetail.values) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) tokenDetail.ejfBZ) && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) tokenDetail.hDKMBd) && Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) tokenDetail.getNewProxyInstance) && Intrinsics.EZpvd((Object) this.uzCIH, (Object) tokenDetail.uzCIH) && Intrinsics.EZpvd((Object) this.gHZMYf, (Object) tokenDetail.gHZMYf) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenDetail.valueOf) && Intrinsics.EZpvd((Object) this.isConnected, (Object) tokenDetail.isConnected) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tokenDetail.djBIcL) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) tokenDetail.DbNXlk) && Intrinsics.EZpvd((Object) this.getFieldNames, (Object) tokenDetail.getFieldNames) && Intrinsics.EZpvd(this.iwGUEr, tokenDetail.iwGUEr) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenDetail.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) tokenDetail.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> fetchVPNInfo() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.copydefault;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.KWHzl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        int iHashCode7 = this.fJNWhG.hashCode();
        int iHashCode8 = this.AuCTel.hashCode();
        int iHashCode9 = this.fIwbmz.hashCode();
        int iHashCode10 = this.fARcdN.hashCode();
        int iHashCode11 = this.zLjUOn.hashCode();
        int iHashCode12 = this.wlaJM.hashCode();
        int iHashCode13 = this.AuCTelauCTel.hashCode();
        int iHashCode14 = this.zsXlph.hashCode();
        int iHashCode15 = this.AubY.hashCode();
        int iHashCode16 = this.zuBGHE.hashCode();
        int iHashCode17 = this.sSMYrx.hashCode();
        int iHashCode18 = this.AwvSrB.hashCode();
        int iHashCode19 = this.AxsJAY.hashCode();
        int iHashCode20 = this.QKVWgx.hashCode();
        String str6 = this.fetchVPNInfo;
        int iHashCode21 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.AkhnZx;
        int iHashCode22 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.values;
        int iHashCode23 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.ejfBZ;
        int iHashCode24 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.hDKMBd;
        int iHashCode25 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.getNewProxyInstance;
        int iHashCode26 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.uzCIH;
        int iHashCode27 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gHZMYf;
        int iHashCode28 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.valueOf;
        int iHashCode29 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.isConnected;
        int iHashCode30 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.djBIcL;
        int iHashCode31 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.DbNXlk;
        int iHashCode32 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.getFieldNames;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (str18 == null ? 0 : str18.hashCode())) * 31) + this.iwGUEr.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetail(chainId=" + this.AEQbTJ + ", change=" + this.OLrzqt + ", change1H=" + this.EZpvd + ", change4H=" + this.copydefault + ", change5M=" + this.KWHzl + ", firstPriceTime=" + this.AYXKKw + ", progress=" + this.fJNWhG + ", snipersClear=" + this.AuCTel + ", snipersTotal=" + this.fIwbmz + ", suspiciousRatio=" + this.fARcdN + ", txs1H=" + this.zLjUOn + ", txs4H=" + this.wlaJM + ", txs5M=" + this.AuCTelauCTel + ", uniqueTraders=" + this.zsXlph + ", uniqueTraders1H=" + this.AubY + ", uniqueTraders4H=" + this.zuBGHE + ", uniqueTraders5M=" + this.sSMYrx + ", volume1H=" + this.AwvSrB + ", volume4H=" + this.AxsJAY + ", volume5M=" + this.QKVWgx + ", marketCap=" + this.fetchVPNInfo + ", maxPrice=" + this.AkhnZx + ", minPrice=" + this.values + ", price=" + this.ejfBZ + ", tokenContractAddress=" + this.hDKMBd + ", tradeNum=" + this.getNewProxyInstance + ", txs=" + this.uzCIH + ", volume=" + this.gHZMYf + ", holders=" + this.valueOf + ", liquidity=" + this.isConnected + ", circulatingSupply=" + this.djBIcL + ", maxSupply=" + this.DbNXlk + ", top10HoldAmountPercentage=" + this.getFieldNames + ", tagList=" + this.iwGUEr + ", launchedTokenCount=" + this.AhwBna + ", devCreateTokenCount=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.AuCTelauCTel);
        parcel.writeString(this.zsXlph);
        parcel.writeString(this.AubY);
        parcel.writeString(this.zuBGHE);
        parcel.writeString(this.sSMYrx);
        parcel.writeString(this.AwvSrB);
        parcel.writeString(this.AxsJAY);
        parcel.writeString(this.QKVWgx);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.values);
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.getNewProxyInstance);
        parcel.writeString(this.uzCIH);
        parcel.writeString(this.gHZMYf);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.getFieldNames);
        List<TagWrapper> list = this.iwGUEr;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
    }

    public TokenDetail(String str, String str2, String str3, String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, @NotNull List<TagWrapper> list, @NotNull String str34, @NotNull String str35) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.KWHzl = str5;
        this.AYXKKw = str6;
        this.fJNWhG = str7;
        this.AuCTel = str8;
        this.fIwbmz = str9;
        this.fARcdN = str10;
        this.zLjUOn = str11;
        this.wlaJM = str12;
        this.AuCTelauCTel = str13;
        this.zsXlph = str14;
        this.AubY = str15;
        this.zuBGHE = str16;
        this.sSMYrx = str17;
        this.AwvSrB = str18;
        this.AxsJAY = str19;
        this.QKVWgx = str20;
        this.fetchVPNInfo = str21;
        this.AkhnZx = str22;
        this.values = str23;
        this.ejfBZ = str24;
        this.hDKMBd = str25;
        this.getNewProxyInstance = str26;
        this.uzCIH = str27;
        this.gHZMYf = str28;
        this.valueOf = str29;
        this.isConnected = str30;
        this.djBIcL = str31;
        this.DbNXlk = str32;
        this.getFieldNames = str33;
        this.iwGUEr = list;
        this.AhwBna = str34;
        this.gEmmrt = str35;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013a: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0143: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0147: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:45)) : (r70v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014e: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0157: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.features.tag.domain.TagWrapper>, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.dexkline.market.features.token_detail.TokenDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List list, String str34, String str35, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29, (i & 536870912) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) != 0 ? null : str32, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35);
    }
}
