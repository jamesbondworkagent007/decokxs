package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserAssetDetailClaimPromptInformation$$serializer implements GeneratedSerializer<InvestUserAssetDetailClaimPromptInformation> {
    public static final int $stable;
    public static final InvestUserAssetDetailClaimPromptInformation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserAssetDetailClaimPromptInformation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserAssetDetailClaimPromptInformation$$serializer investUserAssetDetailClaimPromptInformation$$serializer = new InvestUserAssetDetailClaimPromptInformation$$serializer();
        INSTANCE = investUserAssetDetailClaimPromptInformation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation", investUserAssetDetailClaimPromptInformation$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("claimTipInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserAssetDetailClaimPromptInformation deserialize(@NotNull Decoder decoder) {
        InvestTipInfoVo investTipInfoVo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            investTipInfoVo = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, null);
        } else {
            investTipInfoVo = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    investTipInfoVo = (InvestTipInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTipInfoVo$$serializer.INSTANCE, investTipInfoVo);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserAssetDetailClaimPromptInformation(i, investTipInfoVo, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailClaimPromptInformation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserAssetDetailClaimPromptInformation.write$Self$OKDeFi_invest_biz(investUserAssetDetailClaimPromptInformation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
