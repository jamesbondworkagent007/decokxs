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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Response.TonProof> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer walletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer = new WalletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.TonProof", walletEvent$ConnectSuccess$Payload$Response$TonProof$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("proof", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Response.TonProof deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof proof;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            proof = (WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE, null);
            i = 3;
        } else {
            strDecodeStringElement = null;
            WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof proof2 = null;
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
                    proof2 = (WalletEvent.ConnectSuccess.Payload.Response.TonProof.Proof) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, WalletEvent$ConnectSuccess$Payload$Response$TonProof$Proof$$serializer.INSTANCE, proof2);
                    i2 |= 2;
                }
            }
            proof = proof2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Response.TonProof(i, strDecodeStringElement, proof, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Response.TonProof tonProof) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tonProof, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Response.TonProof.write$Self$OKWallet_wallet_impl(tonProof, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
