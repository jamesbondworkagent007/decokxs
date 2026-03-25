package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class GridProfitAutoReinvestPreCheckRequest implements Parcelable {
    private final String ordType;
    private final Boolean reserveFunds;
    private final String sourceCcy;
    private final TrailingConfig trailingDownConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GridProfitAutoReinvestPreCheckRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<GridProfitAutoReinvestPreCheckRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestPreCheckRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            TrailingConfig trailingConfigCreateFromParcel = parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GridProfitAutoReinvestPreCheckRequest(string, string2, trailingConfigCreateFromParcel, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridProfitAutoReinvestPreCheckRequest[] newArray(int i) {
            return new GridProfitAutoReinvestPreCheckRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitAutoReinvestPreCheckRequest copy$default(GridProfitAutoReinvestPreCheckRequest gridProfitAutoReinvestPreCheckRequest, String str, String str2, TrailingConfig trailingConfig, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridProfitAutoReinvestPreCheckRequest.ordType;
        }
        if ((i & 2) != 0) {
            str2 = gridProfitAutoReinvestPreCheckRequest.sourceCcy;
        }
        if ((i & 4) != 0) {
            trailingConfig = gridProfitAutoReinvestPreCheckRequest.trailingDownConfig;
        }
        if ((i & 8) != 0) {
            bool = gridProfitAutoReinvestPreCheckRequest.reserveFunds;
        }
        return gridProfitAutoReinvestPreCheckRequest.copy(str, str2, trailingConfig, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component3() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitAutoReinvestPreCheckRequest copy(@NotNull String str, String str2, TrailingConfig trailingConfig, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridProfitAutoReinvestPreCheckRequest(str, str2, trailingConfig, bool);
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
        if (!(obj instanceof GridProfitAutoReinvestPreCheckRequest)) {
            return false;
        }
        GridProfitAutoReinvestPreCheckRequest gridProfitAutoReinvestPreCheckRequest = (GridProfitAutoReinvestPreCheckRequest) obj;
        return Intrinsics.EZpvd((Object) this.ordType, (Object) gridProfitAutoReinvestPreCheckRequest.ordType) && Intrinsics.EZpvd((Object) this.sourceCcy, (Object) gridProfitAutoReinvestPreCheckRequest.sourceCcy) && Intrinsics.EZpvd(this.trailingDownConfig, gridProfitAutoReinvestPreCheckRequest.trailingDownConfig) && Intrinsics.EZpvd(this.reserveFunds, gridProfitAutoReinvestPreCheckRequest.reserveFunds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ordType.hashCode();
        String str = this.sourceCcy;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        TrailingConfig trailingConfig = this.trailingDownConfig;
        int iHashCode3 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        Boolean bool = this.reserveFunds;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitAutoReinvestPreCheckRequest(ordType=" + this.ordType + ", sourceCcy=" + this.sourceCcy + ", trailingDownConfig=" + this.trailingDownConfig + ", reserveFunds=" + this.reserveFunds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ordType);
        parcel.writeString(this.sourceCcy);
        TrailingConfig trailingConfig = this.trailingDownConfig;
        if (trailingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig.writeToParcel(parcel, i);
        }
        Boolean bool = this.reserveFunds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitAutoReinvestPreCheckRequest> serializer() {
            return GridProfitAutoReinvestPreCheckRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitAutoReinvestPreCheckRequest(int i, String str, String str2, TrailingConfig trailingConfig, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GridProfitAutoReinvestPreCheckRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.ordType = str;
        if ((i & 2) == 0) {
            this.sourceCcy = null;
        } else {
            this.sourceCcy = str2;
        }
        if ((i & 4) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig;
        }
        if ((i & 8) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitAutoReinvestPreCheckRequest gridProfitAutoReinvestPreCheckRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gridProfitAutoReinvestPreCheckRequest.ordType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gridProfitAutoReinvestPreCheckRequest.sourceCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gridProfitAutoReinvestPreCheckRequest.sourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gridProfitAutoReinvestPreCheckRequest.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TrailingConfig$$serializer.INSTANCE, gridProfitAutoReinvestPreCheckRequest.trailingDownConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && gridProfitAutoReinvestPreCheckRequest.reserveFunds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, gridProfitAutoReinvestPreCheckRequest.reserveFunds);
    }

    public GridProfitAutoReinvestPreCheckRequest(@NotNull String str, String str2, TrailingConfig trailingConfig, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
        this.sourceCcy = str2;
        this.trailingDownConfig = trailingConfig;
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r4v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, java.lang.Boolean):void (m)] (LINE:5638) call: com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckRequest.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TrailingConfig, java.lang.Boolean):void type: THIS */
    public /* synthetic */ GridProfitAutoReinvestPreCheckRequest(String str, String str2, TrailingConfig trailingConfig, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : trailingConfig, (i & 8) != 0 ? null : bool);
    }
}
