package com.okinc.okimcore.model.im;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.huawei.hms.api.FailedBinderCallBack;
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
public final /* synthetic */ class OKCallRingingMessage$$serializer implements GeneratedSerializer<OKCallRingingMessage> {
    public static final int $stable;
    public static final OKCallRingingMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCallRingingMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCallRingingMessage$$serializer oKCallRingingMessage$$serializer = new OKCallRingingMessage$$serializer();
        INSTANCE = oKCallRingingMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.OKCallRingingMessage", oKCallRingingMessage$$serializer, 10);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = OKCallRingingMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(OKUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OKMentionedInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCallRingingMessage deserialize(@NotNull Decoder decoder) {
        boolean z;
        InHouseIMContentType inHouseIMContentType;
        int i;
        long j;
        OKMentionedInfo oKMentionedInfo;
        String str;
        String strDecodeStringElement;
        String str2;
        boolean z2;
        OKUserInfo oKUserInfo;
        String str3;
        OKMentionedInfo oKMentionedInfo2;
        OKUserInfo oKUserInfo2;
        OKMentionedInfo oKMentionedInfo3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCallRingingMessage.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 5;
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            OKUserInfo oKUserInfo3 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, null);
            OKMentionedInfo oKMentionedInfo4 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            InHouseIMContentType inHouseIMContentType2 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            inHouseIMContentType = inHouseIMContentType2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            z = zDecodeBooleanElement2;
            str = strDecodeStringElement2;
            z2 = zDecodeBooleanElement;
            oKUserInfo = oKUserInfo3;
            j = jDecodeLongElement;
            str2 = str5;
            oKMentionedInfo = oKMentionedInfo4;
            str3 = str4;
            i = 1023;
        } else {
            boolean zDecodeBooleanElement3 = false;
            boolean z3 = true;
            String str6 = null;
            String strDecodeStringElement3 = null;
            OKMentionedInfo oKMentionedInfo5 = null;
            OKUserInfo oKUserInfo4 = null;
            String str7 = null;
            long jDecodeLongElement2 = 0;
            int i7 = 0;
            InHouseIMContentType inHouseIMContentType3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        oKMentionedInfo2 = oKMentionedInfo5;
                        oKUserInfo2 = oKUserInfo4;
                        z3 = false;
                        oKMentionedInfo5 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 0:
                        oKMentionedInfo2 = oKMentionedInfo5;
                        oKUserInfo2 = oKUserInfo4;
                        i7 |= 1;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str7);
                        oKMentionedInfo5 = oKMentionedInfo2;
                        oKUserInfo4 = oKUserInfo2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        oKMentionedInfo3 = oKMentionedInfo5;
                        oKUserInfo4 = (OKUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKUserInfo4);
                        i7 |= 2;
                        oKMentionedInfo5 = oKMentionedInfo3;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 2:
                        oKMentionedInfo3 = (OKMentionedInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMentionedInfo5);
                        i7 |= 4;
                        oKMentionedInfo5 = oKMentionedInfo3;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 3:
                        i7 |= 8;
                        oKMentionedInfo3 = oKMentionedInfo5;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str6);
                        oKMentionedInfo5 = oKMentionedInfo3;
                        i3 = 9;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i5);
                        i2 = i7 | 32;
                        i7 = i2;
                        break;
                    case 6:
                        i7 |= 64;
                        inHouseIMContentType3 = (InHouseIMContentType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseIMContentType3);
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i2 = i7 | 128;
                        i7 = i2;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OKUserInfo oKUserInfo5 = oKUserInfo4;
            String str8 = str7;
            z = zDecodeBooleanElement3;
            inHouseIMContentType = inHouseIMContentType3;
            i = i7;
            j = jDecodeLongElement2;
            oKMentionedInfo = oKMentionedInfo5;
            str = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement3;
            str2 = str6;
            z2 = zDecodeBooleanElement4;
            oKUserInfo = oKUserInfo5;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCallRingingMessage(i, str3, oKUserInfo, oKMentionedInfo, str2, z2, j, inHouseIMContentType, z, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCallRingingMessage oKCallRingingMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCallRingingMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCallRingingMessage.write$Self$OKIMCore_okimcore(oKCallRingingMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
