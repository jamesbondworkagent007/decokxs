package com.okinc.business.defi.biz.net.bean;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.List;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RecommendedInvestment$$serializer implements GeneratedSerializer<RecommendedInvestment> {
    public static final int $stable;
    public static final RecommendedInvestment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecommendedInvestment$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecommendedInvestment$$serializer recommendedInvestment$$serializer = new RecommendedInvestment$$serializer();
        INSTANCE = recommendedInvestment$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.RecommendedInvestment", recommendedInvestment$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentName", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("platformLogo", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement("tvl", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("rateType", true);
        pluginGeneratedSerialDescriptor.addElement("rateTypeDesc", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("underlyingToken", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateInvestmentId", true);
        pluginGeneratedSerialDescriptor.addElement("middleLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("bottomRightLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("topRightLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("topLeftLogoList", true);
        pluginGeneratedSerialDescriptor.addElement("investmentShowName", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_SEQUENCE, true);
        pluginGeneratedSerialDescriptor.addElement("recommendType", true);
        pluginGeneratedSerialDescriptor.addElement("recommendTypeDesc", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RecommendedInvestment.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, kSerializerArr[12], longSerializer, kSerializerArr[14], kSerializerArr[15], kSerializerArr[16], kSerializerArr[17], stringSerializer, intSerializer, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecommendedInvestment deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        List list;
        int i;
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        long j;
        long j2;
        List list2;
        List list3;
        List list4;
        int i3;
        String str8;
        String str9;
        long j3;
        List list5;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecommendedInvestment.$childSerializers;
        int i8 = 10;
        int i9 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], null);
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            list4 = list9;
            str8 = strDecodeStringElement10;
            str5 = strDecodeStringElement3;
            i3 = iDecodeIntElement4;
            str2 = strDecodeStringElement7;
            list3 = list10;
            list5 = list7;
            list = list6;
            list2 = list8;
            i = iDecodeIntElement2;
            j2 = jDecodeLongElement3;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str9 = strDecodeStringElement8;
            str = strDecodeStringElement9;
            str7 = strDecodeStringElement6;
            i2 = iDecodeIntElement3;
            i4 = 4194303;
            str6 = strDecodeStringElement2;
            j = jDecodeLongElement;
            j3 = jDecodeLongElement2;
        } else {
            int iDecodeIntElement5 = 0;
            int i10 = 0;
            int iDecodeIntElement6 = 0;
            boolean z = true;
            List list11 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            int iDecodeIntElement7 = 0;
            List list15 = null;
            String strDecodeStringElement20 = null;
            int iDecodeIntElement8 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 0:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i10 |= 1;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 1:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i10 |= 2;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 2:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i10 |= 4;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 3:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i10 |= 8;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 4:
                        i10 |= 16;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i10 |= 32;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 6:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i10 |= 64;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 7:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i9);
                        i10 |= 128;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 8:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i10 |= 256;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i10 |= 512;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 10:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i10 |= 1024;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 11:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i10 |= 2048;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 12:
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], list11);
                        i10 |= 4096;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 13:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i10 |= 8192;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 14:
                        list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], list14);
                        i5 = i10 | 16384;
                        i10 = i5;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 15:
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], list12);
                        i6 = 32768;
                        i10 = i6 | i10;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 16:
                        list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], list13);
                        i5 = 65536 | i10;
                        i10 = i5;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 17:
                        list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], list15);
                        i6 = 131072;
                        i10 = i6 | i10;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 18:
                        i10 |= 262144;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 19:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
                        i10 |= 524288;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 20:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
                        i7 = 1048576;
                        i10 |= i7;
                        i8 = 10;
                        i9 = 7;
                        break;
                    case 21:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 = 2097152;
                        i10 |= i7;
                        i8 = 10;
                        i9 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement5;
            list = list11;
            i = iDecodeIntElement8;
            strDecodeStringElement = strDecodeStringElement20;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement14;
            str3 = strDecodeStringElement15;
            str4 = strDecodeStringElement16;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement18;
            str7 = strDecodeStringElement19;
            i2 = iDecodeIntElement6;
            j = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
            list2 = list12;
            list3 = list15;
            list4 = list13;
            i3 = iDecodeIntElement7;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement13;
            j3 = jDecodeLongElement4;
            list5 = list14;
            i4 = i10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecommendedInvestment(i4, j, str6, str5, str4, i, str3, str7, i2, str2, j3, str9, str, list, j2, list5, list2, list4, list3, str8, i3, iDecodeIntElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecommendedInvestment recommendedInvestment) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recommendedInvestment, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecommendedInvestment.write$Self$OKWallet_wallet_impl(recommendedInvestment, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
