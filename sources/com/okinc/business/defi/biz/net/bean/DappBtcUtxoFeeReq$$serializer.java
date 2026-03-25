package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class DappBtcUtxoFeeReq$$serializer implements GeneratedSerializer<DappBtcUtxoFeeReq> {
    public static final int $stable;
    public static final DappBtcUtxoFeeReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappBtcUtxoFeeReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappBtcUtxoFeeReq$$serializer dappBtcUtxoFeeReq$$serializer = new DappBtcUtxoFeeReq$$serializer();
        INSTANCE = dappBtcUtxoFeeReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq", dappBtcUtxoFeeReq$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("hexStringList", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("utxoList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DappBtcUtxoFeeReq.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[1]), LongSerializer.INSTANCE, kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappBtcUtxoFeeReq deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        List list2;
        String str;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DappBtcUtxoFeeReq.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            str = str2;
            i = 15;
            list = list4;
            j = jDecodeLongElement;
        } else {
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            List list5 = null;
            String str3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            list2 = list5;
            str = str3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappBtcUtxoFeeReq(i, str, list, j, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappBtcUtxoFeeReq dappBtcUtxoFeeReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappBtcUtxoFeeReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappBtcUtxoFeeReq.write$Self$OKWallet_wallet_impl(dappBtcUtxoFeeReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
