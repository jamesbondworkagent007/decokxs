package com.okinc.business.dex.trade.copytrading.home.data;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class PnLInfo$$serializer implements GeneratedSerializer<PnLInfo> {
    public static final int $stable;
    public static final PnLInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PnLInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PnLInfo$$serializer pnLInfo$$serializer = new PnLInfo$$serializer();
        INSTANCE = pnLInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.copytrading.home.data.PnLInfo", pnLInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("realizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("unrealizedPnl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        PnLDetail$$serializer pnLDetail$$serializer = PnLDetail$$serializer.INSTANCE;
        return new KSerializer[]{pnLDetail$$serializer, pnLDetail$$serializer, pnLDetail$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PnLInfo deserialize(@NotNull Decoder decoder) {
        int i;
        PnLDetail pnLDetail;
        PnLDetail pnLDetail2;
        PnLDetail pnLDetail3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PnLDetail pnLDetail4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PnLDetail$$serializer pnLDetail$$serializer = PnLDetail$$serializer.INSTANCE;
            PnLDetail pnLDetail5 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, pnLDetail$$serializer, null);
            PnLDetail pnLDetail6 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, pnLDetail$$serializer, null);
            pnLDetail2 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, pnLDetail$$serializer, null);
            i = 7;
            pnLDetail3 = pnLDetail5;
            pnLDetail = pnLDetail6;
        } else {
            int i2 = 0;
            boolean z = true;
            PnLDetail pnLDetail7 = null;
            PnLDetail pnLDetail8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    pnLDetail8 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PnLDetail$$serializer.INSTANCE, pnLDetail8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pnLDetail4 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PnLDetail$$serializer.INSTANCE, pnLDetail4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    pnLDetail7 = (PnLDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PnLDetail$$serializer.INSTANCE, pnLDetail7);
                    i2 |= 4;
                }
            }
            i = i2;
            pnLDetail = pnLDetail4;
            pnLDetail2 = pnLDetail7;
            pnLDetail3 = pnLDetail8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PnLInfo(i, pnLDetail3, pnLDetail, pnLDetail2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PnLInfo pnLInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pnLInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PnLInfo.write$Self$OKDex_dex_impl(pnLInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
