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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class SetGroupSettingsReq$$serializer implements GeneratedSerializer<SetGroupSettingsReq> {
    public static final int $stable;
    public static final SetGroupSettingsReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SetGroupSettingsReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SetGroupSettingsReq$$serializer setGroupSettingsReq$$serializer = new SetGroupSettingsReq$$serializer();
        INSTANCE = setGroupSettingsReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.SetGroupSettingsReq", setGroupSettingsReq$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("allowMentionOthers", true);
        pluginGeneratedSerialDescriptor.addElement("groupName", true);
        pluginGeneratedSerialDescriptor.addElement("bizGroupName", true);
        pluginGeneratedSerialDescriptor.addElement("groupAvatar", true);
        pluginGeneratedSerialDescriptor.addElement("publicType", true);
        pluginGeneratedSerialDescriptor.addElement("allowSendLink", true);
        pluginGeneratedSerialDescriptor.addElement("allowPrivateChat", true);
        pluginGeneratedSerialDescriptor.addElement("allowMentionRobot", true);
        pluginGeneratedSerialDescriptor.addElement("allowMembersSendMessage", true);
        pluginGeneratedSerialDescriptor.addElement("allowViewHistory", true);
        pluginGeneratedSerialDescriptor.addElement("disbandGroup", true);
        pluginGeneratedSerialDescriptor.addElement("allowMembersToAddMembers", true);
        pluginGeneratedSerialDescriptor.addElement("allowSharingInvitationQrCode", true);
        pluginGeneratedSerialDescriptor.addElement("requireAdminApprovalToJoin", true);
        pluginGeneratedSerialDescriptor.addElement("groupDescription", true);
        pluginGeneratedSerialDescriptor.addElement("upgradeToSuperGroup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(longSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(longSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SetGroupSettingsReq deserialize(@NotNull Decoder decoder) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Long l5;
        Long l6;
        Long l7;
        String str;
        Long l8;
        Long l9;
        String str2;
        String str3;
        Integer num2;
        Integer num3;
        String str4;
        Long l10;
        int i;
        Long l11;
        Long l12;
        Long l13;
        int i2;
        int i3;
        Long l14;
        Long l15;
        String str5;
        Long l16;
        Long l17;
        Long l18;
        String str6;
        Long l19;
        Long l20;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l21 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l22 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Long l23 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l24 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            Long l25 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l26 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l27 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            Long l28 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            Long l29 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, longSerializer, null);
            Long l30 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, longSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, intSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            num = num5;
            l7 = l25;
            l6 = l23;
            l4 = l30;
            l3 = l29;
            l8 = l22;
            i = 131071;
            l = l24;
            l2 = l26;
            l9 = l21;
            str3 = str10;
            num2 = num4;
            l5 = l27;
            str2 = str9;
            str4 = str8;
            l10 = l28;
        } else {
            int i4 = 16;
            int i5 = 0;
            boolean z = true;
            Long l31 = null;
            Long l32 = null;
            String str11 = null;
            String str12 = null;
            Integer num6 = null;
            Long l33 = null;
            Long l34 = null;
            Integer num7 = null;
            Integer num8 = null;
            Long l35 = null;
            Long l36 = null;
            Long l37 = null;
            Long l38 = null;
            String str13 = null;
            Long l39 = null;
            Long l40 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l14 = l31;
                        l15 = l32;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        str6 = str13;
                        l19 = l40;
                        l20 = l39;
                        z = false;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 0:
                        l14 = l31;
                        l15 = l32;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        str6 = str13;
                        Long l41 = l40;
                        l20 = l39;
                        l19 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l41);
                        i5 |= 1;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 1:
                        l14 = l31;
                        l15 = l32;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        str6 = str13;
                        l39 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l39);
                        i5 |= 2;
                        l19 = l40;
                        l20 = l39;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 2:
                        l14 = l31;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        l15 = l32;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        i5 |= 4;
                        str6 = str13;
                        l19 = l40;
                        l20 = l39;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 3:
                        l14 = l31;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str11);
                        i5 |= 8;
                        l15 = l32;
                        str6 = str13;
                        l19 = l40;
                        l20 = l39;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 4:
                        l14 = l31;
                        str5 = str7;
                        l16 = l36;
                        l17 = l37;
                        l18 = l38;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str12);
                        l15 = l32;
                        i5 |= 16;
                        str6 = str13;
                        l19 = l40;
                        l20 = l39;
                        l38 = l18;
                        l36 = l16;
                        str13 = str6;
                        l32 = l15;
                        l37 = l17;
                        str7 = str5;
                        l39 = l20;
                        i4 = 16;
                        l40 = l19;
                        l31 = l14;
                        break;
                    case 5:
                        l11 = l31;
                        l32 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l32);
                        i5 |= 32;
                        str7 = str7;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 6:
                        l11 = l31;
                        l12 = l36;
                        l13 = l37;
                        l38 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l38);
                        i5 |= 64;
                        str7 = str7;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 7:
                        l11 = l31;
                        l12 = l36;
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, l37);
                        i5 |= 128;
                        str7 = str7;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 8:
                        l11 = l31;
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l36);
                        i5 |= 256;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 9:
                        i5 |= 512;
                        l11 = l31;
                        l35 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, l35);
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 10:
                        l31 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, l31);
                        i2 = i5 | 1024;
                        l11 = l31;
                        i5 = i2;
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 11:
                        i5 |= 2048;
                        l11 = l31;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num6);
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 12:
                        i5 |= 4096;
                        l11 = l31;
                        l33 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, l33);
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 13:
                        i5 |= 8192;
                        l11 = l31;
                        l34 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, l34);
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 14:
                        i5 |= 16384;
                        l11 = l31;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, num8);
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 15:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str7);
                        i3 = 32768;
                        i2 = i3 | i5;
                        l11 = l31;
                        i5 = i2;
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    case 16:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num7);
                        i3 = 65536;
                        i2 = i3 | i5;
                        l11 = l31;
                        i5 = i2;
                        l12 = l36;
                        l13 = l37;
                        l36 = l12;
                        l37 = l13;
                        l31 = l11;
                        i4 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l38;
            l2 = l36;
            l3 = l33;
            l4 = l34;
            num = num8;
            l5 = l35;
            l6 = l32;
            l7 = l37;
            str = str7;
            l8 = l39;
            l9 = l40;
            str2 = str11;
            str3 = str12;
            num2 = num6;
            num3 = num7;
            str4 = str13;
            l10 = l31;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SetGroupSettingsReq(i, l9, l8, str4, str2, str3, l6, l, l7, l2, l5, l10, num2, l3, l4, num, str, num3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SetGroupSettingsReq setGroupSettingsReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(setGroupSettingsReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SetGroupSettingsReq.write$Self$OKIMCore_okimcore(setGroupSettingsReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
