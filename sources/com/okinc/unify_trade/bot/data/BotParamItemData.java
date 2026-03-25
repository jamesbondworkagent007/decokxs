package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotParamItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotParamItemData> CREATOR = new Creator();
    private String doubtMsg;
    private boolean isBeFiltered;
    private boolean isHeadLine;
    private String rightDoubtMsg;
    private String rightImage;
    private Integer rightImageBg;
    private Integer rightImageRes;
    private boolean showAvatar;
    private final String text;
    private final int textColor;
    private final int textStyle;
    private final String title;
    private final int titleTextColor;
    private final int titleTextStyle;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotParamItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotParamItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamItemData[] newArray(int i) {
            return new BotParamItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotParamItemData() {
        this(null, null, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.showAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.titleTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.titleTextStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.textStyle;
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
    public final String component4() {
        return this.rightDoubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isHeadLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isBeFiltered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rightImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.rightImageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.rightImageBg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotParamItemData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, Integer num, Integer num2, boolean z3, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BotParamItemData(str, str2, str3, str4, z, z2, str5, num, num2, z3, i, i2, i3, i4);
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
        if (!(obj instanceof BotParamItemData)) {
            return false;
        }
        BotParamItemData botParamItemData = (BotParamItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botParamItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) botParamItemData.text) && Intrinsics.EZpvd((Object) this.doubtMsg, (Object) botParamItemData.doubtMsg) && Intrinsics.EZpvd((Object) this.rightDoubtMsg, (Object) botParamItemData.rightDoubtMsg) && this.isHeadLine == botParamItemData.isHeadLine && this.isBeFiltered == botParamItemData.isBeFiltered && Intrinsics.EZpvd((Object) this.rightImage, (Object) botParamItemData.rightImage) && Intrinsics.EZpvd(this.rightImageRes, botParamItemData.rightImageRes) && Intrinsics.EZpvd(this.rightImageBg, botParamItemData.rightImageBg) && this.showAvatar == botParamItemData.showAvatar && this.titleTextColor == botParamItemData.titleTextColor && this.textColor == botParamItemData.textColor && this.titleTextStyle == botParamItemData.titleTextStyle && this.textStyle == botParamItemData.textStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDoubtMsg() {
        return this.doubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightDoubtMsg() {
        return this.rightDoubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightImage() {
        return this.rightImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRightImageBg() {
        return this.rightImageBg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRightImageRes() {
        return this.rightImageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextColor() {
        return this.textColor;
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
    public final int getTitleTextColor() {
        return this.titleTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = this.doubtMsg.hashCode();
        int iHashCode4 = this.rightDoubtMsg.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isHeadLine);
        int iHashCode6 = Boolean.hashCode(this.isBeFiltered);
        int iHashCode7 = this.rightImage.hashCode();
        Integer num = this.rightImageRes;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.rightImageBg;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showAvatar)) * 31) + Integer.hashCode(this.titleTextColor)) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.titleTextStyle)) * 31) + Integer.hashCode(this.textStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBeFiltered() {
        return this.isBeFiltered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHeadLine() {
        return this.isHeadLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBeFiltered(boolean z) {
        this.isBeFiltered = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDoubtMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.doubtMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeadLine(boolean z) {
        this.isHeadLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightDoubtMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightDoubtMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rightImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightImageBg(Integer num) {
        this.rightImageBg = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightImageRes(Integer num) {
        this.rightImageRes = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAvatar(boolean z) {
        this.showAvatar = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotParamItemData(title=" + this.title + ", text=" + this.text + ", doubtMsg=" + this.doubtMsg + ", rightDoubtMsg=" + this.rightDoubtMsg + ", isHeadLine=" + this.isHeadLine + ", isBeFiltered=" + this.isBeFiltered + ", rightImage=" + this.rightImage + ", rightImageRes=" + this.rightImageRes + ", rightImageBg=" + this.rightImageBg + ", showAvatar=" + this.showAvatar + ", titleTextColor=" + this.titleTextColor + ", textColor=" + this.textColor + ", titleTextStyle=" + this.titleTextStyle + ", textStyle=" + this.textStyle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.doubtMsg);
        parcel.writeString(this.rightDoubtMsg);
        parcel.writeInt(this.isHeadLine ? 1 : 0);
        parcel.writeInt(this.isBeFiltered ? 1 : 0);
        parcel.writeString(this.rightImage);
        Integer num = this.rightImageRes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.rightImageBg;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.showAvatar ? 1 : 0);
        parcel.writeInt(this.titleTextColor);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.titleTextStyle);
        parcel.writeInt(this.textStyle);
    }

    public BotParamItemData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, Integer num, Integer num2, boolean z3, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.text = str2;
        this.doubtMsg = str3;
        this.rightDoubtMsg = str4;
        this.isHeadLine = z;
        this.isBeFiltered = z2;
        this.rightImage = str5;
        this.rightImageRes = num;
        this.rightImageBg = num2;
        this.showAvatar = z3;
        this.titleTextColor = i;
        this.textColor = i2;
        this.titleTextStyle = i3;
        this.textStyle = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0096: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0045: ARITH (r30v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: INVOKE (wrap:int:0x0060: SGET  A[WRAPPED] o.mPz.ActionBar.zLjUOn int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:584)) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0069: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0071: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int, int, int, int):void (m)] (LINE:572) call: com.okinc.unify_trade.bot.data.BotParamItemData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, int, int, int, int):void type: THIS */
    public /* synthetic */ BotParamItemData(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, Integer num, Integer num2, boolean z3, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z2, (i5 & 64) == 0 ? str5 : "", (i5 & 128) != 0 ? null : num, (i5 & 256) == 0 ? num2 : null, (i5 & 512) != 0 ? false : z3, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn) : i2, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) == 0 ? i4 : 0);
    }
}
