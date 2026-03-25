package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class BotOrderListReqGroup$$serializer implements GeneratedSerializer<BotOrderListReqGroup> {
    public static final int $stable;
    public static final BotOrderListReqGroup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotOrderListReqGroup$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotOrderListReqGroup$$serializer botOrderListReqGroup$$serializer = new BotOrderListReqGroup$$serializer();
        INSTANCE = botOrderListReqGroup$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BotOrderListReqGroup", botOrderListReqGroup$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("isHistory", true);
        pluginGeneratedSerialDescriptor.addElement("hasWs", true);
        pluginGeneratedSerialDescriptor.addElement("pendingReq", true);
        pluginGeneratedSerialDescriptor.addElement("historyReq", true);
        pluginGeneratedSerialDescriptor.addElement("originalType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, StrategyPendingListReq$$serializer.INSTANCE, StrategyHistoryListReq$$serializer.INSTANCE, StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotOrderListReqGroup deserialize(@NotNull Decoder decoder) {
        boolean z;
        StrategyHistoryListReq strategyHistoryListReq;
        String strDecodeStringElement;
        StrategyPendingListReq strategyPendingListReq;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        StrategyHistoryListReq strategyHistoryListReq2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            StrategyPendingListReq strategyPendingListReq2 = (StrategyPendingListReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StrategyPendingListReq$$serializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            strategyHistoryListReq = (StrategyHistoryListReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, StrategyHistoryListReq$$serializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            strategyPendingListReq = strategyPendingListReq2;
            z2 = zDecodeBooleanElement2;
        } else {
            String strDecodeStringElement2 = null;
            StrategyPendingListReq strategyPendingListReq3 = null;
            boolean zDecodeBooleanElement3 = false;
            int i2 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z3 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strategyPendingListReq3 = (StrategyPendingListReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StrategyPendingListReq$$serializer.INSTANCE, strategyPendingListReq3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strategyHistoryListReq2 = (StrategyHistoryListReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, StrategyHistoryListReq$$serializer.INSTANCE, strategyHistoryListReq2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            z = zDecodeBooleanElement3;
            strategyHistoryListReq = strategyHistoryListReq2;
            strDecodeStringElement = strDecodeStringElement2;
            strategyPendingListReq = strategyPendingListReq3;
            i = i2;
            z2 = zDecodeBooleanElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotOrderListReqGroup(i, z, z2, strategyPendingListReq, strategyHistoryListReq, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotOrderListReqGroup botOrderListReqGroup) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botOrderListReqGroup, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotOrderListReqGroup.write$Self$OKTradeCore_trade_core(botOrderListReqGroup, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
