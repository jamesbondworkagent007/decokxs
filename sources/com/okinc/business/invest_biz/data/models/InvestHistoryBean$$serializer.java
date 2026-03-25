package com.okinc.business.invest_biz.data.models;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class InvestHistoryBean$$serializer implements GeneratedSerializer<InvestHistoryBean> {
    public static final int $stable;
    public static final InvestHistoryBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestHistoryBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestHistoryBean$$serializer investHistoryBean$$serializer = new InvestHistoryBean$$serializer();
        INSTANCE = investHistoryBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.models.InvestHistoryBean", investHistoryBean$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("browserUrl", true);
        pluginGeneratedSerialDescriptor.addElement("blockTime", true);
        pluginGeneratedSerialDescriptor.addElement(WiseOpenHianalyticsData.UNION_COSTTIME, true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("investInfo", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("orderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        pluginGeneratedSerialDescriptor.addElement("orderVoStatus", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("txHash", true);
        pluginGeneratedSerialDescriptor.addElement("txId", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("date", true);
        pluginGeneratedSerialDescriptor.addElement(CrashHianalyticsData.TIME, true);
        pluginGeneratedSerialDescriptor.addElement("isShowDate", true);
        pluginGeneratedSerialDescriptor.addElement("uopHash", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestHistoryBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, longSerializer, stringSerializer, longSerializer, kSerializerArr[4], stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, kSerializerArr[10], stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestHistoryBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        List list;
        List list2;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        int i2;
        int i3;
        long j2;
        long j3;
        boolean z;
        int i4;
        String str8;
        String str9;
        long j4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestHistoryBean.$childSerializers;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 14);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            i4 = 1048575;
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, null);
            str7 = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement8;
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement10;
            str9 = strDecodeStringElement9;
            j4 = jDecodeLongElement4;
            list = list3;
            str5 = strDecodeStringElement4;
            i3 = iDecodeIntElement;
            str4 = strDecodeStringElement5;
            str6 = strDecodeStringElement3;
            i = iDecodeIntElement2;
            str = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            j3 = jDecodeLongElement2;
            i2 = iDecodeIntElement3;
            list2 = list4;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement3;
        } else {
            int i6 = 19;
            List list5 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            int i7 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z2 = true;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            List list6 = null;
            String strDecodeStringElement18 = null;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement6 = 0;
            String str10 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 0:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 1:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 2:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 3:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i7 |= 8;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 4:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i7 |= 16;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 5:
                        i7 |= 32;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 6:
                        i7 |= 64;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i7 |= 128;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 8:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i7 |= 256;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 9:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i7 |= 512;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 10:
                        i7 |= 1024;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list6);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 11:
                        i7 |= 2048;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 12:
                        i7 |= 4096;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 13:
                        i7 |= 8192;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 14:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 14);
                        i7 |= 16384;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 15:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i7 |= 32768;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 16:
                        i7 |= 65536;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 17:
                        i7 |= 131072;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 18:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i7 |= 262144;
                        i5 = 8;
                        i6 = 19;
                        break;
                    case 19:
                        i7 |= 524288;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str10);
                        i5 = 8;
                        i6 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list5;
            list2 = list6;
            i = iDecodeIntElement6;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            str6 = strDecodeStringElement16;
            str7 = strDecodeStringElement17;
            j = jDecodeLongElement5;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            j2 = jDecodeLongElement7;
            j3 = jDecodeLongElement8;
            z = zDecodeBooleanElement2;
            i4 = i7;
            str8 = str10;
            str9 = strDecodeStringElement12;
            j4 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestHistoryBean(i4, str7, j, str6, j3, list, str5, str4, i3, i, i2, list2, str, str3, strDecodeStringElement, j2, j4, str9, str2, z, str8, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestHistoryBean investHistoryBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investHistoryBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestHistoryBean.write$Self$OKDeFi_invest_biz(investHistoryBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
