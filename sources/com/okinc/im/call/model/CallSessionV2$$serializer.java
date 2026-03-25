package com.okinc.im.call.model;

import com.huawei.hms.api.FailedBinderCallBack;
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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CallSessionV2$$serializer implements GeneratedSerializer<CallSessionV2> {
    public static final int $stable;
    public static final CallSessionV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CallSessionV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CallSessionV2$$serializer callSessionV2$$serializer = new CallSessionV2$$serializer();
        INSTANCE = callSessionV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.im.call.model.CallSessionV2", callSessionV2$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement(FailedBinderCallBack.CALLER_ID, true);
        pluginGeneratedSerialDescriptor.addElement("conversationId", false);
        pluginGeneratedSerialDescriptor.addElement("calleeUserId", false);
        pluginGeneratedSerialDescriptor.addElement("callerUserId", false);
        pluginGeneratedSerialDescriptor.addElement("selfUserId", false);
        pluginGeneratedSerialDescriptor.addElement("agoraToken", true);
        pluginGeneratedSerialDescriptor.addElement("agoraAppId", true);
        pluginGeneratedSerialDescriptor.addElement("agoraUid", true);
        pluginGeneratedSerialDescriptor.addElement("callType", true);
        pluginGeneratedSerialDescriptor.addElement("mediaType", true);
        pluginGeneratedSerialDescriptor.addElement("meetingId", true);
        pluginGeneratedSerialDescriptor.addElement("nonLoginUserId", true);
        pluginGeneratedSerialDescriptor.addElement("nonLoginUUID", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("agoraGroupChannelName", true);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("isGroupCallInitiator", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CallSessionV2.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, kSerializerArr[8], kSerializerArr[9], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CallSessionV2 deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean zDecodeBooleanElement;
        String str7;
        int i;
        long j;
        String str8;
        String str9;
        CallType callType;
        String str10;
        MediaType mediaType;
        String str11;
        String str12;
        int i2;
        char c;
        int i3;
        char c2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CallSessionV2.$childSerializers;
        int i4 = 8;
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            CallType callType2 = (CallType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            MediaType mediaType2 = (MediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            str3 = strDecodeStringElement4;
            str10 = str14;
            str5 = strDecodeStringElement6;
            i2 = 131071;
            str9 = str15;
            str = str17;
            str8 = str16;
            j = jDecodeLongElement;
            str7 = strDecodeStringElement3;
            str11 = strDecodeStringElement2;
            callType = callType2;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            mediaType = mediaType2;
            str12 = strDecodeStringElement;
            i = iDecodeIntElement;
        } else {
            int i5 = 16;
            boolean z = true;
            String str18 = null;
            String str19 = null;
            CallType callType3 = null;
            String str20 = null;
            MediaType mediaType3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            long jDecodeLongElement2 = 0;
            String str21 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 7;
                        z = false;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 0:
                        c = 7;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 1:
                        c = 7;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 2:
                        c = 7;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 3:
                        c = 7;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 4:
                        c = 7;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 5:
                        c = 7;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 6:
                        c = 7;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 7:
                        i3 = i4;
                        c2 = 7;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i6 |= 128;
                        i4 = i3;
                        i5 = 16;
                        break;
                    case 8:
                        i3 = i4;
                        i6 |= 256;
                        callType3 = (CallType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], callType3);
                        c2 = 7;
                        i4 = i3;
                        i5 = 16;
                        break;
                    case 9:
                        mediaType3 = (MediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], mediaType3);
                        i6 |= 512;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 10:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str20);
                        i6 |= 1024;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 11:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str13);
                        i6 |= 2048;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 12:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str18);
                        i6 |= 4096;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 13:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i6 |= 8192;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 14:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str19);
                        i6 |= 16384;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 15:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str21);
                        i6 |= 32768;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    case 16:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i6 = 65536 | i6;
                        c = 7;
                        i5 = 16;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str19;
            str2 = str21;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str7 = strDecodeStringElement10;
            i = iDecodeIntElement2;
            j = jDecodeLongElement2;
            str8 = str18;
            str9 = str13;
            callType = callType3;
            str10 = str20;
            mediaType = mediaType3;
            str11 = strDecodeStringElement11;
            str12 = strDecodeStringElement12;
            i2 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CallSessionV2(i2, str12, str11, str7, str3, str4, str5, str6, i, callType, mediaType, str10, str9, str8, j, str, str2, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CallSessionV2 callSessionV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(callSessionV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CallSessionV2.KWHzl(callSessionV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
