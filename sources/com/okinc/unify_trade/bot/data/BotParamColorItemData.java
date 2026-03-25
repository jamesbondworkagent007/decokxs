package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotParamColorItemData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotParamColorItemData> CREATOR = new Creator();
    private final String leftDoubtMsg;
    private final String leftDoubtTitle;
    private final int rightBgColor;
    private final int rightTextColor;
    private final float rightTextSize;
    private final int rightTextStyle;
    private final String text;
    private final String title;

    public static final class Creator implements Parcelable.Creator<BotParamColorItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamColorItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotParamColorItemData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamColorItemData[] newArray(int i) {
            return new BotParamColorItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotParamColorItemData() {
        this(null, null, 0, 0, 0.0f, 0, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.rightTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.rightBgColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component5() {
        return this.rightTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.rightTextStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.leftDoubtTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.leftDoubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotParamColorItemData copy(@NotNull String str, @NotNull String str2, int i, int i2, float f, int i3, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BotParamColorItemData(str, str2, i, i2, f, i3, str3, str4);
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
        if (!(obj instanceof BotParamColorItemData)) {
            return false;
        }
        BotParamColorItemData botParamColorItemData = (BotParamColorItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botParamColorItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) botParamColorItemData.text) && this.rightTextColor == botParamColorItemData.rightTextColor && this.rightBgColor == botParamColorItemData.rightBgColor && Float.compare(this.rightTextSize, botParamColorItemData.rightTextSize) == 0 && this.rightTextStyle == botParamColorItemData.rightTextStyle && Intrinsics.EZpvd((Object) this.leftDoubtTitle, (Object) botParamColorItemData.leftDoubtTitle) && Intrinsics.EZpvd((Object) this.leftDoubtMsg, (Object) botParamColorItemData.leftDoubtMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftDoubtMsg() {
        return this.leftDoubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftDoubtTitle() {
        return this.leftDoubtTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRightBgColor() {
        return this.rightBgColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRightTextColor() {
        return this.rightTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getRightTextSize() {
        return this.rightTextSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRightTextStyle() {
        return this.rightTextStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = Integer.hashCode(this.rightTextColor);
        int iHashCode4 = Integer.hashCode(this.rightBgColor);
        int iHashCode5 = Float.hashCode(this.rightTextSize);
        int iHashCode6 = Integer.hashCode(this.rightTextStyle);
        String str = this.leftDoubtTitle;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.leftDoubtMsg;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotParamColorItemData(title=" + this.title + ", text=" + this.text + ", rightTextColor=" + this.rightTextColor + ", rightBgColor=" + this.rightBgColor + ", rightTextSize=" + this.rightTextSize + ", rightTextStyle=" + this.rightTextStyle + ", leftDoubtTitle=" + this.leftDoubtTitle + ", leftDoubtMsg=" + this.leftDoubtMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeInt(this.rightTextColor);
        parcel.writeInt(this.rightBgColor);
        parcel.writeFloat(this.rightTextSize);
        parcel.writeInt(this.rightTextStyle);
        parcel.writeString(this.leftDoubtTitle);
        parcel.writeString(this.leftDoubtMsg);
    }

    public BotParamColorItemData(@NotNull String str, @NotNull String str2, int i, int i2, float f, int i3, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.text = str2;
        this.rightTextColor = i;
        this.rightBgColor = i2;
        this.rightTextSize = f;
        this.rightTextStyle = i3;
        this.leftDoubtTitle = str3;
        this.leftDoubtMsg = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r14v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, float, int, java.lang.String, java.lang.String):void (m)] (LINE:558) call: com.okinc.unify_trade.bot.data.BotParamColorItemData.<init>(java.lang.String, java.lang.String, int, int, float, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotParamColorItemData(String str, String str2, int i, int i2, float f, int i3, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) == 0 ? str2 : "", (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.0f : f, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? null : str3, (i4 & 128) == 0 ? str4 : null);
    }
}
