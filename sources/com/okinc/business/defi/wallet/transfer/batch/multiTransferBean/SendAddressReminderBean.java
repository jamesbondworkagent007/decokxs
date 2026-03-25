package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SendAddressReminderBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendAddressReminderBean> CREATOR = new Creator();
    private int disabledWalletSize;

    public static final class Creator implements Parcelable.Creator<SendAddressReminderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendAddressReminderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SendAddressReminderBean(parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendAddressReminderBean[] newArray(int i) {
            return new SendAddressReminderBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SendAddressReminderBean() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendAddressReminderBean copy$default(SendAddressReminderBean sendAddressReminderBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sendAddressReminderBean.disabledWalletSize;
        }
        return sendAddressReminderBean.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.disabledWalletSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendAddressReminderBean copy(int i) {
        return new SendAddressReminderBean(i);
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
        return (obj instanceof SendAddressReminderBean) && this.disabledWalletSize == ((SendAddressReminderBean) obj).disabledWalletSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisabledWalletSize() {
        return this.disabledWalletSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.disabledWalletSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisabledWalletSize(int i) {
        this.disabledWalletSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendAddressReminderBean(disabledWalletSize=" + this.disabledWalletSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.disabledWalletSize);
    }

    public SendAddressReminderBean(int i) {
        this.disabledWalletSize = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:86) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.SendAddressReminderBean.<init>(int):void type: THIS */
    public /* synthetic */ SendAddressReminderBean(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
