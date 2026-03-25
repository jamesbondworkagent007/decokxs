package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseUserConfigDto {
    private final TypingIndicatorConfigDto typingIndicator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseUserConfigDto() {
        this((TypingIndicatorConfigDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseUserConfigDto copy$default(InHouseUserConfigDto inHouseUserConfigDto, TypingIndicatorConfigDto typingIndicatorConfigDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typingIndicatorConfigDto = inHouseUserConfigDto.typingIndicator;
        }
        return inHouseUserConfigDto.copy(typingIndicatorConfigDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TypingIndicatorConfigDto component1() {
        return this.typingIndicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserConfigDto copy(TypingIndicatorConfigDto typingIndicatorConfigDto) {
        return new InHouseUserConfigDto(typingIndicatorConfigDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InHouseUserConfigDto) && Intrinsics.EZpvd(this.typingIndicator, ((InHouseUserConfigDto) obj).typingIndicator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TypingIndicatorConfigDto getTypingIndicator() {
        return this.typingIndicator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TypingIndicatorConfigDto typingIndicatorConfigDto = this.typingIndicator;
        if (typingIndicatorConfigDto == null) {
            return 0;
        }
        return typingIndicatorConfigDto.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseUserConfigDto(typingIndicator=" + this.typingIndicator + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseUserConfigDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseUserConfigDto> serializer() {
            return InHouseUserConfigDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseUserConfigDto(int i, TypingIndicatorConfigDto typingIndicatorConfigDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.typingIndicator = null;
        } else {
            this.typingIndicator = typingIndicatorConfigDto;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseUserConfigDto inHouseUserConfigDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && inHouseUserConfigDto.typingIndicator == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TypingIndicatorConfigDto$$serializer.INSTANCE, inHouseUserConfigDto.typingIndicator);
    }

    public InHouseUserConfigDto(TypingIndicatorConfigDto typingIndicatorConfigDto) {
        this.typingIndicator = typingIndicatorConfigDto;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.TypingIndicatorConfigDto:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.TypingIndicatorConfigDto) : (r1v0 com.okinc.okimcore.model.remote.TypingIndicatorConfigDto))
 A[MD:(com.okinc.okimcore.model.remote.TypingIndicatorConfigDto):void (m)] (LINE:25) call: com.okinc.okimcore.model.remote.InHouseUserConfigDto.<init>(com.okinc.okimcore.model.remote.TypingIndicatorConfigDto):void type: THIS */
    public /* synthetic */ InHouseUserConfigDto(TypingIndicatorConfigDto typingIndicatorConfigDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typingIndicatorConfigDto);
    }
}
