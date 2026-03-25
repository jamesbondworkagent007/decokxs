package com.okinc.okimcore.model.remote;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
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
public final /* synthetic */ class GroupEntryAssetVerificationInfo$$serializer implements GeneratedSerializer<GroupEntryAssetVerificationInfo> {
    public static final int $stable;
    public static final GroupEntryAssetVerificationInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupEntryAssetVerificationInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupEntryAssetVerificationInfo$$serializer groupEntryAssetVerificationInfo$$serializer = new GroupEntryAssetVerificationInfo$$serializer();
        INSTANCE = groupEntryAssetVerificationInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo", groupEntryAssetVerificationInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("assetVerificationStatus", true);
        pluginGeneratedSerialDescriptor.addElement("assetVerificationType", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement(AppsFlyerProperties.CURRENCY_CODE, true);
        pluginGeneratedSerialDescriptor.addElement("assetAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GroupEntryAssetVerificationInfo.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupEntryAssetVerificationInfo deserialize(@NotNull Decoder decoder) {
        int i;
        Integer num;
        String str;
        GroupEntryAssetVerificationType groupEntryAssetVerificationType;
        String str2;
        GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupEntryAssetVerificationInfo.$childSerializers;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus2 = (GroupEntryAssetsVerificationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            GroupEntryAssetVerificationType groupEntryAssetVerificationType2 = (GroupEntryAssetVerificationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            groupEntryAssetVerificationType = groupEntryAssetVerificationType2;
            groupEntryAssetsVerificationStatus = groupEntryAssetsVerificationStatus2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            num = num3;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            String str3 = null;
            GroupEntryAssetVerificationType groupEntryAssetVerificationType3 = null;
            String str4 = null;
            GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    groupEntryAssetsVerificationStatus3 = (GroupEntryAssetsVerificationStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupEntryAssetsVerificationStatus3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    groupEntryAssetVerificationType3 = (GroupEntryAssetVerificationType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupEntryAssetVerificationType3);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num2);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str4);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str3);
                }
            }
            i = i2;
            num = num2;
            str = str3;
            groupEntryAssetVerificationType = groupEntryAssetVerificationType3;
            str2 = str4;
            groupEntryAssetsVerificationStatus = groupEntryAssetsVerificationStatus3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupEntryAssetVerificationInfo(i, groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType, num, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupEntryAssetVerificationInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupEntryAssetVerificationInfo.write$Self$OKIMCore_okimcore(groupEntryAssetVerificationInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
