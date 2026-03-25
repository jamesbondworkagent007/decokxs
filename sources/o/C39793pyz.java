package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39793pyz extends AbstractC52792wYn {
    public Function2<? super java.lang.Integer, ? super C55276xgr, Unit> KWHzl;
    public java.util.List<TradeMenuItemBean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.List<TradeMenuItemBean> list) {
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super java.lang.Integer, ? super C55276xgr, Unit> function2) {
        this.KWHzl = function2;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        constraintLayout.setPaddingRelative(0, C55298xhM.OLrzqt(20, contextRequireContext), 0, getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
        Function2<? super java.lang.Integer, ? super C55276xgr, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            copydefault(function2);
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        java.util.List<TradeMenuItemBean> list = this.OLrzqt;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TradeMenuItemBean tradeMenuItemBean : list) {
                arrayList.add(new C55276xgr(tradeMenuItemBean.getTitle(), tradeMenuItemBean.getData(), null, tradeMenuItemBean.isSelect(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
            InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, arrayList, null, 2, null);
        }
    }
}
