package com.okinc.business.dex.tee.domain.model;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TpslConfig$$serializer implements GeneratedSerializer<TpslConfig> {
    public static final int $stable;
    public static final TpslConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TpslConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TpslConfig$$serializer tpslConfig$$serializer = new TpslConfig$$serializer();
        INSTANCE = tpslConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.tee.domain.model.TpslConfig", tpslConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("sellRule", true);
        pluginGeneratedSerialDescriptor.addElement("buyPreset", true);
        pluginGeneratedSerialDescriptor.addElement("sellPreset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(SellRule$$serializer.INSTANCE);
        Preset$$serializer preset$$serializer = Preset$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(preset$$serializer), BuiltinSerializersKt.getNullable(preset$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TpslConfig deserialize(@NotNull Decoder decoder) {
        int i;
        Preset preset;
        SellRule sellRule;
        Preset preset2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Preset preset3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            SellRule sellRule2 = (SellRule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, SellRule$$serializer.INSTANCE, null);
            Preset$$serializer preset$$serializer = Preset$$serializer.INSTANCE;
            Preset preset4 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, preset$$serializer, null);
            sellRule = sellRule2;
            preset2 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, preset$$serializer, null);
            i = 7;
            preset = preset4;
        } else {
            int i2 = 0;
            boolean z = true;
            SellRule sellRule3 = null;
            Preset preset5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sellRule3 = (SellRule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, SellRule$$serializer.INSTANCE, sellRule3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    preset3 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Preset$$serializer.INSTANCE, preset3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    preset5 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Preset$$serializer.INSTANCE, preset5);
                    i2 |= 4;
                }
            }
            i = i2;
            preset = preset3;
            sellRule = sellRule3;
            preset2 = preset5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TpslConfig(i, sellRule, preset, preset2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TpslConfig tpslConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tpslConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TpslConfig.write$Self$OKDex_dex_impl(tpslConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
