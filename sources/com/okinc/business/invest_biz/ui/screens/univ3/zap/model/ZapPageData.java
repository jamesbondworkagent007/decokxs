package com.okinc.business.invest_biz.ui.screens.univ3.zap.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ZapPageData implements Parcelable {
    public static final Parcelable.Creator<ZapPageData> CREATOR = new Creator();
    public final long AEQbTJ;
    public final String AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public final long copydefault;
    public final String valueOf;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ZapPageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZapPageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ZapPageData(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZapPageData[] newArray(int i) {
            return new ZapPageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZapPageData KWHzl(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ZapPageData(str, str2, j, str3, j2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZapPageData)) {
            return false;
        }
        ZapPageData zapPageData = (ZapPageData) obj;
        return Intrinsics.EZpvd((Object) this.AhwBna, (Object) zapPageData.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) zapPageData.valueOf) && this.AEQbTJ == zapPageData.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) zapPageData.OLrzqt) && this.copydefault == zapPageData.copydefault && this.KWHzl == zapPageData.KWHzl && this.EZpvd == zapPageData.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AhwBna.hashCode() * 31) + this.valueOf.hashCode()) * 31) + Long.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + Long.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZapPageData(walletId=" + this.AhwBna + ", walletAddress=" + this.valueOf + ", investmentId=" + this.AEQbTJ + ", tokenId=" + this.OLrzqt + ", chainId=" + this.copydefault + ", tickLower=" + this.KWHzl + ", tickUpper=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.valueOf);
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeLong(this.copydefault);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.EZpvd);
    }

    public ZapPageData(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AhwBna = str;
        this.valueOf = str2;
        this.AEQbTJ = j;
        this.OLrzqt = str3;
        this.copydefault = j2;
        this.KWHzl = i;
        this.EZpvd = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (r18v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, long, int, int):void (m)] (LINE:7) call: com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapPageData.<init>(java.lang.String, java.lang.String, long, java.lang.String, long, int, int):void type: THIS */
    public /* synthetic */ ZapPageData(String str, String str2, long j, String str3, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? 0L : j, str3, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
