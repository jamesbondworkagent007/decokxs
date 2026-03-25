package com.okinc.okimcore.model.im;

import com.huawei.hms.api.FailedBinderCallBack;
import com.okinc.okimcore.model.im.OKCallCommon;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class OKCallSession$$serializer implements GeneratedSerializer<OKCallSession> {
    public static final int $stable;
    public static final OKCallSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallSession$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallSession$$serializer oKCallSession$$serializer = new OKCallSession$$serializer();
        INSTANCE = oKCallSession$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallSession", oKCallSession$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement(FailedBinderCallBack.CALLER_ID, true);
        pluginGeneratedSerialDescriptor.addElement("conversationType", true);
        pluginGeneratedSerialDescriptor.addElement("targetId", false);
        pluginGeneratedSerialDescriptor.addElement("contactId", false);
        pluginGeneratedSerialDescriptor.addElement("startTime", true);
        pluginGeneratedSerialDescriptor.addElement("mediaType", false);
        pluginGeneratedSerialDescriptor.addElement("callerUserId", true);
        pluginGeneratedSerialDescriptor.addElement("selfUserId", true);
        pluginGeneratedSerialDescriptor.addElement("activeTime", true);
        pluginGeneratedSerialDescriptor.addElement("inviterUserId", true);
        pluginGeneratedSerialDescriptor.addElement("callType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = OKCallSession.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[1]), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallSession deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        OKConversationType oKConversationType;
        String str;
        OKCallCommon.OKCallMediaType oKCallMediaType;
        String str2;
        Long l;
        Long l2;
        OKCallCommon.OKVoiceCallType oKVoiceCallType;
        String str3;
        String str4;
        int i;
        OKConversationType oKConversationType2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCallSession.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 8;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKConversationType oKConversationType3 = (OKConversationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            OKCallCommon.OKCallMediaType oKCallMediaType2 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            oKVoiceCallType = (OKCallCommon.OKVoiceCallType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str3 = str9;
            oKCallMediaType = oKCallMediaType2;
            str = str8;
            str2 = str7;
            strDecodeStringElement2 = strDecodeStringElement4;
            oKConversationType = oKConversationType3;
            l = l4;
            l2 = l3;
            strDecodeStringElement = strDecodeStringElement3;
            i = 2047;
            str4 = str6;
        } else {
            int i5 = 10;
            int i6 = 0;
            boolean z = true;
            String str10 = null;
            OKCallCommon.OKCallMediaType oKCallMediaType3 = null;
            String str11 = null;
            Long l5 = null;
            Long l6 = null;
            OKCallCommon.OKVoiceCallType oKVoiceCallType2 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            OKConversationType oKConversationType4 = null;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        oKConversationType2 = oKConversationType4;
                        z = false;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 0:
                        oKConversationType2 = oKConversationType4;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str12);
                        i6 |= 1;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 1:
                        oKConversationType4 = (OKConversationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], oKConversationType4);
                        i6 |= 2;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 4:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l6);
                        i6 |= 16;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 5:
                        oKCallMediaType3 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], oKCallMediaType3);
                        i6 |= 32;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 6:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i6 |= 64;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str10);
                        i6 |= 128;
                        i5 = 10;
                        break;
                    case 8:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l5);
                        i6 |= 256;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 9:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str5);
                        i6 |= 512;
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    case 10:
                        i6 |= 1024;
                        oKVoiceCallType2 = (OKCallCommon.OKVoiceCallType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], oKVoiceCallType2);
                        oKConversationType2 = oKConversationType4;
                        oKConversationType4 = oKConversationType2;
                        i5 = 10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str13 = str12;
            oKConversationType = oKConversationType4;
            str = str10;
            oKCallMediaType = oKCallMediaType3;
            str2 = str11;
            l = l5;
            l2 = l6;
            oKVoiceCallType = oKVoiceCallType2;
            str3 = str5;
            str4 = str13;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallSession(i, str4, oKConversationType, strDecodeStringElement, strDecodeStringElement2, l2, oKCallMediaType, str2, str, l, str3, oKVoiceCallType, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallSession oKCallSession) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallSession, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallSession.write$Self$OKIMCore_okimcore(oKCallSession, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
