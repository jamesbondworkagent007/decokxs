package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.contants.InvestAction;
import java.util.List;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ProductDetailsHistoryRecord$$serializer implements GeneratedSerializer<ProductDetailsHistoryRecord> {
    public static final int $stable;
    public static final ProductDetailsHistoryRecord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProductDetailsHistoryRecord$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProductDetailsHistoryRecord$$serializer productDetailsHistoryRecord$$serializer = new ProductDetailsHistoryRecord$$serializer();
        INSTANCE = productDetailsHistoryRecord$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryRecord", productDetailsHistoryRecord$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        pluginGeneratedSerialDescriptor.addElement("blockTime", true);
        pluginGeneratedSerialDescriptor.addElement("investInfo", true);
        pluginGeneratedSerialDescriptor.addElement("txHash", true);
        pluginGeneratedSerialDescriptor.addElement("uopHash", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ProductDetailsHistoryRecord.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], LongSerializer.INSTANCE, kSerializerArr[2], stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProductDetailsHistoryRecord deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        List list;
        String strDecodeStringElement2;
        InvestAction investAction;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ProductDetailsHistoryRecord.$childSerializers;
        int i2 = 3;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestAction investAction2 = (InvestAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            investAction = investAction2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int i3 = 0;
            InvestAction investAction3 = null;
            long jDecodeLongElement2 = 0;
            List list2 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    investAction3 = (InvestAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investAction3);
                    i3 |= 1;
                    i2 = 3;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    i3 |= 4;
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list2);
                } else if (iDecodeElementIndex == i2) {
                    i3 |= 8;
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i3 |= 16;
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                }
            }
            i = i3;
            strDecodeStringElement = strDecodeStringElement3;
            list = list2;
            strDecodeStringElement2 = strDecodeStringElement4;
            investAction = investAction3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductDetailsHistoryRecord(i, investAction, j, list, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProductDetailsHistoryRecord productDetailsHistoryRecord) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(productDetailsHistoryRecord, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProductDetailsHistoryRecord.OLrzqt(productDetailsHistoryRecord, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
