package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SingleCoinAllocationData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SingleCoinAllocationData> CREATOR = new Creator();
    private final int ccyColor;
    private final String ccyName;
    private final String ccyRatio;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SingleCoinAllocationData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleCoinAllocationData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleCoinAllocationData(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleCoinAllocationData[] newArray(int i) {
            return new SingleCoinAllocationData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleCoinAllocationData() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleCoinAllocationData copy$default(SingleCoinAllocationData singleCoinAllocationData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = singleCoinAllocationData.ccyName;
        }
        if ((i2 & 2) != 0) {
            str2 = singleCoinAllocationData.ccyRatio;
        }
        if ((i2 & 4) != 0) {
            i = singleCoinAllocationData.ccyColor;
        }
        return singleCoinAllocationData.copy(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccyRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.ccyColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleCoinAllocationData copy(String str, String str2, int i) {
        return new SingleCoinAllocationData(str, str2, i);
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
        if (!(obj instanceof SingleCoinAllocationData)) {
            return false;
        }
        SingleCoinAllocationData singleCoinAllocationData = (SingleCoinAllocationData) obj;
        return Intrinsics.EZpvd((Object) this.ccyName, (Object) singleCoinAllocationData.ccyName) && Intrinsics.EZpvd((Object) this.ccyRatio, (Object) singleCoinAllocationData.ccyRatio) && this.ccyColor == singleCoinAllocationData.ccyColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCcyColor() {
        return this.ccyColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyName() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyRatio() {
        return this.ccyRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccyName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ccyRatio;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.ccyColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleCoinAllocationData(ccyName=" + this.ccyName + ", ccyRatio=" + this.ccyRatio + ", ccyColor=" + this.ccyColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccyName);
        parcel.writeString(this.ccyRatio);
        parcel.writeInt(this.ccyColor);
    }

    public SingleCoinAllocationData(String str, String str2, int i) {
        this.ccyName = str;
        this.ccyRatio = str2;
        this.ccyColor = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:1370) call: com.okinc.unify_trade.bot.data.SingleCoinAllocationData.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ SingleCoinAllocationData(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
