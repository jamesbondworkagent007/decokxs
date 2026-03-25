package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.im.OKReadReceiptMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class OKReadReceiptMessage$$serializer implements GeneratedSerializer<OKReadReceiptMessage> {
    public static final int $stable;
    public static final OKReadReceiptMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKReadReceiptMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKReadReceiptMessage$$serializer oKReadReceiptMessage$$serializer = new OKReadReceiptMessage$$serializer();
        INSTANCE = oKReadReceiptMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKReadReceiptMessage", oKReadReceiptMessage$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement("lastMessageSendTime", true);
        pluginGeneratedSerialDescriptor.addElement("messageUId", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKReadReceiptMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, longSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[10]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKReadReceiptMessage deserialize(@NotNull Decoder decoder) {
        int i;
        OKMentionedInfo oKMentionedInfo;
        boolean zDecodeBooleanElement;
        String str;
        InHouseIMContentType inHouseIMContentType;
        boolean z;
        long j;
        long j2;
        String str2;
        OKReadReceiptMessage.ReadReceiptType readReceiptType;
        String str3;
        OKUserInfo oKUserInfo;
        OKUserInfo oKUserInfo2;
        String str4;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKReadReceiptMessage.$childSerializers;
        int i4 = 9;
        int i5 = 7;
        int i6 = 5;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo2 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            readReceiptType = (OKReadReceiptMessage.ReadReceiptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str3 = str7;
            z = zDecodeBooleanElement3;
            str2 = str6;
            oKMentionedInfo = oKMentionedInfo2;
            str = str5;
            j2 = jDecodeLongElement2;
            inHouseIMContentType = inHouseIMContentType2;
            oKUserInfo = oKUserInfo3;
            j = jDecodeLongElement;
            i = 2047;
            zDecodeBooleanElement = zDecodeBooleanElement2;
        } else {
            int i8 = 10;
            i = 0;
            boolean z2 = true;
            OKReadReceiptMessage.ReadReceiptType readReceiptType2 = null;
            InHouseIMContentType inHouseIMContentType3 = null;
            oKMentionedInfo = null;
            OKUserInfo oKUserInfo4 = null;
            String str8 = null;
            String str9 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            zDecodeBooleanElement = false;
            String str10 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        oKUserInfo2 = oKUserInfo4;
                        str4 = str8;
                        z2 = false;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 0:
                        oKUserInfo2 = oKUserInfo4;
                        str4 = str8;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                        i |= 1;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 1:
                        str4 = str8;
                        oKUserInfo4 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo4);
                        i2 = i | 2;
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 2:
                        str4 = str8;
                        oKMentionedInfo = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo);
                        i2 = i | 4;
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 3:
                        i2 = i | 8;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str8);
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 4:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i6);
                        i |= 32;
                        break;
                    case 6:
                        i |= 64;
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseIMContentType3);
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i |= 128;
                        oKUserInfo2 = oKUserInfo4;
                        str4 = str8;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 8:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i7);
                        i3 = i | 256;
                        i2 = i3;
                        str4 = str8;
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        i3 = i | 512;
                        i2 = i3;
                        str4 = str8;
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    case 10:
                        readReceiptType2 = (OKReadReceiptMessage.ReadReceiptType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, kSerializerArr[i8], readReceiptType2);
                        i3 = i | 1024;
                        i2 = i3;
                        str4 = str8;
                        i = i2;
                        oKUserInfo2 = oKUserInfo4;
                        str8 = str4;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 5;
                        i7 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OKUserInfo oKUserInfo5 = oKUserInfo4;
            String str11 = str8;
            str = str9;
            inHouseIMContentType = inHouseIMContentType3;
            z = zDecodeBooleanElement4;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            str2 = str11;
            readReceiptType = readReceiptType2;
            str3 = str10;
            oKUserInfo = oKUserInfo5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKReadReceiptMessage(i, str, oKUserInfo, oKMentionedInfo, str2, zDecodeBooleanElement, j, inHouseIMContentType, z, j2, str3, readReceiptType, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKReadReceiptMessage oKReadReceiptMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKReadReceiptMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKReadReceiptMessage.write$Self$OKIMCore_okimcore(oKReadReceiptMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
