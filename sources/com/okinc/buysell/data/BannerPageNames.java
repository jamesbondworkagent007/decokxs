package com.okinc.buysell.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerPageNames {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerPageNames[] $VALUES;
    private final String pageName;
    public static final BannerPageNames BUY_SELL_CRYPTO_LIST = new BannerPageNames("BUY_SELL_CRYPTO_LIST", 0, "buy_sell_crypto_list");
    public static final BannerPageNames BUY_SELL_INPUT_PAGE = new BannerPageNames("BUY_SELL_INPUT_PAGE", 1, "buy_sell_input_page");
    public static final BannerPageNames BSC = new BannerPageNames("BSC", 2, "bsc_merge");
    public static final BannerPageNames CONVERT = new BannerPageNames("CONVERT", 3, "convert");
    public static final BannerPageNames CONVERT_PREVIEW = new BannerPageNames("CONVERT_PREVIEW", 4, "convert_preview");
    public static final BannerPageNames CURRENCY_SELECTION = new BannerPageNames("CURRENCY_SELECTION", 5, "currency_selection");
    public static final BannerPageNames DEPOSIT_WITHDRAW_FIAT_SELECTION = new BannerPageNames("DEPOSIT_WITHDRAW_FIAT_SELECTION", 6, "deposit_withdraw_fiat_selection");
    public static final BannerPageNames DEPOSIT_WITHDRAW_METHOD_SELECTION = new BannerPageNames("DEPOSIT_WITHDRAW_METHOD_SELECTION", 7, "deposit_withdraw_method_selection");
    public static final BannerPageNames DEPOSIT_WITHDRAW_HISTORY_DETAIL = new BannerPageNames("DEPOSIT_WITHDRAW_HISTORY_DETAIL", 8, "deposit_withdraw_history_detail");
    public static final BannerPageNames DEPOSIT_WITHDRAW_AMOUNT = new BannerPageNames("DEPOSIT_WITHDRAW_AMOUNT", 9, "deposit_withdraw_input_amount");
    public static final BannerPageNames DEPOSIT_WITHDRAW_HISTORY_LIST = new BannerPageNames("DEPOSIT_WITHDRAW_HISTORY_LIST", 10, "deposit_withdraw_history_list");
    public static final BannerPageNames DEPOSIT_WITHDRAW_PREVIEW = new BannerPageNames("DEPOSIT_WITHDRAW_PREVIEW", 11, "deposit_withdraw_preview");
    public static final BannerPageNames DEPOSIT_INSTRUCTIONS = new BannerPageNames("DEPOSIT_INSTRUCTIONS", 12, "deposit_instructions");
    public static final BannerPageNames BUY_SELL_CHANNEL_SELECTION = new BannerPageNames("BUY_SELL_CHANNEL_SELECTION", 13, "buy_sell_channel_selection");
    public static final BannerPageNames BUY_SELL_PREVIEW = new BannerPageNames("BUY_SELL_PREVIEW", 14, "buy_sell_preview");
    public static final BannerPageNames TOPUP_INPUT_PAGE = new BannerPageNames("TOPUP_INPUT_PAGE", 15, "topup_input_page");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerPageNames[] $values() {
        return new BannerPageNames[]{BUY_SELL_CRYPTO_LIST, BUY_SELL_INPUT_PAGE, BSC, CONVERT, CONVERT_PREVIEW, CURRENCY_SELECTION, DEPOSIT_WITHDRAW_FIAT_SELECTION, DEPOSIT_WITHDRAW_METHOD_SELECTION, DEPOSIT_WITHDRAW_HISTORY_DETAIL, DEPOSIT_WITHDRAW_AMOUNT, DEPOSIT_WITHDRAW_HISTORY_LIST, DEPOSIT_WITHDRAW_PREVIEW, DEPOSIT_INSTRUCTIONS, BUY_SELL_CHANNEL_SELECTION, BUY_SELL_PREVIEW, TOPUP_INPUT_PAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerPageNames> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageName() {
        return this.pageName;
    }

    private BannerPageNames(String str, int i, String str2) {
        this.pageName = str2;
    }

    static {
        BannerPageNames[] bannerPageNamesArr$values = $values();
        $VALUES = bannerPageNamesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerPageNamesArr$values);
    }

    public static BannerPageNames valueOf(String str) {
        return (BannerPageNames) Enum.valueOf(BannerPageNames.class, str);
    }

    public static BannerPageNames[] values() {
        return (BannerPageNames[]) $VALUES.clone();
    }
}
