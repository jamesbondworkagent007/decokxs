package com.okinc.crcore.shared.net.responsebean.bsc;

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
public final /* synthetic */ class TradeSuggestionBean$$serializer implements GeneratedSerializer<TradeSuggestionBean> {
    public static final int $stable;
    public static final TradeSuggestionBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeSuggestionBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeSuggestionBean$$serializer tradeSuggestionBean$$serializer = new TradeSuggestionBean$$serializer();
        INSTANCE = tradeSuggestionBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean", tradeSuggestionBean$$serializer, 6);
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
        KSerializer<?>[] kSerializerArr = TradeSuggestionBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, BaseCurrencyBean$$serializer.INSTANCE, QuoteCurrencyBean$$serializer.INSTANCE, kSerializerArr[4], BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeSuggestionBean deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        boolean z2;
        List list;
        BaseCurrencyBean baseCurrencyBean;
        Boolean bool;
        QuoteCurrencyBean quoteCurrencyBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeSuggestionBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            BaseCurrencyBean baseCurrencyBean2 = (BaseCurrencyBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseCurrencyBean$$serializer.INSTANCE, null);
            QuoteCurrencyBean quoteCurrencyBean2 = (QuoteCurrencyBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, QuoteCurrencyBean$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            z2 = zDecodeBooleanElement;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, null);
            quoteCurrencyBean = quoteCurrencyBean2;
            baseCurrencyBean = baseCurrencyBean2;
            z = zDecodeBooleanElement2;
            i = 63;
        } else {
            boolean zDecodeBooleanElement3 = false;
            int i2 = 0;
            boolean z3 = true;
            List list2 = null;
            Boolean bool2 = null;
            QuoteCurrencyBean quoteCurrencyBean3 = null;
            BaseCurrencyBean baseCurrencyBean3 = null;
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
                        baseCurrencyBean3 = (BaseCurrencyBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BaseCurrencyBean$$serializer.INSTANCE, baseCurrencyBean3);
                        break;
                    case 3:
                        i2 |= 8;
                        quoteCurrencyBean3 = (QuoteCurrencyBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, QuoteCurrencyBean$$serializer.INSTANCE, quoteCurrencyBean3);
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
            QuoteCurrencyBean quoteCurrencyBean4 = quoteCurrencyBean3;
            list = list2;
            baseCurrencyBean = baseCurrencyBean3;
            bool = bool2;
            quoteCurrencyBean = quoteCurrencyBean4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeSuggestionBean(i, z2, z, baseCurrencyBean, quoteCurrencyBean, list, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeSuggestionBean tradeSuggestionBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeSuggestionBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeSuggestionBean.write$Self$OKCRCore_cr_core(tradeSuggestionBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
