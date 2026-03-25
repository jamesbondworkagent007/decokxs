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
public final /* synthetic */ class OkPlatformRedirectBtnField$$serializer implements GeneratedSerializer<OkPlatformRedirectBtnField> {
    public static final int $stable;
    public static final OkPlatformRedirectBtnField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkPlatformRedirectBtnField$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkPlatformRedirectBtnField$$serializer okPlatformRedirectBtnField$$serializer = new OkPlatformRedirectBtnField$$serializer();
        INSTANCE = okPlatformRedirectBtnField$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRedirectBtnField", okPlatformRedirectBtnField$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("sectionName", true);
        pluginGeneratedSerialDescriptor.addElement("buttonTextBeforeActivityStarts", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTextActivityHasStarted", false);
        pluginGeneratedSerialDescriptor.addElement("redirectUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), okPlatformUIStructureTextData$$serializer, okPlatformUIStructureTextData$$serializer, okPlatformUIStructureTextData$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkPlatformRedirectBtnField deserialize(@NotNull Decoder decoder) {
        int i;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData2;
        String str;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        OkPlatformUIStructureTextData okPlatformUIStructureTextData4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
            OkPlatformUIStructureTextData okPlatformUIStructureTextData5 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, okPlatformUIStructureTextData$$serializer, null);
            OkPlatformUIStructureTextData okPlatformUIStructureTextData6 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, okPlatformUIStructureTextData$$serializer, null);
            str = str2;
            okPlatformUIStructureTextData3 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, okPlatformUIStructureTextData$$serializer, null);
            okPlatformUIStructureTextData = okPlatformUIStructureTextData6;
            i = 15;
            okPlatformUIStructureTextData2 = okPlatformUIStructureTextData5;
        } else {
            int i2 = 0;
            boolean z = true;
            OkPlatformUIStructureTextData okPlatformUIStructureTextData7 = null;
            String str3 = null;
            OkPlatformUIStructureTextData okPlatformUIStructureTextData8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    okPlatformUIStructureTextData7 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    okPlatformUIStructureTextData4 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okPlatformUIStructureTextData8 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData8);
                    i2 |= 8;
                }
            }
            i = i2;
            okPlatformUIStructureTextData = okPlatformUIStructureTextData4;
            okPlatformUIStructureTextData2 = okPlatformUIStructureTextData7;
            str = str3;
            okPlatformUIStructureTextData3 = okPlatformUIStructureTextData8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkPlatformRedirectBtnField(i, str, okPlatformUIStructureTextData2, okPlatformUIStructureTextData, okPlatformUIStructureTextData3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkPlatformRedirectBtnField okPlatformRedirectBtnField) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(okPlatformRedirectBtnField, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OkPlatformRedirectBtnField.write$Self$OKGrowthTools_rewards_api(okPlatformRedirectBtnField, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
