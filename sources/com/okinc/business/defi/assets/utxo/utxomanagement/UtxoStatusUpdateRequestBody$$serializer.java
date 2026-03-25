package com.okinc.business.defi.assets.utxo.utxomanagement;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class UtxoStatusUpdateRequestBody$$serializer implements GeneratedSerializer<UtxoStatusUpdateRequestBody> {
    public static final int $stable;
    public static final UtxoStatusUpdateRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UtxoStatusUpdateRequestBody$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UtxoStatusUpdateRequestBody$$serializer utxoStatusUpdateRequestBody$$serializer = new UtxoStatusUpdateRequestBody$$serializer();
        INSTANCE = utxoStatusUpdateRequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateRequestBody", utxoStatusUpdateRequestBody$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("utxoList", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("spentStatus", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(UtxoStatusUpdateRequestBody.$childSerializers[0]), StringSerializer.INSTANCE, IntSerializer.INSTANCE, LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UtxoStatusUpdateRequestBody deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        List list;
        long jDecodeLongElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = UtxoStatusUpdateRequestBody.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            list = list2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            i = 15;
        } else {
            String strDecodeStringElement2 = null;
            boolean z = true;
            int i2 = 0;
            long jDecodeLongElement2 = 0;
            List list3 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            iDecodeIntElement = iDecodeIntElement2;
            list = list3;
            jDecodeLongElement = jDecodeLongElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UtxoStatusUpdateRequestBody(i, list, strDecodeStringElement, iDecodeIntElement, jDecodeLongElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(utxoStatusUpdateRequestBody, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UtxoStatusUpdateRequestBody.AEQbTJ(utxoStatusUpdateRequestBody, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
