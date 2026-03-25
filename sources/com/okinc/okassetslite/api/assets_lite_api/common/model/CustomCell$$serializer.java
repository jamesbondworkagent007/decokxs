package com.okinc.okassetslite.api.assets_lite_api.common.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CustomCell$$serializer implements GeneratedSerializer<CustomCell> {
    public static final int $stable;
    public static final CustomCell$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CustomCell$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CustomCell$$serializer customCell$$serializer = new CustomCell$$serializer();
        INSTANCE = customCell$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okassetslite.api.assets_lite_api.common.model.CustomCell", customCell$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("customField1", true);
        pluginGeneratedSerialDescriptor.addElement("customField2", true);
        pluginGeneratedSerialDescriptor.addElement("customField3", true);
        pluginGeneratedSerialDescriptor.addElement("customField4", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        CustomField$$serializer customField$$serializer = CustomField$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(customField$$serializer), BuiltinSerializersKt.getNullable(customField$$serializer), BuiltinSerializersKt.getNullable(customField$$serializer), BuiltinSerializersKt.getNullable(customField$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CustomCell deserialize(@NotNull Decoder decoder) {
        int i;
        CustomField customField;
        CustomField customField2;
        CustomField customField3;
        CustomField customField4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CustomField customField5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CustomField$$serializer customField$$serializer = CustomField$$serializer.INSTANCE;
            CustomField customField6 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, customField$$serializer, null);
            CustomField customField7 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, customField$$serializer, null);
            CustomField customField8 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, customField$$serializer, null);
            customField2 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, customField$$serializer, null);
            i = 15;
            customField = customField8;
            customField4 = customField6;
            customField3 = customField7;
        } else {
            int i2 = 0;
            boolean z = true;
            CustomField customField9 = null;
            CustomField customField10 = null;
            CustomField customField11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    customField11 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CustomField$$serializer.INSTANCE, customField11);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    customField10 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CustomField$$serializer.INSTANCE, customField10);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    customField5 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CustomField$$serializer.INSTANCE, customField5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    customField9 = (CustomField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CustomField$$serializer.INSTANCE, customField9);
                    i2 |= 8;
                }
            }
            i = i2;
            customField = customField5;
            customField2 = customField9;
            customField3 = customField10;
            customField4 = customField11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CustomCell(i, customField4, customField3, customField, customField2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CustomCell customCell) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(customCell, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CustomCell.write$Self$OKAssetsLite_assets_lite_api(customCell, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
