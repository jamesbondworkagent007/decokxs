package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class SecurityDetailsInfo$$serializer implements GeneratedSerializer<SecurityDetailsInfo> {
    public static final int $stable;
    public static final SecurityDetailsInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SecurityDetailsInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SecurityDetailsInfo$$serializer securityDetailsInfo$$serializer = new SecurityDetailsInfo$$serializer();
        INSTANCE = securityDetailsInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo", securityDetailsInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("alertsScore", true);
        pluginGeneratedSerialDescriptor.addElement("highlightsScore", true);
        pluginGeneratedSerialDescriptor.addElement("scoreExplain", true);
        pluginGeneratedSerialDescriptor.addElement("securityScores", true);
        pluginGeneratedSerialDescriptor.addElement("websiteLogo", true);
        pluginGeneratedSerialDescriptor.addElement("websiteName", true);
        pluginGeneratedSerialDescriptor.addElement("websiteUrl", true);
        pluginGeneratedSerialDescriptor.addElement("nightWebsiteLogo", true);
        pluginGeneratedSerialDescriptor.addElement("securityScoreColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SecurityDetailsInfo.$childSerializers;
        AlertsHighlightsScoreInfo$$serializer alertsHighlightsScoreInfo$$serializer = AlertsHighlightsScoreInfo$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(alertsHighlightsScoreInfo$$serializer), BuiltinSerializersKt.getNullable(alertsHighlightsScoreInfo$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SecurityDetailsInfo deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        int i;
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo;
        String str5;
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo2;
        List list2;
        AlertsHighlightsScoreInfo alertsHighlightsScoreInfo3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SecurityDetailsInfo.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        int i6 = 4;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AlertsHighlightsScoreInfo$$serializer alertsHighlightsScoreInfo$$serializer = AlertsHighlightsScoreInfo$$serializer.INSTANCE;
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo4 = (AlertsHighlightsScoreInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, alertsHighlightsScoreInfo$$serializer, null);
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo5 = (AlertsHighlightsScoreInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, alertsHighlightsScoreInfo$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            list = list3;
            alertsHighlightsScoreInfo = alertsHighlightsScoreInfo5;
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str2 = str10;
            str3 = str9;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            str = str8;
            str5 = str7;
            i = 511;
            alertsHighlightsScoreInfo2 = alertsHighlightsScoreInfo4;
        } else {
            int i7 = 0;
            boolean z = true;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String strDecodeStringElement2 = null;
            String str14 = null;
            List list4 = null;
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo6 = null;
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        z = false;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 0:
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        alertsHighlightsScoreInfo7 = (AlertsHighlightsScoreInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AlertsHighlightsScoreInfo$$serializer.INSTANCE, alertsHighlightsScoreInfo7);
                        i7 |= 1;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 1:
                        list2 = list4;
                        alertsHighlightsScoreInfo6 = (AlertsHighlightsScoreInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AlertsHighlightsScoreInfo$$serializer.INSTANCE, alertsHighlightsScoreInfo6);
                        i7 |= 2;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 2:
                        list2 = list4;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        i7 |= 4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 3:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list4);
                        i7 |= 8;
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str11);
                        i7 |= 16;
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        i7 |= 32;
                        break;
                    case 6:
                        i7 |= 64;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str12);
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 7:
                        i7 |= 128;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str14);
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        list2 = list4;
                        alertsHighlightsScoreInfo3 = alertsHighlightsScoreInfo6;
                        list4 = list2;
                        alertsHighlightsScoreInfo6 = alertsHighlightsScoreInfo3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        i6 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo8 = alertsHighlightsScoreInfo6;
            AlertsHighlightsScoreInfo alertsHighlightsScoreInfo9 = alertsHighlightsScoreInfo7;
            list = list4;
            str = str11;
            str2 = str12;
            str3 = str13;
            strDecodeStringElement = strDecodeStringElement2;
            str4 = str14;
            i = i7;
            alertsHighlightsScoreInfo = alertsHighlightsScoreInfo8;
            str5 = str6;
            alertsHighlightsScoreInfo2 = alertsHighlightsScoreInfo9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SecurityDetailsInfo(i, alertsHighlightsScoreInfo2, alertsHighlightsScoreInfo, str5, list, str, str3, str2, str4, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SecurityDetailsInfo securityDetailsInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(securityDetailsInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SecurityDetailsInfo.write$Self$OKDeFi_invest_biz(securityDetailsInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
