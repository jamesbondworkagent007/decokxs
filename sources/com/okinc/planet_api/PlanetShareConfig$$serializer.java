package com.okinc.planet_api;

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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class PlanetShareConfig$$serializer implements GeneratedSerializer<PlanetShareConfig> {
    public static final int $stable;
    public static final PlanetShareConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PlanetShareConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PlanetShareConfig$$serializer planetShareConfig$$serializer = new PlanetShareConfig$$serializer();
        INSTANCE = planetShareConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet_api.PlanetShareConfig", planetShareConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("bizType", false);
        pluginGeneratedSerialDescriptor.addElement("richShareToFeedConfig", true);
        pluginGeneratedSerialDescriptor.addElement("pluginShareToFeedConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{PlanetShareConfig.$childSerializers[0], BuiltinSerializersKt.getNullable(RichShareToFeedConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(PluginShareToFeedConfig$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PlanetShareConfig deserialize(@NotNull Decoder decoder) {
        int i;
        PluginShareToFeedConfig pluginShareToFeedConfig;
        PlanetShareTypeEnum planetShareTypeEnum;
        RichShareToFeedConfig richShareToFeedConfig;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PlanetShareConfig.$childSerializers;
        PluginShareToFeedConfig pluginShareToFeedConfig2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            planetShareTypeEnum = (PlanetShareTypeEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            richShareToFeedConfig = (RichShareToFeedConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RichShareToFeedConfig$$serializer.INSTANCE, null);
            pluginShareToFeedConfig = (PluginShareToFeedConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PluginShareToFeedConfig$$serializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PlanetShareTypeEnum planetShareTypeEnum2 = null;
            RichShareToFeedConfig richShareToFeedConfig2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    planetShareTypeEnum2 = (PlanetShareTypeEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], planetShareTypeEnum2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    richShareToFeedConfig2 = (RichShareToFeedConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RichShareToFeedConfig$$serializer.INSTANCE, richShareToFeedConfig2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    pluginShareToFeedConfig2 = (PluginShareToFeedConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PluginShareToFeedConfig$$serializer.INSTANCE, pluginShareToFeedConfig2);
                    i2 |= 4;
                }
            }
            i = i2;
            pluginShareToFeedConfig = pluginShareToFeedConfig2;
            planetShareTypeEnum = planetShareTypeEnum2;
            richShareToFeedConfig = richShareToFeedConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PlanetShareConfig(i, planetShareTypeEnum, richShareToFeedConfig, pluginShareToFeedConfig, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PlanetShareConfig planetShareConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(planetShareConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PlanetShareConfig.OLrzqt(planetShareConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
