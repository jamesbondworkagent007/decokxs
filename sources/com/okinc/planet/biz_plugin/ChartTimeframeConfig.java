package com.okinc.planet.biz_plugin;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradeshare.api.TradeKLineBar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ChartTimeframeConfig implements Parcelable {
    public static final int $stable = 0;
    private final int approximateDataPoints;
    private final String chartTimeframe;
    private final long endTimestamp;
    private final TradeKLineBar intervalMinutes;
    private final long startTimestamp;
    private final String tradeAgeSinceEntry;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChartTimeframeConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.tradeshare.api.TradeKLineBar", TradeKLineBar.values()), null, null, null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ChartTimeframeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartTimeframeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartTimeframeConfig(parcel.readString(), parcel.readString(), TradeKLineBar.valueOf(parcel.readString()), parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartTimeframeConfig[] newArray(int i) {
            return new ChartTimeframeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeAgeSinceEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chartTimeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeKLineBar component3() {
        return this.intervalMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.approximateDataPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartTimeframeConfig copy(@NotNull String str, @NotNull String str2, @NotNull TradeKLineBar tradeKLineBar, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeKLineBar, "");
        return new ChartTimeframeConfig(str, str2, tradeKLineBar, i, j, j2);
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
        if (!(obj instanceof ChartTimeframeConfig)) {
            return false;
        }
        ChartTimeframeConfig chartTimeframeConfig = (ChartTimeframeConfig) obj;
        return Intrinsics.EZpvd((Object) this.tradeAgeSinceEntry, (Object) chartTimeframeConfig.tradeAgeSinceEntry) && Intrinsics.EZpvd((Object) this.chartTimeframe, (Object) chartTimeframeConfig.chartTimeframe) && this.intervalMinutes == chartTimeframeConfig.intervalMinutes && this.approximateDataPoints == chartTimeframeConfig.approximateDataPoints && this.startTimestamp == chartTimeframeConfig.startTimestamp && this.endTimestamp == chartTimeframeConfig.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApproximateDataPoints() {
        return this.approximateDataPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChartTimeframe() {
        return this.chartTimeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeKLineBar getIntervalMinutes() {
        return this.intervalMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeAgeSinceEntry() {
        return this.tradeAgeSinceEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tradeAgeSinceEntry.hashCode() * 31) + this.chartTimeframe.hashCode()) * 31) + this.intervalMinutes.hashCode()) * 31) + Integer.hashCode(this.approximateDataPoints)) * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartTimeframeConfig(tradeAgeSinceEntry=" + this.tradeAgeSinceEntry + ", chartTimeframe=" + this.chartTimeframe + ", intervalMinutes=" + this.intervalMinutes + ", approximateDataPoints=" + this.approximateDataPoints + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tradeAgeSinceEntry);
        parcel.writeString(this.chartTimeframe);
        parcel.writeString(this.intervalMinutes.name());
        parcel.writeInt(this.approximateDataPoints);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.ChartTimeframeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartTimeframeConfig> serializer() {
            return ChartTimeframeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartTimeframeConfig(int i, String str, String str2, TradeKLineBar tradeKLineBar, int i2, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ChartTimeframeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeAgeSinceEntry = str;
        this.chartTimeframe = str2;
        this.intervalMinutes = tradeKLineBar;
        this.approximateDataPoints = i2;
        this.startTimestamp = j;
        this.endTimestamp = j2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(ChartTimeframeConfig chartTimeframeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chartTimeframeConfig.tradeAgeSinceEntry);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, chartTimeframeConfig.chartTimeframe);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], chartTimeframeConfig.intervalMinutes);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, chartTimeframeConfig.approximateDataPoints);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, chartTimeframeConfig.startTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, chartTimeframeConfig.endTimestamp);
    }

    public ChartTimeframeConfig(@NotNull String str, @NotNull String str2, @NotNull TradeKLineBar tradeKLineBar, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeKLineBar, "");
        this.tradeAgeSinceEntry = str;
        this.chartTimeframe = str2;
        this.intervalMinutes = tradeKLineBar;
        this.approximateDataPoints = i;
        this.startTimestamp = j;
        this.endTimestamp = j2;
    }
}
