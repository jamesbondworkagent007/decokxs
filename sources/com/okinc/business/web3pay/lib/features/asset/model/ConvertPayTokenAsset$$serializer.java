package com.okinc.business.web3pay.lib.features.asset.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ConvertPayTokenAsset$$serializer implements GeneratedSerializer<ConvertPayTokenAsset> {
    public static final int $stable;
    public static final ConvertPayTokenAsset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertPayTokenAsset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertPayTokenAsset$$serializer convertPayTokenAsset$$serializer = new ConvertPayTokenAsset$$serializer();
        INSTANCE = convertPayTokenAsset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.asset.model.ConvertPayTokenAsset", convertPayTokenAsset$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbolTicker", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbolTicker", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenName", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("toMasterCurrencyId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertPayTokenAsset deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
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
        String str10;
        String strDecodeStringElement;
        String str11;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            iDecodeIntElement = iDecodeIntElement3;
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            i = 65535;
            str8 = strDecodeStringElement11;
            str10 = strDecodeStringElement10;
            str = strDecodeStringElement9;
            str6 = strDecodeStringElement8;
            str9 = strDecodeStringElement7;
            str13 = strDecodeStringElement6;
            str11 = strDecodeStringElement5;
            str4 = str14;
            str7 = strDecodeStringElement4;
            str12 = strDecodeStringElement12;
            str3 = strDecodeStringElement2;
            str2 = strDecodeStringElement3;
            i2 = iDecodeIntElement2;
        } else {
            int i3 = 15;
            boolean z = true;
            int i4 = 0;
            iDecodeIntElement = 0;
            String str15 = null;
            String strDecodeStringElement13 = null;
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
            String str16 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 15;
                        break;
                    case 0:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 15;
                        break;
                    case 1:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 15;
                        break;
                    case 2:
                        i4 |= 4;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i3 = 15;
                        break;
                    case 3:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 15;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 = 15;
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = 15;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = 15;
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = 15;
                        break;
                    case 8:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str15);
                        i4 |= 256;
                        i3 = 15;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = 15;
                        break;
                    case 10:
                        i4 |= 1024;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = 15;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 15;
                        break;
                    case 12:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 15;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 15;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 15;
                        break;
                    case 15:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        i4 |= 32768;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            i2 = iDecodeIntElement4;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement23;
            str3 = strDecodeStringElement24;
            str4 = str15;
            str5 = str16;
            String str17 = strDecodeStringElement17;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement19;
            str10 = str17;
            String str18 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement14;
            str11 = str18;
            String str19 = strDecodeStringElement21;
            str12 = strDecodeStringElement15;
            str13 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertPayTokenAsset(i, str3, str2, i2, str7, str11, str13, str9, str6, str4, str, str10, str8, iDecodeIntElement, str12, strDecodeStringElement, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertPayTokenAsset convertPayTokenAsset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(convertPayTokenAsset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertPayTokenAsset.write$Self$OKPayCore_web3pay_lib(convertPayTokenAsset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
