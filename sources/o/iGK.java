package o;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iGK {
    public final iDF AEQbTJ;
    public final InterfaceC23916iOb EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final iNQ copydefault;

    @yCM
    public iGK(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iDF idf, @NotNull iNQ inq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(idf, "");
        Intrinsics.checkNotNullParameter(inq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23916iOb;
        this.AEQbTJ = idf;
        this.copydefault = inq;
        this.KWHzl = coroutineDispatcher;
    }

    public final iXG OLrzqt(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        if (transactionConfig.fIwbmz() == 4) {
            return new iFS(this.EZpvd, this.AEQbTJ, this.KWHzl);
        }
        return new iFK(this.EZpvd, this.copydefault, this.KWHzl);
    }
}
