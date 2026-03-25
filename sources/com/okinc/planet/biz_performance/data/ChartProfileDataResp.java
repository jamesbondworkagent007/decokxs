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
public final class ChartProfileDataResp implements Parcelable {
    public final BigDecimal pnl;
    public final BigDecimal pnlRatio;
    public final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChartProfileDataResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChartProfileDataResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileDataResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartProfileDataResp(parcel.readLong(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartProfileDataResp[] newArray(int i) {
            return new ChartProfileDataResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChartProfileDataResp copy$default(ChartProfileDataResp chartProfileDataResp, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chartProfileDataResp.timestamp;
        }
        if ((i & 2) != 0) {
            bigDecimal = chartProfileDataResp.pnl;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = chartProfileDataResp.pnlRatio;
        }
        return chartProfileDataResp.copydefault(j, bigDecimal, bigDecimal2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal OLrzqt() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartProfileDataResp copydefault(long j, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        return new ChartProfileDataResp(j, bigDecimal, bigDecimal2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal copydefault() {
        return this.pnl;
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
        if (!(obj instanceof ChartProfileDataResp)) {
            return false;
        }
        ChartProfileDataResp chartProfileDataResp = (ChartProfileDataResp) obj;
        return this.timestamp == chartProfileDataResp.timestamp && Intrinsics.EZpvd(this.pnl, chartProfileDataResp.pnl) && Intrinsics.EZpvd(this.pnlRatio, chartProfileDataResp.pnlRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.pnl.hashCode()) * 31) + this.pnlRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartProfileDataResp(timestamp=" + this.timestamp + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.timestamp);
        parcel.writeSerializable(this.pnl);
        parcel.writeSerializable(this.pnlRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.ChartProfileDataResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartProfileDataResp> serializer() {
            return ChartProfileDataResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartProfileDataResp(int i, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ChartProfileDataResp$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.pnl = bigDecimal;
        this.pnlRatio = bigDecimal2;
    }

    public static final /* synthetic */ void OLrzqt(ChartProfileDataResp chartProfileDataResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C46417tTo.KWHzl, Long.valueOf(chartProfileDataResp.timestamp));
        C46414tTl c46414tTl = C46414tTl.KWHzl;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, c46414tTl, chartProfileDataResp.pnl);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, c46414tTl, chartProfileDataResp.pnlRatio);
    }

    public ChartProfileDataResp(long j, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        this.timestamp = j;
        this.pnl = bigDecimal;
        this.pnlRatio = bigDecimal2;
    }
}
