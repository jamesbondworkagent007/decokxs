package com.okinc.business.market.features.trader.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Traders implements Parcelable {
    public static final Parcelable.Creator<Traders> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String DbNXlk;
    public final String EZpvd;
    public final List<TagWrapper> KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<Traders> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Traders createFromParcel(Parcel parcel) {
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
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
                i3++;
                i2 = i2;
            }
            return new Traders(i, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Traders[] newArray(int i) {
            return new Traders[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Traders() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Traders copydefault(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<TagWrapper> list) {
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
        Intrinsics.checkNotNullParameter(list, "");
        return new Traders(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list);
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
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Traders)) {
            return false;
        }
        Traders traders = (Traders) obj;
        return this.OLrzqt == traders.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) traders.EZpvd) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) traders.AhwBna) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) traders.DbNXlk) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) traders.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) traders.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) traders.valueOf) && Intrinsics.EZpvd((Object) this.isConnected, (Object) traders.isConnected) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) traders.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) traders.djBIcL) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) traders.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) traders.values) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) traders.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, traders.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Traders(ranking=" + this.OLrzqt + ", chainId=" + this.EZpvd + ", tokenAddress=" + this.AhwBna + ", traderAddress=" + this.DbNXlk + ", soldAvgPrice=" + this.AYXKKw + ", boughtAvgPrice=" + this.copydefault + ", totalProfit=" + this.valueOf + ", totalProfitPercent=" + this.isConnected + ", realizedProfit=" + this.gEmmrt + ", realizedProfitPercent=" + this.djBIcL + ", unrealizedProfit=" + this.fetchVPNInfo + ", unrealizedProfitPercent=" + this.values + ", nativeTokenPrice=" + this.AEQbTJ + ", newTagList=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.values);
        parcel.writeString(this.AEQbTJ);
        List<TagWrapper> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public Traders(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<TagWrapper> list) {
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
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = i;
        this.EZpvd = str;
        this.AhwBna = str2;
        this.DbNXlk = str3;
        this.AYXKKw = str4;
        this.copydefault = str5;
        this.valueOf = str6;
        this.isConnected = str7;
        this.gEmmrt = str8;
        this.djBIcL = str9;
        this.fetchVPNInfo = str10;
        this.values = str11;
        this.AEQbTJ = str12;
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0094: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r29v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>):void (m)] (LINE:8) call: com.okinc.business.market.features.trader.domain.model.Traders.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ Traders(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) == 0 ? str12 : "", (i2 & 8192) != 0 ? yDY.AhwBna() : list);
    }
}
