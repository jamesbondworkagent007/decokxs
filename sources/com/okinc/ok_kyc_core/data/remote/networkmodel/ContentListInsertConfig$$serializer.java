package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ContentListInsertConfig$$serializer implements GeneratedSerializer<ContentListInsertConfig> {
    public static final int $stable;
    public static final ContentListInsertConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ContentListInsertConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ContentListInsertConfig$$serializer contentListInsertConfig$$serializer = new ContentListInsertConfig$$serializer();
        INSTANCE = contentListInsertConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig", contentListInsertConfig$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("targetContainerType", false);
        pluginGeneratedSerialDescriptor.addElement("targetContainerIndex", true);
        pluginGeneratedSerialDescriptor.addElement("targetContainerPath", true);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("targetIndex", true);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ContentListInsertConfig.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, intSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[2]), kSerializerArr[3], BuiltinSerializersKt.getNullable(intSerializer), JsonArraySerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ContentListInsertConfig deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        JsonArray jsonArray;
        InsertPosition insertPosition;
        Integer num;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ContentListInsertConfig.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            InsertPosition insertPosition2 = (InsertPosition) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, null);
            insertPosition = insertPosition2;
            str = strDecodeStringElement;
            jsonArray = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, JsonArraySerializer.INSTANCE, null);
            num = num2;
            i = 63;
            i2 = iDecodeIntElement;
            list = list2;
        } else {
            int i3 = 0;
            boolean z = true;
            InsertPosition insertPosition3 = null;
            Integer num3 = null;
            JsonArray jsonArray2 = null;
            List list3 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                        break;
                    case 3:
                        i3 |= 8;
                        insertPosition3 = (InsertPosition) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], insertPosition3);
                        break;
                    case 4:
                        i3 |= 16;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num3);
                        break;
                    case 5:
                        i3 |= 32;
                        jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, JsonArraySerializer.INSTANCE, jsonArray2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            InsertPosition insertPosition4 = insertPosition3;
            i2 = iDecodeIntElement2;
            str = strDecodeStringElement2;
            jsonArray = jsonArray2;
            insertPosition = insertPosition4;
            List list4 = list3;
            num = num3;
            list = list4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ContentListInsertConfig(i, str, i2, list, insertPosition, num, jsonArray, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ContentListInsertConfig contentListInsertConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(contentListInsertConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ContentListInsertConfig.write$Self$OKCompliance_ok_compliance_impl(contentListInsertConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
