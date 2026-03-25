package com.okinc.business.web3pay.lib.features.campaign.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CampaignGuideResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CampaignDesc campaignDesc;
    private final CtaApiModel cta;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignDesc getCampaignDesc() {
        return this.campaignDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaApiModel getCta() {
        return this.cta;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CampaignGuideResponse> serializer() {
            return CampaignGuideResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CampaignGuideResponse(int i, CampaignDesc campaignDesc, CtaApiModel ctaApiModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CampaignGuideResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.campaignDesc = campaignDesc;
        this.cta = ctaApiModel;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CampaignGuideResponse campaignGuideResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CampaignDesc$$serializer.INSTANCE, campaignGuideResponse.campaignDesc);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaApiModel$$serializer.INSTANCE, campaignGuideResponse.cta);
    }

    public CampaignGuideResponse(CampaignDesc campaignDesc, CtaApiModel ctaApiModel) {
        this.campaignDesc = campaignDesc;
        this.cta = ctaApiModel;
    }
}
