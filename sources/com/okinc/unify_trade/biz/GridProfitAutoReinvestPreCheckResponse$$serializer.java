package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class GridProfitAutoReinvestPreCheckResponse$$serializer implements GeneratedSerializer<GridProfitAutoReinvestPreCheckResponse> {
    public static final int $stable;
    public static final GridProfitAutoReinvestPreCheckResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GridProfitAutoReinvestPreCheckResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GridProfitAutoReinvestPreCheckResponse$$serializer gridProfitAutoReinvestPreCheckResponse$$serializer = new GridProfitAutoReinvestPreCheckResponse$$serializer();
        INSTANCE = gridProfitAutoReinvestPreCheckResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse", gridProfitAutoReinvestPreCheckResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("profitAutoReinvest", false);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(GridProfitAutoReinvestResponse$$serializer.INSTANCE), StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GridProfitAutoReinvestPreCheckResponse deserialize(@NotNull Decoder decoder) {
        GridProfitAutoReinvestResponse gridProfitAutoReinvestResponse;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            gridProfitAutoReinvestResponse = (GridProfitAutoReinvestResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GridProfitAutoReinvestResponse$$serializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = 3;
        } else {
            gridProfitAutoReinvestResponse = null;
            String strDecodeStringElement2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    gridProfitAutoReinvestResponse = (GridProfitAutoReinvestResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GridProfitAutoReinvestResponse$$serializer.INSTANCE, gridProfitAutoReinvestResponse);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GridProfitAutoReinvestPreCheckResponse(i, gridProfitAutoReinvestResponse, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GridProfitAutoReinvestPreCheckResponse gridProfitAutoReinvestPreCheckResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(gridProfitAutoReinvestPreCheckResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GridProfitAutoReinvestPreCheckResponse.write$Self$OKTradeCore_trade_core(gridProfitAutoReinvestPreCheckResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
