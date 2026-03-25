package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RecurringBuyPlanOrderListRootResponseBean$$serializer implements GeneratedSerializer<RecurringBuyPlanOrderListRootResponseBean> {
    public static final int $stable;
    public static final RecurringBuyPlanOrderListRootResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlanOrderListRootResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlanOrderListRootResponseBean$$serializer recurringBuyPlanOrderListRootResponseBean$$serializer = new RecurringBuyPlanOrderListRootResponseBean$$serializer();
        INSTANCE = recurringBuyPlanOrderListRootResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanOrderListRootResponseBean", recurringBuyPlanOrderListRootResponseBean$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("hasNextPage", false);
        pluginGeneratedSerialDescriptor.addElement("hasPreviousPage", false);
        pluginGeneratedSerialDescriptor.addElement("nextPage", false);
        pluginGeneratedSerialDescriptor.addElement("pageNum", false);
        pluginGeneratedSerialDescriptor.addElement("pageSize", false);
        pluginGeneratedSerialDescriptor.addElement("pages", false);
        pluginGeneratedSerialDescriptor.addElement("placedOrderList", true);
        pluginGeneratedSerialDescriptor.addElement("prePage", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RecurringBuyPlanOrderListRootResponseBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, longSerializer, longSerializer, longSerializer, longSerializer, kSerializerArr[6], longSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlanOrderListRootResponseBean deserialize(@NotNull Decoder decoder) {
        long jDecodeLongElement;
        boolean z;
        long j;
        boolean z2;
        List list;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringBuyPlanOrderListRootResponseBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            list = list2;
            j3 = jDecodeLongElement5;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            j4 = jDecodeLongElement4;
            j2 = jDecodeLongElement3;
            j = jDecodeLongElement6;
            z2 = zDecodeBooleanElement;
            i = 511;
            z = zDecodeBooleanElement2;
            j5 = jDecodeLongElement2;
        } else {
            long jDecodeLongElement7 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z4 = true;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            List list3 = null;
            int i2 = 0;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        z4 = z3;
                        break;
                    case 0:
                        i2 |= 1;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 3:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 4:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 5:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 |= 32;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 6:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list3);
                        i2 |= 64;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 7:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i2 |= 128;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 8:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i2 |= 256;
                        z3 = z4;
                        z4 = z3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jDecodeLongElement = jDecodeLongElement8;
            z = zDecodeBooleanElement4;
            j = jDecodeLongElement12;
            z2 = zDecodeBooleanElement3;
            list = list3;
            i = i2;
            j2 = jDecodeLongElement11;
            j3 = jDecodeLongElement7;
            j4 = jDecodeLongElement9;
            j5 = jDecodeLongElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlanOrderListRootResponseBean(i, z2, z, j5, j2, j4, j3, list, j, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlanOrderListRootResponseBean recurringBuyPlanOrderListRootResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListRootResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlanOrderListRootResponseBean.write$Self$OKCRCore_cr_core(recurringBuyPlanOrderListRootResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
