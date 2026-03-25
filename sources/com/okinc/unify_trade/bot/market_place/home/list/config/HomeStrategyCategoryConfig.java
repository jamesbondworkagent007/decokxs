package com.okinc.unify_trade.bot.market_place.home.list.config;

import androidx.annotation.StringRes;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56402yEa;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class HomeStrategyCategoryConfig {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeStrategyCategoryConfig[] $VALUES;
    public static final Application Companion;
    private final String mode;
    private final int showMode;
    public static final HomeStrategyCategoryConfig GRID = new HomeStrategyCategoryConfig("GRID", 0, "grid", C55688xof.Application.onLocationChanged);
    public static final HomeStrategyCategoryConfig DCA = new HomeStrategyCategoryConfig("DCA", 1, "dca", C55688xof.Application.sEAkxl);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeStrategyCategoryConfig[] $values() {
        return new HomeStrategyCategoryConfig[]{GRID, DCA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeStrategyCategoryConfig> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private HomeStrategyCategoryConfig(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.showMode = i2;
    }

    static {
        HomeStrategyCategoryConfig[] homeStrategyCategoryConfigArr$values = $values();
        $VALUES = homeStrategyCategoryConfigArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeStrategyCategoryConfigArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategyCategoryConfig.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((Object) str, (Object) HomeStrategyCategoryConfig.GRID.getMode())) {
                return CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt("grid", "contract_grid"), ",", null, null, 0, null, null, 62, null);
            }
            return Intrinsics.EZpvd((Object) str, (Object) HomeStrategyCategoryConfig.DCA.getMode()) ? CollectionsKt___CollectionsKt.joinToString$default(C56402yEa.EZpvd("contract_dca"), ",", null, null, 0, null, null, 62, null) : "";
        }
    }

    public static HomeStrategyCategoryConfig valueOf(String str) {
        return (HomeStrategyCategoryConfig) Enum.valueOf(HomeStrategyCategoryConfig.class, str);
    }

    public static HomeStrategyCategoryConfig[] values() {
        return (HomeStrategyCategoryConfig[]) $VALUES.clone();
    }
}
