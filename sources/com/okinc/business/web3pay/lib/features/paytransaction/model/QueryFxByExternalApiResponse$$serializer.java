package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class QueryFxByExternalApiResponse$$serializer implements GeneratedSerializer<QueryFxByExternalApiResponse> {
    public static final int $stable;
    public static final QueryFxByExternalApiResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QueryFxByExternalApiResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QueryFxByExternalApiResponse$$serializer queryFxByExternalApiResponse$$serializer = new QueryFxByExternalApiResponse$$serializer();
        INSTANCE = queryFxByExternalApiResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.paytransaction.model.QueryFxByExternalApiResponse", queryFxByExternalApiResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("exchangeRate", false);
        pluginGeneratedSerialDescriptor.addElement("rateObj", false);
        pluginGeneratedSerialDescriptor.addElement("expiryTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, RateObj$$serializer.INSTANCE, LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QueryFxByExternalApiResponse deserialize(@NotNull Decoder decoder) {
        int i;
        RateObj rateObj;
        long jDecodeLongElement;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        RateObj rateObj2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            i = 7;
            rateObj = (RateObj) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RateObj$$serializer.INSTANCE, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
        } else {
            long jDecodeLongElement2 = 0;
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    rateObj2 = (RateObj) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RateObj$$serializer.INSTANCE, rateObj2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            rateObj = rateObj2;
            jDecodeLongElement = jDecodeLongElement2;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QueryFxByExternalApiResponse(i, strDecodeStringElement, rateObj, jDecodeLongElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QueryFxByExternalApiResponse queryFxByExternalApiResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(queryFxByExternalApiResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QueryFxByExternalApiResponse.write$Self$OKPayCore_web3pay_lib(queryFxByExternalApiResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
