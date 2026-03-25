package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class MPBotBannerParam$$serializer implements GeneratedSerializer<MPBotBannerParam> {
    public static final int $stable;
    public static final MPBotBannerParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MPBotBannerParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MPBotBannerParam$$serializer mPBotBannerParam$$serializer = new MPBotBannerParam$$serializer();
        INSTANCE = mPBotBannerParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.MPBotBannerParam", mPBotBannerParam$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("event", true);
        pluginGeneratedSerialDescriptor.addElement("card", true);
        pluginGeneratedSerialDescriptor.addElement("lossInsurance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(MPBotEventResult$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(MPBotBannerCard$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LossInsuranceBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MPBotBannerParam deserialize(@NotNull Decoder decoder) {
        int i;
        MPBotBannerCard mPBotBannerCard;
        MPBotEventResult mPBotEventResult;
        LossInsuranceBean lossInsuranceBean;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        MPBotBannerCard mPBotBannerCard2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MPBotEventResult mPBotEventResult2 = (MPBotEventResult) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MPBotEventResult$$serializer.INSTANCE, null);
            MPBotBannerCard mPBotBannerCard3 = (MPBotBannerCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MPBotBannerCard$$serializer.INSTANCE, null);
            mPBotEventResult = mPBotEventResult2;
            lossInsuranceBean = (LossInsuranceBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LossInsuranceBean$$serializer.INSTANCE, null);
            mPBotBannerCard = mPBotBannerCard3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            MPBotEventResult mPBotEventResult3 = null;
            LossInsuranceBean lossInsuranceBean2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    mPBotEventResult3 = (MPBotEventResult) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MPBotEventResult$$serializer.INSTANCE, mPBotEventResult3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    mPBotBannerCard2 = (MPBotBannerCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MPBotBannerCard$$serializer.INSTANCE, mPBotBannerCard2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    lossInsuranceBean2 = (LossInsuranceBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LossInsuranceBean$$serializer.INSTANCE, lossInsuranceBean2);
                    i2 |= 4;
                }
            }
            i = i2;
            mPBotBannerCard = mPBotBannerCard2;
            mPBotEventResult = mPBotEventResult3;
            lossInsuranceBean = lossInsuranceBean2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MPBotBannerParam(i, mPBotEventResult, mPBotBannerCard, lossInsuranceBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MPBotBannerParam mPBotBannerParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mPBotBannerParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MPBotBannerParam.write$Self$OKTradeCore_trade_core(mPBotBannerParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
