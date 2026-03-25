package com.okinc.planet.widget.chart.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C46414tTl;
import o.C46417tTo;
import o.InterfaceC46484tWa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ChartProfileNewData implements InterfaceC46484tWa, Parcelable {
    public final BigDecimal pnl;
    public final BigDecimal pnlRatio;
    public final long timestamp;
    public final BigDecimal value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChartProfileNewData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChartProfileNewData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileNewData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartProfileNewData(parcel.readLong(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileNewData[] newArray(int i) {
            return new ChartProfileNewData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChartProfileNewData copy$default(ChartProfileNewData chartProfileNewData, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chartProfileNewData.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            bigDecimal = chartProfileNewData.value;
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if ((i & 4) != 0) {
            bigDecimal2 = chartProfileNewData.pnl;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 8) != 0) {
            bigDecimal3 = chartProfileNewData.pnlRatio;
        }
        return chartProfileNewData.OLrzqt(j2, bigDecimal4, bigDecimal5, bigDecimal3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal AEQbTJ() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal EZpvd() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46484tWa
    public long OLrzqt() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartProfileNewData OLrzqt(long j, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        return new ChartProfileNewData(j, bigDecimal, bigDecimal2, bigDecimal3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
    @Override // o.InterfaceC46484tWa
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BigDecimal KWHzl() {
        return this.value;
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
        if (!(obj instanceof ChartProfileNewData)) {
            return false;
        }
        ChartProfileNewData chartProfileNewData = (ChartProfileNewData) obj;
        return this.timestamp == chartProfileNewData.timestamp && Intrinsics.EZpvd(this.value, chartProfileNewData.value) && Intrinsics.EZpvd(this.pnl, chartProfileNewData.pnl) && Intrinsics.EZpvd(this.pnlRatio, chartProfileNewData.pnlRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + this.value.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartProfileNewData(timestamp=" + this.timestamp + ", value=" + this.value + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.timestamp);
        parcel.writeSerializable(this.value);
        parcel.writeSerializable(this.pnl);
        parcel.writeSerializable(this.pnlRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.widget.chart.profile.ChartProfileNewData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartProfileNewData> serializer() {
            return ChartProfileNewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartProfileNewData(int i, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ChartProfileNewData$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.value = bigDecimal;
        this.pnl = bigDecimal2;
        this.pnlRatio = bigDecimal3;
    }

    public static final /* synthetic */ void copydefault(ChartProfileNewData chartProfileNewData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(chartProfileNewData.OLrzqt()));
        C46414tTl c46414tTl = C46414tTl.KWHzl;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, c46414tTl, chartProfileNewData.KWHzl());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, c46414tTl, chartProfileNewData.pnl);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, c46414tTl, chartProfileNewData.pnlRatio);
    }

    public ChartProfileNewData(long j, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        this.timestamp = j;
        this.value = bigDecimal;
        this.pnl = bigDecimal2;
        this.pnlRatio = bigDecimal3;
    }
}
