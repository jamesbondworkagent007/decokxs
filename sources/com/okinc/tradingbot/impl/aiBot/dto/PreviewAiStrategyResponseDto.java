package com.okinc.tradingbot.impl.aiBot.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PreviewAiStrategyResponseDto implements Parcelable {
    public static final int $stable = 0;
    public final String marketData;
    public final String operatingGuidelines;
    public final String status;
    public final String tradingStrategy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PreviewAiStrategyResponseDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PreviewAiStrategyResponseDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreviewAiStrategyResponseDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PreviewAiStrategyResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreviewAiStrategyResponseDto[] newArray(int i) {
            return new PreviewAiStrategyResponseDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreviewAiStrategyResponseDto() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreviewAiStrategyResponseDto copy$default(PreviewAiStrategyResponseDto previewAiStrategyResponseDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewAiStrategyResponseDto.tradingStrategy;
        }
        if ((i & 2) != 0) {
            str2 = previewAiStrategyResponseDto.operatingGuidelines;
        }
        if ((i & 4) != 0) {
            str3 = previewAiStrategyResponseDto.marketData;
        }
        if ((i & 8) != 0) {
            str4 = previewAiStrategyResponseDto.status;
        }
        return previewAiStrategyResponseDto.copydefault(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.tradingStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.operatingGuidelines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreviewAiStrategyResponseDto copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PreviewAiStrategyResponseDto(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.marketData;
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
        if (!(obj instanceof PreviewAiStrategyResponseDto)) {
            return false;
        }
        PreviewAiStrategyResponseDto previewAiStrategyResponseDto = (PreviewAiStrategyResponseDto) obj;
        return Intrinsics.EZpvd((Object) this.tradingStrategy, (Object) previewAiStrategyResponseDto.tradingStrategy) && Intrinsics.EZpvd((Object) this.operatingGuidelines, (Object) previewAiStrategyResponseDto.operatingGuidelines) && Intrinsics.EZpvd((Object) this.marketData, (Object) previewAiStrategyResponseDto.marketData) && Intrinsics.EZpvd((Object) this.status, (Object) previewAiStrategyResponseDto.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tradingStrategy.hashCode();
        int iHashCode2 = this.operatingGuidelines.hashCode();
        int iHashCode3 = this.marketData.hashCode();
        String str = this.status;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreviewAiStrategyResponseDto(tradingStrategy=" + this.tradingStrategy + ", operatingGuidelines=" + this.operatingGuidelines + ", marketData=" + this.marketData + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tradingStrategy);
        parcel.writeString(this.operatingGuidelines);
        parcel.writeString(this.marketData);
        parcel.writeString(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PreviewAiStrategyResponseDto> serializer() {
            return PreviewAiStrategyResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PreviewAiStrategyResponseDto(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradingStrategy = "";
        } else {
            this.tradingStrategy = str;
        }
        if ((i & 2) == 0) {
            this.operatingGuidelines = "";
        } else {
            this.operatingGuidelines = str2;
        }
        if ((i & 4) == 0) {
            this.marketData = "";
        } else {
            this.marketData = str3;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(PreviewAiStrategyResponseDto previewAiStrategyResponseDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) previewAiStrategyResponseDto.tradingStrategy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, previewAiStrategyResponseDto.tradingStrategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) previewAiStrategyResponseDto.operatingGuidelines, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, previewAiStrategyResponseDto.operatingGuidelines);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) previewAiStrategyResponseDto.marketData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, previewAiStrategyResponseDto.marketData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && previewAiStrategyResponseDto.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, previewAiStrategyResponseDto.status);
    }

    public PreviewAiStrategyResponseDto(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tradingStrategy = str;
        this.operatingGuidelines = str2;
        this.marketData = str3;
        this.status = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PreviewAiStrategyResponseDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }
}
