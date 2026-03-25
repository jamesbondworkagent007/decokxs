package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.liveness.lca.EopTrackEvent;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class CommonDexInfo$$serializer implements GeneratedSerializer<CommonDexInfo> {
    public static final int $stable;
    public static final CommonDexInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CommonDexInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommonDexInfo$$serializer commonDexInfo$$serializer = new CommonDexInfo$$serializer();
        INSTANCE = commonDexInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.CommonDexInfo", commonDexInfo$$serializer, 36);
        pluginGeneratedSerialDescriptor.addElement("fromNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("toNativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("crossMiniAmount", true);
        pluginGeneratedSerialDescriptor.addElement("crossMaxAmount", true);
        pluginGeneratedSerialDescriptor.addElement("estimateReserveGasTokenFee", true);
        pluginGeneratedSerialDescriptor.addElement("isSafeMoonToken", true);
        pluginGeneratedSerialDescriptor.addElement("realSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("isHoneypot", true);
        pluginGeneratedSerialDescriptor.addElement("isLocalLeverage", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MSG_HUMP, true);
        pluginGeneratedSerialDescriptor.addElement("fromPriceFluctuation", true);
        pluginGeneratedSerialDescriptor.addElement("toPriceFluctuation", true);
        pluginGeneratedSerialDescriptor.addElement("priceFluctuationThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("priceFluctuationMonitorTime", true);
        pluginGeneratedSerialDescriptor.addElement("isSpecialSafeMoonToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformInfo", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteType", true);
        pluginGeneratedSerialDescriptor.addElement("rateFluctuationThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("rateFluctuation", true);
        pluginGeneratedSerialDescriptor.addElement("slippageFluctuationhold", true);
        pluginGeneratedSerialDescriptor.addElement("crossAccuracyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("needApprove", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeRfqUrl", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeSwitch", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignMarketRelTs", true);
        pluginGeneratedSerialDescriptor.addElement("teeSignTpslRelTs", true);
        pluginGeneratedSerialDescriptor.addElement("mevUnstableShowLevel", true);
        pluginGeneratedSerialDescriptor.addElement("remainingQuota", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(DefiPlatformInfo$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CommonDexInfo deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        String str8;
        String str9;
        String strDecodeStringElement2;
        String str10;
        String str11;
        String str12;
        String strDecodeStringElement3;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        DefiPlatformInfo defiPlatformInfo;
        String str22;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String str23;
        String str24;
        int i2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, dexMultiTokenInfoBean$$serializer, null);
            DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, DefiPlatformInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            str4 = strDecodeStringElement16;
            str8 = strDecodeStringElement31;
            str17 = strDecodeStringElement5;
            str21 = strDecodeStringElement32;
            str20 = strDecodeStringElement33;
            str5 = strDecodeStringElement14;
            str11 = strDecodeStringElement12;
            str14 = strDecodeStringElement8;
            str25 = strDecodeStringElement28;
            str3 = strDecodeStringElement29;
            str16 = strDecodeStringElement6;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean3;
            str30 = strDecodeStringElement25;
            str29 = strDecodeStringElement26;
            str6 = strDecodeStringElement13;
            str19 = strDecodeStringElement22;
            str26 = strDecodeStringElement23;
            str22 = strDecodeStringElement19;
            str23 = strDecodeStringElement20;
            str15 = strDecodeStringElement7;
            str24 = strDecodeStringElement4;
            str9 = strDecodeStringElement17;
            i2 = 15;
            str = strDecodeStringElement18;
            str10 = strDecodeStringElement15;
            str7 = strDecodeStringElement11;
            i = -1;
            str2 = strDecodeStringElement30;
            str27 = strDecodeStringElement27;
            str28 = strDecodeStringElement24;
            str18 = strDecodeStringElement21;
            defiPlatformInfo = defiPlatformInfo2;
            str12 = strDecodeStringElement10;
            str13 = strDecodeStringElement9;
        } else {
            String strDecodeStringElement34 = null;
            int i7 = 0;
            int i8 = 0;
            DefiPlatformInfo defiPlatformInfo3 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = null;
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
            String strDecodeStringElement64 = null;
            String str31 = null;
            String str32 = null;
            boolean z = true;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 0:
                        String strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str31 = strDecodeStringElement65;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 1:
                        String strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str32 = strDecodeStringElement66;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 2:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 3:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 4:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 5:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 6:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        Unit unit7 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 7:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        Unit unit72 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 8:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 256;
                        Unit unit722 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 9:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        Unit unit7222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 10:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        Unit unit72222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 11:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        Unit unit722222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 12:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        Unit unit7222222 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 13:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 14:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        Unit unit82 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 15:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 |= 32768;
                        Unit unit822 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 16:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 |= 65536;
                        Unit unit9 = Unit.INSTANCE;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 17:
                        dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean4);
                        int i9 = 131072 | i7;
                        Unit unit10 = Unit.INSTANCE;
                        i7 = i9;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 18:
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i3 = 262144;
                        int i10 = i3 | i7;
                        Unit unit11 = Unit.INSTANCE;
                        i7 = i10;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 19:
                        defiPlatformInfo3 = (DefiPlatformInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, DefiPlatformInfo$$serializer.INSTANCE, defiPlatformInfo3);
                        i3 = 524288;
                        int i102 = i3 | i7;
                        Unit unit112 = Unit.INSTANCE;
                        i7 = i102;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 20:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        int i1022 = i3 | i7;
                        Unit unit1122 = Unit.INSTANCE;
                        i7 = i1022;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 21:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        int i10222 = i3 | i7;
                        Unit unit11222 = Unit.INSTANCE;
                        i7 = i10222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 22:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        int i102222 = i3 | i7;
                        Unit unit112222 = Unit.INSTANCE;
                        i7 = i102222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 23:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        int i1022222 = i3 | i7;
                        Unit unit1122222 = Unit.INSTANCE;
                        i7 = i1022222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 24:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        int i10222222 = i3 | i7;
                        Unit unit11222222 = Unit.INSTANCE;
                        i7 = i10222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 25:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i102222222 = i3 | i7;
                        Unit unit112222222 = Unit.INSTANCE;
                        i7 = i102222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 26:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        int i1022222222 = i3 | i7;
                        Unit unit1122222222 = Unit.INSTANCE;
                        i7 = i1022222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 27:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        int i10222222222 = i3 | i7;
                        Unit unit11222222222 = Unit.INSTANCE;
                        i7 = i10222222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 28:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        int i102222222222 = i3 | i7;
                        Unit unit112222222222 = Unit.INSTANCE;
                        i7 = i102222222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 29:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        int i1022222222222 = i3 | i7;
                        Unit unit1122222222222 = Unit.INSTANCE;
                        i7 = i1022222222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 30:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        int i10222222222222 = i3 | i7;
                        Unit unit11222222222222 = Unit.INSTANCE;
                        i7 = i10222222222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 31:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        int i102222222222222 = i3 | i7;
                        Unit unit112222222222222 = Unit.INSTANCE;
                        i7 = i102222222222222;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 32:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        int i11 = i8 | 1;
                        Unit unit12 = Unit.INSTANCE;
                        i8 = i11;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 33:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i4 = i8 | 2;
                        Unit unit13 = Unit.INSTANCE;
                        i8 = i4;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 34:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i4 = i8 | 4;
                        Unit unit132 = Unit.INSTANCE;
                        i8 = i4;
                        i6 = 8;
                        i5 = 5;
                        break;
                    case 35:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i4 = i8 | 8;
                        Unit unit1322 = Unit.INSTANCE;
                        i8 = i4;
                        i6 = 8;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement35;
            i = i7;
            str2 = strDecodeStringElement41;
            str3 = strDecodeStringElement42;
            str4 = strDecodeStringElement49;
            str5 = strDecodeStringElement50;
            str6 = strDecodeStringElement51;
            str7 = strDecodeStringElement52;
            strDecodeStringElement = strDecodeStringElement53;
            str8 = strDecodeStringElement54;
            str9 = strDecodeStringElement55;
            strDecodeStringElement2 = strDecodeStringElement56;
            str10 = strDecodeStringElement57;
            str11 = strDecodeStringElement58;
            str12 = strDecodeStringElement59;
            strDecodeStringElement3 = strDecodeStringElement60;
            str13 = strDecodeStringElement61;
            str14 = strDecodeStringElement62;
            str15 = strDecodeStringElement63;
            str16 = strDecodeStringElement64;
            str17 = str32;
            str18 = strDecodeStringElement37;
            str19 = strDecodeStringElement38;
            str20 = strDecodeStringElement39;
            str21 = strDecodeStringElement40;
            defiPlatformInfo = defiPlatformInfo3;
            str22 = strDecodeStringElement34;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            str23 = strDecodeStringElement36;
            str24 = str31;
            i2 = i8;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
            String str33 = strDecodeStringElement48;
            str25 = strDecodeStringElement43;
            str26 = str33;
            String str34 = strDecodeStringElement47;
            str27 = strDecodeStringElement44;
            str28 = str34;
            String str35 = strDecodeStringElement46;
            str29 = strDecodeStringElement45;
            str30 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CommonDexInfo(i, i2, str24, str17, str16, str15, str14, str13, strDecodeStringElement3, str12, str7, str11, str6, str5, str10, str4, strDecodeStringElement2, str9, str, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, defiPlatformInfo, str22, str23, str18, str19, str26, str28, str30, str29, str27, str25, str3, str2, str8, str21, str20, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CommonDexInfo commonDexInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CommonDexInfo.write$Self$OKDex_dex_impl(commonDexInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
