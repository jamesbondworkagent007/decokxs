package com.okinc.tradingbot.impl.market_place.my_bot.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotItemSwitchData implements Parcelable {
    public static final Parcelable.Creator<BotItemSwitchData> CREATOR = new Creator();
    public final String OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<BotItemSwitchData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotItemSwitchData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotItemSwitchData(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotItemSwitchData[] newArray(int i) {
            return new BotItemSwitchData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotItemSwitchData() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotItemSwitchData copy$default(BotItemSwitchData botItemSwitchData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botItemSwitchData.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = botItemSwitchData.copydefault;
        }
        return botItemSwitchData.copydefault(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotItemSwitchData copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotItemSwitchData(str, z);
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
        if (!(obj instanceof BotItemSwitchData)) {
            return false;
        }
        BotItemSwitchData botItemSwitchData = (BotItemSwitchData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) botItemSwitchData.OLrzqt) && this.copydefault == botItemSwitchData.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotItemSwitchData(title=" + this.OLrzqt + ", isSelect=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public BotItemSwitchData(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:49) call: com.okinc.tradingbot.impl.market_place.my_bot.itembinder.BotItemSwitchData.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BotItemSwitchData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
