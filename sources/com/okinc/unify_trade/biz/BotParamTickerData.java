package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotParamTickerData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotParamTickerData> CREATOR = new Creator();
    private final int bottomPadding;
    private String doubtMsg;
    private final String instId;
    private final String instType;
    private boolean isNeedColorChange;
    private final String title;
    private final int topPadding;

    public static final class Creator implements Parcelable.Creator<BotParamTickerData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamTickerData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotParamTickerData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotParamTickerData[] newArray(int i) {
            return new BotParamTickerData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotParamTickerData() {
        this(null, null, null, null, false, 0, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotParamTickerData copy$default(BotParamTickerData botParamTickerData, String str, String str2, String str3, String str4, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = botParamTickerData.title;
        }
        if ((i3 & 2) != 0) {
            str2 = botParamTickerData.instId;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = botParamTickerData.instType;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            str4 = botParamTickerData.doubtMsg;
        }
        String str7 = str4;
        if ((i3 & 16) != 0) {
            z = botParamTickerData.isNeedColorChange;
        }
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            i = botParamTickerData.topPadding;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = botParamTickerData.bottomPadding;
        }
        return botParamTickerData.copy(str, str5, str6, str7, z2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.doubtMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isNeedColorChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.topPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.bottomPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotParamTickerData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BotParamTickerData(str, str2, str3, str4, z, i, i2);
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
        if (!(obj instanceof BotParamTickerData)) {
            return false;
        }
        BotParamTickerData botParamTickerData = (BotParamTickerData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) botParamTickerData.title) && Intrinsics.EZpvd((Object) this.instId, (Object) botParamTickerData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botParamTickerData.instType) && Intrinsics.EZpvd((Object) this.doubtMsg, (Object) botParamTickerData.doubtMsg) && this.isNeedColorChange == botParamTickerData.isNeedColorChange && this.topPadding == botParamTickerData.topPadding && this.bottomPadding == botParamTickerData.bottomPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDoubtMsg() {
        return this.doubtMsg;
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
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopPadding() {
        return this.topPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.doubtMsg.hashCode()) * 31) + Boolean.hashCode(this.isNeedColorChange)) * 31) + Integer.hashCode(this.topPadding)) * 31) + Integer.hashCode(this.bottomPadding);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedColorChange() {
        return this.isNeedColorChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDoubtMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.doubtMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedColorChange(boolean z) {
        this.isNeedColorChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotParamTickerData(title=" + this.title + ", instId=" + this.instId + ", instType=" + this.instType + ", doubtMsg=" + this.doubtMsg + ", isNeedColorChange=" + this.isNeedColorChange + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.doubtMsg);
        parcel.writeInt(this.isNeedColorChange ? 1 : 0);
        parcel.writeInt(this.topPadding);
        parcel.writeInt(this.bottomPadding);
    }

    public BotParamTickerData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.instId = str2;
        this.instType = str3;
        this.doubtMsg = str4;
        this.isNeedColorChange = z;
        this.topPadding = i;
        this.bottomPadding = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, int):void (m)] (LINE:1144) call: com.okinc.unify_trade.biz.BotParamTickerData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, int):void type: THIS */
    public /* synthetic */ BotParamTickerData(String str, String str2, String str3, String str4, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) == 0 ? str4 : "", (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
