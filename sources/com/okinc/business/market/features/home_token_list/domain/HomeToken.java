package com.okinc.business.market.features.home_token_list.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeToken implements kMU, Parcelable {
    public static final Parcelable.Creator<HomeToken> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String ejfBZ;
    public final String fARcdN;
    public final String fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final List<TagWrapper> isConnected;
    public final String valueOf;
    public final RiskControlLevel values;

    public static final class Creator implements Parcelable.Creator<HomeToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeToken createFromParcel(Parcel parcel) {
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
            int i = 0;
            boolean z = parcel.readInt() != 0;
            RiskControlLevel riskControlLevelValueOf = RiskControlLevel.valueOf(parcel.readString());
            String string17 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (i != i2) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
                i++;
                i2 = i2;
            }
            return new HomeToken(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, z, riskControlLevelValueOf, string17, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeToken[] newArray(int i) {
            return new HomeToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeToken EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, @NotNull RiskControlLevel riskControlLevel, @NotNull String str17, @NotNull List<TagWrapper> list) {
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
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeToken(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, riskControlLevel, str17, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.gEmmrt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeToken)) {
            return false;
        }
        HomeToken homeToken = (HomeToken) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) homeToken.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) homeToken.KWHzl) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) homeToken.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) homeToken.fARcdN) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) homeToken.fIwbmz) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) homeToken.OLrzqt) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) homeToken.AkhnZx) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) homeToken.EZpvd) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) homeToken.ejfBZ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) homeToken.copydefault) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) homeToken.DbNXlk) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) homeToken.AuCTel) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) homeToken.fJNWhG) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) homeToken.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) homeToken.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) homeToken.AhwBna) && this.AYXKKw == homeToken.AYXKKw && this.values == homeToken.values && Intrinsics.EZpvd((Object) this.valueOf, (Object) homeToken.valueOf) && Intrinsics.EZpvd(this.isConnected, homeToken.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.isConnected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeToken(chainId=" + this.AEQbTJ + ", chainName=" + this.KWHzl + ", tokenContractAddress=" + this.fetchVPNInfo + ", tokenSymbol=" + this.fARcdN + ", tokenLogoUrl=" + this.fIwbmz + ", chainLogoUrl=" + this.OLrzqt + ", price=" + this.AkhnZx + ", change=" + this.EZpvd + ", txnCount=" + this.ejfBZ + ", buyTxnCount=" + this.copydefault + ", sellTxnCount=" + this.DbNXlk + ", uniqueTraderCount=" + this.AuCTel + ", volume=" + this.fJNWhG + ", marketCap=" + this.gEmmrt + ", liquidity=" + this.djBIcL + ", firstPriceTime=" + this.AhwBna + ", isFavorite=" + this.AYXKKw + ", riskControlLevel=" + this.values + ", holderCount=" + this.valueOf + ", newTagList=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskControlLevel valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeString(this.values.name());
        parcel.writeString(this.valueOf);
        List<TagWrapper> list = this.isConnected;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public HomeToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, @NotNull RiskControlLevel riskControlLevel, @NotNull String str17, @NotNull List<TagWrapper> list) {
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
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.fetchVPNInfo = str3;
        this.fARcdN = str4;
        this.fIwbmz = str5;
        this.OLrzqt = str6;
        this.AkhnZx = str7;
        this.EZpvd = str8;
        this.ejfBZ = str9;
        this.copydefault = str10;
        this.DbNXlk = str11;
        this.AuCTel = str12;
        this.fJNWhG = str13;
        this.gEmmrt = str14;
        this.djBIcL = str15;
        this.AhwBna = str16;
        this.AYXKKw = z;
        this.values = riskControlLevel;
        this.valueOf = str17;
        this.isConnected = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a9: CONSTRUCTOR 
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r45v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r45v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r45v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r45v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r45v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r45v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r45v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r45v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r45v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r45v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (32768 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0074: ARITH (65536 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:com.okinc.business.market.common.constants.RiskControlLevel:?: TERNARY null = ((wrap:int:0x007f: ARITH (131072 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0084: SGET  A[WRAPPED] (LINE:28) com.okinc.business.market.common.constants.RiskControlLevel.UNKNOWN com.okinc.business.market.common.constants.RiskControlLevel) : (r42v0 com.okinc.business.market.common.constants.RiskControlLevel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (262144 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0095: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r44v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RiskControlLevel, java.lang.String, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>):void (m)] (LINE:10) call: com.okinc.business.market.features.home_token_list.domain.HomeToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RiskControlLevel, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HomeToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, RiskControlLevel riskControlLevel, String str17, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (32768 & i) != 0 ? "" : str16, (65536 & i) != 0 ? false : z, (131072 & i) != 0 ? RiskControlLevel.UNKNOWN : riskControlLevel, (262144 & i) != 0 ? "" : str17, (i & 524288) != 0 ? yDY.AhwBna() : list);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        if (!(kmu instanceof HomeToken)) {
            return false;
        }
        HomeToken homeToken = (HomeToken) kmu;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) homeToken.AEQbTJ) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) homeToken.fetchVPNInfo);
    }
}
