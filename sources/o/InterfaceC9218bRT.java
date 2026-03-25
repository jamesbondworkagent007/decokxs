package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.CustomEvmSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9217bRS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9218bRT extends InterfaceC9217bRS, InterfaceC9729bbA {
    WalletGasLimitRes AYXKKw();

    C9339bTi AkhnZx();

    AbstractC8564bFB<?, ?> DbNXlk();

    void copydefault(java.lang.String str);

    java.lang.String djBIcL();

    CustomEvmSignInfo isConnected();

    CustomChainMeta valueOf();

    AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> values();

    /* JADX INFO: renamed from: o.bRT$StateListAnimator */
    public static final class StateListAnimator {
        public static ChainAddress KWHzl(@NotNull InterfaceC9218bRT interfaceC9218bRT, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(str, "");
            return InterfaceC9217bRS.TaskDescription.KWHzl(interfaceC9218bRT, abstractC12782ctV, str);
        }

        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djBIcL(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return interfaceC9218bRT.values();
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return interfaceC9218bRT.valueOf().isConnected();
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return C9339bTi.getGasPrice$default(interfaceC9218bRT.AkhnZx(), 0, 1, null);
        }

        public static void OLrzqt(@NotNull InterfaceC9218bRT interfaceC9218bRT, java.lang.String str) {
            interfaceC9218bRT.copydefault(str);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC9218bRT.djBIcL()) ? interfaceC9218bRT.djBIcL() : interfaceC9218bRT.isConnected().getNonce();
        }

        public static java.lang.String copydefault(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return C33129mqd.gEmmrt(java.lang.Long.valueOf(-interfaceC9218bRT.DbNXlk().dHguZz().fetchVPNInfo()));
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9218bRT interfaceC9218bRT) {
            return interfaceC9218bRT.valueOf().AYXKKw();
        }
    }
}
