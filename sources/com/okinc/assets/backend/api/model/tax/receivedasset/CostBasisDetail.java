package com.okinc.assets.backend.api.model.tax.receivedasset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CostBasisDetail implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostBasisDetail> CREATOR = new Creator();
    private final String amount;
    private final String amountPaid;
    private final String dateAcquired;

    public static final class Creator implements Parcelable.Creator<CostBasisDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CostBasisDetail(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisDetail[] newArray(int i) {
            return new CostBasisDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CostBasisDetail() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CostBasisDetail copy$default(CostBasisDetail costBasisDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisDetail.dateAcquired;
        }
        if ((i & 2) != 0) {
            str2 = costBasisDetail.amount;
        }
        if ((i & 4) != 0) {
            str3 = costBasisDetail.amountPaid;
        }
        return costBasisDetail.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dateAcquired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostBasisDetail copy(String str, String str2, String str3) {
        return new CostBasisDetail(str, str2, str3);
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
        if (!(obj instanceof CostBasisDetail)) {
            return false;
        }
        CostBasisDetail costBasisDetail = (CostBasisDetail) obj;
        return Intrinsics.EZpvd((Object) this.dateAcquired, (Object) costBasisDetail.dateAcquired) && Intrinsics.EZpvd((Object) this.amount, (Object) costBasisDetail.amount) && Intrinsics.EZpvd((Object) this.amountPaid, (Object) costBasisDetail.amountPaid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountPaid() {
        return this.amountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateAcquired() {
        return this.dateAcquired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.dateAcquired;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amountPaid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CostBasisDetail(dateAcquired=" + this.dateAcquired + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dateAcquired);
        parcel.writeString(this.amount);
        parcel.writeString(this.amountPaid);
    }

    public CostBasisDetail(String str, String str2, String str3) {
        this.dateAcquired = str;
        this.amount = str2;
        this.amountPaid = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisDetail.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CostBasisDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
