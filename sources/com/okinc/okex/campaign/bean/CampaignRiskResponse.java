package com.okinc.okex.campaign.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CampaignRiskResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isUserRiskControlled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CampaignRiskResponse copy$default(CampaignRiskResponse campaignRiskResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = campaignRiskResponse.isUserRiskControlled;
        }
        return campaignRiskResponse.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isUserRiskControlled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignRiskResponse copy(boolean z) {
        return new CampaignRiskResponse(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CampaignRiskResponse) && this.isUserRiskControlled == ((CampaignRiskResponse) obj).isUserRiskControlled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.isUserRiskControlled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUserRiskControlled() {
        return this.isUserRiskControlled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CampaignRiskResponse(isUserRiskControlled=" + this.isUserRiskControlled + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.bean.CampaignRiskResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CampaignRiskResponse> serializer() {
            return CampaignRiskResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CampaignRiskResponse(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CampaignRiskResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.isUserRiskControlled = z;
    }

    public CampaignRiskResponse(boolean z) {
        this.isUserRiskControlled = z;
    }
}
