package com.okinc.unify_trade.bot.market_place.home.list.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class HomeStrategySortConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeStrategySortConfig[] $VALUES;
    public static final TaskDescription Companion;
    public static final HomeStrategySortConfig Highest_PnL;
    public static final HomeStrategySortConfig MAX_DRAW_DOWN;
    public static final HomeStrategySortConfig NUM_OF_COPIES;
    public static final HomeStrategySortConfig PNL_RATIO;
    public static final HomeStrategySortConfig SMART_SORTING;
    private final int desc;
    private final String direction;
    private final String mode;
    private final int title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeStrategySortConfig[] $values() {
        return new HomeStrategySortConfig[]{SMART_SORTING, Highest_PnL, PNL_RATIO, NUM_OF_COPIES, MAX_DRAW_DOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeStrategySortConfig> getEntries() {
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

    private HomeStrategySortConfig(String str, @StringRes int i, @StringRes String str2, int i2, int i3, String str3) {
        this.mode = str2;
        this.title = i2;
        this.desc = i3;
        this.direction = str3;
    }

    static {
        int i = C55688xof.Application.hQufeQ;
        SMART_SORTING = new HomeStrategySortConfig("SMART_SORTING", 0, "0", i, i, "");
        Highest_PnL = new HomeStrategySortConfig("Highest_PnL", 1, "5", C55688xof.Application.forceCloseConnection, C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase1, "desc");
        PNL_RATIO = new HomeStrategySortConfig("PNL_RATIO", 2, "1", C55688xof.Application.QBiWsm, C55688xof.Application.QSbQqJ, "desc");
        NUM_OF_COPIES = new HomeStrategySortConfig("NUM_OF_COPIES", 3, "3", C55688xof.Application.OtZEmZ, C55688xof.Application.PUZqN, "desc");
        MAX_DRAW_DOWN = new HomeStrategySortConfig("MAX_DRAW_DOWN", 4, "2", C55688xof.Application.DjWNei, C55688xof.Application.fraLem, "asc");
        HomeStrategySortConfig[] homeStrategySortConfigArr$values = $values();
        $VALUES = homeStrategySortConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeStrategySortConfigArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static HomeStrategySortConfig valueOf(String str) {
        return (HomeStrategySortConfig) Enum.valueOf(HomeStrategySortConfig.class, str);
    }

    public static HomeStrategySortConfig[] values() {
        return (HomeStrategySortConfig[]) $VALUES.clone();
    }
}
