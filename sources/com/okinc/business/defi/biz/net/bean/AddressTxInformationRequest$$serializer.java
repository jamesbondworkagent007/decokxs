package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class AddressTxInformationRequest$$serializer implements GeneratedSerializer<AddressTxInformationRequest> {
    public static final int $stable;
    public static final AddressTxInformationRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressTxInformationRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressTxInformationRequest$$serializer addressTxInformationRequest$$serializer = new AddressTxInformationRequest$$serializer();
        INSTANCE = addressTxInformationRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.AddressTxInformationRequest", addressTxInformationRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("txHash", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressTxInformationRequest deserialize(@NotNull Decoder decoder) {
        String str;
        String strDecodeStringElement;
        int i;
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            str = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            i = iDecodeIntElement;
            j = jDecodeLongElement;
            i2 = 15;
        } else {
            String strDecodeStringElement3 = null;
            int i3 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i3 |= 8;
                }
            }
            str = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
            i = iDecodeIntElement2;
            j = jDecodeLongElement2;
            i2 = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressTxInformationRequest(i2, str, j, i, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressTxInformationRequest addressTxInformationRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressTxInformationRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressTxInformationRequest.write$Self$OKWallet_wallet_impl(addressTxInformationRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
