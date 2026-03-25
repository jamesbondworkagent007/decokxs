package com.okinc.unify_trade.biz.subscribe;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class DexOrderDetail$$serializer implements GeneratedSerializer<DexOrderDetail> {
    public static final int $stable;
    public static final DexOrderDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexOrderDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexOrderDetail$$serializer dexOrderDetail$$serializer = new DexOrderDetail$$serializer();
        INSTANCE = dexOrderDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.DexOrderDetail", dexOrderDetail$$serializer, 54);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("priceAtPay", true);
        pluginGeneratedSerialDescriptor.addElement("payCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("payValue", true);
        pluginGeneratedSerialDescriptor.addElement("payCoinSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("receiveCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("receiveCoinSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("priceAtReceive", true);
        pluginGeneratedSerialDescriptor.addElement("receiveValue", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tradingFee", true);
        pluginGeneratedSerialDescriptor.addElement("tradingFeeSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("netWorkFee", true);
        pluginGeneratedSerialDescriptor.addElement("netWorkFeeSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("netWorkFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("tradingFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("uTime", true);
        pluginGeneratedSerialDescriptor.addElement("fillTime", true);
        pluginGeneratedSerialDescriptor.addElement("depositWaitTime", true);
        pluginGeneratedSerialDescriptor.addElement("prohibitedRechargeByAsset", true);
        pluginGeneratedSerialDescriptor.addElement("depositId", true);
        pluginGeneratedSerialDescriptor.addElement("originFeeRate", true);
        pluginGeneratedSerialDescriptor.addElement("discountedFeeRate", true);
        pluginGeneratedSerialDescriptor.addElement("taxRate", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.TAX, true);
        pluginGeneratedSerialDescriptor.addElement("features", true);
        pluginGeneratedSerialDescriptor.addElement("fastDepositStatus", true);
        pluginGeneratedSerialDescriptor.addElement("fastDepositTime", true);
        pluginGeneratedSerialDescriptor.addElement("orderSubType", true);
        pluginGeneratedSerialDescriptor.addElement("convertToCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("convertToCoinSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("subState", true);
        pluginGeneratedSerialDescriptor.addElement("convertFromCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("convertFromCoinSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("isReleased", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("stopOrderList", true);
        pluginGeneratedSerialDescriptor.addElement("strategyFailureReason", true);
        pluginGeneratedSerialDescriptor.addElement("cancelReason", true);
        pluginGeneratedSerialDescriptor.addElement("strategyOrderType", true);
        pluginGeneratedSerialDescriptor.addElement("triggerMarketCapUsd", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("triggerValidDays", true);
        pluginGeneratedSerialDescriptor.addElement("expireTimeDays", true);
        pluginGeneratedSerialDescriptor.addElement("expireTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("orderLimitType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = DexOrderDetail.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(DexOrderDetailFeatures$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[44]), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexOrderDetail deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        int i2;
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
        String str13;
        String str14;
        String strDecodeStringElement;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        DexOrderDetailFeatures dexOrderDetailFeatures;
        List list;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexOrderDetail.$childSerializers;
        int i3 = 7;
        int i4 = 8;
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
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            DexOrderDetailFeatures dexOrderDetailFeatures2 = (DexOrderDetailFeatures) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, DexOrderDetailFeatures$$serializer.INSTANCE, null);
            String strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            String strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            String strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            String strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
            String strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
            String strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
            String strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
            String strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 42, stringSerializer, null);
            String str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 43, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 44, kSerializerArr[44], null);
            String strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
            String strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
            String strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
            String strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
            String strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
            String strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
            String strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
            str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 52, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 53);
            str50 = strDecodeStringElement43;
            str39 = strDecodeStringElement44;
            list = list2;
            str19 = strDecodeStringElement40;
            str18 = strDecodeStringElement41;
            str27 = strDecodeStringElement42;
            str37 = str52;
            str49 = str53;
            str42 = strDecodeStringElement45;
            str17 = strDecodeStringElement46;
            str46 = strDecodeStringElement47;
            str16 = strDecodeStringElement48;
            str15 = strDecodeStringElement49;
            i = 4194303;
            str33 = strDecodeStringElement34;
            str14 = strDecodeStringElement2;
            str3 = strDecodeStringElement28;
            str32 = strDecodeStringElement29;
            str25 = strDecodeStringElement30;
            str45 = strDecodeStringElement33;
            dexOrderDetailFeatures = dexOrderDetailFeatures2;
            str28 = strDecodeStringElement37;
            str43 = strDecodeStringElement38;
            str4 = strDecodeStringElement35;
            str29 = strDecodeStringElement36;
            str9 = strDecodeStringElement7;
            str5 = strDecodeStringElement18;
            str22 = strDecodeStringElement17;
            str35 = strDecodeStringElement16;
            str48 = strDecodeStringElement21;
            str41 = strDecodeStringElement24;
            str51 = strDecodeStringElement25;
            str = strDecodeStringElement26;
            str26 = strDecodeStringElement31;
            str38 = strDecodeStringElement32;
            str11 = strDecodeStringElement5;
            str13 = strDecodeStringElement3;
            str20 = strDecodeStringElement20;
            str12 = strDecodeStringElement4;
            str40 = strDecodeStringElement14;
            str30 = strDecodeStringElement12;
            str8 = strDecodeStringElement8;
            str31 = strDecodeStringElement13;
            str21 = strDecodeStringElement19;
            i2 = -1;
            str23 = strDecodeStringElement22;
            str6 = strDecodeStringElement10;
            str34 = strDecodeStringElement39;
            str7 = strDecodeStringElement9;
            str44 = strDecodeStringElement23;
            str2 = strDecodeStringElement27;
            str36 = strDecodeStringElement11;
            str47 = strDecodeStringElement15;
            str10 = strDecodeStringElement6;
        } else {
            int i5 = 0;
            String str54 = null;
            DexOrderDetailFeatures dexOrderDetailFeatures3 = null;
            String str55 = null;
            String strDecodeStringElement50 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            String str62 = null;
            String str63 = null;
            String str64 = null;
            String str65 = null;
            String str66 = null;
            String str67 = null;
            String str68 = null;
            String str69 = null;
            String str70 = null;
            String str71 = null;
            String str72 = null;
            String str73 = null;
            String str74 = null;
            String str75 = null;
            String str76 = null;
            String str77 = null;
            String str78 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String str79 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String strDecodeStringElement58 = null;
            String strDecodeStringElement59 = null;
            String str80 = null;
            String strDecodeStringElement60 = null;
            String str81 = null;
            String strDecodeStringElement61 = null;
            String str82 = null;
            String strDecodeStringElement62 = null;
            String strDecodeStringElement63 = null;
            String str83 = null;
            String strDecodeStringElement64 = null;
            String str84 = null;
            String strDecodeStringElement65 = null;
            String strDecodeStringElement66 = null;
            String strDecodeStringElement67 = null;
            String strDecodeStringElement68 = null;
            String str85 = null;
            boolean z = true;
            String str86 = null;
            List list3 = null;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 0:
                        String strDecodeStringElement69 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str85 = strDecodeStringElement69;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 3:
                        strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 4:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        Unit unit52 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 5:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        Unit unit522 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 6:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        Unit unit5222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 7:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 128;
                        Unit unit52222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 8:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 256;
                        Unit unit522222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 9:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        Unit unit5222222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 10:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        Unit unit52222222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 11:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        Unit unit522222222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 12:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        Unit unit6 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 13:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        Unit unit7 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 14:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 |= 16384;
                        Unit unit8 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 15:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i5 |= 32768;
                        Unit unit9 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 16:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 |= 65536;
                        Unit unit10 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 17:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 |= 131072;
                        Unit unit11 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 18:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i5 |= 262144;
                        Unit unit12 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 19:
                        String strDecodeStringElement70 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 |= 524288;
                        Unit unit13 = Unit.INSTANCE;
                        str84 = strDecodeStringElement70;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 20:
                        String strDecodeStringElement71 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i5 |= 1048576;
                        Unit unit14 = Unit.INSTANCE;
                        str83 = strDecodeStringElement71;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 21:
                        String strDecodeStringElement72 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i5 |= 2097152;
                        Unit unit15 = Unit.INSTANCE;
                        str82 = strDecodeStringElement72;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 22:
                        String strDecodeStringElement73 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i5 |= 4194304;
                        Unit unit16 = Unit.INSTANCE;
                        str81 = strDecodeStringElement73;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 23:
                        String strDecodeStringElement74 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i5 |= 8388608;
                        Unit unit17 = Unit.INSTANCE;
                        str80 = strDecodeStringElement74;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 24:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i5 |= 16777216;
                        Unit unit18 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 25:
                        String strDecodeStringElement75 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i5 |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        Unit unit19 = Unit.INSTANCE;
                        str56 = strDecodeStringElement75;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 26:
                        String strDecodeStringElement76 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i5 |= 67108864;
                        Unit unit20 = Unit.INSTANCE;
                        str57 = strDecodeStringElement76;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 27:
                        String strDecodeStringElement77 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i5 |= 134217728;
                        Unit unit21 = Unit.INSTANCE;
                        str58 = strDecodeStringElement77;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 28:
                        String strDecodeStringElement78 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i5 |= 268435456;
                        Unit unit22 = Unit.INSTANCE;
                        str59 = strDecodeStringElement78;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 29:
                        String strDecodeStringElement79 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i5 |= 536870912;
                        Unit unit23 = Unit.INSTANCE;
                        str60 = strDecodeStringElement79;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 30:
                        String strDecodeStringElement80 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i5 |= 1073741824;
                        Unit unit24 = Unit.INSTANCE;
                        str61 = strDecodeStringElement80;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 31:
                        String strDecodeStringElement81 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i5 |= Integer.MIN_VALUE;
                        Unit unit25 = Unit.INSTANCE;
                        str62 = strDecodeStringElement81;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 32:
                        String strDecodeStringElement82 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        i6 |= 1;
                        Unit unit26 = Unit.INSTANCE;
                        str63 = strDecodeStringElement82;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 33:
                        dexOrderDetailFeatures3 = (DexOrderDetailFeatures) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 33, DexOrderDetailFeatures$$serializer.INSTANCE, dexOrderDetailFeatures3);
                        i6 |= 2;
                        Unit unit27 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 34:
                        String strDecodeStringElement83 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i6 |= 4;
                        Unit unit28 = Unit.INSTANCE;
                        str79 = strDecodeStringElement83;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 35:
                        String strDecodeStringElement84 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i6 |= 8;
                        Unit unit29 = Unit.INSTANCE;
                        str78 = strDecodeStringElement84;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 36:
                        String strDecodeStringElement85 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i6 |= 16;
                        Unit unit30 = Unit.INSTANCE;
                        str77 = strDecodeStringElement85;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 37:
                        String strDecodeStringElement86 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
                        i6 |= 32;
                        Unit unit31 = Unit.INSTANCE;
                        str76 = strDecodeStringElement86;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 38:
                        String strDecodeStringElement87 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i6 |= 64;
                        Unit unit32 = Unit.INSTANCE;
                        str75 = strDecodeStringElement87;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 39:
                        String strDecodeStringElement88 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 39);
                        i6 |= 128;
                        Unit unit33 = Unit.INSTANCE;
                        str74 = strDecodeStringElement88;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 40:
                        String strDecodeStringElement89 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 40);
                        i6 |= 256;
                        Unit unit34 = Unit.INSTANCE;
                        str73 = strDecodeStringElement89;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 41:
                        String strDecodeStringElement90 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 41);
                        i6 |= 512;
                        Unit unit35 = Unit.INSTANCE;
                        str72 = strDecodeStringElement90;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 42:
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, str54);
                        i6 |= 1024;
                        Unit unit272 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 43:
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, str55);
                        i6 |= 2048;
                        Unit unit2722 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 44:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 44, kSerializerArr[44], list3);
                        i6 |= 4096;
                        Unit unit36 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 45:
                        String strDecodeStringElement91 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 45);
                        i6 |= 8192;
                        Unit unit37 = Unit.INSTANCE;
                        str71 = strDecodeStringElement91;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 46:
                        String strDecodeStringElement92 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 46);
                        i6 |= 16384;
                        Unit unit38 = Unit.INSTANCE;
                        str70 = strDecodeStringElement92;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 47:
                        String strDecodeStringElement93 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 47);
                        i6 |= 32768;
                        Unit unit39 = Unit.INSTANCE;
                        str69 = strDecodeStringElement93;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 48:
                        String strDecodeStringElement94 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 48);
                        i6 |= 65536;
                        Unit unit40 = Unit.INSTANCE;
                        str68 = strDecodeStringElement94;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 49:
                        String strDecodeStringElement95 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 49);
                        i6 |= 131072;
                        Unit unit41 = Unit.INSTANCE;
                        str67 = strDecodeStringElement95;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 50:
                        String strDecodeStringElement96 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 50);
                        i6 |= 262144;
                        Unit unit42 = Unit.INSTANCE;
                        str66 = strDecodeStringElement96;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 51:
                        String strDecodeStringElement97 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 51);
                        i6 |= 524288;
                        Unit unit43 = Unit.INSTANCE;
                        str65 = strDecodeStringElement97;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 52:
                        str86 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, str86);
                        i6 |= 1048576;
                        Unit unit27222 = Unit.INSTANCE;
                        i4 = 8;
                        i3 = 7;
                        break;
                    case 53:
                        String strDecodeStringElement98 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 53);
                        i6 |= 2097152;
                        Unit unit44 = Unit.INSTANCE;
                        str64 = strDecodeStringElement98;
                        i4 = 8;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            str = strDecodeStringElement50;
            i2 = i5;
            str2 = str56;
            str3 = str57;
            str4 = str79;
            str5 = strDecodeStringElement55;
            str6 = strDecodeStringElement61;
            str7 = strDecodeStringElement62;
            str8 = strDecodeStringElement63;
            str9 = strDecodeStringElement64;
            str10 = strDecodeStringElement65;
            str11 = strDecodeStringElement66;
            str12 = strDecodeStringElement67;
            str13 = strDecodeStringElement68;
            str14 = str85;
            strDecodeStringElement = str64;
            str15 = str65;
            str16 = str66;
            str17 = str68;
            str18 = str73;
            str19 = str74;
            str20 = strDecodeStringElement51;
            str21 = strDecodeStringElement52;
            str22 = strDecodeStringElement56;
            str23 = str83;
            str24 = str86;
            str25 = str59;
            str26 = str60;
            str27 = str72;
            str28 = str77;
            str29 = str78;
            str30 = strDecodeStringElement54;
            str31 = strDecodeStringElement59;
            dexOrderDetailFeatures = dexOrderDetailFeatures3;
            list = list3;
            str32 = str58;
            str33 = str63;
            str34 = str75;
            str35 = strDecodeStringElement57;
            str36 = strDecodeStringElement60;
            str37 = str54;
            str38 = str61;
            str39 = str70;
            str40 = strDecodeStringElement53;
            str41 = str81;
            str42 = str69;
            str43 = str76;
            str44 = str82;
            str45 = str62;
            str46 = str67;
            str47 = strDecodeStringElement58;
            str48 = str84;
            str49 = str55;
            String str87 = str80;
            str50 = str71;
            str51 = str87;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexOrderDetail(i2, i, str14, str13, str12, str11, str10, str9, str8, str7, str6, str36, str30, str31, str40, str47, str35, str22, str5, str21, str20, str48, str23, str44, str41, str51, str, str2, str3, str32, str25, str26, str38, str45, str33, dexOrderDetailFeatures, str4, str29, str28, str43, str34, str19, str18, str27, str37, str49, list, str50, str39, str42, str17, str46, str16, str15, str24, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexOrderDetail dexOrderDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexOrderDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexOrderDetail.write$Self$OKTradeCore_trade_core(dexOrderDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
