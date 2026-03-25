package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class WalletCoinTxHistoryReq$$serializer implements GeneratedSerializer<WalletCoinTxHistoryReq> {
    public static final int $stable;
    public static final WalletCoinTxHistoryReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletCoinTxHistoryReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletCoinTxHistoryReq$$serializer walletCoinTxHistoryReq$$serializer = new WalletCoinTxHistoryReq$$serializer();
        INSTANCE = walletCoinTxHistoryReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq", walletCoinTxHistoryReq$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("accountIds", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", false);
        pluginGeneratedSerialDescriptor.addElement("addressList", true);
        pluginGeneratedSerialDescriptor.addElement("lastRowId", false);
        pluginGeneratedSerialDescriptor.addElement("limit", false);
        pluginGeneratedSerialDescriptor.addElement("hideValuelessNft", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = WalletCoinTxHistoryReq.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], LongSerializer.INSTANCE, kSerializerArr[2], StringSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletCoinTxHistoryReq deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        String str;
        List list;
        long j;
        List list2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WalletCoinTxHistoryReq.$childSerializers;
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            list2 = list4;
            list = list3;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            str = strDecodeStringElement;
            i = iDecodeIntElement;
            i2 = 63;
            j = jDecodeLongElement;
        } else {
            String strDecodeStringElement2 = null;
            List list5 = null;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            long jDecodeLongElement2 = 0;
            List list6 = null;
            int iDecodeIntElement2 = 0;
            int i5 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list5);
                        i5 |= 1;
                        i4 = 5;
                        break;
                    case 1:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 = i5 | 2;
                        i5 = i3;
                        break;
                    case 2:
                        i5 |= 4;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list6);
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i3 = i5 | 16;
                        i5 = i3;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i3 = i5 | 32;
                        i5 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = iDecodeIntElement2;
            str = strDecodeStringElement2;
            list = list5;
            j = jDecodeLongElement2;
            list2 = list6;
            i2 = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletCoinTxHistoryReq(i2, list, j, list2, str, i, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletCoinTxHistoryReq walletCoinTxHistoryReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletCoinTxHistoryReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletCoinTxHistoryReq.write$Self$OKWallet_wallet_impl(walletCoinTxHistoryReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
