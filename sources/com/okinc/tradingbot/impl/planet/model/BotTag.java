package com.okinc.tradingbot.impl.planet.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTag implements Parcelable {
    public static final Parcelable.Creator<BotTag> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final int OLrzqt;

    public static final class Creator implements Parcelable.Creator<BotTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotTag(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotTag[] newArray(int i) {
            return new BotTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotTag copy$default(BotTag botTag, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = botTag.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i = botTag.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            i2 = botTag.AEQbTJ;
        }
        return botTag.OLrzqt(str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotTag OLrzqt(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotTag(str, i, i2);
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
        if (!(obj instanceof BotTag)) {
            return false;
        }
        BotTag botTag = (BotTag) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) botTag.EZpvd) && this.OLrzqt == botTag.OLrzqt && this.AEQbTJ == botTag.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotTag(text=" + this.EZpvd + ", tagStyle=" + this.OLrzqt + ", tagPaint=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.OLrzqt);
        parcel.writeInt(this.AEQbTJ);
    }

    public BotTag(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = i;
        this.AEQbTJ = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:11) call: com.okinc.tradingbot.impl.planet.model.BotTag.<init>(java.lang.String, int, int):void type: THIS */
    public /* synthetic */ BotTag(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 6 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
