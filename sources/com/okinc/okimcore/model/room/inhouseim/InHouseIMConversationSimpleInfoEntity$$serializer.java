package com.okinc.okimcore.model.room.inhouseim;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class InHouseIMConversationSimpleInfoEntity$$serializer implements GeneratedSerializer<InHouseIMConversationSimpleInfoEntity> {
    public static final int $stable;
    public static final InHouseIMConversationSimpleInfoEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseIMConversationSimpleInfoEntity$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseIMConversationSimpleInfoEntity$$serializer inHouseIMConversationSimpleInfoEntity$$serializer = new InHouseIMConversationSimpleInfoEntity$$serializer();
        INSTANCE = inHouseIMConversationSimpleInfoEntity$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity", inHouseIMConversationSimpleInfoEntity$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.CHANNEL_ID, true);
        pluginGeneratedSerialDescriptor.addElement("lastMsgTime", true);
        pluginGeneratedSerialDescriptor.addElement("pinnedStatus", true);
        pluginGeneratedSerialDescriptor.addElement("isFlagged", true);
        pluginGeneratedSerialDescriptor.addElement("inGroupStatus", true);
        pluginGeneratedSerialDescriptor.addElement("lastReadMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("startMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("endMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InHouseIMConversationSimpleInfoEntity.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseIMConversationSimpleInfoEntity deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        InGroupStatus inGroupStatus;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InHouseIMConversationSimpleInfoEntity.$childSerializers;
        int i5 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            InGroupStatus inGroupStatus2 = (InGroupStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            inGroupStatus = inGroupStatus2;
            str5 = strDecodeStringElement;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str = str8;
            str6 = str7;
            i2 = iDecodeIntElement2;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i3 = iDecodeIntElement;
            str4 = strDecodeStringElement2;
            i = 511;
        } else {
            int iDecodeIntElement3 = 0;
            i = 0;
            boolean z = true;
            String str9 = null;
            String str10 = null;
            InGroupStatus inGroupStatus3 = null;
            String str11 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str12 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 7;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i5 = 7;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i5 = 7;
                        break;
                    case 2:
                        i |= 4;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 = 7;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i |= 8;
                        i5 = 7;
                        break;
                    case 4:
                        inGroupStatus3 = (InGroupStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], inGroupStatus3);
                        i |= 16;
                        i5 = 7;
                        break;
                    case 5:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str12);
                        i |= 32;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                        i4 = i | 64;
                        i = i4;
                        i5 = 7;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str10);
                        i4 = i | 128;
                        i = i4;
                        i5 = 7;
                        break;
                    case 8:
                        i |= 256;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str11);
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = iDecodeIntElement3;
            str = str9;
            str2 = str10;
            inGroupStatus = inGroupStatus3;
            str3 = str11;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            str6 = str12;
            i3 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseIMConversationSimpleInfoEntity(i, str5, str4, i3, i2, inGroupStatus, str6, str, str2, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationSimpleInfoEntity, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseIMConversationSimpleInfoEntity.write$Self$OKIMCore_okimcore(inHouseIMConversationSimpleInfoEntity, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
