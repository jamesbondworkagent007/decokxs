package com.okinc.ok_kyc_core.presentation.views;

import androidx.annotation.IdRes;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.log.LogUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import o.C43662rtX;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Icon {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Icon[] $VALUES;
    private final int imageId;
    private final String nameValue;
    public static final Icon Check = new Icon("Check", 0, "check", C43662rtX.PendingIntent.hDKMBd);
    public static final Icon CHECK_CIRCLE = new Icon("CHECK_CIRCLE", 1, "check-circle", C43662rtX.PendingIntent.AuCTel);
    public static final Icon CHECK_CIRCLE_OUTLINE = new Icon("CHECK_CIRCLE_OUTLINE", 2, "check-circle-outline", C43662rtX.PendingIntent.fJNWhG);
    public static final Icon COMPLETED = new Icon("COMPLETED", 3, "completed", C43662rtX.PendingIntent.fJNWhG);
    public static final Icon SHIELD_CIRCLE = new Icon("SHIELD_CIRCLE", 4, "shield-circle", C43662rtX.PendingIntent.zuBGHE);
    public static final Icon ACCOUNT_CIRCLE = new Icon("ACCOUNT_CIRCLE", 5, "account-circle", C43662rtX.PendingIntent.isConnected);
    public static final Icon CALENDAR_BLANK_CIRCLE = new Icon("CALENDAR_BLANK_CIRCLE", 6, "calendar-blank-circle", C43662rtX.PendingIntent.AkhnZx);
    public static final Icon EyeCircle = new Icon("EyeCircle", 7, "eye-circle", C43662rtX.PendingIntent.ejfBZ);
    public static final Icon TEXT_BOX = new Icon("TEXT_BOX", 8, "text-box", C43662rtX.PendingIntent.gHZMYf);
    public static final Icon ALERT_CIRCLE = new Icon("ALERT_CIRCLE", 9, "alert-circle", C43662rtX.PendingIntent.fetchVPNInfo);
    public static final Icon ALERT_OUTLINE = new Icon("ALERT_OUTLINE", 10, "alert-outline", C43662rtX.PendingIntent.values);
    public static final Icon CLOSE_CIRCLE = new Icon("CLOSE_CIRCLE", 11, "close-circle", C43662rtX.PendingIntent.fARcdN);
    public static final Icon CLOSE_OUTLINE = new Icon("CLOSE_OUTLINE", 12, "close-outline", C43662rtX.PendingIntent.fIwbmz);
    public static final Icon TICK = new Icon("TICK", 13, "tick", C43662rtX.PendingIntent.AuCTel);
    public static final Icon CROSS = new Icon("CROSS", 14, "cross", C43662rtX.PendingIntent.fARcdN);
    public static final Icon FACE_ID_CIRCLE = new Icon("FACE_ID_CIRCLE", 15, "face-id-circle", C43662rtX.PendingIntent.getNewProxyInstance);
    public static final Icon FACE_ID = new Icon("FACE_ID", 16, "face_id", C43662rtX.PendingIntent.getNewProxyInstance);
    public static final Icon CARD_ACCOUNT_CIRCLE = new Icon("CARD_ACCOUNT_CIRCLE", 17, "card-account-circle", C43662rtX.PendingIntent.uzCIH);
    public static final Icon HOLLOW_DOT = new Icon("HOLLOW_DOT", 18, "hollow-dot", C43662rtX.PendingIntent.getFieldNames);
    public static final Icon SOLID_DOT = new Icon("SOLID_DOT", 19, "solid-dot", C43662rtX.PendingIntent.sSMYrx);
    public static final Icon SHIELD = new Icon("SHIELD", 20, "security-shield", C43662rtX.PendingIntent.zuBGHE);
    public static final Icon REMINDER = new Icon("REMINDER", 21, NotificationCompat.CATEGORY_REMINDER, C43662rtX.PendingIntent.QUSxYX);
    public static final Icon REPORT = new Icon("REPORT", 22, "report", C43662rtX.PendingIntent.OcIXYQ);
    public static final Icon PROFILE = new Icon(LogUtils.EVENT_TYPE_PROFILE, 23, Scopes.PROFILE, C43662rtX.PendingIntent.AuCTelauCTel);
    public static final Icon WHITE_PAPER = new Icon("WHITE_PAPER", 24, "trade_rules", C43662rtX.PendingIntent.fZBcTu);
    public static final Icon ROD = new Icon("ROD", 25, "rod", C43662rtX.PendingIntent.dNCPSb);
    public static final Icon BELL = new Icon("BELL", 26, "bell", C43662rtX.PendingIntent.AxsJAY);
    public static final Icon PLUS = new Icon("PLUS", 27, "plus", C43662rtX.PendingIntent.QbewEr);
    public static final Icon DRAW = new Icon("DRAW", 28, "draw", C43662rtX.PendingIntent.QOLQEE);
    public static final Icon SHARE = new Icon("SHARE", 29, "share", C43662rtX.PendingIntent.RcXXUw);
    public static final Icon FAIL_FILL = new Icon("FAIL_FILL", 30, "fail_fill", C43662rtX.PendingIntent.fARcdN);
    public static final Icon SUCCESS_FILL = new Icon("SUCCESS_FILL", 31, "success_fill", C43662rtX.PendingIntent.AuCTel);
    public static final Icon WARNING_FILL = new Icon("WARNING_FILL", 32, "warning_fill", C43662rtX.PendingIntent.fetchVPNInfo);
    public static final Icon POINTER_RIGHT = new Icon("POINTER_RIGHT", 33, "pointer_right", C43662rtX.PendingIntent.RJOkX);
    public static final Icon PORTFOLIO = new Icon("PORTFOLIO", 34, "portfolio", C43662rtX.PendingIntent.wlaJM);
    public static final Icon ADDRESS_BOOK = new Icon("ADDRESS_BOOK", 35, "address_book", C43662rtX.PendingIntent.iwGUEr);
    public static final Icon EDIT = new Icon("EDIT", 36, "edit", C43662rtX.PendingIntent.QKVWgx);
    public static final Icon PROOF_OF_ADDRESS = new Icon("PROOF_OF_ADDRESS", 37, "proof_of_address", C43662rtX.PendingIntent.QfsBiF);
    public static final Icon CLOCK_TIME_THREE_OUTLINE = new Icon("CLOCK_TIME_THREE_OUTLINE", 38, "clock-time-three-outline", C43662rtX.PendingIntent.AwvSrB);
    public static final Icon VIDEO = new Icon("VIDEO", 39, MimeTypes.BASE_TYPE_VIDEO, C43662rtX.PendingIntent.fdOvFl);
    public static final Icon OPEN_LINK = new Icon("OPEN_LINK", 40, "open_link", C43662rtX.PendingIntent.accept);
    public static final Icon SINGPASS = new Icon("SINGPASS", 41, "singpass", C43662rtX.PendingIntent.djSkpj);
    public static final Icon SINGPASS_BUTTON = new Icon("SINGPASS_BUTTON", 42, "singpass_button", C43662rtX.PendingIntent.dxcTrN);
    public static final Icon SECURITY_SOLID = new Icon("SECURITY_SOLID", 43, "security_solid", C43662rtX.PendingIntent.aKErDB);
    public static final Icon SECURITY_LOCK = new Icon("SECURITY_LOCK", 44, "security_lock", C43662rtX.PendingIntent.UeEOUB);
    public static final Icon EXCHANGE = new Icon("EXCHANGE", 45, "exchange", C43662rtX.PendingIntent.DTwDnp);
    public static final Icon WALLET = new Icon("WALLET", 46, "wallet", C43662rtX.PendingIntent.fFgQHt);
    public static final Icon MARGIN = new Icon("MARGIN", 47, "margin", C43662rtX.PendingIntent.QVAiDq);
    public static final Icon LOAN = new Icon("LOAN", 48, "loan", C43662rtX.PendingIntent.ORxRYg);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Icon[] $values() {
        return new Icon[]{Check, CHECK_CIRCLE, CHECK_CIRCLE_OUTLINE, COMPLETED, SHIELD_CIRCLE, ACCOUNT_CIRCLE, CALENDAR_BLANK_CIRCLE, EyeCircle, TEXT_BOX, ALERT_CIRCLE, ALERT_OUTLINE, CLOSE_CIRCLE, CLOSE_OUTLINE, TICK, CROSS, FACE_ID_CIRCLE, FACE_ID, CARD_ACCOUNT_CIRCLE, HOLLOW_DOT, SOLID_DOT, SHIELD, REMINDER, REPORT, PROFILE, WHITE_PAPER, ROD, BELL, PLUS, DRAW, SHARE, FAIL_FILL, SUCCESS_FILL, WARNING_FILL, POINTER_RIGHT, PORTFOLIO, ADDRESS_BOOK, EDIT, PROOF_OF_ADDRESS, CLOCK_TIME_THREE_OUTLINE, VIDEO, OPEN_LINK, SINGPASS, SINGPASS_BUTTON, SECURITY_SOLID, SECURITY_LOCK, EXCHANGE, WALLET, MARGIN, LOAN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Icon> getEntries() {
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

    private Icon(String str, @IdRes int i, String str2, int i2) {
        this.nameValue = str2;
        this.imageId = i2;
    }

    static {
        Icon[] iconArr$values = $values();
        $VALUES = iconArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iconArr$values);
    }

    public static Icon valueOf(String str) {
        return (Icon) Enum.valueOf(Icon.class, str);
    }

    public static Icon[] values() {
        return (Icon[]) $VALUES.clone();
    }
}
