package com.okinc.planet.biz_userprofile.view.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC55169xeq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class HistoryTotalPnlChartDataPoint implements InterfaceC55169xeq<Number>, Parcelable {
    public static final int $stable = 0;
    public final String pnl;
    public final long timestamp;
    public final float value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HistoryTotalPnlChartDataPoint> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HistoryTotalPnlChartDataPoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryTotalPnlChartDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryTotalPnlChartDataPoint(parcel.readFloat(), parcel.readLong(), PlanetNumericString.CREATOR.createFromParcel(parcel).AEQbTJ(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryTotalPnlChartDataPoint[] newArray(int i) {
            return new HistoryTotalPnlChartDataPoint[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 float), (r2v0 long), (r4v0 java.lang.String) A[MD:(float, long, java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlChartDataPoint.<init>(float, long, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HistoryTotalPnlChartDataPoint(float f, long j, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 float)
  (r3v0 long)
  (r5v0 java.lang.String)
  (r6v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, float, long, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlChartDataPoint.<init>(int, float, long, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HistoryTotalPnlChartDataPoint(int i, float f, long j, String str, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, j, str, serializationConstructorMarker);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-TfqVun8$default, reason: not valid java name */
    public static /* synthetic */ HistoryTotalPnlChartDataPoint m7057copyTfqVun8$default(HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint, float f, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = historyTotalPnlChartDataPoint.value;
        }
        if ((i & 2) != 0) {
            j = historyTotalPnlChartDataPoint.timestamp;
        }
        if ((i & 4) != 0) {
            str = historyTotalPnlChartDataPoint.pnl;
        }
        return historyTotalPnlChartDataPoint.EZpvd(f, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryTotalPnlChartDataPoint EZpvd(float f, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HistoryTotalPnlChartDataPoint(f, j, str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long OLrzqt() {
        return this.timestamp;
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
        if (!(obj instanceof HistoryTotalPnlChartDataPoint)) {
            return false;
        }
        HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint = (HistoryTotalPnlChartDataPoint) obj;
        return Float.compare(this.value, historyTotalPnlChartDataPoint.value) == 0 && this.timestamp == historyTotalPnlChartDataPoint.timestamp && PlanetNumericString.EZpvd(this.pnl, historyTotalPnlChartDataPoint.pnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Float.hashCode(this.value) * 31) + Long.hashCode(this.timestamp)) * 31) + PlanetNumericString.EZpvd(this.pnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryTotalPnlChartDataPoint(value=" + this.value + ", timestamp=" + this.timestamp + ", pnl=" + PlanetNumericString.copydefault(this.pnl) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeFloat(this.value);
        parcel.writeLong(this.timestamp);
        PlanetNumericString.AEQbTJ(this.pnl, parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlChartDataPoint.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryTotalPnlChartDataPoint> serializer() {
            return HistoryTotalPnlChartDataPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryTotalPnlChartDataPoint(int i, float f, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.value = (i & 1) == 0 ? 0.0f : f;
        if ((i & 2) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((i & 4) == 0) {
            this.pnl = PlanetNumericString.Companion.EZpvd();
        } else {
            this.pnl = str;
        }
    }

    public static final /* synthetic */ void KWHzl(HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || Float.compare(historyTotalPnlChartDataPoint.KWHzl().floatValue(), 0.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 0, historyTotalPnlChartDataPoint.KWHzl().floatValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || historyTotalPnlChartDataPoint.OLrzqt() != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, historyTotalPnlChartDataPoint.OLrzqt());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && PlanetNumericString.EZpvd(historyTotalPnlChartDataPoint.pnl, PlanetNumericString.Companion.EZpvd())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(historyTotalPnlChartDataPoint.pnl));
    }

    public HistoryTotalPnlChartDataPoint(float f, long j, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = f;
        this.timestamp = j;
        this.pnl = str;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
    @Override // o.InterfaceC55169xeq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Float KWHzl() {
        return Float.valueOf(this.value);
    }
}
