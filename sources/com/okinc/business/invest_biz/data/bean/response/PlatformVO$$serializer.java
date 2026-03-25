package com.okinc.business.invest_biz.data.bean.response;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class PlatformVO$$serializer implements GeneratedSerializer<PlatformVO> {
    public static final int $stable;
    public static final PlatformVO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PlatformVO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PlatformVO$$serializer platformVO$$serializer = new PlatformVO$$serializer();
        INSTANCE = platformVO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.PlatformVO", platformVO$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("analysisPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCount", true);
        pluginGeneratedSerialDescriptor.addElement("isSupportInvest", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("platformUrl", true);
        pluginGeneratedSerialDescriptor.addElement("warnInfo", true);
        pluginGeneratedSerialDescriptor.addElement("yesterdayProfit", true);
        pluginGeneratedSerialDescriptor.addElement("totalEarnings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, stringSerializer, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PlatformVO deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        String str6;
        long j2;
        String str7;
        int i2;
        boolean z;
        String str8;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 12;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str2 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str = strDecodeStringElement9;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement5;
            str8 = strDecodeStringElement4;
            str7 = strDecodeStringElement3;
            i2 = iDecodeIntElement;
            str6 = strDecodeStringElement6;
            z = zDecodeBooleanElement;
            j2 = jDecodeLongElement2;
            j = jDecodeLongElement;
            i = 8191;
        } else {
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 12;
                        break;
                    case 0:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        break;
                    case 1:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = i5 | 4;
                        i5 = i3;
                        break;
                    case 3:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i3 = i5 | 8;
                        i5 = i3;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i3 = i5 | 16;
                        i5 = i3;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = i5 | 32;
                        i5 = i3;
                        break;
                    case 6:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = i5 | 64;
                        i5 = i3;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = i5 | 128;
                        i5 = i3;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = i5 | 256;
                        i5 = i3;
                        break;
                    case 9:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = i5 | 512;
                        i5 = i3;
                        break;
                    case 10:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = i5 | 1024;
                        i5 = i3;
                        break;
                    case 11:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = i5 | 2048;
                        i5 = i3;
                        break;
                    case 12:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = i5 | 4096;
                        i5 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement17;
            str = strDecodeStringElement18;
            i = i5;
            String str9 = strDecodeStringElement14;
            str2 = strDecodeStringElement10;
            long j3 = jDecodeLongElement4;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            j = jDecodeLongElement3;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement16;
            j2 = j3;
            str7 = strDecodeStringElement15;
            i2 = iDecodeIntElement2;
            z = zDecodeBooleanElement2;
            str8 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PlatformVO(i, j, j2, str2, i2, z, str7, str8, str5, str6, str4, str3, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PlatformVO platformVO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(platformVO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PlatformVO.AEQbTJ(platformVO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
