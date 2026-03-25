package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PMSQuestionsBean {
    private final String pillarId;
    private final String pillarType;
    private final List<QuestionnaireBean> questionnaire;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(QuestionnaireBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.PMSQuestionsBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PMSQuestionsBean copy$default(PMSQuestionsBean pMSQuestionsBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pMSQuestionsBean.pillarId;
        }
        if ((i & 2) != 0) {
            str2 = pMSQuestionsBean.pillarType;
        }
        if ((i & 4) != 0) {
            list = pMSQuestionsBean.questionnaire;
        }
        return pMSQuestionsBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuestionnaireBean> component3() {
        return this.questionnaire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PMSQuestionsBean copy(@NotNull String str, @NotNull String str2, @NotNull List<QuestionnaireBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PMSQuestionsBean(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMSQuestionsBean)) {
            return false;
        }
        PMSQuestionsBean pMSQuestionsBean = (PMSQuestionsBean) obj;
        return Intrinsics.EZpvd((Object) this.pillarId, (Object) pMSQuestionsBean.pillarId) && Intrinsics.EZpvd((Object) this.pillarType, (Object) pMSQuestionsBean.pillarType) && Intrinsics.EZpvd(this.questionnaire, pMSQuestionsBean.questionnaire);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarId() {
        return this.pillarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPillarType() {
        return this.pillarType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuestionnaireBean> getQuestionnaire() {
        return this.questionnaire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.pillarId.hashCode() * 31) + this.pillarType.hashCode()) * 31) + this.questionnaire.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PMSQuestionsBean(pillarId=" + this.pillarId + ", pillarType=" + this.pillarType + ", questionnaire=" + this.questionnaire + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PMSQuestionsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PMSQuestionsBean> serializer() {
            return PMSQuestionsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PMSQuestionsBean(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PMSQuestionsBean$$serializer.INSTANCE.getDescriptor());
        }
        this.pillarId = str;
        this.pillarType = str2;
        this.questionnaire = list;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PMSQuestionsBean pMSQuestionsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pMSQuestionsBean.pillarId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pMSQuestionsBean.pillarType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], pMSQuestionsBean.questionnaire);
    }

    public PMSQuestionsBean(@NotNull String str, @NotNull String str2, @NotNull List<QuestionnaireBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.pillarId = str;
        this.pillarType = str2;
        this.questionnaire = list;
    }
}
