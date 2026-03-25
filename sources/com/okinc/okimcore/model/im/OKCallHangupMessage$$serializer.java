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
public final /* synthetic */ class OKCallHangupMessage$$serializer implements GeneratedSerializer<OKCallHangupMessage> {
    public static final int $stable;
    public static final OKCallHangupMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallHangupMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallHangupMessage$$serializer oKCallHangupMessage$$serializer = new OKCallHangupMessage$$serializer();
        INSTANCE = oKCallHangupMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallHangupMessage", oKCallHangupMessage$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("clientMessageId", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("mentionedInfo", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("isBurnAfterRead", true);
        pluginGeneratedSerialDescriptor.addElement("burnDuration", true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("enableAppPushNotification", true);
        pluginGeneratedSerialDescriptor.addElement(FailedBinderCallBack.CALLER_ID, false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("hangupReason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCallHangupMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, stringSerializer, stringSerializer, kSerializerArr[10]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallHangupMessage deserialize(@NotNull Decoder decoder) {
        OKMentionedInfo oKMentionedInfo;
        int i;
        OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason;
        boolean z;
        String str;
        String str2;
        long j;
        String str3;
        InHouseIMContentType inHouseIMContentType;
        boolean z2;
        OKUserInfo oKUserInfo;
        String str4;
        int i2;
        String str5;
        OKMentionedInfo oKMentionedInfo2;
        OKUserInfo oKUserInfo2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCallHangupMessage.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 5;
        int i6 = 8;
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            oKUserInfo = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo3 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            i = 2047;
            oKCallDisconnectedReason = (OKCallCommon.OKCallDisconnectedReason) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str = strDecodeStringElement2;
            z2 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement;
            oKMentionedInfo = oKMentionedInfo3;
            str4 = str6;
            j = jDecodeLongElement;
            str3 = str7;
            inHouseIMContentType = inHouseIMContentType2;
        } else {
            int i8 = 10;
            boolean zDecodeBooleanElement3 = false;
            boolean z3 = true;
            InHouseIMContentType inHouseIMContentType3 = null;
            OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason2 = null;
            String strDecodeStringElement3 = null;
            String str8 = null;
            OKMentionedInfo oKMentionedInfo4 = null;
            OKUserInfo oKUserInfo3 = null;
            String str9 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo3;
                        z3 = false;
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 0:
                        str5 = str8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo3;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                        i7 |= 1;
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 1:
                        str5 = str8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo3);
                        i7 |= 2;
                        oKUserInfo2 = oKUserInfo3;
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 2:
                        str5 = str8;
                        oKMentionedInfo4 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo4);
                        i7 |= 4;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo3;
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 3:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str8);
                        i7 |= 8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo3;
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i7 | 16;
                        i7 = i2;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i5);
                        i2 = i7 | 32;
                        i7 = i2;
                        break;
                    case 6:
                        i7 |= 64;
                        str5 = str8;
                        oKMentionedInfo2 = oKMentionedInfo4;
                        oKUserInfo2 = oKUserInfo3;
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseIMContentType3);
                        str8 = str5;
                        oKMentionedInfo4 = oKMentionedInfo2;
                        oKUserInfo3 = oKUserInfo2;
                        i8 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i2 = i7 | 128;
                        i7 = i2;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 10:
                        i7 |= 1024;
                        oKCallDisconnectedReason2 = (OKCallCommon.OKCallDisconnectedReason) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, kSerializerArr[i8], oKCallDisconnectedReason2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str10 = str8;
            oKMentionedInfo = oKMentionedInfo4;
            i = i7;
            oKCallDisconnectedReason = oKCallDisconnectedReason2;
            z = zDecodeBooleanElement4;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            j = jDecodeLongElement2;
            str3 = str10;
            inHouseIMContentType = inHouseIMContentType3;
            z2 = zDecodeBooleanElement3;
            oKUserInfo = oKUserInfo3;
            str4 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallHangupMessage(i, str4, oKUserInfo, oKMentionedInfo, str3, z, j, inHouseIMContentType, z2, str2, str, oKCallDisconnectedReason, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallHangupMessage oKCallHangupMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallHangupMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallHangupMessage.write$Self$OKIMCore_okimcore(oKCallHangupMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
