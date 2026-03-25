package com.okinc.business.rewards.okplatform.bean.ui;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OkPlatformRichTextData$$serializer implements GeneratedSerializer<OkPlatformRichTextData> {
    public static final int $stable;
    public static final OkPlatformRichTextData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkPlatformRichTextData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkPlatformRichTextData$$serializer okPlatformRichTextData$$serializer = new OkPlatformRichTextData$$serializer();
        INSTANCE = okPlatformRichTextData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextData", okPlatformRichTextData$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("contentJSON", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OkPlatformUIStructureTextData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkPlatformRichTextData deserialize(@NotNull Decoder decoder) {
        OkPlatformUIStructureTextData okPlatformUIStructureTextData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            okPlatformUIStructureTextData = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, OkPlatformUIStructureTextData$$serializer.INSTANCE, null);
        } else {
            okPlatformUIStructureTextData = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okPlatformUIStructureTextData = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkPlatformRichTextData(i, okPlatformUIStructureTextData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkPlatformRichTextData okPlatformRichTextData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(okPlatformRichTextData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformRichTextData.contentJSON);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
