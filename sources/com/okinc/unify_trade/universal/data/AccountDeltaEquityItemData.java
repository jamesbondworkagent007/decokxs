package com.okinc.unify_trade.universal.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountDeltaEquityItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountDeltaEquityItemData> CREATOR = new Creator();
    private boolean isShowUnderLine;
    private String level;
    private String text;
    private int textColor;
    private String textTipType;
    private final String title;
    private String titleTipType;

    public static final class Creator implements Parcelable.Creator<AccountDeltaEquityItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDeltaEquityItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountDeltaEquityItemData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDeltaEquityItemData[] newArray(int i) {
            return new AccountDeltaEquityItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountDeltaEquityItemData copy$default(AccountDeltaEquityItemData accountDeltaEquityItemData, String str, String str2, boolean z, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountDeltaEquityItemData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = accountDeltaEquityItemData.text;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            z = accountDeltaEquityItemData.isShowUnderLine;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str3 = accountDeltaEquityItemData.titleTipType;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            i = accountDeltaEquityItemData.textColor;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = accountDeltaEquityItemData.level;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            str5 = accountDeltaEquityItemData.textTipType;
        }
        return accountDeltaEquityItemData.copy(str, str6, z2, str7, i3, str8, str5);
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
    public final boolean component3() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.titleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.textTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountDeltaEquityItemData copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AccountDeltaEquityItemData(str, str2, z, str3, i, str4, str5);
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
        if (!(obj instanceof AccountDeltaEquityItemData)) {
            return false;
        }
        AccountDeltaEquityItemData accountDeltaEquityItemData = (AccountDeltaEquityItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) accountDeltaEquityItemData.title) && Intrinsics.EZpvd((Object) this.text, (Object) accountDeltaEquityItemData.text) && this.isShowUnderLine == accountDeltaEquityItemData.isShowUnderLine && Intrinsics.EZpvd((Object) this.titleTipType, (Object) accountDeltaEquityItemData.titleTipType) && this.textColor == accountDeltaEquityItemData.textColor && Intrinsics.EZpvd((Object) this.level, (Object) accountDeltaEquityItemData.level) && Intrinsics.EZpvd((Object) this.textTipType, (Object) accountDeltaEquityItemData.textTipType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
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
    public final String getTextTipType() {
        return this.textTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitleTipType() {
        return this.titleTipType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.isShowUnderLine)) * 31) + this.titleTipType.hashCode()) * 31) + Integer.hashCode(this.textColor)) * 31) + this.level.hashCode()) * 31) + this.textTipType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowUnderLine() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.level = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnderLine(boolean z) {
        this.isShowUnderLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextColor(int i) {
        this.textColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextTipType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.textTipType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleTipType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.titleTipType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountDeltaEquityItemData(title=" + this.title + ", text=" + this.text + ", isShowUnderLine=" + this.isShowUnderLine + ", titleTipType=" + this.titleTipType + ", textColor=" + this.textColor + ", level=" + this.level + ", textTipType=" + this.textTipType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeInt(this.isShowUnderLine ? 1 : 0);
        parcel.writeString(this.titleTipType);
        parcel.writeInt(this.textColor);
        parcel.writeString(this.level);
        parcel.writeString(this.textTipType);
    }

    public AccountDeltaEquityItemData(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.text = str2;
        this.isShowUnderLine = z;
        this.titleTipType = str3;
        this.textColor = i;
        this.level = str4;
        this.textTipType = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r15v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r12v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:37) call: com.okinc.unify_trade.universal.data.AccountDeltaEquityItemData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountDeltaEquityItemData(String str, String str2, boolean z, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? "" : str4, (i2 & 64) == 0 ? str5 : "");
    }
}
