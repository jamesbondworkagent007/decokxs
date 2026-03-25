package com.okinc.im.imui.preview.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ImageState implements Parcelable {
    public static final Parcelable.Creator<ImageState> CREATOR = new Creator();
    public final float AEQbTJ;
    public final PointF EZpvd;
    public final boolean OLrzqt;

    public static final class Creator implements Parcelable.Creator<ImageState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageState(parcel.readInt() != 0, parcel.readFloat(), (PointF) parcel.readParcelable(ImageState.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageState[] newArray(int i) {
            return new ImageState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageState() {
        this(false, 0.0f, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageState copy$default(ImageState imageState, boolean z, float f, PointF pointF, int i, Object obj) {
        if ((i & 1) != 0) {
            z = imageState.OLrzqt;
        }
        if ((i & 2) != 0) {
            f = imageState.AEQbTJ;
        }
        if ((i & 4) != 0) {
            pointF = imageState.EZpvd;
        }
        return imageState.copydefault(z, f, pointF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointF AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageState copydefault(boolean z, float f, @NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        return new ImageState(z, f, pointF);
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
        if (!(obj instanceof ImageState)) {
            return false;
        }
        ImageState imageState = (ImageState) obj;
        return this.OLrzqt == imageState.OLrzqt && Float.compare(this.AEQbTJ, imageState.AEQbTJ) == 0 && Intrinsics.EZpvd(this.EZpvd, imageState.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.OLrzqt) * 31) + Float.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageState(isReady=" + this.OLrzqt + ", scale=" + this.AEQbTJ + ", center=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeFloat(this.AEQbTJ);
        parcel.writeParcelable(this.EZpvd, i);
    }

    public ImageState(boolean z, float f, @NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        this.OLrzqt = z;
        this.AEQbTJ = f;
        this.EZpvd = pointF;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r2v0 float))
  (wrap:android.graphics.PointF:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:android.graphics.PointF:0x0012: CONSTRUCTOR (0.0f float), (0.0f float) A[MD:(float, float):void (c), WRAPPED] (LINE:24) call: android.graphics.PointF.<init>(float, float):void type: CONSTRUCTOR) : (r3v0 android.graphics.PointF))
 A[MD:(boolean, float, android.graphics.PointF):void (m)] (LINE:21) call: com.okinc.im.imui.preview.model.ImageState.<init>(boolean, float, android.graphics.PointF):void type: THIS */
    public /* synthetic */ ImageState(boolean z, float f, PointF pointF, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? new PointF(0.0f, 0.0f) : pointF);
    }
}
