package com.okinc.okex.center.bean.enums;

import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44830seN;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44830seN.class)
public final class SelfServiceScenario {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SelfServiceScenario[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;
    public static final SelfServiceScenario MY_TICKETS = new SelfServiceScenario("MY_TICKETS", 0, "my_tickets");
    public static final SelfServiceScenario CHANGE_LOGIN_PASSWORD = new SelfServiceScenario("CHANGE_LOGIN_PASSWORD", 1, "change_login_password");
    public static final SelfServiceScenario CHANGE_PHONE_NUMBER = new SelfServiceScenario("CHANGE_PHONE_NUMBER", 2, "change_phone_number");
    public static final SelfServiceScenario GOOGLE_AUTHENTICATION = new SelfServiceScenario("GOOGLE_AUTHENTICATION", 3, "google_authentication");
    public static final SelfServiceScenario CHANGE_EMAIL_ADDRESS = new SelfServiceScenario("CHANGE_EMAIL_ADDRESS", 4, "change_email_address");
    public static final SelfServiceScenario FREEZE_ACCOUNT = new SelfServiceScenario("FREEZE_ACCOUNT", 5, "freeze_account");
    public static final SelfServiceScenario CLOSE_ACCOUNT = new SelfServiceScenario("CLOSE_ACCOUNT", 6, "close_account");
    public static final SelfServiceScenario DEPOSIT_NOT_CREDITED = new SelfServiceScenario("DEPOSIT_NOT_CREDITED", 7, "deposit_not_credited");
    public static final SelfServiceScenario DEPOSIT_NOT_CREDITED_DIAGNOSTIC = new SelfServiceScenario("DEPOSIT_NOT_CREDITED_DIAGNOSTIC", 8, "deposit_not_credited_diagnostic");
    public static final SelfServiceScenario DEPOSIT_NOT_CREDITED_REQUEST_HELP_FORM = new SelfServiceScenario("DEPOSIT_NOT_CREDITED_REQUEST_HELP_FORM", 9, "deposit_not_credited_request_help_form");
    public static final SelfServiceScenario DEPOSIT_TXID_NOT_FOUND = new SelfServiceScenario("DEPOSIT_TXID_NOT_FOUND", 10, "deposit_txid_not_found");
    public static final SelfServiceScenario WITHDRAWAL_NOT_ARRIVED = new SelfServiceScenario("WITHDRAWAL_NOT_ARRIVED", 11, "withdrawal_not_arrived");
    public static final SelfServiceScenario WITHDRAW_ASSET = new SelfServiceScenario("WITHDRAW_ASSET", 12, "withdraw_asset");
    public static final SelfServiceScenario KYC_USER_CENTER = new SelfServiceScenario("KYC_USER_CENTER", 13, "kyc_user_center");
    public static final SelfServiceScenario GENERAL_BOT_START = new SelfServiceScenario("GENERAL_BOT_START", 14, "general_bot_start");
    public static final SelfServiceScenario FEEDBACK_BOUNTY = new SelfServiceScenario("FEEDBACK_BOUNTY", 15, "feedback_bounty");
    public static final SelfServiceScenario SECURITY_ISSUE = new SelfServiceScenario("SECURITY_ISSUE", 16, "security_issue");
    public static final SelfServiceScenario ERROR_LOG_UPLOAD = new SelfServiceScenario("ERROR_LOG_UPLOAD", 17, "error_log_upload");
    public static final SelfServiceScenario PRODUCT_DOCUMENT = new SelfServiceScenario("PRODUCT_DOCUMENT", 18, "product_document");
    public static final SelfServiceScenario VIDEO_CALL_APPOINTMENT = new SelfServiceScenario("VIDEO_CALL_APPOINTMENT", 19, "video_call_appointment");
    public static final SelfServiceScenario P2P_REORDER = new SelfServiceScenario("P2P_REORDER", 20, "p2p_reorder");
    public static final SelfServiceScenario CAMPAIGNS = new SelfServiceScenario("CAMPAIGNS", 21, "campaigns");
    public static final SelfServiceScenario UNKNOWN = new SelfServiceScenario("UNKNOWN", 22, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SelfServiceScenario[] $values() {
        return new SelfServiceScenario[]{MY_TICKETS, CHANGE_LOGIN_PASSWORD, CHANGE_PHONE_NUMBER, GOOGLE_AUTHENTICATION, CHANGE_EMAIL_ADDRESS, FREEZE_ACCOUNT, CLOSE_ACCOUNT, DEPOSIT_NOT_CREDITED, DEPOSIT_NOT_CREDITED_DIAGNOSTIC, DEPOSIT_NOT_CREDITED_REQUEST_HELP_FORM, DEPOSIT_TXID_NOT_FOUND, WITHDRAWAL_NOT_ARRIVED, WITHDRAW_ASSET, KYC_USER_CENTER, GENERAL_BOT_START, FEEDBACK_BOUNTY, SECURITY_ISSUE, ERROR_LOG_UPLOAD, PRODUCT_DOCUMENT, VIDEO_CALL_APPOINTMENT, P2P_REORDER, CAMPAIGNS, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SelfServiceScenario> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.SelfServiceScenario.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) SelfServiceScenario.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SelfServiceScenario> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44830seN();
    }

    private SelfServiceScenario(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SelfServiceScenario[] selfServiceScenarioArr$values = $values();
        $VALUES = selfServiceScenarioArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(selfServiceScenarioArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SelfServiceScenario._init_$_anonymous_();
            }
        });
    }

    public static SelfServiceScenario valueOf(String str) {
        return (SelfServiceScenario) Enum.valueOf(SelfServiceScenario.class, str);
    }

    public static SelfServiceScenario[] values() {
        return (SelfServiceScenario[]) $VALUES.clone();
    }
}
