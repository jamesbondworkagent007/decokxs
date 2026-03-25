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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class LcaLivenessConfigFaceDetectionConfig$$serializer implements GeneratedSerializer<LcaLivenessConfigFaceDetectionConfig> {
    public static final int $stable;
    public static final LcaLivenessConfigFaceDetectionConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LcaLivenessConfigFaceDetectionConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LcaLivenessConfigFaceDetectionConfig$$serializer lcaLivenessConfigFaceDetectionConfig$$serializer = new LcaLivenessConfigFaceDetectionConfig$$serializer();
        INSTANCE = lcaLivenessConfigFaceDetectionConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig", lcaLivenessConfigFaceDetectionConfig$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("faceDetectionScoreThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("initialFaceDistanceThresholdMax", false);
        pluginGeneratedSerialDescriptor.addElement("initialFaceDistanceThresholdMin", false);
        pluginGeneratedSerialDescriptor.addElement("freshFaceDistanceThresholdMax", false);
        pluginGeneratedSerialDescriptor.addElement("freshFaceDistanceThresholdMin", false);
        pluginGeneratedSerialDescriptor.addElement("ovalFitTimeout", false);
        pluginGeneratedSerialDescriptor.addElement("farHoldDuration", false);
        pluginGeneratedSerialDescriptor.addElement("onHoldThresholdMaxRatio", true);
        pluginGeneratedSerialDescriptor.addElement("onHoldThresholdMinRatio", true);
        pluginGeneratedSerialDescriptor.addElement("positionTopThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("positionBottomThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("notFrontalFaceHeadTiltAngelThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("notFrontalFaceHeadPitchAngelThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("notFrontalFaceEyeDistanceRatioThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("freshnessQcDelayDuration", true);
        pluginGeneratedSerialDescriptor.addElement("colorFlashingTimeout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(floatSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LcaLivenessConfigFaceDetectionConfig deserialize(@NotNull Decoder decoder) {
        Long l;
        Float f;
        Integer num;
        Float f2;
        Float f3;
        Float f4;
        Integer num2;
        Integer num3;
        Float f5;
        Float f6;
        Float f7;
        int i;
        Float f8;
        Float f9;
        Float f10;
        Float f11;
        Float f12;
        Integer num4;
        Float f13;
        int i2;
        Float f14;
        Integer num5;
        Float f15;
        Integer num6;
        Float f16;
        Float f17;
        Integer num7;
        Integer num8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        Float f18 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f19 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, null);
            Float f20 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, null);
            Float f21 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, null);
            Float f22 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, null);
            Float f23 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            Float f24 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Float f25 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f26 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            Float f27 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            Float f28 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            Float f29 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            f7 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, LongSerializer.INSTANCE, null);
            f = f27;
            f6 = f26;
            num3 = num9;
            f5 = f19;
            f8 = f29;
            f2 = f28;
            f4 = f24;
            num = num10;
            f3 = f23;
            i = 65535;
            f11 = f22;
            f9 = f20;
            f12 = f25;
            f10 = f21;
        } else {
            int i4 = 15;
            int i5 = 0;
            boolean z = true;
            Float f30 = null;
            Integer num11 = null;
            Long l2 = null;
            Float f31 = null;
            Float f32 = null;
            Float f33 = null;
            Float f34 = null;
            Float f35 = null;
            Float f36 = null;
            Float f37 = null;
            Integer num12 = null;
            Integer num13 = null;
            Float f38 = null;
            Float f39 = null;
            Float f40 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        f14 = f30;
                        num5 = num11;
                        f15 = f37;
                        num6 = num12;
                        f16 = f38;
                        f17 = f39;
                        num7 = num13;
                        z = false;
                        f38 = f16;
                        num12 = num6;
                        f30 = f14;
                        f37 = f15;
                        num11 = num5;
                        num13 = num7;
                        i4 = 15;
                        i3 = 10;
                        f39 = f17;
                        break;
                    case 0:
                        f14 = f30;
                        num5 = num11;
                        f15 = f37;
                        num6 = num12;
                        f16 = f38;
                        Float f41 = f39;
                        num7 = num13;
                        f17 = f41;
                        f40 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, f40);
                        i5 |= 1;
                        f38 = f16;
                        num12 = num6;
                        f30 = f14;
                        f37 = f15;
                        num11 = num5;
                        num13 = num7;
                        i4 = 15;
                        i3 = 10;
                        f39 = f17;
                        break;
                    case 1:
                        f14 = f30;
                        num5 = num11;
                        f15 = f37;
                        num6 = num12;
                        f16 = f38;
                        Float f42 = f39;
                        num7 = num13;
                        i5 |= 2;
                        f17 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FloatSerializer.INSTANCE, f42);
                        f38 = f16;
                        num12 = num6;
                        f30 = f14;
                        f37 = f15;
                        num11 = num5;
                        num13 = num7;
                        i4 = 15;
                        i3 = 10;
                        f39 = f17;
                        break;
                    case 2:
                        num5 = num11;
                        f15 = f37;
                        num6 = num12;
                        num8 = num13;
                        f14 = f30;
                        f38 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, f38);
                        i5 |= 4;
                        f16 = f38;
                        f17 = f39;
                        num7 = num8;
                        f38 = f16;
                        num12 = num6;
                        f30 = f14;
                        f37 = f15;
                        num11 = num5;
                        num13 = num7;
                        i4 = 15;
                        i3 = 10;
                        f39 = f17;
                        break;
                    case 3:
                        num5 = num11;
                        f15 = f37;
                        num6 = num12;
                        num8 = num13;
                        f31 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, f31);
                        f14 = f30;
                        i5 |= 8;
                        f16 = f38;
                        f17 = f39;
                        num7 = num8;
                        f38 = f16;
                        num12 = num6;
                        f30 = f14;
                        f37 = f15;
                        num11 = num5;
                        num13 = num7;
                        i4 = 15;
                        i3 = 10;
                        f39 = f17;
                        break;
                    case 4:
                        f30 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, f30);
                        i5 |= 16;
                        num11 = num11;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 5:
                        num4 = num12;
                        f13 = f37;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num13);
                        i5 |= 32;
                        num11 = num11;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 6:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num12);
                        f13 = f37;
                        i5 |= 64;
                        num11 = num11;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 7:
                        f13 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, f37);
                        i5 |= 128;
                        num4 = num12;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 8:
                        i5 |= 256;
                        f13 = f37;
                        num4 = num12;
                        f32 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f32);
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 9:
                        i5 |= 512;
                        f13 = f37;
                        num4 = num12;
                        f33 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, f33);
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 10:
                        f18 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f18);
                        i2 = i5 | 1024;
                        i5 = i2;
                        f13 = f37;
                        num4 = num12;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 11:
                        i5 |= 2048;
                        f13 = f37;
                        num4 = num12;
                        f34 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f34);
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 12:
                        i5 |= 4096;
                        f36 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f36);
                        f13 = f37;
                        num4 = num12;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 13:
                        i5 |= 8192;
                        f13 = f37;
                        num4 = num12;
                        f35 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, f35);
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 14:
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, num11);
                        i2 = i5 | 16384;
                        i5 = i2;
                        f13 = f37;
                        num4 = num12;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    case 15:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l2);
                        i2 = 32768 | i5;
                        i5 = i2;
                        f13 = f37;
                        num4 = num12;
                        num12 = num4;
                        f37 = f13;
                        i4 = 15;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Float f43 = f37;
            l = l2;
            f = f18;
            num = num12;
            f2 = f34;
            f3 = f30;
            f4 = f43;
            num2 = num11;
            num3 = num13;
            f5 = f40;
            f6 = f33;
            f7 = f35;
            i = i5;
            f8 = f36;
            f9 = f39;
            f10 = f38;
            f11 = f31;
            f12 = f32;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LcaLivenessConfigFaceDetectionConfig(i, f5, f9, f10, f11, f3, num3, num, f4, f12, f6, f, f2, f8, f7, num2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(lcaLivenessConfigFaceDetectionConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LcaLivenessConfigFaceDetectionConfig.write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(lcaLivenessConfigFaceDetectionConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
