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
public final /* synthetic */ class TradeHisPositionPlanetBean$$serializer implements GeneratedSerializer<TradeHisPositionPlanetBean> {
    public static final int $stable;
    public static final TradeHisPositionPlanetBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeHisPositionPlanetBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeHisPositionPlanetBean$$serializer tradeHisPositionPlanetBean$$serializer = new TradeHisPositionPlanetBean$$serializer();
        INSTANCE = tradeHisPositionPlanetBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradeshare.api.TradeHisPositionPlanetBean", tradeHisPositionPlanetBean$$serializer, 23);
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
        pluginGeneratedSerialDescriptor.addElement("exitPrice", false);
        pluginGeneratedSerialDescriptor.addElement("deepLink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeHisPositionPlanetBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement3;
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
        String str19;
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
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, null);
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
            str16 = strDecodeStringElement23;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            str18 = strDecodeStringElement22;
            str19 = strDecodeStringElement21;
            str17 = strDecodeStringElement20;
            str15 = strDecodeStringElement19;
            strDecodeStringElement2 = strDecodeStringElement18;
            str14 = strDecodeStringElement24;
            str3 = strDecodeStringElement12;
            str9 = strDecodeStringElement10;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement11;
            str5 = strDecodeStringElement16;
            i = 8388607;
            str4 = strDecodeStringElement9;
            str11 = strDecodeStringElement7;
            str10 = strDecodeStringElement8;
            str12 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement17;
            str = str20;
            str13 = strDecodeStringElement5;
            str2 = strDecodeStringElement15;
            z = zDecodeBooleanElement;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
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
            i = 0;
            String str21 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        break;
                    case 0:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i3 = 5;
                        break;
                    case 1:
                        i |= 2;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 = 5;
                        break;
                    case 2:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 5;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = 5;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 11:
                        i |= 2048;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str21);
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
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 18:
                        i |= 262144;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 19:
                        i |= 524288;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i4 = 3;
                        i3 = 5;
                        break;
                    case 20:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i |= 1048576;
                        i3 = 5;
                        break;
                    case 21:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i |= i2;
                        i3 = 5;
                        break;
                    case 22:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i |= i2;
                        i3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            str = str21;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement31;
            str4 = strDecodeStringElement32;
            strDecodeStringElement3 = strDecodeStringElement33;
            str5 = strDecodeStringElement34;
            str6 = strDecodeStringElement35;
            str7 = strDecodeStringElement36;
            str8 = strDecodeStringElement37;
            str9 = strDecodeStringElement38;
            str10 = strDecodeStringElement39;
            str11 = strDecodeStringElement40;
            str12 = strDecodeStringElement41;
            str13 = strDecodeStringElement42;
            String str22 = strDecodeStringElement30;
            str14 = strDecodeStringElement25;
            str15 = str22;
            String str23 = strDecodeStringElement29;
            str16 = strDecodeStringElement26;
            str17 = str23;
            String str24 = strDecodeStringElement28;
            str18 = strDecodeStringElement27;
            str19 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeHisPositionPlanetBean(i, str13, z, str12, str11, str10, str4, str9, str8, str3, str7, str6, str, str2, str5, strDecodeStringElement, strDecodeStringElement2, str15, str17, str19, str18, str16, str14, strDecodeStringElement3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeHisPositionPlanetBean tradeHisPositionPlanetBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeHisPositionPlanetBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeHisPositionPlanetBean.write$Self$OKTrade_trade_api(tradeHisPositionPlanetBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
