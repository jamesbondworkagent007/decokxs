package o;

import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.biz.walletconnect.MetaxEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.OKXAuthPayloadParams;
import com.okinc.business.defi.biz.walletconnect.WCEthereumSignMessage;
import com.okinc.business.defi.biz.walletconnect.WCEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.WalletSwitchEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAsset;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13979dcm {
    void AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, long j, @NotNull OKXAuthPayloadParams oKXAuthPayloadParams);

    void AEQbTJ(@NotNull java.lang.String str, long j, @NotNull WCEthereumSignMessage wCEthereumSignMessage);

    void AEQbTJ(@NotNull java.lang.String str, long j, @NotNull WCEthereumTransaction wCEthereumTransaction);

    void AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2);

    void AEQbTJ(@NotNull java.lang.String str, long j, java.lang.String str2, @NotNull CustomNetworkInfo customNetworkInfo);

    void AEQbTJ(@NotNull java.lang.String str, long j, boolean z);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j);

    void KWHzl(long j);

    void KWHzl(long j, @NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str, long j);

    void KWHzl(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2);

    void KWHzl(@NotNull java.lang.String str, long j, @NotNull java.util.List<WalletSwitchEthereumChain> list);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void OLrzqt(long j);

    void OLrzqt(long j, @NotNull java.lang.String str);

    void OLrzqt(@NotNull java.lang.String str);

    void OLrzqt(@NotNull java.lang.String str, long j, @NotNull MetaxEthereumTransaction metaxEthereumTransaction);

    void OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull java.lang.String str, long j);

    void copydefault(@NotNull java.lang.String str, long j, java.lang.String str2, @NotNull WalletWatchAsset walletWatchAsset);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void copydefault(@NotNull java.lang.String str, boolean z);

    void valueOf(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.dcm$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void onFailure$default(InterfaceC13979dcm interfaceC13979dcm, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailure");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            interfaceC13979dcm.OLrzqt(str);
        }
    }
}
