package com.okinc.unify_trade.bot.grid.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GridProfitAmtDisplay implements Parcelable {
    public static final Parcelable.Creator<GridProfitAmtDisplay> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<GridProfitAmtDisplay> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAmtDisplay createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridProfitAmtDisplay(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAmtDisplay[] newArray(int i) {
            return new GridProfitAmtDisplay[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridProfitAmtDisplay() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitAmtDisplay copy$default(GridProfitAmtDisplay gridProfitAmtDisplay, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridProfitAmtDisplay.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = gridProfitAmtDisplay.EZpvd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = gridProfitAmtDisplay.AEQbTJ;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = gridProfitAmtDisplay.copydefault;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = gridProfitAmtDisplay.KWHzl;
        }
        return gridProfitAmtDisplay.OLrzqt(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAmtDisplay OLrzqt(String str, String str2, String str3, String str4, String str5) {
        return new GridProfitAmtDisplay(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof GridProfitAmtDisplay)) {
            return false;
        }
        GridProfitAmtDisplay gridProfitAmtDisplay = (GridProfitAmtDisplay) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) gridProfitAmtDisplay.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) gridProfitAmtDisplay.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) gridProfitAmtDisplay.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) gridProfitAmtDisplay.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) gridProfitAmtDisplay.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AEQbTJ;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.copydefault;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitAmtDisplay(beforePerMinProfitAmt=" + this.OLrzqt + ", beforePerMaxProfitAmt=" + this.EZpvd + ", afterPerMinProfitAmt=" + this.AEQbTJ + ", afterPerMaxProfitAmt=" + this.copydefault + ", profitCcy=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
    }

    public GridProfitAmtDisplay(String str, String str2, String str3, String str4, String str5) {
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.KWHzl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitAmtDisplay(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
