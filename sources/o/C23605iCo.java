package o;

import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23605iCo {
    public static /* synthetic */ boolean isSameTransaction$default(InvestTransactionModel investTransactionModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return OLrzqt(investTransactionModel, str, str2, str3);
    }

    public static final boolean OLrzqt(@NotNull InvestTransactionModel investTransactionModel, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String orderId;
        java.lang.String txHash;
        java.lang.String uopHash;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        if (str2 != null && str2.length() != 0 && (uopHash = investTransactionModel.getUopHash()) != null && uopHash.length() != 0) {
            return Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) investTransactionModel.getUopHash());
        }
        if (str != null && str.length() != 0 && (txHash = investTransactionModel.getTxHash()) != null && txHash.length() != 0) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) investTransactionModel.getTxHash());
        }
        if (str3 == null || str3.length() == 0 || (orderId = investTransactionModel.getOrderId()) == null || orderId.length() == 0) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) investTransactionModel.getOrderId());
    }
}
