package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsInsideItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TacticsInsideItemData> CREATOR = new Creator();
    private String doubtMsg;
    private String doubtTitle;
    private final String itemType;
    private String ivDrawableType;
    private final String nextLineText;
    private String orderType;
    private final String rightImageUrl;
    private Integer rightTextColor;
    private TacticsUiConst.BotListSubItemType subItemType;
    private final List<TacticsListLabelUiData> tags;
    private String text;
    private int textStyle;
    private String title;
    private int titleStyle;
    private int tvColor;
    private int tvColorSecond;
    private int tvSplitIndex;

    public static final class Creator implements Parcelable.Creator<TacticsInsideItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsInsideItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            String string4 = parcel.readString();
            TacticsUiConst.BotListSubItemType botListSubItemType = (TacticsUiConst.BotListSubItemType) parcel.readParcelable(TacticsInsideItemData.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList.add(parcel.readParcelable(TacticsInsideItemData.class.getClassLoader()));
                i7++;
                i6 = i6;
            }
            return new TacticsInsideItemData(string, string2, string3, i, i2, i3, i4, i5, string4, botListSubItemType, numValueOf, string5, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsInsideItemData[] newArray(int i) {
            return new TacticsInsideItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsInsideItemData() {
        this(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsUiConst.BotListSubItemType component10() {
        return this.subItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.rightTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.doubtTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TacticsListLabelUiData> component13() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.nextLineText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.itemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.rightImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.doubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.tvColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tvColorSecond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.tvSplitIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.textStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ivDrawableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsInsideItemData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, int i4, int i5, @NotNull String str4, @NotNull TacticsUiConst.BotListSubItemType botListSubItemType, Integer num, String str5, @NotNull List<? extends TacticsListLabelUiData> list, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(botListSubItemType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new TacticsInsideItemData(str, str2, str3, i, i2, i3, i4, i5, str4, botListSubItemType, num, str5, list, str6, str7, str8, str9);
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
        if (!(obj instanceof TacticsInsideItemData)) {
            return false;
        }
        TacticsInsideItemData tacticsInsideItemData = (TacticsInsideItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) tacticsInsideItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) tacticsInsideItemData.text) && Intrinsics.EZpvd((Object) this.doubtMsg, (Object) tacticsInsideItemData.doubtMsg) && this.tvColor == tacticsInsideItemData.tvColor && this.tvColorSecond == tacticsInsideItemData.tvColorSecond && this.tvSplitIndex == tacticsInsideItemData.tvSplitIndex && this.titleStyle == tacticsInsideItemData.titleStyle && this.textStyle == tacticsInsideItemData.textStyle && Intrinsics.EZpvd((Object) this.ivDrawableType, (Object) tacticsInsideItemData.ivDrawableType) && Intrinsics.EZpvd(this.subItemType, tacticsInsideItemData.subItemType) && Intrinsics.EZpvd(this.rightTextColor, tacticsInsideItemData.rightTextColor) && Intrinsics.EZpvd((Object) this.doubtTitle, (Object) tacticsInsideItemData.doubtTitle) && Intrinsics.EZpvd(this.tags, tacticsInsideItemData.tags) && Intrinsics.EZpvd((Object) this.orderType, (Object) tacticsInsideItemData.orderType) && Intrinsics.EZpvd((Object) this.nextLineText, (Object) tacticsInsideItemData.nextLineText) && Intrinsics.EZpvd((Object) this.itemType, (Object) tacticsInsideItemData.itemType) && Intrinsics.EZpvd((Object) this.rightImageUrl, (Object) tacticsInsideItemData.rightImageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDoubtMsg() {
        return this.doubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDoubtTitle() {
        return this.doubtTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getItemType() {
        return this.itemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIvDrawableType() {
        return this.ivDrawableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextLineText() {
        return this.nextLineText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightImageUrl() {
        return this.rightImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRightTextColor() {
        return this.rightTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsUiConst.BotListSubItemType getSubItemType() {
        return this.subItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TacticsListLabelUiData> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
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
    public final int getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTvColor() {
        return this.tvColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTvColorSecond() {
        return this.tvColorSecond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTvSplitIndex() {
        return this.tvSplitIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = this.doubtMsg.hashCode();
        int iHashCode4 = Integer.hashCode(this.tvColor);
        int iHashCode5 = Integer.hashCode(this.tvColorSecond);
        int iHashCode6 = Integer.hashCode(this.tvSplitIndex);
        int iHashCode7 = Integer.hashCode(this.titleStyle);
        int iHashCode8 = Integer.hashCode(this.textStyle);
        int iHashCode9 = this.ivDrawableType.hashCode();
        int iHashCode10 = this.subItemType.hashCode();
        Integer num = this.rightTextColor;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        String str = this.doubtTitle;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        int iHashCode13 = this.tags.hashCode();
        int iHashCode14 = this.orderType.hashCode();
        String str2 = this.nextLineText;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.itemType.hashCode()) * 31) + this.rightImageUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDoubtMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.doubtMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDoubtTitle(String str) {
        this.doubtTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIvDrawableType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ivDrawableType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightTextColor(Integer num) {
        this.rightTextColor = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubItemType(@NotNull TacticsUiConst.BotListSubItemType botListSubItemType) {
        Intrinsics.checkNotNullParameter(botListSubItemType, "");
        this.subItemType = botListSubItemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextStyle(int i) {
        this.textStyle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleStyle(int i) {
        this.titleStyle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvColor(int i) {
        this.tvColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvColorSecond(int i) {
        this.tvColorSecond = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvSplitIndex(int i) {
        this.tvSplitIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsInsideItemData(title=" + this.title + ", text=" + this.text + ", doubtMsg=" + this.doubtMsg + ", tvColor=" + this.tvColor + ", tvColorSecond=" + this.tvColorSecond + ", tvSplitIndex=" + this.tvSplitIndex + ", titleStyle=" + this.titleStyle + ", textStyle=" + this.textStyle + ", ivDrawableType=" + this.ivDrawableType + ", subItemType=" + this.subItemType + ", rightTextColor=" + this.rightTextColor + ", doubtTitle=" + this.doubtTitle + ", tags=" + this.tags + ", orderType=" + this.orderType + ", nextLineText=" + this.nextLineText + ", itemType=" + this.itemType + ", rightImageUrl=" + this.rightImageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.doubtMsg);
        parcel.writeInt(this.tvColor);
        parcel.writeInt(this.tvColorSecond);
        parcel.writeInt(this.tvSplitIndex);
        parcel.writeInt(this.titleStyle);
        parcel.writeInt(this.textStyle);
        parcel.writeString(this.ivDrawableType);
        parcel.writeParcelable(this.subItemType, i);
        Integer num = this.rightTextColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.doubtTitle);
        List<TacticsListLabelUiData> list = this.tags;
        parcel.writeInt(list.size());
        Iterator<TacticsListLabelUiData> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.orderType);
        parcel.writeString(this.nextLineText);
        parcel.writeString(this.itemType);
        parcel.writeString(this.rightImageUrl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: java.util.List<? extends com.okinc.unify_trade.bot.data.TacticsListLabelUiData> */
    /* JADX WARN: Multi-variable type inference failed */
    public TacticsInsideItemData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, int i4, int i5, @NotNull String str4, @NotNull TacticsUiConst.BotListSubItemType botListSubItemType, Integer num, String str5, @NotNull List<? extends TacticsListLabelUiData> list, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(botListSubItemType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.title = str;
        this.text = str2;
        this.doubtMsg = str3;
        this.tvColor = i;
        this.tvColorSecond = i2;
        this.tvSplitIndex = i3;
        this.titleStyle = i4;
        this.textStyle = i5;
        this.ivDrawableType = str4;
        this.subItemType = botListSubItemType;
        this.rightTextColor = num;
        this.doubtTitle = str5;
        this.tags = list;
        this.orderType = str6;
        this.nextLineText = str7;
        this.itemType = str8;
        this.rightImageUrl = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r36v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r26v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: SGET  A[WRAPPED] (LINE:454) com.okinc.unify_trade.bot.constant.TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType$BotSubNormal) : (r28v0 com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0065: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0069: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:457)) : (r31v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("bot_inside_two") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, java.lang.Integer, java.lang.String, java.util.List<? extends com.okinc.unify_trade.bot.data.TacticsListLabelUiData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:444) call: com.okinc.unify_trade.bot.data.TacticsInsideItemData.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, com.okinc.unify_trade.bot.constant.TacticsUiConst$BotListSubItemType, java.lang.Integer, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsInsideItemData(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, String str4, TacticsUiConst.BotListSubItemType botListSubItemType, Integer num, String str5, List list, String str6, String str7, String str8, String str9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? -1 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) == 0 ? i5 : 0, (i6 & 256) != 0 ? "" : str4, (i6 & 512) != 0 ? TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl : botListSubItemType, (i6 & 1024) != 0 ? null : num, (i6 & 2048) != 0 ? null : str5, (i6 & 4096) != 0 ? yDY.AhwBna() : list, (i6 & 8192) != 0 ? "" : str6, (i6 & 16384) != 0 ? null : str7, (i6 & 32768) != 0 ? "bot_inside_two" : str8, (i6 & 65536) != 0 ? "" : str9);
    }
}
