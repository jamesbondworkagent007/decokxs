package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PluginChartTimeframeConfig implements Parcelable {
    public static final int $stable = 0;
    private final int approximateDataPoints;
    private final long endTimestamp;
    private final String intervalMinutes;
    private final long startTimestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PluginChartTimeframeConfig> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PluginChartTimeframeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginChartTimeframeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PluginChartTimeframeConfig(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PluginChartTimeframeConfig[] newArray(int i) {
            return new PluginChartTimeframeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PluginChartTimeframeConfig copy$default(PluginChartTimeframeConfig pluginChartTimeframeConfig, String str, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pluginChartTimeframeConfig.intervalMinutes;
        }
        if ((i2 & 2) != 0) {
            i = pluginChartTimeframeConfig.approximateDataPoints;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = pluginChartTimeframeConfig.startTimestamp;
        }
        long j3 = j;
        if ((i2 & 8) != 0) {
            j2 = pluginChartTimeframeConfig.endTimestamp;
        }
        return pluginChartTimeframeConfig.copy(str, i3, j3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.intervalMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.approximateDataPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PluginChartTimeframeConfig copy(@NotNull String str, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PluginChartTimeframeConfig(str, i, j, j2);
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
        if (!(obj instanceof PluginChartTimeframeConfig)) {
            return false;
        }
        PluginChartTimeframeConfig pluginChartTimeframeConfig = (PluginChartTimeframeConfig) obj;
        return Intrinsics.EZpvd((Object) this.intervalMinutes, (Object) pluginChartTimeframeConfig.intervalMinutes) && this.approximateDataPoints == pluginChartTimeframeConfig.approximateDataPoints && this.startTimestamp == pluginChartTimeframeConfig.startTimestamp && this.endTimestamp == pluginChartTimeframeConfig.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApproximateDataPoints() {
        return this.approximateDataPoints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntervalMinutes() {
        return this.intervalMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.intervalMinutes.hashCode() * 31) + Integer.hashCode(this.approximateDataPoints)) * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PluginChartTimeframeConfig(intervalMinutes=" + this.intervalMinutes + ", approximateDataPoints=" + this.approximateDataPoints + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.intervalMinutes);
        parcel.writeInt(this.approximateDataPoints);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.PluginChartTimeframeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PluginChartTimeframeConfig> serializer() {
            return PluginChartTimeframeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PluginChartTimeframeConfig(int i, String str, int i2, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PluginChartTimeframeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.intervalMinutes = str;
        this.approximateDataPoints = i2;
        this.startTimestamp = j;
        this.endTimestamp = j2;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(PluginChartTimeframeConfig pluginChartTimeframeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pluginChartTimeframeConfig.intervalMinutes);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, pluginChartTimeframeConfig.approximateDataPoints);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, pluginChartTimeframeConfig.startTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, pluginChartTimeframeConfig.endTimestamp);
    }

    public PluginChartTimeframeConfig(@NotNull String str, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intervalMinutes = str;
        this.approximateDataPoints = i;
        this.startTimestamp = j;
        this.endTimestamp = j2;
    }
}
