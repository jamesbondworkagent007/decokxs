package com.okinc.im.imui.picker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class ImageCropConfig implements Parcelable {
    public final String AEQbTJ;
    public final int AYXKKw;
    public final float AhwBna;
    public final String EZpvd;
    public final ConfirmationDialogConfig KWHzl;
    public final CropShape OLrzqt;
    public final Uri gEmmrt;
    public final int valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<ImageCropConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ImageCropConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageCropConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageCropConfig((Uri) parcel.readParcelable(ImageCropConfig.class.getClassLoader()), parcel.readFloat(), CropShape.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConfirmationDialogConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageCropConfig[] newArray(int i) {
            return new ImageCropConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfirmationDialogConfig EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CropShape OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageCropConfig copydefault(@NotNull Uri uri, float f, @NotNull CropShape cropShape, int i, int i2, String str, String str2, ConfirmationDialogConfig confirmationDialogConfig) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(cropShape, "");
        return new ImageCropConfig(uri, f, cropShape, i, i2, str, str2, confirmationDialogConfig);
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
        if (!(obj instanceof ImageCropConfig)) {
            return false;
        }
        ImageCropConfig imageCropConfig = (ImageCropConfig) obj;
        return Intrinsics.EZpvd(this.gEmmrt, imageCropConfig.gEmmrt) && Float.compare(this.AhwBna, imageCropConfig.AhwBna) == 0 && this.OLrzqt == imageCropConfig.OLrzqt && this.valueOf == imageCropConfig.valueOf && this.AYXKKw == imageCropConfig.AYXKKw && Intrinsics.EZpvd((Object) this.EZpvd, (Object) imageCropConfig.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) imageCropConfig.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, imageCropConfig.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = Float.hashCode(this.AhwBna);
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = Integer.hashCode(this.valueOf);
        int iHashCode5 = Integer.hashCode(this.AYXKKw);
        String str = this.EZpvd;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        ConfirmationDialogConfig confirmationDialogConfig = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (confirmationDialogConfig != null ? confirmationDialogConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageCropConfig(imageUri=" + this.gEmmrt + ", cropSizeInDp=" + this.AhwBna + ", cropShape=" + this.OLrzqt + ", maxOutputWidth=" + this.valueOf + ", maxOutputHeight=" + this.AYXKKw + ", confirmButtonText=" + this.EZpvd + ", backButtonText=" + this.AEQbTJ + ", confirmationDialog=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.gEmmrt, i);
        parcel.writeFloat(this.AhwBna);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        ConfirmationDialogConfig confirmationDialogConfig = this.KWHzl;
        if (confirmationDialogConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            confirmationDialogConfig.writeToParcel(parcel, i);
        }
    }

    public ImageCropConfig(@NotNull Uri uri, float f, @NotNull CropShape cropShape, int i, int i2, String str, String str2, ConfirmationDialogConfig confirmationDialogConfig) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(cropShape, "");
        this.gEmmrt = uri;
        this.AhwBna = f;
        this.OLrzqt = cropShape;
        this.valueOf = i;
        this.AYXKKw = i2;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = confirmationDialogConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0043: CONSTRUCTOR 
  (r9v0 android.net.Uri)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (300.0f float) : (r10v0 float))
  (wrap:com.okinc.im.imui.picker.CropShape:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:23) com.okinc.im.imui.picker.CropShape.SQUARE com.okinc.im.imui.picker.CropShape) : (r11v0 com.okinc.im.imui.picker.CropShape))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (512 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 int) : (512 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.im.imui.picker.ConfirmationDialogConfig:?: TERNARY null = ((wrap:int:0x0030: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 com.okinc.im.imui.picker.ConfirmationDialogConfig) : (null com.okinc.im.imui.picker.ConfirmationDialogConfig))
 A[MD:(android.net.Uri, float, com.okinc.im.imui.picker.CropShape, int, int, java.lang.String, java.lang.String, com.okinc.im.imui.picker.ConfirmationDialogConfig):void (m)] (LINE:20) call: com.okinc.im.imui.picker.ImageCropConfig.<init>(android.net.Uri, float, com.okinc.im.imui.picker.CropShape, int, int, java.lang.String, java.lang.String, com.okinc.im.imui.picker.ConfirmationDialogConfig):void type: THIS */
    public /* synthetic */ ImageCropConfig(Uri uri, float f, CropShape cropShape, int i, int i2, String str, String str2, ConfirmationDialogConfig confirmationDialogConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i3 & 2) != 0 ? 300.0f : f, (i3 & 4) != 0 ? CropShape.SQUARE : cropShape, (i3 & 8) != 0 ? 512 : i, (i3 & 16) == 0 ? i2 : 512, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, (i3 & 128) == 0 ? confirmationDialogConfig : null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.picker.ImageCropConfig.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
