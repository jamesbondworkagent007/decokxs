package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C20867gow extends AbstractC20727gmO<C20869goy> {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.gow$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gow.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C20867gow copydefault(android.os.Bundle bundle) {
            C20867gow c20867gow = new C20867gow();
            c20867gow.setArguments(bundle);
            return c20867gow;
        }
    }

    @Override // o.AbstractC20727gmO, o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXXBbs));
    }

    @Override // o.AbstractC20727gmO
    public void AYXKKw() {
        if (KWHzl()) {
            TransactionInfo transactionInfoAhwBna = djBIcL().AhwBna();
            EZpvd((transactionInfoAhwBna == null || !transactionInfoAhwBna.hasAmountOrCurrency()) ? C13754dXa.FragmentManager.fVjYLc : C13754dXa.FragmentManager.gsvlRV);
        }
    }

    @Override // o.AbstractC20727gmO
    public void AkhnZx() {
        copydefault((AbstractC20792gna) new ViewModelProvider(this).get(C20869goy.class));
    }

    @Override // o.AbstractC20727gmO
    public void isConnected() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_transfer_amount", djBIcL().fetchVPNInfo());
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(djBIcL().djBIcL());
        RoundingMode roundingMode = RoundingMode.DOWN;
        intent.putExtra("transfer_amount", C54862xYb.KWHzl(bigDecimalEZpvd, false, java.lang.Integer.valueOf(djBIcL().OLrzqt()), roundingMode));
        intent.putExtra("symbol", djBIcL(false));
        C12623cqV c12623cqVEZpvd = djBIcL().EZpvd();
        intent.putExtra("sign", c12623cqVEZpvd != null ? c12623cqVEZpvd.EZpvd() : null);
        C12623cqV c12623cqVEZpvd2 = djBIcL().EZpvd();
        intent.putExtra("iso_code", c12623cqVEZpvd2 != null ? c12623cqVEZpvd2.copydefault() : null);
        intent.putExtra("valuation", C54862xYb.KWHzl(C33129mqd.EZpvd(djBIcL().AYXKKw()), false, java.lang.Integer.valueOf(djBIcL().KWHzl()), roundingMode));
        intent.putExtra("receive_address", valueOf());
        if (KWHzl()) {
            if (zLjUOn() == 1002) {
                OLrzqt(1002, intent);
                return;
            } else {
                AEQbTJ(intent.getExtras());
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Override // o.AbstractC20727gmO
    public boolean valueOf(boolean z) {
        return !C33129mqd.valueOf(djBIcL().djBIcL(), 0);
    }

    @Override // o.AbstractC20727gmO
    public void KWHzl(@NotNull OkTransactionPreparationResult okTransactionPreparationResult) {
        Intrinsics.checkNotNullParameter(okTransactionPreparationResult, "");
        if (okTransactionPreparationResult.getCalculator() == null) {
            boolean canRetry = okTransactionPreparationResult.getCanRetry();
            java.lang.String msg = okTransactionPreparationResult.getMsg();
            EZpvd(canRetry, msg != null ? msg : "");
        } else {
            EZpvd(okTransactionPreparationResult);
            djBIcL().isConnected();
        }
    }

    @Override // o.AbstractC20727gmO
    public void EZpvd() {
        if (C33129mqd.valueOf(djBIcL().djBIcL(), 0) && C33129mqd.valueOf(djBIcL().AYXKKw(), 0)) {
            AYXKKw(false);
        } else {
            AYXKKw(true);
        }
    }
}
