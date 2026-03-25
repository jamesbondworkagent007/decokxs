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
public final class IndicatorCategoryDto {
    public final List<IndicatorDto> indicators;
    public final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IndicatorDto$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndicatorCategoryDto() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.dto.IndicatorCategoryDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorCategoryDto copy$default(IndicatorCategoryDto indicatorCategoryDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorCategoryDto.name;
        }
        if ((i & 2) != 0) {
            list = indicatorCategoryDto.indicators;
        }
        return indicatorCategoryDto.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IndicatorDto> AEQbTJ() {
        return this.indicators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicatorCategoryDto copydefault(@NotNull String str, @NotNull List<IndicatorDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new IndicatorCategoryDto(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorCategoryDto)) {
            return false;
        }
        IndicatorCategoryDto indicatorCategoryDto = (IndicatorCategoryDto) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) indicatorCategoryDto.name) && Intrinsics.EZpvd(this.indicators, indicatorCategoryDto.indicators);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + this.indicators.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicatorCategoryDto(name=" + this.name + ", indicators=" + this.indicators + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.IndicatorCategoryDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IndicatorCategoryDto> serializer() {
            return IndicatorCategoryDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndicatorCategoryDto(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.indicators = yDY.AhwBna();
        } else {
            this.indicators = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(IndicatorCategoryDto indicatorCategoryDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) indicatorCategoryDto.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, indicatorCategoryDto.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(indicatorCategoryDto.indicators, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], indicatorCategoryDto.indicators);
    }

    public IndicatorCategoryDto(@NotNull String str, @NotNull List<IndicatorDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.indicators = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.tradingbot.impl.aiBot.dto.IndicatorDto>):void (m)] (LINE:20) call: com.okinc.tradingbot.impl.aiBot.dto.IndicatorCategoryDto.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ IndicatorCategoryDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
