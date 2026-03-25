package com.okinc.ok_kyc_core.presentation.views;

import androidx.annotation.IdRes;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.stats.CodePackage;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C43662rtX;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Illustrations {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Illustrations[] $VALUES;
    private final int imageId;
    private final String nameValue;
    private final String type;
    public static final Illustrations SHIELD = new Illustrations("SHIELD", 0, "shield", TtmlNode.TAG_IMAGE, C43662rtX.Activity.OuxcSI);
    public static final Illustrations ID_FRONT = new Illustrations("ID_FRONT", 1, "idFront", TtmlNode.TAG_IMAGE, C43662rtX.Activity.DCJXGO);
    public static final Illustrations ID_BACK = new Illustrations("ID_BACK", 2, "idBack", TtmlNode.TAG_IMAGE, C43662rtX.Activity.ODWQjV);
    public static final Illustrations PASSPORT = new Illustrations("PASSPORT", 3, "passport", TtmlNode.TAG_IMAGE, C43662rtX.Activity.RKDWNf);
    public static final Illustrations DRIVER_LICENSE = new Illustrations("DRIVER_LICENSE", 4, "driverLicense", TtmlNode.TAG_IMAGE, C43662rtX.Activity.fARcdN);
    public static final Illustrations DRIVER_LICENSE_FRONT = new Illustrations("DRIVER_LICENSE_FRONT", 5, "driverLicenseFront", TtmlNode.TAG_IMAGE, C43662rtX.Activity.fARcdN);
    public static final Illustrations DRIVER_LICENSE_BACK = new Illustrations("DRIVER_LICENSE_BACK", 6, "driverLicenseBack", TtmlNode.TAG_IMAGE, C43662rtX.Activity.fJNWhG);
    public static final Illustrations FACE = new Illustrations("FACE", 7, "selfie", TtmlNode.TAG_IMAGE, C43662rtX.Activity.dHguZz);
    public static final Illustrations SELFIE_WITH_ID = new Illustrations("SELFIE_WITH_ID", 8, "selfieWithId", TtmlNode.TAG_IMAGE, C43662rtX.Activity.zuWLRA);
    public static final Illustrations RISK_ASSESSMENT = new Illustrations("RISK_ASSESSMENT", 9, "riskAssessment", TtmlNode.TAG_IMAGE, C43662rtX.Activity.dmfpNf);
    public static final Illustrations KNOWLEDGE_TEST = new Illustrations("KNOWLEDGE_TEST", 10, "knowledgeTest", TtmlNode.TAG_IMAGE, C43662rtX.Activity.ffGIBT);
    public static final Illustrations BEFORE_VERIFICATION = new Illustrations("BEFORE_VERIFICATION", 11, "onboarding", TtmlNode.TAG_IMAGE, C43662rtX.Activity.iwGUEr);
    public static final Illustrations UNDER_VERIFICATION = new Illustrations("UNDER_VERIFICATION", 12, "inProgress", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.iwGUEr);
    public static final Illustrations VERIFICATION_SUCCESS = new Illustrations("VERIFICATION_SUCCESS", 13, "success", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.uzCIH);
    public static final Illustrations VERIFICATION_FAILURE_ARTIFICIAL = new Illustrations("VERIFICATION_FAILURE_ARTIFICIAL", 14, "fail", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.valueOf);
    public static final Illustrations VERIFICATION_FAILURE_EDD = new Illustrations("VERIFICATION_FAILURE_EDD", 15, "oneMoreStep", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QkdxfA);
    public static final Illustrations VERIFICATION_FAILURE_RETRY = new Illustrations("VERIFICATION_FAILURE_RETRY", 16, "warn", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.ejfBZ);
    public static final Illustrations QUESTIONSTART = new Illustrations("QUESTIONSTART", 17, "questionStart", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QfsBiF);
    public static final Illustrations QUESTION_START = new Illustrations("QUESTION_START", 18, "question_start", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QfsBiF);
    public static final Illustrations ELIGIBILITY_INDIVIDUAL = new Illustrations("ELIGIBILITY_INDIVIDUAL", 19, "confirmMark", TtmlNode.TAG_IMAGE, C43662rtX.Activity.gHZMYf);
    public static final Illustrations PROCESSING = new Illustrations("PROCESSING", 20, "processing", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.fIwbmz);
    public static final Illustrations QUESTIONSUCCESS = new Illustrations("QUESTIONSUCCESS", 21, "questionSuccess", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.uzCIH);
    public static final Illustrations MIGRATION = new Illustrations("MIGRATION", 22, "migration", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QkdxfA);
    public static final Illustrations RISK_QUESTIONNAIRE = new Illustrations("RISK_QUESTIONNAIRE", 23, "riskQuestionnaire", TtmlNode.TAG_IMAGE, C43662rtX.Activity.DCUTEI);
    public static final Illustrations RISK_SCAM = new Illustrations("RISK_SCAM", 24, "riskScam", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QHmsKR);
    public static final Illustrations KYB_GUIDE_ICON = new Illustrations("KYB_GUIDE_ICON", 25, "kybGuideIcon", TtmlNode.TAG_IMAGE, C43662rtX.Activity.QUSxYX);
    public static final Illustrations PENDING = new Illustrations(CardSyncResponse.PENDING, 26, "pending", TtmlNode.TAG_IMAGE, C43662rtX.Activity.zsXlph);
    public static final Illustrations SATOSHI = new Illustrations("SATOSHI", 27, "transaction", TtmlNode.TAG_IMAGE, C43662rtX.Activity.zuBGHE);
    public static final Illustrations SIGNATURE = new Illustrations("SIGNATURE", 28, "signature", TtmlNode.TAG_IMAGE, C43662rtX.Activity.AuCTelauCTel);
    public static final Illustrations SATOSHI_SUCCESS = new Illustrations("SATOSHI_SUCCESS", 29, "verificationSuccess", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.uzCIH);
    public static final Illustrations ILLUSTRATION = new Illustrations("ILLUSTRATION", 30, "Illustration", TtmlNode.TAG_IMAGE, C43662rtX.Activity.DarRvM);
    public static final Illustrations WARNING_MARK = new Illustrations("WARNING_MARK", 31, "warning_mark", TtmlNode.TAG_IMAGE, C52761wXj.TaskDescription.FdcJU);
    public static final Illustrations RISKPROFILE = new Illustrations("RISKPROFILE", 32, "riskProfile", TtmlNode.TAG_IMAGE, C43662rtX.Activity.aKErDB);
    public static final Illustrations VERIFICATION_CENTER_SUCCESS_ICON = new Illustrations("VERIFICATION_CENTER_SUCCESS_ICON", 33, "verificationCenterSuccessIcon", TtmlNode.TAG_IMAGE, C43662rtX.Activity.fFgQHt);
    public static final Illustrations LOCATION = new Illustrations(CodePackage.LOCATION, 34, "location", TtmlNode.TAG_IMAGE, C43662rtX.Activity.wlaJM);
    public static final Illustrations CN_IDFRONT = new Illustrations("CN_IDFRONT", 35, "cnIdFront", TtmlNode.TAG_IMAGE, C43662rtX.Activity.getPostValueLengthLimit);
    public static final Illustrations CN_IDBACK = new Illustrations("CN_IDBACK", 36, "cnIdBack", TtmlNode.TAG_IMAGE, C43662rtX.Activity.DXXBbs);
    public static final Illustrations VIDEO_CALL = new Illustrations("VIDEO_CALL", 37, "videoCall", TtmlNode.TAG_IMAGE, C43662rtX.Activity.hrNTAI);
    public static final Illustrations SINGPASS = new Illustrations("SINGPASS", 38, "singpass", TtmlNode.TAG_IMAGE, C43662rtX.Activity.RcXXUw);
    public static final Illustrations SINGPASS_BUTTON = new Illustrations("SINGPASS_BUTTON", 39, "singpass_button", TtmlNode.TAG_IMAGE, C43662rtX.Activity.RcXXUw);
    public static final Illustrations SAFE_PROTECTICON = new Illustrations("SAFE_PROTECTICON", 40, "safeProtectIcon", TtmlNode.TAG_IMAGE, C43662rtX.Activity.gwTjWJ);
    public static final Illustrations EXCHANGE = new Illustrations("EXCHANGE", 41, "exchange", TtmlNode.TAG_IMAGE, C43662rtX.Activity.AxsJAY);
    public static final Illustrations WALLET = new Illustrations("WALLET", 42, "wallet", TtmlNode.TAG_IMAGE, C43662rtX.Activity.finit);
    public static final Illustrations REVIEW_IN_PROGRESS = new Illustrations("REVIEW_IN_PROGRESS", 43, "reviewInProgress", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.fIwbmz);
    public static final Illustrations WAITING = new Illustrations("WAITING", 44, "waiting", TtmlNode.TAG_IMAGE, C52761wXj.PendingIntent.iwGUEr);
    public static final Illustrations MARGIN = new Illustrations("MARGIN", 45, "margin", TtmlNode.TAG_IMAGE, C52761wXj.TaskDescription.HJWChP);
    public static final Illustrations LOAN = new Illustrations("LOAN", 46, "loan", TtmlNode.TAG_IMAGE, C52761wXj.TaskDescription.pause);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Illustrations[] $values() {
        return new Illustrations[]{SHIELD, ID_FRONT, ID_BACK, PASSPORT, DRIVER_LICENSE, DRIVER_LICENSE_FRONT, DRIVER_LICENSE_BACK, FACE, SELFIE_WITH_ID, RISK_ASSESSMENT, KNOWLEDGE_TEST, BEFORE_VERIFICATION, UNDER_VERIFICATION, VERIFICATION_SUCCESS, VERIFICATION_FAILURE_ARTIFICIAL, VERIFICATION_FAILURE_EDD, VERIFICATION_FAILURE_RETRY, QUESTIONSTART, QUESTION_START, ELIGIBILITY_INDIVIDUAL, PROCESSING, QUESTIONSUCCESS, MIGRATION, RISK_QUESTIONNAIRE, RISK_SCAM, KYB_GUIDE_ICON, PENDING, SATOSHI, SIGNATURE, SATOSHI_SUCCESS, ILLUSTRATION, WARNING_MARK, RISKPROFILE, VERIFICATION_CENTER_SUCCESS_ICON, LOCATION, CN_IDFRONT, CN_IDBACK, VIDEO_CALL, SINGPASS, SINGPASS_BUTTON, SAFE_PROTECTICON, EXCHANGE, WALLET, REVIEW_IN_PROGRESS, WAITING, MARGIN, LOAN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Illustrations> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameValue() {
        return this.nameValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private Illustrations(String str, int i, @IdRes String str2, String str3, int i2) {
        this.nameValue = str2;
        this.type = str3;
        this.imageId = i2;
    }

    static {
        Illustrations[] illustrationsArr$values = $values();
        $VALUES = illustrationsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(illustrationsArr$values);
    }

    public static Illustrations valueOf(String str) {
        return (Illustrations) Enum.valueOf(Illustrations.class, str);
    }

    public static Illustrations[] values() {
        return (Illustrations[]) $VALUES.clone();
    }
}
