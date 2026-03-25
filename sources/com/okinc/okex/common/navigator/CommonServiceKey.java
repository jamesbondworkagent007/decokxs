package com.okinc.okex.common.navigator;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonServiceKey {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CommonServiceKey[] $VALUES;
    public static final CommonServiceKey SupportCenter = new CommonServiceKey("SupportCenter", 0);
    public static final CommonServiceKey Chatbot = new CommonServiceKey("Chatbot", 1);
    public static final CommonServiceKey Article = new CommonServiceKey("Article", 2);
    public static final CommonServiceKey TicketForm = new CommonServiceKey("TicketForm", 3);
    public static final CommonServiceKey TicketHistory = new CommonServiceKey("TicketHistory", 4);
    public static final CommonServiceKey Email = new CommonServiceKey("Email", 5);
    public static final CommonServiceKey OpenWebView = new CommonServiceKey("OpenWebView", 6);
    public static final CommonServiceKey OpenDeeplink = new CommonServiceKey("OpenDeeplink", 7);
    public static final CommonServiceKey DepositDiagnostic = new CommonServiceKey("DepositDiagnostic", 8);
    public static final CommonServiceKey LoggedInChatbot = new CommonServiceKey("LoggedInChatbot", 9);
    public static final CommonServiceKey FeedbackBounty = new CommonServiceKey("FeedbackBounty", 10);
    public static final CommonServiceKey ErrorLogUpload = new CommonServiceKey("ErrorLogUpload", 11);
    public static final CommonServiceKey OpenProductDocs = new CommonServiceKey("OpenProductDocs", 12);
    public static final CommonServiceKey Campaign = new CommonServiceKey(CustomMessageData.SERVICE_NAME_CAMPAIGN, 13);
    public static final CommonServiceKey VideoMeetingOtp = new CommonServiceKey("VideoMeetingOtp", 14);
    public static final CommonServiceKey OpenLogin = new CommonServiceKey("OpenLogin", 15);
    public static final CommonServiceKey ChangeEmail = new CommonServiceKey("ChangeEmail", 16);
    public static final CommonServiceKey ChangePhoneNumber = new CommonServiceKey("ChangePhoneNumber", 17);
    public static final CommonServiceKey ChangeLoginPassword = new CommonServiceKey("ChangeLoginPassword", 18);
    public static final CommonServiceKey ChangeGoogleAuth = new CommonServiceKey("ChangeGoogleAuth", 19);
    public static final CommonServiceKey OpenFreezeAccount = new CommonServiceKey("OpenFreezeAccount", 20);
    public static final CommonServiceKey OpenCloseAccount = new CommonServiceKey("OpenCloseAccount", 21);
    public static final CommonServiceKey KycUserCenter = new CommonServiceKey("KycUserCenter", 22);
    public static final CommonServiceKey OpenWithdrawDetail = new CommonServiceKey("OpenWithdrawDetail", 23);
    public static final CommonServiceKey P2pReorder = new CommonServiceKey("P2pReorder", 24);
    public static final CommonServiceKey Default = new CommonServiceKey("Default", 25);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CommonServiceKey[] $values() {
        return new CommonServiceKey[]{SupportCenter, Chatbot, Article, TicketForm, TicketHistory, Email, OpenWebView, OpenDeeplink, DepositDiagnostic, LoggedInChatbot, FeedbackBounty, ErrorLogUpload, OpenProductDocs, Campaign, VideoMeetingOtp, OpenLogin, ChangeEmail, ChangePhoneNumber, ChangeLoginPassword, ChangeGoogleAuth, OpenFreezeAccount, OpenCloseAccount, KycUserCenter, OpenWithdrawDetail, P2pReorder, Default};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CommonServiceKey> getEntries() {
        return $ENTRIES;
    }

    private CommonServiceKey(String str, int i) {
    }

    static {
        CommonServiceKey[] commonServiceKeyArr$values = $values();
        $VALUES = commonServiceKeyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(commonServiceKeyArr$values);
    }

    public static CommonServiceKey valueOf(String str) {
        return (CommonServiceKey) Enum.valueOf(CommonServiceKey.class, str);
    }

    public static CommonServiceKey[] values() {
        return (CommonServiceKey[]) $VALUES.clone();
    }
}
