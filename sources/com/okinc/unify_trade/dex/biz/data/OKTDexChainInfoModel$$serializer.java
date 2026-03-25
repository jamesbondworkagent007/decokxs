package com.okinc.unify_trade.dex.biz.data;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class OKTDexChainInfoModel$$serializer implements GeneratedSerializer<OKTDexChainInfoModel> {
    public static final int $stable;
    public static final OKTDexChainInfoModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKTDexChainInfoModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKTDexChainInfoModel$$serializer oKTDexChainInfoModel$$serializer = new OKTDexChainInfoModel$$serializer();
        INSTANCE = oKTDexChainInfoModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel", oKTDexChainInfoModel$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("bNBChain", true);
        pluginGeneratedSerialDescriptor.addElement("isSensitive", false);
        pluginGeneratedSerialDescriptor.addElement("isDefault", false);
        pluginGeneratedSerialDescriptor.addElement("defaultTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("wrapperTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCoins", true);
        pluginGeneratedSerialDescriptor.addElement("tradeWithCoins", true);
        pluginGeneratedSerialDescriptor.addElement("minValue", true);
        pluginGeneratedSerialDescriptor.addElement("slippageList", true);
        pluginGeneratedSerialDescriptor.addElement("slippageRange", true);
        pluginGeneratedSerialDescriptor.addElement("slippageDynamicRange", true);
        pluginGeneratedSerialDescriptor.addElement("mevSupport", true);
        pluginGeneratedSerialDescriptor.addElement("supportRouteMode", true);
        pluginGeneratedSerialDescriptor.addElement("maxGas", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("mevThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("mainCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("mainCurrencyName", true);
        pluginGeneratedSerialDescriptor.addElement("waiveGasFee", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKTDexChainInfoModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[9], kSerializerArr[10], stringSerializer, kSerializerArr[12], kSerializerArr[13], kSerializerArr[14], stringSerializer, kSerializerArr[16], stringSerializer, kSerializerArr[18], stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKTDexChainInfoModel deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        List list;
        int i;
        boolean z;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        List list3;
        List list4;
        String str10;
        String str11;
        String str12;
        String str13;
        List list5;
        List list6;
        List list7;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKTDexChainInfoModel.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str6 = strDecodeStringElement5;
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            List list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            List list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            List list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            list5 = list14;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, null);
            str = strDecodeStringElement12;
            str11 = strDecodeStringElement14;
            str3 = strDecodeStringElement8;
            list7 = list9;
            list6 = list8;
            str13 = strDecodeStringElement10;
            str10 = strDecodeStringElement15;
            list2 = list13;
            str12 = strDecodeStringElement13;
            list3 = list12;
            list4 = list11;
            list = list10;
            str9 = strDecodeStringElement2;
            str2 = strDecodeStringElement11;
            str8 = strDecodeStringElement3;
            i = 8388607;
            z = zDecodeBooleanElement;
            str7 = strDecodeStringElement4;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement9;
        } else {
            boolean zDecodeBooleanElement2 = false;
            List list15 = null;
            List list16 = null;
            List list17 = null;
            List list18 = null;
            List list19 = null;
            List list20 = null;
            strDecodeStringElement = null;
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
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            boolean z2 = true;
            Boolean bool2 = null;
            List list21 = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 10;
                        break;
                    case 0:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i4 = 10;
                        break;
                    case 1:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i4 = 10;
                        break;
                    case 2:
                        i6 |= 4;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i4 = 10;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i4 = 10;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i4 = 10;
                        break;
                    case 5:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i4 = 10;
                        break;
                    case 6:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i4 = 10;
                        break;
                    case 7:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        i4 = 10;
                        break;
                    case 8:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i4 = 10;
                        break;
                    case 9:
                        list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list17);
                        i6 |= 512;
                        i4 = 10;
                        break;
                    case 10:
                        list18 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list18);
                        i6 |= 1024;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 11:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 12:
                        list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], list15);
                        i6 |= 4096;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 13:
                        list20 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], list20);
                        i6 |= 8192;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 14:
                        list16 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], list16);
                        i6 |= 16384;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 15:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 16:
                        list19 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], list19);
                        i2 = 65536;
                        i6 |= i2;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 17:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 |= 131072;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 18:
                        list21 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], list21);
                        i2 = 262144;
                        i6 |= i2;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 19:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 |= 524288;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 20:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i2 = 1048576;
                        i6 |= i2;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 21:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i6 |= i3;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 22:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, bool2);
                        i3 = 4194304;
                        i6 |= i3;
                        i5 = 9;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list15;
            i = i6;
            z = zDecodeBooleanElement2;
            list2 = list19;
            str = strDecodeStringElement19;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement22;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement24;
            str6 = strDecodeStringElement25;
            str7 = strDecodeStringElement26;
            str8 = strDecodeStringElement27;
            str9 = strDecodeStringElement28;
            bool = bool2;
            list3 = list16;
            list4 = list20;
            str10 = strDecodeStringElement16;
            str11 = strDecodeStringElement17;
            str12 = strDecodeStringElement18;
            str13 = strDecodeStringElement21;
            list5 = list21;
            list6 = list17;
            list7 = list18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKTDexChainInfoModel(i, str9, str8, z, str7, str6, str5, str4, str3, strDecodeStringElement, list6, list7, str13, list, list4, list3, str2, list2, str, list5, str12, str11, str10, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKTDexChainInfoModel oKTDexChainInfoModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKTDexChainInfoModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKTDexChainInfoModel.write$Self$OKTradeCore_trade_core(oKTDexChainInfoModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
