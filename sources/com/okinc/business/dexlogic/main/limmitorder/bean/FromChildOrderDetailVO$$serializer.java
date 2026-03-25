package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class FromChildOrderDetailVO$$serializer implements GeneratedSerializer<FromChildOrderDetailVO> {
    public static final int $stable;
    public static final FromChildOrderDetailVO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FromChildOrderDetailVO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FromChildOrderDetailVO$$serializer fromChildOrderDetailVO$$serializer = new FromChildOrderDetailVO$$serializer();
        INSTANCE = fromChildOrderDetailVO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO", fromChildOrderDetailVO$$serializer, 31);
        pluginGeneratedSerialDescriptor.addElement("childOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("exploreUrl", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenName", true);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromChainId", true);
        pluginGeneratedSerialDescriptor.addElement("fromChainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("fromChainName", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenIcon", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenIsDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("failureReason", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenName", true);
        pluginGeneratedSerialDescriptor.addElement("toAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toChainId", true);
        pluginGeneratedSerialDescriptor.addElement("toChainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("toChainName", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenIcon", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenIsDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("transactionHash", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("exchangeDirection", true);
        pluginGeneratedSerialDescriptor.addElement("triggerPrice", true);
        pluginGeneratedSerialDescriptor.addElement("triggerMarketCapacity", true);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        pluginGeneratedSerialDescriptor.addElement("sourceType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FromChildOrderDetailVO deserialize(@NotNull Decoder decoder) {
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
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z2;
        Integer num;
        Integer num2;
        Integer num3;
        String str19;
        String str20;
        String str21;
        int i;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, intSerializer, null);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, intSerializer, null);
            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, intSerializer, null);
            str26 = strDecodeStringElement25;
            str20 = strDecodeStringElement;
            num2 = num5;
            str13 = strDecodeStringElement2;
            num = num4;
            str24 = strDecodeStringElement26;
            str6 = strDecodeStringElement15;
            str = strDecodeStringElement14;
            str4 = strDecodeStringElement22;
            z = zDecodeBooleanElement2;
            str22 = strDecodeStringElement23;
            str8 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str23 = strDecodeStringElement19;
            str21 = strDecodeStringElement18;
            str5 = strDecodeStringElement17;
            str10 = strDecodeStringElement9;
            str12 = strDecodeStringElement3;
            str9 = strDecodeStringElement11;
            str14 = strDecodeStringElement10;
            str15 = strDecodeStringElement8;
            str17 = strDecodeStringElement6;
            str16 = strDecodeStringElement7;
            i = Integer.MAX_VALUE;
            str18 = strDecodeStringElement5;
            str25 = strDecodeStringElement21;
            str3 = strDecodeStringElement24;
            str19 = strDecodeStringElement20;
            str2 = strDecodeStringElement16;
            z2 = zDecodeBooleanElement;
            str11 = strDecodeStringElement4;
        } else {
            int i5 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean z3 = true;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
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
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 5;
                        break;
                    case 0:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 5;
                        break;
                    case 1:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 5;
                        break;
                    case 2:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 5;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 = 5;
                        break;
                    case 4:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 5;
                        break;
                    case 5:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 32;
                        i4 = 5;
                        break;
                    case 6:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 5;
                        break;
                    case 7:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 5;
                        break;
                    case 8:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 5;
                        break;
                    case 9:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 5;
                        break;
                    case 10:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i4 = 5;
                        break;
                    case 11:
                        i5 |= 2048;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i4 = 5;
                        break;
                    case 12:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i4 = 5;
                        break;
                    case 13:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i4 = 5;
                        break;
                    case 14:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 |= 16384;
                        i4 = 5;
                        break;
                    case 15:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 32768;
                        i5 |= i2;
                        i4 = 5;
                        break;
                    case 16:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 65536;
                        i5 |= i2;
                        i4 = 5;
                        break;
                    case 17:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i2 = 131072;
                        i5 |= i2;
                        i4 = 5;
                        break;
                    case 18:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i2 = 262144;
                        i5 |= i2;
                        i4 = 5;
                        break;
                    case 19:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i2 = 524288;
                        i5 |= i2;
                        i4 = 5;
                        break;
                    case 20:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i5 |= 1048576;
                        i4 = 5;
                        break;
                    case 21:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 22:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 23:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 24:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 25:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 26:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, num6);
                        i3 = 67108864;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 27:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 28:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 29:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, num7);
                        i3 = 536870912;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    case 30:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, num8);
                        i3 = 1073741824;
                        i5 |= i3;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            str = strDecodeStringElement27;
            str2 = strDecodeStringElement28;
            str3 = strDecodeStringElement31;
            str4 = strDecodeStringElement34;
            str5 = strDecodeStringElement37;
            str6 = strDecodeStringElement38;
            str7 = strDecodeStringElement39;
            str8 = strDecodeStringElement40;
            str9 = strDecodeStringElement41;
            str10 = strDecodeStringElement42;
            str11 = strDecodeStringElement43;
            str12 = strDecodeStringElement44;
            str13 = strDecodeStringElement45;
            str14 = strDecodeStringElement48;
            str15 = strDecodeStringElement49;
            str16 = strDecodeStringElement50;
            str17 = strDecodeStringElement51;
            str18 = strDecodeStringElement52;
            z2 = zDecodeBooleanElement3;
            num = num6;
            num2 = num7;
            num3 = num8;
            str19 = strDecodeStringElement29;
            str20 = strDecodeStringElement46;
            str21 = strDecodeStringElement47;
            i = i5;
            String str27 = strDecodeStringElement33;
            str22 = strDecodeStringElement30;
            str23 = strDecodeStringElement36;
            str24 = strDecodeStringElement32;
            str25 = strDecodeStringElement35;
            str26 = str27;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FromChildOrderDetailVO(i, str20, str13, str12, str11, str18, str17, str16, str15, str10, str14, str9, z2, str8, str7, str, str6, str2, str5, str21, str23, str19, str25, str4, z, str22, str3, num, str26, str24, num2, num3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FromChildOrderDetailVO fromChildOrderDetailVO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fromChildOrderDetailVO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FromChildOrderDetailVO.write$Self$OKDex_dex_impl(fromChildOrderDetailVO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
