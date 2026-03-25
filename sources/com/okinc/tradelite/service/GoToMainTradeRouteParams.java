package com.okinc.tradelite.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GoToMainTradeRouteParams implements Parcelable {
    public static final Parcelable.Creator<GoToMainTradeRouteParams> CREATOR = new Creator();
    public final OKTradeLiteSource EZpvd;
    public final String KWHzl;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<GoToMainTradeRouteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToMainTradeRouteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GoToMainTradeRouteParams(parcel.readString(), OKTradeLiteSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToMainTradeRouteParams[] newArray(int i) {
            return new GoToMainTradeRouteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GoToMainTradeRouteParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GoToMainTradeRouteParams copy$default(GoToMainTradeRouteParams goToMainTradeRouteParams, String str, OKTradeLiteSource oKTradeLiteSource, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goToMainTradeRouteParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            oKTradeLiteSource = goToMainTradeRouteParams.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = goToMainTradeRouteParams.KWHzl;
        }
        return goToMainTradeRouteParams.EZpvd(str, oKTradeLiteSource, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GoToMainTradeRouteParams EZpvd(String str, @NotNull OKTradeLiteSource oKTradeLiteSource, String str2) {
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        return new GoToMainTradeRouteParams(str, oKTradeLiteSource, str2);
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
        if (!(obj instanceof GoToMainTradeRouteParams)) {
            return false;
        }
        GoToMainTradeRouteParams goToMainTradeRouteParams = (GoToMainTradeRouteParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) goToMainTradeRouteParams.OLrzqt) && this.EZpvd == goToMainTradeRouteParams.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) goToMainTradeRouteParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GoToMainTradeRouteParams(instId=" + this.OLrzqt + ", source=" + this.EZpvd + ", optionId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.KWHzl);
    }

    public GoToMainTradeRouteParams(String str, @NotNull OKTradeLiteSource oKTradeLiteSource, String str2) {
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        this.OLrzqt = str;
        this.EZpvd = oKTradeLiteSource;
        this.KWHzl = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.tradelite.service.OKTradeLiteSource:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradelite.service.OKTradeLiteSource:0x000a: SGET  A[WRAPPED] (LINE:268) com.okinc.tradelite.service.OKTradeLiteSource.UNKNOWN_SOURCE com.okinc.tradelite.service.OKTradeLiteSource) : (r3v0 com.okinc.tradelite.service.OKTradeLiteSource))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.tradelite.service.OKTradeLiteSource, java.lang.String):void (m)] (LINE:266) call: com.okinc.tradelite.service.GoToMainTradeRouteParams.<init>(java.lang.String, com.okinc.tradelite.service.OKTradeLiteSource, java.lang.String):void type: THIS */
    public /* synthetic */ GoToMainTradeRouteParams(String str, OKTradeLiteSource oKTradeLiteSource, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OKTradeLiteSource.UNKNOWN_SOURCE : oKTradeLiteSource, (i & 4) != 0 ? null : str2);
    }
}
