package o;

import com.okinc.business.invest_biz.di.TransactionBiz;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iNU implements iNW {
    public final iDH AEQbTJ;
    public final iDH copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionBiz.values().length];
            try {
                iArr[TransactionBiz.DEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionBiz.BOOST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public iNU(@NotNull iDH idh, @NotNull iDH idh2) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(idh2, "");
        this.copydefault = idh;
        this.AEQbTJ = idh2;
    }

    @Override // o.iNW
    public iDH copydefault(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        return transactionConfig.iwGUEr() ? this.AEQbTJ : this.copydefault;
    }

    @Override // o.iNW
    public iDH AEQbTJ(@NotNull TransactionBiz transactionBiz) {
        Intrinsics.checkNotNullParameter(transactionBiz, "");
        int i = StateListAnimator.KWHzl[transactionBiz.ordinal()];
        if (i == 1) {
            return this.copydefault;
        }
        if (i == 2) {
            return this.AEQbTJ;
        }
        throw new NoWhenBranchMatchedException();
    }
}
