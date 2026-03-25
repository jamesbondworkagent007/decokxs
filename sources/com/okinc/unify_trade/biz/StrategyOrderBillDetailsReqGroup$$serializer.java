package com.okinc.unify_trade.biz;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
public final /* synthetic */ class StrategyOrderBillDetailsReqGroup$$serializer implements GeneratedSerializer<StrategyOrderBillDetailsReqGroup> {
    public static final int $stable;
    public static final StrategyOrderBillDetailsReqGroup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyOrderBillDetailsReqGroup$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyOrderBillDetailsReqGroup$$serializer strategyOrderBillDetailsReqGroup$$serializer = new StrategyOrderBillDetailsReqGroup$$serializer();
        INSTANCE = strategyOrderBillDetailsReqGroup$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup", strategyOrderBillDetailsReqGroup$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("hasWs", false);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.Direction.REQUEST, false);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, StrategyOrderBillDetailsReq$$serializer.INSTANCE, StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyOrderBillDetailsReqGroup deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String strDecodeStringElement;
        StrategyOrderBillDetailsReq strategyOrderBillDetailsReq;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            strategyOrderBillDetailsReq = (StrategyOrderBillDetailsReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StrategyOrderBillDetailsReq$$serializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            i = 7;
        } else {
            StrategyOrderBillDetailsReq strategyOrderBillDetailsReq2 = null;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strategyOrderBillDetailsReq2 = (StrategyOrderBillDetailsReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StrategyOrderBillDetailsReq$$serializer.INSTANCE, strategyOrderBillDetailsReq2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement2;
            strategyOrderBillDetailsReq = strategyOrderBillDetailsReq2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyOrderBillDetailsReqGroup(i, zDecodeBooleanElement, strategyOrderBillDetailsReq, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReqGroup, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyOrderBillDetailsReqGroup.write$Self$OKTradeCore_trade_core(strategyOrderBillDetailsReqGroup, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
