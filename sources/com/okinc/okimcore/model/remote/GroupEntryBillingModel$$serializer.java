package com.okinc.okimcore.model.remote;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupEntryBillingModel$$serializer implements GeneratedSerializer<GroupEntryBillingModel> {
    public static final int $stable;
    public static final GroupEntryBillingModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupEntryBillingModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupEntryBillingModel$$serializer groupEntryBillingModel$$serializer = new GroupEntryBillingModel$$serializer();
        INSTANCE = groupEntryBillingModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupEntryBillingModel", groupEntryBillingModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement(AppsFlyerProperties.CURRENCY_CODE, true);
        pluginGeneratedSerialDescriptor.addElement("currencySign", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("billingType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GroupEntryBillingModel.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupEntryBillingModel deserialize(@NotNull Decoder decoder) {
        GroupBillingType groupBillingType;
        String str;
        PaidGroupBillingStatus paidGroupBillingStatus;
        int i;
        String str2;
        String str3;
        Integer num;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupEntryBillingModel.$childSerializers;
        int i2 = 3;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PaidGroupBillingStatus paidGroupBillingStatus2 = (PaidGroupBillingStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            groupBillingType = (GroupBillingType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            paidGroupBillingStatus = paidGroupBillingStatus2;
            str2 = str6;
            str = str7;
            str3 = str5;
            i = 63;
            num = num2;
        } else {
            boolean z = true;
            int i3 = 0;
            GroupBillingType groupBillingType2 = null;
            String str8 = null;
            String str9 = null;
            Integer num3 = null;
            PaidGroupBillingStatus paidGroupBillingStatus3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        paidGroupBillingStatus3 = (PaidGroupBillingStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], paidGroupBillingStatus3);
                        i3 |= 1;
                        i2 = 3;
                        continue;
                    case 1:
                        i3 |= 2;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num3);
                        break;
                    case 2:
                        i3 |= 4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                        break;
                    case 3:
                        i3 |= 8;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str4);
                        break;
                    case 4:
                        i3 |= 16;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str8);
                        break;
                    case 5:
                        i3 |= 32;
                        groupBillingType2 = (GroupBillingType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], groupBillingType2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            groupBillingType = groupBillingType2;
            str = str8;
            paidGroupBillingStatus = paidGroupBillingStatus3;
            i = i3;
            str2 = str4;
            Integer num4 = num3;
            str3 = str9;
            num = num4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupEntryBillingModel(i, paidGroupBillingStatus, num, str3, str2, str, groupBillingType, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupEntryBillingModel groupEntryBillingModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupEntryBillingModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupEntryBillingModel.write$Self$OKIMCore_okimcore(groupEntryBillingModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
