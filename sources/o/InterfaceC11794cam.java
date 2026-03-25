package o;

import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11794cam {
    C11838cbd AEQbTJ();

    java.lang.String KWHzl(java.lang.String str);

    /* JADX INFO: renamed from: o.cam$Application */
    public static final class Application {
        public static C11838cbd OLrzqt(@NotNull InterfaceC11794cam interfaceC11794cam, @NotNull WalletGasLimitRes walletGasLimitRes) {
            Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
            return new C11838cbd(interfaceC11794cam.KWHzl(walletGasLimitRes.getL1GasPrice()), interfaceC11794cam.KWHzl(walletGasLimitRes.getL1GasUsed()), interfaceC11794cam.KWHzl(walletGasLimitRes.getL1DataGasPrice()), interfaceC11794cam.KWHzl(walletGasLimitRes.getL1DataGasUsed()), interfaceC11794cam.KWHzl(walletGasLimitRes.getL2GasPrice()), interfaceC11794cam.KWHzl(walletGasLimitRes.getL2GasUsed()), C54862xYb.convertToBigIntegerString$default(walletGasLimitRes.getOverallFee(), true, (RoundingMode) null, 2, (java.lang.Object) null));
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC11794cam interfaceC11794cam, java.lang.String str) {
            return C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(str, true, (RoundingMode) null, 2, (java.lang.Object) null));
        }
    }
}
