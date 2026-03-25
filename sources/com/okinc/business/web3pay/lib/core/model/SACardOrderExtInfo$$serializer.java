package com.okinc.business.web3pay.lib.core.model;

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
import kotlinx.serialization.internal.StringSerializer;
import o.C31267lqm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class SACardOrderExtInfo$$serializer implements GeneratedSerializer<SACardOrderExtInfo> {
    public static final int $stable;
    public static final SACardOrderExtInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SACardOrderExtInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SACardOrderExtInfo$$serializer sACardOrderExtInfo$$serializer = new SACardOrderExtInfo$$serializer();
        INSTANCE = sACardOrderExtInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo", sACardOrderExtInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("merchantName", false);
        pluginGeneratedSerialDescriptor.addElement("transactionAmountFiat", false);
        pluginGeneratedSerialDescriptor.addElement("acquirerAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fundDirection", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        SACardTransactionAmountFiat$$serializer sACardTransactionAmountFiat$$serializer = SACardTransactionAmountFiat$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, sACardTransactionAmountFiat$$serializer, BuiltinSerializersKt.getNullable(sACardTransactionAmountFiat$$serializer), BuiltinSerializersKt.getNullable(C31267lqm.copydefault)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SACardOrderExtInfo deserialize(@NotNull Decoder decoder) {
        int i;
        SACardTransactionAmountFiat sACardTransactionAmountFiat;
        SACardTransactionAmountFiat sACardTransactionAmountFiat2;
        String str;
        SaCardFundDirection saCardFundDirection;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SACardTransactionAmountFiat sACardTransactionAmountFiat3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            SACardTransactionAmountFiat$$serializer sACardTransactionAmountFiat$$serializer = SACardTransactionAmountFiat$$serializer.INSTANCE;
            SACardTransactionAmountFiat sACardTransactionAmountFiat4 = (SACardTransactionAmountFiat) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, sACardTransactionAmountFiat$$serializer, null);
            SACardTransactionAmountFiat sACardTransactionAmountFiat5 = (SACardTransactionAmountFiat) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, sACardTransactionAmountFiat$$serializer, null);
            str = strDecodeStringElement;
            saCardFundDirection = (SaCardFundDirection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C31267lqm.copydefault, null);
            sACardTransactionAmountFiat = sACardTransactionAmountFiat5;
            i = 15;
            sACardTransactionAmountFiat2 = sACardTransactionAmountFiat4;
        } else {
            int i2 = 0;
            boolean z = true;
            SACardTransactionAmountFiat sACardTransactionAmountFiat6 = null;
            String strDecodeStringElement2 = null;
            SaCardFundDirection saCardFundDirection2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sACardTransactionAmountFiat6 = (SACardTransactionAmountFiat) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SACardTransactionAmountFiat$$serializer.INSTANCE, sACardTransactionAmountFiat6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sACardTransactionAmountFiat3 = (SACardTransactionAmountFiat) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SACardTransactionAmountFiat$$serializer.INSTANCE, sACardTransactionAmountFiat3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    saCardFundDirection2 = (SaCardFundDirection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, C31267lqm.copydefault, saCardFundDirection2);
                    i2 |= 8;
                }
            }
            i = i2;
            sACardTransactionAmountFiat = sACardTransactionAmountFiat3;
            sACardTransactionAmountFiat2 = sACardTransactionAmountFiat6;
            str = strDecodeStringElement2;
            saCardFundDirection = saCardFundDirection2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SACardOrderExtInfo(i, str, sACardTransactionAmountFiat2, sACardTransactionAmountFiat, saCardFundDirection, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SACardOrderExtInfo sACardOrderExtInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sACardOrderExtInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SACardOrderExtInfo.KWHzl(sACardOrderExtInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
