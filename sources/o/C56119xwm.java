package o;

import com.okinc.biz.StrategyType;
import java.util.EnumMap;

/* JADX INFO: renamed from: o.xwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56119xwm {
    public static final EnumMap<StrategyType, java.lang.String> EZpvd;
    public static final java.util.HashMap<java.lang.String, StrategyType> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.HashMap<java.lang.String, StrategyType> AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final EnumMap<StrategyType, java.lang.String> EZpvd() {
        return EZpvd;
    }

    static {
        EnumMap<StrategyType, java.lang.String> enumMap = new EnumMap<>(StrategyType.class);
        StrategyType strategyType = StrategyType.LIMIT;
        enumMap.put(strategyType, "limit,market");
        StrategyType strategyType2 = StrategyType.ADVANCED_LIMIT;
        enumMap.put(strategyType2, "post_only,fok,ioc,optimal_limit_ioc");
        StrategyType strategyType3 = StrategyType.TRIGGER;
        enumMap.put(strategyType3, "trigger");
        StrategyType strategyType4 = StrategyType.STOP;
        enumMap.put(strategyType4, "conditional,oco");
        enumMap.put(StrategyType.MARKET, "market");
        StrategyType strategyType5 = StrategyType.GRID;
        enumMap.put(strategyType5, "grid");
        StrategyType strategyType6 = StrategyType.TWAP;
        enumMap.put(strategyType6, "twap");
        EZpvd = enumMap;
        java.util.HashMap<java.lang.String, StrategyType> map = new java.util.HashMap<>();
        map.put("limit", strategyType);
        map.put("market", strategyType);
        map.put("post_only", strategyType2);
        map.put("fok", strategyType2);
        map.put("ioc", strategyType2);
        map.put("elp", strategyType2);
        map.put("trigger", strategyType3);
        map.put("conditional", strategyType4);
        map.put("oco", strategyType4);
        map.put("smart_iceberg", StrategyType.SMART_ICEBERG);
        map.put("twap", strategyType6);
        map.put("grid", strategyType5);
        map.put("contract_grid", StrategyType.CONTRACT_GRID);
        map.put("arbitrage", StrategyType.ARBITRAGE);
        map.put("move_order_stop", StrategyType.MP);
        map.put("recurring", StrategyType.RECURRING);
        map.put("smart_portfolio", StrategyType.SMART_PORTFOLIO);
        map.put("moon_grid", StrategyType.MOON_GRID);
        map.put("spot_dca", StrategyType.SPOT_DCA);
        map.put("contract_dca", StrategyType.CONTRACT_DCA);
        map.put("infinite_grid", StrategyType.INFINITE_GRID);
        map.put("signal_bot", StrategyType.SIGNAL_BOT);
        map.put("all_bot", StrategyType.ALL);
        copydefault = map;
    }
}
