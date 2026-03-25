package com.okinc.crcore.coreapi.net.responsebean.bsc;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TradeSuggestionResponseBean$$serializer implements GeneratedSerializer<TradeSuggestionResponseBean> {
    public static final int $stable;
    public static final TradeSuggestionResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeSuggestionResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeSuggestionResponseBean$$serializer tradeSuggestionResponseBean$$serializer = new TradeSuggestionResponseBean$$serializer();
        INSTANCE = tradeSuggestionResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean", tradeSuggestionResponseBean$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("multipleCurrencyEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("stableCoinEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("paymentChannels", false);
        pluginGeneratedSerialDescriptor.addElement("nativePaymentAvailable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TradeSuggestionResponseBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, BaseCurrencyResponseBean$$serializer.INSTANCE, QuoteCurrencyResponseBean$$serializer.INSTANCE, kSerializerArr[4], BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeSuggestionResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        boolean z2;
        List list;
        BaseCurrencyResponseBean baseCurrencyResponseBean;
        Boolean bool;
        QuoteCurrencyResponseBean quoteCurrencyResponseBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeSuggestionResponseBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            BaseCurrencyResponseBean baseCurrencyResponseBean2 = (BaseCurrencyResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseCurrencyResponseBean$$serializer.INSTANCE, null);
            QuoteCurrencyResponseBean quoteCurrencyResponseBean2 = (QuoteCurrencyResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, QuoteCurrencyResponseBean$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            z2 = zDecodeBooleanElement;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, null);
            quoteCurrencyResponseBean = quoteCurrencyResponseBean2;
            baseCurrencyResponseBean = baseCurrencyResponseBean2;
            z = zDecodeBooleanElement2;
            i = 63;
        } else {
            boolean zDecodeBooleanElement3 = false;
            int i2 = 0;
            boolean z3 = true;
            List list2 = null;
            Boolean bool2 = null;
            QuoteCurrencyResponseBean quoteCurrencyResponseBean3 = null;
            BaseCurrencyResponseBean baseCurrencyResponseBean3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        i2 |= 4;
                        baseCurrencyResponseBean3 = (BaseCurrencyResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseCurrencyResponseBean$$serializer.INSTANCE, baseCurrencyResponseBean3);
                        break;
                    case 3:
                        i2 |= 8;
                        quoteCurrencyResponseBean3 = (QuoteCurrencyResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, QuoteCurrencyResponseBean$$serializer.INSTANCE, quoteCurrencyResponseBean3);
                        break;
                    case 4:
                        i2 |= 16;
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list2);
                        break;
                    case 5:
                        i2 |= 32;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement3;
            QuoteCurrencyResponseBean quoteCurrencyResponseBean4 = quoteCurrencyResponseBean3;
            list = list2;
            baseCurrencyResponseBean = baseCurrencyResponseBean3;
            bool = bool2;
            quoteCurrencyResponseBean = quoteCurrencyResponseBean4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeSuggestionResponseBean(i, z2, z, baseCurrencyResponseBean, quoteCurrencyResponseBean, list, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeSuggestionResponseBean tradeSuggestionResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeSuggestionResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeSuggestionResponseBean.write$Self$OKCRCore_cr_core(tradeSuggestionResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
