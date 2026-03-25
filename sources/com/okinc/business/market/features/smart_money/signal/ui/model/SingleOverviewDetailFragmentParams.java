package com.okinc.business.market.features.smart_money.signal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleOverviewDetailFragmentParams implements Parcelable {
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final String copydefault;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<SingleOverviewDetailFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SingleOverviewDetailFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleOverviewDetailFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleOverviewDetailFragmentParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleOverviewDetailFragmentParams[] newArray(int i) {
            return new SingleOverviewDetailFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleOverviewDetailFragmentParams() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleOverviewDetailFragmentParams copy$default(SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParams, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleOverviewDetailFragmentParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = singleOverviewDetailFragmentParams.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = singleOverviewDetailFragmentParams.EZpvd;
        }
        return singleOverviewDetailFragmentParams.KWHzl(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleOverviewDetailFragmentParams KWHzl(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SingleOverviewDetailFragmentParams(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
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
        if (!(obj instanceof SingleOverviewDetailFragmentParams)) {
            return false;
        }
        SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParams = (SingleOverviewDetailFragmentParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) singleOverviewDetailFragmentParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) singleOverviewDetailFragmentParams.AEQbTJ) && this.EZpvd == singleOverviewDetailFragmentParams.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleOverviewDetailFragmentParams(chainId=" + this.copydefault + ", tokenAddress=" + this.AEQbTJ + ", isSmartAccount=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public SingleOverviewDetailFragmentParams(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:7) call: com.okinc.business.market.features.smart_money.signal.ui.model.SingleOverviewDetailFragmentParams.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SingleOverviewDetailFragmentParams(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.model.SingleOverviewDetailFragmentParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
