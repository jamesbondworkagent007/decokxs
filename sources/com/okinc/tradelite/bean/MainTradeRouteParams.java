package com.okinc.tradelite.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class MainTradeRouteParams implements Parcelable {
    public static final Parcelable.Creator<MainTradeRouteParams> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public String EZpvd;
    public final Integer KWHzl;
    public String OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<MainTradeRouteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MainTradeRouteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MainTradeRouteParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MainTradeRouteParams[] newArray(int i) {
            return new MainTradeRouteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MainTradeRouteParams() {
        this(null, null, false, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MainTradeRouteParams copy$default(MainTradeRouteParams mainTradeRouteParams, String str, String str2, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mainTradeRouteParams.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = mainTradeRouteParams.OLrzqt;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = mainTradeRouteParams.AEQbTJ;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = mainTradeRouteParams.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            num = mainTradeRouteParams.KWHzl;
        }
        return mainTradeRouteParams.OLrzqt(str, str3, z3, z4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MainTradeRouteParams OLrzqt(@NotNull String str, String str2, boolean z, boolean z2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MainTradeRouteParams(str, str2, z, z2, num);
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
        if (!(obj instanceof MainTradeRouteParams)) {
            return false;
        }
        MainTradeRouteParams mainTradeRouteParams = (MainTradeRouteParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) mainTradeRouteParams.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) mainTradeRouteParams.OLrzqt) && this.AEQbTJ == mainTradeRouteParams.AEQbTJ && this.copydefault == mainTradeRouteParams.copydefault && Intrinsics.EZpvd(this.KWHzl, mainTradeRouteParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = Boolean.hashCode(this.copydefault);
        Integer num = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MainTradeRouteParams(tokenInstId=" + this.EZpvd + ", tradeMode=" + this.OLrzqt + ", showBackButton=" + this.AEQbTJ + ", isFullScreenModeEnabled=" + this.copydefault + ", scrollToTab=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        Integer num = this.KWHzl;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public MainTradeRouteParams(@NotNull String str, String str2, boolean z, boolean z2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.KWHzl = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 boolean) : false)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x0024: INVOKE 
  (wrap:int:0x0020: INVOKE 
  (wrap:com.okinc.tradelite.bean.MainTradeTab:0x001e: SGET  A[WRAPPED] (LINE:12) com.okinc.tradelite.bean.MainTradeTab.NONE com.okinc.tradelite.bean.MainTradeTab)
 VIRTUAL call: com.okinc.tradelite.bean.MainTradeTab.getTabInt():int A[MD:():int (m), WRAPPED] (LINE:12))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:12)) : (r8v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean, java.lang.Integer):void (m)] (LINE:7) call: com.okinc.tradelite.bean.MainTradeRouteParams.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ MainTradeRouteParams(String str, String str2, boolean z, boolean z2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? Integer.valueOf(MainTradeTab.NONE.getTabInt()) : num);
    }
}
