package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StyleRes;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListLabelVoucherData implements TacticsListLabelUiData {
    public static final Parcelable.Creator<TacticsListLabelVoucherData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public int copydefault;
    public final TacticsVoucherInfo djBIcL;

    public static final class Creator implements Parcelable.Creator<TacticsListLabelVoucherData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelVoucherData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListLabelVoucherData(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), TacticsVoucherInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelVoucherData[] newArray(int i) {
            return new TacticsListLabelVoucherData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListLabelVoucherData() {
        this(null, false, 0, 0, 0, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsListLabelVoucherData copy$default(TacticsListLabelVoucherData tacticsListLabelVoucherData, String str, boolean z, int i, int i2, int i3, TacticsVoucherInfo tacticsVoucherInfo, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tacticsListLabelVoucherData.AEQbTJ;
        }
        if ((i4 & 2) != 0) {
            z = tacticsListLabelVoucherData.OLrzqt;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i = tacticsListLabelVoucherData.EZpvd;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = tacticsListLabelVoucherData.copydefault;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = tacticsListLabelVoucherData.KWHzl;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            tacticsVoucherInfo = tacticsListLabelVoucherData.djBIcL;
        }
        return tacticsListLabelVoucherData.AEQbTJ(str, z2, i5, i6, i7, tacticsVoucherInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListLabelVoucherData AEQbTJ(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3, @NotNull TacticsVoucherInfo tacticsVoucherInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        return new TacticsListLabelVoucherData(str, z, i, i2, i3, tacticsVoucherInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public void EZpvd(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof TacticsListLabelVoucherData)) {
            return false;
        }
        TacticsListLabelVoucherData tacticsListLabelVoucherData = (TacticsListLabelVoucherData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tacticsListLabelVoucherData.AEQbTJ) && this.OLrzqt == tacticsListLabelVoucherData.OLrzqt && this.EZpvd == tacticsListLabelVoucherData.EZpvd && this.copydefault == tacticsListLabelVoucherData.copydefault && this.KWHzl == tacticsListLabelVoucherData.KWHzl && Intrinsics.EZpvd(this.djBIcL, tacticsListLabelVoucherData.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AEQbTJ.hashCode() * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListLabelVoucherData(text=" + this.AEQbTJ + ", isOnlyShowInList=" + this.OLrzqt + ", tagStyle=" + this.EZpvd + ", tagSize=" + this.copydefault + ", tagTitleAppearance=" + this.KWHzl + ", voucherInfo=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.KWHzl);
        this.djBIcL.writeToParcel(parcel, i);
    }

    public TacticsListLabelVoucherData(@NotNull String str, boolean z, int i, int i2, @StyleRes int i3, @NotNull TacticsVoucherInfo tacticsVoucherInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        this.AEQbTJ = str;
        this.OLrzqt = z;
        this.EZpvd = i;
        this.copydefault = i2;
        this.KWHzl = i3;
        this.djBIcL = tacticsVoucherInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (7 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-4 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] o.wXj.LoaderManager.ffGIBT int) : (r25v0 int))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherInfo:?: TERNARY null = ((wrap:int:0x002a: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherType:?: CAST (com.okinc.unify_trade.biz.TacticsVoucherType) (null com.okinc.unify_trade.biz.TacticsVoucherType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (2047 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:520) call: com.okinc.unify_trade.biz.TacticsVoucherInfo.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.unify_trade.biz.TacticsVoucherInfo))
 A[MD:(java.lang.String, boolean, int, int, int, com.okinc.unify_trade.biz.TacticsVoucherInfo):void (m)] (LINE:514) call: com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData.<init>(java.lang.String, boolean, int, int, int, com.okinc.unify_trade.biz.TacticsVoucherInfo):void type: THIS */
    public /* synthetic */ TacticsListLabelVoucherData(String str, boolean z, int i, int i2, int i3, TacticsVoucherInfo tacticsVoucherInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 7 : i, (i4 & 8) != 0 ? -4 : i2, (i4 & 16) != 0 ? C52761wXj.LoaderManager.ffGIBT : i3, (i4 & 32) != 0 ? new TacticsVoucherInfo((String) null, (String) null, (TacticsVoucherType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null) : tacticsVoucherInfo);
    }
}
