package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SimpleTpslInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SimpleTpslInfo> CREATOR = new Creator();
    private final String bboType;
    private final String ccy;
    private final String instId;
    private final String instType;
    private final String lever;
    private final String orderPx;
    private final String orderType;
    private final String px;
    private final String side;
    private final String sz;
    private final String tdMode;
    private final String tpslSpotAmount;
    private final String triggerPx;

    public static final class Creator implements Parcelable.Creator<SimpleTpslInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleTpslInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleTpslInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleTpslInfo[] newArray(int i) {
            return new SimpleTpslInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpslSpotAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleTpslInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, @NotNull String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new SimpleTpslInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof SimpleTpslInfo)) {
            return false;
        }
        SimpleTpslInfo simpleTpslInfo = (SimpleTpslInfo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) simpleTpslInfo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) simpleTpslInfo.instType) && Intrinsics.EZpvd((Object) this.lever, (Object) simpleTpslInfo.lever) && Intrinsics.EZpvd((Object) this.orderType, (Object) simpleTpslInfo.orderType) && Intrinsics.EZpvd((Object) this.side, (Object) simpleTpslInfo.side) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) simpleTpslInfo.triggerPx) && Intrinsics.EZpvd((Object) this.orderPx, (Object) simpleTpslInfo.orderPx) && Intrinsics.EZpvd((Object) this.bboType, (Object) simpleTpslInfo.bboType) && Intrinsics.EZpvd((Object) this.px, (Object) simpleTpslInfo.px) && Intrinsics.EZpvd((Object) this.sz, (Object) simpleTpslInfo.sz) && Intrinsics.EZpvd((Object) this.tpslSpotAmount, (Object) simpleTpslInfo.tpslSpotAmount) && Intrinsics.EZpvd((Object) this.ccy, (Object) simpleTpslInfo.ccy) && Intrinsics.EZpvd((Object) this.tdMode, (Object) simpleTpslInfo.tdMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBboType() {
        return this.bboType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderPx() {
        return this.orderPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpslSpotAmount() {
        return this.tpslSpotAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.instType.hashCode();
        int iHashCode3 = this.lever.hashCode();
        int iHashCode4 = this.orderType.hashCode();
        int iHashCode5 = this.side.hashCode();
        String str = this.triggerPx;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.orderPx;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bboType;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.px;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        int iHashCode10 = this.sz.hashCode();
        String str5 = this.tpslSpotAmount;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.ccy;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tdMode;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleTpslInfo(instId=" + this.instId + ", instType=" + this.instType + ", lever=" + this.lever + ", orderType=" + this.orderType + ", side=" + this.side + ", triggerPx=" + this.triggerPx + ", orderPx=" + this.orderPx + ", bboType=" + this.bboType + ", px=" + this.px + ", sz=" + this.sz + ", tpslSpotAmount=" + this.tpslSpotAmount + ", ccy=" + this.ccy + ", tdMode=" + this.tdMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.lever);
        parcel.writeString(this.orderType);
        parcel.writeString(this.side);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.orderPx);
        parcel.writeString(this.bboType);
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
        parcel.writeString(this.tpslSpotAmount);
        parcel.writeString(this.ccy);
        parcel.writeString(this.tdMode);
    }

    public SimpleTpslInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, String str9, @NotNull String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.instId = str;
        this.instType = str2;
        this.lever = str3;
        this.orderType = str4;
        this.side = str5;
        this.triggerPx = str6;
        this.orderPx = str7;
        this.bboType = str8;
        this.px = str9;
        this.sz = str10;
        this.tpslSpotAmount = str11;
        this.ccy = str12;
        this.tdMode = str13;
    }
}
