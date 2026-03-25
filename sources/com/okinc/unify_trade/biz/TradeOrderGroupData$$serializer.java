package com.okinc.unify_trade.biz;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
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
public final /* synthetic */ class TradeOrderGroupData$$serializer implements GeneratedSerializer<TradeOrderGroupData> {
    public static final int $stable;
    public static final TradeOrderGroupData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeOrderGroupData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeOrderGroupData$$serializer tradeOrderGroupData$$serializer = new TradeOrderGroupData$$serializer();
        INSTANCE = tradeOrderGroupData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.TradeOrderGroupData", tradeOrderGroupData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_BASE, false);
        pluginGeneratedSerialDescriptor.addElement("optional", true);
        pluginGeneratedSerialDescriptor.addElement("sp", true);
        pluginGeneratedSerialDescriptor.addElement("attachSp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BaseTradeOrderReq$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(OptionalTradeOrderReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TradeOrderSpReq$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TradeOrderGroupData.$childSerializers[3])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeOrderGroupData deserialize(@NotNull Decoder decoder) {
        int i;
        TradeOrderSpReq tradeOrderSpReq;
        ArrayList arrayList;
        OptionalTradeOrderReq optionalTradeOrderReq;
        BaseTradeOrderReq baseTradeOrderReq;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeOrderGroupData.$childSerializers;
        TradeOrderSpReq tradeOrderSpReq2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BaseTradeOrderReq baseTradeOrderReq2 = (BaseTradeOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BaseTradeOrderReq$$serializer.INSTANCE, null);
            OptionalTradeOrderReq optionalTradeOrderReq2 = (OptionalTradeOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OptionalTradeOrderReq$$serializer.INSTANCE, null);
            TradeOrderSpReq tradeOrderSpReq3 = (TradeOrderSpReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, null);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            baseTradeOrderReq = baseTradeOrderReq2;
            tradeOrderSpReq = tradeOrderSpReq3;
            optionalTradeOrderReq = optionalTradeOrderReq2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            ArrayList arrayList2 = null;
            OptionalTradeOrderReq optionalTradeOrderReq3 = null;
            BaseTradeOrderReq baseTradeOrderReq3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    baseTradeOrderReq3 = (BaseTradeOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BaseTradeOrderReq$$serializer.INSTANCE, baseTradeOrderReq3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    optionalTradeOrderReq3 = (OptionalTradeOrderReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OptionalTradeOrderReq$$serializer.INSTANCE, optionalTradeOrderReq3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    tradeOrderSpReq2 = (TradeOrderSpReq) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TradeOrderSpReq$$serializer.INSTANCE, tradeOrderSpReq2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], arrayList2);
                    i2 |= 8;
                }
            }
            i = i2;
            tradeOrderSpReq = tradeOrderSpReq2;
            arrayList = arrayList2;
            optionalTradeOrderReq = optionalTradeOrderReq3;
            baseTradeOrderReq = baseTradeOrderReq3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeOrderGroupData(i, baseTradeOrderReq, optionalTradeOrderReq, tradeOrderSpReq, arrayList, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeOrderGroupData tradeOrderGroupData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeOrderGroupData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeOrderGroupData.write$Self$OKTradeCore_trade_core(tradeOrderGroupData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
