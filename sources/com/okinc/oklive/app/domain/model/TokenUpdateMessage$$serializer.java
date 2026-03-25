package com.okinc.oklive.app.domain.model;

import com.okinc.oklive.app.domain.model.TokenUpdateMessage;
import java.util.List;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class TokenUpdateMessage$$serializer implements GeneratedSerializer<TokenUpdateMessage> {
    public static final int $stable;
    public static final TokenUpdateMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenUpdateMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenUpdateMessage$$serializer tokenUpdateMessage$$serializer = new TokenUpdateMessage$$serializer();
        INSTANCE = tokenUpdateMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.oklive.app.domain.model.TokenUpdateMessage", tokenUpdateMessage$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("tokenType", false);
        pluginGeneratedSerialDescriptor.addElement("cefiToken", true);
        pluginGeneratedSerialDescriptor.addElement("cedefiToken", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("isDexListed", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("icons", true);
        pluginGeneratedSerialDescriptor.addElement("currentPrice", true);
        pluginGeneratedSerialDescriptor.addElement("change1h", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TokenUpdateMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(TokenUpdateMessage$CefiToken$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TokenUpdateMessage$CedefiToken$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenUpdateMessage deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        TokenUpdateMessage.CedefiToken cedefiToken;
        String str5;
        TokenUpdateMessage.CefiToken cefiToken;
        int i;
        String str6;
        Boolean bool;
        String str7;
        int i2;
        KSerializer[] kSerializerArr;
        TokenUpdateMessage.CefiToken cefiToken2;
        Boolean bool2;
        String str8;
        TokenUpdateMessage.CedefiToken cedefiToken2;
        Boolean bool3;
        String str9;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TokenUpdateMessage.$childSerializers;
        int i4 = 9;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            TokenUpdateMessage.CefiToken cefiToken3 = (TokenUpdateMessage.CefiToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TokenUpdateMessage$CefiToken$$serializer.INSTANCE, null);
            cedefiToken = (TokenUpdateMessage.CedefiToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TokenUpdateMessage$CedefiToken$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            list = list2;
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            bool = bool4;
            str2 = str14;
            str7 = str13;
            str5 = str12;
            str3 = str15;
            i2 = 4095;
            str6 = str11;
            cefiToken = cefiToken3;
            str = str10;
            i = iDecodeIntElement;
        } else {
            int i6 = 11;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            List list3 = null;
            String str19 = null;
            TokenUpdateMessage.CefiToken cefiToken4 = null;
            Boolean bool5 = null;
            String str20 = null;
            TokenUpdateMessage.CedefiToken cedefiToken3 = null;
            int i7 = 0;
            boolean z = true;
            String str21 = null;
            int iDecodeIntElement2 = 0;
            str = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        cefiToken2 = cefiToken4;
                        bool2 = bool5;
                        str8 = str20;
                        cedefiToken2 = cedefiToken3;
                        z = false;
                        cefiToken4 = cefiToken2;
                        bool5 = bool2;
                        cedefiToken3 = cedefiToken2;
                        str20 = str8;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        cefiToken2 = cefiToken4;
                        bool2 = bool5;
                        str8 = str20;
                        cedefiToken2 = cedefiToken3;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i7 |= 1;
                        cefiToken4 = cefiToken2;
                        bool5 = bool2;
                        cedefiToken3 = cedefiToken2;
                        str20 = str8;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str8 = str20;
                        cefiToken4 = (TokenUpdateMessage.CefiToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TokenUpdateMessage$CefiToken$$serializer.INSTANCE, cefiToken4);
                        i7 |= 2;
                        str20 = str8;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 2:
                        bool3 = bool5;
                        str9 = str20;
                        kSerializerArr = kSerializerArr2;
                        i7 |= 4;
                        cedefiToken3 = (TokenUpdateMessage.CedefiToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TokenUpdateMessage$CedefiToken$$serializer.INSTANCE, cedefiToken3);
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 3:
                        bool3 = bool5;
                        str9 = str20;
                        i7 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 4:
                        bool3 = bool5;
                        str9 = str20;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i3 = i7 | 16;
                        kSerializerArr = kSerializerArr2;
                        i7 = i3;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 5:
                        str9 = str20;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool5);
                        i3 = i7 | 32;
                        kSerializerArr = kSerializerArr2;
                        i7 = i3;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str20);
                        kSerializerArr = kSerializerArr2;
                        i7 |= 64;
                        bool3 = bool5;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str17);
                        bool3 = bool5;
                        str9 = str20;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], list3);
                        bool3 = bool5;
                        str9 = str20;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str18);
                        bool3 = bool5;
                        str9 = str20;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str19);
                        bool3 = bool5;
                        str9 = str20;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str21);
                        bool3 = bool5;
                        str9 = str20;
                        str20 = str9;
                        bool5 = bool3;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            TokenUpdateMessage.CefiToken cefiToken5 = cefiToken4;
            str2 = str18;
            list = list3;
            str3 = str19;
            str4 = str21;
            cedefiToken = cedefiToken3;
            str5 = str20;
            cefiToken = cefiToken5;
            i = iDecodeIntElement2;
            str6 = str16;
            bool = bool5;
            str7 = str17;
            i2 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenUpdateMessage(i2, i, cefiToken, cedefiToken, str, str6, bool, str5, str7, list, str2, str3, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenUpdateMessage tokenUpdateMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenUpdateMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenUpdateMessage.write$Self$OKLive_oklive_impl(tokenUpdateMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
