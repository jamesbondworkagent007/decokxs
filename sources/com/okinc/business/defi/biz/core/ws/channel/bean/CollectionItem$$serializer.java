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
public final /* synthetic */ class CollectionItem$$serializer implements GeneratedSerializer<CollectionItem> {
    public static final int $stable;
    public static final CollectionItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CollectionItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CollectionItem$$serializer collectionItem$$serializer = new CollectionItem$$serializer();
        INSTANCE = collectionItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem", collectionItem$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("project", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundImage", true);
        pluginGeneratedSerialDescriptor.addElement("contractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("collectionName", true);
        pluginGeneratedSerialDescriptor.addElement("certificateFlag", true);
        pluginGeneratedSerialDescriptor.addElement("floorSalePrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(PriceDetail$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CollectionItem deserialize(@NotNull Decoder decoder) {
        int i;
        PriceDetail priceDetail;
        String str;
        int i2;
        String str2;
        String str3;
        int i3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            i3 = iDecodeIntElement;
            priceDetail = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, PriceDetail$$serializer.INSTANCE, null);
            i = iDecodeIntElement2;
            str6 = strDecodeStringElement6;
            str2 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str7 = strDecodeStringElement2;
            str5 = strDecodeStringElement7;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            j = jDecodeLongElement;
            i2 = 2047;
        } else {
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z = true;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int iDecodeIntElement4 = 0;
            PriceDetail priceDetail2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        break;
                    case 0:
                        i5 |= 1;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i4 = 10;
                        break;
                    case 1:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 10;
                        break;
                    case 2:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 = 10;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 10;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = 10;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 10;
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 = 10;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 10;
                        break;
                    case 9:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 10;
                        break;
                    case 10:
                        i5 |= 1024;
                        priceDetail2 = (PriceDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, PriceDetail$$serializer.INSTANCE, priceDetail2);
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement4;
            priceDetail = priceDetail2;
            str = strDecodeStringElement12;
            i2 = i5;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement8;
            String str8 = strDecodeStringElement13;
            i3 = iDecodeIntElement3;
            String str9 = strDecodeStringElement11;
            str4 = str8;
            long j2 = jDecodeLongElement2;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement9;
            str7 = str9;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CollectionItem(i2, i3, j, str, str7, str3, str4, str2, str6, str5, i, priceDetail, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CollectionItem collectionItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(collectionItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CollectionItem.write$Self$OKWallet_wallet_impl(collectionItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
