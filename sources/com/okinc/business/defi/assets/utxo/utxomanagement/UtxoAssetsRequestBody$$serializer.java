package com.okinc.business.defi.assets.utxo.utxomanagement;

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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class UtxoAssetsRequestBody$$serializer implements GeneratedSerializer<UtxoAssetsRequestBody> {
    public static final int $stable;
    public static final UtxoAssetsRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UtxoAssetsRequestBody$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UtxoAssetsRequestBody$$serializer utxoAssetsRequestBody$$serializer = new UtxoAssetsRequestBody$$serializer();
        INSTANCE = utxoAssetsRequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetsRequestBody", utxoAssetsRequestBody$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("txHash", false);
        pluginGeneratedSerialDescriptor.addElement("vout", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, LongSerializer.INSTANCE, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UtxoAssetsRequestBody deserialize(@NotNull Decoder decoder) {
        String str;
        int iDecodeIntElement;
        String strDecodeStringElement;
        int i;
        int i2;
        long j;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            str = strDecodeStringElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            i2 = iDecodeIntElement2;
            j = jDecodeLongElement;
        } else {
            String strDecodeStringElement3 = null;
            int i4 = 0;
            int iDecodeIntElement3 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 = i4 | 2;
                    } else if (iDecodeElementIndex == 2) {
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 = i4 | 4;
                    } else if (iDecodeElementIndex == 3) {
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i3 = i4 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 = i4 | 16;
                    }
                    i4 = i3;
                } else {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i4 |= 1;
                }
            }
            str = strDecodeStringElement3;
            iDecodeIntElement = iDecodeIntElement4;
            strDecodeStringElement = strDecodeStringElement4;
            i = i4;
            i2 = iDecodeIntElement3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UtxoAssetsRequestBody(i, str, i2, j, iDecodeIntElement, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UtxoAssetsRequestBody utxoAssetsRequestBody) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(utxoAssetsRequestBody, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UtxoAssetsRequestBody.OLrzqt(utxoAssetsRequestBody, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
