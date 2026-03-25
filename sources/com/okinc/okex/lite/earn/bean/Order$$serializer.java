package com.okinc.okex.lite.earn.bean;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class Order$$serializer implements GeneratedSerializer<Order> {
    public static final int $stable;
    public static final Order$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Order$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Order$$serializer order$$serializer = new Order$$serializer();
        INSTANCE = order$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.earn.bean.Order", order$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedTotalvarueFiat", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedTotalvarues", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("productType", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(Currency$$serializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(Order.$childSerializers[2]), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ProductType$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Status$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Order deserialize(@NotNull Decoder decoder) {
        int i;
        Currency currency;
        Status status;
        int i2;
        List list;
        String str;
        ProductType productType;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Order.$childSerializers;
        int i3 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Currency currency2 = (Currency) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Currency$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            ProductType productType2 = (ProductType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ProductType$$serializer.INSTANCE, null);
            list = list2;
            currency = currency2;
            status = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Status$$serializer.INSTANCE, null);
            i2 = iDecodeIntElement;
            productType = productType2;
            str = strDecodeStringElement;
            i = 63;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            List list3 = null;
            ProductType productType3 = null;
            Status status2 = null;
            String strDecodeStringElement2 = null;
            Currency currency3 = null;
            int i4 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i3 = 5;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        currency3 = (Currency) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Currency$$serializer.INSTANCE, currency3);
                        i3 = 5;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i4 |= 4;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                        break;
                    case 3:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        i4 |= 16;
                        productType3 = (ProductType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ProductType$$serializer.INSTANCE, productType3);
                        break;
                    case 5:
                        i4 |= 32;
                        status2 = (Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, Status$$serializer.INSTANCE, status2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            currency = currency3;
            status = status2;
            i2 = iDecodeIntElement2;
            ProductType productType4 = productType3;
            list = list3;
            str = strDecodeStringElement2;
            productType = productType4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Order(i, currency, str, list, i2, productType, status, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Order order) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(order, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Order.write$Self$OKFinance_finance_api(order, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
