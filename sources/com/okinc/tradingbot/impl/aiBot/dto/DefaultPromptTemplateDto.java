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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DefaultPromptTemplateDto {
    public final List<String> defaultPromptTemplates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultPromptTemplateDto() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.dto.DefaultPromptTemplateDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultPromptTemplateDto copy$default(DefaultPromptTemplateDto defaultPromptTemplateDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = defaultPromptTemplateDto.defaultPromptTemplates;
        }
        return defaultPromptTemplateDto.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultPromptTemplateDto AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DefaultPromptTemplateDto(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.defaultPromptTemplates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultPromptTemplateDto) && Intrinsics.EZpvd(this.defaultPromptTemplates, ((DefaultPromptTemplateDto) obj).defaultPromptTemplates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.defaultPromptTemplates.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultPromptTemplateDto(defaultPromptTemplates=" + this.defaultPromptTemplates + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.DefaultPromptTemplateDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefaultPromptTemplateDto> serializer() {
            return DefaultPromptTemplateDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefaultPromptTemplateDto(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.defaultPromptTemplates = yDY.AhwBna();
        } else {
            this.defaultPromptTemplates = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(DefaultPromptTemplateDto defaultPromptTemplateDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(defaultPromptTemplateDto.defaultPromptTemplates, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], defaultPromptTemplateDto.defaultPromptTemplates);
    }

    public DefaultPromptTemplateDto(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.defaultPromptTemplates = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r1v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>):void (m)] (LINE:10) call: com.okinc.tradingbot.impl.aiBot.dto.DefaultPromptTemplateDto.<init>(java.util.List):void type: THIS */
    public /* synthetic */ DefaultPromptTemplateDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
