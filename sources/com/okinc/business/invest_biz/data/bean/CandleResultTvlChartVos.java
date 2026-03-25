package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CandleResultTvlChartVos implements Parcelable {
    public static final int $stable = 0;
    private final int limitValue;
    private final long timestamp;
    private final String tvl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CandleResultTvlChartVos> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CandleResultTvlChartVos> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultTvlChartVos createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CandleResultTvlChartVos(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultTvlChartVos[] newArray(int i) {
            return new CandleResultTvlChartVos[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CandleResultTvlChartVos() {
        this(0L, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CandleResultTvlChartVos copy$default(CandleResultTvlChartVos candleResultTvlChartVos, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = candleResultTvlChartVos.timestamp;
        }
        if ((i2 & 2) != 0) {
            str = candleResultTvlChartVos.tvl;
        }
        if ((i2 & 4) != 0) {
            i = candleResultTvlChartVos.limitValue;
        }
        return candleResultTvlChartVos.copy(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.limitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CandleResultTvlChartVos copy(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CandleResultTvlChartVos(j, str, i);
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
        if (!(obj instanceof CandleResultTvlChartVos)) {
            return false;
        }
        CandleResultTvlChartVos candleResultTvlChartVos = (CandleResultTvlChartVos) obj;
        return this.timestamp == candleResultTvlChartVos.timestamp && Intrinsics.EZpvd((Object) this.tvl, (Object) candleResultTvlChartVos.tvl) && this.limitValue == candleResultTvlChartVos.limitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimitValue() {
        return this.limitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.tvl.hashCode()) * 31) + Integer.hashCode(this.limitValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CandleResultTvlChartVos(timestamp=" + this.timestamp + ", tvl=" + this.tvl + ", limitValue=" + this.limitValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.tvl);
        parcel.writeInt(this.limitValue);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.CandleResultTvlChartVos.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CandleResultTvlChartVos> serializer() {
            return CandleResultTvlChartVos$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CandleResultTvlChartVos(int i, long j, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.timestamp = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str;
        }
        if ((i & 4) == 0) {
            this.limitValue = 0;
        } else {
            this.limitValue = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(CandleResultTvlChartVos candleResultTvlChartVos, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || candleResultTvlChartVos.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, candleResultTvlChartVos.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) candleResultTvlChartVos.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, candleResultTvlChartVos.tvl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && candleResultTvlChartVos.limitValue == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, candleResultTvlChartVos.limitValue);
    }

    public CandleResultTvlChartVos(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timestamp = j;
        this.tvl = str;
        this.limitValue = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(long, java.lang.String, int):void (m)] (LINE:45) call: com.okinc.business.invest_biz.data.bean.CandleResultTvlChartVos.<init>(long, java.lang.String, int):void type: THIS */
    public /* synthetic */ CandleResultTvlChartVos(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
