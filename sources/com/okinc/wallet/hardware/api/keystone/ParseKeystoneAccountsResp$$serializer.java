package com.okinc.wallet.hardware.api.keystone;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class ParseKeystoneAccountsResp$$serializer implements GeneratedSerializer<ParseKeystoneAccountsResp> {
    public static final int $stable;
    public static final ParseKeystoneAccountsResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ParseKeystoneAccountsResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ParseKeystoneAccountsResp$$serializer parseKeystoneAccountsResp$$serializer = new ParseKeystoneAccountsResp$$serializer();
        INSTANCE = parseKeystoneAccountsResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp", parseKeystoneAccountsResp$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("progress", false);
        pluginGeneratedSerialDescriptor.addElement("multiAccount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(KeystoneMultiAccount$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ParseKeystoneAccountsResp deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        KeystoneMultiAccount keystoneMultiAccount;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            keystoneMultiAccount = (KeystoneMultiAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, KeystoneMultiAccount$$serializer.INSTANCE, null);
            i = 3;
        } else {
            KeystoneMultiAccount keystoneMultiAccount2 = null;
            iDecodeIntElement = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    keystoneMultiAccount2 = (KeystoneMultiAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, KeystoneMultiAccount$$serializer.INSTANCE, keystoneMultiAccount2);
                    i2 |= 2;
                }
            }
            keystoneMultiAccount = keystoneMultiAccount2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ParseKeystoneAccountsResp(i, iDecodeIntElement, keystoneMultiAccount, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ParseKeystoneAccountsResp parseKeystoneAccountsResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(parseKeystoneAccountsResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ParseKeystoneAccountsResp.write$Self$OKHardwareWallet_hardware_wallet_api(parseKeystoneAccountsResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
