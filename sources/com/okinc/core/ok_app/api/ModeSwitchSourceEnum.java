package com.okinc.core.ok_app.api;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ModeSwitchSourceEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ModeSwitchSourceEnum[] $VALUES;
    private final String value;
    public static final ModeSwitchSourceEnum SIMPLE_TRADE = new ModeSwitchSourceEnum("SIMPLE_TRADE", 0, ExtJson.BRC20TYPE_TRADE);
    public static final ModeSwitchSourceEnum ADVANCE_TRADE = new ModeSwitchSourceEnum("ADVANCE_TRADE", 1, ExtJson.BRC20TYPE_TRADE);
    public static final ModeSwitchSourceEnum USER_CENTER = new ModeSwitchSourceEnum("USER_CENTER", 2, "user_center");
    public static final ModeSwitchSourceEnum DISCOVER = new ModeSwitchSourceEnum("DISCOVER", 3, WalletSearchRequest.SEARCH_SOURCE_DISCOVER);
    public static final ModeSwitchSourceEnum WEB3 = new ModeSwitchSourceEnum("WEB3", 4, "web3");
    public static final ModeSwitchSourceEnum LiteHome = new ModeSwitchSourceEnum("LiteHome", 5, "lite_home");
    public static final ModeSwitchSourceEnum ProPayHome = new ModeSwitchSourceEnum("ProPayHome", 6, "pro_pay_home");
    public static final ModeSwitchSourceEnum LitePayHome = new ModeSwitchSourceEnum("LitePayHome", 7, "lite_pay_home");
    public static final ModeSwitchSourceEnum ProExchangeHome = new ModeSwitchSourceEnum("ProExchangeHome", 8, "pro_exchange_home");
    public static final ModeSwitchSourceEnum UNKNOWN = new ModeSwitchSourceEnum("UNKNOWN", 9, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ModeSwitchSourceEnum[] $values() {
        return new ModeSwitchSourceEnum[]{SIMPLE_TRADE, ADVANCE_TRADE, USER_CENTER, DISCOVER, WEB3, LiteHome, ProPayHome, LitePayHome, ProExchangeHome, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ModeSwitchSourceEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ModeSwitchSourceEnum(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ModeSwitchSourceEnum[] modeSwitchSourceEnumArr$values = $values();
        $VALUES = modeSwitchSourceEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(modeSwitchSourceEnumArr$values);
    }

    public static ModeSwitchSourceEnum valueOf(String str) {
        return (ModeSwitchSourceEnum) Enum.valueOf(ModeSwitchSourceEnum.class, str);
    }

    public static ModeSwitchSourceEnum[] values() {
        return (ModeSwitchSourceEnum[]) $VALUES.clone();
    }
}
