package com.okinc.okrisk;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskLibrarySource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKRiskLibrarySource[] $VALUES;
    public static final Activity Companion;
    private static final Map<String, OKRiskLibrarySource> tagMap;
    private final String tag;
    public static final OKRiskLibrarySource APP_LAUNCH = new OKRiskLibrarySource("APP_LAUNCH", 0, "app_launch");
    public static final OKRiskLibrarySource ACCOUNT_SIGNUP = new OKRiskLibrarySource("ACCOUNT_SIGNUP", 1, "account_signup");
    public static final OKRiskLibrarySource ACCOUNT_SIGNIN = new OKRiskLibrarySource("ACCOUNT_SIGNIN", 2, "account_signin");
    public static final OKRiskLibrarySource USER_LOGIN = new OKRiskLibrarySource("USER_LOGIN", 3, "user_login");
    public static final OKRiskLibrarySource PAYMENT_INPUT = new OKRiskLibrarySource("PAYMENT_INPUT", 4, "payment_input");
    public static final OKRiskLibrarySource APP_ENTER_FOREGROUND = new OKRiskLibrarySource("APP_ENTER_FOREGROUND", 5, "app_enter_foreground");
    public static final OKRiskLibrarySource BSC_SCREEN = new OKRiskLibrarySource("BSC_SCREEN", 6, "bsc_screen");
    public static final OKRiskLibrarySource APP_INSTALL = new OKRiskLibrarySource("APP_INSTALL", 7, "app_install");
    public static final OKRiskLibrarySource STATE_REFRESH = new OKRiskLibrarySource("STATE_REFRESH", 8, "state_refresh");
    public static final OKRiskLibrarySource KYC_LIVENESS = new OKRiskLibrarySource("KYC_LIVENESS", 9, "kyc_liveness");
    public static final OKRiskLibrarySource KYC_IDC = new OKRiskLibrarySource("KYC_IDC", 10, "kyc_idc");
    public static final OKRiskLibrarySource EXT_BOOST = new OKRiskLibrarySource("EXT_BOOST", 11, "ext_boost");
    public static final OKRiskLibrarySource WALLET_SEND = new OKRiskLibrarySource("WALLET_SEND", 12, "wallet_send");
    public static final OKRiskLibrarySource WALLET_RECEIVE = new OKRiskLibrarySource("WALLET_RECEIVE", 13, "wallet_receive");
    public static final OKRiskLibrarySource WALLET_MANAGE = new OKRiskLibrarySource("WALLET_MANAGE", 14, "wallet_manage");
    public static final OKRiskLibrarySource UNKNOWN = new OKRiskLibrarySource("UNKNOWN", 15, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKRiskLibrarySource[] $values() {
        return new OKRiskLibrarySource[]{APP_LAUNCH, ACCOUNT_SIGNUP, ACCOUNT_SIGNIN, USER_LOGIN, PAYMENT_INPUT, APP_ENTER_FOREGROUND, BSC_SCREEN, APP_INSTALL, STATE_REFRESH, KYC_LIVENESS, KYC_IDC, EXT_BOOST, WALLET_SEND, WALLET_RECEIVE, WALLET_MANAGE, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKRiskLibrarySource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private OKRiskLibrarySource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        OKRiskLibrarySource[] oKRiskLibrarySourceArr$values = $values();
        $VALUES = oKRiskLibrarySourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKRiskLibrarySourceArr$values);
        Companion = new Activity(null);
        OKRiskLibrarySource[] oKRiskLibrarySourceArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(oKRiskLibrarySourceArrValues.length), 16));
        for (OKRiskLibrarySource oKRiskLibrarySource : oKRiskLibrarySourceArrValues) {
            linkedHashMap.put(oKRiskLibrarySource.tag, oKRiskLibrarySource);
        }
        tagMap = linkedHashMap;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.OKRiskLibrarySource.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final OKRiskLibrarySource AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OKRiskLibrarySource oKRiskLibrarySource = (OKRiskLibrarySource) OKRiskLibrarySource.tagMap.get(str);
            return oKRiskLibrarySource == null ? OKRiskLibrarySource.UNKNOWN : oKRiskLibrarySource;
        }
    }

    public static OKRiskLibrarySource valueOf(String str) {
        return (OKRiskLibrarySource) Enum.valueOf(OKRiskLibrarySource.class, str);
    }

    public static OKRiskLibrarySource[] values() {
        return (OKRiskLibrarySource[]) $VALUES.clone();
    }
}
