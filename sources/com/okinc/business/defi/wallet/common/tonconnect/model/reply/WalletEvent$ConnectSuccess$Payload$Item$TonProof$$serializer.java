package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Item.TonProof> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer walletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer = new WalletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ton_proof", walletEvent$ConnectSuccess$Payload$Item$TonProof$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("proof", false);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.ActionBar("name"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Item.TonProof deserialize(@NotNull Decoder decoder) {
        WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof proof;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            proof = (WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE, null);
        } else {
            proof = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    proof = (WalletEvent.ConnectSuccess.Payload.Item.TonProof.Proof) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE, proof);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Item.TonProof(i, proof, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Item.TonProof tonProof) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tonProof, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, WalletEvent$ConnectSuccess$Payload$Item$TonProof$Proof$$serializer.INSTANCE, tonProof.proof);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
