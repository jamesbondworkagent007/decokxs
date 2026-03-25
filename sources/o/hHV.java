package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.bean.DAppInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hHV extends RecyclerView.Adapter<C21680hIi> {
    public final Function1<DAppInfo, Unit> EZpvd;
    public final java.util.List<DAppInfo> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.main.market.bean.DAppInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public hHV(@NotNull java.util.List<DAppInfo> list, @NotNull Function1<? super DAppInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = list;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21680hIi onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23483hzA c23483hzAEZpvd = C23483hzA.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23483hzAEZpvd, "");
        return new C21680hIi(c23483hzAEZpvd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C21680hIi c21680hIi, int i) {
        Intrinsics.checkNotNullParameter(c21680hIi, "");
        c21680hIi.KWHzl(this.KWHzl.get(i), i);
        android.widget.LinearLayout root = c21680hIi.copydefault().getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, i));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ hHV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, hHV hhv, int i) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = hhv;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.OLrzqt.KWHzl.get(this.EZpvd));
            }
        }
    }
}
