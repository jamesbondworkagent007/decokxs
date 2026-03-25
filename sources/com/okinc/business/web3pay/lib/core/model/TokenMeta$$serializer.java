package com.okinc.business.web3pay.lib.core.model;

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
public final /* synthetic */ class TokenMeta$$serializer implements GeneratedSerializer<TokenMeta> {
    public static final int $stable;
    public static final TokenMeta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenMeta$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenMeta$$serializer tokenMeta$$serializer = new TokenMeta$$serializer();
        INSTANCE = tokenMeta$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.core.model.TokenMeta", tokenMeta$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("pay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenMeta deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        String str;
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
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            i = 8191;
            str8 = strDecodeStringElement3;
            str = str11;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str2 = strDecodeStringElement11;
            str5 = strDecodeStringElement10;
            str7 = strDecodeStringElement9;
            str6 = strDecodeStringElement8;
            str3 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
            i2 = iDecodeIntElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            str10 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
        } else {
            int i4 = 12;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z = true;
            i = 0;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 12;
                        break;
                    case 0:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i4 = 12;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i4 = 12;
                        break;
                    case 2:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i |= 16;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str12);
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = i | 64;
                        i = i3;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i3 = i | 256;
                        i = i3;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        break;
                    case 12:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i3 = i | 4096;
                        i = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement16;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = str12;
            str2 = strDecodeStringElement17;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement20;
            i2 = iDecodeIntElement2;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement2;
            String str13 = strDecodeStringElement19;
            str7 = strDecodeStringElement12;
            str8 = strDecodeStringElement15;
            str9 = strDecodeStringElement14;
            str10 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenMeta(i, str8, str4, str10, str9, str, str3, str6, str7, i2, str5, str2, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenMeta tokenMeta) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenMeta, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenMeta.write$Self$OKPayCore_web3pay_lib(tokenMeta, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
