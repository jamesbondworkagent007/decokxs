package com.okinc.liveness.eop.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class LcaLivenessConfigOvalParameters$$serializer implements GeneratedSerializer<LcaLivenessConfigOvalParameters> {
    public static final int $stable;
    public static final LcaLivenessConfigOvalParameters$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LcaLivenessConfigOvalParameters$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LcaLivenessConfigOvalParameters$$serializer lcaLivenessConfigOvalParameters$$serializer = new LcaLivenessConfigOvalParameters$$serializer();
        INSTANCE = lcaLivenessConfigOvalParameters$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters", lcaLivenessConfigOvalParameters$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("farOvalWidthScreenRatio", false);
        pluginGeneratedSerialDescriptor.addElement("farOvalHeightRatio", false);
        pluginGeneratedSerialDescriptor.addElement("faceOvalWidthScreenRatio", false);
        pluginGeneratedSerialDescriptor.addElement("faceOvalHeightRatio", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LcaLivenessConfigOvalParameters deserialize(@NotNull Decoder decoder) {
        int i;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Float f5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, null);
            Float f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, null);
            Float f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, null);
            i = 15;
            f = f8;
            f4 = f6;
            f3 = f7;
        } else {
            int i2 = 0;
            boolean z = true;
            Float f9 = null;
            Float f10 = null;
            Float f11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    f11 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, f11);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    f10 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FloatSerializer.INSTANCE, f10);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, f5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, f9);
                    i2 |= 8;
                }
            }
            i = i2;
            f = f5;
            f2 = f9;
            f3 = f10;
            f4 = f11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LcaLivenessConfigOvalParameters(i, f4, f3, f, f2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(lcaLivenessConfigOvalParameters, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LcaLivenessConfigOvalParameters.write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(lcaLivenessConfigOvalParameters, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
