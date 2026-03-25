package com.okinc.okex.lite.home.bean;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AppModeSwitchViewSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppModeSwitchViewSource[] $VALUES;
    public static final AppModeSwitchViewSource LiteHome = new AppModeSwitchViewSource("LiteHome", 0, "LiteHome");
    public static final AppModeSwitchViewSource Web3Home = new AppModeSwitchViewSource("Web3Home", 1, "Web3Home");
    public static final AppModeSwitchViewSource TransitionView = new AppModeSwitchViewSource("TransitionView", 2, "TransitionView");
    public static final AppModeSwitchViewSource ExchangeHome = new AppModeSwitchViewSource("ExchangeHome", 3, "ExchangeHome");
    public static final AppModeSwitchViewSource PayHome = new AppModeSwitchViewSource("PayHome", 4, "PayHome");
    public static final AppModeSwitchViewSource Upgrade = new AppModeSwitchViewSource(HttpHeaders.UPGRADE, 5, HttpHeaders.UPGRADE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppModeSwitchViewSource[] $values() {
        return new AppModeSwitchViewSource[]{LiteHome, Web3Home, TransitionView, ExchangeHome, PayHome, Upgrade};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppModeSwitchViewSource> getEntries() {
        return $ENTRIES;
    }

    private AppModeSwitchViewSource(String str, int i, String str2) {
    }

    static {
        AppModeSwitchViewSource[] appModeSwitchViewSourceArr$values = $values();
        $VALUES = appModeSwitchViewSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appModeSwitchViewSourceArr$values);
    }

    public static AppModeSwitchViewSource valueOf(String str) {
        return (AppModeSwitchViewSource) Enum.valueOf(AppModeSwitchViewSource.class, str);
    }

    public static AppModeSwitchViewSource[] values() {
        return (AppModeSwitchViewSource[]) $VALUES.clone();
    }
}
