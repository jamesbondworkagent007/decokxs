package com.okinc.business.trade.features.home.ui.cefi.data;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo$$serializer;
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
public final /* synthetic */ class AdvancedCommonDexInfo$$serializer implements GeneratedSerializer<AdvancedCommonDexInfo> {
    public static final int $stable;
    public static final AdvancedCommonDexInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdvancedCommonDexInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdvancedCommonDexInfo$$serializer advancedCommonDexInfo$$serializer = new AdvancedCommonDexInfo$$serializer();
        INSTANCE = advancedCommonDexInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo", advancedCommonDexInfo$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("fromNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("toNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("cefiChainType", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("tokenTax", true);
        pluginGeneratedSerialDescriptor.addElement("isSupportDappTrade", true);
        pluginGeneratedSerialDescriptor.addElement("mevList", true);
        pluginGeneratedSerialDescriptor.addElement("nonMevPriorityFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("enableJito", true);
        pluginGeneratedSerialDescriptor.addElement("offlineMev", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("mevUnstableShowLevel", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("supportEip1559", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("estReserveNativeAmt", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignMarketRelTs", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignTpslRelTs", true);
        pluginGeneratedSerialDescriptor.addElement("minSellAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AdvancedCommonDexInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, dexMultiTokenInfoBean$$serializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, dexMultiTokenInfoBean$$serializer, stringSerializer, stringSerializer, kSerializerArr[10], BuiltinSerializersKt.getNullable(NonMevPriorityFeeInfo$$serializer.INSTANCE), booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdvancedCommonDexInfo deserialize(@NotNull Decoder decoder) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        List list;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        boolean z;
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z2;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement2;
        String str10;
        String str11;
        boolean z3;
        String str12;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        int i;
        String strDecodeStringElement3;
        String str13;
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AdvancedCommonDexInfo.$childSerializers;
        int i6 = 6;
        int i7 = 10;
        int i8 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo2 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, NonMevPriorityFeeInfo$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            str12 = str14;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            str5 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            str13 = strDecodeStringElement15;
            str8 = strDecodeStringElement6;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
            str = strDecodeStringElement10;
            str11 = strDecodeStringElement8;
            str9 = strDecodeStringElement5;
            str6 = strDecodeStringElement9;
            i = 8388607;
            z = zDecodeBooleanElement3;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo2;
            str10 = strDecodeStringElement4;
            str3 = strDecodeStringElement12;
            z3 = zDecodeBooleanElement;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            list = list2;
            str2 = strDecodeStringElement11;
            z2 = zDecodeBooleanElement2;
            str7 = strDecodeStringElement7;
        } else {
            int i9 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean z4 = true;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            List list3 = null;
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo3 = null;
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
            String strDecodeStringElement29 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            String strDecodeStringElement30 = null;
            String str15 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 0:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 1:
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i9 |= 2;
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 2:
                        i9 |= 4;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 3:
                        i9 |= 8;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 4:
                        i9 |= 16;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 5:
                        i9 |= 32;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i8 = 8;
                        i7 = 10;
                        i6 = 6;
                        break;
                    case 6:
                        int i10 = i6;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i10);
                        i9 |= 64;
                        i6 = i10;
                        break;
                    case 7:
                        i9 |= 128;
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i6 = 6;
                        break;
                    case 8:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i2 = i9 | 256;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = i9 | 512;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 10:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, kSerializerArr[i7], list3);
                        i2 = i9 | 1024;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 11:
                        nonMevPriorityFeeInfo3 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, NonMevPriorityFeeInfo$$serializer.INSTANCE, nonMevPriorityFeeInfo3);
                        i2 = i9 | 2048;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 12:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i3 = i9 | 4096;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 13:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i3 = i9 | 8192;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 14:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = i9 | 16384;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 15:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 32768;
                        i3 = i9 | i4;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 16:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 65536;
                        i3 = i9 | i4;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 17:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
                        i3 = i9 | 131072;
                        i2 = i3;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 18:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str15);
                        i2 = 262144 | i9;
                        i9 = i2;
                        i6 = 6;
                        break;
                    case 19:
                        i9 |= 524288;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 = 6;
                        break;
                    case 20:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i9 |= 1048576;
                        i6 = 6;
                        break;
                    case 21:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i5 = 2097152;
                        i9 = i5 | i9;
                        i6 = 6;
                        break;
                    case 22:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i5 = 4194304;
                        i9 = i5 | i9;
                        i6 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            list = list3;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo3;
            z = zDecodeBooleanElement6;
            str = strDecodeStringElement16;
            strDecodeStringElement = strDecodeStringElement17;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement19;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            z2 = zDecodeBooleanElement4;
            str6 = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            strDecodeStringElement2 = strDecodeStringElement28;
            str10 = strDecodeStringElement29;
            str11 = strDecodeStringElement30;
            z3 = zDecodeBooleanElement5;
            str12 = str15;
            int i11 = i9;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean6;
            i = i11;
            String str16 = strDecodeStringElement21;
            strDecodeStringElement3 = strDecodeStringElement20;
            str13 = str16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdvancedCommonDexInfo(i, str10, dexMultiTokenInfoBean2, strDecodeStringElement2, str9, str8, str7, str11, dexMultiTokenInfoBean, str6, str, list, nonMevPriorityFeeInfo, z3, z2, strDecodeStringElement, str2, str3, z, str12, str5, str4, str13, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdvancedCommonDexInfo advancedCommonDexInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(advancedCommonDexInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdvancedCommonDexInfo.write$Self$OKDex_dex_impl(advancedCommonDexInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
