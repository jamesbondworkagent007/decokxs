package com.okinc.okimcore.model.room.inhouseim;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class InHouseIMGroupMemberEntity$$serializer implements GeneratedSerializer<InHouseIMGroupMemberEntity> {
    public static final int $stable;
    public static final InHouseIMGroupMemberEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseIMGroupMemberEntity$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseIMGroupMemberEntity$$serializer inHouseIMGroupMemberEntity$$serializer = new InHouseIMGroupMemberEntity$$serializer();
        INSTANCE = inHouseIMGroupMemberEntity$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity", inHouseIMGroupMemberEntity$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("memberId", true);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("inviteId", true);
        pluginGeneratedSerialDescriptor.addElement("role", true);
        pluginGeneratedSerialDescriptor.addElement("memberName", true);
        pluginGeneratedSerialDescriptor.addElement("memberGroupPetname", true);
        pluginGeneratedSerialDescriptor.addElement("memberAvatar", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("memberRemark", true);
        pluginGeneratedSerialDescriptor.addElement("v3", true);
        pluginGeneratedSerialDescriptor.addElement("officialTag", true);
        pluginGeneratedSerialDescriptor.addElement("memberEnPetname", true);
        pluginGeneratedSerialDescriptor.addElement("paidGroupMemberStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(OfficialTagInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(PaidGroupMemberStatus$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseIMGroupMemberEntity deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        long j;
        PaidGroupMemberStatus paidGroupMemberStatus;
        String str4;
        String str5;
        String str6;
        OfficialTagInfo officialTagInfo;
        String str7;
        String str8;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            OfficialTagInfo officialTagInfo2 = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, OfficialTagInfo$$serializer.INSTANCE, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, null);
            str8 = strDecodeStringElement2;
            paidGroupMemberStatus = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, PaidGroupMemberStatus$$serializer.INSTANCE, null);
            officialTagInfo = officialTagInfo2;
            str7 = strDecodeStringElement9;
            str = strDecodeStringElement8;
            str4 = str9;
            i2 = iDecodeIntElement2;
            str5 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement6;
            j2 = jDecodeLongElement;
            j = jDecodeLongElement2;
            str3 = strDecodeStringElement3;
            i3 = iDecodeIntElement;
            str6 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            i = 32767;
        } else {
            int i4 = 14;
            int i5 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            PaidGroupMemberStatus paidGroupMemberStatus2 = null;
            String str10 = null;
            OfficialTagInfo officialTagInfo3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 14;
                        break;
                    case 0:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 14;
                        break;
                    case 1:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 14;
                        break;
                    case 2:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 14;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 14;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 14;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = 14;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 14;
                        break;
                    case 7:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 14;
                        break;
                    case 8:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 14;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 14;
                        break;
                    case 10:
                        i5 |= 1024;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i4 = 14;
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 = 14;
                        break;
                    case 12:
                        i5 |= 4096;
                        officialTagInfo3 = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, OfficialTagInfo$$serializer.INSTANCE, officialTagInfo3);
                        i4 = 14;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str10);
                        i5 |= 8192;
                        i4 = 14;
                        break;
                    case 14:
                        paidGroupMemberStatus2 = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, PaidGroupMemberStatus$$serializer.INSTANCE, paidGroupMemberStatus2);
                        i5 |= 16384;
                        i4 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = strDecodeStringElement11;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            j = jDecodeLongElement4;
            paidGroupMemberStatus = paidGroupMemberStatus2;
            str4 = str10;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement16;
            long j3 = jDecodeLongElement3;
            officialTagInfo = officialTagInfo3;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement15;
            j2 = j3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseIMGroupMemberEntity(i, str8, str3, str2, i3, str6, strDecodeStringElement, str5, i2, j2, j, str, str7, officialTagInfo, str4, paidGroupMemberStatus, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupMemberEntity, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseIMGroupMemberEntity.write$Self$OKIMCore_okimcore(inHouseIMGroupMemberEntity, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
