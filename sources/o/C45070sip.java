package o;

import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.bean.TransactionBeanV2;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45070sip {
    public static final TransactionDisplayModelV2 EZpvd(@NotNull TransactionBeanV2 transactionBeanV2) {
        Intrinsics.checkNotNullParameter(transactionBeanV2, "");
        TransactionBean transaction = transactionBeanV2.getTransaction();
        TransactionDisplayModel transactionDisplayModel$default = transaction != null ? C45073sis.toTransactionDisplayModel$default(transaction, transactionBeanV2.getContextualScenario(), null, 2, null) : null;
        ContextualScenarioModel contextualScenario = transactionBeanV2.getContextualScenario();
        SelfServiceTools selfServiceTools = transactionBeanV2.getSelfServiceTools();
        return new TransactionDisplayModelV2(transactionDisplayModel$default, contextualScenario, selfServiceTools != null ? selfServiceTools.getList() : null);
    }
}
