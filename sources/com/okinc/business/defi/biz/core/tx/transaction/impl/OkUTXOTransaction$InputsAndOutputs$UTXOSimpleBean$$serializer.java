package com.okinc.business.defi.biz.core.tx.transaction.impl;

import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer implements GeneratedSerializer<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> {
    public static final int $stable;
    public static final OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer = new OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer();
        INSTANCE = okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean", okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = 3;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            strDecodeStringElement2 = strDecodeStringElement3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean(i, strDecodeStringElement, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean uTXOSimpleBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXOSimpleBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean.write$Self$OKWallet_wallet_impl(uTXOSimpleBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
