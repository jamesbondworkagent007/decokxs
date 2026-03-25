package com.okinc.unify_trade.biz;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class OptionInstrument$$serializer implements GeneratedSerializer<OptionInstrument> {
    public static final int $stable;
    public static final OptionInstrument$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OptionInstrument$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OptionInstrument$$serializer optionInstrument$$serializer = new OptionInstrument$$serializer();
        INSTANCE = optionInstrument$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.OptionInstrument", optionInstrument$$serializer, 28);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement("baseInfo", false);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("instFly", true);
        pluginGeneratedSerialDescriptor.addElement("settleCcy", true);
        pluginGeneratedSerialDescriptor.addElement("ctVal", true);
        pluginGeneratedSerialDescriptor.addElement("ctMult", true);
        pluginGeneratedSerialDescriptor.addElement("ctValCcy", true);
        pluginGeneratedSerialDescriptor.addElement("optType", true);
        pluginGeneratedSerialDescriptor.addElement("stk", true);
        pluginGeneratedSerialDescriptor.addElement("enableFilter", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("expTime", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_ALIAS, true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpread", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactor", true);
        pluginGeneratedSerialDescriptor.addElement("pxLimitFactor", true);
        pluginGeneratedSerialDescriptor.addElement("masPaDeltaThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpreadV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorGtHaftV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorLtHaftV2", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblMinBaseSpreadV3", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorGtHaftV3", true);
        pluginGeneratedSerialDescriptor.addElement("spreadWidthOblDeltaFactorLtHaftV3", true);
        pluginGeneratedSerialDescriptor.addElement("maxLmtAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxMktAmt", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BaseInstrument$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OptionInstrument deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        BaseInstrument baseInstrument;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        char c;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        int i4 = 3;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BaseInstrument baseInstrument2 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            strDecodeStringElement = strDecodeStringElement22;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            str23 = strDecodeStringElement23;
            str21 = strDecodeStringElement24;
            str19 = strDecodeStringElement25;
            str17 = strDecodeStringElement26;
            str13 = strDecodeStringElement27;
            str12 = strDecodeStringElement28;
            str5 = strDecodeStringElement15;
            str22 = strDecodeStringElement20;
            str20 = strDecodeStringElement19;
            str18 = strDecodeStringElement18;
            str14 = strDecodeStringElement17;
            str15 = strDecodeStringElement16;
            str2 = strDecodeStringElement8;
            str = strDecodeStringElement11;
            str9 = strDecodeStringElement10;
            z = zDecodeBooleanElement;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement12;
            str16 = strDecodeStringElement4;
            str3 = strDecodeStringElement6;
            baseInstrument = baseInstrument2;
            str4 = strDecodeStringElement5;
            str6 = strDecodeStringElement14;
            str11 = strDecodeStringElement7;
            str10 = strDecodeStringElement9;
            i = 268435455;
            str24 = strDecodeStringElement21;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            strDecodeStringElement = null;
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
            i = 0;
            BaseInstrument baseInstrument3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 2;
                        z2 = false;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 0:
                        c = 2;
                        i |= 1;
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 1:
                        c = 2;
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 2:
                        c = 2;
                        i |= 4;
                        baseInstrument3 = (BaseInstrument) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, baseInstrument3);
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i |= 2048;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 14:
                        i |= 16384;
                        c = 2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 15:
                        i |= 32768;
                        c = 2;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 18:
                        i |= 262144;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 19:
                        i |= 524288;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 20:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i |= 1048576;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 21:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 22:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 23:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 24:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 25:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 26:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 27:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i2 = 134217728;
                        i |= i2;
                        c = 2;
                        i3 = 5;
                        i4 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            baseInstrument = baseInstrument3;
            str = strDecodeStringElement40;
            str2 = strDecodeStringElement41;
            str3 = strDecodeStringElement42;
            str4 = strDecodeStringElement43;
            strDecodeStringElement2 = strDecodeStringElement44;
            str5 = strDecodeStringElement45;
            str6 = strDecodeStringElement46;
            str7 = strDecodeStringElement47;
            str8 = strDecodeStringElement48;
            str9 = strDecodeStringElement49;
            str10 = strDecodeStringElement50;
            str11 = strDecodeStringElement51;
            z = zDecodeBooleanElement2;
            str12 = strDecodeStringElement30;
            str13 = strDecodeStringElement31;
            str14 = strDecodeStringElement29;
            str15 = strDecodeStringElement3;
            str16 = strDecodeStringElement52;
            String str25 = strDecodeStringElement39;
            str17 = strDecodeStringElement32;
            str18 = str25;
            String str26 = strDecodeStringElement38;
            str19 = strDecodeStringElement33;
            str20 = str26;
            String str27 = strDecodeStringElement37;
            str21 = strDecodeStringElement34;
            str22 = str27;
            String str28 = strDecodeStringElement36;
            str23 = strDecodeStringElement35;
            str24 = str28;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OptionInstrument(i, str16, str4, baseInstrument, str3, str11, str2, str10, str9, str, str8, str7, z, str6, str5, str15, str14, str18, str20, str22, str24, strDecodeStringElement, str23, str21, str19, str17, str13, str12, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OptionInstrument optionInstrument) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OptionInstrument.write$Self$OKTradeCore_trade_core(optionInstrument, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
