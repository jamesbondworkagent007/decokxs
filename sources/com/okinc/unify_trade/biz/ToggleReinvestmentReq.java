package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ToggleReinvestmentReq implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ToggleReinvestmentReq> CREATOR = new Creator();
    private final String algoId;
    private final boolean reinvestment;

    public static final class Creator implements Parcelable.Creator<ToggleReinvestmentReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToggleReinvestmentReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ToggleReinvestmentReq(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToggleReinvestmentReq[] newArray(int i) {
            return new ToggleReinvestmentReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ToggleReinvestmentReq() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ToggleReinvestmentReq copy$default(ToggleReinvestmentReq toggleReinvestmentReq, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toggleReinvestmentReq.algoId;
        }
        if ((i & 2) != 0) {
            z = toggleReinvestmentReq.reinvestment;
        }
        return toggleReinvestmentReq.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToggleReinvestmentReq copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ToggleReinvestmentReq(str, z);
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
        if (!(obj instanceof ToggleReinvestmentReq)) {
            return false;
        }
        ToggleReinvestmentReq toggleReinvestmentReq = (ToggleReinvestmentReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) toggleReinvestmentReq.algoId) && this.reinvestment == toggleReinvestmentReq.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + Boolean.hashCode(this.reinvestment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToggleReinvestmentReq(algoId=" + this.algoId + ", reinvestment=" + this.reinvestment + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeInt(this.reinvestment ? 1 : 0);
    }

    public ToggleReinvestmentReq(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.reinvestment = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:1476) call: com.okinc.unify_trade.biz.ToggleReinvestmentReq.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ToggleReinvestmentReq(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z);
    }
}
