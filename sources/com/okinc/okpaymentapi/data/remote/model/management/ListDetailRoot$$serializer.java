package com.okinc.okpaymentapi.data.remote.model.management;

import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ListDetailRoot$$serializer implements GeneratedSerializer<ListDetailRoot> {
    public static final int $stable;
    public static final ListDetailRoot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ListDetailRoot$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ListDetailRoot$$serializer listDetailRoot$$serializer = new ListDetailRoot$$serializer();
        INSTANCE = listDetailRoot$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.ListDetailRoot", listDetailRoot$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("planId", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", false);
        pluginGeneratedSerialDescriptor.addElement("firstOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("lowBalance", false);
        pluginGeneratedSerialDescriptor.addElement("createTime", false);
        pluginGeneratedSerialDescriptor.addElement("frequency", false);
        pluginGeneratedSerialDescriptor.addElement("orderList", false);
        pluginGeneratedSerialDescriptor.addElement("purchaseTimes", false);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIcon", false);
        pluginGeneratedSerialDescriptor.addElement("roi", false);
        pluginGeneratedSerialDescriptor.addElement("totalBaseAmount", false);
        pluginGeneratedSerialDescriptor.addElement("totalQuoteAmount", false);
        pluginGeneratedSerialDescriptor.addElement("nextPurchaseTime", false);
        pluginGeneratedSerialDescriptor.addElement("lastPurchaseTime", false);
        pluginGeneratedSerialDescriptor.addElement("nextPurchase", false);
        pluginGeneratedSerialDescriptor.addElement("roiStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ListDetailRoot.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[10], longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ListDetailRoot deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement2;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        long jDecodeLongElement;
        long j;
        String str9;
        String str10;
        String str11;
        long j2;
        String str12;
        String str13;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ListDetailRoot.$childSerializers;
        int i3 = 3;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            str13 = strDecodeStringElement13;
            str10 = strDecodeStringElement17;
            str9 = strDecodeStringElement16;
            str12 = strDecodeStringElement15;
            strDecodeStringElement = strDecodeStringElement14;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 19);
            str2 = strDecodeStringElement10;
            str6 = strDecodeStringElement8;
            i = 1048575;
            z = zDecodeBooleanElement;
            str5 = strDecodeStringElement9;
            list = list2;
            str8 = strDecodeStringElement4;
            str3 = strDecodeStringElement7;
            str = strDecodeStringElement11;
            j = jDecodeLongElement2;
            str11 = strDecodeStringElement12;
            j2 = jDecodeLongElement3;
            str4 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
        } else {
            int i4 = 19;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement18 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            boolean z2 = true;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            i = 0;
            List list3 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 3;
                        i4 = 19;
                        break;
                    case 0:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i |= 1;
                        i3 = 3;
                        i4 = 19;
                        break;
                    case 1:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i3 = 3;
                        i4 = 19;
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 = 19;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 = 19;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 19;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = 19;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 19;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i2 = i | 128;
                        i = i2;
                        i4 = 19;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 19;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 = 19;
                        break;
                    case 10:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list3);
                        i2 = i | 1024;
                        i = i2;
                        i4 = 19;
                        break;
                    case 11:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i |= 2048;
                        i4 = 19;
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 = 19;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i4 = 19;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i4 = 19;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 = 19;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i4 = 19;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i4 = 19;
                        break;
                    case 18:
                        i |= 262144;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i4 = 19;
                        break;
                    case 19:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i4);
                        i = 524288 | i;
                        i4 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            str = strDecodeStringElement20;
            str2 = strDecodeStringElement21;
            str3 = strDecodeStringElement22;
            str4 = strDecodeStringElement23;
            strDecodeStringElement2 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            z = zDecodeBooleanElement2;
            jDecodeLongElement = jDecodeLongElement5;
            j = jDecodeLongElement6;
            str9 = strDecodeStringElement29;
            str10 = strDecodeStringElement30;
            str11 = strDecodeStringElement19;
            j2 = jDecodeLongElement4;
            str12 = strDecodeStringElement18;
            str13 = strDecodeStringElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ListDetailRoot(i, j, str8, str7, str4, str3, str6, str5, z, str2, str, list, j2, str11, str13, strDecodeStringElement, str12, str9, str10, strDecodeStringElement2, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ListDetailRoot listDetailRoot) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(listDetailRoot, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ListDetailRoot.write$Self$OKPayments_ok_payment_api(listDetailRoot, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
