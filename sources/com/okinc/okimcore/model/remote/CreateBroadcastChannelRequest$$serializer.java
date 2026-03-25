package com.okinc.okimcore.model.remote;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class CreateBroadcastChannelRequest$$serializer implements GeneratedSerializer<CreateBroadcastChannelRequest> {
    public static final int $stable;
    public static final CreateBroadcastChannelRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateBroadcastChannelRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateBroadcastChannelRequest$$serializer createBroadcastChannelRequest$$serializer = new CreateBroadcastChannelRequest$$serializer();
        INSTANCE = createBroadcastChannelRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest", createBroadcastChannelRequest$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("userUids", true);
        pluginGeneratedSerialDescriptor.addElement("groupIds", true);
        pluginGeneratedSerialDescriptor.addElement("scenarioType", false);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateBroadcastChannelRequest.$childSerializers;
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2]), kSerializerArr[3], JsonObjectSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateBroadcastChannelRequest deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        GroupScenarioType groupScenarioType;
        JsonObject jsonObject;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateBroadcastChannelRequest.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            groupScenarioType = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            i = iDecodeIntElement;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, null);
            list2 = list3;
            i2 = 31;
            list = list4;
        } else {
            int iDecodeIntElement2 = 0;
            GroupScenarioType groupScenarioType2 = null;
            JsonObject jsonObject2 = null;
            List list5 = null;
            List list6 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i3 |= 2;
                    list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list6);
                } else if (iDecodeElementIndex == 2) {
                    i3 |= 4;
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list5);
                } else if (iDecodeElementIndex == 3) {
                    i3 |= 8;
                    groupScenarioType2 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], groupScenarioType2);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i3 |= 16;
                    jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, jsonObject2);
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            groupScenarioType = groupScenarioType2;
            jsonObject = jsonObject2;
            list = list5;
            list2 = list6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateBroadcastChannelRequest(i2, i, list2, list, groupScenarioType, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateBroadcastChannelRequest createBroadcastChannelRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createBroadcastChannelRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateBroadcastChannelRequest.write$Self$OKIMCore_okimcore(createBroadcastChannelRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
