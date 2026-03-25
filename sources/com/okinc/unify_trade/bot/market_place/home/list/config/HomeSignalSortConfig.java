package com.okinc.unify_trade.bot.market_place.home.list.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class HomeSignalSortConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeSignalSortConfig[] $VALUES;
    public static final HomeSignalSortConfig ANNUALIZED_RATE;
    public static final Application Companion;
    public static final HomeSignalSortConfig FOLLOWER_ASSETS;
    public static final HomeSignalSortConfig SMART_SCORE;
    public static final HomeSignalSortConfig TOTAL_FOLLOWER_COUNT;
    private final int desc;
    private final String direction;
    private final String mode;
    private final int title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeSignalSortConfig[] $values() {
        return new HomeSignalSortConfig[]{SMART_SCORE, FOLLOWER_ASSETS, TOTAL_FOLLOWER_COUNT, ANNUALIZED_RATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeSignalSortConfig> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private HomeSignalSortConfig(String str, @StringRes int i, @StringRes String str2, int i2, int i3, String str3) {
        this.mode = str2;
        this.title = i2;
        this.desc = i3;
        this.direction = str3;
    }

    static {
        int i = C55688xof.Application.hQufeQ;
        SMART_SCORE = new HomeSignalSortConfig("SMART_SCORE", 0, "signal_smart_score", i, i, "desc");
        FOLLOWER_ASSETS = new HomeSignalSortConfig("FOLLOWER_ASSETS", 1, "follower_assets", C55688xof.Application.kcQGz, C55688xof.Application.keyboardTargetTextChanged, "desc");
        TOTAL_FOLLOWER_COUNT = new HomeSignalSortConfig("TOTAL_FOLLOWER_COUNT", 2, "total_follower_count", C55688xof.Application.DRuYWY, C55688xof.Application.clearCurrentKeyboardTarget, "desc");
        ANNUALIZED_RATE = new HomeSignalSortConfig("ANNUALIZED_RATE", 3, "annualized_rate", C55688xof.Application.DDxOgT, C55688xof.Application.zAGdSp, "desc");
        HomeSignalSortConfig[] homeSignalSortConfigArr$values = $values();
        $VALUES = homeSignalSortConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeSignalSortConfigArr$values);
        Companion = new Application(null);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static HomeSignalSortConfig valueOf(String str) {
        return (HomeSignalSortConfig) Enum.valueOf(HomeSignalSortConfig.class, str);
    }

    public static HomeSignalSortConfig[] values() {
        return (HomeSignalSortConfig[]) $VALUES.clone();
    }
}
