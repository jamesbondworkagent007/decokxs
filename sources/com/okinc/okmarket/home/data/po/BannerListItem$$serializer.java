package com.okinc.okmarket.home.data.po;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class BannerListItem$$serializer implements GeneratedSerializer<BannerListItem> {
    public static final int $stable;
    public static final BannerListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BannerListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BannerListItem$$serializer bannerListItem$$serializer = new BannerListItem$$serializer();
        INSTANCE = bannerListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okmarket.home.data.po.BannerListItem", bannerListItem$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("newCoinData", true);
        pluginGeneratedSerialDescriptor.addElement("okpData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BannerListItem.$childSerializers[0], BuiltinSerializersKt.getNullable(NewCoinData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OkpData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BannerListItem deserialize(@NotNull Decoder decoder) {
        int i;
        OkpData okpData;
        BannerType bannerType;
        NewCoinData newCoinData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BannerListItem.$childSerializers;
        OkpData okpData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            bannerType = (BannerType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            newCoinData = (NewCoinData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NewCoinData$$serializer.INSTANCE, null);
            okpData = (OkpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OkpData$$serializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            BannerType bannerType2 = null;
            NewCoinData newCoinData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bannerType2 = (BannerType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], bannerType2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    newCoinData2 = (NewCoinData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NewCoinData$$serializer.INSTANCE, newCoinData2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    okpData2 = (OkpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OkpData$$serializer.INSTANCE, okpData2);
                    i2 |= 4;
                }
            }
            i = i2;
            okpData = okpData2;
            bannerType = bannerType2;
            newCoinData = newCoinData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BannerListItem(i, bannerType, newCoinData, okpData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BannerListItem bannerListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bannerListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BannerListItem.write$Self$OKMarket_market_impl(bannerListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
