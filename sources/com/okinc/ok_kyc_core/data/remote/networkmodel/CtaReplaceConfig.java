package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaReplaceConfig {
    private final JsonElement item;
    private final int targetIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaReplaceConfig copy$default(CtaReplaceConfig ctaReplaceConfig, int i, JsonElement jsonElement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ctaReplaceConfig.targetIndex;
        }
        if ((i2 & 2) != 0) {
            jsonElement = ctaReplaceConfig.item;
        }
        return ctaReplaceConfig.copy(i, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component2() {
        return this.item;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaReplaceConfig copy(int i, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new CtaReplaceConfig(i, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaReplaceConfig)) {
            return false;
        }
        CtaReplaceConfig ctaReplaceConfig = (CtaReplaceConfig) obj;
        return this.targetIndex == ctaReplaceConfig.targetIndex && Intrinsics.EZpvd(this.item, ctaReplaceConfig.item);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getItem() {
        return this.item;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.targetIndex) * 31) + this.item.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaReplaceConfig(targetIndex=" + this.targetIndex + ", item=" + this.item + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaReplaceConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaReplaceConfig> serializer() {
            return CtaReplaceConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaReplaceConfig(int i, int i2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, CtaReplaceConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.targetIndex = 0;
        } else {
            this.targetIndex = i2;
        }
        this.item = jsonElement;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaReplaceConfig ctaReplaceConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaReplaceConfig.targetIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, ctaReplaceConfig.targetIndex);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, ctaReplaceConfig.item);
    }

    public CtaReplaceConfig(int i, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.targetIndex = i;
        this.item = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (r2v0 kotlinx.serialization.json.JsonElement)
 A[MD:(int, kotlinx.serialization.json.JsonElement):void (m)] (LINE:5341) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaReplaceConfig.<init>(int, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ CtaReplaceConfig(int i, JsonElement jsonElement, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, jsonElement);
    }
}
