package com.okinc.okimcore.model.im;

import android.net.Uri;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths$$serializer;
import com.okinc.okimcore.model.utility.UriSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class OKImageMessage$$serializer implements GeneratedSerializer<OKImageMessage> {
    public static final int $stable;
    public static final OKImageMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKImageMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKImageMessage$$serializer oKImageMessage$$serializer = new OKImageMessage$$serializer();
        INSTANCE = oKImageMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKImageMessage", oKImageMessage$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement("localPath", true);
        pluginGeneratedSerialDescriptor.addElement("remoteUri", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("thumbUri", true);
        pluginGeneratedSerialDescriptor.addElement("isUpLoadExp", true);
        pluginGeneratedSerialDescriptor.addElement("base64", true);
        pluginGeneratedSerialDescriptor.addElement("isFull", true);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("width", true);
        pluginGeneratedSerialDescriptor.addElement("urlPaths", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = OKImageMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        UriSerializer uriSerializer = UriSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, BuiltinSerializersKt.getNullable(uriSerializer), BuiltinSerializersKt.getNullable(uriSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(uriSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(MediaUrlPaths$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKImageMessage deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        boolean z;
        Uri uri;
        InHouseIMContentType inHouseIMContentType;
        Uri uri2;
        Uri uri3;
        String str;
        OKMentionedInfo oKMentionedInfo;
        boolean zDecodeBooleanElement;
        long j;
        boolean z2;
        String str2;
        MediaUrlPaths mediaUrlPaths;
        String str3;
        String str4;
        OKUserInfo oKUserInfo;
        boolean z3;
        int i;
        KSerializer[] kSerializerArr;
        boolean z4;
        int i2;
        KSerializer[] kSerializerArr2;
        String str5;
        boolean z5;
        OKUserInfo oKUserInfo2;
        OKMentionedInfo oKMentionedInfo2;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = OKImageMessage.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo3 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr3[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            UriSerializer uriSerializer = UriSerializer.INSTANCE;
            Uri uri4 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, uriSerializer, null);
            Uri uri5 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, uriSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Uri uri6 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, uriSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, intSerializer, null);
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            mediaUrlPaths = (MediaUrlPaths) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, MediaUrlPaths$$serializer.INSTANCE, null);
            i = 262143;
            uri2 = uri6;
            str = str9;
            num = num3;
            z2 = zDecodeBooleanElement4;
            inHouseIMContentType = inHouseIMContentType2;
            uri = uri4;
            oKMentionedInfo = oKMentionedInfo3;
            str3 = str8;
            uri3 = uri5;
            str2 = str7;
            oKUserInfo = oKUserInfo3;
            z = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement3;
            str4 = str10;
            j = jDecodeLongElement;
        } else {
            int i3 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean z6 = true;
            String str11 = null;
            Integer num4 = null;
            Integer num5 = null;
            MediaUrlPaths mediaUrlPaths2 = null;
            String str12 = null;
            Uri uri7 = null;
            InHouseIMContentType inHouseIMContentType3 = null;
            Uri uri8 = null;
            Uri uri9 = null;
            OKUserInfo oKUserInfo4 = null;
            OKMentionedInfo oKMentionedInfo4 = null;
            String str13 = null;
            String str14 = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement8 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str5 = str11;
                        z5 = zDecodeBooleanElement8;
                        oKUserInfo2 = oKUserInfo4;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        str6 = str14;
                        z6 = false;
                        str14 = str6;
                        str11 = str5;
                        kSerializerArr3 = kSerializerArr2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        zDecodeBooleanElement8 = z5;
                        oKUserInfo4 = oKUserInfo2;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str5 = str11;
                        z5 = zDecodeBooleanElement8;
                        OKUserInfo oKUserInfo5 = oKUserInfo4;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        str6 = str14;
                        oKUserInfo2 = oKUserInfo5;
                        i3 |= 1;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str13);
                        str14 = str6;
                        str11 = str5;
                        kSerializerArr3 = kSerializerArr2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        zDecodeBooleanElement8 = z5;
                        oKUserInfo4 = oKUserInfo2;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str5 = str11;
                        z5 = zDecodeBooleanElement8;
                        str6 = str14;
                        OKUserInfo oKUserInfo6 = oKUserInfo4;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        i3 |= 2;
                        oKUserInfo2 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo6);
                        str14 = str6;
                        str11 = str5;
                        kSerializerArr3 = kSerializerArr2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        zDecodeBooleanElement8 = z5;
                        oKUserInfo4 = oKUserInfo2;
                        break;
                    case 2:
                        oKMentionedInfo4 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo4);
                        i3 |= 4;
                        str11 = str11;
                        kSerializerArr3 = kSerializerArr3;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr3;
                        i3 |= 8;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 4:
                        z4 = zDecodeBooleanElement8;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i3 |= 16;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 5:
                        z4 = zDecodeBooleanElement8;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 6:
                        z4 = zDecodeBooleanElement8;
                        i3 |= 64;
                        kSerializerArr = kSerializerArr3;
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr3[6], inHouseIMContentType3);
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 7:
                        z4 = zDecodeBooleanElement8;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 |= 128;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 8:
                        z4 = zDecodeBooleanElement8;
                        i3 |= 256;
                        kSerializerArr = kSerializerArr3;
                        uri7 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UriSerializer.INSTANCE, uri7);
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 9:
                        z4 = zDecodeBooleanElement8;
                        i3 |= 512;
                        kSerializerArr = kSerializerArr3;
                        uri9 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, UriSerializer.INSTANCE, uri9);
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 10:
                        z4 = zDecodeBooleanElement8;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str11);
                        i3 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 11:
                        z4 = zDecodeBooleanElement8;
                        i3 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        uri8 = (Uri) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, UriSerializer.INSTANCE, uri8);
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 12:
                        z4 = zDecodeBooleanElement8;
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i3 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 13:
                        z4 = zDecodeBooleanElement8;
                        i3 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str12);
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 14:
                        i3 |= 16384;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 15:
                        z4 = zDecodeBooleanElement8;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, num4);
                        i2 = 32768;
                        i3 |= i2;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 16:
                        z4 = zDecodeBooleanElement8;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, num5);
                        i2 = 65536;
                        i3 |= i2;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    case 17:
                        z4 = zDecodeBooleanElement8;
                        mediaUrlPaths2 = (MediaUrlPaths) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, MediaUrlPaths$$serializer.INSTANCE, mediaUrlPaths2);
                        i2 = 131072;
                        i3 |= i2;
                        kSerializerArr = kSerializerArr3;
                        zDecodeBooleanElement8 = z4;
                        kSerializerArr3 = kSerializerArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OKUserInfo oKUserInfo7 = oKUserInfo4;
            num = num4;
            num2 = num5;
            z = zDecodeBooleanElement5;
            uri = uri7;
            inHouseIMContentType = inHouseIMContentType3;
            uri2 = uri8;
            uri3 = uri9;
            str = str11;
            oKMentionedInfo = oKMentionedInfo4;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            j = jDecodeLongElement2;
            z2 = zDecodeBooleanElement8;
            str2 = str13;
            mediaUrlPaths = mediaUrlPaths2;
            str3 = str14;
            str4 = str12;
            oKUserInfo = oKUserInfo7;
            z3 = zDecodeBooleanElement7;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKImageMessage(i, str2, oKUserInfo, oKMentionedInfo, str3, zDecodeBooleanElement, j, inHouseIMContentType, z, uri, uri3, str, uri2, z3, str4, z2, num, num2, mediaUrlPaths, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKImageMessage oKImageMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKImageMessage.write$Self$OKIMCore_okimcore(oKImageMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
