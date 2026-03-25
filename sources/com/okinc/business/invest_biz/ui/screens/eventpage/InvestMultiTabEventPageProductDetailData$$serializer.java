package com.okinc.business.invest_biz.ui.screens.eventpage;

import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo;
import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo$$serializer;
import java.util.List;
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
public final /* synthetic */ class InvestMultiTabEventPageProductDetailData$$serializer implements GeneratedSerializer<InvestMultiTabEventPageProductDetailData> {
    public static final int $stable;
    public static final InvestMultiTabEventPageProductDetailData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestMultiTabEventPageProductDetailData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestMultiTabEventPageProductDetailData$$serializer investMultiTabEventPageProductDetailData$$serializer = new InvestMultiTabEventPageProductDetailData$$serializer();
        INSTANCE = investMultiTabEventPageProductDetailData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDetailData", investMultiTabEventPageProductDetailData$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("aggregateId", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("baseRate", true);
        pluginGeneratedSerialDescriptor.addElement("hasBonus", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentName", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("nightNetworkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("networkName", true);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("rateType", true);
        pluginGeneratedSerialDescriptor.addElement("rateTypeDesc", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("subInfoName", true);
        pluginGeneratedSerialDescriptor.addElement("investTagList", true);
        pluginGeneratedSerialDescriptor.addElement("investmentClassify", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestMultiTabEventPageProductDetailData.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, InvestPlatformLogo$$serializer.INSTANCE, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, intSerializer, stringSerializer, kSerializerArr[16], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestMultiTabEventPageProductDetailData deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        int i2;
        String str;
        String str2;
        boolean z;
        int i3;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        long j;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4;
        InvestPlatformLogo investPlatformLogo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestMultiTabEventPageProductDetailData.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            InvestPlatformLogo investPlatformLogo2 = (InvestPlatformLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, InvestPlatformLogo$$serializer.INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            z = zDecodeBooleanElement;
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            str4 = strDecodeStringElement6;
            investPlatformLogo = investPlatformLogo2;
            str7 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            str5 = strDecodeStringElement7;
            str10 = strDecodeStringElement5;
            str8 = strDecodeStringElement4;
            j = jDecodeLongElement;
            str3 = strDecodeStringElement11;
            i3 = iDecodeIntElement3;
            str9 = strDecodeStringElement10;
            i4 = iDecodeIntElement2;
            i2 = iDecodeIntElement;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i = 262143;
        } else {
            int i5 = 17;
            int i6 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            InvestPlatformLogo investPlatformLogo3 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            long jDecodeLongElement2 = 0;
            List list2 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            int iDecodeIntElement6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i5 = 17;
                        break;
                    case 0:
                        i6 |= 1;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 = 17;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 17;
                        break;
                    case 2:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 17;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 17;
                        break;
                    case 4:
                        investPlatformLogo3 = (InvestPlatformLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, InvestPlatformLogo$$serializer.INSTANCE, investPlatformLogo3);
                        i6 |= 16;
                        i5 = 17;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 17;
                        break;
                    case 6:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i5 = 17;
                        break;
                    case 7:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        i5 = 17;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i5 = 17;
                        break;
                    case 9:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        i5 = 17;
                        break;
                    case 10:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 |= 1024;
                        i5 = 17;
                        break;
                    case 11:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        i5 = 17;
                        break;
                    case 12:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i6 |= 4096;
                        i5 = 17;
                        break;
                    case 13:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        i5 = 17;
                        break;
                    case 14:
                        i6 |= 16384;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        i5 = 17;
                        break;
                    case 15:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        i5 = 17;
                        break;
                    case 16:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], list2);
                        i6 |= 65536;
                        i5 = 17;
                        break;
                    case 17:
                        i6 |= 131072;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i5 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            list = list2;
            i2 = iDecodeIntElement4;
            str = strDecodeStringElement19;
            str2 = strDecodeStringElement20;
            z = zDecodeBooleanElement2;
            i3 = iDecodeIntElement6;
            str3 = strDecodeStringElement13;
            strDecodeStringElement = strDecodeStringElement14;
            str4 = strDecodeStringElement16;
            str5 = strDecodeStringElement21;
            str6 = strDecodeStringElement15;
            j = jDecodeLongElement2;
            str7 = strDecodeStringElement22;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement12;
            str10 = strDecodeStringElement17;
            i4 = iDecodeIntElement5;
            investPlatformLogo = investPlatformLogo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestMultiTabEventPageProductDetailData(i, i2, str2, str, z, investPlatformLogo, j, str8, str10, str4, str5, str7, str6, i4, str9, i3, str3, list, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestMultiTabEventPageProductDetailData investMultiTabEventPageProductDetailData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investMultiTabEventPageProductDetailData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestMultiTabEventPageProductDetailData.write$Self$OKDeFi_invest_biz(investMultiTabEventPageProductDetailData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
