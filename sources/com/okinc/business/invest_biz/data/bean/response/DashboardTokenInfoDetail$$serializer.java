package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.HealthFactor;
import com.okinc.business.invest_biz.data.bean.HealthFactor$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DashboardTokenInfoDetail$$serializer implements GeneratedSerializer<DashboardTokenInfoDetail> {
    public static final int $stable;
    public static final DashboardTokenInfoDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DashboardTokenInfoDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DashboardTokenInfoDetail$$serializer dashboardTokenInfoDetail$$serializer = new DashboardTokenInfoDetail$$serializer();
        INSTANCE = dashboardTokenInfoDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail", dashboardTokenInfoDetail$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("analysisPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement("platformName", true);
        pluginGeneratedSerialDescriptor.addElement("platformUrl", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("feeRate", true);
        pluginGeneratedSerialDescriptor.addElement("assetsTokenInvestName", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("assetsTokens", true);
        pluginGeneratedSerialDescriptor.addElement("investmentInfos", true);
        pluginGeneratedSerialDescriptor.addElement("containAvailableReward", true);
        pluginGeneratedSerialDescriptor.addElement("containMarketReward", true);
        pluginGeneratedSerialDescriptor.addElement("healthFactor", true);
        pluginGeneratedSerialDescriptor.addElement("totalEarnings", true);
        pluginGeneratedSerialDescriptor.addElement("yesterdayProfit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DashboardTokenInfoDetail.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[9], kSerializerArr[10], stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(HealthFactor$$serializer.INSTANCE), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DashboardTokenInfoDetail deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String strDecodeStringElement;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        String str6;
        String str7;
        List list;
        List list2;
        HealthFactor healthFactor;
        String strDecodeStringElement2;
        long j2;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DashboardTokenInfoDetail.$childSerializers;
        int i2 = 5;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str3 = strDecodeStringElement4;
            i = 65535;
            healthFactor = (HealthFactor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, HealthFactor$$serializer.INSTANCE, null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str5 = strDecodeStringElement11;
            list2 = list3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            str4 = strDecodeStringElement10;
            str9 = strDecodeStringElement7;
            str8 = strDecodeStringElement12;
            j2 = jDecodeLongElement2;
            list = list4;
            j = jDecodeLongElement;
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
        } else {
            int i3 = 15;
            int i4 = 0;
            boolean z = true;
            HealthFactor healthFactor2 = null;
            List list5 = null;
            List list6 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 0:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 1:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 2:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 3:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 4:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 5:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i4 |= 32;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 6:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 7:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 8:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 9:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list6);
                        i4 |= 512;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 10:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list5);
                        i4 |= 1024;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 12:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 13:
                        healthFactor2 = (HealthFactor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, HealthFactor$$serializer.INSTANCE, healthFactor2);
                        i4 |= 8192;
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 15;
                        i2 = 5;
                        break;
                    case 15:
                        i4 |= 32768;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 15;
                        i2 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement3;
            i = i4;
            strDecodeStringElement = strDecodeStringElement15;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement19;
            j = jDecodeLongElement4;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement17;
            str7 = strDecodeStringElement18;
            list = list5;
            list2 = list6;
            long j3 = jDecodeLongElement3;
            healthFactor = healthFactor2;
            strDecodeStringElement2 = strDecodeStringElement14;
            j2 = j3;
            String str10 = strDecodeStringElement20;
            str8 = strDecodeStringElement13;
            str9 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DashboardTokenInfoDetail(i, j, str3, str7, str6, str9, j2, str2, str, str4, list2, list, str5, str8, healthFactor, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DashboardTokenInfoDetail.copydefault(dashboardTokenInfoDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
