package com.okinc.crcore.shared.net.responsebean.bsc;

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
public final /* synthetic */ class MissionMetadataBean$$serializer implements GeneratedSerializer<MissionMetadataBean> {
    public static final int $stable;
    public static final MissionMetadataBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MissionMetadataBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MissionMetadataBean$$serializer missionMetadataBean$$serializer = new MissionMetadataBean$$serializer();
        INSTANCE = missionMetadataBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean", missionMetadataBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(CryptoServicesPermission.CONSTRAINTS, true);
        pluginGeneratedSerialDescriptor.addElement("streak", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(MissionConstrainsBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(MissionStreakBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MissionMetadataBean deserialize(@NotNull Decoder decoder) {
        MissionConstrainsBean missionConstrainsBean;
        MissionStreakBean missionStreakBean;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            missionConstrainsBean = (MissionConstrainsBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MissionConstrainsBean$$serializer.INSTANCE, null);
            missionStreakBean = (MissionStreakBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MissionStreakBean$$serializer.INSTANCE, null);
            i = 3;
        } else {
            missionConstrainsBean = null;
            MissionStreakBean missionStreakBean2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    missionConstrainsBean = (MissionConstrainsBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MissionConstrainsBean$$serializer.INSTANCE, missionConstrainsBean);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    missionStreakBean2 = (MissionStreakBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MissionStreakBean$$serializer.INSTANCE, missionStreakBean2);
                    i2 |= 2;
                }
            }
            missionStreakBean = missionStreakBean2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MissionMetadataBean(i, missionConstrainsBean, missionStreakBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MissionMetadataBean missionMetadataBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(missionMetadataBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MissionMetadataBean.write$Self$OKCRCore_cr_core(missionMetadataBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
