package com.okinc.okimcore.model.im.group.paidgroup;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PaidGroupMemberStatus$$serializer implements GeneratedSerializer<PaidGroupMemberStatus> {
    public static final int $stable;
    public static final PaidGroupMemberStatus$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PaidGroupMemberStatus$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PaidGroupMemberStatus$$serializer paidGroupMemberStatus$$serializer = new PaidGroupMemberStatus$$serializer();
        INSTANCE = paidGroupMemberStatus$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus", paidGroupMemberStatus$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("paymentRequiredStatus", true);
        pluginGeneratedSerialDescriptor.addElement("lastPaymentDatetime", true);
        pluginGeneratedSerialDescriptor.addElement("nextPaymentDatetime", true);
        pluginGeneratedSerialDescriptor.addElement("paidGroupBillingStatus", true);
        pluginGeneratedSerialDescriptor.addElement("billingCyclePaymentStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PaidGroupMemberStatus.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PaidGroupMemberStatus deserialize(@NotNull Decoder decoder) {
        int i;
        Long l;
        BillingCyclePaymentStatus billingCyclePaymentStatus;
        PaidGroupBillingStatus paidGroupBillingStatus;
        Long l2;
        PaymentRequiredStatus paymentRequiredStatus;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PaidGroupMemberStatus.$childSerializers;
        Long l3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PaymentRequiredStatus paymentRequiredStatus2 = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            PaidGroupBillingStatus paidGroupBillingStatus2 = (PaidGroupBillingStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            billingCyclePaymentStatus = (BillingCyclePaymentStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            paymentRequiredStatus = paymentRequiredStatus2;
            l = l5;
            paidGroupBillingStatus = paidGroupBillingStatus2;
            l2 = l4;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            BillingCyclePaymentStatus billingCyclePaymentStatus2 = null;
            PaidGroupBillingStatus paidGroupBillingStatus3 = null;
            Long l6 = null;
            PaymentRequiredStatus paymentRequiredStatus3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    paymentRequiredStatus3 = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], paymentRequiredStatus3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l6);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    paidGroupBillingStatus3 = (PaidGroupBillingStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], paidGroupBillingStatus3);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    billingCyclePaymentStatus2 = (BillingCyclePaymentStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], billingCyclePaymentStatus2);
                }
            }
            i = i2;
            l = l3;
            billingCyclePaymentStatus = billingCyclePaymentStatus2;
            paidGroupBillingStatus = paidGroupBillingStatus3;
            l2 = l6;
            paymentRequiredStatus = paymentRequiredStatus3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaidGroupMemberStatus(i, paymentRequiredStatus, l2, l, paidGroupBillingStatus, billingCyclePaymentStatus, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PaidGroupMemberStatus paidGroupMemberStatus) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paidGroupMemberStatus, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaidGroupMemberStatus.write$Self$OKIMCore_okimcore(paidGroupMemberStatus, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
