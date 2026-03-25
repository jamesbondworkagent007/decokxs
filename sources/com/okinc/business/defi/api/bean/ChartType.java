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
public final class ChartType implements Parcelable {
    public static final int $stable = 0;
    private final int chartTypeId;
    private final String chartTypeMsg;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChartType> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChartType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChartType(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartType[] newArray(int i) {
            return new ChartType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChartType copy$default(ChartType chartType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chartType.chartTypeId;
        }
        if ((i2 & 2) != 0) {
            str = chartType.chartTypeMsg;
        }
        return chartType.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chartTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chartTypeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartType copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ChartType(i, str);
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
        if (!(obj instanceof ChartType)) {
            return false;
        }
        ChartType chartType = (ChartType) obj;
        return this.chartTypeId == chartType.chartTypeId && Intrinsics.EZpvd((Object) this.chartTypeMsg, (Object) chartType.chartTypeMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChartTypeId() {
        return this.chartTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChartTypeMsg() {
        return this.chartTypeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.chartTypeId) * 31) + this.chartTypeMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartType(chartTypeId=" + this.chartTypeId + ", chartTypeMsg=" + this.chartTypeMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chartTypeId);
        parcel.writeString(this.chartTypeMsg);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.ChartType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartType> serializer() {
            return ChartType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartType(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ChartType$$serializer.INSTANCE.getDescriptor());
        }
        this.chartTypeId = i2;
        this.chartTypeMsg = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(ChartType chartType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, chartType.chartTypeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, chartType.chartTypeMsg);
    }

    public ChartType(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chartTypeId = i;
        this.chartTypeMsg = str;
    }
}
