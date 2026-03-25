package com.okinc.business.invest_biz.ui.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlChartVos;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestTVLKLineDataPoint implements Parcelable {
    public static final Parcelable.Creator<InvestTVLKLineDataPoint> CREATOR = new Creator();
    public final float AEQbTJ;
    public final long EZpvd;
    public final int KWHzl;
    public final CandleResultTvlChartVos OLrzqt;

    public static final class Creator implements Parcelable.Creator<InvestTVLKLineDataPoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTVLKLineDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTVLKLineDataPoint(parcel.readInt(), parcel.readFloat(), parcel.readLong(), CandleResultTvlChartVos.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTVLKLineDataPoint[] newArray(int i) {
            return new InvestTVLKLineDataPoint[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestTVLKLineDataPoint copy$default(InvestTVLKLineDataPoint investTVLKLineDataPoint, int i, float f, long j, CandleResultTvlChartVos candleResultTvlChartVos, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = investTVLKLineDataPoint.KWHzl;
        }
        if ((i2 & 2) != 0) {
            f = investTVLKLineDataPoint.AEQbTJ;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j = investTVLKLineDataPoint.EZpvd;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            candleResultTvlChartVos = investTVLKLineDataPoint.OLrzqt;
        }
        return investTVLKLineDataPoint.AEQbTJ(i, f2, j2, candleResultTvlChartVos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTVLKLineDataPoint AEQbTJ(int i, float f, long j, @NotNull CandleResultTvlChartVos candleResultTvlChartVos) {
        Intrinsics.checkNotNullParameter(candleResultTvlChartVos, "");
        return new InvestTVLKLineDataPoint(i, f, j, candleResultTvlChartVos);
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
        if (!(obj instanceof InvestTVLKLineDataPoint)) {
            return false;
        }
        InvestTVLKLineDataPoint investTVLKLineDataPoint = (InvestTVLKLineDataPoint) obj;
        return this.KWHzl == investTVLKLineDataPoint.KWHzl && Float.compare(this.AEQbTJ, investTVLKLineDataPoint.AEQbTJ) == 0 && this.EZpvd == investTVLKLineDataPoint.EZpvd && Intrinsics.EZpvd(this.OLrzqt, investTVLKLineDataPoint.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.KWHzl) * 31) + Float.hashCode(this.AEQbTJ)) * 31) + Long.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTVLKLineDataPoint(index=" + this.KWHzl + ", tvl=" + this.AEQbTJ + ", timestamp=" + this.EZpvd + ", info=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl);
        parcel.writeFloat(this.AEQbTJ);
        parcel.writeLong(this.EZpvd);
        this.OLrzqt.writeToParcel(parcel, i);
    }

    public InvestTVLKLineDataPoint(int i, float f, long j, @NotNull CandleResultTvlChartVos candleResultTvlChartVos) {
        Intrinsics.checkNotNullParameter(candleResultTvlChartVos, "");
        this.KWHzl = i;
        this.AEQbTJ = f;
        this.EZpvd = j;
        this.OLrzqt = candleResultTvlChartVos;
    }
}
