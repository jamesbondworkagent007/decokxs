package com.okinc.okex.lite.home.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBOnboardingResponseV2$$serializer implements GeneratedSerializer<NUBOnboardingResponseV2> {
    public static final int $stable;
    public static final NUBOnboardingResponseV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBOnboardingResponseV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBOnboardingResponseV2$$serializer nUBOnboardingResponseV2$$serializer = new NUBOnboardingResponseV2$$serializer();
        INSTANCE = nUBOnboardingResponseV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBOnboardingResponseV2", nUBOnboardingResponseV2$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("nubDataV1", false);
        pluginGeneratedSerialDescriptor.addElement("nubDataV2", false);
        pluginGeneratedSerialDescriptor.addElement("nubVersion", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(NUBOnboardingResponse$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(NUBOnboardingV2$$serializer.INSTANCE), NUBOnboardingResponseV2.$childSerializers[2]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBOnboardingResponseV2 deserialize(@NotNull Decoder decoder) {
        int i;
        NUBOnboardingV2 nUBOnboardingV2;
        NubVersion nubVersion;
        NUBOnboardingResponse nUBOnboardingResponse;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBOnboardingResponseV2.$childSerializers;
        NUBOnboardingV2 nUBOnboardingV22 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NUBOnboardingResponse nUBOnboardingResponse2 = (NUBOnboardingResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NUBOnboardingResponse$$serializer.INSTANCE, null);
            NUBOnboardingV2 nUBOnboardingV23 = (NUBOnboardingV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NUBOnboardingV2$$serializer.INSTANCE, null);
            nubVersion = (NubVersion) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            nUBOnboardingResponse = nUBOnboardingResponse2;
            nUBOnboardingV2 = nUBOnboardingV23;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            NubVersion nubVersion2 = null;
            NUBOnboardingResponse nUBOnboardingResponse3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    nUBOnboardingResponse3 = (NUBOnboardingResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NUBOnboardingResponse$$serializer.INSTANCE, nUBOnboardingResponse3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    nUBOnboardingV22 = (NUBOnboardingV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NUBOnboardingV2$$serializer.INSTANCE, nUBOnboardingV22);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    nubVersion2 = (NubVersion) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], nubVersion2);
                    i2 |= 4;
                }
            }
            i = i2;
            nUBOnboardingV2 = nUBOnboardingV22;
            nubVersion = nubVersion2;
            nUBOnboardingResponse = nUBOnboardingResponse3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBOnboardingResponseV2(i, nUBOnboardingResponse, nUBOnboardingV2, nubVersion, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBOnboardingResponseV2 nUBOnboardingResponseV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nUBOnboardingResponseV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBOnboardingResponseV2.AEQbTJ(nUBOnboardingResponseV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
