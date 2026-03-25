package com.okinc.okimcore.model.remote;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import java.util.Set;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupAddOrRemoveMemberRequest$$serializer implements GeneratedSerializer<GroupAddOrRemoveMemberRequest> {
    public static final int $stable;
    public static final GroupAddOrRemoveMemberRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupAddOrRemoveMemberRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupAddOrRemoveMemberRequest$$serializer groupAddOrRemoveMemberRequest$$serializer = new GroupAddOrRemoveMemberRequest$$serializer();
        INSTANCE = groupAddOrRemoveMemberRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest", groupAddOrRemoveMemberRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("service", false);
        pluginGeneratedSerialDescriptor.addElement("scenarioType", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("groupMemberUidList", false);
        pluginGeneratedSerialDescriptor.addElement("paidGroupPaymentRequiredStatus", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = GroupAddOrRemoveMemberRequest.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], LongSerializer.INSTANCE, kSerializerArr[3], BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupAddOrRemoveMemberRequest deserialize(@NotNull Decoder decoder) {
        JsonObject jsonObject;
        GroupServiceType groupServiceType;
        int i;
        PaymentRequiredStatus paymentRequiredStatus;
        Set set;
        GroupScenarioType groupScenarioType;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupAddOrRemoveMemberRequest.$childSerializers;
        int i2 = 5;
        PaymentRequiredStatus paymentRequiredStatus2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupServiceType groupServiceType2 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GroupScenarioType groupScenarioType2 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            Set set2 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            paymentRequiredStatus = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JsonObjectSerializer.INSTANCE, null);
            set = set2;
            i = 63;
            j = jDecodeLongElement;
            groupServiceType = groupServiceType2;
            groupScenarioType = groupScenarioType2;
        } else {
            int i3 = 0;
            boolean z = true;
            GroupScenarioType groupScenarioType3 = null;
            GroupServiceType groupServiceType3 = null;
            long jDecodeLongElement2 = 0;
            JsonObject jsonObject2 = null;
            Set set3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        groupServiceType3 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupServiceType3);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        i3 |= 2;
                        groupScenarioType3 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupScenarioType3);
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        i3 |= 8;
                        set3 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], set3);
                        break;
                    case 4:
                        i3 |= 16;
                        paymentRequiredStatus2 = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], paymentRequiredStatus2);
                        break;
                    case 5:
                        i3 |= 32;
                        jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonObjectSerializer.INSTANCE, jsonObject2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jsonObject = jsonObject2;
            groupServiceType = groupServiceType3;
            PaymentRequiredStatus paymentRequiredStatus3 = paymentRequiredStatus2;
            i = i3;
            long j2 = jDecodeLongElement2;
            paymentRequiredStatus = paymentRequiredStatus3;
            set = set3;
            groupScenarioType = groupScenarioType3;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupAddOrRemoveMemberRequest(i, groupServiceType, groupScenarioType, j, set, paymentRequiredStatus, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupAddOrRemoveMemberRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupAddOrRemoveMemberRequest.write$Self$OKIMCore_okimcore(groupAddOrRemoveMemberRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
