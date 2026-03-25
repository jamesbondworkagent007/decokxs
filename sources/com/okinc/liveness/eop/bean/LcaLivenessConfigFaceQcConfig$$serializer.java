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
public final /* synthetic */ class LcaLivenessConfigFaceQcConfig$$serializer implements GeneratedSerializer<LcaLivenessConfigFaceQcConfig> {
    public static final int $stable;
    public static final LcaLivenessConfigFaceQcConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LcaLivenessConfigFaceQcConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LcaLivenessConfigFaceQcConfig$$serializer lcaLivenessConfigFaceQcConfig$$serializer = new LcaLivenessConfigFaceQcConfig$$serializer();
        INSTANCE = lcaLivenessConfigFaceQcConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig", lcaLivenessConfigFaceQcConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("faceQcOkThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("faceQcBlurThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("faceQcBlockThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("faceQcBrightThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("faceQcDarkThreshold", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LcaLivenessConfigFaceQcConfig deserialize(@NotNull Decoder decoder) {
        int i;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Float f6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, null);
            Float f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, null);
            Float f9 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, null);
            Float f10 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, null);
            f3 = f10;
            i = 31;
            f = f9;
            f5 = f7;
            f4 = f8;
        } else {
            int i2 = 0;
            boolean z = true;
            Float f11 = null;
            Float f12 = null;
            Float f13 = null;
            Float f14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    f14 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, f14);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    f13 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FloatSerializer.INSTANCE, f13);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, f6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    f12 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, f12);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    f11 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, f11);
                    i2 |= 16;
                }
            }
            i = i2;
            f = f6;
            f2 = f11;
            f3 = f12;
            f4 = f13;
            f5 = f14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LcaLivenessConfigFaceQcConfig(i, f5, f4, f, f3, f2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(lcaLivenessConfigFaceQcConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LcaLivenessConfigFaceQcConfig.write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(lcaLivenessConfigFaceQcConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
