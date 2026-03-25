package com.okinc.business.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedFilter implements Parcelable {
    public static final Parcelable.Creator<AdvancedFilter> CREATOR = new Creator();
    public final List<String> AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final TimeIntervalType AuCTelauCTel;
    public final String AubY;
    public final TimeIntervalType AwvSrB;
    public final String AxsJAY;
    public final String DbNXlk;
    public final boolean EZpvd;
    public final TimeIntervalType KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final boolean ejfBZ;
    public final int fARcdN;
    public final boolean fIwbmz;
    public final RankingType fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final TimeIntervalType gHZMYf;
    public final TokenAgeType getFieldNames;
    public final String getNewProxyInstance;
    public final TimeIntervalType hDKMBd;
    public final TimeIntervalType isConnected;
    public final String iwGUEr;
    public final String uzCIH;
    public final String valueOf;
    public final String values;
    public final String wlaJM;
    public final String zLjUOn;
    public final String zsXlph;
    public final String zuBGHE;

    public static final class Creator implements Parcelable.Creator<AdvancedFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvancedFilter(TimeIntervalType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), TimeIntervalType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), TimeIntervalType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), TimeIntervalType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), TimeIntervalType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TokenAgeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, RankingType.valueOf(parcel.readString()), TimeIntervalType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedFilter[] newArray(int i) {
            return new AdvancedFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedFilter() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, null, null, false, null, false, -1, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType AwvSrB() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AxsJAY() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter copydefault(@NotNull TimeIntervalType timeIntervalType, @NotNull String str, @NotNull String str2, @NotNull TimeIntervalType timeIntervalType2, @NotNull String str3, @NotNull String str4, @NotNull TimeIntervalType timeIntervalType3, @NotNull String str5, @NotNull String str6, @NotNull TimeIntervalType timeIntervalType4, @NotNull String str7, @NotNull String str8, @NotNull TimeIntervalType timeIntervalType5, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull TokenAgeType tokenAgeType, @NotNull String str17, @NotNull String str18, int i, boolean z, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull RankingType rankingType, @NotNull TimeIntervalType timeIntervalType6, boolean z3, @NotNull List<String> list, boolean z4) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalType2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(timeIntervalType3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(timeIntervalType4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(timeIntervalType5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(timeIntervalType6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AdvancedFilter(timeIntervalType, str, str2, timeIntervalType2, str3, str4, timeIntervalType3, str5, str6, timeIntervalType4, str7, str8, timeIntervalType5, str9, str10, str11, str12, str13, str14, str15, str16, tokenAgeType, str17, str18, i, z, str19, str20, z2, rankingType, timeIntervalType6, z3, list, z4);
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
    public final boolean ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedFilter)) {
            return false;
        }
        AdvancedFilter advancedFilter = (AdvancedFilter) obj;
        return this.KWHzl == advancedFilter.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) advancedFilter.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) advancedFilter.OLrzqt) && this.hDKMBd == advancedFilter.hDKMBd && Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) advancedFilter.getNewProxyInstance) && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) advancedFilter.iwGUEr) && this.AwvSrB == advancedFilter.AwvSrB && Intrinsics.EZpvd((Object) this.AxsJAY, (Object) advancedFilter.AxsJAY) && Intrinsics.EZpvd((Object) this.zuBGHE, (Object) advancedFilter.zuBGHE) && this.AuCTelauCTel == advancedFilter.AuCTelauCTel && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) advancedFilter.zLjUOn) && Intrinsics.EZpvd((Object) this.zsXlph, (Object) advancedFilter.zsXlph) && this.gHZMYf == advancedFilter.gHZMYf && Intrinsics.EZpvd((Object) this.wlaJM, (Object) advancedFilter.wlaJM) && Intrinsics.EZpvd((Object) this.AubY, (Object) advancedFilter.AubY) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) advancedFilter.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) advancedFilter.AkhnZx) && Intrinsics.EZpvd((Object) this.valueOf, (Object) advancedFilter.valueOf) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) advancedFilter.gEmmrt) && Intrinsics.EZpvd((Object) this.values, (Object) advancedFilter.values) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) advancedFilter.DbNXlk) && this.getFieldNames == advancedFilter.getFieldNames && Intrinsics.EZpvd((Object) this.uzCIH, (Object) advancedFilter.uzCIH) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) advancedFilter.AuCTel) && this.fARcdN == advancedFilter.fARcdN && this.fIwbmz == advancedFilter.fIwbmz && Intrinsics.EZpvd((Object) this.AhwBna, (Object) advancedFilter.AhwBna) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) advancedFilter.djBIcL) && this.EZpvd == advancedFilter.EZpvd && this.fJNWhG == advancedFilter.fJNWhG && this.isConnected == advancedFilter.isConnected && this.ejfBZ == advancedFilter.ejfBZ && Intrinsics.EZpvd(this.AEQbTJ, advancedFilter.AEQbTJ) && this.AYXKKw == advancedFilter.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType hDKMBd() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.getNewProxyInstance.hashCode()) * 31) + this.iwGUEr.hashCode()) * 31) + this.AwvSrB.hashCode()) * 31) + this.AxsJAY.hashCode()) * 31) + this.zuBGHE.hashCode()) * 31) + this.AuCTelauCTel.hashCode()) * 31) + this.zLjUOn.hashCode()) * 31) + this.zsXlph.hashCode()) * 31) + this.gHZMYf.hashCode()) * 31) + this.wlaJM.hashCode()) * 31) + this.AubY.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.values.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.getFieldNames.hashCode()) * 31) + this.uzCIH.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + Integer.hashCode(this.fARcdN)) * 31) + Boolean.hashCode(this.fIwbmz)) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.fJNWhG.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + Boolean.hashCode(this.ejfBZ)) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingType isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType iwGUEr() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedFilter(changePeriod=" + this.KWHzl + ", changeMin=" + this.copydefault + ", changeMax=" + this.OLrzqt + ", tradeNumPeriod=" + this.hDKMBd + ", tradeNumMin=" + this.getNewProxyInstance + ", tradeNumMax=" + this.iwGUEr + ", volumePeriod=" + this.AwvSrB + ", volumeMin=" + this.AxsJAY + ", volumeMax=" + this.zuBGHE + ", txsPeriod=" + this.AuCTelauCTel + ", txsMin=" + this.zLjUOn + ", txsMax=" + this.zsXlph + ", uniqueTraderPeriod=" + this.gHZMYf + ", uniqueTraderMin=" + this.wlaJM + ", uniqueTraderMax=" + this.AubY + ", marketCapMin=" + this.fetchVPNInfo + ", marketCapMax=" + this.AkhnZx + ", fdvMin=" + this.valueOf + ", fdvMax=" + this.gEmmrt + ", liquidityMin=" + this.values + ", liquidityMax=" + this.DbNXlk + ", tokenAgeType=" + this.getFieldNames + ", tokenAgeMin=" + this.uzCIH + ", tokenAgeMax=" + this.AuCTel + ", tags=" + this.fARcdN + ", stableTokenFilter=" + this.fIwbmz + ", holdersMin=" + this.AhwBna + ", holdersMax=" + this.djBIcL + ", desc=" + this.EZpvd + ", rankBy=" + this.fJNWhG + ", periodType=" + this.isConnected + ", riskFilter=" + this.ejfBZ + ", chainIds=" + this.AEQbTJ + ", isDefaultInterval=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType wlaJM() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.hDKMBd.name());
        parcel.writeString(this.getNewProxyInstance);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.AwvSrB.name());
        parcel.writeString(this.AxsJAY);
        parcel.writeString(this.zuBGHE);
        parcel.writeString(this.AuCTelauCTel.name());
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.zsXlph);
        parcel.writeString(this.gHZMYf.name());
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.AubY);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.values);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.getFieldNames.name());
        parcel.writeString(this.uzCIH);
        parcel.writeString(this.AuCTel);
        parcel.writeInt(this.fARcdN);
        parcel.writeInt(this.fIwbmz ? 1 : 0);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.djBIcL);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.fJNWhG.name());
        parcel.writeString(this.isConnected.name());
        parcel.writeInt(this.ejfBZ ? 1 : 0);
        parcel.writeStringList(this.AEQbTJ);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuBGHE() {
        return this.AYXKKw;
    }

    public AdvancedFilter(@NotNull TimeIntervalType timeIntervalType, @NotNull String str, @NotNull String str2, @NotNull TimeIntervalType timeIntervalType2, @NotNull String str3, @NotNull String str4, @NotNull TimeIntervalType timeIntervalType3, @NotNull String str5, @NotNull String str6, @NotNull TimeIntervalType timeIntervalType4, @NotNull String str7, @NotNull String str8, @NotNull TimeIntervalType timeIntervalType5, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull TokenAgeType tokenAgeType, @NotNull String str17, @NotNull String str18, int i, boolean z, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull RankingType rankingType, @NotNull TimeIntervalType timeIntervalType6, boolean z3, @NotNull List<String> list, boolean z4) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalType2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(timeIntervalType3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(timeIntervalType4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(timeIntervalType5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(timeIntervalType6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = timeIntervalType;
        this.copydefault = str;
        this.OLrzqt = str2;
        this.hDKMBd = timeIntervalType2;
        this.getNewProxyInstance = str3;
        this.iwGUEr = str4;
        this.AwvSrB = timeIntervalType3;
        this.AxsJAY = str5;
        this.zuBGHE = str6;
        this.AuCTelauCTel = timeIntervalType4;
        this.zLjUOn = str7;
        this.zsXlph = str8;
        this.gHZMYf = timeIntervalType5;
        this.wlaJM = str9;
        this.AubY = str10;
        this.fetchVPNInfo = str11;
        this.AkhnZx = str12;
        this.valueOf = str13;
        this.gEmmrt = str14;
        this.values = str15;
        this.DbNXlk = str16;
        this.getFieldNames = tokenAgeType;
        this.uzCIH = str17;
        this.AuCTel = str18;
        this.fARcdN = i;
        this.fIwbmz = z;
        this.AhwBna = str19;
        this.djBIcL = str20;
        this.EZpvd = z2;
        this.fJNWhG = rankingType;
        this.isConnected = timeIntervalType6;
        this.ejfBZ = z3;
        this.AEQbTJ = list;
        this.AYXKKw = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x019a: CONSTRUCTOR 
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:11) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r36v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r70v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x001d: ARITH (r70v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] (LINE:14) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r39v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r70v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r70v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0036: ARITH (r70v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] (LINE:17) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r42v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r70v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r70v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x004f: ARITH (r70v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] (LINE:20) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r45v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r70v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r70v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0068: ARITH (r70v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: SGET  A[WRAPPED] (LINE:23) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r48v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r70v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r70v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r70v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r70v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r70v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r70v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r70v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r70v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r70v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cd: SGET  A[WRAPPED] (LINE:32) com.okinc.business.market.common.constants.TokenAgeType.HOUR com.okinc.business.market.common.constants.TokenAgeType) : (r57v0 com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r70v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r70v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r70v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r70v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? true : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0102: ARITH (r70v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010d: ARITH (r70v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0118: ARITH (r70v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? true : (r64v0 boolean))
  (wrap:com.okinc.business.market.common.constants.RankingType:?: TERNARY null = ((wrap:int:0x0123: ARITH (r70v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0127: SGET  A[WRAPPED] (LINE:40) com.okinc.business.market.common.constants.RankingType.SEARCH com.okinc.business.market.common.constants.RankingType) : (r65v0 com.okinc.business.market.common.constants.RankingType))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x012e: ARITH (r70v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0132: SGET  A[WRAPPED] (LINE:41) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r66v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0139: ARITH (r70v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? true : (r67v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0142: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0146: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:43)) : (r68v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x014d: ARITH (r71v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r69v0 boolean) : true)
 A[MD:(com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List<java.lang.String>, boolean):void (m)] (LINE:10) call: com.okinc.business.market.features.filter.domain.AdvancedFilter.<init>(com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ AdvancedFilter(TimeIntervalType timeIntervalType, String str, String str2, TimeIntervalType timeIntervalType2, String str3, String str4, TimeIntervalType timeIntervalType3, String str5, String str6, TimeIntervalType timeIntervalType4, String str7, String str8, TimeIntervalType timeIntervalType5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, TokenAgeType tokenAgeType, String str17, String str18, int i, boolean z, String str19, String str20, boolean z2, RankingType rankingType, TimeIntervalType timeIntervalType6, boolean z3, List list, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType3, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType4, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType5, (i2 & 8192) != 0 ? "" : str9, (i2 & 16384) != 0 ? "" : str10, (i2 & 32768) != 0 ? "" : str11, (i2 & 65536) != 0 ? "" : str12, (i2 & 131072) != 0 ? "" : str13, (i2 & 262144) != 0 ? "" : str14, (i2 & 524288) != 0 ? "" : str15, (i2 & 1048576) != 0 ? "" : str16, (i2 & 2097152) != 0 ? TokenAgeType.HOUR : tokenAgeType, (i2 & 4194304) != 0 ? "" : str17, (i2 & 8388608) != 0 ? "" : str18, (i2 & 16777216) != 0 ? 0 : i, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? true : z, (i2 & 67108864) != 0 ? "" : str19, (i2 & 134217728) != 0 ? "" : str20, (i2 & 268435456) != 0 ? true : z2, (i2 & 536870912) != 0 ? RankingType.SEARCH : rankingType, (i2 & 1073741824) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType6, (i2 & Integer.MIN_VALUE) != 0 ? true : z3, (i3 & 1) != 0 ? yDY.AhwBna() : list, (i3 & 2) == 0 ? z4 : true);
    }
}
