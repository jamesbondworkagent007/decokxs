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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class TpSlLimitDto implements Parcelable {
    public static final int $stable = 0;
    public final MinMaxDto sl;
    public final MinMaxDto tp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TpSlLimitDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TpSlLimitDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlLimitDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<MinMaxDto> creator = MinMaxDto.CREATOR;
            return new TpSlLimitDto(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlLimitDto[] newArray(int i) {
            return new TpSlLimitDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TpSlLimitDto() {
        this((MinMaxDto) null, (MinMaxDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TpSlLimitDto copy$default(TpSlLimitDto tpSlLimitDto, MinMaxDto minMaxDto, MinMaxDto minMaxDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            minMaxDto = tpSlLimitDto.tp;
        }
        if ((i & 2) != 0) {
            minMaxDto2 = tpSlLimitDto.sl;
        }
        return tpSlLimitDto.EZpvd(minMaxDto, minMaxDto2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxDto EZpvd() {
        return this.sl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlLimitDto EZpvd(@NotNull MinMaxDto minMaxDto, @NotNull MinMaxDto minMaxDto2) {
        Intrinsics.checkNotNullParameter(minMaxDto, "");
        Intrinsics.checkNotNullParameter(minMaxDto2, "");
        return new TpSlLimitDto(minMaxDto, minMaxDto2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxDto KWHzl() {
        return this.tp;
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
        if (!(obj instanceof TpSlLimitDto)) {
            return false;
        }
        TpSlLimitDto tpSlLimitDto = (TpSlLimitDto) obj;
        return Intrinsics.EZpvd(this.tp, tpSlLimitDto.tp) && Intrinsics.EZpvd(this.sl, tpSlLimitDto.sl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tp.hashCode() * 31) + this.sl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TpSlLimitDto(tp=" + this.tp + ", sl=" + this.sl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.tp.writeToParcel(parcel, i);
        this.sl.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TpSlLimitDto> serializer() {
            return TpSlLimitDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TpSlLimitDto(int i, MinMaxDto minMaxDto, MinMaxDto minMaxDto2, SerializationConstructorMarker serializationConstructorMarker) {
        this.tp = (i & 1) == 0 ? new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null) : minMaxDto;
        if ((i & 2) == 0) {
            this.sl = new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.sl = minMaxDto2;
        }
    }

    public static final /* synthetic */ void KWHzl(TpSlLimitDto tpSlLimitDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tpSlLimitDto.tp, new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, MinMaxDto$$serializer.INSTANCE, tpSlLimitDto.tp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(tpSlLimitDto.sl, new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, MinMaxDto$$serializer.INSTANCE, tpSlLimitDto.sl);
    }

    public TpSlLimitDto(@NotNull MinMaxDto minMaxDto, @NotNull MinMaxDto minMaxDto2) {
        Intrinsics.checkNotNullParameter(minMaxDto, "");
        Intrinsics.checkNotNullParameter(minMaxDto2, "");
        this.tp = minMaxDto;
        this.sl = minMaxDto2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto:0x0008: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:46) call: com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto))
  (wrap:com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:47) call: com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto))
 A[MD:(com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto, com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto):void (m)] (LINE:45) call: com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto.<init>(com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto, com.okinc.tradingbot.impl.aiBot.dto.MinMaxDto):void type: THIS */
    public /* synthetic */ TpSlLimitDto(MinMaxDto minMaxDto, MinMaxDto minMaxDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null) : minMaxDto, (i & 2) != 0 ? new MinMaxDto((String) null, (String) null, 3, (DefaultConstructorMarker) null) : minMaxDto2);
    }
}
