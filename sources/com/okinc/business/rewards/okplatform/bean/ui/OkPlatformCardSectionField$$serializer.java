package com.okinc.business.rewards.okplatform.bean.ui;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final /* synthetic */ class OkPlatformCardSectionField$$serializer implements GeneratedSerializer<OkPlatformCardSectionField> {
    public static final int $stable;
    public static final OkPlatformCardSectionField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkPlatformCardSectionField$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkPlatformCardSectionField$$serializer okPlatformCardSectionField$$serializer = new OkPlatformCardSectionField$$serializer();
        INSTANCE = okPlatformCardSectionField$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.bean.ui.OkPlatformCardSectionField", okPlatformCardSectionField$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("sectionName", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subTitle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), OkPlatformUIStructureTextData$$serializer.INSTANCE, OkPlatformRichTextData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkPlatformCardSectionField deserialize(@NotNull Decoder decoder) {
        int i;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData;
        String str;
        OkPlatformRichTextData okPlatformRichTextData;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        OkPlatformUIStructureTextData okPlatformUIStructureTextData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            OkPlatformUIStructureTextData okPlatformUIStructureTextData3 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OkPlatformUIStructureTextData$$serializer.INSTANCE, null);
            str = str4;
            okPlatformRichTextData = (OkPlatformRichTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, OkPlatformRichTextData$$serializer.INSTANCE, null);
            okPlatformUIStructureTextData = okPlatformUIStructureTextData3;
            str2 = str3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String str5 = null;
            OkPlatformRichTextData okPlatformRichTextData2 = null;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    okPlatformUIStructureTextData2 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okPlatformRichTextData2 = (OkPlatformRichTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, OkPlatformRichTextData$$serializer.INSTANCE, okPlatformRichTextData2);
                    i2 |= 8;
                }
            }
            i = i2;
            okPlatformUIStructureTextData = okPlatformUIStructureTextData2;
            str = str5;
            okPlatformRichTextData = okPlatformRichTextData2;
            str2 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkPlatformCardSectionField(i, str2, str, okPlatformUIStructureTextData, okPlatformRichTextData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkPlatformCardSectionField okPlatformCardSectionField) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(okPlatformCardSectionField, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OkPlatformCardSectionField.write$Self$OKGrowthTools_rewards_api(okPlatformCardSectionField, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
