package com.okinc.business.invest_biz.ui.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestKLineCandleInfo implements Parcelable {
    public static final Parcelable.Creator<InvestKLineCandleInfo> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<InvestKLineCandleInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestKLineCandleInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestKLineCandleInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestKLineCandleInfo[] newArray(int i) {
            return new InvestKLineCandleInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestKLineCandleInfo() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestKLineCandleInfo copy$default(InvestKLineCandleInfo investKLineCandleInfo, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investKLineCandleInfo.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str2 = investKLineCandleInfo.EZpvd;
        }
        if ((i2 & 4) != 0) {
            i = investKLineCandleInfo.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            str3 = investKLineCandleInfo.KWHzl;
        }
        return investKLineCandleInfo.EZpvd(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestKLineCandleInfo EZpvd(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestKLineCandleInfo(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
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
        if (!(obj instanceof InvestKLineCandleInfo)) {
            return false;
        }
        InvestKLineCandleInfo investKLineCandleInfo = (InvestKLineCandleInfo) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) investKLineCandleInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) investKLineCandleInfo.EZpvd) && this.AEQbTJ == investKLineCandleInfo.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) investKLineCandleInfo.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestKLineCandleInfo(rate=" + this.OLrzqt + ", timestamp=" + this.EZpvd + ", limitValue=" + this.AEQbTJ + ", bonusRate=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
    }

    public InvestKLineCandleInfo(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.AEQbTJ = i;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:27) call: com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo.<init>(java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ InvestKLineCandleInfo(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
