package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryOrderData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HistoryOrderData> CREATOR = new Creator();
    private String buyCount;
    private String buyCountTitle;
    private String buyPrice;
    private Integer iconTintColor;
    private String sellCount;
    private String sellCountTitle;
    private String sellPrice;
    private boolean showBuyPrefix;
    private boolean showSellPrefix;
    private Integer tagIconDrawableId;
    private String time;

    public static final class Creator implements Parcelable.Creator<HistoryOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryOrderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryOrderData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryOrderData[] newArray(int i) {
            return new HistoryOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryOrderData() {
        this(null, null, null, null, null, null, null, null, null, false, false, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.showBuyPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.showSellPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.buyCountTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sellCountTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.tagIconDrawableId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.iconTintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @DrawableRes Integer num, @ColorInt Integer num2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new HistoryOrderData(str, str2, str3, str4, str5, str6, str7, num, num2, z, z2);
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
        if (!(obj instanceof HistoryOrderData)) {
            return false;
        }
        HistoryOrderData historyOrderData = (HistoryOrderData) obj;
        return Intrinsics.EZpvd((Object) this.time, (Object) historyOrderData.time) && Intrinsics.EZpvd((Object) this.buyPrice, (Object) historyOrderData.buyPrice) && Intrinsics.EZpvd((Object) this.buyCount, (Object) historyOrderData.buyCount) && Intrinsics.EZpvd((Object) this.sellPrice, (Object) historyOrderData.sellPrice) && Intrinsics.EZpvd((Object) this.sellCount, (Object) historyOrderData.sellCount) && Intrinsics.EZpvd((Object) this.buyCountTitle, (Object) historyOrderData.buyCountTitle) && Intrinsics.EZpvd((Object) this.sellCountTitle, (Object) historyOrderData.sellCountTitle) && Intrinsics.EZpvd(this.tagIconDrawableId, historyOrderData.tagIconDrawableId) && Intrinsics.EZpvd(this.iconTintColor, historyOrderData.iconTintColor) && this.showBuyPrefix == historyOrderData.showBuyPrefix && this.showSellPrefix == historyOrderData.showSellPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyCount() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyCountTitle() {
        return this.buyCountTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIconTintColor() {
        return this.iconTintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellCount() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellCountTitle() {
        return this.sellCountTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellPrice() {
        return this.sellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowBuyPrefix() {
        return this.showBuyPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSellPrefix() {
        return this.showSellPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTagIconDrawableId() {
        return this.tagIconDrawableId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.time.hashCode();
        int iHashCode2 = this.buyPrice.hashCode();
        int iHashCode3 = this.buyCount.hashCode();
        int iHashCode4 = this.sellPrice.hashCode();
        int iHashCode5 = this.sellCount.hashCode();
        int iHashCode6 = this.buyCountTitle.hashCode();
        int iHashCode7 = this.sellCountTitle.hashCode();
        Integer num = this.tagIconDrawableId;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.iconTintColor;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showBuyPrefix)) * 31) + Boolean.hashCode(this.showSellPrefix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCountTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyCountTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconTintColor(Integer num) {
        this.iconTintColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellCountTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellCountTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowBuyPrefix(boolean z) {
        this.showBuyPrefix = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSellPrefix(boolean z) {
        this.showSellPrefix = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagIconDrawableId(Integer num) {
        this.tagIconDrawableId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.time = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryOrderData(time=" + this.time + ", buyPrice=" + this.buyPrice + ", buyCount=" + this.buyCount + ", sellPrice=" + this.sellPrice + ", sellCount=" + this.sellCount + ", buyCountTitle=" + this.buyCountTitle + ", sellCountTitle=" + this.sellCountTitle + ", tagIconDrawableId=" + this.tagIconDrawableId + ", iconTintColor=" + this.iconTintColor + ", showBuyPrefix=" + this.showBuyPrefix + ", showSellPrefix=" + this.showSellPrefix + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.time);
        parcel.writeString(this.buyPrice);
        parcel.writeString(this.buyCount);
        parcel.writeString(this.sellPrice);
        parcel.writeString(this.sellCount);
        parcel.writeString(this.buyCountTitle);
        parcel.writeString(this.sellCountTitle);
        Integer num = this.tagIconDrawableId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.iconTintColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.showBuyPrefix ? 1 : 0);
        parcel.writeInt(this.showSellPrefix ? 1 : 0);
    }

    public HistoryOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @DrawableRes Integer num, @ColorInt Integer num2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.time = str;
        this.buyPrice = str2;
        this.buyCount = str3;
        this.sellPrice = str4;
        this.sellCount = str5;
        this.buyCountTitle = str6;
        this.sellCountTitle = str7;
        this.tagIconDrawableId = num;
        this.iconTintColor = num2;
        this.showBuyPrefix = z;
        this.showSellPrefix = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r20v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, boolean):void (m)] (LINE:19) call: com.okinc.kline.data.HistoryOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, boolean):void type: THIS */
    public /* synthetic */ HistoryOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : num, (i & 256) == 0 ? num2 : null, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false);
    }
}
