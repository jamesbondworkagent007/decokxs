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
public final class GridProfitAutoReinvestPreCheckResponse implements Parcelable {
    public static final int $stable = 0;
    private final GridProfitAutoReinvestResponse profitAutoReinvest;
    private final String strategyType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GridProfitAutoReinvestPreCheckResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<GridProfitAutoReinvestPreCheckResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestPreCheckResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridProfitAutoReinvestPreCheckResponse(parcel.readInt() == 0 ? null : GridProfitAutoReinvestResponse.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestPreCheckResponse[] newArray(int i) {
            return new GridProfitAutoReinvestPreCheckResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitAutoReinvestPreCheckResponse copy$default(GridProfitAutoReinvestPreCheckResponse gridProfitAutoReinvestPreCheckResponse, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            gridProfitAutoReinvestResponse = gridProfitAutoReinvestPreCheckResponse.profitAutoReinvest;
        }
        if ((i & 2) != 0) {
            str = gridProfitAutoReinvestPreCheckResponse.strategyType;
        }
        return gridProfitAutoReinvestPreCheckResponse.copy(gridProfitAutoReinvestResponse, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse component1() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestPreCheckResponse copy(GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridProfitAutoReinvestPreCheckResponse(gridProfitAutoReinvestResponse, str);
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
        if (!(obj instanceof GridProfitAutoReinvestPreCheckResponse)) {
            return false;
        }
        GridProfitAutoReinvestPreCheckResponse gridProfitAutoReinvestPreCheckResponse = (GridProfitAutoReinvestPreCheckResponse) obj;
        return Intrinsics.EZpvd(this.profitAutoReinvest, gridProfitAutoReinvestPreCheckResponse.profitAutoReinvest) && Intrinsics.EZpvd((Object) this.strategyType, (Object) gridProfitAutoReinvestPreCheckResponse.strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestResponse getProfitAutoReinvest() {
        return this.profitAutoReinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        return ((gridProfitAutoReinvestResponse == null ? 0 : gridProfitAutoReinvestResponse.hashCode()) * 31) + this.strategyType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitAutoReinvestPreCheckResponse(profitAutoReinvest=" + this.profitAutoReinvest + ", strategyType=" + this.strategyType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse = this.profitAutoReinvest;
        if (gridProfitAutoReinvestResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gridProfitAutoReinvestResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.strategyType);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitAutoReinvestPreCheckResponse> serializer() {
            return GridProfitAutoReinvestPreCheckResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitAutoReinvestPreCheckResponse(int i, GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GridProfitAutoReinvestPreCheckResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        if ((i & 2) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitAutoReinvestPreCheckResponse gridProfitAutoReinvestPreCheckResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GridProfitAutoReinvestResponse$$serializer.INSTANCE, gridProfitAutoReinvestPreCheckResponse.profitAutoReinvest);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) gridProfitAutoReinvestPreCheckResponse.strategyType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gridProfitAutoReinvestPreCheckResponse.strategyType);
    }

    public GridProfitAutoReinvestPreCheckResponse(GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitAutoReinvest = gridProfitAutoReinvestResponse;
        this.strategyType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse, java.lang.String):void (m)] (LINE:5630) call: com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse.<init>(com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitAutoReinvestPreCheckResponse(GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gridProfitAutoReinvestResponse, (i & 2) != 0 ? "" : str);
    }
}
