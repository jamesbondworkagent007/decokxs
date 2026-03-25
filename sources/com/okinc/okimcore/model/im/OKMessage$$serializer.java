package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.firebase.messaging.Constants;
import com.okinc.okimcore.model.im.OKMessage;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class OKMessage$$serializer implements GeneratedSerializer<OKMessage> {
    public static final int $stable;
    public static final OKMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKMessage$$serializer oKMessage$$serializer = new OKMessage$$serializer();
        INSTANCE = oKMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKMessage", oKMessage$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("seq", true);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", false);
        pluginGeneratedSerialDescriptor.addElement("targetId", false);
        pluginGeneratedSerialDescriptor.addElement("senderUserId", true);
        pluginGeneratedSerialDescriptor.addElement("messageType", true);
        pluginGeneratedSerialDescriptor.addElement("conversationType", false);
        pluginGeneratedSerialDescriptor.addElement("sentTime", true);
        pluginGeneratedSerialDescriptor.addElement("receivedTime", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("objectName", true);
        pluginGeneratedSerialDescriptor.addElement("messageDirection", true);
        pluginGeneratedSerialDescriptor.addElement("sentStatus", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("messagePushConfig", true);
        pluginGeneratedSerialDescriptor.addElement("sourceJsonString", true);
        pluginGeneratedSerialDescriptor.addElement("isVisible", true);
        pluginGeneratedSerialDescriptor.addElement(Constants.IPC_BUNDLE_KEY_SEND_ERROR, true);
        pluginGeneratedSerialDescriptor.addElement("reactionDisplay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKMessage.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[5], longSerializer, longSerializer, stringSerializer, stringSerializer, kSerializerArr[10], BuiltinSerializersKt.getNullable(kSerializerArr[11]), BuiltinSerializersKt.getNullable(kSerializerArr[12]), BuiltinSerializersKt.getNullable(OKMessagePushConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[17])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKMessage deserialize(@NotNull Decoder decoder) {
        String str;
        OKMessage.SentStatus sentStatus;
        List list;
        String str2;
        OKMessageContent oKMessageContent;
        OKConversationType oKConversationType;
        OKMessagePushConfig oKMessagePushConfig;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        OKMessage.MessageDirection messageDirection;
        int i;
        String str7;
        long j;
        long j2;
        long j3;
        KSerializer[] kSerializerArr;
        String str8;
        String str9;
        String str10;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = OKMessage.$childSerializers;
        int i4 = 9;
        int i5 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            OKConversationType oKConversationType2 = (OKConversationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            OKMessage.MessageDirection messageDirection2 = (OKMessage.MessageDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            OKMessage.SentStatus sentStatus2 = (OKMessage.SentStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            OKMessageContent oKMessageContent2 = (OKMessageContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr2[12], null);
            OKMessagePushConfig oKMessagePushConfig2 = (OKMessagePushConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, OKMessagePushConfig$$serializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr2[17], null);
            num = num2;
            str5 = strDecodeStringElement3;
            str2 = str12;
            z = zDecodeBooleanElement;
            str7 = str14;
            oKMessagePushConfig = oKMessagePushConfig2;
            sentStatus = sentStatus2;
            messageDirection = messageDirection2;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement2;
            oKMessageContent = oKMessageContent2;
            oKConversationType = oKConversationType2;
            str = str11;
            j = jDecodeLongElement3;
            str4 = strDecodeStringElement2;
            str3 = str13;
            str6 = strDecodeStringElement;
            i = 262143;
        } else {
            int i6 = 17;
            long jDecodeLongElement4 = 0;
            boolean zDecodeBooleanElement2 = false;
            OKMessage.SentStatus sentStatus3 = null;
            OKMessageContent oKMessageContent3 = null;
            OKMessage.MessageDirection messageDirection3 = null;
            OKConversationType oKConversationType3 = null;
            OKMessagePushConfig oKMessagePushConfig3 = null;
            Integer num3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String str15 = null;
            String strDecodeStringElement6 = null;
            String str16 = null;
            String str17 = null;
            boolean z2 = true;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            List list2 = null;
            String str18 = null;
            int i7 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str8 = str15;
                        str9 = str17;
                        z2 = false;
                        str15 = str8;
                        str17 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str8 = str15;
                        str9 = str17;
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i7 |= 1;
                        str15 = str8;
                        str17 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str8 = str15;
                        str9 = str17;
                        i7 |= 2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str16);
                        str15 = str8;
                        str17 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        i7 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        str10 = str17;
                        kSerializerArr = kSerializerArr2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str15);
                        i7 |= 8;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str17);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 16;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        i7 |= 32;
                        str10 = str17;
                        oKConversationType3 = (OKConversationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr2[5], oKConversationType3);
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 6:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i7 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i7 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        i2 = i4;
                        i7 |= 512;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i4 = i2;
                        i6 = 17;
                        break;
                    case 10:
                        i7 |= 1024;
                        messageDirection3 = (OKMessage.MessageDirection) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], messageDirection3);
                        i2 = 9;
                        i4 = i2;
                        i6 = 17;
                        break;
                    case 11:
                        kSerializerArr = kSerializerArr2;
                        i7 |= 2048;
                        sentStatus3 = (OKMessage.SentStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr2[11], sentStatus3);
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        kSerializerArr = kSerializerArr2;
                        i7 |= 4096;
                        str10 = str17;
                        oKMessageContent3 = (OKMessageContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr2[12], oKMessageContent3);
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 13:
                        i7 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        oKMessagePushConfig3 = (OKMessagePushConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, OKMessagePushConfig$$serializer.INSTANCE, oKMessagePushConfig3);
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 14:
                        i7 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str18);
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 15:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i7 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 16:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, num3);
                        i3 = 65536;
                        i7 |= i3;
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    case 17:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kSerializerArr2[i6], list2);
                        i3 = 131072;
                        i7 |= i3;
                        kSerializerArr = kSerializerArr2;
                        str10 = str17;
                        str17 = str10;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 17;
                        i5 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str17;
            str = str16;
            sentStatus = sentStatus3;
            list = list2;
            str2 = str15;
            oKMessageContent = oKMessageContent3;
            oKConversationType = oKConversationType3;
            oKMessagePushConfig = oKMessagePushConfig3;
            num = num3;
            str3 = str19;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
            z = zDecodeBooleanElement2;
            messageDirection = messageDirection3;
            i = i7;
            str7 = str18;
            j = jDecodeLongElement4;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKMessage(i, j2, str, str6, str2, str3, oKConversationType, j3, j, str4, str5, messageDirection, sentStatus, oKMessageContent, oKMessagePushConfig, str7, z, num, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKMessage.write$Self$OKIMCore_okimcore(oKMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
