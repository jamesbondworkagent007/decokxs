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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class LivenessConfig$$serializer implements GeneratedSerializer<LivenessConfig> {
    public static final int $stable;
    public static final LivenessConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LivenessConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LivenessConfig$$serializer livenessConfig$$serializer = new LivenessConfig$$serializer();
        INSTANCE = livenessConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.liveness.eop.bean.LivenessConfig", livenessConfig$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("needProxy", true);
        pluginGeneratedSerialDescriptor.addElement("wssProxyPath", true);
        pluginGeneratedSerialDescriptor.addElement("collectedVideoConfig", true);
        pluginGeneratedSerialDescriptor.addElement("ovalParameters", true);
        pluginGeneratedSerialDescriptor.addElement("faceDetectionConfig", true);
        pluginGeneratedSerialDescriptor.addElement("faceQcConfig", true);
        pluginGeneratedSerialDescriptor.addElement("freshnessQcConfig", true);
        pluginGeneratedSerialDescriptor.addElement("sensor", true);
        pluginGeneratedSerialDescriptor.addElement("efrConfig", true);
        pluginGeneratedSerialDescriptor.addElement("encryptionData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(LcaLivenessConfigOvalParameters$$serializer.INSTANCE);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE);
        LcaLivenessConfigFaceQcConfig$$serializer lcaLivenessConfigFaceQcConfig$$serializer = LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(lcaLivenessConfigFaceQcConfig$$serializer), BuiltinSerializersKt.getNullable(lcaLivenessConfigFaceQcConfig$$serializer), BuiltinSerializersKt.getNullable(LcaLivenessConfigSensorConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(EFRConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LivenessConfig deserialize(@NotNull Decoder decoder) {
        int i;
        EFRConfig eFRConfig;
        String str;
        String str2;
        LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig;
        LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig;
        LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig;
        LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters;
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig;
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2;
        Boolean bool;
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig2 = (LcaLivenessConfigCollectedVideoConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE, null);
            LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters2 = (LcaLivenessConfigOvalParameters) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LcaLivenessConfigOvalParameters$$serializer.INSTANCE, null);
            LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig2 = (LcaLivenessConfigFaceDetectionConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE, null);
            LcaLivenessConfigFaceQcConfig$$serializer lcaLivenessConfigFaceQcConfig$$serializer = LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE;
            LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig4 = (LcaLivenessConfigFaceQcConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, lcaLivenessConfigFaceQcConfig$$serializer, null);
            LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig5 = (LcaLivenessConfigFaceQcConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, lcaLivenessConfigFaceQcConfig$$serializer, null);
            LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig3 = (LcaLivenessConfigSensorConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LcaLivenessConfigSensorConfig$$serializer.INSTANCE, null);
            EFRConfig eFRConfig2 = (EFRConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, EFRConfig$$serializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            lcaLivenessConfigSensorConfig = lcaLivenessConfigSensorConfig3;
            lcaLivenessConfigFaceQcConfig2 = lcaLivenessConfigFaceQcConfig5;
            lcaLivenessConfigFaceQcConfig = lcaLivenessConfigFaceQcConfig4;
            eFRConfig = eFRConfig2;
            lcaLivenessConfigFaceDetectionConfig = lcaLivenessConfigFaceDetectionConfig2;
            i = 1023;
            bool = bool2;
            lcaLivenessConfigCollectedVideoConfig = lcaLivenessConfigCollectedVideoConfig2;
            str2 = str3;
            lcaLivenessConfigOvalParameters = lcaLivenessConfigOvalParameters2;
        } else {
            int i5 = 0;
            boolean z = true;
            EFRConfig eFRConfig3 = null;
            LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig6 = null;
            String str4 = null;
            String str5 = null;
            LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig3 = null;
            LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig3 = null;
            LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters3 = null;
            LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig7 = null;
            Boolean bool3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        z = false;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 1;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                        i5 |= 2;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigCollectedVideoConfig3 = (LcaLivenessConfigCollectedVideoConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE, lcaLivenessConfigCollectedVideoConfig3);
                        i5 |= 4;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigOvalParameters3 = (LcaLivenessConfigOvalParameters) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LcaLivenessConfigOvalParameters$$serializer.INSTANCE, lcaLivenessConfigOvalParameters3);
                        i5 |= 8;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigFaceDetectionConfig3 = (LcaLivenessConfigFaceDetectionConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE, lcaLivenessConfigFaceDetectionConfig3);
                        i5 |= 16;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        lcaLivenessConfigFaceQcConfig3 = (LcaLivenessConfigFaceQcConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE, lcaLivenessConfigFaceQcConfig7);
                        i5 |= 32;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        lcaLivenessConfigFaceQcConfig6 = (LcaLivenessConfigFaceQcConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE, lcaLivenessConfigFaceQcConfig6);
                        i5 |= 64;
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        lcaLivenessConfigSensorConfig2 = (LcaLivenessConfigSensorConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LcaLivenessConfigSensorConfig$$serializer.INSTANCE, lcaLivenessConfigSensorConfig2);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        eFRConfig3 = (EFRConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, EFRConfig$$serializer.INSTANCE, eFRConfig3);
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 9:
                        i5 |= 512;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str4);
                        lcaLivenessConfigFaceQcConfig3 = lcaLivenessConfigFaceQcConfig7;
                        lcaLivenessConfigFaceQcConfig7 = lcaLivenessConfigFaceQcConfig3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            eFRConfig = eFRConfig3;
            str = str4;
            str2 = str5;
            lcaLivenessConfigCollectedVideoConfig = lcaLivenessConfigCollectedVideoConfig3;
            lcaLivenessConfigSensorConfig = lcaLivenessConfigSensorConfig2;
            lcaLivenessConfigFaceDetectionConfig = lcaLivenessConfigFaceDetectionConfig3;
            lcaLivenessConfigOvalParameters = lcaLivenessConfigOvalParameters3;
            lcaLivenessConfigFaceQcConfig = lcaLivenessConfigFaceQcConfig7;
            lcaLivenessConfigFaceQcConfig2 = lcaLivenessConfigFaceQcConfig6;
            bool = bool3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LivenessConfig(i, bool, str2, lcaLivenessConfigCollectedVideoConfig, lcaLivenessConfigOvalParameters, lcaLivenessConfigFaceDetectionConfig, lcaLivenessConfigFaceQcConfig, lcaLivenessConfigFaceQcConfig2, lcaLivenessConfigSensorConfig, eFRConfig, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LivenessConfig livenessConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(livenessConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LivenessConfig.write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(livenessConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
