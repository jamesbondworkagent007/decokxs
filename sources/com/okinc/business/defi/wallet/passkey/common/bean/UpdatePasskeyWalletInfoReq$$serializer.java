package com.okinc.business.defi.wallet.passkey.common.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class UpdatePasskeyWalletInfoReq$$serializer implements GeneratedSerializer<UpdatePasskeyWalletInfoReq> {
    public static final int $stable;
    public static final UpdatePasskeyWalletInfoReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UpdatePasskeyWalletInfoReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UpdatePasskeyWalletInfoReq$$serializer updatePasskeyWalletInfoReq$$serializer = new UpdatePasskeyWalletInfoReq$$serializer();
        INSTANCE = updatePasskeyWalletInfoReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.passkey.common.bean.UpdatePasskeyWalletInfoReq", updatePasskeyWalletInfoReq$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("accountType", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("enableLimitOrder", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UpdatePasskeyWalletInfoReq deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = iDecodeIntElement;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            i2 = 7;
            str = strDecodeStringElement;
        } else {
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool2);
                    i3 |= 4;
                }
            }
            i = iDecodeIntElement2;
            bool = bool2;
            str = strDecodeStringElement2;
            i2 = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UpdatePasskeyWalletInfoReq(i2, i, str, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UpdatePasskeyWalletInfoReq updatePasskeyWalletInfoReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(updatePasskeyWalletInfoReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UpdatePasskeyWalletInfoReq.write$Self$OKWallet_wallet_impl(updatePasskeyWalletInfoReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
