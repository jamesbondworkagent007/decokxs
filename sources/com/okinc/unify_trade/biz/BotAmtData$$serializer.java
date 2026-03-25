package com.okinc.unify_trade.biz;

import java.util.concurrent.ConcurrentHashMap;
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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class BotAmtData$$serializer implements GeneratedSerializer<BotAmtData> {
    public static final int $stable;
    public static final BotAmtData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotAmtData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotAmtData$$serializer botAmtData$$serializer = new BotAmtData$$serializer();
        INSTANCE = botAmtData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BotAmtData", botAmtData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("countMap", true);
        pluginGeneratedSerialDescriptor.addElement("pinCountMap", true);
        pluginGeneratedSerialDescriptor.addElement("coinsMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = BotAmtData.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotAmtData deserialize(@NotNull Decoder decoder) {
        int i;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BotAmtData.$childSerializers;
        ConcurrentHashMap concurrentHashMap4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            ConcurrentHashMap concurrentHashMap6 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            concurrentHashMap2 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            concurrentHashMap3 = concurrentHashMap5;
            i = 7;
            concurrentHashMap = concurrentHashMap6;
        } else {
            int i2 = 0;
            boolean z = true;
            ConcurrentHashMap concurrentHashMap7 = null;
            ConcurrentHashMap concurrentHashMap8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    concurrentHashMap8 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], concurrentHashMap8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    concurrentHashMap4 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], concurrentHashMap4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    concurrentHashMap7 = (ConcurrentHashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], concurrentHashMap7);
                    i2 |= 4;
                }
            }
            i = i2;
            concurrentHashMap = concurrentHashMap4;
            concurrentHashMap2 = concurrentHashMap7;
            concurrentHashMap3 = concurrentHashMap8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotAmtData(i, concurrentHashMap3, concurrentHashMap, concurrentHashMap2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotAmtData botAmtData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botAmtData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotAmtData.write$Self$OKTradeCore_trade_core(botAmtData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
