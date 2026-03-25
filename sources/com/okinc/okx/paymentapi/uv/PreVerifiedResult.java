package com.okinc.okx.paymentapi.uv;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PreVerifiedResult implements Parcelable {
    public static final Parcelable.Creator<PreVerifiedResult> CREATOR = new Creator();
    public boolean EZpvd;
    public boolean copydefault;

    public static final class Creator implements Parcelable.Creator<PreVerifiedResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreVerifiedResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PreVerifiedResult(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreVerifiedResult[] newArray(int i) {
            return new PreVerifiedResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public PreVerifiedResult() {
        boolean z = false;
        this(z, z, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreVerifiedResult copy$default(PreVerifiedResult preVerifiedResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preVerifiedResult.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = preVerifiedResult.copydefault;
        }
        return preVerifiedResult.KWHzl(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreVerifiedResult KWHzl(boolean z, boolean z2) {
        return new PreVerifiedResult(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof PreVerifiedResult)) {
            return false;
        }
        PreVerifiedResult preVerifiedResult = (PreVerifiedResult) obj;
        return this.EZpvd == preVerifiedResult.EZpvd && this.copydefault == preVerifiedResult.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.EZpvd) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreVerifiedResult(isLoggedIn=" + this.EZpvd + ", isKycCompliant=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public PreVerifiedResult(boolean z, boolean z2) {
        this.EZpvd = z;
        this.copydefault = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:11) call: com.okinc.okx.paymentapi.uv.PreVerifiedResult.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ PreVerifiedResult(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
