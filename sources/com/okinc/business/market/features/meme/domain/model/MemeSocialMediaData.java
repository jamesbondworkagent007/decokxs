package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.okinc.business.market.features.meme.data.model.XPostType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeSocialMediaData implements Parcelable {
    public static final Parcelable.Creator<MemeSocialMediaData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Integer AYXKKw;
    public final Integer AhwBna;
    public final String AkhnZx;
    public final XPostType DbNXlk;
    public final boolean EZpvd;
    public final String KWHzl;
    public final Integer OLrzqt;
    public final Integer copydefault;
    public final Integer djBIcL;
    public final int gEmmrt;
    public final Integer valueOf;
    public final long values;

    public static final class Creator implements Parcelable.Creator<MemeSocialMediaData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSocialMediaData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeSocialMediaData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? XPostType.valueOf(parcel.readString()) : null, parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSocialMediaData[] newArray(int i) {
            return new MemeSocialMediaData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSocialMediaData EZpvd(@NotNull String str, @NotNull String str2, @DrawableRes int i, @DrawableRes Integer num, @StringRes Integer num2, @StringRes Integer num3, @StringRes Integer num4, @NotNull String str3, @ColorRes Integer num5, @ColorInt Integer num6, XPostType xPostType, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MemeSocialMediaData(str, str2, i, num, num2, num3, num4, str3, num5, num6, xPostType, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XPostType djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSocialMediaData)) {
            return false;
        }
        MemeSocialMediaData memeSocialMediaData = (MemeSocialMediaData) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) memeSocialMediaData.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) memeSocialMediaData.AEQbTJ) && this.gEmmrt == memeSocialMediaData.gEmmrt && Intrinsics.EZpvd(this.copydefault, memeSocialMediaData.copydefault) && Intrinsics.EZpvd(this.valueOf, memeSocialMediaData.valueOf) && Intrinsics.EZpvd(this.OLrzqt, memeSocialMediaData.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, memeSocialMediaData.djBIcL) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) memeSocialMediaData.AkhnZx) && Intrinsics.EZpvd(this.AYXKKw, memeSocialMediaData.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, memeSocialMediaData.AhwBna) && this.DbNXlk == memeSocialMediaData.DbNXlk && this.values == memeSocialMediaData.values && this.EZpvd == memeSocialMediaData.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = Integer.hashCode(this.gEmmrt);
        Integer num = this.copydefault;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.valueOf;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.OLrzqt;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.djBIcL;
        int iHashCode7 = num4 == null ? 0 : num4.hashCode();
        int iHashCode8 = this.AkhnZx.hashCode();
        Integer num5 = this.AYXKKw;
        int iHashCode9 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.AhwBna;
        int iHashCode10 = num6 == null ? 0 : num6.hashCode();
        XPostType xPostType = this.DbNXlk;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (xPostType != null ? xPostType.hashCode() : 0)) * 31) + Long.hashCode(this.values)) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSocialMediaData(logo=" + this.KWHzl + ", link=" + this.AEQbTJ + ", res=" + this.gEmmrt + ", altRes=" + this.copydefault + ", redirectNameRes=" + this.valueOf + ", nameRes=" + this.OLrzqt + ", redirectTextRes=" + this.djBIcL + ", trackKey=" + this.AkhnZx + ", tintRes=" + this.AYXKKw + ", tint=" + this.AhwBna + ", twitterPostType=" + this.DbNXlk + ", xPostTime=" + this.values + ", isLocalGenerated=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.gEmmrt);
        Integer num = this.copydefault;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.valueOf;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.OLrzqt;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.djBIcL;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.AkhnZx);
        Integer num5 = this.AYXKKw;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.AhwBna;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        XPostType xPostType = this.DbNXlk;
        if (xPostType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(xPostType.name());
        }
        parcel.writeLong(this.values);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public MemeSocialMediaData(@NotNull String str, @NotNull String str2, @DrawableRes int i, @DrawableRes Integer num, @StringRes Integer num2, @StringRes Integer num3, @StringRes Integer num4, @NotNull String str3, @ColorRes Integer num5, @ColorInt Integer num6, XPostType xPostType, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.gEmmrt = i;
        this.copydefault = num;
        this.valueOf = num2;
        this.OLrzqt = num3;
        this.djBIcL = num4;
        this.AkhnZx = str3;
        this.AYXKKw = num5;
        this.AhwBna = num6;
        this.DbNXlk = xPostType;
        this.values = j;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] o.yhn.Activity.QKVWgx int) : (r21v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002f: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003f: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:com.okinc.business.market.features.meme.data.model.XPostType:?: TERNARY null = ((wrap:int:0x004f: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.XPostType) : (r29v0 com.okinc.business.market.features.meme.data.model.XPostType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0057: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.business.market.features.meme.data.model.XPostType, long, boolean):void (m)] (LINE:16) call: com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData.<init>(java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.business.market.features.meme.data.model.XPostType, long, boolean):void type: THIS */
    public /* synthetic */ MemeSocialMediaData(String str, String str2, int i, Integer num, Integer num2, Integer num3, Integer num4, String str3, Integer num5, Integer num6, XPostType xPostType, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, (i2 & 4) != 0 ? C57406yhn.Activity.QKVWgx : i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : num3, (i2 & 64) != 0 ? null : num4, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? null : num5, (i2 & 512) != 0 ? null : num6, (i2 & 1024) != 0 ? null : xPostType, (i2 & 2048) != 0 ? 0L : j, (i2 & 4096) != 0 ? false : z);
    }
}
