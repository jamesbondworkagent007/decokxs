package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.p2p.api.OtcExtraKeys;
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
public final /* synthetic */ class GroupJoinApplicationResponse$$serializer implements GeneratedSerializer<GroupJoinApplicationResponse> {
    public static final int $stable;
    public static final GroupJoinApplicationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupJoinApplicationResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupJoinApplicationResponse$$serializer groupJoinApplicationResponse$$serializer = new GroupJoinApplicationResponse$$serializer();
        INSTANCE = groupJoinApplicationResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupJoinApplicationResponse", groupJoinApplicationResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("memberUid", true);
        pluginGeneratedSerialDescriptor.addElement("nickname", true);
        pluginGeneratedSerialDescriptor.addElement("avatar", true);
        pluginGeneratedSerialDescriptor.addElement("inviterUid", true);
        pluginGeneratedSerialDescriptor.addElement("invitationId", true);
        pluginGeneratedSerialDescriptor.addElement("applicationStatus", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.REASON, true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GroupJoinApplicationResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupJoinApplicationResponse deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        GroupApplicationStatus groupApplicationStatus;
        Long l;
        Long l2;
        Long l3;
        int i;
        String str3;
        Long l4;
        String str4;
        String str5;
        Long l5;
        KSerializer[] kSerializerArr;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = GroupJoinApplicationResponse.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        int i4 = 7;
        Long l10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Long l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            GroupApplicationStatus groupApplicationStatus2 = (GroupApplicationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr2[7], null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Long l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            groupApplicationStatus = groupApplicationStatus2;
            str2 = str10;
            l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            l = l13;
            str3 = str9;
            str5 = str7;
            i = 2047;
            str4 = str6;
            str = str8;
            l4 = l11;
            l3 = l12;
        } else {
            int i5 = 10;
            int i6 = 0;
            boolean z = true;
            String str11 = null;
            String str12 = null;
            GroupApplicationStatus groupApplicationStatus3 = null;
            String str13 = null;
            str = null;
            Long l14 = null;
            Long l15 = null;
            String str14 = null;
            Long l16 = null;
            Long l17 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        l6 = l15;
                        l7 = l16;
                        l8 = l17;
                        z = false;
                        l9 = l8;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 0:
                        l6 = l15;
                        l7 = l16;
                        l8 = l17;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i6 |= 1;
                        l9 = l8;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 1:
                        l6 = l15;
                        l7 = l16;
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l17);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 2:
                        l7 = l16;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l15);
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 3:
                        l7 = l16;
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        l6 = l15;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 4:
                        l7 = l16;
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str);
                        l6 = l15;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 5:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l16);
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        l6 = l15;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str11);
                        l6 = l15;
                        l7 = l16;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        groupApplicationStatus3 = (GroupApplicationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr2[i4], groupApplicationStatus3);
                        l6 = l15;
                        l7 = l16;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str12);
                        l6 = l15;
                        l7 = l16;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    case 9:
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l14);
                        i6 |= 512;
                        break;
                    case 10:
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, LongSerializer.INSTANCE, l10);
                        l6 = l15;
                        l7 = l16;
                        l9 = l17;
                        kSerializerArr2 = kSerializerArr;
                        l16 = l7;
                        l15 = l6;
                        l17 = l9;
                        i5 = 10;
                        i2 = 9;
                        i3 = 8;
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l18 = l15;
            str2 = str12;
            groupApplicationStatus = groupApplicationStatus3;
            l = l14;
            l2 = l10;
            l3 = l16;
            i = i6;
            str3 = str11;
            l4 = l17;
            str4 = str14;
            str5 = str13;
            l5 = l18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupJoinApplicationResponse(i, str4, l4, l5, str5, str, l3, str3, groupApplicationStatus, str2, l, l2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupJoinApplicationResponse groupJoinApplicationResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupJoinApplicationResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupJoinApplicationResponse.write$Self$OKIMCore_okimcore(groupJoinApplicationResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
