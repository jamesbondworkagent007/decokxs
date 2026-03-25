package com.okinc.planet.biz_performance.data;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ChartProfileCopyTrading implements Parcelable {
    public final BigDecimal ratio;
    public final long statTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChartProfileCopyTrading> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChartProfileCopyTrading> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileCopyTrading createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartProfileCopyTrading(parcel.readLong(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileCopyTrading[] newArray(int i) {
            return new ChartProfileCopyTrading[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChartProfileCopyTrading copy$default(ChartProfileCopyTrading chartProfileCopyTrading, long j, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chartProfileCopyTrading.statTime;
        }
        if ((i & 2) != 0) {
            bigDecimal = chartProfileCopyTrading.ratio;
        }
        return chartProfileCopyTrading.EZpvd(j, bigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.statTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartProfileCopyTrading EZpvd(long j, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return new ChartProfileCopyTrading(j, bigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal KWHzl() {
        return this.ratio;
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
        if (!(obj instanceof ChartProfileCopyTrading)) {
            return false;
        }
        ChartProfileCopyTrading chartProfileCopyTrading = (ChartProfileCopyTrading) obj;
        return this.statTime == chartProfileCopyTrading.statTime && Intrinsics.EZpvd(this.ratio, chartProfileCopyTrading.ratio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.statTime) * 31) + this.ratio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartProfileCopyTrading(statTime=" + this.statTime + ", ratio=" + this.ratio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.statTime);
        parcel.writeSerializable(this.ratio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.ChartProfileCopyTrading.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartProfileCopyTrading> serializer() {
            return ChartProfileCopyTrading$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartProfileCopyTrading(int i, long j, BigDecimal bigDecimal, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ChartProfileCopyTrading$$serializer.INSTANCE.getDescriptor());
        }
        this.statTime = j;
        this.ratio = bigDecimal;
    }

    public static final /* synthetic */ void copydefault(ChartProfileCopyTrading chartProfileCopyTrading, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(chartProfileCopyTrading.statTime));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, chartProfileCopyTrading.ratio);
    }

    public ChartProfileCopyTrading(long j, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.statTime = j;
        this.ratio = bigDecimal;
    }
}
