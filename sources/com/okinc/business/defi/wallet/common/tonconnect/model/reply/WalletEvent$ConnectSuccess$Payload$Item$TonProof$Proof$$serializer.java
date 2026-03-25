package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer walletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer = new WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof", walletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("domain", false);
        pluginGeneratedSerialDescriptor.addElement("payload", false);
        pluginGeneratedSerialDescriptor.addElement("signature", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain domain;
        String strDecodeStringElement;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain domain2 = (WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE, null);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            domain = domain2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = str3;
            i = 15;
            j = jDecodeLongElement;
        } else {
            int i2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain domain3 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    domain3 = (WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.Domain) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$Domain$$serializer.INSTANCE, domain3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            domain = domain3;
            strDecodeStringElement = strDecodeStringElement2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof(i, j, domain, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof proof) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(proof, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof.write$Self$OKWallet_wallet_impl(proof, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
