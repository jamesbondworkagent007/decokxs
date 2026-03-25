package com.okinc.business.dex.trade.copytrading.home.data;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class StrategyWithPnL$$serializer implements GeneratedSerializer<StrategyWithPnL> {
    public static final int $stable;
    public static final StrategyWithPnL$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyWithPnL$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyWithPnL$$serializer strategyWithPnL$$serializer = new StrategyWithPnL$$serializer();
        INSTANCE = strategyWithPnL$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.StrategyWithPnL", strategyWithPnL$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("strategyId", false);
        pluginGeneratedSerialDescriptor.addElement("strategyMode", false);
        pluginGeneratedSerialDescriptor.addElement("pnl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, StrategyWithPnL.$childSerializers[1], StrategyPnLData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyWithPnL deserialize(@NotNull Decoder decoder) {
        int i;
        DexStrategyModeEnum dexStrategyModeEnum;
        StrategyPnLData strategyPnLData;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = StrategyWithPnL.$childSerializers;
        DexStrategyModeEnum dexStrategyModeEnum2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            dexStrategyModeEnum = (DexStrategyModeEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            str = strDecodeStringElement;
            strategyPnLData = (StrategyPnLData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StrategyPnLData$$serializer.INSTANCE, null);
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            StrategyPnLData strategyPnLData2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dexStrategyModeEnum2 = (DexStrategyModeEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dexStrategyModeEnum2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strategyPnLData2 = (StrategyPnLData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StrategyPnLData$$serializer.INSTANCE, strategyPnLData2);
                    i2 |= 4;
                }
            }
            i = i2;
            dexStrategyModeEnum = dexStrategyModeEnum2;
            strategyPnLData = strategyPnLData2;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyWithPnL(i, str, dexStrategyModeEnum, strategyPnLData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyWithPnL strategyWithPnL) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyWithPnL, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyWithPnL.OLrzqt(strategyWithPnL, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
