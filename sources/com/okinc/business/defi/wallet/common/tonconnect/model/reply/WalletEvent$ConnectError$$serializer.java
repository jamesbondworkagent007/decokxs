package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletEvent$ConnectError$$serializer implements GeneratedSerializer<WalletEvent.ConnectError> {
    public static final int $stable;
    public static final WalletEvent$ConnectError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectError$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectError$$serializer walletEvent$ConnectError$$serializer = new WalletEvent$ConnectError$$serializer();
        INSTANCE = walletEvent$ConnectError$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("connect_error", walletEvent$ConnectError$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("payload", true);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer.ActionBar("event"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ErrorInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectError deserialize(@NotNull Decoder decoder) {
        ErrorInfo errorInfo;
        int i;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            errorInfo = (ErrorInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, null);
            i = 3;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            ErrorInfo errorInfo2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    errorInfo2 = (ErrorInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, errorInfo2);
                    i2 |= 2;
                }
            }
            errorInfo = errorInfo2;
            i = i2;
            jDecodeLongElement = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectError(i, jDecodeLongElement, errorInfo, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectError connectError) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(connectError, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectError.write$Self$OKWallet_wallet_impl(connectError, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
