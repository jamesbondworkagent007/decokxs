package com.okinc.unify_trade.bot.market_place.userpage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadUserOrderHistoryContentShowData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderHistoryContentShowData> CREATOR = new Creator();
    private String content;
    private Integer contentColor;
    private int textStyle;
    private String title;

    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderHistoryContentShowData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryContentShowData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadUserOrderHistoryContentShowData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistoryContentShowData[] newArray(int i) {
            return new BotLeadUserOrderHistoryContentShowData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderHistoryContentShowData() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeadUserOrderHistoryContentShowData copy$default(BotLeadUserOrderHistoryContentShowData botLeadUserOrderHistoryContentShowData, String str, String str2, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = botLeadUserOrderHistoryContentShowData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = botLeadUserOrderHistoryContentShowData.content;
        }
        if ((i2 & 4) != 0) {
            i = botLeadUserOrderHistoryContentShowData.textStyle;
        }
        if ((i2 & 8) != 0) {
            num = botLeadUserOrderHistoryContentShowData.contentColor;
        }
        return botLeadUserOrderHistoryContentShowData.copy(str, str2, i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.textStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.contentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistoryContentShowData copy(String str, String str2, int i, Integer num) {
        return new BotLeadUserOrderHistoryContentShowData(str, str2, i, num);
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
        if (!(obj instanceof BotLeadUserOrderHistoryContentShowData)) {
            return false;
        }
        BotLeadUserOrderHistoryContentShowData botLeadUserOrderHistoryContentShowData = (BotLeadUserOrderHistoryContentShowData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botLeadUserOrderHistoryContentShowData.title) && Intrinsics.EZpvd((Object) this.content, (Object) botLeadUserOrderHistoryContentShowData.content) && this.textStyle == botLeadUserOrderHistoryContentShowData.textStyle && Intrinsics.EZpvd(this.contentColor, botLeadUserOrderHistoryContentShowData.contentColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getContentColor() {
        return this.contentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextStyle() {
        return this.textStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Integer.hashCode(this.textStyle);
        Integer num = this.contentColor;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentColor(Integer num) {
        this.contentColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextStyle(int i) {
        this.textStyle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderHistoryContentShowData(title=" + this.title + ", content=" + this.content + ", textStyle=" + this.textStyle + ", contentColor=" + this.contentColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeInt(this.textStyle);
        Integer num = this.contentColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BotLeadUserOrderHistoryContentShowData(String str, String str2, int i, Integer num) {
        this.title = str;
        this.content = str2;
        this.textStyle = i;
        this.contentColor = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.Integer):void (m)] (LINE:25) call: com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryContentShowData.<init>(java.lang.String, java.lang.String, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ BotLeadUserOrderHistoryContentShowData(String str, String str2, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : num);
    }
}
