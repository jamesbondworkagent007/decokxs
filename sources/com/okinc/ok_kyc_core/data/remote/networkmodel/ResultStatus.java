package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.net.HttpHeaders;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ResultStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResultStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("success")
    public static final ResultStatus Success = new ResultStatus("Success", 0);

    @SerialName("successConfetti")
    public static final ResultStatus SuccessConfetti = new ResultStatus("SuccessConfetti", 1);

    @SerialName("warning")
    public static final ResultStatus Warning = new ResultStatus(HttpHeaders.WARNING, 2);

    @SerialName("waiting")
    public static final ResultStatus Waiting = new ResultStatus("Waiting", 3);

    @SerialName("continue")
    public static final ResultStatus Continue = new ResultStatus("Continue", 4);

    @SerialName("wcHitWarning")
    public static final ResultStatus Risk = new ResultStatus("Risk", 5);

    @SerialName(EVM5792Capability.EVM5792Atomic.STATUS_READY)
    public static final ResultStatus Ready = new ResultStatus("Ready", 6);

    @SerialName("questionSuccess")
    public static final ResultStatus QuestionSuccess = new ResultStatus("QuestionSuccess", 7);

    @SerialName("questionFail")
    public static final ResultStatus QuestionFail = new ResultStatus("QuestionFail", 8);

    @SerialName("questionWarn")
    public static final ResultStatus QuestionWarn = new ResultStatus("QuestionWarn", 9);

    @SerialName("questionStart")
    public static final ResultStatus QuestionStart = new ResultStatus("QuestionStart", 10);

    @SerialName("questionUpload")
    public static final ResultStatus QuestionUpload = new ResultStatus("QuestionUpload", 11);

    @SerialName("questionPending")
    public static final ResultStatus QuestionPending = new ResultStatus("QuestionPending", 12);

    @SerialName("riskQuestionnaire")
    public static final ResultStatus RiskQuestionnaire = new ResultStatus("RiskQuestionnaire", 13);

    @SerialName("riskScam")
    public static final ResultStatus RiskScam = new ResultStatus("RiskScam", 14);

    @SerialName("riskSuccess")
    public static final ResultStatus RiskSuccess = new ResultStatus("RiskSuccess", 15);

    @SerialName("processing")
    public static final ResultStatus Processing = new ResultStatus("Processing", 16);

    @SerialName("verificationSuccess")
    public static final ResultStatus VerificationSuccess = new ResultStatus("VerificationSuccess", 17);

    @SerialName("transaction")
    public static final ResultStatus Transaction = new ResultStatus("Transaction", 18);

    @SerialName("signature")
    public static final ResultStatus Signature = new ResultStatus(RequestParameters.SIGNATURE, 19);

    @SerialName("reviewInProgress")
    public static final ResultStatus ReviewInProgress = new ResultStatus("ReviewInProgress", 20);

    @SerialName("inProgress")
    public static final ResultStatus InProgress = new ResultStatus("InProgress", 21);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResultStatus[] $values() {
        return new ResultStatus[]{Success, SuccessConfetti, Warning, Waiting, Continue, Risk, Ready, QuestionSuccess, QuestionFail, QuestionWarn, QuestionStart, QuestionUpload, QuestionPending, RiskQuestionnaire, RiskScam, RiskSuccess, Processing, VerificationSuccess, Transaction, Signature, ReviewInProgress, InProgress};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResultStatus> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ResultStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ResultStatus> serializer() {
            return EZpvd();
        }
    }

    private ResultStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus", values(), new String[]{"success", "successConfetti", "warning", "waiting", "continue", "wcHitWarning", EVM5792Capability.EVM5792Atomic.STATUS_READY, "questionSuccess", "questionFail", "questionWarn", "questionStart", "questionUpload", "questionPending", "riskQuestionnaire", "riskScam", "riskSuccess", "processing", "verificationSuccess", "transaction", "signature", "reviewInProgress", "inProgress"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    static {
        ResultStatus[] resultStatusArr$values = $values();
        $VALUES = resultStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(resultStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResultStatus._init_$_anonymous_();
            }
        });
    }

    public static ResultStatus valueOf(String str) {
        return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
    }

    public static ResultStatus[] values() {
        return (ResultStatus[]) $VALUES.clone();
    }
}
