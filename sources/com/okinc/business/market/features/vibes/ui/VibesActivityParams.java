package com.okinc.business.market.features.vibes.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesActivityParams implements Parcelable {
    public static final Parcelable.Creator<VibesActivityParams> CREATOR = new Creator();
    public final long KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<VibesActivityParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibesActivityParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VibesActivityParams(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibesActivityParams[] newArray(int i) {
            return new VibesActivityParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VibesActivityParams() {
        this(null, 0L, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VibesActivityParams copy$default(VibesActivityParams vibesActivityParams, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vibesActivityParams.copydefault;
        }
        if ((i & 2) != 0) {
            j = vibesActivityParams.KWHzl;
        }
        return vibesActivityParams.AEQbTJ(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesActivityParams AEQbTJ(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VibesActivityParams(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
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
        if (!(obj instanceof VibesActivityParams)) {
            return false;
        }
        VibesActivityParams vibesActivityParams = (VibesActivityParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) vibesActivityParams.copydefault) && this.KWHzl == vibesActivityParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VibesActivityParams(tokenContractAddress=" + this.copydefault + ", chainId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.KWHzl);
    }

    public VibesActivityParams(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 long) : (r2v0 long))
 A[MD:(java.lang.String, long):void (m)] (LINE:10) call: com.okinc.business.market.features.vibes.ui.VibesActivityParams.<init>(java.lang.String, long):void type: THIS */
    public /* synthetic */ VibesActivityParams(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 1L : j);
    }
}
