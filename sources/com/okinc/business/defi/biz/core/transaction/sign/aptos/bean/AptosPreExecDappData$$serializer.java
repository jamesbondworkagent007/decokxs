package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class AptosPreExecDappData$$serializer implements GeneratedSerializer<AptosPreExecDappData> {
    public static final int $stable;
    public static final AptosPreExecDappData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AptosPreExecDappData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AptosPreExecDappData$$serializer aptosPreExecDappData$$serializer = new AptosPreExecDappData$$serializer();
        INSTANCE = aptosPreExecDappData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData", aptosPreExecDappData$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("transaction", false);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AptosPreExecDappData$Transaction$$serializer.INSTANCE, AptosPreExecDappData$Data$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AptosPreExecDappData deserialize(@NotNull Decoder decoder) {
        AptosPreExecDappData.Transaction transaction;
        AptosPreExecDappData.Data data;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            transaction = (AptosPreExecDappData.Transaction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AptosPreExecDappData$Transaction$$serializer.INSTANCE, null);
            data = (AptosPreExecDappData.Data) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, AptosPreExecDappData$Data$$serializer.INSTANCE, null);
            i = 3;
        } else {
            transaction = null;
            AptosPreExecDappData.Data data2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    transaction = (AptosPreExecDappData.Transaction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AptosPreExecDappData$Transaction$$serializer.INSTANCE, transaction);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    data2 = (AptosPreExecDappData.Data) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, AptosPreExecDappData$Data$$serializer.INSTANCE, data2);
                    i2 |= 2;
                }
            }
            data = data2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AptosPreExecDappData(i, transaction, data, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AptosPreExecDappData aptosPreExecDappData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aptosPreExecDappData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AptosPreExecDappData.write$Self$OKWallet_wallet_impl(aptosPreExecDappData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
