package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ChainActivationInfo$$serializer implements GeneratedSerializer<ChainActivationInfo> {
    public static final int $stable;
    public static final ChainActivationInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChainActivationInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChainActivationInfo$$serializer chainActivationInfo$$serializer = new ChainActivationInfo$$serializer();
        INSTANCE = chainActivationInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.onchaintransaction.model.ChainActivationInfo", chainActivationInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("activated", false);
        pluginGeneratedSerialDescriptor.addElement("activationFeeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("activationFeeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("activationFeeAmount", false);
        pluginGeneratedSerialDescriptor.addElement("transactionFeeAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChainActivationInfo deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str3 = strDecodeStringElement;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            str4 = strDecodeStringElement2;
            i = 63;
            str = strDecodeStringElement3;
            iDecodeIntElement = iDecodeIntElement2;
            z = zDecodeBooleanElement;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String str5 = null;
            String strDecodeStringElement6 = null;
            int i2 = 0;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        i2 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        i2 |= 32;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement4;
            str2 = str5;
            str3 = strDecodeStringElement5;
            i = i2;
            boolean z3 = zDecodeBooleanElement2;
            str4 = strDecodeStringElement6;
            z = z3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChainActivationInfo(i, str3, z, iDecodeIntElement, str4, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChainActivationInfo chainActivationInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chainActivationInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChainActivationInfo.write$Self$OKPayCore_web3pay_lib(chainActivationInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
