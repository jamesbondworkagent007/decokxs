package com.okinc.tradingbot.impl.market_place.home.create_bot.config;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class BotCategoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotCategoryType[] $VALUES;
    public static final ActionBar Companion;
    private final List<String> bots;
    private final int categoryName;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    private final String f83const;
    public static final BotCategoryType DEFAULT = new BotCategoryType("DEFAULT", 0, "default", yDY.gEmmrt("grid", "contract_grid", "contract_dca", "signal_bot"), C55688xof.Application.fARcdN);
    public static final BotCategoryType POPULAR = new BotCategoryType("POPULAR", 1, "popular", yDY.gEmmrt("spot_dca", "recurring", "dcd_bot"), C55688xof.Application.getDefaultViewModelCreationExtras);
    public static final BotCategoryType ADVANCED = new BotCategoryType("ADVANCED", 2, "advanced", yDY.gEmmrt("iceberg", "twap"), C55688xof.Application.ensureViewModelStore);
    public static final BotCategoryType ARBITRAGE = new BotCategoryType("ARBITRAGE", 3, "arbitrage", yDY.gEmmrt("smart_portfolio", "smart_arbitrage", "arbitrage"), C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotCategoryType[] $values() {
        return new BotCategoryType[]{DEFAULT, POPULAR, ADVANCED, ARBITRAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotCategoryType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBots() {
        return this.bots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategoryName() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConst() {
        return this.f83const;
    }

    private BotCategoryType(String str, int i, String str2, List list, int i2) {
        this.f83const = str2;
        this.bots = list;
        this.categoryName = i2;
    }

    static {
        BotCategoryType[] botCategoryTypeArr$values = $values();
        $VALUES = botCategoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botCategoryTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.home.create_bot.config.BotCategoryType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final BotCategoryType OLrzqt(@NotNull String str) {
            BotCategoryType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<BotCategoryType> it = BotCategoryType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getConst(), (Object) str)) {
                    break;
                }
            }
            return next;
        }

        public final String EZpvd(@NotNull String str) {
            BotCategoryType next;
            String strAYXKKw;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<BotCategoryType> it = BotCategoryType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getConst(), (Object) str)) {
                    break;
                }
            }
            BotCategoryType botCategoryType = next;
            return (botCategoryType == null || (strAYXKKw = C33070mpX.AYXKKw(botCategoryType.getCategoryName())) == null) ? "" : strAYXKKw;
        }
    }

    public static BotCategoryType valueOf(String str) {
        return (BotCategoryType) Enum.valueOf(BotCategoryType.class, str);
    }

    public static BotCategoryType[] values() {
        return (BotCategoryType[]) $VALUES.clone();
    }
}
