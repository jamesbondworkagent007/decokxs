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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class NftReduce$$serializer implements GeneratedSerializer<NftReduce> {
    public static final int $stable;
    public static final NftReduce$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NftReduce$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NftReduce$$serializer nftReduce$$serializer = new NftReduce$$serializer();
        INSTANCE = nftReduce$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce", nftReduce$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("collectionItem", true);
        pluginGeneratedSerialDescriptor.addElement("nftItem", true);
        pluginGeneratedSerialDescriptor.addElement("count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CollectionItem$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(NFTItem$$serializer.INSTANCE), IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NftReduce deserialize(@NotNull Decoder decoder) {
        CollectionItem collectionItem;
        NFTItem nFTItem;
        int iDecodeIntElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        NFTItem nFTItem2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            collectionItem = (CollectionItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CollectionItem$$serializer.INSTANCE, null);
            nFTItem = (NFTItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NFTItem$$serializer.INSTANCE, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i = 7;
        } else {
            CollectionItem collectionItem2 = null;
            int iDecodeIntElement2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    collectionItem2 = (CollectionItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CollectionItem$$serializer.INSTANCE, collectionItem2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    nFTItem2 = (NFTItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NFTItem$$serializer.INSTANCE, nFTItem2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            collectionItem = collectionItem2;
            nFTItem = nFTItem2;
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NftReduce(i, collectionItem, nFTItem, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NftReduce nftReduce) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nftReduce, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NftReduce.write$Self$OKWallet_wallet_impl(nftReduce, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
