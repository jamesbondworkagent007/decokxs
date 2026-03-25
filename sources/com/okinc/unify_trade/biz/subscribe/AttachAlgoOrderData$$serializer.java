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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class AttachAlgoOrderData$$serializer implements GeneratedSerializer<AttachAlgoOrderData> {
    public static final int $stable;
    public static final AttachAlgoOrderData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AttachAlgoOrderData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AttachAlgoOrderData$$serializer attachAlgoOrderData$$serializer = new AttachAlgoOrderData$$serializer();
        INSTANCE = attachAlgoOrderData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.AttachAlgoOrderData", attachAlgoOrderData$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("algoId", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("tpTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("slOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("slTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("cTime", true);
        pluginGeneratedSerialDescriptor.addElement("uTime", true);
        pluginGeneratedSerialDescriptor.addElement("sz", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("isTpLimit", true);
        pluginGeneratedSerialDescriptor.addElement("reduceOnly", true);
        pluginGeneratedSerialDescriptor.addElement("amendPxOnTriggerType", true);
        pluginGeneratedSerialDescriptor.addElement("ordId", true);
        pluginGeneratedSerialDescriptor.addElement("px", true);
        pluginGeneratedSerialDescriptor.addElement("linkedOrd", true);
        pluginGeneratedSerialDescriptor.addElement("linkedAlgoOrd", true);
        pluginGeneratedSerialDescriptor.addElement("businessLine", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(LinkedOrd$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkedAlgoOrd$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AttachAlgoOrderData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        LinkedAlgoOrd linkedAlgoOrd;
        String str3;
        String str4;
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
        LinkedOrd linkedOrd;
        int i;
        String str18;
        String str19;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            LinkedOrd linkedOrd2 = (LinkedOrd) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, LinkedOrd$$serializer.INSTANCE, null);
            linkedAlgoOrd = (LinkedAlgoOrd) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, LinkedAlgoOrd$$serializer.INSTANCE, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            str12 = strDecodeStringElement8;
            str17 = strDecodeStringElement5;
            str15 = strDecodeStringElement2;
            str4 = strDecodeStringElement7;
            str11 = strDecodeStringElement9;
            str13 = strDecodeStringElement4;
            str14 = strDecodeStringElement3;
            i = 1048575;
            str18 = strDecodeStringElement;
            str7 = strDecodeStringElement14;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement10;
            str2 = str20;
            linkedOrd = linkedOrd2;
            str6 = strDecodeStringElement15;
            str16 = strDecodeStringElement6;
            str = str21;
            str5 = strDecodeStringElement13;
            str8 = strDecodeStringElement12;
        } else {
            int i4 = 19;
            String str22 = null;
            LinkedOrd linkedOrd3 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String str23 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            boolean z = true;
            LinkedAlgoOrd linkedAlgoOrd2 = null;
            int i5 = 0;
            String str24 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str19 = str23;
                        z = false;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 0:
                        str19 = str23;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 1:
                        str19 = str23;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 2:
                        str19 = str23;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 3:
                        i5 |= 8;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str23);
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 5:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 19;
                        break;
                    case 6:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str22);
                        i5 |= 64;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 7:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 256;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 9:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 10:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 11:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 12:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 13:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 14:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 |= 16384;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 15:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i5 |= 32768;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 16:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 |= 65536;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 17:
                        linkedOrd3 = (LinkedOrd) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, LinkedOrd$$serializer.INSTANCE, linkedOrd3);
                        i2 = 131072;
                        i5 |= i2;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 18:
                        linkedAlgoOrd2 = (LinkedAlgoOrd) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, LinkedAlgoOrd$$serializer.INSTANCE, linkedAlgoOrd2);
                        i2 = 262144;
                        i5 |= i2;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    case 19:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str24);
                        i2 = 524288;
                        i5 |= i2;
                        str19 = str23;
                        str23 = str19;
                        i4 = 19;
                        i3 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str22;
            str2 = str23;
            linkedAlgoOrd = linkedAlgoOrd2;
            str3 = str24;
            str4 = strDecodeStringElement16;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement18;
            str7 = strDecodeStringElement19;
            str8 = strDecodeStringElement20;
            str9 = strDecodeStringElement21;
            str10 = strDecodeStringElement22;
            str11 = strDecodeStringElement23;
            str12 = strDecodeStringElement24;
            str13 = strDecodeStringElement25;
            str14 = strDecodeStringElement26;
            str15 = strDecodeStringElement27;
            str16 = strDecodeStringElement29;
            str17 = strDecodeStringElement30;
            linkedOrd = linkedOrd3;
            i = i5;
            str18 = strDecodeStringElement28;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AttachAlgoOrderData(i, str18, str15, str14, str2, str13, str17, str, str16, str4, str12, str11, str10, str9, str8, str5, str7, str6, linkedOrd, linkedAlgoOrd, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AttachAlgoOrderData attachAlgoOrderData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(attachAlgoOrderData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AttachAlgoOrderData.write$Self$OKTradeCore_trade_core(attachAlgoOrderData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
