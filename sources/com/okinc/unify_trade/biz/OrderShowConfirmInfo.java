package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.biz.OptionLimitSubtype;
import com.okinc.biz.QuickMarginType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OrderShowConfirmInfo implements Parcelable {
    public String AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public final boolean AkhnZx;
    public Boolean AuCTel;
    public TradeMultipleSlPriceData AuCTelauCTel;
    public ArrayList<TradeMultipleTpPriceData> AubY;
    public String AwvSrB;
    public String AxsJAY;
    public final String AxsJAYaxsJAY;
    public String AxsJAYsNCnLh;
    public String DAIeex;
    public String DCJXGO;
    public String DTwDnp;
    public List<Pair<String, String>> DarRvM;
    public final String DbNXlk;
    public String EZpvd;
    public final String KWHzl;
    public final String ODWQjV;
    public final String ORxRYg;
    public final String OcIXYQ;
    public String OqFWZa;
    public String QKVWgx;
    public String QKudOq;
    public QuickMarginType QOLQEE;
    public String QUSxYX;
    public final String QVAiDq;
    public final String QbewEr;
    public String QfsBiF;
    public final String RJOkX;
    public final int RcXXUw;
    public final int RlQdEF;
    public final String UeEOUB;
    public final String aKErDB;
    public int accept;
    public final String copydefault;
    public final String dNCPSb;
    public String djBIcL;
    public final String djSkpj;
    public String dvKsVJ;
    public OptionLimitSubtype dxcTrN;
    public Boolean ejfBZ;
    public final boolean fARcdN;
    public final String fFgQHt;
    public String fIwbmz;
    public String fJNWhG;
    public final String fZBcTu;
    public final boolean fetchVPNInfo;
    public final String finit;
    public final HashMap<String, String> flVtFt;
    public String fvQaOB;
    public String gEmmrt;
    public final String gGvvIC;
    public String gHZMYf;
    public final String gasjUx;
    public final String getFieldNames;
    public String getNewProxyInstance;
    public final String giSNqX;
    public final String gkJEwt;
    public String hDKMBd;
    public final String hUfVAv;
    public final String iRxXKY;
    public final String iZzfmt;
    public String isConnected;
    public final String iwGUEr;
    public String sSMYrx;
    public Integer uzCIH;
    public final String valueOf;
    public Boolean values;
    public final String wlaJM;
    public final String zLjUOn;
    public String zsXlph;
    public String zuBGHE;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<OrderShowConfirmInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrderShowConfirmInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderShowConfirmInfo createFromParcel(Parcel parcel) {
            boolean z;
            HashMap map;
            String str;
            String str2;
            ArrayList arrayList;
            ArrayList arrayList2;
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
            boolean z2 = parcel.readInt() != 0;
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z2;
                str2 = string12;
                str = string13;
                map = null;
            } else {
                int i = parcel.readInt();
                z = z2;
                map = new HashMap(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    map.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                    string12 = string12;
                }
                str2 = string12;
            }
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            QuickMarginType quickMarginTypeCreateFromParcel = parcel.readInt() == 0 ? null : QuickMarginType.CREATOR.createFromParcel(parcel);
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            OptionLimitSubtype optionLimitSubtypeCreateFromParcel = parcel.readInt() == 0 ? null : OptionLimitSubtype.CREATOR.createFromParcel(parcel);
            boolean z4 = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int i7 = 0;
                while (i7 != i6) {
                    arrayList3.add(TradeMultipleTpPriceData.CREATOR.createFromParcel(parcel));
                    i7++;
                    i6 = i6;
                }
                arrayList = arrayList3;
            }
            TradeMultipleSlPriceData tradeMultipleSlPriceDataCreateFromParcel = parcel.readInt() == 0 ? null : TradeMultipleSlPriceData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(parcel.readSerializable());
                }
                arrayList2 = arrayList4;
            }
            return new OrderShowConfirmInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, str2, str, z, string14, map, string15, string16, string17, string18, string19, string20, z3, string21, string22, string23, quickMarginTypeCreateFromParcel, string24, string25, string26, string27, i3, i4, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, optionLimitSubtypeCreateFromParcel, z4, i5, arrayList, tradeMultipleSlPriceDataCreateFromParcel, arrayList2, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderShowConfirmInfo[] newArray(int i) {
            return new OrderShowConfirmInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderShowConfirmInfo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, String str10, String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, HashMap<String, String> map, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull String str21, @NotNull String str22, @NotNull String str23, QuickMarginType quickMarginType, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, int i, int i2, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, @NotNull String str39, String str40, String str41, String str42, OptionLimitSubtype optionLimitSubtype, boolean z3, int i3, ArrayList<TradeMultipleTpPriceData> arrayList, TradeMultipleSlPriceData tradeMultipleSlPriceData, List<Pair<String, String>> list, Boolean bool, Boolean bool2, String str43, String str44, String str45, Boolean bool3, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, Integer num, String str57) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str39, "");
        return new OrderShowConfirmInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, map, str15, str16, str17, str18, str19, str20, z2, str21, str22, str23, quickMarginType, str24, str25, str26, str27, i, i2, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, optionLimitSubtype, z3, i3, arrayList, tradeMultipleSlPriceData, list, bool, bool2, str43, str44, str45, bool3, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, num, str57);
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
        if (!(obj instanceof OrderShowConfirmInfo)) {
            return false;
        }
        OrderShowConfirmInfo orderShowConfirmInfo = (OrderShowConfirmInfo) obj;
        return Intrinsics.EZpvd((Object) this.valueOf, (Object) orderShowConfirmInfo.valueOf) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) orderShowConfirmInfo.DbNXlk) && Intrinsics.EZpvd((Object) this.finit, (Object) orderShowConfirmInfo.finit) && Intrinsics.EZpvd((Object) this.fZBcTu, (Object) orderShowConfirmInfo.fZBcTu) && Intrinsics.EZpvd((Object) this.sSMYrx, (Object) orderShowConfirmInfo.sSMYrx) && Intrinsics.EZpvd((Object) this.AxsJAY, (Object) orderShowConfirmInfo.AxsJAY) && Intrinsics.EZpvd((Object) this.OqFWZa, (Object) orderShowConfirmInfo.OqFWZa) && Intrinsics.EZpvd((Object) this.ODWQjV, (Object) orderShowConfirmInfo.ODWQjV) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) orderShowConfirmInfo.wlaJM) && Intrinsics.EZpvd((Object) this.djSkpj, (Object) orderShowConfirmInfo.djSkpj) && Intrinsics.EZpvd((Object) this.RJOkX, (Object) orderShowConfirmInfo.RJOkX) && Intrinsics.EZpvd((Object) this.zLjUOn, (Object) orderShowConfirmInfo.zLjUOn) && Intrinsics.EZpvd((Object) this.fFgQHt, (Object) orderShowConfirmInfo.fFgQHt) && this.fARcdN == orderShowConfirmInfo.fARcdN && Intrinsics.EZpvd((Object) this.gasjUx, (Object) orderShowConfirmInfo.gasjUx) && Intrinsics.EZpvd(this.flVtFt, orderShowConfirmInfo.flVtFt) && Intrinsics.EZpvd((Object) this.OcIXYQ, (Object) orderShowConfirmInfo.OcIXYQ) && Intrinsics.EZpvd((Object) this.ORxRYg, (Object) orderShowConfirmInfo.ORxRYg) && Intrinsics.EZpvd((Object) this.gGvvIC, (Object) orderShowConfirmInfo.gGvvIC) && Intrinsics.EZpvd((Object) this.giSNqX, (Object) orderShowConfirmInfo.giSNqX) && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) orderShowConfirmInfo.hDKMBd) && Intrinsics.EZpvd((Object) this.AwvSrB, (Object) orderShowConfirmInfo.AwvSrB) && this.fetchVPNInfo == orderShowConfirmInfo.fetchVPNInfo && Intrinsics.EZpvd((Object) this.dvKsVJ, (Object) orderShowConfirmInfo.dvKsVJ) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) orderShowConfirmInfo.fIwbmz) && Intrinsics.EZpvd((Object) this.DCJXGO, (Object) orderShowConfirmInfo.DCJXGO) && this.QOLQEE == orderShowConfirmInfo.QOLQEE && Intrinsics.EZpvd((Object) this.DTwDnp, (Object) orderShowConfirmInfo.DTwDnp) && Intrinsics.EZpvd((Object) this.isConnected, (Object) orderShowConfirmInfo.isConnected) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) orderShowConfirmInfo.AhwBna) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) orderShowConfirmInfo.djBIcL) && this.RlQdEF == orderShowConfirmInfo.RlQdEF && this.RcXXUw == orderShowConfirmInfo.RcXXUw && Intrinsics.EZpvd((Object) this.iRxXKY, (Object) orderShowConfirmInfo.iRxXKY) && Intrinsics.EZpvd((Object) this.aKErDB, (Object) orderShowConfirmInfo.aKErDB) && Intrinsics.EZpvd((Object) this.iZzfmt, (Object) orderShowConfirmInfo.iZzfmt) && Intrinsics.EZpvd((Object) this.dNCPSb, (Object) orderShowConfirmInfo.dNCPSb) && Intrinsics.EZpvd((Object) this.gkJEwt, (Object) orderShowConfirmInfo.gkJEwt) && Intrinsics.EZpvd((Object) this.QbewEr, (Object) orderShowConfirmInfo.QbewEr) && Intrinsics.EZpvd((Object) this.hUfVAv, (Object) orderShowConfirmInfo.hUfVAv) && Intrinsics.EZpvd((Object) this.UeEOUB, (Object) orderShowConfirmInfo.UeEOUB) && Intrinsics.EZpvd((Object) this.AxsJAYaxsJAY, (Object) orderShowConfirmInfo.AxsJAYaxsJAY) && Intrinsics.EZpvd((Object) this.QVAiDq, (Object) orderShowConfirmInfo.QVAiDq) && Intrinsics.EZpvd((Object) this.getFieldNames, (Object) orderShowConfirmInfo.getFieldNames) && Intrinsics.EZpvd((Object) this.iwGUEr, (Object) orderShowConfirmInfo.iwGUEr) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) orderShowConfirmInfo.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) orderShowConfirmInfo.copydefault) && Intrinsics.EZpvd((Object) this.zuBGHE, (Object) orderShowConfirmInfo.zuBGHE) && this.dxcTrN == orderShowConfirmInfo.dxcTrN && this.AkhnZx == orderShowConfirmInfo.AkhnZx && this.accept == orderShowConfirmInfo.accept && Intrinsics.EZpvd(this.AubY, orderShowConfirmInfo.AubY) && Intrinsics.EZpvd(this.AuCTelauCTel, orderShowConfirmInfo.AuCTelauCTel) && Intrinsics.EZpvd(this.DarRvM, orderShowConfirmInfo.DarRvM) && Intrinsics.EZpvd(this.ejfBZ, orderShowConfirmInfo.ejfBZ) && Intrinsics.EZpvd(this.AuCTel, orderShowConfirmInfo.AuCTel) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) orderShowConfirmInfo.EZpvd) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) orderShowConfirmInfo.gEmmrt) && Intrinsics.EZpvd((Object) this.gHZMYf, (Object) orderShowConfirmInfo.gHZMYf) && Intrinsics.EZpvd(this.values, orderShowConfirmInfo.values) && Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) orderShowConfirmInfo.getNewProxyInstance) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) orderShowConfirmInfo.fJNWhG) && Intrinsics.EZpvd((Object) this.QKVWgx, (Object) orderShowConfirmInfo.QKVWgx) && Intrinsics.EZpvd((Object) this.zsXlph, (Object) orderShowConfirmInfo.zsXlph) && Intrinsics.EZpvd((Object) this.DAIeex, (Object) orderShowConfirmInfo.DAIeex) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) orderShowConfirmInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) orderShowConfirmInfo.AYXKKw) && Intrinsics.EZpvd((Object) this.QfsBiF, (Object) orderShowConfirmInfo.QfsBiF) && Intrinsics.EZpvd((Object) this.QKudOq, (Object) orderShowConfirmInfo.QKudOq) && Intrinsics.EZpvd((Object) this.fvQaOB, (Object) orderShowConfirmInfo.fvQaOB) && Intrinsics.EZpvd((Object) this.QUSxYX, (Object) orderShowConfirmInfo.QUSxYX) && Intrinsics.EZpvd(this.uzCIH, orderShowConfirmInfo.uzCIH) && Intrinsics.EZpvd((Object) this.AxsJAYsNCnLh, (Object) orderShowConfirmInfo.AxsJAYsNCnLh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.DbNXlk.hashCode();
        int iHashCode3 = this.finit.hashCode();
        int iHashCode4 = this.fZBcTu.hashCode();
        String str = this.sSMYrx;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.AxsJAY.hashCode();
        int iHashCode7 = this.OqFWZa.hashCode();
        String str2 = this.ODWQjV;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.wlaJM;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.djSkpj;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.RJOkX;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        int iHashCode12 = this.zLjUOn.hashCode();
        int iHashCode13 = this.fFgQHt.hashCode();
        int iHashCode14 = Boolean.hashCode(this.fARcdN);
        int iHashCode15 = this.gasjUx.hashCode();
        HashMap<String, String> map = this.flVtFt;
        int iHashCode16 = map == null ? 0 : map.hashCode();
        int iHashCode17 = this.OcIXYQ.hashCode();
        int iHashCode18 = this.ORxRYg.hashCode();
        int iHashCode19 = this.gGvvIC.hashCode();
        int iHashCode20 = this.giSNqX.hashCode();
        int iHashCode21 = this.hDKMBd.hashCode();
        int iHashCode22 = this.AwvSrB.hashCode();
        int iHashCode23 = Boolean.hashCode(this.fetchVPNInfo);
        int iHashCode24 = this.dvKsVJ.hashCode();
        int iHashCode25 = this.fIwbmz.hashCode();
        int iHashCode26 = this.DCJXGO.hashCode();
        QuickMarginType quickMarginType = this.QOLQEE;
        int iHashCode27 = quickMarginType == null ? 0 : quickMarginType.hashCode();
        int iHashCode28 = this.DTwDnp.hashCode();
        int iHashCode29 = this.isConnected.hashCode();
        int iHashCode30 = this.AhwBna.hashCode();
        int iHashCode31 = this.djBIcL.hashCode();
        int iHashCode32 = Integer.hashCode(this.RlQdEF);
        int iHashCode33 = Integer.hashCode(this.RcXXUw);
        String str6 = this.iRxXKY;
        int iHashCode34 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.aKErDB;
        int iHashCode35 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.iZzfmt;
        int iHashCode36 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.dNCPSb;
        int iHashCode37 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.gkJEwt;
        int iHashCode38 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.QbewEr;
        int iHashCode39 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.hUfVAv;
        int iHashCode40 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.UeEOUB;
        int iHashCode41 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.AxsJAYaxsJAY;
        int iHashCode42 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.QVAiDq;
        int iHashCode43 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.getFieldNames;
        int iHashCode44 = str16 == null ? 0 : str16.hashCode();
        int iHashCode45 = this.iwGUEr.hashCode();
        String str17 = this.KWHzl;
        int iHashCode46 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.copydefault;
        int iHashCode47 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.zuBGHE;
        int iHashCode48 = str19 == null ? 0 : str19.hashCode();
        OptionLimitSubtype optionLimitSubtype = this.dxcTrN;
        int iHashCode49 = optionLimitSubtype == null ? 0 : optionLimitSubtype.hashCode();
        int iHashCode50 = Boolean.hashCode(this.AkhnZx);
        int iHashCode51 = Integer.hashCode(this.accept);
        ArrayList<TradeMultipleTpPriceData> arrayList = this.AubY;
        int iHashCode52 = arrayList == null ? 0 : arrayList.hashCode();
        TradeMultipleSlPriceData tradeMultipleSlPriceData = this.AuCTelauCTel;
        int iHashCode53 = tradeMultipleSlPriceData == null ? 0 : tradeMultipleSlPriceData.hashCode();
        List<Pair<String, String>> list = this.DarRvM;
        int iHashCode54 = list == null ? 0 : list.hashCode();
        Boolean bool = this.ejfBZ;
        int iHashCode55 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.AuCTel;
        int iHashCode56 = bool2 == null ? 0 : bool2.hashCode();
        String str20 = this.EZpvd;
        int iHashCode57 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.gEmmrt;
        int iHashCode58 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.gHZMYf;
        int iHashCode59 = str22 == null ? 0 : str22.hashCode();
        Boolean bool3 = this.values;
        int iHashCode60 = bool3 == null ? 0 : bool3.hashCode();
        String str23 = this.getNewProxyInstance;
        int iHashCode61 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.fJNWhG;
        int iHashCode62 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.QKVWgx;
        int iHashCode63 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.zsXlph;
        int iHashCode64 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.DAIeex;
        int iHashCode65 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.AEQbTJ;
        int iHashCode66 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.AYXKKw;
        int iHashCode67 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.QfsBiF;
        int iHashCode68 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.QKudOq;
        int iHashCode69 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.fvQaOB;
        int iHashCode70 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.QUSxYX;
        int iHashCode71 = str33 == null ? 0 : str33.hashCode();
        Integer num = this.uzCIH;
        int iHashCode72 = num == null ? 0 : num.hashCode();
        String str34 = this.AxsJAYsNCnLh;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + (str34 == null ? 0 : str34.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderShowConfirmInfo(instId=" + this.valueOf + ", instType=" + this.DbNXlk + ", subTitle=" + this.finit + ", subRightTitle=" + this.fZBcTu + ", price=" + this.sSMYrx + ", quantity=" + this.AxsJAY + ", typeTitle=" + this.OqFWZa + ", triggerPrice=" + this.ODWQjV + ", orderPrice=" + this.wlaJM + ", slTriggerPrice=" + this.djSkpj + ", slOrderPrice=" + this.RJOkX + ", orderType=" + this.zLjUOn + ", spotAvaAmount=" + this.fFgQHt + ", isShowSp=" + this.fARcdN + ", tacticsName=" + this.gasjUx + ", tactionsData=" + this.flVtFt + ", rangeHighPrice=" + this.OcIXYQ + ", rangeLowPrice=" + this.ORxRYg + ", tacticsExplanation=" + this.gGvvIC + ", tacticsSlExplanation=" + this.giSNqX + ", lendAmountStr=" + this.hDKMBd + ", originLendAmount=" + this.AwvSrB + ", isGoneSpView=" + this.fetchVPNInfo + ", spotUnit=" + this.dvKsVJ + ", legalUnit=" + this.fIwbmz + ", tradeUnit=" + this.DCJXGO + ", quickMgnType=" + this.QOLQEE + ", repayAmount=" + this.DTwDnp + ", interestAmount=" + this.isConnected + ", debtAmount=" + this.AhwBna + ", hourRates=" + this.djBIcL + ", tpType=" + this.RlQdEF + ", slType=" + this.RcXXUw + ", tpTriggerType=" + this.iRxXKY + ", slTriggerType=" + this.aKErDB + ", tpTriggerPx=" + this.iZzfmt + ", slTriggerPx=" + this.dNCPSb + ", tpOrdPx=" + this.gkJEwt + ", slOrdPx=" + this.QbewEr + ", tpPnlRate=" + this.hUfVAv + ", slPnlRate=" + this.UeEOUB + ", tpPnl=" + this.AxsJAYaxsJAY + ", slPnl=" + this.QVAiDq + ", lever=" + this.getFieldNames + ", leverText=" + this.iwGUEr + ", cost=" + this.KWHzl + ", costOriginData=" + this.copydefault + ", originPx=" + this.zuBGHE + ", subType=" + this.dxcTrN + ", isSeekBarSelected=" + this.AkhnZx + ", tpslMode=" + this.accept + ", multiTpList=" + this.AubY + ", multiSlData=" + this.AuCTelauCTel + ", yieldHunterData=" + this.DarRvM + ", isTPLimit=" + this.ejfBZ + ", isShowSpotMarketOrderFullPercentHint=" + this.AuCTel + ", bonus=" + this.EZpvd + ", currentPlaceOrderType=" + this.gEmmrt + ", probablyValue=" + this.gHZMYf + ", isQuickOrder=" + this.values + ", marginCcy=" + this.getNewProxyInstance + ", leftLever=" + this.fJNWhG + ", rightLever=" + this.QKVWgx + ", ordCost=" + this.zsXlph + ", tradeCost=" + this.DAIeex + ", assetCost=" + this.AEQbTJ + ", earnCost=" + this.AYXKKw + ", side=" + this.QfsBiF + ", tradeQuoteCcy=" + this.QKudOq + ", tpDynamicTriggerPx=" + this.fvQaOB + ", slDynamicTriggerPx=" + this.QUSxYX + ", limitType=" + this.uzCIH + ", tpslSpotAmount=" + this.AxsJAYsNCnLh + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.valueOf);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.finit);
        parcel.writeString(this.fZBcTu);
        parcel.writeString(this.sSMYrx);
        parcel.writeString(this.AxsJAY);
        parcel.writeString(this.OqFWZa);
        parcel.writeString(this.ODWQjV);
        parcel.writeString(this.wlaJM);
        parcel.writeString(this.djSkpj);
        parcel.writeString(this.RJOkX);
        parcel.writeString(this.zLjUOn);
        parcel.writeString(this.fFgQHt);
        parcel.writeInt(this.fARcdN ? 1 : 0);
        parcel.writeString(this.gasjUx);
        HashMap<String, String> map = this.flVtFt;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.OcIXYQ);
        parcel.writeString(this.ORxRYg);
        parcel.writeString(this.gGvvIC);
        parcel.writeString(this.giSNqX);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.AwvSrB);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeString(this.dvKsVJ);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.DCJXGO);
        QuickMarginType quickMarginType = this.QOLQEE;
        if (quickMarginType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quickMarginType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.DTwDnp);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.djBIcL);
        parcel.writeInt(this.RlQdEF);
        parcel.writeInt(this.RcXXUw);
        parcel.writeString(this.iRxXKY);
        parcel.writeString(this.aKErDB);
        parcel.writeString(this.iZzfmt);
        parcel.writeString(this.dNCPSb);
        parcel.writeString(this.gkJEwt);
        parcel.writeString(this.QbewEr);
        parcel.writeString(this.hUfVAv);
        parcel.writeString(this.UeEOUB);
        parcel.writeString(this.AxsJAYaxsJAY);
        parcel.writeString(this.QVAiDq);
        parcel.writeString(this.getFieldNames);
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.zuBGHE);
        OptionLimitSubtype optionLimitSubtype = this.dxcTrN;
        if (optionLimitSubtype == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            optionLimitSubtype.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.AkhnZx ? 1 : 0);
        parcel.writeInt(this.accept);
        ArrayList<TradeMultipleTpPriceData> arrayList = this.AubY;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<TradeMultipleTpPriceData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        TradeMultipleSlPriceData tradeMultipleSlPriceData = this.AuCTelauCTel;
        if (tradeMultipleSlPriceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeMultipleSlPriceData.writeToParcel(parcel, i);
        }
        List<Pair<String, String>> list = this.DarRvM;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Pair<String, String>> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        Boolean bool = this.ejfBZ;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.AuCTel;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.gHZMYf);
        Boolean bool3 = this.values;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.getNewProxyInstance);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.QKVWgx);
        parcel.writeString(this.zsXlph);
        parcel.writeString(this.DAIeex);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.QfsBiF);
        parcel.writeString(this.QKudOq);
        parcel.writeString(this.fvQaOB);
        parcel.writeString(this.QUSxYX);
        Integer num = this.uzCIH;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.AxsJAYsNCnLh);
    }

    public OrderShowConfirmInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, String str10, String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, HashMap<String, String> map, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull String str21, @NotNull String str22, @NotNull String str23, QuickMarginType quickMarginType, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, int i, int i2, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, @NotNull String str39, String str40, String str41, String str42, OptionLimitSubtype optionLimitSubtype, boolean z3, int i3, ArrayList<TradeMultipleTpPriceData> arrayList, TradeMultipleSlPriceData tradeMultipleSlPriceData, List<Pair<String, String>> list, Boolean bool, Boolean bool2, String str43, String str44, String str45, Boolean bool3, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, Integer num, String str57) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str39, "");
        this.valueOf = str;
        this.DbNXlk = str2;
        this.finit = str3;
        this.fZBcTu = str4;
        this.sSMYrx = str5;
        this.AxsJAY = str6;
        this.OqFWZa = str7;
        this.ODWQjV = str8;
        this.wlaJM = str9;
        this.djSkpj = str10;
        this.RJOkX = str11;
        this.zLjUOn = str12;
        this.fFgQHt = str13;
        this.fARcdN = z;
        this.gasjUx = str14;
        this.flVtFt = map;
        this.OcIXYQ = str15;
        this.ORxRYg = str16;
        this.gGvvIC = str17;
        this.giSNqX = str18;
        this.hDKMBd = str19;
        this.AwvSrB = str20;
        this.fetchVPNInfo = z2;
        this.dvKsVJ = str21;
        this.fIwbmz = str22;
        this.DCJXGO = str23;
        this.QOLQEE = quickMarginType;
        this.DTwDnp = str24;
        this.isConnected = str25;
        this.AhwBna = str26;
        this.djBIcL = str27;
        this.RlQdEF = i;
        this.RcXXUw = i2;
        this.iRxXKY = str28;
        this.aKErDB = str29;
        this.iZzfmt = str30;
        this.dNCPSb = str31;
        this.gkJEwt = str32;
        this.QbewEr = str33;
        this.hUfVAv = str34;
        this.UeEOUB = str35;
        this.AxsJAYaxsJAY = str36;
        this.QVAiDq = str37;
        this.getFieldNames = str38;
        this.iwGUEr = str39;
        this.KWHzl = str40;
        this.copydefault = str41;
        this.zuBGHE = str42;
        this.dxcTrN = optionLimitSubtype;
        this.AkhnZx = z3;
        this.accept = i3;
        this.AubY = arrayList;
        this.AuCTelauCTel = tradeMultipleSlPriceData;
        this.DarRvM = list;
        this.ejfBZ = bool;
        this.AuCTel = bool2;
        this.EZpvd = str43;
        this.gEmmrt = str44;
        this.gHZMYf = str45;
        this.values = bool3;
        this.getNewProxyInstance = str46;
        this.fJNWhG = str47;
        this.QKVWgx = str48;
        this.zsXlph = str49;
        this.DAIeex = str50;
        this.AEQbTJ = str51;
        this.AYXKKw = str52;
        this.QfsBiF = str53;
        this.QKudOq = str54;
        this.fvQaOB = str55;
        this.QUSxYX = str56;
        this.uzCIH = num;
        this.AxsJAYsNCnLh = str57;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderShowConfirmInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
