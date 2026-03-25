package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import kotlin.jvm.internal.Intrinsics;
import o.C8039avH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41015qio implements C8039avH.ActionBar<RecyclerView.ViewHolder> {
    public java.util.List<? extends ITradingCalendarEventVo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<? extends ITradingCalendarEventVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    public C41015qio(@NotNull java.util.List<? extends ITradingCalendarEventVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    @Override // o.C8039avH.ActionBar
    public long EZpvd(int i) {
        if (this.copydefault.isEmpty()) {
            return -1L;
        }
        return this.copydefault.get(i).OLrzqt().AEQbTJ();
    }

    /* JADX INFO: renamed from: o.qio$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(ConstraintLayout constraintLayout) {
            super(constraintLayout);
        }
    }

    @Override // o.C8039avH.ActionBar
    public RecyclerView.ViewHolder OLrzqt(android.view.ViewGroup viewGroup) {
        return new ActionBar(C42693rbI.EZpvd(android.view.LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null), viewGroup, false).getRoot());
    }

    @Override // o.C8039avH.ActionBar
    public void KWHzl(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder != null) {
            C42693rbI.copydefault(viewHolder.itemView).EZpvd.setText(this.copydefault.get(i).OLrzqt().copydefault());
        }
    }
}
