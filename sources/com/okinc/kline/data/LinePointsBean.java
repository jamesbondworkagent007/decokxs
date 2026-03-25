package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LinePointsBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LinePointsBean> CREATOR = new Creator();
    private int offset;
    private double price;
    private long time_t;

    public static final class Creator implements Parcelable.Creator<LinePointsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinePointsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LinePointsBean(parcel.readLong(), parcel.readInt(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinePointsBean[] newArray(int i) {
            return new LinePointsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinePointsBean() {
        this(0L, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinePointsBean copy$default(LinePointsBean linePointsBean, long j, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = linePointsBean.time_t;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = linePointsBean.offset;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            d = linePointsBean.price;
        }
        return linePointsBean.copy(j2, i3, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.time_t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinePointsBean copy(long j, int i, double d) {
        return new LinePointsBean(j, i, d);
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
        if (!(obj instanceof LinePointsBean)) {
            return false;
        }
        LinePointsBean linePointsBean = (LinePointsBean) obj;
        return this.time_t == linePointsBean.time_t && this.offset == linePointsBean.offset && Double.compare(this.price, linePointsBean.price) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTime_t() {
        return this.time_t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.time_t) * 31) + Integer.hashCode(this.offset)) * 31) + Double.hashCode(this.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOffset(int i) {
        this.offset = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(double d) {
        this.price = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime_t(long j) {
        this.time_t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinePointsBean(time_t=" + this.time_t + ", offset=" + this.offset + ", price=" + this.price + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.time_t);
        parcel.writeInt(this.offset);
        parcel.writeDouble(this.price);
    }

    public LinePointsBean(long j, int i, double d) {
        this.time_t = j;
        this.offset = i;
        this.price = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:double:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0011: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r10v0 double))
 A[MD:(long, int, double):void (m)] (LINE:169) call: com.okinc.kline.data.LinePointsBean.<init>(long, int, double):void type: THIS */
    public /* synthetic */ LinePointsBean(long j, int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d);
    }
}
