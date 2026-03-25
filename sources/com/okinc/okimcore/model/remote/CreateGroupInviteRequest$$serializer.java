package com.okinc.okimcore.model.remote;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class CreateGroupInviteRequest$$serializer implements GeneratedSerializer<CreateGroupInviteRequest> {
    public static final int $stable;
    public static final CreateGroupInviteRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateGroupInviteRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateGroupInviteRequest$$serializer createGroupInviteRequest$$serializer = new CreateGroupInviteRequest$$serializer();
        INSTANCE = createGroupInviteRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.CreateGroupInviteRequest", createGroupInviteRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("service", false);
        pluginGeneratedSerialDescriptor.addElement("scenarioType", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("validForNumOfDays", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateGroupInviteRequest.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateGroupInviteRequest deserialize(@NotNull Decoder decoder) {
        int i;
        GroupScenarioType groupScenarioType;
        long j;
        Integer num;
        GroupServiceType groupServiceType;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateGroupInviteRequest.$childSerializers;
        GroupScenarioType groupScenarioType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupServiceType groupServiceType2 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GroupScenarioType groupScenarioType3 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            groupScenarioType = groupScenarioType3;
            groupServiceType = groupServiceType2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            j = jDecodeLongElement;
            i = 15;
        } else {
            long jDecodeLongElement2 = 0;
            int i2 = 0;
            boolean z = true;
            Integer num2 = null;
            GroupServiceType groupServiceType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupServiceType3 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupServiceType3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    groupScenarioType2 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupScenarioType2);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num2);
                    i2 |= 8;
                }
            }
            i = i2;
            groupScenarioType = groupScenarioType2;
            j = jDecodeLongElement2;
            num = num2;
            groupServiceType = groupServiceType3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateGroupInviteRequest(i, groupServiceType, groupScenarioType, j, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateGroupInviteRequest createGroupInviteRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createGroupInviteRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateGroupInviteRequest.write$Self$OKIMCore_okimcore(createGroupInviteRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
