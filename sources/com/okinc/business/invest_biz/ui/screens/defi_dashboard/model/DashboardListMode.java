package com.okinc.business.invest_biz.ui.screens.defi_dashboard.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DashboardListMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DashboardListMode[] $VALUES;
    public static final Application Companion;
    private final int v;
    public static final DashboardListMode PROTOCOL = new DashboardListMode("PROTOCOL", 0, 0);
    public static final DashboardListMode TOKEN = new DashboardListMode("TOKEN", 1, 1);
    public static final DashboardListMode RECOMMEND = new DashboardListMode("RECOMMEND", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DashboardListMode[] $values() {
        return new DashboardListMode[]{PROTOCOL, TOKEN, RECOMMEND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DashboardListMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getV() {
        return this.v;
    }

    private DashboardListMode(String str, int i, int i2) {
        this.v = i2;
    }

    static {
        DashboardListMode[] dashboardListModeArr$values = $values();
        $VALUES = dashboardListModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dashboardListModeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static DashboardListMode valueOf(String str) {
        return (DashboardListMode) Enum.valueOf(DashboardListMode.class, str);
    }

    public static DashboardListMode[] values() {
        return (DashboardListMode[]) $VALUES.clone();
    }
}
