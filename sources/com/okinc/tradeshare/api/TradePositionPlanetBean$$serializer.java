package com.okinc.tradeshare.api;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class TradePositionPlanetBean$$serializer implements GeneratedSerializer<TradePositionPlanetBean> {
    public static final int $stable;
    public static final TradePositionPlanetBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradePositionPlanetBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradePositionPlanetBean$$serializer tradePositionPlanetBean$$serializer = new TradePositionPlanetBean$$serializer();
        INSTANCE = tradePositionPlanetBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradeshare.api.TradePositionPlanetBean", tradePositionPlanetBean$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("posId", false);
        pluginGeneratedSerialDescriptor.addElement("isPositive", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("mgnMode", false);
        pluginGeneratedSerialDescriptor.addElement("posDirection", false);
        pluginGeneratedSerialDescriptor.addElement("cTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("uTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("listTime", false);
        pluginGeneratedSerialDescriptor.addElement("instName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenIcon", false);
        pluginGeneratedSerialDescriptor.addElement("ccy", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("leverage", false);
        pluginGeneratedSerialDescriptor.addElement("shareType", false);
        pluginGeneratedSerialDescriptor.addElement("pnl", false);
        pluginGeneratedSerialDescriptor.addElement("pnlUnit", false);
        pluginGeneratedSerialDescriptor.addElement("pnlRate", false);
        pluginGeneratedSerialDescriptor.addElement("pnlRiseFall", false);
        pluginGeneratedSerialDescriptor.addElement("entryPrice", false);
        pluginGeneratedSerialDescriptor.addElement("pnlPrice", false);
        pluginGeneratedSerialDescriptor.addElement("pnlPriceLabel", false);
        pluginGeneratedSerialDescriptor.addElement("deepLink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradePositionPlanetBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement3;
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
        String str19;
        String str20;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        int i4 = 3;
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            str19 = strDecodeStringElement23;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            str20 = strDecodeStringElement22;
            str18 = strDecodeStringElement21;
            str16 = strDecodeStringElement20;
            strDecodeStringElement2 = strDecodeStringElement19;
            str17 = strDecodeStringElement24;
            str15 = strDecodeStringElement25;
            str5 = strDecodeStringElement12;
            str10 = strDecodeStringElement10;
            str8 = strDecodeStringElement13;
            str9 = strDecodeStringElement11;
            str3 = strDecodeStringElement16;
            str4 = strDecodeStringElement17;
            i = 16777215;
            str6 = strDecodeStringElement9;
            str12 = strDecodeStringElement7;
            str11 = strDecodeStringElement8;
            str = str21;
            strDecodeStringElement = strDecodeStringElement18;
            str14 = strDecodeStringElement5;
            str2 = strDecodeStringElement15;
            str7 = strDecodeStringElement14;
            str13 = strDecodeStringElement6;
            z = zDecodeBooleanElement;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String strDecodeStringElement26 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
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
            i = 0;
            String str22 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        break;
                    case 0:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i3 = 5;
                        break;
                    case 1:
                        i |= 2;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 = 5;
                        break;
                    case 2:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 5;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = 5;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 11:
                        i |= 2048;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str22);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 12:
                        i |= 4096;
                        i4 = 3;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = 5;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 18:
                        i |= 262144;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 19:
                        i |= 524288;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 20:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i |= 1048576;
                        i3 = 5;
                        break;
                    case 21:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i |= i2;
                        i3 = 5;
                        break;
                    case 22:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i |= i2;
                        i3 = 5;
                        break;
                    case 23:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i |= i2;
                        i3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            str = str22;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement26;
            str4 = strDecodeStringElement33;
            str5 = strDecodeStringElement34;
            str6 = strDecodeStringElement35;
            strDecodeStringElement3 = strDecodeStringElement36;
            str7 = strDecodeStringElement37;
            str8 = strDecodeStringElement38;
            str9 = strDecodeStringElement39;
            str10 = strDecodeStringElement40;
            str11 = strDecodeStringElement41;
            str12 = strDecodeStringElement42;
            str13 = strDecodeStringElement43;
            str14 = strDecodeStringElement44;
            String str23 = strDecodeStringElement32;
            str15 = strDecodeStringElement27;
            str16 = str23;
            String str24 = strDecodeStringElement31;
            str17 = strDecodeStringElement28;
            str18 = str24;
            String str25 = strDecodeStringElement30;
            str19 = strDecodeStringElement29;
            str20 = str25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradePositionPlanetBean(i, str14, z, str13, str12, str11, str6, str10, str9, str5, str8, str7, str, str2, str3, str4, strDecodeStringElement, strDecodeStringElement2, str16, str18, str20, str19, str17, str15, strDecodeStringElement3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradePositionPlanetBean tradePositionPlanetBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradePositionPlanetBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradePositionPlanetBean.write$Self$OKTrade_trade_api(tradePositionPlanetBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
