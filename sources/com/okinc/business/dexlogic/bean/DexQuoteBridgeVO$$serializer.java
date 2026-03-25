package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DexQuoteBridgeVO$$serializer implements GeneratedSerializer<DexQuoteBridgeVO> {
    public static final int $stable;
    public static final DexQuoteBridgeVO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexQuoteBridgeVO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexQuoteBridgeVO$$serializer dexQuoteBridgeVO$$serializer = new DexQuoteBridgeVO$$serializer();
        INSTANCE = dexQuoteBridgeVO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexQuoteBridgeVO", dexQuoteBridgeVO$$serializer, 39);
        pluginGeneratedSerialDescriptor.addElement("bridgeLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeId", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeName", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeAmountIn", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeAmountOut", true);
        pluginGeneratedSerialDescriptor.addElement("expectedTimeDesc", true);
        pluginGeneratedSerialDescriptor.addElement("crossChainFee", true);
        pluginGeneratedSerialDescriptor.addElement("otherFee", true);
        pluginGeneratedSerialDescriptor.addElement("totalFee", true);
        pluginGeneratedSerialDescriptor.addElement("maximumSwap", true);
        pluginGeneratedSerialDescriptor.addElement("minimumSwap", true);
        pluginGeneratedSerialDescriptor.addElement("fromPoolAddress", true);
        pluginGeneratedSerialDescriptor.addElement("toPoolAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fromPoolName", true);
        pluginGeneratedSerialDescriptor.addElement("toPoolName", true);
        pluginGeneratedSerialDescriptor.addElement("crossFromToken", true);
        pluginGeneratedSerialDescriptor.addElement("crossToToken", true);
        pluginGeneratedSerialDescriptor.addElement("callDataMap", true);
        pluginGeneratedSerialDescriptor.addElement("calldata", true);
        pluginGeneratedSerialDescriptor.addElement("gasFeeTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("gasCost", true);
        pluginGeneratedSerialDescriptor.addElement("percent", true);
        pluginGeneratedSerialDescriptor.addElement("poolDepthUsd", true);
        pluginGeneratedSerialDescriptor.addElement("maxRatio", true);
        pluginGeneratedSerialDescriptor.addElement("minLimitUsd", true);
        pluginGeneratedSerialDescriptor.addElement("officialBridgeFee", true);
        pluginGeneratedSerialDescriptor.addElement("estimateBridgeFeeAmount", true);
        pluginGeneratedSerialDescriptor.addElement("estimateBridgeFeeAmountUsd", true);
        pluginGeneratedSerialDescriptor.addElement("estimateClaimFeeAmount", true);
        pluginGeneratedSerialDescriptor.addElement("estimateClaimFeeAmountUsd", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeAmountOutUsd", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeAmountInUsd", true);
        pluginGeneratedSerialDescriptor.addElement("toRiskLimit", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeType", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement("isFreeNetworkFee", true);
        pluginGeneratedSerialDescriptor.addElement("signatureName", true);
        pluginGeneratedSerialDescriptor.addElement("dexMultiTokenAllowanceOut", true);
        pluginGeneratedSerialDescriptor.addElement("isNeedClaim", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DexQuoteBridgeVO.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(kSerializerArr[17]), BuiltinSerializersKt.getNullable(OfflineQuote$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[36], BuiltinSerializersKt.getNullable(DeFiPlatformTokenApprovalInfo$$serializer.INSTANCE), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexQuoteBridgeVO deserialize(@NotNull Decoder decoder) {
        Map map;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo;
        int i;
        String str13;
        String str14;
        String str15;
        String strDecodeStringElement;
        String str16;
        String str17;
        String str18;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        List list;
        String str19;
        String str20;
        OfflineQuote offlineQuote;
        String str21;
        String str22;
        int i2;
        String str23;
        String str24;
        String str25;
        int i3;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexQuoteBridgeVO.$childSerializers;
        int i6 = 9;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            str4 = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, dexMultiTokenInfoBean$$serializer, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            OfflineQuote offlineQuote2 = (OfflineQuote) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, OfflineQuote$$serializer.INSTANCE, null);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 33);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], null);
            deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 37, DeFiPlatformTokenApprovalInfo$$serializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
            str23 = strDecodeStringElement30;
            list = list2;
            str30 = strDecodeStringElement24;
            str28 = strDecodeStringElement25;
            str3 = strDecodeStringElement26;
            str2 = strDecodeStringElement27;
            str = strDecodeStringElement28;
            str20 = strDecodeStringElement29;
            i3 = iDecodeIntElement;
            str26 = strDecodeStringElement31;
            str19 = strDecodeStringElement32;
            offlineQuote = offlineQuote2;
            str24 = strDecodeStringElement17;
            str21 = strDecodeStringElement18;
            str25 = strDecodeStringElement11;
            str11 = strDecodeStringElement3;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            map = map2;
            str12 = strDecodeStringElement2;
            str13 = strDecodeStringElement19;
            str14 = strDecodeStringElement20;
            str15 = strDecodeStringElement21;
            str29 = strDecodeStringElement22;
            str10 = strDecodeStringElement4;
            str9 = strDecodeStringElement5;
            str16 = strDecodeStringElement14;
            str5 = strDecodeStringElement9;
            str18 = strDecodeStringElement13;
            str27 = strDecodeStringElement16;
            str17 = strDecodeStringElement15;
            i = 127;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement7;
            i2 = -1;
            str31 = strDecodeStringElement23;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
            str22 = strDecodeStringElement12;
        } else {
            int i8 = 0;
            int i9 = 0;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            Map map3 = null;
            OfflineQuote offlineQuote3 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String strDecodeStringElement58 = null;
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String strDecodeStringElement62 = null;
            String strDecodeStringElement63 = null;
            String str32 = null;
            boolean z = true;
            DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo2 = null;
            List list3 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 0:
                        String strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str32 = strDecodeStringElement64;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 1:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i9 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 2:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 3:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i9 |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 4:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 5:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i9 |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 6:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i9 |= 64;
                        Unit unit42222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 7:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i9 |= 128;
                        Unit unit422222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 8:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i9 |= 256;
                        Unit unit4222222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 9:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i9 |= 512;
                        Unit unit5 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 10:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i9 |= 1024;
                        Unit unit42222222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 11:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i9 |= 2048;
                        Unit unit422222222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 12:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i9 |= 4096;
                        Unit unit4222222222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 13:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i9 |= 8192;
                        Unit unit42222222222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 14:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i9 |= 16384;
                        Unit unit6 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 15:
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i4 = 32768;
                        i9 |= i4;
                        Unit unit7 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 16:
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i4 = 65536;
                        i9 |= i4;
                        Unit unit72 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 17:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], map3);
                        i4 = 131072;
                        i9 |= i4;
                        Unit unit722 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 18:
                        offlineQuote3 = (OfflineQuote) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, OfflineQuote$$serializer.INSTANCE, offlineQuote3);
                        i5 = 262144;
                        int i10 = i5 | i9;
                        Unit unit8 = Unit.INSTANCE;
                        i9 = i10;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 19:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 = 524288;
                        int i102 = i5 | i9;
                        Unit unit82 = Unit.INSTANCE;
                        i9 = i102;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i5 = 1048576;
                        int i1022 = i5 | i9;
                        Unit unit822 = Unit.INSTANCE;
                        i9 = i1022;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 21:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i5 = 2097152;
                        int i10222 = i5 | i9;
                        Unit unit8222 = Unit.INSTANCE;
                        i9 = i10222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 22:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i5 = 4194304;
                        int i102222 = i5 | i9;
                        Unit unit82222 = Unit.INSTANCE;
                        i9 = i102222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 23:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i5 = 8388608;
                        int i1022222 = i5 | i9;
                        Unit unit822222 = Unit.INSTANCE;
                        i9 = i1022222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 24:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i5 = 16777216;
                        int i10222222 = i5 | i9;
                        Unit unit8222222 = Unit.INSTANCE;
                        i9 = i10222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 25:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i5 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i102222222 = i5 | i9;
                        Unit unit82222222 = Unit.INSTANCE;
                        i9 = i102222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 26:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i5 = 67108864;
                        int i1022222222 = i5 | i9;
                        Unit unit822222222 = Unit.INSTANCE;
                        i9 = i1022222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 27:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i5 = 134217728;
                        int i10222222222 = i5 | i9;
                        Unit unit8222222222 = Unit.INSTANCE;
                        i9 = i10222222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 28:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i5 = 268435456;
                        int i102222222222 = i5 | i9;
                        Unit unit82222222222 = Unit.INSTANCE;
                        i9 = i102222222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 29:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i5 = 536870912;
                        int i1022222222222 = i5 | i9;
                        Unit unit822222222222 = Unit.INSTANCE;
                        i9 = i1022222222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 30:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i5 = 1073741824;
                        int i10222222222222 = i5 | i9;
                        Unit unit8222222222222 = Unit.INSTANCE;
                        i9 = i10222222222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 31:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i5 = Integer.MIN_VALUE;
                        int i102222222222222 = i5 | i9;
                        Unit unit82222222222222 = Unit.INSTANCE;
                        i9 = i102222222222222;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 32:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i8 |= 1;
                        Unit unit9 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 33:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 33);
                        i8 |= 2;
                        Unit unit7222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 34:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i8 |= 4;
                        Unit unit10 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 35:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i8 |= 8;
                        Unit unit102 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 36:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], list3);
                        i8 |= 16;
                        Unit unit72222 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 37:
                        deFiPlatformTokenApprovalInfo2 = (DeFiPlatformTokenApprovalInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 37, DeFiPlatformTokenApprovalInfo$$serializer.INSTANCE, deFiPlatformTokenApprovalInfo2);
                        int i11 = i8 | 32;
                        Unit unit11 = Unit.INSTANCE;
                        i8 = i11;
                        i7 = 8;
                        i6 = 9;
                        break;
                    case 38:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i8 |= 64;
                        Unit unit1022 = Unit.INSTANCE;
                        i7 = 8;
                        i6 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map3;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean6;
            str = strDecodeStringElement43;
            str2 = strDecodeStringElement44;
            str3 = strDecodeStringElement45;
            str4 = strDecodeStringElement56;
            str5 = strDecodeStringElement57;
            str6 = strDecodeStringElement58;
            str7 = strDecodeStringElement59;
            str8 = strDecodeStringElement60;
            str9 = strDecodeStringElement61;
            str10 = strDecodeStringElement62;
            str11 = strDecodeStringElement63;
            str12 = str32;
            deFiPlatformTokenApprovalInfo = deFiPlatformTokenApprovalInfo2;
            i = i8;
            str13 = strDecodeStringElement35;
            str14 = strDecodeStringElement36;
            str15 = strDecodeStringElement37;
            strDecodeStringElement = strDecodeStringElement39;
            str16 = strDecodeStringElement50;
            str17 = strDecodeStringElement54;
            str18 = strDecodeStringElement55;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean5;
            list = list3;
            str19 = strDecodeStringElement40;
            str20 = strDecodeStringElement42;
            offlineQuote = offlineQuote3;
            str21 = strDecodeStringElement34;
            str22 = strDecodeStringElement51;
            i2 = i9;
            str23 = strDecodeStringElement41;
            str24 = strDecodeStringElement33;
            str25 = strDecodeStringElement52;
            i3 = iDecodeIntElement2;
            String str33 = strDecodeStringElement53;
            str26 = strDecodeStringElement38;
            str27 = str33;
            String str34 = strDecodeStringElement49;
            str28 = strDecodeStringElement46;
            str29 = str34;
            String str35 = strDecodeStringElement48;
            str30 = strDecodeStringElement47;
            str31 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexQuoteBridgeVO(i2, i, str12, str11, str10, str9, str8, str7, str6, str5, str4, str25, str22, str18, str16, str17, str27, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, map, offlineQuote, str24, str21, str13, str14, str15, str29, str31, str30, str28, str3, str2, str, str20, str23, i3, str26, str19, list, deFiPlatformTokenApprovalInfo, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexQuoteBridgeVO dexQuoteBridgeVO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexQuoteBridgeVO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexQuoteBridgeVO.write$Self$OKDex_dex_impl(dexQuoteBridgeVO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
