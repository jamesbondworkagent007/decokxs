package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.llT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30983llT {
    kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> AEQbTJ();

    DexMultiTokenInfoBean OLrzqt();

    DexMultiTokenInfoBean copydefault();

    /* JADX INFO: renamed from: o.llT$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public static kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> OLrzqt(@NotNull InterfaceC30983llT interfaceC30983llT) {
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(interfaceC30983llT.copydefault().isSafeMoonCoinToken() || interfaceC30983llT.OLrzqt().isSafeMoonCoinToken()), interfaceC30983llT.copydefault().isSafeMoonCoinToken() ? interfaceC30983llT.copydefault() : interfaceC30983llT.OLrzqt());
        }
    }
}
