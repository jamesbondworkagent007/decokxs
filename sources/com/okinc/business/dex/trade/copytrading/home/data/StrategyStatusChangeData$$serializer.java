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
public final /* synthetic */ class StrategyStatusChangeData$$serializer implements GeneratedSerializer<StrategyStatusChangeData> {
    public static final int $stable;
    public static final StrategyStatusChangeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyStatusChangeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyStatusChangeData$$serializer strategyStatusChangeData$$serializer = new StrategyStatusChangeData$$serializer();
        INSTANCE = strategyStatusChangeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.StrategyStatusChangeData", strategyStatusChangeData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("strategyId", false);
        pluginGeneratedSerialDescriptor.addElement("strategyMode", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = StrategyStatusChangeData.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyStatusChangeData deserialize(@NotNull Decoder decoder) {
        int i;
        DexStrategyModeEnum dexStrategyModeEnum;
        StrategyUseStatusEnum strategyUseStatusEnum;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = StrategyStatusChangeData.$childSerializers;
        DexStrategyModeEnum dexStrategyModeEnum2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DexStrategyModeEnum dexStrategyModeEnum3 = (DexStrategyModeEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            strategyUseStatusEnum = (StrategyUseStatusEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement;
            dexStrategyModeEnum = dexStrategyModeEnum3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            StrategyUseStatusEnum strategyUseStatusEnum2 = null;
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
                    strategyUseStatusEnum2 = (StrategyUseStatusEnum) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], strategyUseStatusEnum2);
                    i2 |= 4;
                }
            }
            i = i2;
            dexStrategyModeEnum = dexStrategyModeEnum2;
            strategyUseStatusEnum = strategyUseStatusEnum2;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyStatusChangeData(i, str, dexStrategyModeEnum, strategyUseStatusEnum, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyStatusChangeData strategyStatusChangeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyStatusChangeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyStatusChangeData.AEQbTJ(strategyStatusChangeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
