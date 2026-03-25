package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class IdxConfig$$serializer implements GeneratedSerializer<IdxConfig> {
    public static final int $stable;
    public static final IdxConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IdxConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        IdxConfig$$serializer idxConfig$$serializer = new IdxConfig$$serializer();
        INSTANCE = idxConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.IdxConfig", idxConfig$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("referId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("baseDig", true);
        pluginGeneratedSerialDescriptor.addElement("quoteDig", true);
        pluginGeneratedSerialDescriptor.addElement("feeDig", true);
        pluginGeneratedSerialDescriptor.addElement("quoteFeeDig", true);
        pluginGeneratedSerialDescriptor.addElement("marginDig", true);
        pluginGeneratedSerialDescriptor.addElement("profitDig", true);
        pluginGeneratedSerialDescriptor.addElement("contractDig", true);
        pluginGeneratedSerialDescriptor.addElement("sheetDig", true);
        pluginGeneratedSerialDescriptor.addElement("greeksDig", true);
        pluginGeneratedSerialDescriptor.addElement("fundingFeeDig", true);
        pluginGeneratedSerialDescriptor.addElement("positionDig", true);
        pluginGeneratedSerialDescriptor.addElement("marketMaxSz", true);
        pluginGeneratedSerialDescriptor.addElement("marketStopMaxSz", true);
        pluginGeneratedSerialDescriptor.addElement("marketEntrustMaxSz", true);
        pluginGeneratedSerialDescriptor.addElement("marketPlanEntrustMaxSz", true);
        pluginGeneratedSerialDescriptor.addElement("tickConfig", true);
        pluginGeneratedSerialDescriptor.addElement("depthLvl", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement("baseDigDisplay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = IdxConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[17], kSerializerArr[18], stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final IdxConfig deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement2;
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
        List list2;
        String str16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = IdxConfig.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], null);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            str4 = strDecodeStringElement17;
            str14 = strDecodeStringElement5;
            list = list3;
            str7 = strDecodeStringElement16;
            str16 = strDecodeStringElement7;
            str5 = strDecodeStringElement18;
            str3 = strDecodeStringElement15;
            str8 = strDecodeStringElement12;
            str10 = strDecodeStringElement8;
            i = 2097151;
            str = strDecodeStringElement13;
            str12 = strDecodeStringElement9;
            str13 = strDecodeStringElement6;
            str15 = strDecodeStringElement4;
            str6 = strDecodeStringElement19;
            str2 = strDecodeStringElement14;
            str9 = strDecodeStringElement11;
            str11 = strDecodeStringElement10;
        } else {
            int i2 = 20;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
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
            boolean z = true;
            int i3 = 0;
            List list4 = null;
            List list5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 20;
                        break;
                    case 0:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 20;
                        break;
                    case 1:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 20;
                        break;
                    case 2:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 20;
                        break;
                    case 3:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 20;
                        break;
                    case 4:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 20;
                        break;
                    case 5:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 20;
                        break;
                    case 6:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 20;
                        break;
                    case 7:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 20;
                        break;
                    case 8:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 20;
                        break;
                    case 9:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 20;
                        break;
                    case 10:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 20;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 20;
                        break;
                    case 12:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 20;
                        break;
                    case 13:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 20;
                        break;
                    case 14:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 20;
                        break;
                    case 15:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 20;
                        break;
                    case 16:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 |= 65536;
                        i2 = 20;
                        break;
                    case 17:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], list4);
                        i3 |= 131072;
                        i2 = 20;
                        break;
                    case 18:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], list5);
                        i3 |= 262144;
                        i2 = 20;
                        break;
                    case 19:
                        i3 |= 524288;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i2 = 20;
                        break;
                    case 20:
                        i3 |= 1048576;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement20;
            list = list4;
            str2 = strDecodeStringElement21;
            str3 = strDecodeStringElement22;
            strDecodeStringElement = strDecodeStringElement23;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            strDecodeStringElement2 = strDecodeStringElement27;
            strDecodeStringElement3 = strDecodeStringElement28;
            str7 = strDecodeStringElement29;
            str8 = strDecodeStringElement30;
            str9 = strDecodeStringElement31;
            str10 = strDecodeStringElement32;
            str11 = strDecodeStringElement33;
            str12 = strDecodeStringElement34;
            str13 = strDecodeStringElement35;
            str14 = strDecodeStringElement36;
            str15 = strDecodeStringElement37;
            list2 = list5;
            str16 = strDecodeStringElement38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new IdxConfig(i, str15, str14, str13, str16, str10, str12, str11, str9, str8, str, str2, str3, str7, strDecodeStringElement, str4, str5, str6, list, list2, strDecodeStringElement2, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull IdxConfig idxConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(idxConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        IdxConfig.write$Self$OKTradeCore_trade_core(idxConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
