package com.okinc.business.defi.wallet.tee.common.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class ADOriginData$$serializer implements GeneratedSerializer<ADOriginData> {
    public static final int $stable;
    public static final ADOriginData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ADOriginData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ADOriginData$$serializer aDOriginData$$serializer = new ADOriginData$$serializer();
        INSTANCE = aDOriginData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.tee.common.model.ADOriginData", aDOriginData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("teeId", false);
        pluginGeneratedSerialDescriptor.addElement("teeType", false);
        pluginGeneratedSerialDescriptor.addElement("identityPKHex", false);
        pluginGeneratedSerialDescriptor.addElement("expiredTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("command", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, longSerializer, longSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ADOriginData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        String str;
        int i2;
        long j;
        long j2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            j2 = jDecodeLongElement2;
            strDecodeStringElement = strDecodeStringElement4;
            i2 = iDecodeIntElement;
            j = jDecodeLongElement;
            i = 63;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement5 = null;
            strDecodeStringElement = null;
            int iDecodeIntElement2 = 0;
            int i4 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 = i4 | 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = i4 | 4;
                        break;
                    case 3:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 = i4 | 8;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 = i4 | 16;
                        break;
                    case 5:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = i4 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i4 = i3;
            }
            strDecodeStringElement2 = strDecodeStringElement6;
            i = i4;
            long j3 = jDecodeLongElement4;
            str = strDecodeStringElement5;
            i2 = iDecodeIntElement2;
            j = jDecodeLongElement3;
            j2 = j3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ADOriginData(i, str, i2, strDecodeStringElement, j, j2, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ADOriginData aDOriginData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aDOriginData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ADOriginData.write$Self$OKWallet_wallet_impl(aDOriginData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
