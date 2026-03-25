package o;

import com.okinc.business.defi.biz.constant.WalletStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17258ezR {
    AbstractC58260yxt<java.util.List<AbstractC12782ctV>> AEQbTJ(boolean z, boolean z2);

    AbstractC58260yxt<java.lang.Integer> EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str);

    AbstractC12782ctV KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull AbstractC12784ctX abstractC12784ctX);

    AbstractC58260yxt<AbstractC12782ctV> KWHzl(@NotNull java.lang.String str, boolean z);

    AbstractC58260yxt<java.lang.Boolean> KWHzl(boolean z);

    AbstractC58260yxt<AbstractC12784ctX> OLrzqt(@NotNull java.lang.String str);

    AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull java.lang.String str);

    AbstractC58177ywP copydefault();

    void copydefault(@NotNull WalletStatus walletStatus);

    boolean copydefault(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull AbstractC12782ctV abstractC12782ctV, AbstractC12782ctV abstractC12782ctV2);

    /* JADX INFO: renamed from: o.ezR$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public static /* synthetic */ AbstractC58260yxt getAllWallets$default(InterfaceC17258ezR interfaceC17258ezR, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllWallets");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return interfaceC17258ezR.AEQbTJ(z, z2);
        }

        public static /* synthetic */ boolean isRootHasOtherWallet$default(InterfaceC17258ezR interfaceC17258ezR, AbstractC12784ctX abstractC12784ctX, AbstractC12782ctV abstractC12782ctV, AbstractC12782ctV abstractC12782ctV2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRootHasOtherWallet");
            }
            if ((i & 4) != 0) {
                abstractC12782ctV2 = null;
            }
            return interfaceC17258ezR.copydefault(abstractC12784ctX, abstractC12782ctV, abstractC12782ctV2);
        }
    }
}
