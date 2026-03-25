package com.okinc.business.dex.trade.copytrading.edit.data.model;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TokenFilter$$serializer implements GeneratedSerializer<TokenFilter> {
    public static final int $stable;
    public static final TokenFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenFilter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenFilter$$serializer tokenFilter$$serializer = new TokenFilter$$serializer();
        INSTANCE = tokenFilter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter", tokenFilter$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("minMc", true);
        pluginGeneratedSerialDescriptor.addElement("maxMc", true);
        pluginGeneratedSerialDescriptor.addElement("minAge", true);
        pluginGeneratedSerialDescriptor.addElement("maxAge", true);
        pluginGeneratedSerialDescriptor.addElement("minLiquidity", true);
        pluginGeneratedSerialDescriptor.addElement("maxLiquidity", true);
        pluginGeneratedSerialDescriptor.addElement("threshold", true);
        pluginGeneratedSerialDescriptor.addElement("maxThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("blackCoinList", true);
        pluginGeneratedSerialDescriptor.addElement("minMcUnit", true);
        pluginGeneratedSerialDescriptor.addElement("maxMcUnit", true);
        pluginGeneratedSerialDescriptor.addElement("maxAgeUnit", true);
        pluginGeneratedSerialDescriptor.addElement("minAgeUnit", true);
        pluginGeneratedSerialDescriptor.addElement("minLiquidityUnit", true);
        pluginGeneratedSerialDescriptor.addElement("maxLiquidityUnit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TokenFilter.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[8], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenFilter deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list;
        String str10;
        String str11;
        String str12;
        String strDecodeStringElement;
        String str13;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TokenFilter.$childSerializers;
        int i2 = 8;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            list = list2;
            str10 = strDecodeStringElement9;
            str3 = strDecodeStringElement4;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str11 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str7 = strDecodeStringElement12;
            str = str15;
            str2 = str14;
            str8 = strDecodeStringElement8;
            str9 = strDecodeStringElement6;
            str13 = strDecodeStringElement7;
            str6 = strDecodeStringElement13;
            str12 = strDecodeStringElement5;
            i = 32767;
            str5 = strDecodeStringElement3;
        } else {
            int i3 = 14;
            int i4 = 0;
            boolean z = true;
            List list3 = null;
            String str16 = null;
            String str17 = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 4;
                        z = false;
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 0:
                        c = 4;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 1:
                        c = 4;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 2:
                        c = 4;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 3:
                        c = 4;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 4:
                        c = 4;
                        i4 |= 16;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 8;
                        i3 = 14;
                        break;
                    case 5:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 14;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str17);
                        i4 |= 64;
                        i3 = 14;
                        break;
                    case 7:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str16);
                        i4 |= 128;
                        i3 = 14;
                        break;
                    case 8:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, kSerializerArr[i2], list3);
                        i4 |= 256;
                        i3 = 14;
                        break;
                    case 9:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        i3 = 14;
                        break;
                    case 10:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i4 |= 1024;
                        i3 = 14;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i3 = 14;
                        break;
                    case 12:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 14;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 14;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            i = i4;
            str2 = str17;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement17;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement19;
            list = list3;
            str10 = strDecodeStringElement2;
            String str18 = strDecodeStringElement20;
            str11 = strDecodeStringElement14;
            str12 = str18;
            String str19 = strDecodeStringElement24;
            strDecodeStringElement = strDecodeStringElement16;
            str13 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenFilter(i, str5, str3, str12, str9, str13, str8, str2, str, list, str10, str11, str4, str7, str6, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenFilter.write$Self$OKDex_dex_impl(tokenFilter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
