package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.huawei.hms.api.FailedBinderCallBack;
import com.okinc.okimcore.model.im.OKCallCommon;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OKCallAcceptMessage$$serializer implements GeneratedSerializer<OKCallAcceptMessage> {
    public static final int $stable;
    public static final OKCallAcceptMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallAcceptMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallAcceptMessage$$serializer oKCallAcceptMessage$$serializer = new OKCallAcceptMessage$$serializer();
        INSTANCE = oKCallAcceptMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallAcceptMessage", oKCallAcceptMessage$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement(FailedBinderCallBack.CALLER_ID, false);
        pluginGeneratedSerialDescriptor.addElement("mediaId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("mediaType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCallAcceptMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[11]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallAcceptMessage deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        OKCallCommon.OKCallMediaType oKCallMediaType;
        String str2;
        String str3;
        long j;
        boolean z;
        String str4;
        InHouseIMContentType inHouseIMContentType;
        boolean z2;
        OKMentionedInfo oKMentionedInfo;
        OKUserInfo oKUserInfo;
        String str5;
        OKMentionedInfo oKMentionedInfo2;
        OKUserInfo oKUserInfo2;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCallAcceptMessage.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 5;
        int i6 = 8;
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo3 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            oKCallMediaType = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            str3 = strDecodeStringElement3;
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement;
            strDecodeStringElement = strDecodeStringElement2;
            str2 = strDecodeStringElement4;
            i = 4095;
            oKMentionedInfo = oKMentionedInfo3;
            str = str7;
            j = jDecodeLongElement;
            str4 = str8;
            oKUserInfo = oKUserInfo3;
            inHouseIMContentType = inHouseIMContentType2;
        } else {
            int i8 = 11;
            InHouseIMContentType inHouseIMContentType3 = null;
            String strDecodeStringElement5 = null;
            strDecodeStringElement = null;
            String str9 = null;
            OKMentionedInfo oKMentionedInfo4 = null;
            OKUserInfo oKUserInfo4 = null;
            String str10 = null;
            boolean zDecodeBooleanElement3 = false;
            boolean z3 = true;
            long jDecodeLongElement2 = 0;
            OKCallCommon.OKCallMediaType oKCallMediaType2 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        z3 = false;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 0:
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str10);
                        i7 |= 1;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 1:
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo4 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo4);
                        i7 |= 2;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 2:
                        str5 = str9;
                        oKMentionedInfo4 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo4);
                        i7 |= 4;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 3:
                        i7 |= 8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str9);
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i7 | 16;
                        i7 = i2;
                        i8 = 11;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i5);
                        i2 = i7 | 32;
                        i7 = i2;
                        i8 = 11;
                        break;
                    case 6:
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseIMContentType3);
                        i7 |= 64;
                        i8 = 11;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i7 |= 128;
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        oKCallMediaType2 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, kSerializerArr[i8], oKCallMediaType2);
                        str5 = str9;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        str6 = str10;
                        str10 = str6;
                        str9 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i8 = 11;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str11 = str9;
            OKMentionedInfo oKMentionedInfo5 = oKMentionedInfo4;
            str = str10;
            i = i7;
            oKCallMediaType = oKCallMediaType2;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            j = jDecodeLongElement2;
            z = zDecodeBooleanElement3;
            str4 = str11;
            inHouseIMContentType = inHouseIMContentType3;
            z2 = zDecodeBooleanElement4;
            oKMentionedInfo = oKMentionedInfo5;
            oKUserInfo = oKUserInfo4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallAcceptMessage(i, str, oKUserInfo, oKMentionedInfo, str4, z2, j, inHouseIMContentType, z, strDecodeStringElement, str3, str2, oKCallMediaType, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallAcceptMessage oKCallAcceptMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallAcceptMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallAcceptMessage.write$Self$OKIMCore_okimcore(oKCallAcceptMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
