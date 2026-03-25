package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.huawei.hms.api.FailedBinderCallBack;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OKCallInviteMessage$$serializer implements GeneratedSerializer<OKCallInviteMessage> {
    public static final int $stable;
    public static final OKCallInviteMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallInviteMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallInviteMessage$$serializer oKCallInviteMessage$$serializer = new OKCallInviteMessage$$serializer();
        INSTANCE = oKCallInviteMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallInviteMessage", oKCallInviteMessage$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement(FailedBinderCallBack.CALLER_ID, false);
        pluginGeneratedSerialDescriptor.addElement("engineType", false);
        pluginGeneratedSerialDescriptor.addElement("childExtra", true);
        pluginGeneratedSerialDescriptor.addElement("useSignalServer", true);
        pluginGeneratedSerialDescriptor.addElement("inviteUserIds", true);
        pluginGeneratedSerialDescriptor.addElement("observerUserIds", true);
        pluginGeneratedSerialDescriptor.addElement("mediaType", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("mediaId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCallInviteMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, stringSerializer, kSerializerArr[9], BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[12]), BuiltinSerializersKt.getNullable(kSerializerArr[13]), kSerializerArr[14], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallInviteMessage deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        InHouseIMContentType inHouseIMContentType;
        OKCallCommon.OKCallMediaType oKCallMediaType;
        OKCallCommon.CallEngineType callEngineType;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        List list;
        OKMentionedInfo oKMentionedInfo;
        List list2;
        int i;
        OKUserInfo oKUserInfo;
        String str6;
        OKMentionedInfo oKMentionedInfo2;
        KSerializer[] kSerializerArr;
        OKUserInfo oKUserInfo2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = OKCallInviteMessage.$childSerializers;
        int i3 = 8;
        int i4 = 9;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo3 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            OKCallCommon.CallEngineType callEngineType2 = (OKCallCommon.CallEngineType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            callEngineType = callEngineType2;
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr2[12], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], null);
            OKCallCommon.OKCallMediaType oKCallMediaType2 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            oKCallMediaType = oKCallMediaType2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            list = list4;
            str5 = strDecodeStringElement2;
            inHouseIMContentType = inHouseIMContentType2;
            str2 = str10;
            str6 = str8;
            z2 = zDecodeBooleanElement;
            oKMentionedInfo = oKMentionedInfo3;
            str3 = str9;
            i = 131071;
            z = zDecodeBooleanElement2;
            str4 = strDecodeStringElement;
            oKUserInfo = oKUserInfo3;
            z3 = zDecodeBooleanElement3;
            list2 = list3;
            j = jDecodeLongElement;
        } else {
            int i5 = 16;
            int i6 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            List list5 = null;
            String str11 = null;
            List list6 = null;
            InHouseIMContentType inHouseIMContentType3 = null;
            OKCallCommon.OKCallMediaType oKCallMediaType3 = null;
            OKCallCommon.CallEngineType callEngineType3 = null;
            String strDecodeStringElement3 = null;
            String str12 = null;
            OKMentionedInfo oKMentionedInfo4 = null;
            OKUserInfo oKUserInfo4 = null;
            boolean z4 = true;
            long jDecodeLongElement2 = 0;
            String str13 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        kSerializerArr2 = kSerializerArr2;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 0:
                        oKMentionedInfo2 = oKMentionedInfo4;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 1;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str12);
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 1:
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo4);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        i6 |= 4;
                        oKMentionedInfo2 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo4);
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 3:
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 4:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], inHouseIMContentType3);
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 = 16;
                        break;
                    case 9:
                        i6 |= 512;
                        callEngineType3 = (OKCallCommon.CallEngineType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, kSerializerArr2[i4], callEngineType3);
                        i5 = 16;
                        break;
                    case 10:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str11);
                        i2 = i6 | 1024;
                        kSerializerArr = kSerializerArr2;
                        i6 = i2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 11:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i6 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 12:
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr2[12], list6);
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 13:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], list5);
                        i6 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 14:
                        i6 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        oKCallMediaType3 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr2[14], oKCallMediaType3);
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 15:
                        i6 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    case 16:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str7);
                        i2 = 65536 | i6;
                        kSerializerArr = kSerializerArr2;
                        i6 = i2;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo4;
                        oKUserInfo4 = oKUserInfo2;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 9;
                        i5 = 16;
                        i3 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str7;
            str2 = str11;
            inHouseIMContentType = inHouseIMContentType3;
            oKCallMediaType = oKCallMediaType3;
            callEngineType = callEngineType3;
            str3 = str13;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            j = jDecodeLongElement2;
            list = list5;
            oKMentionedInfo = oKMentionedInfo4;
            list2 = list6;
            i = i6;
            oKUserInfo = oKUserInfo4;
            str6 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallInviteMessage(i, str6, oKUserInfo, oKMentionedInfo, str3, z2, j, inHouseIMContentType, z, str4, callEngineType, str2, z3, list2, list, oKCallMediaType, str5, str, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallInviteMessage oKCallInviteMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallInviteMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallInviteMessage.write$Self$OKIMCore_okimcore(oKCallInviteMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
