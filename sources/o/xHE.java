package o;

import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.dex.biz.OKTDexBaseTokenModel;
import com.okinc.unify_trade.dex.biz.OKTDexCacheConfig;
import com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class xHE {
    public OKTDexCacheConfig OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xHE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public xHE(@NotNull OKTDexCacheConfig oKTDexCacheConfig) {
        Intrinsics.checkNotNullParameter(oKTDexCacheConfig, "");
        this.OLrzqt = oKTDexCacheConfig;
        pUU.KWHzl("OKTDexSelectManager", "OKTDexSelectManager created with config: " + oKTDexCacheConfig.getClass().getSimpleName());
        OKTDexCacheConfig oKTDexCacheConfig2 = this.OLrzqt;
        if (oKTDexCacheConfig2 instanceof OKTDexCacheConfig.CustomArgsDexCacheConfig) {
            Intrinsics.copydefault(oKTDexCacheConfig2, "");
            OKTDexCacheConfig.CustomArgsDexCacheConfig customArgsDexCacheConfig = (OKTDexCacheConfig.CustomArgsDexCacheConfig) oKTDexCacheConfig2;
            pUU.EZpvd("OKTDexSelectManager", "CustomArgs - chainId: " + customArgsDexCacheConfig.EZpvd() + ", tokenCA: " + customArgsDexCacheConfig.KWHzl());
            return;
        }
        if (!(oKTDexCacheConfig2 instanceof OKTDexCacheConfig.DefaultDexCacheConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.EZpvd("OKTDexSelectManager", "Using DefaultDexInstrumentConfig");
    }

    public java.lang.String KWHzl() {
        OKTDexChainInfoModel oKTDexChainInfoModelOLrzqt;
        DexInstrument dexInstrument;
        pUU.EZpvd("OKTDexSelectManager", "getCurrentChainId() - config: " + this.OLrzqt);
        OKTDexCacheConfig oKTDexCacheConfig = this.OLrzqt;
        if (oKTDexCacheConfig instanceof OKTDexCacheConfig.DefaultDexCacheConfig) {
            OKTDexBaseTokenModel oKTDexBaseTokenModelEZpvd = xHG.AEQbTJ.EZpvd();
            java.lang.String chainId = null;
            java.lang.String chainId2 = (oKTDexBaseTokenModelEZpvd == null || (dexInstrument = oKTDexBaseTokenModelEZpvd.getDexInstrument()) == null) ? null : dexInstrument.getChainId();
            pUU.EZpvd("OKTDexSelectManager", "getCurrentChainId() - cached chainId: " + chainId2);
            if (chainId2 == null || chainId2.length() == 0) {
                InterfaceC54572xNi interfaceC54572xNi = (InterfaceC54572xNi) C54589xNz.KWHzl(-473815706, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 473815707, new java.lang.Object[]{C54589xNz.EZpvd}, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
                if (interfaceC54572xNi != null && (oKTDexChainInfoModelOLrzqt = interfaceC54572xNi.OLrzqt()) != null) {
                    chainId = oKTDexChainInfoModelOLrzqt.getChainId();
                }
                pUU.EZpvd("OKTDexSelectManager", "getCurrentChainId() - using default chainId: " + chainId);
                chainId2 = chainId;
            }
            pUU.KWHzl("OKTDexSelectManager", "getCurrentChainId() -> " + chainId2);
            return chainId2;
        }
        if (!(oKTDexCacheConfig instanceof OKTDexCacheConfig.CustomArgsDexCacheConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.copydefault(oKTDexCacheConfig, "");
        java.lang.String strEZpvd = ((OKTDexCacheConfig.CustomArgsDexCacheConfig) oKTDexCacheConfig).EZpvd();
        pUU.KWHzl("OKTDexSelectManager", "getCurrentChainId() -> " + strEZpvd + " (custom)");
        return strEZpvd;
    }

    public java.lang.String EZpvd() {
        OKTDexChainInfoModel oKTDexChainInfoModelOLrzqt;
        DexInstrument dexInstrument;
        pUU.EZpvd("OKTDexSelectManager", "getCurrentTokenCA() - config: " + this.OLrzqt.getClass().getSimpleName());
        OKTDexCacheConfig oKTDexCacheConfig = this.OLrzqt;
        if (oKTDexCacheConfig instanceof OKTDexCacheConfig.DefaultDexCacheConfig) {
            OKTDexBaseTokenModel oKTDexBaseTokenModelEZpvd = xHG.AEQbTJ.EZpvd();
            java.lang.String defaultTokenAddress = null;
            java.lang.String tokenContractAddress = (oKTDexBaseTokenModelEZpvd == null || (dexInstrument = oKTDexBaseTokenModelEZpvd.getDexInstrument()) == null) ? null : dexInstrument.getTokenContractAddress();
            pUU.EZpvd("OKTDexSelectManager", "getCurrentTokenCA() - cached tokenCA: " + tokenContractAddress);
            if (tokenContractAddress == null || tokenContractAddress.length() == 0) {
                InterfaceC54572xNi interfaceC54572xNi = (InterfaceC54572xNi) C54589xNz.KWHzl(-473815706, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), 473815707, new java.lang.Object[]{C54589xNz.EZpvd}, EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ(), EscapeMpcWalletAccountListViewModel$getMpcPrivateKeys$1.AEQbTJ());
                if (interfaceC54572xNi != null && (oKTDexChainInfoModelOLrzqt = interfaceC54572xNi.OLrzqt()) != null) {
                    defaultTokenAddress = oKTDexChainInfoModelOLrzqt.getDefaultTokenAddress();
                }
                pUU.EZpvd("OKTDexSelectManager", "getCurrentTokenCA() - using default tokenCA: " + defaultTokenAddress);
                tokenContractAddress = defaultTokenAddress;
            }
            pUU.KWHzl("OKTDexSelectManager", "getCurrentTokenCA() -> " + tokenContractAddress);
            return tokenContractAddress;
        }
        if (!(oKTDexCacheConfig instanceof OKTDexCacheConfig.CustomArgsDexCacheConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.copydefault(oKTDexCacheConfig, "");
        java.lang.String strKWHzl = ((OKTDexCacheConfig.CustomArgsDexCacheConfig) oKTDexCacheConfig).KWHzl();
        pUU.KWHzl("OKTDexSelectManager", "getCurrentTokenCA() -> " + strKWHzl + " (custom)");
        return strKWHzl;
    }

    public OKTDexBaseTokenModel OLrzqt() {
        OKTDexCacheConfig oKTDexCacheConfig = this.OLrzqt;
        if (oKTDexCacheConfig instanceof OKTDexCacheConfig.DefaultDexCacheConfig) {
            return xHG.AEQbTJ.EZpvd();
        }
        if (oKTDexCacheConfig instanceof OKTDexCacheConfig.CustomArgsDexCacheConfig) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DexInstrument AEQbTJ() {
        OKTDexCacheConfig oKTDexCacheConfig = this.OLrzqt;
        if (oKTDexCacheConfig instanceof OKTDexCacheConfig.DefaultDexCacheConfig) {
            OKTDexBaseTokenModel oKTDexBaseTokenModelEZpvd = xHG.AEQbTJ.EZpvd();
            if (oKTDexBaseTokenModelEZpvd != null) {
                return oKTDexBaseTokenModelEZpvd.getDexInstrument();
            }
        } else if (!(oKTDexCacheConfig instanceof OKTDexCacheConfig.CustomArgsDexCacheConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
