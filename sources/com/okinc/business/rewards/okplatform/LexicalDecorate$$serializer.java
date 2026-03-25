package com.okinc.business.rewards.okplatform;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class LexicalDecorate$$serializer implements GeneratedSerializer<LexicalDecorate> {
    public static final int $stable;
    public static final LexicalDecorate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LexicalDecorate$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LexicalDecorate$$serializer lexicalDecorate$$serializer = new LexicalDecorate$$serializer();
        INSTANCE = lexicalDecorate$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.LexicalDecorate", lexicalDecorate$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("textSizeH1", false);
        pluginGeneratedSerialDescriptor.addElement("textSizeH2", false);
        pluginGeneratedSerialDescriptor.addElement("textSizeH3", false);
        pluginGeneratedSerialDescriptor.addElement("textColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{floatSerializer, floatSerializer, floatSerializer, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LexicalDecorate deserialize(@NotNull Decoder decoder) {
        float f;
        int iDecodeIntElement;
        float f2;
        float f3;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 1);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
            f = fDecodeFloatElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            f2 = fDecodeFloatElement3;
            f3 = fDecodeFloatElement2;
            i = 15;
        } else {
            float fDecodeFloatElement4 = 0.0f;
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            int iDecodeIntElement2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            f = fDecodeFloatElement4;
            iDecodeIntElement = iDecodeIntElement2;
            f2 = fDecodeFloatElement5;
            f3 = fDecodeFloatElement6;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LexicalDecorate(i, f, f3, f2, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(lexicalDecorate, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LexicalDecorate.write$Self$OKGrowthTools_rewards_api(lexicalDecorate, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
