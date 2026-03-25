package com.okinc.kyc.api.biz.delta;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class AdditionalKycInfosBean implements Serializable {
    public static final int POA_STATUS_NOT_YET_STARTED = 0;
    public static final int POA_STATUS_REJECTED = 3;
    public static final int POA_STATUS_SUBMITTED = 2;
    public static final int POA_STATUS_VERIFYING = 1;
    public static final int STATUS_APPROVED = 2;
    public static final int STATUS_PENDING = 0;
    public static final int STATUS_REJECTED = 3;
    public static final int STATUS_VERIFYING = 1;
    private Integer additionStatus;
    private Integer kyc1Status;
    private Integer kyc2Status;
    private AdditionalKycInfosPersonalInfo personalInfo;
    private Integer poaStatus;
    private String rejectReason;
    private Integer subjectType;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAdditionStatus() {
        return this.additionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKyc1Status() {
        return this.kyc1Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKyc2Status() {
        return this.kyc2Status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdditionalKycInfosPersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPoaStatus() {
        return this.poaStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRejectReason() {
        return this.rejectReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubjectType() {
        return this.subjectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionStatus(Integer num) {
        this.additionStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKyc1Status(Integer num) {
        this.kyc1Status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKyc2Status(Integer num) {
        this.kyc2Status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPersonalInfo(AdditionalKycInfosPersonalInfo additionalKycInfosPersonalInfo) {
        this.personalInfo = additionalKycInfosPersonalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPoaStatus(Integer num) {
        this.poaStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRejectReason(String str) {
        this.rejectReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubjectType(Integer num) {
        this.subjectType = num;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.delta.AdditionalKycInfosBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
