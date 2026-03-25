package com.okinc.business.dex.api.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ChainRequest$$serializer implements GeneratedSerializer<ChainRequest> {
    public static final int $stable;
    public static final ChainRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChainRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChainRequest$$serializer chainRequest$$serializer = new ChainRequest$$serializer();
        INSTANCE = chainRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.api.bean.ChainRequest", chainRequest$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("fromCoinInfo", true);
        pluginGeneratedSerialDescriptor.addElement("toCoinInfo", true);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CoinInfo$$serializer coinInfo$$serializer = CoinInfo$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(coinInfo$$serializer), BuiltinSerializersKt.getNullable(coinInfo$$serializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChainRequest deserialize(@NotNull Decoder decoder) {
        int i;
        CoinInfo coinInfo;
        String strDecodeStringElement;
        CoinInfo coinInfo2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CoinInfo coinInfo3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            CoinInfo$$serializer coinInfo$$serializer = CoinInfo$$serializer.INSTANCE;
            CoinInfo coinInfo4 = (CoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, coinInfo$$serializer, null);
            str = strDecodeStringElement2;
            coinInfo = (CoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, coinInfo$$serializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            coinInfo2 = coinInfo4;
            str2 = strDecodeStringElement3;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement4 = null;
            CoinInfo coinInfo5 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    coinInfo5 = (CoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CoinInfo$$serializer.INSTANCE, coinInfo5);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    coinInfo3 = (CoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CoinInfo$$serializer.INSTANCE, coinInfo3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            coinInfo = coinInfo3;
            strDecodeStringElement = strDecodeStringElement4;
            coinInfo2 = coinInfo5;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChainRequest(i, str, str2, coinInfo2, coinInfo, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChainRequest chainRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chainRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChainRequest.write$Self$OKDex_dex_api(chainRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
