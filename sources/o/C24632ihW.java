package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;

/* JADX INFO: renamed from: o.ihW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24632ihW {
    public static final C21697hIz copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, boolean z2) {
        if (dexMultiTokenInfoBean != null) {
            return new C21697hIz(dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean.getTokenLogoUrl(), dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getChainName(), dexMultiTokenInfoBean.getChainBWLogoUrl(), dexMultiTokenInfoBean.getTokenContractAddress(), dexMultiTokenInfoBean.isMainChainCoin(), !z, z2);
        }
        return null;
    }
}
