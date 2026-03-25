package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47221tlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class HomeStrategyFilterCoin implements Parcelable, InterfaceC47221tlu {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeStrategyFilterCoin> CREATOR = new Creator();
    private String coinIcon;
    private String coinName;
    private boolean isSelected;
    private Integer localCoinIcon;
    private String primary;
    private double primarySimilarity;
    private String secondary;
    private double secondarySimilarity;
    private String showCoinName;

    public static final class Creator implements Parcelable.Creator<HomeStrategyFilterCoin> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeStrategyFilterCoin createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeStrategyFilterCoin(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeStrategyFilterCoin[] newArray(int i) {
            return new HomeStrategyFilterCoin[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeStrategyFilterCoin() {
        this(null, null, false, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.showCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.localCoinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component7() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component9() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeStrategyFilterCoin copy(String str, String str2, boolean z, String str3, Integer num, String str4, double d, String str5, double d2) {
        return new HomeStrategyFilterCoin(str, str2, z, str3, num, str4, d, str5, d2);
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
        if (!(obj instanceof HomeStrategyFilterCoin)) {
            return false;
        }
        HomeStrategyFilterCoin homeStrategyFilterCoin = (HomeStrategyFilterCoin) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) homeStrategyFilterCoin.coinName) && Intrinsics.EZpvd((Object) this.showCoinName, (Object) homeStrategyFilterCoin.showCoinName) && this.isSelected == homeStrategyFilterCoin.isSelected && Intrinsics.EZpvd((Object) this.coinIcon, (Object) homeStrategyFilterCoin.coinIcon) && Intrinsics.EZpvd(this.localCoinIcon, homeStrategyFilterCoin.localCoinIcon) && Intrinsics.EZpvd((Object) this.primary, (Object) homeStrategyFilterCoin.primary) && Double.compare(this.primarySimilarity, homeStrategyFilterCoin.primarySimilarity) == 0 && Intrinsics.EZpvd((Object) this.secondary, (Object) homeStrategyFilterCoin.secondary) && Double.compare(this.secondarySimilarity, homeStrategyFilterCoin.secondarySimilarity) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLocalCoinIcon() {
        return this.localCoinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getPrimary() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getSecondary() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShowCoinName() {
        return this.showCoinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.showCoinName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isSelected);
        String str3 = this.coinIcon;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.localCoinIcon;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str4 = this.primary;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = Double.hashCode(this.primarySimilarity);
        String str5 = this.secondary;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Double.hashCode(this.secondarySimilarity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIcon(String str) {
        this.coinIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(String str) {
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalCoinIcon(Integer num) {
        this.localCoinIcon = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrimary(String str) {
        this.primary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.primarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecondary(String str) {
        this.secondary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.secondarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCoinName(String str) {
        this.showCoinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeStrategyFilterCoin(coinName=" + this.coinName + ", showCoinName=" + this.showCoinName + ", isSelected=" + this.isSelected + ", coinIcon=" + this.coinIcon + ", localCoinIcon=" + this.localCoinIcon + ", primary=" + this.primary + ", primarySimilarity=" + this.primarySimilarity + ", secondary=" + this.secondary + ", secondarySimilarity=" + this.secondarySimilarity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeString(this.showCoinName);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.coinIcon);
        Integer num = this.localCoinIcon;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.primary);
        parcel.writeDouble(this.primarySimilarity);
        parcel.writeString(this.secondary);
        parcel.writeDouble(this.secondarySimilarity);
    }

    public HomeStrategyFilterCoin(String str, String str2, boolean z, String str3, Integer num, String str4, double d, String str5, double d2) {
        this.coinName = str;
        this.showCoinName = str2;
        this.isSelected = z;
        this.coinIcon = str3;
        this.localCoinIcon = num;
        this.primary = str4;
        this.primarySimilarity = d;
        this.secondary = str5;
        this.secondarySimilarity = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeStrategyFilterCoin(String str, String str2, boolean z, String str3, Integer num, String str4, double d, String str5, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i & 1) != 0 ? null : str;
        this(str6, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? num : null, (i & 32) != 0 ? str6 : str4, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? str6 : str5, (i & 256) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public final boolean isDefaultAllSelected() {
        String str = this.coinName;
        return str == null || str.length() == 0;
    }
}
