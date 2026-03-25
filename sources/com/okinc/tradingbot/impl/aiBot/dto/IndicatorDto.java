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
public final class IndicatorDto {
    public final String description;
    public final String displayName;
    public final String name;
    public final List<ParamSpecDto> paramSpecs;
    public final boolean supportParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(ParamSpecDto$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndicatorDto() {
        this((String) null, (String) null, (String) null, false, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.aiBot.dto.IndicatorDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorDto copy$default(IndicatorDto indicatorDto, String str, String str2, String str3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorDto.name;
        }
        if ((i & 2) != 0) {
            str2 = indicatorDto.displayName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = indicatorDto.description;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = indicatorDto.supportParam;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = indicatorDto.paramSpecs;
        }
        return indicatorDto.copydefault(str, str4, str5, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ParamSpecDto> AEQbTJ() {
        return this.paramSpecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndicatorDto copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<ParamSpecDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new IndicatorDto(str, str2, str3, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorDto)) {
            return false;
        }
        IndicatorDto indicatorDto = (IndicatorDto) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) indicatorDto.name) && Intrinsics.EZpvd((Object) this.displayName, (Object) indicatorDto.displayName) && Intrinsics.EZpvd((Object) this.description, (Object) indicatorDto.description) && this.supportParam == indicatorDto.supportParam && Intrinsics.EZpvd(this.paramSpecs, indicatorDto.paramSpecs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.supportParam)) * 31) + this.paramSpecs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndicatorDto(name=" + this.name + ", displayName=" + this.displayName + ", description=" + this.description + ", supportParam=" + this.supportParam + ", paramSpecs=" + this.paramSpecs + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.IndicatorDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IndicatorDto> serializer() {
            return IndicatorDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IndicatorDto(int i, String str, String str2, String str3, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str2;
        }
        if ((i & 4) == 0) {
            this.description = "";
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.supportParam = false;
        } else {
            this.supportParam = z;
        }
        if ((i & 16) == 0) {
            this.paramSpecs = yDY.AhwBna();
        } else {
            this.paramSpecs = list;
        }
    }

    public static final /* synthetic */ void OLrzqt(IndicatorDto indicatorDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) indicatorDto.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, indicatorDto.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) indicatorDto.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, indicatorDto.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) indicatorDto.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, indicatorDto.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || indicatorDto.supportParam) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, indicatorDto.supportParam);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(indicatorDto.paramSpecs, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], indicatorDto.paramSpecs);
    }

    public IndicatorDto(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<ParamSpecDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.displayName = str2;
        this.description = str3;
        this.supportParam = z;
        this.paramSpecs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.tradingbot.impl.aiBot.dto.ParamSpecDto>):void (m)] (LINE:29) call: com.okinc.tradingbot.impl.aiBot.dto.IndicatorDto.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ IndicatorDto(String str, String str2, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? yDY.AhwBna() : list);
    }
}
