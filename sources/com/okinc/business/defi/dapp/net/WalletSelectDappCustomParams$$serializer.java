package com.okinc.business.defi.dapp.net;

import com.okinc.wallet.api.bean.DappSupportCheck;
import com.okinc.wallet.api.bean.DappSupportCheck$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class WalletSelectDappCustomParams$$serializer implements GeneratedSerializer<WalletSelectDappCustomParams> {
    public static final int $stable;
    public static final WalletSelectDappCustomParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletSelectDappCustomParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletSelectDappCustomParams$$serializer walletSelectDappCustomParams$$serializer = new WalletSelectDappCustomParams$$serializer();
        INSTANCE = walletSelectDappCustomParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams", walletSelectDappCustomParams$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("dappUrl", true);
        pluginGeneratedSerialDescriptor.addElement("dappId", true);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement("dappSupportCheck", true);
        pluginGeneratedSerialDescriptor.addElement("isDappBtc", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DappSupportCheck$$serializer.INSTANCE), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletSelectDappCustomParams deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        String str;
        DappSupportCheck dappSupportCheck;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            dappSupportCheck = (DappSupportCheck) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DappSupportCheck$$serializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            i = 31;
            str3 = str4;
            str2 = str5;
        } else {
            boolean zDecodeBooleanElement2 = false;
            String str6 = null;
            DappSupportCheck dappSupportCheck2 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    dappSupportCheck2 = (DappSupportCheck) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DappSupportCheck$$serializer.INSTANCE, dappSupportCheck2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            str = str6;
            dappSupportCheck = dappSupportCheck2;
            str2 = str7;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletSelectDappCustomParams(i, str3, str2, str, dappSupportCheck, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletSelectDappCustomParams walletSelectDappCustomParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletSelectDappCustomParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletSelectDappCustomParams.write$Self$OKDiscover_discover_impl(walletSelectDappCustomParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
