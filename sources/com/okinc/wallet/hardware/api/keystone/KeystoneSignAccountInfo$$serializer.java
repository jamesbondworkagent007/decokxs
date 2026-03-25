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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class KeystoneSignAccountInfo$$serializer implements GeneratedSerializer<KeystoneSignAccountInfo> {
    public static final int $stable;
    public static final KeystoneSignAccountInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private KeystoneSignAccountInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        KeystoneSignAccountInfo$$serializer keystoneSignAccountInfo$$serializer = new KeystoneSignAccountInfo$$serializer();
        INSTANCE = keystoneSignAccountInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo", keystoneSignAccountInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("requestId", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("addressPath", false);
        pluginGeneratedSerialDescriptor.addElement("mfp", false);
        pluginGeneratedSerialDescriptor.addElement("psbt", true);
        pluginGeneratedSerialDescriptor.addElement("signType", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = KeystoneSignAccountInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(KeystoneTokenInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final KeystoneSignAccountInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        KeystoneEvmSignType keystoneEvmSignType;
        int i;
        String str;
        String str2;
        KeystoneTokenInfo keystoneTokenInfo;
        String str3;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = KeystoneSignAccountInfo.$childSerializers;
        int i2 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            keystoneEvmSignType = (KeystoneEvmSignType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            keystoneTokenInfo = (KeystoneTokenInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, KeystoneTokenInfo$$serializer.INSTANCE, null);
            strDecodeStringElement = strDecodeStringElement5;
            str = str4;
            str3 = strDecodeStringElement4;
            j = jDecodeLongElement;
            str2 = strDecodeStringElement3;
            i = 127;
        } else {
            long jDecodeLongElement2 = 0;
            int i3 = 0;
            boolean z = true;
            KeystoneEvmSignType keystoneEvmSignType2 = null;
            String str5 = null;
            strDecodeStringElement = null;
            KeystoneTokenInfo keystoneTokenInfo2 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        i3 |= 2;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        break;
                    case 2:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        i3 |= 16;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        keystoneEvmSignType2 = (KeystoneEvmSignType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], keystoneEvmSignType2);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        keystoneTokenInfo2 = (KeystoneTokenInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, KeystoneTokenInfo$$serializer.INSTANCE, keystoneTokenInfo2);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            keystoneEvmSignType = keystoneEvmSignType2;
            i = i3;
            KeystoneTokenInfo keystoneTokenInfo3 = keystoneTokenInfo2;
            str = str5;
            str2 = strDecodeStringElement6;
            keystoneTokenInfo = keystoneTokenInfo3;
            str3 = strDecodeStringElement2;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new KeystoneSignAccountInfo(i, str2, j, str3, strDecodeStringElement, str, keystoneEvmSignType, keystoneTokenInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull KeystoneSignAccountInfo keystoneSignAccountInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(keystoneSignAccountInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KeystoneSignAccountInfo.write$Self$OKHardwareWallet_hardware_wallet_api(keystoneSignAccountInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
