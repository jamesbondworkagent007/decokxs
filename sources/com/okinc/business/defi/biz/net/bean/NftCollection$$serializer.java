package com.okinc.business.defi.biz.net.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.biz.net.bean.NftCollection;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class NftCollection$$serializer implements GeneratedSerializer<NftCollection> {
    public static final int $stable;
    public static final NftCollection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NftCollection$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NftCollection$$serializer nftCollection$$serializer = new NftCollection$$serializer();
        INSTANCE = nftCollection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.NftCollection", nftCollection$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("collectionImage", true);
        pluginGeneratedSerialDescriptor.addElement("collectionName", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("projectName", true);
        pluginGeneratedSerialDescriptor.addElement("volume", true);
        pluginGeneratedSerialDescriptor.addElement("chain", true);
        pluginGeneratedSerialDescriptor.addElement("floorPrice", true);
        pluginGeneratedSerialDescriptor.addElement("volumePrice", true);
        pluginGeneratedSerialDescriptor.addElement("lastSoldNFTImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        NftCollection$PriceDetail$$serializer nftCollection$PriceDetail$$serializer = NftCollection$PriceDetail$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, nftCollection$PriceDetail$$serializer, nftCollection$PriceDetail$$serializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NftCollection deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        NftCollection.PriceDetail priceDetail;
        int i;
        NftCollection.PriceDetail priceDetail2;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            NftCollection$PriceDetail$$serializer nftCollection$PriceDetail$$serializer = NftCollection$PriceDetail$$serializer.INSTANCE;
            NftCollection.PriceDetail priceDetail3 = (NftCollection.PriceDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, nftCollection$PriceDetail$$serializer, null);
            NftCollection.PriceDetail priceDetail4 = (NftCollection.PriceDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, nftCollection$PriceDetail$$serializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            priceDetail = priceDetail3;
            strDecodeStringElement3 = strDecodeStringElement9;
            strDecodeStringElement2 = strDecodeStringElement8;
            str = strDecodeStringElement6;
            priceDetail2 = priceDetail4;
            strDecodeStringElement = strDecodeStringElement7;
            i = 1023;
            str2 = strDecodeStringElement5;
            i2 = iDecodeIntElement;
            str3 = strDecodeStringElement4;
        } else {
            NftCollection.PriceDetail priceDetail5 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            strDecodeStringElement3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            NftCollection.PriceDetail priceDetail6 = null;
            int i4 = 0;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 9;
                        break;
                    case 2:
                        i4 |= 4;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        break;
                    case 3:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 = 9;
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = 9;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = 9;
                        break;
                    case 7:
                        i4 |= 128;
                        priceDetail5 = (NftCollection.PriceDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, NftCollection$PriceDetail$$serializer.INSTANCE, priceDetail5);
                        i3 = 9;
                        break;
                    case 8:
                        i4 |= 256;
                        priceDetail6 = (NftCollection.PriceDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, NftCollection$PriceDetail$$serializer.INSTANCE, priceDetail6);
                        i3 = 9;
                        break;
                    case 9:
                        i4 |= 512;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str5);
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            priceDetail = priceDetail5;
            i = i4;
            priceDetail2 = priceDetail6;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = str5;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NftCollection(i, str3, str2, i2, str, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, priceDetail, priceDetail2, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NftCollection nftCollection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nftCollection, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NftCollection.write$Self$OKWallet_wallet_impl(nftCollection, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
