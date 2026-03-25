package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Unit;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefiBridgeOrderInfo$$serializer implements GeneratedSerializer<DefiBridgeOrderInfo> {
    public static final int $stable;
    public static final DefiBridgeOrderInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DefiBridgeOrderInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DefiBridgeOrderInfo$$serializer defiBridgeOrderInfo$$serializer = new DefiBridgeOrderInfo$$serializer();
        INSTANCE = defiBridgeOrderInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo", defiBridgeOrderInfo$$serializer, 34);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformInfo", true);
        pluginGeneratedSerialDescriptor.addElement("exploreUrl", true);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("fromChainName", true);
        pluginGeneratedSerialDescriptor.addElement("fromIcon", true);
        pluginGeneratedSerialDescriptor.addElement("toIcon", true);
        pluginGeneratedSerialDescriptor.addElement("toChainName", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement(CrashHianalyticsData.TIME, true);
        pluginGeneratedSerialDescriptor.addElement("toAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("transactionHash", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("swapTradeType", true);
        pluginGeneratedSerialDescriptor.addElement("toChainId", true);
        pluginGeneratedSerialDescriptor.addElement("toChainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("formatTime", true);
        pluginGeneratedSerialDescriptor.addElement("showLine", true);
        pluginGeneratedSerialDescriptor.addElement("anyTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("replaceTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedTime", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedSecond", true);
        pluginGeneratedSerialDescriptor.addElement("extendStatus", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUp", true);
        pluginGeneratedSerialDescriptor.addElement("isShowCancel", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUpCancel", true);
        pluginGeneratedSerialDescriptor.addElement("speedUpTxHash", true);
        pluginGeneratedSerialDescriptor.addElement("txId", true);
        pluginGeneratedSerialDescriptor.addElement("specialOrderType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, DefiPlatformInfos$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DefiBridgeOrderInfo deserialize(@NotNull Decoder decoder) {
        int i;
        DefiPlatformInfos defiPlatformInfos;
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
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String strDecodeStringElement;
        String str23;
        String str24;
        String str25;
        String str26;
        long j;
        String str27;
        boolean z4;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 8;
        int i5 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DefiPlatformInfos defiPlatformInfos2 = (DefiPlatformInfos) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, DefiPlatformInfos$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 26);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            str = strDecodeStringElement14;
            str23 = strDecodeStringElement28;
            str17 = strDecodeStringElement26;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement3;
            z = zDecodeBooleanElement4;
            str16 = strDecodeStringElement27;
            str9 = strDecodeStringElement7;
            str25 = strDecodeStringElement22;
            z4 = zDecodeBooleanElement;
            str27 = strDecodeStringElement23;
            str24 = strDecodeStringElement24;
            str21 = strDecodeStringElement25;
            str11 = strDecodeStringElement4;
            str26 = strDecodeStringElement19;
            str19 = strDecodeStringElement18;
            str20 = strDecodeStringElement17;
            str15 = strDecodeStringElement16;
            str14 = strDecodeStringElement15;
            str4 = strDecodeStringElement9;
            str10 = strDecodeStringElement6;
            str3 = strDecodeStringElement11;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement8;
            str13 = strDecodeStringElement2;
            i = -1;
            defiPlatformInfos = defiPlatformInfos2;
            str12 = strDecodeStringElement3;
            str2 = strDecodeStringElement12;
            j = jDecodeLongElement;
            i2 = 3;
            str18 = strDecodeStringElement20;
            str22 = strDecodeStringElement21;
            str6 = strDecodeStringElement13;
            str5 = strDecodeStringElement5;
        } else {
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
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int i6 = 0;
            boolean z5 = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement56 = null;
            boolean zDecodeBooleanElement7 = false;
            i = 0;
            boolean zDecodeBooleanElement8 = false;
            DefiPlatformInfos defiPlatformInfos3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z5 = false;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 0:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 1:
                        DefiPlatformInfos defiPlatformInfos4 = (DefiPlatformInfos) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, DefiPlatformInfos$$serializer.INSTANCE, defiPlatformInfos3);
                        i |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        defiPlatformInfos3 = defiPlatformInfos4;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 2:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 3:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 4:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 5:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 6:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        Unit unit72 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 7:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        Unit unit722 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 8:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i |= 256;
                        Unit unit7222 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 9:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        Unit unit72222 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 10:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        Unit unit722222 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 11:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        Unit unit7222222 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 12:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        Unit unit72222222 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 13:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 14:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        Unit unit9 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 15:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i |= 32768;
                        Unit unit10 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 16:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i |= 65536;
                        Unit unit11 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 17:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        Unit unit12 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 18:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i |= 262144;
                        Unit unit13 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 19:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i |= 524288;
                        Unit unit14 = Unit.INSTANCE;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 20:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        int i7 = i3 | i;
                        Unit unit15 = Unit.INSTANCE;
                        i = i7;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 21:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        int i72 = i3 | i;
                        Unit unit152 = Unit.INSTANCE;
                        i = i72;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 22:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
                        i3 = 4194304;
                        int i722 = i3 | i;
                        Unit unit1522 = Unit.INSTANCE;
                        i = i722;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 23:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        int i7222 = i3 | i;
                        Unit unit15222 = Unit.INSTANCE;
                        i = i7222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 24:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        int i72222 = i3 | i;
                        Unit unit152222 = Unit.INSTANCE;
                        i = i72222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 25:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i722222 = i3 | i;
                        Unit unit1522222 = Unit.INSTANCE;
                        i = i722222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 26:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 26);
                        i3 = 67108864;
                        int i7222222 = i3 | i;
                        Unit unit15222222 = Unit.INSTANCE;
                        i = i7222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 27:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        int i72222222 = i3 | i;
                        Unit unit152222222 = Unit.INSTANCE;
                        i = i72222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 28:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
                        i3 = 268435456;
                        int i722222222 = i3 | i;
                        Unit unit1522222222 = Unit.INSTANCE;
                        i = i722222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 29:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
                        i3 = 536870912;
                        int i7222222222 = i3 | i;
                        Unit unit15222222222 = Unit.INSTANCE;
                        i = i7222222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 30:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        int i72222222222 = i3 | i;
                        Unit unit152222222222 = Unit.INSTANCE;
                        i = i72222222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 31:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        int i722222222222 = i3 | i;
                        Unit unit1522222222222 = Unit.INSTANCE;
                        i = i722222222222;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 32:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 32);
                        int i8 = i6 | 1;
                        Unit unit16 = Unit.INSTANCE;
                        i6 = i8;
                        i5 = 4;
                        i4 = 8;
                        break;
                    case 33:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        int i9 = i6 | 2;
                        Unit unit17 = Unit.INSTANCE;
                        i6 = i9;
                        i5 = 4;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            defiPlatformInfos = defiPlatformInfos3;
            str = strDecodeStringElement41;
            str2 = strDecodeStringElement42;
            str3 = strDecodeStringElement43;
            str4 = strDecodeStringElement44;
            str5 = strDecodeStringElement45;
            str6 = strDecodeStringElement48;
            str7 = strDecodeStringElement49;
            str8 = strDecodeStringElement50;
            str9 = strDecodeStringElement51;
            str10 = strDecodeStringElement52;
            str11 = strDecodeStringElement53;
            str12 = strDecodeStringElement54;
            str13 = strDecodeStringElement55;
            i2 = i6;
            z = zDecodeBooleanElement5;
            z2 = zDecodeBooleanElement7;
            z3 = zDecodeBooleanElement8;
            str14 = strDecodeStringElement56;
            str15 = strDecodeStringElement29;
            str16 = strDecodeStringElement30;
            str17 = strDecodeStringElement32;
            str18 = strDecodeStringElement38;
            str19 = strDecodeStringElement40;
            str20 = strDecodeStringElement47;
            str21 = strDecodeStringElement33;
            str22 = strDecodeStringElement37;
            strDecodeStringElement = strDecodeStringElement46;
            str23 = strDecodeStringElement31;
            str24 = strDecodeStringElement34;
            str25 = strDecodeStringElement36;
            str26 = strDecodeStringElement39;
            j = jDecodeLongElement2;
            str27 = strDecodeStringElement35;
            z4 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DefiBridgeOrderInfo(i, i2, str13, defiPlatformInfos, str12, str11, str5, str10, str9, str8, str4, str7, str3, str2, str6, str, str14, str15, str20, str19, str26, str18, str22, str25, z4, str27, str24, str21, j, str17, z2, z3, z, str16, str23, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DefiBridgeOrderInfo defiBridgeOrderInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(defiBridgeOrderInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DefiBridgeOrderInfo.write$Self$OKDex_dex_impl(defiBridgeOrderInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
