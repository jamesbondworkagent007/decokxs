package com.okinc.wallet.api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class WalletReferralSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletReferralSource[] $VALUES;
    public static final Application Companion;
    private final String event;
    public static final WalletReferralSource REFERRAL_DASHBOARD = new WalletReferralSource("REFERRAL_DASHBOARD", 0, "referral_dashboard");
    public static final WalletReferralSource SCREENSHOT = new WalletReferralSource("SCREENSHOT", 1, "screenshot");
    public static final WalletReferralSource WALLET_BALANCE = new WalletReferralSource("WALLET_BALANCE", 2, "wallet_balance");
    public static final WalletReferralSource TOKEN_INFO = new WalletReferralSource("TOKEN_INFO", 3, "token_info");
    public static final WalletReferralSource MARKET_PNL = new WalletReferralSource("MARKET_PNL", 4, "market_pnl");
    public static final WalletReferralSource PROFILE_PNL = new WalletReferralSource("PROFILE_PNL", 5, "profile_pnl");
    public static final WalletReferralSource PROFILE_POSITION_PNL = new WalletReferralSource("PROFILE_POSITION_PNL", 6, "profile_position_pnl");
    public static final WalletReferralSource MEME_MODE_PNL = new WalletReferralSource("MEME_MODE_PNL", 7, "meme_mode_pnl");
    public static final WalletReferralSource ADVANCED_MODE_PNL = new WalletReferralSource("ADVANCED_MODE_PNL", 8, "advanced_mode_pnl");
    public static final WalletReferralSource MARKET_LIST = new WalletReferralSource("MARKET_LIST", 9, "market_list");
    public static final WalletReferralSource TOKEN_INFO_URL = new WalletReferralSource("TOKEN_INFO_URL", 10, "token_info_url");
    public static final WalletReferralSource DEEPLINK = new WalletReferralSource("DEEPLINK", 11, "deeplink");
    public static final WalletReferralSource DEVICE_CACHED = new WalletReferralSource("DEVICE_CACHED", 12, "device_cached");
    public static final WalletReferralSource MORE = new WalletReferralSource("MORE", 13, "more");
    public static final WalletReferralSource BOOST = new WalletReferralSource("BOOST", 14, "boost");
    public static final WalletReferralSource OTHERS = new WalletReferralSource("OTHERS", 15, "others");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletReferralSource[] $values() {
        return new WalletReferralSource[]{REFERRAL_DASHBOARD, SCREENSHOT, WALLET_BALANCE, TOKEN_INFO, MARKET_PNL, PROFILE_PNL, PROFILE_POSITION_PNL, MEME_MODE_PNL, ADVANCED_MODE_PNL, MARKET_LIST, TOKEN_INFO_URL, DEEPLINK, DEVICE_CACHED, MORE, BOOST, OTHERS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletReferralSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvent() {
        return this.event;
    }

    private WalletReferralSource(String str, int i, String str2) {
        this.event = str2;
    }

    static {
        WalletReferralSource[] walletReferralSourceArr$values = $values();
        $VALUES = walletReferralSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletReferralSourceArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletReferralSource.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WalletReferralSource EZpvd(@NotNull String str) {
            WalletReferralSource walletReferralSource;
            Intrinsics.checkNotNullParameter(str, "");
            WalletReferralSource[] walletReferralSourceArrValues = WalletReferralSource.values();
            int length = walletReferralSourceArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    walletReferralSource = null;
                    break;
                }
                walletReferralSource = walletReferralSourceArrValues[i];
                if (Intrinsics.EZpvd((Object) walletReferralSource.getEvent(), (Object) str)) {
                    break;
                }
                i++;
            }
            return walletReferralSource == null ? WalletReferralSource.OTHERS : walletReferralSource;
        }
    }

    public static WalletReferralSource valueOf(String str) {
        return (WalletReferralSource) Enum.valueOf(WalletReferralSource.class, str);
    }

    public static WalletReferralSource[] values() {
        return (WalletReferralSource[]) $VALUES.clone();
    }
}
