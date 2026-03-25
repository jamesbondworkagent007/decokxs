package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TwapModifyBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TwapModifyBean> CREATOR = new Creator();
    private final String limitPrice;
    private final String orderCtVal;
    private final String orderSz;
    private final String spread;
    private final String timeInterval;

    public static final class Creator implements Parcelable.Creator<TwapModifyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapModifyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TwapModifyBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapModifyBean[] newArray(int i) {
            return new TwapModifyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwapModifyBean copy$default(TwapModifyBean twapModifyBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twapModifyBean.spread;
        }
        if ((i & 2) != 0) {
            str2 = twapModifyBean.limitPrice;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = twapModifyBean.timeInterval;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = twapModifyBean.orderCtVal;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = twapModifyBean.orderSz;
        }
        return twapModifyBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.limitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderCtVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwapModifyBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TwapModifyBean(str, str2, str3, str4, str5);
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
        if (!(obj instanceof TwapModifyBean)) {
            return false;
        }
        TwapModifyBean twapModifyBean = (TwapModifyBean) obj;
        return Intrinsics.EZpvd((Object) this.spread, (Object) twapModifyBean.spread) && Intrinsics.EZpvd((Object) this.limitPrice, (Object) twapModifyBean.limitPrice) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) twapModifyBean.timeInterval) && Intrinsics.EZpvd((Object) this.orderCtVal, (Object) twapModifyBean.orderCtVal) && Intrinsics.EZpvd((Object) this.orderSz, (Object) twapModifyBean.orderSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitPrice() {
        return this.limitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderCtVal() {
        return this.orderCtVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSz() {
        return this.orderSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpread() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.spread.hashCode() * 31) + this.limitPrice.hashCode()) * 31) + this.timeInterval.hashCode()) * 31) + this.orderCtVal.hashCode()) * 31) + this.orderSz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwapModifyBean(spread=" + this.spread + ", limitPrice=" + this.limitPrice + ", timeInterval=" + this.timeInterval + ", orderCtVal=" + this.orderCtVal + ", orderSz=" + this.orderSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.spread);
        parcel.writeString(this.limitPrice);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.orderCtVal);
        parcel.writeString(this.orderSz);
    }

    public TwapModifyBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.spread = str;
        this.limitPrice = str2;
        this.timeInterval = str3;
        this.orderCtVal = str4;
        this.orderSz = str5;
    }
}
