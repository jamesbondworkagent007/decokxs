package com.okinc.business.defi.wallet.passkey.common.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class PasskeyWalletAddressBean$$serializer implements GeneratedSerializer<PasskeyWalletAddressBean> {
    public static final int $stable;
    public static final PasskeyWalletAddressBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PasskeyWalletAddressBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PasskeyWalletAddressBean$$serializer passkeyWalletAddressBean$$serializer = new PasskeyWalletAddressBean$$serializer();
        INSTANCE = passkeyWalletAddressBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAddressBean", passkeyWalletAddressBean$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("hasDeployed", false);
        pluginGeneratedSerialDescriptor.addElement("chainType", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, LongSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PasskeyWalletAddressBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        long jDecodeLongElement;
        String str;
        String strDecodeStringElement;
        String str2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str2 = str3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str = strDecodeStringElement3;
            z = zDecodeBooleanElement;
            i = 63;
            iDecodeIntElement = iDecodeIntElement2;
            jDecodeLongElement = jDecodeLongElement2;
        } else {
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            iDecodeIntElement = 0;
            boolean z3 = true;
            jDecodeLongElement = 0;
            String str4 = null;
            String strDecodeStringElement4 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = false;
                        i3 = 5;
                        break;
                    case 0:
                        z2 = false;
                        i4 |= 1;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str4);
                        i3 = 5;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 = i4 | 2;
                        i4 = i2;
                        break;
                    case 2:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i2 = i4 | 4;
                        i4 = i2;
                        break;
                    case 3:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 = i4 | 8;
                        i4 = i2;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i4 | 16;
                        i4 = i2;
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement4;
            str2 = str4;
            i = i4;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PasskeyWalletAddressBean(i, str2, z, iDecodeIntElement, jDecodeLongElement, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PasskeyWalletAddressBean passkeyWalletAddressBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(passkeyWalletAddressBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PasskeyWalletAddressBean.write$Self$OKWallet_wallet_impl(passkeyWalletAddressBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
