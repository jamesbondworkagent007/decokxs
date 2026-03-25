package com.okinc.business.dexui.main.market;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketParams implements Parcelable {
    public static final Parcelable.Creator<MarketParams> CREATOR = new Creator();
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<MarketParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketParams[] newArray(int i) {
            return new MarketParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketParams copy$default(MarketParams marketParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = marketParams.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = marketParams.KWHzl;
        }
        return marketParams.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketParams OLrzqt(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketParams(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof MarketParams)) {
            return false;
        }
        MarketParams marketParams = (MarketParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) marketParams.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) marketParams.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) marketParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketParams(pageFrom=" + this.copydefault + ", selectedTabKey=" + this.OLrzqt + ", selectedChainId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
    }

    public MarketParams(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:94) call: com.okinc.business.dexui.main.market.MarketParams.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
