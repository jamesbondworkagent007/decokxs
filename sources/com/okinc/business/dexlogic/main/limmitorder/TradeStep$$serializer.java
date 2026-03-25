package com.okinc.business.dexlogic.main.limmitorder;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TradeStep$$serializer implements GeneratedSerializer<TradeStep> {
    public static final int $stable;
    public static final TradeStep$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeStep$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeStep$$serializer tradeStep$$serializer = new TradeStep$$serializer();
        INSTANCE = tradeStep$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.main.limmitorder.TradeStep", tradeStep$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("step", false);
        pluginGeneratedSerialDescriptor.addElement("hasCheck", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("showState", false);
        pluginGeneratedSerialDescriptor.addElement("doNext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TradeStep.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], booleanSerializer, kSerializerArr[2], booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeStep deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        SwapState swapState;
        CheckStep checkStep;
        int i;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeStep.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CheckStep checkStep2 = (CheckStep) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            swapState = (SwapState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            checkStep = checkStep2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            i = 31;
            z = zDecodeBooleanElement3;
        } else {
            SwapState swapState2 = null;
            CheckStep checkStep3 = null;
            boolean z2 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int i3 = 0;
            boolean zDecodeBooleanElement6 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                    } else if (iDecodeElementIndex == 2) {
                        i3 |= 4;
                        swapState2 = (SwapState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], swapState2);
                    } else if (iDecodeElementIndex == 3) {
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                    }
                    i3 = i2;
                } else {
                    checkStep3 = (CheckStep) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], checkStep3);
                    i3 |= 1;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement4;
            zDecodeBooleanElement2 = zDecodeBooleanElement5;
            swapState = swapState2;
            checkStep = checkStep3;
            i = i3;
            z = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeStep(i, checkStep, z, swapState, zDecodeBooleanElement, zDecodeBooleanElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeStep tradeStep) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeStep, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeStep.write$Self$OKDex_dex_impl(tradeStep, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
