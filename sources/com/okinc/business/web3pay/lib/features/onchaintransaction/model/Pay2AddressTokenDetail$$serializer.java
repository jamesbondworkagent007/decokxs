package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class Pay2AddressTokenDetail$$serializer implements GeneratedSerializer<Pay2AddressTokenDetail> {
    public static final int $stable;
    public static final Pay2AddressTokenDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Pay2AddressTokenDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Pay2AddressTokenDetail$$serializer pay2AddressTokenDetail$$serializer = new Pay2AddressTokenDetail$$serializer();
        INSTANCE = pay2AddressTokenDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.onchaintransaction.model.Pay2AddressTokenDetail", pay2AddressTokenDetail$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbolTicker", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenCoinTypeNo", true);
        pluginGeneratedSerialDescriptor.addElement("cefiAllowed", true);
        pluginGeneratedSerialDescriptor.addElement("minTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("maxTokenAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Pay2AddressTokenDetail deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Boolean bool;
        String str11;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            bool = bool2;
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str5 = str14;
            str7 = strDecodeStringElement11;
            str6 = str13;
            str9 = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement8;
            str3 = strDecodeStringElement6;
            str2 = strDecodeStringElement10;
            str = str15;
            str8 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            i = 32767;
            strDecodeStringElement = strDecodeStringElement7;
            i2 = iDecodeIntElement;
            str11 = strDecodeStringElement3;
        } else {
            int i5 = 14;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            String str16 = null;
            String str17 = null;
            Boolean bool3 = null;
            String str18 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 14;
                        break;
                    case 0:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 14;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 14;
                        break;
                    case 2:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 14;
                        break;
                    case 3:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 14;
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 14;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 14;
                        break;
                    case 6:
                        i6 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 = 14;
                        break;
                    case 7:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = i6 | 128;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = i6 | 256;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 9:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str18);
                        i3 = i6 | 512;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 10:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = i6 | 1024;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 11:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str17);
                        i3 = i6 | 2048;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 12:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool3);
                        i3 = i6 | 4096;
                        i6 = i3;
                        i5 = 14;
                        break;
                    case 13:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str12);
                        i4 = i6 | 8192;
                        i6 = i4;
                        i5 = 14;
                        break;
                    case 14:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str16);
                        i4 = i6 | 16384;
                        i6 = i4;
                        i5 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            i = i6;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement15;
            i2 = iDecodeIntElement2;
            str5 = str17;
            str6 = str18;
            str7 = strDecodeStringElement12;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement17;
            str10 = str16;
            bool = bool3;
            str11 = strDecodeStringElement18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Pay2AddressTokenDetail(i, str11, str8, str4, str3, i2, strDecodeStringElement, strDecodeStringElement2, str9, str2, str6, str7, str5, bool, str, str10, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Pay2AddressTokenDetail pay2AddressTokenDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pay2AddressTokenDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Pay2AddressTokenDetail.write$Self$OKPayCore_web3pay_lib(pay2AddressTokenDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
