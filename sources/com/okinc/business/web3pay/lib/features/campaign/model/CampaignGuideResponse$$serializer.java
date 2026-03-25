package com.okinc.business.web3pay.lib.features.campaign.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CampaignGuideResponse$$serializer implements GeneratedSerializer<CampaignGuideResponse> {
    public static final int $stable;
    public static final CampaignGuideResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CampaignGuideResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CampaignGuideResponse$$serializer campaignGuideResponse$$serializer = new CampaignGuideResponse$$serializer();
        INSTANCE = campaignGuideResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideResponse", campaignGuideResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("campaignDesc", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CampaignDesc$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CtaApiModel$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CampaignGuideResponse deserialize(@NotNull Decoder decoder) {
        CampaignDesc campaignDesc;
        CtaApiModel ctaApiModel;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            campaignDesc = (CampaignDesc) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CampaignDesc$$serializer.INSTANCE, null);
            ctaApiModel = (CtaApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaApiModel$$serializer.INSTANCE, null);
            i = 3;
        } else {
            campaignDesc = null;
            CtaApiModel ctaApiModel2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    campaignDesc = (CampaignDesc) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CampaignDesc$$serializer.INSTANCE, campaignDesc);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    ctaApiModel2 = (CtaApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaApiModel$$serializer.INSTANCE, ctaApiModel2);
                    i2 |= 2;
                }
            }
            ctaApiModel = ctaApiModel2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CampaignGuideResponse(i, campaignDesc, ctaApiModel, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CampaignGuideResponse campaignGuideResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(campaignGuideResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CampaignGuideResponse.write$Self$OKPayCore_web3pay_lib(campaignGuideResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
