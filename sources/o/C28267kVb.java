package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28267kVb implements InterfaceC28268kVc {
    public final DexMultiTokenInfoBean copydefault;

    public C28267kVb(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.copydefault = dexMultiTokenInfoBean;
    }

    @Override // o.InterfaceC28268kVc
    public java.lang.String copydefault() {
        return this.copydefault.getTokenContractAddress();
    }

    @Override // o.InterfaceC28268kVc
    public java.lang.String OLrzqt() {
        return this.copydefault.getTokenSymbol();
    }

    @Override // o.InterfaceC28268kVc
    public boolean EZpvd() {
        return this.copydefault.isLeverage();
    }

    @Override // o.InterfaceC28268kVc
    public boolean AEQbTJ() {
        return this.copydefault.isSafeMoonCoinToken();
    }

    @Override // o.InterfaceC28268kVc
    public boolean KWHzl() {
        return this.copydefault.isHoneypotToken();
    }
}
