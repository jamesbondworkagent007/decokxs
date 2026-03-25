package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DividerBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DividerBean> CREATOR = new Creator();
    private boolean isShowDivider;

    public static final class Creator implements Parcelable.Creator<DividerBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DividerBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DividerBean(parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DividerBean[] newArray(int i) {
            return new DividerBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DividerBean() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DividerBean copy$default(DividerBean dividerBean, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dividerBean.isShowDivider;
        }
        return dividerBean.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DividerBean copy(boolean z) {
        return new DividerBean(z);
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
        return (obj instanceof DividerBean) && this.isShowDivider == ((DividerBean) obj).isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.isShowDivider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDivider() {
        return this.isShowDivider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDivider(boolean z) {
        this.isShowDivider = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DividerBean(isShowDivider=" + this.isShowDivider + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isShowDivider ? 1 : 0);
    }

    public DividerBean(boolean z) {
        this.isShowDivider = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:82) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.DividerBean.<init>(boolean):void type: THIS */
    public /* synthetic */ DividerBean(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
