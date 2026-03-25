package com.okinc.dexkline.market.data.model.holder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class HolderTopChartItemData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HolderTopChartItemData> CREATOR = new Creator();
    private final String holdAmount;
    private final String holdAmountPercentage;
    private final String holdTime;

    public static final class Creator implements Parcelable.Creator<HolderTopChartItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderTopChartItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderTopChartItemData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderTopChartItemData[] newArray(int i) {
            return new HolderTopChartItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderTopChartItemData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HolderTopChartItemData copy$default(HolderTopChartItemData holderTopChartItemData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holderTopChartItemData.holdAmount;
        }
        if ((i & 2) != 0) {
            str2 = holderTopChartItemData.holdTime;
        }
        if ((i & 4) != 0) {
            str3 = holderTopChartItemData.holdAmountPercentage;
        }
        return holderTopChartItemData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTopChartItemData copy(String str, String str2, String str3) {
        return new HolderTopChartItemData(str, str2, str3);
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
        if (!(obj instanceof HolderTopChartItemData)) {
            return false;
        }
        HolderTopChartItemData holderTopChartItemData = (HolderTopChartItemData) obj;
        return Intrinsics.EZpvd((Object) this.holdAmount, (Object) holderTopChartItemData.holdAmount) && Intrinsics.EZpvd((Object) this.holdTime, (Object) holderTopChartItemData.holdTime) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) holderTopChartItemData.holdAmountPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmount() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmountPercentage() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldTime() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.holdAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.holdTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.holdAmountPercentage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderTopChartItemData(holdAmount=" + this.holdAmount + ", holdTime=" + this.holdTime + ", holdAmountPercentage=" + this.holdAmountPercentage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.holdAmount);
        parcel.writeString(this.holdTime);
        parcel.writeString(this.holdAmountPercentage);
    }

    public HolderTopChartItemData(String str, String str2, String str3) {
        this.holdAmount = str;
        this.holdTime = str2;
        this.holdAmountPercentage = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.dexkline.market.data.model.holder.HolderTopChartItemData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderTopChartItemData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
