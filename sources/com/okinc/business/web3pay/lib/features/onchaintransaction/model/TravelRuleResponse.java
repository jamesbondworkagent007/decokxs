package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TravelRuleResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean needTravelRule;
    private final String playbookName;
    private final String travelRuleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TravelRuleResponse copy$default(TravelRuleResponse travelRuleResponse, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = travelRuleResponse.needTravelRule;
        }
        if ((i & 2) != 0) {
            str = travelRuleResponse.travelRuleId;
        }
        if ((i & 4) != 0) {
            str2 = travelRuleResponse.playbookName;
        }
        return travelRuleResponse.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.needTravelRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.playbookName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TravelRuleResponse copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TravelRuleResponse(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelRuleResponse)) {
            return false;
        }
        TravelRuleResponse travelRuleResponse = (TravelRuleResponse) obj;
        return this.needTravelRule == travelRuleResponse.needTravelRule && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) travelRuleResponse.travelRuleId) && Intrinsics.EZpvd((Object) this.playbookName, (Object) travelRuleResponse.playbookName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTravelRule() {
        return this.needTravelRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybookName() {
        return this.playbookName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.needTravelRule) * 31) + this.travelRuleId.hashCode()) * 31) + this.playbookName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TravelRuleResponse(needTravelRule=" + this.needTravelRule + ", travelRuleId=" + this.travelRuleId + ", playbookName=" + this.playbookName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TravelRuleResponse> serializer() {
            return TravelRuleResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TravelRuleResponse(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TravelRuleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.needTravelRule = z;
        this.travelRuleId = str;
        this.playbookName = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TravelRuleResponse travelRuleResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, travelRuleResponse.needTravelRule);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, travelRuleResponse.travelRuleId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, travelRuleResponse.playbookName);
    }

    public TravelRuleResponse(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.needTravelRule = z;
        this.travelRuleId = str;
        this.playbookName = str2;
    }
}
