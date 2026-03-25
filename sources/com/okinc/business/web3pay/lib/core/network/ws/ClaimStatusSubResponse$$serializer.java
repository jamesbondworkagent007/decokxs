package com.okinc.business.web3pay.lib.core.network.ws;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ClaimStatusSubResponse$$serializer implements GeneratedSerializer<ClaimStatusSubResponse> {
    public static final int $stable;
    public static final ClaimStatusSubResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ClaimStatusSubResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ClaimStatusSubResponse$$serializer claimStatusSubResponse$$serializer = new ClaimStatusSubResponse$$serializer();
        INSTANCE = claimStatusSubResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.core.network.ws.ClaimStatusSubResponse", claimStatusSubResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("opType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ClaimStatusSubResponse deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str4 = strDecodeStringElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            str3 = strDecodeStringElement5;
            str = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 63;
        } else {
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = i3 | 4;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        break;
                    case 4:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i2 = i3 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i3 = i2;
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i3;
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ClaimStatusSubResponse(i, str4, str2, strDecodeStringElement, str3, str, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ClaimStatusSubResponse claimStatusSubResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(claimStatusSubResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ClaimStatusSubResponse.write$Self$OKPayCore_web3pay_lib(claimStatusSubResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
