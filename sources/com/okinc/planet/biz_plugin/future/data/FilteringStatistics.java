package com.okinc.planet.biz_plugin.future.data;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class FilteringStatistics implements Parcelable {
    public static final int $stable = 0;
    private final int filteredBuyOrdersCount;
    private final int filteredSellOrdersCount;
    private final int klinePointsCount;
    private final int originalBuyOrdersCount;
    private final int originalSellOrdersCount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FilteringStatistics> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FilteringStatistics> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteringStatistics createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilteringStatistics(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteringStatistics[] newArray(int i) {
            return new FilteringStatistics[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilteringStatistics copy$default(FilteringStatistics filteringStatistics, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = filteringStatistics.originalBuyOrdersCount;
        }
        if ((i6 & 2) != 0) {
            i2 = filteringStatistics.originalSellOrdersCount;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = filteringStatistics.filteredBuyOrdersCount;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = filteringStatistics.filteredSellOrdersCount;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = filteringStatistics.klinePointsCount;
        }
        return filteringStatistics.copy(i, i7, i8, i9, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.originalBuyOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.originalSellOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.filteredBuyOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.filteredSellOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.klinePointsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilteringStatistics copy(int i, int i2, int i3, int i4, int i5) {
        return new FilteringStatistics(i, i2, i3, i4, i5);
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
        if (!(obj instanceof FilteringStatistics)) {
            return false;
        }
        FilteringStatistics filteringStatistics = (FilteringStatistics) obj;
        return this.originalBuyOrdersCount == filteringStatistics.originalBuyOrdersCount && this.originalSellOrdersCount == filteringStatistics.originalSellOrdersCount && this.filteredBuyOrdersCount == filteringStatistics.filteredBuyOrdersCount && this.filteredSellOrdersCount == filteringStatistics.filteredSellOrdersCount && this.klinePointsCount == filteringStatistics.klinePointsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFilteredBuyOrdersCount() {
        return this.filteredBuyOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFilteredSellOrdersCount() {
        return this.filteredSellOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKlinePointsCount() {
        return this.klinePointsCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOriginalBuyOrdersCount() {
        return this.originalBuyOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOriginalSellOrdersCount() {
        return this.originalSellOrdersCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.originalBuyOrdersCount) * 31) + Integer.hashCode(this.originalSellOrdersCount)) * 31) + Integer.hashCode(this.filteredBuyOrdersCount)) * 31) + Integer.hashCode(this.filteredSellOrdersCount)) * 31) + Integer.hashCode(this.klinePointsCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilteringStatistics(originalBuyOrdersCount=" + this.originalBuyOrdersCount + ", originalSellOrdersCount=" + this.originalSellOrdersCount + ", filteredBuyOrdersCount=" + this.filteredBuyOrdersCount + ", filteredSellOrdersCount=" + this.filteredSellOrdersCount + ", klinePointsCount=" + this.klinePointsCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.originalBuyOrdersCount);
        parcel.writeInt(this.originalSellOrdersCount);
        parcel.writeInt(this.filteredBuyOrdersCount);
        parcel.writeInt(this.filteredSellOrdersCount);
        parcel.writeInt(this.klinePointsCount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FilteringStatistics.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilteringStatistics> serializer() {
            return FilteringStatistics$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilteringStatistics(int i, int i2, int i3, int i4, int i5, int i6, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, FilteringStatistics$$serializer.INSTANCE.getDescriptor());
        }
        this.originalBuyOrdersCount = i2;
        this.originalSellOrdersCount = i3;
        this.filteredBuyOrdersCount = i4;
        this.filteredSellOrdersCount = i5;
        this.klinePointsCount = i6;
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(FilteringStatistics filteringStatistics, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, filteringStatistics.originalBuyOrdersCount);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, filteringStatistics.originalSellOrdersCount);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, filteringStatistics.filteredBuyOrdersCount);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, filteringStatistics.filteredSellOrdersCount);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, filteringStatistics.klinePointsCount);
    }

    public FilteringStatistics(int i, int i2, int i3, int i4, int i5) {
        this.originalBuyOrdersCount = i;
        this.originalSellOrdersCount = i2;
        this.filteredBuyOrdersCount = i3;
        this.filteredSellOrdersCount = i4;
        this.klinePointsCount = i5;
    }

    public final String getCompressionRatio() {
        int i = this.originalBuyOrdersCount + this.originalSellOrdersCount;
        int i2 = this.filteredBuyOrdersCount + this.filteredSellOrdersCount;
        if (i == 0) {
            return "N/A";
        }
        return ((int) ((i2 / i) * 100)) + "% kept (" + i2 + "/" + i + ")";
    }
}
