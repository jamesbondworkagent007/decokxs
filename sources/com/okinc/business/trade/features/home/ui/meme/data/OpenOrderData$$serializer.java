package com.okinc.business.trade.features.home.ui.meme.data;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class OpenOrderData$$serializer implements GeneratedSerializer<OpenOrderData> {
    public static final int $stable;
    public static final OpenOrderData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OpenOrderData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OpenOrderData$$serializer openOrderData$$serializer = new OpenOrderData$$serializer();
        INSTANCE = openOrderData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.meme.data.OpenOrderData", openOrderData$$serializer, 40);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("fromChainId", true);
        pluginGeneratedSerialDescriptor.addElement("toChainId", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("latestTransactionHash", true);
        pluginGeneratedSerialDescriptor.addElement("remainTime", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("customSlippage", false);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("totalReceiveAmount", true);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeDirection", true);
        pluginGeneratedSerialDescriptor.addElement("canCancel", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("feeToken", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPrice", true);
        pluginGeneratedSerialDescriptor.addElement("triggerMarketCapacity", true);
        pluginGeneratedSerialDescriptor.addElement("preFailureReason", true);
        pluginGeneratedSerialDescriptor.addElement("dealWarnTag", true);
        pluginGeneratedSerialDescriptor.addElement("createdPrice", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUp", true);
        pluginGeneratedSerialDescriptor.addElement("isShowCancel", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUpCancel", true);
        pluginGeneratedSerialDescriptor.addElement("memeTokenMarketCap", true);
        pluginGeneratedSerialDescriptor.addElement("isMemeTimeOut", true);
        pluginGeneratedSerialDescriptor.addElement("speedUpTxHash", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("routerModeType", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFeeType", true);
        pluginGeneratedSerialDescriptor.addElement("enableJito", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OpenOrderData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zDecodeBooleanElement;
        boolean z3;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i3;
        int i4;
        String str19;
        String str20;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        boolean z4;
        String str21;
        String str22;
        String str23;
        boolean z5;
        String str24;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str25;
        String str26;
        int i5;
        String str27;
        String str28;
        int i6;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        int i11 = 8;
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
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 31);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 34);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 39);
            z2 = zDecodeBooleanElement5;
            strDecodeStringElement = strDecodeStringElement20;
            str2 = strDecodeStringElement21;
            str = strDecodeStringElement22;
            z5 = zDecodeBooleanElement2;
            str18 = strDecodeStringElement23;
            z4 = zDecodeBooleanElement3;
            z = zDecodeBooleanElement4;
            str28 = strDecodeStringElement24;
            z3 = zDecodeBooleanElement6;
            str17 = strDecodeStringElement25;
            str11 = strDecodeStringElement26;
            str24 = strDecodeStringElement27;
            str16 = strDecodeStringElement28;
            i = 255;
            str13 = strDecodeStringElement17;
            str19 = strDecodeStringElement15;
            str25 = strDecodeStringElement16;
            str22 = strDecodeStringElement13;
            str20 = strDecodeStringElement11;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            str12 = strDecodeStringElement12;
            str15 = str30;
            i4 = iDecodeIntElement;
            i5 = iDecodeIntElement2;
            str8 = strDecodeStringElement3;
            str21 = strDecodeStringElement14;
            str9 = strDecodeStringElement2;
            str6 = strDecodeStringElement5;
            str26 = str29;
            i3 = iDecodeIntElement3;
            str10 = strDecodeStringElement18;
            i2 = -1;
            str3 = strDecodeStringElement6;
            str27 = strDecodeStringElement10;
            str7 = strDecodeStringElement4;
            str5 = strDecodeStringElement7;
            str23 = strDecodeStringElement9;
            str14 = strDecodeStringElement8;
            str4 = strDecodeStringElement19;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
        } else {
            int i12 = 0;
            boolean zDecodeBooleanElement7 = false;
            int i13 = 0;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement10 = false;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement11 = false;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            strDecodeStringElement = null;
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
            String str31 = null;
            boolean z6 = true;
            String str32 = null;
            String str33 = null;
            boolean zDecodeBooleanElement12 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z6 = false;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 0:
                        String strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i13 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str31 = strDecodeStringElement54;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 1:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i13 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 2:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i13 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 3:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i13 |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 4:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i13 |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 5:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i13 |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 6:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i13 |= 64;
                        Unit unit42222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 7:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i10);
                        i13 |= 128;
                        Unit unit422222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 8:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i11);
                        i13 |= 256;
                        Unit unit32 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 9:
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i6 = i13 | 512;
                        Unit unit5 = Unit.INSTANCE;
                        i13 = i6;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 10:
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i6 = i13 | 1024;
                        Unit unit52 = Unit.INSTANCE;
                        i13 = i6;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 11:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i13 |= 2048;
                        Unit unit6 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 12:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i13 |= 4096;
                        Unit unit62 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 13:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i13 |= 8192;
                        Unit unit322 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 14:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i13 |= 16384;
                        Unit unit7 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 15:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str33);
                        i7 = 32768;
                        int i14 = i7 | i13;
                        Unit unit8 = Unit.INSTANCE;
                        i13 = i14;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 16:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str32);
                        i7 = 65536;
                        int i142 = i7 | i13;
                        Unit unit82 = Unit.INSTANCE;
                        i13 = i142;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 17:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i13 |= 131072;
                        Unit unit9 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 18:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i13 |= 262144;
                        Unit unit10 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 19:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i13 |= 524288;
                        Unit unit11 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 20:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
                        i8 = 1048576;
                        i13 |= i8;
                        Unit unit12 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 21:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                        i8 = 2097152;
                        i13 |= i8;
                        Unit unit122 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 22:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                        i8 = 4194304;
                        i13 |= i8;
                        Unit unit1222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 23:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i9 = 8388608;
                        int i15 = i9 | i13;
                        Unit unit13 = Unit.INSTANCE;
                        i13 = i15;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 24:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i9 = 16777216;
                        int i152 = i9 | i13;
                        Unit unit132 = Unit.INSTANCE;
                        i13 = i152;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 25:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i9 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i1522 = i9 | i13;
                        Unit unit1322 = Unit.INSTANCE;
                        i13 = i1522;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 26:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i9 = 67108864;
                        int i15222 = i9 | i13;
                        Unit unit13222 = Unit.INSTANCE;
                        i13 = i15222;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 27:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i9 = 134217728;
                        int i152222 = i9 | i13;
                        Unit unit132222 = Unit.INSTANCE;
                        i13 = i152222;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 28:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
                        i8 = 268435456;
                        i13 |= i8;
                        Unit unit12222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 29:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i9 = 536870912;
                        int i1522222 = i9 | i13;
                        Unit unit1322222 = Unit.INSTANCE;
                        i13 = i1522222;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 30:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
                        i8 = 1073741824;
                        i13 |= i8;
                        Unit unit122222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 31:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 31);
                        i8 = Integer.MIN_VALUE;
                        i13 |= i8;
                        Unit unit1222222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 32:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 32);
                        i12 |= 1;
                        Unit unit14 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 33:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i12 |= 2;
                        Unit unit15 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 34:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 34);
                        i12 |= 4;
                        Unit unit12222222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 35:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 35);
                        i12 |= 8;
                        Unit unit152 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 36:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 36);
                        i12 |= 16;
                        Unit unit1522 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 37:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 37);
                        i12 |= 32;
                        Unit unit15222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 38:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 38);
                        i12 |= 64;
                        Unit unit152222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    case 39:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 39);
                        i12 |= 128;
                        Unit unit122222222 = Unit.INSTANCE;
                        i11 = 8;
                        i10 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i12;
            z = zDecodeBooleanElement12;
            z2 = zDecodeBooleanElement7;
            i2 = i13;
            str = strDecodeStringElement39;
            str2 = strDecodeStringElement40;
            str3 = strDecodeStringElement45;
            str4 = strDecodeStringElement47;
            str5 = strDecodeStringElement50;
            str6 = strDecodeStringElement51;
            str7 = strDecodeStringElement52;
            str8 = strDecodeStringElement53;
            str9 = str31;
            zDecodeBooleanElement = zDecodeBooleanElement8;
            z3 = zDecodeBooleanElement11;
            str10 = strDecodeStringElement32;
            str11 = strDecodeStringElement35;
            str12 = strDecodeStringElement42;
            str13 = strDecodeStringElement46;
            str14 = strDecodeStringElement49;
            str15 = str32;
            str16 = strDecodeStringElement33;
            str17 = strDecodeStringElement36;
            str18 = strDecodeStringElement38;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            str19 = strDecodeStringElement30;
            str20 = strDecodeStringElement43;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean6;
            z4 = zDecodeBooleanElement9;
            str21 = strDecodeStringElement29;
            str22 = strDecodeStringElement41;
            str23 = strDecodeStringElement48;
            z5 = zDecodeBooleanElement10;
            str24 = strDecodeStringElement34;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean5;
            str25 = strDecodeStringElement31;
            str26 = str33;
            String str34 = strDecodeStringElement37;
            i5 = iDecodeIntElement4;
            str27 = strDecodeStringElement44;
            str28 = str34;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OpenOrderData(i2, i, str9, str8, str7, str6, str3, str5, str14, str23, str27, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, str20, str12, str22, str21, str26, str15, str19, str25, str13, i4, i5, i3, str10, str4, strDecodeStringElement, str2, str, z5, str18, z4, z, z2, str28, z3, str17, str11, str24, str16, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OpenOrderData openOrderData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(openOrderData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OpenOrderData.write$Self$OKDex_dex_impl(openOrderData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
