package o;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iNK implements iNG {
    public final InterfaceC23643iDz AEQbTJ;
    public final InterfaceC23643iDz EZpvd;

    @yCM
    public iNK(@NotNull InterfaceC23643iDz interfaceC23643iDz, @NotNull InterfaceC23643iDz interfaceC23643iDz2) {
        Intrinsics.checkNotNullParameter(interfaceC23643iDz, "");
        Intrinsics.checkNotNullParameter(interfaceC23643iDz2, "");
        this.EZpvd = interfaceC23643iDz;
        this.AEQbTJ = interfaceC23643iDz2;
    }

    @Override // o.iNG
    public InterfaceC23643iDz OLrzqt(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        return transactionConfig.iwGUEr() ? this.AEQbTJ : this.EZpvd;
    }
}
