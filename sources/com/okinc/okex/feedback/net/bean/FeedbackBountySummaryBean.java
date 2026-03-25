package com.okinc.okex.feedback.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FeedbackBountySummaryBean {
    private String displayError;
    private String disputeResolution;
    private String feedbackTiers;
    private String generalErrors;
    private String generalRulesOfRating;
    private String languageIssues;
    private String p1Vulnerability;
    private String p2Vulnerability;
    private String p3Vulnerability;
    private String p4Vulnerability;
    private String p5Vulnerability;
    private String riskLevel;
    private String rulesAndEligibility;
    private String severeErrors;
    private String vulnerabilitySubmissionTemplate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeedbackBountySummaryBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feedbackTiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.p3Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.p2Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.p1Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.vulnerabilitySubmissionTemplate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.generalRulesOfRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.disputeResolution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.severeErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.generalErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.languageIssues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rulesAndEligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.p5Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.p4Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackBountySummaryBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new FeedbackBountySummaryBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackBountySummaryBean)) {
            return false;
        }
        FeedbackBountySummaryBean feedbackBountySummaryBean = (FeedbackBountySummaryBean) obj;
        return Intrinsics.EZpvd((Object) this.feedbackTiers, (Object) feedbackBountySummaryBean.feedbackTiers) && Intrinsics.EZpvd((Object) this.severeErrors, (Object) feedbackBountySummaryBean.severeErrors) && Intrinsics.EZpvd((Object) this.generalErrors, (Object) feedbackBountySummaryBean.generalErrors) && Intrinsics.EZpvd((Object) this.displayError, (Object) feedbackBountySummaryBean.displayError) && Intrinsics.EZpvd((Object) this.languageIssues, (Object) feedbackBountySummaryBean.languageIssues) && Intrinsics.EZpvd((Object) this.rulesAndEligibility, (Object) feedbackBountySummaryBean.rulesAndEligibility) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) feedbackBountySummaryBean.riskLevel) && Intrinsics.EZpvd((Object) this.p5Vulnerability, (Object) feedbackBountySummaryBean.p5Vulnerability) && Intrinsics.EZpvd((Object) this.p4Vulnerability, (Object) feedbackBountySummaryBean.p4Vulnerability) && Intrinsics.EZpvd((Object) this.p3Vulnerability, (Object) feedbackBountySummaryBean.p3Vulnerability) && Intrinsics.EZpvd((Object) this.p2Vulnerability, (Object) feedbackBountySummaryBean.p2Vulnerability) && Intrinsics.EZpvd((Object) this.p1Vulnerability, (Object) feedbackBountySummaryBean.p1Vulnerability) && Intrinsics.EZpvd((Object) this.vulnerabilitySubmissionTemplate, (Object) feedbackBountySummaryBean.vulnerabilitySubmissionTemplate) && Intrinsics.EZpvd((Object) this.generalRulesOfRating, (Object) feedbackBountySummaryBean.generalRulesOfRating) && Intrinsics.EZpvd((Object) this.disputeResolution, (Object) feedbackBountySummaryBean.disputeResolution);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayError() {
        return this.displayError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisputeResolution() {
        return this.disputeResolution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeedbackTiers() {
        return this.feedbackTiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGeneralErrors() {
        return this.generalErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGeneralRulesOfRating() {
        return this.generalRulesOfRating;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguageIssues() {
        return this.languageIssues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP1Vulnerability() {
        return this.p1Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP2Vulnerability() {
        return this.p2Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP3Vulnerability() {
        return this.p3Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP4Vulnerability() {
        return this.p4Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getP5Vulnerability() {
        return this.p5Vulnerability;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRulesAndEligibility() {
        return this.rulesAndEligibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSevereErrors() {
        return this.severeErrors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVulnerabilitySubmissionTemplate() {
        return this.vulnerabilitySubmissionTemplate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.feedbackTiers.hashCode() * 31) + this.severeErrors.hashCode()) * 31) + this.generalErrors.hashCode()) * 31) + this.displayError.hashCode()) * 31) + this.languageIssues.hashCode()) * 31) + this.rulesAndEligibility.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.p5Vulnerability.hashCode()) * 31) + this.p4Vulnerability.hashCode()) * 31) + this.p3Vulnerability.hashCode()) * 31) + this.p2Vulnerability.hashCode()) * 31) + this.p1Vulnerability.hashCode()) * 31) + this.vulnerabilitySubmissionTemplate.hashCode()) * 31) + this.generalRulesOfRating.hashCode()) * 31) + this.disputeResolution.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayError = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisputeResolution(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.disputeResolution = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeedbackTiers(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feedbackTiers = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralErrors(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.generalErrors = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralRulesOfRating(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.generalRulesOfRating = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguageIssues(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.languageIssues = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP1Vulnerability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p1Vulnerability = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP2Vulnerability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p2Vulnerability = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP3Vulnerability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p3Vulnerability = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP4Vulnerability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p4Vulnerability = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP5Vulnerability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p5Vulnerability = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRulesAndEligibility(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rulesAndEligibility = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSevereErrors(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.severeErrors = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVulnerabilitySubmissionTemplate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vulnerabilitySubmissionTemplate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeedbackBountySummaryBean(feedbackTiers=" + this.feedbackTiers + ", severeErrors=" + this.severeErrors + ", generalErrors=" + this.generalErrors + ", displayError=" + this.displayError + ", languageIssues=" + this.languageIssues + ", rulesAndEligibility=" + this.rulesAndEligibility + ", riskLevel=" + this.riskLevel + ", p5Vulnerability=" + this.p5Vulnerability + ", p4Vulnerability=" + this.p4Vulnerability + ", p3Vulnerability=" + this.p3Vulnerability + ", p2Vulnerability=" + this.p2Vulnerability + ", p1Vulnerability=" + this.p1Vulnerability + ", vulnerabilitySubmissionTemplate=" + this.vulnerabilitySubmissionTemplate + ", generalRulesOfRating=" + this.generalRulesOfRating + ", disputeResolution=" + this.disputeResolution + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.FeedbackBountySummaryBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeedbackBountySummaryBean> serializer() {
            return FeedbackBountySummaryBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackBountySummaryBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.feedbackTiers = "";
        } else {
            this.feedbackTiers = str;
        }
        if ((i & 2) == 0) {
            this.severeErrors = "";
        } else {
            this.severeErrors = str2;
        }
        if ((i & 4) == 0) {
            this.generalErrors = "";
        } else {
            this.generalErrors = str3;
        }
        if ((i & 8) == 0) {
            this.displayError = "";
        } else {
            this.displayError = str4;
        }
        if ((i & 16) == 0) {
            this.languageIssues = "";
        } else {
            this.languageIssues = str5;
        }
        if ((i & 32) == 0) {
            this.rulesAndEligibility = "";
        } else {
            this.rulesAndEligibility = str6;
        }
        if ((i & 64) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str7;
        }
        if ((i & 128) == 0) {
            this.p5Vulnerability = "";
        } else {
            this.p5Vulnerability = str8;
        }
        if ((i & 256) == 0) {
            this.p4Vulnerability = "";
        } else {
            this.p4Vulnerability = str9;
        }
        if ((i & 512) == 0) {
            this.p3Vulnerability = "";
        } else {
            this.p3Vulnerability = str10;
        }
        if ((i & 1024) == 0) {
            this.p2Vulnerability = "";
        } else {
            this.p2Vulnerability = str11;
        }
        if ((i & 2048) == 0) {
            this.p1Vulnerability = "";
        } else {
            this.p1Vulnerability = str12;
        }
        if ((i & 4096) == 0) {
            this.vulnerabilitySubmissionTemplate = "";
        } else {
            this.vulnerabilitySubmissionTemplate = str13;
        }
        if ((i & 8192) == 0) {
            this.generalRulesOfRating = "";
        } else {
            this.generalRulesOfRating = str14;
        }
        if ((i & 16384) == 0) {
            this.disputeResolution = "";
        } else {
            this.disputeResolution = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FeedbackBountySummaryBean feedbackBountySummaryBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.feedbackTiers, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, feedbackBountySummaryBean.feedbackTiers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.severeErrors, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, feedbackBountySummaryBean.severeErrors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.generalErrors, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, feedbackBountySummaryBean.generalErrors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.displayError, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, feedbackBountySummaryBean.displayError);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.languageIssues, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, feedbackBountySummaryBean.languageIssues);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.rulesAndEligibility, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, feedbackBountySummaryBean.rulesAndEligibility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, feedbackBountySummaryBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.p5Vulnerability, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, feedbackBountySummaryBean.p5Vulnerability);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.p4Vulnerability, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, feedbackBountySummaryBean.p4Vulnerability);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.p3Vulnerability, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, feedbackBountySummaryBean.p3Vulnerability);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.p2Vulnerability, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, feedbackBountySummaryBean.p2Vulnerability);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.p1Vulnerability, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, feedbackBountySummaryBean.p1Vulnerability);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.vulnerabilitySubmissionTemplate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, feedbackBountySummaryBean.vulnerabilitySubmissionTemplate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) feedbackBountySummaryBean.generalRulesOfRating, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, feedbackBountySummaryBean.generalRulesOfRating);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) feedbackBountySummaryBean.disputeResolution, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, feedbackBountySummaryBean.disputeResolution);
    }

    public FeedbackBountySummaryBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.feedbackTiers = str;
        this.severeErrors = str2;
        this.generalErrors = str3;
        this.displayError = str4;
        this.languageIssues = str5;
        this.rulesAndEligibility = str6;
        this.riskLevel = str7;
        this.p5Vulnerability = str8;
        this.p4Vulnerability = str9;
        this.p3Vulnerability = str10;
        this.p2Vulnerability = str11;
        this.p1Vulnerability = str12;
        this.vulnerabilitySubmissionTemplate = str13;
        this.generalRulesOfRating = str14;
        this.disputeResolution = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.okex.feedback.net.bean.FeedbackBountySummaryBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FeedbackBountySummaryBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) == 0 ? str15 : "");
    }
}
