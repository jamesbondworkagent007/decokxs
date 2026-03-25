package o;

import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResultBean;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.SearchWalletUseCase$getSearchWalletResult$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18916frT {
    public final C12827cuN AEQbTJ;
    public final WalletTickerManager EZpvd;
    public final C10407bnq KWHzl;
    public WalletSearchResultBean OLrzqt;
    public final C14687dqE copydefault;

    @yCM
    public C18916frT(@NotNull C12827cuN c12827cuN, @NotNull C10407bnq c10407bnq, @NotNull WalletTickerManager walletTickerManager, @NotNull C14687dqE c14687dqE) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(walletTickerManager, "");
        Intrinsics.checkNotNullParameter(c14687dqE, "");
        this.AEQbTJ = c12827cuN;
        this.KWHzl = c10407bnq;
        this.EZpvd = walletTickerManager;
        this.copydefault = c14687dqE;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super WalletSearchResultBean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SearchWalletUseCase$getSearchWalletResult$2(this, str, null), continuation);
    }
}
