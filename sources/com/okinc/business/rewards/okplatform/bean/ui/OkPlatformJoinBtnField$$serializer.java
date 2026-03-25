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
public final /* synthetic */ class OkPlatformJoinBtnField$$serializer implements GeneratedSerializer<OkPlatformJoinBtnField> {
    public static final int $stable;
    public static final OkPlatformJoinBtnField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkPlatformJoinBtnField$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkPlatformJoinBtnField$$serializer okPlatformJoinBtnField$$serializer = new OkPlatformJoinBtnField$$serializer();
        INSTANCE = okPlatformJoinBtnField$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.okplatform.bean.ui.OkPlatformJoinBtnField", okPlatformJoinBtnField$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("sectionName", true);
        pluginGeneratedSerialDescriptor.addElement("buttonTextBeforeEnrolmentStarts", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTextEnrolmentHasStarted", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), okPlatformUIStructureTextData$$serializer, okPlatformUIStructureTextData$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkPlatformJoinBtnField deserialize(@NotNull Decoder decoder) {
        int i;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData;
        String str;
        OkPlatformUIStructureTextData okPlatformUIStructureTextData2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        OkPlatformUIStructureTextData okPlatformUIStructureTextData3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
            OkPlatformUIStructureTextData okPlatformUIStructureTextData4 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, okPlatformUIStructureTextData$$serializer, null);
            str = str2;
            okPlatformUIStructureTextData2 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, okPlatformUIStructureTextData$$serializer, null);
            i = 7;
            okPlatformUIStructureTextData = okPlatformUIStructureTextData4;
        } else {
            int i2 = 0;
            boolean z = true;
            String str3 = null;
            OkPlatformUIStructureTextData okPlatformUIStructureTextData5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    okPlatformUIStructureTextData3 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okPlatformUIStructureTextData5 = (OkPlatformUIStructureTextData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OkPlatformUIStructureTextData$$serializer.INSTANCE, okPlatformUIStructureTextData5);
                    i2 |= 4;
                }
            }
            i = i2;
            okPlatformUIStructureTextData = okPlatformUIStructureTextData3;
            str = str3;
            okPlatformUIStructureTextData2 = okPlatformUIStructureTextData5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkPlatformJoinBtnField(i, str, okPlatformUIStructureTextData, okPlatformUIStructureTextData2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkPlatformJoinBtnField okPlatformJoinBtnField) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(okPlatformJoinBtnField, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OkPlatformJoinBtnField.write$Self$OKGrowthTools_rewards_api(okPlatformJoinBtnField, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
