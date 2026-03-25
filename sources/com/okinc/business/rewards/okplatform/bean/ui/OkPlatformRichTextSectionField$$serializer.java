package com.okinc.business.rewards.okplatform.bean.ui;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OkPlatformRichTextSectionField$$serializer implements GeneratedSerializer<OkPlatformRichTextSectionField> {
    public static final int $stable;
    public static final OkPlatformRichTextSectionField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkPlatformRichTextSectionField$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkPlatformRichTextSectionField$$serializer okPlatformRichTextSectionField$$serializer = new OkPlatformRichTextSectionField$$serializer();
        INSTANCE = okPlatformRichTextSectionField$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRichTextSectionField", okPlatformRichTextSectionField$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("sectionName", true);
        pluginGeneratedSerialDescriptor.addElement("tableCellAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OkPlatformRichTextData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkPlatformRichTextSectionField deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        OkPlatformRichTextData okPlatformRichTextData;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            okPlatformRichTextData = (OkPlatformRichTextData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OkPlatformRichTextData$$serializer.INSTANCE, null);
            str2 = str4;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            OkPlatformRichTextData okPlatformRichTextData2 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okPlatformRichTextData2 = (OkPlatformRichTextData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OkPlatformRichTextData$$serializer.INSTANCE, okPlatformRichTextData2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            okPlatformRichTextData = okPlatformRichTextData2;
            str2 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkPlatformRichTextSectionField(i, str2, str, okPlatformRichTextData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkPlatformRichTextSectionField okPlatformRichTextSectionField) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(okPlatformRichTextSectionField, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OkPlatformRichTextSectionField.write$Self$OKGrowthTools_rewards_api(okPlatformRichTextSectionField, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
