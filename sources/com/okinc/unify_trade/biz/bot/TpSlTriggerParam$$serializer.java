package com.okinc.unify_trade.biz.bot;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class TpSlTriggerParam$$serializer implements GeneratedSerializer<TpSlTriggerParam> {
    public static final int $stable;
    public static final TpSlTriggerParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TpSlTriggerParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TpSlTriggerParam$$serializer tpSlTriggerParam$$serializer = new TpSlTriggerParam$$serializer();
        INSTANCE = tpSlTriggerParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.bot.TpSlTriggerParam", tpSlTriggerParam$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("stopType", true);
        pluginGeneratedSerialDescriptor.addElement("delaySeconds", true);
        pluginGeneratedSerialDescriptor.addElement("tp", true);
        pluginGeneratedSerialDescriptor.addElement("sl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        TpSLTriggerItem$$serializer tpSLTriggerItem$$serializer = TpSLTriggerItem$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), tpSLTriggerItem$$serializer, tpSLTriggerItem$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TpSlTriggerParam deserialize(@NotNull Decoder decoder) {
        int i;
        TpSLTriggerItem tpSLTriggerItem;
        String str;
        TpSLTriggerItem tpSLTriggerItem2;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        TpSLTriggerItem tpSLTriggerItem3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            TpSLTriggerItem$$serializer tpSLTriggerItem$$serializer = TpSLTriggerItem$$serializer.INSTANCE;
            TpSLTriggerItem tpSLTriggerItem4 = (TpSLTriggerItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, tpSLTriggerItem$$serializer, null);
            str = str4;
            tpSLTriggerItem2 = (TpSLTriggerItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, tpSLTriggerItem$$serializer, null);
            tpSLTriggerItem = tpSLTriggerItem4;
            str2 = str3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String str5 = null;
            TpSLTriggerItem tpSLTriggerItem5 = null;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    tpSLTriggerItem3 = (TpSLTriggerItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TpSLTriggerItem$$serializer.INSTANCE, tpSLTriggerItem3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    tpSLTriggerItem5 = (TpSLTriggerItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, TpSLTriggerItem$$serializer.INSTANCE, tpSLTriggerItem5);
                    i2 |= 8;
                }
            }
            i = i2;
            tpSLTriggerItem = tpSLTriggerItem3;
            str = str5;
            tpSLTriggerItem2 = tpSLTriggerItem5;
            str2 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TpSlTriggerParam(i, str2, str, tpSLTriggerItem, tpSLTriggerItem2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TpSlTriggerParam tpSlTriggerParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TpSlTriggerParam.write$Self$OKTradeCore_trade_core(tpSlTriggerParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
