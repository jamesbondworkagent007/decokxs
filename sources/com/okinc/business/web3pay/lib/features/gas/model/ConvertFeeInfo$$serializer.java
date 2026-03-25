package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ConvertFeeInfo$$serializer implements GeneratedSerializer<ConvertFeeInfo> {
    public static final int $stable;
    public static final ConvertFeeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertFeeInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertFeeInfo$$serializer convertFeeInfo$$serializer = new ConvertFeeInfo$$serializer();
        INSTANCE = convertFeeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo", convertFeeInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("gas", false);
        pluginGeneratedSerialDescriptor.addElement("transactionFee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ConvertFeeInfo$Gas$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ConvertFeeInfo$TransactionFee$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertFeeInfo deserialize(@NotNull Decoder decoder) {
        ConvertFeeInfo.Gas gas;
        ConvertFeeInfo.TransactionFee transactionFee;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            gas = (ConvertFeeInfo.Gas) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ConvertFeeInfo$Gas$$serializer.INSTANCE, null);
            transactionFee = (ConvertFeeInfo.TransactionFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConvertFeeInfo$TransactionFee$$serializer.INSTANCE, null);
            i = 3;
        } else {
            gas = null;
            ConvertFeeInfo.TransactionFee transactionFee2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    gas = (ConvertFeeInfo.Gas) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ConvertFeeInfo$Gas$$serializer.INSTANCE, gas);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    transactionFee2 = (ConvertFeeInfo.TransactionFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConvertFeeInfo$TransactionFee$$serializer.INSTANCE, transactionFee2);
                    i2 |= 2;
                }
            }
            transactionFee = transactionFee2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertFeeInfo(i, gas, transactionFee, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertFeeInfo convertFeeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(convertFeeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertFeeInfo.write$Self$OKPayCore_web3pay_lib(convertFeeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
