package com.okinc.business.defi.wallet.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomNetworkConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CustomNetworkConfig> CREATOR = new Creator();
    private final int maxNum;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CustomNetworkConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomNetworkConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomNetworkConfig(parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomNetworkConfig[] newArray(int i) {
            return new CustomNetworkConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomNetworkConfig() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomNetworkConfig copy$default(CustomNetworkConfig customNetworkConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customNetworkConfig.maxNum;
        }
        return customNetworkConfig.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomNetworkConfig copy(int i) {
        return new CustomNetworkConfig(i);
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
        return (obj instanceof CustomNetworkConfig) && this.maxNum == ((CustomNetworkConfig) obj).maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxNum() {
        return this.maxNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.maxNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomNetworkConfig(maxNum=" + this.maxNum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.maxNum);
    }

    public CustomNetworkConfig(int i) {
        this.maxNum = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (50 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:31) call: com.okinc.business.defi.wallet.bean.CustomNetworkConfig.<init>(int):void type: THIS */
    public /* synthetic */ CustomNetworkConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 50 : i);
    }
}
