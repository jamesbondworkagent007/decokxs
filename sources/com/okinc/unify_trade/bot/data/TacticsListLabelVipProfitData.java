package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StyleRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListLabelVipProfitData implements TacticsListLabelUiData {
    public static final Parcelable.Creator<TacticsListLabelVipProfitData> CREATOR = new Creator();
    public int AEQbTJ;
    public final int EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final int copydefault;
    public final TacticsVipProfitData djBIcL;

    public static final class Creator implements Parcelable.Creator<TacticsListLabelVipProfitData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelVipProfitData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListLabelVipProfitData(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), TacticsVipProfitData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelVipProfitData[] newArray(int i) {
            return new TacticsListLabelVipProfitData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListLabelVipProfitData() {
        this(null, false, 0, 0, 0, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsListLabelVipProfitData copy$default(TacticsListLabelVipProfitData tacticsListLabelVipProfitData, String str, boolean z, int i, int i2, int i3, TacticsVipProfitData tacticsVipProfitData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tacticsListLabelVipProfitData.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            z = tacticsListLabelVipProfitData.KWHzl;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i = tacticsListLabelVipProfitData.EZpvd;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = tacticsListLabelVipProfitData.AEQbTJ;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = tacticsListLabelVipProfitData.copydefault;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            tacticsVipProfitData = tacticsListLabelVipProfitData.djBIcL;
        }
        return tacticsListLabelVipProfitData.AEQbTJ(str, z2, i5, i6, i7, tacticsVipProfitData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListLabelVipProfitData AEQbTJ(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3, @NotNull TacticsVipProfitData tacticsVipProfitData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tacticsVipProfitData, "");
        return new TacticsListLabelVipProfitData(str, z, i, i2, i3, tacticsVipProfitData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVipProfitData EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public void EZpvd(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof TacticsListLabelVipProfitData)) {
            return false;
        }
        TacticsListLabelVipProfitData tacticsListLabelVipProfitData = (TacticsListLabelVipProfitData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsListLabelVipProfitData.OLrzqt) && this.KWHzl == tacticsListLabelVipProfitData.KWHzl && this.EZpvd == tacticsListLabelVipProfitData.EZpvd && this.AEQbTJ == tacticsListLabelVipProfitData.AEQbTJ && this.copydefault == tacticsListLabelVipProfitData.copydefault && Intrinsics.EZpvd(this.djBIcL, tacticsListLabelVipProfitData.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListLabelVipProfitData(text=" + this.OLrzqt + ", isOnlyShowInList=" + this.KWHzl + ", tagStyle=" + this.EZpvd + ", tagSize=" + this.AEQbTJ + ", tagTitleAppearance=" + this.copydefault + ", vipProfit=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeInt(this.copydefault);
        this.djBIcL.writeToParcel(parcel, i);
    }

    public TacticsListLabelVipProfitData(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3, @NotNull TacticsVipProfitData tacticsVipProfitData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tacticsVipProfitData, "");
        this.OLrzqt = str;
        this.KWHzl = z;
        this.EZpvd = i;
        this.AEQbTJ = i2;
        this.copydefault = i3;
        this.djBIcL = tacticsVipProfitData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (7 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-4 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] o.wXj.LoaderManager.ffGIBT int) : (r20v0 int))
  (wrap:com.okinc.unify_trade.bot.data.TacticsVipProfitData:?: TERNARY null = ((wrap:int:0x002a: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:499) call: com.okinc.unify_trade.bot.data.TacticsVipProfitData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.unify_trade.bot.data.TacticsVipProfitData))
 A[MD:(java.lang.String, boolean, int, int, int, com.okinc.unify_trade.bot.data.TacticsVipProfitData):void (m)] (LINE:493) call: com.okinc.unify_trade.bot.data.TacticsListLabelVipProfitData.<init>(java.lang.String, boolean, int, int, int, com.okinc.unify_trade.bot.data.TacticsVipProfitData):void type: THIS */
    public /* synthetic */ TacticsListLabelVipProfitData(String str, boolean z, int i, int i2, int i3, TacticsVipProfitData tacticsVipProfitData, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 7 : i, (i4 & 8) != 0 ? -4 : i2, (i4 & 16) != 0 ? C52761wXj.LoaderManager.ffGIBT : i3, (i4 & 32) != 0 ? new TacticsVipProfitData(null, null, null, null, null, null, 63, null) : tacticsVipProfitData);
    }
}
