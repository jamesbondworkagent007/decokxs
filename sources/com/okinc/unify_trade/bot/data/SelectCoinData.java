package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47221tlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SelectCoinData implements Parcelable, InterfaceC47221tlu {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectCoinData> CREATOR = new Creator();
    private final String icon;
    private String instId;
    private boolean isSearchVisible;
    private boolean isSelected;
    private boolean isShow;
    private String maxPrice;
    private String minPrice;
    private final String name;
    private String primary;
    private double primarySimilarity;
    private String ratio;
    private String secondary;
    private double secondarySimilarity;

    public static final class Creator implements Parcelable.Creator<SelectCoinData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectCoinData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectCoinData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectCoinData[] newArray(int i) {
            return new SelectCoinData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectCoinData() {
        this(null, null, null, false, false, false, null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component11() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component13() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSearchVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectCoinData copy(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, double d, String str8, double d2) {
        return new SelectCoinData(str, str2, str3, z, z2, z3, str4, str5, str6, str7, d, str8, d2);
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
        if (!(obj instanceof SelectCoinData)) {
            return false;
        }
        SelectCoinData selectCoinData = (SelectCoinData) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) selectCoinData.icon) && Intrinsics.EZpvd((Object) this.name, (Object) selectCoinData.name) && Intrinsics.EZpvd((Object) this.ratio, (Object) selectCoinData.ratio) && this.isSelected == selectCoinData.isSelected && this.isShow == selectCoinData.isShow && this.isSearchVisible == selectCoinData.isSearchVisible && Intrinsics.EZpvd((Object) this.instId, (Object) selectCoinData.instId) && Intrinsics.EZpvd((Object) this.minPrice, (Object) selectCoinData.minPrice) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) selectCoinData.maxPrice) && Intrinsics.EZpvd((Object) this.primary, (Object) selectCoinData.primary) && Double.compare(this.primarySimilarity, selectCoinData.primarySimilarity) == 0 && Intrinsics.EZpvd((Object) this.secondary, (Object) selectCoinData.secondary) && Double.compare(this.secondarySimilarity, selectCoinData.secondarySimilarity) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPrice() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
    public final String getRatio() {
        return this.ratio;
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
    public int hashCode() {
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ratio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSelected);
        int iHashCode5 = Boolean.hashCode(this.isShow);
        int iHashCode6 = Boolean.hashCode(this.isSearchVisible);
        String str4 = this.instId;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.minPrice;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxPrice;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.primary;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        int iHashCode11 = Double.hashCode(this.primarySimilarity);
        String str8 = this.secondary;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + Double.hashCode(this.secondarySimilarity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSearchVisible() {
        return this.isSearchVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShow() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPrice(String str) {
        this.maxPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPrice(String str) {
        this.minPrice = str;
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
    public final void setRatio(String str) {
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchVisible(boolean z) {
        this.isSearchVisible = z;
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
    public final void setShow(boolean z) {
        this.isShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectCoinData(icon=" + this.icon + ", name=" + this.name + ", ratio=" + this.ratio + ", isSelected=" + this.isSelected + ", isShow=" + this.isShow + ", isSearchVisible=" + this.isSearchVisible + ", instId=" + this.instId + ", minPrice=" + this.minPrice + ", maxPrice=" + this.maxPrice + ", primary=" + this.primary + ", primarySimilarity=" + this.primarySimilarity + ", secondary=" + this.secondary + ", secondarySimilarity=" + this.secondarySimilarity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeString(this.name);
        parcel.writeString(this.ratio);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeInt(this.isSearchVisible ? 1 : 0);
        parcel.writeString(this.instId);
        parcel.writeString(this.minPrice);
        parcel.writeString(this.maxPrice);
        parcel.writeString(this.primary);
        parcel.writeDouble(this.primarySimilarity);
        parcel.writeString(this.secondary);
        parcel.writeDouble(this.secondarySimilarity);
    }

    public SelectCoinData(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, double d, String str8, double d2) {
        this.icon = str;
        this.name = str2;
        this.ratio = str3;
        this.isSelected = z;
        this.isShow = z2;
        this.isSearchVisible = z3;
        this.instId = str4;
        this.minPrice = str5;
        this.maxPrice = str6;
        this.primary = str7;
        this.primarySimilarity = d;
        this.secondary = str8;
        this.secondarySimilarity = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SelectCoinData(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, double d, String str8, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9 = (i & 1) != 0 ? null : str;
        String str10 = (i & 2) != 0 ? null : str2;
        this(str9, str10, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) == 0 ? z3 : false, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null, (i & 512) != 0 ? str10 : str7, (i & 1024) != 0 ? 0.0d : d, (i & 2048) != 0 ? str10 : str8, (i & 4096) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
