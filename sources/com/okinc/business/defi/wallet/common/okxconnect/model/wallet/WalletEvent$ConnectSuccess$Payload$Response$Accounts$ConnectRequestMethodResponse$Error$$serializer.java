package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer walletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer = new WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error", walletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.METHOD, false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement(Constants.IPC_BUNDLE_KEY_SEND_ERROR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, OKXConnectException$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        OKXConnectException oKXConnectException;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            str2 = strDecodeStringElement2;
            oKXConnectException = (OKXConnectException) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, null);
            str = strDecodeStringElement3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement4 = null;
            OKXConnectException oKXConnectException2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    oKXConnectException2 = (OKXConnectException) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, oKXConnectException2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            oKXConnectException = oKXConnectException2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error(i, str2, str, oKXConnectException, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error error) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(error, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error.write$Self$OKWallet_wallet_impl(error, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
