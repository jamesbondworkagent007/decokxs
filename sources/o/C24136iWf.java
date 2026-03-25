package o;

import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24136iWf {
    public static final InvestOrderDetailsState.ActionBar OLrzqt(java.lang.Throwable th) {
        if (th instanceof ResponseFailedException) {
            java.lang.String message = th.getMessage();
            if (message != null && message.length() != 0) {
                return new InvestOrderDetailsState.ActionBar.StateListAnimator(message);
            }
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            return responseFailedException.getErrorMsg().length() > 0 ? new InvestOrderDetailsState.ActionBar.StateListAnimator(responseFailedException.getErrorMsg()) : new InvestOrderDetailsState.ActionBar.C0334ActionBar(C25493ixk.FragmentManager.DIIpTV);
        }
        if (th instanceof OKServerException) {
            java.lang.String message2 = th.getMessage();
            java.lang.String strCopydefault = C27544jxG.copydefault((OKServerException) th);
            if (strCopydefault != null && strCopydefault.length() != 0) {
                message2 = strCopydefault;
            } else if (message2 == null || message2.length() == 0) {
                message2 = C43422row.OLrzqt();
            }
            return new InvestOrderDetailsState.ActionBar.StateListAnimator(message2);
        }
        return new InvestOrderDetailsState.ActionBar.C0334ActionBar(C25493ixk.FragmentManager.zSsVtY);
    }
}
