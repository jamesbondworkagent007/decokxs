package com.okinc.tradingbot.impl.aiBot.dto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class TechnicalIndicatorsResponseDto {
    public final List<IndicatorCategoryDto> categories;
    public final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IndicatorCategoryDto$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TechnicalIndicatorsResponseDto() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TechnicalIndicatorsResponseDto copy$default(TechnicalIndicatorsResponseDto technicalIndicatorsResponseDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = technicalIndicatorsResponseDto.total;
        }
        if ((i2 & 2) != 0) {
            list = technicalIndicatorsResponseDto.categories;
        }
        return technicalIndicatorsResponseDto.EZpvd(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TechnicalIndicatorsResponseDto EZpvd(int i, @NotNull List<IndicatorCategoryDto> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TechnicalIndicatorsResponseDto(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndicatorCategoryDto> OLrzqt() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TechnicalIndicatorsResponseDto)) {
            return false;
        }
        TechnicalIndicatorsResponseDto technicalIndicatorsResponseDto = (TechnicalIndicatorsResponseDto) obj;
        return this.total == technicalIndicatorsResponseDto.total && Intrinsics.EZpvd(this.categories, technicalIndicatorsResponseDto.categories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.categories.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TechnicalIndicatorsResponseDto(total=" + this.total + ", categories=" + this.categories + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TechnicalIndicatorsResponseDto> serializer() {
            return TechnicalIndicatorsResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TechnicalIndicatorsResponseDto(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.total = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.categories = yDY.AhwBna();
        } else {
            this.categories = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TechnicalIndicatorsResponseDto technicalIndicatorsResponseDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || technicalIndicatorsResponseDto.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, technicalIndicatorsResponseDto.total);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(technicalIndicatorsResponseDto.categories, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], technicalIndicatorsResponseDto.categories);
    }

    public TechnicalIndicatorsResponseDto(int i, @NotNull List<IndicatorCategoryDto> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.total = i;
        this.categories = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.tradingbot.impl.aiBot.dto.IndicatorCategoryDto>):void (m)] (LINE:11) call: com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ TechnicalIndicatorsResponseDto(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }
}
