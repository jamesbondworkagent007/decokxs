package o;

import com.okinc.business.defi.api.model.tx.signdata.EVMCancelApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8426bCW;
import o.AbstractC8919bLm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8913bLg<Fee extends AbstractC8426bCW<?>, SignData extends EVMContractSignData> extends AbstractC8919bLm<Fee, SignData> {
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        OKWBaseTransaction.TransactionType transactionType;
        OKWBaseTransaction.TransactionType transactionType2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        java.lang.String value = ((EVMContractSignData) signDataArgs.getSignData()).getValue();
        if (value == null || value.length() == 0 || Intrinsics.EZpvd((java.lang.Object) ((EVMContractSignData) signDataArgs.getSignData()).getValue(), (java.lang.Object) "0")) {
            ((EVMContractSignData) signDataArgs.getSignData()).setValue("0x0");
        }
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        if (((EVMContractSignData) signDataArgs.getSignData()).getFrom().length() == 0) {
            ((EVMContractSignData) signDataArgs.getSignData()).setFrom(htlTjW());
        }
        java.lang.String data = QVsKAR().getData();
        java.lang.String input = data != null ? data : "";
        if (input.length() == 0 && QVsKAR().getInput() != null) {
            input = QVsKAR().getInput();
            Intrinsics.copydefault((java.lang.Object) input);
        }
        if (QVsKAR() instanceof EVMCancelApprovalSignData) {
            OLrzqt(OKWBaseTransaction.TransactionType.CancelApprove);
        } else {
            AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
            if (actionBar.EZpvd(input)) {
                OLrzqt(OKWBaseTransaction.TransactionType.DappTransfer);
            } else if (actionBar.copydefault(input)) {
                if (C33129mqd.OLrzqt(a_(false), "0")) {
                    transactionType2 = OKWBaseTransaction.TransactionType.CancelApprove;
                } else {
                    transactionType2 = OKWBaseTransaction.TransactionType.Approve;
                }
                OLrzqt(transactionType2);
            } else if (actionBar.AEQbTJ(input)) {
                if (actionBar.KWHzl(input)) {
                    transactionType = OKWBaseTransaction.TransactionType.Approve;
                } else {
                    transactionType = OKWBaseTransaction.TransactionType.CancelApprove;
                }
                OLrzqt(transactionType);
            }
        }
        return zKWHzl;
    }
}
