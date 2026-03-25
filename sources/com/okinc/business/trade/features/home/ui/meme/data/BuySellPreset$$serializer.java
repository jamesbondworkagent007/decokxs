package com.okinc.business.trade.features.home.ui.meme.data;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class BuySellPreset$$serializer implements GeneratedSerializer<BuySellPreset> {
    public static final int $stable;
    public static final BuySellPreset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BuySellPreset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BuySellPreset$$serializer buySellPreset$$serializer = new BuySellPreset$$serializer();
        INSTANCE = buySellPreset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset", buySellPreset$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("feeConfig", true);
        pluginGeneratedSerialDescriptor.addElement("routeConfig", true);
        pluginGeneratedSerialDescriptor.addElement("slippageConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{FeeConfig$$serializer.INSTANCE, RouteConfig$$serializer.INSTANCE, SlippageConfigPreset$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BuySellPreset deserialize(@NotNull Decoder decoder) {
        int i;
        RouteConfig routeConfig;
        FeeConfig feeConfig;
        SlippageConfigPreset slippageConfigPreset;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        RouteConfig routeConfig2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FeeConfig feeConfig2 = (FeeConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FeeConfig$$serializer.INSTANCE, null);
            RouteConfig routeConfig3 = (RouteConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RouteConfig$$serializer.INSTANCE, null);
            feeConfig = feeConfig2;
            slippageConfigPreset = (SlippageConfigPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SlippageConfigPreset$$serializer.INSTANCE, null);
            routeConfig = routeConfig3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            FeeConfig feeConfig3 = null;
            SlippageConfigPreset slippageConfigPreset2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    feeConfig3 = (FeeConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FeeConfig$$serializer.INSTANCE, feeConfig3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    routeConfig2 = (RouteConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RouteConfig$$serializer.INSTANCE, routeConfig2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    slippageConfigPreset2 = (SlippageConfigPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SlippageConfigPreset$$serializer.INSTANCE, slippageConfigPreset2);
                    i2 |= 4;
                }
            }
            i = i2;
            routeConfig = routeConfig2;
            feeConfig = feeConfig3;
            slippageConfigPreset = slippageConfigPreset2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BuySellPreset(i, feeConfig, routeConfig, slippageConfigPreset, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BuySellPreset buySellPreset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BuySellPreset.write$Self$OKDex_dex_impl(buySellPreset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
