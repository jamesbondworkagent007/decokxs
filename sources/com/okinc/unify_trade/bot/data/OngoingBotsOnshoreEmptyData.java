package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OngoingBotsOnshoreEmptyData implements EmptyData, Parcelable {
    public static final Parcelable.Creator<OngoingBotsOnshoreEmptyData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<OngoingBotsOnshoreEmptyData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OngoingBotsOnshoreEmptyData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OngoingBotsOnshoreEmptyData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OngoingBotsOnshoreEmptyData[] newArray(int i) {
            return new OngoingBotsOnshoreEmptyData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OngoingBotsOnshoreEmptyData() {
        this(null, null, null, 0, 0, false, false, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OngoingBotsOnshoreEmptyData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, boolean z, boolean z2, int i3, @DrawableRes int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OngoingBotsOnshoreEmptyData(str, str2, str3, i, i2, z, z2, i3, i4);
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
        if (!(obj instanceof OngoingBotsOnshoreEmptyData)) {
            return false;
        }
        OngoingBotsOnshoreEmptyData ongoingBotsOnshoreEmptyData = (OngoingBotsOnshoreEmptyData) obj;
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) ongoingBotsOnshoreEmptyData.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) ongoingBotsOnshoreEmptyData.gEmmrt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ongoingBotsOnshoreEmptyData.AEQbTJ) && this.EZpvd == ongoingBotsOnshoreEmptyData.EZpvd && this.AhwBna == ongoingBotsOnshoreEmptyData.AhwBna && this.KWHzl == ongoingBotsOnshoreEmptyData.KWHzl && this.AYXKKw == ongoingBotsOnshoreEmptyData.AYXKKw && this.OLrzqt == ongoingBotsOnshoreEmptyData.OLrzqt && this.copydefault == ongoingBotsOnshoreEmptyData.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getBtnText() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getEmptyType() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getImage() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getMarginBottom() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getMarginTop() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public boolean getMatchHeight() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getMsg() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getTitle() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.djBIcL.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public boolean isCenter() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OngoingBotsOnshoreEmptyData(title=" + this.djBIcL + ", msg=" + this.gEmmrt + ", btnText=" + this.AEQbTJ + ", emptyType=" + this.EZpvd + ", marginTop=" + this.AhwBna + ", isCenter=" + this.KWHzl + ", matchHeight=" + this.AYXKKw + ", marginBottom=" + this.OLrzqt + ", image=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.OLrzqt);
        parcel.writeInt(this.copydefault);
    }

    public OngoingBotsOnshoreEmptyData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, boolean z, boolean z2, int i3, @DrawableRes int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL = str;
        this.gEmmrt = str2;
        this.AEQbTJ = str3;
        this.EZpvd = i;
        this.AhwBna = i2;
        this.KWHzl = z;
        this.AYXKKw = z2;
        this.OLrzqt = i3;
        this.copydefault = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (7 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] o.wXj.TaskDescription.gCNefq int) : (r19v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void (m)] (LINE:872) call: com.okinc.unify_trade.bot.data.OngoingBotsOnshoreEmptyData.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void type: THIS */
    public /* synthetic */ OngoingBotsOnshoreEmptyData(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) == 0 ? str3 : "", (i5 & 8) != 0 ? 7 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? true : z2, (i5 & 128) == 0 ? i3 : 0, (i5 & 256) != 0 ? C52761wXj.TaskDescription.gCNefq : i4);
    }
}
