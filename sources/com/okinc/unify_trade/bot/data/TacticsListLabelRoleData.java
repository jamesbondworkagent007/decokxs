package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StyleRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListLabelRoleData implements TacticsListLabelUiData {
    public static final Parcelable.Creator<TacticsListLabelRoleData> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final int EZpvd;
    public int KWHzl;
    public final String OLrzqt;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<TacticsListLabelRoleData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelRoleData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListLabelRoleData(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelRoleData[] newArray(int i) {
            return new TacticsListLabelRoleData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListLabelRoleData() {
        this(null, false, 0, 0, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsListLabelRoleData copy$default(TacticsListLabelRoleData tacticsListLabelRoleData, String str, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tacticsListLabelRoleData.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            z = tacticsListLabelRoleData.AEQbTJ;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i = tacticsListLabelRoleData.copydefault;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = tacticsListLabelRoleData.KWHzl;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = tacticsListLabelRoleData.EZpvd;
        }
        return tacticsListLabelRoleData.copydefault(str, z2, i5, i6, i3);
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
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListLabelRoleData copydefault(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TacticsListLabelRoleData(str, z, i, i2, i3);
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
        if (!(obj instanceof TacticsListLabelRoleData)) {
            return false;
        }
        TacticsListLabelRoleData tacticsListLabelRoleData = (TacticsListLabelRoleData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsListLabelRoleData.OLrzqt) && this.AEQbTJ == tacticsListLabelRoleData.AEQbTJ && this.copydefault == tacticsListLabelRoleData.copydefault && this.KWHzl == tacticsListLabelRoleData.KWHzl && this.EZpvd == tacticsListLabelRoleData.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListLabelRoleData(text=" + this.OLrzqt + ", isOnlyShowInList=" + this.AEQbTJ + ", tagStyle=" + this.copydefault + ", tagSize=" + this.KWHzl + ", tagTitleAppearance=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.EZpvd);
    }

    public TacticsListLabelRoleData(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = z;
        this.copydefault = i;
        this.KWHzl = i2;
        this.EZpvd = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:int:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r6v0 int))
  (wrap:int:0x0018: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-4 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001d: SGET  A[WRAPPED] o.wXj.LoaderManager.OBJEWx int) : (r8v0 int))
 A[MD:(java.lang.String, boolean, int, int, int):void (m)] (LINE:483) call: com.okinc.unify_trade.bot.data.TacticsListLabelRoleData.<init>(java.lang.String, boolean, int, int, int):void type: THIS */
    public /* synthetic */ TacticsListLabelRoleData(String str, boolean z, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 10 : i, (i4 & 8) != 0 ? -4 : i2, (i4 & 16) != 0 ? C52761wXj.LoaderManager.OBJEWx : i3);
    }
}
