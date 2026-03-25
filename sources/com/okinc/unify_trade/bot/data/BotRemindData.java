package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotRemindData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotRemindData> CREATOR = new Creator();
    private final String reminderMsg;
    private final int textColor;
    private final int textSize;
    private final String title;

    public static final class Creator implements Parcelable.Creator<BotRemindData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRemindData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotRemindData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotRemindData[] newArray(int i) {
            return new BotRemindData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotRemindData() {
        this(null, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotRemindData copy$default(BotRemindData botRemindData, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = botRemindData.title;
        }
        if ((i3 & 2) != 0) {
            i = botRemindData.textSize;
        }
        if ((i3 & 4) != 0) {
            i2 = botRemindData.textColor;
        }
        if ((i3 & 8) != 0) {
            str2 = botRemindData.reminderMsg;
        }
        return botRemindData.copy(str, i, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.textSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.reminderMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotRemindData copy(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BotRemindData(str, i, i2, str2);
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
        if (!(obj instanceof BotRemindData)) {
            return false;
        }
        BotRemindData botRemindData = (BotRemindData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botRemindData.title) && this.textSize == botRemindData.textSize && this.textColor == botRemindData.textColor && Intrinsics.EZpvd((Object) this.reminderMsg, (Object) botRemindData.reminderMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderMsg() {
        return this.reminderMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextSize() {
        return this.textSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.title.hashCode() * 31) + Integer.hashCode(this.textSize)) * 31) + Integer.hashCode(this.textColor)) * 31) + this.reminderMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotRemindData(title=" + this.title + ", textSize=" + this.textSize + ", textColor=" + this.textColor + ", reminderMsg=" + this.reminderMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeString(this.reminderMsg);
    }

    public BotRemindData(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.textSize = i;
        this.textColor = i2;
        this.reminderMsg = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000b: SGET  A[WRAPPED] o.mPz.Dialog.fIwbmz int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String):void (m)] (LINE:1324) call: com.okinc.unify_trade.bot.data.BotRemindData.<init>(java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ BotRemindData(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? C32113mPz.Dialog.fIwbmz : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
    }
}
