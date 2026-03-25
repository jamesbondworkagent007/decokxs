package com.okinc.business.defi.wallet.common.tonconnect.model;

import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.okinc.wallet.core.sign.ton.X25519KeyPair$$serializer;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppSession$$serializer implements GeneratedSerializer<DAppSession> {
    public static final int $stable;
    public static final DAppSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppSession$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppSession$$serializer dAppSession$$serializer = new DAppSession$$serializer();
        INSTANCE = dAppSession$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession", dAppSession$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(CoreNetworkModuleKt.KEY_CLIENT_ID, false);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("network", false);
        pluginGeneratedSerialDescriptor.addElement("keyPair", false);
        pluginGeneratedSerialDescriptor.addElement("manifest", false);
        pluginGeneratedSerialDescriptor.addElement("origin", true);
        pluginGeneratedSerialDescriptor.addElement("lastActiveTimestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DAppSession.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], X25519KeyPair$$serializer.INSTANCE, DAppManifest$$serializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppSession deserialize(@NotNull Decoder decoder) {
        int i;
        X25519KeyPair x25519KeyPair;
        String str;
        Long l;
        TonNetwork tonNetwork;
        DAppManifest dAppManifest;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DAppSession.$childSerializers;
        X25519KeyPair x25519KeyPair2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            TonNetwork tonNetwork2 = (TonNetwork) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            X25519KeyPair x25519KeyPair3 = (X25519KeyPair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, null);
            DAppManifest dAppManifest2 = (DAppManifest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DAppManifest$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            tonNetwork = tonNetwork2;
            str = strDecodeStringElement;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, null);
            str2 = strDecodeStringElement3;
            x25519KeyPair = x25519KeyPair3;
            dAppManifest = dAppManifest2;
            str3 = strDecodeStringElement2;
            i = 127;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement4 = null;
            Long l2 = null;
            DAppManifest dAppManifest3 = null;
            TonNetwork tonNetwork3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        i2 |= 4;
                        tonNetwork3 = (TonNetwork) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tonNetwork3);
                        break;
                    case 3:
                        i2 |= 8;
                        x25519KeyPair2 = (X25519KeyPair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, x25519KeyPair2);
                        break;
                    case 4:
                        i2 |= 16;
                        dAppManifest3 = (DAppManifest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DAppManifest$$serializer.INSTANCE, dAppManifest3);
                        break;
                    case 5:
                        i2 |= 32;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i2 |= 64;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            DAppManifest dAppManifest4 = dAppManifest3;
            x25519KeyPair = x25519KeyPair2;
            str = strDecodeStringElement6;
            l = l2;
            tonNetwork = tonNetwork3;
            dAppManifest = dAppManifest4;
            String str4 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            str3 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppSession(i, str, str3, tonNetwork, x25519KeyPair, dAppManifest, str2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppSession.write$Self$OKWallet_wallet_impl(dAppSession, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
