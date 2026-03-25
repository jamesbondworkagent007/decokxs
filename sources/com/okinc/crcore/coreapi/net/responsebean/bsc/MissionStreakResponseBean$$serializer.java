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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class MissionStreakResponseBean$$serializer implements GeneratedSerializer<MissionStreakResponseBean> {
    public static final int $stable;
    public static final MissionStreakResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MissionStreakResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MissionStreakResponseBean$$serializer missionStreakResponseBean$$serializer = new MissionStreakResponseBean$$serializer();
        INSTANCE = missionStreakResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean", missionStreakResponseBean$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        pluginGeneratedSerialDescriptor.addElement("resetStreakIfMissedStreak", true);
        pluginGeneratedSerialDescriptor.addElement("timeZone", true);
        pluginGeneratedSerialDescriptor.addElement("streakRequired", true);
        pluginGeneratedSerialDescriptor.addElement("streakCount", true);
        pluginGeneratedSerialDescriptor.addElement("timesCompletedToday", true);
        pluginGeneratedSerialDescriptor.addElement("missionCompletedLimit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(MissionCompletedLimitResponseBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MissionStreakResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        MissionCompletedLimitResponseBean missionCompletedLimitResponseBean;
        String str;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            i5 = iDecodeIntElement;
            missionCompletedLimitResponseBean = (MissionCompletedLimitResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, MissionCompletedLimitResponseBean$$serializer.INSTANCE, null);
            i = iDecodeIntElement4;
            z = zDecodeBooleanElement;
            i4 = 127;
            i3 = iDecodeIntElement3;
            str = strDecodeStringElement;
            i2 = iDecodeIntElement2;
        } else {
            String strDecodeStringElement2 = null;
            MissionCompletedLimitResponseBean missionCompletedLimitResponseBean2 = null;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i6 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i6 |= 2;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        missionCompletedLimitResponseBean2 = (MissionCompletedLimitResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, MissionCompletedLimitResponseBean$$serializer.INSTANCE, missionCompletedLimitResponseBean2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement6;
            missionCompletedLimitResponseBean = missionCompletedLimitResponseBean2;
            str = strDecodeStringElement2;
            i2 = iDecodeIntElement8;
            i3 = iDecodeIntElement7;
            z = zDecodeBooleanElement2;
            i4 = i6;
            i5 = iDecodeIntElement5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MissionStreakResponseBean(i4, i5, i2, str, z, i3, i, missionCompletedLimitResponseBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MissionStreakResponseBean missionStreakResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(missionStreakResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MissionStreakResponseBean.write$Self$OKCRCore_cr_core(missionStreakResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
