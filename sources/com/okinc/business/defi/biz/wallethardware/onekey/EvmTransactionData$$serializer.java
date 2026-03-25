package com.okinc.business.defi.biz.wallethardware.onekey;

import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.evm.SigData$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class EvmTransactionData$$serializer implements GeneratedSerializer<EvmTransactionData> {
    public static final int $stable;
    public static final EvmTransactionData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EvmTransactionData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EvmTransactionData$$serializer evmTransactionData$$serializer = new EvmTransactionData$$serializer();
        INSTANCE = evmTransactionData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData", evmTransactionData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("txType", false);
        pluginGeneratedSerialDescriptor.addElement("factionChainId", false);
        pluginGeneratedSerialDescriptor.addElement("sigChainId", false);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", false);
        pluginGeneratedSerialDescriptor.addElement("transaction", false);
        pluginGeneratedSerialDescriptor.addElement("signData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EvmTransactionData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, LongSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(SigData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EvmTransactionData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        SigData sigData;
        int i2;
        String str;
        BaseAccountTransaction baseAccountTransaction;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EvmTransactionData.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            baseAccountTransaction = (BaseAccountTransaction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            i2 = iDecodeIntElement;
            sigData = (SigData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SigData$$serializer.INSTANCE, null);
            str = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement2;
            i = 63;
            j = jDecodeLongElement;
        } else {
            BaseAccountTransaction baseAccountTransaction2 = null;
            strDecodeStringElement = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            SigData sigData2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        baseAccountTransaction2 = (BaseAccountTransaction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], baseAccountTransaction2);
                        break;
                    case 5:
                        i3 |= 32;
                        sigData2 = (SigData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SigData$$serializer.INSTANCE, sigData2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            sigData = sigData2;
            String str2 = strDecodeStringElement4;
            i2 = iDecodeIntElement2;
            long j2 = jDecodeLongElement2;
            str = str2;
            baseAccountTransaction = baseAccountTransaction2;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EvmTransactionData(i, i2, j, strDecodeStringElement, str, baseAccountTransaction, sigData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EvmTransactionData evmTransactionData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(evmTransactionData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EvmTransactionData.write$Self$OKWallet_wallet_impl(evmTransactionData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
