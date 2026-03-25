package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TickersData$$serializer implements GeneratedSerializer<TickersData> {
    public static final int $stable;
    public static final TickersData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TickersData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TickersData$$serializer tickersData$$serializer = new TickersData$$serializer();
        INSTANCE = tickersData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.TickersData", tickersData$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("lastSz", true);
        pluginGeneratedSerialDescriptor.addElement("askPx", true);
        pluginGeneratedSerialDescriptor.addElement("askSz", true);
        pluginGeneratedSerialDescriptor.addElement("bidPx", true);
        pluginGeneratedSerialDescriptor.addElement("bidSz", true);
        pluginGeneratedSerialDescriptor.addElement("open24h", true);
        pluginGeneratedSerialDescriptor.addElement("sodUtc0", true);
        pluginGeneratedSerialDescriptor.addElement("sodUtc8", true);
        pluginGeneratedSerialDescriptor.addElement("high24h", true);
        pluginGeneratedSerialDescriptor.addElement("low24h", true);
        pluginGeneratedSerialDescriptor.addElement("volCcy24h", true);
        pluginGeneratedSerialDescriptor.addElement("vol24h", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("ts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TickersData deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement2;
        String str10;
        String str11;
        String str12;
        String str13;
        String strDecodeStringElement3;
        String str14;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            str14 = str18;
            str10 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement11;
            str11 = strDecodeStringElement10;
            str3 = strDecodeStringElement9;
            str12 = str17;
            str13 = str16;
            str2 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement15;
            str7 = strDecodeStringElement5;
            str5 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str6 = strDecodeStringElement6;
            str = str15;
            i = 131071;
        } else {
            int i3 = 16;
            i = 0;
            boolean z = true;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 0:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 1:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 2:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 3:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 4:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        i |= 16;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 5:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str22);
                        i |= 32;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 6:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str21);
                        i |= 64;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 7:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str19);
                        i |= 128;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 8:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 9:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 10:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 11:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i |= 2048;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 12:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 14:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 16;
                        i2 = 11;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 16;
                        i2 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str20;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            str6 = strDecodeStringElement24;
            str7 = strDecodeStringElement26;
            str8 = strDecodeStringElement4;
            str9 = strDecodeStringElement16;
            strDecodeStringElement2 = strDecodeStringElement17;
            str10 = strDecodeStringElement20;
            str11 = strDecodeStringElement25;
            str12 = str21;
            str13 = str22;
            strDecodeStringElement3 = strDecodeStringElement18;
            str14 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TickersData(i, str7, str6, str5, str4, str, str13, str12, str14, str3, str11, strDecodeStringElement, str10, str2, str8, str9, strDecodeStringElement2, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tickersData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TickersData.write$Self$OKTradeCore_trade_core(tickersData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
