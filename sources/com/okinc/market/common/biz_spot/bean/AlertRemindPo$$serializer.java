package com.okinc.market.common.biz_spot.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AlertRemindPo$$serializer implements GeneratedSerializer<AlertRemindPo> {
    public static final int $stable;
    public static final AlertRemindPo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertRemindPo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertRemindPo$$serializer alertRemindPo$$serializer = new AlertRemindPo$$serializer();
        INSTANCE = alertRemindPo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.market.common.biz_spot.bean.AlertRemindPo", alertRemindPo$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("ruleId", true);
        pluginGeneratedSerialDescriptor.addElement("sourceType", true);
        pluginGeneratedSerialDescriptor.addElement("bizType", true);
        pluginGeneratedSerialDescriptor.addElement("instrumentName", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement("promptType", true);
        pluginGeneratedSerialDescriptor.addElement("repeatType", true);
        pluginGeneratedSerialDescriptor.addElement("promptThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("modifyTime", true);
        pluginGeneratedSerialDescriptor.addElement("active", true);
        pluginGeneratedSerialDescriptor.addElement("customMsg", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("token", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("percentageTime", true);
        pluginGeneratedSerialDescriptor.addElement("timePeriod", true);
        pluginGeneratedSerialDescriptor.addElement("indicatorType", true);
        pluginGeneratedSerialDescriptor.addElement("signalType", true);
        pluginGeneratedSerialDescriptor.addElement("condition1", true);
        pluginGeneratedSerialDescriptor.addElement("condition2", true);
        pluginGeneratedSerialDescriptor.addElement("presetCondition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, longSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertRemindPo deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        int i6;
        String str3;
        long j;
        long j2;
        String str4;
        int iDecodeIntElement;
        String strDecodeStringElement;
        String str5;
        String str6;
        int i7;
        int i8;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i9;
        char c;
        String strDecodeStringElement2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 6;
        int i12 = 2;
        int i13 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
            int iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            i5 = iDecodeIntElement6;
            str11 = strDecodeStringElement10;
            str12 = strDecodeStringElement11;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement12;
            i7 = iDecodeIntElement8;
            i8 = iDecodeIntElement7;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            i6 = iDecodeIntElement3;
            str3 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
            str9 = strDecodeStringElement7;
            str8 = strDecodeStringElement8;
            str10 = strDecodeStringElement9;
            i = 8388607;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            String str13 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            boolean z = true;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            int iDecodeIntElement15 = 0;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement26 = null;
            int iDecodeIntElement16 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 0:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i13 |= 1;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 1:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i13 |= 2;
                        i11 = 6;
                        i12 = 2;
                        break;
                    case 2:
                        i9 = i12;
                        iDecodeIntElement15 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i9);
                        i13 |= 4;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 3:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i13 |= 8;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 4:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i13 |= 16;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 5:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i13 |= 32;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 6:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i11);
                        i13 |= 64;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 7:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i13 |= 128;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 8:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i13 |= 256;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 9:
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i13 |= 512;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 10:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i13 |= 1024;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i13 |= 2048;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 12:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i13 |= 4096;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 13:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i13 |= 8192;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 14:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i13 |= 16384;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 15:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i13 |= 32768;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 16:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
                        i13 |= 65536;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 17:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        i13 |= 131072;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 18:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i13 |= 262144;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 19:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i13 |= 524288;
                        i9 = 2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 20:
                        c = 20;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i10 = 1048576;
                        i13 |= i10;
                        i9 = i12;
                        str13 = strDecodeStringElement2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 21:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i10 = 2097152;
                        strDecodeStringElement2 = str13;
                        c = 20;
                        i13 |= i10;
                        i9 = i12;
                        str13 = strDecodeStringElement2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    case 22:
                        iDecodeIntElement16 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                        strDecodeStringElement2 = str13;
                        i10 = 4194304;
                        c = 20;
                        i13 |= i10;
                        i9 = i12;
                        str13 = strDecodeStringElement2;
                        i12 = i9;
                        i11 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i13;
            i2 = iDecodeIntElement11;
            i3 = iDecodeIntElement12;
            i4 = iDecodeIntElement13;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement18;
            i5 = iDecodeIntElement14;
            i6 = iDecodeIntElement15;
            str3 = strDecodeStringElement19;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            str4 = str13;
            iDecodeIntElement = iDecodeIntElement16;
            strDecodeStringElement = strDecodeStringElement26;
            str5 = strDecodeStringElement15;
            str6 = strDecodeStringElement16;
            i7 = iDecodeIntElement9;
            i8 = iDecodeIntElement10;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
            str10 = strDecodeStringElement23;
            str11 = strDecodeStringElement24;
            str12 = strDecodeStringElement25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertRemindPo(i, j, i2, i6, str, str2, i4, i3, str3, j2, i5, str7, str9, str8, str10, str11, str12, i8, i7, str6, str5, str4, strDecodeStringElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertRemindPo alertRemindPo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertRemindPo.write$Self$OKMarket_market_api(alertRemindPo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
