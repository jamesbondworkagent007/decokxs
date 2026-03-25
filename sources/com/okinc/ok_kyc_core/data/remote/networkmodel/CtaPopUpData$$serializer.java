package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CtaPopUpData$$serializer implements GeneratedSerializer<CtaPopUpData> {
    public static final int $stable;
    public static final CtaPopUpData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CtaPopUpData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CtaPopUpData$$serializer ctaPopUpData$$serializer = new CtaPopUpData$$serializer();
        INSTANCE = ctaPopUpData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData", ctaPopUpData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        CTAButton$$serializer cTAButton$$serializer = CTAButton$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(cTAButton$$serializer), BuiltinSerializersKt.getNullable(cTAButton$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CtaPopUpData deserialize(@NotNull Decoder decoder) {
        CTAButton cTAButton;
        CTAButton cTAButton2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CTAButton$$serializer cTAButton$$serializer = CTAButton$$serializer.INSTANCE;
            cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, cTAButton$$serializer, null);
            cTAButton = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, cTAButton$$serializer, null);
            i = 3;
        } else {
            cTAButton = null;
            CTAButton cTAButton3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CTAButton$$serializer.INSTANCE, cTAButton3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    cTAButton = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CTAButton$$serializer.INSTANCE, cTAButton);
                    i2 |= 2;
                }
            }
            cTAButton2 = cTAButton3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CtaPopUpData(i, cTAButton2, cTAButton, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CtaPopUpData ctaPopUpData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ctaPopUpData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CtaPopUpData.write$Self$OKCompliance_ok_compliance_impl(ctaPopUpData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
