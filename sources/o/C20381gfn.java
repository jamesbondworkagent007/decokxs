package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.IntervalMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gfn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20381gfn extends AbstractC52792wYn {
    public fXM<?> copydefault;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.copydefault = (fXM) C20690gle.getOKTransferViewModel$default(c20690gle, activity, fXM.class, false, 4, null);
        super.onCreateContent(constraintLayout);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAware);
        IntervalMode intervalMode = IntervalMode.RANGE;
        c55276xgrArr[0] = new C55276xgr(strAYXKKw, intervalMode, null, ((MultiTransferSignData) copydefault().QVsKAR()).getIntervalMode() == intervalMode, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareKt);
        IntervalMode intervalMode2 = IntervalMode.NONE;
        c55276xgrArr[1] = new C55276xgr(strAYXKKw2, intervalMode2, null, ((MultiTransferSignData) copydefault().QVsKAR()).getIntervalMode() == intervalMode2, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        c55198xfS.setSingleOneColumnData(yDY.gEmmrt(c55276xgrArr), new yHO() { // from class: o.gfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C20381gfn.KWHzl(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(C20381gfn c20381gfn, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferCopydefault = c20381gfn.copydefault();
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        oKWBaseMultiTransferCopydefault.EZpvd((IntervalMode) objOLrzqt);
        c20381gfn.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        constraintLayout.addView(new android.view.View(constraintLayout.getContext()), -1, C55298xhM.dp2px$default(20.0f, null, 1, null));
    }

    private final OKWBaseMultiTransfer<?, ?> copydefault() {
        fXM<?> fxm = this.copydefault;
        if (fxm == null) {
            Intrinsics.gEmmrt("");
            fxm = null;
        }
        OKWBaseTransaction oKWBaseTransactionAEQbTJ = fxm.AEQbTJ();
        Intrinsics.copydefault(oKWBaseTransactionAEQbTJ, "");
        return (OKWBaseMultiTransfer) oKWBaseTransactionAEQbTJ;
    }
}
