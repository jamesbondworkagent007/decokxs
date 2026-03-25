package o;

import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dZK {
    public static final dZK AEQbTJ = new dZK();

    private dZK() {
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull EnterWalletMainBean enterWalletMainBean) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(enterWalletMainBean, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("show", false);
        bundle.putBoolean("enterMainWallet", true);
        java.lang.Boolean boolIsShowResetWalletDialog = enterWalletMainBean.isShowResetWalletDialog();
        bundle.putBoolean("reset_dialog_show", boolIsShowResetWalletDialog != null ? boolIsShowResetWalletDialog.booleanValue() : false);
        java.lang.Integer mainTabId = enterWalletMainBean.getMainTabId();
        bundle.putInt("main_tab_id", mainTabId != null ? mainTabId.intValue() : C9768bbn.gEmmrt);
        java.lang.String homeTabType = enterWalletMainBean.getHomeTabType();
        if (homeTabType == null) {
            homeTabType = "wallet";
        }
        bundle.putString("home_tab_type", homeTabType);
        java.lang.String walletId = enterWalletMainBean.getWalletId();
        bundle.putString("wallet_id", walletId != null ? walletId : "");
        bundle.putBoolean("from_wallet_manager", enterWalletMainBean.getFromWalletManager());
        bundle.putBoolean("hide_wallet_manager", enterWalletMainBean.getHideWalletManager());
        com.okinc.wallet.api.bean.ScanResult scanResult = enterWalletMainBean.getScanResult();
        if (scanResult != null) {
            bundle.putSerializable("scanResult", scanResult);
        }
        Unit unit = Unit.INSTANCE;
        InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, activity, 3, false, 2, bundle, null, 32, null);
    }
}
