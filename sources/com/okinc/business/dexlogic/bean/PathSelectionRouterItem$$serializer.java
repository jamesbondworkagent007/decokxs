package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class PathSelectionRouterItem$$serializer implements GeneratedSerializer<PathSelectionRouterItem> {
    public static final int $stable;
    public static final PathSelectionRouterItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PathSelectionRouterItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PathSelectionRouterItem$$serializer pathSelectionRouterItem$$serializer = new PathSelectionRouterItem$$serializer();
        INSTANCE = pathSelectionRouterItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.PathSelectionRouterItem", pathSelectionRouterItem$$serializer, 32);
        pluginGeneratedSerialDescriptor.addElement("routerLabel", true);
        pluginGeneratedSerialDescriptor.addElement("fromSwapFee", true);
        pluginGeneratedSerialDescriptor.addElement("fromSwapFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("toSwapFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFeeAmount", true);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFeeAmountUsd", true);
        pluginGeneratedSerialDescriptor.addElement("smartRoutingMenuVoList", true);
        pluginGeneratedSerialDescriptor.addElement("fromDexRouterList", true);
        pluginGeneratedSerialDescriptor.addElement("originFromDexRouterList", true);
        pluginGeneratedSerialDescriptor.addElement(TabTitleInfo.KEY_BRIDGE, true);
        pluginGeneratedSerialDescriptor.addElement("toDexRouterToList", true);
        pluginGeneratedSerialDescriptor.addElement("receiveAmount", true);
        pluginGeneratedSerialDescriptor.addElement("totalFee", true);
        pluginGeneratedSerialDescriptor.addElement("crossChainFee", true);
        pluginGeneratedSerialDescriptor.addElement("toSwapFee", true);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("estimateTokenFee", true);
        pluginGeneratedSerialDescriptor.addElement("realSlippage", true);
        pluginGeneratedSerialDescriptor.addElement("networkFeeOfNativeToken", true);
        pluginGeneratedSerialDescriptor.addElement("autoSlippageInfo", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("fromSwapToTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("toSwapFromTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedTime", true);
        pluginGeneratedSerialDescriptor.addElement("needApprove", true);
        pluginGeneratedSerialDescriptor.addElement("localSelected", true);
        pluginGeneratedSerialDescriptor.addElement("bestPriceRouterSave", true);
        pluginGeneratedSerialDescriptor.addElement("toSwapServiceFee", true);
        pluginGeneratedSerialDescriptor.addElement("toSwapServiceFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("valueDiffInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PathSelectionRouterItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(kSerializerArr[9]), BuiltinSerializersKt.getNullable(DexQuoteBridgeVO$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[11]), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(DexAutoSlippageInfoParam$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(ValueDiffInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PathSelectionRouterItem deserialize(@NotNull Decoder decoder) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
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
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z;
        ValueDiffInfo valueDiffInfo;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        DexQuoteBridgeVO dexQuoteBridgeVO;
        ArrayList arrayList4;
        int i;
        ArrayList arrayList5;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PathSelectionRouterItem.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            ArrayList arrayList6 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            ArrayList arrayList7 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            ArrayList arrayList8 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            DexQuoteBridgeVO dexQuoteBridgeVO2 = (DexQuoteBridgeVO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DexQuoteBridgeVO$$serializer.INSTANCE, null);
            ArrayList arrayList9 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam2 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, DexAutoSlippageInfoParam$$serializer.INSTANCE, null);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 27);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            valueDiffInfo = (ValueDiffInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, ValueDiffInfo$$serializer.INSTANCE, null);
            str18 = strDecodeStringElement18;
            dexQuoteBridgeVO = dexQuoteBridgeVO2;
            str2 = strDecodeStringElement16;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean3;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
            str22 = strDecodeStringElement19;
            z = zDecodeBooleanElement;
            str19 = strDecodeStringElement20;
            str = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str20 = strDecodeStringElement17;
            str8 = strDecodeStringElement9;
            str15 = strDecodeStringElement8;
            str13 = strDecodeStringElement15;
            str12 = strDecodeStringElement14;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement12;
            str21 = strDecodeStringElement11;
            str7 = strDecodeStringElement10;
            arrayList4 = arrayList9;
            str11 = strDecodeStringElement;
            str16 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            arrayList3 = arrayList6;
            str17 = strDecodeStringElement2;
            arrayList2 = arrayList7;
            str14 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam2;
            arrayList = arrayList8;
            i = -1;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            ArrayList arrayList10 = null;
            ArrayList arrayList11 = null;
            ValueDiffInfo valueDiffInfo2 = null;
            ArrayList arrayList12 = null;
            DexAutoSlippageInfoParam dexAutoSlippageInfoParam3 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            ArrayList arrayList13 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String str23 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String str24 = null;
            DexQuoteBridgeVO dexQuoteBridgeVO3 = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        arrayList5 = arrayList13;
                        Unit unit = Unit.INSTANCE;
                        z2 = false;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 0:
                        arrayList5 = arrayList13;
                        String strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str23 = strDecodeStringElement43;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 1:
                        arrayList5 = arrayList13;
                        String strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        str24 = strDecodeStringElement44;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 2:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 3:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 4:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 5:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 6:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        Unit unit8 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 7:
                        arrayList13 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], arrayList13);
                        int i7 = i6 | 128;
                        Unit unit9 = Unit.INSTANCE;
                        i6 = i7;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 8:
                        arrayList11 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], arrayList11);
                        i6 |= 256;
                        Unit unit10 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 9:
                        int i8 = i5;
                        arrayList10 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, kSerializerArr[i8], arrayList10);
                        i2 = i6 | 512;
                        Unit unit11 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 10:
                        dexQuoteBridgeVO3 = (DexQuoteBridgeVO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, DexQuoteBridgeVO$$serializer.INSTANCE, dexQuoteBridgeVO3);
                        i6 |= 1024;
                        Unit unit102 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 11:
                        arrayList12 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], arrayList12);
                        i6 |= 2048;
                        Unit unit1022 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 12:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 |= 4096;
                        Unit unit12 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 13:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        Unit unit13 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 14:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        Unit unit14 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 15:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i6 |= 32768;
                        Unit unit15 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 16:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 |= 65536;
                        Unit unit16 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 17:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i6 |= 131072;
                        Unit unit17 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 18:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i6 |= 262144;
                        Unit unit18 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 19:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 |= 524288;
                        Unit unit19 = Unit.INSTANCE;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 20:
                        dexAutoSlippageInfoParam3 = (DexAutoSlippageInfoParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, DexAutoSlippageInfoParam$$serializer.INSTANCE, dexAutoSlippageInfoParam3);
                        i3 = 1048576;
                        i2 = i3 | i6;
                        Unit unit112 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 21:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i2 = i3 | i6;
                        Unit unit1122 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 22:
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        i3 = 4194304;
                        i2 = i3 | i6;
                        Unit unit11222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 23:
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        i3 = 8388608;
                        i2 = i3 | i6;
                        Unit unit112222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 24:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i2 = i3 | i6;
                        Unit unit1122222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 25:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i2 = i3 | i6;
                        Unit unit11222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 26:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        i2 = i3 | i6;
                        Unit unit112222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 27:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 27);
                        i2 = 134217728 | i6;
                        Unit unit1122222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 28:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        i2 = i3 | i6;
                        Unit unit11222222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 29:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        i2 = i3 | i6;
                        Unit unit112222222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 30:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        i2 = i3 | i6;
                        Unit unit1122222222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    case 31:
                        valueDiffInfo2 = (ValueDiffInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 31, ValueDiffInfo$$serializer.INSTANCE, valueDiffInfo2);
                        i3 = Integer.MIN_VALUE;
                        i2 = i3 | i6;
                        Unit unit11222222222222 = Unit.INSTANCE;
                        i6 = i2;
                        arrayList5 = arrayList13;
                        arrayList13 = arrayList5;
                        i5 = 9;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            arrayList = arrayList10;
            arrayList2 = arrayList11;
            arrayList3 = arrayList13;
            dexAutoSlippageInfoParam = dexAutoSlippageInfoParam3;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean6;
            str = strDecodeStringElement25;
            str2 = strDecodeStringElement27;
            str3 = strDecodeStringElement28;
            str4 = strDecodeStringElement29;
            str5 = strDecodeStringElement30;
            str6 = strDecodeStringElement31;
            str7 = strDecodeStringElement33;
            str8 = strDecodeStringElement34;
            str9 = strDecodeStringElement35;
            str10 = strDecodeStringElement36;
            str11 = str23;
            str12 = strDecodeStringElement37;
            str13 = strDecodeStringElement39;
            str14 = strDecodeStringElement40;
            str15 = strDecodeStringElement41;
            str16 = strDecodeStringElement42;
            str17 = str24;
            z = zDecodeBooleanElement2;
            valueDiffInfo = valueDiffInfo2;
            str18 = strDecodeStringElement23;
            str19 = strDecodeStringElement24;
            str20 = strDecodeStringElement26;
            str21 = strDecodeStringElement32;
            str22 = strDecodeStringElement38;
            dexQuoteBridgeVO = dexQuoteBridgeVO3;
            arrayList4 = arrayList12;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PathSelectionRouterItem(i, 0, str11, str17, str10, str16, str3, str9, str14, arrayList3, arrayList2, arrayList, dexQuoteBridgeVO, arrayList4, str15, str8, str7, str21, str6, str5, str12, str13, dexAutoSlippageInfoParam, str2, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str20, str18, str22, z, str19, str, str4, valueDiffInfo, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PathSelectionRouterItem pathSelectionRouterItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pathSelectionRouterItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PathSelectionRouterItem.write$Self$OKDex_dex_impl(pathSelectionRouterItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
