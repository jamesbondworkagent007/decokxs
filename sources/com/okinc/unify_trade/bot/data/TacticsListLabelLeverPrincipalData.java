package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StyleRes;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsListLabelLeverPrincipalData implements TacticsListLabelUiData {
    public static final Parcelable.Creator<TacticsListLabelLeverPrincipalData> CREATOR = new Creator();
    public int AEQbTJ;
    public final boolean EZpvd;
    public final BigDecimal KWHzl;
    public final String OLrzqt;
    public final BigDecimal copydefault;
    public final String djBIcL;
    public final int gEmmrt;
    public final int valueOf;

    public static final class Creator implements Parcelable.Creator<TacticsListLabelLeverPrincipalData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelLeverPrincipalData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsListLabelLeverPrincipalData(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsListLabelLeverPrincipalData[] newArray(int i) {
            return new TacticsListLabelLeverPrincipalData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsListLabelLeverPrincipalData EZpvd(@NotNull String str, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull String str2, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TacticsListLabelLeverPrincipalData(str, bigDecimal, bigDecimal2, str2, z, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public void EZpvd(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TacticsListLabelUiData
    public int OLrzqt() {
        return this.valueOf;
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
    public final BigDecimal djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TacticsListLabelLeverPrincipalData)) {
            return false;
        }
        TacticsListLabelLeverPrincipalData tacticsListLabelLeverPrincipalData = (TacticsListLabelLeverPrincipalData) obj;
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) tacticsListLabelLeverPrincipalData.djBIcL) && Intrinsics.EZpvd(this.copydefault, tacticsListLabelLeverPrincipalData.copydefault) && Intrinsics.EZpvd(this.KWHzl, tacticsListLabelLeverPrincipalData.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsListLabelLeverPrincipalData.OLrzqt) && this.EZpvd == tacticsListLabelLeverPrincipalData.EZpvd && this.valueOf == tacticsListLabelLeverPrincipalData.valueOf && this.AEQbTJ == tacticsListLabelLeverPrincipalData.AEQbTJ && this.gEmmrt == tacticsListLabelLeverPrincipalData.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.djBIcL.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.valueOf)) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsListLabelLeverPrincipalData(text=" + this.djBIcL + ", leverPrincipal=" + this.copydefault + ", investAmount=" + this.KWHzl + ", ccy=" + this.OLrzqt + ", isOnlyShowInList=" + this.EZpvd + ", tagStyle=" + this.valueOf + ", tagSize=" + this.AEQbTJ + ", tagTitleAppearance=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL);
        parcel.writeSerializable(this.copydefault);
        parcel.writeSerializable(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeInt(this.gEmmrt);
    }

    public TacticsListLabelLeverPrincipalData(@NotNull String str, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull String str2, boolean z, int i, int i2, @StyleRes int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str;
        this.copydefault = bigDecimal;
        this.KWHzl = bigDecimal2;
        this.OLrzqt = str2;
        this.EZpvd = z;
        this.valueOf = i;
        this.AEQbTJ = i2;
        this.gEmmrt = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.math.BigDecimal)
  (r15v0 java.math.BigDecimal)
  (r16v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-5 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
 A[MD:(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, boolean, int, int, int):void (m)] (LINE:524) call: com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData.<init>(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, boolean, int, int, int):void type: THIS */
    public /* synthetic */ TacticsListLabelLeverPrincipalData(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, bigDecimal2, str2, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? 6 : i, (i4 & 64) != 0 ? -5 : i2, (i4 & 128) != 0 ? 0 : i3);
    }
}
