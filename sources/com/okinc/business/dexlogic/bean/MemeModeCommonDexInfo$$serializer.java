package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class MemeModeCommonDexInfo$$serializer implements GeneratedSerializer<MemeModeCommonDexInfo> {
    public static final int $stable;
    public static final MemeModeCommonDexInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeModeCommonDexInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeModeCommonDexInfo$$serializer memeModeCommonDexInfo$$serializer = new MemeModeCommonDexInfo$$serializer();
        INSTANCE = memeModeCommonDexInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo", memeModeCommonDexInfo$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("fromNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("supportEip1559", true);
        pluginGeneratedSerialDescriptor.addElement("toNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("memeChainType", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("tokenTax", true);
        pluginGeneratedSerialDescriptor.addElement("isSupportDappTrade", true);
        pluginGeneratedSerialDescriptor.addElement("mevList", true);
        pluginGeneratedSerialDescriptor.addElement("nonMevPriorityFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("enableJito", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("mevUnstableShowLevel", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("needApprove", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignMarketRelTs", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignTpslRelTs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MemeModeCommonDexInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, dexMultiTokenInfoBean$$serializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, dexMultiTokenInfoBean$$serializer, stringSerializer, stringSerializer, kSerializerArr[11], NonMevPriorityFeeInfo$$serializer.INSTANCE, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeModeCommonDexInfo deserialize(@NotNull Decoder decoder) {
        int i;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        List list;
        boolean z;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        String str;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        String str8;
        String str9;
        String str10;
        String str11;
        String strDecodeStringElement2;
        String str12;
        String str13;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str14;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        char c;
        int i2;
        int i3;
        char c2;
        boolean zDecodeBooleanElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MemeModeCommonDexInfo.$childSerializers;
        int i4 = 10;
        int i5 = 6;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo2 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, NonMevPriorityFeeInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            str13 = str15;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            str4 = strDecodeStringElement12;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo2;
            str9 = strDecodeStringElement6;
            z2 = zDecodeBooleanElement3;
            i = 4194303;
            str = strDecodeStringElement8;
            str10 = strDecodeStringElement4;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
            str8 = strDecodeStringElement9;
            z = zDecodeBooleanElement2;
            str11 = strDecodeStringElement5;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            str14 = strDecodeStringElement3;
            str3 = strDecodeStringElement11;
            str2 = strDecodeStringElement10;
            str12 = strDecodeStringElement7;
            str5 = strDecodeStringElement13;
            list = list2;
        } else {
            String strDecodeStringElement16 = null;
            i = 0;
            boolean z3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z4 = true;
            String str16 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            List list3 = null;
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo3 = null;
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
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        c = 5;
                        z4 = false;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 0:
                        c = 5;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 1:
                        c = 5;
                        dexMultiTokenInfoBean7 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean7);
                        i |= 2;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 2:
                        c = 5;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 3:
                        c = 5;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 4:
                        c = 5;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 5:
                        c2 = 5;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        z3 = zDecodeBooleanElement;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        zDecodeBooleanElement = z3;
                        c2 = 5;
                        z3 = zDecodeBooleanElement;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 8:
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i |= 256;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 10:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i |= 1024;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 11:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list3);
                        i |= 2048;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 12:
                        nonMevPriorityFeeInfo3 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, NonMevPriorityFeeInfo$$serializer.INSTANCE, nonMevPriorityFeeInfo3);
                        i2 = i | 4096;
                        i = i2;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 13:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 14:
                        i |= 16384;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 15:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 32768;
                        i |= i3;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 16:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 65536;
                        i |= i3;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 17:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 18:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str16);
                        i2 = 262144 | i;
                        i = i2;
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 19:
                        i |= 524288;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 = 6;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 20:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i |= 1048576;
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 21:
                        i |= 2097152;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        c = 5;
                        i6 = 8;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            dexMultiTokenInfoBean = dexMultiTokenInfoBean6;
            list = list3;
            z = z3;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo3;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement17;
            z2 = zDecodeBooleanElement4;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement19;
            str5 = strDecodeStringElement20;
            str6 = strDecodeStringElement21;
            str7 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement23;
            str8 = strDecodeStringElement24;
            str9 = strDecodeStringElement25;
            str10 = strDecodeStringElement26;
            str11 = strDecodeStringElement28;
            strDecodeStringElement2 = strDecodeStringElement29;
            str12 = strDecodeStringElement30;
            str13 = str16;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean7;
            str14 = strDecodeStringElement27;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeModeCommonDexInfo(i, str14, dexMultiTokenInfoBean2, str10, str11, str9, z, str12, strDecodeStringElement2, dexMultiTokenInfoBean, str, str8, list, nonMevPriorityFeeInfo, str2, z2, str3, str4, str5, str13, str6, str7, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeModeCommonDexInfo memeModeCommonDexInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeModeCommonDexInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeModeCommonDexInfo.write$Self$OKDex_dex_impl(memeModeCommonDexInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
