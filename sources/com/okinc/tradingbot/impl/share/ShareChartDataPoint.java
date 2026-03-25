package com.okinc.tradingbot.impl.share;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55169xeq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareChartDataPoint implements InterfaceC55169xeq<Float>, Parcelable {
    public static final Parcelable.Creator<ShareChartDataPoint> CREATOR = new Creator();
    public final float AEQbTJ;
    public final String EZpvd;
    public final long copydefault;

    public static final class Creator implements Parcelable.Creator<ShareChartDataPoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareChartDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareChartDataPoint(parcel.readFloat(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareChartDataPoint[] newArray(int i) {
            return new ShareChartDataPoint[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareChartDataPoint() {
        this(0.0f, 0L, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareChartDataPoint copy$default(ShareChartDataPoint shareChartDataPoint, float f, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = shareChartDataPoint.AEQbTJ;
        }
        if ((i & 2) != 0) {
            j = shareChartDataPoint.copydefault;
        }
        if ((i & 4) != 0) {
            str = shareChartDataPoint.EZpvd;
        }
        return shareChartDataPoint.AEQbTJ(f, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareChartDataPoint AEQbTJ(float f, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ShareChartDataPoint(f, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof ShareChartDataPoint)) {
            return false;
        }
        ShareChartDataPoint shareChartDataPoint = (ShareChartDataPoint) obj;
        return Float.compare(this.AEQbTJ, shareChartDataPoint.AEQbTJ) == 0 && this.copydefault == shareChartDataPoint.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) shareChartDataPoint.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Float.hashCode(this.AEQbTJ) * 31) + Long.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareChartDataPoint(value=" + this.AEQbTJ + ", timestamp=" + this.copydefault + ", displayValue=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeFloat(this.AEQbTJ);
        parcel.writeLong(this.copydefault);
        parcel.writeString(this.EZpvd);
    }

    public ShareChartDataPoint(float f, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = f;
        this.copydefault = j;
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r1v0 float))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(float, long, java.lang.String):void (m)] (LINE:194) call: com.okinc.tradingbot.impl.share.ShareChartDataPoint.<init>(float, long, java.lang.String):void type: THIS */
    public /* synthetic */ ShareChartDataPoint(float f, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
    @Override // o.InterfaceC55169xeq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Float KWHzl() {
        return Float.valueOf(this.AEQbTJ);
    }
}
