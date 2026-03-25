package com.okinc.business.dexui.main.market.detail.fragment.chart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class KLineFragmentParams implements Parcelable {
    public final String AEQbTJ;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<KLineFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KLineFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KLineFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KLineFragmentParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KLineFragmentParams[] newArray(int i) {
            return new KLineFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KLineFragmentParams() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KLineFragmentParams copy$default(KLineFragmentParams kLineFragmentParams, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kLineFragmentParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = kLineFragmentParams.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = kLineFragmentParams.copydefault;
        }
        if ((i & 8) != 0) {
            str3 = kLineFragmentParams.KWHzl;
        }
        return kLineFragmentParams.AEQbTJ(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineFragmentParams AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KLineFragmentParams(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
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
        if (!(obj instanceof KLineFragmentParams)) {
            return false;
        }
        KLineFragmentParams kLineFragmentParams = (KLineFragmentParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) kLineFragmentParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) kLineFragmentParams.OLrzqt) && this.copydefault == kLineFragmentParams.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) kLineFragmentParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KLineFragmentParams(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.OLrzqt + ", hasMarketCapData=" + this.copydefault + ", circulatingSupply=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.KWHzl);
    }

    public KLineFragmentParams(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = z;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:81) call: com.okinc.business.dexui.main.market.detail.fragment.chart.KLineFragmentParams.<init>(java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ KLineFragmentParams(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.detail.fragment.chart.KLineFragmentParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
