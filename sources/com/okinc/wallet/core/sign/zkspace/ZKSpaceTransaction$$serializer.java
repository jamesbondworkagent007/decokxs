package com.okinc.wallet.core.sign.zkspace;

import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ZKSpaceTransaction$$serializer implements GeneratedSerializer<ZKSpaceTransaction> {
    public static final int $stable;
    public static final ZKSpaceTransaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ZKSpaceTransaction$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ZKSpaceTransaction$$serializer zKSpaceTransaction$$serializer = new ZKSpaceTransaction$$serializer();
        INSTANCE = zKSpaceTransaction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.zkspace.ZKSpaceTransaction", zKSpaceTransaction$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("fee", false);
        pluginGeneratedSerialDescriptor.addElement("feeToken", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        ZKSpaceToken$$serializer zKSpaceToken$$serializer = ZKSpaceToken$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, zKSpaceToken$$serializer, stringSerializer, zKSpaceToken$$serializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ZKSpaceTransaction deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        ZKSpaceToken zKSpaceToken;
        String str2;
        String strDecodeStringElement2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        ZKSpaceToken zKSpaceToken2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            ZKSpaceToken$$serializer zKSpaceToken$$serializer = ZKSpaceToken$$serializer.INSTANCE;
            ZKSpaceToken zKSpaceToken3 = (ZKSpaceToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, zKSpaceToken$$serializer, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            ZKSpaceToken zKSpaceToken4 = (ZKSpaceToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, zKSpaceToken$$serializer, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            str2 = strDecodeStringElement4;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            zKSpaceToken = zKSpaceToken4;
            str6 = strDecodeStringElement9;
            zKSpaceToken2 = zKSpaceToken3;
            str4 = strDecodeStringElement7;
            str = strDecodeStringElement10;
            str3 = strDecodeStringElement8;
            strDecodeStringElement = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            i = 1023;
        } else {
            int i3 = 0;
            boolean z = true;
            ZKSpaceToken zKSpaceToken5 = null;
            String strDecodeStringElement11 = null;
            ZKSpaceToken zKSpaceToken6 = null;
            String strDecodeStringElement12 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 9;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 9;
                        break;
                    case 5:
                        zKSpaceToken5 = (ZKSpaceToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ZKSpaceToken$$serializer.INSTANCE, zKSpaceToken5);
                        i3 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 9;
                        break;
                    case 7:
                        i3 |= 128;
                        zKSpaceToken6 = (ZKSpaceToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, ZKSpaceToken$$serializer.INSTANCE, zKSpaceToken6);
                        i2 = 9;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 9;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement11;
            zKSpaceToken = zKSpaceToken6;
            str2 = strDecodeStringElement13;
            strDecodeStringElement2 = strDecodeStringElement14;
            i = i3;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement12;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement15;
            zKSpaceToken2 = zKSpaceToken5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ZKSpaceTransaction(i, str2, str5, strDecodeStringElement, str4, str3, zKSpaceToken2, str6, zKSpaceToken, str, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ZKSpaceTransaction zKSpaceTransaction) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(zKSpaceTransaction, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ZKSpaceTransaction.write$Self$OKWalletCore_wallet_lib(zKSpaceTransaction, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
