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
public final /* synthetic */ class NftReceived$$serializer implements GeneratedSerializer<NftReceived> {
    public static final int $stable;
    public static final NftReceived$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NftReceived$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NftReceived$$serializer nftReceived$$serializer = new NftReceived$$serializer();
        INSTANCE = nftReceived$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived", nftReceived$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("nftItem", true);
        pluginGeneratedSerialDescriptor.addElement("count", true);
        pluginGeneratedSerialDescriptor.addElement("collectionItem", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(NFTItem$$serializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(CollectionItem$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NftReceived deserialize(@NotNull Decoder decoder) {
        NFTItem nFTItem;
        CollectionItem collectionItem;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CollectionItem collectionItem2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NFTItem nFTItem2 = (NFTItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NFTItem$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            nFTItem = nFTItem2;
            collectionItem = (CollectionItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CollectionItem$$serializer.INSTANCE, null);
            i = 7;
            i2 = iDecodeIntElement;
        } else {
            NFTItem nFTItem3 = null;
            int i3 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    nFTItem3 = (NFTItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NFTItem$$serializer.INSTANCE, nFTItem3);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    collectionItem2 = (CollectionItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CollectionItem$$serializer.INSTANCE, collectionItem2);
                    i3 |= 4;
                }
            }
            nFTItem = nFTItem3;
            collectionItem = collectionItem2;
            i = i3;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NftReceived(i, nFTItem, i2, collectionItem, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NftReceived nftReceived) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nftReceived, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NftReceived.write$Self$OKWallet_wallet_impl(nftReceived, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
