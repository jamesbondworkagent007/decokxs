package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.C32989mnw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.eUI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletStateChecker {
    public static final WalletStateChecker AEQbTJ = new WalletStateChecker();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WalletState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WalletState[] $VALUES;
        public static final WalletState ONBOARDING = new WalletState("ONBOARDING", 0);
        public static final WalletState NOT_BACKED_UP = new WalletState("NOT_BACKED_UP", 1);
        public static final WalletState ZERO_ASSETS = new WalletState("ZERO_ASSETS", 2);
        public static final WalletState NORMAL = new WalletState("NORMAL", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WalletState[] $values() {
            return new WalletState[]{ONBOARDING, NOT_BACKED_UP, ZERO_ASSETS, NORMAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WalletState> getEntries() {
            return $ENTRIES;
        }

        private WalletState(String str, int i) {
        }

        static {
            WalletState[] walletStateArr$values = $values();
            $VALUES = walletStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(walletStateArr$values);
        }

        public static WalletState valueOf(String str) {
            return (WalletState) Enum.valueOf(WalletState.class, str);
        }

        public static WalletState[] values() {
            return (WalletState[]) $VALUES.clone();
        }
    }

    private WalletStateChecker() {
    }

    public final WalletState copydefault(@NotNull DefiHomeContainerViewModel defiHomeContainerViewModel, @NotNull eUI eui) {
        Intrinsics.checkNotNullParameter(defiHomeContainerViewModel, "");
        Intrinsics.checkNotNullParameter(eui, "");
        if (defiHomeContainerViewModel.gEmmrt().getValue() == WalletStatus.NoWallet) {
            return WalletState.ONBOARDING;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null || !value.zLjUOn()) {
            return WalletState.NOT_BACKED_UP;
        }
        C32989mnw<Integer> value2 = eui.AYXKKw().getValue();
        if (value2 != null && value2.OLrzqt().intValue() == 0) {
            return WalletState.ZERO_ASSETS;
        }
        return WalletState.NORMAL;
    }
}
