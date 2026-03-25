package com.okinc.okimcore.model.remote;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class InHouseUserInfo$$serializer implements GeneratedSerializer<InHouseUserInfo> {
    public static final int $stable;
    public static final InHouseUserInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseUserInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseUserInfo$$serializer inHouseUserInfo$$serializer = new InHouseUserInfo$$serializer();
        INSTANCE = inHouseUserInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.InHouseUserInfo", inHouseUserInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("userUid", true);
        pluginGeneratedSerialDescriptor.addElement("avatar", true);
        pluginGeneratedSerialDescriptor.addElement("nickname", true);
        pluginGeneratedSerialDescriptor.addElement("enNickname", true);
        pluginGeneratedSerialDescriptor.addElement("bio", true);
        pluginGeneratedSerialDescriptor.addElement("enBio", true);
        pluginGeneratedSerialDescriptor.addElement("tags", true);
        pluginGeneratedSerialDescriptor.addElement("userPrivacySettingsDto", true);
        pluginGeneratedSerialDescriptor.addElement("userGlobalPermissionDto", true);
        pluginGeneratedSerialDescriptor.addElement("phoneSyncQuota", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InHouseUserInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(UserPrivacySettingsDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserGlobalPermissionDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(InHouseUserConfigDto$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseUserInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        InHouseUserConfigDto inHouseUserConfigDto;
        UserPrivacySettingsDto userPrivacySettingsDto;
        String str3;
        List list;
        UserGlobalPermissionDto userGlobalPermissionDto;
        String str4;
        String str5;
        Long l;
        String str6;
        int i;
        KSerializer[] kSerializerArr;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InHouseUserInfo.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            UserPrivacySettingsDto userPrivacySettingsDto2 = (UserPrivacySettingsDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, UserPrivacySettingsDto$$serializer.INSTANCE, null);
            UserGlobalPermissionDto userGlobalPermissionDto2 = (UserGlobalPermissionDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UserGlobalPermissionDto$$serializer.INSTANCE, null);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, null);
            list = list2;
            str4 = str15;
            inHouseUserConfigDto = (InHouseUserConfigDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, InHouseUserConfigDto$$serializer.INSTANCE, null);
            l = l3;
            userPrivacySettingsDto = userPrivacySettingsDto2;
            userGlobalPermissionDto = userGlobalPermissionDto2;
            str5 = str13;
            str2 = str14;
            str = str12;
            str6 = str10;
            str3 = str11;
            i = 2047;
        } else {
            int i6 = 0;
            boolean z = true;
            InHouseUserConfigDto inHouseUserConfigDto2 = null;
            UserPrivacySettingsDto userPrivacySettingsDto3 = null;
            List list3 = null;
            UserGlobalPermissionDto userGlobalPermissionDto3 = null;
            String str16 = null;
            String str17 = null;
            str = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        kSerializerArr2 = kSerializerArr2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str7 = str;
                        str8 = str19;
                        i6 |= 1;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        str9 = str18;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        str7 = str;
                        str8 = str19;
                        kSerializerArr = kSerializerArr2;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i6 |= 2;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        str8 = str19;
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        str9 = str18;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        str8 = str19;
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                        str7 = str;
                        str9 = str18;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        str7 = str;
                        str9 = str18;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str16);
                        str7 = str;
                        str9 = str18;
                        str8 = str19;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list3);
                        str7 = str;
                        str9 = str18;
                        str8 = str19;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        userPrivacySettingsDto3 = (UserPrivacySettingsDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, UserPrivacySettingsDto$$serializer.INSTANCE, userPrivacySettingsDto3);
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str7 = str;
                        str9 = str18;
                        str8 = str19;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        userGlobalPermissionDto3 = (UserGlobalPermissionDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, UserGlobalPermissionDto$$serializer.INSTANCE, userGlobalPermissionDto3);
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str7 = str;
                        str9 = str18;
                        str8 = str19;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l2);
                        str7 = str;
                        str9 = str18;
                        str8 = str19;
                        str18 = str9;
                        str19 = str8;
                        str = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 10:
                        inHouseUserConfigDto2 = (InHouseUserConfigDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, InHouseUserConfigDto$$serializer.INSTANCE, inHouseUserConfigDto2);
                        i6 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str20;
            str2 = str19;
            inHouseUserConfigDto = inHouseUserConfigDto2;
            userPrivacySettingsDto = userPrivacySettingsDto3;
            str3 = str18;
            list = list3;
            userGlobalPermissionDto = userGlobalPermissionDto3;
            str4 = str16;
            str5 = str17;
            l = l2;
            str6 = str21;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseUserInfo(i, str6, str3, str, str5, str2, str4, list, userPrivacySettingsDto, userGlobalPermissionDto, l, inHouseUserConfigDto, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseUserInfo inHouseUserInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseUserInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseUserInfo.write$Self$OKIMCore_okimcore(inHouseUserInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
