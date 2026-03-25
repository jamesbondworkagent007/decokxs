package o;

import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.okinc.productmatrix.biz.bean.SwapSwitchSubBean;
import com.okinc.productmatrix.biz.entrances.CommonEntranceConfig;
import com.okinc.productmatrix.biz.entrances.HomeEntranceConfig;
import com.okinc.productmatrix.biz.entrances.WalletEntranceConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tZS {
    public static final tZS AEQbTJ = new tZS();

    private tZS() {
    }

    public final java.util.Map<java.lang.Integer, java.lang.Boolean> OLrzqt() {
        java.util.HashMap map = new java.util.HashMap();
        HomeEntranceConfig homeEntranceConfigCopydefault = copydefault();
        InterfaceC47278tmy interfaceC47278tmyFmB = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
        boolean zValues = interfaceC47278tmyFmB.values();
        boolean zAkhnZx = interfaceC47278tmyFmB.AkhnZx();
        boolean z = false;
        map.put(1, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getBuyCrypto().canShow() && (!zValues || zAkhnZx)));
        map.put(2, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getSpot().canShow()));
        map.put(3, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getMargin().canShow()));
        map.put(4, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getFutures().canShow()));
        map.put(5, java.lang.Boolean.valueOf(EZpvd(homeEntranceConfigCopydefault.getPerpetual())));
        map.put(6, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getOptions().canShow()));
        map.put(10, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getEarn().canShow()));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        map.put(8, bool);
        map.put(7, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getLoan().canShow()));
        map.put(9, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getJumpStart().canShow() && (!zValues || zAkhnZx)));
        map.put(12, java.lang.Boolean.valueOf(OLrzqt(homeEntranceConfigCopydefault.getWallet())));
        map.put(26, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getCrossChain().canShow()));
        map.put(14, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getReferral().canShow() && (!zValues || zAkhnZx)));
        map.put(15, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getSendCrypto().canShow()));
        map.put(17, java.lang.Boolean.valueOf(zAkhnZx || !zValues));
        map.put(18, java.lang.Boolean.valueOf(zAkhnZx || !zValues));
        map.put(19, bool);
        map.put(20, java.lang.Boolean.valueOf(zValues));
        if (homeEntranceConfigCopydefault.getRewards().canShow() && (!zValues || zAkhnZx)) {
            z = true;
        }
        map.put(21, java.lang.Boolean.valueOf(z));
        map.put(23, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getSimulatedTrading().canShow()));
        map.put(25, java.lang.Boolean.valueOf(homeEntranceConfigCopydefault.getAcademy().canShow()));
        return map;
    }

    public final boolean EZpvd(CommonEntranceConfig commonEntranceConfig) {
        SwapSwitchSubBean swapSwitchSubBean;
        try {
            swapSwitchSubBean = (SwapSwitchSubBean) C48787ucK.AEQbTJ.EZpvd("swap", SwapSwitchSubBean.class);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            swapSwitchSubBean = null;
        }
        return !Intrinsics.EZpvd((java.lang.Object) (swapSwitchSubBean != null ? swapSwitchSubBean.isHidden() : null), (java.lang.Object) "1") && commonEntranceConfig.canShow();
    }

    public final boolean OLrzqt(WalletEntranceConfig walletEntranceConfig) {
        return walletEntranceConfig.canShow();
    }

    public final HomeEntranceConfig copydefault() {
        try {
            HomeEntranceConfig homeEntranceConfig = (HomeEntranceConfig) C48787ucK.AEQbTJ.EZpvd(ProductMatrixRemoteConfig.HOME_ICON_CONFIG, HomeEntranceConfig.class);
            return homeEntranceConfig == null ? new HomeEntranceConfig() : homeEntranceConfig;
        } catch (java.lang.Exception unused) {
            return new HomeEntranceConfig();
        }
    }
}
