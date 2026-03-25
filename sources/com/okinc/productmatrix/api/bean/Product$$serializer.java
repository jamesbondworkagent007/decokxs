package com.okinc.productmatrix.api.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class Product$$serializer implements GeneratedSerializer<Product> {
    public static final int $stable;
    public static final Product$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Product$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Product$$serializer product$$serializer = new Product$$serializer();
        INSTANCE = product$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.productmatrix.api.bean.Product", product$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("productId", true);
        pluginGeneratedSerialDescriptor.addElement("actionType", true);
        pluginGeneratedSerialDescriptor.addElement("actionPath", true);
        pluginGeneratedSerialDescriptor.addElement("eventInfo", true);
        pluginGeneratedSerialDescriptor.addElement("moduleName", true);
        pluginGeneratedSerialDescriptor.addElement("darkIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("lightIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("interceptType", true);
        pluginGeneratedSerialDescriptor.addElement("titleName", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("emptyProductItemId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(Tag$$serializer.INSTANCE), LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Product deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Tag tag;
        String str;
        long jDecodeLongElement;
        int i;
        int i2;
        String str2;
        int i3;
        String str3;
        String str4;
        String str5;
        int i4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            i4 = iDecodeIntElement;
            i = 2047;
            tag = (Tag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Tag$$serializer.INSTANCE, null);
            i2 = iDecodeIntElement3;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement3;
            str = strDecodeStringElement7;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement2;
            i3 = iDecodeIntElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
        } else {
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement12 = null;
            int i5 = 0;
            int iDecodeIntElement6 = 0;
            Tag tag2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i5 |= 1;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        break;
                    case 1:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        i5 |= 4;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i5 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        tag2 = (Tag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Tag$$serializer.INSTANCE, tag2);
                        i5 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
                        i5 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            tag = tag2;
            str = strDecodeStringElement12;
            jDecodeLongElement = jDecodeLongElement2;
            i = i5;
            i2 = iDecodeIntElement6;
            str2 = strDecodeStringElement9;
            i3 = iDecodeIntElement5;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement8;
            i4 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Product(i, i4, i3, str4, strDecodeStringElement, str5, str3, str2, i2, str, tag, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Product product) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(product, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Product.write$Self$OKProductMatrix_product_matrix_api(product, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
