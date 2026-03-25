package o;

import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19734gNi {
    @yCM
    public C19734gNi() {
    }

    public final java.lang.String AEQbTJ(@NotNull TransactionIntentData transactionIntentData) {
        Intrinsics.checkNotNullParameter(transactionIntentData, "");
        return transactionIntentData.getMarketIntentData();
    }

    public final java.lang.String EZpvd(@NotNull TransactionIntentData transactionIntentData) {
        Intrinsics.checkNotNullParameter(transactionIntentData, "");
        return transactionIntentData.getLimitIntentData();
    }

    public final java.lang.String KWHzl(@NotNull TransactionIntentData transactionIntentData) {
        Intrinsics.checkNotNullParameter(transactionIntentData, "");
        return transactionIntentData.generateCopyTradeIntentData();
    }
}
