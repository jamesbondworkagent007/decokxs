package com.okinc.okimcore.model.remote;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.im.group.GroupPublicType;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class CreateGroupRequest$$serializer implements GeneratedSerializer<CreateGroupRequest> {
    public static final int $stable;
    public static final CreateGroupRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateGroupRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateGroupRequest$$serializer createGroupRequest$$serializer = new CreateGroupRequest$$serializer();
        INSTANCE = createGroupRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.CreateGroupRequest", createGroupRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("service", false);
        pluginGeneratedSerialDescriptor.addElement("scenarioType", false);
        pluginGeneratedSerialDescriptor.addElement("groupName", false);
        pluginGeneratedSerialDescriptor.addElement("groupMemberUidList", false);
        pluginGeneratedSerialDescriptor.addElement("groupAvatar", true);
        pluginGeneratedSerialDescriptor.addElement("groupSettings", true);
        pluginGeneratedSerialDescriptor.addElement("publicType", false);
        pluginGeneratedSerialDescriptor.addElement("groupDescription", false);
        pluginGeneratedSerialDescriptor.addElement("billingModel", false);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateGroupRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(SetGroupSettingsReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(GroupEntryBillingModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateGroupRequest deserialize(@NotNull Decoder decoder) {
        GroupPublicType groupPublicType;
        GroupScenarioType groupScenarioType;
        GroupEntryBillingModel groupEntryBillingModel;
        String str;
        String str2;
        GroupServiceType groupServiceType;
        JsonObject jsonObject;
        SetGroupSettingsReq setGroupSettingsReq;
        int i;
        String str3;
        Set set;
        GroupScenarioType groupScenarioType2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateGroupRequest.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        JsonObject jsonObject2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupServiceType groupServiceType2 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GroupScenarioType groupScenarioType3 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Set set2 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            SetGroupSettingsReq setGroupSettingsReq2 = (SetGroupSettingsReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SetGroupSettingsReq$$serializer.INSTANCE, null);
            GroupPublicType groupPublicType2 = (GroupPublicType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            GroupEntryBillingModel groupEntryBillingModel2 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, GroupEntryBillingModel$$serializer.INSTANCE, null);
            groupPublicType = groupPublicType2;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.INSTANCE, null);
            str = str5;
            setGroupSettingsReq = setGroupSettingsReq2;
            groupEntryBillingModel = groupEntryBillingModel2;
            str3 = str4;
            i = 1023;
            groupScenarioType = groupScenarioType3;
            set = set2;
            str2 = strDecodeStringElement;
            groupServiceType = groupServiceType2;
        } else {
            int i5 = 0;
            boolean z = true;
            SetGroupSettingsReq setGroupSettingsReq3 = null;
            GroupEntryBillingModel groupEntryBillingModel3 = null;
            String str6 = null;
            String str7 = null;
            Set set3 = null;
            groupPublicType = null;
            GroupScenarioType groupScenarioType4 = null;
            String strDecodeStringElement2 = null;
            GroupServiceType groupServiceType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        groupScenarioType2 = groupScenarioType4;
                        z = false;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 0:
                        groupScenarioType2 = groupScenarioType4;
                        groupServiceType3 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupServiceType3);
                        i5 |= 1;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 1:
                        groupScenarioType4 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupScenarioType4);
                        i5 |= 2;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 2:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 3:
                        set3 = (Set) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], set3);
                        i5 |= 8;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 4:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str7);
                        i5 |= 16;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 5:
                        setGroupSettingsReq3 = (SetGroupSettingsReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SetGroupSettingsReq$$serializer.INSTANCE, setGroupSettingsReq3);
                        i5 |= 32;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 6:
                        groupPublicType = (GroupPublicType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], groupPublicType);
                        i5 |= 64;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str6);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        groupEntryBillingModel3 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, GroupEntryBillingModel$$serializer.INSTANCE, groupEntryBillingModel3);
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 9:
                        i5 |= 512;
                        jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonObjectSerializer.INSTANCE, jsonObject2);
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            groupScenarioType = groupScenarioType4;
            groupEntryBillingModel = groupEntryBillingModel3;
            str = str6;
            str2 = strDecodeStringElement2;
            groupServiceType = groupServiceType3;
            jsonObject = jsonObject2;
            setGroupSettingsReq = setGroupSettingsReq3;
            i = i5;
            Set set4 = set3;
            str3 = str7;
            set = set4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateGroupRequest(i, groupServiceType, groupScenarioType, str2, set, str3, setGroupSettingsReq, groupPublicType, str, groupEntryBillingModel, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateGroupRequest createGroupRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createGroupRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateGroupRequest.write$Self$OKIMCore_okimcore(createGroupRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
