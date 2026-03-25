package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ChartData implements Parcelable {
    public static final int $stable = 0;
    private final String assetAmount;
    private final long dateTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChartData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChartData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartData(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartData[] newArray(int i) {
            return new ChartData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChartData copy$default(ChartData chartData, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartData.assetAmount;
        }
        if ((i & 2) != 0) {
            j = chartData.dateTime;
        }
        return chartData.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartData copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ChartData(str, j);
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
        if (!(obj instanceof ChartData)) {
            return false;
        }
        ChartData chartData = (ChartData) obj;
        return Intrinsics.EZpvd((Object) this.assetAmount, (Object) chartData.assetAmount) && this.dateTime == chartData.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.assetAmount.hashCode() * 31) + Long.hashCode(this.dateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartData(assetAmount=" + this.assetAmount + ", dateTime=" + this.dateTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.assetAmount);
        parcel.writeLong(this.dateTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.ChartData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartData> serializer() {
            return ChartData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartData(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ChartData$$serializer.INSTANCE.getDescriptor());
        }
        this.assetAmount = str;
        this.dateTime = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(ChartData chartData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chartData.assetAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, chartData.dateTime);
    }

    public ChartData(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.assetAmount = str;
        this.dateTime = j;
    }
}
