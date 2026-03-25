package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StyleRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListLabelData implements TacticsListLabelUiData {
    public static final Parcelable.Creator<TacticsListLabelData> CREATOR = new Creator();
    public final int AEQbTJ;
    public final int EZpvd;
    public int KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<TacticsListLabelData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListLabelData(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelData[] newArray(int i) {
            return new TacticsListLabelData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListLabelData() {
        this(null, false, 0, 0, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsListLabelData copy$default(TacticsListLabelData tacticsListLabelData, String str, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tacticsListLabelData.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            z = tacticsListLabelData.copydefault;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i = tacticsListLabelData.EZpvd;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = tacticsListLabelData.KWHzl;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = tacticsListLabelData.AEQbTJ;
        }
        return tacticsListLabelData.KWHzl(str, z2, i5, i6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public void EZpvd(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListLabelData KWHzl(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TacticsListLabelData(str, z, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof TacticsListLabelData)) {
            return false;
        }
        TacticsListLabelData tacticsListLabelData = (TacticsListLabelData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsListLabelData.OLrzqt) && this.copydefault == tacticsListLabelData.copydefault && this.EZpvd == tacticsListLabelData.EZpvd && this.KWHzl == tacticsListLabelData.KWHzl && this.AEQbTJ == tacticsListLabelData.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListLabelData(text=" + this.OLrzqt + ", isOnlyShowInList=" + this.copydefault + ", tagStyle=" + this.EZpvd + ", tagSize=" + this.KWHzl + ", tagTitleAppearance=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.AEQbTJ);
    }

    public TacticsListLabelData(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = z;
        this.EZpvd = i;
        this.KWHzl = i2;
        this.AEQbTJ = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:int:0x0011: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r6v0 int))
  (wrap:int:0x0017: TERNARY null = ((wrap:int:0x0012: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-4 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001c: SGET  A[WRAPPED] o.wXj.LoaderManager.OBJEWx int) : (r8v0 int))
 A[MD:(java.lang.String, boolean, int, int, int):void (m)] (LINE:474) call: com.okinc.unify_trade.bot.data.TacticsListLabelData.<init>(java.lang.String, boolean, int, int, int):void type: THIS */
    public /* synthetic */ TacticsListLabelData(String str, boolean z, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 6 : i, (i4 & 8) != 0 ? -4 : i2, (i4 & 16) != 0 ? C52761wXj.LoaderManager.OBJEWx : i3);
    }
}
