package o;

import com.okinc.business.invest_biz.di.TransactionBiz;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iNR implements iNQ {
    public final iDF KWHzl;
    public final iDF OLrzqt;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    @yCM
    public iNR(@NotNull iDF idf, @NotNull iDF idf2) {
        Intrinsics.checkNotNullParameter(idf, "");
        Intrinsics.checkNotNullParameter(idf2, "");
        this.OLrzqt = idf;
        this.KWHzl = idf2;
    }

    @Override // o.iNQ
    public iDF EZpvd(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        return transactionConfig.iwGUEr() ? this.KWHzl : this.OLrzqt;
    }

    @Override // o.iNQ
    public iDF AEQbTJ(@NotNull TransactionBiz transactionBiz) {
        Intrinsics.checkNotNullParameter(transactionBiz, "");
        int i = Application.AEQbTJ[transactionBiz.ordinal()];
        if (i == 1) {
            return this.OLrzqt;
        }
        if (i == 2) {
            return this.KWHzl;
        }
        throw new NoWhenBranchMatchedException();
    }
}
