package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.p2p.api.OtcExtraKeys;
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
public final /* synthetic */ class OKCallSTerminateMessage$$serializer implements GeneratedSerializer<OKCallSTerminateMessage> {
    public static final int $stable;
    public static final OKCallSTerminateMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallSTerminateMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallSTerminateMessage$$serializer oKCallSTerminateMessage$$serializer = new OKCallSTerminateMessage$$serializer();
        INSTANCE = oKCallSTerminateMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallSTerminateMessage", oKCallSTerminateMessage$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.REASON, true);
        pluginGeneratedSerialDescriptor.addElement("mediaType", false);
        pluginGeneratedSerialDescriptor.addElement("childExtra", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCallSTerminateMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), kSerializerArr[11], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallSTerminateMessage deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String str;
        OKCallCommon.OKCallMediaType oKCallMediaType;
        OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason;
        String str2;
        InHouseIMContentType inHouseIMContentType;
        boolean z;
        int i;
        String str3;
        String strDecodeStringElement;
        long j;
        OKUserInfo oKUserInfo;
        String str4;
        OKMentionedInfo oKMentionedInfo;
        OKMentionedInfo oKMentionedInfo2;
        OKUserInfo oKUserInfo2;
        KSerializer[] kSerializerArr;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = OKCallSTerminateMessage.$childSerializers;
        int i5 = 9;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            oKMentionedInfo = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason2 = (OKCallCommon.OKCallDisconnectedReason) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            oKCallMediaType = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], null);
            oKCallDisconnectedReason = oKCallDisconnectedReason2;
            z = zDecodeBooleanElement3;
            inHouseIMContentType = inHouseIMContentType2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str3 = str6;
            i = 8191;
            j = jDecodeLongElement;
            str4 = str8;
            str2 = str7;
            str = str5;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            oKUserInfo = oKUserInfo3;
        } else {
            int i7 = 12;
            zDecodeBooleanElement = false;
            int i8 = 0;
            OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason3 = null;
            String str9 = null;
            InHouseIMContentType inHouseIMContentType3 = null;
            String str10 = null;
            OKMentionedInfo oKMentionedInfo3 = null;
            String str11 = null;
            OKUserInfo oKUserInfo4 = null;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            OKCallCommon.OKCallMediaType oKCallMediaType2 = null;
            String str12 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i5 = 9;
                        i6 = 8;
                        kSerializerArr2 = kSerializerArr2;
                        break;
                    case 0:
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        kSerializerArr = kSerializerArr2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i2 = i8 | 1;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 1:
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo4 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo4);
                        i2 = i8 | 2;
                        kSerializerArr = kSerializerArr2;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        oKUserInfo2 = oKUserInfo4;
                        oKMentionedInfo2 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo3);
                        i2 = i8 | 4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 3:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i2 = i8 | 8;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        i2 = i8 | 16;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 = i8 | 32;
                        kSerializerArr = kSerializerArr2;
                        i2 = i3;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 6:
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], inHouseIMContentType3);
                        kSerializerArr = kSerializerArr2;
                        i2 = i8 | 64;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 = i8 | 128;
                        kSerializerArr = kSerializerArr2;
                        i2 = i3;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 8:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str9);
                        i4 = i8 | 256;
                        kSerializerArr = kSerializerArr2;
                        i2 = i4;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str10);
                        i8 |= 512;
                        i7 = 12;
                        break;
                    case 10:
                        oKCallDisconnectedReason3 = (OKCallCommon.OKCallDisconnectedReason) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], oKCallDisconnectedReason3);
                        i4 = i8 | 1024;
                        kSerializerArr = kSerializerArr2;
                        i2 = i4;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 11:
                        oKCallMediaType2 = (OKCallCommon.OKCallMediaType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr2[11], oKCallMediaType2);
                        i2 = i8 | 2048;
                        kSerializerArr = kSerializerArr2;
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        i8 = i2;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 12:
                        i8 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        oKMentionedInfo2 = oKMentionedInfo3;
                        oKUserInfo2 = oKUserInfo4;
                        kSerializerArr2 = kSerializerArr;
                        oKMentionedInfo3 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i7 = 12;
                        i5 = 9;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OKMentionedInfo oKMentionedInfo4 = oKMentionedInfo3;
            str = str11;
            oKCallMediaType = oKCallMediaType2;
            oKCallDisconnectedReason = oKCallDisconnectedReason3;
            str2 = str9;
            inHouseIMContentType = inHouseIMContentType3;
            z = zDecodeBooleanElement4;
            i = i8;
            str3 = str12;
            strDecodeStringElement = strDecodeStringElement2;
            j = jDecodeLongElement2;
            oKUserInfo = oKUserInfo4;
            str4 = str10;
            oKMentionedInfo = oKMentionedInfo4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallSTerminateMessage(i, str, oKUserInfo, oKMentionedInfo, str3, zDecodeBooleanElement, j, inHouseIMContentType, z, str2, str4, oKCallDisconnectedReason, oKCallMediaType, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallSTerminateMessage oKCallSTerminateMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallSTerminateMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallSTerminateMessage.write$Self$OKIMCore_okimcore(oKCallSTerminateMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
