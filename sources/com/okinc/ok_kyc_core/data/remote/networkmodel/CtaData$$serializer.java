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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CtaData$$serializer implements GeneratedSerializer<CtaData> {
    public static final int $stable;
    public static final CtaData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CtaData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CtaData$$serializer ctaData$$serializer = new CtaData$$serializer();
        INSTANCE = ctaData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData", ctaData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DialogCtaButton$$serializer dialogCtaButton$$serializer = DialogCtaButton$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(dialogCtaButton$$serializer), BuiltinSerializersKt.getNullable(dialogCtaButton$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CtaData deserialize(@NotNull Decoder decoder) {
        DialogCtaButton dialogCtaButton;
        DialogCtaButton dialogCtaButton2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DialogCtaButton$$serializer dialogCtaButton$$serializer = DialogCtaButton$$serializer.INSTANCE;
            dialogCtaButton2 = (DialogCtaButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, dialogCtaButton$$serializer, null);
            dialogCtaButton = (DialogCtaButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dialogCtaButton$$serializer, null);
            i = 3;
        } else {
            dialogCtaButton = null;
            DialogCtaButton dialogCtaButton3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dialogCtaButton3 = (DialogCtaButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DialogCtaButton$$serializer.INSTANCE, dialogCtaButton3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dialogCtaButton = (DialogCtaButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DialogCtaButton$$serializer.INSTANCE, dialogCtaButton);
                    i2 |= 2;
                }
            }
            dialogCtaButton2 = dialogCtaButton3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CtaData(i, dialogCtaButton2, dialogCtaButton, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CtaData ctaData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ctaData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CtaData.write$Self$OKCompliance_ok_compliance_impl(ctaData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
