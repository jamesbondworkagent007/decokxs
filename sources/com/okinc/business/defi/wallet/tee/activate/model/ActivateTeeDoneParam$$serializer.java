package com.okinc.business.defi.wallet.tee.activate.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ActivateTeeDoneParam$$serializer implements GeneratedSerializer<ActivateTeeDoneParam> {
    public static final int $stable;
    public static final ActivateTeeDoneParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ActivateTeeDoneParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ActivateTeeDoneParam$$serializer activateTeeDoneParam$$serializer = new ActivateTeeDoneParam$$serializer();
        INSTANCE = activateTeeDoneParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeDoneParam", activateTeeDoneParam$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("accountName", false);
        pluginGeneratedSerialDescriptor.addElement("walletAvatarStr", false);
        pluginGeneratedSerialDescriptor.addElement("expireTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("expirePeriodDay", false);
        pluginGeneratedSerialDescriptor.addElement("autoRenew", false);
        pluginGeneratedSerialDescriptor.addElement("nftAssets", false);
        pluginGeneratedSerialDescriptor.addElement("pathSource", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, longSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ActivateTeeDoneParam deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        long j;
        long j2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = strDecodeStringElement4;
            z = zDecodeBooleanElement;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            str = strDecodeStringElement2;
            i = 127;
            str3 = strDecodeStringElement3;
        } else {
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement2 = false;
            int i3 = 0;
            boolean z2 = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                        break;
                    case 2:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 = i3 | 4;
                        break;
                    case 3:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        break;
                    case 5:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i3 | 32;
                        break;
                    case 6:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i3 | 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i3 = i2;
            }
            strDecodeStringElement = strDecodeStringElement7;
            i = i3;
            String str4 = strDecodeStringElement8;
            str = strDecodeStringElement5;
            long j3 = jDecodeLongElement4;
            str2 = str4;
            z = zDecodeBooleanElement2;
            str3 = strDecodeStringElement6;
            j = jDecodeLongElement3;
            j2 = j3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ActivateTeeDoneParam(i, str, str3, j, j2, z, str2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ActivateTeeDoneParam activateTeeDoneParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(activateTeeDoneParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ActivateTeeDoneParam.write$Self$OKWallet_wallet_impl(activateTeeDoneParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
