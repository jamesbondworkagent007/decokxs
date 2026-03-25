package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsVipProfitData implements Parcelable {
    public static final Parcelable.Creator<TacticsVipProfitData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;

    public static final class Creator implements Parcelable.Creator<TacticsVipProfitData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsVipProfitData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsVipProfitData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsVipProfitData[] newArray(int i) {
            return new TacticsVipProfitData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsVipProfitData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsVipProfitData copy$default(TacticsVipProfitData tacticsVipProfitData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tacticsVipProfitData.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = tacticsVipProfitData.AEQbTJ;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = tacticsVipProfitData.KWHzl;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = tacticsVipProfitData.OLrzqt;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = tacticsVipProfitData.djBIcL;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = tacticsVipProfitData.copydefault;
        }
        return tacticsVipProfitData.EZpvd(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVipProfitData EZpvd(String str, String str2, String str3, String str4, String str5, String str6) {
        return new TacticsVipProfitData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.djBIcL;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TacticsVipProfitData)) {
            return false;
        }
        TacticsVipProfitData tacticsVipProfitData = (TacticsVipProfitData) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) tacticsVipProfitData.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tacticsVipProfitData.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tacticsVipProfitData.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsVipProfitData.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tacticsVipProfitData.djBIcL) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tacticsVipProfitData.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.KWHzl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.djBIcL;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsVipProfitData(instId=" + this.EZpvd + ", instType=" + this.AEQbTJ + ", earnType=" + this.KWHzl + ", botType=" + this.OLrzqt + ", tradeQuoteCcy=" + this.djBIcL + ", ccys=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.copydefault);
    }

    public TacticsVipProfitData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.OLrzqt = str4;
        this.djBIcL = str5;
        this.copydefault = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:504) call: com.okinc.unify_trade.bot.data.TacticsVipProfitData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsVipProfitData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
