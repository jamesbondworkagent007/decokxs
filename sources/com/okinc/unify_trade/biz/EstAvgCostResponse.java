package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class EstAvgCostResponse implements Parcelable {
    public static final int $stable = 0;
    private final String spotUpl;
    private final String spotUplRatio;
    private final String totalPnl;
    private final String totalPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EstAvgCostResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<EstAvgCostResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstAvgCostResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EstAvgCostResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstAvgCostResponse[] newArray(int i) {
            return new EstAvgCostResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstAvgCostResponse copy$default(EstAvgCostResponse estAvgCostResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estAvgCostResponse.spotUpl;
        }
        if ((i & 2) != 0) {
            str2 = estAvgCostResponse.spotUplRatio;
        }
        if ((i & 4) != 0) {
            str3 = estAvgCostResponse.totalPnl;
        }
        if ((i & 8) != 0) {
            str4 = estAvgCostResponse.totalPnlRatio;
        }
        return estAvgCostResponse.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spotUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstAvgCostResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EstAvgCostResponse(str, str2, str3, str4);
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
        if (!(obj instanceof EstAvgCostResponse)) {
            return false;
        }
        EstAvgCostResponse estAvgCostResponse = (EstAvgCostResponse) obj;
        return Intrinsics.EZpvd((Object) this.spotUpl, (Object) estAvgCostResponse.spotUpl) && Intrinsics.EZpvd((Object) this.spotUplRatio, (Object) estAvgCostResponse.spotUplRatio) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) estAvgCostResponse.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) estAvgCostResponse.totalPnlRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUpl() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUplRatio() {
        return this.spotUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.spotUpl.hashCode() * 31) + this.spotUplRatio.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.totalPnlRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstAvgCostResponse(spotUpl=" + this.spotUpl + ", spotUplRatio=" + this.spotUplRatio + ", totalPnl=" + this.totalPnl + ", totalPnlRatio=" + this.totalPnlRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.spotUpl);
        parcel.writeString(this.spotUplRatio);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.totalPnlRatio);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EstAvgCostResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstAvgCostResponse> serializer() {
            return EstAvgCostResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstAvgCostResponse(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, EstAvgCostResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.spotUpl = str;
        this.spotUplRatio = str2;
        this.totalPnl = str3;
        this.totalPnlRatio = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EstAvgCostResponse estAvgCostResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, estAvgCostResponse.spotUpl);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, estAvgCostResponse.spotUplRatio);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, estAvgCostResponse.totalPnl);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, estAvgCostResponse.totalPnlRatio);
    }

    public EstAvgCostResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.spotUpl = str;
        this.spotUplRatio = str2;
        this.totalPnl = str3;
        this.totalPnlRatio = str4;
    }
}
