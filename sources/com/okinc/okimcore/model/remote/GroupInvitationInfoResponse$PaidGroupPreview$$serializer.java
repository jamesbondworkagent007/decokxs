package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupInvitationInfoResponse$PaidGroupPreview$$serializer implements GeneratedSerializer<GroupInvitationInfoResponse.PaidGroupPreview> {
    public static final int $stable;
    public static final GroupInvitationInfoResponse$PaidGroupPreview$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupInvitationInfoResponse$PaidGroupPreview$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupInvitationInfoResponse$PaidGroupPreview$$serializer groupInvitationInfoResponse$PaidGroupPreview$$serializer = new GroupInvitationInfoResponse$PaidGroupPreview$$serializer();
        INSTANCE = groupInvitationInfoResponse$PaidGroupPreview$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupInvitationInfoResponse.PaidGroupPreview", groupInvitationInfoResponse$PaidGroupPreview$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("billingModel", true);
        pluginGeneratedSerialDescriptor.addElement("paymentRequiredStatus", true);
        pluginGeneratedSerialDescriptor.addElement("transactionStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GroupInvitationInfoResponse.PaidGroupPreview.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(GroupEntryBillingModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupInvitationInfoResponse.PaidGroupPreview deserialize(@NotNull Decoder decoder) {
        int i;
        PaymentRequiredStatus paymentRequiredStatus;
        TransactionStatus transactionStatus;
        GroupEntryBillingModel groupEntryBillingModel;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupInvitationInfoResponse.PaidGroupPreview.$childSerializers;
        PaymentRequiredStatus paymentRequiredStatus2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupEntryBillingModel groupEntryBillingModel2 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, null);
            PaymentRequiredStatus paymentRequiredStatus3 = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            transactionStatus = (TransactionStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            groupEntryBillingModel = groupEntryBillingModel2;
            paymentRequiredStatus = paymentRequiredStatus3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            TransactionStatus transactionStatus2 = null;
            GroupEntryBillingModel groupEntryBillingModel3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupEntryBillingModel3 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, groupEntryBillingModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    paymentRequiredStatus2 = (PaymentRequiredStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], paymentRequiredStatus2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    transactionStatus2 = (TransactionStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionStatus2);
                    i2 |= 4;
                }
            }
            i = i2;
            paymentRequiredStatus = paymentRequiredStatus2;
            transactionStatus = transactionStatus2;
            groupEntryBillingModel = groupEntryBillingModel3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupInvitationInfoResponse.PaidGroupPreview(i, groupEntryBillingModel, paymentRequiredStatus, transactionStatus, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paidGroupPreview, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupInvitationInfoResponse.PaidGroupPreview.write$Self$OKIMCore_okimcore(paidGroupPreview, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
