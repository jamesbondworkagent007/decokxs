package o;

import com.okinc.business.dex.api.bean.TokenBase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28269kVd implements InterfaceC28268kVc {
    public static final int OLrzqt = TokenBase.$stable;
    public final TokenBase EZpvd;

    public C28269kVd(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.EZpvd = tokenBase;
    }

    @Override // o.InterfaceC28268kVc
    public java.lang.String copydefault() {
        return this.EZpvd.getTokenContractAddress();
    }

    @Override // o.InterfaceC28268kVc
    public java.lang.String OLrzqt() {
        return this.EZpvd.getTokenSymbol();
    }

    @Override // o.InterfaceC28268kVc
    public boolean EZpvd() {
        return this.EZpvd.isLeverage();
    }

    @Override // o.InterfaceC28268kVc
    public boolean AEQbTJ() {
        return this.EZpvd.isSafeMoonCoinToken();
    }

    @Override // o.InterfaceC28268kVc
    public boolean KWHzl() {
        return this.EZpvd.isHoneypotToken();
    }
}
