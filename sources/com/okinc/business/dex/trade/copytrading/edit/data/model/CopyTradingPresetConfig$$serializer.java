package com.okinc.business.dex.trade.copytrading.edit.data.model;

import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset$$serializer;
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
public final /* synthetic */ class CopyTradingPresetConfig$$serializer implements GeneratedSerializer<CopyTradingPresetConfig> {
    public static final int $stable;
    public static final CopyTradingPresetConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CopyTradingPresetConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CopyTradingPresetConfig$$serializer copyTradingPresetConfig$$serializer = new CopyTradingPresetConfig$$serializer();
        INSTANCE = copyTradingPresetConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPresetConfig", copyTradingPresetConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("buyPreset", true);
        pluginGeneratedSerialDescriptor.addElement("sellPreset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BuySellPreset$$serializer buySellPreset$$serializer = BuySellPreset$$serializer.INSTANCE;
        return new KSerializer[]{buySellPreset$$serializer, buySellPreset$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CopyTradingPresetConfig deserialize(@NotNull Decoder decoder) {
        BuySellPreset buySellPreset;
        BuySellPreset buySellPreset2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BuySellPreset$$serializer buySellPreset$$serializer = BuySellPreset$$serializer.INSTANCE;
            buySellPreset2 = (BuySellPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, buySellPreset$$serializer, null);
            buySellPreset = (BuySellPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, buySellPreset$$serializer, null);
            i = 3;
        } else {
            buySellPreset = null;
            BuySellPreset buySellPreset3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    buySellPreset3 = (BuySellPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BuySellPreset$$serializer.INSTANCE, buySellPreset3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    buySellPreset = (BuySellPreset) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BuySellPreset$$serializer.INSTANCE, buySellPreset);
                    i2 |= 2;
                }
            }
            buySellPreset2 = buySellPreset3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CopyTradingPresetConfig(i, buySellPreset2, buySellPreset, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CopyTradingPresetConfig copyTradingPresetConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(copyTradingPresetConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CopyTradingPresetConfig.write$Self$OKDex_dex_impl(copyTradingPresetConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
