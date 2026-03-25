package com.okinc.planet.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ImageLoadInfo implements Parcelable {
    public static final Parcelable.Creator<ImageLoadInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public final int copydefault;

    public static final class Creator implements Parcelable.Creator<ImageLoadInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageLoadInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageLoadInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageLoadInfo[] newArray(int i) {
            return new ImageLoadInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageLoadInfo() {
        this(null, null, null, 0, 0, 0.0f, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageLoadInfo copy$default(ImageLoadInfo imageLoadInfo, String str, String str2, String str3, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageLoadInfo.AYXKKw;
        }
        if ((i3 & 2) != 0) {
            str2 = imageLoadInfo.AEQbTJ;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = imageLoadInfo.EZpvd;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = imageLoadInfo.KWHzl;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = imageLoadInfo.copydefault;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            f = imageLoadInfo.OLrzqt;
        }
        return imageLoadInfo.KWHzl(str, str4, str5, i4, i5, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageLoadInfo KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ImageLoadInfo(str, str2, str3, i, i2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof ImageLoadInfo)) {
            return false;
        }
        ImageLoadInfo imageLoadInfo = (ImageLoadInfo) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) imageLoadInfo.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) imageLoadInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) imageLoadInfo.EZpvd) && this.KWHzl == imageLoadInfo.KWHzl && this.copydefault == imageLoadInfo.copydefault && Float.compare(this.OLrzqt, imageLoadInfo.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AYXKKw.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Float.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageLoadInfo(targetId=" + this.AYXKKw + ", nickName=" + this.AEQbTJ + ", portrait=" + this.EZpvd + ", ossSize=" + this.KWHzl + ", borderColor=" + this.copydefault + ", borderWidth=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.copydefault);
        parcel.writeFloat(this.OLrzqt);
    }

    public ImageLoadInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.KWHzl = i;
        this.copydefault = i2;
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (150 int) : (r8v0 int))
  (wrap:int:0x0027: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0023: INVOKE (wrap:int:0x0021: SGET  A[WRAPPED] o.mPz.ActionBar.fJNWhG int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:234)) : (r9v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0028: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r10v0 float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, float):void (m)] (LINE:229) call: com.okinc.planet.utils.ImageLoadInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, float):void type: THIS */
    public /* synthetic */ ImageLoadInfo(String str, String str2, String str3, int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? 150 : i, (i3 & 16) != 0 ? C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG) : i2, (i3 & 32) != 0 ? 0.5f : f);
    }
}
