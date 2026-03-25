package com.okinc.business.web3pay.lib.features.paytransaction.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class PurchaseOrderDetailResponse$$serializer implements GeneratedSerializer<PurchaseOrderDetailResponse> {
    public static final int $stable;
    public static final PurchaseOrderDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PurchaseOrderDetailResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PurchaseOrderDetailResponse$$serializer purchaseOrderDetailResponse$$serializer = new PurchaseOrderDetailResponse$$serializer();
        INSTANCE = purchaseOrderDetailResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse", purchaseOrderDetailResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("tradeOrderDTO", false);
        pluginGeneratedSerialDescriptor.addElement("balanceList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TradeOrderDTO$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(PurchaseOrderDetailResponse.$childSerializers[1])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PurchaseOrderDetailResponse deserialize(@NotNull Decoder decoder) {
        List list;
        TradeOrderDTO tradeOrderDTO;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PurchaseOrderDetailResponse.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            tradeOrderDTO = (TradeOrderDTO) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeOrderDTO$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            List list2 = null;
            TradeOrderDTO tradeOrderDTO2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    tradeOrderDTO2 = (TradeOrderDTO) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TradeOrderDTO$$serializer.INSTANCE, tradeOrderDTO2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            tradeOrderDTO = tradeOrderDTO2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PurchaseOrderDetailResponse(i, tradeOrderDTO, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PurchaseOrderDetailResponse purchaseOrderDetailResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(purchaseOrderDetailResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PurchaseOrderDetailResponse.write$Self$OKPayCore_web3pay_lib(purchaseOrderDetailResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
