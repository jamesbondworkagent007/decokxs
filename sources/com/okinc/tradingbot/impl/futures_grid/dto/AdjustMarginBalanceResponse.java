package com.okinc.tradingbot.impl.futures_grid.dto;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AdjustMarginBalanceResponse implements Parcelable {
    public static final int $stable = 0;
    private final String algoClOrdId;
    private final String algoId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AdjustMarginBalanceResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AdjustMarginBalanceResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdjustMarginBalanceResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdjustMarginBalanceResponse(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdjustMarginBalanceResponse[] newArray(int i) {
            return new AdjustMarginBalanceResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdjustMarginBalanceResponse copy$default(AdjustMarginBalanceResponse adjustMarginBalanceResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adjustMarginBalanceResponse.algoId;
        }
        if ((i & 2) != 0) {
            str2 = adjustMarginBalanceResponse.algoClOrdId;
        }
        return adjustMarginBalanceResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdjustMarginBalanceResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AdjustMarginBalanceResponse(str, str2);
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
        if (!(obj instanceof AdjustMarginBalanceResponse)) {
            return false;
        }
        AdjustMarginBalanceResponse adjustMarginBalanceResponse = (AdjustMarginBalanceResponse) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) adjustMarginBalanceResponse.algoId) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) adjustMarginBalanceResponse.algoClOrdId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + this.algoClOrdId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdjustMarginBalanceResponse(algoId=" + this.algoId + ", algoClOrdId=" + this.algoClOrdId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoClOrdId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.futures_grid.dto.AdjustMarginBalanceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdjustMarginBalanceResponse> serializer() {
            return AdjustMarginBalanceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdjustMarginBalanceResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AdjustMarginBalanceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.algoClOrdId = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AdjustMarginBalanceResponse adjustMarginBalanceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, adjustMarginBalanceResponse.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, adjustMarginBalanceResponse.algoClOrdId);
    }

    public AdjustMarginBalanceResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algoId = str;
        this.algoClOrdId = str2;
    }
}
