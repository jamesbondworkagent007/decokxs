package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOngoingParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotOngoingParams> CREATOR = new Creator();
    private final String botType;
    private final Integer firstItemTopPaddingDp;
    private final boolean isAlternateBackgroundColor;
    private final boolean isBotOnGoing;
    private final boolean isEnableRefresh;
    private final boolean isFromCRActivity;
    private final boolean isHistory;
    private final boolean isHome;
    private final boolean isManualMyTradeOngoing;
    private final boolean isMyBot;
    private final boolean isNmp;
    private final boolean isNmpOnGoing;

    public static final class Creator implements Parcelable.Creator<BotOngoingParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotOngoingParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotOngoingParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotOngoingParams[] newArray(int i) {
            return new BotOngoingParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotOngoingParams() {
        this(null, false, false, false, false, false, false, false, false, false, false, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isAlternateBackgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isFromCRActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.firstItemTopPaddingDp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isHome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isMyBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isNmp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isBotOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isEnableRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isNmpOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isManualMyTradeOngoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOngoingParams copy(@NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotOngoingParams(str, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, num);
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
        if (!(obj instanceof BotOngoingParams)) {
            return false;
        }
        BotOngoingParams botOngoingParams = (BotOngoingParams) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botOngoingParams.botType) && this.isHistory == botOngoingParams.isHistory && this.isHome == botOngoingParams.isHome && this.isMyBot == botOngoingParams.isMyBot && this.isNmp == botOngoingParams.isNmp && this.isBotOnGoing == botOngoingParams.isBotOnGoing && this.isEnableRefresh == botOngoingParams.isEnableRefresh && this.isNmpOnGoing == botOngoingParams.isNmpOnGoing && this.isManualMyTradeOngoing == botOngoingParams.isManualMyTradeOngoing && this.isAlternateBackgroundColor == botOngoingParams.isAlternateBackgroundColor && this.isFromCRActivity == botOngoingParams.isFromCRActivity && Intrinsics.EZpvd(this.firstItemTopPaddingDp, botOngoingParams.firstItemTopPaddingDp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFirstItemTopPaddingDp() {
        return this.firstItemTopPaddingDp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isHistory);
        int iHashCode3 = Boolean.hashCode(this.isHome);
        int iHashCode4 = Boolean.hashCode(this.isMyBot);
        int iHashCode5 = Boolean.hashCode(this.isNmp);
        int iHashCode6 = Boolean.hashCode(this.isBotOnGoing);
        int iHashCode7 = Boolean.hashCode(this.isEnableRefresh);
        int iHashCode8 = Boolean.hashCode(this.isNmpOnGoing);
        int iHashCode9 = Boolean.hashCode(this.isManualMyTradeOngoing);
        int iHashCode10 = Boolean.hashCode(this.isAlternateBackgroundColor);
        int iHashCode11 = Boolean.hashCode(this.isFromCRActivity);
        Integer num = this.firstItemTopPaddingDp;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAlternateBackgroundColor() {
        return this.isAlternateBackgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBotOnGoing() {
        return this.isBotOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableRefresh() {
        return this.isEnableRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromCRActivity() {
        return this.isFromCRActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHome() {
        return this.isHome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isManualMyTradeOngoing() {
        return this.isManualMyTradeOngoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMyBot() {
        return this.isMyBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNmp() {
        return this.isNmp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNmpOnGoing() {
        return this.isNmpOnGoing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotOngoingParams(botType=" + this.botType + ", isHistory=" + this.isHistory + ", isHome=" + this.isHome + ", isMyBot=" + this.isMyBot + ", isNmp=" + this.isNmp + ", isBotOnGoing=" + this.isBotOnGoing + ", isEnableRefresh=" + this.isEnableRefresh + ", isNmpOnGoing=" + this.isNmpOnGoing + ", isManualMyTradeOngoing=" + this.isManualMyTradeOngoing + ", isAlternateBackgroundColor=" + this.isAlternateBackgroundColor + ", isFromCRActivity=" + this.isFromCRActivity + ", firstItemTopPaddingDp=" + this.firstItemTopPaddingDp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.botType);
        parcel.writeInt(this.isHistory ? 1 : 0);
        parcel.writeInt(this.isHome ? 1 : 0);
        parcel.writeInt(this.isMyBot ? 1 : 0);
        parcel.writeInt(this.isNmp ? 1 : 0);
        parcel.writeInt(this.isBotOnGoing ? 1 : 0);
        parcel.writeInt(this.isEnableRefresh ? 1 : 0);
        parcel.writeInt(this.isNmpOnGoing ? 1 : 0);
        parcel.writeInt(this.isManualMyTradeOngoing ? 1 : 0);
        parcel.writeInt(this.isAlternateBackgroundColor ? 1 : 0);
        parcel.writeInt(this.isFromCRActivity ? 1 : 0);
        Integer num = this.firstItemTopPaddingDp;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BotOngoingParams(@NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.botType = str;
        this.isHistory = z;
        this.isHome = z2;
        this.isMyBot = z3;
        this.isNmp = z4;
        this.isBotOnGoing = z5;
        this.isEnableRefresh = z6;
        this.isNmpOnGoing = z7;
        this.isManualMyTradeOngoing = z8;
        this.isAlternateBackgroundColor = z9;
        this.isFromCRActivity = z10;
        this.firstItemTopPaddingDp = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("all_bot") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
 A[MD:(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer):void (m)] (LINE:1156) call: com.okinc.unify_trade.biz.BotOngoingParams.<init>(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ BotOngoingParams(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "all_bot" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? true : z6, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? false : z9, (i & 1024) == 0 ? z10 : false, (i & 2048) != 0 ? null : num);
    }
}
