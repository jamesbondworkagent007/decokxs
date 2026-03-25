package com.okinc.business.invest_biz.data.models;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestTokenWithAmount$$serializer implements GeneratedSerializer<InvestTokenWithAmount> {
    public static final int $stable;
    public static final InvestTokenWithAmount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestTokenWithAmount$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = new InvestTokenWithAmount$$serializer();
        INSTANCE = investTokenWithAmount$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.models.InvestTokenWithAmount", investTokenWithAmount$$serializer, 28);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("depositTips", true);
        pluginGeneratedSerialDescriptor.addElement("isBaseToken", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("browserUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("isCanClaim", true);
        pluginGeneratedSerialDescriptor.addElement("buttonType", true);
        pluginGeneratedSerialDescriptor.addElement("expectTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("transferableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("dataType", true);
        pluginGeneratedSerialDescriptor.addElement("availableClaimTime", true);
        pluginGeneratedSerialDescriptor.addElement("collectionDeadLine", true);
        pluginGeneratedSerialDescriptor.addElement("availableClaimType", true);
        pluginGeneratedSerialDescriptor.addElement("minInvestAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInvestmentId", true);
        pluginGeneratedSerialDescriptor.addElement("productType", true);
        pluginGeneratedSerialDescriptor.addElement("rangeMinCoinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("safeMinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("safeMaxAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestTokenWithAmount.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), kSerializerArr[14], BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, kSerializerArr[17], BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestTokenWithAmount deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        InvestTokenType investTokenType;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Long l;
        Long l2;
        String str16;
        int i;
        Long l3;
        String str17;
        boolean z;
        int i2;
        boolean z2;
        Integer num;
        ButtonType buttonType;
        long j;
        KSerializer[] kSerializerArr;
        Integer num2;
        int i3;
        Integer num3;
        int i4;
        Integer num4;
        KSerializer[] kSerializerArr2;
        Integer num5;
        Integer num6;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InvestTokenWithAmount.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            ButtonType buttonType2 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr3[14], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            InvestTokenType investTokenType2 = (InvestTokenType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr3[17], null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, longSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, longSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, null);
            str17 = str19;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            i2 = iDecodeIntElement;
            str9 = strDecodeStringElement13;
            str13 = strDecodeStringElement4;
            l2 = l6;
            str16 = str20;
            str2 = str21;
            l = l5;
            str11 = strDecodeStringElement7;
            str8 = strDecodeStringElement12;
            i = 268435455;
            l3 = l4;
            str12 = strDecodeStringElement5;
            z = zDecodeBooleanElement2;
            str4 = strDecodeStringElement8;
            str15 = strDecodeStringElement2;
            str7 = strDecodeStringElement11;
            z2 = zDecodeBooleanElement;
            str6 = strDecodeStringElement10;
            str5 = strDecodeStringElement9;
            j = jDecodeLongElement;
            str3 = str18;
            buttonType = buttonType2;
            str10 = strDecodeStringElement6;
            num = num7;
            str14 = strDecodeStringElement3;
            investTokenType = investTokenType2;
        } else {
            Long l7 = null;
            String str22 = null;
            String str23 = null;
            InvestTokenType investTokenType3 = null;
            ButtonType buttonType3 = null;
            String str24 = null;
            Integer num8 = null;
            Long l8 = null;
            String str25 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
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
            boolean z3 = true;
            int i6 = 0;
            long jDecodeLongElement2 = 0;
            Long l9 = null;
            boolean z4 = false;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement2 = 0;
            String str26 = null;
            while (true) {
                boolean zDecodeBooleanElement4 = z4;
                if (z3) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            kSerializerArr2 = kSerializerArr3;
                            num5 = num8;
                            z3 = false;
                            num8 = num5;
                            kSerializerArr3 = kSerializerArr2;
                            z4 = zDecodeBooleanElement4;
                            break;
                        case 0:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                            i3 = i6 | 1;
                            int i7 = i3;
                            num3 = num2;
                            i4 = i7;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 1:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i3 = i6 | 2;
                            int i72 = i3;
                            num3 = num2;
                            i4 = i72;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 2:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i3 = i6 | 4;
                            int i722 = i3;
                            num3 = num2;
                            i4 = i722;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 3:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            i3 = i6 | 8;
                            zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                            int i7222 = i3;
                            num3 = num2;
                            i4 = i7222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 4:
                            kSerializerArr2 = kSerializerArr3;
                            num5 = num8;
                            zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                            i6 |= 16;
                            num8 = num5;
                            kSerializerArr3 = kSerializerArr2;
                            z4 = zDecodeBooleanElement4;
                            break;
                        case 5:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i3 = i6 | 32;
                            int i72222 = i3;
                            num3 = num2;
                            i4 = i72222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 6:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                            i3 = i6 | 64;
                            int i722222 = i3;
                            num3 = num2;
                            i4 = i722222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 7:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                            i3 = i6 | 128;
                            int i7222222 = i3;
                            num3 = num2;
                            i4 = i7222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 8:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                            i3 = i6 | 256;
                            int i72222222 = i3;
                            num3 = num2;
                            i4 = i72222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 9:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                            i3 = i6 | 512;
                            int i722222222 = i3;
                            num3 = num2;
                            i4 = i722222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 10:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                            i3 = i6 | 1024;
                            int i7222222222 = i3;
                            num3 = num2;
                            i4 = i7222222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 11:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                            i3 = i6 | 2048;
                            int i72222222222 = i3;
                            num3 = num2;
                            i4 = i72222222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 12:
                            kSerializerArr = kSerializerArr3;
                            num2 = num8;
                            strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                            i3 = i6 | 4096;
                            int i722222222222 = i3;
                            num3 = num2;
                            i4 = i722222222222;
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 13:
                            kSerializerArr = kSerializerArr3;
                            i4 = i6 | 8192;
                            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num8);
                            num4 = num3;
                            i6 = i4;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        case 14:
                            num6 = num8;
                            buttonType3 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr3[14], buttonType3);
                            i6 |= 16384;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 15:
                            num6 = num8;
                            str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str24);
                            i5 = 32768;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 16:
                            num6 = num8;
                            i6 |= 65536;
                            strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 17:
                            num6 = num8;
                            investTokenType3 = (InvestTokenType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr3[17], investTokenType3);
                            i5 = 131072;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 18:
                            num6 = num8;
                            l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.INSTANCE, l8);
                            i5 = 262144;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 19:
                            num6 = num8;
                            l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, LongSerializer.INSTANCE, l7);
                            i5 = 524288;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 20:
                            num6 = num8;
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 20);
                            i5 = 1048576;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 21:
                            num6 = num8;
                            strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                            i5 = 2097152;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 22:
                            num6 = num8;
                            l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, LongSerializer.INSTANCE, l9);
                            i5 = 4194304;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 23:
                            num6 = num8;
                            str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str25);
                            i5 = 8388608;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 24:
                            num6 = num8;
                            str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, str26);
                            i5 = 16777216;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 25:
                            num6 = num8;
                            str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, str23);
                            i5 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 26:
                            num6 = num8;
                            str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str22);
                            i5 = 67108864;
                            i6 = i5 | i6;
                            z4 = zDecodeBooleanElement4;
                            num8 = num6;
                            break;
                        case 27:
                            i6 |= 134217728;
                            kSerializerArr = kSerializerArr3;
                            strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                            num4 = num8;
                            z4 = zDecodeBooleanElement4;
                            kSerializerArr3 = kSerializerArr;
                            num8 = num4;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    Integer num9 = num8;
                    str = str22;
                    str2 = str23;
                    investTokenType = investTokenType3;
                    str3 = str24;
                    str4 = strDecodeStringElement14;
                    str5 = strDecodeStringElement15;
                    str6 = strDecodeStringElement16;
                    str7 = strDecodeStringElement17;
                    str8 = strDecodeStringElement18;
                    str9 = strDecodeStringElement19;
                    strDecodeStringElement = strDecodeStringElement20;
                    str10 = strDecodeStringElement21;
                    str11 = strDecodeStringElement22;
                    str12 = strDecodeStringElement23;
                    str13 = strDecodeStringElement24;
                    str14 = strDecodeStringElement25;
                    str15 = strDecodeStringElement26;
                    l = l7;
                    l2 = l9;
                    str16 = str26;
                    i = i6;
                    l3 = l8;
                    str17 = str25;
                    z = zDecodeBooleanElement3;
                    i2 = iDecodeIntElement2;
                    z2 = zDecodeBooleanElement4;
                    num = num9;
                    buttonType = buttonType3;
                    j = jDecodeLongElement2;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestTokenWithAmount(i, j, str15, str14, z2, z, str13, str12, str10, str11, str4, str5, str6, str7, num, buttonType, str3, str8, investTokenType, l3, l, i2, str9, l2, str17, str16, str2, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestTokenWithAmount.write$Self$OKDeFi_invest_biz(investTokenWithAmount, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
