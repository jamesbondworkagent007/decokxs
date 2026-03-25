package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8931bLy extends InterfaceC9729bbA {
    public static final Activity Companion = Activity.EZpvd;

    void AEQbTJ(java.lang.String str);

    WalletGasLimitRes AkhnZx();

    java.lang.String AuCTel();

    java.lang.String DbNXlk();

    java.lang.String QKVWgx();

    java.lang.String V_();

    void copydefault(java.lang.String str);

    void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3);

    C10854bwM dHguZz();

    int fIwbmz();

    C9311bTG fJNWhG();

    WalletGasLimitRes fetchVPNInfo();

    java.lang.String gEmmrt();

    boolean getFieldNames();

    boolean hDKMBd();

    EvmSignInfoGasPrice isConnected();

    int iwGUEr();

    EvmSignInfo uzCIH();

    void valueOf(java.lang.String str);

    /* JADX INFO: renamed from: o.bLy$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.bLy$StateListAnimator */
    public static final class StateListAnimator {
        public static int AYXKKw(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return 0;
        }

        public static boolean AkhnZx(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String EZpvd(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return "";
        }

        public static int gEmmrt(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return 1;
        }

        public static EvmSignInfoGasPrice KWHzl(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return interfaceC8931bLy.uzCIH().getGasPrice();
        }

        public static WalletGasLimitRes copydefault(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            WalletGasLimitRes walletGasLimitResAkhnZx = interfaceC8931bLy.AkhnZx();
            if (walletGasLimitResAkhnZx.getGasLimit() == null) {
                walletGasLimitResAkhnZx.setGasLimit(interfaceC8931bLy.uzCIH().getGasLimit());
                walletGasLimitResAkhnZx.setOriginGasLimit(interfaceC8931bLy.uzCIH().getGasLimit());
            }
            return walletGasLimitResAkhnZx;
        }

        public static void EZpvd(@NotNull InterfaceC8931bLy interfaceC8931bLy, java.lang.String str) {
            interfaceC8931bLy.AEQbTJ(str);
        }

        public static void AEQbTJ(@NotNull InterfaceC8931bLy interfaceC8931bLy, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            interfaceC8931bLy.copydefault(str);
            interfaceC8931bLy.fJNWhG().AEQbTJ(str2, str3);
        }

        public static int valueOf(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            if (interfaceC8931bLy.getFieldNames()) {
                return 4;
            }
            return interfaceC8931bLy.hDKMBd() ? 2 : 0;
        }

        public static boolean AhwBna(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return Intrinsics.EZpvd(interfaceC8931bLy.uzCIH().getGasPrice().getSupportEip1559(), java.lang.Boolean.TRUE);
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            return C9311bTG.getGasPrice$default(interfaceC8931bLy.fJNWhG(), 0, 1, null);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            java.lang.String strAuCTel = interfaceC8931bLy.AuCTel();
            return strAuCTel == null ? "" : strAuCTel;
        }

        public static java.lang.String djBIcL(@NotNull InterfaceC8931bLy interfaceC8931bLy) {
            java.lang.String strGEmmrt;
            C10854bwM c10854bwMDHguZz = interfaceC8931bLy.dHguZz();
            if (c10854bwMDHguZz.dmfpNf()) {
                strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMDHguZz.fetchVPNInfo()));
            } else {
                strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMDHguZz.isConnected()));
            }
            java.lang.String chainId = interfaceC8931bLy.uzCIH().getChainId();
            if (chainId == null || chainId.length() == 0) {
                return strGEmmrt;
            }
            java.lang.String chainId2 = interfaceC8931bLy.uzCIH().getChainId();
            return chainId2 == null ? "" : chainId2;
        }

        public static void copydefault(@NotNull InterfaceC8931bLy interfaceC8931bLy, @NotNull JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            jsonObject.addProperty("gasPrice", C9311bTG.getGasPrice$default(interfaceC8931bLy.fJNWhG(), 0, 1, null));
            jsonObject.addProperty("gasLimit", AbstractC9346bTp.getGasLimit$default(interfaceC8931bLy.fJNWhG(), 0, 1, null));
            jsonObject.addProperty("nonce", interfaceC8931bLy.V_());
        }
    }
}
