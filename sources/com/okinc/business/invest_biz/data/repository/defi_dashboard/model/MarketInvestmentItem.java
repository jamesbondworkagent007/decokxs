package com.okinc.business.invest_biz.data.repository.defi_dashboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.NetworkLogoUrl;
import com.okinc.business.invest_biz.data.bean.Perpetual;
import com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProductType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketInvestmentItem implements Parcelable {
    public static final Parcelable.Creator<MarketInvestmentItem> CREATOR = new Creator();
    public final long AEQbTJ;
    public final InvestLogo AYXKKw;
    public final long AhwBna;
    public final Perpetual AkhnZx;
    public final String AuCTel;
    public final ProductType DbNXlk;
    public final String EZpvd;
    public final List<InvestPositionDetailExtraFieldData> KWHzl;
    public final InvestUserAssetDetailPromptInformation OLrzqt;
    public final List<InvestExtraAssetData> copydefault;
    public final InvestmentKind djBIcL;
    public final String ejfBZ;
    public final String fARcdN;
    public final long fIwbmz;
    public final List<InvestBaseDefiTokenInfo> fJNWhG;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public final List<InvestUserRewardInfoByInvestment> isConnected;
    public final String valueOf;
    public final NetworkLogoUrl values;

    public static final class Creator implements Parcelable.Creator<MarketInvestmentItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInvestmentItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            InvestmentKind investmentKindValueOf = InvestmentKind.valueOf(parcel.readString());
            ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
            InvestLogo investLogoCreateFromParcel = InvestLogo.CREATOR.createFromParcel(parcel);
            NetworkLogoUrl networkLogoUrlCreateFromParcel = NetworkLogoUrl.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformationCreateFromParcel = InvestUserAssetDetailPromptInformation.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(InvestPositionDetailExtraFieldData.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            Perpetual perpetualCreateFromParcel = parcel.readInt() == 0 ? null : Perpetual.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(InvestExtraAssetData.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList4.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            return new MarketInvestmentItem(string, j, string2, j2, j3, investmentKindValueOf, productTypeValueOf, investLogoCreateFromParcel, networkLogoUrlCreateFromParcel, string3, string4, string5, string6, z, investUserAssetDetailPromptInformationCreateFromParcel, arrayList, perpetualCreateFromParcel, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInvestmentItem[] newArray(int i) {
            return new MarketInvestmentItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketInvestmentItem() {
        this(null, 0L, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInvestmentItem EZpvd(@NotNull String str, long j, @NotNull String str2, long j2, long j3, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull List<InvestPositionDetailExtraFieldData> list, Perpetual perpetual, @NotNull List<InvestExtraAssetData> list2, @NotNull List<InvestBaseDefiTokenInfo> list3, @NotNull List<InvestUserRewardInfoByInvestment> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new MarketInvestmentItem(str, j, str2, j2, j3, investmentKind, productType, investLogo, networkLogoUrl, str3, str4, str5, str6, z, investUserAssetDetailPromptInformation, list, perpetual, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkLogoUrl copydefault() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInvestmentItem)) {
            return false;
        }
        MarketInvestmentItem marketInvestmentItem = (MarketInvestmentItem) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) marketInvestmentItem.EZpvd) && this.AhwBna == marketInvestmentItem.AhwBna && Intrinsics.EZpvd((Object) this.AuCTel, (Object) marketInvestmentItem.AuCTel) && this.AEQbTJ == marketInvestmentItem.AEQbTJ && this.fIwbmz == marketInvestmentItem.fIwbmz && this.djBIcL == marketInvestmentItem.djBIcL && this.DbNXlk == marketInvestmentItem.DbNXlk && Intrinsics.EZpvd(this.AYXKKw, marketInvestmentItem.AYXKKw) && Intrinsics.EZpvd(this.values, marketInvestmentItem.values) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) marketInvestmentItem.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) marketInvestmentItem.valueOf) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) marketInvestmentItem.fARcdN) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) marketInvestmentItem.ejfBZ) && this.fetchVPNInfo == marketInvestmentItem.fetchVPNInfo && Intrinsics.EZpvd(this.OLrzqt, marketInvestmentItem.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, marketInvestmentItem.KWHzl) && Intrinsics.EZpvd(this.AkhnZx, marketInvestmentItem.AkhnZx) && Intrinsics.EZpvd(this.copydefault, marketInvestmentItem.copydefault) && Intrinsics.EZpvd(this.fJNWhG, marketInvestmentItem.fJNWhG) && Intrinsics.EZpvd(this.isConnected, marketInvestmentItem.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = Long.hashCode(this.AhwBna);
        int iHashCode3 = this.AuCTel.hashCode();
        int iHashCode4 = Long.hashCode(this.AEQbTJ);
        int iHashCode5 = Long.hashCode(this.fIwbmz);
        int iHashCode6 = this.djBIcL.hashCode();
        int iHashCode7 = this.DbNXlk.hashCode();
        int iHashCode8 = this.AYXKKw.hashCode();
        int iHashCode9 = this.values.hashCode();
        int iHashCode10 = this.gEmmrt.hashCode();
        int iHashCode11 = this.valueOf.hashCode();
        int iHashCode12 = this.fARcdN.hashCode();
        int iHashCode13 = this.ejfBZ.hashCode();
        int iHashCode14 = Boolean.hashCode(this.fetchVPNInfo);
        int iHashCode15 = this.OLrzqt.hashCode();
        int iHashCode16 = this.KWHzl.hashCode();
        Perpetual perpetual = this.AkhnZx;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (perpetual == null ? 0 : perpetual.hashCode())) * 31) + this.copydefault.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.isConnected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketInvestmentItem(assetType=" + this.EZpvd + ", investmentId=" + this.AhwBna + ", specialPositionAssetKey=" + this.AuCTel + ", aggregateProductId=" + this.AEQbTJ + ", sourceInvestmentId=" + this.fIwbmz + ", investmentCategory=" + this.djBIcL + ", productType=" + this.DbNXlk + ", investLogo=" + this.AYXKKw + ", networkNetLogo=" + this.values + ", investmentName=" + this.gEmmrt + ", investTypeName=" + this.valueOf + ", totalValue=" + this.fARcdN + ", totalEarnings=" + this.ejfBZ + ", isInvestTypeSupport=" + this.fetchVPNInfo + ", extraData=" + this.OLrzqt + ", extraFieldList=" + this.KWHzl + ", perpetual=" + this.AkhnZx + ", extraAssetList=" + this.copydefault + ", suppliedAssets=" + this.fJNWhG + ", rewards=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeLong(this.AhwBna);
        parcel.writeString(this.AuCTel);
        parcel.writeLong(this.AEQbTJ);
        parcel.writeLong(this.fIwbmz);
        parcel.writeString(this.djBIcL.name());
        parcel.writeString(this.DbNXlk.name());
        this.AYXKKw.writeToParcel(parcel, i);
        this.values.writeToParcel(parcel, i);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.ejfBZ);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        this.OLrzqt.writeToParcel(parcel, i);
        List<InvestPositionDetailExtraFieldData> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<InvestPositionDetailExtraFieldData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Perpetual perpetual = this.AkhnZx;
        if (perpetual == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            perpetual.writeToParcel(parcel, i);
        }
        List<InvestExtraAssetData> list2 = this.copydefault;
        parcel.writeInt(list2.size());
        Iterator<InvestExtraAssetData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestBaseDefiTokenInfo> list3 = this.fJNWhG;
        parcel.writeInt(list3.size());
        Iterator<InvestBaseDefiTokenInfo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list4 = this.isConnected;
        parcel.writeInt(list4.size());
        Iterator<InvestUserRewardInfoByInvestment> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public MarketInvestmentItem(@NotNull String str, long j, @NotNull String str2, long j2, long j3, @NotNull InvestmentKind investmentKind, @NotNull ProductType productType, @NotNull InvestLogo investLogo, @NotNull NetworkLogoUrl networkLogoUrl, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, @NotNull List<InvestPositionDetailExtraFieldData> list, Perpetual perpetual, @NotNull List<InvestExtraAssetData> list2, @NotNull List<InvestBaseDefiTokenInfo> list3, @NotNull List<InvestUserRewardInfoByInvestment> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(investLogo, "");
        Intrinsics.checkNotNullParameter(networkLogoUrl, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailPromptInformation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.EZpvd = str;
        this.AhwBna = j;
        this.AuCTel = str2;
        this.AEQbTJ = j2;
        this.fIwbmz = j3;
        this.djBIcL = investmentKind;
        this.DbNXlk = productType;
        this.AYXKKw = investLogo;
        this.values = networkLogoUrl;
        this.gEmmrt = str3;
        this.valueOf = str4;
        this.fARcdN = str5;
        this.ejfBZ = str6;
        this.fetchVPNInfo = z;
        this.OLrzqt = investUserAssetDetailPromptInformation;
        this.KWHzl = list;
        this.AkhnZx = perpetual;
        this.copydefault = list2;
        this.fJNWhG = list3;
        this.isConnected = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0136: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r49v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r49v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r32v0 long) : (0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x002d: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] (LINE:136) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r34v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
  (wrap:com.okinc.business.invest_biz.data.contants.ProductType:?: TERNARY null = ((wrap:int:0x0036: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] (LINE:137) com.okinc.business.invest_biz.data.contants.ProductType.Unknown com.okinc.business.invest_biz.data.contants.ProductType) : (r35v0 com.okinc.business.invest_biz.data.contants.ProductType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x003f: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:140) call: com.okinc.business.invest_biz.data.bean.InvestLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r36v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkLogoUrl:?: TERNARY null = ((wrap:int:0x0062: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:141) call: com.okinc.business.invest_biz.data.bean.NetworkLogoUrl.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r37v0 com.okinc.business.invest_biz.data.bean.NetworkLogoUrl))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x008b: TERNARY null = ((wrap:int:0x0082: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:0x0096: TERNARY null = ((wrap:int:0x008d: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:boolean:0x00a0: TERNARY null = ((wrap:int:0x0098: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c6: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:147) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r49v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d3: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:148)) : (r44v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.Perpetual:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r49v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.Perpetual) : (r45v0 com.okinc.business.invest_biz.data.bean.Perpetual))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r49v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00eb: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:150)) : (r46v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r49v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f8: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:153)) : (r47v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0101: ARITH (r49v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0105: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:156)) : (r48v0 java.util.List))
 A[MD:(java.lang.String, long, java.lang.String, long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List<com.okinc.business.invest_biz.data.bean.InvestPositionDetailExtraFieldData>, com.okinc.business.invest_biz.data.bean.Perpetual, java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>):void (m)] (LINE:127) call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentItem.<init>(java.lang.String, long, java.lang.String, long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.contants.ProductType, com.okinc.business.invest_biz.data.bean.InvestLogo, com.okinc.business.invest_biz.data.bean.NetworkLogoUrl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailPromptInformation, java.util.List, com.okinc.business.invest_biz.data.bean.Perpetual, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ MarketInvestmentItem(String str, long j, String str2, long j2, long j3, InvestmentKind investmentKind, ProductType productType, InvestLogo investLogo, NetworkLogoUrl networkLogoUrl, String str3, String str4, String str5, String str6, boolean z, InvestUserAssetDetailPromptInformation investUserAssetDetailPromptInformation, List list, Perpetual perpetual, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L, (i & 32) != 0 ? InvestmentKind.Default : investmentKind, (i & 64) != 0 ? ProductType.Unknown : productType, (i & 128) != 0 ? new InvestLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investLogo, (i & 256) != 0 ? new NetworkLogoUrl((String) null, (String) null, 3, (DefaultConstructorMarker) null) : networkLogoUrl, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? new InvestUserAssetDetailPromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 31, (DefaultConstructorMarker) null) : investUserAssetDetailPromptInformation, (i & 32768) != 0 ? yDY.AhwBna() : list, (i & 65536) != 0 ? null : perpetual, (i & 131072) != 0 ? yDY.AhwBna() : list2, (i & 262144) != 0 ? yDY.AhwBna() : list3, (i & 524288) != 0 ? yDY.AhwBna() : list4);
    }
}
