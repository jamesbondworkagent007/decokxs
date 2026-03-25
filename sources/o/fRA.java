package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AAWalletEnableState;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRA {
    public static final fRA OLrzqt = new fRA();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fRy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fRA.AEQbTJ();
        }
    });
    public static final int EZpvd = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.ConnectWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.DemoWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoBackUp.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            OLrzqt = iArr2;
        }
    }

    private fRA() {
    }

    public final C17412fEj EZpvd() {
        return (C17412fEj) copydefault.getValue();
    }

    public static final C17412fEj AEQbTJ() {
        return new C17412fEj();
    }

    public final boolean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull InterfaceC17773fRt interfaceC17773fRt) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(interfaceC17773fRt, "");
        if (abstractC12782ctV.QwvEab() == WalletType.HDWallet) {
            return abstractC12782ctV.zLjUOn();
        }
        WalletType walletTypeQwvEab = abstractC12782ctV.QwvEab();
        WalletType walletType = WalletType.MPCWallet;
        return (walletTypeQwvEab == walletType || abstractC12782ctV.AEQbTJ(walletType)) ? !abstractC12782ctV.DCUTEIdCUTEI() && abstractC12782ctV.Dmq() && abstractC12782ctV.zLjUOn() && interfaceC17773fRt.EZpvd(abstractC12782ctV) == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal : abstractC12782ctV.QwvEab() != WalletType.AAWallet || interfaceC17773fRt.AEQbTJ(abstractC12782ctV) == AAWalletEnableState.Normal;
    }

    public final boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!Intrinsics.EZpvd(currentWalletSwitchNetworkMode, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt)) {
            if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork) {
                return abstractC12782ctV.fetchVPNInfo(((CurrentWalletSwitchNetworkMode.SingleNetwork) currentWalletSwitchNetworkMode).AEQbTJ());
            }
            if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks) {
                return abstractC12782ctV.fetchVPNInfo(((CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkMode).EZpvd());
            }
        }
        return false;
    }

    public final boolean copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, CurrentWalletSelectMode currentWalletSelectMode, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (Intrinsics.EZpvd(currentWalletSelectMode, CurrentWalletSelectMode.NoWalletSelected.EZpvd)) {
            return false;
        }
        if (currentWalletSelectMode instanceof CurrentWalletSelectMode.WalletSelectedById) {
            return Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV.DbNXlk(), (java.lang.Object) ((CurrentWalletSelectMode.WalletSelectedById) currentWalletSelectMode).OLrzqt());
        }
        return Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV.DbNXlk(), (java.lang.Object) (interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null));
    }

    public final boolean AEQbTJ(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        int i = Application.AEQbTJ[abstractC12784ctX.fJNWhG().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public final boolean EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<? extends UnsupportedWalletType> list) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = Application.AEQbTJ[abstractC12782ctV.QwvEab().ordinal()];
        return i == 4 ? !list.contains(UnsupportedWalletType.HardwareWallet) : !(i == 5 && list.contains(UnsupportedWalletType.MPCWallet));
    }

    public final boolean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull InterfaceC17773fRt interfaceC17773fRt, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, long j) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(interfaceC17773fRt, "");
        if (!OLrzqt(abstractC12782ctV, interfaceC17773fRt)) {
            return false;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        if (lValueOf.longValue() == Long.MIN_VALUE) {
            lValueOf = null;
        }
        if (function2 != null) {
            return function2.invoke(abstractC12782ctV, lValueOf).booleanValue();
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC12782ctV abstractC12782ctV, InterfaceC17773fRt interfaceC17773fRt) {
        if (!abstractC12782ctV.ORxRYg() && !abstractC12782ctV.wlaJM()) {
            return true;
        }
        switch (Application.OLrzqt[interfaceC17773fRt.EZpvd(abstractC12782ctV).ordinal()]) {
        }
        return true;
    }

    public final boolean OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, long j) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (j == Long.MIN_VALUE) {
            return true;
        }
        return abstractC12782ctV.AkhnZx(j);
    }

    public final long OLrzqt(CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode) {
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.SingleNetwork) {
            return ((CurrentWalletSwitchNetworkMode.SingleNetwork) currentWalletSwitchNetworkMode).AEQbTJ();
        }
        if (currentWalletSwitchNetworkMode instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks) {
            return ((CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkMode).EZpvd();
        }
        return Long.MIN_VALUE;
    }
}
