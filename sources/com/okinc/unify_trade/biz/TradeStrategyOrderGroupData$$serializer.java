package com.okinc.unify_trade.biz;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class TradeStrategyOrderGroupData$$serializer implements GeneratedSerializer<TradeStrategyOrderGroupData> {
    public static final int $stable;
    public static final TradeStrategyOrderGroupData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeStrategyOrderGroupData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeStrategyOrderGroupData$$serializer tradeStrategyOrderGroupData$$serializer = new TradeStrategyOrderGroupData$$serializer();
        INSTANCE = tradeStrategyOrderGroupData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.TradeStrategyOrderGroupData", tradeStrategyOrderGroupData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.Direction.REQUEST, false);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        pluginGeneratedSerialDescriptor.addElement("sp", true);
        pluginGeneratedSerialDescriptor.addElement("attachSp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BaseTradeStrategyOrderReq$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(TriggerStrategyOrderReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TradeOrderSpReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TradeStrategyOrderGroupData.$childSerializers[3])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeStrategyOrderGroupData deserialize(@NotNull Decoder decoder) {
        int i;
        TradeOrderSpReq tradeOrderSpReq;
        List list;
        TriggerStrategyOrderReq triggerStrategyOrderReq;
        BaseTradeStrategyOrderReq baseTradeStrategyOrderReq;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeStrategyOrderGroupData.$childSerializers;
        TradeOrderSpReq tradeOrderSpReq2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BaseTradeStrategyOrderReq baseTradeStrategyOrderReq2 = (BaseTradeStrategyOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BaseTradeStrategyOrderReq$$serializer.INSTANCE, null);
            TriggerStrategyOrderReq triggerStrategyOrderReq2 = (TriggerStrategyOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TriggerStrategyOrderReq$$serializer.INSTANCE, null);
            TradeOrderSpReq tradeOrderSpReq3 = (TradeOrderSpReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            baseTradeStrategyOrderReq = baseTradeStrategyOrderReq2;
            tradeOrderSpReq = tradeOrderSpReq3;
            triggerStrategyOrderReq = triggerStrategyOrderReq2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            List list2 = null;
            TriggerStrategyOrderReq triggerStrategyOrderReq3 = null;
            BaseTradeStrategyOrderReq baseTradeStrategyOrderReq3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    baseTradeStrategyOrderReq3 = (BaseTradeStrategyOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BaseTradeStrategyOrderReq$$serializer.INSTANCE, baseTradeStrategyOrderReq3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    triggerStrategyOrderReq3 = (TriggerStrategyOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TriggerStrategyOrderReq$$serializer.INSTANCE, triggerStrategyOrderReq3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    tradeOrderSpReq2 = (TradeOrderSpReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, tradeOrderSpReq2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            tradeOrderSpReq = tradeOrderSpReq2;
            list = list2;
            triggerStrategyOrderReq = triggerStrategyOrderReq3;
            baseTradeStrategyOrderReq = baseTradeStrategyOrderReq3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeStrategyOrderGroupData(i, baseTradeStrategyOrderReq, triggerStrategyOrderReq, tradeOrderSpReq, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeStrategyOrderGroupData tradeStrategyOrderGroupData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeStrategyOrderGroupData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeStrategyOrderGroupData.write$Self$OKTradeCore_trade_core(tradeStrategyOrderGroupData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
