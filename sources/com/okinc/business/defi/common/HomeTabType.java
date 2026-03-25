package com.okinc.business.defi.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class HomeTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeTabType[] $VALUES;
    public static final ActionBar Companion;
    private final String value;
    public static final HomeTabType TYPE_WALLET = new HomeTabType("TYPE_WALLET", 0, "wallet");
    public static final HomeTabType TYPE_APPROVE_MANAGER = new HomeTabType("TYPE_APPROVE_MANAGER", 1, "approve_manager");
    public static final HomeTabType TYPE_DEX_STRATEGY = new HomeTabType("TYPE_DEX_STRATEGY", 2, "dexStrategy");
    public static final HomeTabType TYPE_DEX_ORDERS = new HomeTabType("TYPE_DEX_ORDERS", 3, "dexOrders");
    public static final HomeTabType TYPE_DEFI = new HomeTabType("TYPE_DEFI", 4, "portfolio");
    public static final HomeTabType TYPE_NFT = new HomeTabType("TYPE_NFT", 5, "collectibles");
    public static final HomeTabType TYPE_DAPP = new HomeTabType("TYPE_DAPP", 6, "dapps");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeTabType[] $values() {
        return new HomeTabType[]{TYPE_WALLET, TYPE_APPROVE_MANAGER, TYPE_DEX_STRATEGY, TYPE_DEX_ORDERS, TYPE_DEFI, TYPE_NFT, TYPE_DAPP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeTabType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private HomeTabType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        HomeTabType[] homeTabTypeArr$values = $values();
        $VALUES = homeTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeTabTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.common.HomeTabType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [22=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HomeTabType KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -795192327:
                    if (str.equals("wallet")) {
                        return HomeTabType.TYPE_WALLET;
                    }
                    break;
                case 95353046:
                    if (str.equals("dapps")) {
                        return HomeTabType.TYPE_DAPP;
                    }
                    break;
                case 167124155:
                    if (str.equals("approve_manager")) {
                        return HomeTabType.TYPE_APPROVE_MANAGER;
                    }
                    break;
                case 1069688284:
                    if (str.equals("dexOrders")) {
                        return HomeTabType.TYPE_DEX_ORDERS;
                    }
                    break;
                case 1121781064:
                    if (str.equals("portfolio")) {
                        return HomeTabType.TYPE_DEFI;
                    }
                    break;
                case 1635687287:
                    if (str.equals("collectibles")) {
                        return HomeTabType.TYPE_NFT;
                    }
                    break;
                case 2026734762:
                    if (str.equals("dexStrategy")) {
                        return HomeTabType.TYPE_DEX_STRATEGY;
                    }
                    break;
            }
            return HomeTabType.TYPE_WALLET;
        }
    }

    public static HomeTabType valueOf(String str) {
        return (HomeTabType) Enum.valueOf(HomeTabType.class, str);
    }

    public static HomeTabType[] values() {
        return (HomeTabType[]) $VALUES.clone();
    }
}
