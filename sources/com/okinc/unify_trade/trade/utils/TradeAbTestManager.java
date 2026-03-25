package com.okinc.unify_trade.trade.utils;

import android.text.TextUtils;
import com.okinc.components.track.ABTestManager;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeAbTestManager {
    public static final TradeAbTestManager copydefault = new TradeAbTestManager();

    public final boolean AEQbTJ() {
        return false;
    }

    public final boolean OLrzqt() {
        return false;
    }

    private TradeAbTestManager() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AbTestKey {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AbTestKey[] $VALUES;
        private final String key;
        public static final AbTestKey TRADE_CORE_MANAGER_DISPATCHER_CONFIG = new AbTestKey("TRADE_CORE_MANAGER_DISPATCHER_CONFIG", 0, "trade_core_manager_dispatcher_config");
        public static final AbTestKey TRADING_BOTTOM_COUNT_OPT = new AbTestKey("TRADING_BOTTOM_COUNT_OPT", 1, "trading_bottom_count_opt");
        public static final AbTestKey CEDEFI_TEE_LIMIT = new AbTestKey("CEDEFI_TEE_LIMIT", 2, "cedefi_tee_limit");
        public static final AbTestKey SETTLEMENT_PRICE_CHANGE = new AbTestKey("SETTLEMENT_PRICE_CHANGE", 3, "settlement_price_change");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AbTestKey[] $values() {
            return new AbTestKey[]{TRADE_CORE_MANAGER_DISPATCHER_CONFIG, TRADING_BOTTOM_COUNT_OPT, CEDEFI_TEE_LIMIT, SETTLEMENT_PRICE_CHANGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AbTestKey> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKey() {
            return this.key;
        }

        private AbTestKey(String str, int i, String str2) {
            this.key = str2;
        }

        static {
            AbTestKey[] abTestKeyArr$values = $values();
            $VALUES = abTestKeyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(abTestKeyArr$values);
        }

        public static AbTestKey valueOf(String str) {
            return (AbTestKey) Enum.valueOf(AbTestKey.class, str);
        }

        public static AbTestKey[] values() {
            return (AbTestKey[]) $VALUES.clone();
        }
    }

    public final boolean copydefault(@NotNull AbTestKey abTestKey) {
        Intrinsics.checkNotNullParameter(abTestKey, "");
        return Intrinsics.EZpvd((Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, abTestKey.getKey(), null, 2, null), (Object) "treatment");
    }

    public static final CharSequence KWHzl(AbTestKey abTestKey) {
        Intrinsics.checkNotNullParameter(abTestKey, "");
        return abTestKey.getKey();
    }

    public final String KWHzl() {
        AbTestKey[] abTestKeyArrValues = AbTestKey.values();
        ArrayList arrayList = new ArrayList();
        for (AbTestKey abTestKey : abTestKeyArrValues) {
            if (copydefault.copydefault(abTestKey)) {
                arrayList.add(abTestKey);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1() { // from class: o.xUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeAbTestManager.KWHzl((TradeAbTestManager.AbTestKey) obj);
            }
        }, 31, null);
    }

    public final boolean AYXKKw() {
        return !Intrinsics.EZpvd((Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "CUSTOMER_ENTRY_KEY", null, 2, null), (Object) "control");
    }

    public final boolean EZpvd() {
        return copydefault(AbTestKey.TRADING_BOTTOM_COUNT_OPT);
    }

    public final boolean copydefault() {
        return TextUtils.equals(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "tradecore_init_optimize", null, 2, null), "treatment");
    }

    public final boolean gEmmrt() {
        return Intrinsics.EZpvd((Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "trade_biz_optimize", null, 2, null), (Object) "treatment");
    }

    public final boolean AhwBna() {
        return copydefault(AbTestKey.CEDEFI_TEE_LIMIT);
    }

    public final boolean valueOf() {
        boolean zCopydefault = copydefault(AbTestKey.SETTLEMENT_PRICE_CHANGE);
        if (zCopydefault) {
            pUU.KWHzl("TradeAbTest", "useHalfHourSettlement hit, use 30min settlement time");
        }
        return zCopydefault;
    }
}
