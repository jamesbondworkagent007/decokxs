package com.okinc.business.defi.biz.core.ws.channel.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class NFTItem$$serializer implements GeneratedSerializer<NFTItem> {
    public static final int $stable;
    public static final NFTItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NFTItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NFTItem$$serializer nFTItem$$serializer = new NFTItem$$serializer();
        INSTANCE = nFTItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem", nFTItem$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("contractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("project", true);
        pluginGeneratedSerialDescriptor.addElement("collectionName", true);
        pluginGeneratedSerialDescriptor.addElement("certificateFlag", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("dataUrl", true);
        pluginGeneratedSerialDescriptor.addElement("coverUrl", true);
        pluginGeneratedSerialDescriptor.addElement("resourceType", true);
        pluginGeneratedSerialDescriptor.addElement("lastSale", true);
        pluginGeneratedSerialDescriptor.addElement("lastFee", true);
        pluginGeneratedSerialDescriptor.addElement("authorAddress", true);
        pluginGeneratedSerialDescriptor.addElement("ownerAddress", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("owned", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        PriceDetail$$serializer priceDetail$$serializer = PriceDetail$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(priceDetail$$serializer), BuiltinSerializersKt.getNullable(priceDetail$$serializer), stringSerializer, stringSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NFTItem deserialize(@NotNull Decoder decoder) {
        PriceDetail priceDetail;
        String str;
        Long l;
        int i;
        String str2;
        String strDecodeStringElement;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        PriceDetail priceDetail2;
        int iDecodeIntElement;
        String str7;
        String str8;
        int i3;
        Integer num;
        String str9;
        String str10;
        String str11;
        char c;
        char c2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        char c3 = 5;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            PriceDetail$$serializer priceDetail$$serializer = PriceDetail$$serializer.INSTANCE;
            PriceDetail priceDetail3 = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, priceDetail$$serializer, null);
            PriceDetail priceDetail4 = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, priceDetail$$serializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            str10 = strDecodeStringElement6;
            str5 = strDecodeStringElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            str2 = strDecodeStringElement9;
            i2 = iDecodeIntElement3;
            str8 = strDecodeStringElement8;
            str9 = strDecodeStringElement7;
            i3 = iDecodeIntElement2;
            str3 = strDecodeStringElement5;
            num = num2;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement10;
            priceDetail2 = priceDetail4;
            i = 262143;
            priceDetail = priceDetail3;
            l = l2;
            str = str12;
            str4 = strDecodeStringElement3;
        } else {
            int i7 = 17;
            int i8 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z = true;
            Integer num3 = null;
            PriceDetail priceDetail5 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String str13 = null;
            String strDecodeStringElement19 = null;
            Long l3 = null;
            String strDecodeStringElement20 = null;
            PriceDetail priceDetail6 = null;
            int iDecodeIntElement6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str13;
                        z = false;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 0:
                        str11 = str13;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                        i8 |= 1;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 1:
                        str11 = str13;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 2:
                        i8 |= 4;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 3:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 |= 8;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 4:
                        c = c3;
                        c2 = 4;
                        i8 |= 16;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        c3 = c;
                        i6 = 8;
                        i7 = 17;
                        break;
                    case 5:
                        c = 5;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num3);
                        i8 |= 32;
                        c2 = 4;
                        c3 = c;
                        i6 = 8;
                        i7 = 17;
                        break;
                    case 6:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i8 |= 128;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i8 |= 256;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 9:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i8 |= 512;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 10:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i8 |= 1024;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 11:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i8 |= 2048;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 12:
                        priceDetail5 = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, PriceDetail$$serializer.INSTANCE, priceDetail5);
                        i8 |= 4096;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 13:
                        priceDetail6 = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, PriceDetail$$serializer.INSTANCE, priceDetail6);
                        i8 |= 8192;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 14:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i8 |= 16384;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 15:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i8 |= 32768;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 16:
                        i8 |= 65536;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    case 17:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i7);
                        i8 |= 131072;
                        str11 = str13;
                        str13 = str11;
                        i6 = 8;
                        i7 = 17;
                        i4 = 11;
                        i5 = 10;
                        c3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str13;
            priceDetail = priceDetail5;
            str = str14;
            l = l3;
            i = i8;
            str2 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement12;
            str3 = strDecodeStringElement17;
            str4 = strDecodeStringElement18;
            str5 = strDecodeStringElement19;
            str6 = strDecodeStringElement20;
            i2 = iDecodeIntElement4;
            priceDetail2 = priceDetail6;
            iDecodeIntElement = iDecodeIntElement6;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            i3 = iDecodeIntElement5;
            num = num3;
            String str15 = strDecodeStringElement16;
            str9 = strDecodeStringElement15;
            str10 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NFTItem(i, l, str5, str, str4, str6, num, str3, i3, str10, str9, str8, i2, priceDetail, priceDetail2, str2, str7, strDecodeStringElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NFTItem nFTItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nFTItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NFTItem.write$Self$OKWallet_wallet_impl(nFTItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
