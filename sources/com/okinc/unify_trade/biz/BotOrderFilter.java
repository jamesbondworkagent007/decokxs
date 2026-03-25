package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderFilter implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotOrderFilter> CREATOR = new Creator();
    private String botType;
    private String endTime;
    private String instId;
    private String instType;
    private String sortType;
    private String startTime;
    private BotSectorUnderlyingListBean underlyingListBean;

    public static final class Creator implements Parcelable.Creator<BotOrderFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotOrderFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotOrderFilter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BotSectorUnderlyingListBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotOrderFilter[] newArray(int i) {
            return new BotOrderFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotOrderFilter() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotOrderFilter copy$default(BotOrderFilter botOrderFilter, String str, String str2, String str3, String str4, String str5, String str6, BotSectorUnderlyingListBean botSectorUnderlyingListBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botOrderFilter.botType;
        }
        if ((i & 2) != 0) {
            str2 = botOrderFilter.sortType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = botOrderFilter.instId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = botOrderFilter.instType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = botOrderFilter.startTime;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = botOrderFilter.endTime;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            botSectorUnderlyingListBean = botOrderFilter.underlyingListBean;
        }
        return botOrderFilter.copy(str, str7, str8, str9, str10, str11, botSectorUnderlyingListBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotSectorUnderlyingListBean component7() {
        return this.underlyingListBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderFilter copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, BotSectorUnderlyingListBean botSectorUnderlyingListBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BotOrderFilter(str, str2, str3, str4, str5, str6, botSectorUnderlyingListBean);
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
        if (!(obj instanceof BotOrderFilter)) {
            return false;
        }
        BotOrderFilter botOrderFilter = (BotOrderFilter) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botOrderFilter.botType) && Intrinsics.EZpvd((Object) this.sortType, (Object) botOrderFilter.sortType) && Intrinsics.EZpvd((Object) this.instId, (Object) botOrderFilter.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botOrderFilter.instType) && Intrinsics.EZpvd((Object) this.startTime, (Object) botOrderFilter.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) botOrderFilter.endTime) && Intrinsics.EZpvd(this.underlyingListBean, botOrderFilter.underlyingListBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
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
    public final String getSortType() {
        return this.sortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotSectorUnderlyingListBean getUnderlyingListBean() {
        return this.underlyingListBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        int iHashCode2 = this.sortType.hashCode();
        String str = this.instId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.instType.hashCode();
        int iHashCode5 = this.startTime.hashCode();
        int iHashCode6 = this.endTime.hashCode();
        BotSectorUnderlyingListBean botSectorUnderlyingListBean = this.underlyingListBean;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (botSectorUnderlyingListBean != null ? botSectorUnderlyingListBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sortType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnderlyingListBean(BotSectorUnderlyingListBean botSectorUnderlyingListBean) {
        this.underlyingListBean = botSectorUnderlyingListBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotOrderFilter(botType=" + this.botType + ", sortType=" + this.sortType + ", instId=" + this.instId + ", instType=" + this.instType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", underlyingListBean=" + this.underlyingListBean + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.botType);
        parcel.writeString(this.sortType);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        BotSectorUnderlyingListBean botSectorUnderlyingListBean = this.underlyingListBean;
        if (botSectorUnderlyingListBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botSectorUnderlyingListBean.writeToParcel(parcel, i);
        }
    }

    public BotOrderFilter(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, BotSectorUnderlyingListBean botSectorUnderlyingListBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.botType = str;
        this.sortType = str2;
        this.instId = str3;
        this.instType = str4;
        this.startTime = str5;
        this.endTime = str6;
        this.underlyingListBean = botSectorUnderlyingListBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("all_bot") : (r6v0 java.lang.String))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("sort_time") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("ANY") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.BotSectorUnderlyingListBean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 com.okinc.unify_trade.biz.BotSectorUnderlyingListBean) : (null com.okinc.unify_trade.biz.BotSectorUnderlyingListBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.BotSectorUnderlyingListBean):void (m)] (LINE:1023) call: com.okinc.unify_trade.biz.BotOrderFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.BotSectorUnderlyingListBean):void type: THIS */
    public /* synthetic */ BotOrderFilter(String str, String str2, String str3, String str4, String str5, String str6, BotSectorUnderlyingListBean botSectorUnderlyingListBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "all_bot" : str, (i & 2) != 0 ? "sort_time" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "ANY" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? botSectorUnderlyingListBean : null);
    }
}
