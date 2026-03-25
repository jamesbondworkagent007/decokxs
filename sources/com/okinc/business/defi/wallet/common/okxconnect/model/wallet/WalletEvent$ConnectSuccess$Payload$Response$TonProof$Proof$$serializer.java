package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer walletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer = new WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof", walletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("domain", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("payload", false);
        pluginGeneratedSerialDescriptor.addElement("signature", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE, LongSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof deserialize(@NotNull Decoder decoder) {
        WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain domain;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain domain2 = (WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            domain = domain2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            i = 15;
            j = jDecodeLongElement;
        } else {
            WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain domain3 = null;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    domain3 = (WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.Domain) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$Domain$$serializer.INSTANCE, domain3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            domain = domain3;
            strDecodeStringElement = strDecodeStringElement3;
            strDecodeStringElement2 = strDecodeStringElement4;
            i = i2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof(i, domain, j, strDecodeStringElement, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof proof) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(proof, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof.write$Self$OKWallet_wallet_impl(proof, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
