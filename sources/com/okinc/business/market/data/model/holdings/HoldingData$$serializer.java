package com.okinc.business.market.data.model.holdings;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class HoldingData$$serializer implements GeneratedSerializer<HoldingData> {
    public static final int $stable;
    public static final HoldingData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HoldingData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HoldingData$$serializer holdingData$$serializer = new HoldingData$$serializer();
        INSTANCE = holdingData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.holdings.HoldingData", holdingData$$serializer, 31);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("boughtAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("boughtVolume", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("convertToNativeTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("holdAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("inWatchList", true);
        pluginGeneratedSerialDescriptor.addElement("lowLiquidity", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement(TabTitleInfo.KEY_MEME, true);
        pluginGeneratedSerialDescriptor.addElement("nativeToken", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("riskControlLevel", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        pluginGeneratedSerialDescriptor.addElement("stableCoinToken", true);
        pluginGeneratedSerialDescriptor.addElement("spotBalance", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfit", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("upnlConvertToNativeTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("isPnlSupported", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HoldingData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        Boolean bool;
        boolean z;
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
        boolean z2;
        boolean z3;
        boolean z4;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        Boolean bool2;
        String str21;
        String str22;
        String str23;
        String str24;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, booleanSerializer, null);
            i = Integer.MAX_VALUE;
            z2 = zDecodeBooleanElement4;
            str7 = strDecodeStringElement2;
            str23 = strDecodeStringElement22;
            str21 = strDecodeStringElement23;
            str13 = strDecodeStringElement24;
            str = strDecodeStringElement25;
            str17 = strDecodeStringElement26;
            bool = bool3;
            str2 = strDecodeStringElement17;
            str3 = strDecodeStringElement11;
            str10 = strDecodeStringElement7;
            str14 = strDecodeStringElement18;
            str22 = strDecodeStringElement19;
            str24 = strDecodeStringElement20;
            str15 = strDecodeStringElement15;
            str19 = strDecodeStringElement14;
            str16 = strDecodeStringElement13;
            str20 = strDecodeStringElement12;
            z = zDecodeBooleanElement;
            z3 = zDecodeBooleanElement3;
            str4 = strDecodeStringElement10;
            z4 = zDecodeBooleanElement2;
            str12 = strDecodeStringElement5;
            str9 = strDecodeStringElement8;
            str11 = strDecodeStringElement4;
            str6 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement21;
            str18 = strDecodeStringElement16;
            str8 = strDecodeStringElement9;
            str5 = strDecodeStringElement6;
        } else {
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean z5 = true;
            Boolean bool4 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            strDecodeStringElement = null;
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
            Boolean bool5 = null;
            i = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 0:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 2:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 4:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 5:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 32;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 6:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 7:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 8:
                        i |= 256;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 9:
                        i |= 512;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 10:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 11:
                        i |= 2048;
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 12:
                        i |= 4096;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 13:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 14:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 15:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 32768;
                        i |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 16:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 65536;
                        i |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 17:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i2 = 131072;
                        i |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 18:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i |= 262144;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 19:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool4);
                        i3 = 524288;
                        i = i3 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 20:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i = i3 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 21:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 22:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 23:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 24:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i4 = 16777216;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 25:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 26:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i4 = 67108864;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 27:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i4 = 134217728;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 28:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i4 = 268435456;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 29:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i4 = 536870912;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 30:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, bool5);
                        i4 = 1073741824;
                        i = i4 | i;
                        i5 = 5;
                        i6 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool4;
            z = zDecodeBooleanElement5;
            str = strDecodeStringElement32;
            str2 = strDecodeStringElement38;
            str3 = strDecodeStringElement41;
            str4 = strDecodeStringElement42;
            str5 = strDecodeStringElement43;
            str6 = strDecodeStringElement44;
            str7 = strDecodeStringElement45;
            str8 = strDecodeStringElement46;
            str9 = strDecodeStringElement47;
            str10 = strDecodeStringElement48;
            str11 = strDecodeStringElement49;
            str12 = strDecodeStringElement50;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement7;
            z4 = zDecodeBooleanElement8;
            str13 = strDecodeStringElement33;
            str14 = strDecodeStringElement30;
            str15 = strDecodeStringElement28;
            str16 = strDecodeStringElement39;
            str17 = strDecodeStringElement31;
            str18 = strDecodeStringElement29;
            str19 = strDecodeStringElement27;
            str20 = strDecodeStringElement40;
            bool2 = bool5;
            String str25 = strDecodeStringElement37;
            str21 = strDecodeStringElement34;
            str22 = str25;
            String str26 = strDecodeStringElement36;
            str23 = strDecodeStringElement35;
            str24 = str26;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HoldingData(i, str7, str6, str11, str12, str5, str10, str9, str8, z, z4, str4, z3, z2, str3, str20, str16, str19, str15, str18, bool, str2, str14, str22, str24, strDecodeStringElement, str23, str21, str13, str, str17, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HoldingData holdingData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(holdingData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HoldingData.copydefault(holdingData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
