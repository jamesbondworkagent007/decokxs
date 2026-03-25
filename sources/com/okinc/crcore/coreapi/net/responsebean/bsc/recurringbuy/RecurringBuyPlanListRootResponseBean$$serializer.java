package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RecurringBuyPlanListRootResponseBean$$serializer implements GeneratedSerializer<RecurringBuyPlanListRootResponseBean> {
    public static final int $stable;
    public static final RecurringBuyPlanListRootResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlanListRootResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlanListRootResponseBean$$serializer recurringBuyPlanListRootResponseBean$$serializer = new RecurringBuyPlanListRootResponseBean$$serializer();
        INSTANCE = recurringBuyPlanListRootResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListRootResponseBean", recurringBuyPlanListRootResponseBean$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("hasNextPage", false);
        pluginGeneratedSerialDescriptor.addElement("hasPreviousPage", false);
        pluginGeneratedSerialDescriptor.addElement("nextPage", false);
        pluginGeneratedSerialDescriptor.addElement("pageNum", false);
        pluginGeneratedSerialDescriptor.addElement("pageSize", false);
        pluginGeneratedSerialDescriptor.addElement("pages", false);
        pluginGeneratedSerialDescriptor.addElement("planList", false);
        pluginGeneratedSerialDescriptor.addElement("prePage", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("totalPlanSize", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RecurringBuyPlanListRootResponseBean.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, longSerializer, longSerializer, longSerializer, longSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[6]), longSerializer, longSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlanListRootResponseBean deserialize(@NotNull Decoder decoder) {
        long jDecodeLongElement;
        long jDecodeLongElement2;
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        long j4;
        List list;
        long j5;
        boolean z3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringBuyPlanListRootResponseBean.$childSerializers;
        List list2 = null;
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            long jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            long jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            list = list3;
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            j5 = jDecodeLongElement6;
            j = jDecodeLongElement8;
            j3 = jDecodeLongElement5;
            j4 = jDecodeLongElement4;
            jDecodeLongElement = jDecodeLongElement7;
            z = zDecodeBooleanElement;
            i = 1023;
            z2 = zDecodeBooleanElement2;
            j2 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement9 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z4 = true;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            long jDecodeLongElement13 = 0;
            long jDecodeLongElement14 = 0;
            jDecodeLongElement = 0;
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
                        jDecodeLongElement13 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 3:
                        jDecodeLongElement14 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 4:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 5:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 |= 32;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], list2);
                        i2 |= 64;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 7:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i2 |= 128;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 8:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i2 |= 256;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 9:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i2 |= 512;
                        z3 = z4;
                        z4 = z3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jDecodeLongElement2 = jDecodeLongElement9;
            j = jDecodeLongElement11;
            j2 = jDecodeLongElement13;
            i = i2;
            long j6 = jDecodeLongElement10;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            j3 = jDecodeLongElement12;
            j4 = jDecodeLongElement14;
            list = list2;
            j5 = j6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlanListRootResponseBean(i, z, z2, j2, j4, j3, j5, list, jDecodeLongElement, j, jDecodeLongElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlanListRootResponseBean recurringBuyPlanListRootResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanListRootResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlanListRootResponseBean.write$Self$OKCRCore_cr_core(recurringBuyPlanListRootResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
