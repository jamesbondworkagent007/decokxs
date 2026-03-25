package com.okinc.okimcore.stickers.remote.model;

import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class StickerPacksResponse$$serializer implements GeneratedSerializer<StickerPacksResponse> {
    public static final int $stable;
    public static final StickerPacksResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StickerPacksResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StickerPacksResponse$$serializer stickerPacksResponse$$serializer = new StickerPacksResponse$$serializer();
        INSTANCE = stickerPacksResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.stickers.remote.model.StickerPacksResponse", stickerPacksResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("savedStickers", false);
        pluginGeneratedSerialDescriptor.addElement("stickerPacks", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StickerPacksResponse.$childSerializers[0], StickerPacksResponse$StickerPacks$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StickerPacksResponse deserialize(@NotNull Decoder decoder) {
        List list;
        StickerPacksResponse.StickerPacks stickerPacks;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = StickerPacksResponse.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            stickerPacks = (StickerPacksResponse.StickerPacks) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StickerPacksResponse$StickerPacks$$serializer.INSTANCE, null);
            i = 3;
        } else {
            List list2 = null;
            StickerPacksResponse.StickerPacks stickerPacks2 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    stickerPacks2 = (StickerPacksResponse.StickerPacks) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StickerPacksResponse$StickerPacks$$serializer.INSTANCE, stickerPacks2);
                    i2 |= 2;
                }
            }
            list = list2;
            stickerPacks = stickerPacks2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StickerPacksResponse(i, list, stickerPacks, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StickerPacksResponse stickerPacksResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stickerPacksResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StickerPacksResponse.AEQbTJ(stickerPacksResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
