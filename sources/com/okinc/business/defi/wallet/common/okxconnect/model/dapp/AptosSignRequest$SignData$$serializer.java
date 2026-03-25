package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AptosSignRequest$SignData$$serializer implements GeneratedSerializer<AptosSignRequest.SignData> {
    public static final int $stable;
    public static final AptosSignRequest$SignData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AptosSignRequest$SignData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AptosSignRequest$SignData$$serializer aptosSignRequest$SignData$$serializer = new AptosSignRequest$SignData$$serializer();
        INSTANCE = aptosSignRequest$SignData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.SignData", aptosSignRequest$SignData$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement(MimeTypes.BASE_TYPE_APPLICATION, true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("message", true);
        pluginGeneratedSerialDescriptor.addElement("nonce", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AptosSignRequest.SignData deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        String str;
        String str2;
        Boolean bool2;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            bool = bool7;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            i = 31;
            bool3 = bool5;
            bool2 = bool6;
        } else {
            int i2 = 0;
            boolean z = true;
            String str3 = null;
            String str4 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool9);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool8);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str4);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str3);
                    i2 |= 16;
                }
            }
            i = i2;
            bool = bool4;
            str = str3;
            str2 = str4;
            bool2 = bool8;
            bool3 = bool9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AptosSignRequest.SignData(i, bool3, bool2, bool, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AptosSignRequest.SignData signData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AptosSignRequest.SignData.write$Self$OKWallet_wallet_impl(signData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
