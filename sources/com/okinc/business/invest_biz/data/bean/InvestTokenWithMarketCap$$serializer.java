package com.okinc.business.invest_biz.data.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestTokenWithMarketCap$$serializer implements GeneratedSerializer<InvestTokenWithMarketCap> {
    public static final int $stable;
    public static final InvestTokenWithMarketCap$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestTokenWithMarketCap$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestTokenWithMarketCap$$serializer investTokenWithMarketCap$$serializer = new InvestTokenWithMarketCap$$serializer();
        INSTANCE = investTokenWithMarketCap$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap", investTokenWithMarketCap$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("isBaseToken", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("deployAddress", true);
        pluginGeneratedSerialDescriptor.addElement("deployAddressUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestTokenWithMarketCap deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        boolean z;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            z = zDecodeBooleanElement;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement9;
            str9 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement3;
            str3 = strDecodeStringElement8;
            str6 = strDecodeStringElement4;
            str8 = strDecodeStringElement2;
            j = jDecodeLongElement;
            i = 4095;
        } else {
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 11;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 11;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = i4 | 4;
                        i4 = i2;
                        break;
                    case 3:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i4 | 8;
                        i4 = i2;
                        break;
                    case 4:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i4 | 16;
                        i4 = i2;
                        break;
                    case 5:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i4 | 32;
                        i4 = i2;
                        break;
                    case 6:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i4 | 64;
                        i4 = i2;
                        break;
                    case 7:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = i4 | 128;
                        i4 = i2;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i4 | 256;
                        i4 = i2;
                        break;
                    case 9:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = i4 | 512;
                        i4 = i2;
                        break;
                    case 10:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 = i4 | 1024;
                        i4 = i2;
                        break;
                    case 11:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 = i4 | 2048;
                        i4 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement19;
            str = strDecodeStringElement20;
            i = i4;
            String str10 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            long j2 = jDecodeLongElement2;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement16;
            j = j2;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            str6 = strDecodeStringElement17;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement18;
            str9 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestTokenWithMarketCap(i, j, z, str8, str5, str6, str4, str7, str9, str3, str2, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestTokenWithMarketCap investTokenWithMarketCap) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTokenWithMarketCap, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestTokenWithMarketCap.write$Self$OKDeFi_invest_biz(investTokenWithMarketCap, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
