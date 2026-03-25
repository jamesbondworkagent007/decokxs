package com.okinc.business.market.features.history.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.tag.domain.CompactTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChange implements Parcelable {
    public static final Parcelable.Creator<HistoryChange> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final List<CompactTag> AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final List<HistoryTokenChange> KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<HistoryChange> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryChange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (int i3 = 0; i3 != i; i3++) {
                arrayList.add(HistoryTokenChange.CREATOR.createFromParcel(parcel));
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            while (i2 != i4) {
                arrayList2.add(CompactTag.CREATOR.createFromParcel(parcel));
                i2++;
                i4 = i4;
            }
            return new HistoryChange(string, string2, string3, string4, string5, string6, string7, string8, arrayList, string9, string10, string11, string12, string13, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryChange[] newArray(int i) {
            return new HistoryChange[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryChange() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTag> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryTokenChange> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryChange copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<HistoryTokenChange> list, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<CompactTag> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new HistoryChange(str, str2, str3, str4, str5, str6, str7, str8, list, str9, str10, str11, str12, str13, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryChange)) {
            return false;
        }
        HistoryChange historyChange = (HistoryChange) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) historyChange.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) historyChange.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) historyChange.AEQbTJ) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) historyChange.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) historyChange.gEmmrt) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) historyChange.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) historyChange.values) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) historyChange.DbNXlk) && Intrinsics.EZpvd(this.KWHzl, historyChange.KWHzl) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) historyChange.AkhnZx) && Intrinsics.EZpvd((Object) this.copydefault, (Object) historyChange.copydefault) && Intrinsics.EZpvd((Object) this.isConnected, (Object) historyChange.isConnected) && Intrinsics.EZpvd((Object) this.valueOf, (Object) historyChange.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) historyChange.EZpvd) && Intrinsics.EZpvd(this.AhwBna, historyChange.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.AYXKKw.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryChange(id=" + this.AYXKKw + ", chainId=" + this.OLrzqt + ", dexName=" + this.AEQbTJ + ", price=" + this.djBIcL + ", poolLogoUrl=" + this.gEmmrt + ", txHashUrl=" + this.fetchVPNInfo + ", volume=" + this.values + ", userAddress=" + this.DbNXlk + ", changedTokenInfo=" + this.KWHzl + ", tokenSymbol=" + this.AkhnZx + ", amount=" + this.copydefault + ", timestamp=" + this.isConnected + ", isBuy=" + this.valueOf + ", baseTokenPrice=" + this.EZpvd + ", newTagList=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.values);
        parcel.writeString(this.DbNXlk);
        List<HistoryTokenChange> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<HistoryTokenChange> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.EZpvd);
        List<CompactTag> list2 = this.AhwBna;
        parcel.writeInt(list2.size());
        Iterator<CompactTag> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public HistoryChange(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<HistoryTokenChange> list, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<CompactTag> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AYXKKw = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.djBIcL = str4;
        this.gEmmrt = str5;
        this.fetchVPNInfo = str6;
        this.values = str7;
        this.DbNXlk = str8;
        this.KWHzl = list;
        this.AkhnZx = str9;
        this.copydefault = str10;
        this.isConnected = str11;
        this.valueOf = str12;
        this.EZpvd = str13;
        this.AhwBna = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("0") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r31v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.history.domain.model.HistoryTokenChange>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.tag.domain.CompactTag>):void (m)] (LINE:10) call: com.okinc.business.market.features.history.domain.model.HistoryChange.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HistoryChange(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, String str13, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "0" : str12, (i & 8192) == 0 ? str13 : "", (i & 16384) != 0 ? yDY.AhwBna() : list2);
    }
}
