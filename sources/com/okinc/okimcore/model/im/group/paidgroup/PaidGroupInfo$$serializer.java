package com.okinc.okimcore.model.im.group.paidgroup;

import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel$$serializer;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class PaidGroupInfo$$serializer implements GeneratedSerializer<PaidGroupInfo> {
    public static final int $stable;
    public static final PaidGroupInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PaidGroupInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PaidGroupInfo$$serializer paidGroupInfo$$serializer = new PaidGroupInfo$$serializer();
        INSTANCE = paidGroupInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo", paidGroupInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("billingModel", true);
        pluginGeneratedSerialDescriptor.addElement("paidGroupMemberStatus", true);
        pluginGeneratedSerialDescriptor.addElement("outstandingAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(GroupEntryBillingModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(PaidGroupMemberStatus$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PaidGroupInfo deserialize(@NotNull Decoder decoder) {
        int i;
        PaidGroupMemberStatus paidGroupMemberStatus;
        GroupEntryBillingModel groupEntryBillingModel;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PaidGroupMemberStatus paidGroupMemberStatus2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupEntryBillingModel groupEntryBillingModel2 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, null);
            PaidGroupMemberStatus paidGroupMemberStatus3 = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PaidGroupMemberStatus$$serializer.INSTANCE, null);
            groupEntryBillingModel = groupEntryBillingModel2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            paidGroupMemberStatus = paidGroupMemberStatus3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            GroupEntryBillingModel groupEntryBillingModel3 = null;
            String str2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupEntryBillingModel3 = (GroupEntryBillingModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, groupEntryBillingModel3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    paidGroupMemberStatus2 = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PaidGroupMemberStatus$$serializer.INSTANCE, paidGroupMemberStatus2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                    i2 |= 4;
                }
            }
            i = i2;
            paidGroupMemberStatus = paidGroupMemberStatus2;
            groupEntryBillingModel = groupEntryBillingModel3;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaidGroupInfo(i, groupEntryBillingModel, paidGroupMemberStatus, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PaidGroupInfo paidGroupInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paidGroupInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaidGroupInfo.write$Self$OKIMCore_okimcore(paidGroupInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
