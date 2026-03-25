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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class LimitPreset$$serializer implements GeneratedSerializer<LimitPreset> {
    public static final int $stable;
    public static final LimitPreset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitPreset$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitPreset$$serializer limitPreset$$serializer = new LimitPreset$$serializer();
        INSTANCE = limitPreset$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.tee.domain.model.LimitPreset", limitPreset$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("presetType", true);
        pluginGeneratedSerialDescriptor.addElement("buyPreset", true);
        pluginGeneratedSerialDescriptor.addElement("sellPreset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        Preset$$serializer preset$$serializer = Preset$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(preset$$serializer), BuiltinSerializersKt.getNullable(preset$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitPreset deserialize(@NotNull Decoder decoder) {
        int i;
        Preset preset;
        String str;
        Preset preset2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Preset preset3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            Preset$$serializer preset$$serializer = Preset$$serializer.INSTANCE;
            Preset preset4 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, preset$$serializer, null);
            str = str2;
            preset2 = (Preset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, preset$$serializer, null);
            i = 7;
            preset = preset4;
        } else {
            int i2 = 0;
            boolean z = true;
            String str3 = null;
            Preset preset5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
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
            str = str3;
            preset2 = preset5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitPreset(i, str, preset, preset2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitPreset limitPreset) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitPreset, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitPreset.write$Self$OKDex_dex_impl(limitPreset, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
