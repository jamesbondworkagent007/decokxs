package com.okinc.crcore.coreapi.net.requestbean;

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
public final class PMSQuestionnaireEvaluationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String answerId;
    private final String pillarType;
    private final String questionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PMSQuestionnaireEvaluationRequest copy$default(PMSQuestionnaireEvaluationRequest pMSQuestionnaireEvaluationRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pMSQuestionnaireEvaluationRequest.pillarType;
        }
        if ((i & 2) != 0) {
            str2 = pMSQuestionnaireEvaluationRequest.questionId;
        }
        if ((i & 4) != 0) {
            str3 = pMSQuestionnaireEvaluationRequest.answerId;
        }
        return pMSQuestionnaireEvaluationRequest.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.questionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.answerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PMSQuestionnaireEvaluationRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PMSQuestionnaireEvaluationRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMSQuestionnaireEvaluationRequest)) {
            return false;
        }
        PMSQuestionnaireEvaluationRequest pMSQuestionnaireEvaluationRequest = (PMSQuestionnaireEvaluationRequest) obj;
        return Intrinsics.EZpvd((Object) this.pillarType, (Object) pMSQuestionnaireEvaluationRequest.pillarType) && Intrinsics.EZpvd((Object) this.questionId, (Object) pMSQuestionnaireEvaluationRequest.questionId) && Intrinsics.EZpvd((Object) this.answerId, (Object) pMSQuestionnaireEvaluationRequest.answerId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnswerId() {
        return this.answerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarType() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuestionId() {
        return this.questionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.pillarType.hashCode() * 31) + this.questionId.hashCode()) * 31) + this.answerId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PMSQuestionnaireEvaluationRequest(pillarType=" + this.pillarType + ", questionId=" + this.questionId + ", answerId=" + this.answerId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.PMSQuestionnaireEvaluationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PMSQuestionnaireEvaluationRequest> serializer() {
            return PMSQuestionnaireEvaluationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PMSQuestionnaireEvaluationRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PMSQuestionnaireEvaluationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.pillarType = str;
        this.questionId = str2;
        this.answerId = str3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PMSQuestionnaireEvaluationRequest pMSQuestionnaireEvaluationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pMSQuestionnaireEvaluationRequest.pillarType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pMSQuestionnaireEvaluationRequest.questionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pMSQuestionnaireEvaluationRequest.answerId);
    }

    public PMSQuestionnaireEvaluationRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pillarType = str;
        this.questionId = str2;
        this.answerId = str3;
    }
}
