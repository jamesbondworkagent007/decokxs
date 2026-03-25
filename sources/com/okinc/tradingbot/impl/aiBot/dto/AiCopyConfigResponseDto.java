package com.okinc.tradingbot.impl.aiBot.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AiCopyConfigResponseDto implements Parcelable {
    public final AiOrderReq aiBot;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = AiOrderReq.$stable;
    public static final Parcelable.Creator<AiCopyConfigResponseDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AiCopyConfigResponseDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiCopyConfigResponseDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AiCopyConfigResponseDto((AiOrderReq) parcel.readParcelable(AiCopyConfigResponseDto.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiCopyConfigResponseDto[] newArray(int i) {
            return new AiCopyConfigResponseDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AiCopyConfigResponseDto copy$default(AiCopyConfigResponseDto aiCopyConfigResponseDto, AiOrderReq aiOrderReq, int i, Object obj) {
        if ((i & 1) != 0) {
            aiOrderReq = aiCopyConfigResponseDto.aiBot;
        }
        return aiCopyConfigResponseDto.copydefault(aiOrderReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiOrderReq AEQbTJ() {
        return this.aiBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiCopyConfigResponseDto copydefault(@NotNull AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(aiOrderReq, "");
        return new AiCopyConfigResponseDto(aiOrderReq);
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
        return (obj instanceof AiCopyConfigResponseDto) && Intrinsics.EZpvd(this.aiBot, ((AiCopyConfigResponseDto) obj).aiBot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.aiBot.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiCopyConfigResponseDto(aiBot=" + this.aiBot + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.aiBot, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.AiCopyConfigResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AiCopyConfigResponseDto> serializer() {
            return AiCopyConfigResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiCopyConfigResponseDto(int i, AiOrderReq aiOrderReq, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AiCopyConfigResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.aiBot = aiOrderReq;
    }

    public AiCopyConfigResponseDto(@NotNull AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(aiOrderReq, "");
        this.aiBot = aiOrderReq;
    }
}
