package com.okinc.tradingbot.impl.market_place.home.list;

import androidx.annotation.StringRes;
import o.C48033uCm;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class BotMarketPlaceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotMarketPlaceType[] $VALUES;
    private final int title;
    public static final BotMarketPlaceType FEATURED = new BotMarketPlaceType("FEATURED", 0, C55688xof.Application.zsXlph);
    public static final BotMarketPlaceType OnGoing = new BotMarketPlaceType("OnGoing", 1, C55688xof.Application.OhcwxsRkSIEV);
    public static final BotMarketPlaceType FeaturedCRBots = new BotMarketPlaceType("FeaturedCRBots", 2, C48033uCm.Fragment.values);
    public static final BotMarketPlaceType CROnGoing = new BotMarketPlaceType("CROnGoing", 3, C48033uCm.Fragment.AuCTel);
    public static final BotMarketPlaceType SignalsTab = new BotMarketPlaceType("SignalsTab", 4, C48033uCm.Fragment.ODCBUN);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotMarketPlaceType[] $values() {
        return new BotMarketPlaceType[]{FEATURED, OnGoing, FeaturedCRBots, CROnGoing, SignalsTab};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotMarketPlaceType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private BotMarketPlaceType(@StringRes String str, int i, int i2) {
        this.title = i2;
    }

    static {
        BotMarketPlaceType[] botMarketPlaceTypeArr$values = $values();
        $VALUES = botMarketPlaceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botMarketPlaceTypeArr$values);
    }

    public static BotMarketPlaceType valueOf(String str) {
        return (BotMarketPlaceType) Enum.valueOf(BotMarketPlaceType.class, str);
    }

    public static BotMarketPlaceType[] values() {
        return (BotMarketPlaceType[]) $VALUES.clone();
    }
}
