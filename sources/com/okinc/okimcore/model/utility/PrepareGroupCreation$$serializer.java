package com.okinc.okimcore.model.utility;

import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel$$serializer;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq$$serializer;
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
public final /* synthetic */ class PrepareGroupCreation$$serializer implements GeneratedSerializer<PrepareGroupCreation> {
    public static final int $stable;
    public static final PrepareGroupCreation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PrepareGroupCreation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PrepareGroupCreation$$serializer prepareGroupCreation$$serializer = new PrepareGroupCreation$$serializer();
        INSTANCE = prepareGroupCreation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.utility.PrepareGroupCreation", prepareGroupCreation$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("groupServiceType", false);
        pluginGeneratedSerialDescriptor.addElement("groupScenarioType", false);
        pluginGeneratedSerialDescriptor.addElement("groupName", false);
        pluginGeneratedSerialDescriptor.addElement("groupImageUri", false);
        pluginGeneratedSerialDescriptor.addElement("memberIds", false);
        pluginGeneratedSerialDescriptor.addElement("groupSettings", true);
        pluginGeneratedSerialDescriptor.addElement("publicType", true);
        pluginGeneratedSerialDescriptor.addElement("groupDescription", true);
        pluginGeneratedSerialDescriptor.addElement("billingModel", true);
        pluginGeneratedSerialDescriptor.addElement("extras", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PrepareGroupCreation.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[4], BuiltinSerializersKt.getNullable(SetGroupSettingsReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(GroupEntryBillingModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PrepareGroupCreation deserialize(@NotNull Decoder decoder) {
        GroupScenarioType groupScenarioType;
        GroupEntryBillingModel groupEntryBillingModel;
        String str;
        GroupPublicType groupPublicType;
        GroupServiceType groupServiceType;
        int i;
        SetGroupSettingsReq setGroupSettingsReq;
        String str2;
        JsonObject jsonObject;
        Set set;
        String str3;
        GroupScenarioType groupScenarioType2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PrepareGroupCreation.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 8;
        JsonObject jsonObject2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupServiceType groupServiceType2 = (GroupServiceType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GroupScenarioType groupScenarioType3 = (GroupScenarioType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Set set2 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            SetGroupSettingsReq setGroupSettingsReq2 = (SetGroupSettingsReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SetGroupSettingsReq$$serializer.INSTANCE, null);
            GroupPublicType groupPublicType2 = (GroupPublicType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            GroupEntryBillingModel groupEntryBillingModel2 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, GroupEntryBillingModel$$serializer.INSTANCE, null);
            groupPublicType = groupPublicType2;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, JsonObjectSerializer.INSTANCE, null);
            str = str5;
            setGroupSettingsReq = setGroupSettingsReq2;
            groupEntryBillingModel = groupEntryBillingModel2;
            i = 1023;
            set = set2;
            groupScenarioType = groupScenarioType3;
            str3 = str4;
            str2 = strDecodeStringElement;
            groupServiceType = groupServiceType2;
        } else {
            int i5 = 0;
            boolean z = true;
            GroupPublicType groupPublicType3 = null;
            GroupEntryBillingModel groupEntryBillingModel3 = null;
            SetGroupSettingsReq setGroupSettingsReq3 = null;
            Set set3 = null;
            String str6 = null;
            String str7 = null;
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
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                        i5 |= 8;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 4:
                        set3 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], set3);
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
                        groupPublicType3 = (GroupPublicType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], groupPublicType3);
                        i5 |= 64;
                        groupScenarioType2 = groupScenarioType4;
                        groupScenarioType4 = groupScenarioType2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 8;
                        break;
                    case 7:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str7);
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
            str = str7;
            groupPublicType = groupPublicType3;
            groupServiceType = groupServiceType3;
            i = i5;
            JsonObject jsonObject3 = jsonObject2;
            setGroupSettingsReq = setGroupSettingsReq3;
            str2 = strDecodeStringElement2;
            jsonObject = jsonObject3;
            String str8 = str6;
            set = set3;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PrepareGroupCreation(i, groupServiceType, groupScenarioType, str2, str3, set, setGroupSettingsReq, groupPublicType, str, groupEntryBillingModel, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PrepareGroupCreation prepareGroupCreation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(prepareGroupCreation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PrepareGroupCreation.write$Self$OKIMCore_okimcore(prepareGroupCreation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
