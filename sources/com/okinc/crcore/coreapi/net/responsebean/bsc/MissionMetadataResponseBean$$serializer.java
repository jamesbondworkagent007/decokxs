package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class MissionMetadataResponseBean$$serializer implements GeneratedSerializer<MissionMetadataResponseBean> {
    public static final int $stable;
    public static final MissionMetadataResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MissionMetadataResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MissionMetadataResponseBean$$serializer missionMetadataResponseBean$$serializer = new MissionMetadataResponseBean$$serializer();
        INSTANCE = missionMetadataResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.MissionMetadataResponseBean", missionMetadataResponseBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(CryptoServicesPermission.CONSTRAINTS, true);
        pluginGeneratedSerialDescriptor.addElement("streak", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(MissionConstraintsResponseBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(MissionStreakResponseBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MissionMetadataResponseBean deserialize(@NotNull Decoder decoder) {
        MissionConstraintsResponseBean missionConstraintsResponseBean;
        MissionStreakResponseBean missionStreakResponseBean;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            missionConstraintsResponseBean = (MissionConstraintsResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MissionConstraintsResponseBean$$serializer.INSTANCE, null);
            missionStreakResponseBean = (MissionStreakResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MissionStreakResponseBean$$serializer.INSTANCE, null);
            i = 3;
        } else {
            missionConstraintsResponseBean = null;
            MissionStreakResponseBean missionStreakResponseBean2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    missionConstraintsResponseBean = (MissionConstraintsResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MissionConstraintsResponseBean$$serializer.INSTANCE, missionConstraintsResponseBean);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    missionStreakResponseBean2 = (MissionStreakResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MissionStreakResponseBean$$serializer.INSTANCE, missionStreakResponseBean2);
                    i2 |= 2;
                }
            }
            missionStreakResponseBean = missionStreakResponseBean2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MissionMetadataResponseBean(i, missionConstraintsResponseBean, missionStreakResponseBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MissionMetadataResponseBean missionMetadataResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(missionMetadataResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MissionMetadataResponseBean.write$Self$OKCRCore_cr_core(missionMetadataResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
