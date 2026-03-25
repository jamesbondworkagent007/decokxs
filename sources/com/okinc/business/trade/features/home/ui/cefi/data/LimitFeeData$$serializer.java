package com.okinc.business.trade.features.home.ui.cefi.data;

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
public final /* synthetic */ class LimitFeeData$$serializer implements GeneratedSerializer<LimitFeeData> {
    public static final int $stable;
    public static final LimitFeeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitFeeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitFeeData$$serializer limitFeeData$$serializer = new LimitFeeData$$serializer();
        INSTANCE = limitFeeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData", limitFeeData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("mevFeeData", true);
        pluginGeneratedSerialDescriptor.addElement("nonMevFeeData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        MevBasedFeeData$$serializer mevBasedFeeData$$serializer = MevBasedFeeData$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(mevBasedFeeData$$serializer), BuiltinSerializersKt.getNullable(mevBasedFeeData$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitFeeData deserialize(@NotNull Decoder decoder) {
        MevBasedFeeData mevBasedFeeData;
        MevBasedFeeData mevBasedFeeData2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MevBasedFeeData$$serializer mevBasedFeeData$$serializer = MevBasedFeeData$$serializer.INSTANCE;
            mevBasedFeeData2 = (MevBasedFeeData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, mevBasedFeeData$$serializer, null);
            mevBasedFeeData = (MevBasedFeeData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, mevBasedFeeData$$serializer, null);
            i = 3;
        } else {
            mevBasedFeeData = null;
            MevBasedFeeData mevBasedFeeData3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    mevBasedFeeData3 = (MevBasedFeeData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MevBasedFeeData$$serializer.INSTANCE, mevBasedFeeData3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    mevBasedFeeData = (MevBasedFeeData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MevBasedFeeData$$serializer.INSTANCE, mevBasedFeeData);
                    i2 |= 2;
                }
            }
            mevBasedFeeData2 = mevBasedFeeData3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitFeeData(i, mevBasedFeeData2, mevBasedFeeData, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitFeeData limitFeeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitFeeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitFeeData.write$Self$OKDex_dex_impl(limitFeeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
