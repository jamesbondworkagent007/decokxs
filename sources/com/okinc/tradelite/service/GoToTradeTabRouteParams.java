package com.okinc.tradelite.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GoToTradeTabRouteParams implements Parcelable {
    public static final Parcelable.Creator<GoToTradeTabRouteParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final Integer KWHzl;
    public final OKTradeLiteSource OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<GoToTradeTabRouteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToTradeTabRouteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GoToTradeTabRouteParams(parcel.readString(), OKTradeLiteSource.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToTradeTabRouteParams[] newArray(int i) {
            return new GoToTradeTabRouteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GoToTradeTabRouteParams() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GoToTradeTabRouteParams copy$default(GoToTradeTabRouteParams goToTradeTabRouteParams, String str, OKTradeLiteSource oKTradeLiteSource, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goToTradeTabRouteParams.EZpvd;
        }
        if ((i & 2) != 0) {
            oKTradeLiteSource = goToTradeTabRouteParams.OLrzqt;
        }
        OKTradeLiteSource oKTradeLiteSource2 = oKTradeLiteSource;
        if ((i & 4) != 0) {
            str2 = goToTradeTabRouteParams.AEQbTJ;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = goToTradeTabRouteParams.KWHzl;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = goToTradeTabRouteParams.copydefault;
        }
        return goToTradeTabRouteParams.OLrzqt(str, oKTradeLiteSource2, str4, num2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GoToTradeTabRouteParams OLrzqt(String str, @NotNull OKTradeLiteSource oKTradeLiteSource, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        return new GoToTradeTabRouteParams(str, oKTradeLiteSource, str2, num, str3);
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
        if (!(obj instanceof GoToTradeTabRouteParams)) {
            return false;
        }
        GoToTradeTabRouteParams goToTradeTabRouteParams = (GoToTradeTabRouteParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) goToTradeTabRouteParams.EZpvd) && this.OLrzqt == goToTradeTabRouteParams.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) goToTradeTabRouteParams.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, goToTradeTabRouteParams.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) goToTradeTabRouteParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.KWHzl;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GoToTradeTabRouteParams(instId=" + this.EZpvd + ", source=" + this.OLrzqt + ", coinSymbol=" + this.AEQbTJ + ", bizType=" + this.KWHzl + ", optionId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.AEQbTJ);
        Integer num = this.KWHzl;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.copydefault);
    }

    public GoToTradeTabRouteParams(String str, @NotNull OKTradeLiteSource oKTradeLiteSource, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        this.EZpvd = str;
        this.OLrzqt = oKTradeLiteSource;
        this.AEQbTJ = str2;
        this.KWHzl = num;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:com.okinc.tradelite.service.OKTradeLiteSource:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradelite.service.OKTradeLiteSource:0x000c: SGET  A[WRAPPED] (LINE:275) com.okinc.tradelite.service.OKTradeLiteSource.LITE_PORTFOLIO_TOKEN com.okinc.tradelite.service.OKTradeLiteSource) : (r6v0 com.okinc.tradelite.service.OKTradeLiteSource))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:0x001f: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.tradelite.service.OKTradeLiteSource, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:273) call: com.okinc.tradelite.service.GoToTradeTabRouteParams.<init>(java.lang.String, com.okinc.tradelite.service.OKTradeLiteSource, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ GoToTradeTabRouteParams(String str, OKTradeLiteSource oKTradeLiteSource, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OKTradeLiteSource.LITE_PORTFOLIO_TOKEN : oKTradeLiteSource, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? null : str3);
    }
}
