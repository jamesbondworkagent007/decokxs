package com.okinc.business.invest_biz.ui.screens.product_details.tab;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Supply extends ProductDetailsUserTradeAction {
    public static final Parcelable.Creator<Supply> CREATOR = new Creator();
    public final long AEQbTJ;
    public final long copydefault;

    public static final class Creator implements Parcelable.Creator<Supply> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Supply createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Supply(parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Supply[] newArray(int i) {
            return new Supply[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Supply() {
        this(0L, 0L, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Supply copy$default(Supply supply, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = supply.AEQbTJ;
        }
        if ((i & 2) != 0) {
            j2 = supply.copydefault;
        }
        return supply.EZpvd(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Supply EZpvd(long j, long j2) {
        return new Supply(j, j2);
    }

    @Override // com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Supply)) {
            return false;
        }
        Supply supply = (Supply) obj;
        return this.AEQbTJ == supply.AEQbTJ && this.copydefault == supply.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.AEQbTJ) * 31) + Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Supply(supplyInvestmentId=" + this.AEQbTJ + ", relatedInvestmentId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeLong(this.copydefault);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 long))
 A[MD:(long, long):void (m)] (LINE:10) call: com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply.<init>(long, long):void type: THIS */
    public /* synthetic */ Supply(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }

    public Supply(long j, long j2) {
        this.AEQbTJ = j;
        this.copydefault = j2;
    }
}
